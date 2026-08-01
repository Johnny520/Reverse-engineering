package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1400a;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: i.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3068k1 implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC3041b1 f8137q;

    /* JADX INFO: renamed from: i.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f8139r;

        /* JADX INFO: renamed from: s */
        public Object f8140s;

        /* JADX INFO: renamed from: t */
        public int f8141t;

        /* JADX INFO: renamed from: u */
        public int f8142u;

        /* JADX INFO: renamed from: v */
        public int f8143v;

        /* JADX INFO: renamed from: w */
        public int f8144w;

        /* JADX INFO: renamed from: x */
        public long f8145x;

        /* JADX INFO: renamed from: y */
        public int f8146y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f8147z;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C3068k1.this.new a(interfaceC5976f);
            aVar.f8147z = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x009c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:20:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0090 -> B:20:0x0093). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f8146y
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L32
                if (r2 != r5) goto L2b
                int r2 = r0.f8144w
                int r6 = r0.f8143v
                long r7 = r0.f8145x
                int r9 = r0.f8142u
                int r10 = r0.f8141t
                java.lang.Object r11 = r0.f8140s
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f8139r
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f8147z
                sb.j r13 = (sb.AbstractC7284j) r13
                p172l8.AbstractC4713t.m18808b(r21)
                goto L93
            L2b:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r1)
                r1 = 0
                return r1
            L32:
                p172l8.AbstractC4713t.m18808b(r21)
                java.lang.Object r2 = r0.f8147z
                sb.j r2 = (sb.AbstractC7284j) r2
                i.k1 r6 = p117i.C3068k1.this
                i.b1 r6 = p117i.C3068k1.m11387a(r6)
                java.lang.Object[] r7 = r6.f8072c
                long[] r6 = r6.f8070a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La1
                r9 = r3
            L49:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9c
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6a:
                if (r2 >= r6) goto L96
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L93
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f8147z = r13
                r0.f8139r = r12
                r0.f8140s = r11
                r0.f8141t = r10
                r0.f8142u = r9
                r0.f8145x = r7
                r0.f8143v = r6
                r0.f8144w = r2
                r0.f8146y = r5
                java.lang.Object r14 = r13.mo28871x(r14, r0)
                if (r14 != r1) goto L93
                return r1
            L93:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6a
            L96:
                if (r6 != r4) goto La1
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9c:
                if (r9 == r8) goto La1
                int r9 = r9 + 1
                goto L49
            La1:
                l8.i0 r1 = p172l8.C4700i0.f13910a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p117i.C3068k1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3068k1(AbstractC3041b1 abstractC3041b1) {
        abstractC3041b1.getClass();
        this.f8137q = abstractC3041b1;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public int m11388c() {
        return this.f8137q.f8074e;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f8137q.m11237d(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f8137q.m11237d(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f8137q.m11241h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC7285k.m28873a(new a(null));
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m11388c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
