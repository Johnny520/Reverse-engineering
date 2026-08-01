package dev.rikka.ndk.thirdparty.libcxx;

/* JADX INFO: renamed from: dev.rikka.ndk.thirdparty.libcxx.ۢۧۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1111 {

    /* JADX INFO: renamed from: ۟۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static int f137 = -123;

    /* JADX INFO: renamed from: ۟۟ۡۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3701() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 < 0) goto L9
            java.lang.String r0 = "HomeTabItem"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3702() {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto L9
            java.lang.String r0 = "APK 中未找到 SO 文件: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3703() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto L9
            java.lang.String r0 = "#1A73E8"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3704() {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.right.FeedDiggComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3705() {
            int r0 = androidx.core.C1072.m980()
            if (r0 < 0) goto L9
            java.lang.String r0 = "getUrlList"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤۧۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3706() {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "music_control_enable"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3707() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "📅 插眼时间"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3708() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto L9
            java.lang.String r0 = "awemerawad_error"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3709(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۟ۡۢۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3710(java.lang.Object r1, float r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 >= 0) goto Lc
            android.view.View r1 = (android.view.View) r1
            r1.setScaleY(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۣ۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3711() {
            int r0 = m3719()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "shield_flow"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۨۡۧ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3712(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda199 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda199) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۢۤۦۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3713() {
            int r0 = androidx.activity.C1066.m518()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "【Kevin】 showHiddenConversationDialog 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۨۤۧ, reason: not valid java name and contains not printable characters */
    public static int[] m3714(java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda7) r2
            int[] r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3715() {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.payment.flux.FeedAdsPaymentTagV2ComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3716() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto L9
            java.lang.String r0 = "文字大小"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.ImageView.ScaleType m3717() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto L9
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3718(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r1.matches(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۣ۟ۦۣۤ, reason: not valid java name and contains not printable characters */
    public static int m3719() {
            r0 = 279(0x117, float:3.91E-43)
            int r1 = androidx.loader.C1095.f121
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۟ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m3720(java.lang.Object r1) {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto Lc
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r1.start()
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۤۡۤۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m3721(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda77 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda77) r2
            android.widget.TextView r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۢۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3722() {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "drawChild Hook 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۦۦۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3723(java.lang.Object r1) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 < 0) goto Ld
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            java.lang.String r0 = r1.toString()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۤۧۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3724() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "AWEME_RAW_AD_ERROR_CLASS"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3725(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda5) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۥۢۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3726() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "预览"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3727() {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 > 0) goto L9
            java.lang.String r0 = "renderState"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3728(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1085.m1819()
            if (r0 <= 0) goto Le
            android.view.View r1 = (android.view.View) r1
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۥۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m3729(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 >= 0) goto Le
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟ۥۨۢۡ, reason: not valid java name and contains not printable characters */
    public static int m3730(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda8 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda8) r2
            int r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3731() {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 > 0) goto L9
            java.lang.String r0 = "成功: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3732(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3733(java.lang.Object r1, int r2) {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto Lc
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1.setMax(r2)
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.Runnable m3734(java.lang.Object r2) {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda60 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda60) r2
            java.lang.Runnable r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m3735(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۦۨۥۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3736() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            java.lang.String r0 = "【Kevin】 ❌ 显示对话框失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۧۦۥۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3737() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "赞赏视频"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m3738(java.lang.Object r1) {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto Ld
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            int r0 = r1.width()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3739() {
            int r0 = androidx.versionedparcelable.C1106.m3393()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "无法打开图片选择器"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3740() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 > 0) goto L9
            java.lang.String r0 = "FORCE_CLASSIC_COMMENT"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3741() {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 < 0) goto L9
            java.lang.String r0 = "屏蔽图文"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.StringBuilder m3742(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda4 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda4) r2
            java.lang.StringBuilder r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۠ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3743(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto Le
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            android.graphics.Canvas r2 = (android.graphics.Canvas) r2
            r1.draw(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۠ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3744(java.lang.Object r1, int r2) {
            int r0 = kevin.fun.hook.audio.C1116.m8064()
            if (r0 >= 0) goto Ld
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r1.getTag(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m3745(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda38 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda38) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m3746(java.lang.Object r2) {
            int r0 = androidx.annotation.experimental.C1067.m596()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda64 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda64) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3747(java.lang.Object r1, char r2, char r3) {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r1.replace(r2, r3)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۡۤۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m3748(java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda6 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda6) r2
            android.widget.LinearLayout r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۢۢ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3749() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            java.lang.String r0 = "移除点赞"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۡۦ۠, reason: not valid java name and contains not printable characters */
    public static android.view.ViewPropertyAnimator m3750(java.lang.Object r1, float r2) {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 < 0) goto Ld
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            android.view.ViewPropertyAnimator r0 = r1.scaleY(r2)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۡۤۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3751() {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto L9
            java.lang.String r0 = ")\n"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۥ */
    public static android.content.Context m74(java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda221 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda221) r2
            android.content.Context r1 = r2.f$5
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۦۦۡ, reason: not valid java name and contains not printable characters */
    public static void m3752(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 > 0) goto Le
            android.app.ProgressDialog r1 = (android.app.ProgressDialog) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setTitle(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۡۧۤۥ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.KSHook m3753(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda0 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda0) r2
            kevin.fun.hook.KSHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۢۦۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook.VoiceSendCallback m3754(java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda119 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda119) r2
            kevin.fun.hook.DYHook$VoiceSendCallback r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3755(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto Ld
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r1.put(r2, r3)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۢۦۤ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m3756(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda204 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda204) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3757(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 <= 0) goto Le
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.setImageBitmap(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۢۤۨ۟, reason: not valid java name and contains not printable characters */
    public static android.animation.ValueAnimator m3758(java.lang.Object r1) {
            int r0 = androidx.core.C1072.m980()
            if (r0 < 0) goto Ld
            float[] r1 = (float[]) r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3759() {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "垂直偏移"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3760() {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto L9
            java.lang.String r0 = "）\n\n发布时间："
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۧۥۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3761() {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 < 0) goto L9
            java.lang.String r0 = "s:recalled"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3762() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 > 0) goto L9
            java.lang.String r0 = "yyyyMMdd_HHmmss"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3763() {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "paused"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3764() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "shield_local"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۤۢۨ, reason: not valid java name and contains not printable characters */
    public static java.util.Map m3765(java.lang.Object r2) {
            int r0 = org.luckypray.dexkit.C1123.m10509()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda77 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda77) r2
            java.util.Map r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۤۤۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3766() {
            int r0 = androidx.interpolator.C1082.m1718()
            if (r0 > 0) goto L9
            java.lang.String r0 = "点击设置点赞范围"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۤۦ۟۟, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam m3767(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda19 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda19) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m3768(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.lifecycle.livedata.C1084.m1794()
            if (r0 <= 0) goto Ld
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.put(r2, r3)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۥ۟ۦۡ, reason: contains not printable characters */
    public static void m3769(int r1, int r2) {
            int r0 = androidx.appcompat.C1069.m747()
            if (r0 > 0) goto La
            kevin.fun.hook.gesture.GestureConfig.setLongPressAction(r1, r2)
        L9:
            return
        La:
            goto L9
    }

    /* JADX INFO: renamed from: ۥۣ۟ۥ, reason: contains not printable characters */
    public static java.util.Map m3770(java.lang.Object r2) {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda35 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda35) r2
            java.util.Map r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۦ۠ۦ, reason: contains not printable characters */
    public static java.lang.String m3771() {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.leftbottom.FeedMusicTitleComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۦۡ۟, reason: contains not printable characters */
    public static void m3772(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L12
            kevin.fun.hook.download.DownloadManager r1 = (kevin.fun.hook.download.DownloadManager) r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            r1.downloadCommentLivePhoto(r2, r3, r4, r5)
        L11:
            return
        L12:
            goto L11
    }

    /* JADX INFO: renamed from: ۥۦۣ, reason: contains not printable characters */
    public static android.content.Intent m3773(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 >= 0) goto L11
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            android.content.Intent r0 = r1.setClassName(r2, r3)
        L10:
            return r0
        L11:
            r0 = 0
            goto L10
    }

    /* JADX INFO: renamed from: ۥۨۤۦ, reason: contains not printable characters */
    public static java.lang.String m3774() {
            int r0 = org.luckypray.dexkit.C1124.m10581()
            if (r0 > 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.payment.flux.FeedPaymentTagV2ComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۠ۤۡ, reason: contains not printable characters */
    public static java.lang.String m3775(java.lang.Object r1) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Ld
            java.io.File r1 = (java.io.File) r1
            java.lang.String r0 = r1.getAbsolutePath()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦۡۢ, reason: contains not printable characters */
    public static java.lang.String m3776() {
            int r0 = androidx.emoji2.viewsintegration.C1078.m1376()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.bottom.bar.FeedBottomBarContainerComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۡۦۤ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference m3777(java.lang.Object r2) {
            int r0 = androidx.activity.C1063.m300()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda128 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda128) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۤ۟ۦ, reason: contains not printable characters */
    public static void m3778(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Le
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.setLayoutParams(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۦۥۤۧ, reason: contains not printable characters */
    public static java.lang.String m3779() {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "抖音号 / UID"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۦۦ, reason: contains not printable characters */
    public static java.lang.String m3780() {
            int r0 = androidx.loader.C1098.m2793()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "未找到 __INITIAL_STATE__"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static android.content.Context m3781(java.lang.Object r1) {
            int r0 = kevin.fun.hook.audio.C1115.m98()
            if (r0 >= 0) goto Ld
            android.content.Context r1 = (android.content.Context) r1
            android.content.Context r0 = r1.getApplicationContext()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۦۧۥ۟, reason: contains not printable characters */
    public static boolean[] m3782(java.lang.Object r2) {
            int r0 = androidx.activity.C1065.m427()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda24 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda24) r2
            boolean[] r1 = r2.f$8
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3783() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 > 0) goto L9
            java.lang.String r0 = "IM_GET_DATA_METHOD"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static java.util.List m3784(java.lang.Object r2) {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda1 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda1) r2
            java.util.List r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m3785(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda125 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda125) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static android.graphics.Paint.Align m3786() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 >= 0) goto L9
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۧۦۤ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3787() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "请输入抖音号或用户UID"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m3788(boolean r1) {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto La
            kevin.fun.hook.gesture.GestureConfig.setDisableLongPressMenu(r1)
        L9:
            return
        La:
            goto L9
    }

    /* JADX INFO: renamed from: ۨۡۢۡ, reason: not valid java name and contains not printable characters */
    public static java.util.List m3789(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda166 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda166) r2
            java.util.List r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۡۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m3790() {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 < 0) goto L9
            java.lang.String r0 = "FORCE_CLASSIC"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨۧۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3791() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 <= 0) goto La
            kevin.fun.hook.DexKitFinder.clearDexKitCache()
        L9:
            return
        La:
            goto L9
    }
}
