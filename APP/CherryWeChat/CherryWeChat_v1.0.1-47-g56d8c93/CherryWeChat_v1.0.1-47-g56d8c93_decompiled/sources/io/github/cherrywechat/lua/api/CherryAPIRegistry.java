package io.github.cherrywechat.lua.api;

import java.util.List;
import p000.AbstractC0295Gu;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryAPIRegistry {
    private static final String TAG = AbstractC0295Gu.m625r(-501875518470197L);
    public static final CherryAPIRegistry INSTANCE = new CherryAPIRegistry();

    private CherryAPIRegistry() {
    }

    private final void registerConfigModule(Lua lua) {
        CherryConfigAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503499016108085L));
    }

    private final void registerDevModule(Lua lua, List<? extends ClassLoader> list) {
        CherryDevAPI.INSTANCE.register(lua, list);
        lua.setField(-2, AbstractC0295Gu.m625r(-503065224411189L));
    }

    private final void registerFileModule(Lua lua) {
        CherryFileAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503529080879157L));
    }

    private final void registerGlobalFunctions(Lua lua) {
        CherryGlobalAPI.INSTANCE.register(lua);
    }

    private final void registerMessageModule(Lua lua) {
        CherryMessageAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503400231860277L));
    }

    private final void registerNetworkModule(Lua lua) {
        CherryNetworkAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503434591598645L));
    }

    private final void registerThreadModule(Lua lua) {
        CherryThreadAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503035159640117L));
    }

    private final void registerUIModule(Lua lua) {
        CherryViewAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503550555715637L));
    }

    private final void registerUtilModule(Lua lua) {
        CherryUtilAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503563440617525L));
    }

    private final void registerWeChatModule(Lua lua) {
        CherryWeChatAPI.INSTANCE.register(lua);
        lua.setField(-2, AbstractC0295Gu.m625r(-503370167089205L));
    }

    private final void registerXposedModule(Lua lua, List<? extends ClassLoader> list) {
        CherryXposedAPI.INSTANCE.register(lua, list);
        lua.setField(-2, AbstractC0295Gu.m625r(-503468951337013L));
    }

    public final void cleanup() {
        CherryMessageAPI.INSTANCE.cleanup();
        CherryXposedAPI.INSTANCE.cleanup();
        CherryThreadAPI.INSTANCE.cleanup();
        CherryViewAPI.INSTANCE.cleanup();
        CherryDevAPI.INSTANCE.cleanup();
        AbstractC0295Gu.m625r(-503082404280373L);
        AbstractC0295Gu.m625r(-503159713691701L);
    }

    public final void cleanupFor(Lua lua) {
        AbstractC0295Gu.m625r(-503275677808693L);
        CherryMessageAPI.INSTANCE.cleanupFor(lua);
        MessageAPI.INSTANCE.cleanupFor(lua);
        CherryThreadAPI.INSTANCE.cleanupFor(lua);
        AbstractC0295Gu.m625r(-503292857677877L);
        AbstractC0295Gu.m625r(-501720899647541L);
    }

    public final void registerAll(Lua lua, List<? extends ClassLoader> list) {
        AbstractC0295Gu.m625r(-502524058531893L);
        AbstractC0295Gu.m625r(-502541238401077L);
        lua.createTable(0, 20);
        registerWeChatModule(lua);
        registerMessageModule(lua);
        registerNetworkModule(lua);
        registerXposedModule(lua, list);
        registerConfigModule(lua);
        registerFileModule(lua);
        registerUIModule(lua);
        registerUtilModule(lua);
        registerThreadModule(lua);
        registerDevModule(lua, list);
        lua.setGlobal(AbstractC0295Gu.m625r(-502597072975925L));
        registerGlobalFunctions(lua);
        AbstractC0295Gu.m625r(-502627137746997L);
        AbstractC0295Gu.m625r(-502704447158325L);
    }
}
