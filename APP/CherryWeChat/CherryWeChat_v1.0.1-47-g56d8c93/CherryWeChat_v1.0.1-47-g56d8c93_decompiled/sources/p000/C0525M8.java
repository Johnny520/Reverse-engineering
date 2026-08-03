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

    public /* synthetic */ C0525M8(LuaContext luaContext, String str, Object[] objArr) {
        this.f1714a = 2;
        this.f1716c = luaContext;
        this.f1715b = str;
        this.f1717d = objArr;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1714a) {
            case 0:
                return CherryViewAPI.register$lambda$77$lambda$76((String) this.f1715b, (String) this.f1716c, (Map) this.f1717d);
            case 1:
                return LuaContext.setGlobal$lambda$3(this.f1716c, (LuaContext) this.f1717d, (String) this.f1715b);
            case 2:
                return LuaContext.callFunction_gIAlu_s$lambda$6((LuaContext) this.f1716c, (String) this.f1715b, (Object[]) this.f1717d);
            case 3:
                return LuaEngine.setGlobal$lambda$9$lambda$8(this.f1716c, (Lua) this.f1717d, (String) this.f1715b);
            default:
                return MessageAPI.dispatchMessage$lambda$17((Lua) this.f1715b, (MessageAPI.MessageCallback) this.f1716c, (MessageAPI.MessageData) this.f1717d);
        }
    }

    public /* synthetic */ C0525M8(Object obj, AutoCloseable autoCloseable, String str, int i) {
        this.f1714a = i;
        this.f1716c = obj;
        this.f1717d = autoCloseable;
        this.f1715b = str;
    }

    public /* synthetic */ C0525M8(Object obj, Object obj2, Object obj3, int i) {
        this.f1714a = i;
        this.f1715b = obj;
        this.f1716c = obj2;
        this.f1717d = obj3;
    }
}
