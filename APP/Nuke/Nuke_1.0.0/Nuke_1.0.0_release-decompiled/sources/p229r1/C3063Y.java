package p229r1;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: r1.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C3063Y extends C3062X {
    public C3063Y(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: f */
    public List<Rect> mo5365f(int i5) {
        return this.f9758c.getBoundingRects(AbstractC3068b0.m5390a(i5));
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: g */
    public List<Rect> mo5366g(int i5) {
        return this.f9758c.getBoundingRectsIgnoringVisibility(AbstractC3068b0.m5390a(i5));
    }

    public C3063Y(C3070c0 c3070c0, C3063Y c3063y) {
        super(c3070c0, c3063y);
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: q */
    public void mo5371q() {
    }
}
