package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f1463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f1464c;

    public b(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.f1462a = r1
            r0.f1463b = r2
            r0.f1464c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof ca.b
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ca.b r3 = (ca.b) r3
            java.lang.reflect.Method r0 = r2.f1462a
            java.lang.reflect.Method r1 = r3.f1462a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.reflect.Method r0 = r2.f1463b
            java.lang.reflect.Method r1 = r3.f1463b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.reflect.Method r0 = r2.f1464c
            java.lang.reflect.Method r3 = r3.f1464c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f1462a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f1463b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Method r0 = r2.f1464c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChatLivePhotoMethods(storageGetter="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f1462a
            r0.append(r1)
            java.lang.String r1 = ", recordQuery="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f1463b
            r0.append(r1)
            java.lang.String r1 = ", mediaFactory="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f1464c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
