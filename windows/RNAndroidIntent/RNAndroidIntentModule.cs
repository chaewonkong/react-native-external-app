using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Android.Intent.RNAndroidIntent
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAndroidIntentModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAndroidIntentModule"/>.
        /// </summary>
        internal RNAndroidIntentModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAndroidIntent";
            }
        }
    }
}
