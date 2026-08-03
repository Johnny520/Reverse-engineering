package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5195 {
    public C5195() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m19494(boolean r2, @Yue.InterfaceC4418 java.lang.Number r3) {
            java.lang.String r0 = "step"
            Yue.C3329.m13906(r3, r0)
            if (r2 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Step must be positive, was: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::LYue/ۥ۟ۥ۟ۡ<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m19495(Yue.InterfaceC1179 r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            if (r2 == 0) goto L11
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            boolean r1 = r1.mo5768(r2)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::LYue/ۥۣۣۡۥ<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m19496(Yue.InterfaceC4636 r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            if (r2 == 0) goto L11
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            boolean r1 = r1.mo5768(r2)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1177<java.lang.Double> m19497(double r1, double r3) {
            Yue.ۥ۟ۥ۟ r0 = new Yue.ۥ۟ۥ۟
            r0.<init>(r1, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC1177<java.lang.Float> m19498(float r1, float r2) {
            Yue.ۥ۟ۥ۟۟ r0 = new Yue.ۥ۟ۥ۟۟
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> Yue.InterfaceC1179<T> m19499(@Yue.InterfaceC4418 T r1, @Yue.InterfaceC4418 T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "that"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۦۡۥ r0 = new Yue.ۥ۟ۦۡۥ
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.InterfaceC4636<java.lang.Double> m19500(double r1, double r3) {
            Yue.ۥۣۣۣۡ r0 = new Yue.ۥۣۣۣۡ
            r0.<init>(r1, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC4636<java.lang.Float> m19501(float r1, float r2) {
            Yue.ۥۣۣۡۤ r0 = new Yue.ۥۣۣۡۤ
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T extends java.lang.Comparable<? super T>> Yue.InterfaceC4636<T> m19502(@Yue.InterfaceC4418 T r1, @Yue.InterfaceC4418 T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "that"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۦۡۤ r0 = new Yue.ۥ۟ۦۡۤ
            r0.<init>(r1, r2)
            return r0
    }
}
