package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1079 {
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final char m5746(int r3) {
            if (r3 < 0) goto L9
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L9
            char r3 = (char) r3
            return r3
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid Char code: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m5747(char r0) {
            return r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3328
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m5748(char r0) {
            return
    }
}
