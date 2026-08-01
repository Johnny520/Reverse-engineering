package androidx.loader;

/* JADX INFO: renamed from: androidx.loader.ۥۧۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1099 {

    /* JADX INFO: renamed from: ۣ۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f125 = 859;

    /* JADX INFO: renamed from: ۟۟۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2831(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2
            int r1 = r2.conversationType
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2832(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L30
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L16:
            int r5 = r8.length()
            if (r0 < r5) goto L63
            byte[] r0 = r4.toByteArray()
            int r3 = r0.length
            int r4 = r2.length()
        L25:
            if (r3 > 0) goto L7e
        L27:
            int r2 = r0.length
            if (r1 < r2) goto L8c
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L30:
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
        L63:
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
        L7e:
            r5 = -1
            r6 = r0[r5]
            int r7 = r5 % r4
            char r7 = r2.charAt(r7)
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r0[r5] = r6
            goto L25
        L8c:
            java.lang.String r1 = ""
            int r1 = r1.length()
            int r1 = r1 + 1
            goto L27
    }

    /* JADX INFO: renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m2833(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda172 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda172) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2834(java.lang.Object r1, boolean r2) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto Lc
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.setSingleLine(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟۠۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2835() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.right.FeedC2RComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2836(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda36 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda36) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2837() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "remove_copy_at"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m2838(java.lang.Object r1) {
            int r0 = m2876()
            if (r0 >= 0) goto Ld
            java.util.Queue r1 = (java.util.Queue) r1
            java.lang.Object r0 = r1.poll()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2839(java.lang.Object r1) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto Lb
            java.lang.String r0 = java.lang.String.valueOf(r1)
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m2840(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda139 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda139) r2
            android.app.Dialog r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2841() {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 < 0) goto L9
            java.lang.String r0 = "顶栏"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2842() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto L9
            java.lang.String r0 = "GMT+8"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۢ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2843(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۟ۢۢۥۤ, reason: not valid java name and contains not printable characters */
    public static int m2844(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2
            int r1 = r2.days
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2845() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.comment.widgets.header.CommentHeaderWidget"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ */
    public static kevin.fun.hook.SparkRenewHelper.SparkInfo m60(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7) r2
            kevin.fun.hook.SparkRenewHelper$SparkInfo r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2846(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda26 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda26) r2
            int r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2847(java.lang.Object r1) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto Ld
            java.io.File r1 = (java.io.File) r1
            java.lang.String r0 = r1.getName()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۣ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2848(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda11 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda11) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static void m2849(java.lang.Object r1, int r2) {
            int r0 = androidx.activity.C1063.m300()
            if (r0 < 0) goto Lc
            android.view.View r1 = (android.view.View) r1
            r1.setBackgroundColor(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2850() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "feedCommentConfig"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۥۣۢ, reason: not valid java name and contains not printable characters */
    public static int m2851(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۣ۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2852() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 load fail: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m2853(java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda219 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda219) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2854(java.lang.Object r2) {
            int r0 = m2876()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda187 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda187) r2
            boolean r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout[] m2855(java.lang.Object r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda103 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda103) r2
            android.widget.LinearLayout[] r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2856() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "❌ 显示图片选择器失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2857(java.lang.Object r2) {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda12 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda12) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2858(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda93 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda93) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m2859(java.lang.Object r1, int r2, java.lang.Object r3) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Lc
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setTag(r2, r3)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2860(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 > 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda29 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda29) r2
            java.lang.String r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static java.util.function.Consumer m2861(java.lang.Object r2) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto Lb
            kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda20 r2 = (kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda20) r2
            java.util.function.Consumer r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۧۧۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2862() {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto L9
            java.lang.String r0 = "https://"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۨۢۧ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m2863(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda21 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda21) r2
            android.app.Activity r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2864() {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto L9
            java.lang.String r0 = "IP属地"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2865() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "tabTitle"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧۡۦ۟, reason: not valid java name and contains not printable characters */
    public static android.widget.ImageView m2866(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda134 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda134) r2
            android.widget.ImageView r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۥ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2867(java.lang.Object r1) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 <= 0) goto Ld
            android.content.Intent r1 = (android.content.Intent) r1
            int r0 = r1.getFlags()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۨۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean[] m2868(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15) r2
            boolean[] r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2869() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto L9
            java.lang.String r0 = "flow"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2870(java.lang.Object r1, float r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto Lc
            android.view.Window r1 = (android.view.Window) r1
            r1.setDimAmount(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m2871(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda15 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda15) r2
            android.widget.LinearLayout r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2872(java.lang.Object r1) {
            int r0 = androidx.activity.C1063.m300()
            if (r0 <= 0) goto Ld
            kevin.fun.hook.DownloadPathConfig r1 = (kevin.fun.hook.DownloadPathConfig) r1
            java.lang.String r0 = r1.getTreeUriString()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2873(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda32 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda32) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2874() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "java.util.List"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۦ۟۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2875(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14) r2
            java.lang.String r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2876() {
            r0 = -746(0xfffffffffffffd16, float:NaN)
            int r1 = androidx.versionedparcelable.C1107.f133
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2877() {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "已插眼 ✓"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m2878(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda11 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda11) r2
            java.lang.Runnable r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2879() {
            int r0 = androidx.core.C1072.m980()
            if (r0 < 0) goto L9
            java.lang.String r0 = "shield_watch_together"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m2880(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lb
            android.graphics.BitmapFactory$Options r2 = (android.graphics.BitmapFactory.Options) r2
            int r1 = r2.outWidth
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m2881(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto Le
            android.widget.Switch r1 = (android.widget.Switch) r1
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setTrackDrawable(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۣۥۣۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m2882(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda42 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda42) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۥۥۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2883() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "点击配置气泡图片"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m2884(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda27 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda27) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2885(java.lang.Object r1) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto Lc
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeAllViews()
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۤ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2886() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "CommentMentionEditText"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۤۧۦ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m2887(java.lang.Object r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 > 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda10) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Exception m2888(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda16 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda16) r2
            java.lang.Exception r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2889() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "FeedRightScaleView"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥ۟ۤۢ, reason: contains not printable characters */
    public static java.lang.String m2890() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 handleCustomAction: Activity不可用"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۣۧۢ, reason: contains not printable characters */
    public static java.lang.String m2891() {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "bottom_transparent"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۟ۤۤ, reason: contains not printable characters */
    public static boolean m2892(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r1.equalsIgnoreCase(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۦ۟ۦۦ, reason: contains not printable characters */
    public static java.lang.String m2893() {
            int r0 = androidx.activity.C1063.m300()
            if (r0 < 0) goto L9
            java.lang.String r0 = "添加成功"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۢ۟ۤ, reason: contains not printable characters */
    public static java.util.List m2894(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda34 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda34) r2
            java.util.List r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۢ۠ۨ, reason: contains not printable characters */
    public static java.lang.String m2895(java.lang.Object r1) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto Ld
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = r1.getMessage()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦۥ۠۠, reason: contains not printable characters */
    public static int m2896(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto Lf
            java.io.InputStream r1 = (java.io.InputStream) r1
            byte[] r2 = (byte[]) r2
            int r0 = r1.read(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۦۥۢ۟, reason: contains not printable characters */
    public static java.lang.String m2897(java.lang.Object r1) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Ld
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            java.lang.String r0 = r1.readLine()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2898(java.lang.Object r2) {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 < 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda2 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda2) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static android.view.ViewPropertyAnimator m2899(java.lang.Object r1, long r2) {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 > 0) goto Ld
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            android.view.ViewPropertyAnimator r0 = r1.setDuration(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.SparkRenewHelper.SparkInfo m2900(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda18 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda18) r2
            kevin.fun.hook.SparkRenewHelper$SparkInfo r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۤۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2901() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "\n\n作品标签："
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2902() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_ecom_store"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۦۥ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2903() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】getCurrentUserOnce 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۦۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2904() {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 < 0) goto L9
            java.lang.String r0 = "shield_bottom_bar_enterprise_recommend"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2905(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda53 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda53) r2
            int r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۨۨۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2906() {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_build_group"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۨۦۡ, reason: not valid java name and contains not printable characters */
    public static java.util.Map m2907(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda180 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda180) r2
            java.util.Map r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
