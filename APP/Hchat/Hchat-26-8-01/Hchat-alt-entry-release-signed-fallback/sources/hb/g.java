package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f5377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Constructor f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f5379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f5380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f5381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f5382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f5383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f5384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb.f f5385i;

    public g(java.lang.reflect.Constructor r1, java.lang.reflect.Constructor r2, java.lang.reflect.Method r3, java.lang.Object r4, java.lang.reflect.Method r5, java.lang.String r6, java.lang.reflect.Method r7, java.lang.reflect.Method r8, hb.f r9) {
            r0 = this;
            r0.<init>()
            r0.f5377a = r1
            r0.f5378b = r2
            r0.f5379c = r3
            r0.f5380d = r4
            r0.f5381e = r5
            r0.f5382f = r6
            r0.f5383g = r7
            r0.f5384h = r8
            r0.f5385i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L70
        L4:
            boolean r0 = r3 instanceof hb.g
            if (r0 != 0) goto La
            goto L6e
        La:
            hb.g r3 = (hb.g) r3
            java.lang.reflect.Constructor r0 = r2.f5377a
            java.lang.reflect.Constructor r1 = r3.f5377a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L6e
        L17:
            java.lang.reflect.Constructor r0 = r2.f5378b
            java.lang.reflect.Constructor r1 = r3.f5378b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L6e
        L22:
            java.lang.reflect.Method r0 = r2.f5379c
            java.lang.reflect.Method r1 = r3.f5379c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L6e
        L2d:
            java.lang.Object r0 = r2.f5380d
            java.lang.Object r1 = r3.f5380d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L38
            goto L6e
        L38:
            java.lang.reflect.Method r0 = r2.f5381e
            java.lang.reflect.Method r1 = r3.f5381e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L43
            goto L6e
        L43:
            java.lang.String r0 = r2.f5382f
            java.lang.String r1 = r3.f5382f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L6e
        L4e:
            java.lang.reflect.Method r0 = r2.f5383g
            java.lang.reflect.Method r1 = r3.f5383g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L59
            goto L6e
        L59:
            java.lang.reflect.Method r0 = r2.f5384h
            java.lang.reflect.Method r1 = r3.f5384h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L64
            goto L6e
        L64:
            hb.f r0 = r2.f5385i
            hb.f r3 = r3.f5385i
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L70
        L6e:
            r3 = 0
            return r3
        L70:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r4 = this;
            java.lang.reflect.Constructor r0 = r4.f5377a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.reflect.Constructor r2 = r4.f5378b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.reflect.Method r0 = r4.f5379c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            java.lang.Object r3 = r4.f5380d
            if (r3 != 0) goto L20
            r3 = r2
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.reflect.Method r3 = r4.f5381e
            if (r3 != 0) goto L2c
            r3 = r2
            goto L30
        L2c:
            int r3 = r3.hashCode()
        L30:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f5382f
            int r0 = eh.a.g(r0, r1, r3)
            java.lang.reflect.Method r3 = r4.f5383g
            if (r3 != 0) goto L3e
            r3 = r2
            goto L42
        L3e:
            int r3 = r3.hashCode()
        L42:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.reflect.Method r3 = r4.f5384h
            if (r3 != 0) goto L4a
            r3 = r2
            goto L4e
        L4a:
            int r3 = r3.hashCode()
        L4e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            hb.f r1 = r4.f5385i
            if (r1 != 0) goto L55
            goto L59
        L55:
            int r2 = r1.hashCode()
        L59:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MassSendRuntime(sceneConstructor="
            r0.<init>(r1)
            java.lang.reflect.Constructor r1 = r2.f5377a
            r0.append(r1)
            java.lang.String r1 = ", infoConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f5378b
            r0.append(r1)
            java.lang.String r1 = ", sceneEndMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5379c
            r0.append(r1)
            java.lang.String r1 = ", storage="
            r0.append(r1)
            java.lang.Object r1 = r2.f5380d
            r0.append(r1)
            java.lang.String r1 = ", imageBuilder="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5381e
            r0.append(r1)
            java.lang.String r1 = ", contactField="
            r0.append(r1)
            java.lang.String r1 = r2.f5382f
            r0.append(r1)
            java.lang.String r1 = ", limitServiceGetter="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5383g
            r0.append(r1)
            java.lang.String r1 = ", limitMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5384h
            r0.append(r1)
            java.lang.String r1 = ", emojiRuntime="
            r0.append(r1)
            hb.f r1 = r2.f5385i
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
