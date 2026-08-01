package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6859 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16805;

    public /* synthetic */ C6859(int i) {
        this.f16805 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16805;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                InterfaceC2779 interfaceC2779 = (InterfaceC2779) obj;
                interfaceC2779.getClass();
                AbstractC2781.m4203(interfaceC2779);
                return c6008;
            case 1:
                InterfaceC2779 interfaceC27792 = (InterfaceC2779) obj;
                interfaceC27792.getClass();
                AbstractC2781.m4203(interfaceC27792);
                return c6008;
            case 2:
                return c6008;
            default:
                List list = (List) obj;
                list.getClass();
                return new C6864(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
