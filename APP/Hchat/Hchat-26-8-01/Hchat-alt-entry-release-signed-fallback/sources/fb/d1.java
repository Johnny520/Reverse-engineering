package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f3487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fb.y f3488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f3489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f3491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f3492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fb.c1 f3497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3498p;

    public /* synthetic */ d1(java.lang.String r25, java.lang.String r26, long r27, long r29, java.util.List r31, fb.y r32, java.lang.String r33, java.lang.String r34, int r35) {
            r24 = this;
            r0 = r35
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r12 = r2
            goto Lc
        La:
            r12 = r33
        Lc:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L12
            r14 = r2
            goto L14
        L12:
            r14 = r34
        L14:
            r18 = 0
            r22 = 0
            java.lang.String r13 = ""
            java.lang.String r15 = ""
            r16 = 0
            r17 = 0
            r21 = 0
            r19 = r29
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r8 = r29
            r10 = r31
            r11 = r32
            r3.<init>(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22)
            return
    }

    public d1(java.lang.String r1, java.lang.String r2, long r3, long r5, java.util.List r7, fb.y r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14, boolean r15, long r16, fb.c1 r18, long r19) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r7.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r0.<init>()
            r0.f3483a = r1
            r0.f3484b = r2
            r0.f3485c = r3
            r0.f3486d = r5
            r0.f3487e = r7
            r0.f3488f = r8
            r0.f3489g = r9
            r0.f3490h = r10
            r0.f3491i = r11
            r0.f3492j = r12
            r0.f3493k = r13
            r0.f3494l = r14
            r0.f3495m = r15
            r1 = r16
            r0.f3496n = r1
            r1 = r18
            r0.f3497o = r1
            r1 = r19
            r0.f3498p = r1
            return
    }

    public static fb.d1 a(fb.d1 r21, java.lang.String r22, boolean r23, boolean r24, long r25, int r27) {
            r0 = r21
            r1 = r27
            java.lang.String r2 = r0.f3483a
            r3 = r1 & 2
            if (r3 == 0) goto Ld
            java.lang.String r3 = r0.f3484b
            goto Lf
        Ld:
            r3 = r22
        Lf:
            long r4 = r0.f3485c
            r7 = r2
            r2 = r3
            r3 = r4
            long r5 = r0.f3486d
            r8 = r7
            java.util.List r7 = r0.f3487e
            r9 = r8
            fb.y r8 = r0.f3488f
            r10 = r9
            java.lang.String r9 = r0.f3489g
            r11 = r10
            java.lang.String r10 = r0.f3490h
            r12 = r11
            java.lang.String r11 = r0.f3491i
            r13 = r12
            java.lang.String r12 = r0.f3492j
            r14 = r13
            int r13 = r0.f3493k
            r15 = r1 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L32
            boolean r15 = r0.f3494l
            goto L34
        L32:
            r15 = r23
        L34:
            r22 = r2
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L3d
            boolean r2 = r0.f3495m
            goto L3f
        L3d:
            r2 = r24
        L3f:
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            r23 = r2
            if (r1 == 0) goto L4a
            long r1 = r0.f3496n
            r16 = r1
            goto L4c
        L4a:
            r16 = r25
        L4c:
            fb.c1 r1 = r0.f3497o
            r18 = r1
            long r1 = r0.f3498p
            r0.getClass()
            r14.getClass()
            r22.getClass()
            r7.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            fb.d1 r0 = new fb.d1
            r19 = r1
            r1 = r14
            r14 = r15
            r2 = r22
            r15 = r23
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19)
            return r0
    }

    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f3483a
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof fb.d1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.d1 r8 = (fb.d1) r8
            java.lang.String r1 = r7.f3483a
            java.lang.String r3 = r8.f3483a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f3484b
            java.lang.String r3 = r8.f3484b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f3485c
            long r5 = r8.f3485c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            long r3 = r7.f3486d
            long r5 = r8.f3486d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            java.util.List r1 = r7.f3487e
            java.util.List r3 = r8.f3487e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            fb.y r1 = r7.f3488f
            fb.y r3 = r8.f3488f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r7.f3489g
            java.lang.String r3 = r8.f3489g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r7.f3490h
            java.lang.String r3 = r8.f3490h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.lang.String r1 = r7.f3491i
            java.lang.String r3 = r8.f3491i
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            java.lang.String r1 = r7.f3492j
            java.lang.String r3 = r8.f3492j
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            int r1 = r7.f3493k
            int r3 = r8.f3493k
            if (r1 == r3) goto L7d
            return r2
        L7d:
            boolean r1 = r7.f3494l
            boolean r3 = r8.f3494l
            if (r1 == r3) goto L84
            return r2
        L84:
            boolean r1 = r7.f3495m
            boolean r3 = r8.f3495m
            if (r1 == r3) goto L8b
            return r2
        L8b:
            long r3 = r7.f3496n
            long r5 = r8.f3496n
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L94
            return r2
        L94:
            fb.c1 r1 = r7.f3497o
            fb.c1 r3 = r8.f3497o
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L9f
            return r2
        L9f:
            long r3 = r7.f3498p
            long r5 = r8.f3498p
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto La8
            return r2
        La8:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f3483a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.f3484b
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r5.f3485c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r5.f3486d
            int r0 = eh.a.f(r0, r1, r2)
            java.util.List r2 = r5.f3487e
            int r0 = j8.b.e(r2, r0, r1)
            r2 = 0
            fb.y r3 = r5.f3488f
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r5.f3489g
            int r0 = eh.a.g(r0, r1, r3)
            java.lang.String r3 = r5.f3490h
            int r0 = eh.a.g(r0, r1, r3)
            java.lang.String r3 = r5.f3491i
            int r0 = eh.a.g(r0, r1, r3)
            java.lang.String r3 = r5.f3492j
            int r0 = eh.a.g(r0, r1, r3)
            int r3 = r5.f3493k
            int r0 = eh.a.e(r3, r0, r1)
            boolean r3 = r5.f3494l
            int r0 = eh.a.h(r0, r1, r3)
            boolean r3 = r5.f3495m
            int r0 = eh.a.h(r0, r1, r3)
            long r3 = r5.f3496n
            int r0 = eh.a.f(r0, r1, r3)
            fb.c1 r3 = r5.f3497o
            if (r3 != 0) goto L63
            goto L67
        L63:
            int r2 = r3.hashCode()
        L67:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r1 = r5.f3498p
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", createdAt="
            java.lang.String r2 = "ScriptPluginAgentSession(id="
            java.lang.String r3 = r5.f3483a
            java.lang.String r4 = r5.f3484b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            long r1 = r5.f3485c
            r0.append(r1)
            java.lang.String r1 = ", updatedAt="
            java.lang.String r2 = ", messages="
            long r3 = r5.f3486d
            j8.b.s(r0, r1, r3, r2)
            java.util.List r1 = r5.f3487e
            r0.append(r1)
            java.lang.String r1 = ", draft="
            r0.append(r1)
            fb.y r1 = r5.f3488f
            r0.append(r1)
            java.lang.String r1 = ", targetPluginId="
            r0.append(r1)
            java.lang.String r1 = ", conversationSummary="
            java.lang.String r2 = ", nativeToolHistory="
            java.lang.String r3 = r5.f3489g
            java.lang.String r4 = r5.f3490h
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", protocolTranscript="
            java.lang.String r2 = ", compactedMessageCount="
            java.lang.String r3 = r5.f3491i
            java.lang.String r4 = r5.f3492j
            j8.b.t(r0, r3, r1, r4, r2)
            int r1 = r5.f3493k
            r0.append(r1)
            java.lang.String r1 = ", pinned="
            r0.append(r1)
            boolean r1 = r5.f3494l
            r0.append(r1)
            java.lang.String r1 = ", locked="
            r0.append(r1)
            boolean r1 = r5.f3495m
            r0.append(r1)
            java.lang.String r1 = ", sortOrder="
            r0.append(r1)
            long r1 = r5.f3496n
            r0.append(r1)
            java.lang.String r1 = ", resumeState="
            r0.append(r1)
            fb.c1 r1 = r5.f3497o
            r0.append(r1)
            java.lang.String r1 = ", checkpointSeq="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r5.f3498p
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
