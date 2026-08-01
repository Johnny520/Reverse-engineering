package p163l;

import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import nc.AbstractC5568g;
import nc.InterfaceC5562a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4289e1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f12557a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final InterfaceC5562a f12558b = AbstractC5568g.m22627b(false, 1, null);

    /* JADX INFO: renamed from: l.e1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final EnumC4273b1 f12559a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2198w1 f12560b;

        public a(EnumC4273b1 enumC4273b1, InterfaceC2198w1 interfaceC2198w1) {
            this.f12559a = enumC4273b1;
            this.f12560b = interfaceC2198w1;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16846a(a aVar) {
            return this.f12559a.compareTo(aVar.f12559a) >= 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m16847b() {
            this.f12560b.mo7696n(new C4279c1());
        }
    }

    /* JADX INFO: renamed from: l.e1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f12561q;

        /* JADX INFO: renamed from: r */
        public Object f12562r;

        /* JADX INFO: renamed from: s */
        public Object f12563s;

        /* JADX INFO: renamed from: t */
        public int f12564t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12565u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ EnumC4273b1 f12566v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C4289e1 f12567w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC0184l f12568x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC4273b1 enumC4273b1, C4289e1 c4289e1, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f12566v = enumC4273b1;
            this.f12567w = c4289e1;
            this.f12568x = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f12566v, this.f12567w, this.f12568x, interfaceC5976f);
            bVar.f12565u = obj;
            return bVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, nc.a] */
        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC5562a interfaceC5562a;
            a aVar;
            C4289e1 c4289e1;
            InterfaceC0184l interfaceC0184l;
            Throwable th;
            C4289e1 c4289e12;
            a aVar2;
            InterfaceC5562a interfaceC5562a2;
            Object objM24992g = AbstractC6325c.m24992g();
            ?? r12 = this.f12564t;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f12565u;
                        EnumC4273b1 enumC4273b1 = this.f12566v;
                        InterfaceC5980j.b bVarMo1654h = interfaceC2165o0.getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g);
                        bVarMo1654h.getClass();
                        a aVar3 = new a(enumC4273b1, (InterfaceC2198w1) bVarMo1654h);
                        this.f12567w.m16845f(aVar3);
                        interfaceC5562a = this.f12567w.f12558b;
                        InterfaceC0184l interfaceC0184l2 = this.f12568x;
                        C4289e1 c4289e13 = this.f12567w;
                        this.f12565u = aVar3;
                        this.f12561q = interfaceC5562a;
                        this.f12562r = interfaceC0184l2;
                        this.f12563s = c4289e13;
                        this.f12564t = 1;
                        if (interfaceC5562a.mo22609d(null, this) != objM24992g) {
                            aVar = aVar3;
                            c4289e1 = c4289e13;
                            interfaceC0184l = interfaceC0184l2;
                        }
                        return objM24992g;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c4289e12 = (C4289e1) this.f12562r;
                        interfaceC5562a2 = (InterfaceC5562a) this.f12561q;
                        aVar2 = (a) this.f12565u;
                        try {
                            AbstractC4713t.m18808b(obj);
                            AbstractC4284d1.m16830a(c4289e12.f12557a, aVar2, null);
                            interfaceC5562a2.mo22608c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC4284d1.m16830a(c4289e12.f12557a, aVar2, null);
                            throw th;
                        }
                    }
                    c4289e1 = (C4289e1) this.f12563s;
                    interfaceC0184l = (InterfaceC0184l) this.f12562r;
                    InterfaceC5562a interfaceC5562a3 = (InterfaceC5562a) this.f12561q;
                    aVar = (a) this.f12565u;
                    AbstractC4713t.m18808b(obj);
                    interfaceC5562a = interfaceC5562a3;
                    this.f12565u = aVar;
                    this.f12561q = interfaceC5562a;
                    this.f12562r = c4289e1;
                    this.f12563s = null;
                    this.f12564t = 2;
                    Object objMo27m = interfaceC0184l.mo27m(this);
                    if (objMo27m != objM24992g) {
                        c4289e12 = c4289e1;
                        interfaceC5562a2 = interfaceC5562a;
                        obj = objMo27m;
                        aVar2 = aVar;
                        AbstractC4284d1.m16830a(c4289e12.f12557a, aVar2, null);
                        interfaceC5562a2.mo22608c(null);
                        return obj;
                    }
                    return objM24992g;
                } catch (Throwable th3) {
                    th = th3;
                    c4289e12 = c4289e1;
                    aVar2 = aVar;
                    AbstractC4284d1.m16830a(c4289e12.f12557a, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.mo22608c(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m16843e(C4289e1 c4289e1, EnumC4273b1 enumC4273b1, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4273b1 = EnumC4273b1.f12514q;
        }
        return c4289e1.m16844d(enumC4273b1, interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: d */
    public final Object m16844d(EnumC4273b1 enumC4273b1, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return AbstractC2169p0.m7882e(new b(enumC4273b1, this, interfaceC0184l, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: f */
    public final void m16845f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f12557a.get();
            if (aVar2 != null && !aVar.m16846a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC4284d1.m16830a(this.f12557a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.m16847b();
        }
    }
}
