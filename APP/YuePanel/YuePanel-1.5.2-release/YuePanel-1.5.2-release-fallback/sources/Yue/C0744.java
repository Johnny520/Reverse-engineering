package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0744 implements Yue.InterfaceC3907 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f2074 = -2849567615646933777L;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.lang.String f2075 = "[ ";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.String f2076 = " ]";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static java.lang.String f2077 = ", ";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.String f2078;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.List<Yue.InterfaceC3907> f2079;

    static {
            return
    }

    public C0744(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f2079 = r0
            if (r2 == 0) goto Lf
            r1.f2078 = r2
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A marker name cannot be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.InterfaceC3907
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof Yue.InterfaceC3907
            if (r1 != 0) goto Ld
            return r0
        Ld:
            Yue.ۥ۠ۨۨۢ r3 = (Yue.InterfaceC3907) r3
            java.lang.String r0 = r2.f2078
            java.lang.String r3 = r3.getName()
            boolean r3 = r0.equals(r3)
            return r3
    }

    @Override // Yue.InterfaceC3907
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f2078
            return r0
    }

    @Override // Yue.InterfaceC3907
    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f2078
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC3907
    public java.util.Iterator<Yue.InterfaceC3907> iterator() {
            r1 = this;
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r1.f2079
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.mo4588()
            if (r0 != 0) goto Lb
            java.lang.String r0 = r3.getName()
            return r0
        Lb:
            java.util.Iterator r0 = r3.iterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r3.getName()
            r1.<init>(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = Yue.C0744.f2075
            r1.append(r2)
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠ۨۨۢ r2 = (Yue.InterfaceC3907) r2
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.String r2 = Yue.C0744.f2077
            r1.append(r2)
            goto L22
        L41:
            java.lang.String r0 = Yue.C0744.f2076
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean mo4588() {
            r1 = this;
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r1.f2079
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean mo4589(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L2d
            java.lang.String r0 = r3.f2078
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r3.mo4588()
            if (r0 == 0) goto L2b
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r3.f2079
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠ۨۨۢ r2 = (Yue.InterfaceC3907) r2
            boolean r2 = r2.mo4589(r4)
            if (r2 == 0) goto L18
            return r1
        L2b:
            r4 = 0
            return r4
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Other cannot be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void mo4590(Yue.InterfaceC3907 r2) {
            r1 = this;
            if (r2 == 0) goto L16
            boolean r0 = r1.mo4592(r2)
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r2.mo4592(r1)
            if (r0 == 0) goto L10
            return
        L10:
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r1.f2079
            r0.add(r2)
            return
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A null value cannot be added to a Marker as reference."
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean mo4591(Yue.InterfaceC3907 r2) {
            r1 = this;
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r1.f2079
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean mo4592(Yue.InterfaceC3907 r4) {
            r3 = this;
            if (r4 == 0) goto L2b
            boolean r0 = r3.equals(r4)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r3.mo4588()
            if (r0 == 0) goto L29
            java.util.List<Yue.ۥ۠ۨۨۢ> r0 = r3.f2079
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠ۨۨۢ r2 = (Yue.InterfaceC3907) r2
            boolean r2 = r2.mo4592(r4)
            if (r2 == 0) goto L16
            return r1
        L29:
            r4 = 0
            return r4
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Other cannot be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.InterfaceC3907
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public boolean mo4593() {
            r1 = this;
            boolean r0 = r1.mo4588()
            return r0
    }
}
