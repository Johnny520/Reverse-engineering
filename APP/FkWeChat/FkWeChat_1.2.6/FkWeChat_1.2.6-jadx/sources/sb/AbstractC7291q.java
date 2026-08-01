package sb;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: sb.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7291q extends AbstractC7286l {

    /* JADX INFO: renamed from: sb.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f24204a;

        public a(Iterator it) {
            this.f24204a = it;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return this.f24204a;
        }
    }

    /* JADX INFO: renamed from: sb.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f24205a;

        public b(Object obj) {
            this.f24205a = obj;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return new c(this.f24205a);
        }
    }

    /* JADX INFO: renamed from: sb.q$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public boolean f24206q = true;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ Object f24207r;

        public c(Object obj) {
            this.f24207r = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24206q;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f24206q) {
                this.f24206q = false;
                return this.f24207r;
            }
            C1189h4.m4429a();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC7282h m28879g(Iterator it) {
        it.getClass();
        return m28880h(new a(it));
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC7282h m28880h(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return interfaceC7282h instanceof C7275a ? interfaceC7282h : new C7275a(interfaceC7282h);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC7282h m28881i() {
        return C7278d.f24177a;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC7282h m28882j(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return m28883k(interfaceC7282h, new InterfaceC0184l() { // from class: sb.o
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7291q.m28884l((InterfaceC7282h) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC7282h m28883k(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        return interfaceC7282h instanceof C7296v ? ((C7296v) interfaceC7282h).m28923d(interfaceC0184l) : new C7280f(interfaceC7282h, new InterfaceC0184l() { // from class: sb.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7291q.m28885m(obj);
            }
        }, interfaceC0184l);
    }

    /* JADX INFO: renamed from: l */
    public static final Iterator m28884l(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return interfaceC7282h.iterator();
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC7282h m28886n(final InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        return m28880h(new C7281g(interfaceC0173a, new InterfaceC0184l() { // from class: sb.n
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7291q.m28889q(interfaceC0173a, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC7282h m28887o(InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l) {
        interfaceC0173a.getClass();
        interfaceC0184l.getClass();
        return new C7281g(interfaceC0173a, interfaceC0184l);
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC7282h m28888p(final Object obj, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return obj == null ? C7278d.f24177a : new C7281g(new InterfaceC0173a() { // from class: sb.m
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC7291q.m28890r(obj);
            }
        }, interfaceC0184l);
    }

    /* JADX INFO: renamed from: q */
    public static final Object m28889q(InterfaceC0173a interfaceC0173a, Object obj) {
        obj.getClass();
        return interfaceC0173a.invoke();
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC7282h m28891s(Object obj) {
        return new b(obj);
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC7282h m28892t(Object... objArr) {
        objArr.getClass();
        return AbstractC5106t.m20694M(objArr);
    }

    /* JADX INFO: renamed from: m */
    public static final Object m28885m(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m28890r(Object obj) {
        return obj;
    }
}
