package m9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f8794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f8795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f8796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m9.c f8797d;

    public d(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object[] r3, m9.c r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f8794a = r1
            r0.f8795b = r2
            r0.f8796c = r3
            r0.f8797d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof m9.d
            if (r0 != 0) goto L8
            goto L31
        L8:
            m9.d r3 = (m9.d) r3
            java.lang.reflect.Method r0 = r2.f8794a
            java.lang.reflect.Method r1 = r3.f8794a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.Object r0 = r2.f8795b
            java.lang.Object r1 = r3.f8795b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            java.lang.Object[] r0 = r2.f8796c
            java.lang.Object[] r1 = r3.f8796c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            m9.c r0 = r2.f8797d
            m9.c r3 = r3.f8797d
            if (r0 == r3) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f8794a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f8795b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object[] r1 = r2.f8796c
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            m9.c r0 = r2.f8797d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f8796c
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PendingSend(method="
            r1.<init>(r2)
            java.lang.reflect.Method r2 = r3.f8794a
            r1.append(r2)
            java.lang.String r2 = ", receiver="
            r1.append(r2)
            java.lang.Object r2 = r3.f8795b
            r1.append(r2)
            java.lang.String r2 = ", args="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", gameType="
            r1.append(r0)
            m9.c r0 = r3.f8797d
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
