package defpackage;

/* JADX INFO: renamed from: ᲇᛷᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2095 extends defpackage.AbstractC0343 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C2095 f8962 = null;

    static {
            ᲇᛷᲀᛶ r0 = new ᲇᛷᲀᛶ
            r0.<init>()
            defpackage.C2095.f8962 = r0
            return
    }

    @Override // defpackage.AbstractC0343
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1028() {
            r5 = this;
            r0 = -558900083858990(0xfffe03aeef0961d2, double:NaN)
            java.lang.String r5 = "com.bytedance.retrofit2.CallServerInterceptor"
            r0 = -559097652354606(0xfffe0380ef0961d2, double:NaN)
            java.lang.String r0 = "请求日志"
            r1 = 3
            r2 = 0
            java.lang.Class r1 = defpackage.AbstractC0350.m1058(r5, r2, r1)     // Catch: java.lang.Exception -> L3d
            if (r1 != 0) goto L40
            r1 = -559119127191086(0xfffe037bef0961d2, double:NaN)
            java.lang.String r1 = "class not found: "     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = r1.concat(r5)     // Catch: java.lang.Exception -> L3d
            defpackage.AbstractC0343.m1010(r1)     // Catch: java.lang.Exception -> L3d
            ᛱᛸᛵ r1 = defpackage.C0145.f1093     // Catch: java.lang.Exception -> L3d
            boolean r1 = defpackage.AbstractC1347.m2524(r0)     // Catch: java.lang.Exception -> L3d
            if (r1 != 0) goto L3f
            java.util.LinkedHashSet r1 = defpackage.C0145.f1094     // Catch: java.lang.Exception -> L3d
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L3d
            r2.<init>(r0, r0)     // Catch: java.lang.Exception -> L3d
            r1.add(r2)     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r1 = move-exception
            goto L9e
        L3f:
            return
        L40:
            int r2 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> L3d
            ᛶᲈᛱᲈ r1 = defpackage.AbstractC2279.m3694(r1)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r2 = r1.f5356     // Catch: java.lang.Exception -> L3d
            ᛷᲇᛱᲈ r2 = (defpackage.C1380) r2     // Catch: java.lang.Exception -> L3d
            r3 = 2
            r2.f6021 = r3     // Catch: java.lang.Exception -> L3d
            ᲇᛷᲀᛶ r2 = defpackage.C2095.f8962     // Catch: java.lang.Exception -> L3d
            ᛶᛶᛲᛱ r1 = r1.m2298()     // Catch: java.lang.Exception -> L3d
            ᛳᛸᲈᲁ r3 = defpackage.EnumC0538.f2659     // Catch: java.lang.Exception -> L3d
            ᛳᛸᲈᲁ[] r3 = new defpackage.EnumC0538[]{r3}     // Catch: java.lang.Exception -> L3d
            r1.m2061(r3)     // Catch: java.lang.Exception -> L3d
            r3 = -559196436602414(0xfffe0369ef0961d2, double:NaN)
            java.lang.String r3 = "intercept"     // Catch: java.lang.Exception -> L3d
            r1.f4431 = r3     // Catch: java.lang.Exception -> L3d
            r3 = -559239386275374(0xfffe035fef0961d2, double:NaN)
            java.lang.String r3 = "com.bytedance.retrofit2.intercept.Interceptor$Chain"     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L3d
            r4 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Exception -> L3d
            r1.m2288(r3)     // Catch: java.lang.Exception -> L3d
            r3 = -559462724574766(0xfffe032bef0961d2, double:NaN)
            java.lang.String r3 = "com.bytedance.retrofit2.SsResponse"     // Catch: java.lang.Exception -> L3d
            r1.f4872 = r3     // Catch: java.lang.Exception -> L3d
            java.util.List r1 = r1.mo1885()     // Catch: java.lang.Exception -> L3d
            java.lang.Object r1 = defpackage.AbstractC1107.m2122(r1)     // Catch: java.lang.Exception -> L3d
            ᛱᲁᛲᲁ r1 = (defpackage.C0178) r1     // Catch: java.lang.Exception -> L3d
            ᛷᛶᲇᛳ r3 = new ᛷᛶᲇᛳ     // Catch: java.lang.Exception -> L3d
            r4 = 27
            r3.<init>(r4)     // Catch: java.lang.Exception -> L3d
            r2.m1020(r1, r3)     // Catch: java.lang.Exception -> L3d
            ᛱᛸᛵ r5 = defpackage.C0145.f1093     // Catch: java.lang.Exception -> L3d
            return
        L9e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = -559613048430126(0xfffe0308ef0961d2, double:NaN)
            java.lang.String r3 = "resolve "
            r2.<init>(r3)
            r3 = -559651703135790(0xfffe02ffef0961d2, double:NaN)
            r2.append(r5); r2.append(" error");             java.lang.String r2 = r2.toString()
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r1)
            java.util.LinkedHashSet r1 = defpackage.C0145.f1094
            defpackage.AbstractC0225.m827(r5, r0, r1)
            return
    }
}
