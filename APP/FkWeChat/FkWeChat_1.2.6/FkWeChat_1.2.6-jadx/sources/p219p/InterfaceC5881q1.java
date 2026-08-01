package p219p;

import p010a9.InterfaceC0188p;
import p189n.EnumC5190a2;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: p.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5881q1 {
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m23705d(InterfaceC5881q1 interfaceC5881q1, EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: scroll");
            return null;
        }
        if ((i10 & 1) != 0) {
            enumC5190a2 = EnumC5190a2.f15823q;
        }
        return interfaceC5881q1.mo2979c(enumC5190a2, interfaceC0188p, interfaceC5976f);
    }

    /* JADX INFO: renamed from: a */
    boolean mo2977a();

    /* JADX INFO: renamed from: b */
    default boolean mo2978b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    Object mo2979c(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: e */
    default boolean mo2980e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    float mo2981f(float f10);
}
