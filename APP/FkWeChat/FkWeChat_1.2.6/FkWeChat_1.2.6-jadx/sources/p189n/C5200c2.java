package p189n;

import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import nc.AbstractC5568g;
import nc.InterfaceC5562a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p163l.AbstractC4284d1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n.c2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5200c2 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f15917a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final InterfaceC5562a f15918b = AbstractC5568g.m22627b(false, 1, null);

    /* JADX INFO: renamed from: n.c2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final EnumC5190a2 f15919a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2198w1 f15920b;

        public a(EnumC5190a2 enumC5190a2, InterfaceC2198w1 interfaceC2198w1) {
            this.f15919a = enumC5190a2;
            this.f15920b = interfaceC2198w1;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m21335a(a aVar) {
            return this.f15919a.compareTo(aVar.f15919a) >= 0;
        }

        /* JADX INFO: renamed from: b */
        public final void m21336b() {
            this.f15920b.mo7696n(new C5195b2());
        }
    }

    /* JADX INFO: renamed from: n.c2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f15921q;

        /* JADX INFO: renamed from: r */
        public Object f15922r;

        /* JADX INFO: renamed from: s */
        public Object f15923s;

        /* JADX INFO: renamed from: t */
        public int f15924t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f15925u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ EnumC5190a2 f15926v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C5200c2 f15927w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC0184l f15928x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC5190a2 enumC5190a2, C5200c2 c5200c2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f15926v = enumC5190a2;
            this.f15927w = c5200c2;
            this.f15928x = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f15926v, this.f15927w, this.f15928x, interfaceC5976f);
            bVar.f15925u = obj;
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
            C5200c2 c5200c2;
            InterfaceC0184l interfaceC0184l;
            Throwable th;
            C5200c2 c5200c22;
            a aVar2;
            InterfaceC5562a interfaceC5562a2;
            Object objM24992g = AbstractC6325c.m24992g();
            ?? r12 = this.f15924t;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f15925u;
                        EnumC5190a2 enumC5190a2 = this.f15926v;
                        InterfaceC5980j.b bVarMo1654h = interfaceC2165o0.getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g);
                        bVarMo1654h.getClass();
                        a aVar3 = new a(enumC5190a2, (InterfaceC2198w1) bVarMo1654h);
                        this.f15927w.m21334g(aVar3);
                        interfaceC5562a = this.f15927w.f15918b;
                        InterfaceC0184l interfaceC0184l2 = this.f15928x;
                        C5200c2 c5200c23 = this.f15927w;
                        this.f15925u = aVar3;
                        this.f15921q = interfaceC5562a;
                        this.f15922r = interfaceC0184l2;
                        this.f15923s = c5200c23;
                        this.f15924t = 1;
                        if (interfaceC5562a.mo22609d(null, this) != objM24992g) {
                            aVar = aVar3;
                            c5200c2 = c5200c23;
                            interfaceC0184l = interfaceC0184l2;
                        }
                        return objM24992g;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c5200c22 = (C5200c2) this.f15922r;
                        interfaceC5562a2 = (InterfaceC5562a) this.f15921q;
                        aVar2 = (a) this.f15925u;
                        try {
                            AbstractC4713t.m18808b(obj);
                            AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                            interfaceC5562a2.mo22608c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                            throw th;
                        }
                    }
                    c5200c2 = (C5200c2) this.f15923s;
                    interfaceC0184l = (InterfaceC0184l) this.f15922r;
                    InterfaceC5562a interfaceC5562a3 = (InterfaceC5562a) this.f15921q;
                    aVar = (a) this.f15925u;
                    AbstractC4713t.m18808b(obj);
                    interfaceC5562a = interfaceC5562a3;
                    this.f15925u = aVar;
                    this.f15921q = interfaceC5562a;
                    this.f15922r = c5200c2;
                    this.f15923s = null;
                    this.f15924t = 2;
                    Object objMo27m = interfaceC0184l.mo27m(this);
                    if (objMo27m != objM24992g) {
                        c5200c22 = c5200c2;
                        interfaceC5562a2 = interfaceC5562a;
                        obj = objMo27m;
                        aVar2 = aVar;
                        AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                        interfaceC5562a2.mo22608c(null);
                        return obj;
                    }
                    return objM24992g;
                } catch (Throwable th3) {
                    th = th3;
                    c5200c22 = c5200c2;
                    aVar2 = aVar;
                    AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.mo22608c(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: n.c2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f15929q;

        /* JADX INFO: renamed from: r */
        public Object f15930r;

        /* JADX INFO: renamed from: s */
        public Object f15931s;

        /* JADX INFO: renamed from: t */
        public Object f15932t;

        /* JADX INFO: renamed from: u */
        public int f15933u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15934v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ EnumC5190a2 f15935w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ C5200c2 f15936x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ InterfaceC0188p f15937y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Object f15938z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC5190a2 enumC5190a2, C5200c2 c5200c2, InterfaceC0188p interfaceC0188p, Object obj, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f15935w = enumC5190a2;
            this.f15936x = c5200c2;
            this.f15937y = interfaceC0188p;
            this.f15938z = obj;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = new c(this.f15935w, this.f15936x, this.f15937y, this.f15938z, interfaceC5976f);
            cVar.f15934v = obj;
            return cVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, nc.a] */
        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC5562a interfaceC5562a;
            InterfaceC0188p interfaceC0188p;
            a aVar;
            C5200c2 c5200c2;
            Object obj2;
            Throwable th;
            C5200c2 c5200c22;
            a aVar2;
            InterfaceC5562a interfaceC5562a2;
            Object objM24992g = AbstractC6325c.m24992g();
            ?? r12 = this.f15933u;
            try {
                try {
                    if (r12 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f15934v;
                        EnumC5190a2 enumC5190a2 = this.f15935w;
                        InterfaceC5980j.b bVarMo1654h = interfaceC2165o0.getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g);
                        bVarMo1654h.getClass();
                        a aVar3 = new a(enumC5190a2, (InterfaceC2198w1) bVarMo1654h);
                        this.f15936x.m21334g(aVar3);
                        interfaceC5562a = this.f15936x.f15918b;
                        interfaceC0188p = this.f15937y;
                        Object obj3 = this.f15938z;
                        C5200c2 c5200c23 = this.f15936x;
                        this.f15934v = aVar3;
                        this.f15929q = interfaceC5562a;
                        this.f15930r = interfaceC0188p;
                        this.f15931s = obj3;
                        this.f15932t = c5200c23;
                        this.f15933u = 1;
                        if (interfaceC5562a.mo22609d(null, this) != objM24992g) {
                            aVar = aVar3;
                            c5200c2 = c5200c23;
                            obj2 = obj3;
                        }
                        return objM24992g;
                    }
                    if (r12 != 1) {
                        if (r12 != 2) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c5200c22 = (C5200c2) this.f15930r;
                        interfaceC5562a2 = (InterfaceC5562a) this.f15929q;
                        aVar2 = (a) this.f15934v;
                        try {
                            AbstractC4713t.m18808b(obj);
                            AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                            interfaceC5562a2.mo22608c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                            throw th;
                        }
                    }
                    c5200c2 = (C5200c2) this.f15932t;
                    obj2 = this.f15931s;
                    interfaceC0188p = (InterfaceC0188p) this.f15930r;
                    InterfaceC5562a interfaceC5562a3 = (InterfaceC5562a) this.f15929q;
                    aVar = (a) this.f15934v;
                    AbstractC4713t.m18808b(obj);
                    interfaceC5562a = interfaceC5562a3;
                    this.f15934v = aVar;
                    this.f15929q = interfaceC5562a;
                    this.f15930r = c5200c2;
                    this.f15931s = null;
                    this.f15932t = null;
                    this.f15933u = 2;
                    Object objInvoke = interfaceC0188p.invoke(obj2, this);
                    if (objInvoke != objM24992g) {
                        c5200c22 = c5200c2;
                        interfaceC5562a2 = interfaceC5562a;
                        obj = objInvoke;
                        aVar2 = aVar;
                        AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                        interfaceC5562a2.mo22608c(null);
                        return obj;
                    }
                    return objM24992g;
                } catch (Throwable th3) {
                    th = th3;
                    c5200c22 = c5200c2;
                    aVar2 = aVar;
                    AbstractC4284d1.m16830a(c5200c22.f15917a, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.mo22608c(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m21331e(C5200c2 c5200c2, EnumC5190a2 enumC5190a2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC5190a2 = EnumC5190a2.f15823q;
        }
        return c5200c2.m21332d(enumC5190a2, interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: d */
    public final Object m21332d(EnumC5190a2 enumC5190a2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return AbstractC2169p0.m7882e(new b(enumC5190a2, this, interfaceC0184l, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: f */
    public final Object m21333f(Object obj, EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        return AbstractC2169p0.m7882e(new c(enumC5190a2, this, interfaceC0188p, obj, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: g */
    public final void m21334g(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f15917a.get();
            if (aVar2 != null && !aVar.m21335a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC4284d1.m16830a(this.f15917a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.m21336b();
        }
    }
}
