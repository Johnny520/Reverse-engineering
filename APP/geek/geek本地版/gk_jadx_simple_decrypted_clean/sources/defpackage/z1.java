package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z1 implements de {
    public final de a;
    public final float b;

    public z1(float r2, de r3) {
    L4:
        if ((r3 instanceof z1) == false) goto L6;
        r3 = ((z1) r3).a;
        r2 = r2 + ((z1) r3).b;
        goto L4
    L6:
        this.a = r3;
        this.b = r2;
    }

    @Override // defpackage.de
    public final float a(RectF r2) {
        return Math.max(0.0f, this.a.a(r2) + this.b);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z1) == true) goto L8;
        return false;
    L8:
        z1 r52 = (z1) r5;
        if (this.a.equals(r52.a) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.b != r52.b) goto L13;
        return true;
    }

    public final int hashCode() {
        Float r0 = Float.valueOf(this.b);
        return Arrays.hashCode(new Object[]{this.a, r0});
    }
}
