package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0951z1 implements InterfaceC0184ee {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184ee f5528a;

    /* JADX INFO: renamed from: b */
    public final float f5529b;

    public C0951z1(float f, InterfaceC0184ee interfaceC0184ee) {
        while (interfaceC0184ee instanceof C0951z1) {
            interfaceC0184ee = ((C0951z1) interfaceC0184ee).f5528a;
            f += ((C0951z1) interfaceC0184ee).f5529b;
        }
        this.f5528a = interfaceC0184ee;
        this.f5529b = f;
    }

    @Override // p000.InterfaceC0184ee
    /* JADX INFO: renamed from: a */
    public final float mo943a(RectF rectF) {
        return Math.max(0.0f, this.f5528a.mo943a(rectF) + this.f5529b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951z1)) {
            return false;
        }
        C0951z1 c0951z1 = (C0951z1) obj;
        return this.f5528a.equals(c0951z1.f5528a) && this.f5529b == c0951z1.f5529b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5528a, Float.valueOf(this.f5529b)});
    }
}
