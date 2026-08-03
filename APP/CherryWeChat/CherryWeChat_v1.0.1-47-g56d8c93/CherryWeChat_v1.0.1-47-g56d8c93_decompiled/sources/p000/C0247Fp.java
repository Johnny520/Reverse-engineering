package p000;

import io.github.cherrywechat.lua.LuaContext;

/* JADX INFO: renamed from: Fp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0247Fp implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LuaContext f805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f806c;

    public /* synthetic */ C0247Fp(LuaContext luaContext, String str, int i) {
        this.f804a = i;
        this.f805b = luaContext;
        this.f806c = str;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f804a) {
            case 0:
                return LuaContext.executeFile_IoAF18A$lambda$2(this.f805b, this.f806c);
            default:
                return LuaContext.getGlobal$lambda$4(this.f805b, this.f806c);
        }
    }
}
