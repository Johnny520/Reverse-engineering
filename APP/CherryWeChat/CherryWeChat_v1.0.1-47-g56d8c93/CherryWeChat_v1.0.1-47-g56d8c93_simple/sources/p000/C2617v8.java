package p000;

import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2617v8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9073a;

    public /* synthetic */ C2617v8(int r1) {
        this.f9073a = r1;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f9073a) {
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
        return CherryNetworkAPI.m3158l(r2);
    L7:
        return CherryNetworkAPI.m3166t(r2);
    L9:
        return CherryNetworkAPI.m3147a(r2);
    L11:
        return CherryNetworkAPI.m3151e(r2);
    L13:
        return CherryNetworkAPI.m3161o(r2);
    L15:
        return CherryMessageAPI.m3126h(r2);
    L17:
        return CherryMessageAPI.m3129k(r2);
    L19:
        return CherryMessageAPI.m3132n(r2);
    L21:
        return CherryMessageAPI.m3130l(r2);
    L23:
        return CherryMessageAPI.m3118D(r2);
    L25:
        return CherryMessageAPI.m3131m(r2);
    L27:
        return CherryMessageAPI.m3127i(r2);
    L29:
        return CherryMessageAPI.m3128j(r2);
    L31:
        return CherryMessageAPI.m3119a(r2);
    L33:
        return CherryMessageAPI.m3142x(r2);
    L35:
        return CherryMessageAPI.m3116B(r2);
    L37:
        return CherryMessageAPI.m3139u(r2);
    L39:
        return CherryMessageAPI.m3115A(r2);
    L41:
        return CherryMessageAPI.m3120b(r2);
    L43:
        return CherryMessageAPI.m3143y(r2);
    L45:
        return CherryMessageAPI.m3117C(r2);
    L47:
        return CherryMessageAPI.m3141w(r2);
    L49:
        return CherryMessageAPI.m3136r(r2);
    L51:
        return CherryGlobalAPI.m3103n(r2);
    L53:
        return CherryGlobalAPI.m3100k(r2);
    L55:
        return CherryGlobalAPI.m3092c(r2);
    L57:
        return CherryGlobalAPI.m3094e(r2);
    L59:
        return CherryGlobalAPI.m3113x(r2);
    L61:
        return CherryGlobalAPI.m3093d(r2);
    L63:
        return CherryGlobalAPI.m3096g(r2);
    }
}
