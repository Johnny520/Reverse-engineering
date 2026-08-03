package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: DF */
/* JADX INFO: loaded from: classes.dex */
public class C0145DF extends C0102CF {

    /* JADX INFO: renamed from: o */
    public C2765yl f374o;

    /* JADX INFO: renamed from: p */
    public C2765yl f375p;

    /* JADX INFO: renamed from: q */
    public C2765yl f376q;

    public C0145DF(C0489LF c0489lf, WindowInsets windowInsets) {
        super(c0489lf, windowInsets);
        this.f374o = null;
        this.f375p = null;
        this.f376q = null;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: h */
    public C2765yl mo260h() {
        if (this.f375p == null) {
            this.f375p = C2765yl.m5338c(this.f26c.getMandatorySystemGestureInsets());
        }
        return this.f375p;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: j */
    public C2765yl mo261j() {
        if (this.f374o == null) {
            this.f374o = C2765yl.m5338c(this.f26c.getSystemGestureInsets());
        }
        return this.f374o;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: l */
    public C2765yl mo262l() {
        if (this.f376q == null) {
            this.f376q = C2765yl.m5338c(this.f26c.getTappableElementInsets());
        }
        return this.f376q;
    }

    @Override // p000.C0016AF, p000.C0317HF
    /* JADX INFO: renamed from: m */
    public C0489LF mo16m(int i, int i2, int i3, int i4) {
        return C0489LF.m939h(null, this.f26c.inset(i, i2, i3, i4));
    }

    @Override // p000.C0059BF, p000.C0317HF
    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl c2765yl) {
    }

    public C0145DF(C0489LF c0489lf, C0145DF c0145df) {
        super(c0489lf, c0145df);
        this.f374o = null;
        this.f375p = null;
        this.f376q = null;
    }
}
