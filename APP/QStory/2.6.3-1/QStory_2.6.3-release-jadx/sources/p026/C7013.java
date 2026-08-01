package p026;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7013 extends XC_MethodReplacement {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7021 f17353;

    public C7013(InterfaceC7021 interfaceC7021) {
        this.f17353 = interfaceC7021;
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        return this.f17353.mo11448(methodHookParam);
    }
}
