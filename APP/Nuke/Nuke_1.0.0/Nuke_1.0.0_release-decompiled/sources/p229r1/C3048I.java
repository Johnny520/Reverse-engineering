package p229r1;

import android.view.WindowInsets;
import p205n1.C2688b;
import p228r0.AbstractC3033f;

/* JADX INFO: renamed from: r1.I */
/* JADX INFO: loaded from: classes.dex */
public class C3048I extends AbstractC3055P {

    /* JADX INFO: renamed from: e */
    public final WindowInsets.Builder f9748e;

    public C3048I() {
        this.f9748e = AbstractC3033f.m5276b();
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: b */
    public C3070c0 mo5322b() {
        m5349a();
        C3070c0 c3070c0M5393c = C3070c0.m5393c(null, this.f9748e.build());
        C2688b[] c2688bArr = this.f9750b;
        C3064Z c3064z = c3070c0M5393c.f9782a;
        c3064z.mo5376w(c2688bArr);
        c3064z.mo5375v(null);
        c3064z.mo5359B(this.f9751c);
        c3064z.mo5360C(this.f9752d);
        return c3070c0M5393c;
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: e */
    public void mo5325e(C2688b c2688b) {
        this.f9748e.setMandatorySystemGestureInsets(c2688b.m4669d());
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: f */
    public void mo5323f(C2688b c2688b) {
        this.f9748e.setStableInsets(c2688b.m4669d());
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: g */
    public void mo5326g(C2688b c2688b) {
        this.f9748e.setSystemGestureInsets(c2688b.m4669d());
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: h */
    public void mo5324h(C2688b c2688b) {
        this.f9748e.setSystemWindowInsets(c2688b.m4669d());
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: i */
    public void mo5327i(C2688b c2688b) {
        this.f9748e.setTappableElementInsets(c2688b.m4669d());
    }

    public C3048I(C3070c0 c3070c0) {
        WindowInsets.Builder builderM5276b;
        super(c3070c0);
        WindowInsets windowInsetsM5394b = c3070c0.m5394b();
        if (windowInsetsM5394b != null) {
            builderM5276b = AbstractC3033f.m5277c(windowInsetsM5394b);
        } else {
            builderM5276b = AbstractC3033f.m5276b();
        }
        this.f9748e = builderM5276b;
    }
}
