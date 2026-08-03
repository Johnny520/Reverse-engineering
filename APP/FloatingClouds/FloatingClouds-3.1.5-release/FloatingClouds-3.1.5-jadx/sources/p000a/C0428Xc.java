package p000a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: a.Xc */
/* JADX INFO: loaded from: classes.dex */
public final class C0428Xc implements InterfaceC0892w4 {

    /* JADX INFO: renamed from: a */
    public final float f1606a;

    public C0428Xc(float f) {
        this.f1606a = f;
    }

    @Override // p000a.InterfaceC0892w4
    /* JADX INFO: renamed from: a */
    public final float mo1073a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0428Xc) && this.f1606a == ((C0428Xc) obj).f1606a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1606a)});
    }
}
