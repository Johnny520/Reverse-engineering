package p089x0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1131o extends AbstractC1136t {

    /* JADX INFO: renamed from: c */
    public final C1133q f4374c;

    public C1131o(C1133q r1) {
        this.f4374c = r1;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix r20, C1116a r21, int r22, Canvas r23) {
        C1133q r2 = this.f4374c;
        float r3 = r2.f4383f;
        float r4 = r2.f4384g;
        RectF r5 = new RectF(r2.f4379b, r2.f4380c, r2.f4381d, r2.f4382e);
        r21.getClass();
        if (r4 >= 0.0f) goto L5;
        boolean r8 = true;
    L6:
        Path r11 = r21.f4281g;
        int[] r16 = C1116a.f4273k;
        if (r8 == false) goto L9;
        r16[0] = 0;
        r16[1] = r21.f4280f;
        r16[2] = r21.f4279e;
        r16[3] = r21.f4278d;
    L10:
        float r15 = r5.width() / 2.0f;
        if (r15 <= 0.0f) goto L18;
        float r1 = 1.0f - (r22 / r15);
        float[] r17 = C1116a.f4274l;
        r17[1] = r1;
        r17[2] = ((1.0f - r1) / 2.0f) + r1;
        RadialGradient r12 = new RadialGradient(r5.centerX(), r5.centerY(), r15, r16, r17, Shader.TileMode.CLAMP);
        Paint r9 = r21.f4276b;
        r9.setShader(r12);
        r23.save();
        r23.concat(r20);
        r23.scale(1.0f, r5.height() / r5.width());
        if (r8 == true) goto L16;
        r23.clipPath(r11, Region.Op.DIFFERENCE);
        r23.drawPath(r11, r21.f4282h);
    L16:
        r23.drawArc(r5, r3, r4, true, r9);
        r23.restore();
        return;
    L18:
        return;
    L9:
        r11.rewind();
        r11.moveTo(r5.centerX(), r5.centerY());
        r11.arcTo(r5, r3, r4);
        r11.close();
        float r14 = -r22;
        r5.inset(r14, r14);
        r16[0] = 0;
        r16[1] = r21.f4278d;
        r16[2] = r21.f4279e;
        r16[3] = r21.f4280f;
        goto L10
    L5:
        r8 = false;
        goto L6
    }
}
