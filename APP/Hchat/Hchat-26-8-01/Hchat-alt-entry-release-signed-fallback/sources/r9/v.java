package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f11802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f11803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f11804c;

    public v(java.lang.reflect.Method r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3) {
            r0 = this;
            r0.<init>()
            r0.f11802a = r1
            r0.f11803b = r2
            r0.f11804c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof r9.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r9.v r5 = (r9.v) r5
            java.lang.reflect.Method r1 = r4.f11802a
            java.lang.reflect.Method r3 = r5.f11802a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Field r1 = r4.f11803b
            java.lang.reflect.Field r3 = r5.f11803b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Field r1 = r4.f11804c
            java.lang.reflect.Field r5 = r5.f11804c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f11802a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f11803b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Field r2 = r3.f11804c
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r0 = r2.hashCode()
        L23:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageAccessor(getter="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f11802a
            r0.append(r1)
            java.lang.String r1 = ", primaryField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f11803b
            r0.append(r1)
            java.lang.String r1 = ", fallbackField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f11804c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
