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

    public C1391f1(float f, InterfaceC1006Xb interfaceC1006Xb) {
        while (interfaceC1006Xb instanceof C1391f1) {
            interfaceC1006Xb = ((C1391f1) interfaceC1006Xb).f4943a;
            f += ((C1391f1) interfaceC1006Xb).f4944b;
        }
        this.f4943a = interfaceC1006Xb;
        this.f4944b = f;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF rectF) {
        return Math.max(0.0f, this.f4943a.mo1563a(rectF) + this.f4944b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1391f1)) {
            return false;
        }
        C1391f1 c1391f1 = (C1391f1) obj;
        return this.f4943a.equals(c1391f1.f4943a) && this.f4944b == c1391f1.f4944b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4943a, Float.valueOf(this.f4944b)});
    }
}
