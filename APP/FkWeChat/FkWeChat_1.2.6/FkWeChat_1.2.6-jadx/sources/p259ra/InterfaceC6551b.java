package p259ra;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5073d0;
import p213oa.C5693d;
import p213oa.C5695f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: ra.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6551b {

    /* JADX INFO: renamed from: ra.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC6551b {

        /* JADX INFO: renamed from: a */
        public static final a f20511a = new a();

        @Override // p259ra.InterfaceC6551b
        /* JADX INFO: renamed from: a */
        public String mo25869a(InterfaceC6004h interfaceC6004h, AbstractC6569n abstractC6569n) {
            interfaceC6004h.getClass();
            abstractC6569n.getClass();
            if (interfaceC6004h instanceof InterfaceC6018l1) {
                C5695f name = ((InterfaceC6018l1) interfaceC6004h).getName();
                name.getClass();
                return abstractC6569n.mo25910R(name, false);
            }
            C5693d c5693dM28760m = AbstractC7259i.m28760m(interfaceC6004h);
            c5693dM28760m.getClass();
            return abstractC6569n.mo25909Q(c5693dM28760m);
        }
    }

    /* JADX INFO: renamed from: ra.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC6551b {

        /* JADX INFO: renamed from: a */
        public static final b f20512a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p9.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [p9.j0, p9.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [p9.m] */
        @Override // p259ra.InterfaceC6551b
        /* JADX INFO: renamed from: a */
        public String mo25869a(InterfaceC6004h interfaceC6004h, AbstractC6569n abstractC6569n) {
            interfaceC6004h.getClass();
            abstractC6569n.getClass();
            if (interfaceC6004h instanceof InterfaceC6018l1) {
                C5695f name = ((InterfaceC6018l1) interfaceC6004h).getName();
                name.getClass();
                return abstractC6569n.mo25910R(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC6004h.getName());
                interfaceC6004h = interfaceC6004h.mo7443b();
            } while (interfaceC6004h instanceof InterfaceC5995e);
            return AbstractC6562g0.m25879c(AbstractC5073d0.m20510R(arrayList));
        }
    }

    /* JADX INFO: renamed from: ra.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC6551b {

        /* JADX INFO: renamed from: a */
        public static final c f20513a = new c();

        @Override // p259ra.InterfaceC6551b
        /* JADX INFO: renamed from: a */
        public String mo25869a(InterfaceC6004h interfaceC6004h, AbstractC6569n abstractC6569n) {
            interfaceC6004h.getClass();
            abstractC6569n.getClass();
            return m25870b(interfaceC6004h);
        }

        /* JADX INFO: renamed from: b */
        public final String m25870b(InterfaceC6004h interfaceC6004h) {
            C5695f name = interfaceC6004h.getName();
            name.getClass();
            String strM25878b = AbstractC6562g0.m25878b(name);
            if (interfaceC6004h instanceof InterfaceC6018l1) {
                return strM25878b;
            }
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6004h.mo7443b();
            interfaceC6019mMo7443b.getClass();
            String strM25871c = m25871c(interfaceC6019mMo7443b);
            if (strM25871c == null || AbstractC1061t.m3842c(strM25871c, _UrlKt.FRAGMENT_ENCODE_SET)) {
                return strM25878b;
            }
            return strM25871c + '.' + strM25878b;
        }

        /* JADX INFO: renamed from: c */
        public final String m25871c(InterfaceC6019m interfaceC6019m) {
            if (interfaceC6019m instanceof InterfaceC5995e) {
                return m25870b((InterfaceC6004h) interfaceC6019m);
            }
            if (interfaceC6019m instanceof InterfaceC6023n0) {
                return AbstractC6562g0.m25877a(((InterfaceC6023n0) interfaceC6019m).mo24031d().m23002i());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo25869a(InterfaceC6004h interfaceC6004h, AbstractC6569n abstractC6569n);
}
