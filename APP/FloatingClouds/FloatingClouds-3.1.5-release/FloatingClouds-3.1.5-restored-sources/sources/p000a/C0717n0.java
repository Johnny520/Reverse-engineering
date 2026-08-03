package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: a.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0717n0 implements InterfaceC0892w4 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0892w4 f2734a;

    /* JADX INFO: renamed from: b */
    public final float f2735b;

    public C0717n0(float f, InterfaceC0892w4 interfaceC0892w4) {
        while (interfaceC0892w4 instanceof C0717n0) {
            interfaceC0892w4 = ((C0717n0) interfaceC0892w4).f2734a;
            f += ((C0717n0) interfaceC0892w4).f2735b;
        }
        this.f2734a = interfaceC0892w4;
        this.f2735b = f;
    }

    @Override // p000a.InterfaceC0892w4
    /* JADX INFO: renamed from: a */
    public final float mo1073a(RectF rectF) {
        return Math.max(0.0f, this.f2734a.mo1073a(rectF) + this.f2735b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0717n0)) {
            return false;
        }
        C0717n0 c0717n0 = (C0717n0) obj;
        return this.f2734a.equals(c0717n0.f2734a) && this.f2735b == c0717n0.f2735b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2734a, Float.valueOf(this.f2735b)});
    }
}
