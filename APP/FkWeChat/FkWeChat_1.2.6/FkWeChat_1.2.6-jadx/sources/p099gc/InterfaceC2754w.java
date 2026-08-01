package p099gc;

import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: gc.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2754w {

    /* JADX INFO: renamed from: gc.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m9873a(InterfaceC2754w interfaceC2754w, Throwable th, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: close");
                return false;
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC2754w.mo9776p(th);
        }
    }

    /* JADX INFO: renamed from: i */
    Object mo9768i(Object obj, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: p */
    boolean mo9776p(Throwable th);

    /* JADX INFO: renamed from: s */
    Object mo9781s(Object obj);
}
