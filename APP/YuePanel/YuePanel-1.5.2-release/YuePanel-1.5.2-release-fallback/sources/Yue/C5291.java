package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "RegexExtensionsJDK8Kt")
public final class C5291 {
    @Yue.InterfaceC5792(version = "1.2")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C3913 m19974(@Yue.InterfaceC4418 Yue.InterfaceC3914 r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1 instanceof Yue.InterfaceC3915
            if (r0 == 0) goto L11
            Yue.ۥۡ۟ r1 = (Yue.InterfaceC3915) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L19
            Yue.ۥ۠ۨۨۨ r1 = r1.get(r2)
            return r1
        L19:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Retrieving groups by name is not supported on this platform."
            r1.<init>(r2)
            throw r1
    }
}
