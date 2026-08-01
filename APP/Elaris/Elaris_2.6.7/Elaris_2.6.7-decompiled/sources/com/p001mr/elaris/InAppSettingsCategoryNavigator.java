package com.p001mr.elaris;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsCategoryNavigator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsCategoryNavigator() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void open(InAppSettings inAppSettings, String str) {
        if (inAppSettings == null) {
            return;
        }
        inAppSettings.showCategory(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openCleanse(InAppSettings inAppSettings) {
        open(inAppSettings, "cleanse");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openGroup(InAppSettings inAppSettings) {
        open(inAppSettings, "groupfile");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openMessage(InAppSettings inAppSettings) {
        open(inAppSettings, "chat_message");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openMisc(InAppSettings inAppSettings) {
        open(inAppSettings, "misc");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openPicture(InAppSettings inAppSettings) {
        open(inAppSettings, "picture");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openRepeater(InAppSettings inAppSettings) {
        open(inAppSettings, "repeater");
    }
}
