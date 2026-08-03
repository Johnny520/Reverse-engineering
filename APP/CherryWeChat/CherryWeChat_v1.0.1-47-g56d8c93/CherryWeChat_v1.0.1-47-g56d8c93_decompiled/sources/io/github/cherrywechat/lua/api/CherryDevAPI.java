package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.content.Context;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import java.util.List;
import p000.AbstractC0295Gu;
import p000.C2402q8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"StaticFieldLeak"})
public final class CherryDevAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-552538952693813L);
    public static final CherryDevAPI INSTANCE = new CherryDevAPI();

    private CherryDevAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-552191060342837L);
        int number = lua.getTop() > 0 ? (int) lua.toNumber(1) : 9527;
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        if (currentContext != null) {
            lua.push(CherryDevServer.INSTANCE.start(currentContext, number));
        } else {
            AbstractC0295Gu.m625r(-552199650277429L);
            AbstractC0295Gu.m625r(-552805240666165L);
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-552895434979381L);
        CherryDevServer.INSTANCE.stop();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-552904024913973L);
        String serverUrl = CherryDevServer.INSTANCE.getServerUrl();
        if (serverUrl != null) {
            lua.push(serverUrl);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-552912614848565L);
        lua.push(CherryDevServer.INSTANCE.isRunning());
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-552921204783157L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-552929794717749L);
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-552951269554229L);
        }
        String string3 = lua.toString(3);
        if (string3 == null) {
            string3 = AbstractC0295Gu.m625r(-552994219227189L);
        }
        CherryDevServer.INSTANCE.broadcastLog(string, string2, string3);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-552998514194485L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-553007104129077L);
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-553041463867445L);
        }
        CherryDevServer.INSTANCE.broadcastLog(string, AbstractC0295Gu.m625r(-553045758834741L), string2);
        return 0;
    }

    public final void cleanup() {
        CherryDevServer.INSTANCE.stop();
    }

    public final void register(Lua lua, List<? extends ClassLoader> list) {
        AbstractC0295Gu.m625r(-552328499296309L);
        AbstractC0295Gu.m625r(-552345679165493L);
        lua.createTable(0, 6);
        lua.push(new C2402q8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-552401513740341L));
        lua.push(new C2402q8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-552427283544117L));
        lua.push(new C2402q8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-552448758380597L));
        lua.push(new C2402q8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-552478823151669L));
        lua.push(new C2402q8(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-551972017010741L));
        lua.push(new C2402q8(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-551989196879925L));
        AbstractC0295Gu.m625r(-552032146552885L);
        AbstractC0295Gu.m625r(-552087981127733L);
    }
}
