package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1405f;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6542k;
import p376zd.C10010p0;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: i.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3080q0 extends AbstractC3038a1 implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: r */
    public final C3078p0 f8173r;

    /* JADX INFO: renamed from: i.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f8174q = -1;

        /* JADX INFO: renamed from: r */
        public final Iterator f8175r;

        /* JADX INFO: renamed from: i.q0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10105a extends AbstractC6542k implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public Object f8177r;

            /* JADX INFO: renamed from: s */
            public Object f8178s;

            /* JADX INFO: renamed from: t */
            public Object f8179t;

            /* JADX INFO: renamed from: u */
            public int f8180u;

            /* JADX INFO: renamed from: v */
            public int f8181v;

            /* JADX INFO: renamed from: w */
            public /* synthetic */ Object f8182w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C3080q0 f8183x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ a f8184y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10105a(C3080q0 c3080q0, a aVar, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f8183x = c3080q0;
                this.f8184y = aVar;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                C10105a c10105a = new C10105a(this.f8183x, this.f8184y, interfaceC5976f);
                c10105a.f8182w = obj;
                return c10105a;
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C3080q0 c3080q0;
                int i10;
                a aVar;
                long[] jArr;
                AbstractC7284j abstractC7284j;
                Object objM24992g = AbstractC6325c.m24992g();
                int i11 = this.f8181v;
                if (i11 == 0) {
                    AbstractC4713t.m18808b(obj);
                    AbstractC7284j abstractC7284j2 = (AbstractC7284j) this.f8182w;
                    C3078p0 c3078p0 = this.f8183x.f8173r;
                    a aVar2 = this.f8184y;
                    c3080q0 = this.f8183x;
                    long[] jArr2 = c3078p0.f8247c;
                    i10 = c3078p0.f8249e;
                    aVar = aVar2;
                    jArr = jArr2;
                    abstractC7284j = abstractC7284j2;
                } else {
                    if (i11 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = this.f8180u;
                    jArr = (long[]) this.f8179t;
                    c3080q0 = (C3080q0) this.f8178s;
                    aVar = (a) this.f8177r;
                    abstractC7284j = (AbstractC7284j) this.f8182w;
                    AbstractC4713t.m18808b(obj);
                }
                while (i10 != Integer.MAX_VALUE) {
                    int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
                    aVar.m11511g(i10);
                    Object obj2 = c3080q0.f8173r.f8246b[i10];
                    this.f8182w = abstractC7284j;
                    this.f8177r = aVar;
                    this.f8178s = c3080q0;
                    this.f8179t = jArr;
                    this.f8180u = i12;
                    this.f8181v = 1;
                    if (abstractC7284j.mo28871x(obj2, this) == objM24992g) {
                        return objM24992g;
                    }
                    i10 = i12;
                }
                return C4700i0.f13910a;
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
                return ((C10105a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        public a() {
            this.f8175r = AbstractC7285k.m28873a(new C10105a(C3080q0.this, this, null));
        }

        /* JADX INFO: renamed from: g */
        public final void m11511g(int i10) {
            this.f8174q = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8175r.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f8175r.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f8174q != -1) {
                C3080q0.this.f8173r.m11503z(this.f8174q);
                this.f8174q = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3080q0(C3078p0 c3078p0) {
        super(c3078p0);
        c3078p0.getClass();
        this.f8173r = c3078p0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f8173r.m11484g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        collection.getClass();
        return this.f8173r.m11485h(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8173r.m11488k();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f8173r.m11501x(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f8173r.m11502y(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f8173r.m11483B(collection);
    }
}
