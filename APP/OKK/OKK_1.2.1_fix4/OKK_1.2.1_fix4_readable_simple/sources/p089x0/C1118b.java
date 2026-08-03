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

    public C1118b(float r2, InterfaceC1119c r3) {
    L4:
        if ((r3 instanceof C1118b) == false) goto L6;
        r3 = ((C1118b) r3).f4284a;
        r2 = r2 + ((C1118b) r3).f4285b;
        goto L4
    L6:
        this.f4284a = r3;
        this.f4285b = r2;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF r2) {
        return Math.max(0.0f, this.f4284a.mo2634a(r2) + this.f4285b);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1118b) == true) goto L8;
        return false;
    L8:
        C1118b r52 = (C1118b) r5;
        InterfaceC1119c r1 = r52.f4284a;
        if (this.f4284a.equals(r1) == false) goto L14;
        if (this.f4285b != r52.f4285b) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        Float r02 = Float.valueOf(this.f4285b);
        return Arrays.hashCode(new Object[]{this.f4284a, r02});
    }
}
