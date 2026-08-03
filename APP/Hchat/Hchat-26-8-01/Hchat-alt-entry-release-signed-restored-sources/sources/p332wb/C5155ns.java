package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p080fb.C1099a;
import p080fb.C1125g1;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.ns */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5155ns implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19295g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1845j1 f19296h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f19297i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5155ns(C1845j1 c1845j1, Context context) {
        this.f19295g = 1;
        this.f19296h = c1845j1;
        this.f19297i = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Object next;
        int i9 = this.f19295g;
        C3967n c3967n = C3967n.f12976a;
        C1845j1 c1845j1 = this.f19296h;
        Context context = this.f19297i;
        switch (i9) {
            case 0:
                String str = (String) obj;
                str.getClass();
                List list = (List) c1845j1.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((C1099a) obj2).f3540b.equals(str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = (List) c1845j1.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!((C1099a) obj3).f3540b.equals(str)) {
                        arrayList2.add(obj3);
                    }
                }
                c1845j1.setValue(arrayList2);
                C1125g1 c1125g1 = C1125g1.f3676a;
                C1125g1.m2859b(context, arrayList);
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                Iterator it = ((List) c1845j1.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C5288rt) next).f20535a == jLongValue) {
                        }
                    } else {
                        next = null;
                    }
                }
                C5288rt c5288rt = (C5288rt) next;
                if (c5288rt != null) {
                    C1125g1 c1125g12 = C1125g1.f3676a;
                    C1125g1.m2859b(context, c5288rt.f20537c);
                }
                List list3 = (List) c1845j1.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list3) {
                    if (((C5288rt) obj4).f20535a != jLongValue) {
                        arrayList3.add(obj4);
                    }
                }
                c1845j1.setValue(arrayList3);
                break;
            default:
                List list4 = (List) obj;
                list4.getClass();
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1((List) c1845j1.getValue(), list4);
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : arrayListM8397F1) {
                    C1099a c1099a = (C1099a) obj5;
                    String str2 = c1099a.f3543e;
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = c1099a.f3540b;
                    }
                    if (hashSet.add(str2)) {
                        arrayList4.add(obj5);
                    }
                }
                List listM8403L1 = AbstractC4166m.m8403L1(12, arrayList4);
                HashSet hashSet2 = new HashSet();
                Iterator it2 = listM8403L1.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(((C1099a) it2.next()).f3540b);
                }
                C1125g1 c1125g13 = C1125g1.f3676a;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list4) {
                    if (!hashSet2.contains(((C1099a) obj6).f3540b)) {
                        arrayList5.add(obj6);
                    }
                }
                C1125g1.m2859b(context, arrayList5);
                c1845j1.setValue(listM8403L1);
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5155ns(Context context, C1845j1 c1845j1, int i9) {
        this.f19295g = i9;
        this.f19297i = context;
        this.f19296h = c1845j1;
    }
}
