package org.luckypray.dexkit;

/* JADX INFO: renamed from: org.luckypray.dexkit.۟ۧۥ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1124 {

    /* JADX INFO: renamed from: ۢۥۨۦ, reason: not valid java name and contains not printable characters */
    public static int f434 = 659;

    /* JADX INFO: renamed from: ۟۟۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m10530(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda77 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda77) r2
            android.widget.TextView r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۟۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10531() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 section icon加载失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۟ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10532() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 hookShareInnerButtons failed: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10533() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】未找到底栏类"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10534() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto L9
            java.lang.String r0 = "暂无会话数据\n请先打开私聊页面"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m10535(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.SparkRenewHelper.SparkInfo m10536(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.SparkRenewHelper$SparkInfo r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۤۢ۟, reason: not valid java name and contains not printable characters */
    public static org.json.JSONObject m10537(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda26 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda26) r2
            org.json.JSONObject r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m10538(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.customview.C1074.m1071()
            if (r0 > 0) goto Ld
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r1.get(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۡۦۥۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m10539(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto Lb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda12 r2 = (kevin.fun.hook.PPHook$$ExternalSyntheticLambda12) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۢۡۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10540(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۟ۢۤۨۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.ScrollView m10541(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda196 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda196) r2
            android.widget.ScrollView r1 = r2.f$8
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۥۢۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.C064089 m10542(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$89$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.DYHook$89$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.DYHook$89 r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۥۣ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10543(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r2 = (java.util.Locale) r2
            java.lang.String r0 = r1.toUpperCase(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m10544(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 <= 0) goto L10
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.addView(r2, r3)
        Lf:
            return
        L10:
            goto Lf
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10545(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۣ۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.TimeUnit m10546() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 >= 0) goto L9
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10547() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "masterUrl"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10548() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "xhs_img_"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m10549(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 >= 0) goto Ld
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.remove(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10550() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "共有 "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۧۦۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10551() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto L9
            java.lang.String r0 = "清爽模式(半成品)"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۨۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean[] m10552(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda15) r2
            boolean[] r1 = r2.f$9
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۡۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m10553(java.lang.Object r2) {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda99 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda99) r2
            android.content.Context r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۡۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10554() {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "ShareUserViewHook 视频下载失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۤۦۢ, reason: not valid java name and contains not printable characters */
    public static void m10555(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 >= 0) goto Le
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            android.content.ClipData r2 = (android.content.ClipData) r2
            r1.setPrimaryClip(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m10556(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda207 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda207) r2
            android.widget.TextView r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۧۨ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10557() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto L9
            java.lang.String r0 = "未找到有效的语音链接"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.XhsHook m10558(java.lang.Object r2) {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27) r2
            kevin.fun.hook.XhsHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static int[] m10559(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda102 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda102) r2
            int[] r1 = r2.f$6
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۥۧۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m10560(java.lang.Object r2) {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda0) r2
            android.content.Context r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m10561(java.lang.Object r2) {
            int r0 = m10581()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda40 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda40) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠ۦۦ۟, reason: not valid java name and contains not printable characters */
    public static android.content.Intent m10562(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto Lf
            android.content.Intent r1 = (android.content.Intent) r1
            android.net.Uri r2 = (android.net.Uri) r2
            android.content.Intent r0 = r1.setData(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۡ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m10563(java.lang.Object r1) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Ld
            android.widget.Button r1 = (android.widget.Button) r1
            android.content.Context r0 = r1.getContext()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۢۧۧ, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam m10564(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda123 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda123) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۢۤۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10565() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto L9
            java.lang.String r0 = "error"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۤۢۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m10566(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda22 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda22) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۥۣۦ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m10567(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda44 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda44) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۥۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10568() {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "全屏观看"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10569(java.lang.Object r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 > 0) goto Lb
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3 r2 = (kevin.fun.hook.download.DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda3) r2
            java.lang.String r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10570(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 > 0) goto Lb
            kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.download.DownloadManager$$ExternalSyntheticLambda9) r2
            java.lang.String r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static void m10571(java.lang.Object r1, int r2) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto Lc
            android.view.Window r1 = (android.view.Window) r1
            r1.setGravity(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣۤۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10572() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto L9
            java.lang.String r0 = "默认"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۥۦۣ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener m10573(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto Lb
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda8) r2
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10574() {
            int r0 = androidx.activity.C1066.m518()
            if (r0 < 0) goto L9
            java.lang.String r0 = "选择图片"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۢۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10575() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "移除底部栏"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۤۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10576() {
            int r0 = m10581()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "FEED_BELLOW_DESC_TIME_VISIBILITY"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۧۢۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m10577(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda6 r2 = (kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda6) r2
            android.widget.TextView r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۤۡ, reason: contains not printable characters */
    public static java.lang.String m10578() {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto L9
            java.lang.String r0 = "1.0x"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۧ۟۠, reason: contains not printable characters */
    public static java.lang.ref.WeakReference m10579(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 < 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda16 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda16) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۢۧ, reason: contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m10580(java.lang.Object r2) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda21 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda21) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۣۡۡ, reason: contains not printable characters */
    public static int m10581() {
            r0 = 365(0x16d, float:5.11E-43)
            int r1 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۦۧ۟۟, reason: contains not printable characters */
    public static int m10582(java.lang.Object r1, java.lang.Object r2) {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            if (r0 > 0) goto Lf
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r2 = (android.view.View) r2
            int r0 = r1.indexOfChild(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static float m10583(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto Lf
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            java.lang.String r2 = (java.lang.String) r2
            float r0 = r1.measureText(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۦۨۥۡ, reason: contains not printable characters */
    public static android.app.Dialog m10584(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Lb
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda1 r2 = (kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda1) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m10585(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda31 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda31) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10586() {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "XhsDownload"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۧۦۧ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m10587(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda41 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda41) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۨۦ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10588() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "评论时间颜色"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۥۣۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10589(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda10) r2
            java.lang.String r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۧۦۡ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m10590(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda19 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda19) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۨۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m10591() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 showAllConversationDialog 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }
}
