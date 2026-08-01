package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0476 extends defpackage.AbstractC0758 {
    public C0476() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r2)
        La:
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r3 = r4.m2090()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m2108()
            return r1
        Ld:
            java.lang.String r3 = r4.m2096()
            int r0 = r3.length()
            r2 = 1
            if (r0 != r2) goto L22
            r4 = 0
            char r3 = r3.charAt(r4)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        L22:
            java.lang.String r0 = "; at "
            java.lang.String r4 = r4.m2106(r2)
            java.lang.String r2 = "Expecting character, got: "
            defpackage.C0086.m555(r2, r3, r0, r4)
            return r1
    }
}
