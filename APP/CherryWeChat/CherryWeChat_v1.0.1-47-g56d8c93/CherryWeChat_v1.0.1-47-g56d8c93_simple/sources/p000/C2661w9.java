package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2661w9 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final LinearInterpolator f9204g = null;

    /* JADX INFO: renamed from: h */
    public static final C1370eh f9205h = null;

    /* JADX INFO: renamed from: i */
    public static final int[] f9206i = null;

    /* JADX INFO: renamed from: a */
    public final C2618v9 f9207a;

    /* JADX INFO: renamed from: b */
    public float f9208b;

    /* JADX INFO: renamed from: c */
    public final Resources f9209c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f9210d;

    /* JADX INFO: renamed from: e */
    public float f9211e;

    /* JADX INFO: renamed from: f */
    public boolean f9212f;

    static {
        f9204g = new LinearInterpolator();
        f9205h = new C1370eh(1);
        f9206i = new int[]{-16777216};
    }

    public C2661w9(Context r3) {
        r3.getClass();
        this.f9209c = r3.getResources();
        C2618v9 r32 = new C2618v9();
        this.f9207a = r32;
        r32.f9082i = f9206i;
        r32.m5129a(0);
        r32.f9081h = 2.5f;
        r32.f9075b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r0.addUpdateListener(new C2532t9(this, r32));
        r0.setRepeatCount(-1);
        r0.setRepeatMode(1);
        r0.setInterpolator(f9204g);
        r0.addListener(new C2575u9(this, r32));
        this.f9210d = r0;
    }

    /* JADX INFO: renamed from: d */
    public static void m5224d(float r8, C2618v9 r9) {
        if (r8 <= 0.75f) goto L6;
        float r82 = (r8 - 0.75f) / 0.25f;
        int[] r0 = r9.f9082i;
        int r1 = r9.f9083j;
        int r2 = r0[r1];
        int r02 = r0[(r1 + 1) % r0.length];
        int r5 = (r02 >> 24) & 255;
        int r6 = (r02 >> 16) & 255;
        int r7 = (r02 >> 8) & 255;
        r9.f9094u = ((((((r2 >> 24) & 255) + ((int) ((r5 - r1) * r82))) << 24) | ((((r2 >> 16) & 255) + ((int) ((r6 - r3) * r82))) << 16)) | ((((r2 >> 8) & 255) + ((int) ((r7 - r4) * r82))) << 8)) | ((r2 & 255) + ((int) (r82 * ((r02 & 255) - r2))));
        return;
    L6:
        r9.f9094u = r9.f9082i[r9.f9083j];
    }

    /* JADX INFO: renamed from: a */
    public final void m5225a(float r8, C2618v9 r9, boolean r10) {
        if (this.f9212f == false) goto L7;
        m5224d(r8, r9);
        float r102 = (float) (Math.floor(r9.f9086m / 0.8f) + 1.0d);
        float r0 = r9.f9084k;
        float r2 = r9.f9085l;
        r9.f9078e = (((r2 - 0.01f) - r0) * r8) + r0;
        r9.f9079f = r2;
        float r02 = r9.f9086m;
        r9.f9080g = ((r102 - r02) * r8) + r02;
        return;
    L7:
        if (r8 != 1.0f) goto L11;
        if (r10 == true) goto L11;
        return;
    L11:
        float r103 = r9.f9086m;
        C1370eh r4 = f9205h;
        if (r8 >= 0.5f) goto L14;
        float r22 = r9.f9084k;
        float r03 = ((r4.getInterpolation(r8 / 0.5f) * 0.79f) + 0.01f) + r22;
    L15:
        float r1 = (0.20999998f * r8) + r103;
        float r82 = (r8 + this.f9211e) * 216.0f;
        r9.f9078e = r22;
        r9.f9079f = r03;
        r9.f9080g = r1;
        this.f9208b = r82;
        return;
    L14:
        float r23 = r9.f9084k + 0.79f;
        r22 = r23 - (((1.0f - r4.getInterpolation((r8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        r03 = r23;
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public final void m5226b(float r4, float r5, float r6, float r7) {
        float r0 = this.f9209c.getDisplayMetrics().density;
        float r52 = r5 * r0;
        C2618v9 r1 = this.f9207a;
        r1.f9081h = r52;
        r1.f9075b.setStrokeWidth(r52);
        r1.f9090q = r4 * r0;
        r1.m5129a(0);
        r1.f9091r = (int) (r6 * r0);
        r1.f9092s = (int) (r7 * r0);
    }

    /* JADX INFO: renamed from: c */
    public final void m5227c(int r4) {
        if (r4 != 0) goto L4;
        m5226b(11.0f, 3.0f, 12.0f, 6.0f);
    L5:
        invalidateSelf();
        return;
    L4:
        m5226b(7.5f, 2.5f, 10.0f, 5.0f);
        goto L5
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r13) {
        Rect r0 = getBounds();
        r13.save();
        r13.rotate(this.f9208b, r0.exactCenterX(), r0.exactCenterY());
        C2618v9 r1 = this.f9207a;
        Paint r7 = r1.f9075b;
        RectF r3 = r1.f9074a;
        float r2 = r1.f9090q;
        float r4 = (r1.f9081h / 2.0f) + r2;
        if (r2 > 0.0f) goto L5;
        r4 = (Math.min(r0.width(), r0.height()) / 2.0f) - Math.max((r1.f9091r * r1.f9089p) / 2.0f, r1.f9081h / 2.0f);
    L5:
        r3.set(r0.centerX() - r4, r0.centerY() - r4, r0.centerX() + r4, r0.centerY() + r4);
        float r02 = r1.f9078e;
        float r22 = r1.f9080g;
        float r03 = (r02 + r22) * 360.0f;
        float r5 = ((r1.f9079f + r22) * 360.0f) - r03;
        r7.setColor(r1.f9094u);
        r7.setAlpha(r1.f9093t);
        float r23 = r1.f9081h / 2.0f;
        r3.inset(r23, r23);
        r13.drawCircle(r3.centerX(), r3.centerY(), r3.width() / 2.0f, r1.f9077d);
        float r24 = -r23;
        r3.inset(r24, r24);
        r13.drawArc(r3, r03, r5, false, r7);
        Paint r132 = r1.f9076c;
        if (r1.f9087n == false) goto L12;
        Path r04 = r1.f9088o;
        if (r04 != null) goto L10;
        Path r05 = new Path();
        r1.f9088o = r05;
        r05.setFillType(Path.FillType.EVEN_ODD);
    L11:
        float r06 = Math.min(r3.width(), r3.height()) / 2.0f;
        float r6 = (r1.f9091r * r1.f9089p) / 2.0f;
        r1.f9088o.moveTo(0.0f, 0.0f);
        r1.f9088o.lineTo(r1.f9091r * r1.f9089p, 0.0f);
        Path r72 = r1.f9088o;
        float r9 = r1.f9091r;
        float r10 = r1.f9089p;
        r72.lineTo((r9 * r10) / 2.0f, r1.f9092s * r10);
        r1.f9088o.offset((r3.centerX() + r06) - r6, (r1.f9081h / 2.0f) + r3.centerY());
        r1.f9088o.close();
        r132.setColor(r1.f9094u);
        r132.setAlpha(r1.f9093t);
        r13.save();
        r13.rotate(r03 + r5, r3.centerX(), r3.centerY());
        r13.drawPath(r1.f9088o, r132);
        r13.restore();
        goto L12
    L10:
        r04.reset();
    L12:
        r13.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9207a.f9093t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9210d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.f9207a.f9093t = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.f9207a.f9075b.setColorFilter(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9210d.cancel();
        C2618v9 r0 = this.f9207a;
        float r1 = r0.f9078e;
        r0.f9084k = r1;
        float r2 = r0.f9079f;
        r0.f9085l = r2;
        r0.f9086m = r0.f9080g;
        if (r2 == r1) goto L6;
        this.f9212f = true;
        this.f9210d.setDuration(666);
        this.f9210d.start();
        return;
    L6:
        r0.m5129a(0);
        r0.f9084k = 0.0f;
        r0.f9085l = 0.0f;
        r0.f9086m = 0.0f;
        r0.f9078e = 0.0f;
        r0.f9079f = 0.0f;
        r0.f9080g = 0.0f;
        this.f9210d.setDuration(1332);
        this.f9210d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9210d.cancel();
        this.f9208b = 0.0f;
        C2618v9 r1 = this.f9207a;
        if (r1.f9087n == false) goto L5;
        r1.f9087n = false;
    L5:
        r1.m5129a(0);
        r1.f9084k = 0.0f;
        r1.f9085l = 0.0f;
        r1.f9086m = 0.0f;
        r1.f9078e = 0.0f;
        r1.f9079f = 0.0f;
        r1.f9080g = 0.0f;
        invalidateSelf();
    }
}
