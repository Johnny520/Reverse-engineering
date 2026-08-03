package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: Rv */
/* JADX INFO: loaded from: classes.dex */
public final class C0768Rv implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f2440a;

    public C0768Rv(float r1) {
        this.f2440a = r1;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF r2) {
        return Math.min(r2.width(), r2.height()) * this.f2440a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0768Rv) == true) goto L9;
        return false;
    L9:
        if (this.f2440a != ((C0768Rv) r4).f2440a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2440a)});
    }

    public final String toString() {
        return AbstractC0213Ey.m409g(new StringBuilder(), (int) (this.f2440a * 100.0f), "%");
    }
}
