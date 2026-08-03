package io.github.cherrywechat.lua.api;

import android.content.ContentValues;
import io.github.cherrywechat.lua.LuaLocks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0378Ir;
import p000.C0525M8;
import p000.C0693Q4;
import p000.C0829TC;
import p000.C1355e9;
import p000.C1389f;
import p000.C2703x8;
import p000.C2746y8;
import p000.InterfaceC1416fj;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class MessageAPI {
    public static final MessageAPI INSTANCE = null;
    private static final String TAG = null;
    private static final CopyOnWriteArrayList<MessageCallback> messageCallbacks = null;

    public static final class MessageCallback {
        private final int funcRef;
        private final Lua lua;

        public MessageCallback(Lua r3, int r4) {
            AbstractC0295Gu.m625r(-297662708447285L);
            this.lua = r3;
            this.funcRef = r4;
        }

        public static /* synthetic */ MessageCallback copy$default(MessageCallback r0, Lua r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.lua;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.funcRef;
        L9:
            return r0.copy(r1, r2);
        }

        public final Lua component1() {
            return this.lua;
        }

        public final int component2() {
            return this.funcRef;
        }

        public final MessageCallback copy(Lua r3, int r4) {
            AbstractC0295Gu.m625r(-297679888316469L);
            return new MessageCallback(r3, r4);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof MessageCallback) == true) goto L8;
            return false;
        L8:
            MessageCallback r52 = (MessageCallback) r5;
            if (AbstractC0585Nj.m1134a(this.lua, r52.lua) == true) goto L12;
            return false;
        L12:
            if (this.funcRef == r52.funcRef) goto L14;
            return false;
        L14:
            return true;
        }

        public final int getFuncRef() {
            return this.funcRef;
        }

        public final Lua getLua() {
            return this.lua;
        }

        public int hashCode() {
            int r0 = this.lua.hashCode() * 31;
            return Integer.hashCode(this.funcRef) + r0;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-296047800743989L));
            r0.append(this.lua);
            r0.append(AbstractC0295Gu.m625r(-296137995057205L));
            return AbstractC0213Ey.m408f(r0, this.funcRef, ')');
        }
    }

    public static final class MessageData {
        public static final Companion Companion = null;
        public static final int TALKER_ENTERPRISE = 3;
        public static final int TALKER_GROUP = 1;
        public static final int TALKER_OFFICIAL = 2;
        public static final int TALKER_PRIVATE = 0;
        public static final int TYPE_CARD = 49;
        public static final int TYPE_EMOJI = 47;
        public static final int TYPE_FILE = 1090519089;
        public static final int TYPE_IMAGE = 3;
        public static final int TYPE_NEW_YEAR_RED = 469762097;
        public static final int TYPE_RED_PACKET = 436207665;
        public static final int TYPE_REPLY = 822083633;
        public static final int TYPE_TEXT = 1;
        public static final int TYPE_TIP = 10000;
        public static final int TYPE_TRANSFER = 419430449;
        public static final int TYPE_VIDEO = 43;
        public static final int TYPE_VOICE = 34;
        private final String content;
        private final long createTime;
        private final int isSend;
        private final long msgId;
        private final String sendTalker;
        private final String talker;
        private final int talkerId;
        private final int talkerType;
        private final int type;
        private final ContentValues values;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC0621Oc r1) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Companion = new Companion(null);
        }

        public MessageData(String r3, String r4, int r5, int r6, int r7, long r8, long r10, String r12, int r13, ContentValues r14) {
            AbstractC0295Gu.m625r(-296185239697461L);
            AbstractC0295Gu.m625r(-296215304468533L);
            AbstractC0295Gu.m625r(-296262549108789L);
            this.talker = r3;
            this.sendTalker = r4;
            this.isSend = r5;
            this.talkerId = r6;
            this.type = r7;
            this.msgId = r8;
            this.createTime = r10;
            this.content = r12;
            this.talkerType = r13;
            this.values = r14;
        }

        public static /* synthetic */ MessageData copy$default(MessageData r0, String r1, String r2, int r3, int r4, int r5, long r6, long r8, String r10, int r11, ContentValues r12, int r13, Object r14) {
            if ((r13 & 1) == 0) goto L6;
            r1 = r0.talker;
        L6:
            if ((r13 & 2) == 0) goto L9;
            r2 = r0.sendTalker;
        L9:
            if ((r13 & 4) == 0) goto L12;
            r3 = r0.isSend;
        L12:
            if ((r13 & 8) == 0) goto L15;
            r4 = r0.talkerId;
        L15:
            if ((r13 & 16) == 0) goto L18;
            r5 = r0.type;
        L18:
            if ((r13 & 32) == 0) goto L21;
            r6 = r0.msgId;
        L21:
            if ((r13 & 64) == 0) goto L24;
            r8 = r0.createTime;
        L24:
            if ((r13 & 128) == 0) goto L27;
            r10 = r0.content;
        L27:
            if ((r13 & 256) == 0) goto L30;
            r11 = r0.talkerType;
        L30:
            if ((r13 & 512) == 0) goto L32;
            r12 = r0.values;
        L32:
            ContentValues r142 = r12;
            String r122 = r10;
            long r102 = r8;
            long r82 = r6;
            int r62 = r4;
            int r7 = r5;
            String r42 = r2;
            int r52 = r3;
            String r32 = r1;
            return r0.copy(r32, r42, r52, r62, r7, r82, r102, r122, r11, r142);
        }

        public final String component1() {
            return this.talker;
        }

        public final ContentValues component10() {
            return this.values;
        }

        public final String component2() {
            return this.sendTalker;
        }

        public final int component3() {
            return this.isSend;
        }

        public final int component4() {
            return this.talkerId;
        }

        public final int component5() {
            return this.type;
        }

        public final long component6() {
            return this.msgId;
        }

        public final long component7() {
            return this.createTime;
        }

        public final String component8() {
            return this.content;
        }

        public final int component9() {
            return this.talkerType;
        }

        public final MessageData copy(String r16, String r17, int r18, int r19, int r20, long r21, long r23, String r25, int r26, ContentValues r27) {
            AbstractC0295Gu.m625r(-296296908847157L);
            AbstractC0295Gu.m625r(-295777217804341L);
            AbstractC0295Gu.m625r(-295824462444597L);
            return new MessageData(r16, r17, r18, r19, r20, r21, r23, r25, r26, r27);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof MessageData) == true) goto L8;
            return false;
        L8:
            MessageData r82 = (MessageData) r8;
            if (AbstractC0585Nj.m1134a(this.talker, r82.talker) == true) goto L12;
            return false;
        L12:
            if (AbstractC0585Nj.m1134a(this.sendTalker, r82.sendTalker) == true) goto L15;
            return false;
        L15:
            if (this.isSend == r82.isSend) goto L18;
            return false;
        L18:
            if (this.talkerId == r82.talkerId) goto L21;
            return false;
        L21:
            if (this.type == r82.type) goto L24;
            return false;
        L24:
            if (this.msgId == r82.msgId) goto L27;
            return false;
        L27:
            if (this.createTime == r82.createTime) goto L30;
            return false;
        L30:
            if (AbstractC0585Nj.m1134a(this.content, r82.content) == true) goto L33;
            return false;
        L33:
            if (this.talkerType == r82.talkerType) goto L36;
            return false;
        L36:
            if (AbstractC0585Nj.m1134a(this.values, r82.values) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public final String getContent() {
            return this.content;
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        public final long getMsgId() {
            return this.msgId;
        }

        public final String getSendTalker() {
            return this.sendTalker;
        }

        public final String getTalker() {
            return this.talker;
        }

        public final int getTalkerId() {
            return this.talkerId;
        }

        public final int getTalkerType() {
            return this.talkerType;
        }

        public final int getType() {
            return this.type;
        }

        public final ContentValues getValues() {
            return this.values;
        }

        public int hashCode() {
            int r0 = this.talker.hashCode() * 31;
            int r02 = AbstractC2374ph.m4810g(this.sendTalker, r0, 31);
            int r03 = AbstractC0213Ey.m403a(this.isSend, r02, 31);
            int r04 = AbstractC0213Ey.m403a(this.talkerId, r03, 31);
            int r05 = AbstractC0213Ey.m403a(this.type, r04, 31);
            int r2 = (Long.hashCode(this.msgId) + r05) * 31;
            int r06 = (Long.hashCode(this.createTime) + r2) * 31;
            int r07 = AbstractC2374ph.m4810g(this.content, r06, 31);
            int r08 = AbstractC0213Ey.m403a(this.talkerType, r07, 31);
            ContentValues r1 = this.values;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r08 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public final boolean isCard() {
            if (this.type != 49) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isEmoji() {
            if (this.type != 47) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isEnterprise() {
            if (this.talkerType != 3) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isFile() {
            if (this.type != 1090519089) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isGroupChat() {
            if (this.talkerType != 1) goto L5;
            return true;
        L5:
            return false;
        }

        public final boolean isImage() {
            if (this.type != 3) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isOfficialAccount() {
            if (this.talkerType != 2) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isPrivateChat() {
            if (this.talkerType != 0) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isRedPacket() {
            int r0 = this.type;
            if (r0 != 436207665) goto L5;
            return true;
        L5:
            if (r0 == 469762097) goto L11;
            return false;
        L11:
            return true;
        }

        public final boolean isReply() {
            if (this.type != 822083633) goto L6;
            return true;
        L6:
            return false;
        }

        public final int isSend() {
            return this.isSend;
        }

        public final boolean isText() {
            if (this.type != 1) goto L5;
            return true;
        L5:
            return false;
        }

        public final boolean isTip() {
            if (this.type != 10000) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isTransfer() {
            if (this.type != 419430449) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isVideo() {
            if (this.type != 43) goto L6;
            return true;
        L6:
            return false;
        }

        public final boolean isVoice() {
            if (this.type != 34) goto L6;
            return true;
        L6:
            return false;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-295858822182965L));
            AbstractC2374ph.m4817n(r0, this.talker, -295944721528885L);
            AbstractC2374ph.m4817n(r0, this.sendTalker, -296004851071029L);
            AbstractC0213Ey.m418p(r0, this.isSend, -296597556557877L);
            AbstractC0213Ey.m418p(r0, this.talkerId, -296649096165429L);
            AbstractC0213Ey.m418p(r0, this.type, -296683455903797L);
            r0.append(this.msgId);
            r0.append(AbstractC0295Gu.m625r(-296722110609461L));
            r0.append(this.createTime);
            r0.append(AbstractC0295Gu.m625r(-296782240151605L));
            AbstractC2374ph.m4817n(r0, this.content, -296829484791861L);
            AbstractC0213Ey.m418p(r0, this.talkerType, -296339858520117L);
            r0.append(this.values);
            r0.append(')');
            return r0.toString();
        }

        /* JADX INFO: renamed from: isSend, reason: collision with other method in class */
        public final boolean m5467isSend() {
            if (this.isSend != 1) goto L5;
            return true;
        L5:
            return false;
        }

        public /* synthetic */ MessageData(String r15, String r16, int r17, int r18, int r19, long r20, long r22, String r24, int r25, ContentValues r26, int r27, AbstractC0621Oc r28) {
            if ((r27 & 512) == 0) goto L6;
            ContentValues r13 = null;
        L7:
            this(r15, r16, r17, r18, r19, r20, r22, r24, r25, r13);
            return;
        L6:
            r13 = r26;
            goto L7
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-342798519760949L);
        INSTANCE = new MessageAPI();
        messageCallbacks = new CopyOnWriteArrayList();
    }

    private MessageAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m3435A(C2703x8 r0, Object r1) {
        return register$lambda$14$lambda$13(r0, r1);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m3436B(Lua r0) {
        return register$lambda$11(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m3437C(int r0, MessageCallback r1) {
        return register$lambda$14$lambda$12(r0, r1);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m3438D(MessageData r0, Lua r1) {
        return pushMessageData$lambda$30(r0, r1);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ int m3439E(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m3440F(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ C0829TC m3441G(Lua r0, MessageCallback r1) {
        return cleanupFor$lambda$36$lambda$35(r0, r1);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m3442H(MessageData r0, Lua r1) {
        return pushMessageData$lambda$26(r0, r1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m3443I(MessageData r0, Lua r1) {
        return pushMessageData$lambda$29(r0, r1);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3444a(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3445b(MessageData r0, Lua r1) {
        return pushMessageData$lambda$27(r0, r1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3446c(Lua r0) {
        return register$lambda$6(r0);
    }

    private static final C0829TC cleanup$lambda$38$lambda$37(MessageCallback r1) {
        r1.getLua().unref(r1.getFuncRef());
        return C0829TC.f2620a;
    }

    private static final C0829TC cleanupFor$lambda$36$lambda$35(Lua r0, MessageCallback r1) {
        r0.unref(r1.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3447d(MessageData r0, Lua r1) {
        return pushMessageData$lambda$22(r0, r1);
    }

    private static final C0829TC dispatchMessage$lambda$17(Lua r0, MessageCallback r1, MessageData r2) {
        r0.refGet(r1.getFuncRef());
        INSTANCE.pushMessageData(r0, r2);
        r0.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0829TC m3448e(MessageCallback r0) {
        return cleanup$lambda$38$lambda$37(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3449f(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3450g(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3451h(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3452i(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3453j(MessageData r0, Lua r1) {
        return pushMessageData$lambda$24(r0, r1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C0829TC m3454k(Lua r0, MessageCallback r1, MessageData r2) {
        return dispatchMessage$lambda$17(r0, r1, r2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3455l(MessageData r0, Lua r1) {
        return pushMessageData$lambda$20(r0, r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3456m(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3457n(MessageData r0, Lua r1) {
        return pushMessageData$lambda$31(r0, r1);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3458o(MessageData r0, Lua r1) {
        return pushMessageData$lambda$32(r0, r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3459p(MessageData r0, Lua r1) {
        return pushMessageData$lambda$19(r0, r1);
    }

    private final void pushMessageData(Lua r5, final MessageData r6) {
        r5.createTable(0, 15);
        r5.push(r6.getTalker());
        r5.setField(-2, AbstractC0295Gu.m625r(-293775763044405L));
        r5.push(r6.getSendTalker());
        r5.setField(-2, AbstractC0295Gu.m625r(-293805827815477L));
        r5.push(Double.valueOf(r6.isSend()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294402828269621L));
        r5.push(Double.valueOf(r6.getTalkerId()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294432893040693L));
        r5.push(Double.valueOf(r6.getType()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294471547746357L));
        r5.push(Double.valueOf(r6.getMsgId()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294493022582837L));
        r5.push(Double.valueOf(r6.getCreateTime()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294518792386613L));
        r5.push(r6.getContent());
        r5.setField(-2, AbstractC0295Gu.m625r(-294566037026869L));
        r5.push(Double.valueOf(r6.getTalkerType()));
        r5.setField(-2, AbstractC0295Gu.m625r(-294600396765237L));
        final int r2 = 8;
        r5.push(new C0378Ir(r6, r2));
        r5.setField(-2, AbstractC0295Gu.m625r(-294647641405493L));
        final int r22 = 15;
        r5.push(new C0378Ir(r6, r22));
        r5.setField(-2, AbstractC0295Gu.m625r(-294158015133749L));
        final int r23 = 0;
        r5.push(new C0378Ir(r6, r23));
        r5.setField(-2, AbstractC0295Gu.m625r(-294209554741301L));
        final int r24 = 1;
        r5.push(new C0378Ir(r6, r24));
        r5.setField(-2, AbstractC0295Gu.m625r(-294286864152629L));
        final int r25 = 2;
        r5.push(new C0378Ir(r6, r25));
        r5.setField(-2, AbstractC0295Gu.m625r(-294342698727477L));
        final int r26 = 3;
        r5.push(new C0378Ir(r6, r26));
        r5.setField(-2, AbstractC0295Gu.m625r(-294389943367733L));
        final int r27 = 4;
        r5.push(new C0378Ir(r6, r27));
        r5.setField(-2, AbstractC0295Gu.m625r(-292770740697141L));
        final int r28 = 5;
        r5.push(new C0378Ir(r6, r28));
        r5.setField(-2, AbstractC0295Gu.m625r(-292805100435509L));
        final int r29 = 6;
        r5.push(new C0378Ir(r6, r29));
        r5.setField(-2, AbstractC0295Gu.m625r(-292839460173877L));
        final int r210 = 7;
        r5.push(new C0378Ir(r6, r210));
        r5.setField(-2, AbstractC0295Gu.m625r(-292873819912245L));
        final int r211 = 9;
        r5.push(new C0378Ir(r6, r211));
        r5.setField(-2, AbstractC0295Gu.m625r(-292908179650613L));
        final int r212 = 10;
        r5.push(new C0378Ir(r6, r212));
        r5.setField(-2, AbstractC0295Gu.m625r(-292938244421685L));
        final int r213 = 11;
        r5.push(new C0378Ir(r6, r213));
        r5.setField(-2, AbstractC0295Gu.m625r(-292964014225461L));
        final int r214 = 12;
        r5.push(new C0378Ir(r6, r214));
        r5.setField(-2, AbstractC0295Gu.m625r(-293011258865717L));
        final int r215 = 13;
        r5.push(new C0378Ir(r6, r215));
        r5.setField(-2, AbstractC0295Gu.m625r(-292513042659381L));
        final int r216 = 14;
        r5.push(new C0378Ir(r6, r216));
        r5.setField(-2, AbstractC0295Gu.m625r(-292547402397749L));
    }

    private static final int pushMessageData$lambda$18(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342111324993589L);
        r3.push(r2.isPrivateChat());
        return 1;
    }

    private static final int pushMessageData$lambda$19(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342119914928181L);
        r3.push(r2.isGroupChat());
        return 1;
    }

    private static final int pushMessageData$lambda$20(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342128504862773L);
        r3.push(r2.isOfficialAccount());
        return 1;
    }

    private static final int pushMessageData$lambda$21(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342137094797365L);
        r3.push(r2.isEnterprise());
        return 1;
    }

    private static final int pushMessageData$lambda$22(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342145684731957L);
        r3.push(r2.m5467isSend());
        return 1;
    }

    private static final int pushMessageData$lambda$23(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342154274666549L);
        r3.push(r2.isText());
        return 1;
    }

    private static final int pushMessageData$lambda$24(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342162864601141L);
        r3.push(r2.isImage());
        return 1;
    }

    private static final int pushMessageData$lambda$25(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342171454535733L);
        r3.push(r2.isVoice());
        return 1;
    }

    private static final int pushMessageData$lambda$26(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342180044470325L);
        r3.push(r2.isVideo());
        return 1;
    }

    private static final int pushMessageData$lambda$27(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342188634404917L);
        r3.push(r2.isEmoji());
        return 1;
    }

    private static final int pushMessageData$lambda$28(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342197224339509L);
        r3.push(r2.isCard());
        return 1;
    }

    private static final int pushMessageData$lambda$29(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342205814274101L);
        r3.push(r2.isTip());
        return 1;
    }

    private static final int pushMessageData$lambda$30(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342214404208693L);
        r3.push(r2.isTransfer());
        return 1;
    }

    private static final int pushMessageData$lambda$31(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342222994143285L);
        r3.push(r2.isRedPacket());
        return 1;
    }

    private static final int pushMessageData$lambda$32(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342781339891765L);
        r3.push(r2.isReply());
        return 1;
    }

    private static final int pushMessageData$lambda$33(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-342789929826357L);
        r3.push(r2.isFile());
        return 1;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3460q(Lua r0) {
        return register$lambda$14(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3461r(MessageData r0, Lua r1) {
        return pushMessageData$lambda$23(r0, r1);
    }

    private static final int register$lambda$0(Lua r3) {
        AbstractC0295Gu.m625r(-293522359973941L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-293530949908533L);
        AbstractC0295Gu.m625r(-293028438734901L);
        AbstractC0295Gu.m625r(-293071388407861L);
        AbstractC0295Gu.m625r(-293084273309749L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$1(Lua r3) {
        AbstractC0295Gu.m625r(-293213122328629L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-293221712263221L);
        AbstractC0295Gu.m625r(-293268956903477L);
        AbstractC0295Gu.m625r(-291666934102069L);
        AbstractC0295Gu.m625r(-291679819003957L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$10(Lua r3) {
        AbstractC0295Gu.m625r(-291001214171189L);
        r3.toNumber(1);
        AbstractC0295Gu.m625r(-291009804105781L);
        AbstractC0295Gu.m625r(-291057048746037L);
        AbstractC0295Gu.m625r(-291091408484405L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$11(Lua r4) {
        AbstractC0295Gu.m625r(-342347548194869L);
        if (r4.isFunction(1) == true) goto L6;
        r4.push(Double.valueOf(-1.0d));
        return 1;
    L6:
        r4.pushValue(1);
        int r1 = r4.ref();
        messageCallbacks.add(new MessageCallback(r4, r1));
        r4.push(Double.valueOf(r1));
        AbstractC0295Gu.m625r(-342356138129461L);
        AbstractC0295Gu.m625r(-342403382769717L);
        return 1;
    }

    private static final int register$lambda$14(Lua r6) {
        AbstractC0295Gu.m625r(-341952411203637L);
        int r1 = (int) r6.toNumber(1);
        boolean r2 = messageCallbacks.removeIf(new C2746y8(new C2703x8(r1, 1), 1));
        if (r2 == false) goto L5;
        r6.unref(r1);
    L5:
        r6.push(r2);
        return 1;
    }

    private static final boolean register$lambda$14$lambda$12(int r0, MessageCallback r1) {
        if (r1.getFuncRef() != r0) goto L6;
        return true;
    L6:
        return false;
    }

    private static final boolean register$lambda$14$lambda$13(InterfaceC1416fj r0, Object r1) {
        return ((Boolean) r0.mo90g(r1)).booleanValue();
    }

    private static final int register$lambda$16(Lua r2) {
        AbstractC0295Gu.m625r(-341961001138229L);
        Iterator<T> r0 = messageCallbacks.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r2.unref(((MessageCallback) r0.next()).getFuncRef());
        goto L4
    L6:
        messageCallbacks.clear();
        AbstractC0295Gu.m625r(-341969591072821L);
        AbstractC0295Gu.m625r(-342016835713077L);
        return 0;
    }

    private static final int register$lambda$2(Lua r3) {
        AbstractC0295Gu.m625r(-291808668022837L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-291817257957429L);
        AbstractC0295Gu.m625r(-291864502597685L);
        AbstractC0295Gu.m625r(-291911747237941L);
        AbstractC0295Gu.m625r(-291374876325941L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$3(Lua r3) {
        AbstractC0295Gu.m625r(-291503725344821L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-291512315279413L);
        AbstractC0295Gu.m625r(-291559559919669L);
        AbstractC0295Gu.m625r(-291606804559925L);
        AbstractC0295Gu.m625r(-291619689461813L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$4(Lua r3) {
        AbstractC0295Gu.m625r(-292298294294581L);
        r3.toNumber(1);
        r3.toString(2);
        r3.toString(3);
        AbstractC0295Gu.m625r(-292306884229173L);
        AbstractC0295Gu.m625r(-292354128869429L);
        AbstractC0295Gu.m625r(-292401373509685L);
        AbstractC0295Gu.m625r(-292414258411573L);
        AbstractC0295Gu.m625r(-292427143313461L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$5(Lua r3) {
        AbstractC0295Gu.m625r(-292006236518453L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-292014826453045L);
        AbstractC0295Gu.m625r(-292062071093301L);
        AbstractC0295Gu.m625r(-292105020766261L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$6(Lua r3) {
        AbstractC0295Gu.m625r(-290584602343477L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-290593192278069L);
        AbstractC0295Gu.m625r(-290640436918325L);
        AbstractC0295Gu.m625r(-290704861427765L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$7(Lua r3) {
        AbstractC0295Gu.m625r(-290283954632757L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-290292544567349L);
        AbstractC0295Gu.m625r(-290339789207605L);
        AbstractC0295Gu.m625r(-290395623782453L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$8(Lua r3) {
        AbstractC0295Gu.m625r(-290524472801333L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-290533062735925L);
        AbstractC0295Gu.m625r(-291130063190069L);
        AbstractC0295Gu.m625r(-291190192732213L);
        AbstractC0295Gu.m625r(-291203077634101L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$9(Lua r3) {
        AbstractC0295Gu.m625r(-291331926652981L);
        r3.toNumber(1);
        AbstractC0295Gu.m625r(-291340516587573L);
        AbstractC0295Gu.m625r(-290838005413941L);
        AbstractC0295Gu.m625r(-290872365152309L);
        r3.push(false);
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3462s(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3463t(MessageData r0, Lua r1) {
        return pushMessageData$lambda$33(r0, r1);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3464u(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3465v(MessageData r0, Lua r1) {
        return pushMessageData$lambda$21(r0, r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m3466w(MessageData r0, Lua r1) {
        return pushMessageData$lambda$28(r0, r1);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3467x(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3468y(MessageData r0, Lua r1) {
        return pushMessageData$lambda$18(r0, r1);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3469z(MessageData r0, Lua r1) {
        return pushMessageData$lambda$25(r0, r1);
    }

    public final void cleanup() {
        Iterator<T> r0 = messageCallbacks.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        MessageCallback r1 = (MessageCallback) r0.next();
        LuaLocks.INSTANCE.withLock(r1.getLua(), new C0693Q4(5, r1));     // Catch: Exception -> L10
        goto L4
    L8:
        messageCallbacks.clear();
        AbstractC0295Gu.m625r(-293350561282101L);
        AbstractC0295Gu.m625r(-293397805922357L);
    }

    public final void cleanupFor(Lua r7) {
        AbstractC0295Gu.m625r(-292577467168821L);
        CopyOnWriteArrayList<MessageCallback> r0 = messageCallbacks;
        ArrayList r1 = new ArrayList();
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        Object r2 = r02.next();
        if (AbstractC0585Nj.m1134a(((MessageCallback) r2).getLua(), r7) == false) goto L4;
        r1.add(r2);
        goto L4
    L9:
        if (r1.isEmpty() == false) goto L11;
        return;
    L11:
        Iterator r03 = r1.iterator();
    L13:
        if (r03.hasNext() == false) goto L17;
        MessageCallback r22 = (MessageCallback) r03.next();
        messageCallbacks.remove(r22);
        LuaLocks.INSTANCE.withLock(r7, new C1389f(8, r7, r22));     // Catch: Exception -> L19
        goto L13
    L17:
        AbstractC0295Gu.m625r(-292594647038005L);
        AbstractC0295Gu.m625r(-292641891678261L);
        r1.size();
    }

    public final void dispatchMessage(MessageData r7) {
        AbstractC0295Gu.m625r(-293891727161397L);
        AbstractC0295Gu.m625r(-293908907030581L);
        AbstractC0295Gu.m625r(-293956151670837L);
        r7.getContent();
        Iterator<MessageCallback> r0 = messageCallbacks.iterator();
        AbstractC0295Gu.m625r(-294050640951349L);
    L4:
        if (r0.hasNext() == false) goto L9;
        MessageCallback r1 = r0.next();
        Lua r2 = r1.getLua();     // Catch: Exception -> L8
        LuaLocks.INSTANCE.withLock(r2, new C0525M8(r2, r1, r7, 4));     // Catch: Exception -> L8
    L8:
        AbstractC0295Gu.m625r(-294110770493493L);
        AbstractC0295Gu.m625r(-293608259319861L);
        r1.getFuncRef();
        goto L4
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-296382808193077L);
        r5.createTable(0, 20);
        r5.push(new C1355e9(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-296399988062261L));
        r5.push(new C1355e9(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-296438642767925L));
        r5.push(new C1355e9(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-296481592440885L));
        r5.push(new C1355e9(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-296524542113845L));
        r5.push(new C1355e9(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-296567491786805L));
        r5.push(new C1355e9(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-294961174018101L));
        r5.push(new C1355e9(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-294999828723765L));
        r5.push(new C1355e9(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-295059958265909L));
        r5.push(new C1355e9(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-295111497873461L));
        r5.push(new C1355e9(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-295167332448309L));
        r5.push(new C1355e9(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-295197397219381L));
        r5.push(new C1355e9(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-294677706176565L));
        r5.push(new C1355e9(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-294720655849525L));
        r5.push(new C1355e9(19));
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-294767900489781L), 1.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-294832324999221L), 3.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-294875274672181L), 34.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-294922519312437L), 43.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295519519766581L), 47.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295566764406837L), 49.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295614009047093L), 10000.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295656958720053L), 4.19430449E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295695613425717L), 4.36207665E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295755742967861L), 8.22083633E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-295274706630709L), 1.090519089E9d);
        r5.setField(-2, AbstractC0295Gu.m625r(-295321951270965L));
        r5.setGlobal(AbstractC0295Gu.m625r(-295364900943925L));
        AbstractC0295Gu.m625r(-295399260682293L);
        AbstractC0295Gu.m625r(-295446505322549L);
    }
}
