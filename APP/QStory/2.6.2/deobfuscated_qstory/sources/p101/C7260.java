package p101;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import p066.AbstractC6875;
import p066.C6876;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7260 extends AbstractC6875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7259 f19356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19357;

    public C7260(ArrayList arrayList, AbstractC7259 abstractC7259) {
        this.f19357 = arrayList;
        this.f19356 = abstractC7259;
    }

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9547(InterfaceC4479 interfaceC4479, InterfaceC4479 interfaceC44792) {
        interfaceC44792.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.f19356.f19355 + ": " + interfaceC4479 + " vs " + interfaceC44792).toString());
    }

    @Override // p066.AbstractC6875
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo9548(InterfaceC4479 interfaceC4479) {
        interfaceC4479.getClass();
        C6876.m12115(interfaceC4479, null);
        this.f19357.add(interfaceC4479);
    }
}
