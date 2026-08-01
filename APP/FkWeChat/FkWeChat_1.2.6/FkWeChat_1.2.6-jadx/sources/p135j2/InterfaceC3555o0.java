package p135j2;

import java.util.ArrayList;
import java.util.List;
import p121i3.AbstractC3174d;

/* JADX INFO: renamed from: j2.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3555o0 {
    /* JADX INFO: renamed from: b */
    default int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C3535j((InterfaceC3563r) list.get(i11), EnumC3569t.f9927r, EnumC3572u.f9931q));
        }
        return mo2920c(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), arrayList, AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: c */
    InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10);

    /* JADX INFO: renamed from: d */
    default int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C3535j((InterfaceC3563r) list.get(i11), EnumC3569t.f9927r, EnumC3572u.f9932r));
        }
        return mo2920c(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), arrayList, AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }

    /* JADX INFO: renamed from: e */
    default int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C3535j((InterfaceC3563r) list.get(i11), EnumC3569t.f9926q, EnumC3572u.f9931q));
        }
        return mo2920c(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), arrayList, AbstractC3174d.m11985b(0, 0, 0, i10, 7, null)).mo13078e();
    }

    /* JADX INFO: renamed from: h */
    default int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C3535j((InterfaceC3563r) list.get(i11), EnumC3569t.f9926q, EnumC3572u.f9932r));
        }
        return mo2920c(new C3575v(interfaceC3566s, interfaceC3566s.getLayoutDirection()), arrayList, AbstractC3174d.m11985b(0, i10, 0, 0, 13, null)).mo13077a();
    }
}
