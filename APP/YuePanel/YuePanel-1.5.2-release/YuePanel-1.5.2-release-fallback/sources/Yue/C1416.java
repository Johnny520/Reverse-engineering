package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1416 implements Yue.InterfaceC1598<java.lang.Object> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1416 f4518 = null;

    static {
            Yue.ۥ۟ۦۣۡ r0 = new Yue.ۥ۟ۦۣۡ
            r0.<init>()
            Yue.C1416.f4518 = r0
            return
    }

    public C1416() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
