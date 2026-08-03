package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f5466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f5467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f5468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k8.t f5470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f5471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f5473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f5474k;

    public t(long r1, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, k8.t r9, java.lang.String r10, int r11, java.lang.String r12, java.lang.Object r13) {
            r0 = this;
            j8.b.q(r4, r5, r6, r10, r12)
            r0.<init>()
            r0.f5464a = r1
            r0.f5465b = r3
            r0.f5466c = r4
            r0.f5467d = r5
            r0.f5468e = r6
            r0.f5469f = r7
            r0.f5470g = r9
            r0.f5471h = r10
            r0.f5472i = r11
            r0.f5473j = r12
            r0.f5474k = r13
            return
    }

    public /* synthetic */ t(long r17, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, k8.t r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.Object r29, int r30) {
            r16 = this;
            r0 = r30
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto La
            java.lang.String r1 = ""
            r14 = r1
            goto Lc
        La:
            r14 = r28
        Lc:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L27
            r0 = 0
            r15 = r0
        L12:
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r12 = r26
            r13 = r27
            goto L2a
        L27:
            r15 = r29
            goto L12
        L2a:
            r2.<init>(r3, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return
    }

    public final boolean a() {
            r2 = this;
            int r0 = r2.f5465b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 == r1) goto Lb
            goto L3a
        Lb:
            k8.t r0 = r2.f5470g
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.f7474c
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = r2.f5467d
        L1f:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            java.lang.String r1 = "type"
            java.lang.String r0 = l8.d.o(r0, r1)
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 != 0) goto L31
            goto L3a
        L31:
            int r0 = r0.intValue()
            r1 = 6
            if (r0 != r1) goto L3a
            r0 = 1
            return r0
        L3a:
            r0 = 0
            return r0
    }

    public final boolean b() {
            r2 = this;
            int r0 = r2.f5465b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 49
            if (r0 == r1) goto Lc
            r0 = 0
            return r0
        Lc:
            k8.t r0 = r2.f5470g
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.f7474c
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L18
            java.lang.String r0 = ""
        L18:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L20
            java.lang.String r0 = r2.f5467d
        L20:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            boolean r0 = l8.d.h(r0)
            return r0
    }

    public final java.lang.String c() {
            r2 = this;
            int r0 = r2.f5465b
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 1
            if (r0 == r1) goto L49
            r1 = 3
            if (r0 == r1) goto L46
            r1 = 34
            if (r0 == r1) goto L43
            r1 = 62
            if (r0 == r1) goto L40
            r1 = 42
            if (r0 == r1) goto L3d
            r1 = 43
            if (r0 == r1) goto L40
            switch(r0) {
                case 47: goto L3a;
                case 48: goto L37;
                case 49: goto L22;
                default: goto L1f;
            }
        L1f:
            java.lang.String r0 = "消息"
            return r0
        L22:
            boolean r0 = r2.a()
            if (r0 == 0) goto L2b
            java.lang.String r0 = "文件"
            return r0
        L2b:
            boolean r0 = r2.b()
            if (r0 == 0) goto L34
            java.lang.String r0 = "视频号"
            return r0
        L34:
            java.lang.String r0 = "卡片"
            return r0
        L37:
            java.lang.String r0 = "位置"
            return r0
        L3a:
            java.lang.String r0 = "表情"
            return r0
        L3d:
            java.lang.String r0 = "名片"
            return r0
        L40:
            java.lang.String r0 = "视频"
            return r0
        L43:
            java.lang.String r0 = "语音"
            return r0
        L46:
            java.lang.String r0 = "图片"
            return r0
        L49:
            java.lang.String r0 = "文本"
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof hb.t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hb.t r8 = (hb.t) r8
            long r3 = r7.f5464a
            long r5 = r8.f5464a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            int r1 = r7.f5465b
            int r3 = r8.f5465b
            if (r1 == r3) goto L1c
            return r2
        L1c:
            java.lang.String r1 = r7.f5466c
            java.lang.String r3 = r8.f5466c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L27
            return r2
        L27:
            java.lang.String r1 = r7.f5467d
            java.lang.String r3 = r8.f5467d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L32
            return r2
        L32:
            java.lang.String r1 = r7.f5468e
            java.lang.String r3 = r8.f5468e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            long r3 = r7.f5469f
            long r5 = r8.f5469f
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L46
            return r2
        L46:
            k8.t r1 = r7.f5470g
            k8.t r3 = r8.f5470g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.String r1 = r7.f5471h
            java.lang.String r3 = r8.f5471h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            int r1 = r7.f5472i
            int r3 = r8.f5472i
            if (r1 == r3) goto L63
            return r2
        L63:
            java.lang.String r1 = r7.f5473j
            java.lang.String r3 = r8.f5473j
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L6e
            return r2
        L6e:
            java.lang.Object r1 = r7.f5474k
            java.lang.Object r8 = r8.f5474k
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L79
            return r2
        L79:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f5464a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f5465b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f5466c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f5467d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f5468e
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f5469f
            int r0 = eh.a.f(r0, r1, r2)
            r2 = 0
            k8.t r3 = r4.f5470g
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f5471h
            int r0 = eh.a.g(r0, r1, r3)
            int r3 = r4.f5472i
            int r0 = eh.a.e(r3, r0, r1)
            java.lang.String r3 = r4.f5473j
            int r0 = eh.a.g(r0, r1, r3)
            java.lang.Object r1 = r4.f5474k
            if (r1 != 0) goto L4b
            goto L4f
        L4b:
            int r2 = r1.hashCode()
        L4f:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectedMessageSnapshot(msgId="
            r0.<init>(r1)
            long r1 = r5.f5464a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r5.f5465b
            r0.append(r1)
            java.lang.String r1 = ", sourceTalker="
            java.lang.String r2 = ", content="
            java.lang.String r3 = r5.f5466c
            java.lang.String r4 = r5.f5467d
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", imagePath="
            r0.append(r1)
            java.lang.String r1 = r5.f5468e
            r0.append(r1)
            java.lang.String r1 = ", createTime="
            r0.append(r1)
            long r1 = r5.f5469f
            r0.append(r1)
            java.lang.String r1 = ", retransmit="
            r0.append(r1)
            k8.t r1 = r5.f5470g
            r0.append(r1)
            java.lang.String r1 = ", voicePath="
            r0.append(r1)
            java.lang.String r1 = r5.f5471h
            r0.append(r1)
            java.lang.String r1 = ", voiceDurationMillis="
            r0.append(r1)
            int r1 = r5.f5472i
            r0.append(r1)
            java.lang.String r1 = ", voiceFileName="
            r0.append(r1)
            java.lang.String r1 = r5.f5473j
            r0.append(r1)
            java.lang.String r1 = ", nativeMessage="
            r0.append(r1)
            java.lang.Object r1 = r5.f5474k
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
