package com.p001mr.elaris;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsTargetPickerBridge {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsTargetPickerBridge() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openClockInGroupPicker(InAppSettings inAppSettings, TextView textView, TextView textView2, View view) {
        showTroopPicker(inAppSettings, textView, textView2, inAppSettings.getGroups(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openKeepFireFriendPicker(InAppSettings inAppSettings, TextView textView, TextView textView2, View view) {
        inAppSettings.keepCategoryBackTarget("chat_message");
        showFriendPicker(inAppSettings, textView, textView2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openKeepFireGroupPicker(InAppSettings inAppSettings, TextView textView, TextView textView2, View view) {
        showTroopPicker(inAppSettings, textView, textView2, inAppSettings.getKeepFireGroups(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showFriendPicker(InAppSettings inAppSettings, TextView textView, TextView textView2) {
        InAppSettingsTargetPickerPage.showFriendPicker(inAppSettings, textView, textView2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showTroopPicker(InAppSettings inAppSettings, TextView textView, TextView textView2, String str, boolean z) {
        InAppSettingsTargetPickerPage.showTroopPicker(inAppSettings, textView, textView2, str, z);
    }
}
