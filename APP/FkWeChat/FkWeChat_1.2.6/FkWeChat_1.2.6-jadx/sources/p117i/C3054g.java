package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: i.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3054g implements Set, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC3041b1 f8105q;

    /* JADX INFO: renamed from: i.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f8107r;

        /* JADX INFO: renamed from: s */
        public Object f8108s;

        /* JADX INFO: renamed from: t */
        public int f8109t;

        /* JADX INFO: renamed from: u */
        public int f8110u;

        /* JADX INFO: renamed from: v */
        public int f8111v;

        /* JADX INFO: renamed from: w */
        public int f8112w;

        /* JADX INFO: renamed from: x */
        public long f8113x;

        /* JADX INFO: renamed from: y */
        public int f8114y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f8115z;

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C3054g.this.new a(interfaceC5976f);
            aVar.f8115z = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:20:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:21:0x00a9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b7 -> B:26:0x00b8). Please report as a decompilation issue!!! */
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
                int r2 = r0.f8114y
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L31
                if (r2 != r5) goto L2a
                int r2 = r0.f8112w
                int r6 = r0.f8111v
                long r7 = r0.f8113x
                int r9 = r0.f8110u
                int r10 = r0.f8109t
                java.lang.Object r11 = r0.f8108s
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f8107r
                i.g r12 = (p117i.C3054g) r12
                java.lang.Object r13 = r0.f8115z
                sb.j r13 = (sb.AbstractC7284j) r13
                p172l8.AbstractC4713t.m18808b(r21)
                goto La7
            L2a:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r1)
                r1 = 0
                return r1
            L31:
                p172l8.AbstractC4713t.m18808b(r21)
                java.lang.Object r2 = r0.f8115z
                sb.j r2 = (sb.AbstractC7284j) r2
                i.g r6 = p117i.C3054g.this
                i.b1 r6 = p117i.C3054g.m11298a(r6)
                i.g r7 = p117i.C3054g.this
                long[] r6 = r6.f8070a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbe
                r9 = 0
            L48:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lb7
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L69:
                if (r2 >= r6) goto Laf
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La7
                int r14 = r9 << 3
                int r14 = r14 + r2
                i.d0 r15 = new i.d0
                i.b1 r3 = p117i.C3054g.m11298a(r12)
                java.lang.Object[] r3 = r3.f8071b
                r3 = r3[r14]
                r17 = r4
                i.b1 r4 = p117i.C3054g.m11298a(r12)
                java.lang.Object[] r4 = r4.f8072c
                r4 = r4[r14]
                r15.<init>(r3, r4)
                r0.f8115z = r13
                r0.f8107r = r12
                r0.f8108s = r11
                r0.f8109t = r10
                r0.f8110u = r9
                r0.f8113x = r7
                r0.f8111v = r6
                r0.f8112w = r2
                r0.f8114y = r5
                java.lang.Object r3 = r13.mo28871x(r15, r0)
                if (r3 != r1) goto La9
                return r1
            La7:
                r17 = r4
            La9:
                long r7 = r7 >> r17
                int r2 = r2 + r5
                r4 = r17
                goto L69
            Laf:
                r3 = r4
                if (r6 != r3) goto Lbe
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
                goto Lb8
            Lb7:
                r3 = r4
            Lb8:
                if (r9 == r8) goto Lbe
                int r9 = r9 + 1
                r4 = r3
                goto L48
            Lbe:
                l8.i0 r1 = p172l8.C4700i0.f13910a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p117i.C3054g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C3054g(AbstractC3041b1 abstractC3041b1) {
        abstractC3041b1.getClass();
        this.f8105q = abstractC3041b1;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public boolean m11299c(Map.Entry entry) {
        entry.getClass();
        return AbstractC1061t.m3842c(this.f8105q.m11238e(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m11299c((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection<Map.Entry> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection2) {
            if (!AbstractC1061t.m3842c(this.f8105q.m11238e(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int m11300e() {
        return this.f8105q.f8074e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8105q.m11241h();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC7285k.m28873a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m11300e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
