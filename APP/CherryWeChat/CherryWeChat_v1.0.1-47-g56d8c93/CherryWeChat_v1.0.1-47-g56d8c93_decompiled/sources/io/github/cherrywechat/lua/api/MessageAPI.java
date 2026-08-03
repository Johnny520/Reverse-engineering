package io.github.cherrywechat.lua.api;

import android.content.ContentValues;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.api.MessageAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0525M8;
import p000.C0693Q4;
import p000.C0829TC;
import p000.C1355e9;
import p000.C1389f;
import p000.C2703x8;
import p000.C2746y8;
import p000.InterfaceC1416fj;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: loaded from: classes.dex */
public final class MessageAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-342798519760949L);
    public static final MessageAPI INSTANCE = new MessageAPI();
    private static final CopyOnWriteArrayList<MessageCallback> messageCallbacks = new CopyOnWriteArrayList<>();

    public static final class MessageCallback {
        private final int funcRef;
        private final Lua lua;

        public MessageCallback(Lua lua, int i) {
            AbstractC0295Gu.m625r(-297662708447285L);
            this.lua = lua;
            this.funcRef = i;
        }

        public static /* synthetic */ MessageCallback copy$default(MessageCallback messageCallback, Lua lua, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lua = messageCallback.lua;
            }
            if ((i2 & 2) != 0) {
                i = messageCallback.funcRef;
            }
            return messageCallback.copy(lua, i);
        }

        public final Lua component1() {
            return this.lua;
        }

        public final int component2() {
            return this.funcRef;
        }

        public final MessageCallback copy(Lua lua, int i) {
            AbstractC0295Gu.m625r(-297679888316469L);
            return new MessageCallback(lua, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageCallback)) {
                return false;
            }
            MessageCallback messageCallback = (MessageCallback) obj;
            return AbstractC0585Nj.m1134a(this.lua, messageCallback.lua) && this.funcRef == messageCallback.funcRef;
        }

        public final int getFuncRef() {
            return this.funcRef;
        }

        public final Lua getLua() {
            return this.lua;
        }

        public int hashCode() {
            return Integer.hashCode(this.funcRef) + (this.lua.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-296047800743989L));
            sb.append(this.lua);
            sb.append(AbstractC0295Gu.m625r(-296137995057205L));
            return AbstractC0213Ey.m408f(sb, this.funcRef, ')');
        }
    }

    public static final class MessageData {
        public static final Companion Companion = new Companion(null);
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
            public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
                this();
            }

            private Companion() {
            }
        }

        public MessageData(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues) {
            AbstractC0295Gu.m625r(-296185239697461L);
            AbstractC0295Gu.m625r(-296215304468533L);
            AbstractC0295Gu.m625r(-296262549108789L);
            this.talker = str;
            this.sendTalker = str2;
            this.isSend = i;
            this.talkerId = i2;
            this.type = i3;
            this.msgId = j;
            this.createTime = j2;
            this.content = str3;
            this.talkerType = i4;
            this.values = contentValues;
        }

        public static /* synthetic */ MessageData copy$default(MessageData messageData, String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = messageData.talker;
            }
            if ((i5 & 2) != 0) {
                str2 = messageData.sendTalker;
            }
            if ((i5 & 4) != 0) {
                i = messageData.isSend;
            }
            if ((i5 & 8) != 0) {
                i2 = messageData.talkerId;
            }
            if ((i5 & 16) != 0) {
                i3 = messageData.type;
            }
            if ((i5 & 32) != 0) {
                j = messageData.msgId;
            }
            if ((i5 & 64) != 0) {
                j2 = messageData.createTime;
            }
            if ((i5 & 128) != 0) {
                str3 = messageData.content;
            }
            if ((i5 & 256) != 0) {
                i4 = messageData.talkerType;
            }
            if ((i5 & 512) != 0) {
                contentValues = messageData.values;
            }
            ContentValues contentValues2 = contentValues;
            String str4 = str3;
            long j3 = j2;
            long j4 = j;
            int i6 = i2;
            int i7 = i3;
            int i8 = i;
            return messageData.copy(str, str2, i8, i6, i7, j4, j3, str4, i4, contentValues2);
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

        public final MessageData copy(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues) {
            AbstractC0295Gu.m625r(-296296908847157L);
            AbstractC0295Gu.m625r(-295777217804341L);
            AbstractC0295Gu.m625r(-295824462444597L);
            return new MessageData(str, str2, i, i2, i3, j, j2, str3, i4, contentValues);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageData)) {
                return false;
            }
            MessageData messageData = (MessageData) obj;
            return AbstractC0585Nj.m1134a(this.talker, messageData.talker) && AbstractC0585Nj.m1134a(this.sendTalker, messageData.sendTalker) && this.isSend == messageData.isSend && this.talkerId == messageData.talkerId && this.type == messageData.type && this.msgId == messageData.msgId && this.createTime == messageData.createTime && AbstractC0585Nj.m1134a(this.content, messageData.content) && this.talkerType == messageData.talkerType && AbstractC0585Nj.m1134a(this.values, messageData.values);
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
            int iM403a = AbstractC0213Ey.m403a(this.talkerType, AbstractC2374ph.m4810g(this.content, (Long.hashCode(this.createTime) + ((Long.hashCode(this.msgId) + AbstractC0213Ey.m403a(this.type, AbstractC0213Ey.m403a(this.talkerId, AbstractC0213Ey.m403a(this.isSend, AbstractC2374ph.m4810g(this.sendTalker, this.talker.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31, 31), 31);
            ContentValues contentValues = this.values;
            return iM403a + (contentValues == null ? 0 : contentValues.hashCode());
        }

        public final boolean isCard() {
            return this.type == 49;
        }

        public final boolean isEmoji() {
            return this.type == 47;
        }

        public final boolean isEnterprise() {
            return this.talkerType == 3;
        }

        public final boolean isFile() {
            return this.type == 1090519089;
        }

        public final boolean isGroupChat() {
            return this.talkerType == 1;
        }

        public final boolean isImage() {
            return this.type == 3;
        }

        public final boolean isOfficialAccount() {
            return this.talkerType == 2;
        }

        public final boolean isPrivateChat() {
            return this.talkerType == 0;
        }

        public final boolean isRedPacket() {
            int i = this.type;
            return i == 436207665 || i == 469762097;
        }

        public final boolean isReply() {
            return this.type == 822083633;
        }

        public final int isSend() {
            return this.isSend;
        }

        public final boolean isText() {
            return this.type == 1;
        }

        public final boolean isTip() {
            return this.type == 10000;
        }

        public final boolean isTransfer() {
            return this.type == 419430449;
        }

        public final boolean isVideo() {
            return this.type == 43;
        }

        public final boolean isVoice() {
            return this.type == 34;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-295858822182965L));
            AbstractC2374ph.m4817n(sb, this.talker, -295944721528885L);
            AbstractC2374ph.m4817n(sb, this.sendTalker, -296004851071029L);
            AbstractC0213Ey.m418p(sb, this.isSend, -296597556557877L);
            AbstractC0213Ey.m418p(sb, this.talkerId, -296649096165429L);
            AbstractC0213Ey.m418p(sb, this.type, -296683455903797L);
            sb.append(this.msgId);
            sb.append(AbstractC0295Gu.m625r(-296722110609461L));
            sb.append(this.createTime);
            sb.append(AbstractC0295Gu.m625r(-296782240151605L));
            AbstractC2374ph.m4817n(sb, this.content, -296829484791861L);
            AbstractC0213Ey.m418p(sb, this.talkerType, -296339858520117L);
            sb.append(this.values);
            sb.append(')');
            return sb.toString();
        }

        /* JADX INFO: renamed from: isSend, reason: collision with other method in class */
        public final boolean m5467isSend() {
            return this.isSend == 1;
        }

        public /* synthetic */ MessageData(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues, int i5, AbstractC0621Oc abstractC0621Oc) {
            this(str, str2, i, i2, i3, j, j2, str3, i4, (i5 & 512) != 0 ? null : contentValues);
        }
    }

    private MessageAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanup$lambda$38$lambda$37(MessageCallback messageCallback) {
        messageCallback.getLua().unref(messageCallback.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanupFor$lambda$36$lambda$35(Lua lua, MessageCallback messageCallback) {
        lua.unref(messageCallback.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC dispatchMessage$lambda$17(Lua lua, MessageCallback messageCallback, MessageData messageData) {
        lua.refGet(messageCallback.getFuncRef());
        INSTANCE.pushMessageData(lua, messageData);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    private final void pushMessageData(Lua lua, final MessageData messageData) {
        lua.createTable(0, 15);
        lua.push(messageData.getTalker());
        lua.setField(-2, AbstractC0295Gu.m625r(-293775763044405L));
        lua.push(messageData.getSendTalker());
        lua.setField(-2, AbstractC0295Gu.m625r(-293805827815477L));
        lua.push(Double.valueOf(messageData.isSend()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294402828269621L));
        lua.push(Double.valueOf(messageData.getTalkerId()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294432893040693L));
        lua.push(Double.valueOf(messageData.getType()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294471547746357L));
        lua.push(Double.valueOf(messageData.getMsgId()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294493022582837L));
        lua.push(Double.valueOf(messageData.getCreateTime()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294518792386613L));
        lua.push(messageData.getContent());
        lua.setField(-2, AbstractC0295Gu.m625r(-294566037026869L));
        lua.push(Double.valueOf(messageData.getTalkerType()));
        lua.setField(-2, AbstractC0295Gu.m625r(-294600396765237L));
        final int i = 8;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294647641405493L));
        final int i2 = 15;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i2) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294158015133749L));
        final int i3 = 0;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i3) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294209554741301L));
        final int i4 = 1;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i4) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294286864152629L));
        final int i5 = 2;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i5) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294342698727477L));
        final int i6 = 3;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i6) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-294389943367733L));
        final int i7 = 4;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i7) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292770740697141L));
        final int i8 = 5;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i8) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292805100435509L));
        final int i9 = 6;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i9) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292839460173877L));
        final int i10 = 7;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i10) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292873819912245L));
        final int i11 = 9;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i11) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292908179650613L));
        final int i12 = 10;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i12) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292938244421685L));
        final int i13 = 11;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i13) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292964014225461L));
        final int i14 = 12;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i14) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-293011258865717L));
        final int i15 = 13;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i15) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292513042659381L));
        final int i16 = 14;
        lua.push(new JFunction() { // from class: Ir
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i16) {
                    case 0:
                        return MessageAPI.pushMessageData$lambda$20(messageData, lua2);
                    case 1:
                        return MessageAPI.pushMessageData$lambda$21(messageData, lua2);
                    case 2:
                        return MessageAPI.pushMessageData$lambda$22(messageData, lua2);
                    case 3:
                        return MessageAPI.pushMessageData$lambda$23(messageData, lua2);
                    case 4:
                        return MessageAPI.pushMessageData$lambda$24(messageData, lua2);
                    case 5:
                        return MessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 6:
                        return MessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 7:
                        return MessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        return MessageAPI.pushMessageData$lambda$18(messageData, lua2);
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        return MessageAPI.pushMessageData$lambda$28(messageData, lua2);
                    case 10:
                        return MessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 11:
                        return MessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 12:
                        return MessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 13:
                        return MessageAPI.pushMessageData$lambda$32(messageData, lua2);
                    case 14:
                        return MessageAPI.pushMessageData$lambda$33(messageData, lua2);
                    default:
                        return MessageAPI.pushMessageData$lambda$19(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-292547402397749L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$18(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342111324993589L);
        lua.push(messageData.isPrivateChat());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$19(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342119914928181L);
        lua.push(messageData.isGroupChat());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$20(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342128504862773L);
        lua.push(messageData.isOfficialAccount());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$21(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342137094797365L);
        lua.push(messageData.isEnterprise());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$22(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342145684731957L);
        lua.push(messageData.m5467isSend());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$23(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342154274666549L);
        lua.push(messageData.isText());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$24(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342162864601141L);
        lua.push(messageData.isImage());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$25(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342171454535733L);
        lua.push(messageData.isVoice());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$26(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342180044470325L);
        lua.push(messageData.isVideo());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$27(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342188634404917L);
        lua.push(messageData.isEmoji());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$28(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342197224339509L);
        lua.push(messageData.isCard());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$29(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342205814274101L);
        lua.push(messageData.isTip());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$30(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342214404208693L);
        lua.push(messageData.isTransfer());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$31(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342222994143285L);
        lua.push(messageData.isRedPacket());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$32(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342781339891765L);
        lua.push(messageData.isReply());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$33(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-342789929826357L);
        lua.push(messageData.isFile());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-293522359973941L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-293530949908533L);
        AbstractC0295Gu.m625r(-293028438734901L);
        AbstractC0295Gu.m625r(-293071388407861L);
        AbstractC0295Gu.m625r(-293084273309749L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-293213122328629L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-293221712263221L);
        AbstractC0295Gu.m625r(-293268956903477L);
        AbstractC0295Gu.m625r(-291666934102069L);
        AbstractC0295Gu.m625r(-291679819003957L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-291001214171189L);
        lua.toNumber(1);
        AbstractC0295Gu.m625r(-291009804105781L);
        AbstractC0295Gu.m625r(-291057048746037L);
        AbstractC0295Gu.m625r(-291091408484405L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-342347548194869L);
        if (!lua.isFunction(1)) {
            lua.push(Double.valueOf(-1.0d));
            return 1;
        }
        lua.pushValue(1);
        int iRef = lua.ref();
        messageCallbacks.add(new MessageCallback(lua, iRef));
        lua.push(Double.valueOf(iRef));
        AbstractC0295Gu.m625r(-342356138129461L);
        AbstractC0295Gu.m625r(-342403382769717L);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$14(Lua lua) {
        AbstractC0295Gu.m625r(-341952411203637L);
        int number = (int) lua.toNumber(1);
        boolean zRemoveIf = messageCallbacks.removeIf(new C2746y8(new C2703x8(number, 1), 1));
        if (zRemoveIf) {
            lua.unref(number);
        }
        lua.push(zRemoveIf);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$14$lambda$12(int i, MessageCallback messageCallback) {
        return messageCallback.getFuncRef() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$14$lambda$13(InterfaceC1416fj interfaceC1416fj, Object obj) {
        return ((Boolean) interfaceC1416fj.mo90g(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-341961001138229L);
        Iterator<T> it = messageCallbacks.iterator();
        while (it.hasNext()) {
            lua.unref(((MessageCallback) it.next()).getFuncRef());
        }
        messageCallbacks.clear();
        AbstractC0295Gu.m625r(-341969591072821L);
        AbstractC0295Gu.m625r(-342016835713077L);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-291808668022837L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-291817257957429L);
        AbstractC0295Gu.m625r(-291864502597685L);
        AbstractC0295Gu.m625r(-291911747237941L);
        AbstractC0295Gu.m625r(-291374876325941L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-291503725344821L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-291512315279413L);
        AbstractC0295Gu.m625r(-291559559919669L);
        AbstractC0295Gu.m625r(-291606804559925L);
        AbstractC0295Gu.m625r(-291619689461813L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-292298294294581L);
        lua.toNumber(1);
        lua.toString(2);
        lua.toString(3);
        AbstractC0295Gu.m625r(-292306884229173L);
        AbstractC0295Gu.m625r(-292354128869429L);
        AbstractC0295Gu.m625r(-292401373509685L);
        AbstractC0295Gu.m625r(-292414258411573L);
        AbstractC0295Gu.m625r(-292427143313461L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-292006236518453L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-292014826453045L);
        AbstractC0295Gu.m625r(-292062071093301L);
        AbstractC0295Gu.m625r(-292105020766261L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-290584602343477L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-290593192278069L);
        AbstractC0295Gu.m625r(-290640436918325L);
        AbstractC0295Gu.m625r(-290704861427765L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        AbstractC0295Gu.m625r(-290283954632757L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-290292544567349L);
        AbstractC0295Gu.m625r(-290339789207605L);
        AbstractC0295Gu.m625r(-290395623782453L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-290524472801333L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-290533062735925L);
        AbstractC0295Gu.m625r(-291130063190069L);
        AbstractC0295Gu.m625r(-291190192732213L);
        AbstractC0295Gu.m625r(-291203077634101L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-291331926652981L);
        lua.toNumber(1);
        AbstractC0295Gu.m625r(-291340516587573L);
        AbstractC0295Gu.m625r(-290838005413941L);
        AbstractC0295Gu.m625r(-290872365152309L);
        lua.push(false);
        return 1;
    }

    public final void cleanup() {
        for (MessageCallback messageCallback : messageCallbacks) {
            try {
                LuaLocks.INSTANCE.withLock(messageCallback.getLua(), new C0693Q4(5, messageCallback));
            } catch (Exception unused) {
            }
        }
        messageCallbacks.clear();
        AbstractC0295Gu.m625r(-293350561282101L);
        AbstractC0295Gu.m625r(-293397805922357L);
    }

    public final void cleanupFor(Lua lua) {
        AbstractC0295Gu.m625r(-292577467168821L);
        CopyOnWriteArrayList<MessageCallback> copyOnWriteArrayList = messageCallbacks;
        ArrayList<MessageCallback> arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (AbstractC0585Nj.m1134a(((MessageCallback) obj).getLua(), lua)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (MessageCallback messageCallback : arrayList) {
            messageCallbacks.remove(messageCallback);
            try {
                LuaLocks.INSTANCE.withLock(lua, new C1389f(8, lua, messageCallback));
            } catch (Exception unused) {
            }
        }
        AbstractC0295Gu.m625r(-292594647038005L);
        AbstractC0295Gu.m625r(-292641891678261L);
        arrayList.size();
    }

    public final void dispatchMessage(MessageData messageData) {
        AbstractC0295Gu.m625r(-293891727161397L);
        AbstractC0295Gu.m625r(-293908907030581L);
        AbstractC0295Gu.m625r(-293956151670837L);
        messageData.getContent();
        AbstractC0295Gu.m625r(-294050640951349L);
        for (MessageCallback messageCallback : messageCallbacks) {
            try {
                Lua lua = messageCallback.getLua();
                LuaLocks.INSTANCE.withLock(lua, new C0525M8(lua, messageCallback, messageData, 4));
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-294110770493493L);
                AbstractC0295Gu.m625r(-293608259319861L);
                messageCallback.getFuncRef();
            }
        }
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-296382808193077L);
        lua.createTable(0, 20);
        lua.push(new C1355e9(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-296399988062261L));
        lua.push(new C1355e9(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-296438642767925L));
        lua.push(new C1355e9(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-296481592440885L));
        lua.push(new C1355e9(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-296524542113845L));
        lua.push(new C1355e9(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-296567491786805L));
        lua.push(new C1355e9(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-294961174018101L));
        lua.push(new C1355e9(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-294999828723765L));
        lua.push(new C1355e9(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-295059958265909L));
        lua.push(new C1355e9(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-295111497873461L));
        lua.push(new C1355e9(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-295167332448309L));
        lua.push(new C1355e9(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-295197397219381L));
        lua.push(new C1355e9(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-294677706176565L));
        lua.push(new C1355e9(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-294720655849525L));
        lua.push(new C1355e9(19));
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-294767900489781L), 1.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-294832324999221L), 3.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-294875274672181L), 34.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-294922519312437L), 43.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295519519766581L), 47.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295566764406837L), 49.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295614009047093L), 10000.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295656958720053L), 4.19430449E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295695613425717L), 4.36207665E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295755742967861L), 8.22083633E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-295274706630709L), 1.090519089E9d);
        lua.setField(-2, AbstractC0295Gu.m625r(-295321951270965L));
        lua.setGlobal(AbstractC0295Gu.m625r(-295364900943925L));
        AbstractC0295Gu.m625r(-295399260682293L);
        AbstractC0295Gu.m625r(-295446505322549L);
    }
}
