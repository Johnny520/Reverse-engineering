package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class k30 extends o30 {
    public final m30 c;
    public final float d;
    public final float e;

    public k30(m30 r1, float r2, float r3) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
    }

    @Override // defpackage.o30
    public final void a(Matrix r18, d30 r19, int r20, Canvas r21) {
        m30 r4 = this.c;
        float r5 = r4.c;
        float r6 = this.e;
        float r42 = r4.b;
        float r7 = this.d;
        RectF r8 = new RectF(0.0f, 0.0f, (float) Math.hypot(r5 - r6, r42 - r7), 0.0f);
        Matrix r43 = this.a;
        r43.set(r18);
        r43.preTranslate(r7, r6);
        r43.preRotate(b());
        r19.getClass();
        r8.bottom += r20;
        r8.offset(0.0f, -r20);
        int r52 = r19.f;
        int[] r14 = d30.i;
        r14[0] = r52;
        r14[1] = r19.e;
        r14[2] = r19.d;
        Paint r1 = r19.c;
        float r10 = r8.left;
        r1.setShader(new LinearGradient(r10, r8.top, r10, r8.bottom, r14, d30.j, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r43);
        r21.drawRect(r8, r1);
        r21.restore();
    }

    public final float b() {
        m30 r0 = this.c;
        return (float) Math.toDegrees(Math.atan((r0.c - this.e) / (r0.b - this.d)));
    }
}
