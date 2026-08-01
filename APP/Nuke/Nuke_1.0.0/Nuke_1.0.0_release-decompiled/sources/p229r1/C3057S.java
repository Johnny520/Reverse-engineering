package p229r1;

import android.view.WindowInsets;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.S */
/* JADX INFO: loaded from: classes.dex */
public class C3057S extends C3056Q {

    /* JADX INFO: renamed from: s */
    public C2688b f9769s;

    public C3057S(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
        this.f9769s = null;
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: b */
    public C3070c0 mo5379b() {
        return C3070c0.m5393c(null, this.f9758c.consumeStableInsets());
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: c */
    public C3070c0 mo5380c() {
        return C3070c0.m5393c(null, this.f9758c.consumeSystemWindowInsets());
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: l */
    public final C2688b mo5381l() {
        if (this.f9769s == null) {
            WindowInsets windowInsets = this.f9758c;
            this.f9769s = C2688b.m4667b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f9769s;
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: s */
    public boolean mo5382s() {
        return this.f9758c.isConsumed();
    }

    @Override // p229r1.C3064Z
    /* JADX INFO: renamed from: z */
    public void mo5383z(C2688b c2688b) {
        this.f9769s = c2688b;
    }

    public C3057S(C3070c0 c3070c0, C3057S c3057s) {
        super(c3070c0, c3057s);
        this.f9769s = null;
        this.f9769s = c3057s.f9769s;
    }
}
