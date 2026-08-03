package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class C5875 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ$ۥ, reason: contains not printable characters */
    public static final class C5876 extends Yue.AbstractC3275 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21508;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseIntArray f21509;

        public C5876(android.util.SparseIntArray r1) {
                r0 = this;
                r0.f21509 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21508
                android.util.SparseIntArray r1 = r2.f21509
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
                android.util.SparseIntArray r0 = r3.f21509
                int r1 = r3.f21508
                int r2 = r1 + 1
                r3.f21508 = r2
                int r0 = r0.keyAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21885() {
                r1 = this;
                int r0 = r1.f21508
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21886(int r1) {
                r0 = this;
                r0.f21508 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۣ$ۥ۟, reason: contains not printable characters */
    public static final class C5877 extends Yue.AbstractC3275 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21510;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseIntArray f21511;

        public C5877(android.util.SparseIntArray r1) {
                r0 = this;
                r0.f21511 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21510
                android.util.SparseIntArray r1 = r2.f21511
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
                android.util.SparseIntArray r0 = r3.f21511
                int r1 = r3.f21510
                int r2 = r1 + 1
                r3.f21510 = r2
                int r0 = r0.valueAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21887() {
                r1 = this;
                int r0 = r1.f21510
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21888(int r1) {
                r0 = this;
                r0.f21510 = r1
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m21870(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1) {
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
    public static final boolean m21871(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1) {
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
    public static final boolean m21872(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1) {
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
    public static final void m21873(@Yue.InterfaceC4418 android.util.SparseIntArray r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super java.lang.Integer, Yue.C6593> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.valueAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m21874(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1, int r2) {
            int r0 = r0.get(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m21875(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Integer> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            int r0 = r0.valueAt(r1)
            goto L15
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m21876(@Yue.InterfaceC4418 android.util.SparseIntArray r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m21877(@Yue.InterfaceC4418 android.util.SparseIntArray r0) {
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
    public static final boolean m21878(@Yue.InterfaceC4418 android.util.SparseIntArray r0) {
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
    public static final Yue.AbstractC3275 m21879(@Yue.InterfaceC4418 android.util.SparseIntArray r1) {
            Yue.ۥۢ۟ۦۣ$ۥ r0 = new Yue.ۥۢ۟ۦۣ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final android.util.SparseIntArray m21880(@Yue.InterfaceC4418 android.util.SparseIntArray r3, @Yue.InterfaceC4418 android.util.SparseIntArray r4) {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            m21881(r0, r3)
            m21881(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m21881(@Yue.InterfaceC4418 android.util.SparseIntArray r4, @Yue.InterfaceC4418 android.util.SparseIntArray r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            int r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21882(@Yue.InterfaceC4418 android.util.SparseIntArray r1, int r2, int r3) {
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L11
            int r0 = r1.valueAt(r2)
            if (r3 != r0) goto L11
            r1.removeAt(r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m21883(@Yue.InterfaceC4418 android.util.SparseIntArray r0, int r1, int r2) {
            r0.put(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC3275 m21884(@Yue.InterfaceC4418 android.util.SparseIntArray r1) {
            Yue.ۥۢ۟ۦۣ$ۥ۟ r0 = new Yue.ۥۢ۟ۦۣ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
