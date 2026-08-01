package p265s1;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: s1.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7122p0 implements InterfaceC7134r2 {

    /* JADX INFO: renamed from: a */
    public Paint f23629a;

    /* JADX INFO: renamed from: b */
    public int f23630b;

    /* JADX INFO: renamed from: c */
    public Shader f23631c;

    /* JADX INFO: renamed from: d */
    public AbstractC7133r1 f23632d;

    public C7122p0(Paint paint) {
        this.f23629a = paint;
        this.f23630b = AbstractC7168z0.f23700a.m28306B();
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: a */
    public float mo28056a() {
        return AbstractC7127q0.m28095c(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: b */
    public long mo28057b() {
        return AbstractC7127q0.m28096d(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: c */
    public void mo28058c(int i10) {
        if (AbstractC7168z0.m28276E(this.f23630b, i10)) {
            return;
        }
        this.f23630b = i10;
        AbstractC7127q0.m28104l(this.f23629a, i10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: d */
    public AbstractC7133r1 mo28059d() {
        return this.f23632d;
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: e */
    public void mo28060e(float f10) {
        AbstractC7127q0.m28103k(this.f23629a, f10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: f */
    public void mo28061f(AbstractC7133r1 abstractC7133r1) {
        this.f23632d = abstractC7133r1;
        AbstractC7127q0.m28106n(this.f23629a, abstractC7133r1);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: g */
    public int mo28062g() {
        return this.f23630b;
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: h */
    public int mo28063h() {
        return AbstractC7127q0.m28099g(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: i */
    public void mo28064i(int i10) {
        AbstractC7127q0.m28110r(this.f23629a, i10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: j */
    public float mo28065j() {
        return AbstractC7127q0.m28100h(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: k */
    public Paint mo28066k() {
        return this.f23629a;
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: l */
    public void mo28067l(Shader shader) {
        this.f23631c = shader;
        AbstractC7127q0.m28109q(this.f23629a, shader);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: m */
    public Shader mo28068m() {
        return this.f23631c;
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: n */
    public void mo28069n(InterfaceC7149u2 interfaceC7149u2) {
        AbstractC7127q0.m28108p(this.f23629a, interfaceC7149u2);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: o */
    public void mo28070o(float f10) {
        AbstractC7127q0.m28112t(this.f23629a, f10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: p */
    public void mo28071p(int i10) {
        AbstractC7127q0.m28107o(this.f23629a, i10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: q */
    public int mo28072q() {
        return AbstractC7127q0.m28097e(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: r */
    public int mo28073r() {
        return AbstractC7127q0.m28098f(this.f23629a);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: s */
    public void mo28074s(int i10) {
        AbstractC7127q0.m28111s(this.f23629a, i10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: t */
    public void mo28075t(int i10) {
        AbstractC7127q0.m28114v(this.f23629a, i10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: u */
    public void mo28076u(long j10) {
        AbstractC7127q0.m28105m(this.f23629a, j10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: v */
    public InterfaceC7149u2 mo28077v() {
        return null;
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: w */
    public void mo28078w(float f10) {
        AbstractC7127q0.m28113u(this.f23629a, f10);
    }

    @Override // p265s1.InterfaceC7134r2
    /* JADX INFO: renamed from: x */
    public float mo28079x() {
        return AbstractC7127q0.m28101i(this.f23629a);
    }

    public C7122p0() {
        this(AbstractC7127q0.m28102j());
    }
}
