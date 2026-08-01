package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802;
import p007.C6157;
import p070.AbstractC6903;
import p070.C6906;
import p070.InterfaceC6908;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4824 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC6903 f14057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6906 f14058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6157 f14059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4499 f14060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6908 f14061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4833 f14062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4810 f14063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4802 f14064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4823 f14065;

    public C4824(C4833 c4833, InterfaceC6908 interfaceC6908, InterfaceC4499 interfaceC4499, C6157 c6157, C6906 c6906, AbstractC6903 abstractC6903, InterfaceC4802 interfaceC4802, C4810 c4810, List list) {
        interfaceC6908.getClass();
        interfaceC4499.getClass();
        c6906.getClass();
        abstractC6903.getClass();
        list.getClass();
        this.f14062 = c4833;
        this.f14061 = interfaceC6908;
        this.f14060 = interfaceC4499;
        this.f14059 = c6157;
        this.f14058 = c6906;
        this.f14057 = abstractC6903;
        this.f14064 = interfaceC4802;
        this.f14063 = new C4810(this, c4810, list, "Deserializer for \"" + interfaceC4499.getName() + '\"', interfaceC4802 != null ? interfaceC4802.mo9248() : "[container not found]");
        this.f14065 = new C4823(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4824 m9564(InterfaceC4499 interfaceC4499, List list, InterfaceC6908 interfaceC6908, C6157 c6157, C6906 c6906, AbstractC6903 abstractC6903) {
        list.getClass();
        interfaceC6908.getClass();
        c6906.getClass();
        abstractC6903.getClass();
        int i = abstractC6903.f18410;
        if ((i != 1 || abstractC6903.f18409 < 4) && i <= 1) {
            c6906 = this.f14058;
        }
        return new C4824(this.f14062, interfaceC6908, interfaceC4499, c6157, c6906, abstractC6903, this.f14064, this.f14063, list);
    }
}
