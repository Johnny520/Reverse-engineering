package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3908 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static org.slf4j.IMarkerFactory f12448;

    static {
            org.slf4j.IMarkerFactory r0 = m15862()     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            Yue.C3908.f12448 = r0     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> Le
            goto L15
        L7:
            r0 = move-exception
            java.lang.String r1 = "Unexpected failure while binding MarkerFactory"
            Yue.C6653.m25549(r1, r0)
            goto L15
        Le:
            Yue.ۥ۟ۢۦۣ r0 = new Yue.ۥ۟ۢۦۣ
            r0.<init>()
            Yue.C3908.f12448 = r0
        L15:
            return
    }

    public C3908() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static org.slf4j.IMarkerFactory m15862() throws java.lang.NoClassDefFoundError {
            org.slf4j.impl.StaticMarkerBinder r0 = org.slf4j.impl.StaticMarkerBinder.getSingleton()     // Catch: java.lang.NoSuchMethodError -> L9
            org.slf4j.IMarkerFactory r0 = r0.getMarkerFactory()     // Catch: java.lang.NoSuchMethodError -> L9
            return r0
        L9:
            org.slf4j.impl.StaticMarkerBinder r0 = org.slf4j.impl.StaticMarkerBinder.SINGLETON
            org.slf4j.IMarkerFactory r0 = r0.getMarkerFactory()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.InterfaceC3907 m15863(java.lang.String r1) {
            org.slf4j.IMarkerFactory r0 = Yue.C3908.f12448
            Yue.ۥ۠ۨۨۢ r1 = r0.mo4595(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static org.slf4j.IMarkerFactory m15864() {
            org.slf4j.IMarkerFactory r0 = Yue.C3908.f12448
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.InterfaceC3907 m15865(java.lang.String r1) {
            org.slf4j.IMarkerFactory r0 = Yue.C3908.f12448
            Yue.ۥ۠ۨۨۢ r1 = r0.mo4594(r1)
            return r1
    }
}
