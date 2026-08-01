package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1243 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f5558;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Method f5559;

    public C1243(java.lang.reflect.Method r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f5558 = r2
            r0.f5559 = r1
            r0 = 1
            r1.setAccessible(r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof defpackage.C1243
            if (r0 != 0) goto L8
            goto L24
        L8:
            ᛷᛳᛸ r3 = (defpackage.C1243) r3
            int r0 = r2.f5558
            int r1 = r3.f5558
            if (r0 != r1) goto L24
            java.lang.reflect.Method r2 = r2.f5559
            java.lang.String r2 = r2.getName()
            java.lang.reflect.Method r3 = r3.f5559
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f5558
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.f5559
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
