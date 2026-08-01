package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲁᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0813 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C1107 f2635 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2636;

    static {
            xhss.ᛸᲁᲈᛳ r0 = new xhss.ᛸᲁᲈᛳ
            r1 = 2
            r0.<init>(r1)
            xhss.ᲇᲈᛷᲁ r1 = new xhss.ᲇᲈᛷᲁ
            r2 = 0
            r1.<init>(r0, r2)
            xhss.C0813.f2635 = r1
            return
    }

    public C0813(int r1) {
            r0 = this;
            r0.<init>()
            r0.f2636 = r1
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r0 = r4.m762()
            int r1 = xhss.AbstractC0390.m784(r0)
            r2 = 5
            if (r1 == r2) goto L28
            r2 = 6
            if (r1 == r2) goto L28
            r3 = 8
            r2 = 0
            if (r1 != r3) goto L17
            r4.m756()
            return r2
        L17:
            java.lang.String r3 = xhss.AbstractC0390.m768(r0)
            r0 = 0
            java.lang.String r4 = r4.m764(r0)
            java.lang.String r0 = "Expecting number, got: "
            java.lang.String r1 = "; at path "
            xhss.C0532.m957(r0, r3, r1, r4)
            return r2
        L28:
            int r3 = r3.f2636
            java.lang.Number r3 = xhss.AbstractC0390.m776(r3, r4)
            return r3
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            r1.m1394(r2)
            return
    }
}
