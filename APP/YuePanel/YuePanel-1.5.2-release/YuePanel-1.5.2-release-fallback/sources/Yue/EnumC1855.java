package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public enum EnumC1855 extends java.lang.Enum<Yue.EnumC1855> implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final Yue.EnumC1855 f5708 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC1855[] f5709 = null;

    static {
            Yue.ۥۣ۠۟ۡ r0 = new Yue.ۥۣ۠۟ۡ
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            Yue.EnumC1855.f5708 = r0
            Yue.ۥۣ۠۟ۡ[] r0 = new Yue.EnumC1855[]{r0}
            Yue.EnumC1855.f5709 = r0
            return
    }

    EnumC1855(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static Yue.EnumC1855 valueOf(java.lang.String r1) {
            java.lang.Class<Yue.ۥۣ۠۟ۡ> r0 = Yue.EnumC1855.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            Yue.ۥۣ۠۟ۡ r1 = (Yue.EnumC1855) r1
            return r1
    }

    public static Yue.EnumC1855[] values() {
            Yue.ۥۣ۠۟ۡ[] r0 = Yue.EnumC1855.f5709
            java.lang.Object r0 = r0.clone()
            Yue.ۥۣ۠۟ۡ[] r0 = (Yue.EnumC1855[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "DirectExecutor"
            return r0
    }
}
