package p000;

import io.github.cherrywechat.lua.LuaContext;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import java.util.Map;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: M8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0525M8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1716c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1717d;

    public /* synthetic */ C0525M8(LuaContext r2, String r3, Object[] r4) {
        this.f1714a = 2;
        this.f1716c = r2;
        this.f1715b = r3;
        this.f1717d = r4;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f1714a) {
            case 0: goto L13;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        Lua r0 = (Lua) this.f1717d;
        String r1 = (String) this.f1715b;
        return LuaEngine.m2981b(this.f1716c, r0, r1);
    L10:
        LuaContext r02 = (LuaContext) this.f1717d;
        String r12 = (String) this.f1715b;
        return LuaContext.m2976d(this.f1716c, r02, r12);
    L5:
        return MessageAPI.m3454k((Lua) this.f1715b, (MessageAPI.MessageCallback) this.f1716c, (MessageAPI.MessageData) this.f1717d);
    L9:
        return LuaContext.m2978i((LuaContext) this.f1716c, (String) this.f1715b, (Object[]) this.f1717d);
    L13:
        return CherryViewAPI.m3285a((String) this.f1715b, (String) this.f1716c, (Map) this.f1717d);
    }

    public /* synthetic */ C0525M8(Object r1, AutoCloseable r2, String r3, int r4) {
        this.f1714a = r4;
        this.f1716c = r1;
        this.f1717d = r2;
        this.f1715b = r3;
    }

    public /* synthetic */ C0525M8(Object r1, Object r2, Object r3, int r4) {
        this.f1714a = r4;
        this.f1715b = r1;
        this.f1716c = r2;
        this.f1717d = r3;
    }
}
