package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704x9 implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f9279a;

    public C2704x9(float f) {
        this.f9279a = f;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.f9279a;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2704x9) && this.f9279a == ((C2704x9) obj).f9279a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9279a)});
    }
}
