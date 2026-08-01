package kevin.fun.hook.audio;

/* JADX INFO: renamed from: kevin.fun.hook.audio.۟ۤۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1116 {

    /* JADX INFO: renamed from: ۢۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int f405 = 82;

    /* JADX INFO: renamed from: ۟۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8020(short[] r3, int r4, int r5, int r6) {
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

    /* JADX INFO: renamed from: ۟۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8021() {
            int r0 = androidx.lifecycle.process.C1089.m2142()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 不是合法9图，无法按9图显示: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8022() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "长视频高光标签"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8023() {
            int r0 = androidx.versionedparcelable.C1107.m3467()
            if (r0 < 0) goto L9
            java.lang.String r0 = "❌ hookShareMenuFilter 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟۠ۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8024(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda196 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda196) r2
            android.content.Context r1 = r2.f$6
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟۠ۥۤۦ, reason: not valid java name and contains not printable characters */
    public static void m8025(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto Le
            android.widget.EditText r1 = (android.widget.EditText) r1
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r1.setLayoutParams(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۟۠ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8026(java.lang.Object r2) {
            int r0 = androidx.startup.C1100.m2972()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda157 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda157) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m8027(java.lang.Object r2) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda18 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda18) r2
            java.lang.ref.WeakReference r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۡۡۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8028() {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "【Kevin】 showCommentImageGrid 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8029() {
            int r0 = androidx.vectordrawable.C1103.m3151()
            if (r0 < 0) goto L9
            java.lang.String r0 = "应用"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۡۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8030(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto L10
            kevin.fun.hook.download.DownloadManager r1 = (kevin.fun.hook.download.DownloadManager) r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            r1.downloadWorkImageSilent(r2, r3)
        Lf:
            return
        L10:
            goto Lf
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8031() {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "module_version_code"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۤۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8032() {
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            if (r0 < 0) goto L9
            java.lang.String r0 = "Navigation_Bar"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8033() {
            int r0 = androidx.appcompat.resources.C1068.m612()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "RipsAdapter_method"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8034() {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 < 0) goto L9
            java.lang.String r0 = "comment_text_color"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8035() {
            int r0 = androidx.lifecycle.process.C1091.m2283()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "remove_comment_like"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8036(java.lang.Object r2) {
            int r0 = androidx.lifecycle.runtime.C1092.m2295()
            if (r0 > 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda33 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda33) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8037() {
            int r0 = kevin.fun.hook.webdav.C1119.m8565()
            if (r0 > 0) goto L9
            java.lang.String r0 = "导航栏透明度"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m8038(java.lang.Object r2) {
            int r0 = androidx.activity.C1063.m300()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda12 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda12) r2
            android.app.Activity r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8039() {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "com.bytedance.ies.dmt.ui.widget.DmtTextView"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8040() {
            int r0 = androidx.core.C1073.m1015()
            if (r0 > 0) goto L9
            java.lang.String r0 = "用"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧ۠, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8041(java.lang.Object r2) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda25 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda25) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۢ, reason: not valid java name and contains not printable characters */
    public static android.net.Uri m8042(java.lang.Object r1) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Ld
            kevin.fun.hook.DownloadPathConfig r1 = (kevin.fun.hook.DownloadPathConfig) r1
            android.net.Uri r0 = r1.getTreeUri()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8043() {
            int r0 = androidx.customview.C1075.m1139()
            if (r0 < 0) goto L9
            java.lang.String r0 = "shield_mall"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۧۨۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8044() {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 > 0) goto L9
            java.lang.String r0 = "【Kevin】 showOpenUserProfileDialog 失败: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۤۨۥۤ, reason: not valid java name and contains not printable characters */
    public static int m8045(java.lang.Object r1) {
            int r0 = r1.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۥۦۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8046(java.lang.Object r1, java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 >= 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r2 = (java.util.Locale) r2
            java.lang.String r0 = r1.toLowerCase(r2)
        Le:
            return r0
        Lf:
            r0 = 0
            goto Le
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m8047(java.lang.Object r1) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Ld
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r0 = r1.get()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۟ۦۢۤۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8048() {
            int r0 = androidx.loader.C1096.m2651()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "右侧控件透明度"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8049(java.lang.Object r2) {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda27) r2
            boolean r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۦۦۡۢ, reason: not valid java name and contains not printable characters */
    public static android.app.Activity m8050(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 > 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda41 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda41) r2
            android.app.Activity r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8051(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1071.m854()
            if (r0 < 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda134 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda134) r2
            java.lang.String r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۟ۧۦۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8052() {
            int r0 = m8064()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "最大时长: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۟ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8053() {
            int r0 = androidx.documentfile.C1076.m1211()
            if (r0 < 0) goto L9
            java.lang.String r0 = "【Kevin】 hookMainActivity failed: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۠ۢۥۨ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m8054(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda47 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda47) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡ۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m8055(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 >= 0) goto Le
            android.content.Context r1 = (android.content.Context) r1
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r2 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r2
            kevin.fun.hook.webdav.WebDAVConfig.testConnection(r1, r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8056() {
            int r0 = androidx.loader.C1094.m2490()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "部分适配失败"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.XhsHook m8057(java.lang.Object r2) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda5) r2
            kevin.fun.hook.XhsHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8058() {
            int r0 = androidx.lifecycle.process.C1087.m1954()
            if (r0 > 0) goto L9
            java.lang.String r0 = "homepage_hot"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8059() {
            int r0 = androidx.vectordrawable.C1105.m3314()
            if (r0 > 0) goto L9
            java.lang.String r0 = "导出成功！\n共导出 "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m8060(java.lang.Object r2) {
            int r0 = androidx.lifecycle.viewmodel.C1093.m2412()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda55 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda55) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۡۨۨۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8061(java.lang.Object r1) {
            int r0 = androidx.core.C1073.m1015()
            if (r0 >= 0) goto Ld
            java.util.Date r1 = (java.util.Date) r1
            java.lang.String r0 = r1.toString()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۢ۠۟۠, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8062(java.lang.Object r2) {
            int r0 = kevin.fun.hook.C1120.m8652()
            if (r0 > 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1) r2
            android.content.Context r1 = r2.f$2
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۢ۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8063() {
            int r0 = androidx.drawerlayout.C1077.m1360()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.emoji.similaremoji.EmojiDetailDialogNew"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int m8064() {
            r0 = -236(0xffffffffffffff14, float:NaN)
            int r1 = androidx.interpolator.C1082.f108
            r0 = r0 ^ r1
            return r0
    }

    /* JADX INFO: renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8065() {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto L9
            java.lang.String r0 = "点赞"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۣۡ۟۠, reason: not valid java name and contains not printable characters */
    public static int m8066(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1088.m2011()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9 r2 = (kevin.fun.hook.DexKitFinder$$ExternalSyntheticLambda9) r2
            int r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۥۦۤ, reason: not valid java name and contains not printable characters */
    public static void m8067(java.lang.Object r1, java.lang.Object r2, int r3) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Le
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2, r3)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۣۦۣۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.ref.WeakReference m8068(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda210 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda210) r2
            java.lang.ref.WeakReference r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۣۧۦۢ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m8069(java.lang.Object r2) {
            int r0 = androidx.emoji2.C1080.m1539()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda16 r2 = (kevin.fun.hook.VoiceAssistantHook$$ExternalSyntheticLambda16) r2
            android.widget.LinearLayout r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m8070(java.lang.Object r1) {
            int r0 = androidx.loader.C1095.m2562()
            if (r0 <= 0) goto Ld
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            int r0 = r1.getAction()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۤۡۧۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8071(java.lang.String r8) {
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

    /* JADX INFO: renamed from: ۤۨۢۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8072() {
            int r0 = androidx.loader.C1099.m2876()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "JSON解析错误: "
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static void m8073(java.lang.Object r1) {
            int r0 = androidx.vectordrawable.C1104.m3230()
            if (r0 > 0) goto Lc
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            r1.close()
        Lb:
            return
        Lc:
            goto Lb
    }

    /* JADX INFO: renamed from: ۥۡۢۥ, reason: contains not printable characters */
    public static android.app.Dialog m8074(java.lang.Object r2) {
            int r0 = androidx.lifecycle.livedata.C1086.m1929()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.XhsHook$$ExternalSyntheticLambda6 r2 = (kevin.fun.hook.XhsHook$$ExternalSyntheticLambda6) r2
            android.app.Dialog r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۢ۟ۤ, reason: contains not printable characters */
    public static android.view.ViewParent m8075(java.lang.Object r1) {
            int r0 = kevin.fun.hook.audio.C1114.m7895()
            if (r0 <= 0) goto Ld
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            android.view.ViewParent r0 = r1.getParent()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۥۢۥ۠, reason: contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m8076(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda65 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda65) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۥۣۧ۟, reason: contains not printable characters */
    public static java.lang.String m8077() {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "自定义颜色"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۥۧۧۥ, reason: contains not printable characters */
    public static java.lang.Class m8078() {
            int r0 = androidx.activity.C1062.m182()
            if (r0 >= 0) goto L9
            java.lang.Class r0 = java.lang.Boolean.TYPE
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦ۟ۨۢ, reason: contains not printable characters */
    public static java.lang.String m8079() {
            int r0 = androidx.activity.C1064.m377()
            if (r0 >= 0) goto L9
            java.lang.String r0 = "com.ss.android.ugc.aweme.flux.register.leftbottom.button.FeedBottomButtonContainerComponentRegister"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۡۢۨ, reason: contains not printable characters */
    public static kevin.fun.hook.DexKitFinder.SafeFinder m8080(java.lang.Object r2) {
            int r0 = kevin.fun.hook.audio.C1117.m8167()
            if (r0 <= 0) goto Lb
            kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda29 r2 = (kevin.fun.hook.DexKitFinder$SafeFinder$$ExternalSyntheticLambda29) r2
            kevin.fun.hook.DexKitFinder$SafeFinder r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۣۢۨ, reason: contains not printable characters */
    public static java.lang.String m8081() {
            int r0 = androidx.activity.C1063.m300()
            if (r0 < 0) goto L9
            java.lang.String r0 = "category"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۦۥۧۡ, reason: contains not printable characters */
    public static android.app.Dialog m8082(java.lang.Object r2) {
            int r0 = androidx.core.ktx.C1070.m822()
            if (r0 > 0) goto Lb
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7 r2 = (kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7) r2
            android.app.Dialog r1 = r2.f$4
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static android.content.Context m8083(java.lang.Object r2) {
            int r0 = androidx.interpolator.C1083.m1725()
            if (r0 > 0) goto Lb
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda10 r2 = (kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda10) r2
            android.content.Context r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۦۨۢۦ, reason: contains not printable characters */
    public static java.util.Set m8084(java.lang.Object r1) {
            int r0 = androidx.startup.C1101.m2984()
            if (r0 < 0) goto Ld
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r0 = java.util.Collections.synchronizedSet(r1)
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۧۢۢ, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam m8085(java.lang.Object r2) {
            int r0 = com.tencent.mmkv.C1109.m3598()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda98 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda98) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r2.f$3
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۧۧۨ۟, reason: not valid java name and contains not printable characters */
    public static int m8086(java.lang.Object r1) {
            int r0 = org.luckypray.dexkit.C1125.m10627()
            if (r0 >= 0) goto Ld
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getWidth()
        Lc:
            return r0
        Ld:
            r0 = 0
            goto Lc
    }

    /* JADX INFO: renamed from: ۣۧۨ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8087() {
            int r0 = androidx.vectordrawable.animated.C1102.m3110()
            if (r0 <= 0) goto L9
            java.lang.String r0 = "imageCount"
        L8:
            return r0
        L9:
            r0 = 0
            goto L8
    }

    /* JADX INFO: renamed from: ۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m8088(java.lang.Object r1, java.lang.Object r2) {
            int r0 = androidx.interpolator.C1081.m1643()
            if (r0 <= 0) goto Le
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.addSuppressed(r2)
        Ld:
            return
        Le:
            goto Ld
    }

    /* JADX INFO: renamed from: ۨ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m8089(java.lang.Object r2) {
            int r0 = androidx.viewpager.C1108.m3542()
            if (r0 >= 0) goto Lb
            kevin.fun.hook.KSHook$$ExternalSyntheticLambda2 r2 = (kevin.fun.hook.KSHook$$ExternalSyntheticLambda2) r2
            android.content.Context r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8090(java.lang.Object r2) {
            int r0 = androidx.lifecycle.process.C1090.m2172()
            if (r0 <= 0) goto Lb
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            int r1 = r2.versionCode
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۢۥۤ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.DYHook m8091(java.lang.Object r2) {
            int r0 = androidx.emoji2.viewsintegration.C1079.m1471()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda104 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda104) r2
            kevin.fun.hook.DYHook r1 = r2.f$0
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }

    /* JADX INFO: renamed from: ۨۥۢۡ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView[] m8092(java.lang.Object r2) {
            int r0 = kevin.fun.hook.webdav.C1118.m8486()
            if (r0 > 0) goto Lb
            kevin.fun.hook.DYHook$$ExternalSyntheticLambda175 r2 = (kevin.fun.hook.DYHook$$ExternalSyntheticLambda175) r2
            android.widget.TextView[] r1 = r2.f$1
        La:
            return r1
        Lb:
            r1 = 0
            goto La
    }
}
