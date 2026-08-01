package p101;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import p066.AbstractC6876;
import p066.C6877;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7261 extends AbstractC6876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7260 f19351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19352;

    public C7261(ArrayList arrayList, AbstractC7260 abstractC7260) {
        this.f19352 = arrayList;
        this.f19351 = abstractC7260;
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9537(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802) {
        interfaceC44802.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.f19351.f19350 + ": " + interfaceC4480 + " vs " + interfaceC44802).toString());
    }

    @Override // p066.AbstractC6876
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9538(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        C6877.m12143(interfaceC4480, null);
        this.f19352.add(interfaceC4480);
    }
}
