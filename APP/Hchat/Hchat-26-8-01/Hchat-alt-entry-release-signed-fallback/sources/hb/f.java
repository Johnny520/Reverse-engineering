package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f5362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f5363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f5364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f5365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f5366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Field f5367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Constructor f5368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Field f5369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Field f5370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Field f5371j;

    public f(java.lang.reflect.Constructor r1, java.lang.reflect.Method r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6, java.lang.reflect.Constructor r7, java.lang.reflect.Field r8, java.lang.reflect.Field r9, java.lang.reflect.Field r10) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r0.<init>()
            r0.f5362a = r1
            r0.f5363b = r2
            r0.f5364c = r3
            r0.f5365d = r4
            r0.f5366e = r5
            r0.f5367f = r6
            r0.f5368g = r7
            r0.f5369h = r8
            r0.f5370i = r9
            r0.f5371j = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof hb.f
            if (r0 != 0) goto La
            goto L79
        La:
            hb.f r3 = (hb.f) r3
            java.lang.reflect.Constructor r0 = r2.f5362a
            java.lang.reflect.Constructor r1 = r3.f5362a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L79
        L17:
            java.lang.reflect.Method r0 = r2.f5363b
            java.lang.reflect.Method r1 = r3.f5363b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L79
        L22:
            java.lang.reflect.Field r0 = r2.f5364c
            java.lang.reflect.Field r1 = r3.f5364c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2d
            goto L79
        L2d:
            java.lang.reflect.Field r0 = r2.f5365d
            java.lang.reflect.Field r1 = r3.f5365d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L38
            goto L79
        L38:
            java.lang.reflect.Field r0 = r2.f5366e
            java.lang.reflect.Field r1 = r3.f5366e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L43
            goto L79
        L43:
            java.lang.reflect.Field r0 = r2.f5367f
            java.lang.reflect.Field r1 = r3.f5367f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4e
            goto L79
        L4e:
            java.lang.reflect.Constructor r0 = r2.f5368g
            java.lang.reflect.Constructor r1 = r3.f5368g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L79
        L59:
            java.lang.reflect.Field r0 = r2.f5369h
            java.lang.reflect.Field r1 = r3.f5369h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            java.lang.reflect.Field r0 = r2.f5370i
            java.lang.reflect.Field r1 = r3.f5370i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.lang.reflect.Field r0 = r2.f5371j
            java.lang.reflect.Field r3 = r3.f5371j
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L7b
        L79:
            r3 = 0
            return r3
        L7b:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Constructor r0 = r2.f5362a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r2.f5363b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r0 = r2.f5364c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f5365d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r0 = r2.f5366e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f5367f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Constructor r0 = r2.f5368g
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f5369h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.reflect.Field r0 = r2.f5370i
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f5371j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MassSendEmojiRuntime(payloadConstructor="
            r0.<init>(r1)
            java.lang.reflect.Constructor r1 = r2.f5362a
            r0.append(r1)
            java.lang.String r1 = ", toByteArrayMethod="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f5363b
            r0.append(r1)
            java.lang.String r1 = ", md5Field="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5364c
            r0.append(r1)
            java.lang.String r1 = ", startField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5365d
            r0.append(r1)
            java.lang.String r1 = ", sizeField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5366e
            r0.append(r1)
            java.lang.String r1 = ", bufferField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5367f
            r0.append(r1)
            java.lang.String r1 = ", bufferConstructor="
            r0.append(r1)
            java.lang.reflect.Constructor r1 = r2.f5368g
            r0.append(r1)
            java.lang.String r1 = ", typeField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5369h
            r0.append(r1)
            java.lang.String r1 = ", contentField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5370i
            r0.append(r1)
            java.lang.String r1 = ", reservedField="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f5371j
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
