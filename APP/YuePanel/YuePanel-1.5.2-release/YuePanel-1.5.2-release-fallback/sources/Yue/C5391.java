package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class C5391 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m20390(@Yue.InterfaceC4418 java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۦۧۤ$ۥ۟ r0 = new Yue.ۥۡۦۧۤ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <R, T> R m20391(java.lang.Object r1, Yue.InterfaceC2825<? super T, ? extends R> r2, Yue.InterfaceC2825<? super java.lang.Throwable, ? extends R> r3) {
            java.lang.String r0 = "onSuccess"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "onFailure"
            Yue.C3329.m13906(r3, r0)
            java.lang.Throwable r0 = Yue.C5388.m20380(r1)
            if (r0 != 0) goto L15
            java.lang.Object r1 = r2.invoke(r1)
            goto L19
        L15:
            java.lang.Object r1 = r3.invoke(r0)
        L19:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <R, T extends R> R m20392(java.lang.Object r1, R r2) {
            boolean r0 = Yue.C5388.m20384(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <R, T extends R> R m20393(java.lang.Object r1, Yue.InterfaceC2825<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "onFailure"
            Yue.C3329.m13906(r2, r0)
            java.lang.Throwable r0 = Yue.C5388.m20380(r1)
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            java.lang.Object r1 = r2.invoke(r0)
        L10:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m20394(java.lang.Object r0) {
            m20403(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <R, T> java.lang.Object m20395(java.lang.Object r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = Yue.C5388.m20385(r1)
            if (r0 == 0) goto L16
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
            goto L1a
        L16:
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L1a:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R, T> java.lang.Object m20396(java.lang.Object r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = Yue.C5388.m20385(r1)
            if (r0 == 0) goto L22
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L16
            goto L26
        L16:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
            goto L26
        L22:
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L26:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.Object m20397(java.lang.Object r1, Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            java.lang.Throwable r0 = Yue.C5388.m20380(r1)
            if (r0 == 0) goto Le
            r2.invoke(r0)
        Le:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m20398(java.lang.Object r1, Yue.InterfaceC2825<? super T, Yue.C6593> r2) {
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = Yue.C5388.m20385(r1)
            if (r0 == 0) goto Le
            r2.invoke(r1)
        Le:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <R, T extends R> java.lang.Object m20399(java.lang.Object r1, Yue.InterfaceC2825<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            java.lang.Throwable r0 = Yue.C5388.m20380(r1)
            if (r0 != 0) goto Lc
            goto L16
        Lc:
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r1 = r2.invoke(r0)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L16:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <R, T extends R> java.lang.Object m20400(java.lang.Object r1, Yue.InterfaceC2825<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            java.lang.Throwable r0 = Yue.C5388.m20380(r1)
            if (r0 != 0) goto Lc
            goto L22
        Lc:
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L22:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <R> java.lang.Object m20401(Yue.InterfaceC2823<? extends R> r1) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r1 = m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L1b:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T, R> java.lang.Object m20402(T r1, Yue.InterfaceC2825<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L1b:
            return r1
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m20403(@Yue.InterfaceC4418 java.lang.Object r1) {
            boolean r0 = r1 instanceof Yue.C5388.C5390
            if (r0 != 0) goto L5
            return
        L5:
            Yue.ۥۡۦۧۤ$ۥ۟ r1 = (Yue.C5388.C5390) r1
            java.lang.Throwable r1 = r1.f20031
            throw r1
    }
}
