package kotlin.reflect.jvm.internal.impl.p009km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import p101.C7882;
import p101.C7883;
import p102.C7890;
import p102.InterfaceC7889;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5369 implements InterfaceC5361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f13573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13576 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f13575 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13574 = new ArrayList(0);

    public C5369() {
        InterfaceC7889.f19305.getClass();
        List listM12937 = C7890.m12937();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12937, 10));
        Iterator it = listM12937.iterator();
        while (it.hasNext()) {
            ((C7883) ((InterfaceC7889) it.next())).getClass();
            arrayList.add(new C7882());
        }
        this.f13573 = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.InterfaceC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final ArrayList mo9687() {
        return this.f13574;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.InterfaceC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ArrayList mo9688() {
        return this.f13576;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.InterfaceC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ArrayList mo9689() {
        return this.f13575;
    }
}
