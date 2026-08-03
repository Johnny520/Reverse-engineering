package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public final class C1760 implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Long f5457;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f5458;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f5459;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f5460;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f5461;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f5462;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<java.lang.StackTraceElement> f5463;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final long f5464;

    public C1760(@Yue.InterfaceC4418 Yue.C1739 r5, @Yue.InterfaceC4418 Yue.InterfaceC1632 r6) {
            r4 = this;
            r4.<init>()
            Yue.ۥ۟ۧۧۡ$ۥ r0 = Yue.C1652.f5103
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r6.get(r0)
            Yue.ۥ۟ۧۧۡ r0 = (Yue.C1652) r0
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r0.m7940()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L18
        L17:
            r0 = r1
        L18:
            r4.f5457 = r0
            Yue.ۥ۟ۧۤۥ$ۥ۟ r0 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r6.get(r0)
            Yue.ۥ۟ۧۤۥ r0 = (Yue.InterfaceC1601) r0
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.toString()
            goto L2a
        L29:
            r0 = r1
        L2a:
            r4.f5458 = r0
            Yue.ۥ۟ۧۧۢ$ۥ r0 = Yue.C1654.f5105
            Yue.ۥ۟ۧۦۥ$ۥ۟ r6 = r6.get(r0)
            Yue.ۥ۟ۧۧۢ r6 = (Yue.C1654) r6
            if (r6 == 0) goto L3b
            java.lang.String r6 = r6.m7946()
            goto L3c
        L3b:
            r6 = r1
        L3c:
            r4.f5459 = r6
            java.lang.String r6 = r5.m8277()
            r4.f5460 = r6
            java.lang.Thread r6 = r5.f5414
            if (r6 == 0) goto L53
            java.lang.Thread$State r6 = r6.getState()
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.toString()
            goto L54
        L53:
            r6 = r1
        L54:
            r4.f5461 = r6
            java.lang.Thread r6 = r5.f5414
            if (r6 == 0) goto L5e
            java.lang.String r1 = r6.getName()
        L5e:
            r4.f5462 = r1
            java.util.List r6 = r5.m8278()
            r4.f5463 = r6
            long r5 = r5.f5411
            r4.f5464 = r5
            return
    }

    @Yue.InterfaceC4543
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f5459
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Long m8354() {
            r1 = this;
            java.lang.Long r0 = r1.f5457
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m8355() {
            r1 = this;
            java.lang.String r0 = r1.f5458
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<java.lang.StackTraceElement> m8356() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.f5463
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m8357() {
            r1 = this;
            java.lang.String r0 = r1.f5462
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.String m8358() {
            r1 = this;
            java.lang.String r0 = r1.f5461
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m8359() {
            r2 = this;
            long r0 = r2.f5464
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.lang.String m8360() {
            r1 = this;
            java.lang.String r0 = r1.f5460
            return r0
    }
}
