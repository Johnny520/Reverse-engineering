package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6254<U, T extends U> extends Yue.C5512<T> implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final long f22305;

    public RunnableC6254(long r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super U> r4) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r4.getContext()
            r1.<init>(r0, r4)
            r1.f22305 = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            long r0 = r2.f22305
            Yue.ۥۢۡۤۨ r0 = Yue.C6255.m23310(r0, r2)
            r2.m14093(r0)
            return
    }

    @Override // Yue.AbstractC0043, Yue.C3403
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ */
    public java.lang.String mo374() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.mo374()
            r0.append(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.f22305
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
