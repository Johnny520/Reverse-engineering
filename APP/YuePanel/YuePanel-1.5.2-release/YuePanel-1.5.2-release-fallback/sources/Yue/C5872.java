package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class C5872 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ$ۥ, reason: contains not printable characters */
    public static final class C5873 extends Yue.AbstractC3275 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21504;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseBooleanArray f21505;

        public C5873(android.util.SparseBooleanArray r1) {
                r0 = this;
                r0.f21505 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21504
                android.util.SparseBooleanArray r1 = r2.f21505
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
                android.util.SparseBooleanArray r0 = r3.f21505
                int r1 = r3.f21504
                int r2 = r1 + 1
                r3.f21504 = r2
                int r0 = r0.keyAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21866() {
                r1 = this;
                int r0 = r1.f21504
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21867(int r1) {
                r0 = this;
                r0.f21504 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۦۢ$ۥ۟, reason: contains not printable characters */
    public static final class C5874 extends Yue.AbstractC0799 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21506;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.util.SparseBooleanArray f21507;

        public C5874(android.util.SparseBooleanArray r1) {
                r0 = this;
                r0.f21507 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21506
                android.util.SparseBooleanArray r1 = r2.f21507
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // Yue.AbstractC0799
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1954() {
                r3 = this;
                android.util.SparseBooleanArray r0 = r3.f21507
                int r1 = r3.f21506
                int r2 = r1 + 1
                r3.f21506 = r2
                boolean r0 = r0.valueAt(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m21868() {
                r1 = this;
                int r0 = r1.f21506
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21869(int r1) {
                r0 = this;
                r0.f21506 = r1
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m21851(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, int r1) {
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
    public static final boolean m21852(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, int r1) {
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
    public static final boolean m21853(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, boolean r1) {
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
    public static final void m21854(@Yue.InterfaceC4418 android.util.SparseBooleanArray r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super java.lang.Boolean, Yue.C6593> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r4.valueAt(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m21855(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, int r1, boolean r2) {
            boolean r0 = r0.get(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m21856(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, int r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Boolean> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            boolean r0 = r0.valueAt(r1)
            goto L15
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m21857(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m21858(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0) {
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
    public static final boolean m21859(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0) {
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
    public static final Yue.AbstractC3275 m21860(@Yue.InterfaceC4418 android.util.SparseBooleanArray r1) {
            Yue.ۥۢ۟ۦۢ$ۥ r0 = new Yue.ۥۢ۟ۦۢ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final android.util.SparseBooleanArray m21861(@Yue.InterfaceC4418 android.util.SparseBooleanArray r3, @Yue.InterfaceC4418 android.util.SparseBooleanArray r4) {
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            m21862(r0, r3)
            m21862(r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m21862(@Yue.InterfaceC4418 android.util.SparseBooleanArray r4, @Yue.InterfaceC4418 android.util.SparseBooleanArray r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            boolean r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21863(@Yue.InterfaceC4418 android.util.SparseBooleanArray r1, int r2, boolean r3) {
            int r0 = r1.indexOfKey(r2)
            if (r0 < 0) goto L11
            boolean r0 = r1.valueAt(r0)
            if (r3 != r0) goto L11
            r1.delete(r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m21864(@Yue.InterfaceC4418 android.util.SparseBooleanArray r0, int r1, boolean r2) {
            r0.put(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.AbstractC0799 m21865(@Yue.InterfaceC4418 android.util.SparseBooleanArray r1) {
            Yue.ۥۢ۟ۦۢ$ۥ۟ r0 = new Yue.ۥۢ۟ۦۢ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
