package s8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f12378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.o f12379b;

    public a(java.lang.reflect.Method r1, hh.o r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12378a = r1
            r0.f12379b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof s8.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s8.a r5 = (s8.a) r5
            java.lang.reflect.Method r1 = r4.f12378a
            java.lang.reflect.Method r3 = r5.f12378a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            hh.o r1 = r4.f12379b
            hh.o r5 = r5.f12379b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f12378a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            hh.o r1 = r2.f12379b
            if (r1 != 0) goto Le
            r1 = 0
            goto L14
        Le:
            java.lang.String r1 = r1.f5568j
            int r1 = r1.hashCode()
        L14:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RevokeEntry(method="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f12378a
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            hh.o r1 = r2.f12379b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
