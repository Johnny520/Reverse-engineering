package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: Xx */
/* JADX INFO: loaded from: classes.dex */
public final class C1028Xx extends AbstractC1071Yx {

    /* JADX INFO: renamed from: b */
    public float f3273b;

    /* JADX INFO: renamed from: c */
    public float f3274c;

    @Override // p000.AbstractC1071Yx
    /* JADX INFO: renamed from: a */
    public final void mo1862a(Matrix r3, Path r4) {
        Matrix r0 = this.f3383a;
        r3.invert(r0);
        r4.transform(r0);
        r4.lineTo(this.f3273b, this.f3274c);
        r4.transform(r3);
    }
}
