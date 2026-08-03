package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
public final class C5426<T> extends Yue.AbstractC0052<T> implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object[] f20105;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f20106;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f20107;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f20108;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    public static final class C5427 extends Yue.AbstractC0050<T> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f20109;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f20110;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5426<T> f20111;

        public C5427(Yue.C5426<T> r2) {
                r1 = this;
                r1.f20111 = r2
                r1.<init>()
                int r0 = r2.size()
                r1.f20109 = r0
                int r2 = Yue.C5426.m20451(r2)
                r1.f20110 = r2
                return
        }

        @Override // Yue.AbstractC0050
        /* JADX INFO: renamed from: ۥ */
        public void mo394() {
                r2 = this;
                int r0 = r2.f20109
                if (r0 != 0) goto L8
                r2.m395()
                goto L28
            L8:
                Yue.ۥۡۧ۟ۧ<T> r0 = r2.f20111
                java.lang.Object[] r0 = Yue.C5426.m20449(r0)
                int r1 = r2.f20110
                r0 = r0[r1]
                r2.m396(r0)
                Yue.ۥۡۧ۟ۧ<T> r0 = r2.f20111
                int r1 = r2.f20110
                int r1 = r1 + 1
                int r0 = Yue.C5426.m20450(r0)
                int r1 = r1 % r0
                r2.f20110 = r1
                int r0 = r2.f20109
                int r0 = r0 + (-1)
                r2.f20109 = r0
            L28:
                return
        }
    }

    public C5426(int r2) {
            r1 = this;
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C5426(@Yue.InterfaceC4418 java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r3, r0)
            r2.<init>()
            r2.f20105 = r3
            if (r4 < 0) goto L39
            int r0 = r3.length
            if (r4 > r0) goto L15
            int r3 = r3.length
            r2.f20106 = r3
            r2.f20108 = r4
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ring buffer filled size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " cannot be larger than the buffer size: "
            r0.append(r4)
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ring buffer filled size should not be negative but it is "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object[] m20449(Yue.C5426 r0) {
            java.lang.Object[] r0 = r0.f20105
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m20450(Yue.C5426 r0) {
            int r0 = r0.f20106
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m20451(Yue.C5426 r0) {
            int r0 = r0.f20107
            return r0
    }

    @Override // Yue.AbstractC0052, java.util.List
    public T get(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.size()
            r0.m399(r3, r1)
            java.lang.Object[] r0 = r2.f20105
            int r1 = r2.f20107
            int r1 = r1 + r3
            int r3 = m20450(r2)
            int r1 = r1 % r3
            r3 = r0[r1]
            return r3
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r1 = this;
            Yue.ۥۡۧ۟ۧ$ۥ r0 = new Yue.ۥۡۧ۟ۧ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.AbstractC0041, java.util.Collection
    @Yue.InterfaceC4418
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // Yue.AbstractC0041, java.util.Collection
    @Yue.InterfaceC4418
    public <T> T[] toArray(@Yue.InterfaceC4418 T[] r6) {
            r5 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r6, r0)
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 >= r1) goto L19
            int r0 = r5.size()
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String r0 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r6, r0)
        L19:
            int r0 = r5.size()
            int r1 = r5.f20107
            r2 = 0
            r3 = r2
        L21:
            if (r3 >= r0) goto L32
            int r4 = r5.f20106
            if (r1 >= r4) goto L32
            java.lang.Object[] r4 = r5.f20105
            r4 = r4[r1]
            r6[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L21
        L32:
            if (r3 >= r0) goto L3f
            java.lang.Object[] r1 = r5.f20105
            r1 = r1[r2]
            r6[r3] = r1
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L32
        L3f:
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 <= r1) goto L4d
            int r0 = r5.size()
            r1 = 0
            r6[r0] = r1
        L4d:
            return r6
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public int mo368() {
            r1 = this;
            int r0 = r1.f20108
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20452(T r4) {
            r3 = this;
            boolean r0 = r3.m20455()
            if (r0 != 0) goto L1f
            java.lang.Object[] r0 = r3.f20105
            int r1 = r3.f20107
            int r2 = r3.size()
            int r1 = r1 + r2
            int r2 = m20450(r3)
            int r1 = r1 % r2
            r0[r1] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.f20108 = r4
            return
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "ring buffer is full"
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C5426<T> m20453(int r3) {
            r2 = this;
            int r0 = r2.f20106
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r3 = Yue.C5196.m19521(r0, r3)
            int r0 = r2.f20107
            if (r0 != 0) goto L1b
            java.lang.Object[] r0 = r2.f20105
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r3, r0)
            goto L21
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r2.toArray(r3)
        L21:
            Yue.ۥۡۧ۟ۧ r0 = new Yue.ۥۡۧ۟ۧ
            int r1 = r2.size()
            r0.<init>(r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m20454(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            int r2 = m20450(r0)
            int r1 = r1 % r2
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m20455() {
            r2 = this;
            int r0 = r2.size()
            int r1 = r2.f20106
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m20456(int r6) {
            r5 = this;
            if (r6 < 0) goto L5a
            int r0 = r5.size()
            if (r6 > r0) goto L33
            if (r6 <= 0) goto L32
            int r0 = r5.f20107
            int r1 = r0 + r6
            int r2 = m20450(r5)
            int r1 = r1 % r2
            r2 = 0
            if (r0 <= r1) goto L24
            java.lang.Object[] r3 = r5.f20105
            int r4 = r5.f20106
            Yue.C0586.m2239(r3, r2, r0, r4)
            java.lang.Object[] r0 = r5.f20105
            r3 = 0
            Yue.C0586.m2239(r0, r2, r3, r1)
            goto L29
        L24:
            java.lang.Object[] r3 = r5.f20105
            Yue.C0586.m2239(r3, r2, r0, r1)
        L29:
            r5.f20107 = r1
            int r0 = r5.size()
            int r0 = r0 - r6
            r5.f20108 = r0
        L32:
            return
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "n shouldn't be greater than the buffer size: n = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", size = "
            r0.append(r6)
            int r6 = r5.size()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "n shouldn't be negative but it is "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }
}
