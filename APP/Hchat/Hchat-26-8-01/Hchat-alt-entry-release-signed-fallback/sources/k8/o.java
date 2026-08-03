package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f7447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f7449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f7450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f7454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f7455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f7456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f7457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatTransferMsg f7459p;

    public o(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, h.Hchat.hooks.api.model.WeChatMessage r27, h.Hchat.hooks.api.model.WeChatMessage r28) {
            r17 = this;
            java.lang.String r14 = ""
            r15 = 0
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public o(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, h.Hchat.hooks.api.model.WeChatMessage r16, h.Hchat.hooks.api.model.WeChatMessage r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = ""
            if (r7 == 0) goto L8
            goto L9
        L8:
            r7 = r0
        L9:
            r6.f7444a = r7
            r6.f7445b = r8
            if (r9 == 0) goto L11
            r7 = r9
            goto L12
        L11:
            r7 = r0
        L12:
            r6.f7446c = r7
            if (r10 == 0) goto L18
            r7 = r10
            goto L19
        L18:
            r7 = r0
        L19:
            r6.f7447d = r7
            if (r11 == 0) goto L1f
            r7 = r11
            goto L20
        L1f:
            r7 = r0
        L20:
            r6.f7448e = r7
            if (r12 == 0) goto L26
            r7 = r12
            goto L27
        L26:
            r7 = r0
        L27:
            r6.f7449f = r7
            if (r13 == 0) goto L2c
            goto L2d
        L2c:
            r13 = r0
        L2d:
            r6.f7450g = r13
            r6.f7451h = r14
            r6.f7452i = r15
            r7 = r16
            r6.f7453j = r7
            if (r17 != 0) goto L3a
            goto L3c
        L3a:
            r7 = r17
        L3c:
            if (r7 != 0) goto L52
            boolean r7 = android.text.TextUtils.isEmpty(r11)
            if (r7 != 0) goto L46
            r2 = r11
            goto L47
        L46:
            r2 = r12
        L47:
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r9
            r1 = r10
            r5 = r15
            h.Hchat.hooks.api.model.WeChatMessage r7 = h.Hchat.hooks.api.model.WeChatMessage.fromTransient(r0, r1, r2, r3, r5)
        L52:
            r6.f7454k = r7
            r8 = r18
            r6.f7455l = r8
            r8 = r19
            r6.f7456m = r8
            r8 = r20
            r6.f7457n = r8
            r8 = r21
            r6.f7458o = r8
            if (r7 == 0) goto L6b
            h.Hchat.hooks.api.model.WeChatTransferMsg r7 = r7.getTransferMsg()
            goto L6c
        L6b:
            r7 = 0
        L6c:
            r6.f7459p = r7
            return
    }

    public final java.lang.String a() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getContent()
            return r0
        L9:
            java.lang.String r0 = r1.f7448e
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatPatMsg b() {
            r8 = this;
            boolean r0 = r8.o()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r8.f7455l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L23
            java.lang.String r0 = r8.f7456m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L19
            goto L23
        L19:
            h.Hchat.hooks.api.model.WeChatMessage r0 = r8.f7454k
            if (r0 == 0) goto L22
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = r0.getPatMsg()
            return r0
        L22:
            return r1
        L23:
            h.Hchat.hooks.api.model.WeChatPatMsg r1 = new h.Hchat.hooks.api.model.WeChatPatMsg
            java.lang.String r5 = r8.f7457n
            long r6 = r8.f7458o
            java.lang.String r2 = r8.f7446c
            java.lang.String r3 = r8.f7455l
            java.lang.String r4 = r8.f7456m
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final java.lang.String c() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getSendTalker()
            return r0
        L9:
            java.lang.String r0 = r1.f7447d
            return r0
    }

    public final java.lang.String d() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTalker()
            return r0
        L9:
            java.lang.String r0 = r1.f7446c
            return r0
    }

    public final boolean e() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAnnounceAll()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean f() {
            r2 = this;
            java.lang.String r0 = "app"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isApp()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean g() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAtMe()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean h() {
            r2 = this;
            java.lang.String r0 = "emoji"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmoji()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean i() {
            r2 = this;
            java.lang.String r0 = "file"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean j() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto Lc
            boolean r0 = r0.isGroupChat()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean k() {
            r2 = this;
            java.lang.String r0 = "image"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isImage()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean l() {
            r2 = this;
            java.lang.String r0 = "link"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isLink()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean m() {
            r2 = this;
            java.lang.String r0 = "location"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isLocation()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean n() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto Lc
            boolean r0 = r0.isNotifyAll()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean o() {
            r2 = this;
            java.lang.String r0 = "pat"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isPat()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean p() {
            r2 = this;
            java.lang.String r0 = "quote"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isQuote()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean q() {
            r1 = this;
            boolean r0 = r1.f7452i
            if (r0 != 0) goto L11
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.f7454k
            if (r0 == 0) goto Lf
            boolean r0 = r0.isSend()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public final boolean r() {
            r2 = this;
            java.lang.String r0 = "share_card"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isShareCard()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean s() {
            r2 = this;
            java.lang.String r0 = "system"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isSystem()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean t() {
            r2 = this;
            java.lang.String r0 = "video"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isVideo()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean u() {
            r2 = this;
            java.lang.String r0 = "voice"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isVoice()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean v() {
            r2 = this;
            java.lang.String r0 = "voip"
            java.lang.String r1 = r2.f7445b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7454k
            if (r0 == 0) goto L15
            boolean r0 = r0.isVoip()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }
}
