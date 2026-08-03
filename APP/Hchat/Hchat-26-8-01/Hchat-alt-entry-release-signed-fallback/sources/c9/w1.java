package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f1425b;

    public w1(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f1424a = r1
            r0.f1425b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof c9.w1
            if (r0 != 0) goto L8
            goto L1f
        L8:
            c9.w1 r3 = (c9.w1) r3
            java.lang.reflect.Method r0 = r2.f1424a
            java.lang.reflect.Method r1 = r3.f1424a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.reflect.Method r0 = r2.f1425b
            java.lang.reflect.Method r3 = r3.f1425b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f1424a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f1425b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeGroupMenuMethods(create="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f1424a
            r0.append(r1)
            java.lang.String r1 = ", click="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f1425b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
