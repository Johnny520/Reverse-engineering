package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801;
import p015.C6230;
import p070.AbstractC6902;
import p070.C6905;
import p070.InterfaceC6907;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4823 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC6902 f14053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6905 f14054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6230 f14055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4498 f14056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6907 f14057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4832 f14058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4809 f14059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4801 f14060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4822 f14061;

    public C4823(C4832 c4832, InterfaceC6907 interfaceC6907, InterfaceC4498 interfaceC4498, C6230 c6230, C6905 c6905, AbstractC6902 abstractC6902, InterfaceC4801 interfaceC4801, C4809 c4809, List list) {
        interfaceC6907.getClass();
        interfaceC4498.getClass();
        c6905.getClass();
        abstractC6902.getClass();
        list.getClass();
        this.f14058 = c4832;
        this.f14057 = interfaceC6907;
        this.f14056 = interfaceC4498;
        this.f14055 = c6230;
        this.f14054 = c6905;
        this.f14053 = abstractC6902;
        this.f14060 = interfaceC4801;
        this.f14059 = new C4809(this, c4809, list, "Deserializer for \"" + interfaceC4498.getName() + '\"', interfaceC4801 != null ? interfaceC4801.mo9258() : "[container not found]");
        this.f14061 = new C4822(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4823 m9574(InterfaceC4498 interfaceC4498, List list, InterfaceC6907 interfaceC6907, C6230 c6230, C6905 c6905, AbstractC6902 abstractC6902) {
        list.getClass();
        interfaceC6907.getClass();
        c6905.getClass();
        abstractC6902.getClass();
        int i = abstractC6902.f18415;
        if ((i != 1 || abstractC6902.f18414 < 4) && i <= 1) {
            c6905 = this.f14054;
        }
        return new C4823(this.f14058, interfaceC6907, interfaceC4498, c6230, c6905, abstractC6902, this.f14060, this.f14059, list);
    }
}
