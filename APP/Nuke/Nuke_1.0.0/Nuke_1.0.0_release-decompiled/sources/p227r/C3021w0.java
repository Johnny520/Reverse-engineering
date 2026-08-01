package p227r;

import p216p.C2825S;

/* JADX INFO: renamed from: r.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3021w0 implements InterfaceC2991h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2940A0 f9573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3025y0 f9574b;

    public C3021w0(C2940A0 c2940a0, C3025y0 c3025y0) {
        this.f9573a = c2940a0;
        this.f9574b = c3025y0;
    }

    @Override // p227r.InterfaceC2991h0
    /* JADX INFO: renamed from: a */
    public final float mo5202a(float f2) {
        float fAbs = Math.abs(f2);
        C2940A0 c2940a0 = this.f9573a;
        if (fAbs != 0.0f && !((Boolean) c2940a0.f9277h.mo6a()).booleanValue()) {
            throw new C2825S("The fling animation was cancelled", 2);
        }
        return c2940a0.m5144d(c2940a0.m5147g(this.f9574b.m5224a(c2940a0.m5145e(c2940a0.m5148h(f2)), 2)));
    }
}
