package p096;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import p052.InterfaceC6558;
import p079.AbstractC6996;

/* JADX INFO: renamed from: 飘花落叶言世苏子兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7218 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7218 f19265 = new C7218(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7218 f19266 = new C7218(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19267;

    public /* synthetic */ C7218(int i) {
        this.f19267 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        AbstractC4914 abstractC4914 = (AbstractC4914) obj;
        switch (this.f19267) {
            case 0:
                abstractC4914.getClass();
                InterfaceC4477 interfaceC4477Mo9211 = abstractC4914.mo9722().mo9211();
                return Boolean.valueOf(interfaceC4477Mo9211 != null && (interfaceC4477Mo9211 instanceof InterfaceC4463) && (((InterfaceC4463) interfaceC4477Mo9211).mo9028() instanceof AbstractC6996));
            default:
                abstractC4914.getClass();
                InterfaceC4477 interfaceC4477Mo92112 = abstractC4914.mo9722().mo9211();
                if (interfaceC4477Mo92112 == null || (!(interfaceC4477Mo92112 instanceof AbstractC6996) && !(interfaceC4477Mo92112 instanceof InterfaceC4463))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
