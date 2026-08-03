package p000;

/* JADX INFO: renamed from: zF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2796zF {

    /* JADX INFO: renamed from: a */
    public final C0489LF f9464a;

    /* JADX INFO: renamed from: b */
    public C2765yl[] f9465b;

    public AbstractC2796zF() {
        this(new C0489LF((C0489LF) null));
    }

    /* JADX INFO: renamed from: a */
    public final void m5362a() {
        C2765yl[] c2765ylArr = this.f9465b;
        if (c2765ylArr != null) {
            C2765yl c2765ylMo14g = c2765ylArr[0];
            C2765yl c2765ylMo14g2 = c2765ylArr[1];
            C0489LF c0489lf = this.f9464a;
            if (c2765ylMo14g2 == null) {
                c2765ylMo14g2 = c0489lf.f1602a.mo14g(2);
            }
            if (c2765ylMo14g == null) {
                c2765ylMo14g = c0489lf.f1602a.mo14g(1);
            }
            mo5086g(C2765yl.m5336a(c2765ylMo14g, c2765ylMo14g2));
            C2765yl c2765yl = this.f9465b[AbstractC0714Qj.m1501w(16)];
            if (c2765yl != null) {
                mo5141f(c2765yl);
            }
            C2765yl c2765yl2 = this.f9465b[AbstractC0714Qj.m1501w(32)];
            if (c2765yl2 != null) {
                mo5140d(c2765yl2);
            }
            C2765yl c2765yl3 = this.f9465b[AbstractC0714Qj.m1501w(64)];
            if (c2765yl3 != null) {
                mo5142h(c2765yl3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C0489LF mo5084b();

    /* JADX INFO: renamed from: c */
    public void mo5234c(int i, C2765yl c2765yl) {
        if (this.f9465b == null) {
            this.f9465b = new C2765yl[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f9465b[AbstractC0714Qj.m1501w(i2)] = c2765yl;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo5140d(C2765yl c2765yl) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo5085e(C2765yl c2765yl);

    /* JADX INFO: renamed from: f */
    public void mo5141f(C2765yl c2765yl) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo5086g(C2765yl c2765yl);

    /* JADX INFO: renamed from: h */
    public void mo5142h(C2765yl c2765yl) {
    }

    public AbstractC2796zF(C0489LF c0489lf) {
        this.f9464a = c0489lf;
    }
}
