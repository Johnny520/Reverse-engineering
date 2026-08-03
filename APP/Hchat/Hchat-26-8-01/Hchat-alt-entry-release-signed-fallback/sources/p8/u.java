package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f10419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f10420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f10421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f10422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f10423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f10424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f10425g;

    public u(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6, java.lang.reflect.Method r7) {
            r0 = this;
            r0.<init>()
            r0.f10419a = r1
            r0.f10420b = r2
            r0.f10421c = r3
            r0.f10422d = r4
            r0.f10423e = r5
            r0.f10424f = r6
            r0.f10425g = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p8.u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p8.u r5 = (p8.u) r5
            java.lang.reflect.Method r1 = r4.f10419a
            java.lang.reflect.Method r3 = r5.f10419a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Method r1 = r4.f10420b
            java.lang.reflect.Method r3 = r5.f10420b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.reflect.Method r1 = r4.f10421c
            java.lang.reflect.Method r3 = r5.f10421c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.reflect.Method r1 = r4.f10422d
            java.lang.reflect.Method r3 = r5.f10422d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.reflect.Method r1 = r4.f10423e
            java.lang.reflect.Method r3 = r5.f10423e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.reflect.Method r1 = r4.f10424f
            java.lang.reflect.Method r3 = r5.f10424f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.reflect.Method r1 = r4.f10425g
            java.lang.reflect.Method r5 = r5.f10425g
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r3.f10419a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10420b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10421c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10422d
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10423e
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10424f
            if (r2 != 0) goto L47
            r2 = r0
            goto L4b
        L47:
            int r2 = r2.hashCode()
        L4b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.reflect.Method r2 = r3.f10425g
            if (r2 != 0) goto L53
            goto L57
        L53:
            int r0 = r2.hashCode()
        L57:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SnsForwardNativeMediaMethods(imageManager="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.f10419a
            r0.append(r1)
            java.lang.String r1 = ", imageDownload="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10420b
            r0.append(r1)
            java.lang.String r1 = ", videoService="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10421c
            r0.append(r1)
            java.lang.String r1 = ", videoDownload="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10422d
            r0.append(r1)
            java.lang.String r1 = ", videoFullPath="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10423e
            r0.append(r1)
            java.lang.String r1 = ", videoFinishedPath="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10424f
            r0.append(r1)
            java.lang.String r1 = ", videoThumbPath="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f10425g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
