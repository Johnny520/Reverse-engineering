package nc;

import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: nc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5562a {

    /* JADX INFO: renamed from: nc.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m22610a(InterfaceC5562a interfaceC5562a, Object obj, InterfaceC5976f interfaceC5976f, int i10, Object obj2) {
            if (obj2 != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: lock");
                return null;
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC5562a.mo22609d(obj, interfaceC5976f);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m22611b(InterfaceC5562a interfaceC5562a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: tryLock");
                return false;
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC5562a.mo22606a(obj);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m22612c(InterfaceC5562a interfaceC5562a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: unlock");
                return;
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC5562a.mo22608c(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo22606a(Object obj);

    /* JADX INFO: renamed from: b */
    boolean mo22607b();

    /* JADX INFO: renamed from: c */
    void mo22608c(Object obj);

    /* JADX INFO: renamed from: d */
    Object mo22609d(Object obj, InterfaceC5976f interfaceC5976f);
}
