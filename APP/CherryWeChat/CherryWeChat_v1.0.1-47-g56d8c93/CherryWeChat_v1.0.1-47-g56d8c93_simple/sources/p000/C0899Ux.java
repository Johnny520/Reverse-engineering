package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: Ux */
/* JADX INFO: loaded from: classes.dex */
public final class C0899Ux extends AbstractC1114Zx {

    /* JADX INFO: renamed from: c */
    public final C0985Wx f2795c;

    public C0899Ux(C0985Wx r1) {
        this.f2795c = r1;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix r23, C0642Ox r24, int r25, Canvas r26) {
        C0985Wx r4 = this.f2795c;
        float r5 = r4.f3099f;
        float r6 = r4.f3100g;
        RectF r7 = new RectF(r4.f3095b, r4.f3096c, r4.f3097d, r4.f3098e);
        Paint r8 = r24.f2055b;
        if (r6 >= 0.0f) goto L5;
        boolean r9 = true;
    L6:
        Path r12 = r24.f2060g;
        int[] r19 = C0642Ox.f2052k;
        if (r9 == false) goto L9;
        r19[0] = 0;
        r19[1] = r24.f2059f;
        r19[2] = r24.f2058e;
        r19[3] = r24.f2057d;
        float r16 = 0.0f;
    L10:
        float r18 = r7.width() / 2.0f;
        if (r18 > r16) goto L13;
        return;
    L13:
        float r1 = 1.0f - (r25 / r18);
        float[] r20 = C0642Ox.f2053l;
        r20[1] = r1;
        r20[2] = ((1.0f - r1) / 2.0f) + r1;
        r8.setShader(new RadialGradient(r7.centerX(), r7.centerY(), r18, r19, r20, Shader.TileMode.CLAMP));
        r26.save();
        r26.concat(r23);
        r26.scale(1.0f, r7.height() / r7.width());
        if (r9 == true) goto L16;
        r26.clipPath(r12, Region.Op.DIFFERENCE);
        r26.drawPath(r12, r24.f2061h);
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
        r19[1] = r24.f2057d;
        r19[2] = r24.f2058e;
        r19[3] = r24.f2059f;
        goto L10
    L5:
        r9 = false;
        goto L6
    }
}
