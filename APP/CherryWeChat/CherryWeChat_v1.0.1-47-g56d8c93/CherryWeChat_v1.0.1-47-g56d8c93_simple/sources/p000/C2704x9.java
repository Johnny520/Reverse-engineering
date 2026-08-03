package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704x9 implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f9279a;

    public C2704x9(float r1) {
        this.f9279a = r1;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF r4) {
        float r42 = Math.min(r4.width() / 2.0f, r4.height() / 2.0f);
        float r0 = this.f9279a;
        if (r0 >= 0.0f) goto L6;
        return 0.0f;
    L6:
        if (r0 <= r42) goto L8;
        return r42;
    L8:
        return r0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2704x9) == true) goto L9;
        return false;
    L9:
        if (this.f9279a != ((C2704x9) r4).f9279a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9279a)});
    }
}
