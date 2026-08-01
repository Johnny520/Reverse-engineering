package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1405f;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6542k;
import sb.AbstractC7284j;
import sb.AbstractC7285k;

/* JADX INFO: renamed from: i.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3086t0 extends AbstractC3053f1 implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: r */
    public final C3084s0 f8205r;

    /* JADX INFO: renamed from: i.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public int f8206q = -1;

        /* JADX INFO: renamed from: r */
        public final Iterator f8207r;

        /* JADX INFO: renamed from: i.t0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10106a extends AbstractC6542k implements InterfaceC0188p {

            /* JADX INFO: renamed from: A */
            public /* synthetic */ Object f8209A;

            /* JADX INFO: renamed from: B */
            public final /* synthetic */ C3086t0 f8210B;

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ a f8211C;

            /* JADX INFO: renamed from: r */
            public Object f8212r;

            /* JADX INFO: renamed from: s */
            public Object f8213s;

            /* JADX INFO: renamed from: t */
            public Object f8214t;

            /* JADX INFO: renamed from: u */
            public int f8215u;

            /* JADX INFO: renamed from: v */
            public int f8216v;

            /* JADX INFO: renamed from: w */
            public int f8217w;

            /* JADX INFO: renamed from: x */
            public int f8218x;

            /* JADX INFO: renamed from: y */
            public long f8219y;

            /* JADX INFO: renamed from: z */
            public int f8220z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10106a(C3086t0 c3086t0, a aVar, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f8210B = c3086t0;
                this.f8211C = aVar;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                C10106a c10106a = new C10106a(this.f8210B, this.f8211C, interfaceC5976f);
                c10106a.f8209A = obj;
                return c10106a;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:23:0x00b2). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005e -> B:14:0x0072). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007b -> B:20:0x00a6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:20:0x00a6). Please report as a decompilation issue!!! */
            @Override // p257r8.AbstractC6532a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    r21 = this;
                    r0 = r21
                    java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                    int r2 = r0.f8220z
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r5) goto L2e
                    int r2 = r0.f8218x
                    int r6 = r0.f8217w
                    long r7 = r0.f8219y
                    int r9 = r0.f8216v
                    int r10 = r0.f8215u
                    java.lang.Object r11 = r0.f8214t
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f8213s
                    i.t0 r12 = (p117i.C3086t0) r12
                    java.lang.Object r13 = r0.f8212r
                    i.t0$a r13 = (p117i.C3086t0.a) r13
                    java.lang.Object r14 = r0.f8209A
                    sb.j r14 = (sb.AbstractC7284j) r14
                    p172l8.AbstractC4713t.m18808b(r22)
                    goto La6
                L2e:
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r1)
                    r1 = 0
                    return r1
                L35:
                    p172l8.AbstractC4713t.m18808b(r22)
                    java.lang.Object r2 = r0.f8209A
                    sb.j r2 = (sb.AbstractC7284j) r2
                    i.t0 r6 = r0.f8210B
                    i.s0 r6 = p117i.C3086t0.m11560c(r6)
                    i.t0$a r7 = r0.f8211C
                    i.t0 r8 = r0.f8210B
                    long[] r6 = r6.f8092a
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lb7
                    r10 = 0
                L4e:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lb2
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r10
                    r10 = r9
                    r9 = r14
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r7 = r19
                L72:
                    if (r2 >= r6) goto La9
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto La6
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.m11561g(r15)
                    i.s0 r3 = p117i.C3086t0.m11560c(r12)
                    java.lang.Object[] r3 = r3.f8093b
                    r3 = r3[r15]
                    r0.f8209A = r14
                    r0.f8212r = r13
                    r0.f8213s = r12
                    r0.f8214t = r11
                    r0.f8215u = r10
                    r0.f8216v = r9
                    r0.f8219y = r7
                    r0.f8217w = r6
                    r0.f8218x = r2
                    r0.f8220z = r5
                    java.lang.Object r3 = r14.mo28871x(r3, r0)
                    if (r3 != r1) goto La6
                    return r1
                La6:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L72
                La9:
                    if (r6 != r4) goto Lb7
                    r2 = r10
                    r10 = r9
                    r9 = r2
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                Lb2:
                    if (r10 == r9) goto Lb7
                    int r10 = r10 + 1
                    goto L4e
                Lb7:
                    l8.i0 r1 = p172l8.C4700i0.f13910a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p117i.C3086t0.a.C10106a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
                return ((C10106a) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        public a() {
            this.f8207r = AbstractC7285k.m28873a(new C10106a(C3086t0.this, this, null));
        }

        /* JADX INFO: renamed from: g */
        public final void m11561g(int i10) {
            this.f8206q = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8207r.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f8207r.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f8206q != -1) {
                C3086t0.this.f8205r.m11533A(this.f8206q);
                this.f8206q = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3086t0(C3084s0 c3084s0) {
        super(c3084s0);
        c3084s0.getClass();
        this.f8205r = c3084s0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f8205r.m11536h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        collection.getClass();
        return this.f8205r.m11538j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8205r.m11541m();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f8205r.m11553y(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f8205r.m11554z(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f8205r.m11535C(collection);
    }
}
