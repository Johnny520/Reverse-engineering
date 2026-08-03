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

    public /* synthetic */ C1312d9(XC_MethodHook.MethodHookParam r1, int r2) {
        this.f4766a = r2;
        this.f4767b = r1;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f4766a) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return HookAPI.m3430i(this.f4767b, r2);
    L7:
        return HookAPI.m3431j(this.f4767b, r2);
    L9:
        return CherryXposedAPI.m3373J(this.f4767b, r2);
    L11:
        return CherryXposedAPI.m3396e(this.f4767b, r2);
    L13:
        return CherryXposedAPI.m3383T(this.f4767b, r2);
    }
}
