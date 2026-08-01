package p165l1;

import ec.AbstractC2169p0;
import ec.AbstractC2210z1;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p163l.AbstractC4284d1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l1.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4513s {

    /* JADX INFO: renamed from: l1.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2198w1 f13155a;

        /* JADX INFO: renamed from: b */
        public final Object f13156b;

        public a(InterfaceC2198w1 interfaceC2198w1, Object obj) {
            this.f13155a = interfaceC2198w1;
            this.f13156b = obj;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2198w1 m17482a() {
            return this.f13155a;
        }

        /* JADX INFO: renamed from: b */
        public final Object m17483b() {
            return this.f13156b;
        }
    }

    /* JADX INFO: renamed from: l1.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f13157q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f13158r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0184l f13159s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ AtomicReference f13160t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC0188p f13161u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0184l interfaceC0184l, AtomicReference atomicReference, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f13159s = interfaceC0184l;
            this.f13160t = atomicReference;
            this.f13161u = interfaceC0188p;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f13159s, this.f13160t, this.f13161u, interfaceC5976f);
            bVar.f13158r = obj;
            return bVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            InterfaceC2198w1 interfaceC2198w1M17482a;
            a aVar2;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f13157q;
            try {
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f13158r;
                    aVar = new a(AbstractC2210z1.m7960m(interfaceC2165o0.getCoroutineContext()), this.f13159s.mo27m(interfaceC2165o0));
                    a aVar3 = (a) this.f13160t.getAndSet(aVar);
                    if (aVar3 != null && (interfaceC2198w1M17482a = aVar3.m17482a()) != null) {
                        this.f13158r = aVar;
                        this.f13157q = 1;
                        if (AbstractC2210z1.m7954g(interfaceC2198w1M17482a, this) != objM24992g) {
                        }
                        return objM24992g;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aVar2 = (a) this.f13158r;
                        try {
                            AbstractC4713t.m18808b(obj);
                            AbstractC4284d1.m16830a(this.f13160t, aVar2, null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            AbstractC4284d1.m16830a(this.f13160t, aVar2, null);
                            throw th;
                        }
                    }
                    aVar = (a) this.f13158r;
                    AbstractC4713t.m18808b(obj);
                }
                InterfaceC0188p interfaceC0188p = this.f13161u;
                Object objM17483b = aVar.m17483b();
                this.f13158r = aVar;
                this.f13157q = 2;
                obj = interfaceC0188p.invoke(objM17483b, this);
                if (obj != objM24992g) {
                    aVar2 = aVar;
                    AbstractC4284d1.m16830a(this.f13160t, aVar2, null);
                    return obj;
                }
                return objM24992g;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                AbstractC4284d1.m16830a(this.f13160t, aVar2, null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AtomicReference m17478a() {
        return m17479b(new AtomicReference(null));
    }

    /* JADX INFO: renamed from: c */
    public static final Object m17480c(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.m17483b();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m17481d(AtomicReference atomicReference, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        return AbstractC2169p0.m7882e(new b(interfaceC0184l, atomicReference, interfaceC0188p, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: b */
    public static AtomicReference m17479b(AtomicReference atomicReference) {
        return atomicReference;
    }
}
