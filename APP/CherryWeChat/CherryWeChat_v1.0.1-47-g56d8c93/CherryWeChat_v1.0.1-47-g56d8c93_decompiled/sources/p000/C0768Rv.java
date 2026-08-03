package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Rv */
/* JADX INFO: loaded from: classes.dex */
public final class C0768Rv implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f2440a;

    public C0768Rv(float f) {
        this.f2440a = f;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2440a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0768Rv) && this.f2440a == ((C0768Rv) obj).f2440a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2440a)});
    }

    public final String toString() {
        return AbstractC0213Ey.m409g(new StringBuilder(), (int) (this.f2440a * 100.0f), "%");
    }
}
