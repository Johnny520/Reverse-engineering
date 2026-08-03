package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6558 {
    public C6558() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "sumOfUByte")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m25233(@Yue.InterfaceC4418 Yue.InterfaceC5609<Yue.C6517> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            Yue.ۥۢۢۥۥ r1 = (Yue.C6517) r1
            byte r1 = r1.m24850()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = Yue.C6528.m24937(r1)
            int r0 = r0 + r1
            int r0 = Yue.C6528.m24937(r0)
            goto La
        L26:
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "sumOfUInt")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m25234(@Yue.InterfaceC4418 Yue.InterfaceC5609<Yue.C6528> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            Yue.ۥۢۢۦۣ r1 = (Yue.C6528) r1
            int r1 = r1.m24991()
            int r0 = r0 + r1
            int r0 = Yue.C6528.m24937(r0)
            goto La
        L20:
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "sumOfULong")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m25235(@Yue.InterfaceC4418 Yue.InterfaceC5609<Yue.C6539> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            Yue.ۥۢۢۧ۟ r2 = (Yue.C6539) r2
            long r2 = r2.m25092()
            long r0 = r0 + r2
            long r0 = Yue.C6539.m25038(r0)
            goto Lb
        L21:
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "sumOfUShort")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m25236(@Yue.InterfaceC4418 Yue.InterfaceC5609<Yue.C6559> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            Yue.ۥۢۢۨۤ r1 = (Yue.C6559) r1
            short r1 = r1.m25295()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r1 = Yue.C6528.m24937(r1)
            int r0 = r0 + r1
            int r0 = Yue.C6528.m24937(r0)
            goto La
        L28:
            return r0
    }
}
