package p321w;

import java.util.ArrayList;
import java.util.List;
import p057e1.C0808c;
import p085fg.InterfaceC1220a;
import p174m.C2576b;
import p276sf.C3958e;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p358y2.C5966c;
import p358y2.C5989x;
import tf.C4174u;

/* JADX INFO: renamed from: w.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4624o1 implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15306a;

    /* JADX INFO: renamed from: b */
    public final Object f15307b;

    /* JADX INFO: renamed from: c */
    public final Object f15308c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4624o1(Object obj, int i9, Object obj2) {
        this.f15306a = i9;
        this.f15307b = obj;
        this.f15308c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C3958e c3958e;
        switch (this.f15306a) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj = list.get(i9);
                    if (!(((InterfaceC4409m0) obj).mo8824X() instanceof C4627p1)) {
                        arrayList3.add(obj);
                    }
                }
                List list2 = (List) ((InterfaceC1220a) this.f15308c).invoke();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        C0808c c0808c = (C0808c) list2.get(i10);
                        if (c0808c != null) {
                            float f3 = c0808c.f2417b;
                            float f10 = c0808c.f2416a;
                            arrayList2 = arrayList4;
                            AbstractC4377b1 abstractC4377b1Mo8831Q = ((InterfaceC4409m0) arrayList3.get(i10)).mo8831Q(AbstractC4232b.m8509b(0, (int) Math.floor(c0808c.f2418c - f10), 0, (int) Math.floor(c0808c.f2419d - f3), 5));
                            int iRound = Math.round(f10);
                            c3958e = new C3958e(abstractC4377b1Mo8831Q, new C4240j((((long) Math.round(f3)) & 4294967295L) | (((long) iRound) << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            c3958e = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (c3958e != null) {
                            arrayList5.add(c3958e);
                        }
                        i10++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Object obj2 = list.get(i11);
                    if (((InterfaceC4409m0) obj2).mo8824X() instanceof C4627p1) {
                        arrayList6.add(obj2);
                    }
                }
                return interfaceC4418p0.mo8010z(C4231a.m8504h(j3), C4231a.m8503g(j3), C4174u.f13711g, new C2576b(arrayList, 26, AbstractC4634s.m9070m(arrayList6, (InterfaceC1220a) this.f15307b)));
            default:
                ((C5989x) this.f15307b).setParentLayoutDirection((EnumC4243m) this.f15308c);
                return interfaceC4418p0.mo8010z(0, 0, C4174u.f13711g, C5966c.f24245j);
        }
    }
}
