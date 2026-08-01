package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C1463;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1219 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6000 f1617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1618;

    public /* synthetic */ C1219(InterfaceC6000 interfaceC6000, int i) {
        this.f1618 = i;
        this.f1617 = interfaceC6000;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1618;
        InterfaceC6000 interfaceC6000 = this.f1617;
        switch (i) {
            case 0:
                C1191 c1191 = (C1191) obj;
                ((C1463) interfaceC6000).invoke(((AbstractC2182) c1191.f1528).getValue(), Float.valueOf(((C1193) c1191.f1527).f1538));
                return C6008.f15084;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ((InterfaceC7387) interfaceC6000).invoke(l);
        }
    }
}
