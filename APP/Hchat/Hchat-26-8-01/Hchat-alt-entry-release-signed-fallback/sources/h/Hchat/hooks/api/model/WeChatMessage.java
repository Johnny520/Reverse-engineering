package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatMessage {
    public static final int $stable = 0;
    private static final java.util.Set<java.lang.String> AT_ALL_LABELS = null;
    public static final l8.d Companion = null;
    private static final int MAX_WECHAT_AT_LENGTH = 40;
    private static final char WECHAT_AT_SEPARATOR = 8197;
    public final java.lang.String content;
    public final long createTime;
    public final int flag;
    public final java.lang.String imagePath;
    public final int isSend;
    public final long msgId;
    public final java.lang.String msgSource;
    public final long msgSvrId;
    public final java.lang.String reserved;
    public final java.lang.String selfWxId;
    public final int status;
    public final java.lang.String talker;
    public final java.lang.String translatedContent;
    public final int type;

    static {
            l8.d r0 = new l8.d
            r0.<init>()
            h.Hchat.hooks.api.model.WeChatMessage.Companion = r0
            java.lang.String r0 = "全員"
            java.lang.String r1 = "모두"
            java.lang.String r2 = "所有人"
            java.lang.String r3 = "all"
            java.lang.String r4 = "everyone"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            h.Hchat.hooks.api.model.WeChatMessage.AT_ALL_LABELS = r0
            return
    }

    public WeChatMessage(long r19, long r21, int r23, int r24, int r25, long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33) {
            r18 = this;
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r0.<init>(r1, r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public WeChatMessage(long r1, long r3, int r5, int r6, int r7, long r8, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17) {
            r0 = this;
            r0.<init>()
            r0.msgId = r1
            r0.msgSvrId = r3
            r0.type = r5
            r0.status = r6
            r0.isSend = r7
            r0.createTime = r8
            r0.flag = r15
            java.lang.String r1 = ""
            if (r10 != 0) goto L16
            r10 = r1
        L16:
            r0.talker = r10
            if (r11 != 0) goto L1b
            r11 = r1
        L1b:
            r0.content = r11
            if (r12 != 0) goto L20
            r12 = r1
        L20:
            r0.imagePath = r12
            if (r13 != 0) goto L25
            r13 = r1
        L25:
            r0.reserved = r13
            if (r14 != 0) goto L2b
            r2 = r1
            goto L2c
        L2b:
            r2 = r14
        L2c:
            r0.translatedContent = r2
            if (r16 != 0) goto L32
            r2 = r1
            goto L34
        L32:
            r2 = r16
        L34:
            r0.msgSource = r2
            if (r17 != 0) goto L39
            goto L3b
        L39:
            r1 = r17
        L3b:
            r0.selfWxId = r1
            return
    }

    public static final /* synthetic */ java.util.Set access$getAT_ALL_LABELS$cp() {
            java.util.Set<java.lang.String> r0 = h.Hchat.hooks.api.model.WeChatMessage.AT_ALL_LABELS
            return r0
    }

    public static final l8.c classifyAtMention(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            l8.c r1 = l8.d.c(r1, r2, r3)
            return r1
    }

    public static final java.util.List<java.lang.String> effectiveAtUserList(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            l8.c r2 = l8.d.c(r1, r2, r3)
            int r2 = r2.ordinal()
            r3 = 2
            if (r2 == r3) goto L1f
            r3 = 3
            if (r2 == r3) goto L18
            java.util.List r1 = l8.d.j(r1)
            return r1
        L18:
            java.lang.String r1 = "announcement@all"
            java.util.List r1 = a.a.x0(r1)
            return r1
        L1f:
            java.lang.String r1 = "notify@all"
            java.util.List r1 = a.a.x0(r1)
            return r1
    }

    public static final java.lang.String extractXml(java.lang.String r1) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r1 = l8.d.d(r1)
            return r1
    }

    public static final h.Hchat.hooks.api.model.WeChatMessage fromTransient(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, boolean r17) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            int r7 = l8.d.f(r14)
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r8 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            h.Hchat.hooks.api.model.WeChatMessage r12 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r12
    }

    public static final h.Hchat.hooks.api.model.WeChatMessage fromTransient(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, boolean r17, int r18, long r19) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            h.Hchat.hooks.api.model.WeChatMessage r12 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r12
    }

    public static final h.Hchat.hooks.api.model.WeChatMessage fromTransient(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, int r7, long r8, java.lang.String r10, java.lang.String r11) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            h.Hchat.hooks.api.model.WeChatMessage r1 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r1
    }

    public static final int inferType(java.lang.String r1) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            int r1 = l8.d.f(r1)
            return r1
    }

    public static final boolean isAtMeMessage(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            l8.c r1 = l8.d.c(r1, r2, r3)
            l8.c r2 = l8.c.f7900h
            if (r1 != r2) goto Lf
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static final boolean isGroupTalker(java.lang.String r1) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            boolean r1 = l8.d.g(r1)
            return r1
    }

    public static final boolean isNotifyAllMessage(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            l8.c r1 = l8.d.c(r1, r2, r3)
            l8.c r2 = l8.c.f7901i
            if (r1 != r2) goto Lf
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static final boolean isVideoNumberContent(java.lang.String r1) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            boolean r1 = l8.d.h(r1)
            return r1
    }

    public static final java.lang.String msgSourceValue(java.lang.String r1, java.lang.String r2) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r1 = l8.d.i(r1, r2)
            return r1
    }

    public static final java.util.List<java.lang.String> parseAtUserList(java.lang.String r1) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.util.List r1 = l8.d.j(r1)
            return r1
    }

    private final java.lang.String quoteSender(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            boolean r1 = l8.d.g(r3)
            if (r1 == 0) goto L14
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            java.lang.String r3 = l8.d.b(r0, r3)
            return r3
        L14:
            boolean r1 = l8.d.g(r4)
            if (r1 == 0) goto L23
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r3 = l8.d.b(r0, r3)
            return r3
        L23:
            boolean r0 = r2.isGroupChat()
            if (r0 == 0) goto L32
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            java.lang.String r3 = l8.d.e(r3)
            return r3
        L32:
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r3 = l8.d.e(r3)
            return r3
    }

    private final java.lang.String quoteTalker(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            boolean r0 = l8.d.g(r2)
            if (r0 == 0) goto Lc
            return r2
        Lc:
            boolean r0 = l8.d.g(r3)
            if (r0 == 0) goto L13
            return r3
        L13:
            java.lang.String r0 = r1.talker
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L1e
            java.lang.String r2 = r1.talker
            return r2
        L1e:
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r2 = l8.d.e(r2)
            return r2
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final h.Hchat.hooks.api.model.WeChatMessage m3transient(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, boolean r17) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            int r7 = l8.d.f(r14)
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r8 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            h.Hchat.hooks.api.model.WeChatMessage r12 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r12
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final h.Hchat.hooks.api.model.WeChatMessage m4transient(java.lang.String r12, java.lang.String r13, java.lang.String r14, long r15, boolean r17, int r18, long r19) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            h.Hchat.hooks.api.model.WeChatMessage r12 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r12
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final h.Hchat.hooks.api.model.WeChatMessage m5transient(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, int r7, long r8, java.lang.String r10, java.lang.String r11) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            h.Hchat.hooks.api.model.WeChatMessage r1 = l8.d.k(r1, r2, r3, r4, r6, r7, r8, r10, r11)
            return r1
    }

    public static final java.lang.String xmlAttr(java.lang.String r1, java.lang.String r2) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r1 = l8.d.m(r1, r2)
            return r1
    }

    public static final java.lang.String xmlSection(java.lang.String r1, java.lang.String r2) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r1 = l8.d.n(r1, r2)
            return r1
    }

    public static final java.lang.String xmlTag(java.lang.String r1, java.lang.String r2) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            java.lang.String r1 = l8.d.o(r1, r2)
            return r1
    }

    public final int appMsgType() {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.bodyContent()
            r0.getClass()
            java.lang.String r0 = "type"
            java.lang.String r0 = l8.d.o(r1, r0)
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public final java.lang.String bodyContent() {
            r4 = this;
            java.lang.String r0 = r4.content
            r1 = 0
            r2 = 6
            java.lang.String r3 = ":\n"
            int r0 = og.m.r0(r0, r3, r1, r1, r2)
            boolean r1 = r4.isGroupChat()
            if (r1 == 0) goto L1b
            if (r0 <= 0) goto L1b
            java.lang.String r1 = r4.content
            int r0 = r0 + 2
            java.lang.String r0 = r1.substring(r0)
            return r0
        L1b:
            java.lang.String r0 = r4.content
            return r0
    }

    public final int getAppMsgType() {
            r1 = this;
            int r0 = r1.appMsgType()
            return r0
    }

    public final l8.c getAtMentionType() {
            r4 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r4.getMsgSource()
            java.lang.String r2 = r4.bodyContent()
            java.lang.String r3 = r4.selfWxId
            r0.getClass()
            l8.c r0 = l8.d.c(r1, r2, r3)
            return r0
    }

    public final java.util.List<java.lang.String> getAtUserList() {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.getMsgSource()
            r0.getClass()
            java.util.List r0 = l8.d.j(r1)
            return r0
    }

    public final java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.content
            return r0
    }

    public final long getCreateTime() {
            r2 = this;
            long r0 = r2.createTime
            return r0
    }

    public final java.util.List<java.lang.String> getEffectiveAtUserList() {
            r2 = this;
            l8.c r0 = r2.getAtMentionType()
            int r0 = r0.ordinal()
            r1 = 2
            if (r0 == r1) goto L1a
            r1 = 3
            if (r0 == r1) goto L13
            java.util.List r0 = r2.getAtUserList()
            return r0
        L13:
            java.lang.String r0 = "announcement@all"
            java.util.List r0 = a.a.x0(r0)
            return r0
        L1a:
            java.lang.String r0 = "notify@all"
            java.util.List r0 = a.a.x0(r0)
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatFileMsg getFileMsg() {
            r13 = this;
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r13.bodyContent()
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            java.lang.String r1 = "title"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r2 = "filename"
            java.lang.String r3 = l8.d.o(r0, r2)
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            java.lang.String r4 = l8.d.e(r1)
            h.Hchat.hooks.api.model.WeChatFileMsg r3 = new h.Hchat.hooks.api.model.WeChatFileMsg
            java.lang.String r1 = "totallen"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.Long r1 = og.t.g0(r1)
            if (r1 == 0) goto L38
        L33:
            long r5 = r1.longValue()
            goto L47
        L38:
            java.lang.String r1 = "length"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.Long r1 = og.t.g0(r1)
            if (r1 == 0) goto L45
            goto L33
        L45:
            r5 = 0
        L47:
            java.lang.String r1 = "fileext"
            java.lang.String r1 = l8.d.o(r0, r1)
            r7 = 46
            java.lang.String r8 = ""
            java.lang.String r7 = og.m.L0(r4, r7, r8)
            java.lang.String[] r1 = new java.lang.String[]{r1, r7}
            java.lang.String r7 = l8.d.e(r1)
            java.lang.String r1 = "filemd5"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r8 = "md5"
            java.lang.String r8 = l8.d.o(r0, r8)
            java.lang.String r9 = "cdnthumbmd5"
            java.lang.String r9 = l8.d.o(r0, r9)
            java.lang.String[] r1 = new java.lang.String[]{r1, r8, r9}
            java.lang.String r8 = l8.d.e(r1)
            java.lang.String r1 = "cdnattachurl"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r9 = "attachid"
            java.lang.String r10 = l8.d.o(r0, r9)
            java.lang.String r11 = "url"
            java.lang.String r11 = l8.d.o(r0, r11)
            java.lang.String[] r1 = new java.lang.String[]{r1, r10, r11}
            java.lang.String r1 = l8.d.e(r1)
            java.lang.String r10 = "aeskey"
            java.lang.String r10 = l8.d.o(r0, r10)
            java.lang.String r11 = "cdnthumbaeskey"
            java.lang.String r11 = l8.d.o(r0, r11)
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = l8.d.e(r10)
            java.lang.String r11 = l8.d.o(r0, r9)
            java.lang.String r12 = l8.d.o(r0, r2)
            r9 = r1
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
            return r3
    }

    public final h.Hchat.hooks.api.model.WeChatImageMsg getImageMsg() {
            r13 = this;
            boolean r0 = r13.isImage()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r13.bodyContent()
            h.Hchat.hooks.api.model.WeChatImageMsg r1 = new h.Hchat.hooks.api.model.WeChatImageMsg
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            java.lang.String r2 = "md5"
            java.lang.String r3 = l8.d.m(r0, r2)
            java.lang.String r2 = l8.d.o(r0, r2)
            java.lang.String[] r2 = new java.lang.String[]{r3, r2}
            java.lang.String r2 = l8.d.e(r2)
            java.lang.String r3 = "cdnbigimgurl"
            java.lang.String r4 = l8.d.m(r0, r3)
            java.lang.String r3 = l8.d.o(r0, r3)
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            java.lang.String r3 = l8.d.e(r3)
            java.lang.String r4 = "cdnmidimgurl"
            java.lang.String r5 = l8.d.m(r0, r4)
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.lang.String r4 = l8.d.e(r4)
            java.lang.String r5 = "cdnthumburl"
            java.lang.String r6 = l8.d.m(r0, r5)
            java.lang.String r5 = l8.d.o(r0, r5)
            java.lang.String[] r5 = new java.lang.String[]{r6, r5}
            java.lang.String r5 = l8.d.e(r5)
            java.lang.String r6 = "aeskey"
            java.lang.String r7 = l8.d.m(r0, r6)
            java.lang.String r6 = l8.d.o(r0, r6)
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}
            java.lang.String r6 = l8.d.e(r6)
            java.lang.String r7 = "hdlength"
            java.lang.String r8 = l8.d.m(r0, r7)
            java.lang.String r7 = l8.d.o(r0, r7)
            java.lang.String[] r7 = new java.lang.String[]{r8, r7}
            java.lang.String r7 = l8.d.e(r7)
            r8 = 10
            java.lang.Integer r7 = og.t.e0(r8, r7)
            r9 = 0
            if (r7 == 0) goto L8d
            int r7 = r7.intValue()
            goto L8e
        L8d:
            r7 = r9
        L8e:
            java.lang.String r10 = "length"
            java.lang.String r11 = l8.d.m(r0, r10)
            java.lang.String r10 = l8.d.o(r0, r10)
            java.lang.String[] r10 = new java.lang.String[]{r11, r10}
            java.lang.String r10 = l8.d.e(r10)
            java.lang.Integer r10 = og.t.e0(r8, r10)
            if (r10 == 0) goto Lab
            int r10 = r10.intValue()
            goto Lac
        Lab:
            r10 = r9
        Lac:
            java.lang.String r11 = "cdnthumblength"
            java.lang.String r12 = l8.d.m(r0, r11)
            java.lang.String r0 = l8.d.o(r0, r11)
            java.lang.String[] r0 = new java.lang.String[]{r12, r0}
            java.lang.String r0 = l8.d.e(r0)
            java.lang.Integer r0 = og.t.e0(r8, r0)
            if (r0 == 0) goto Lc8
            int r9 = r0.intValue()
        Lc8:
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    public final long getMsgId() {
            r2 = this;
            long r0 = r2.msgId
            return r0
    }

    public final java.lang.String getMsgSource() {
            r5 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r5.msgSource
            java.lang.String r2 = r5.content
            r0.getClass()
            java.lang.String r0 = "msgsource"
            java.lang.String r2 = l8.d.n(r2, r0)
            java.lang.String r3 = r5.bodyContent()
            java.lang.String r3 = l8.d.n(r3, r0)
            java.lang.String r4 = r5.reserved
            java.lang.String r0 = l8.d.n(r4, r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r0}
            java.lang.String r0 = l8.d.e(r0)
            java.lang.String r0 = l8.d.l(r0)
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatPatMsg getPatMsg() {
            r8 = this;
            boolean r0 = r8.isPat()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r5 = r8.bodyContent()
            h.Hchat.hooks.api.model.WeChatPatMsg r1 = new h.Hchat.hooks.api.model.WeChatPatMsg
            java.lang.String r2 = r8.talker
            java.lang.String r3 = r8.sendTalker()
            java.lang.String r4 = ""
            long r6 = r8.createTime
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final h.Hchat.hooks.api.model.WeChatQuoteMsg getQuoteMsg() {
            r19 = this;
            r0 = r19
            boolean r1 = r0.isQuote()
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.String r1 = r0.bodyContent()
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            java.lang.String r3 = "refermsg"
            java.lang.String r3 = l8.d.n(r1, r3)
            java.lang.String[] r3 = new java.lang.String[]{r3, r1}
            java.lang.String r3 = l8.d.e(r3)
            java.lang.String r4 = "fromusr"
            java.lang.String r4 = l8.d.o(r3, r4)
            java.lang.String r5 = "referfromusr"
            java.lang.String r5 = l8.d.o(r1, r5)
            java.lang.String r6 = "fromusername"
            java.lang.String r6 = l8.d.o(r1, r6)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}
            java.lang.String r4 = l8.d.e(r4)
            java.lang.String r4 = l8.d.a(r2, r4)
            java.lang.String r5 = "chatusr"
            java.lang.String r5 = l8.d.o(r3, r5)
            java.lang.String r6 = "refertowusr"
            java.lang.String r6 = l8.d.o(r1, r6)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.String r5 = l8.d.e(r5)
            java.lang.String r5 = l8.d.a(r2, r5)
            h.Hchat.hooks.api.model.WeChatQuoteMsg r6 = new h.Hchat.hooks.api.model.WeChatQuoteMsg
            java.lang.String r7 = "title"
            java.lang.String r7 = l8.d.o(r1, r7)
            java.lang.String r7 = l8.d.a(r2, r7)
            java.lang.String r8 = "msgsource"
            java.lang.String r8 = l8.d.o(r3, r8)
            java.lang.String r8 = l8.d.a(r2, r8)
            java.lang.String r9 = r0.quoteSender(r4, r5)
            java.lang.String r10 = "displayname"
            java.lang.String r10 = l8.d.o(r3, r10)
            java.lang.String r10 = l8.d.a(r2, r10)
            java.lang.String r11 = r0.quoteTalker(r4, r5)
            java.lang.String r4 = "refermsgtype"
            java.lang.String r4 = l8.d.o(r1, r4)
            java.lang.String r5 = "type"
            java.lang.String r5 = l8.d.o(r3, r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r4 = l8.d.e(r4)
            r5 = 10
            java.lang.Integer r4 = og.t.e0(r5, r4)
            if (r4 == 0) goto La1
            int r4 = r4.intValue()
        L9f:
            r12 = r4
            goto La3
        La1:
            r4 = 0
            goto L9f
        La3:
            java.lang.String r4 = "content"
            java.lang.String r4 = l8.d.o(r3, r4)
            java.lang.String r5 = "refermsgcontent"
            java.lang.String r5 = l8.d.o(r1, r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r4 = l8.d.e(r4)
            java.lang.String r13 = l8.d.a(r2, r4)
            java.lang.String r4 = "svrid"
            java.lang.String r4 = l8.d.o(r3, r4)
            java.lang.String r5 = "refermsgid"
            java.lang.String r1 = l8.d.o(r1, r5)
            java.lang.String[] r1 = new java.lang.String[]{r4, r1}
            java.lang.String r1 = l8.d.e(r1)
            java.lang.Long r1 = og.t.g0(r1)
            r4 = 0
            if (r1 == 0) goto Ldc
            long r14 = r1.longValue()
            goto Ldd
        Ldc:
            r14 = r4
        Ldd:
            java.lang.String r1 = "strid"
            java.lang.String r1 = l8.d.o(r3, r1)
            java.lang.String r16 = l8.d.a(r2, r1)
            java.lang.String r1 = "createtime"
            java.lang.String r1 = l8.d.o(r3, r1)
            java.lang.Long r1 = og.t.g0(r1)
            if (r1 == 0) goto Lf7
            long r4 = r1.longValue()
        Lf7:
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r6
    }

    public final java.lang.String getSendTalker() {
            r1 = this;
            java.lang.String r0 = r1.sendTalker()
            return r0
    }

    public final java.lang.String getTalker() {
            r1 = this;
            java.lang.String r0 = r1.talker
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatTransferMsg getTransferMsg() {
            r17 = this;
            boolean r0 = r17.isTransfer()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r17.bodyContent()
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            java.lang.String r1 = "total_fee"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r2 = "feederval"
            java.lang.String r2 = l8.d.o(r0, r2)
            java.lang.String r3 = "fee"
            java.lang.String r3 = l8.d.o(r0, r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            java.lang.String r1 = l8.d.e(r1)
            java.lang.Long r1 = og.t.g0(r1)
            r2 = 0
            if (r1 == 0) goto L39
            long r4 = r1.longValue()
            r13 = r4
            goto L3a
        L39:
            r13 = r2
        L3a:
            h.Hchat.hooks.api.model.WeChatTransferMsg r6 = new h.Hchat.hooks.api.model.WeChatTransferMsg
            java.lang.String r1 = "transcationid"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r4 = "transactionid"
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String r5 = "transaction_id"
            java.lang.String r5 = l8.d.o(r0, r5)
            java.lang.String[] r1 = new java.lang.String[]{r1, r4, r5}
            java.lang.String r7 = l8.d.e(r1)
            java.lang.String r1 = "transferid"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r4 = "transfer_id"
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String r5 = "trans_id"
            java.lang.String r5 = l8.d.o(r0, r5)
            java.lang.String[] r1 = new java.lang.String[]{r1, r4, r5}
            java.lang.String r8 = l8.d.e(r1)
            java.lang.String r1 = "payer_username"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r4 = "payerusername"
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String r5 = "username"
            java.lang.String r5 = l8.d.o(r0, r5)
            java.lang.String r9 = r17.sendTalker()
            java.lang.String[] r1 = new java.lang.String[]{r1, r4, r5, r9}
            java.lang.String r9 = l8.d.e(r1)
            java.lang.String r1 = "receiver_username"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r4 = "receiverusername"
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            java.lang.String r10 = l8.d.e(r1)
            java.lang.String r1 = "invalidtime"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.Long r1 = og.t.g0(r1)
            if (r1 == 0) goto Lb2
            long r2 = r1.longValue()
        Lb2:
            r11 = r2
            java.lang.String r1 = "pay_memo"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.lang.String r2 = "feedesc"
            java.lang.String r2 = l8.d.o(r0, r2)
            java.lang.String r3 = "desc"
            java.lang.String r3 = l8.d.o(r0, r3)
            java.lang.String r4 = "title"
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            java.lang.String r15 = l8.d.e(r1)
            java.lang.String r16 = l8.d.d(r0)
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r16)
            return r6
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatVideoMsg getVideoMsg() {
            r10 = this;
            boolean r0 = r10.isVideo()
            if (r0 != 0) goto Le
            int r0 = r10.type
            r1 = 62
            if (r0 == r1) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.String r0 = r10.bodyContent()
            h.Hchat.hooks.api.model.WeChatVideoMsg r1 = new h.Hchat.hooks.api.model.WeChatVideoMsg
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            java.lang.String r2 = "md5"
            java.lang.String r3 = l8.d.m(r0, r2)
            java.lang.String r2 = l8.d.o(r0, r2)
            java.lang.String[] r2 = new java.lang.String[]{r3, r2}
            java.lang.String r2 = l8.d.e(r2)
            java.lang.String r3 = "newmd5"
            java.lang.String r4 = l8.d.m(r0, r3)
            java.lang.String r3 = l8.d.o(r0, r3)
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            java.lang.String r3 = l8.d.e(r3)
            java.lang.String r4 = "cdnvideourl"
            java.lang.String r5 = l8.d.m(r0, r4)
            java.lang.String r4 = l8.d.o(r0, r4)
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.lang.String r4 = l8.d.e(r4)
            java.lang.String r5 = "aeskey"
            java.lang.String r6 = l8.d.m(r0, r5)
            java.lang.String r5 = l8.d.o(r0, r5)
            java.lang.String[] r5 = new java.lang.String[]{r6, r5}
            java.lang.String r5 = l8.d.e(r5)
            java.lang.String r6 = "length"
            java.lang.String r7 = l8.d.m(r0, r6)
            java.lang.String r6 = l8.d.o(r0, r6)
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}
            java.lang.String r6 = l8.d.e(r6)
            java.lang.Long r6 = og.t.g0(r6)
            if (r6 == 0) goto L7e
            long r6 = r6.longValue()
            goto L80
        L7e:
            r6 = 0
        L80:
            java.lang.String r8 = "playlength"
            java.lang.String r9 = l8.d.m(r0, r8)
            java.lang.String r0 = l8.d.o(r0, r8)
            java.lang.String[] r0 = new java.lang.String[]{r9, r0}
            java.lang.String r0 = l8.d.e(r0)
            r8 = 10
            java.lang.Integer r0 = og.t.e0(r8, r0)
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
        L9e:
            r8 = r0
            goto La2
        La0:
            r0 = 0
            goto L9e
        La2:
            r1.<init>(r2, r3, r4, r5, r6, r8)
            return r1
    }

    public final boolean isAnnounceAll() {
            r2 = this;
            l8.c r0 = r2.getAtMentionType()
            l8.c r1 = l8.c.f7902j
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isApp() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 49
            if (r0 != r1) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public final boolean isAtMe() {
            r1 = this;
            java.lang.String r0 = r1.selfWxId
            boolean r0 = r1.isAtMe(r0)
            return r0
    }

    public final boolean isAtMe(java.lang.String r4) {
            r3 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r3.getMsgSource()
            java.lang.String r2 = r3.bodyContent()
            r0.getClass()
            l8.c r4 = l8.d.c(r1, r2, r4)
            l8.c r0 = l8.c.f7900h
            if (r4 != r0) goto L17
            r4 = 1
            return r4
        L17:
            r4 = 0
            return r4
    }

    public final boolean isChatroom() {
            r3 = this;
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "@chatroom"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            return r0
    }

    public final boolean isEmoji() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 47
            if (r0 != r1) goto L25
            r0 = 1
            return r0
        L25:
            r0 = 0
            return r0
    }

    public final boolean isFile() {
            r4 = this;
            java.lang.String r0 = r4.bodyContent()
            boolean r1 = r4.isApp()
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            int r1 = r4.appMsgType()
            r3 = 1
            if (r1 <= 0) goto L18
            r0 = 6
            if (r1 != r0) goto L17
            return r3
        L17:
            return r2
        L18:
            java.lang.String r1 = "<fileext>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L32
            java.lang.String r1 = "<filename>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L32
            java.lang.String r1 = "<cdnattachurl>"
            boolean r0 = og.m.h0(r0, r1, r3)
            if (r0 == 0) goto L31
            goto L32
        L31:
            return r2
        L32:
            return r3
    }

    public final boolean isFromGroup() {
            r1 = this;
            boolean r0 = r1.isGroupChat()
            return r0
    }

    public final boolean isGroupChat() {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.talker
            r0.getClass()
            boolean r0 = l8.d.g(r1)
            return r0
    }

    public final boolean isImChatroom() {
            r3 = this;
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "@im.chatroom"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            return r0
    }

    public final boolean isImage() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 3
            if (r0 != r1) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }

    public final boolean isIncoming() {
            r1 = this;
            int r0 = r1.isSend
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isLink() {
            r2 = this;
            boolean r0 = r2.isApp()
            if (r0 == 0) goto L16
            int r0 = r2.appMsgType()
            r1 = 4
            if (r0 == r1) goto L14
            int r0 = r2.appMsgType()
            r1 = 5
            if (r0 != r1) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final boolean isLocation() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 48
            if (r0 != r1) goto L25
            r0 = 1
            return r0
        L25:
            r0 = 0
            return r0
    }

    public final boolean isMiniProgram() {
            r2 = this;
            boolean r0 = r2.isApp()
            if (r0 == 0) goto L18
            int r0 = r2.appMsgType()
            r1 = 33
            if (r0 == r1) goto L16
            int r0 = r2.appMsgType()
            r1 = 36
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final boolean isMusic() {
            r2 = this;
            boolean r0 = r2.isApp()
            if (r0 == 0) goto L17
            int r0 = r2.appMsgType()
            r1 = 3
            if (r0 == r1) goto L15
            int r0 = r2.appMsgType()
            r1 = 76
            if (r0 != r1) goto L17
        L15:
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public final boolean isNote() {
            r5 = this;
            java.lang.String r0 = r5.bodyContent()
            boolean r1 = r5.isApp()
            r2 = 0
            if (r1 == 0) goto L25
            int r1 = r5.appMsgType()
            r3 = 53
            r4 = 1
            if (r1 == r3) goto L24
            java.lang.String r1 = "solitaire"
            boolean r1 = og.m.h0(r0, r1, r4)
            if (r1 != 0) goto L24
            java.lang.String r1 = "接龙"
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 == 0) goto L25
        L24:
            return r4
        L25:
            return r2
    }

    public final boolean isNotifyAll() {
            r2 = this;
            l8.c r0 = r2.getAtMentionType()
            l8.c r1 = l8.c.f7901i
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isOfficialAccount() {
            r3 = this;
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "@app"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            if (r0 != 0) goto L21
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "gh_"
            boolean r0 = og.t.d0(r0, r1, r2)
            if (r0 != 0) goto L21
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "newsapp"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L20
            goto L21
        L20:
            return r2
        L21:
            r0 = 1
            return r0
    }

    public final boolean isOpenIM() {
            r3 = this;
            java.lang.String r0 = r3.talker
            java.lang.String r1 = "@openim"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            return r0
    }

    public final boolean isOutgoing() {
            r2 = this;
            int r0 = r2.isSend
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final boolean isPat() {
            r4 = this;
            java.lang.String r0 = r4.bodyContent()
            boolean r1 = r4.isSystem()
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.String r1 = "pattedUser"
            r3 = 1
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L24
            java.lang.String r1 = "pattedusername"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L24
            java.lang.String r1 = "拍了拍"
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 == 0) goto L25
        L24:
            return r3
        L25:
            return r2
    }

    public final boolean isPrivateChat() {
            r1 = this;
            java.lang.String r0 = r1.talker
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L16
            boolean r0 = r1.isGroupChat()
            if (r0 != 0) goto L16
            boolean r0 = r1.isOfficialAccount()
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final boolean isQuote() {
            r4 = this;
            java.lang.String r0 = r4.bodyContent()
            int r1 = r4.appMsgType()
            r2 = 57
            r3 = 1
            if (r1 == r2) goto L28
            java.lang.String r1 = "<refermsg>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L28
            java.lang.String r1 = "<referfromusr>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L28
            java.lang.String r1 = "<refermsgid>"
            boolean r0 = og.m.h0(r0, r1, r3)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            return r0
        L28:
            return r3
    }

    public final boolean isRecalled() {
            r4 = this;
            int r0 = r4.type
            r1 = 10002(0x2712, float:1.4016E-41)
            r2 = 1
            if (r0 == r1) goto L32
            java.lang.String r0 = r4.content
            java.lang.String r1 = "<revokemsg"
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 != 0) goto L32
            java.lang.String r0 = r4.content
            java.lang.String r1 = "revokemsg"
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 != 0) goto L32
            java.lang.String r0 = r4.content
            java.lang.String r1 = "revoke_msg"
            boolean r0 = og.m.h0(r0, r1, r2)
            if (r0 != 0) goto L32
            java.lang.String r0 = r4.content
            java.lang.String r1 = "撤回"
            r3 = 0
            boolean r0 = og.m.h0(r0, r1, r3)
            if (r0 == 0) goto L31
            goto L32
        L31:
            return r3
        L32:
            return r2
    }

    public final boolean isRedBag() {
            r1 = this;
            boolean r0 = r1.isRedPacket()
            return r0
    }

    public final boolean isRedPacket() {
            r5 = this;
            java.lang.String r0 = r5.bodyContent()
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            java.lang.String r1 = "nativeurl"
            java.lang.String r1 = l8.d.o(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            java.lang.String r2 = "receivehongbao"
            r3 = 1
            boolean r4 = og.m.h0(r1, r2, r3)
            if (r4 != 0) goto L58
            java.lang.String r4 = "wxhb"
            boolean r4 = og.m.h0(r1, r4, r3)
            if (r4 != 0) goto L58
            java.lang.String r4 = "hongbao"
            boolean r1 = og.m.h0(r1, r4, r3)
            if (r1 != 0) goto L58
            boolean r1 = og.m.h0(r0, r2, r3)
            if (r1 != 0) goto L58
            java.lang.String r1 = "wxhb_personalreceive"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L58
            java.lang.String r1 = "/hongbao/"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L58
            java.lang.String r1 = "type"
            java.lang.String r0 = l8.d.o(r0, r1)
            java.lang.String r1 = "2001"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L56
            goto L58
        L56:
            r0 = 0
            return r0
        L58:
            return r3
    }

    public final boolean isSend() {
            r1 = this;
            boolean r0 = r1.isOutgoing()
            return r0
    }

    public final boolean isShareCard() {
            r2 = this;
            int r0 = r2.type
            r1 = 42
            if (r0 == r1) goto Ld
            r1 = 66
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public final boolean isSystem() {
            r6 = this;
            int r0 = r6.type
            r1 = 10002(0x2712, float:1.4016E-41)
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r0 > 0) goto L9
            goto L1f
        L9:
            r3 = r0 & 255(0xff, float:3.57E-43)
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            int r5 = r0 >>> 16
            if (r5 != 0) goto L14
            goto L1f
        L14:
            if (r4 == r2) goto L1e
            if (r4 == r1) goto L1e
            if (r3 == 0) goto L1f
            if (r4 != r3) goto L1f
            r0 = r3
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 == r2) goto L26
            if (r0 != r1) goto L24
            goto L26
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            return r0
    }

    public final boolean isText() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 1
            if (r0 != r1) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    public final boolean isTransfer() {
            r4 = this;
            java.lang.String r0 = r4.bodyContent()
            int r1 = r4.appMsgType()
            boolean r2 = r4.isApp()
            r3 = 1
            if (r2 == 0) goto L17
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r1 == r2) goto L4f
            r2 = 2011(0x7db, float:2.818E-42)
            if (r1 == r2) goto L4f
        L17:
            java.lang.String r1 = "<wcpayinfo>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 == 0) goto L50
            java.lang.String r1 = "<transferid>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "<transcationid>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "<transactionid>"
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "transfer_id="
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "trans_id="
            boolean r1 = og.m.h0(r0, r1, r3)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "transferoperation"
            boolean r0 = og.m.h0(r0, r1, r3)
            if (r0 == 0) goto L50
        L4f:
            return r3
        L50:
            r0 = 0
            return r0
    }

    public final boolean isVideo() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 43
            if (r0 != r1) goto L25
            r0 = 1
            return r0
        L25:
            r0 = 0
            return r0
    }

    public final boolean isVideoNumberVideo() {
            r2 = this;
            boolean r0 = r2.isApp()
            if (r0 == 0) goto L17
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.bodyContent()
            r0.getClass()
            boolean r0 = l8.d.h(r1)
            if (r0 == 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public final boolean isVoice() {
            r4 = this;
            int r0 = r4.type
            if (r0 > 0) goto L5
            goto L1f
        L5:
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r0 >>> 16
            if (r3 != 0) goto L10
            goto L1f
        L10:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r3) goto L1e
            r3 = 10002(0x2712, float:1.4016E-41)
            if (r2 == r3) goto L1e
            if (r1 == 0) goto L1f
            if (r2 != r1) goto L1f
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            r1 = 34
            if (r0 != r1) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    public final boolean isVoip() {
            r2 = this;
            int r0 = r2.type
            r1 = 50
            if (r0 == r1) goto L13
            r1 = 1000052(0xf4274, float:1.401371E-39)
            if (r0 == r1) goto L13
            r1 = 1000053(0xf4275, float:1.401373E-39)
            if (r0 != r1) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public final boolean isVoipVideo() {
            r2 = this;
            int r0 = r2.type
            r1 = 1000053(0xf4275, float:1.401373E-39)
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isVoipVoice() {
            r2 = this;
            int r0 = r2.type
            r1 = 50
            if (r0 == r1) goto Le
            r1 = 1000052(0xf4274, float:1.401371E-39)
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public final java.lang.String nativeUrl() {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.bodyContent()
            r0.getClass()
            java.lang.String r0 = "nativeurl"
            java.lang.String r0 = l8.d.o(r1, r0)
            return r0
    }

    public final java.lang.String sendTalker() {
            r5 = this;
            boolean r0 = r5.isOutgoing()
            if (r0 == 0) goto L9
            java.lang.String r0 = r5.talker
            return r0
        L9:
            java.lang.String r0 = r5.content
            java.lang.String r1 = ":\n"
            r2 = 0
            r3 = 6
            int r0 = og.m.r0(r0, r1, r2, r2, r3)
            boolean r1 = r5.isGroupChat()
            if (r1 == 0) goto L72
            if (r0 <= 0) goto L72
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r4 = r5.content
            java.lang.String r0 = r4.substring(r2, r0)
            r1.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
        L2e:
            java.lang.String r1 = "]"
            boolean r1 = og.t.W(r0, r1, r2)
            if (r1 != 0) goto L64
            java.lang.String r1 = ")"
            boolean r1 = og.t.W(r0, r1, r2)
            if (r1 != 0) goto L64
            java.lang.String r1 = ","
            boolean r1 = og.t.W(r0, r1, r2)
            if (r1 != 0) goto L64
            java.lang.String r1 = ";"
            boolean r1 = og.t.W(r0, r1, r2)
            if (r1 == 0) goto L4f
            goto L64
        L4f:
            r1 = 10
            int r1 = og.m.q0(r0, r1, r2, r3)
            if (r1 <= 0) goto L63
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
        L63:
            return r0
        L64:
            r1 = 1
            java.lang.String r0 = og.m.k0(r1, r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L2e
        L72:
            java.lang.String r0 = r5.talker
            return r0
    }

    public final java.lang.String xml() {
            r2 = this;
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r2.bodyContent()
            r0.getClass()
            java.lang.String r0 = l8.d.d(r1)
            return r0
    }
}
