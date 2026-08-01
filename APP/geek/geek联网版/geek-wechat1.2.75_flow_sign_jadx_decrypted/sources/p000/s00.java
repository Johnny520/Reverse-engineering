package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s00 implements InterfaceC0184ee {

    /* JADX INFO: renamed from: a */
    public final float f4179a;

    public s00(float f) {
        this.f4179a = f;
    }

    @Override // p000.InterfaceC0184ee
    /* JADX INFO: renamed from: a */
    public final float mo943a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f4179a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s00) && this.f4179a == ((s00) obj).f4179a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4179a)});
    }
}
