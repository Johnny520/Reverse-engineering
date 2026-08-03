package com.skyhand.hookhand.dialog.view;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.skyhand.redbookhelper.MainActivity;
import com.skyhand.redbookhelper.R;
import p001.AbstractAlertDialogC0471ya;
import p001.AlertDialogC0441w6;
import p001.C0167c4;
import p001.C0178d1;
import p001.C0237h4;
import p001.C0280k5;
import p001.C0286kb;
import p001.C0294l5;
import p001.C0341oa;
import p001.C0344p0;
import p001.C0371r1;
import p001.C0406ta;
import p001.C0433vb;
import p001.C0460y;
import p001.InterfaceC0222g3;

/* JADX INFO: loaded from: classes.dex */
public class SwitchButton extends View implements Checkable {

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final int f1244 = (int) m2(58.0f);

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static final int f1245 = (int) m2(36.0f);

    /* JADX INFO: renamed from: ۥ */
    public int f4;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f5;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1246;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public float f1247;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public float f1248;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f1249;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public float f1250;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public float f1251;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public float f1252;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public float f1253;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f1254;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public int f1255;

    /* JADX INFO: renamed from: ۥ۠ */
    public int f6;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public int f1256;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public int f1257;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public int f1258;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public float f1259;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public int f1260;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public int f1261;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public float f1262;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public float f1263;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public float f1264;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public float f1265;

    /* JADX INFO: renamed from: ۥۡ */
    public int f7;

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public int f1266;

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public float f1267;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public float f1268;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public Paint f1269;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public Paint f1270;

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public C0006e f1271;

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public C0006e f1272;

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public C0006e f1273;

    /* JADX INFO: renamed from: ۥۡۧ, reason: contains not printable characters */
    public int f1274;

    /* JADX INFO: renamed from: ۥۡۨ, reason: contains not printable characters */
    public ValueAnimator f1275;

    /* JADX INFO: renamed from: ۥۢ */
    public final ArgbEvaluator f8;

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public boolean f1276;

    /* JADX INFO: renamed from: ۥۢ۠, reason: contains not printable characters */
    public boolean f1277;

    /* JADX INFO: renamed from: ۥۢۡ, reason: contains not printable characters */
    public boolean f1278;

    /* JADX INFO: renamed from: ۥۢۢ, reason: contains not printable characters */
    public boolean f1279;

    /* JADX INFO: renamed from: ۥۣۢ, reason: contains not printable characters */
    public boolean f1280;

    /* JADX INFO: renamed from: ۥۢۤ, reason: contains not printable characters */
    public boolean f1281;

    /* JADX INFO: renamed from: ۥۢۥ, reason: contains not printable characters */
    public boolean f1282;

    /* JADX INFO: renamed from: ۥۢۦ, reason: contains not printable characters */
    public InterfaceC0005d f1283;

    /* JADX INFO: renamed from: ۥۢۧ, reason: contains not printable characters */
    public long f1284;

    /* JADX INFO: renamed from: ۥۢۨ, reason: contains not printable characters */
    public RunnableC0002a f1285;

    /* JADX INFO: renamed from: ۥۣ */
    public C0003b f9;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public C0004c f1286;

