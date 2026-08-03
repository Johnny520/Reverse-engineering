package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class C5869 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ$ۥ, reason: contains not printable characters */
    public static final class C5870 extends Yue.AbstractC3275 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21500;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseArray<T> f21501;

        public C5870(android.util.SparseArray<T> r1) {
                r0 = this;
                r0.f21501 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21500
                android.util.SparseArray<T> r1 = r2.f21501
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // Yue.AbstractC3275
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo2006() {
                r3 = this;
                android.util.SparseArray<T> r0 = r3.f21501
                int r1 = r3.f21500
                int r2 = r1 + 1
                r3.f21500 = r2
                int r0 = r0.keyAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21847() {
                r1 = this;
                int r0 = r1.f21500
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21848(int r1) {
                r0 = this;
                r0.f21500 = r1
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۡ$ۥ۟, reason: contains not printable characters */
    public static final class C5871<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21502;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseArray<T> f21503;

        public C5871(android.util.SparseArray<T> r1) {
                r0 = this;
                r0.f21503 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21502
                android.util.SparseArray<T> r1 = r2.f21503
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
                android.util.SparseArray<T> r0 = r3.f21503
                int r1 = r3.f21502
                int r2 = r1 + 1
                r3.f21502 = r2
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
        public final int m21849() {
                r1 = this;
                int r0 = r1.f21502
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m21850(int r1) {
                r0 = this;
                r0.f21502 = r1
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> boolean m21832(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, int r1) {
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
    public static final <T> boolean m21833(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, int r1) {
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
    public static final <T> boolean m21834(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, T r1) {
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
    public static final <T> void m21835(@Yue.InterfaceC4418 android.util.SparseArray<T> r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super T, Yue.C6593> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r4.valueAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m21836(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, int r1, T r2) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r2 = r0
        L8:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> T m21837(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, int r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto La
            java.lang.Object r0 = r2.invoke()
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> int m21838(@Yue.InterfaceC4418 android.util.SparseArray<T> r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m21839(@Yue.InterfaceC4418 android.util.SparseArray<T> r0) {
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
    public static final <T> boolean m21840(@Yue.InterfaceC4418 android.util.SparseArray<T> r0) {
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
    public static final <T> Yue.AbstractC3275 m21841(@Yue.InterfaceC4418 android.util.SparseArray<T> r1) {
            Yue.ۥۢ۟ۦۡ$ۥ r0 = new Yue.ۥۢ۟ۦۡ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> android.util.SparseArray<T> m21842(@Yue.InterfaceC4418 android.util.SparseArray<T> r3, @Yue.InterfaceC4418 android.util.SparseArray<T> r4) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            m21843(r0, r3)
            m21843(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m21843(@Yue.InterfaceC4418 android.util.SparseArray<T> r4, @Yue.InterfaceC4418 android.util.SparseArray<T> r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m21844(@Yue.InterfaceC4418 android.util.SparseArray<T> r1, int r2, T r3) {
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L15
            r1.removeAt(r2)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m21845(@Yue.InterfaceC4418 android.util.SparseArray<T> r0, int r1, T r2) {
            r0.put(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.Iterator<T> m21846(@Yue.InterfaceC4418 android.util.SparseArray<T> r1) {
            Yue.ۥۢ۟ۦۡ$ۥ۟ r0 = new Yue.ۥۢ۟ۦۡ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
