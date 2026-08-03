package p000;

/* JADX INFO: renamed from: zF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2796zF {

    /* JADX INFO: renamed from: a */
    public final C0489LF f9464a;

    /* JADX INFO: renamed from: b */
    public C2765yl[] f9465b;

    public AbstractC2796zF() {
        this(new C0489LF(null));
    }

    /* JADX INFO: renamed from: a */
    public final void m5362a() {
        C2765yl[] r0 = this.f9465b;
        if (r0 == null) goto L19;
        C2765yl r1 = r0[0];
        C2765yl r02 = r0[1];
        C0489LF r3 = this.f9464a;
        if (r02 != null) goto L7;
        r02 = r3.f1602a.mo14g(2);
    L7:
        if (r1 != null) goto L9;
        r1 = r3.f1602a.mo14g(1);
    L9:
        mo5086g(C2765yl.m5336a(r1, r02));
        C2765yl r03 = this.f9465b[AbstractC0714Qj.m1501w(16)];
        if (r03 == null) goto L12;
        mo5141f(r03);
    L12:
        C2765yl r04 = this.f9465b[AbstractC0714Qj.m1501w(32)];
        if (r04 == null) goto L15;
        mo5140d(r04);
    L15:
        C2765yl r05 = this.f9465b[AbstractC0714Qj.m1501w(64)];
        if (r05 == null) goto L20;
        mo5142h(r05);
        return;
    L20:
        return;
    }

    /* JADX INFO: renamed from: b */
    public abstract C0489LF mo5084b();

    /* JADX INFO: renamed from: c */
    public void mo5234c(int r4, C2765yl r5) {
        if (this.f9465b != null) goto L5;
        this.f9465b = new C2765yl[10];
    L5:
        int r0 = 1;
    L7:
        if (r0 > 512) goto L13;
        if ((r4 & r0) == 0) goto L12;
        this.f9465b[AbstractC0714Qj.m1501w(r0)] = r5;
    L12:
        r0 = r0 << 1;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public void mo5140d(C2765yl r1) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo5085e(C2765yl r1);

    /* JADX INFO: renamed from: f */
    public void mo5141f(C2765yl r1) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo5086g(C2765yl r1);

    /* JADX INFO: renamed from: h */
    public void mo5142h(C2765yl r1) {
    }

    public AbstractC2796zF(C0489LF r1) {
        this.f9464a = r1;
    }
}