    /* JADX INFO: renamed from: com.skyhand.hookhand.dialog.view.SwitchButton$a */
    public class RunnableC0002a implements Runnable {
        public RunnableC0002a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            SwitchButton switchButton = SwitchButton.this;
            int i = SwitchButton.f1244;
            int i2 = switchButton.f1274;
            if (i2 != 0) {
                return;
            }
            if (!(i2 != 0) && switchButton.f1280) {
                if (switchButton.f1275.isRunning()) {
                    switchButton.f1275.cancel();
                }
                switchButton.f1274 = 1;
                C0006e.m4(switchButton.f1272, switchButton.f1271);
                C0006e.m4(switchButton.f1273, switchButton.f1271);
                if (switchButton.isChecked()) {
                    C0006e c0006e = switchButton.f1273;
                    int i3 = switchButton.f6;
                    c0006e.f14 = i3;
                    c0006e.f13 = switchButton.f1268;
                    c0006e.f1287 = i3;
                } else {
                    C0006e c0006e2 = switchButton.f1273;
                    c0006e2.f14 = switchButton.f1255;
                    c0006e2.f13 = switchButton.f1267;
                    c0006e2.f1288 = switchButton.f1247;
                }
                switchButton.f1275.start();
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.hookhand.dialog.view.SwitchButton$b */
    public class C0003b implements ValueAnimator.AnimatorUpdateListener {
        public C0003b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SwitchButton switchButton = SwitchButton.this;
            int i = switchButton.f1274;
            if (i == 1 || i == 3 || i == 4) {
                switchButton.f1271.f1287 = ((Integer) switchButton.f8.evaluate(fFloatValue, Integer.valueOf(switchButton.f1272.f1287), Integer.valueOf(SwitchButton.this.f1273.f1287))).intValue();
                SwitchButton switchButton2 = SwitchButton.this;
                C0006e c0006e = switchButton2.f1271;
                C0006e c0006e2 = switchButton2.f1272;
                float f = c0006e2.f1288;
                C0006e c0006e3 = switchButton2.f1273;
                c0006e.f1288 = ((c0006e3.f1288 - f) * fFloatValue) + f;
                if (switchButton2.f1274 != 1) {
                    float f2 = c0006e2.f13;
                    c0006e.f13 = ((c0006e3.f13 - f2) * fFloatValue) + f2;
                }
                c0006e.f14 = ((Integer) switchButton2.f8.evaluate(fFloatValue, Integer.valueOf(c0006e2.f14), Integer.valueOf(SwitchButton.this.f1273.f14))).intValue();
            } else if (i == 5) {
                C0006e c0006e4 = switchButton.f1271;
                float f3 = switchButton.f1272.f13;
                float f4 = ((switchButton.f1273.f13 - f3) * fFloatValue) + f3;
                c0006e4.f13 = f4;
                float f5 = switchButton.f1267;
                float f6 = (f4 - f5) / (switchButton.f1268 - f5);
                c0006e4.f14 = ((Integer) switchButton.f8.evaluate(f6, Integer.valueOf(switchButton.f1255), Integer.valueOf(SwitchButton.this.f6))).intValue();
                SwitchButton switchButton3 = SwitchButton.this;
                C0006e c0006e5 = switchButton3.f1271;
                c0006e5.f1288 = switchButton3.f1247 * f6;
                c0006e5.f1287 = ((Integer) switchButton3.f8.evaluate(f6, 0, Integer.valueOf(SwitchButton.this.f1257))).intValue();
            }
            SwitchButton.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.skyhand.hookhand.dialog.view.SwitchButton$c */
    public class C0004c implements Animator.AnimatorListener {
        public C0004c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SwitchButton switchButton = SwitchButton.this;
            int i = switchButton.f1274;
            if (i == 1) {
                switchButton.f1274 = 2;
                C0006e c0006e = switchButton.f1271;
                c0006e.f1287 = 0;
                c0006e.f1288 = switchButton.f1247;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        switchButton.f1274 = 0;
                    } else {
                        if (i != 5) {
                            return;
                        }
                        switchButton.f1276 = !switchButton.f1276;
                        switchButton.f1274 = 0;
                    }
                    switchButton.postInvalidate();
                    SwitchButton.this.m3();
                    return;
                }
                switchButton.f1274 = 0;
            }
            switchButton.postInvalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.skyhand.hookhand.dialog.view.SwitchButton$d */
    public interface InterfaceC0005d {
    }

    /* JADX INFO: renamed from: com.skyhand.hookhand.dialog.view.SwitchButton$e */
    public static class C0006e {

        /* JADX INFO: renamed from: ۥ */
        public float f13;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f14;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1287;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public float f1288;

        /* JADX INFO: renamed from: ۥ */
        public static void m4(C0006e c0006e, C0006e c0006e2) {
            c0006e.getClass();
            c0006e.f13 = c0006e2.f13;
            c0006e.f14 = c0006e2.f14;
            c0006e.f1287 = c0006e2.f1287;
            c0006e.f1288 = c0006e2.f1288;
        }
    }

    public SwitchButton(Context context) {
        super(context);
        new RectF();
        this.f1274 = 0;
        this.f8 = new ArgbEvaluator();
        this.f1280 = false;
        this.f1281 = false;
        this.f1282 = false;
        this.f1285 = new RunnableC0002a();
        this.f9 = new C0003b();
        this.f1286 = new C0004c();
        m981();
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new RectF();
        this.f1274 = 0;
        this.f8 = new ArgbEvaluator();
        this.f1280 = false;
        this.f1281 = false;
        this.f1282 = false;
        this.f1285 = new RunnableC0002a();
        this.f9 = new C0003b();
        this.f1286 = new C0004c();
        m981();
    }

    private void setCheckedViewState(C0006e c0006e) {
        c0006e.f1288 = this.f1247;
        c0006e.f14 = this.f6;
        c0006e.f1287 = this.f1257;
        c0006e.f13 = this.f1268;
        this.f1269.setColor(this.f1266);
    }

    private void setUncheckViewState(C0006e c0006e) {
        c0006e.f1288 = 0.0f;
        c0006e.f14 = this.f1255;
        c0006e.f1287 = 0;
        c0006e.f13 = this.f1267;
        this.f1269.setColor(this.f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static float m2(float f) {
        return C0167c4.m1038(1, f);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1276;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1270.setStrokeWidth(this.f1256);
        this.f1270.setStyle(Paint.Style.FILL);
        this.f1270.setColor(this.f1254);
        float f = this.f1249;
        float f2 = this.f1250;
        float f3 = this.f1251;
        float f4 = this.f1252;
        float f5 = this.f1247;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.f1270);
        this.f1270.setStyle(Paint.Style.STROKE);
        this.f1270.setColor(this.f1255);
        float f6 = this.f1249;
        float f7 = this.f1250;
        float f8 = this.f1251;
        float f9 = this.f1252;
        float f10 = this.f1247;
        canvas.drawRoundRect(f6, f7, f8, f9, f10, f10, this.f1270);
        if (this.f1279) {
            int i = this.f1260;
            float f11 = this.f1261;
            float f12 = this.f1251 - this.f1262;
            float f13 = this.f1253;
            float f14 = this.f1263;
            Paint paint = this.f1270;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i);
            paint.setStrokeWidth(f11);
            canvas.drawCircle(f12, f13, f14, paint);
        }
        float f15 = this.f1271.f1288 * 0.5f;
        this.f1270.setStyle(Paint.Style.STROKE);
        this.f1270.setColor(this.f1271.f14);
        this.f1270.setStrokeWidth((f15 * 2.0f) + this.f1256);
        float f16 = this.f1249 + f15;
        float f17 = this.f1250 + f15;
        float f18 = this.f1251 - f15;
        float f19 = this.f1252 - f15;
        float f20 = this.f1247;
        canvas.drawRoundRect(f16, f17, f18, f19, f20, f20, this.f1270);
        this.f1270.setStyle(Paint.Style.FILL);
        this.f1270.setStrokeWidth(1.0f);
        float f21 = this.f1249;
        float f22 = this.f1250;
        float f23 = this.f1247 * 2.0f;
        canvas.drawArc(f21, f22, f23 + f21, f23 + f22, 90.0f, 180.0f, true, this.f1270);
        float f24 = this.f1249;
        float f25 = this.f1247;
        float f26 = this.f1250;
        canvas.drawRect(f24 + f25, f26, this.f1271.f13, (f25 * 2.0f) + f26, this.f1270);
        if (this.f1279) {
            int i2 = this.f1271.f1287;
            float f27 = this.f1258;
            float f28 = this.f1249 + this.f1247;
            float f29 = f28 - this.f1264;
            float f30 = this.f1253;
            float f31 = this.f1259;
            Paint paint2 = this.f1270;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i2);
            paint2.setStrokeWidth(f27);
            canvas.drawLine(f29, f30 - f31, f28 - this.f1265, f30 + f31, paint2);
        }
        float f32 = this.f1271.f13;
        float f33 = this.f1253;
        canvas.drawCircle(f32, f33, this.f1248, this.f1269);
        this.f1270.setStyle(Paint.Style.STROKE);
        this.f1270.setStrokeWidth(1.0f);
        this.f1270.setColor(-2236963);
        canvas.drawCircle(f32, f33, this.f1248, this.f1270);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(f1244, 1073741824);
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(f1245, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMax = Math.max(this.f4 + this.f5, this.f1256);
        float f = i2 - fMax;
        float f2 = i - fMax;
        float f3 = (f - fMax) * 0.5f;
        this.f1247 = f3;
        this.f1248 = f3 - this.f1256;
        this.f1249 = fMax;
        this.f1250 = fMax;
        this.f1251 = f2;
        this.f1252 = f;
        this.f1253 = (f + fMax) * 0.5f;
        this.f1267 = fMax + f3;
        this.f1268 = f2 - f3;
        if (isChecked()) {
            setCheckedViewState(this.f1271);
        } else {
            setUncheckViewState(this.f1271);
        }
        this.f1281 = true;
        postInvalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1280 = true;
            this.f1284 = System.currentTimeMillis();
            removeCallbacks(this.f1285);
            postDelayed(this.f1285, 100L);
        } else if (actionMasked == 1) {
            this.f1280 = false;
            removeCallbacks(this.f1285);
            if (System.currentTimeMillis() - this.f1284 <= 300) {
                toggle();
            } else {
                int i = this.f1274;
                if (i == 2) {
                    boolean z = Math.max(0.0f, Math.min(1.0f, motionEvent.getX() / ((float) getWidth()))) > 0.5f;
                    if (z != isChecked()) {
                        this.f1276 = z;
                        if (this.f1275.isRunning()) {
                            this.f1275.cancel();
                        }
                        this.f1274 = 4;
                        C0006e.m4(this.f1272, this.f1271);
                        if (isChecked()) {
                            setCheckedViewState(this.f1273);
                        } else {
                            setUncheckViewState(this.f1273);
                        }
                        this.f1275.start();
                    }
                } else {
                    if (i == 1 || i == 3) {
                    }
                }
            }
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            int i2 = this.f1274;
            if (i2 == 1 || i2 == 3) {
                float fMax = Math.max(0.0f, Math.min(1.0f, x / getWidth()));
                C0006e c0006e = this.f1271;
                float f = this.f1267;
                c0006e.f13 = ((this.f1268 - f) * fMax) + f;
            } else {
                if (i2 == 2) {
                    float fMax2 = Math.max(0.0f, Math.min(1.0f, x / getWidth()));
                    C0006e c0006e2 = this.f1271;
                    float f2 = this.f1267;
                    c0006e2.f13 = ((this.f1268 - f2) * fMax2) + f2;
                    c0006e2.f14 = ((Integer) this.f8.evaluate(fMax2, Integer.valueOf(this.f1255), Integer.valueOf(this.f6))).intValue();
                    postInvalidate();
                }
            }
        } else if (actionMasked == 3) {
            this.f1280 = false;
            removeCallbacks(this.f1285);
            int i3 = this.f1274;
            if (i3 == 1 || i3 == 3) {
                m982();
            } else {
                if (i3 == 2) {
                }
            }
        }
        return true;
    }

