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

    public /* synthetic */ C0290Gp(Lua r1, String r2, int r3) {
        this.f963a = r3;
        this.f964b = r1;
        this.f965c = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f963a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return LuaEngine.m2980a(this.f964b, this.f965c);
    L7:
        return LuaEngine.m2982c(this.f964b, this.f965c);
    }
}
