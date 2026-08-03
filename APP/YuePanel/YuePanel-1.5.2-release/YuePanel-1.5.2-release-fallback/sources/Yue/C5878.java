package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class C5878 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ$ۥ, reason: contains not printable characters */
    public static final class C5879 extends Yue.AbstractC3275 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21512;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseLongArray f21513;

        public C5879(android.util.SparseLongArray r1) {
                r0 = this;
                r0.f21513 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21512
                android.util.SparseLongArray r1 = r2.f21513
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
                android.util.SparseLongArray r0 = r3.f21513
                int r1 = r3.f21512
                int r2 = r1 + 1
                r3.f21512 = r2
                int r0 = r0.keyAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21904() {
                r1 = this;
                int r0 = r1.f21512
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21905(int r1) {
                r0 = this;
                r0.f21512 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۤ$ۥ۟, reason: contains not printable characters */
    public static final class C5880 extends Yue.AbstractC3820 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21514;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseLongArray f21515;

        public C5880(android.util.SparseLongArray r1) {
                r0 = this;
                r0.f21515 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21514
                android.util.SparseLongArray r1 = r2.f21515
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
                android.util.SparseLongArray r0 = r3.f21515
                int r1 = r3.f21514
                int r2 = r1 + 1
                r3.f21514 = r2
                long r0 = r0.valueAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21906() {
                r1 = this;
                int r0 = r1.f21514
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21907(int r1) {
                r0 = this;
                r0.f21514 = r1
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m21889(@Yue.InterfaceC4418 android.util.SparseLongArray r0, int r1) {
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
    public static final boolean m21890(@Yue.InterfaceC4418 android.util.SparseLongArray r0, int r1) {
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
    public static final boolean m21891(@Yue.InterfaceC4418 android.util.SparseLongArray r0, long r1) {
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
    public static final void m21892(@Yue.InterfaceC4418 android.util.SparseLongArray r5, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super java.lang.Long, Yue.C6593> r6) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r5.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.valueAt(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m21893(@Yue.InterfaceC4418 android.util.SparseLongArray r0, int r1, long r2) {
            long r0 = r0.get(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m21894(@Yue.InterfaceC4418 android.util.SparseLongArray r0, int r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Long> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            long r0 = r0.valueAt(r1)
            goto L15
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m21895(@Yue.InterfaceC4418 android.util.SparseLongArray r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m21896(@Yue.InterfaceC4418 android.util.SparseLongArray r0) {
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
    public static final boolean m21897(@Yue.InterfaceC4418 android.util.SparseLongArray r0) {
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
    public static final Yue.AbstractC3275 m21898(@Yue.InterfaceC4418 android.util.SparseLongArray r1) {
            Yue.ۥۢ۟ۦۤ$ۥ r0 = new Yue.ۥۢ۟ۦۤ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final android.util.SparseLongArray m21899(@Yue.InterfaceC4418 android.util.SparseLongArray r3, @Yue.InterfaceC4418 android.util.SparseLongArray r4) {
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            m21900(r0, r3)
            m21900(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m21900(@Yue.InterfaceC4418 android.util.SparseLongArray r5, @Yue.InterfaceC4418 android.util.SparseLongArray r6) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r6.keyAt(r1)
            long r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21901(@Yue.InterfaceC4418 android.util.SparseLongArray r2, int r3, long r4) {
            int r3 = r2.indexOfKey(r3)
            if (r3 < 0) goto L13
            long r0 = r2.valueAt(r3)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
            r2.removeAt(r3)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m21902(@Yue.InterfaceC4418 android.util.SparseLongArray r0, int r1, long r2) {
            r0.put(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC3820 m21903(@Yue.InterfaceC4418 android.util.SparseLongArray r1) {
            Yue.ۥۢ۟ۦۤ$ۥ۟ r0 = new Yue.ۥۢ۟ۦۤ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
