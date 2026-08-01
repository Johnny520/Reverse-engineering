package p229r1;

import android.view.View;
import android.view.WindowInsets;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.X */
/* JADX INFO: loaded from: classes.dex */
public class C3062X extends C3061W {

    /* JADX INFO: renamed from: x */
    public static final C3070c0 f9774x = C3070c0.m5393c(null, WindowInsets.CONSUMED);

    public C3062X(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
    }

    @Override // p229r1.C3060V, p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: i */
    public C2688b mo5367i(int i5) {
        return C2688b.m4668c(this.f9758c.getInsets(AbstractC3068b0.m5390a(i5)));
    }

    @Override // p229r1.C3060V, p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: j */
    public C2688b mo5368j(int i5) {
        return C2688b.m4668c(this.f9758c.getInsetsIgnoringVisibility(AbstractC3068b0.m5390a(i5)));
    }

    @Override // p229r1.C3060V, p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: u */
    public boolean mo5374u(int i5) {
        return this.f9758c.isVisible(AbstractC3068b0.m5390a(i5));
    }

    public C3062X(C3070c0 c3070c0, C3062X c3062x) {
        super(c3070c0, c3062x);
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: p */
    public void mo5370p(View view) {
    }
}
