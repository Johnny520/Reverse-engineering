package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6584 extends Yue.AbstractC1643 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6584 f23007 = null;

    static {
            Yue.ۥۣۢ۟ۧ r0 = new Yue.ۥۣۢ۟ۧ
            r0.<init>()
            Yue.C6584.f23007 = r0
            return
    }

    public C6584() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            Yue.ۥۢۦۣۤ$ۥ r2 = Yue.C7177.f24764
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r2)
            Yue.ۥۢۦۣۤ r1 = (Yue.C7177) r1
            if (r1 == 0) goto Le
            r2 = 1
            r1.f24765 = r2
            return
        Le:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC1643
    public boolean isDispatchNeeded(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    @Yue.InterfaceC2302
    public Yue.AbstractC1643 limitedParallelism(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "limitedParallelism is not supported for Dispatchers.Unconfined"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Unconfined"
            return r0
    }
}
