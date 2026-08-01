package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.ۣۦۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1063 {

    /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int f89 = 2;

    /* JADX INFO: renamed from: ۟۟۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static android.content.Context m230(java.lang.Object r2) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto Lb
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m231(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda95 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda95) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m232() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 showHideConversationTipDialog 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m233(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۟۠۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m234() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "imageInfos"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m235() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.comment.ui.longpress.CommentLongPressItemView"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m236() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】保存会话名称失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m237() {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto L9
            java.lang.String r0 = "AWEME_RAW_AD_ERROR_METHOD"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۧۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m238() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto L9
            java.lang.String r0 = "按钮容器(失效勿开)"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡۨۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m239(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda4) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m240(java.lang.Object r1) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 < 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            android.net.Uri r0 = android.net.Uri.parse(r1)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۡۨ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m241(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۟ۢ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m242(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda8) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m243(java.lang.Object r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 > 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda23 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda23) r2
            android.app.Activity r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m244(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto Le
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.execute(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۢۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m245() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 hookSplashAdActivity failed: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static android.content.ContentResolver m246(java.lang.Object r1) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Ld
            android.content.Context r1 = (android.content.Context) r1
            android.content.ContentResolver r0 = r1.getContentResolver()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m247() {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "mmkvWithID"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static void m248(java.lang.Object r1, boolean r2) {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 > 0) goto Lc
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setClickable(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.util.List m249(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda24 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda24) r2
            java.util.List r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m250() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "kevin_prefs"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۢۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m251() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 < 0) goto L9
            java.lang.String r0 = "MAIN_TAB_LAYOUT_CLASS"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m252() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "#2196F3"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m253() {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "shield_FeedAnchorFrameworkComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int[] m254(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda67 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda67) r2
            int[] r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m255(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda77 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda77) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m256(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda10) r2
            java.lang.String r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۥۣۡ, reason: not valid java name and contains not printable characters */
    public static java.util.Set m257(java.lang.Object r1) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 >= 0) goto Ld
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r0 = r1.keySet()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۥۣۧۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m258() {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "hookCommentFullTime failed:\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۨۧۢ, reason: not valid java name and contains not printable characters */
    public static void m259(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto Le
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = (java.lang.String) r2
            kevin.fun.hook.DYHook.showSuccessToast(r1, r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۥۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m260(java.lang.Object r1) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 >= 0) goto Lc
            java.lang.String r1 = (java.lang.String) r1
            kevin.fun.hook.MMKVHelper.remove(r1)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۥۨۨۦ, reason: not valid java name and contains not printable characters */
    public static org.json.JSONArray m261(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto Ld
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            org.json.JSONArray r0 = r1.put(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m262() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto L9
            java.lang.String r0 = "🎲 选择骰子点数"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۡۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m263(java.lang.Object r2) {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda10) r2
            java.lang.ref.WeakReference r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۣۨۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m264(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda160 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda160) r2
            android.widget.TextView r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۧ, reason: not valid java name and contains not printable characters */
    public static void m265(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto Le
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.View$OnLongClickListener r2 = (android.view.View.OnLongClickListener) r2
            r1.setOnLongClickListener(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m266(java.lang.Object r2) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda3) r2
            android.widget.EditText r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۦۨ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m267(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda5) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object[] m268(java.lang.Object r1, int r2, int r3, java.lang.Object r4) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Lf
            android.text.Spannable r1 = (android.text.Spannable) r1
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object[] r0 = r1.getSpans(r2, r3, r4)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m269(java.lang.Object r1) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto Ld
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m270(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda39 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda39) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m271(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda44 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda44) r2
            android.widget.TextView r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m272(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda206 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda206) r2
            android.widget.TextView r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m273() {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto L9
            java.lang.String r0 = "Self-destruct"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static android.graphics.Bitmap.Config m274() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m275() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "播放反馈"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m276(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda82 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda82) r2
            android.widget.EditText r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m277(java.lang.Object r2) {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda129 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda129) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡۥ, reason: not valid java name and contains not printable characters */
    public static int m278(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۡۦۥۤ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m279() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto L9
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۦۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m280() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "android.intent.category.OPENABLE"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m281(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda82 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda82) r2
            android.app.Dialog r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m282(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda49 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda49) r2
            java.lang.Runnable r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m283() {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.right.FeedFlowComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m284() {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 > 0) goto L9
            java.lang.String r0 = "FEED_TIME_FORMAT"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m285(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 < 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda24 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda24) r2
            android.widget.EditText r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m286(java.lang.Object r1, java.lang.Object r2, int r3, int r4) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto Le
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            byte[] r2 = (byte[]) r2
            r1.write(r2, r3, r4)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۢۧۥۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m287(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda39 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda39) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۦۣۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m288() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_ecom_tag_group"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m289() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_reward"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m290(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 <= 0) goto Le
            android.widget.Button r1 = (android.widget.Button) r1
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۤۥۧۦ, reason: not valid java name and contains not printable characters */
    public static void m291(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Le
            android.widget.ListView r1 = (android.widget.ListView) r1
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setDivider(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۤۧۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m292() {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "搜索作者、文案、备注..."
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۢۨ, reason: contains not printable characters */
    public static int m293(java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda14) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۤ۟۟, reason: contains not printable characters */
    public static java.lang.String m294() {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto L9
            java.lang.String r0 = "IM分享引导"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۥۢۨ, reason: contains not printable characters */
    public static kevin.fun.hook.KSHook m295(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 < 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda10) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۨ۟, reason: contains not printable characters */
    public static java.lang.String m296() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto L9
            java.lang.String r0 = "other"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۤۡۥ, reason: contains not printable characters */
    public static android.content.Context m297(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda6 r2 = (kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda6) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۤۨۤ, reason: contains not printable characters */
    public static java.lang.String m298(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda8) r2
            java.lang.String r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۣۧۢ, reason: contains not printable characters */
    public static java.lang.String m299() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_feedback"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۧۥۨ, reason: contains not printable characters */
    public static int m300() {
            r0 = -734(0xfffffffffffffd22, float:NaN)
            int r1 = androidx.annotation.experimental.C1067.f93
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۦۧۧۧ, reason: contains not printable characters */
    public static java.lang.String m301() {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto L9
            java.lang.String r0 = "decode"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۧ۠۠, reason: not valid java name and contains not printable characters */
    public static int m302(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto Ld
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = r1.indexOf(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m303(java.lang.Object r2) {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda62 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda62) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m304() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "snssdk1128://chat?conversation_id=%s"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۤۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m305() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 ❌ Hook SimPlayer 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۤۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m306() {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_c2_recommend_drag_mask"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۥۢۡ, reason: not valid java name and contains not printable characters */
    public static java.nio.charset.Charset m307() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto L9
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۨۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m308() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】Scheme打开视频失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧۧۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m309(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda180 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda180) r2
            android.content.Context r1 = r2.f$10
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
