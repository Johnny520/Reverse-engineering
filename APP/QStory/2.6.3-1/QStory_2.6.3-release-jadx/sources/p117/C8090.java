package p117;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import p082.AbstractC7705;
import p082.C7706;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8090 extends AbstractC7705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8089 f19696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f19697;

    public C8090(ArrayList arrayList, AbstractC8089 abstractC8089) {
        this.f19697 = arrayList;
        this.f19696 = abstractC8089;
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10096(InterfaceC5312 interfaceC5312, InterfaceC5312 interfaceC53122) {
        interfaceC53122.getClass();
        throw new IllegalStateException(("Conflict in scope of " + this.f19696.f19695 + ": " + interfaceC5312 + " vs " + interfaceC53122).toString());
    }

    @Override // p082.AbstractC7705
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10097(InterfaceC5312 interfaceC5312) {
        interfaceC5312.getClass();
        C7706.m12702(interfaceC5312, null);
        this.f19697.add(interfaceC5312);
    }
}
