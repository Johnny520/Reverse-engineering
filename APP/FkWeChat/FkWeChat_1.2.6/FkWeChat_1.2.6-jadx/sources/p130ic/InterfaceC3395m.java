package p130ic;

import p099gc.EnumC2732a;
import p113hc.InterfaceC2972c;
import p215oc.C5725t;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ic.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3395m extends InterfaceC2972c {

    /* JADX INFO: renamed from: ic.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC2972c m12744a(InterfaceC3395m interfaceC3395m, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a, int i11, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: fuse");
                return null;
            }
            if ((i11 & 1) != 0) {
                interfaceC5980j = C5981k.f18917q;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                enumC2732a = EnumC2732a.f7138q;
            }
            return interfaceC3395m.mo11005e(interfaceC5980j, i10, enumC2732a);
        }
    }

    /* JADX INFO: renamed from: e */
    InterfaceC2972c mo11005e(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a);
}
