package p010;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6153 extends XC_MethodReplacement {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6161 f16771;

    public C6153(InterfaceC6161 interfaceC6161) {
        this.f16771 = interfaceC6161;
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        return this.f16771.mo10832(methodHookParam);
    }
}
