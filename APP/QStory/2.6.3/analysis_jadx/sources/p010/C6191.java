package p010;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6191 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6190 f17018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17019;

    public /* synthetic */ C6191(InterfaceC6190 interfaceC6190, int i) {
        this.f17019 = i;
        this.f17018 = interfaceC6190;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f17019) {
            case 1:
                this.f17018.mo8621(methodHookParam);
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f17019) {
            case 0:
                this.f17018.mo8621(methodHookParam);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
