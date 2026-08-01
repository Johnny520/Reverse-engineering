package defpackage;

/* JADX INFO: renamed from: ᛵᛷᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930 extends defpackage.AbstractC0992 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.Object f4197;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.InterfaceC0598 f4198;

    @Override // defpackage.AbstractC0992
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.Map mo1884() {
            r8 = this;
            java.util.Map r0 = super.mo1884()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "isEnumConstant"
            r3 = 0
            r1.<init>(r2, r3)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r4 = "isEnumConstantNot"
            r2.<init>(r4, r3)
            java.lang.Object r4 = r8.f4197
            r5 = r3
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r6 = "type"
            r3.<init>(r6, r4)
            ᛳᲈᲇᛳ r8 = r8.f4198
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r6 = "typeCondition"
            r4.<init>(r6, r8)
            r8 = r5
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r6 = "genericType"
            r5.<init>(r6, r8)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r7 = "genericTypeCondition"
            r6.<init>(r7, r8)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r1, r2, r3, r4, r5, r6}
            java.util.Map r8 = defpackage.AbstractC1893.m3321(r8)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r1.putAll(r8)
            return r1
    }

    @Override // defpackage.AbstractC0992
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List mo1885() {
            r4 = this;
            ᛷᲇᛱᲈ r0 = r4.f4430
            if (r0 == 0) goto L11
            java.lang.Class r1 = r0.f6023
            ᲀᛴᲁᛸ r2 = new ᲀᛴᲁᛸ
            r3 = 1
            r2.<init>(r4, r0, r3)
            java.util.List r4 = defpackage.AbstractC0849.m1793(r4, r0, r1, r2)
            return r4
        L11:
            java.lang.String r4 = "You must provide a configuration to resolve the member use build(configuration)."
            defpackage.C2264.m3684(r4)
            r4 = 0
            return r4
    }
}
