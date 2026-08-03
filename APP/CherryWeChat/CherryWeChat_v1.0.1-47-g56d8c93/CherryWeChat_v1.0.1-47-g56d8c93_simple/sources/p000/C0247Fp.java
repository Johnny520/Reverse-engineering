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

    public /* synthetic */ C0247Fp(LuaContext r1, String r2, int r3) {
        this.f804a = r3;
        this.f805b = r1;
        this.f806c = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f804a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return LuaContext.m2977f(this.f805b, this.f806c);
    L7:
        return LuaContext.m2979l(this.f805b, this.f806c);
    }
}
