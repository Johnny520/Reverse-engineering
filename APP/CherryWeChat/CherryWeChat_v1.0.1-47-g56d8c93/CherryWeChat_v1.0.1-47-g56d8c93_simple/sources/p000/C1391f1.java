package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1391f1 implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1006Xb f4943a;

    /* JADX INFO: renamed from: b */
    public final float f4944b;

    public C1391f1(float r2, InterfaceC1006Xb r3) {
    L4:
        if ((r3 instanceof C1391f1) == false) goto L6;
        r3 = ((C1391f1) r3).f4943a;
        r2 = r2 + ((C1391f1) r3).f4944b;
        goto L4
    L6:
        this.f4943a = r3;
        this.f4944b = r2;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF r2) {
        return Math.max(0.0f, this.f4943a.mo1563a(r2) + this.f4944b);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1391f1) == true) goto L8;
        return false;
    L8:
        C1391f1 r52 = (C1391f1) r5;
        if (this.f4943a.equals(r52.f4943a) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.f4944b != r52.f4944b) goto L13;
        return true;
    }

    public final int hashCode() {
        Float r0 = Float.valueOf(this.f4944b);
        return Arrays.hashCode(new Object[]{this.f4943a, r0});
    }
}
