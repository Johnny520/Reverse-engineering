package p102h1;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: h1.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2819a0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2843x f7358a = m10035c(new InterfaceC0188p() { // from class: h1.y
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC2819a0.m10033a((InterfaceC2821b0) obj, obj2);
        }
    }, new InterfaceC0184l() { // from class: h1.z
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC2819a0.m10034b(obj);
        }
    });

    /* JADX INFO: renamed from: h1.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2843x {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0188p f7359a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0184l f7360b;

        public a(InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l) {
            this.f7359a = interfaceC0188p;
            this.f7360b = interfaceC0184l;
        }

        @Override // p102h1.InterfaceC2843x
        /* JADX INFO: renamed from: a */
        public Object mo10037a(Object obj) {
            return this.f7360b.mo27m(obj);
        }

        @Override // p102h1.InterfaceC2843x
        /* JADX INFO: renamed from: b */
        public Object mo10038b(InterfaceC2821b0 interfaceC2821b0, Object obj) {
            return this.f7359a.invoke(interfaceC2821b0, obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2843x m10035c(InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l) {
        return new a(interfaceC0188p, interfaceC0184l);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2843x m10036d() {
        InterfaceC2843x interfaceC2843x = f7358a;
        interfaceC2843x.getClass();
        return interfaceC2843x;
    }

    /* JADX INFO: renamed from: b */
    public static Object m10034b(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public static Object m10033a(InterfaceC2821b0 interfaceC2821b0, Object obj) {
        return obj;
    }
}
