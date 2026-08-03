package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f10408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f10409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f10410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f10411d;

    public r(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r0 = this;
            r0.<init>()
            r0.f10408a = r1
            r0.f10409b = r2
            r0.f10410c = r3
            r0.f10411d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p8.r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p8.r r5 = (p8.r) r5
            java.lang.reflect.Method r1 = r4.f10408a
            java.lang.reflect.Method r3 = r5.f10408a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Method r1 = r4.f10409b
            java.lang.reflect.Method r3 = r5.f10409b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Method r1 = r4.f10410c
            java.lang.reflect.Method r3 = r5.f10410c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.reflect.Method r1 = r4.f10411d
            java.lang.reflect.Method r5 = r5.f10411d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f10408a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10409b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10410c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10411d
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r0 = r2.hashCode()
        L30:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SnsForwardLocalMediaMethods(snsRoot="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f10408a
            r0.append(r1)
            java.lang.String r1 = ", mediaDirectory="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10409b
            r0.append(r1)
            java.lang.String r1 = ", bigImageName="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10410c
            r0.append(r1)
            java.lang.String r1 = ", videoPath="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10411d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
