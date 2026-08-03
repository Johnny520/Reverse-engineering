package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4632 {
    public AbstractC4632() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public abstract Yue.AbstractC0641<?> mo4202();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m18453(@Yue.InterfaceC4418 Yue.AbstractC4632 r7) {
            r6 = this;
            Yue.ۥ۟ۢ۠ r0 = r6.mo4202()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            Yue.ۥ۟ۢ۠ r7 = r7.mo4202()
            if (r7 != 0) goto Lf
            return r1
        Lf:
            long r2 = r0.mo4207()
            long r4 = r7.mo4207()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L1c
            r1 = 1
        L1c:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract java.lang.Object mo4203(@Yue.InterfaceC4543 java.lang.Object r1);
}
