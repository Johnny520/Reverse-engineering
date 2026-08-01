package p241q7;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1052o0;
import p034c7.AbstractC1376l0;
import p034c7.AbstractC1395w;
import p034c7.C1362e0;
import p034c7.InterfaceC1355b;
import p034c7.InterfaceC1368h0;
import p034c7.InterfaceC1369i;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p282t7.C8174a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: q7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6281c {

    /* JADX INFO: renamed from: a */
    public static final C8174a f19684a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1369i f19685b;

    /* JADX INFO: renamed from: q7.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f19686q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f19687r;

        public a(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f19686q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            AbstractC6281c.m24879d((InterfaceC1368h0) this.f19687r, true);
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C1362e0 c1362e0, InterfaceC1368h0 interfaceC1368h0, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(interfaceC5976f);
            aVar.f19687r = interfaceC1368h0;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(C4700i0.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(C4700i0.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f19684a = new C8174a("IgnoreTrailingSlashAttributeKey", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
        f19685b = AbstractC1395w.m5468g("IgnoreTrailingSlash", new InterfaceC0184l() { // from class: q7.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC6281c.m24876a((AbstractC1376l0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m24876a(AbstractC1376l0 abstractC1376l0) {
        abstractC1376l0.getClass();
        abstractC1376l0.m5417j(new a(null));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m24878c(InterfaceC1355b interfaceC1355b) {
        interfaceC1355b.getClass();
        return interfaceC1355b.getAttributes().mo31836g(f19684a);
    }

    /* JADX INFO: renamed from: d */
    public static final void m24879d(InterfaceC1355b interfaceC1355b, boolean z10) {
        if (z10) {
            interfaceC1355b.getAttributes().mo31833d(f19684a, C4700i0.f13910a);
        } else {
            interfaceC1355b.getAttributes().mo31830a(f19684a);
        }
    }
}
