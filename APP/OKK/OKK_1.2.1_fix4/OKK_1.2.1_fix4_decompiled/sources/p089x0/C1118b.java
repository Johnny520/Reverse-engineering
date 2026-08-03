package p089x0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1118b implements InterfaceC1119c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1119c f4284a;

    /* JADX INFO: renamed from: b */
    public final float f4285b;

    public C1118b(float f2, InterfaceC1119c interfaceC1119c) {
        while (interfaceC1119c instanceof C1118b) {
            interfaceC1119c = ((C1118b) interfaceC1119c).f4284a;
            f2 += ((C1118b) interfaceC1119c).f4285b;
        }
        this.f4284a = interfaceC1119c;
        this.f4285b = f2;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF rectF) {
        return Math.max(0.0f, this.f4284a.mo2634a(rectF) + this.f4285b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118b)) {
            return false;
        }
        C1118b c1118b = (C1118b) obj;
        return this.f4284a.equals(c1118b.f4284a) && this.f4285b == c1118b.f4285b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4284a, Float.valueOf(this.f4285b)});
    }
}
