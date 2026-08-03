package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f17143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f17144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f17145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f17147h;

    public jv(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.List r6, boolean r7, java.util.List r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.f17140a = r1
            r0.f17141b = r2
            r0.f17142c = r3
            r0.f17143d = r4
            r0.f17144e = r5
            r0.f17145f = r6
            r0.f17146g = r7
            r0.f17147h = r8
            return
    }

    public /* synthetic */ jv(java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7, java.util.List r8, boolean r9, java.util.List r10, int r11) {
            r2 = this;
            r0 = r11 & 8
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r6 = r1
        L7:
            r0 = r11 & 16
            if (r0 == 0) goto Lc
            r7 = r1
        Lc:
            r0 = r11 & 32
            if (r0 == 0) goto L12
            tf.t r8 = tf.t.f13167g
        L12:
            r11 = r11 & 64
            if (r11 == 0) goto L17
            r9 = 0
        L17:
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.jv
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.jv r5 = (wb.jv) r5
            java.lang.String r1 = r4.f17140a
            java.lang.String r3 = r5.f17140a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f17141b
            java.lang.String r3 = r5.f17141b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f17142c
            boolean r3 = r5.f17142c
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.f17143d
            java.lang.String r3 = r5.f17143d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f17144e
            java.lang.String r3 = r5.f17144e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r1 = r4.f17145f
            java.util.List r3 = r5.f17145f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            boolean r1 = r4.f17146g
            boolean r3 = r5.f17146g
            if (r1 == r3) goto L51
            return r2
        L51:
            java.util.List r1 = r4.f17147h
            java.util.List r5 = r5.f17147h
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L5c
            return r2
        L5c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f17140a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f17141b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f17142c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f17143d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f17144e
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f17145f
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r3.f17146g
            int r0 = eh.a.h(r0, r1, r2)
            java.util.List r1 = r3.f17147h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", group="
            java.lang.String r2 = "ContactItem(id="
            java.lang.String r3 = r5.f17140a
            java.lang.String r4 = r5.f17141b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f17142c
            r0.append(r1)
            java.lang.String r1 = ", avatarUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f17143d
            r0.append(r1)
            java.lang.String r1 = ", avatarBackupUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f17144e
            r0.append(r1)
            java.lang.String r1 = ", labels="
            r0.append(r1)
            java.util.List r1 = r5.f17145f
            r0.append(r1)
            java.lang.String r1 = ", official="
            r0.append(r1)
            boolean r1 = r5.f17146g
            r0.append(r1)
            java.lang.String r1 = ", searchAliases="
            r0.append(r1)
            java.util.List r1 = r5.f17147h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
