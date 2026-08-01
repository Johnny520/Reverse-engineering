package p002a1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p041d1.AbstractC1851a;
import p041d1.C1854d;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p364z0.InterfaceC9825c;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: a1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0021l extends AbstractC0012c implements InterfaceC9825c {

    /* JADX INFO: renamed from: s */
    public static final a f34s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final int f35t = 8;

    /* JADX INFO: renamed from: u */
    public static final C0021l f36u = new C0021l(new Object[0]);

    /* JADX INFO: renamed from: r */
    public final Object[] f37r;

    public C0021l(Object[] objArr) {
        this.f37r = objArr;
        AbstractC1851a.m6548a(objArr.length <= 32);
    }

    @Override // java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e add(int i10, Object obj) {
        C1854d.m6553b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] objArrM90o = m90o(size() + 1);
            AbstractC5102r.m20665q(this.f37r, objArrM90o, 0, 0, i10, 6, null);
            AbstractC5102r.m20660l(this.f37r, objArrM90o, i10 + 1, i10, size());
            objArrM90o[i10] = obj;
            return new C0021l(objArrM90o);
        }
        Object[] objArr = this.f37r;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5102r.m20660l(this.f37r, objArrCopyOf, i10 + 1, i10, size() - 1);
        objArrCopyOf[i10] = obj;
        return new C0015f(objArrCopyOf, AbstractC0023n.m98c(this.f37r[31]), size() + 1, 0);
    }

    @Override // p002a1.AbstractC0012c, java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            InterfaceC9827e.a aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f37r, size() + collection.size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new C0021l(objArrCopyOf);
    }

    @Override // p364z0.InterfaceC9827e
    public InterfaceC9827e.a builder() {
        return new C0017h(this, null, this.f37r, 0);
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f37r.length;
    }

    @Override // p364z0.InterfaceC9827e
    /* JADX INFO: renamed from: f */
    public InterfaceC9827e mo32f(InterfaceC0184l interfaceC0184l) {
        Object[] objArrCopyOf = this.f37r;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f37r[i10];
            if (((Boolean) interfaceC0184l.mo27m(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.f37r;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f36u : new C0021l(AbstractC5102r.m20668t(objArrCopyOf, 0, size));
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        C1854d.m6552a(i10, size());
        return this.f37r[i10];
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public int indexOf(Object obj) {
        return AbstractC5106t.m20746m0(this.f37r, obj);
    }

    @Override // p364z0.InterfaceC9827e
    /* JADX INFO: renamed from: k */
    public InterfaceC9827e mo33k(int i10) {
        C1854d.m6552a(i10, size());
        if (size() == 1) {
            return f36u;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f37r, size() - 1);
        AbstractC5102r.m20660l(this.f37r, objArrCopyOf, i10, i10 + 1, size());
        return new C0021l(objArrCopyOf);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC5106t.m20757x0(this.f37r, obj);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator(int i10) {
        C1854d.m6553b(i10, size());
        return new C0013d(this.f37r, i10, size());
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m90o(int i10) {
        return new Object[i10];
    }

    @Override // p185m8.AbstractC5078f, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e set(int i10, Object obj) {
        C1854d.m6552a(i10, size());
        Object[] objArr = this.f37r;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10] = obj;
        return new C0021l(objArrCopyOf);
    }

    /* JADX INFO: renamed from: a1.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0021l m91a() {
            return C0021l.f36u;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e add(Object obj) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f37r, size() + 1);
            objArrCopyOf[size()] = obj;
            return new C0021l(objArrCopyOf);
        }
        return new C0015f(this.f37r, AbstractC0023n.m98c(obj), size() + 1, 0);
    }
}
