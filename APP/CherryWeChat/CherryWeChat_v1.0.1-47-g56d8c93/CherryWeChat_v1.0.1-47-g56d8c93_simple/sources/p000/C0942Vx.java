package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: Vx */
/* JADX INFO: loaded from: classes.dex */
public final class C0942Vx extends AbstractC1114Zx {

    /* JADX INFO: renamed from: c */
    public final C1028Xx f2961c;

    /* JADX INFO: renamed from: d */
    public final float f2962d;

    /* JADX INFO: renamed from: e */
    public final float f2963e;

    public C0942Vx(C1028Xx r1, float r2, float r3) {
        this.f2961c = r1;
        this.f2962d = r2;
        this.f2963e = r3;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix r18, C0642Ox r19, int r20, Canvas r21) {
        C1028Xx r4 = this.f2961c;
        float r5 = r4.f3274c;
        float r6 = this.f2963e;
        float r42 = r4.f3273b;
        float r7 = this.f2962d;
        RectF r8 = new RectF(0.0f, 0.0f, (float) Math.hypot(r5 - r6, r42 - r7), 0.0f);
        Matrix r43 = this.f3515a;
        r43.set(r18);
        r43.preTranslate(r7, r6);
        r43.preRotate(m1798b());
        r19.getClass();
        r8.bottom += r20;
        r8.offset(0.0f, -r20);
        int r52 = r19.f2059f;
        int[] r14 = C0642Ox.f2050i;
        r14[0] = r52;
        r14[1] = r19.f2058e;
        r14[2] = r19.f2057d;
        Paint r1 = r19.f2056c;
        float r10 = r8.left;
        r1.setShader(new LinearGradient(r10, r8.top, r10, r8.bottom, r14, C0642Ox.f2051j, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r43);
        r21.drawRect(r8, r1);
        r21.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m1798b() {
        C1028Xx r0 = this.f2961c;
        return (float) Math.toDegrees(Math.atan((r0.f3274c - this.f2963e) / (r0.f3273b - this.f2962d)));
    }
}
