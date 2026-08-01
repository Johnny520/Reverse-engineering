package dev.rikka.ndk.thirdparty.libcxx;

/* JADX INFO: renamed from: dev.rikka.ndk.thirdparty.libcxx.۟ۦۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1110 {

    /* JADX INFO: renamed from: ۨۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int f136 = 653;

    /* JADX INFO: renamed from: ۟۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m3636(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3637() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】获取模块版本失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static int m3638() {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 >= 0) goto Lb
            int r0 = android.os.Process.myPid()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3639(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L3c
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L16:
            int r5 = r8.length()
            if (r0 < r5) goto L6f
            byte[] r3 = r4.toByteArray()
            java.lang.String r0 = "a"
        L22:
            int r4 = r0.length()
            if (r4 > 0) goto L8a
            int r4 = r0.length()
            int r5 = r2.length()
            r0 = r1
        L31:
            if (r0 < r4) goto L95
        L33:
            int r0 = r3.length
            if (r1 < r0) goto La4
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L3c:
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
        L6f:
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
        L8a:
            java.lang.String r0 = ""
            int r4 = r0.length()
            if (r4 != 0) goto L22
            java.lang.String r0 = "a"
            goto L22
        L95:
            r6 = r3[r0]
            int r7 = r0 % r5
            char r7 = r2.charAt(r7)
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r3[r0] = r6
            int r0 = r0 + 1
            goto L31
        La4:
            java.lang.String r0 = ""
            int r0 = r0.length()
            int r1 = r0 + 1
            goto L33
    }

    /* JADX INFO: renamed from: ۟۟ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static java.util.Map m3640(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda24 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda24) r2
            java.util.Map r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3641() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto L9
            java.lang.String r0 = "预览："
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3642() {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】评论头部屏蔽 Hook 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3643() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto L9
            java.lang.String r0 = "section_评论"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static java.io.File[] m3644(java.lang.Object r1) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto Ld
            java.io.File r1 = (java.io.File) r1
            java.io.File[] r0 = r1.listFiles()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3645() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "getWindow"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3646() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "com.bytedance.im.core.mi.IMSdkContext"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3647() {
            int r0 = androidx.core.C1072.m980()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "android.content.ClipboardManager"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3648() {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "ShareUserViewHook 下载图片"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۨ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3649() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto L9
            java.lang.String r0 = "屏蔽直播"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3650() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto L9
            java.lang.String r0 = "lib/"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m3651(java.lang.Object r1, int r2) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto Lc
            android.widget.GridView r1 = (android.widget.GridView) r1
            r1.setVerticalSpacing(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static java.util.Scanner m3652(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto Lf
            java.util.Scanner r1 = (java.util.Scanner) r1
            java.lang.String r2 = (java.lang.String) r2
            java.util.Scanner r0 = r1.useDelimiter(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۟ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3653() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto L9
            java.lang.String r0 = "0"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3654(java.lang.Object r1, int r2) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto Ld
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.StringBuilder r0 = r1.append(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m3655(java.lang.Object r1) {
            int r0 = m3663()
            if (r0 < 0) goto Ld
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r0 = r1.getByteCount()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۢۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static long m3656(java.lang.Object r4) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda28 r4 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda28) r4
            long r2 = r4.f$3
        La:
            return r2
        Lb:
            r2 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3657(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Ld
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            boolean r0 = r1.getBoolean(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static android.view.ViewParent m3658(java.lang.Object r1) {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 >= 0) goto Ld
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r0 = r1.getParent()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۤۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3659(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto L12
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String[] r3 = (java.lang.String[]) r3
            android.media.MediaScannerConnection$OnScanCompletedListener r4 = (android.media.MediaScannerConnection.OnScanCompletedListener) r4
            android.media.MediaScannerConnection.scanFile(r1, r2, r3, r4)
        L11:
            return
        L12:
            goto L11
    }

    /* JADX INFO: renamed from: ۟ۤۤۤۤ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m3660(java.lang.Object r2) {
            int r0 = androidx.activity.C1063.m300()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda19 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda19) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3661(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2 r2 = (kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۤۦۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3662(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda23 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda23) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static int m3663() {
            r0 = 209(0xd1, float:2.93E-43)
            int r1 = androidx.core.ktx.C1071.f97
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3664() {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto L9
            java.lang.String r0 = "LJIIIZ"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m3665(java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda72 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda72) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m3666(java.lang.Object r1, int r2) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto Lc
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.setMinHeight(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۥ, reason: not valid java name and contains not printable characters */
    public static void m3667(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto Le
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r1 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r1
            java.lang.String r2 = (java.lang.String) r2
            r1.onSuccess(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3668() {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "block_click_reply"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3669(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Lb
            android.content.pm.ApplicationInfo r2 = (android.content.pm.ApplicationInfo) r2
            java.lang.String r1 = r2.sourceDir
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m3670(java.lang.Object r1, int r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 > 0) goto Lc
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.setMaxLines(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۧۡۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3671() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto L9
            java.lang.String r0 = "top_bar_alpha"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3672() {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "shield_bellow_desc_time"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3673() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "🎤"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۠ۥۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3674() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "颜色已保存，重启抖音生效"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static int m3675(java.lang.Object r1, java.lang.Object r2, int r3) {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 >= 0) goto Lf
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.optInt(r2, r3)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣۡۨۧ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m3676(java.lang.Object r2) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda10) r2
            android.app.Activity r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3677(java.lang.Object r1, int r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto Lc
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.setFixedLengthStreamingMode(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۢ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int[] m3678(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda161 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda161) r2
            int[] r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3679(java.lang.Object r1, float r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 > 0) goto Lc
            java.lang.String r1 = (java.lang.String) r1
            kevin.fun.hook.MMKVHelper.putFloat(r1, r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۢ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String[] m3680() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto L9
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m3681(java.lang.Object r1) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto Ld
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r1.getPaintFlags()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۢۥۡۥ, reason: not valid java name and contains not printable characters */
    public static int m3682(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۣۣۨ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m3683(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda53 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda53) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3684() {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.splash.SplashActivity"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3685() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "ad_chapter"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3686(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto L12
            kevin.fun.hook.download.DownloadManager r1 = (kevin.fun.hook.download.DownloadManager) r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            r1.downloadWorkLivePhoto(r2, r3, r4, r5)
        L11:
            return
        L12:
            goto L11
    }

    /* JADX INFO: renamed from: ۣۤۦۡ, reason: not valid java name and contains not printable characters */
    public static android.graphics.Bitmap m3687(java.lang.Object r1, int r2, int r3, int r4, int r5) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto Ld
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۤۦۣۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3688(java.lang.Object r2) {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda154 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda154) r2
            java.lang.String r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3689() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 safelyDismissDialog失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۨۨۥ, reason: not valid java name and contains not printable characters */
    public static java.util.Iterator m3690(java.lang.Object r1) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto Ld
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.util.Iterator r0 = r1.keys()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static void m3691(java.lang.Object r1) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto Lc
            android.content.Context r1 = (android.content.Context) r1
            kevin.fun.hook.VoiceAssistantHook.startVoiceAssistant(r1)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۦۥۦ۠, reason: contains not printable characters */
    public static android.content.Context m3692(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda3) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۦ */
    public static java.lang.Object m73(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$190$1$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$190$1$$ExternalSyntheticLambda0) r2
            java.lang.Object r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3693() {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "保存失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static void m3694(java.lang.Object r1) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lc
            kevin.fun.hook.download.DownloadManager r1 = (kevin.fun.hook.download.DownloadManager) r1
            r1.clearCommentInfo()
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m3695(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda183 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda183) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۨ۟۠, reason: not valid java name and contains not printable characters */
    public static int m3696(java.lang.Object r1) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Ld
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            int r0 = r1.getIntrinsicHeight()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧۨۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3697(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۨ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3698(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 > 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda35 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda35) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int[] m3699(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda24 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda24) r2
            int[] r1 = r2.f$6
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m3700(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto Le
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
        Ld:
            return
        Le:
            goto Ld
    }
}
