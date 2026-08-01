package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛸᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0508 extends xhss.AbstractC0490 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.lang.String f1862;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.List m920() {
            r4 = this;
            xhss.ᛸᛵᲇᲈ r0 = r4.f1798
            if (r0 == 0) goto L11
            java.lang.Class r1 = r0.f2550
            xhss.ᲇᛵᲇᛱ r2 = new xhss.ᲇᛵᲇᛱ
            r3 = 2
            r2.<init>(r3, r4, r0)
            java.util.List r4 = xhss.AbstractC0061.m198(r4, r0, r1, r2)
            return r4
        L11:
            java.lang.String r4 = "You must provide a configuration to resolve the member use build(configuration)."
            xhss.C0532.m959(r4)
            r4 = 0
            return r4
    }

    @Override // xhss.AbstractC0490
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.util.Map mo899() {
            r8 = this;
            java.util.Map r0 = super.mo899()
            xhss.ᲀᛴᛳᛸ r1 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r2 = "isEnumConstant"
            r3 = 0
            r1.<init>(r2, r3)
            xhss.ᲀᛴᛳᛸ r2 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r4 = "isEnumConstantNot"
            r2.<init>(r4, r3)
            java.lang.String r8 = r8.f1862
            r4 = r3
            xhss.ᲀᛴᛳᛸ r3 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r5 = "type"
            r3.<init>(r5, r8)
            r8 = r4
            xhss.ᲀᛴᛳᛸ r4 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r5 = "typeCondition"
            r4.<init>(r5, r8)
            xhss.ᲀᛴᛳᛸ r5 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r6 = "genericType"
            r5.<init>(r6, r8)
            xhss.ᲀᛴᛳᛸ r6 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r7 = "genericTypeCondition"
            r6.<init>(r7, r8)
            xhss.ᲀᛴᛳᛸ[] r8 = new xhss.C0857[]{r1, r2, r3, r4, r5, r6}
            java.util.Map r8 = xhss.AbstractC0955.m1569(r8)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r1.putAll(r8)
            return r1
    }
}
