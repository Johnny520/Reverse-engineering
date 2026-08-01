package p096;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import p052.InterfaceC6557;
import p079.AbstractC6995;

/* JADX INFO: renamed from: 飘花落叶言世苏子兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7217 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7217 f19270 = new C7217(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7217 f19271 = new C7217(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19272;

    public /* synthetic */ C7217(int i) {
        this.f19272 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        AbstractC4913 abstractC4913 = (AbstractC4913) obj;
        switch (this.f19272) {
            case 0:
                abstractC4913.getClass();
                InterfaceC4476 interfaceC4476Mo9221 = abstractC4913.mo9732().mo9221();
                return Boolean.valueOf(interfaceC4476Mo9221 != null && (interfaceC4476Mo9221 instanceof InterfaceC4462) && (((InterfaceC4462) interfaceC4476Mo9221).mo9038() instanceof AbstractC6995));
            default:
                abstractC4913.getClass();
                InterfaceC4476 interfaceC4476Mo92212 = abstractC4913.mo9732().mo9221();
                if (interfaceC4476Mo92212 == null || (!(interfaceC4476Mo92212 instanceof AbstractC6995) && !(interfaceC4476Mo92212 instanceof InterfaceC4462))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
