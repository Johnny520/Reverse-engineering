package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0745 implements org.slf4j.IMarkerFactory {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentMap<java.lang.String, Yue.InterfaceC3907> f2080;

    public C0745() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f2080 = r0
            return
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC3907 mo4594(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1d
            java.util.concurrent.ConcurrentMap<java.lang.String, Yue.ۥ۠ۨۨۢ> r0 = r2.f2080
            java.lang.Object r0 = r0.get(r3)
            Yue.ۥ۠ۨۨۢ r0 = (Yue.InterfaceC3907) r0
            if (r0 != 0) goto L1c
            Yue.ۥ۟ۢۦۢ r0 = new Yue.ۥ۟ۢۦۢ
            r0.<init>(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, Yue.ۥ۠ۨۨۢ> r1 = r2.f2080
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            Yue.ۥ۠ۨۨۢ r3 = (Yue.InterfaceC3907) r3
            if (r3 == 0) goto L1c
            r0 = r3
        L1c:
            return r0
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Marker name cannot be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.InterfaceC3907 mo4595(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۢۦۢ r0 = new Yue.ۥ۟ۢۦۢ
            r0.<init>(r2)
            return r0
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo4596(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.ConcurrentMap<java.lang.String, Yue.ۥ۠ۨۨۢ> r1 = r2.f2080
            java.lang.Object r3 = r1.remove(r3)
            if (r3 == 0) goto Ld
            r0 = 1
        Ld:
            return r0
    }

    @Override // org.slf4j.IMarkerFactory
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo4597(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.concurrent.ConcurrentMap<java.lang.String, Yue.ۥ۠ۨۨۢ> r0 = r1.f2080
            boolean r2 = r0.containsKey(r2)
            return r2
    }
}
