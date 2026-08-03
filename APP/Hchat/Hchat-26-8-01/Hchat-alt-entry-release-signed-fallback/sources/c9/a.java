package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f1085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f1086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f1088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1092l;

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.util.List r5, java.util.List r6, boolean r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, boolean r12) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            r0.<init>()
            r0.f1081a = r1
            r0.f1082b = r2
            r0.f1083c = r3
            r0.f1084d = r4
            r0.f1085e = r5
            r0.f1086f = r6
            r0.f1087g = r7
            r0.f1088h = r8
            r0.f1089i = r9
            r0.f1090j = r10
            r0.f1091k = r11
            r0.f1092l = r12
            return
    }

    public static c9.a a(c9.a r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, java.util.List r18, java.util.List r19, boolean r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, int r25) {
            r0 = r25
            r1 = r0 & 1
            if (r1 == 0) goto L8
            java.lang.String r14 = r13.f1081a
        L8:
            r1 = r14
            r14 = r0 & 2
            if (r14 == 0) goto Lf
            java.lang.String r15 = r13.f1082b
        Lf:
            r2 = r15
            r14 = r0 & 4
            if (r14 == 0) goto L18
            java.lang.String r14 = r13.f1083c
            r3 = r14
            goto L1a
        L18:
            r3 = r16
        L1a:
            r14 = r0 & 8
            if (r14 == 0) goto L22
            int r14 = r13.f1084d
            r4 = r14
            goto L24
        L22:
            r4 = r17
        L24:
            r14 = r0 & 16
            if (r14 == 0) goto L2c
            java.util.List r14 = r13.f1085e
            r5 = r14
            goto L2e
        L2c:
            r5 = r18
        L2e:
            r14 = r0 & 32
            if (r14 == 0) goto L36
            java.util.List r14 = r13.f1086f
            r6 = r14
            goto L38
        L36:
            r6 = r19
        L38:
            r14 = r0 & 64
            if (r14 == 0) goto L40
            boolean r14 = r13.f1087g
            r7 = r14
            goto L42
        L40:
            r7 = r20
        L42:
            r14 = r0 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L4a
            java.lang.String r14 = r13.f1088h
            r8 = r14
            goto L4c
        L4a:
            r8 = r21
        L4c:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L54
            boolean r14 = r13.f1089i
            r9 = r14
            goto L56
        L54:
            r9 = r22
        L56:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L5e
            boolean r14 = r13.f1090j
            r10 = r14
            goto L60
        L5e:
            r10 = r23
        L60:
            boolean r11 = r13.f1091k
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L6a
            boolean r14 = r13.f1092l
            r12 = r14
            goto L6c
        L6a:
            r12 = r24
        L6c:
            r13.getClass()
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            c9.a r0 = new c9.a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof c9.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c9.a r5 = (c9.a) r5
            java.lang.String r1 = r4.f1081a
            java.lang.String r3 = r5.f1081a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f1082b
            java.lang.String r3 = r5.f1082b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f1083c
            java.lang.String r3 = r5.f1083c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.f1084d
            int r3 = r5.f1084d
            if (r1 == r3) goto L34
            return r2
        L34:
            java.util.List r1 = r4.f1085e
            java.util.List r3 = r5.f1085e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r1 = r4.f1086f
            java.util.List r3 = r5.f1086f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            boolean r1 = r4.f1087g
            boolean r3 = r5.f1087g
            if (r1 == r3) goto L51
            return r2
        L51:
            java.lang.String r1 = r4.f1088h
            java.lang.String r3 = r5.f1088h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            boolean r1 = r4.f1089i
            boolean r3 = r5.f1089i
            if (r1 == r3) goto L63
            return r2
        L63:
            boolean r1 = r4.f1090j
            boolean r3 = r5.f1090j
            if (r1 == r3) goto L6a
            return r2
        L6a:
            boolean r1 = r4.f1091k
            boolean r3 = r5.f1091k
            if (r1 == r3) goto L71
            return r2
        L71:
            boolean r1 = r4.f1092l
            boolean r5 = r5.f1092l
            if (r1 == r5) goto L78
            return r2
        L78:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1081a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1082b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f1083c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f1084d
            int r0 = eh.a.e(r2, r0, r1)
            java.util.List r2 = r3.f1085e
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f1086f
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r3.f1087g
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f1088h
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f1089i
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f1090j
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f1091k
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f1092l
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", parentId="
            java.lang.String r2 = "ConversationGroup(id="
            java.lang.String r3 = r5.f1081a
            java.lang.String r4 = r5.f1082b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f1083c
            r0.append(r1)
            java.lang.String r1 = ", order="
            r0.append(r1)
            int r1 = r5.f1084d
            r0.append(r1)
            java.lang.String r1 = ", conversationIds="
            r0.append(r1)
            java.util.List r1 = r5.f1085e
            r0.append(r1)
            java.lang.String r1 = ", pinnedConversationIds="
            r0.append(r1)
            java.util.List r1 = r5.f1086f
            r0.append(r1)
            java.lang.String r1 = ", pinned="
            r0.append(r1)
            boolean r1 = r5.f1087g
            r0.append(r1)
            java.lang.String r1 = ", avatarPath="
            r0.append(r1)
            java.lang.String r1 = r5.f1088h
            r0.append(r1)
            java.lang.String r1 = ", showUnreadCount="
            r0.append(r1)
            java.lang.String r1 = ", previewLatestMessage="
            java.lang.String r2 = ", roundAvatar="
            boolean r3 = r5.f1089i
            boolean r4 = r5.f1090j
            p.a.x(r0, r3, r1, r4, r2)
            boolean r1 = r5.f1091k
            r0.append(r1)
            java.lang.String r1 = ", showEmpty="
            r0.append(r1)
            boolean r1 = r5.f1092l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
