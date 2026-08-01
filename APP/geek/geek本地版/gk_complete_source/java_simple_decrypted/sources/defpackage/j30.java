package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class j30 extends o30 {
    public final l30 c;

    public j30(l30 r1) {
        this.c = r1;
    }

    @Override // defpackage.o30
    public final void a(Matrix r23, d30 r24, int r25, Canvas r26) {
        l30 r4 = this.c;
        float r5 = r4.f;
        float r6 = r4.g;
        RectF r7 = new RectF(r4.b, r4.c, r4.d, r4.e);
        Paint r8 = r24.b;
        if (r6 >= 0.0f) goto L5;
        boolean r9 = true;
    L6:
        Path r12 = r24.g;
        int[] r19 = d30.k;
        if (r9 == false) goto L9;
        r19[0] = 0;
        r19[1] = r24.f;
        r19[2] = r24.e;
        r19[3] = r24.d;
        float r16 = 0.0f;
    L10:
        float r18 = r7.width() / 2.0f;
        if (r18 > r16) goto L13;
        return;
    L13:
        float r1 = 1.0f - (r25 / r18);
        float[] r20 = d30.l;
        r20[1] = r1;
        r20[2] = ((1.0f - r1) / 2.0f) + r1;
        r8.setShader(new RadialGradient(r7.centerX(), r7.centerY(), r18, r19, r20, Shader.TileMode.CLAMP));
        r26.save();
        r26.concat(r23);
        r26.scale(1.0f, r7.height() / r7.width());
        if (r9 == true) goto L16;
        r26.clipPath(r12, Region.Op.DIFFERENCE);
        r26.drawPath(r12, r24.h);
    L16:
        r26.drawArc(r7, r5, r6, true, r8);
        r26.restore();
        return;
    L9:
        r12.rewind();
        r16 = 0.0f;
        r12.moveTo(r7.centerX(), r7.centerY());
        r12.arcTo(r7, r5, r6);
        r12.close();
        float r42 = -r25;
        r7.inset(r42, r42);
        r19[0] = 0;
        r19[1] = r24.d;
        r19[2] = r24.e;
        r19[3] = r24.f;
        goto L10
    L5:
        r9 = false;
        goto L6
    }
}