    public void setCheckColor(int i) {
        this.f6 = i;
        postInvalidate();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        m983(z, this.f1277);
    }

    public void setEnableEffect(boolean z) {
        this.f1277 = z;
    }

    public void setOnCheckedChangeListener(InterfaceC0005d interfaceC0005d) {
        this.f1283 = interfaceC0005d;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(0, 0, 0, 0);
    }

    public void setShadowEffect(boolean z) {
        if (this.f1278 == z) {
            return;
        }
        this.f1278 = z;
        if (z) {
            this.f1269.setShadowLayer(this.f4, 0.0f, this.f5, this.f1246);
        } else {
            this.f1269.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    public void setShowIndicator(boolean z) {
        this.f1279 = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        m983(true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final void m3() {
        InterfaceC0005d interfaceC0005d = this.f1283;
        if (interfaceC0005d != null) {
            this.f1282 = true;
            boolean zIsChecked = isChecked();
            C0460y c0460y = (C0460y) interfaceC0005d;
            switch (c0460y.f1198) {
                case 2:
                    C0344p0 c0344p0 = (C0344p0) c0460y.f1199;
                    C0371r1 c0371r1 = (C0371r1) c0460y.f1870;
                    int i = C0371r1.f1053;
                    C0237h4.m1090(C0341oa.m915(new byte[]{66, -6, -76, 67, -64}, new byte[]{102, -109, -64, 38, -83, -59}), c0344p0);
                    C0237h4.m1090(C0341oa.m915(new byte[]{-23, 120, -108, 90, 126, -67}, new byte[]{-99, 16, -3, 41, 90, -115}), c0371r1);
                    c0344p0.f1739 = Boolean.valueOf(zIsChecked);
                    InterfaceC0222g3<Boolean, C0433vb> interfaceC0222g3 = c0344p0.f1740;
                    if (interfaceC0222g3 != null) {
                        interfaceC0222g3.mo984(Boolean.valueOf(zIsChecked));
                    }
                    if (true ^ C0406ta.m1245(c0344p0.f1018)) {
                        C0286kb c0286kb = C0178d1.f750;
                        C0178d1.b.m841().mo850(c0344p0.f1018, Boolean.valueOf(zIsChecked));
                        String str = c0344p0.f1018;
                        C0237h4.m1090(C0341oa.m915(new byte[]{7, 118, 102}, new byte[]{108, 19, 31, 116, -1, -54}), str);
                        int i2 = 0;
                        for (Object obj : c0371r1.f1054) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            if (C0237h4.m864(((C0344p0) obj).f1736, str)) {
                                c0371r1.notifyItemChanged(i2);
                            }
                            i2 = i3;
                        }
                    }
                    break;
                default:
                    SwitchButton switchButton = (SwitchButton) c0460y.f1199;
                    MainActivity mainActivity = (MainActivity) c0460y.f1870;
                    C0286kb c0286kb2 = MainActivity.f1289;
                    C0237h4.m1090(C0341oa.m915(new byte[]{27, -119, 41, 58, 13, -82}, new byte[]{111, -31, 64, 73, 41, -98}), mainActivity);
                    if (switchButton.isChecked()) {
                        String strM915 = C0341oa.m915(new byte[]{-66, 17, 55, -46, -41, 91, -65, 18, 13, -45, -6, 106}, new byte[]{89, -99, -99, 52, 94, -48});
                        String string = mainActivity.getString(R.string.icon_hide_tip);
                        C0237h4.m1089(C0341oa.m915(new byte[]{-17, -53, -77, 104, 15, 60, -31, -64, -96, 19, 85, 96, -90, -121}, new byte[]{-120, -82, -57, 59, 123, 78}), string);
                        AlertDialogC0441w6 alertDialogC0441w6 = new AlertDialogC0441w6(mainActivity, strM915, string);
                        alertDialogC0441w6.m1083(new C0280k5(mainActivity));
                        alertDialogC0441w6.m1081(new C0294l5(switchButton));
                        alertDialogC0441w6.show();
                    } else {
                        mainActivity.m5(false);
                    }
                    break;
            }
        }
        this.f1282 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m981() {
        this.f1278 = false;
        this.f1260 = -5592406;
        this.f1261 = (int) m2(1.5f);
        this.f1262 = m2(10.0f);
        this.f1263 = m2(4.0f);
        this.f1264 = m2(4.0f);
        this.f1265 = m2(4.0f);
        this.f4 = (int) m2(5.0f);
        this.f5 = (int) m2(1.5f);
        this.f1246 = 855638016;
        this.f1255 = -2236963;
        this.f6 = AbstractAlertDialogC0471ya.f1882;
        this.f1256 = (int) m2(1.0f);
        this.f1257 = -1;
        this.f1258 = (int) m2(1.0f);
        this.f1259 = m2(6.0f);
        this.f7 = -1;
        this.f1266 = -1;
        this.f1276 = false;
        this.f1279 = false;
        this.f1254 = -1;
        this.f1277 = true;
        this.f1270 = new Paint(1);
        Paint paint = new Paint(1);
        this.f1269 = paint;
        paint.setColor(-1);
        if (this.f1278) {
            this.f1269.setShadowLayer(this.f4, 0.0f, this.f5, this.f1246);
        }
        this.f1271 = new C0006e();
        this.f1272 = new C0006e();
        this.f1273 = new C0006e();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1275 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200);
        this.f1275.setRepeatCount(0);
        this.f1275.addUpdateListener(this.f9);
        this.f1275.addListener(this.f1286);
        super.setClickable(true);
        setPadding(0, 0, 0, 0);
        setLayerType(1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m982() {
        int i = this.f1274;
        boolean z = true;
        if (!(i == 2)) {
            if (i != 1 && i != 3) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if (this.f1275.isRunning()) {
            this.f1275.cancel();
        }
        this.f1274 = 3;
        C0006e.m4(this.f1272, this.f1271);
        if (isChecked()) {
            setCheckedViewState(this.f1273);
        } else {
            setUncheckViewState(this.f1273);
        }
        this.f1275.start();
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void m983(boolean z, boolean z2) {
        if (isEnabled()) {
            if (this.f1282) {
                throw new RuntimeException("should NOT switch the state in method: [onCheckedChanged]!");
            }
            if (!this.f1281) {
                this.f1276 = !this.f1276;
                if (z2) {
                    m3();
                    return;
                }
                return;
            }
            if (this.f1275.isRunning()) {
                this.f1275.cancel();
            }
            if (this.f1277 && z) {
                this.f1274 = 5;
                C0006e.m4(this.f1272, this.f1271);
                if (isChecked()) {
                    setUncheckViewState(this.f1273);
                } else {
                    setCheckedViewState(this.f1273);
                }
                this.f1275.start();
                return;
            }
            this.f1276 = !this.f1276;
            if (isChecked()) {
                setCheckedViewState(this.f1271);
            } else {
                setUncheckViewState(this.f1271);
            }
            postInvalidate();
            if (z2) {
                m3();
            }
        }
    }
}
