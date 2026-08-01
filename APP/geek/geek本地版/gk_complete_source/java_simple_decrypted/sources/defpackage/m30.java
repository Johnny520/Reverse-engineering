package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends n30 {
    public float b;
    public float c;

    @Override // defpackage.n30
    public final void a(Matrix r3, Path r4) {
        Matrix r0 = this.a;
        r3.invert(r0);
        r4.transform(r0);
        r4.lineTo(this.b, this.c);
        r4.transform(r3);
    }
}
