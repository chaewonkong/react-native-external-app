
package com.reactlibrary;
// package com.native_makkcha;

// Import android modules
import android.app.Activity; 
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Import React Native dependencies
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class LinkExternalAppModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  public LinkExternalAppModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "LinkExternalApp";
  }

  @ReactMethod
  public void linkExternalApp(String packageName, final Callback callback) {

    // Context from reactContext
    Context context = reactContext;
    Activity activity = getCurrentActivity();

    // Intent set from packageName
    Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);
    if (intent == null) {
      // Linking to Google Play Store
      intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+packageName));
    }

    activity.startActivity(intent);
    // callback.invoke();
  }

}