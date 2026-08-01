package p119i1;

import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p134j1.AbstractC3498b;
import p134j1.C3497a;
import p172l8.C4699i;
import p172l8.C4700i0;
import p172l8.C4711r;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: i1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3115b extends C3121d {

    /* JADX INFO: renamed from: i1.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0184l f8292q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0184l f8293r;

        public a(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
            this.f8292q = interfaceC0184l;
            this.f8293r = interfaceC0184l2;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3121d mo27m(C3147q c3147q) {
            long j10;
            synchronized (AbstractC3159w.m11883L()) {
                j10 = AbstractC3159w.f8428f;
                AbstractC3159w.f8428f += (long) 1;
            }
            return new C3121d(j10, c3147q, this.f8292q, this.f8293r);
        }
    }

    /* JADX INFO: renamed from: i1.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0184l f8294q;

        public b(InterfaceC0184l interfaceC0184l) {
            this.f8294q = interfaceC0184l;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3131i mo27m(C3147q c3147q) {
            long j10;
            synchronized (AbstractC3159w.m11883L()) {
                j10 = AbstractC3159w.f8428f;
                AbstractC3159w.f8428f += (long) 1;
            }
            return new C3131i(j10, c3147q, this.f8294q);
        }
    }

    public C3115b(long j10, C3147q c3147q) {
        super(j10, c3147q, null, new InterfaceC0184l() { // from class: i1.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C3115b.m11654U(obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static C4700i0 m11654U(Object obj) {
        synchronized (AbstractC3159w.m11883L()) {
            List list = AbstractC3159w.f8432j;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC0184l) list.get(i10)).mo27m(obj);
            }
        }
        return C4700i0.f13910a;
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: C */
    public AbstractC3141n mo11655C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // p119i1.C3121d
    /* JADX INFO: renamed from: R */
    public C3121d mo11656R(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        InterfaceC0184l interfaceC0184l3;
        Map map;
        InterfaceC9827e interfaceC9827e = AbstractC3498b.f9713a;
        if (interfaceC9827e != null) {
            C4711r c4711rM13035e = AbstractC3498b.m13035e(interfaceC9827e, null, false, interfaceC0184l, interfaceC0184l2);
            C3497a c3497a = (C3497a) c4711rM13035e.m18795e();
            InterfaceC0184l interfaceC0184lM13029a = c3497a.m13029a();
            InterfaceC0184l interfaceC0184lM13030b = c3497a.m13030b();
            map = (Map) c4711rM13035e.m18796f();
            interfaceC0184l = interfaceC0184lM13029a;
            interfaceC0184l3 = interfaceC0184lM13030b;
        } else {
            interfaceC0184l3 = interfaceC0184l2;
            map = null;
        }
        C3121d c3121d = (C3121d) AbstractC3159w.m11905d0(new a(interfaceC0184l, interfaceC0184l3));
        if (interfaceC9827e != null) {
            AbstractC3498b.m13032b(interfaceC9827e, null, c3121d, map);
        }
        return c3121d;
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void mo11660m(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void mo11661n(AbstractC3137l abstractC3137l) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        synchronized (AbstractC3159w.m11883L()) {
            m11756q();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: o */
    public void mo11662o() {
        AbstractC3159w.m11876E();
    }

    @Override // p119i1.C3121d, p119i1.AbstractC3137l
    /* JADX INFO: renamed from: x */
    public AbstractC3137l mo11663x(InterfaceC0184l interfaceC0184l) {
        Map map;
        InterfaceC9827e interfaceC9827e = AbstractC3498b.f9713a;
        if (interfaceC9827e != null) {
            C4711r c4711rM13035e = AbstractC3498b.m13035e(interfaceC9827e, null, true, interfaceC0184l, null);
            C3497a c3497a = (C3497a) c4711rM13035e.m18795e();
            InterfaceC0184l interfaceC0184lM13029a = c3497a.m13029a();
            c3497a.m13030b();
            map = (Map) c4711rM13035e.m18796f();
            interfaceC0184l = interfaceC0184lM13029a;
        } else {
            map = null;
        }
        C3131i c3131i = (C3131i) AbstractC3159w.m11905d0(new b(interfaceC0184l));
        if (interfaceC9827e != null) {
            AbstractC3498b.m13032b(interfaceC9827e, null, c3131i, map);
        }
        return c3131i;
    }
}
