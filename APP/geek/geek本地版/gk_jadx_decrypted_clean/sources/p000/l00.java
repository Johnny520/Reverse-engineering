package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements InterfaceC0148de {

    /* JADX INFO: renamed from: a */
    public final float f2981a;

    public l00(float f) {
        this.f2981a = f;
    }

    @Override // p000.InterfaceC0148de
    /* JADX INFO: renamed from: a */
    public final float mo940a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2981a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l00) && this.f2981a == ((l00) obj).f2981a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2981a)});
    }
}
