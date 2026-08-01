package defpackage;

/* JADX INFO: renamed from: ᛱᲁᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0186 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0445 f1252 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f1253;

    static {
            ᛱᲁᲁᛲ r0 = new ᛱᲁᲁᛲ
            r1 = 2
            r0.<init>(r1)
            ᛳᛳᲇᛴ r1 = new ᛳᛳᲇᛴ
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.C0186.f1252 = r1
            return
    }

    public C0186(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1253 = r1
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            r1.m1076(r2)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r0 = r4.m2090()
            int r1 = defpackage.AbstractC0225.m812(r0)
            r2 = 5
            if (r1 == r2) goto L28
            r2 = 6
            if (r1 == r2) goto L28
            r3 = 8
            r2 = 0
            if (r1 != r3) goto L17
            r4.m2108()
            return r2
        L17:
            java.lang.String r3 = defpackage.AbstractC0225.m824(r0)
            r0 = 0
            java.lang.String r4 = r4.m2106(r0)
            java.lang.String r0 = "Expecting number, got: "
            java.lang.String r1 = "; at path "
            defpackage.C0086.m555(r0, r3, r1, r4)
            return r2
        L28:
            int r3 = r3.f1253
            java.lang.Number r3 = defpackage.AbstractC1124.m2149(r3, r4)
            return r3
    }
}
