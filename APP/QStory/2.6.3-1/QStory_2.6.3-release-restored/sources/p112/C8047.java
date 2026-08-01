package p112;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import p068.InterfaceC7387;
import p095.AbstractC7825;

/* JADX INFO: renamed from: 飘花落叶言世苏子兰哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8047 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8047 f19610 = new C8047(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8047 f19611 = new C8047(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19612;

    public /* synthetic */ C8047(int i) {
        this.f19612 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        AbstractC5746 abstractC5746 = (AbstractC5746) obj;
        switch (this.f19612) {
            case 0:
                abstractC5746.getClass();
                InterfaceC5309 interfaceC5309Mo9770 = abstractC5746.mo10281().mo9770();
                return Boolean.valueOf(interfaceC5309Mo9770 != null && (interfaceC5309Mo9770 instanceof InterfaceC5295) && (((InterfaceC5295) interfaceC5309Mo9770).mo9587() instanceof AbstractC7825));
            default:
                abstractC5746.getClass();
                InterfaceC5309 interfaceC5309Mo97702 = abstractC5746.mo10281().mo9770();
                if (interfaceC5309Mo97702 == null || (!(interfaceC5309Mo97702 instanceof AbstractC7825) && !(interfaceC5309Mo97702 instanceof InterfaceC5295))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
