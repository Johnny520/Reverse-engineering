package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public abstract class o30 {
    public static final Matrix b = null;
    public final Matrix a;

    static {
        b = new Matrix();
    }

    public o30() {
        this.a = new Matrix();
    }

    public abstract void a(Matrix r1, d30 r2, int r3, Canvas r4);
}
