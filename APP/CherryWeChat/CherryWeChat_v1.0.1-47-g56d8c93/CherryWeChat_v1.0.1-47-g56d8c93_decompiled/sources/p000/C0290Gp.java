package p000;

import io.github.cherrywechat.lua.LuaEngine;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: Gp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0290Gp implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f964b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f965c;

    public /* synthetic */ C0290Gp(Lua lua, String str, int i) {
        this.f963a = i;
        this.f964b = lua;
        this.f965c = str;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f963a) {
            case 0:
                return LuaEngine.getGlobal$lambda$11$lambda$10(this.f964b, this.f965c);
            default:
                return LuaEngine.executeInternal_gIAlu_s$lambda$7(this.f964b, this.f965c);
        }
    }
}
