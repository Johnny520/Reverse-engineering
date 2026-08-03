package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes.dex */
public final class C2436r implements InterfaceC1006Xb {

    /* JADX INFO: renamed from: a */
    public final float f8544a;

    public C2436r(float f) {
        this.f8544a = f;
    }

    @Override // p000.InterfaceC1006Xb
    /* JADX INFO: renamed from: a */
    public final float mo1563a(RectF rectF) {
        return this.f8544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2436r) && this.f8544a == ((C2436r) obj).f8544a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8544a)});
    }

    public final String toString() {
        return this.f8544a + "px";
    }
}
