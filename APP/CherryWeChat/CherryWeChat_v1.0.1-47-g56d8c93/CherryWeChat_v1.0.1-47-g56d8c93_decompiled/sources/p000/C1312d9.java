package p000;

import de.robv.android.xposed.XC_MethodHook;
import io.github.cherrywechat.lua.api.CherryXposedAPI;
import io.github.cherrywechat.lua.api.HookAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: d9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1312d9 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f4767b;

    public /* synthetic */ C1312d9(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f4766a = i;
        this.f4767b = methodHookParam;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f4766a) {
            case 0:
                return CherryXposedAPI.pushMethodParam$lambda$74(this.f4767b, lua);
            case 1:
                return CherryXposedAPI.pushMethodParam$lambda$75(this.f4767b, lua);
            case 2:
                return CherryXposedAPI.pushMethodParam$lambda$76(this.f4767b, lua);
            case 3:
                return HookAPI.pushMethodParam$lambda$14(this.f4767b, lua);
            default:
                return HookAPI.pushMethodParam$lambda$15(this.f4767b, lua);
        }
    }
}
