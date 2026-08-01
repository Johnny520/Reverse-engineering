package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l00 implements de {
    public final float a;

    public l00(float r1) {
        this.a = r1;
    }

    @Override // defpackage.de
    public final float a(RectF r2) {
        return Math.min(r2.width(), r2.height()) * this.a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof l00) == true) goto L9;
        return false;
    L9:
        if (this.a != ((l00) r4).a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
