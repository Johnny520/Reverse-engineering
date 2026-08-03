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

    public /* synthetic */ C1399f9(Lua r1, int r2, XC_MethodHook.MethodHookParam r3, int r4) {
        this.f4962a = r4;
        this.f4963b = r1;
        this.f4964c = r2;
        this.f4965d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f4962a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f4964c;
        XC_MethodHook.MethodHookParam r1 = this.f4965d;
        return HookAPI$doHook$callback$1.m3434c(this.f4963b, r0, r1);
    L6:
        int r02 = this.f4964c;
        XC_MethodHook.MethodHookParam r12 = this.f4965d;
        return HookAPI$doHook$callback$1.m3433b(this.f4963b, r02, r12);
    L8:
        int r03 = this.f4964c;
        XC_MethodHook.MethodHookParam r13 = this.f4965d;
        return HookAPI$doHook$callback$1.m3432a(this.f4963b, r03, r13);
    L10:
        int r04 = this.f4964c;
        XC_MethodHook.MethodHookParam r14 = this.f4965d;
        return CherryXposedAPI.C15541.m3421a(this.f4963b, r04, r14);
    L12:
        int r05 = this.f4964c;
        XC_MethodHook.MethodHookParam r15 = this.f4965d;
        return CherryXposedAPI.C15531.m3419b(this.f4963b, r05, r15);
    L14:
        int r06 = this.f4964c;
        XC_MethodHook.MethodHookParam r16 = this.f4965d;
        return CherryXposedAPI.C15531.m3420c(this.f4963b, r06, r16);
    L16:
        int r07 = this.f4964c;
        XC_MethodHook.MethodHookParam r17 = this.f4965d;
        return CherryXposedAPI.C15531.m3418a(this.f4963b, r07, r17);
    }
}
