package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5918 {
    public C5918() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Void m21970() {
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Void m21971(java.lang.String r3) {
            java.lang.String r0 = "reason"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An operation is not implemented: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m21972(T r1, Yue.InterfaceC2825<? super T, Yue.C6593> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            r2.invoke(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m21973(T r1, Yue.InterfaceC2825<? super T, Yue.C6593> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            r2.invoke(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T, R> R m21974(T r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m21975(int r2, Yue.InterfaceC2825<? super java.lang.Integer, Yue.C6593> r3) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
        L6:
            if (r0 >= r2) goto L12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1)
            int r0 = r0 + 1
            goto L6
        L12:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R> R m21976(Yue.InterfaceC2823<? extends R> r1) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object r1 = r1.invoke()
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T, R> R m21977(T r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> T m21978(T r1, Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> T m21979(T r1, Yue.InterfaceC2825<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T, R> R m21980(T r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r1 = r2.invoke(r1)
            return r1
    }
}
