package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryConfigAPI;
import io.github.cherrywechat.lua.api.CherryDevAPI;
import io.github.cherrywechat.lua.api.CherryFileAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2402q8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8420a;

    public /* synthetic */ C2402q8(int r1) {
        this.f8420a = r1;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f8420a) {
            case 0: goto L63;
            case 1: goto L61;
            case 2: goto L59;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L43;
            case 11: goto L41;
            case 12: goto L39;
            case 13: goto L37;
            case 14: goto L35;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L5:
        return CherryFileAPI.m3080q(r2);
    L7:
        return CherryFileAPI.m3068e(r2);
    L9:
        return CherryFileAPI.m3066c(r2);
    L11:
        return CherryFileAPI.m3062A(r2);
    L13:
        return CherryFileAPI.m3086w(r2);
    L15:
        return CherryFileAPI.m3084u(r2);
    L17:
        return CherryFileAPI.m3083t(r2);
    L19:
        return CherryFileAPI.m3071h(r2);
    L21:
        return CherryDevAPI.m3058c(r2);
    L23:
        return CherryDevAPI.m3057b(r2);
    L25:
        return CherryDevAPI.m3060e(r2);
    L27:
        return CherryDevAPI.m3056a(r2);
    L29:
        return CherryDevAPI.m3059d(r2);
    L31:
        return CherryDevAPI.m3061f(r2);
    L33:
        return CherryConfigAPI.m3042a(r2);
    L35:
        return CherryConfigAPI.m3052k(r2);
    L37:
        return CherryConfigAPI.m3049h(r2);
    L39:
        return CherryConfigAPI.m3050i(r2);
    L41:
        return CherryConfigAPI.m3055n(r2);
    L43:
        return CherryConfigAPI.m3045d(r2);
    L45:
        return CherryConfigAPI.m3046e(r2);
    L47:
        return CherryConfigAPI.m3048g(r2);
    L49:
        return CherryConfigAPI.m3047f(r2);
    L51:
        return CherryConfigAPI.m3053l(r2);
    L53:
        return CherryConfigAPI.m3054m(r2);
    L55:
        return CherryConfigAPI.m3044c(r2);
    L57:
        return CherryConfigAPI.m3051j(r2);
    L59:
        return CherryConfigAPI.m3043b(r2);
    L61:
        return CherryAPI.m2989C(r2);
    L63:
        return CherryAPI.m3002P(r2);
    }
}
