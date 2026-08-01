package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import p023.C6986;
import p086.AbstractC7732;
import p086.C7735;
import p086.InterfaceC7737;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5656 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC7732 f14402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7735 f14403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6986 f14404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5331 f14405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7737 f14406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5665 f14407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5642 f14408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5634 f14409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5655 f14410;

    public C5656(C5665 c5665, InterfaceC7737 interfaceC7737, InterfaceC5331 interfaceC5331, C6986 c6986, C7735 c7735, AbstractC7732 abstractC7732, InterfaceC5634 interfaceC5634, C5642 c5642, List list) {
        interfaceC7737.getClass();
        interfaceC5331.getClass();
        c7735.getClass();
        abstractC7732.getClass();
        list.getClass();
        this.f14407 = c5665;
        this.f14406 = interfaceC7737;
        this.f14405 = interfaceC5331;
        this.f14404 = c6986;
        this.f14403 = c7735;
        this.f14402 = abstractC7732;
        this.f14409 = interfaceC5634;
        this.f14408 = new C5642(this, c5642, list, "Deserializer for \"" + interfaceC5331.getName() + '\"', interfaceC5634 != null ? interfaceC5634.mo9807() : "[container not found]");
        this.f14410 = new C5655(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5656 m10123(InterfaceC5331 interfaceC5331, List list, InterfaceC7737 interfaceC7737, C6986 c6986, C7735 c7735, AbstractC7732 abstractC7732) {
        list.getClass();
        interfaceC7737.getClass();
        c7735.getClass();
        abstractC7732.getClass();
        int i = abstractC7732.f18755;
        if ((i != 1 || abstractC7732.f18754 < 4) && i <= 1) {
            c7735 = this.f14403;
        }
        return new C5656(this.f14407, interfaceC7737, interfaceC5331, c6986, c7735, abstractC7732, this.f14409, this.f14408, list);
    }
}
