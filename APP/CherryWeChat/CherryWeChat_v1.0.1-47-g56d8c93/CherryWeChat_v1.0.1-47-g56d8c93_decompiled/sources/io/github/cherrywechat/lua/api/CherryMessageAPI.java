package io.github.cherrywechat.lua.api;

import android.content.ContentValues;
import android.database.Cursor;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
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
import p000.C2703x8;
import p000.C2746y8;
import p000.InterfaceC1416fj;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryMessageAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-555017148823605L);
    public static final CherryMessageAPI INSTANCE = new CherryMessageAPI();
    private static final CopyOnWriteArrayList<MessageCallback> messageCallbacks = new CopyOnWriteArrayList<>();

    public static final class MessageCallback {
        private final int funcRef;
        private final Lua lua;

        public MessageCallback(Lua lua, int i) {
            AbstractC0295Gu.m625r(-546800876386357L);
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
            AbstractC0295Gu.m625r(-546818056255541L);
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
            sb.append(AbstractC0295Gu.m625r(-546835236124725L));
            sb.append(this.lua);
            sb.append(AbstractC0295Gu.m625r(-546925430437941L));
            return AbstractC0213Ey.m408f(sb, this.funcRef, ')');
        }
    }

    public static final class TalkerType {
        public static final int ENTERPRISE = 3;
        public static final int GROUP = 1;
        public static final TalkerType INSTANCE = new TalkerType();
        public static final int OFFICIAL = 2;
        public static final int PRIVATE = 0;

        private TalkerType() {
        }
    }

    public static final class Type {
        public static final int CARD = 49;
        public static final int EMOJI = 47;
        public static final int FILE = 1090519089;
        public static final int IMAGE = 3;
        public static final Type INSTANCE = new Type();
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

        private Type() {
        }
    }

    private CherryMessageAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanup$lambda$33$lambda$32(MessageCallback messageCallback) {
        messageCallback.getLua().unref(messageCallback.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanupFor$lambda$36$lambda$35(Lua lua, MessageCallback messageCallback) {
        lua.unref(messageCallback.getFuncRef());
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC dispatchMessage$lambda$24(MessageCallback messageCallback, MessageData messageData) {
        messageCallback.getLua().refGet(messageCallback.getFuncRef());
        INSTANCE.pushMessageData(messageCallback.getLua(), messageData);
        messageCallback.getLua().pCall(1, 0);
        return C0829TC.f2620a;
    }

    private final void pushMessageData(Lua lua, final MessageData messageData) {
        lua.createTable(0, 20);
        lua.push(messageData.getTalker());
        lua.setField(-2, AbstractC0295Gu.m625r(-562065190156341L));
        lua.push(messageData.getSendTalker());
        lua.setField(-2, AbstractC0295Gu.m625r(-562095254927413L));
        lua.push(Double.valueOf(messageData.isSend()));
        lua.setField(-2, AbstractC0295Gu.m625r(-562692255381557L));
        lua.push(Double.valueOf(messageData.getType()));
        lua.setField(-2, AbstractC0295Gu.m625r(-562722320152629L));
        lua.push(Double.valueOf(messageData.getMsgId()));
        lua.setField(-2, AbstractC0295Gu.m625r(-562743794989109L));
        lua.push(Double.valueOf(messageData.getCreateTime()));
        lua.setField(-2, AbstractC0295Gu.m625r(-562769564792885L));
        lua.push(messageData.getContent());
        lua.setField(-2, AbstractC0295Gu.m625r(-562816809433141L));
        lua.push(Double.valueOf(messageData.getTalkerType()));
        lua.setField(-2, AbstractC0295Gu.m625r(-562851169171509L));
        final int i = 3;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562898413811765L));
        final int i2 = 4;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i2) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562941363484725L));
        final int i3 = 5;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i3) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562425967409205L));
        final int i4 = 6;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i4) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562473212049461L));
        final int i5 = 0;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i5) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562503276820533L));
        final int i6 = 1;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i6) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562537636558901L));
        final int i7 = 2;
        lua.push(new JFunction() { // from class: w8
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                switch (i7) {
                    case 0:
                        return CherryMessageAPI.pushMessageData$lambda$29(messageData, lua2);
                    case 1:
                        return CherryMessageAPI.pushMessageData$lambda$30(messageData, lua2);
                    case 2:
                        return CherryMessageAPI.pushMessageData$lambda$31(messageData, lua2);
                    case 3:
                        return CherryMessageAPI.pushMessageData$lambda$25(messageData, lua2);
                    case 4:
                        return CherryMessageAPI.pushMessageData$lambda$26(messageData, lua2);
                    case 5:
                        return CherryMessageAPI.pushMessageData$lambda$27(messageData, lua2);
                    default:
                        return CherryMessageAPI.pushMessageData$lambda$28(messageData, lua2);
                }
            }
        });
        lua.setField(-2, AbstractC0295Gu.m625r(-562571996297269L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$25(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554407263467573L);
        lua.push(messageData.getTalkerType() == 0);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$26(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554415853402165L);
        lua.push(messageData.getTalkerType() == 1);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$27(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554424443336757L);
        lua.push(messageData.isSend() == 1);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$28(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554982789085237L);
        lua.push(messageData.getType() == 1);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$29(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554991379019829L);
        lua.push(messageData.getType() == 3);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$30(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-554999968954421L);
        lua.push(messageData.getType() == 34);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMessageData$lambda$31(MessageData messageData, Lua lua) {
        AbstractC0295Gu.m625r(-555008558889013L);
        lua.push(messageData.getType() == 43);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-561231966500917L);
        String string = lua.toString(1);
        String string2 = lua.toString(2);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            lua.push(false);
            return 1;
        }
        try {
            AbstractC2248ms.f7951a.getClass();
            C0668Pg.m1331l(string, string2);
            AbstractC0295Gu.m625r(-561240556435509L);
            AbstractC0295Gu.m625r(-560763815065653L);
            AbstractC0295Gu.m625r(-560806764738613L);
            AbstractC0295Gu.m625r(-560819649640501L);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-560866894280757L);
            AbstractC0295Gu.m625r(-560939908724789L);
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-561004333234229L);
        String string = lua.toString(1);
        String string2 = lua.toString(2);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            lua.push(false);
            return 1;
        }
        try {
            AbstractC2248ms.f7951a.getClass();
            AbstractC0295Gu.m625r(-173078592092213L);
            AbstractC0295Gu.m625r(-173108656863285L);
            AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C2202lp(string2, string, null, 2), 3);
            AbstractC0295Gu.m625r(-561012923168821L);
            AbstractC0295Gu.m625r(-561635693426741L);
            AbstractC0295Gu.m625r(-561682938066997L);
            AbstractC0295Gu.m625r(-561695822968885L);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-561743067609141L);
            AbstractC0295Gu.m625r(-561816082053173L);
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$10(Lua lua) {
        AbstractC0295Gu.m625r(-559209036904501L);
        lua.toNumber(1);
        AbstractC0295Gu.m625r(-559217626839093L);
        AbstractC0295Gu.m625r(-559290641283125L);
        AbstractC0295Gu.m625r(-559325001021493L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-559359360759861L);
        lua.toNumber(1);
        AbstractC0295Gu.m625r(-559367950694453L);
        AbstractC0295Gu.m625r(-557791697696821L);
        AbstractC0295Gu.m625r(-557826057435189L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-557860417173557L);
        lua.toNumber(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-557869007108149L);
        AbstractC0295Gu.m625r(-557942021552181L);
        AbstractC0295Gu.m625r(-557980676257845L);
        AbstractC0295Gu.m625r(-557993561159733L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$13(Lua lua) {
        AbstractC0295Gu.m625r(-557478165084213L);
        if (!lua.isFunction(1)) {
            lua.push(Double.valueOf(-1.0d));
            return 1;
        }
        lua.pushValue(1);
        int iRef = lua.ref();
        messageCallbacks.add(new MessageCallback(lua, iRef));
        lua.push(Double.valueOf(iRef));
        AbstractC0295Gu.m625r(-557486755018805L);
        AbstractC0295Gu.m625r(-557559769462837L);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-557658553710645L);
        int number = (int) lua.toNumber(1);
        boolean zRemoveIf = messageCallbacks.removeIf(new C2746y8(new C2703x8(number, 0), 0));
        if (zRemoveIf) {
            lua.unref(number);
        }
        lua.push(zRemoveIf);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$16$lambda$14(int i, MessageCallback messageCallback) {
        return messageCallback.getFuncRef() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$16$lambda$15(InterfaceC1416fj interfaceC1416fj, Object obj) {
        return ((Boolean) interfaceC1416fj.mo90g(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-557667143645237L);
        Iterator<T> it = messageCallbacks.iterator();
        while (it.hasNext()) {
            lua.unref(((MessageCallback) it.next()).getFuncRef());
        }
        messageCallbacks.clear();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-561335045716021L);
        lua.toString(1);
        lua.toString(2);
        if (lua.getTop() >= 3) {
            lua.toNumber(3);
        }
        AbstractC0295Gu.m625r(-561343635650613L);
        AbstractC0295Gu.m625r(-561416650094645L);
        AbstractC0295Gu.m625r(-561463894734901L);
        AbstractC0295Gu.m625r(-561476779636789L);
        AbstractC0295Gu.m625r(-561489664538677L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$22(Lua lua) {
        AbstractC0295Gu.m625r(-557675733579829L);
        String string = lua.toString(1);
        int number = lua.getTop() >= 2 ? (int) lua.toNumber(2) : 20;
        Long lValueOf = lua.getTop() >= 3 ? Long.valueOf((long) lua.toNumber(3)) : null;
        if (string == null || string.length() == 0) {
            lua.createTable(0, 0);
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(lValueOf != null ? AbstractC0295Gu.m625r(-557684323514421L) : AbstractC0295Gu.m625r(-556662121297973L), lValueOf != null ? new String[]{string, lValueOf.toString(), String.valueOf(number)} : new String[]{string, String.valueOf(number)});
            ArrayList arrayList = new ArrayList();
            if (cursorM1357w != null) {
                while (cursorM1357w.moveToNext()) {
                    try {
                        arrayList.add(AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-557229056981045L), Long.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557254826784821L))))), new C0208Et(AbstractC0295Gu.m625r(-557280596588597L), Long.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557319251294261L))))), new C0208Et(AbstractC0295Gu.m625r(-557357905999925L), Integer.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557379380836405L))))), new C0208Et(AbstractC0295Gu.m625r(-557400855672885L), Integer.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557430920443957L))))), new C0208Et(AbstractC0295Gu.m625r(-556911229401141L), Integer.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556941294172213L))))), new C0208Et(AbstractC0295Gu.m625r(-556971358943285L), Long.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557018603583541L))))), new C0208Et(AbstractC0295Gu.m625r(-557065848223797L), cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557095912994869L)))), new C0208Et(AbstractC0295Gu.m625r(-557125977765941L), cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-557160337504309L))))));
                    } finally {
                    }
                }
                cursorM1357w.close();
            }
            lua.createTable(arrayList.size(), 0);
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2496sa.m4978c0();
                    throw null;
                }
                Map map = (Map) obj;
                lua.createTable(0, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Long) {
                        lua.push(Double.valueOf(((Number) value).longValue()));
                    } else if (value instanceof Integer) {
                        lua.push(Double.valueOf(((Number) value).intValue()));
                    } else if (value instanceof String) {
                        lua.push((String) value);
                    } else {
                        lua.pushNil();
                    }
                    lua.setField(-2, str);
                }
                lua.rawSetI(-2, i2);
                i = i2;
            }
            AbstractC0295Gu.m625r(-555545429801013L);
            AbstractC0295Gu.m625r(-555618444245045L);
            AbstractC0295Gu.m625r(-555669983852597L);
            arrayList.size();
            AbstractC0295Gu.m625r(-555712933525557L);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-555755883198517L);
            AbstractC0295Gu.m625r(-555279141828661L);
            lua.createTable(0, 0);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$23(Lua lua) {
        AbstractC0295Gu.m625r(-555352156272693L);
        long number = (long) lua.toNumber(1);
        if (number == 0) {
            lua.pushNil();
            return 1;
        }
        try {
            Cursor cursorM1357w = AbstractC0671Pj.m1357w(AbstractC0295Gu.m625r(-555360746207285L), new String[]{String.valueOf(number)});
            if (cursorM1357w == null || !cursorM1357w.moveToFirst()) {
                if (cursorM1357w != null) {
                    cursorM1357w.close();
                }
                lua.pushNil();
                return 1;
            }
            lua.createTable(0, 10);
            lua.push(Double.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556352883652661L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-555828897642549L));
            lua.push(Double.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555854667446325L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-555893322151989L));
            lua.push(Double.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555931976857653L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-555953451694133L));
            lua.push(Double.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-555974926530613L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-556004991301685L));
            lua.push(Double.valueOf(cursorM1357w.getInt(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-556035056072757L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-556065120843829L));
            lua.push(Double.valueOf(cursorM1357w.getLong(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554445918173237L)))));
            lua.setField(-2, AbstractC0295Gu.m625r(-554493162813493L));
            lua.push(cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554540407453749L))));
            lua.setField(-2, AbstractC0295Gu.m625r(-554570472224821L));
            String string = cursorM1357w.getString(cursorM1357w.getColumnIndexOrThrow(AbstractC0295Gu.m625r(-554600536995893L)));
            if (string == null) {
                string = AbstractC0295Gu.m625r(-554634896734261L);
            }
            lua.push(string);
            lua.setField(-2, AbstractC0295Gu.m625r(-554639191701557L));
            cursorM1357w.close();
            AbstractC0295Gu.m625r(-554673551439925L);
            AbstractC0295Gu.m625r(-554196810070069L);
            AbstractC0295Gu.m625r(-554235464775733L);
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-554274119481397L, -554347133925429L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-561524024277045L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-561532614211637L);
        AbstractC0295Gu.m625r(-559956361214005L);
        AbstractC0295Gu.m625r(-560003605854261L);
        AbstractC0295Gu.m625r(-560016490756149L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-560050850494517L);
        lua.toString(1);
        lua.toString(2);
        AbstractC0295Gu.m625r(-560059440429109L);
        AbstractC0295Gu.m625r(-560132454873141L);
        AbstractC0295Gu.m625r(-560179699513397L);
        AbstractC0295Gu.m625r(-560192584415285L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-559677188339765L);
        String string = lua.toString(1);
        String string2 = lua.toString(2);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            lua.push(false);
            return 1;
        }
        try {
            AbstractC2248ms.f7951a.getClass();
            AbstractC0295Gu.m625r(-173310520326197L);
            AbstractC0295Gu.m625r(-173340585097269L);
            AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C2202lp(string2, string, null, 1), 3);
            AbstractC0295Gu.m625r(-559685778274357L);
            AbstractC0295Gu.m625r(-559758792718389L);
            AbstractC0295Gu.m625r(-559801742391349L);
            AbstractC0295Gu.m625r(-559814627293237L);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-559861871933493L);
            AbstractC0295Gu.m625r(-560484642191413L);
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$6(Lua lua) {
        AbstractC0295Gu.m625r(-560549066700853L);
        lua.toString(1);
        lua.toNumber(2);
        lua.toString(3);
        AbstractC0295Gu.m625r(-560557656635445L);
        AbstractC0295Gu.m625r(-560630671079477L);
        AbstractC0295Gu.m625r(-560677915719733L);
        AbstractC0295Gu.m625r(-560690800621621L);
        AbstractC0295Gu.m625r(-560703685523509L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        String string;
        String string2;
        String string3;
        String string4;
        AbstractC0295Gu.m625r(-560738045261877L);
        String string5 = lua.toString(1);
        if (string5 == null || string5.length() == 0) {
            lua.push(false);
            return 1;
        }
        if (lua.isTable(2)) {
            lua.getField(2, AbstractC0295Gu.m625r(-560746635196469L));
            string = lua.toString(-1);
            lua.pop(1);
            lua.getField(2, AbstractC0295Gu.m625r(-560214059251765L));
            string2 = lua.toString(-1);
            lua.pop(1);
            lua.getField(2, AbstractC0295Gu.m625r(-560239829055541L));
            string3 = lua.toString(-1);
            lua.pop(1);
            lua.getField(2, AbstractC0295Gu.m625r(-560291368663093L));
            string4 = lua.toString(-1);
            lua.pop(1);
            lua.getField(2, AbstractC0295Gu.m625r(-560321433434165L));
            lua.toString(-1);
            lua.pop(1);
        } else {
            string = null;
            string2 = null;
            string3 = null;
            string4 = null;
        }
        if (string == null || string.length() == 0) {
            AbstractC0295Gu.m625r(-560347203237941L);
            AbstractC0295Gu.m625r(-560420217681973L);
            lua.push(false);
            return 1;
        }
        try {
            AbstractC2248ms.f7951a.getClass();
            C0668Pg.m1333n(string5, string, string2, string3, string4);
            AbstractC0295Gu.m625r(-558882619390005L);
            AbstractC0295Gu.m625r(-558955633834037L);
            AbstractC0295Gu.m625r(-558998583506997L);
            AbstractC0295Gu.m625r(-559011468408885L);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-559058713049141L);
            AbstractC0295Gu.m625r(-558581971679285L);
            lua.push(false);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        AbstractC0295Gu.m625r(-558646396188725L);
        lua.toString(1);
        AbstractC0295Gu.m625r(-558654986123317L);
        AbstractC0295Gu.m625r(-558728000567349L);
        AbstractC0295Gu.m625r(-558788130109493L);
        lua.push(false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$9(Lua lua) {
        AbstractC0295Gu.m625r(-559458145007669L);
        String string = lua.toString(1);
        String string2 = lua.toString(2);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            lua.push(false);
            return 1;
        }
        try {
            AbstractC2248ms.f7951a.getClass();
            C0668Pg.m1328h(string, string2);
            AbstractC0295Gu.m625r(-559466734942261L);
            AbstractC0295Gu.m625r(-559539749386293L);
            AbstractC0295Gu.m625r(-559578404091957L);
            lua.push(true);
            return 1;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-559625648732213L);
            AbstractC0295Gu.m625r(-559148907362357L);
            lua.push(false);
            return 1;
        }
    }

    public final void cleanup() {
        for (MessageCallback messageCallback : messageCallbacks) {
            try {
                LuaLocks.INSTANCE.withLock(messageCallback.getLua(), new C0693Q4(2, messageCallback));
            } catch (Exception unused) {
            }
        }
        messageCallbacks.clear();
    }

    public final void cleanupFor(Lua lua) {
        AbstractC0295Gu.m625r(-562606356035637L);
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
                LuaLocks.INSTANCE.withLock(lua, new C1389f(1, lua, messageCallback));
            } catch (Exception unused) {
            }
        }
        AbstractC0295Gu.m625r(-562623535904821L);
        AbstractC0295Gu.m625r(-561047282907189L);
        arrayList.size();
    }

    public final void dispatchMessage(MessageData messageData) {
        AbstractC0295Gu.m625r(-562232693880885L);
        AbstractC0295Gu.m625r(-562249873750069L);
        AbstractC0295Gu.m625r(-562322888194101L);
        messageData.getContent();
        AbstractC0295Gu.m625r(-561867621660725L);
        for (MessageCallback messageCallback : messageCallbacks) {
            try {
                LuaLocks.INSTANCE.withLock(messageCallback.getLua(), new C1389f(2, messageCallback, messageData));
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-561927751202869L);
                AbstractC0295Gu.m625r(-562000765646901L);
            }
        }
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-547170243573813L);
        lua.createTable(0, 30);
        lua.createTable(0, 15);
        lua.push(Double.valueOf(1.0d));
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-547187423442997L), 3.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-547208898279477L), 34.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-547234668083253L), 43.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-547260437887029L), 47.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545636940249141L), 49.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545662710052917L), 48.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545684184889397L), 10000.0d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545722839595061L), 4.19430449E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545740019464245L), 4.36207665E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545778674169909L), 8.22083633E8d);
        AbstractC0213Ey.m419q(lua, -2, AbstractC0295Gu.m625r(-545825918810165L), 1.090519089E9d);
        lua.setField(-2, AbstractC0295Gu.m625r(-545851688613941L));
        lua.setField(-2, AbstractC0295Gu.m625r(-545873163450421L));
        lua.push(new C2617v8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-545894638286901L));
        lua.push(new C2617v8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-545383537178677L));
        lua.push(new C2617v8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-545426486851637L));
        lua.push(new C2617v8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-545469436524597L));
        lua.push(new C2617v8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-545512386197557L));
        lua.push(new C2617v8(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-545555335870517L));
        lua.push(new C2617v8(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-545593990576181L));
        lua.push(new C2617v8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-546186696063029L));
        lua.push(new C2617v8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-546225350768693L));
        lua.push(new C2617v8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-546281185343541L));
        lua.push(new C2617v8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-546315545081909L));
        lua.push(new C2617v8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-546345609852981L));
        lua.push(new C2617v8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-546375674624053L));
        lua.push(new C2617v8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-546410034362421L));
        lua.push(new C2617v8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-546452984035381L));
        lua.push(new C2617v8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-545950472861749L));
        lua.push(new C2617v8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-546014897371189L));
        lua.push(new C2617v8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-546062142011445L));
        AbstractC0295Gu.m625r(-546096501749813L);
        AbstractC0295Gu.m625r(-546169516193845L);
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

        public MessageData(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues) {
            AbstractC0295Gu.m625r(-546972675078197L);
            AbstractC0295Gu.m625r(-547002739849269L);
            AbstractC0295Gu.m625r(-546500228675637L);
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
            AbstractC0295Gu.m625r(-546534588414005L);
            AbstractC0295Gu.m625r(-546564653185077L);
            AbstractC0295Gu.m625r(-546611897825333L);
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

        public final int isSend() {
            return this.isSend;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-546646257563701L));
            AbstractC2374ph.m4817n(sb, this.talker, -546732156909621L);
            AbstractC2374ph.m4817n(sb, this.sendTalker, -547342042265653L);
            AbstractC0213Ey.m418p(sb, this.isSend, -547384991938613L);
            AbstractC0213Ey.m418p(sb, this.talkerId, -547436531546165L);
            AbstractC0213Ey.m418p(sb, this.type, -547470891284533L);
            sb.append(this.msgId);
            sb.append(AbstractC0295Gu.m625r(-547509545990197L));
            sb.append(this.createTime);
            sb.append(AbstractC0295Gu.m625r(-547019919718453L));
            AbstractC2374ph.m4817n(sb, this.content, -547067164358709L);
            AbstractC0213Ey.m418p(sb, this.talkerType, -547127293900853L);
            sb.append(this.values);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ MessageData(String str, String str2, int i, int i2, int i3, long j, long j2, String str3, int i4, ContentValues contentValues, int i5, AbstractC0621Oc abstractC0621Oc) {
            this(str, str2, i, i2, i3, j, j2, str3, i4, (i5 & 512) != 0 ? null : contentValues);
        }
    }
}
