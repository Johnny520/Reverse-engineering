package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2753 implements Yue.InterfaceC5794 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5794 f9041;

    public AbstractC2753(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f9041 = r2
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            r0.close()
            return
    }

    @Override // Yue.InterfaceC5794, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            r0.flush()
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
            Yue.ۥۣۢ۟ۡ r1 = r2.f9041
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5794
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6250 mo4174() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            Yue.ۥۢۡۤۧ r0 = r0.mo4174()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "delegate", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m12053() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "delegate")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m12054() {
            r1 = this;
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            return r0
    }

    @Override // Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣۢ۟ۡ r0 = r1.f9041
            r0.mo4176(r2, r3)
            return
    }
}
