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

    public C0145DF(C0489LF r1, WindowInsets r2) {
        super(r1, r2);
        this.f374o = null;
        this.f375p = null;
        this.f376q = null;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: h */
    public C2765yl mo260h() {
        if (this.f375p != null) goto L6;
        this.f375p = C2765yl.m5338c(AbstractC0617OE.m1203k(this.f26c));
    L6:
        return this.f375p;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: j */
    public C2765yl mo261j() {
        if (this.f374o != null) goto L6;
        this.f374o = C2765yl.m5338c(AbstractC0617OE.m1206n(this.f26c));
    L6:
        return this.f374o;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: l */
    public C2765yl mo262l() {
        if (this.f376q != null) goto L6;
        this.f376q = C2765yl.m5338c(AbstractC0617OE.m1194b(this.f26c));
    L6:
        return this.f376q;
    }

    @Override // p000.C0016AF, p000.C0317HF
    /* JADX INFO: renamed from: m */
    public C0489LF mo16m(int r2, int r3, int r4, int r5) {
        return C0489LF.m939h(null, AbstractC0617OE.m1198f(this.f26c, r2, r3, r4, r5));
    }

    @Override // p000.C0059BF, p000.C0317HF
    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl r1) {
    }

    public C0145DF(C0489LF r1, C0145DF r2) {
        super(r1, r2);
        this.f374o = null;
        this.f375p = null;
        this.f376q = null;
    }
}
