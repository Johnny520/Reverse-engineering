package defpackage;

/* JADX INFO: renamed from: ᛴᛷᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0707 extends defpackage.AbstractC0758 {
    public C0707() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L8
            r1.m1067()
            goto L1e
        L8:
            r1.m1071()
            r1.m1078()
            java.io.Writer r0 = r1.f1843
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L19
            java.lang.String r1 = "true"
            goto L1b
        L19:
            java.lang.String r1 = "false"
        L1b:
            r0.write(r1)
        L1e:
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r2) {
            r1 = this;
            int r1 = r2.m2090()
            r0 = 9
            if (r1 != r0) goto Ld
            r2.m2108()
            r1 = 0
            return r1
        Ld:
            r0 = 6
            if (r1 != r0) goto L1d
            java.lang.String r1 = r2.m2096()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1d:
            boolean r1 = r2.m2100()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
