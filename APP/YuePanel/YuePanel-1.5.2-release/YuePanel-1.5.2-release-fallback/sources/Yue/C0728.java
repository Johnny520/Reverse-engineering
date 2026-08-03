package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0728 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC2303
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m4529(Yue.C0724 r1, java.lang.CharSequence r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L31
            int r0 = r2.length()
            r1.m4496(r0, r3, r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r2.substring(r3, r4)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r1, r2)
            java.nio.charset.Charset r2 = Yue.C1099.f3266
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r1, r3)
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r2)
            goto L35
        L31:
            byte[] r1 = r1.m4494(r2, r3, r4)
        L35:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC2303
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m4530(Yue.C0724 r1, byte[] r2, byte[] r3, int r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "destination"
            Yue.C3329.m13906(r3, r0)
            int r1 = r1.m4505(r2, r3, r4, r5, r6)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC2303
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte[] m4531(Yue.C0724 r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            byte[] r1 = r1.m4509(r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC2303
    @Yue.InterfaceC5792(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m4532(Yue.C0724 r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            byte[] r1 = r1.m4509(r2, r3, r4)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = Yue.C1099.f3266
            r2.<init>(r1, r3)
            return r2
    }
}
