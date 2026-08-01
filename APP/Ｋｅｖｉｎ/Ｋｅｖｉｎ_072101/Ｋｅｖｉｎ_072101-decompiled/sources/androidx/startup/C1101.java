package androidx.startup;

/* JADX INFO: renamed from: androidx.startup.ۤۧۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1101 {

    /* JADX INFO: renamed from: ۦ۟ۨۥ, reason: contains not printable characters */
    public static int f127 = 766;

    /* JADX INFO: renamed from: ۟۟ۤۢۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2977() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_button_force_feed_im_share_guide"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m2978(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda2 r2 = (kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda2) r2
            android.app.Activity r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2979(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9) r2
            int r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2980(java.lang.Object r1, java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 >= 0) goto Ld
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟۠ۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m2981(java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda127 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda127) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2982(java.lang.Object r1) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 < 0) goto Lb
            java.lang.String r0 = r1.toString()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۨۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2983() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto L9
            java.lang.String r0 = "文件名格式已保存"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2984() {
            r0 = -487(0xfffffffffffffe19, float:NaN)
            int r1 = androidx.documentfile.C1076.f102
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2985(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L31
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L16:
            int r5 = r8.length()
            if (r0 < r5) goto L64
            byte[] r3 = r4.toByteArray()
            int r4 = r3.length
            int r5 = r2.length()
            r0 = r1
        L26:
            if (r0 < r4) goto L7f
        L28:
            int r0 = r3.length
            if (r1 < r0) goto L8e
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L31:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r3 = r4.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuffer r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r2 = r4.append(r2)
            double r4 = java.lang.Math.random()
            r6 = 10
            double r6 = (double) r6
            double r4 = r4 * r6
            int r4 = (int) r4
            r4 = r4 ^ r0
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r0 = r0 + 1
            goto L6
        L64:
            char r5 = r8.charAt(r0)
            int r5 = r3.indexOf(r5)
            int r5 = r5 << 4
            int r6 = r0 + 1
            char r6 = r8.charAt(r6)
            int r6 = r3.indexOf(r6)
            r5 = r5 | r6
            r4.write(r5)
            int r0 = r0 + 2
            goto L16
        L7f:
            r6 = r3[r0]
            int r7 = r0 % r5
            char r7 = r2.charAt(r7)
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r3[r0] = r6
            int r0 = r0 + 1
            goto L26
        L8e:
            java.lang.String r0 = ""
            int r0 = r0.length()
            int r1 = r0 + 1
            goto L28
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m2986(java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda28 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda28) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object[] m2987(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$194$1$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$194$1$$ExternalSyntheticLambda0) r2
            java.lang.Object[] r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.PPHook.VerifyCallback m2988(java.lang.Object r2) {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda9) r2
            kevin.fun.hook.PPHook$VerifyCallback r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2989() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "music_control_horizontal"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2990() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto L9
            java.lang.String r0 = "filter_max_duration_sec"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2991() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto L9
            java.lang.String r0 = "下载时间"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۤۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2992(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda110 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda110) r2
            int r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m2993(java.lang.Object r2) {
            int r0 = m2984()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda85 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda85) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2994() {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_feed_sticker"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.Consumer m2995(java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda152 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda152) r2
            kevin.fun.hook.DYHook$Consumer r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2996() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 TapListener Hook 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static void m2997(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto L10
            android.content.Context r1 = (android.content.Context) r1
            android.net.Uri r2 = (android.net.Uri) r2
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r3 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r3
            kevin.fun.hook.webdav.WebDAVConfig.restoreFromUri(r1, r2, r3)
        Lf:
            return
        L10:
            goto Lf
    }

    /* JADX INFO: renamed from: ۟ۤۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2998() {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "防溢出显示"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2999() {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "帮上热门"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3000() {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 Hook Feed 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m3001(java.lang.Object r2) {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda145 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda145) r2
            android.widget.TextView r1 = r2.f$6
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3002() {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto L9
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3003() {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "comment_bg_image_uri"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3004() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto L9
            java.lang.String r0 = "该评论没有图片资源"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m3005(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda3) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۢۧ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3006() {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 > 0) goto L9
            java.lang.String r0 = "livePhotoVideos"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3007() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 hookBottomTabCreate 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3008() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto L9
            java.lang.String r0 = "蓝"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m3009(java.lang.Object r1, java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Le
            android.media.MediaPlayer r1 = (android.media.MediaPlayer) r1
            android.media.MediaPlayer$OnCompletionListener r2 = (android.media.MediaPlayer.OnCompletionListener) r2
            r1.setOnCompletionListener(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۦ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3010(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda4) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۦۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3011() {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 > 0) goto Lb
            java.lang.String r0 = kevin.fun.hook.DYHook.getModuleVersion()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static androidx.documentfile.provider.DocumentFile m3012(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 <= 0) goto L11
            androidx.documentfile.provider.DocumentFile r1 = (androidx.documentfile.provider.DocumentFile) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            androidx.documentfile.provider.DocumentFile r0 = r1.createFile(r2, r3)
        L10:
            return r0
        L11:
            r0 = 0
            goto L10
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.PPHook.VerifyCallback m3013(java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda14) r2
            kevin.fun.hook.PPHook$VerifyCallback r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3014(short[] r3, int r4, int r5, int r6) {
            char[] r1 = new char[r5]
            r0 = 0
        L3:
            if (r0 >= r5) goto L10
            int r2 = r4 + r0
            short r2 = r3[r2]
            r2 = r2 ^ r6
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L3
        L10:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۟ۧۧۦۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3015(java.lang.Object r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda14) r2
            java.lang.StringBuilder r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static int m3016(java.lang.Object r1) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Ld
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r0 = r1.getHeight()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3017() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 显示确认对话框失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ */
    public static android.content.Context m64(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda0) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m3018(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda83 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda83) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡ۠ */
    public static java.util.List m65(java.lang.Object r1) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto Ld
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.List r0 = java.util.Arrays.asList(r1)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m3019(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda14) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡۡۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m3020(java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda30 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda30) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3021(java.lang.Object r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda75 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda75) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۦۢۤ, reason: not valid java name and contains not printable characters */
    public static java.net.URI m3022(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Lf
            java.net.URI r1 = (java.net.URI) r1
            java.lang.String r2 = (java.lang.String) r2
            java.net.URI r0 = r1.resolve(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۡۧۨ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3023() {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "ShareUserViewHook 下载实况图片失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static java.util.zip.ZipEntry m3024(java.lang.Object r1, java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 >= 0) goto Lf
            java.util.zip.ZipFile r1 = (java.util.zip.ZipFile) r1
            java.lang.String r2 = (java.lang.String) r2
            java.util.zip.ZipEntry r0 = r1.getEntry(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۢۢۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3025() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "shield_feed_comment"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۢۨ۟, reason: not valid java name and contains not printable characters */
    public static int m3026(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m3027(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda63 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda63) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3028(java.lang.Object r1, int r2, int r3) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto Lc
            android.view.Window r1 = (android.view.Window) r1
            r1.setLayout(r2, r3)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣ۠ */
    public static float m66(java.lang.Object r1) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto Ld
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r1.floatValue()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۡۥ۟, reason: not valid java name and contains not printable characters */
    public static void m3029(java.lang.Object r1, boolean r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lc
            android.widget.GridView r1 = (android.widget.GridView) r1
            r1.setFastScrollEnabled(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۣۥۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3030() {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "profile_"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۤۦۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m3031(java.lang.Object r1, int r2, java.lang.Object r3) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lf
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            android.content.res.Resources$Theme r3 = (android.content.res.Resources.Theme) r3
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r3)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣۦۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3032(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto Lc
            android.text.Spannable r1 = (android.text.Spannable) r1
            r1.removeSpan(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3033() {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto L9
            java.lang.String r0 = "\\"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۤۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3034(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda8) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦۤۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3035() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "chat_voice_forward"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m3036(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda69 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda69) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۨ۠۟, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m3037(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda173 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda173) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۤۥۦ, reason: contains not printable characters */
    public static java.lang.String m3038() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.longvideoplus.feed.flux.LongVideoHighlightTagComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۟ۨ۠, reason: contains not printable characters */
    public static java.lang.String m3039() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "个人"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۡۦۡ, reason: contains not printable characters */
    public static java.lang.String m3040() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "选择对方气泡 .9.png"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static org.json.JSONArray m67(java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 < 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda13 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda13) r2
            org.json.JSONArray r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۟۟۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3041() {
            int r0 = androidx.core.C1072.m980()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "+ 添加"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static java.util.Comparator m3042() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto Lb
            java.util.Comparator r0 = java.util.Collections.reverseOrder()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m3043(java.lang.Object r1) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 >= 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            byte[] r0 = r1.getBytes()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static int m3044(java.lang.Object r2) {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda185 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda185) r2
            int r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3045() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto L9
            java.lang.String r0 = " 推荐版本：v"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static java.util.List m3046(java.lang.Object r2) {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda26 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda26) r2
            java.util.List r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.Typeface m3047() {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 <= 0) goto L9
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۨۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3048() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "dynamic_signature_time"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static void m3049(java.lang.Object r1, float r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lc
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setAlpha(r2)
        Lb:
            return
        Lc:
            goto Lb
    }
}
