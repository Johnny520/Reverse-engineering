package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,99:1\n77#1,4:100\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:100,4\n*E\n"})
public final class C3828 {

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ, reason: contains not printable characters */
    public static final class C3829 extends Yue.AbstractC3820 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f12118;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.LongSparseArray<T> f12119;

        public C3829(android.util.LongSparseArray<T> r1) {
                r0 = this;
                r0.f12119 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f12118
                android.util.LongSparseArray<T> r1 = r2.f12119
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // Yue.AbstractC3820
        /* JADX INFO: renamed from: ۥ۟ */
        public long mo2037() {
                r3 = this;
                android.util.LongSparseArray<T> r0 = r3.f12119
                int r1 = r3.f12118
                int r2 = r1 + 1
                r3.f12118 = r2
                long r0 = r0.keyAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m15348() {
                r1 = this;
                int r0 = r1.f12118
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m15349(int r1) {
                r0 = this;
                r0.f12118 = r1
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۨ$ۥ۟, reason: contains not printable characters */
    public static final class C3830<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f12120;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.LongSparseArray<T> f12121;

        public C3830(android.util.LongSparseArray<T> r1) {
                r0 = this;
                r0.f12121 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f12120
                android.util.LongSparseArray<T> r1 = r2.f12121
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                android.util.LongSparseArray<T> r0 = r3.f12121
                int r1 = r3.f12120
                int r2 = r1 + 1
                r3.f12120 = r2
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m15350() {
                r1 = this;
                int r0 = r1.f12120
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m15351(int r1) {
                r0 = this;
                r0.f12120 = r1
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> boolean m15333(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> boolean m15334(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> boolean m15335(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, T r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> void m15336(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Long, ? super T, Yue.C6593> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            long r2 = r4.keyAt(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m15337(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1, T r3) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r3 = r0
        L8:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> T m15338(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r3) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto La
            java.lang.Object r0 = r3.invoke()
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> int m15339(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m15340(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> boolean m15341(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Yue.AbstractC3820 m15342(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r1) {
            Yue.ۥۣۣ۠ۨ$ۥ r0 = new Yue.ۥۣۣ۠ۨ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> android.util.LongSparseArray<T> m15343(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r3, @Yue.InterfaceC4418 android.util.LongSparseArray<T> r4) {
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            m15344(r0, r3)
            m15344(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m15344(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r5, @Yue.InterfaceC4418 android.util.LongSparseArray<T> r6) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            long r2 = r6.keyAt(r1)
            java.lang.Object r4 = r6.valueAt(r1)
            r5.put(r2, r4)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m15345(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1, T r3) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L15
            java.lang.Object r2 = r0.valueAt(r1)
            boolean r2 = Yue.C3329.m13897(r3, r2)
            if (r2 == 0) goto L15
            r0.removeAt(r1)
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m15346(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r0, long r1, T r3) {
            r0.put(r1, r3)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.Iterator<T> m15347(@Yue.InterfaceC4418 android.util.LongSparseArray<T> r1) {
            Yue.ۥۣۣ۠ۨ$ۥ۟ r0 = new Yue.ۥۣۣ۠ۨ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
