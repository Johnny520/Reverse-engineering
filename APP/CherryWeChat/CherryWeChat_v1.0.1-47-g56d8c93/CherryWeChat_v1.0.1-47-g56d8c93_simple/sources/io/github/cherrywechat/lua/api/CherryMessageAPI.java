package io.github.cherrywechat.lua.api;

import android.content.ContentValues;
import android.database.Cursor;
import io.github.cherrywechat.lua.LuaLocks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC0671Pj;
import p000.AbstractC2248ms;
import p000.AbstractC2374ph;
import p000.AbstractC2496sa;
import p000.AbstractC2598uq;
import p000.C0208Et;
import p000.C0668Pg;
import p000.C0693Q4;
import p000.C0829TC;
import p000.C1389f;
import p000.C2202lp;
import p000.C2617v8;
import p000.C2660w8;
import p000.C2703x8;
import p000.C2746y8;
import p000.InterfaceC1416fj;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryMessageAPI {
    public static final CherryMessageAPI INSTANCE = null;
    private static final String TAG = null;
    private static final CopyOnWriteArrayList<MessageCallback> messageCallbacks = null;

    public static final class MessageCallback {
        private final int funcRef;
        private final Lua lua;

        public MessageCallback(Lua r3, int r4) {
            AbstractC0295Gu.m625r(-546800876386357L);
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
            AbstractC0295Gu.m625r(-546818056255541L);
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
            r0.append(AbstractC0295Gu.m625r(-546835236124725L));
            r0.append(this.lua);
            r0.append(AbstractC0295Gu.m625r(-546925430437941L));
            return AbstractC0213Ey.m408f(r0, this.funcRef, ')');
        }
    }

    public static final class MessageData {
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

        public MessageData(String r3, String r4, int r5, int r6, int r7, long r8, long r10, String r12, int r13, ContentValues r14) {
            AbstractC0295Gu.m625r(-546972675078197L);
            AbstractC0295Gu.m625r(-547002739849269L);
            AbstractC0295Gu.m625r(-546500228675637L);
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
            AbstractC0295Gu.m625r(-546534588414005L);
            AbstractC0295Gu.m625r(-546564653185077L);
            AbstractC0295Gu.m625r(-546611897825333L);
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

        public final int isSend() {
            return this.isSend;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append(AbstractC0295Gu.m625r(-546646257563701L));
            AbstractC2374ph.m4817n(r0, this.talker, -546732156909621L);
            AbstractC2374ph.m4817n(r0, this.sendTalker, -547342042265653L);
            AbstractC0213Ey.m418p(r0, this.isSend, -547384991938613L);
            AbstractC0213Ey.m418p(r0, this.talkerId, -547436531546165L);
            AbstractC0213Ey.m418p(r0, this.type, -547470891284533L);
            r0.append(this.msgId);
            r0.append(AbstractC0295Gu.m625r(-547509545990197L));
            r0.append(this.createTime);
            r0.append(AbstractC0295Gu.m625r(-547019919718453L));
            AbstractC2374ph.m4817n(r0, this.content, -547067164358709L);
            AbstractC0213Ey.m418p(r0, this.talkerType, -547127293900853L);
            r0.append(this.values);
            r0.append(')');
            return r0.toString();
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

    public static final class TalkerType {
        public static final int ENTERPRISE = 3;
        public static final int GROUP = 1;
        public static final TalkerType INSTANCE = null;
        public static final int OFFICIAL = 2;
        public static final int PRIVATE = 0;

        static {
            INSTANCE = new TalkerType();
        }

        private TalkerType() {
        }
    }

    public static final class Type {
        public static final int CARD = 49;
        public static final int EMOJI = 47;
        public static final int FILE = 1090519089;
        public static final int IMAGE = 3;
        public static final Type INSTANCE = null;
        public static final int LINK = 49;
        public static final int LOCATION = 48;
        public static final int NEW_YEAR_RED = 469762097;
        public static final int RED_PACKET = 436207665;
        public static final int REPLY = 822083633;
        public static final int TEXT = 1;
        public static final int TIP = 10000;
        public static final int TRANSFER = 419430449;
        public static final int VIDEO = 43;
        public static final int VOICE = 34;

        static {
            INSTANCE = new Type();
        }

        private Type() {
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-555017148823605L);
        INSTANCE = new CherryMessageAPI();
        messageCallbacks = new CopyOnWriteArrayList();
    }

    private CherryMessageAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m3115A(Lua r0) {
        return register$lambda$16(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m3116B(Lua r0) {
        return register$lambda$22(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m3117C(Lua r0) {
        return register$lambda$11(r0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m3118D(Lua r0) {
        return register$lambda$5(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3119a(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3120b(Lua r0) {
        return register$lambda$13(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3121c(MessageData r0, Lua r1) {
        return pushMessageData$lambda$28(r0, r1);
    }

    private static final C0829TC cleanup$lambda$33$lambda$32(MessageCallback r1) {
        r1.getLua().unref(r1.getFuncRef());
        return C0829TC.f2620a;
    }

    private static final C0829TC cleanupFor$lambda$36$lambda$35(Lua r0, MessageCallback r1) {
        r0.unref(r1.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0829TC m3122d(Lua r0, MessageCallback r1) {
        return cleanupFor$lambda$36$lambda$35(r0, r1);
    }

    private static final C0829TC dispatchMessage$lambda$24(MessageCallback r2, MessageData r3) {
        r2.getLua().refGet(r2.getFuncRef());
        INSTANCE.pushMessageData(r2.getLua(), r3);
        r2.getLua().pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m3123e(C2703x8 r0, Object r1) {
        return register$lambda$16$lambda$15(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3124f(MessageData r0, Lua r1) {
        return pushMessageData$lambda$31(r0, r1);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m3125g(int r0, MessageCallback r1) {
        return register$lambda$16$lambda$14(r0, r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3126h(Lua r0) {
        return register$lambda$9(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3127i(Lua r0) {
        return register$lambda$3(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3128j(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3129k(Lua r0) {
        return register$lambda$8(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3130l(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3131m(Lua r0) {
        return register$lambda$4(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3132n(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C0829TC m3133o(MessageCallback r0) {
        return cleanup$lambda$33$lambda$32(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3134p(MessageData r0, Lua r1) {
        return pushMessageData$lambda$25(r0, r1);
    }

    private final void pushMessageData(Lua r5, final MessageData r6) {
        r5.createTable(0, 20);
        r5.push(r6.getTalker());
        r5.setField(-2, AbstractC0295Gu.m625r(-562065190156341L));
        r5.push(r6.getSendTalker());
        r5.setField(-2, AbstractC0295Gu.m625r(-562095254927413L));
        r5.push(Double.valueOf(r6.isSend()));
        r5.setField(-2, AbstractC0295Gu.m625r(-562692255381557L));
        r5.push(Double.valueOf(r6.getType()));
        r5.setField(-2, AbstractC0295Gu.m625r(-562722320152629L));
        r5.push(Double.valueOf(r6.getMsgId()));
        r5.setField(-2, AbstractC0295Gu.m625r(-562743794989109L));
        r5.push(Double.valueOf(r6.getCreateTime()));
        r5.setField(-2, AbstractC0295Gu.m625r(-562769564792885L));
        r5.push(r6.getContent());
        r5.setField(-2, AbstractC0295Gu.m625r(-562816809433141L));
        r5.push(Double.valueOf(r6.getTalkerType()));
        r5.setField(-2, AbstractC0295Gu.m625r(-562851169171509L));
        final int r2 = 3;
        r5.push(new C2660w8(r6, r2));
        r5.setField(-2, AbstractC0295Gu.m625r(-562898413811765L));
        final int r22 = 4;
        r5.push(new C2660w8(r6, r22));
        r5.setField(-2, AbstractC0295Gu.m625r(-562941363484725L));
        final int r23 = 5;
        r5.push(new C2660w8(r6, r23));
        r5.setField(-2, AbstractC0295Gu.m625r(-562425967409205L));
        final int r24 = 6;
        r5.push(new C2660w8(r6, r24));
        r5.setField(-2, AbstractC0295Gu.m625r(-562473212049461L));
        final int r25 = 0;
        r5.push(new C2660w8(r6, r25));
        r5.setField(-2, AbstractC0295Gu.m625r(-562503276820533L));
        final int r26 = 1;
        r5.push(new C2660w8(r6, r26));
        r5.setField(-2, AbstractC0295Gu.m625r(-562537636558901L));
        final int r27 = 2;
        r5.push(new C2660w8(r6, r27));
        r5.setField(-2, AbstractC0295Gu.m625r(-562571996297269L));
    }

    private static final int pushMessageData$lambda$25(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554407263467573L);
        if (r2.getTalkerType() != 0) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$26(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554415853402165L);
        if (r2.getTalkerType() != 1) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$27(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554424443336757L);
        if (r2.isSend() != 1) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$28(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554982789085237L);
        if (r2.getType() != 1) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$29(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554991379019829L);
        if (r2.getType() != 3) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$30(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-554999968954421L);
        if (r2.getType() != 34) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    private static final int pushMessageData$lambda$31(MessageData r2, Lua r3) {
        AbstractC0295Gu.m625r(-555008558889013L);
        if (r2.getType() != 43) goto L5;
        boolean r22 = true;
    L6:
        r3.push(r22);
        return 1;
    L5:
        r22 = false;
        goto L6
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3135q(MessageData r0, Lua r1) {
        return pushMessageData$lambda$27(r0, r1);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3136r(Lua r0) {
        return register$lambda$0(r0);
    }

    private static final int register$lambda$0(Lua r5) {
        AbstractC0295Gu.m625r(-561231966500917L);
        String r1 = r5.toString(1);
        String r2 = r5.toString(2);
        if (r1 != null) goto L5;
    L15:
        r5.push(false);
        return 1;
    L5:
        if (r1.length() == 0) goto L15;
        if (r2 == null) goto L15;
        if (r2.length() == 0) goto L15;
        AbstractC2248ms.f7951a.getClass();     // Catch: Exception -> L13
        C0668Pg.m1331l(r1, r2);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-561240556435509L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-560763815065653L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-560806764738613L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-560819649640501L);     // Catch: Exception -> L13
        r5.push(true);     // Catch: Exception -> L13
        return 1;
    L13:
        AbstractC0295Gu.m625r(-560866894280757L);
        AbstractC0295Gu.m625r(-560939908724789L);
        r5.push(false);
        return 1;
    }

    private static final int register$lambda$1(Lua r8) {
        AbstractC0295Gu.m625r(-561004333234229L);
        String r1 = r8.toString(1);
        String r2 = r8.toString(2);
        if (r1 != null) goto L5;
    L15:
        r8.push(false);
        return 1;
    L5:
        if (r1.length() == 0) goto L15;
        if (r2 == null) goto L15;
        if (r2.length() == 0) goto L15;
        AbstractC2248ms.f7951a.getClass();     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-173078592092213L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-173108656863285L);     // Catch: Exception -> L13
        AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C2202lp(r2, r1, null, 2), 3);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-561012923168821L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-561635693426741L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-561682938066997L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-561695822968885L);     // Catch: Exception -> L13
        r8.push(true);     // Catch: Exception -> L13
        return 1;
    L13:
        AbstractC0295Gu.m625r(-561743067609141L);
        AbstractC0295Gu.m625r(-561816082053173L);
        r8.push(false);
        return 1;
    }

    private static final int register$lambda$10(Lua r3) {
        AbstractC0295Gu.m625r(-559209036904501L);
        r3.toNumber(1);
        AbstractC0295Gu.m625r(-559217626839093L);
        AbstractC0295Gu.m625r(-559290641283125L);
        AbstractC0295Gu.m625r(-559325001021493L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$11(Lua r3) {
        AbstractC0295Gu.m625r(-559359360759861L);
        r3.toNumber(1);
        AbstractC0295Gu.m625r(-559367950694453L);
        AbstractC0295Gu.m625r(-557791697696821L);
        AbstractC0295Gu.m625r(-557826057435189L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$12(Lua r3) {
        AbstractC0295Gu.m625r(-557860417173557L);
        r3.toNumber(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-557869007108149L);
        AbstractC0295Gu.m625r(-557942021552181L);
        AbstractC0295Gu.m625r(-557980676257845L);
        AbstractC0295Gu.m625r(-557993561159733L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$13(Lua r4) {
        AbstractC0295Gu.m625r(-557478165084213L);
        if (r4.isFunction(1) == true) goto L6;
        r4.push(Double.valueOf(-1.0d));
        return 1;
    L6:
        r4.pushValue(1);
        int r1 = r4.ref();
        messageCallbacks.add(new MessageCallback(r4, r1));
        r4.push(Double.valueOf(r1));
        AbstractC0295Gu.m625r(-557486755018805L);
        AbstractC0295Gu.m625r(-557559769462837L);
        return 1;
    }

    private static final int register$lambda$16(Lua r6) {
        AbstractC0295Gu.m625r(-557658553710645L);
        int r1 = (int) r6.toNumber(1);
        boolean r2 = messageCallbacks.removeIf(new C2746y8(new C2703x8(r1, 0), 0));
        if (r2 == false) goto L5;
        r6.unref(r1);
    L5:
        r6.push(r2);
        return 1;
    }

    private static final boolean register$lambda$16$lambda$14(int r0, MessageCallback r1) {
        if (r1.getFuncRef() != r0) goto L6;
        return true;
    L6:
        return false;
    }

    private static final boolean register$lambda$16$lambda$15(InterfaceC1416fj r0, Object r1) {
        return ((Boolean) r0.mo90g(r1)).booleanValue();
    }

    private static final int register$lambda$18(Lua r2) {
        AbstractC0295Gu.m625r(-557667143645237L);
        Iterator<T> r0 = messageCallbacks.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r2.unref(((MessageCallback) r0.next()).getFuncRef());
        goto L4
    L6:
        messageCallbacks.clear();
        return 0;
    }

    private static final int register$lambda$2(Lua r3) {
        AbstractC0295Gu.m625r(-561335045716021L);
        r3.toString(1);
        r3.toString(2);
        if (r3.getTop() < 3) goto L5;
        r3.toNumber(3);
    L5:
        AbstractC0295Gu.m625r(-561343635650613L);
        AbstractC0295Gu.m625r(-561416650094645L);
        AbstractC0295Gu.m625r(-561463894734901L);
        AbstractC0295Gu.m625r(-561476779636789L);
        AbstractC0295Gu.m625r(-561489664538677L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$22(Lua r17) {
        AbstractC0295Gu.m625r(-557675733579829L);
        String r0 = r17.toString(1);
        if (r17.getTop() < 2) goto L5;
        int r3 = (int) r17.toNumber(2);
    L7:
        if (r17.getTop() < 3) goto L9;
        Long r4 = Long.valueOf((long) r17.toNumber(3));
    L11:
        if (r0 != null) goto L13;
    L62:
        r17.createTable(0, 0);
        return 1;
    L13:
        if (r0.length() == 0) goto L62;
        if (r4 != null) goto L17;
        String r7 = AbstractC0295Gu.m625r(-556662121297973L);     // Catch: Exception -> L60
    L19:
        if (r4 == null) goto L21;
        String[] r02 = {r0, r4.toString(), String.valueOf(r3)};     // Catch: Exception -> L60
    L22:
        Cursor r32 = AbstractC0671Pj.m1357w(r7, r02);     // Catch: Exception -> L60
        ArrayList r03 = new ArrayList();     // Catch: Exception -> L60
        if (r32 != null) goto L64;
    L36:
        r17.createTable(r03.size(), 0);     // Catch: Exception -> L60
        Iterator r33 = r03.iterator();     // Catch: Exception -> L60
        int r42 = 0;
    L38:
        if (r33.hasNext() == false) goto L58;
        Object r72 = r33.next();     // Catch: Exception -> L60
        int r8 = r42 + 1;     // Catch: Exception -> L60
        if (r42 < 0) goto L56;
        Map r73 = (Map) r72;     // Catch: Exception -> L60
        r17.createTable(0, r73.size());     // Catch: Exception -> L60
        Iterator r43 = r73.entrySet().iterator();     // Catch: Exception -> L60
    L43:
        if (r43.hasNext() == false) goto L55;
        Map.Entry r74 = (Map.Entry) r43.next();     // Catch: Exception -> L60
        String r10 = (String) r74.getKey();     // Catch: Exception -> L60
        Object r75 = r74.getValue();     // Catch: Exception -> L60
        if ((r75 instanceof Long) == false) goto L48;
        r17.push(Double.valueOf(((Number) r75).longValue()));     // Catch: Exception -> L60
    L54:
        r17.setField(-2, r10);     // Catch: Exception -> L60
        goto L43
    L48:
        if ((r75 instanceof Integer) == false) goto L51;
        r17.push(Double.valueOf(((Number) r75).intValue()));     // Catch: Exception -> L60
        goto L54
    L51:
        if ((r75 instanceof String) == false) goto L53;
        r17.push((String) r75);     // Catch: Exception -> L60
        goto L54
    L53:
        r17.pushNil();     // Catch: Exception -> L60
        goto L54
    L55:
        r17.rawSetI(-2, r8);     // Catch: Exception -> L60
        r42 = r8;
        goto L38
    L56:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L60
        throw null;     // Catch: Exception -> L60
    L58:
        AbstractC0295Gu.m625r(-555545429801013L);     // Catch: Exception -> L60
        AbstractC0295Gu.m625r(-555618444245045L);     // Catch: Exception -> L60
        AbstractC0295Gu.m625r(-555669983852597L);     // Catch: Exception -> L60
        r03.size();     // Catch: Exception -> L60
        AbstractC0295Gu.m625r(-555712933525557L);     // Catch: Exception -> L60
        return 1;
    L64:
        if (r32.moveToNext() == false) goto L30;
        r03.add(AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-557229056981045L), Long.valueOf(r32.getLong(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557254826784821L))))), new C0208Et(AbstractC0295Gu.m625r(-557280596588597L), Long.valueOf(r32.getLong(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557319251294261L))))), new C0208Et(AbstractC0295Gu.m625r(-557357905999925L), Integer.valueOf(r32.getInt(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557379380836405L))))), new C0208Et(AbstractC0295Gu.m625r(-557400855672885L), Integer.valueOf(r32.getInt(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557430920443957L))))), new C0208Et(AbstractC0295Gu.m625r(-556911229401141L), Integer.valueOf(r32.getInt(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556941294172213L))))), new C0208Et(AbstractC0295Gu.m625r(-556971358943285L), Long.valueOf(r32.getLong(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557018603583541L))))), new C0208Et(AbstractC0295Gu.m625r(-557065848223797L), r32.getString(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557095912994869L)))), new C0208Et(AbstractC0295Gu.m625r(-557125977765941L), r32.getString(r32.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557160337504309L))))}));     // Catch: Throwable -> L28
        goto L64
    L30:
        r32.close();     // Catch: Exception -> L60
        goto L36
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        AbstractC0585Nj.m1138f(r32, th);     // Catch: Exception -> L60
        throw th;     // Catch: Exception -> L60
    L21:
        r02 = new String[]{r0, String.valueOf(r3)};     // Catch: Exception -> L60
        goto L22
    L17:
        r7 = AbstractC0295Gu.m625r(-557684323514421L);     // Catch: Exception -> L60
    L60:
        AbstractC0295Gu.m625r(-555755883198517L);
        AbstractC0295Gu.m625r(-555279141828661L);
        r17.createTable(0, 0);
        return 1;
    L9:
        r4 = null;
        goto L11
    L5:
        r3 = 20;
        goto L7
    }

    private static final int register$lambda$23(Lua r6) {
        AbstractC0295Gu.m625r(-555352156272693L);
        long r1 = (long) r6.toNumber(1);
        if (r1 != 0) goto L22;
        r6.pushNil();
        return 1;
    L22:
        Cursor r12 = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-555360746207285L), new String[]{String.valueOf(r1)});     // Catch: Exception -> L20
        if (r12 != null) goto L10;
    L16:
        if (r12 == null) goto L18;
        r12.close();     // Catch: Exception -> L20
    L18:
        r6.pushNil();     // Catch: Exception -> L20
        return 1;
    L10:
        if (r12.moveToFirst() != true) goto L16;
        r6.createTable(0, 10);     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getLong(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556352883652661L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-555828897642549L));     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getLong(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555854667446325L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-555893322151989L));     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getInt(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555931976857653L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-555953451694133L));     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getInt(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555974926530613L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-556004991301685L));     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getInt(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556035056072757L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-556065120843829L));     // Catch: Exception -> L20
        r6.push(Double.valueOf(r12.getLong(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554445918173237L)))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-554493162813493L));     // Catch: Exception -> L20
        r6.push(r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554540407453749L))));     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-554570472224821L));     // Catch: Exception -> L20
        String r2 = r12.getString(r12.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554600536995893L)));     // Catch: Exception -> L20
        if (r2 != null) goto L14;
        r2 = AbstractC0295Gu.m625r(-554634896734261L);     // Catch: Exception -> L20
    L14:
        r6.push(r2);     // Catch: Exception -> L20
        r6.setField(-2, AbstractC0295Gu.m625r(-554639191701557L));     // Catch: Exception -> L20
        r12.close();     // Catch: Exception -> L20
        AbstractC0295Gu.m625r(-554673551439925L);     // Catch: Exception -> L20
        AbstractC0295Gu.m625r(-554196810070069L);     // Catch: Exception -> L20
        AbstractC0295Gu.m625r(-554235464775733L);     // Catch: Exception -> L20
        return 1;
    L20:
        AbstractC0213Ey.m412j(-554274119481397L, -554347133925429L, r6);
        return 1;
    }

    private static final int register$lambda$3(Lua r3) {
        AbstractC0295Gu.m625r(-561524024277045L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-561532614211637L);
        AbstractC0295Gu.m625r(-559956361214005L);
        AbstractC0295Gu.m625r(-560003605854261L);
        AbstractC0295Gu.m625r(-560016490756149L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$4(Lua r3) {
        AbstractC0295Gu.m625r(-560050850494517L);
        r3.toString(1);
        r3.toString(2);
        AbstractC0295Gu.m625r(-560059440429109L);
        AbstractC0295Gu.m625r(-560132454873141L);
        AbstractC0295Gu.m625r(-560179699513397L);
        AbstractC0295Gu.m625r(-560192584415285L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$5(Lua r8) {
        AbstractC0295Gu.m625r(-559677188339765L);
        String r1 = r8.toString(1);
        String r2 = r8.toString(2);
        if (r1 != null) goto L5;
    L15:
        r8.push(false);
        return 1;
    L5:
        if (r1.length() == 0) goto L15;
        if (r2 == null) goto L15;
        if (r2.length() == 0) goto L15;
        AbstractC2248ms.f7951a.getClass();     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-173310520326197L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-173340585097269L);     // Catch: Exception -> L13
        AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C2202lp(r2, r1, null, 1), 3);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559685778274357L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559758792718389L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559801742391349L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559814627293237L);     // Catch: Exception -> L13
        r8.push(true);     // Catch: Exception -> L13
        return 1;
    L13:
        AbstractC0295Gu.m625r(-559861871933493L);
        AbstractC0295Gu.m625r(-560484642191413L);
        r8.push(false);
        return 1;
    }

    private static final int register$lambda$6(Lua r3) {
        AbstractC0295Gu.m625r(-560549066700853L);
        r3.toString(1);
        r3.toNumber(2);
        r3.toString(3);
        AbstractC0295Gu.m625r(-560557656635445L);
        AbstractC0295Gu.m625r(-560630671079477L);
        AbstractC0295Gu.m625r(-560677915719733L);
        AbstractC0295Gu.m625r(-560690800621621L);
        AbstractC0295Gu.m625r(-560703685523509L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$7(Lua r11) {
        AbstractC0295Gu.m625r(-560738045261877L);
        String r1 = r11.toString(1);
        if (r1 != null) goto L5;
    L21:
        r11.push(false);
        return 1;
    L5:
        if (r1.length() == 0) goto L21;
        if (r11.isTable(2) == false) goto L10;
        r11.getField(2, AbstractC0295Gu.m625r(-560746635196469L));
        String r5 = r11.toString(-1);
        r11.pop(1);
        r11.getField(2, AbstractC0295Gu.m625r(-560214059251765L));
        String r6 = r11.toString(-1);
        r11.pop(1);
        r11.getField(2, AbstractC0295Gu.m625r(-560239829055541L));
        String r7 = r11.toString(-1);
        r11.pop(1);
        r11.getField(2, AbstractC0295Gu.m625r(-560291368663093L));
        String r8 = r11.toString(-1);
        r11.pop(1);
        r11.getField(2, AbstractC0295Gu.m625r(-560321433434165L));
        r11.toString(-1);
        r11.pop(1);
    L11:
        if (r5 != null) goto L13;
    L19:
        AbstractC0295Gu.m625r(-560347203237941L);
        AbstractC0295Gu.m625r(-560420217681973L);
        r11.push(false);
        return 1;
    L13:
        if (r5.length() == 0) goto L19;
        AbstractC2248ms.f7951a.getClass();     // Catch: Exception -> L17
        C0668Pg.m1333n(r1, r5, r6, r7, r8);     // Catch: Exception -> L17
        AbstractC0295Gu.m625r(-558882619390005L);     // Catch: Exception -> L17
        AbstractC0295Gu.m625r(-558955633834037L);     // Catch: Exception -> L17
        AbstractC0295Gu.m625r(-558998583506997L);     // Catch: Exception -> L17
        AbstractC0295Gu.m625r(-559011468408885L);     // Catch: Exception -> L17
        r11.push(true);     // Catch: Exception -> L17
        return 1;
    L17:
        AbstractC0295Gu.m625r(-559058713049141L);
        AbstractC0295Gu.m625r(-558581971679285L);
        r11.push(false);
        return 1;
    L10:
        r5 = null;
        r6 = null;
        r7 = null;
        r8 = null;
        goto L11
    }

    private static final int register$lambda$8(Lua r3) {
        AbstractC0295Gu.m625r(-558646396188725L);
        r3.toString(1);
        AbstractC0295Gu.m625r(-558654986123317L);
        AbstractC0295Gu.m625r(-558728000567349L);
        AbstractC0295Gu.m625r(-558788130109493L);
        r3.push(false);
        return 1;
    }

    private static final int register$lambda$9(Lua r5) {
        AbstractC0295Gu.m625r(-559458145007669L);
        String r1 = r5.toString(1);
        String r2 = r5.toString(2);
        if (r1 != null) goto L5;
    L15:
        r5.push(false);
        return 1;
    L5:
        if (r1.length() == 0) goto L15;
        if (r2 == null) goto L15;
        if (r2.length() == 0) goto L15;
        AbstractC2248ms.f7951a.getClass();     // Catch: Exception -> L13
        C0668Pg.m1328h(r1, r2);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559466734942261L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559539749386293L);     // Catch: Exception -> L13
        AbstractC0295Gu.m625r(-559578404091957L);     // Catch: Exception -> L13
        r5.push(true);     // Catch: Exception -> L13
        return 1;
    L13:
        AbstractC0295Gu.m625r(-559625648732213L);
        AbstractC0295Gu.m625r(-559148907362357L);
        r5.push(false);
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3137s(MessageData r0, Lua r1) {
        return pushMessageData$lambda$29(r0, r1);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3138t(MessageData r0, Lua r1) {
        return pushMessageData$lambda$26(r0, r1);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3139u(Lua r0) {
        return register$lambda$18(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C0829TC m3140v(MessageCallback r0, MessageData r1) {
        return dispatchMessage$lambda$24(r0, r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m3141w(Lua r0) {
        return register$lambda$10(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3142x(Lua r0) {
        return register$lambda$23(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3143y(Lua r0) {
        return register$lambda$12(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3144z(MessageData r0, Lua r1) {
        return pushMessageData$lambda$30(r0, r1);
    }

    public final void cleanup() {
        Iterator<T> r0 = messageCallbacks.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        MessageCallback r1 = (MessageCallback) r0.next();
        LuaLocks.INSTANCE.withLock(r1.getLua(), new C0693Q4(2, r1));     // Catch: Exception -> L10
        goto L4
    L8:
        messageCallbacks.clear();
    }

    public final void cleanupFor(Lua r7) {
        AbstractC0295Gu.m625r(-562606356035637L);
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
        LuaLocks.INSTANCE.withLock(r7, new C1389f(1, r7, r22));     // Catch: Exception -> L19
        goto L13
    L17:
        AbstractC0295Gu.m625r(-562623535904821L);
        AbstractC0295Gu.m625r(-561047282907189L);
        r1.size();
    }

    public final void dispatchMessage(MessageData r7) {
        AbstractC0295Gu.m625r(-562232693880885L);
        AbstractC0295Gu.m625r(-562249873750069L);
        AbstractC0295Gu.m625r(-562322888194101L);
        r7.getContent();
        Iterator<MessageCallback> r0 = messageCallbacks.iterator();
        AbstractC0295Gu.m625r(-561867621660725L);
    L4:
        if (r0.hasNext() == false) goto L9;
        MessageCallback r1 = r0.next();
        LuaLocks.INSTANCE.withLock(r1.getLua(), new C1389f(2, r1, r7));     // Catch: Exception -> L8
    L8:
        AbstractC0295Gu.m625r(-561927751202869L);
        AbstractC0295Gu.m625r(-562000765646901L);
        goto L4
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-547170243573813L);
        r5.createTable(0, 30);
        r5.createTable(0, 15);
        r5.push(Double.valueOf(1.0d));
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-547187423442997L), 3.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-547208898279477L), 34.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-547234668083253L), 43.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-547260437887029L), 47.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545636940249141L), 49.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545662710052917L), 48.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545684184889397L), 10000.0d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545722839595061L), 4.19430449E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545740019464245L), 4.36207665E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545778674169909L), 8.22083633E8d);
        AbstractC0213Ey.m419q(r5, -2, AbstractC0295Gu.m625r(-545825918810165L), 1.090519089E9d);
        r5.setField(-2, AbstractC0295Gu.m625r(-545851688613941L));
        r5.setField(-2, AbstractC0295Gu.m625r(-545873163450421L));
        r5.push(new C2617v8(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-545894638286901L));
        r5.push(new C2617v8(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-545383537178677L));
        r5.push(new C2617v8(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-545426486851637L));
        r5.push(new C2617v8(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-545469436524597L));
        r5.push(new C2617v8(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-545512386197557L));
        r5.push(new C2617v8(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-545555335870517L));
        r5.push(new C2617v8(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-545593990576181L));
        r5.push(new C2617v8(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-546186696063029L));
        r5.push(new C2617v8(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-546225350768693L));
        r5.push(new C2617v8(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-546281185343541L));
        r5.push(new C2617v8(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-546315545081909L));
        r5.push(new C2617v8(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-546345609852981L));
        r5.push(new C2617v8(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-546375674624053L));
        r5.push(new C2617v8(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-546410034362421L));
        r5.push(new C2617v8(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-546452984035381L));
        r5.push(new C2617v8(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-545950472861749L));
        r5.push(new C2617v8(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-546014897371189L));
        r5.push(new C2617v8(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-546062142011445L));
        AbstractC0295Gu.m625r(-546096501749813L);
        AbstractC0295Gu.m625r(-546169516193845L);
    }
}
