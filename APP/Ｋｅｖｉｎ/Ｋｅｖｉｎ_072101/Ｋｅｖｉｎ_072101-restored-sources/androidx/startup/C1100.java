package androidx.startup;

/* JADX INFO: renamed from: androidx.startup.۟ۦۤۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1100 {

    /* JADX INFO: renamed from: ۧۡۡۦ, reason: not valid java name and contains not printable characters */
    public static int f126 = -278;

    /* JADX INFO: renamed from: ۟۟۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2909(java.lang.String r8) {
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r2 = ""
            r0 = r1
        L6:
            r4 = 15
            if (r0 < r4) goto L33
        La:
            int r0 = r3.length()
            if (r0 > 0) goto La
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            int r0 = r8.length()
            int r0 = r0 / 2
            r4.<init>(r0)
            r0 = r1
        L1c:
            int r5 = r8.length()
            if (r0 < r5) goto L66
            byte[] r0 = r4.toByteArray()
            int r3 = r0.length
            int r4 = r2.length()
        L2b:
            if (r1 < r3) goto L81
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L33:
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
        L66:
            char r5 = r8.charAt(r0)
            int r5 = r3.indexOf(r5)
            int r5 = r5 << 4
            int r6 = r0 + 1
            char r6 = r8.charAt(r6)
            int r6 = r3.indexOf(r6)
            r5 = r5 | r6
            r4.write(r5)
            int r0 = r0 + 2
            goto L1c
        L81:
            r5 = r0[r1]
            int r6 = r1 % r4
            char r6 = r2.charAt(r6)
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r0[r1] = r5
            int r1 = r1 + 1
            goto L2b
    }

    /* JADX INFO: renamed from: ۟۠۟۠۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2910() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "onVideoPlayerEvent"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2911() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 sponsor failed\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2912() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto L9
            java.lang.String r0 = "HPFrameLayout"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2913() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto L9
            java.lang.String r0 = "抖音精选"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۡۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2914() {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 > 0) goto L9
            java.lang.String r0 = "👤 主页"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2915() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto L9
            java.lang.String r0 = "comment_bg_mode"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2916(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۢۥۥ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2917() {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.full.FeedStickerComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۟۠۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2918() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto L9
            java.lang.String r0 = "保存图片"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2919(java.lang.Object r2) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda107 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda107) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m2920(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto Le
            kevin.fun.hook.OriginalVideoParser$ParseCallback r1 = (kevin.fun.hook.OriginalVideoParser.ParseCallback) r1
            java.lang.String r2 = (java.lang.String) r2
            r1.onFailure(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۤۡۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2921() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "\\s"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۢۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2922(java.lang.Object r1) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto Ld
            android.widget.EditText r1 = (android.widget.EditText) r1
            boolean r0 = r1.requestFocus()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.Switch m2923(java.lang.Object r2) {
            int r0 = m2972()
            if (r0 > 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1) r2
            android.widget.Switch r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۨۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m2924() {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 > 0) goto L9
            java.lang.Class r0 = java.lang.Float.TYPE
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2925() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "ShareUserViewHook 实况图片下载失败:\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۤۤۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2926() {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 loadNinePatchDrawable失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2927() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 WallpaperMask Hook失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۨۦۥ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m2928(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda74 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda74) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۣۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2929() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto L9
            java.lang.String r0 = "video_list"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۥۡۤ, reason: not valid java name and contains not printable characters */
    public static java.util.Set m2930(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$89$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$89$$ExternalSyntheticLambda0) r2
            java.util.Set r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2931(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m2932(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda15 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda15) r2
            java.lang.Runnable r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2933() {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "wardItems"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2934() {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "videoUrl"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static android.view.ViewPropertyAnimator m2935(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 >= 0) goto Lf
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2936(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2937(java.lang.Object r1, boolean r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lc
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.setUseCaches(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2938() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.right.FeedMusicCoverBlockComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2939() {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 < 0) goto L9
            java.lang.String r0 = "点击自定义时间样式"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2940() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 > 0) goto L9
            java.lang.String r0 = "ShareUserViewHook ❌ loadDexKitSo 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2941() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto L9
            java.lang.String r0 = "打开失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2942() {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "发布时间戳"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2943(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda181 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda181) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static int m2944(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda192 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda192) r2
            int r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۢۨ۟, reason: not valid java name and contains not printable characters */
    public static void m2945(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Le
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.setLayoutParams(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m2946(java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4) r2
            android.widget.TextView r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۤۧۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m2947(java.lang.Object r1, int r2) {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 >= 0) goto Ld
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2948(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 < 0) goto L10
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r2, r3)
        Lf:
            return
        L10:
            goto Lf
    }

    /* JADX INFO: renamed from: ۡۦ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2949(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lc
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setTag(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۡۧۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2950() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 主页时间Hook失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۡۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2951(java.lang.Object r1) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto Ld
            java.lang.Thread r1 = (java.lang.Thread) r1
            boolean r0 = r1.isAlive()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۢۢۡ, reason: not valid java name and contains not printable characters */
    public static android.view.ViewPropertyAnimator m2952(java.lang.Object r1, float r2) {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 <= 0) goto Ld
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            android.view.ViewPropertyAnimator r0 = r1.rotation(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static android.view.ViewPropertyAnimator m2953(java.lang.Object r1) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto Ld
            android.view.View r1 = (android.view.View) r1
            android.view.ViewPropertyAnimator r0 = r1.animate()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2954() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "setFlags"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2955() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "getItems"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۥۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2956() {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "下载"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۥۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2957(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda38 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda38) r2
            java.lang.String r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۨۢۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.XhsHook m2958(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda13 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda13) r2
            kevin.fun.hook.XhsHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦ۠۟, reason: not valid java name and contains not printable characters */
    public static android.content.ClipData m2959(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 > 0) goto Lf
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r1, r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۤۦۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2960() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "是否下载评论语音？"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۦۣۢ, reason: contains not printable characters */
    public static java.lang.String m2961() {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto L9
            java.lang.String r0 = "混合底部栏"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m2962() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "即将退出"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۣۣ۠, reason: contains not printable characters */
    public static boolean m2963(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto Lf
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r1.getBoolean(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۦۡۦۧ, reason: contains not printable characters */
    public static kevin.fun.hook.KSHook m2964(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda21 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda21) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.Consumer m2965(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda161 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda161) r2
            kevin.fun.hook.DYHook$Consumer r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2966() {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 ReadDoMark Hook 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2967(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۥۦۣ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m2968(java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda75 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda75) r2
            android.app.Dialog r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m2969(java.lang.Object r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda32 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda32) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2970(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda70 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda70) r2
            java.lang.String r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static int m2971(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.XhsHook$9$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.XhsHook$9$$ExternalSyntheticLambda0) r2
            int r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static int m2972() {
            r0 = -38
            int r1 = androidx.lifecycle.livedata.C1086.f112
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۨۥۡ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener m2973(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3) r2
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۦۦۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m2974() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "文案"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m2975(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 <= 0) goto Le
            android.graphics.LinearGradient r1 = (android.graphics.LinearGradient) r1
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r1.setLocalMatrix(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۣۨۨۨ, reason: not valid java name and contains not printable characters */
    public static int[] m2976(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda103 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda103) r2
            int[] r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
