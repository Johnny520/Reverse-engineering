package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import java.util.List;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6029 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16460;

    public /* synthetic */ C6029(int i) {
        this.f16460 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f16460;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                InterfaceC1944 interfaceC1944 = (InterfaceC1944) obj;
                interfaceC1944.getClass();
                AbstractC1946.m3643(interfaceC1944);
                return c5176;
            case 1:
                InterfaceC1944 interfaceC19442 = (InterfaceC1944) obj;
                interfaceC19442.getClass();
                AbstractC1946.m3643(interfaceC19442);
                return c5176;
            case 2:
                return c5176;
            default:
                List list = (List) obj;
                list.getClass();
                return new C6034(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
