package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptMessageBean extends me.hd.wauxv.data.bean.MsgInfoBean {
    public static final int $stable = 8;
    private final f8.g event;
    private final k8.o observed;
    private final h.Hchat.hooks.api.model.WeChatMessage stored;

    public ScriptMessageBean(f8.g r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    private ScriptMessageBean(f8.g r1, k8.o r2, h.Hchat.hooks.api.model.WeChatMessage r3) {
            r0 = this;
            r0.<init>()
            r0.event = r1
            r0.observed = r2
            r0.stored = r3
            java.lang.String r1 = r0.getXml()
            r0.xml = r1
            java.lang.String r1 = r0.getSender()
            r0.sender = r1
            java.lang.String r1 = r0.getSenderId()
            r0.senderId = r1
            java.lang.String r1 = r0.getSendTalker()
            r0.sendTalker = r1
            java.lang.String r1 = r0.getTalker()
            r0.talker = r1
            java.lang.String r1 = r0.getTalkerId()
            r0.talkerId = r1
            java.lang.String r1 = r0.getContent()
            r0.content = r1
            java.lang.String r1 = r0.getText()
            r0.text = r1
            long r1 = r0.getMsgId()
            r0.msgId = r1
            java.lang.String r1 = r0.getMsgType()
            r0.msgType = r1
            java.lang.String r1 = r0.getType()
            r0.type = r1
            long r1 = r0.getCreateTime()
            r0.createTime = r1
            long r1 = r0.getMsgSvrId()
            r0.msgSvrId = r1
            java.lang.String r1 = r0.getMsgSource()
            r0.msgSource = r1
            java.lang.String r1 = r0.getSelfWxId()
            r0.selfWxId = r1
            java.lang.String r1 = r0.getSource()
            r0.source = r1
            java.lang.String r1 = r0.getKind()
            r0.kind = r1
            java.lang.String r1 = r0.getNativeUrl()
            r0.nativeUrl = r1
            return
    }

    public ScriptMessageBean(h.Hchat.hooks.api.model.WeChatMessage r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r0, r0, r2)
            return
    }

    public ScriptMessageBean(k8.o r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r0, r2, r0)
            return
    }

    private final int callInt(java.lang.Object r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = 0
            r1 = 0
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L29
            r2.getClass()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = r1
        Lf:
            if (r4 >= r3) goto L3a
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L29
            boolean r6 = gg.l.a(r6, r9)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L2b
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L29
            r6.getClass()     // Catch: java.lang.Throwable -> L29
            int r6 = r6.length     // Catch: java.lang.Throwable -> L29
            if (r6 != 0) goto L2b
            r6 = 1
            goto L2c
        L29:
            r8 = move-exception
            goto L49
        L2b:
            r6 = r1
        L2c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L29
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r4 = r4 + 1
            goto Lf
        L3a:
            r5 = r0
        L3b:
            if (r5 == 0) goto L44
            java.lang.Object r9 = r5.invoke(r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 == 0) goto L44
            goto L4e
        L44:
            java.lang.Object r9 = r7.fieldValue(r8, r10)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L49:
            sf.f r9 = new sf.f
            r9.<init>(r8)
        L4e:
            boolean r8 = r9 instanceof sf.f
            if (r8 == 0) goto L53
            goto L54
        L53:
            r0 = r9
        L54:
            boolean r8 = r0 instanceof java.lang.Number
            if (r8 == 0) goto L63
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            if (r8 >= 0) goto L61
            goto L79
        L61:
            r1 = r8
            goto L79
        L63:
            boolean r8 = r0 instanceof java.lang.String
            if (r8 == 0) goto L79
            java.lang.String r0 = (java.lang.String) r0
            r8 = 10
            java.lang.Integer r8 = og.t.e0(r8, r0)
            if (r8 == 0) goto L76
            int r8 = r8.intValue()
            goto L77
        L76:
            r8 = r1
        L77:
            if (r8 >= 0) goto L61
        L79:
            return r1
    }

    private final java.lang.String callString(java.lang.Object r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r0 = ""
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L2c
            r1.getClass()     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = 0
            if (r4 >= r2) goto L3d
            r7 = r1[r4]     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L2c
            boolean r8 = gg.l.a(r8, r11)     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L2e
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L2c
            r8.getClass()     // Catch: java.lang.Throwable -> L2c
            int r8 = r8.length     // Catch: java.lang.Throwable -> L2c
            if (r8 != 0) goto L2e
            r8 = r5
            goto L2f
        L2c:
            r10 = move-exception
            goto L70
        L2e:
            r8 = r3
        L2f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L2c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L3a
            goto L3e
        L3a:
            int r4 = r4 + 1
            goto L10
        L3d:
            r7 = r6
        L3e:
            if (r7 == 0) goto L60
            java.lang.Object r11 = r7.invoke(r10, r6)     // Catch: java.lang.Throwable -> L2c
            if (r11 == 0) goto L60
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2c
            if (r11 == 0) goto L60
            boolean r1 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L2c
            r1 = r1 ^ r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L5c
            goto L5d
        L5c:
            r11 = r6
        L5d:
            if (r11 == 0) goto L60
            goto L75
        L60:
            java.lang.Object r10 = r9.fieldValue(r10, r12)     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L6a
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L2c
        L6a:
            if (r6 != 0) goto L6e
            r11 = r0
            goto L75
        L6e:
            r11 = r6
            goto L75
        L70:
            sf.f r11 = new sf.f
            r11.<init>(r10)
        L75:
            boolean r10 = r11 instanceof sf.f
            if (r10 == 0) goto L7a
            goto L7b
        L7a:
            r0 = r11
        L7b:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private final h.Hchat.hooks.api.model.WeChatQuoteMsg fallbackQuoteMsg() {
            r11 = this;
            java.lang.String r2 = r11.getContent()
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1 = r0
            java.lang.String r0 = r11.getTalker()
            r3 = r1
            java.lang.String r1 = r11.getSender()
            r5 = r3
            long r3 = r11.getCreateTime()
            r6 = r5
            boolean r5 = r11.isSend()
            long r7 = r11.getMsgSvrId()
            java.lang.String r9 = r11.getMsgSource()
            java.lang.String r10 = r11.getSelfWxId()
            r6.getClass()
            r6 = 0
            h.Hchat.hooks.api.model.WeChatMessage r0 = l8.d.k(r0, r1, r2, r3, r5, r6, r7, r9, r10)
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = r0.getQuoteMsg()
            return r0
    }

    private final java.lang.Object fieldValue(java.lang.Object r8, java.lang.String r9) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
        L4:
            r1 = 0
            if (r0 == 0) goto L43
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L43
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L18:
            if (r4 >= r3) goto L33
            r5 = r2[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = gg.l.a(r6, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L30
            r1 = r5
            goto L33
        L30:
            int r4 = r4 + 1
            goto L18
        L33:
            if (r1 == 0) goto L3e
            r9 = 1
            r1.setAccessible(r9)
            java.lang.Object r8 = r1.get(r8)
            return r8
        L3e:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L43:
            return r1
    }

    private final java.lang.String firstNotBlank(java.lang.String... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L7
            java.lang.String r5 = ""
            return r5
        L7:
            r2 = r5[r1]
            if (r2 == 0) goto L13
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L12
            goto L13
        L12:
            return r2
        L13:
            int r1 = r1 + 1
            goto L2
    }

    private final java.lang.String kindOf(h.Hchat.hooks.api.model.WeChatMessage r6) {
            r5 = this;
            boolean r0 = r6.isRedPacket()
            if (r0 == 0) goto L9
            java.lang.String r6 = "red_packet"
            return r6
        L9:
            boolean r0 = r6.isTransfer()
            if (r0 == 0) goto L12
            java.lang.String r6 = "transfer"
            return r6
        L12:
            boolean r0 = r6.isQuote()
            if (r0 == 0) goto L1b
            java.lang.String r6 = "quote"
            return r6
        L1b:
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L24
            java.lang.String r6 = "file"
            return r6
        L24:
            boolean r0 = r6.isPat()
            if (r0 == 0) goto L2d
            java.lang.String r6 = "pat"
            return r6
        L2d:
            boolean r0 = r6.isLink()
            if (r0 == 0) goto L36
            java.lang.String r6 = "link"
            return r6
        L36:
            boolean r0 = r6.isMusic()
            if (r0 == 0) goto L3f
            java.lang.String r6 = "music"
            return r6
        L3f:
            boolean r0 = r6.isNote()
            if (r0 == 0) goto L48
            java.lang.String r6 = "note"
            return r6
        L48:
            boolean r0 = r6.isVideoNumberVideo()
            if (r0 == 0) goto L51
            java.lang.String r6 = "video_number_video"
            return r6
        L51:
            int r6 = r6.type
            r0 = 10002(0x2712, float:1.4016E-41)
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r6 > 0) goto L5a
            goto L6e
        L5a:
            r2 = r6 & 255(0xff, float:3.57E-43)
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r6
            int r4 = r6 >>> 16
            if (r4 != 0) goto L65
            goto L6e
        L65:
            if (r3 == r1) goto L70
            if (r3 == r0) goto L70
            if (r2 == 0) goto L6e
            if (r3 != r2) goto L6e
            goto L71
        L6e:
            r2 = r6
            goto L71
        L70:
            r2 = r3
        L71:
            r3 = 1
            if (r2 == r3) goto La7
            r3 = 3
            if (r2 == r3) goto La4
            r3 = 34
            if (r2 == r3) goto La1
            r3 = 43
            if (r2 == r3) goto L9e
            if (r2 == r1) goto L9b
            if (r2 == r0) goto L98
            switch(r2) {
                case 47: goto L95;
                case 48: goto L92;
                case 49: goto L8f;
                default: goto L86;
            }
        L86:
            java.lang.String r0 = "unknown("
            java.lang.String r1 = ")"
            java.lang.String r6 = eh.a.m(r6, r0, r1)
            return r6
        L8f:
            java.lang.String r6 = "app"
            return r6
        L92:
            java.lang.String r6 = "location"
            return r6
        L95:
            java.lang.String r6 = "emoji"
            return r6
        L98:
            java.lang.String r6 = "recalled"
            return r6
        L9b:
            java.lang.String r6 = "system"
            return r6
        L9e:
            java.lang.String r6 = "video"
            return r6
        La1:
            java.lang.String r6 = "voice"
            return r6
        La4:
            java.lang.String r6 = "image"
            return r6
        La7:
            java.lang.String r6 = "text"
            return r6
    }

    private final java.lang.String storedSender(h.Hchat.hooks.api.model.WeChatMessage r3) {
            r2 = this;
            java.lang.String r0 = r3.selfWxId
            boolean r1 = r3.isOutgoing()
            if (r1 == 0) goto Lf
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r3 = r3.sendTalker()
            return r3
    }

    private final java.lang.Object toWaImageMsg(java.lang.Object r12) {
            r11 = this;
            if (r12 != 0) goto L4
            r12 = 0
            return r12
        L4:
            boolean r0 = r12 instanceof me.hd.wauxv.data.bean.MsgInfoBean.ImageMsg
            if (r0 == 0) goto L9
            return r12
        L9:
            java.lang.String r0 = "getMd5"
            java.lang.String r1 = "md5"
            java.lang.String r3 = r11.callString(r12, r0, r1)
            java.lang.String r0 = "getBigImgUrl"
            java.lang.String r1 = "bigImgUrl"
            java.lang.String r4 = r11.callString(r12, r0, r1)
            java.lang.String r0 = "getMidImgUrl"
            java.lang.String r1 = "midImgUrl"
            java.lang.String r5 = r11.callString(r12, r0, r1)
            java.lang.String r0 = "getThumbUrl"
            java.lang.String r1 = "thumbUrl"
            java.lang.String r6 = r11.callString(r12, r0, r1)
            java.lang.String r0 = "getKey"
            java.lang.String r1 = "key"
            java.lang.String r0 = r11.callString(r12, r0, r1)
            java.lang.String r1 = "getAesKey"
            java.lang.String r2 = "aesKey"
            java.lang.String r1 = r11.callString(r12, r1, r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r7 = r11.firstNotBlank(r0)
            java.lang.String r0 = "getBigLength"
            java.lang.String r1 = "bigLength"
            int r8 = r11.callInt(r12, r0, r1)
            java.lang.String r0 = "getMidLength"
            java.lang.String r1 = "midLength"
            int r9 = r11.callInt(r12, r0, r1)
            java.lang.String r0 = "getThumbLength"
            java.lang.String r1 = "thumbLength"
            int r10 = r11.callInt(r12, r0, r1)
            me.hd.wauxv.data.bean.MsgInfoBean$ImageMsg r2 = new me.hd.wauxv.data.bean.MsgInfoBean$ImageMsg
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
    }

    public final java.util.List<java.lang.String> getAtUserList() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            java.util.List r0 = r0.getAtUserList()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L1b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L18
            java.util.List r0 = r0.getAtUserList()
            goto L1c
        L18:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L1f
            return r0
        L1f:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r0.getClass()
            return r0
    }

    public final java.lang.String getContent() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.bodyContent()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.f7448e
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            return r0
        L17:
            f8.g r0 = r2.event
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.f3336d
        L1d:
            if (r1 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            return r1
    }

    public final long getCreateTime() {
            r8 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r8.stored
            r1 = 0
            r2 = 1
            r3 = 0
            r5 = 0
            if (r0 == 0) goto L21
            long r6 = r0.createTime
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L15
            r6 = r2
            goto L16
        L15:
            r6 = r1
        L16:
            if (r6 == 0) goto L19
            goto L1a
        L19:
            r0 = r5
        L1a:
            if (r0 == 0) goto L21
            long r0 = r0.longValue()
            return r0
        L21:
            k8.o r0 = r8.observed
            if (r0 == 0) goto L3b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L2e
            long r6 = r0.getCreateTime()
            goto L2f
        L2e:
            r6 = r3
        L2f:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L38
            r1 = r2
        L38:
            if (r1 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r5
        L3c:
            if (r0 == 0) goto L43
            long r0 = r0.longValue()
            return r0
        L43:
            f8.g r0 = r8.event
            if (r0 == 0) goto L4d
            long r0 = r0.f3338f
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L4d:
            if (r5 == 0) goto L54
            long r0 = r5.longValue()
            return r0
        L54:
            return r3
    }

    public final long getCreateTimeSeconds() {
            r4 = this;
            long r0 = r4.getCreateTime()
            r2 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L10
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
        L10:
            return r0
    }

    public final java.lang.Object getFileMsg() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto Lb
            h.Hchat.hooks.api.model.WeChatFileMsg r0 = r0.getFileMsg()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L19
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L19
            h.Hchat.hooks.api.model.WeChatFileMsg r0 = r0.getFileMsg()
            return r0
        L19:
            return r1
    }

    public final java.lang.Object getImageMsg() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto Lb
            h.Hchat.hooks.api.model.WeChatImageMsg r0 = r0.getImageMsg()
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L19
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L19
            h.Hchat.hooks.api.model.WeChatImageMsg r0 = r0.getImageMsg()
            goto L1a
        L19:
            r0 = r1
        L1a:
            java.lang.Object r0 = r2.toWaImageMsg(r0)
            return r0
    }

    public final java.lang.String getKind() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.kindOf(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.f7445b
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            return r0
    }

    public final java.lang.Object getMessage() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L5
            return r0
        L5:
            k8.o r0 = r1.observed
            if (r0 == 0) goto Lc
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final long getMsgId() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L7
            long r0 = r0.msgId
            return r0
        L7:
            k8.o r0 = r3.observed
            r1 = 0
            if (r0 == 0) goto L16
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L16
            long r0 = r0.getMsgId()
            return r0
        L16:
            return r1
    }

    public final java.lang.String getMsgSource() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getMsgSource()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r3.observed
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L1d
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.getMsgSource()
            goto L1e
        L1b:
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 == 0) goto L21
            return r0
        L21:
            f8.g r0 = r3.event
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.f3340h
        L27:
            if (r1 != 0) goto L2a
            return r2
        L2a:
            return r1
    }

    public final long getMsgSvrId() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L7
            long r0 = r0.msgSvrId
            return r0
        L7:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L12
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L12
            long r0 = r0.msgSvrId
            return r0
        L12:
            f8.g r0 = r2.event
            if (r0 == 0) goto L1d
            long r0 = r0.f3339g
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L25
            long r0 = r0.longValue()
            return r0
        L25:
            r0 = 0
            return r0
    }

    public final java.lang.String getMsgType() {
            r5 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r5.stored
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L23
            int r0 = r0.type
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 == 0) goto L23
            int r0 = r4.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L23
            return r0
        L23:
            k8.o r0 = r5.observed
            if (r0 == 0) goto L47
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L30
            int r0 = r0.getType()
            goto L31
        L30:
            r0 = r1
        L31:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L38
            r1 = r2
        L38:
            if (r1 == 0) goto L3b
            goto L3c
        L3b:
            r4 = r3
        L3c:
            if (r4 == 0) goto L47
            int r0 = r4.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L47:
            f8.g r0 = r5.event
            if (r0 == 0) goto L4d
            java.lang.String r3 = r0.f3337e
        L4d:
            if (r3 != 0) goto L52
            java.lang.String r0 = ""
            return r0
        L52:
            return r3
    }

    public final java.lang.String getNativeUrl() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.nativeUrl()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.f7450g
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            return r0
    }

    public final java.lang.Object getPatMsg() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = r0.getPatMsg()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L14
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = r0.b()
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final java.lang.Object getQuoteMsg() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L14
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = r0.getQuoteMsg()
            if (r0 == 0) goto L14
            eb.f0 r1 = h.Hchat.hooks.items.script.ScriptQuoteMsgBean.Companion
            r1.getClass()
            h.Hchat.hooks.items.script.ScriptQuoteMsgBean r0 = eb.f0.a(r0)
            return r0
        L14:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L2f
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L22
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = r0.getQuoteMsg()
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L2f
            eb.f0 r1 = h.Hchat.hooks.items.script.ScriptQuoteMsgBean.Companion
            r1.getClass()
            h.Hchat.hooks.items.script.ScriptQuoteMsgBean r0 = eb.f0.a(r0)
            return r0
        L2f:
            h.Hchat.hooks.api.model.WeChatQuoteMsg r0 = r2.fallbackQuoteMsg()
            if (r0 == 0) goto L3f
            eb.f0 r1 = h.Hchat.hooks.items.script.ScriptQuoteMsgBean.Companion
            r1.getClass()
            h.Hchat.hooks.items.script.ScriptQuoteMsgBean r0 = eb.f0.a(r0)
            return r0
        L3f:
            return r1
    }

    public final java.lang.String getSelfWxId() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.selfWxId
            if (r0 == 0) goto L9
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L14
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.selfWxId
            return r0
        L14:
            f8.g r0 = r1.event
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.f3341i
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L20
            java.lang.String r0 = ""
        L20:
            return r0
    }

    public final java.lang.String getSendTalker() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.storedSender(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.c()
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L18
            return r0
        L18:
            java.lang.String r0 = r1.getSender()
            return r0
    }

    public final java.lang.String getSender() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r2.storedSender(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.f7447d
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            return r0
        L17:
            f8.g r0 = r2.event
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.f3334b
        L1d:
            if (r1 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            return r1
    }

    public final java.lang.String getSenderId() {
            r1 = this;
            java.lang.String r0 = r1.getSendTalker()
            return r0
    }

    public final java.lang.String getSource() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L7
            java.lang.String r0 = "message_db"
            return r0
        L7:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.f7444a
            if (r0 == 0) goto L10
            return r0
        L10:
            f8.g r0 = r1.event
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.f3342j
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1c
            java.lang.String r0 = ""
        L1c:
            return r0
    }

    public final java.lang.Object getStoredMessage() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L5
            return r0
        L5:
            k8.o r0 = r1.observed
            if (r0 == 0) goto Lc
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7453j
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final java.lang.String getTalker() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.talker
            if (r0 == 0) goto L9
            return r0
        L9:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f7446c
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            return r0
        L15:
            f8.g r0 = r2.event
            if (r0 == 0) goto L1b
            java.lang.String r1 = r0.f3335c
        L1b:
            if (r1 != 0) goto L20
            java.lang.String r0 = ""
            return r0
        L20:
            return r1
    }

    public final java.lang.String getTalkerId() {
            r1 = this;
            java.lang.String r0 = r1.getTalker()
            return r0
    }

    public final java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.getContent()
            return r0
    }

    public final java.lang.Object getTransferMsg() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            h.Hchat.hooks.api.model.WeChatTransferMsg r0 = r0.getTransferMsg()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            h.Hchat.hooks.api.model.WeChatTransferMsg r0 = r0.f7459p
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.getMsgType()
            return r0
    }

    public final java.lang.Object getVideoMsg() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto Lb
            h.Hchat.hooks.api.model.WeChatVideoMsg r0 = r0.getVideoMsg()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L18
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L18
            h.Hchat.hooks.api.model.WeChatVideoMsg r0 = r0.getVideoMsg()
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final java.lang.String getXml() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.xml()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.f7449f
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            return r0
        L17:
            f8.g r0 = r2.event
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.f3333a
        L1d:
            if (r1 != 0) goto L22
            java.lang.String r0 = ""
            return r0
        L22:
            return r1
    }

    public final boolean isAnnounceAll() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isAnnounceAll()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.e()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isApp() {
            r1 = this;
            boolean r0 = r1.isAppMsg()
            return r0
    }

    public final boolean isAppMsg() {
            r5 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r5.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isApp()
            return r0
        L9:
            k8.o r0 = r5.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.f()
            return r0
        L12:
            java.lang.String r0 = r5.getMsgType()
            java.lang.Integer r0 = og.t.f0(r0)
            r1 = 0
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 > 0) goto L26
            goto L40
        L26:
            r2 = r0 & 255(0xff, float:3.57E-43)
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            int r4 = r0 >>> 16
            if (r4 != 0) goto L31
            goto L40
        L31:
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r3 == r4) goto L3f
            r4 = 10002(0x2712, float:1.4016E-41)
            if (r3 == r4) goto L3f
            if (r2 == 0) goto L40
            if (r3 != r2) goto L40
            r0 = r2
            goto L40
        L3f:
            r0 = r3
        L40:
            r2 = 49
            if (r0 != r2) goto L45
            r1 = 1
        L45:
            return r1
    }

    public final boolean isAtMe() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isAtMe()
            return r0
        L9:
            k8.o r0 = r4.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.g()
            return r0
        L12:
            java.lang.String r0 = r4.getSelfWxId()
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r2 = r4.getMsgSource()
            java.lang.String r3 = r4.getContent()
            r1.getClass()
            l8.c r0 = l8.d.c(r2, r3, r0)
            l8.c r1 = l8.c.f7900h
            if (r0 != r1) goto L2d
            r0 = 1
            return r0
        L2d:
            r0 = 0
            return r0
    }

    public final boolean isChatroom() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isChatroom()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L1b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L19
            boolean r0 = r0.isChatroom()
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
        L1b:
            boolean r0 = r1.isGroupChat()
            return r0
    }

    public final boolean isEmoji() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isEmoji()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.h()
            return r0
        L12:
            java.lang.String r0 = r2.getMsgType()
            java.lang.String r1 = "47"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isFile() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isFile()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.i()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isGroupChat() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isGroupChat()
            return r0
        L9:
            k8.o r0 = r3.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.j()
            return r0
        L12:
            java.lang.String r0 = r3.getTalker()
            java.lang.String r1 = "@chatroom"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            return r0
    }

    public final boolean isImChatroom() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isImChatroom()
            return r0
        L9:
            k8.o r0 = r3.observed
            r1 = 0
            if (r0 == 0) goto L1b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isImChatroom()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            return r1
        L1b:
            java.lang.String r0 = r3.getTalker()
            java.lang.String r2 = "@im.chatroom"
            boolean r0 = og.t.W(r0, r2, r1)
            return r0
    }

    public final boolean isImage() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isImage()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.k()
            return r0
        L12:
            java.lang.String r0 = r2.getMsgType()
            java.lang.String r1 = "3"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isLink() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isLink()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.l()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isLocation() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isLocation()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.m()
            return r0
        L12:
            java.lang.String r0 = r2.getMsgType()
            java.lang.String r1 = "48"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isMusic() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isMusic()
            return r0
        L9:
            k8.o r0 = r4.observed
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = "music"
            java.lang.String r3 = r0.f7445b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L23
            boolean r0 = r0.isMusic()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r0 = 1
            return r0
        L26:
            return r1
    }

    public final boolean isNote() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isNote()
            return r0
        L9:
            k8.o r0 = r4.observed
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = "note"
            java.lang.String r3 = r0.f7445b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L23
            boolean r0 = r0.isNote()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r0 = 1
            return r0
        L26:
            return r1
    }

    public final boolean isNotifyAll() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isNotifyAll()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.n()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isOfficialAccount() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isOfficialAccount()
            return r0
        L9:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isOfficialAccount()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            return r1
    }

    public final boolean isOpenIM() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isOpenIM()
            return r0
        L9:
            k8.o r0 = r3.observed
            r1 = 0
            if (r0 == 0) goto L1b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isOpenIM()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            return r1
        L1b:
            java.lang.String r0 = r3.getTalker()
            java.lang.String r2 = "@openim"
            boolean r0 = og.t.W(r0, r2, r1)
            return r0
    }

    public final boolean isPat() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isPat()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.o()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isPrivateChat() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isPrivateChat()
            return r0
        L9:
            k8.o r0 = r3.observed
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isPrivateChat()
            if (r0 == 0) goto L1a
            return r2
        L1a:
            return r1
        L1b:
            boolean r0 = r3.isGroupChat()
            if (r0 != 0) goto L22
            return r2
        L22:
            return r1
    }

    public final boolean isQuote() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isQuote()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.p()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isRecalled() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isRecalled()
            return r0
        L9:
            k8.o r0 = r4.observed
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = "recalled"
            java.lang.String r3 = r0.f7445b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L23
            boolean r0 = r0.isRecalled()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r0 = 1
            return r0
        L26:
            return r1
    }

    public final boolean isRedBag() {
            r1 = this;
            boolean r0 = r1.isRedPacket()
            return r0
    }

    public final boolean isRedPacket() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isRedPacket()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L16
            java.lang.String r1 = "red_packet"
            java.lang.String r0 = r0.f7445b
            boolean r0 = r1.equals(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final boolean isSelf() {
            r1 = this;
            boolean r0 = r1.isSend()
            return r0
    }

    public final boolean isSend() {
            r3 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isSend()
            return r0
        L9:
            k8.o r0 = r3.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.q()
            return r0
        L12:
            f8.g r0 = r3.event
            if (r0 == 0) goto L31
            boolean r0 = r0.f3343k
            if (r0 == 0) goto L1b
            goto L2f
        L1b:
            java.lang.String r0 = r3.getSelfWxId()
            java.lang.String r1 = r3.getSender()
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L31
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L31
        L2f:
            r0 = 1
            return r0
        L31:
            r0 = 0
            return r0
    }

    public final boolean isShareCard() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isShareCard()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.r()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isSystem() {
            r7 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r7.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isSystem()
            return r0
        L9:
            k8.o r0 = r7.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.s()
            return r0
        L12:
            java.lang.String r0 = r7.getMsgType()
            java.lang.Integer r0 = og.t.f0(r0)
            r1 = 0
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            goto L23
        L22:
            r0 = r1
        L23:
            r2 = 10002(0x2712, float:1.4016E-41)
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r0 > 0) goto L2a
            goto L40
        L2a:
            r4 = r0 & 255(0xff, float:3.57E-43)
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r6 = r0 >>> 16
            if (r6 != 0) goto L35
            goto L40
        L35:
            if (r5 == r3) goto L3f
            if (r5 == r2) goto L3f
            if (r4 == 0) goto L40
            if (r5 != r4) goto L40
            r0 = r4
            goto L40
        L3f:
            r0 = r5
        L40:
            if (r0 == r3) goto L44
            if (r0 != r2) goto L45
        L44:
            r1 = 1
        L45:
            return r1
    }

    public final boolean isText() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isText()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L16
            java.lang.String r1 = "text"
            java.lang.String r0 = r0.f7445b
            boolean r0 = r1.equals(r0)
            return r0
        L16:
            java.lang.String r0 = r2.getMsgType()
            java.lang.String r1 = "1"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isTransfer() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isTransfer()
            return r0
        L9:
            k8.o r0 = r4.observed
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = "transfer"
            java.lang.String r3 = r0.f7445b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L23
            boolean r0 = r0.isTransfer()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r0 = 1
            return r0
        L26:
            return r1
    }

    public final boolean isVideo() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.isVideo()
            if (r3 != 0) goto L14
            int r0 = r0.type
            r3 = 62
            if (r0 != r3) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.booleanValue()
            return r0
        L1d:
            k8.o r0 = r4.observed
            if (r0 == 0) goto L26
            boolean r0 = r0.t()
            return r0
        L26:
            java.lang.String r0 = r4.getMsgType()
            java.lang.String r3 = "43"
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto L40
            java.lang.String r0 = r4.getMsgType()
            java.lang.String r3 = "62"
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return r2
        L40:
            return r1
    }

    public final boolean isVideoNumberVideo() {
            r4 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isVideoNumberVideo()
            return r0
        L9:
            k8.o r0 = r4.observed
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.String r2 = "video_number_video"
            java.lang.String r3 = r0.f7445b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L23
            boolean r0 = r0.isVideoNumberVideo()
            if (r0 == 0) goto L23
            goto L24
        L23:
            return r1
        L24:
            r0 = 1
            return r0
        L26:
            return r1
    }

    public final boolean isVoice() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoice()
            return r0
        L9:
            k8.o r0 = r2.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.u()
            return r0
        L12:
            java.lang.String r0 = r2.getMsgType()
            java.lang.String r1 = "34"
            boolean r0 = gg.l.a(r0, r1)
            return r0
    }

    public final boolean isVoip() {
            r1 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r1.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoip()
            return r0
        L9:
            k8.o r0 = r1.observed
            if (r0 == 0) goto L12
            boolean r0 = r0.v()
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean isVoipVideo() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoipVideo()
            return r0
        L9:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isVoipVideo()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            return r1
    }

    public final boolean isVoipVoice() {
            r2 = this;
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.stored
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoipVoice()
            return r0
        L9:
            k8.o r0 = r2.observed
            r1 = 0
            if (r0 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.f7454k
            if (r0 == 0) goto L1a
            boolean r0 = r0.isVoipVoice()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            return r1
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = r8.getTalker()
            java.lang.String r1 = r8.getSender()
            java.lang.String r2 = r8.getMsgType()
            boolean r3 = r8.isSend()
            java.lang.String r4 = r8.getContent()
            java.lang.String r5 = ", sender="
            java.lang.String r6 = ", type="
            java.lang.String r7 = "ScriptMessageBean(talker="
            java.lang.StringBuilder r0 = bc.e.p(r7, r0, r5, r1, r6)
            r0.append(r2)
            java.lang.String r1 = ", send="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r0 = eh.a.r(r0, r4, r1)
            return r0
    }
}
