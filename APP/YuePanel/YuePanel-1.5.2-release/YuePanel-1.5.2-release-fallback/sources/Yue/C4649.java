package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4649 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC5609<T> m18469(@Yue.InterfaceC4418 java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L18
            java.lang.Object r1 = r1.get()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20997(r1)
            goto L1c
        L18:
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20987()
        L1c:
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> T m18470(@Yue.InterfaceC4418 java.util.Optional<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r1.get()
        Lf:
            return r2
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m18471(@Yue.InterfaceC4418 java.util.Optional<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L15
            java.lang.Object r1 = r1.get()
            goto L19
        L15:
            java.lang.Object r1 = r2.invoke()
        L19:
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m18472(@Yue.InterfaceC4418 java.util.Optional<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 0
            java.lang.Object r1 = r1.orElse(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T, C extends java.util.Collection<? super T>> C m18473(@Yue.InterfaceC4418 java.util.Optional<T> r1, @Yue.InterfaceC4418 C r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r1.get()
            java.lang.String r0 = "get()"
            Yue.C3329.m13905(r1, r0)
            r2.add(r1)
        L1c:
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.List<T> m18474(@Yue.InterfaceC4418 java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L14
            java.lang.Object r1 = r1.get()
            java.util.List r1 = Yue.C1207.m6190(r1)
            goto L18
        L14:
            java.util.List r1 = Yue.C1208.m6210()
        L18:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.util.Set<T> m18475(@Yue.InterfaceC4418 java.util.Optional<? extends T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.isPresent()
            if (r0 == 0) goto L14
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = Yue.C5686.m21252(r1)
            goto L18
        L14:
            java.util.Set r1 = Yue.C5687.m21257()
        L18:
            return r1
    }
}
