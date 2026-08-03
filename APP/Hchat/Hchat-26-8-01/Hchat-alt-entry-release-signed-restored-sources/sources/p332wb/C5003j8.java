package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.j8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5003j8 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18067g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5391v0 f18068h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f18069i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18070j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5003j8(C5391v0 c5391v0, Context context, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18067g = i9;
        this.f18068h = c5391v0;
        this.f18069i = context;
        this.f18070j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f18067g) {
            case 0:
                list.getClass();
                InterfaceC1231l interfaceC1231l = this.f18068h.f21262e;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5292s0) it.next()).f20550a);
                }
                interfaceC1231l.invoke(AbstractC4955ho.m9316D5(arrayList));
                AbstractC4855en.m9271o("已选择 ", list.size(), " 项", this.f18069i, 0);
                this.f18070j.setValue(null);
                break;
            default:
                list.getClass();
                InterfaceC1231l interfaceC1231l2 = this.f18068h.f21262e;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5292s0) it2.next()).f20550a);
                }
                interfaceC1231l2.invoke(AbstractC4955ho.m9316D5(arrayList2));
                AbstractC4855en.m9271o("已选择 ", list.size(), " 项", this.f18069i, 0);
                this.f18070j.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }
}
