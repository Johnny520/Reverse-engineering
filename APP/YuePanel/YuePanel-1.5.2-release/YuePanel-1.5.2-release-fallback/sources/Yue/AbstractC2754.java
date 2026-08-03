package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2754 implements Yue.InterfaceC5839 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5839 f9042;

    public AbstractC2754(@Yue.InterfaceC4418 Yue.InterfaceC5839 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f9042 = r2
            return
    }

    @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f9042
            r0.close()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            Yue.ۥۣۢ۟ۦ r1 = r2.f9042
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5839
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4177() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f9042
            Yue.ۥۢۡۤۧ r0 = r0.mo4177()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "delegate", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m12055() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f9042
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "delegate")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m12056() {
            r1 = this;
            Yue.ۥۣۢ۟ۦ r0 = r1.f9042
            return r0
    }

    @Override // Yue.InterfaceC5839
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣۢ۟ۦ r0 = r1.f9042
            long r2 = r0.mo4179(r2, r3)
            return r2
    }
}
