package p073f2;

import p010a9.InterfaceC0188p;
import p121i3.InterfaceC3175e;
import p179m2.InterfaceC4862j3;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: f2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2230b extends InterfaceC3175e {
    /* JADX INFO: renamed from: W0 */
    static /* synthetic */ Object m8030W0(InterfaceC2230b interfaceC2230b, EnumC2265s enumC2265s, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            return null;
        }
        if ((i10 & 1) != 0) {
            enumC2265s = EnumC2265s.f6226r;
        }
        return interfaceC2230b.mo8033b0(enumC2265s, interfaceC5976f);
    }

    /* JADX INFO: renamed from: V */
    C2261q mo8031V();

    /* JADX INFO: renamed from: a */
    long mo8032a();

    /* JADX INFO: renamed from: b0 */
    Object mo8033b0(EnumC2265s enumC2265s, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: d1 */
    Object mo8034d1(long j10, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: e0 */
    Object mo8035e0(long j10, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f);

    InterfaceC4862j3 getViewConfiguration();

    /* JADX INFO: renamed from: p1 */
    long mo8036p1();
}
