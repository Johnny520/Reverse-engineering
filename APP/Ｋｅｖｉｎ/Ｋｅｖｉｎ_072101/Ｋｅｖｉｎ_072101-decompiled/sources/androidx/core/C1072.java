package androidx.core;

/* JADX INFO: renamed from: androidx.core.ۤۦ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1072 {

    /* JADX INFO: renamed from: ۡ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static int f98 = -544;

    /* JADX INFO: renamed from: ۟۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static java.util.function.Consumer m921(java.lang.Object r2) {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto Lb
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda0) r2
            java.util.function.Consumer r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m922(java.lang.Object r2) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda108 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda108) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.LinearGradient m923(java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda9) r2
            android.graphics.LinearGradient r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m924(java.lang.Object r1, int r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 >= 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r1.substring(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m925(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۟۟ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static java.util.Set m926(java.lang.Object r1) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto Ld
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r0 = r1.entrySet()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m927(java.lang.Object r2) {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda7) r2
            java.lang.String r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m928() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto L9
            java.lang.String r0 = "删除选中"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.Consumer m929(java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda65 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda65) r2
            kevin.fun.hook.DYHook$Consumer r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m930() {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "shield_profile"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m931(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2
            boolean r1 = r2.needsRenewal
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m932(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto Le
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.runOnUiThread(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m933(java.lang.Object r1, int r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Lc
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setMinHeight(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m934() {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 < 0) goto L9
            java.lang.String r0 = "categories"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m935() {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 > 0) goto L9
            java.lang.String r0 = "BIG_EMOJI_CLASS"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۤۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m936() {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 insertEyeButtonInDialogPanel 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m937() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "阻止已读上报"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m938() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 hookOtherFeatures failed: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m939() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 < 0) goto L9
            java.lang.String r0 = "filter_min_duration_sec"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۡ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri[] m940(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda5) r2
            android.net.Uri[] r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m941() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 > 0) goto L9
            java.lang.String r0 = "加载模块资源失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m942(java.lang.Object r1, int r2) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto Lc
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setColorFilter(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m943() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto L9
            java.lang.String r0 = "【Kevin】 类未找到: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.download.DownloadManager m944(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.download.DownloadManager r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۤۨۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m945() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 > 0) goto L9
            java.lang.String r0 = "file_name_format"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m946() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 获取用户头像失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m947() {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 处理Tab项失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۣۦ۟, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m948(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto L11
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            android.net.Uri r2 = (android.net.Uri) r2
            android.content.ContentValues r3 = (android.content.ContentValues) r3
            android.net.Uri r0 = r1.insert(r2, r3)
        L10:
            return r0
        L11:
            r0 = 0
            goto L10
    }

    /* JADX INFO: renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m949(java.lang.Object r1, boolean r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Lc
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.setHorizontallyScrolling(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m950() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto L9
            java.lang.String r0 = "<init>"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m951() {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 > 0) goto L9
            java.lang.String r0 = "comment_voice_assistant"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۥۨ۟, reason: not valid java name and contains not printable characters */
    public static android.content.Context m952(java.lang.Object r2) {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda150 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda150) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۡۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m953(java.lang.Object r1) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto Ld
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r0 = r1.getName()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m954(java.lang.Object r1) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 >= 0) goto Lc
            java.util.List r1 = (java.util.List) r1
            r1.clear()
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۡۥۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m955() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto L9
            java.lang.String r0 = "SharePackage_Static_Creator"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m956() {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 < 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.feed.plato.business.contentconsumption.landscape.uimodule.FeedLandscapeEntranceModule"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m957(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۣۣۣۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m958(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda13 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda13) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m959(java.lang.Object r1) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 > 0) goto Ld
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getVisibility()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m960() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto L9
            java.lang.String r0 = "清除失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m961(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۤ۠۠۠, reason: not valid java name and contains not printable characters */
    public static android.graphics.Bitmap m962(java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda99 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda99) r2
            android.graphics.Bitmap r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static android.app.AlertDialog.Builder m963(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto L11
            android.app.AlertDialog$Builder r1 = (android.app.AlertDialog.Builder) r1
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            android.app.AlertDialog$Builder r0 = r1.setItems(r2, r3)
        L10:
            return r0
        L11:
            r0 = 0
            goto L10
    }

    /* JADX INFO: renamed from: ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m964() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto L9
            java.lang.String r0 = "30分钟"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۥ */
    public static java.lang.String m45() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "禁用新版评论区"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۦۨ۠, reason: contains not printable characters */
    public static java.util.List m965(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5) r2
            java.util.List r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۧ۠, reason: contains not printable characters */
    public static java.lang.Object m966(java.lang.Object r1, int r2) {
            int r0 = m980()
            if (r0 <= 0) goto Ld
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r1.getTag(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۥۧۧ۟, reason: contains not printable characters */
    public static java.lang.String m967() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "›"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۣۨۤ, reason: contains not printable characters */
    public static java.lang.String m968() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 extractEmojiUrl failed: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static int m969(java.lang.Object r1) {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 > 0) goto Ld
            android.widget.GridView r1 = (android.widget.GridView) r1
            int r0 = r1.getChildCount()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦۥۦ۟, reason: contains not printable characters */
    public static java.lang.String m970() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "shield_story24_tag"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static java.lang.String m971() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "\n备注："
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m972() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.feed.ecom.EcomTagGroupComponent"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m973() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.homepage.tetris.ability.mainactivity.MABackPressComponent"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static int m974(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 >= 0) goto Lb
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            int r1 = r2.height
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m975() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "comment_"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۡۨۥ, reason: not valid java name and contains not printable characters */
    public static void m976(java.lang.Object r1, int r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto Lc
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.setGravity(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m977() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto L9
            java.lang.String r0 = " 个隐藏会话"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.Consumer m978(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda68 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda68) r2
            kevin.fun.hook.DYHook$Consumer r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m979(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto Le
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = (java.lang.String) r2
            r1.setDescription(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۣۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m980() {
            r0 = -367(0xfffffffffffffe91, float:NaN)
            int r1 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۨۧۦۥ, reason: not valid java name and contains not printable characters */
    public static java.util.Map m981(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda7) r2
            java.util.Map r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
