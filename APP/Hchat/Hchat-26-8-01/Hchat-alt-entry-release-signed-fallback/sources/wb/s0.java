package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f18970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f18973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f18974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f18975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f18977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f18978i;

    public s0(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.List r6, boolean r7, java.lang.String r8, java.util.List r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r9.getClass()
            r0.<init>()
            r0.f18970a = r1
            r0.f18971b = r2
            r0.f18972c = r3
            r0.f18973d = r4
            r0.f18974e = r5
            r0.f18975f = r6
            r0.f18976g = r7
            r0.f18977h = r8
            r0.f18978i = r9
            return
    }

    public /* synthetic */ s0(java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, java.lang.String r18, java.util.List r19, boolean r20, java.util.List r21, int r22) {
            r13 = this;
            r0 = r22
            r1 = r0 & 32
            tf.t r2 = tf.t.f13167g
            if (r1 == 0) goto La
            r9 = r2
            goto Lc
        La:
            r9 = r19
        Lc:
            r1 = r0 & 64
            if (r1 == 0) goto L13
            r1 = 0
            r10 = r1
            goto L15
        L13:
            r10 = r20
        L15:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L1b
            r12 = r2
            goto L1d
        L1b:
            r12 = r21
        L1d:
            java.lang.String r11 = ""
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.s0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.s0 r5 = (wb.s0) r5
            java.lang.String r1 = r4.f18970a
            java.lang.String r3 = r5.f18970a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f18971b
            java.lang.String r3 = r5.f18971b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f18972c
            boolean r3 = r5.f18972c
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.f18973d
            java.lang.String r3 = r5.f18973d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f18974e
            java.lang.String r3 = r5.f18974e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r1 = r4.f18975f
            java.util.List r3 = r5.f18975f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            boolean r1 = r4.f18976g
            boolean r3 = r5.f18976g
            if (r1 == r3) goto L51
            return r2
        L51:
            java.lang.String r1 = r4.f18977h
            java.lang.String r3 = r5.f18977h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.util.List r1 = r4.f18978i
            java.util.List r5 = r5.f18978i
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L67
            return r2
        L67:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f18970a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f18971b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f18972c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f18973d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f18974e
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f18975f
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r3.f18976g
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f18977h
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r1 = r3.f18978i
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ", group="
            java.lang.String r2 = "ContactOption(id="
            java.lang.String r3 = r5.f18970a
            java.lang.String r4 = r5.f18971b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f18972c
            r0.append(r1)
            java.lang.String r1 = ", avatarUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f18973d
            r0.append(r1)
            java.lang.String r1 = ", avatarBackupUrl="
            r0.append(r1)
            java.lang.String r1 = r5.f18974e
            r0.append(r1)
            java.lang.String r1 = ", labels="
            r0.append(r1)
            java.util.List r1 = r5.f18975f
            r0.append(r1)
            java.lang.String r1 = ", official="
            r0.append(r1)
            boolean r1 = r5.f18976g
            r0.append(r1)
            java.lang.String r1 = ", extraSummary="
            r0.append(r1)
            java.lang.String r1 = r5.f18977h
            r0.append(r1)
            java.lang.String r1 = ", searchAliases="
            r0.append(r1)
            java.util.List r1 = r5.f18978i
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
