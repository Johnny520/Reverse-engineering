package androidx.appcompat;

/* JADX INFO: renamed from: androidx.appcompat.ۣۧۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1069 {

    /* JADX INFO: renamed from: ۟۠ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int f95 = -237;

    /* JADX INFO: renamed from: ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m702(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m703(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 >= 0) goto Ld
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.remove(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m704(java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda12 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda12) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m705() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto L9
            java.lang.String r0 = "实况图片标签"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m706() {
            int r0 = androidx.core.C1072.m980()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 Hook失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m707() {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "Mozilla/5.0"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static int m708(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda143 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda143) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.AnonymousClass194 m709(java.lang.Object r2) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$194$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$194$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.DYHook$194 r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m710() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto L9
            java.lang.String r0 = " size="
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.Switch m711(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda215 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda215) r2
            android.widget.Switch r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.SeekBar m712(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda145 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda145) r2
            android.widget.SeekBar r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static void m713(java.lang.Object r1, int r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto Lc
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            r1.setSelection(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۡۤۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m714(java.lang.Object r1, int r2) {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto Ld
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.lang.String r0 = r1.getString(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m715(java.lang.Object r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda101 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda101) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m716(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda7) r2
            java.lang.String r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m717() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto L9
            java.lang.String r0 = "imageUrls"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m718() {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 replaceWithWrapper失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m719(java.lang.Object r1) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Ld
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r1.getPackageName()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۤۡۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m720(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda105 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda105) r2
            java.lang.Runnable r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m721() {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 < 0) goto L9
            java.lang.String r0 = "UID"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m722() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 download button failed\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static long m723() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Lb
            long r0 = kevin.fun.hook.webdav.WebDAVConfig.getLocalLastBackupTime()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static void m724(java.lang.Object r1, java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto Le
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۦۤۦۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m725() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "zs"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m726() {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 >= 0) goto Lb
            boolean r0 = kevin.fun.hook.gesture.GestureConfig.isDisableDoubleClickLike()
        La:
            return r0
        Lb:
            r0 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۨۨۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m727(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda25 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda25) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m728() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "最小时长"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧۡۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m729() {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 copyLinkBtn failed\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m730(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda142 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda142) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m731() {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 > 0) goto L9
            java.lang.String r0 = " "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m732() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "直播间显示具体人数"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧۥۡۢ, reason: not valid java name and contains not printable characters */
    public static int m733(java.lang.Object r2) {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 > 0) goto Lb
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda4) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۦۢۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m734() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "bundle_annie_x_bid"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m735() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "header_bg_update_time"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.reflect.Method[] m736(java.lang.Object r1) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto Ld
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r0 = r1.getMethods()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m737(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda13 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda13) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook m738(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda39 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda39) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m739(boolean r1) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto La
            kevin.fun.hook.webdav.WebDAVConfig.setEnabled(r1)
        L9:
            return
        La:
            goto L9
    }

    /* JADX INFO: renamed from: ۠ۦۦۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m740(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda14) r2
            java.lang.String r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m741() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "awemeType"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m742() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "agreement_version"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m743(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m744(java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda2 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda2) r2
            android.widget.LinearLayout r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m745() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 爷爷容器不是 ViewGroup"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m746() {
            int r0 = m747()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "BASE_CONTENT_TRUE_METHOD"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m747() {
            r0 = -791(0xfffffffffffffce9, float:NaN)
            int r1 = androidx.lifecycle.livedata.C1086.f112
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۢۡۤۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.C062373 m748(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$73$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$73$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.DYHook$73 r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m749(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۣۢۢۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m750() {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto L9
            java.lang.String r0 = " 条插眼"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۥۢ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m751(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m752(java.lang.Object r1, int r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto Lc
            android.widget.GridView r1 = (android.widget.GridView) r1
            r1.setNumColumns(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m753() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "avatar_cache_time"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m754(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda82 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda82) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m755() {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 > 0) goto L9
            java.lang.String r0 = "idle_exit_enable"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۦ۠۠, reason: not valid java name and contains not printable characters */
    public static android.view.View m756(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda100 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda100) r2
            android.view.View r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m757(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto Le
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            kevin.fun.hook.PPHook.updateCurrentDouyinUser(r1, r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۤۨ۠۠, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook m758(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda26 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda26) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥ۟ۥۤ, reason: contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m759(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda26 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda26) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۢۦۡ, reason: contains not printable characters */
    public static java.lang.String m760() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "HOMEPAGE_TIME_CLASS"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۢۦۢ, reason: contains not printable characters */
    public static kevin.fun.hook.DYHook m761(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda180 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda180) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static android.content.Context m762(java.lang.Object r2) {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda187 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda187) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۦۤۥ, reason: contains not printable characters */
    public static androidx.documentfile.provider.DocumentFile[] m763(java.lang.Object r1) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto Ld
            androidx.documentfile.provider.DocumentFile r1 = (androidx.documentfile.provider.DocumentFile) r1
            androidx.documentfile.provider.DocumentFile[] r0 = r1.listFiles()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۥۨۢ۟, reason: contains not printable characters */
    public static java.lang.String m764() {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 performCollectOnHolder失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۠ۦۥ, reason: contains not printable characters */
    public static java.lang.String m765() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 hookChatMessageBeautify 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۣۣ۠, reason: contains not printable characters */
    public static java.lang.String m766() {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "评论底部动画"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۤ۟ۡ, reason: contains not printable characters */
    public static android.graphics.Bitmap m767(java.lang.Object r1, int r2, int r3) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto Ld
            byte[] r1 = (byte[]) r1
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧۢۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m768() {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "EMOJI_Hide_METHOD"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m769() {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 > 0) goto L9
            java.lang.String r0 = "语音消息"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static void m770(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Le
            android.content.Context r1 = (android.content.Context) r1
            kevin.fun.hook.PPHook$VerifyCallback r2 = (kevin.fun.hook.PPHook.VerifyCallback) r2
            kevin.fun.hook.PPHook.checkVerification(r1, r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۨۡۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m771() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "广告搜索栏"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m772() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            java.lang.String r0 = "type"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }
}
