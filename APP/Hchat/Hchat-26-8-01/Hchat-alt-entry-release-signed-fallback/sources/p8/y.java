package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f10441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Constructor f10442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f10443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f10444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f10445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Field f10446f;

    public y(java.lang.reflect.Method r1, java.lang.reflect.Constructor r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f10441a = r1
            r0.f10442b = r2
            r0.f10443c = r3
            r0.f10444d = r4
            r0.f10445e = r5
            r0.f10446f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p8.y
            if (r0 != 0) goto L8
            goto L4b
        L8:
            p8.y r3 = (p8.y) r3
            java.lang.reflect.Method r0 = r2.f10441a
            java.lang.reflect.Method r1 = r3.f10441a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.reflect.Constructor r0 = r2.f10442b
            java.lang.reflect.Constructor r1 = r3.f10442b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.reflect.Field r0 = r2.f10443c
            java.lang.reflect.Field r1 = r3.f10443c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.reflect.Field r0 = r2.f10444d
            java.lang.reflect.Field r1 = r3.f10444d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.reflect.Field r0 = r2.f10445e
            java.lang.reflect.Field r1 = r3.f10445e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.reflect.Field r0 = r2.f10446f
            java.lang.reflect.Field r3 = r3.f10446f
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L4d
        L4b:
            r3 = 0
            return r3
        L4d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f10441a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Constructor r1 = r2.f10442b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r0 = r2.f10443c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f10444d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r0 = r2.f10445e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f10446f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SnsLivePhotoUploadRuntime(setUploadListMethod="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f10441a
            r0.append(r1)
            java.lang.String r1 = ", elementConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f10442b
            r0.append(r1)
            java.lang.String r1 = ", liveElementField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f10443c
            r0.append(r1)
            java.lang.String r1 = ", thumbPathField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f10444d
            r0.append(r1)
            java.lang.String r1 = ", liveTypeField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f10445e
            r0.append(r1)
            java.lang.String r1 = ", coverTimeField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f10446f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
