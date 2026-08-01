package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e implements de {
    public final float a;

    public e(float r1) {
        this.a = r1;
    }

    @Override // defpackage.de
    public final float a(RectF r1) {
        return this.a;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (this.a != ((e) r4).a) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
