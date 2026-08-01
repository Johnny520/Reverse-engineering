package androidx.annotation.experimental;

/* JADX INFO: renamed from: androidx.annotation.experimental.ۦ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1067 {

    /* JADX INFO: renamed from: ۨ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static int f93 = -54;

    /* JADX INFO: renamed from: ۣ۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m541() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.ad.feed.bottombar.FeedADSearchBarComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۦۦۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m542() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】Hook Fragment "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m543(java.lang.Object r1) {
            int r0 = m596()
            if (r0 >= 0) goto Ld
            androidx.documentfile.provider.DocumentFile r1 = (androidx.documentfile.provider.DocumentFile) r1
            android.net.Uri r0 = r1.getUri()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟۠۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m544(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda187 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda187) r2
            java.lang.String r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static byte[] m545(java.lang.Object r1, int r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            byte[] r0 = android.util.Base64.decode(r1, r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m546() {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 > 0) goto L9
            java.lang.String r0 = "XhsLivePhotos"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m547(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda206 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda206) r2
            java.lang.String r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۧۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m548(java.lang.String r8) {
            r0 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r1 = r0
        L6:
            r4 = 15
            if (r1 < r4) goto L2c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r4 = r8.length()
            int r4 = r4 / 2
            r1.<init>(r4)
        L15:
            int r4 = r8.length()
            if (r4 > 0) goto L5f
            byte[] r1 = r1.toByteArray()
            int r3 = r1.length
            int r4 = r2.length()
        L24:
            if (r0 < r3) goto L78
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
        L2c:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r3 = r4.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
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
            r4 = r4 ^ r1
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r1 = r1 + 1
            goto L6
        L5f:
            r4 = -2
            char r4 = r8.charAt(r4)
            int r4 = r3.indexOf(r4)
            int r4 = r4 << 4
            r5 = -1
            char r5 = r8.charAt(r5)
            int r5 = r3.indexOf(r5)
            r4 = r4 | r5
            r1.write(r4)
            goto L15
        L78:
            r5 = r1[r0]
            int r6 = r0 % r4
            char r6 = r2.charAt(r6)
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r1[r0] = r5
            int r0 = r0 + 1
            goto L24
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m549() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 CommentTextView 颜色Hook失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۡۧۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m550() {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "10分钟"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m551(java.lang.Object r1, java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto Le
            android.content.Context r1 = (android.content.Context) r1
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r2 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r2
            kevin.fun.hook.webdav.WebDAVConfig.webDAVRestore(r1, r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m552(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda198 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda198) r2
            android.widget.EditText r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m553(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda88 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda88) r2
            java.lang.ref.WeakReference r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.Exception m554(java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 < 0) goto Lb
            kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda28 r2 = (kevin.fun.hook.webdav.WebDAVConfig$$ExternalSyntheticLambda28) r2
            java.lang.Exception r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۡۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m555(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 < 0) goto Lf
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r1.isNull(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m556() {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "💰 微信扫码赞赏 💰"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m557(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda8) r2
            boolean r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m558() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto L9
            java.lang.String r0 = "forbidden_read"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m559() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 createIconTextButton moduleRes == null"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m560() {
            int r0 = m596()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "IM分享引导V2"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۢۦۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m561() {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto L9
            java.lang.String r0 = "SKIN_AD_CHAPTER"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m562(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda72 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda72) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView[] m563(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15) r2
            android.widget.TextView[] r1 = r2.f$13
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m564(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto Lf
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r0 = r1.isAssignableFrom(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۟ۥۨ۟۠, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m565(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda212 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda212) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m566(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۦۡۤۦ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook m567(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda30 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda30) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۣۦۣ, reason: not valid java name and contains not printable characters */
    public static java.util.List m568(java.lang.Object r2) {
            int r0 = androidx.core.C1072.m980()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda6 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda6) r2
            java.util.List r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۤۢۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m569() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto L9
            java.lang.String r0 = "&from=comment"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۧۥۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m570() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto L9
            java.lang.String r0 = " & "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static float m571(java.lang.Object r1) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Ld
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            float r0 = r1.getY()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static void m572(java.lang.Object r1, int r2, int r3) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Lc
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            r1.setStroke(r2, r3)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static java.io.File m573(java.lang.Object r2) {
            int r0 = m596()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda25 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda25) r2
            java.io.File r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m574() {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "image"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m575() {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 > 0) goto L9
            java.lang.String r0 = "setSystemUiVisibility"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static android.view.View m576(java.lang.Object r1, int r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 >= 0) goto Ld
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.View r0 = r1.findViewById(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۠ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m577() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 ⚠️ 创建目录失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m578() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "livePhoto"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m579(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto Le
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۡۢۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m580(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda145 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda145) r2
            android.widget.TextView r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۤۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m581(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m582() {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto L9
            java.lang.String r0 = "void"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۧۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m583() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto L9
            java.lang.String r0 = "右侧控件位置调整"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۡۤۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m584(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda13 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda13) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static int m585(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda163 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda163) r2
            int r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۢۦۣ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.XhsHook m586(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda11 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda11) r2
            kevin.fun.hook.XhsHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static java.io.InputStream m587(java.lang.Object r1) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto Ld
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.io.InputStream r0 = r1.getErrorStream()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۧۤۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m588(java.lang.Object r1, java.lang.Object r2, int r3) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto Lf
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r0 = r1.createPackageContext(r2, r3)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m589(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda45 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda45) r2
            android.widget.TextView r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m590(java.lang.Object r2) {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda181 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda181) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۢۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m591() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "添加备注..."
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m592() {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 < 0) goto L9
            java.lang.String r0 = "tab_id"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۣۡ۟, reason: contains not printable characters */
    public static java.lang.String m593() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            java.lang.String r0 = "MainBottomTabLayout"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static android.view.ViewPropertyAnimator m594(java.lang.Object r1) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 < 0) goto Ld
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.ViewPropertyAnimator r0 = r1.animate()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۥۣۥ, reason: contains not printable characters */
    public static android.os.Looper m595() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 > 0) goto Lb
            android.os.Looper r0 = android.os.Looper.myLooper()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۥۦۢ, reason: contains not printable characters */
    public static int m596() {
            r0 = 967(0x3c7, float:1.355E-42)
            int r1 = androidx.lifecycle.viewmodel.C1093.f119
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۦ۠ۦۣ, reason: contains not printable characters */
    public static java.io.File m597(java.lang.Object r1) {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto Ld
            android.content.Context r1 = (android.content.Context) r1
            java.io.File r0 = r1.getFilesDir()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦ۠ۧۢ, reason: contains not printable characters */
    public static android.app.Dialog m598(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda115 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda115) r2
            android.app.Dialog r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۣۨ۟, reason: contains not printable characters */
    public static kevin.fun.hook.XhsHook m599(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda31 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda31) r2
            kevin.fun.hook.XhsHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m600(java.lang.Object r1, boolean r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto Lc
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setEnabled(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m601(java.lang.Object r1, char r2) {
            int r0 = androidx.core.C1072.m980()
            if (r0 <= 0) goto Ld
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.StringBuilder r0 = r1.append(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۧۢۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m602(java.lang.Object r2) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda221 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda221) r2
            android.widget.EditText r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m603() {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 < 0) goto L9
            java.lang.String r0 = "收藏"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۤۥۤ, reason: not valid java name and contains not printable characters */
    public static long m604() {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto Lb
            long r0 = kevin.fun.hook.webdav.WebDAVConfig.getLastBackupTime()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۦۥۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m605(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda75 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda75) r2
            android.widget.EditText r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static java.io.InputStream m606(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto Lf
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            android.net.Uri r2 = (android.net.Uri) r2
            java.io.InputStream r0 = r1.openInputStream(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣۨۧۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m607(java.lang.Object r2) {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda46 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda46) r2
            java.lang.Runnable r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۥۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m608() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "LJIIIIZZ"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m609(java.lang.Object r2) {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda166 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda166) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
