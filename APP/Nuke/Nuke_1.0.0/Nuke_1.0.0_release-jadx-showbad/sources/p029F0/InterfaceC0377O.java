package p029F0;

import java.util.ArrayList;
import java.util.List;
import p153e1.AbstractC2006b;

/* JADX INFO: renamed from: F0.O */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0377O {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    default int mo651a(InterfaceC0420q interfaceC0420q, List list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new C0406j((InterfaceC0376N) list.get(i6), EnumC0422r.f1267e, EnumC0424s.f1280e, 0));
        }
        return mo16i(new C0428u(interfaceC0420q, interfaceC0420q.getLayoutDirection()), arrayList, AbstractC2006b.m3685b(i5, 0, 13)).mo609c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    default int mo652e(InterfaceC0420q interfaceC0420q, List list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new C0406j((InterfaceC0376N) list.get(i6), EnumC0422r.f1266d, EnumC0424s.f1279d, 0));
        }
        return mo16i(new C0428u(interfaceC0420q, interfaceC0420q.getLayoutDirection()), arrayList, AbstractC2006b.m3685b(0, i5, 7)).mo611e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    default int mo15f(InterfaceC0420q interfaceC0420q, List list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new C0406j((InterfaceC0376N) list.get(i6), EnumC0422r.f1267e, EnumC0424s.f1279d, 0));
        }
        return mo16i(new C0428u(interfaceC0420q, interfaceC0420q.getLayoutDirection()), arrayList, AbstractC2006b.m3685b(0, i5, 7)).mo611e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    default int mo653h(InterfaceC0420q interfaceC0420q, List list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new C0406j((InterfaceC0376N) list.get(i6), EnumC0422r.f1266d, EnumC0424s.f1280e, 0));
        }
        return mo16i(new C0428u(interfaceC0420q, interfaceC0420q.getLayoutDirection()), arrayList, AbstractC2006b.m3685b(i5, 0, 13)).mo609c();
    }

    /* JADX INFO: renamed from: i */
    InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5);
}
