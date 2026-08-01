package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1085 extends defpackage.AbstractC1178 {

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public java.lang.Object f4872;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public defpackage.C0640 f4873;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m2061(defpackage.EnumC0538... r2) {
            r1 = this;
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            ᛳᛸᲈᲁ[] r2 = (defpackage.EnumC0538[]) r2
            java.util.LinkedHashSet r1 = r1.f4428
            defpackage.AbstractC1376.m2543(r1, r2)
            return
    }

    @Override // defpackage.AbstractC1178, defpackage.AbstractC0992
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final java.util.Map mo1884() {
            r8 = this;
            java.util.Map r0 = super.mo1884()
            java.lang.Object r1 = r8.f4872
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "returnType"
            r2.<init>(r3, r1)
            ᛴᛳᛷᛸ r8 = r8.f4873
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r1 = "returnTypeCondition"
            r3.<init>(r1, r8)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r8 = "isBridge"
            r1 = 0
            r4.<init>(r8, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r8 = "isBridgeNot"
            r5.<init>(r8, r1)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r8 = "isDefault"
            r6.<init>(r8, r1)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "isDefaultNot"
            r7.<init>(r8, r1)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r2, r3, r4, r5, r6, r7}
            java.util.Map r8 = defpackage.AbstractC1893.m3321(r8)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r1.putAll(r8)
            return r1
    }

    @Override // defpackage.AbstractC0992
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.List mo1885() {
            r4 = this;
            ᛷᲇᛱᲈ r0 = r4.f4430
            if (r0 == 0) goto L11
            java.lang.Class r1 = r0.f6023
            ᲀᛴᲁᛸ r2 = new ᲀᛴᲁᛸ
            r3 = 0
            r2.<init>(r4, r0, r3)
            java.util.List r4 = defpackage.AbstractC0849.m1793(r4, r0, r1, r2)
            return r4
        L11:
            java.lang.String r4 = "You must provide a configuration to resolve the member use build(configuration)."
            defpackage.C2264.m3684(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2062() {
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.f5337 = r0
            return
    }
}
