package p104h3;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p215oc.C5729x;
import p265s1.AbstractC7070e3;
import p265s1.AbstractC7078g1;
import p265s1.C7100k3;
import p265s1.C7128q1;

/* JADX INFO: renamed from: h3.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2863p {

    /* JADX INFO: renamed from: a */
    public static final a f7495a = a.f7496a;

    /* JADX INFO: renamed from: h3.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f7496a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC2863p m10268a(AbstractC7078g1 abstractC7078g1, float f10) {
            if (abstractC7078g1 == null) {
                return b.f7497b;
            }
            if (abstractC7078g1 instanceof C7100k3) {
                return m10269b(AbstractC2860m.m10262c(((C7100k3) abstractC7078g1).m27984b(), f10));
            }
            if (abstractC7078g1 instanceof AbstractC7070e3) {
                return new C2850c((AbstractC7070e3) abstractC7078g1, f10);
            }
            C5729x.m23182a();
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2863p m10269b(long j10) {
            return j10 != 16 ? new C2851d(j10, null) : b.f7497b;
        }
    }

    /* JADX INFO: renamed from: h3.p$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2863p {

        /* JADX INFO: renamed from: b */
        public static final b f7497b = new b();

        @Override // p104h3.InterfaceC2863p
        /* JADX INFO: renamed from: a */
        public float mo10102a() {
            return Float.NaN;
        }

        @Override // p104h3.InterfaceC2863p
        /* JADX INFO: renamed from: b */
        public long mo10103b() {
            return C7128q1.f23644b.m28147h();
        }

        @Override // p104h3.InterfaceC2863p
        /* JADX INFO: renamed from: f */
        public AbstractC7078g1 mo10104f() {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    static float m10264d(InterfaceC2863p interfaceC2863p) {
        return ((C2850c) interfaceC2863p).mo10102a();
    }

    /* JADX INFO: renamed from: a */
    float mo10102a();

    /* JADX INFO: renamed from: b */
    long mo10103b();

    /* JADX INFO: renamed from: c */
    default InterfaceC2863p m10266c(InterfaceC2863p interfaceC2863p) {
        boolean z10 = interfaceC2863p instanceof C2850c;
        if (!z10 || !(this instanceof C2850c)) {
            return (!z10 || (this instanceof C2850c)) ? (z10 || !(this instanceof C2850c)) ? interfaceC2863p.m10267e(new InterfaceC0173a() { // from class: h3.o
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return InterfaceC2863p.m10265g(this.f7494q);
                }
            }) : this : interfaceC2863p;
        }
        C2850c c2850c = (C2850c) interfaceC2863p;
        return new C2850c(c2850c.m10105h(), AbstractC2860m.m10263d(c2850c.mo10102a(), new InterfaceC0173a() { // from class: h3.n
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Float.valueOf(InterfaceC2863p.m10264d(this.f7493q));
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    default InterfaceC2863p m10267e(InterfaceC0173a interfaceC0173a) {
        return !AbstractC1061t.m3842c(this, b.f7497b) ? this : (InterfaceC2863p) interfaceC0173a.invoke();
    }

    /* JADX INFO: renamed from: f */
    AbstractC7078g1 mo10104f();

    /* JADX INFO: renamed from: g */
    static InterfaceC2863p m10265g(InterfaceC2863p interfaceC2863p) {
        return interfaceC2863p;
    }
}
