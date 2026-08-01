package p119i1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1404e;
import p172l8.C4700i0;
import p364z0.AbstractC9823a;
import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: i1.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3128g0 implements InterfaceC3158v0, Map, InterfaceC1404e {

    /* JADX INFO: renamed from: q */
    public AbstractC3162x0 f8330q;

    /* JADX INFO: renamed from: r */
    public final Set f8331r;

    /* JADX INFO: renamed from: s */
    public final Set f8332s;

    /* JADX INFO: renamed from: t */
    public final Collection f8333t;

    /* JADX INFO: renamed from: i1.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3162x0 {

        /* JADX INFO: renamed from: c */
        public InterfaceC9828f f8334c;

        /* JADX INFO: renamed from: d */
        public int f8335d;

        public a(long j10, InterfaceC9828f interfaceC9828f) {
            super(j10);
            this.f8334c = interfaceC9828f;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: c */
        public void mo1522c(AbstractC3162x0 abstractC3162x0) {
            abstractC3162x0.getClass();
            a aVar = (a) abstractC3162x0;
            synchronized (AbstractC3130h0.f8337a) {
                this.f8334c = aVar.f8334c;
                this.f8335d = aVar.f8335d;
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: d */
        public AbstractC3162x0 mo1523d(long j10) {
            return new a(j10, this.f8334c);
        }

        /* JADX INFO: renamed from: i */
        public final InterfaceC9828f m11744i() {
            return this.f8334c;
        }

        /* JADX INFO: renamed from: j */
        public final int m11745j() {
            return this.f8335d;
        }

        /* JADX INFO: renamed from: k */
        public final void m11746k(InterfaceC9828f interfaceC9828f) {
            this.f8334c = interfaceC9828f;
        }

        /* JADX INFO: renamed from: l */
        public final void m11747l(int i10) {
            this.f8335d = i10;
        }
    }

    public C3128g0() {
        InterfaceC9828f interfaceC9828fM38172a = AbstractC9823a.m38172a();
        AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
        a aVar = new a(abstractC3137lM11882K.mo11678i(), interfaceC9828fM38172a);
        if (!(abstractC3137lM11882K instanceof C3115b)) {
            aVar.m11942g(new a(AbstractC3149r.m11861c(1), interfaceC9828fM38172a));
        }
        this.f8330q = aVar;
        this.f8331r = new C3161x(this);
        this.f8332s = new C3163y(this);
        this.f8333t = new C3113a0(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11735c(a aVar, int i10, InterfaceC9828f interfaceC9828f) {
        boolean z10;
        synchronized (AbstractC3130h0.f8337a) {
            if (aVar.m11745j() == i10) {
                aVar.m11746k(interfaceC9828f);
                z10 = true;
                aVar.m11747l(aVar.m11745j() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC3137l abstractC3137lM11764c;
        AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
        abstractC3162x0Mo1519e.getClass();
        a aVar = (a) AbstractC3159w.m11880I((a) abstractC3162x0Mo1519e);
        aVar.m11744i();
        InterfaceC9828f interfaceC9828fM38172a = AbstractC9823a.m38172a();
        if (interfaceC9828fM38172a != aVar.m11744i()) {
            AbstractC3162x0 abstractC3162x0Mo1519e2 = mo1519e();
            abstractC3162x0Mo1519e2.getClass();
            a aVar2 = (a) abstractC3162x0Mo1519e2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                m11736g((a) AbstractC3159w.m11917j0(aVar2, this, abstractC3137lM11764c), interfaceC9828fM38172a);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m11740p().m11744i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m11740p().m11744i().containsValue(obj);
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e */
    public AbstractC3162x0 mo1519e() {
        return this.f8330q;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m11737j();
    }

    /* JADX INFO: renamed from: g */
    public final int m11736g(a aVar, InterfaceC9828f interfaceC9828f) {
        int iM11745j;
        synchronized (AbstractC3130h0.f8337a) {
            aVar.m11746k(interfaceC9828f);
            iM11745j = aVar.m11745j();
            aVar.m11747l(iM11745j + 1);
        }
        return iM11745j;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return m11740p().m11744i().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return m11740p().m11744i().isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public Set m11737j() {
        return this.f8331r;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m11738m();
    }

    /* JADX INFO: renamed from: m */
    public Set m11738m() {
        return this.f8332s;
    }

    /* JADX INFO: renamed from: n */
    public final int m11739n() {
        return m11740p().m11745j();
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 abstractC3162x0) {
        abstractC3162x0.getClass();
        this.f8330q = (a) abstractC3162x0;
    }

    /* JADX INFO: renamed from: p */
    public final a m11740p() {
        AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return (a) AbstractC3159w.m11897Z((a) abstractC3162x0Mo1519e, this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        Object objPut;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        do {
            synchronized (AbstractC3130h0.f8337a) {
                AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
                abstractC3162x0Mo1519e.getClass();
                a aVar = (a) AbstractC3159w.m11880I((a) abstractC3162x0Mo1519e);
                interfaceC9828fM11744i = aVar.m11744i();
                iM11745j = aVar.m11745j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9828fM11744i.getClass();
            InterfaceC9828f.a aVarBuilder = interfaceC9828fM11744i.builder();
            objPut = aVarBuilder.put(obj, obj2);
            InterfaceC9828f interfaceC9828fBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9828fBuild, interfaceC9828fM11744i)) {
                break;
            }
            AbstractC3162x0 abstractC3162x0Mo1519e2 = mo1519e();
            abstractC3162x0Mo1519e2.getClass();
            a aVar2 = (a) abstractC3162x0Mo1519e2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11735c = m11735c((a) AbstractC3159w.m11917j0(aVar2, this, abstractC3137lM11764c), iM11745j, interfaceC9828fBuild);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11735c);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        do {
            synchronized (AbstractC3130h0.f8337a) {
                AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
                abstractC3162x0Mo1519e.getClass();
                a aVar = (a) AbstractC3159w.m11880I((a) abstractC3162x0Mo1519e);
                interfaceC9828fM11744i = aVar.m11744i();
                iM11745j = aVar.m11745j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9828fM11744i.getClass();
            InterfaceC9828f.a aVarBuilder = interfaceC9828fM11744i.builder();
            aVarBuilder.putAll(map);
            InterfaceC9828f interfaceC9828fBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9828fBuild, interfaceC9828fM11744i)) {
                return;
            }
            AbstractC3162x0 abstractC3162x0Mo1519e2 = mo1519e();
            abstractC3162x0Mo1519e2.getClass();
            a aVar2 = (a) abstractC3162x0Mo1519e2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11735c = m11735c((a) AbstractC3159w.m11917j0(aVar2, this, abstractC3137lM11764c), iM11745j, interfaceC9828fBuild);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11735c);
    }

    /* JADX INFO: renamed from: q */
    public int m11741q() {
        return m11740p().m11744i().size();
    }

    /* JADX INFO: renamed from: r */
    public Collection m11742r() {
        return this.f8333t;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        Object objRemove;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        do {
            synchronized (AbstractC3130h0.f8337a) {
                AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
                abstractC3162x0Mo1519e.getClass();
                a aVar = (a) AbstractC3159w.m11880I((a) abstractC3162x0Mo1519e);
                interfaceC9828fM11744i = aVar.m11744i();
                iM11745j = aVar.m11745j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9828fM11744i.getClass();
            InterfaceC9828f.a aVarBuilder = interfaceC9828fM11744i.builder();
            objRemove = aVarBuilder.remove(obj);
            InterfaceC9828f interfaceC9828fBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9828fBuild, interfaceC9828fM11744i)) {
                break;
            }
            AbstractC3162x0 abstractC3162x0Mo1519e2 = mo1519e();
            abstractC3162x0Mo1519e2.getClass();
            a aVar2 = (a) abstractC3162x0Mo1519e2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11735c = m11735c((a) AbstractC3159w.m11917j0(aVar2, this, abstractC3137lM11764c), iM11745j, interfaceC9828fBuild);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11735c);
        return objRemove;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11743s(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1061t.m3842c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m11741q();
    }

    public String toString() {
        AbstractC3162x0 abstractC3162x0Mo1519e = mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return "SnapshotStateMap(value=" + ((a) AbstractC3159w.m11880I((a) abstractC3162x0Mo1519e)).m11744i() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m11742r();
    }
}
