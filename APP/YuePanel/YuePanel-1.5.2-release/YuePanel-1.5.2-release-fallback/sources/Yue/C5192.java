package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class C5192 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۥۨۧ$ۥ, reason: contains not printable characters */
    public static final class C5193<T> implements Yue.InterfaceC1179<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.util.Range<T> f19541;

        public C5193(android.util.Range<T> r1) {
                r0 = this;
                r0.f19541 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
        public boolean isEmpty() {
                r1 = this;
                boolean r0 = Yue.InterfaceC1179.C1180.m6133(r1)
                return r0
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
        /* JADX INFO: renamed from: ۥ */
        public boolean mo5768(@Yue.InterfaceC4418 java.lang.Comparable r1) {
                r0 = this;
                boolean r1 = Yue.InterfaceC1179.C1180.m6132(r0, r1)
                return r1
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
        /* JADX INFO: renamed from: ۥ۟ */
        public java.lang.Comparable mo5769() {
                r1 = this;
                android.util.Range<T> r0 = r1.f19541
                java.lang.Comparable r0 = r0.getLower()
                return r0
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // Yue.InterfaceC1179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Comparable mo5771() {
                r1 = this;
                android.util.Range<T> r0 = r1.f19541
                java.lang.Comparable r0 = r0.getUpper()
                return r0
        }
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> m19488(@Yue.InterfaceC4418 android.util.Range<T> r0, @Yue.InterfaceC4418 android.util.Range<T> r1) {
            android.util.Range r0 = r0.intersect(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> m19489(@Yue.InterfaceC4418 android.util.Range<T> r0, @Yue.InterfaceC4418 android.util.Range<T> r1) {
            android.util.Range r0 = r0.extend(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> m19490(@Yue.InterfaceC4418 android.util.Range<T> r0, @Yue.InterfaceC4418 T r1) {
            android.util.Range r0 = r0.extend(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> m19491(@Yue.InterfaceC4418 T r1, @Yue.InterfaceC4418 T r2) {
            android.util.Range r0 = new android.util.Range
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> Yue.InterfaceC1179<T> m19492(@Yue.InterfaceC4418 android.util.Range<T> r1) {
            Yue.ۥۡۥۨۧ$ۥ r0 = new Yue.ۥۡۥۨۧ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> android.util.Range<T> m19493(@Yue.InterfaceC4418 Yue.InterfaceC1179<T> r2) {
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r1 = r2.mo5769()
            java.lang.Comparable r2 = r2.mo5771()
            r0.<init>(r1, r2)
            return r0
    }
}
