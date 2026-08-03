package io.github.cherrywechat.lua.api;

import java.util.List;
import p000.AbstractC0295Gu;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryAPIRegistry {
    public static final CherryAPIRegistry INSTANCE = null;
    private static final String TAG = null;

    static {
        TAG = AbstractC0295Gu.m625r(-501875518470197L);
        INSTANCE = new CherryAPIRegistry();
    }

    private CherryAPIRegistry() {
    }

    private final void registerConfigModule(Lua r3) {
        CherryConfigAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503499016108085L));
    }

    private final void registerDevModule(Lua r3, List<? extends ClassLoader> r4) {
        CherryDevAPI.INSTANCE.register(r3, r4);
        r3.setField(-2, AbstractC0295Gu.m625r(-503065224411189L));
    }

    private final void registerFileModule(Lua r3) {
        CherryFileAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503529080879157L));
    }

    private final void registerGlobalFunctions(Lua r2) {
        CherryGlobalAPI.INSTANCE.register(r2);
    }

    private final void registerMessageModule(Lua r3) {
        CherryMessageAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503400231860277L));
    }

    private final void registerNetworkModule(Lua r3) {
        CherryNetworkAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503434591598645L));
    }

    private final void registerThreadModule(Lua r3) {
        CherryThreadAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503035159640117L));
    }

    private final void registerUIModule(Lua r3) {
        CherryViewAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503550555715637L));
    }

    private final void registerUtilModule(Lua r3) {
        CherryUtilAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503563440617525L));
    }

    private final void registerWeChatModule(Lua r3) {
        CherryWeChatAPI.INSTANCE.register(r3);
        r3.setField(-2, AbstractC0295Gu.m625r(-503370167089205L));
    }

    private final void registerXposedModule(Lua r3, List<? extends ClassLoader> r4) {
        CherryXposedAPI.INSTANCE.register(r3, r4);
        r3.setField(-2, AbstractC0295Gu.m625r(-503468951337013L));
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

    public final void cleanupFor(Lua r3) {
        AbstractC0295Gu.m625r(-503275677808693L);
        CherryMessageAPI.INSTANCE.cleanupFor(r3);
        MessageAPI.INSTANCE.cleanupFor(r3);
        CherryThreadAPI.INSTANCE.cleanupFor(r3);
        AbstractC0295Gu.m625r(-503292857677877L);
        AbstractC0295Gu.m625r(-501720899647541L);
    }

    public final void registerAll(Lua r3, List<? extends ClassLoader> r4) {
        AbstractC0295Gu.m625r(-502524058531893L);
        AbstractC0295Gu.m625r(-502541238401077L);
        r3.createTable(0, 20);
        registerWeChatModule(r3);
        registerMessageModule(r3);
        registerNetworkModule(r3);
        registerXposedModule(r3, r4);
        registerConfigModule(r3);
        registerFileModule(r3);
        registerUIModule(r3);
        registerUtilModule(r3);
        registerThreadModule(r3);
        registerDevModule(r3, r4);
        r3.setGlobal(AbstractC0295Gu.m625r(-502597072975925L));
        registerGlobalFunctions(r3);
        AbstractC0295Gu.m625r(-502627137746997L);
        AbstractC0295Gu.m625r(-502704447158325L);
    }
}
