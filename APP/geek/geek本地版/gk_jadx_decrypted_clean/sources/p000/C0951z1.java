package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0951z1 implements InterfaceC0148de {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0148de f5434a;

    /* JADX INFO: renamed from: b */
    public final float f5435b;

    public C0951z1(float f, InterfaceC0148de interfaceC0148de) {
        while (interfaceC0148de instanceof C0951z1) {
            interfaceC0148de = ((C0951z1) interfaceC0148de).f5434a;
            f += ((C0951z1) interfaceC0148de).f5435b;
        }
        this.f5434a = interfaceC0148de;
        this.f5435b = f;
    }

    @Override // p000.InterfaceC0148de
    /* JADX INFO: renamed from: a */
    public final float mo940a(RectF rectF) {
        return Math.max(0.0f, this.f5434a.mo940a(rectF) + this.f5435b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951z1)) {
            return false;
        }
        C0951z1 c0951z1 = (C0951z1) obj;
        return this.f5434a.equals(c0951z1.f5434a) && this.f5435b == c0951z1.f5435b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5434a, Float.valueOf(this.f5435b)});
    }
}
