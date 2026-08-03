package p000;

import io.github.cherrywechat.lua.api.CherryXposedAPI;
import io.github.cherrywechat.lua.api.HookAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1355e9 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4857a;

    public /* synthetic */ C1355e9(int r1) {
        this.f4857a = r1;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f4857a) {
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
        return NetworkAPI.m3484o(r2);
    L7:
        return MessageAPI.m3456m(r2);
    L9:
        return MessageAPI.m3451h(r2);
    L11:
        return MessageAPI.m3467x(r2);
    L13:
        return MessageAPI.m3446c(r2);
    L15:
        return MessageAPI.m3450g(r2);
    L17:
        return MessageAPI.m3439E(r2);
    L19:
        return MessageAPI.m3464u(r2);
    L21:
        return MessageAPI.m3462s(r2);
    L23:
        return MessageAPI.m3452i(r2);
    L25:
        return MessageAPI.m3449f(r2);
    L27:
        return MessageAPI.m3460q(r2);
    L29:
        return MessageAPI.m3436B(r2);
    L31:
        return MessageAPI.m3440F(r2);
    L33:
        return MessageAPI.m3444a(r2);
    L35:
        return JavaImporter.m3517i(r2);
    L37:
        return HookAPI.m3422a(r2);
    L39:
        return HookAPI.m3424c(r2);
    L41:
        return HookAPI.m3423b(r2);
    L43:
        return HookAPI.m3427f(r2);
    L45:
        return HookAPI.m3425d(r2);
    L47:
        return HookAPI.m3429h(r2);
    L49:
        return HookAPI.m3428g(r2);
    L51:
        return HookAPI.m3426e(r2);
    L53:
        return CherryXposedAPI.m3390a(r2);
    L55:
        return CherryXposedAPI.m3403l(r2);
    L57:
        return CherryXposedAPI.m3413v(r2);
    L59:
        return CherryXposedAPI.m3401j(r2);
    L61:
        return CherryXposedAPI.m3384U(r2);
    L63:
        return CherryXposedAPI.m3385V(r2);
    }
}
