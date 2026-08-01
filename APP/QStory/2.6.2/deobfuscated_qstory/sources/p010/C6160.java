package p010;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6160 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6159 f16781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16782;

    public /* synthetic */ C6160(InterfaceC6159 interfaceC6159, int i) {
        this.f16782 = i;
        this.f16781 = interfaceC6159;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16782) {
            case 1:
                this.f16781.mo8631(methodHookParam);
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16782) {
            case 0:
                this.f16781.mo8631(methodHookParam);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
