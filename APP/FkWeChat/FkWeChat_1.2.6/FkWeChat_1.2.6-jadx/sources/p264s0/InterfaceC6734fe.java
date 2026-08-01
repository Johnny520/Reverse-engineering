package p264s0;

import p163l.C4267a1;
import p189n.EnumC5190a2;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: s0.fe */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6734fe {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m26675b(InterfaceC6734fe interfaceC6734fe, EnumC5190a2 enumC5190a2, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: show");
            return null;
        }
        if ((i10 & 1) != 0) {
            enumC5190a2 = EnumC5190a2.f15823q;
        }
        return interfaceC6734fe.mo26676a(enumC5190a2, interfaceC5976f);
    }

    /* JADX INFO: renamed from: a */
    Object mo26676a(EnumC5190a2 enumC5190a2, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: c */
    void mo26677c();

    /* JADX INFO: renamed from: d */
    C4267a1 mo26678d();

    void dismiss();

    boolean isVisible();
}
