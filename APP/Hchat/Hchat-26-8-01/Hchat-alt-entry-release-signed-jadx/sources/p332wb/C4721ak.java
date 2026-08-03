package p332wb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.ak */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4721ak implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15787g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5391v0 f15788h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f15789i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4721ak(C5391v0 c5391v0, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f15787g = i9;
        this.f15788h = c5391v0;
        this.f15789i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f15787g) {
            case 0:
                list.getClass();
                InterfaceC1231l interfaceC1231l = this.f15788h.f21262e;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5292s0) it.next()).f20550a);
                }
                interfaceC1231l.invoke(AbstractC4955ho.m9316D5(arrayList));
                this.f15789i.setValue(null);
                break;
            case 1:
                list.getClass();
                InterfaceC1231l interfaceC1231l2 = this.f15788h.f21262e;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5292s0) it2.next()).f20550a);
                }
                interfaceC1231l2.invoke(AbstractC4955ho.m9316D5(arrayList2));
                this.f15789i.setValue(null);
                break;
            case 2:
                list.getClass();
                InterfaceC1231l interfaceC1231l3 = this.f15788h.f21262e;
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((C5292s0) it3.next()).f20550a);
                }
                interfaceC1231l3.invoke(AbstractC4955ho.m9316D5(arrayList3));
                this.f15789i.setValue(null);
                break;
            default:
                list.getClass();
                InterfaceC1231l interfaceC1231l4 = this.f15788h.f21262e;
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((C5292s0) it4.next()).f20550a);
                }
                interfaceC1231l4.invoke(AbstractC4955ho.m9316D5(arrayList4));
                this.f15789i.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }
}
