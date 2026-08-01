package p010;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6184 extends XC_MethodReplacement {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6192 f17008;

    public C6184(InterfaceC6192 interfaceC6192) {
        this.f17008 = interfaceC6192;
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        return this.f17008.mo10889(methodHookParam);
    }
}
