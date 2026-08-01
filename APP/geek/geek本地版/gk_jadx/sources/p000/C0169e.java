package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes.dex */
public final class C0169e implements InterfaceC0148de {

    /* JADX INFO: renamed from: a */
    public final float f1658a;

    public C0169e(float f) {
        this.f1658a = f;
    }

    @Override // p000.InterfaceC0148de
    /* JADX INFO: renamed from: a */
    public final float mo940a(RectF rectF) {
        return this.f1658a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0169e) && this.f1658a == ((C0169e) obj).f1658a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1658a)});
    }
}
