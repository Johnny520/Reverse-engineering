package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0256<E> extends Yue.C1000<E> implements Yue.InterfaceC0258<E> {
    public C0256(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 Yue.InterfaceC0996<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r3 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r2.get(r3)
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            r1.m14112(r2)
            return
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public boolean mo1202(@Yue.InterfaceC4418 java.lang.Throwable r2) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.getContext()
            Yue.C1650.m7933(r0, r2)
            r2 = 1
            return r2
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public void mo1203(@Yue.InterfaceC4543 java.lang.Throwable r4) {
            r3 = this;
            Yue.ۥ۟ۤ۠ۨ r0 = r3.m5531()
            r1 = 0
            if (r4 == 0) goto L2a
            boolean r2 = r4 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto Le
            r1 = r4
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        Le:
            if (r1 != 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = Yue.C1758.m8350(r3)
            r1.append(r2)
            java.lang.String r2 = " was cancelled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r4 = Yue.C2266.m10466(r1, r4)
            r1 = r4
        L2a:
            r0.mo311(r1)
            return
    }
}
