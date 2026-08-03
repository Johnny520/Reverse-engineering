package p089x0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1124h implements InterfaceC1119c {

    /* JADX INFO: renamed from: a */
    public final float f4334a;

    public C1124h(float f2) {
        this.f4334a = f2;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f4334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1124h) && this.f4334a == ((C1124h) obj).f4334a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4334a)});
    }
}
