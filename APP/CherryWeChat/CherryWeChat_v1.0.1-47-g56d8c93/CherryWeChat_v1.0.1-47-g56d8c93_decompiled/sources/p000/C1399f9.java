package p000;

import de.robv.android.xposed.XC_MethodHook;
import io.github.cherrywechat.lua.api.CherryXposedAPI;
import io.github.cherrywechat.lua.api.HookAPI$doHook$callback$1;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: f9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1399f9 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f4963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f4965d;

    public /* synthetic */ C1399f9(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam, int i2) {
        this.f4962a = i2;
        this.f4963b = lua;
        this.f4964c = i;
        this.f4965d = methodHookParam;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f4962a) {
            case 0:
                return CherryXposedAPI.C15531.beforeHookedMethod$lambda$0(this.f4963b, this.f4964c, this.f4965d);
            case 1:
                return CherryXposedAPI.C15531.beforeHookedMethod$lambda$1(this.f4963b, this.f4964c, this.f4965d);
            case 2:
                return CherryXposedAPI.C15531.afterHookedMethod$lambda$2(this.f4963b, this.f4964c, this.f4965d);
            case 3:
                return CherryXposedAPI.C15541.replaceHookedMethod$lambda$0(this.f4963b, this.f4964c, this.f4965d);
            case 4:
                return HookAPI$doHook$callback$1.beforeHookedMethod$lambda$0(this.f4963b, this.f4964c, this.f4965d);
            case 5:
                return HookAPI$doHook$callback$1.beforeHookedMethod$lambda$1(this.f4963b, this.f4964c, this.f4965d);
            default:
                return HookAPI$doHook$callback$1.afterHookedMethod$lambda$2(this.f4963b, this.f4964c, this.f4965d);
        }
    }
}
