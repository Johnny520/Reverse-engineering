package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f3436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f3437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f3439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.List f3440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f3441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fb.a1 f3442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f3444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fb.y f3445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f3447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f3448r;

    public c(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.List r10, java.util.List r11, fb.a1 r12, long r13, java.lang.String r15, fb.y r16, boolean r17, java.lang.String r18, long r19) {
            r0 = this;
            j8.b.q(r3, r4, r5, r6, r7)
            r10.getClass()
            r11.getClass()
            r15.getClass()
            r18.getClass()
            r0.<init>()
            r0.f3431a = r1
            r0.f3432b = r2
            r0.f3433c = r3
            r0.f3434d = r4
            r0.f3435e = r5
            r0.f3436f = r6
            r0.f3437g = r7
            r0.f3438h = r8
            r0.f3439i = r9
            r0.f3440j = r10
            r0.f3441k = r11
            r0.f3442l = r12
            r0.f3443m = r13
            r0.f3444n = r15
            r1 = r16
            r0.f3445o = r1
            r1 = r17
            r0.f3446p = r1
            r1 = r18
            r0.f3447q = r1
            r1 = r19
            r0.f3448r = r1
            return
    }

    public /* synthetic */ c(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.util.List r32, fb.a1 r33, long r34, java.lang.String r36, fb.y r37, boolean r38, java.lang.String r39, long r40, int r42) {
            r23 = this;
            r0 = r42
            r1 = r0 & 4
            if (r1 == 0) goto L13
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r5 = r1
            goto L15
        L13:
            r5 = r26
        L15:
            r1 = r0 & 8
            java.lang.String r10 = ""
            if (r1 == 0) goto L1d
            r6 = r10
            goto L1f
        L1d:
            r6 = r27
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r7 = r10
            goto L27
        L25:
            r7 = r28
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2e
            r8 = r24
            goto L30
        L2e:
            r8 = r29
        L30:
            r1 = r0 & 64
            if (r1 == 0) goto L36
            r9 = r10
            goto L38
        L36:
            r9 = r30
        L38:
            r1 = r0 & 512(0x200, float:7.17E-43)
            tf.t r2 = tf.t.f13167g
            if (r1 == 0) goto L40
            r12 = r2
            goto L42
        L40:
            r12 = r31
        L42:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L48
            r13 = r2
            goto L4a
        L48:
            r13 = r32
        L4a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L51
            r14 = r2
            goto L53
        L51:
            r14 = r33
        L53:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L5d
            long r3 = java.lang.System.currentTimeMillis()
            r15 = r3
            goto L5f
        L5d:
            r15 = r34
        L5f:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L68
            java.lang.String r1 = "complete"
            r17 = r1
            goto L6a
        L68:
            r17 = r36
        L6a:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L71
            r18 = r2
            goto L73
        L71:
            r18 = r37
        L73:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L7d
            r1 = 0
            r19 = r1
            goto L7f
        L7d:
            r19 = r38
        L7f:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L87
            r20 = r10
            goto L89
        L87:
            r20 = r39
        L89:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L93
            r0 = 0
            r21 = r0
            goto L95
        L93:
            r21 = r40
        L95:
            r11 = r10
            r2 = r23
            r3 = r24
            r4 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            return
    }

    public static fb.c a(fb.c r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List r30, java.lang.String r31, fb.y r32, boolean r33, java.lang.String r34, long r35, int r37) {
            r0 = r21
            r1 = r37
            java.lang.String r2 = r0.f3431a
            r3 = r1 & 2
            if (r3 == 0) goto Ld
            java.lang.String r3 = r0.f3432b
            goto Lf
        Ld:
            r3 = r22
        Lf:
            r4 = r1 & 4
            if (r4 == 0) goto L16
            java.lang.String r4 = r0.f3433c
            goto L18
        L16:
            r4 = r23
        L18:
            r5 = r1 & 8
            if (r5 == 0) goto L1f
            java.lang.String r5 = r0.f3434d
            goto L21
        L1f:
            r5 = r24
        L21:
            r6 = r1 & 16
            if (r6 == 0) goto L28
            java.lang.String r6 = r0.f3435e
            goto L2a
        L28:
            r6 = r25
        L2a:
            r7 = r1 & 32
            if (r7 == 0) goto L31
            java.lang.String r7 = r0.f3436f
            goto L33
        L31:
            r7 = r26
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            java.lang.String r8 = r0.f3437g
            goto L3c
        L3a:
            r8 = r27
        L3c:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L43
            java.lang.String r9 = r0.f3438h
            goto L45
        L43:
            r9 = r28
        L45:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L4c
            java.lang.String r10 = r0.f3439i
            goto L4e
        L4c:
            r10 = r29
        L4e:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L55
            java.util.List r11 = r0.f3440j
            goto L57
        L55:
            r11 = r30
        L57:
            java.util.List r12 = r0.f3441k
            r13 = r11
            r11 = r12
            fb.a1 r12 = r0.f3442l
            r15 = r13
            long r13 = r0.f3443m
            r16 = r2
            r2 = r1 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L69
            java.lang.String r2 = r0.f3444n
            goto L6b
        L69:
            r2 = r31
        L6b:
            r22 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L74
            fb.y r2 = r0.f3445o
            goto L76
        L74:
            r2 = r32
        L76:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r1 & r17
            if (r17 == 0) goto L82
            boolean r1 = r0.f3446p
            r17 = r1
            goto L84
        L82:
            r17 = r33
        L84:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r37 & r1
            if (r1 == 0) goto L8f
            java.lang.String r1 = r0.f3447q
            r18 = r1
            goto L91
        L8f:
            r18 = r34
        L91:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r37 & r1
            r23 = r2
            if (r1 == 0) goto L9e
            long r1 = r0.f3448r
            r19 = r1
            goto La0
        L9e:
            r19 = r35
        La0:
            r0.getClass()
            r16.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            j8.b.q(r6, r7, r8, r9, r10)
            r15.getClass()
            r11.getClass()
            r22.getClass()
            r18.getClass()
            fb.c r0 = new fb.c
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r15
            r1 = r16
            r15 = r22
            r16 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3432b
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3431a
            return r0
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f3434d
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof fb.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.c r8 = (fb.c) r8
            java.lang.String r1 = r7.f3431a
            java.lang.String r3 = r8.f3431a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f3432b
            java.lang.String r3 = r8.f3432b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f3433c
            java.lang.String r3 = r8.f3433c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f3434d
            java.lang.String r3 = r8.f3434d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.f3435e
            java.lang.String r3 = r8.f3435e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.f3436f
            java.lang.String r3 = r8.f3436f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r7.f3437g
            java.lang.String r3 = r8.f3437g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r7.f3438h
            java.lang.String r3 = r8.f3438h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r7.f3439i
            java.lang.String r3 = r8.f3439i
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.util.List r1 = r7.f3440j
            java.util.List r3 = r8.f3440j
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            java.util.List r1 = r7.f3441k
            java.util.List r3 = r8.f3441k
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L85
            return r2
        L85:
            fb.a1 r1 = r7.f3442l
            fb.a1 r3 = r8.f3442l
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L90
            return r2
        L90:
            long r3 = r7.f3443m
            long r5 = r8.f3443m
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L99
            return r2
        L99:
            java.lang.String r1 = r7.f3444n
            java.lang.String r3 = r8.f3444n
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto La4
            return r2
        La4:
            fb.y r1 = r7.f3445o
            fb.y r3 = r8.f3445o
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto Laf
            return r2
        Laf:
            boolean r1 = r7.f3446p
            boolean r3 = r8.f3446p
            if (r1 == r3) goto Lb6
            return r2
        Lb6:
            java.lang.String r1 = r7.f3447q
            java.lang.String r3 = r8.f3447q
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto Lc1
            return r2
        Lc1:
            long r3 = r7.f3448r
            long r5 = r8.f3448r
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto Lca
            return r2
        Lca:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f3431a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.f3432b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3433c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3434d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3435e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3436f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3437g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3438h
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r5.f3439i
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r5.f3440j
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r5.f3441k
            int r0 = j8.b.e(r2, r0, r1)
            r2 = 0
            fb.a1 r3 = r5.f3442l
            if (r3 != 0) goto L4c
            r3 = r2
            goto L50
        L4c:
            int r3 = r3.hashCode()
        L50:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r3 = r5.f3443m
            int r0 = eh.a.f(r0, r1, r3)
            java.lang.String r3 = r5.f3444n
            int r0 = eh.a.g(r0, r1, r3)
            fb.y r3 = r5.f3445o
            if (r3 != 0) goto L63
            goto L67
        L63:
            int r2 = r3.hashCode()
        L67:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r5.f3446p
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r5.f3447q
            int r0 = eh.a.g(r0, r1, r2)
            long r1 = r5.f3448r
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", id="
            java.lang.String r2 = "ScriptPluginAgentChatMessage(role="
            java.lang.String r3 = r5.f3431a
            java.lang.String r4 = r5.f3432b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", turnId="
            java.lang.String r2 = ", parentMessageId="
            java.lang.String r3 = r5.f3433c
            java.lang.String r4 = r5.f3434d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", phase="
            java.lang.String r2 = ", progress="
            java.lang.String r3 = r5.f3435e
            java.lang.String r4 = r5.f3436f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", reasoning="
            java.lang.String r2 = ", diff="
            java.lang.String r3 = r5.f3437g
            java.lang.String r4 = r5.f3438h
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f3439i
            r0.append(r1)
            java.lang.String r1 = ", toolEvents="
            r0.append(r1)
            java.util.List r1 = r5.f3440j
            r0.append(r1)
            java.lang.String r1 = ", attachments="
            r0.append(r1)
            java.util.List r1 = r5.f3441k
            r0.append(r1)
            java.lang.String r1 = ", quotedMessage="
            r0.append(r1)
            fb.a1 r1 = r5.f3442l
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            r0.append(r1)
            long r1 = r5.f3443m
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            java.lang.String r1 = r5.f3444n
            r0.append(r1)
            java.lang.String r1 = ", draftSnapshot="
            r0.append(r1)
            fb.y r1 = r5.f3445o
            r0.append(r1)
            java.lang.String r1 = ", clearsDraft="
            r0.append(r1)
            boolean r1 = r5.f3446p
            r0.append(r1)
            java.lang.String r1 = ", streamId="
            r0.append(r1)
            java.lang.String r1 = r5.f3447q
            r0.append(r1)
            java.lang.String r1 = ", completedAt="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r5.f3448r
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
