package p308v1;

import java.util.ArrayList;
import java.util.List;
import p293u2.AbstractC4232b;

/* JADX INFO: renamed from: v1.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4412n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    default int mo3991a(InterfaceC4414o interfaceC4414o, List list, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C4393h((InterfaceC4409m0) list.get(i10), EnumC4417p.f14703h, EnumC4420q.f14708g, 0));
        }
        return mo3994h(new C4426s(interfaceC4414o, interfaceC4414o.getLayoutDirection()), arrayList, AbstractC4232b.m8509b(0, 0, 0, i9, 7)).mo7602h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    default int mo3992c(InterfaceC4414o interfaceC4414o, List list, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C4393h((InterfaceC4409m0) list.get(i10), EnumC4417p.f14702g, EnumC4420q.f14708g, 0));
        }
        return mo3994h(new C4426s(interfaceC4414o, interfaceC4414o.getLayoutDirection()), arrayList, AbstractC4232b.m8509b(0, 0, 0, i9, 7)).mo7602h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    default int mo3993g(InterfaceC4414o interfaceC4414o, List list, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C4393h((InterfaceC4409m0) list.get(i10), EnumC4417p.f14703h, EnumC4420q.f14709h, 0));
        }
        return mo3994h(new C4426s(interfaceC4414o, interfaceC4414o.getLayoutDirection()), arrayList, AbstractC4232b.m8509b(0, i9, 0, 0, 13)).mo7601g();
    }

    /* JADX INFO: renamed from: h */
    InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    default int mo3995i(InterfaceC4414o interfaceC4414o, List list, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C4393h((InterfaceC4409m0) list.get(i10), EnumC4417p.f14702g, EnumC4420q.f14709h, 0));
        }
        return mo3994h(new C4426s(interfaceC4414o, interfaceC4414o.getLayoutDirection()), arrayList, AbstractC4232b.m8509b(0, i9, 0, 0, 13)).mo7601g();
    }
}
