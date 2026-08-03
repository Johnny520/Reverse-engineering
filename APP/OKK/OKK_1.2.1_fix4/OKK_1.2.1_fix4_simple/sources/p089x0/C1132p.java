package p089x0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1132p extends AbstractC1136t {

    /* JADX INFO: renamed from: c */
    public final C1134r f4375c;

    /* JADX INFO: renamed from: d */
    public final float f4376d;

    /* JADX INFO: renamed from: e */
    public final float f4377e;

    public C1132p(C1134r r1, float r2, float r3) {
        this.f4375c = r1;
        this.f4376d = r2;
        this.f4377e = r3;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix r18, C1116a r19, int r20, Canvas r21) {
        C1134r r4 = this.f4375c;
        float r5 = r4.f4386c;
        float r6 = this.f4377e;
        float r42 = r4.f4385b;
        float r7 = this.f4376d;
        RectF r8 = new RectF(0.0f, 0.0f, (float) Math.hypot(r5 - r6, r42 - r7), 0.0f);
        Matrix r43 = this.f4389a;
        r43.set(r18);
        r43.preTranslate(r7, r6);
        r43.preRotate(m2664b());
        r19.getClass();
        r8.bottom += r20;
        r8.offset(0.0f, -r20);
        int[] r14 = C1116a.f4271i;
        r14[0] = r19.f4280f;
        r14[1] = r19.f4279e;
        r14[2] = r19.f4278d;
        Paint r1 = r19.f4277c;
        float r12 = r8.left;
        r1.setShader(new LinearGradient(r12, r8.top, r12, r8.bottom, r14, C1116a.f4272j, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r43);
        r21.drawRect(r8, r1);
        r21.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m2664b() {
        C1134r r02 = this.f4375c;
        return (float) Math.toDegrees(Math.atan((r02.f4386c - this.f4377e) / (r02.f4385b - this.f4376d)));
    }
}
