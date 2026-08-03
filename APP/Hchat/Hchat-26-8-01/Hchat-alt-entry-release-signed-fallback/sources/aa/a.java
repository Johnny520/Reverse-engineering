package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.Set f113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f114k;

    public /* synthetic */ a(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18, java.util.Set r19) {
            r12 = this;
            tf.v r10 = tf.v.f13169g
            java.lang.String r11 = ""
            r8 = 0
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, java.lang.String r6, java.util.Set r7, boolean r8, boolean r9, java.util.Set r10, java.lang.String r11) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f104a = r1
            r0.f105b = r2
            r0.f106c = r3
            r0.f107d = r4
            r0.f108e = r5
            r0.f109f = r6
            r0.f110g = r7
            r0.f111h = r8
            r0.f112i = r9
            r0.f113j = r10
            r0.f114k = r11
            return
    }

    public static aa.a a(aa.a r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, java.util.Set r18, boolean r19, boolean r20, java.util.Set r21, java.lang.String r22, int r23) {
            r0 = r23
            r1 = r0 & 1
            if (r1 == 0) goto L8
            java.lang.String r13 = r12.f104a
        L8:
            r1 = r13
            r13 = r0 & 2
            if (r13 == 0) goto L11
            java.lang.String r13 = r12.f105b
            r2 = r13
            goto L12
        L11:
            r2 = r14
        L12:
            r13 = r0 & 4
            if (r13 == 0) goto L1a
            java.lang.String r13 = r12.f106c
            r3 = r13
            goto L1b
        L1a:
            r3 = r15
        L1b:
            java.lang.String r4 = r12.f107d
            r13 = r0 & 16
            if (r13 == 0) goto L25
            boolean r13 = r12.f108e
            r5 = r13
            goto L27
        L25:
            r5 = r16
        L27:
            r13 = r0 & 32
            if (r13 == 0) goto L2f
            java.lang.String r13 = r12.f109f
            r6 = r13
            goto L31
        L2f:
            r6 = r17
        L31:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L39
            boolean r13 = r12.f111h
            r8 = r13
            goto L3b
        L39:
            r8 = r19
        L3b:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L43
            boolean r13 = r12.f112i
            r9 = r13
            goto L45
        L43:
            r9 = r20
        L45:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L4d
            java.util.Set r13 = r12.f113j
            r10 = r13
            goto L4f
        L4d:
            r10 = r21
        L4f:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L57
            java.lang.String r13 = r12.f114k
            r11 = r13
            goto L59
        L57:
            r11 = r22
        L59:
            r12.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r6.getClass()
            r18.getClass()
            r10.getClass()
            r11.getClass()
            aa.a r0 = new aa.a
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof aa.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            aa.a r5 = (aa.a) r5
            java.lang.String r1 = r4.f104a
            java.lang.String r3 = r5.f104a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f105b
            java.lang.String r3 = r5.f105b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f106c
            java.lang.String r3 = r5.f106c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f107d
            java.lang.String r3 = r5.f107d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.f108e
            boolean r3 = r5.f108e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.f109f
            java.lang.String r3 = r5.f109f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.util.Set r1 = r4.f110g
            java.util.Set r3 = r5.f110g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            boolean r1 = r4.f111h
            boolean r3 = r5.f111h
            if (r1 == r3) goto L5c
            return r2
        L5c:
            boolean r1 = r4.f112i
            boolean r3 = r5.f112i
            if (r1 == r3) goto L63
            return r2
        L63:
            java.util.Set r1 = r4.f113j
            java.util.Set r3 = r5.f113j
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L6e
            return r2
        L6e:
            java.lang.String r1 = r4.f114k
            java.lang.String r5 = r5.f114k
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L79
            return r2
        L79:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f104a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f105b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f106c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f107d
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f108e
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f109f
            int r0 = eh.a.g(r0, r1, r2)
            java.util.Set r2 = r3.f110g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f111h
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f112i
            int r0 = eh.a.h(r0, r1, r2)
            java.util.Set r2 = r3.f113j
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f114k
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", targetType="
            java.lang.String r1 = ", targetId="
            java.lang.String r2 = "MessageBlockBinding(id="
            java.lang.String r3 = r5.f104a
            java.lang.String r4 = r5.f105b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", label="
            java.lang.String r2 = ", enabled="
            java.lang.String r3 = r5.f106c
            java.lang.String r4 = r5.f107d
            j8.b.t(r0, r3, r1, r4, r2)
            boolean r1 = r5.f108e
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            java.lang.String r1 = r5.f109f
            r0.append(r1)
            java.lang.String r1 = ", templateIds="
            r0.append(r1)
            java.util.Set r1 = r5.f110g
            r0.append(r1)
            java.lang.String r1 = ", customRules="
            r0.append(r1)
            boolean r1 = r5.f111h
            r0.append(r1)
            java.lang.String r1 = ", typeAll="
            r0.append(r1)
            boolean r1 = r5.f112i
            r0.append(r1)
            java.lang.String r1 = ", types="
            r0.append(r1)
            java.util.Set r1 = r5.f113j
            r0.append(r1)
            java.lang.String r1 = ", textKeywords="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f114k
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
