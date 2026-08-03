package p089x0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: x0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1124h implements InterfaceC1119c {

    /* JADX INFO: renamed from: a */
    public final float f4334a;

    public C1124h(float r1) {
        this.f4334a = r1;
    }

    @Override // p089x0.InterfaceC1119c
    /* JADX INFO: renamed from: a */
    public final float mo2634a(RectF r2) {
        return Math.min(r2.width(), r2.height()) * this.f4334a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C1124h) == true) goto L9;
        return false;
    L9:
        if (this.f4334a != ((C1124h) r4).f4334a) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4334a)});
    }
}
