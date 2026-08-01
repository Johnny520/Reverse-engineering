package p228p8;

import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: p8.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5977g extends InterfaceC5980j.b {

    /* JADX INFO: renamed from: n */
    public static final b f18915n = b.f18916q;

    /* JADX INFO: renamed from: p8.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Object m23976a(InterfaceC5977g interfaceC5977g, Object obj, InterfaceC0188p interfaceC0188p) {
            interfaceC0188p.getClass();
            return InterfaceC5980j.b.a.m23985a(interfaceC5977g, obj, interfaceC0188p);
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC5980j.b m23977b(InterfaceC5977g interfaceC5977g, InterfaceC5980j.c cVar) {
            InterfaceC5980j.b bVarM23970b;
            cVar.getClass();
            if (!(cVar instanceof AbstractC5972b)) {
                if (InterfaceC5977g.f18915n != cVar) {
                    return null;
                }
                interfaceC5977g.getClass();
                return interfaceC5977g;
            }
            AbstractC5972b abstractC5972b = (AbstractC5972b) cVar;
            if (!abstractC5972b.m23969a(interfaceC5977g.getKey()) || (bVarM23970b = abstractC5972b.m23970b(interfaceC5977g)) == null) {
                return null;
            }
            return bVarM23970b;
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC5980j m23978c(InterfaceC5977g interfaceC5977g, InterfaceC5980j.c cVar) {
            cVar.getClass();
            if (!(cVar instanceof AbstractC5972b)) {
                return InterfaceC5977g.f18915n == cVar ? C5981k.f18917q : interfaceC5977g;
            }
            AbstractC5972b abstractC5972b = (AbstractC5972b) cVar;
            return (!abstractC5972b.m23969a(interfaceC5977g.getKey()) || abstractC5972b.m23970b(interfaceC5977g) == null) ? interfaceC5977g : C5981k.f18917q;
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC5980j m23979d(InterfaceC5977g interfaceC5977g, InterfaceC5980j interfaceC5980j) {
            interfaceC5980j.getClass();
            return InterfaceC5980j.b.a.m23988d(interfaceC5977g, interfaceC5980j);
        }

        /* JADX INFO: renamed from: e */
        public static void m23980e(InterfaceC5977g interfaceC5977g, InterfaceC5976f interfaceC5976f) {
            interfaceC5976f.getClass();
        }
    }

    /* JADX INFO: renamed from: p8.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC5980j.c {

        /* JADX INFO: renamed from: q */
        public static final /* synthetic */ b f18916q = new b();
    }

    /* JADX INFO: renamed from: F0 */
    void mo5456F0(InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: G */
    InterfaceC5976f mo5457G(InterfaceC5976f interfaceC5976f);
}
