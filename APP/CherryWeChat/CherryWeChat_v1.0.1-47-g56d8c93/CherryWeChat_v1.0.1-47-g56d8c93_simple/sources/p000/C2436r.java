package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public final class C2436r implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f8544a;

    public C2436r(float r1) {
        this.f8544a = r1;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF r1) {
        return this.f8544a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2436r) == true) goto L9;
        return false;
    L9:
        if (this.f8544a != ((C2436r) r4).f8544a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8544a)});
    }

    public final String toString() {
        return this.f8544a + "px";
    }
}
