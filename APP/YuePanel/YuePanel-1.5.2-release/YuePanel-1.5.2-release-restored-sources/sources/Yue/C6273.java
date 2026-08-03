package Yue;

import Yue.C4125;
import Yue.C4128;
import Yue.C6283;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.AbstractC8767;
import androidx.constraintlayout.widget.C1642;
import androidx.constraintlayout.widget.C8768;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.C8774;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.C8790;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6273 extends ConstraintLayout implements InterfaceC6368 {

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final int f15602 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final int f15603 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final int f15604 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final int f15605 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final int f15606 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int f15607 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String f15608 = "MotionLayout";

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final boolean f15609 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static boolean f15610 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final int f15611 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final int f15612 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final int f15613 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f15614 = 50;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final int f15615 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final int f15616 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final int f15617 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final int f15618 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final float f15619 = 1.0E-5f;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C6283 f15620;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Interpolator f15621;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float f15622;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f15623;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f15624;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f15625;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f15626;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f15627;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f15628;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public HashMap<View, C6269> f15629;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public long f15630;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f15631;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public float f15632;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f15633;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public long f15634;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f15635;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f15636;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f15637;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean f15638;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public InterfaceC6280 f15639;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f15640;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f15641;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f15642;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C6275 f15643;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean f15644;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C7598 f15645;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public C6274 f15646;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C4375 f15647;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean f15648;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f15649;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f15650;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f15651;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f15652;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public boolean f15653;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public float f15654;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public float f15655;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public long f15656;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public float f15657;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean f15658;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public ArrayList<C6271> f15659;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public ArrayList<C6271> f15660;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public ArrayList<InterfaceC6280> f15661;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public int f15662;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public long f15663;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public float f15664;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public int f15665;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public float f15666;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public boolean f15667;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public boolean f15668;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public int f15669;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public int f15670;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public int f15671;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public int f15672;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public int f15673;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public int f15674;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public float f15675;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public C5618 f15676;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean f15677;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public C6279 f15678;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public EnumC6281 f15679;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public C6276 f15680;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public boolean f15681;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public RectF f15682;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public View f15683;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public ArrayList<Integer> f15684;

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ */
    public class RunnableC0949 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f15685;

        public RunnableC0949(View view) {
            this.f15685 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15685.setNestedScrollingEnabled(true);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟ */
    public static /* synthetic */ class C0950 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1960;

        static {
            int[] iArr = new int[EnumC6281.values().length];
            f1960 = iArr;
            try {
                iArr[EnumC6281.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1960[EnumC6281.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1960[EnumC6281.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1960[EnumC6281.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟, reason: contains not printable characters */
    public class C6274 extends AbstractInterpolatorC6272 {

        /* JADX INFO: renamed from: ۥ */
        public float f1961 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f1962 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f15687;

        public C6274() {
        }

        @Override // Yue.AbstractInterpolatorC6272, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1961;
            if (f4 > 0.0f) {
                float f5 = this.f15687;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                C6273.this.f15622 = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f1962;
            } else {
                float f6 = this.f15687;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                C6273.this.f15622 = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f1962;
            }
            return f2 + f3;
        }

        @Override // Yue.AbstractInterpolatorC6272
        /* JADX INFO: renamed from: ۥ */
        public float mo2742() {
            return C6273.this.f15622;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m2743(float f, float f2, float f3) {
            this.f1961 = f;
            this.f1962 = f2;
            this.f15687 = f3;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟, reason: contains not printable characters */
    public class C6275 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final int f15689 = 16;

        /* JADX INFO: renamed from: ۥ */
        public float[] f1963;

        /* JADX INFO: renamed from: ۥ۟ */
        public int[] f1964;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float[] f15690;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Path f15691;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Paint f15692;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Paint f15693;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Paint f15694;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Paint f15695;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Paint f15696;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float[] f15697;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public DashPathEffect f15703;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f15704;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f15707;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final int f15698 = -21965;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final int f15699 = -2067046;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final int f15700 = -13391360;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final int f15701 = 1996488704;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final int f15702 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public Rect f15705 = new Rect();

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean f15706 = false;

        public C6275() {
            this.f15707 = 1;
            Paint paint = new Paint();
            this.f15692 = paint;
            paint.setAntiAlias(true);
            this.f15692.setColor(-21965);
            this.f15692.setStrokeWidth(2.0f);
            Paint paint2 = this.f15692;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f15693 = paint3;
            paint3.setAntiAlias(true);
            this.f15693.setColor(-2067046);
            this.f15693.setStrokeWidth(2.0f);
            this.f15693.setStyle(style);
            Paint paint4 = new Paint();
            this.f15694 = paint4;
            paint4.setAntiAlias(true);
            this.f15694.setColor(-13391360);
            this.f15694.setStrokeWidth(2.0f);
            this.f15694.setStyle(style);
            Paint paint5 = new Paint();
            this.f15695 = paint5;
            paint5.setAntiAlias(true);
            this.f15695.setColor(-13391360);
            this.f15695.setTextSize(C6273.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f15697 = new float[8];
            Paint paint6 = new Paint();
            this.f15696 = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f15703 = dashPathEffect;
            this.f15694.setPathEffect(dashPathEffect);
            this.f15690 = new float[100];
            this.f1964 = new int[50];
            if (this.f15706) {
                this.f15692.setStrokeWidth(8.0f);
                this.f15696.setStrokeWidth(8.0f);
                this.f15693.setStrokeWidth(8.0f);
                this.f15707 = 4;
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2744(Canvas canvas, HashMap<View, C6269> map, int i, int i2) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!C6273.this.isInEditMode() && (i2 & 1) == 2) {
                String str = C6273.this.getContext().getResources().getResourceName(C6273.this.f15625) + ":" + C6273.this.getProgress();
                canvas.drawText(str, 10.0f, C6273.this.getHeight() - 30, this.f15695);
                canvas.drawText(str, 11.0f, C6273.this.getHeight() - 29, this.f15692);
            }
            for (C6269 c6269 : map.values()) {
                int iM19318 = c6269.m19318();
                if (i2 > 0 && iM19318 == 0) {
                    iM19318 = 1;
                }
                if (iM19318 != 0) {
                    this.f15704 = c6269.m19311(this.f15690, this.f1964);
                    if (iM19318 >= 1) {
                        int i3 = i / 16;
                        float[] fArr = this.f1963;
                        if (fArr == null || fArr.length != i3 * 2) {
                            this.f1963 = new float[i3 * 2];
                            this.f15691 = new Path();
                        }
                        int i4 = this.f15707;
                        canvas.translate(i4, i4);
                        this.f15692.setColor(1996488704);
                        this.f15696.setColor(1996488704);
                        this.f15693.setColor(1996488704);
                        this.f15694.setColor(1996488704);
                        c6269.m19312(this.f1963, i3);
                        m2745(canvas, iM19318, this.f15704, c6269);
                        this.f15692.setColor(-21965);
                        this.f15693.setColor(-2067046);
                        this.f15696.setColor(-2067046);
                        this.f15694.setColor(-13391360);
                        int i5 = this.f15707;
                        canvas.translate(-i5, -i5);
                        m2745(canvas, iM19318, this.f15704, c6269);
                        if (iM19318 == 5) {
                            m19427(canvas, c6269);
                        }
                    }
                }
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m2745(Canvas canvas, int i, int i2, C6269 c6269) {
            if (i == 4) {
                m19421(canvas);
            }
            if (i == 2) {
                m19424(canvas);
            }
            if (i == 3) {
                m19422(canvas);
            }
            m19420(canvas);
            m19428(canvas, i, i2, c6269);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m19420(Canvas canvas) {
            canvas.drawLines(this.f1963, this.f15692);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m19421(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f15704; i++) {
                int i2 = this.f1964[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                m19424(canvas);
            }
            if (z2) {
                m19422(canvas);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m19422(Canvas canvas) {
            float[] fArr = this.f1963;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f15694);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f15694);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m19423(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1963;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            m19430(str, this.f15695);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f15705.width() / 2)) + fMin, f2 - 20.0f, this.f15695);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f15694);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            m19430(str2, this.f15695);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f15705.height() / 2)), this.f15695);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f15694);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m19424(Canvas canvas) {
            float[] fArr = this.f1963;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f15694);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m19425(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1963;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m19430(str, this.f15695);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f15705.width() / 2), -20.0f, this.f15695);
            canvas.drawLine(f, f2, f10, f11, this.f15694);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m19426(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) (((double) (((f - (i / 2)) * 100.0f) / (C6273.this.getWidth() - i))) + 0.5d)) / 100.0f);
            m19430(str, this.f15695);
            canvas.drawText(str, ((f / 2.0f) - (this.f15705.width() / 2)) + 0.0f, f2 - 20.0f, this.f15695);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f15694);
            String str2 = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (C6273.this.getHeight() - i2))) + 0.5d)) / 100.0f);
            m19430(str2, this.f15695);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f15705.height() / 2)), this.f15695);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f15694);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m19427(Canvas canvas, C6269 c6269) {
            this.f15691.reset();
            for (int i = 0; i <= 50; i++) {
                c6269.m19313(i / 50, this.f15697, 0);
                Path path = this.f15691;
                float[] fArr = this.f15697;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f15691;
                float[] fArr2 = this.f15697;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f15691;
                float[] fArr3 = this.f15697;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f15691;
                float[] fArr4 = this.f15697;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f15691.close();
            }
            this.f15692.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f15691, this.f15692);
            canvas.translate(-2.0f, -2.0f);
            this.f15692.setColor(-65536);
            canvas.drawPath(this.f15691, this.f15692);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m19428(Canvas canvas, int i, int i2, C6269 c6269) {
            int width;
            int height;
            int i3;
            float f;
            float f2;
            View view = c6269.f1956;
            if (view != null) {
                width = view.getWidth();
                height = c6269.f1956.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i4 = 1; i4 < i2 - 1; i4++) {
                if (i != 4 || this.f1964[i4 - 1] != 0) {
                    float[] fArr = this.f15690;
                    int i5 = i4 * 2;
                    float f3 = fArr[i5];
                    float f4 = fArr[i5 + 1];
                    this.f15691.reset();
                    this.f15691.moveTo(f3, f4 + 10.0f);
                    this.f15691.lineTo(f3 + 10.0f, f4);
                    this.f15691.lineTo(f3, f4 - 10.0f);
                    this.f15691.lineTo(f3 - 10.0f, f4);
                    this.f15691.close();
                    int i6 = i4 - 1;
                    c6269.m19321(i6);
                    if (i == 4) {
                        int i7 = this.f1964[i6];
                        if (i7 == 1) {
                            m19425(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i7 == 2) {
                            m19423(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else {
                            if (i7 == 3) {
                                i3 = 3;
                                f = f4;
                                f2 = f3;
                                m19426(canvas, f3 - 0.0f, f4 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f15691, this.f15696);
                        }
                        i3 = 3;
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.f15691, this.f15696);
                    } else {
                        i3 = 3;
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        m19425(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == i3) {
                        m19423(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        m19426(canvas, f2 - 0.0f, f - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f15691, this.f15696);
                }
            }
            float[] fArr2 = this.f1963;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f15693);
                float[] fArr3 = this.f1963;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f15693);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m19429(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.f15694);
            canvas.drawLine(f, f2, f3, f4, this.f15694);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m19430(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f15705);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C6276 {

        /* JADX INFO: renamed from: ۥ */
        public C4129 f1965 = new C4129();

        /* JADX INFO: renamed from: ۥ۟ */
        public C4129 f1966 = new C4129();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C8770 f15709 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C8770 f15710 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f15711;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f15712;

        public C6276() {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2746() {
            int childCount = C6273.this.getChildCount();
            C6273.this.f15629.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = C6273.this.getChildAt(i);
                C6273.this.f15629.put(childAt, new C6269(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = C6273.this.getChildAt(i2);
                C6269 c6269 = C6273.this.f15629.get(childAt2);
                if (c6269 != null) {
                    if (this.f15709 != null) {
                        C4128 c4128M19434 = m19434(this.f1965, childAt2);
                        if (c4128M19434 != null) {
                            c6269.m19339(c4128M19434, this.f15709);
                        } else if (C6273.this.f15642 != 0) {
                            Log.e(C6273.f15608, C4308.m12433() + "no widget for  " + C4308.m12437(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f15710 != null) {
                        C4128 c4128M194342 = m19434(this.f1966, childAt2);
                        if (c4128M194342 != null) {
                            c6269.m19336(c4128M194342, this.f15710);
                        } else if (C6273.this.f15642 != 0) {
                            Log.e(C6273.f15608, C4308.m12433() + "no widget for  " + C4308.m12437(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m2747(C4129 c4129, C4129 c41292) {
            ArrayList<C4128> arrayListM28192 = c4129.m28192();
            HashMap<C4128, C4128> map = new HashMap<>();
            map.put(c4129, c41292);
            c41292.m28192().clear();
            c41292.mo9342(c4129, map);
            for (C4128 c4128 : arrayListM28192) {
                C4128 c3507 = c4128 instanceof C3507 ? new C3507() : c4128 instanceof C5226 ? new C5226() : c4128 instanceof C4889 ? new C4889() : c4128 instanceof InterfaceC5278 ? new C5281() : new C4128();
                c41292.m4410(c3507);
                map.put(c4128, c3507);
            }
            for (C4128 c41282 : arrayListM28192) {
                map.get(c41282).mo9342(c41282, map);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m19431(String str, C4129 c4129) {
            String str2 = str + " " + C4308.m12437((View) c4129.m11852());
            Log.v(C6273.f15608, str2 + "  ========= " + c4129);
            int size = c4129.m28192().size();
            for (int i = 0; i < size; i++) {
                String str3 = str2 + "[" + i + "] ";
                C4128 c4128 = c4129.m28192().get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                C4125 c4125 = c4128.f8387.f8275;
                String str4 = JavaConstant.Dynamic.DEFAULT_NAME;
                sb.append(c4125 != null ? C4750.f10502 : JavaConstant.Dynamic.DEFAULT_NAME);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(c4128.f8389.f8275 != null ? "B" : JavaConstant.Dynamic.DEFAULT_NAME);
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(c4128.f8386.f8275 != null ? "L" : JavaConstant.Dynamic.DEFAULT_NAME);
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                if (c4128.f8388.f8275 != null) {
                    str4 = "R";
                }
                sb4.append(str4);
                String string4 = sb4.toString();
                View view = (View) c4128.m11852();
                String strM12437 = C4308.m12437(view);
                if (view instanceof TextView) {
                    strM12437 = strM12437 + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(C6273.f15608, str3 + "  " + strM12437 + " " + c4128 + " " + string4);
            }
            Log.v(C6273.f15608, str2 + " done. ");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m19432(String str, ConstraintLayout.C1641 c1641) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(c1641.f26491 != -1 ? "SS" : "__");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(c1641.f26490 != -1 ? "|SE" : "|__");
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append(c1641.f26492 != -1 ? "|ES" : "|__");
            String string3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            sb4.append(c1641.f26493 != -1 ? "|EE" : "|__");
            String string4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            sb5.append(c1641.f26478 != -1 ? "|LL" : "|__");
            String string5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string5);
            sb6.append(c1641.f26479 != -1 ? "|LR" : "|__");
            String string6 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string6);
            sb7.append(c1641.f26480 != -1 ? "|RL" : "|__");
            String string7 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            sb8.append(c1641.f26481 != -1 ? "|RR" : "|__");
            String string8 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(string8);
            sb9.append(c1641.f26482 != -1 ? "|TT" : "|__");
            String string9 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string9);
            sb10.append(c1641.f26483 != -1 ? "|TB" : "|__");
            String string10 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(string10);
            sb11.append(c1641.f26484 != -1 ? "|BT" : "|__");
            String string11 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(string11);
            sb12.append(c1641.f26485 != -1 ? "|BB" : "|__");
            Log.v(C6273.f15608, str + sb12.toString());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m19433(String str, C4128 c4128) {
            String string;
            String string2;
            String string3;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String string4 = "__";
            if (c4128.f8387.f8275 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C4750.f10502);
                sb2.append(c4128.f8387.f8275.f8274 == C4125.EnumC0335.TOP ? C4750.f10502 : "B");
                string = sb2.toString();
            } else {
                string = "__";
            }
            sb.append(string);
            String string5 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string5);
            if (c4128.f8389.f8275 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("B");
                sb4.append(c4128.f8389.f8275.f8274 == C4125.EnumC0335.TOP ? C4750.f10502 : "B");
                string2 = sb4.toString();
            } else {
                string2 = "__";
            }
            sb3.append(string2);
            String string6 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string6);
            if (c4128.f8386.f8275 != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("L");
                sb6.append(c4128.f8386.f8275.f8274 == C4125.EnumC0335.LEFT ? "L" : "R");
                string3 = sb6.toString();
            } else {
                string3 = "__";
            }
            sb5.append(string3);
            String string7 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string7);
            if (c4128.f8388.f8275 != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("R");
                sb8.append(c4128.f8388.f8275.f8274 == C4125.EnumC0335.LEFT ? "L" : "R");
                string4 = sb8.toString();
            }
            sb7.append(string4);
            Log.v(C6273.f15608, str + sb7.toString() + " ---  " + c4128);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C4128 m19434(C4129 c4129, View view) {
            if (c4129.m11852() == view) {
                return c4129;
            }
            ArrayList<C4128> arrayListM28192 = c4129.m28192();
            int size = arrayListM28192.size();
            for (int i = 0; i < size; i++) {
                C4128 c4128 = arrayListM28192.get(i);
                if (c4128.m11852() == view) {
                    return c4128;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m19435(C4129 c4129, C8770 c8770, C8770 c87702) {
            this.f15709 = c8770;
            this.f15710 = c87702;
            this.f1965 = new C4129();
            this.f1966 = new C4129();
            this.f1965.m12003(((ConstraintLayout) C6273.this).mLayoutWidget.m11990());
            this.f1966.m12003(((ConstraintLayout) C6273.this).mLayoutWidget.m11990());
            this.f1965.m28195();
            this.f1966.m28195();
            m2747(((ConstraintLayout) C6273.this).mLayoutWidget, this.f1965);
            m2747(((ConstraintLayout) C6273.this).mLayoutWidget, this.f1966);
            if (C6273.this.f15633 > 0.5d) {
                if (c8770 != null) {
                    m19440(this.f1965, c8770);
                }
                m19440(this.f1966, c87702);
            } else {
                m19440(this.f1966, c87702);
                if (c8770 != null) {
                    m19440(this.f1965, c8770);
                }
            }
            this.f1965.m12006(C6273.this.isRtl());
            this.f1965.m12008();
            this.f1966.m12006(C6273.this.isRtl());
            this.f1966.m12008();
            ViewGroup.LayoutParams layoutParams = C6273.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C4129 c41292 = this.f1965;
                    C4128.EnumC0339 enumC0339 = C4128.EnumC0339.WRAP_CONTENT;
                    c41292.m11940(enumC0339);
                    this.f1966.m11940(enumC0339);
                }
                if (layoutParams.height == -2) {
                    C4129 c41293 = this.f1965;
                    C4128.EnumC0339 enumC03392 = C4128.EnumC0339.WRAP_CONTENT;
                    c41293.m11961(enumC03392);
                    this.f1966.m11961(enumC03392);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m19436(int i, int i2) {
            return (i == this.f15711 && i2 == this.f15712) ? false : true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m19437(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            C6273 c6273 = C6273.this;
            c6273.f15673 = mode;
            c6273.f15674 = mode2;
            int optimizationLevel = c6273.getOptimizationLevel();
            C6273 c62732 = C6273.this;
            if (c62732.f15624 == c62732.getStartState()) {
                C6273.this.resolveSystem(this.f1966, optimizationLevel, i, i2);
                if (this.f15709 != null) {
                    C6273.this.resolveSystem(this.f1965, optimizationLevel, i, i2);
                }
            } else {
                if (this.f15709 != null) {
                    C6273.this.resolveSystem(this.f1965, optimizationLevel, i, i2);
                }
                C6273.this.resolveSystem(this.f1966, optimizationLevel, i, i2);
            }
            boolean z = true;
            if (!(C6273.this.getParent() instanceof C6273) || mode != 1073741824 || mode2 != 1073741824) {
                C6273 c62733 = C6273.this;
                c62733.f15673 = mode;
                c62733.f15674 = mode2;
                if (c62733.f15624 == c62733.getStartState()) {
                    C6273.this.resolveSystem(this.f1966, optimizationLevel, i, i2);
                    if (this.f15709 != null) {
                        C6273.this.resolveSystem(this.f1965, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.f15709 != null) {
                        C6273.this.resolveSystem(this.f1965, optimizationLevel, i, i2);
                    }
                    C6273.this.resolveSystem(this.f1966, optimizationLevel, i, i2);
                }
                C6273.this.f15669 = this.f1965.m11891();
                C6273.this.f15670 = this.f1965.m11859();
                C6273.this.f15671 = this.f1966.m11891();
                C6273.this.f15672 = this.f1966.m11859();
                C6273 c62734 = C6273.this;
                c62734.f15668 = (c62734.f15669 == c62734.f15671 && c62734.f15670 == c62734.f15672) ? false : true;
            }
            C6273 c62735 = C6273.this;
            int i3 = c62735.f15669;
            int i4 = c62735.f15670;
            int i5 = c62735.f15673;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (c62735.f15675 * (c62735.f15671 - i3)));
            }
            int i6 = c62735.f15674;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) (i4 + (c62735.f15675 * (c62735.f15672 - i4)));
            }
            boolean z2 = this.f1965.m11999() || this.f1966.m11999();
            if (!this.f1965.m11997() && !this.f1966.m11997()) {
                z = false;
            }
            C6273.this.resolveMeasuredDimension(i, i2, i3, i4, z2, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m19438() {
            m19437(C6273.this.f15626, C6273.this.f15627);
            C6273.this.m19412();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m19439(int i, int i2) {
            this.f15711 = i;
            this.f15712 = i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Yue.ۥ۟ۧ۟ۢ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m19440(C4129 c4129, C8770 c8770) {
            SparseArray<C4128> sparseArray = new SparseArray<>();
            C8774.C1648 c1648 = new C8774.C1648(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, c4129);
            sparseArray.put(C6273.this.getId(), c4129);
            for (C4128 c4128 : c4129.m28192()) {
                sparseArray.put(((View) c4128.m11852()).getId(), c4128);
            }
            for (C4128 c41282 : c4129.m28192()) {
                View view = (View) c41282.m11852();
                c8770.m29360(view.getId(), c1648);
                c41282.m11965(c8770.m29409(view.getId()));
                c41282.m11935(c8770.m29403(view.getId()));
                if (view instanceof AbstractC8767) {
                    c8770.m29358((AbstractC8767) view, c41282, c1648, sparseArray);
                    if (view instanceof C1642) {
                        ((C1642) view).m29296();
                    }
                }
                c1648.resolveLayoutDirection(C6273.this.getLayoutDirection());
                C6273.this.applyConstraintsFromLayoutParams(false, view, c41282, c1648, sparseArray);
                if (c8770.m29408(view.getId()) == 1) {
                    c41282.m11964(view.getVisibility());
                } else {
                    c41282.m11964(c8770.m29407(view.getId()));
                }
            }
            for (C4128 c41283 : c4129.m28192()) {
                if (c41283 instanceof C8387) {
                    AbstractC8767 abstractC8767 = (AbstractC8767) c41283.m11852();
                    InterfaceC5278 interfaceC5278 = (InterfaceC5278) c41283;
                    abstractC8767.m29294(c4129, interfaceC5278, sparseArray);
                    ((C8387) interfaceC5278).m27961();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC6277 {
        void clear();

        void recycle();

        /* JADX INFO: renamed from: ۥ */
        void mo2748(int i, float f);

        /* JADX INFO: renamed from: ۥ۟ */
        float mo2749(int i);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        float mo19441(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        void mo19442(MotionEvent motionEvent);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        float mo19443();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        float mo19444();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        void mo19445(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C6278 implements InterfaceC6277 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static C6278 f1967 = new C6278();

        /* JADX INFO: renamed from: ۥ */
        public VelocityTracker f1968;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static C6278 m19446() {
            f1967.f1968 = VelocityTracker.obtain();
            return f1967;
        }

        @Override // Yue.C6273.InterfaceC6277
        public void clear() {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // Yue.C6273.InterfaceC6277
        public void recycle() {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1968 = null;
            }
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ */
        public void mo2748(int i, float f) {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo2749(int i) {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟۟ */
        public float mo19441(int i) {
            if (this.f1968 != null) {
                return mo19441(i);
            }
            return 0.0f;
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo19442(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public float mo19443() {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public float mo19444() {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // Yue.C6273.InterfaceC6277
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo19445(int i) {
            VelocityTracker velocityTracker = this.f1968;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C6279 {

        /* JADX INFO: renamed from: ۥ */
        public float f1969 = Float.NaN;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f1970 = Float.NaN;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f15714 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f15715 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final String f15716 = "motion.progress";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final String f15717 = "motion.velocity";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final String f15718 = "motion.StartState";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final String f15719 = "motion.EndState";

        public C6279() {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m2750() {
            int i = this.f15714;
            if (i != -1 || this.f15715 != -1) {
                if (i == -1) {
                    C6273.this.m19416(this.f15715);
                } else {
                    int i2 = this.f15715;
                    if (i2 == -1) {
                        C6273.this.setState(i, -1, -1);
                    } else {
                        C6273.this.m19411(i, i2);
                    }
                }
                C6273.this.setState(EnumC6281.SETUP);
            }
            if (Float.isNaN(this.f1970)) {
                if (Float.isNaN(this.f1969)) {
                    return;
                }
                C6273.this.setProgress(this.f1969);
            } else {
                C6273.this.m19410(this.f1969, this.f1970);
                this.f1969 = Float.NaN;
                this.f1970 = Float.NaN;
                this.f15714 = -1;
                this.f15715 = -1;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public Bundle m2751() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1969);
            bundle.putFloat("motion.velocity", this.f1970);
            bundle.putInt("motion.StartState", this.f15714);
            bundle.putInt("motion.EndState", this.f15715);
            return bundle;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m19447() {
            this.f15715 = C6273.this.f15625;
            this.f15714 = C6273.this.f15623;
            this.f1970 = C6273.this.getVelocity();
            this.f1969 = C6273.this.getProgress();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m19448(int i) {
            this.f15715 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m19449(float f) {
            this.f1969 = f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m19450(int i) {
            this.f15714 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m19451(Bundle bundle) {
            this.f1969 = bundle.getFloat("motion.progress");
            this.f1970 = bundle.getFloat("motion.velocity");
            this.f15714 = bundle.getInt("motion.StartState");
            this.f15715 = bundle.getInt("motion.EndState");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m19452(float f) {
            this.f1970 = f;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥۣ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC6280 {
        /* JADX INFO: renamed from: ۥ */
        void mo2740(C6273 c6273, int i, int i2);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo2741(C6273 c6273, int i);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo19352(C6273 c6273, int i, boolean z, float f);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo19353(C6273 c6273, int i, int i2, float f);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۣ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public enum EnumC6281 {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6273(@InterfaceC6391 Context context) {
        super(context);
        this.f15622 = 0.0f;
        this.f15623 = -1;
        this.f15624 = -1;
        this.f15625 = -1;
        this.f15626 = 0;
        this.f15627 = 0;
        this.f15628 = true;
        this.f15629 = new HashMap<>();
        this.f15630 = 0L;
        this.f15631 = 1.0f;
        this.f15632 = 0.0f;
        this.f15633 = 0.0f;
        this.f15635 = 0.0f;
        this.f15637 = false;
        this.f15638 = false;
        this.f15642 = 0;
        this.f15644 = false;
        this.f15645 = new C7598();
        this.f15646 = new C6274();
        this.f15648 = true;
        this.f15653 = false;
        this.f15658 = false;
        this.f15659 = null;
        this.f15660 = null;
        this.f15661 = null;
        this.f15662 = 0;
        this.f15663 = -1L;
        this.f15664 = 0.0f;
        this.f15665 = 0;
        this.f15666 = 0.0f;
        this.f15667 = false;
        this.f15668 = false;
        this.f15676 = new C5618();
        this.f15677 = false;
        this.f15679 = EnumC6281.UNDEFINED;
        this.f15680 = new C6276();
        this.f15681 = false;
        this.f15682 = new RectF();
        this.f15683 = null;
        this.f15684 = new ArrayList<>();
        m19401(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static boolean m19378(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m19388(false);
        super.dispatchDraw(canvas);
        if (this.f15620 == null) {
            return;
        }
        if ((this.f15642 & 1) == 1 && !isInEditMode()) {
            this.f15662++;
            long nanoTime = getNanoTime();
            long j = this.f15663;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.f15664 = ((int) ((this.f15662 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f15662 = 0;
                    this.f15663 = nanoTime;
                }
            } else {
                this.f15663 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.f15664 + " fps " + C4308.m12438(this, this.f15623) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C4308.m12438(this, this.f15625));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i = this.f15624;
            sb.append(i == -1 ? "undefined" : C4308.m12438(this, i));
            String string = sb.toString();
            paint.setColor(C8273.f24692);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f15642 > 1) {
            if (this.f15643 == null) {
                this.f15643 = new C6275();
            }
            this.f15643.m2744(canvas, this.f15629, this.f15620.m19485(), this.f15642);
        }
    }

    public int[] getConstraintSetIds() {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return null;
        }
        return c6283.m19483();
    }

    public int getCurrentState() {
        return this.f15624;
    }

    public ArrayList<C6283.C0952> getDefinedTransitions() {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return null;
        }
        return c6283.m19484();
    }

    public C4375 getDesignTool() {
        if (this.f15647 == null) {
            this.f15647 = new C4375(this);
        }
        return this.f15647;
    }

    public int getEndState() {
        return this.f15625;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f15633;
    }

    public int getStartState() {
        return this.f15623;
    }

    public float getTargetPosition() {
        return this.f15635;
    }

    public Bundle getTransitionState() {
        if (this.f15678 == null) {
            this.f15678 = new C6279();
        }
        this.f15678.m19447();
        return this.f15678.m2751();
    }

    public long getTransitionTimeMs() {
        if (this.f15620 != null) {
            this.f15631 = r0.m19485() / 1000.0f;
        }
        return (long) (this.f15631 * 1000.0f);
    }

    public float getVelocity() {
        return this.f15622;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.f15620 = null;
            return;
        }
        try {
            this.f15620 = new C6283(getContext(), this, i);
            if (isAttachedToWindow()) {
                this.f15620.m19516(this);
                this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(this.f15623), this.f15620.m19480(this.f15625));
                m19408();
                this.f15620.m19521(isRtl());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C6283.C0952 c0952;
        int i;
        super.onAttachedToWindow();
        C6283 c6283 = this.f15620;
        if (c6283 != null && (i = this.f15624) != -1) {
            C8770 c8770M19480 = c6283.m19480(i);
            this.f15620.m19516(this);
            if (c8770M19480 != null) {
                c8770M19480.m29357(this);
            }
            this.f15623 = this.f15624;
        }
        m19405();
        C6279 c6279 = this.f15678;
        if (c6279 != null) {
            c6279.m2750();
            return;
        }
        C6283 c62832 = this.f15620;
        if (c62832 == null || (c0952 = c62832.f15769) == null || c0952.m19548() != 4) {
            return;
        }
        m19414();
        setState(EnumC6281.SETUP);
        setState(EnumC6281.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6283.C0952 c0952;
        C7945 c7945M19558;
        int iM25063;
        RectF rectFM25062;
        C6283 c6283 = this.f15620;
        if (c6283 != null && this.f15628 && (c0952 = c6283.f15769) != null && c0952.m19559() && (c7945M19558 = c0952.m19558()) != null && ((motionEvent.getAction() != 0 || (rectFM25062 = c7945M19558.m25062(this, new RectF())) == null || rectFM25062.contains(motionEvent.getX(), motionEvent.getY())) && (iM25063 = c7945M19558.m25063()) != -1)) {
            View view = this.f15683;
            if (view == null || view.getId() != iM25063) {
                this.f15683 = findViewById(iM25063);
            }
            if (this.f15683 != null) {
                this.f15682.set(r0.getLeft(), this.f15683.getTop(), this.f15683.getRight(), this.f15683.getBottom());
                if (this.f15682.contains(motionEvent.getX(), motionEvent.getY()) && !m19400(0.0f, 0.0f, this.f15683, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f15677 = true;
        try {
            if (this.f15620 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f15651 != i5 || this.f15652 != i6) {
                m19408();
                m19388(true);
            }
            this.f15651 = i5;
            this.f15652 = i6;
            this.f15649 = i5;
            this.f15650 = i6;
        } finally {
            this.f15677 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f15620 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.f15626 == i && this.f15627 == i2) ? false : true;
        if (this.f15681) {
            this.f15681 = false;
            m19405();
            m19406();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.f15626 = i;
        this.f15627 = i2;
        int iM19499 = this.f15620.m19499();
        int iM19486 = this.f15620.m19486();
        if ((z2 || this.f15680.m19436(iM19499, iM19486)) && this.f15623 != -1) {
            super.onMeasure(i, i2);
            this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(iM19499), this.f15620.m19480(iM19486));
            this.f15680.m19438();
            this.f15680.m19439(iM19499, iM19486);
        } else {
            z = true;
        }
        if (this.f15668 || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iM11891 = this.mLayoutWidget.m11891() + getPaddingLeft() + getPaddingRight();
            int iM11859 = this.mLayoutWidget.m11859() + paddingTop;
            int i3 = this.f15673;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                iM11891 = (int) (this.f15669 + (this.f15675 * (this.f15671 - r7)));
                requestLayout();
            }
            int i4 = this.f15674;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                iM11859 = (int) (this.f15670 + (this.f15675 * (this.f15672 - r7)));
                requestLayout();
            }
            setMeasuredDimension(iM11891, iM11859);
        }
        m19389();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // Yue.InterfaceC6367
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C6283.C0952 c0952;
        C7945 c7945M19558;
        int iM25063;
        C6283 c6283 = this.f15620;
        if (c6283 == null || (c0952 = c6283.f15769) == null || !c0952.m19559()) {
            return;
        }
        C6283.C0952 c09522 = this.f15620.f15769;
        if (c09522 == null || !c09522.m19559() || (c7945M19558 = c09522.m19558()) == null || (iM25063 = c7945M19558.m25063()) == -1 || view.getId() == iM25063) {
            C6283 c62832 = this.f15620;
            if (c62832 != null && c62832.m19494()) {
                float f = this.f15632;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (c09522.m19558() != null && (this.f15620.f15769.m19558().m25055() & 1) != 0) {
                float fM19496 = this.f15620.m19496(i, i2);
                float f2 = this.f15633;
                if ((f2 <= 0.0f && fM19496 < 0.0f) || (f2 >= 1.0f && fM19496 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0949(view));
                    return;
                }
            }
            float f3 = this.f15632;
            long nanoTime = getNanoTime();
            float f4 = i;
            this.f15654 = f4;
            float f5 = i2;
            this.f15655 = f5;
            this.f15657 = (float) ((nanoTime - this.f15656) * 1.0E-9d);
            this.f15656 = nanoTime;
            this.f15620.m19512(f4, f5);
            if (f3 != this.f15632) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m19388(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f15653 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6368
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f15653 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f15653 = false;
    }

    @Override // Yue.InterfaceC6367
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        C6283 c6283 = this.f15620;
        if (c6283 != null) {
            c6283.m19521(isRtl());
        }
    }

    @Override // Yue.InterfaceC6367
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C6283.C0952 c0952;
        C6283 c6283 = this.f15620;
        return (c6283 == null || (c0952 = c6283.f15769) == null || c0952.m19558() == null || (this.f15620.f15769.m19558().m25055() & 2) != 0) ? false : true;
    }

    @Override // Yue.InterfaceC6367
    public void onStopNestedScroll(View view, int i) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return;
        }
        float f = this.f15654;
        float f2 = this.f15657;
        c6283.m19513(f / f2, this.f15655 / f2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C6283 c6283 = this.f15620;
        if (c6283 == null || !this.f15628 || !c6283.m19525()) {
            return super.onTouchEvent(motionEvent);
        }
        C6283.C0952 c0952 = this.f15620.f15769;
        if (c0952 != null && !c0952.m19559()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f15620.m19514(motionEvent, getCurrentState(), this);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C6271) {
            C6271 c6271 = (C6271) view;
            if (this.f15661 == null) {
                this.f15661 = new ArrayList<>();
            }
            this.f15661.add(c6271);
            if (c6271.m19355()) {
                if (this.f15659 == null) {
                    this.f15659 = new ArrayList<>();
                }
                this.f15659.add(c6271);
            }
            if (c6271.m19354()) {
                if (this.f15660 == null) {
                    this.f15660 = new ArrayList<>();
                }
                this.f15660.add(c6271);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C6271> arrayList = this.f15659;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C6271> arrayList2 = this.f15660;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C6283 c6283;
        C6283.C0952 c0952;
        if (this.f15668 || this.f15624 != -1 || (c6283 = this.f15620) == null || (c0952 = c6283.f15769) == null || c0952.m19553() != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.f15642 = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.f15628 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f15620 != null) {
            setState(EnumC6281.MOVING);
            Interpolator interpolatorM19489 = this.f15620.m19489();
            if (interpolatorM19489 != null) {
                setProgress(interpolatorM19489.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<C6271> arrayList = this.f15660;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f15660.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<C6271> arrayList = this.f15659;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f15659.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w(f15608, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f15678 == null) {
                this.f15678 = new C6279();
            }
            this.f15678.m19449(f);
            return;
        }
        if (f <= 0.0f) {
            this.f15624 = this.f15623;
            if (this.f15633 == 0.0f) {
                setState(EnumC6281.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f15624 = this.f15625;
            if (this.f15633 == 1.0f) {
                setState(EnumC6281.FINISHED);
            }
        } else {
            this.f15624 = -1;
            setState(EnumC6281.MOVING);
        }
        if (this.f15620 == null) {
            return;
        }
        this.f15636 = true;
        this.f15635 = f;
        this.f15632 = f;
        this.f15634 = -1L;
        this.f15630 = -1L;
        this.f15621 = null;
        this.f15637 = true;
        invalidate();
    }

    public void setScene(C6283 c6283) {
        this.f15620 = c6283;
        c6283.m19521(isRtl());
        m19408();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setState(EnumC6281 enumC6281) {
        EnumC6281 enumC62812 = EnumC6281.FINISHED;
        if (enumC6281 == enumC62812 && this.f15624 == -1) {
            return;
        }
        EnumC6281 enumC62813 = this.f15679;
        this.f15679 = enumC6281;
        EnumC6281 enumC62814 = EnumC6281.MOVING;
        if (enumC62813 == enumC62814 && enumC6281 == enumC62814) {
            m19390();
        }
        int i = C0950.f1960[enumC62813.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC6281 == enumC62812) {
                m19391();
                return;
            }
            return;
        }
        if (enumC6281 == enumC62814) {
            m19390();
        }
        if (enumC6281 == enumC62812) {
            m19391();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTransition(int i) {
        if (this.f15620 != null) {
            C6283.C0952 c0952M19398 = m19398(i);
            this.f15623 = c0952M19398.m19557();
            this.f15625 = c0952M19398.m19550();
            if (!isAttachedToWindow()) {
                if (this.f15678 == null) {
                    this.f15678 = new C6279();
                }
                this.f15678.m19450(this.f15623);
                this.f15678.m19448(this.f15625);
                return;
            }
            int i2 = this.f15624;
            float f = i2 == this.f15623 ? 0.0f : i2 == this.f15625 ? 1.0f : Float.NaN;
            this.f15620.m19523(c0952M19398);
            this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(this.f15623), this.f15620.m19480(this.f15625));
            m19408();
            this.f15633 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
                return;
            }
            Log.v(f15608, C4308.m12433() + " transitionToStart ");
            m19415();
        }
    }

    public void setTransitionDuration(int i) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            Log.e(f15608, "MotionScene not defined");
        } else {
            c6283.m19519(i);
        }
    }

    public void setTransitionListener(InterfaceC6280 interfaceC6280) {
        this.f15639 = interfaceC6280;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f15678 == null) {
            this.f15678 = new C6279();
        }
        this.f15678.m19451(bundle);
        if (isAttachedToWindow()) {
            this.f15678.m2750();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C4308.m12435(context, this.f15623) + "->" + C4308.m12435(context, this.f15625) + " (pos:" + this.f15633 + " Dpos/Dt:" + this.f15622;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m19379(InterfaceC6280 interfaceC6280) {
        if (this.f15661 == null) {
            this.f15661 = new ArrayList<>();
        }
        this.f15661.add(interfaceC6280);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m19380(float f) {
        if (this.f15620 == null) {
            return;
        }
        float f2 = this.f15633;
        float f3 = this.f15632;
        if (f2 != f3 && this.f15636) {
            this.f15633 = f3;
        }
        float f4 = this.f15633;
        if (f4 == f) {
            return;
        }
        this.f15644 = false;
        this.f15635 = f;
        this.f15631 = r0.m19485() / 1000.0f;
        setProgress(this.f15635);
        this.f15621 = this.f15620.m19489();
        this.f15636 = false;
        this.f15630 = getNanoTime();
        this.f15637 = true;
        this.f15632 = f4;
        this.f15633 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m19381() {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            Log.e(f15608, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iM19499 = c6283.m19499();
        C6283 c62832 = this.f15620;
        m19382(iM19499, c62832.m19480(c62832.m19499()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (C6283.C0952 c0952 : this.f15620.m19484()) {
            if (c0952 == this.f15620.f15769) {
                Log.v(f15608, "CHECK: CURRENT");
            }
            m19383(c0952);
            int iM19557 = c0952.m19557();
            int iM19550 = c0952.m19550();
            String strM12435 = C4308.m12435(getContext(), iM19557);
            String strM124352 = C4308.m12435(getContext(), iM19550);
            if (sparseIntArray.get(iM19557) == iM19550) {
                Log.e(f15608, "CHECK: two transitions with the same start and end " + strM12435 + "->" + strM124352);
            }
            if (sparseIntArray2.get(iM19550) == iM19557) {
                Log.e(f15608, "CHECK: you can't have reverse transitions" + strM12435 + "->" + strM124352);
            }
            sparseIntArray.put(iM19557, iM19550);
            sparseIntArray2.put(iM19550, iM19557);
            if (this.f15620.m19480(iM19557) == null) {
                Log.e(f15608, " no such constraintSetStart " + strM12435);
            }
            if (this.f15620.m19480(iM19550) == null) {
                Log.e(f15608, " no such constraintSetEnd " + strM12435);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m19382(int i, C8770 c8770) {
        String strM12435 = C4308.m12435(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(f15608, "CHECK: " + strM12435 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (c8770.m29401(id) == null) {
                Log.w(f15608, "CHECK: " + strM12435 + " NO CONSTRAINTS for " + C4308.m12437(childAt));
            }
        }
        int[] iArrM29404 = c8770.m29404();
        for (int i3 = 0; i3 < iArrM29404.length; i3++) {
            int i4 = iArrM29404[i3];
            String strM124352 = C4308.m12435(getContext(), i4);
            if (findViewById(iArrM29404[i3]) == null) {
                Log.w(f15608, "CHECK: " + strM12435 + " NO View matches id " + strM124352);
            }
            if (c8770.m29403(i4) == -1) {
                Log.w(f15608, "CHECK: " + strM12435 + "(" + strM124352 + ") no LAYOUT_HEIGHT");
            }
            if (c8770.m29409(i4) == -1) {
                Log.w(f15608, "CHECK: " + strM12435 + "(" + strM124352 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m19383(C6283.C0952 c0952) {
        Log.v(f15608, "CHECK: transition = " + c0952.m19545(getContext()));
        Log.v(f15608, "CHECK: transition.setDuration = " + c0952.m19549());
        if (c0952.m19557() == c0952.m19550()) {
            Log.e(f15608, "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m19384() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C6269 c6269 = this.f15629.get(childAt);
            if (c6269 != null) {
                c6269.m19338(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m19385() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.v(f15608, " " + C4308.m12433() + " " + C4308.m12437(this) + " " + C4308.m12435(getContext(), this.f15624) + " " + C4308.m12437(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m19386(boolean z) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return;
        }
        c6283.m19478(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m19387(int i, boolean z) {
        C6283.C0952 c0952M19398 = m19398(i);
        if (z) {
            c0952M19398.m19563(true);
            return;
        }
        C6283 c6283 = this.f15620;
        if (c0952M19398 == c6283.f15769) {
            Iterator<C6283.C0952> it = c6283.m19502(this.f15624).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6283.C0952 next = it.next();
                if (next.m19559()) {
                    this.f15620.f15769 = next;
                    break;
                }
            }
        }
        c0952M19398.m19563(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m19388(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f15634 == -1) {
            this.f15634 = getNanoTime();
        }
        float f2 = this.f15633;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f15624 = -1;
        }
        boolean z4 = false;
        if (this.f15658 || (this.f15637 && (z || this.f15635 != f2))) {
            float fSignum = Math.signum(this.f15635 - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f15621;
            if (interpolator instanceof AbstractInterpolatorC6272) {
                f = 0.0f;
            } else {
                f = (((nanoTime - this.f15634) * fSignum) * 1.0E-9f) / this.f15631;
                this.f15622 = f;
            }
            float f3 = this.f15633 + f;
            if (this.f15636) {
                f3 = this.f15635;
            }
            if ((fSignum <= 0.0f || f3 < this.f15635) && (fSignum > 0.0f || f3 > this.f15635)) {
                z2 = false;
            } else {
                f3 = this.f15635;
                this.f15637 = false;
                z2 = true;
            }
            this.f15633 = f3;
            this.f15632 = f3;
            this.f15634 = nanoTime;
            if (interpolator != null && !z2) {
                if (this.f15644) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f15630) * 1.0E-9f);
                    this.f15633 = interpolation;
                    this.f15634 = nanoTime;
                    Interpolator interpolator2 = this.f15621;
                    if (interpolator2 instanceof AbstractInterpolatorC6272) {
                        float fMo2742 = ((AbstractInterpolatorC6272) interpolator2).mo2742();
                        this.f15622 = fMo2742;
                        if (Math.abs(fMo2742) * this.f15631 <= 1.0E-5f) {
                            this.f15637 = false;
                        }
                        if (fMo2742 > 0.0f && interpolation >= 1.0f) {
                            this.f15633 = 1.0f;
                            this.f15637 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo2742 < 0.0f && interpolation <= 0.0f) {
                            this.f15633 = 0.0f;
                            this.f15637 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f15621;
                    if (interpolator3 instanceof AbstractInterpolatorC6272) {
                        this.f15622 = ((AbstractInterpolatorC6272) interpolator3).mo2742();
                    } else {
                        this.f15622 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f15622) > 1.0E-5f) {
                setState(EnumC6281.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.f15635) || (fSignum <= 0.0f && f3 <= this.f15635)) {
                f3 = this.f15635;
                this.f15637 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f15637 = false;
                setState(EnumC6281.FINISHED);
            }
            int childCount = getChildCount();
            this.f15658 = false;
            long nanoTime2 = getNanoTime();
            this.f15675 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C6269 c6269 = this.f15629.get(childAt);
                if (c6269 != null) {
                    this.f15658 = c6269.m19331(childAt, f3, nanoTime2, this.f15676) | this.f15658;
                }
            }
            boolean z5 = (fSignum > 0.0f && f3 >= this.f15635) || (fSignum <= 0.0f && f3 <= this.f15635);
            if (!this.f15658 && !this.f15637 && z5) {
                setState(EnumC6281.FINISHED);
            }
            if (this.f15668) {
                requestLayout();
            }
            this.f15658 = (!z5) | this.f15658;
            if (f3 <= 0.0f && (i = this.f15623) != -1 && this.f15624 != i) {
                this.f15624 = i;
                this.f15620.m19480(i).m29356(this);
                setState(EnumC6281.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f15624;
                int i4 = this.f15625;
                if (i3 != i4) {
                    this.f15624 = i4;
                    this.f15620.m19480(i4).m29356(this);
                    setState(EnumC6281.FINISHED);
                    z4 = true;
                }
            }
            if (this.f15658 || this.f15637) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                setState(EnumC6281.FINISHED);
            }
            if ((!this.f15658 && this.f15637 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m19405();
            }
        }
        float f4 = this.f15633;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.f15624;
                int i6 = this.f15623;
                z3 = i5 == i6 ? z4 : true;
                this.f15624 = i6;
            }
            this.f15681 |= z4;
            if (z4 && !this.f15677) {
                requestLayout();
            }
            this.f15632 = this.f15633;
        }
        int i7 = this.f15624;
        int i8 = this.f15625;
        z3 = i7 == i8 ? z4 : true;
        this.f15624 = i8;
        z4 = z3;
        this.f15681 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f15632 = this.f15633;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m19389() {
        boolean z;
        float fSignum = Math.signum(this.f15635 - this.f15633);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f15621;
        float interpolation = this.f15633 + (!(interpolator instanceof C7598) ? (((nanoTime - this.f15634) * fSignum) * 1.0E-9f) / this.f15631 : 0.0f);
        if (this.f15636) {
            interpolation = this.f15635;
        }
        if ((fSignum <= 0.0f || interpolation < this.f15635) && (fSignum > 0.0f || interpolation > this.f15635)) {
            z = false;
        } else {
            interpolation = this.f15635;
            z = true;
        }
        if (interpolator != null && !z) {
            interpolation = this.f15644 ? interpolator.getInterpolation((nanoTime - this.f15630) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f15635) || (fSignum <= 0.0f && interpolation <= this.f15635)) {
            interpolation = this.f15635;
        }
        this.f15675 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C6269 c6269 = this.f15629.get(childAt);
            if (c6269 != null) {
                c6269.m19331(childAt, interpolation, nanoTime2, this.f15676);
            }
        }
        if (this.f15668) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m19390() {
        ArrayList<InterfaceC6280> arrayList;
        if ((this.f15639 == null && ((arrayList = this.f15661) == null || arrayList.isEmpty())) || this.f15666 == this.f15632) {
            return;
        }
        if (this.f15665 != -1) {
            InterfaceC6280 interfaceC6280 = this.f15639;
            if (interfaceC6280 != null) {
                interfaceC6280.mo2740(this, this.f15623, this.f15625);
            }
            ArrayList<InterfaceC6280> arrayList2 = this.f15661;
            if (arrayList2 != null) {
                Iterator<InterfaceC6280> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo2740(this, this.f15623, this.f15625);
                }
            }
            this.f15667 = true;
        }
        this.f15665 = -1;
        float f = this.f15632;
        this.f15666 = f;
        InterfaceC6280 interfaceC62802 = this.f15639;
        if (interfaceC62802 != null) {
            interfaceC62802.mo19353(this, this.f15623, this.f15625, f);
        }
        ArrayList<InterfaceC6280> arrayList3 = this.f15661;
        if (arrayList3 != null) {
            Iterator<InterfaceC6280> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo19353(this, this.f15623, this.f15625, this.f15632);
            }
        }
        this.f15667 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m19391() {
        int iIntValue;
        ArrayList<InterfaceC6280> arrayList;
        if ((this.f15639 != null || ((arrayList = this.f15661) != null && !arrayList.isEmpty())) && this.f15665 == -1) {
            this.f15665 = this.f15624;
            if (this.f15684.isEmpty()) {
                iIntValue = -1;
            } else {
                iIntValue = this.f15684.get(r0.size() - 1).intValue();
            }
            int i = this.f15624;
            if (iIntValue != i && i != -1) {
                this.f15684.add(Integer.valueOf(i));
            }
        }
        m19406();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m19392(C6273 c6273, int i, int i2) {
        InterfaceC6280 interfaceC6280 = this.f15639;
        if (interfaceC6280 != null) {
            interfaceC6280.mo2740(this, i, i2);
        }
        ArrayList<InterfaceC6280> arrayList = this.f15661;
        if (arrayList != null) {
            Iterator<InterfaceC6280> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2740(c6273, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m19393(int i, boolean z, float f) {
        InterfaceC6280 interfaceC6280 = this.f15639;
        if (interfaceC6280 != null) {
            interfaceC6280.mo19352(this, i, z, f);
        }
        ArrayList<InterfaceC6280> arrayList = this.f15661;
        if (arrayList != null) {
            Iterator<InterfaceC6280> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo19352(this, i, z, f);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m19394(int i, float f, float f2, float f3, float[] fArr) {
        String resourceName;
        HashMap<View, C6269> map = this.f15629;
        View viewById = getViewById(i);
        C6269 c6269 = map.get(viewById);
        if (c6269 != null) {
            c6269.m19317(f, f2, f3, fArr);
            float y = viewById.getY();
            this.f15640 = f;
            this.f15641 = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i);
        }
        Log.w(f15608, "WARNING could not find view id " + resourceName);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C8770 m19395(int i) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return null;
        }
        return c6283.m19480(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public String m19396(int i) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return null;
        }
        return c6283.m19508(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m19397(boolean z) {
        this.f15642 = z ? 2 : 1;
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public C6283.C0952 m19398(int i) {
        return this.f15620.m19500(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m19399(View view, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo2742 = this.f15622;
        float f3 = this.f15633;
        if (this.f15621 != null) {
            float fSignum = Math.signum(this.f15635 - f3);
            float interpolation2 = this.f15621.getInterpolation(this.f15633 + 1.0E-5f);
            interpolation = this.f15621.getInterpolation(this.f15633);
            fMo2742 = (fSignum * ((interpolation2 - interpolation) / 1.0E-5f)) / this.f15631;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.f15621;
        if (interpolator instanceof AbstractInterpolatorC6272) {
            fMo2742 = ((AbstractInterpolatorC6272) interpolator).mo2742();
        }
        C6269 c6269 = this.f15629.get(view);
        if ((i & 1) == 0) {
            c6269.m19325(interpolation, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            c6269.m19317(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo2742;
            fArr[1] = fArr[1] * fMo2742;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final boolean m19400(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m19400(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.f15682.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f15682.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m19401(AttributeSet attributeSet) {
        C6283 c6283;
        f15610 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f29217);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29220) {
                    this.f15620 = new C6283(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C8778.C8789.f29219) {
                    this.f15624 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C8778.C8789.f29222) {
                    this.f15635 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f15637 = true;
                } else if (index == C8778.C8789.f29218) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == C8778.C8789.f29223) {
                    if (this.f15642 == 0) {
                        this.f15642 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C8778.C8789.f29221) {
                    this.f15642 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f15620 == null) {
                Log.e(f15608, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f15620 = null;
            }
        }
        if (this.f15642 != 0) {
            m19381();
        }
        if (this.f15624 != -1 || (c6283 = this.f15620) == null) {
            return;
        }
        this.f15624 = c6283.m19499();
        this.f15623 = this.f15620.m19499();
        this.f15625 = this.f15620.m19486();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m19402() {
        return this.f15628;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m19403(String str) {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return 0;
        }
        return c6283.m19507(str);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC6277 m19404() {
        return C6278.m19446();
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m19405() {
        C6283 c6283 = this.f15620;
        if (c6283 == null) {
            return;
        }
        if (c6283.m19476(this, this.f15624)) {
            requestLayout();
            return;
        }
        int i = this.f15624;
        if (i != -1) {
            this.f15620.m19474(this, i);
        }
        if (this.f15620.m19525()) {
            this.f15620.m19524();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final void m19406() {
        ArrayList<InterfaceC6280> arrayList;
        if (this.f15639 == null && ((arrayList = this.f15661) == null || arrayList.isEmpty())) {
            return;
        }
        this.f15667 = false;
        for (Integer num : this.f15684) {
            InterfaceC6280 interfaceC6280 = this.f15639;
            if (interfaceC6280 != null) {
                interfaceC6280.mo2741(this, num.intValue());
            }
            ArrayList<InterfaceC6280> arrayList2 = this.f15661;
            if (arrayList2 != null) {
                Iterator<InterfaceC6280> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo2741(this, num.intValue());
                }
            }
        }
        this.f15684.clear();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m19407() {
        Log.e(f15608, "This method is deprecated. Please call rebuildScene() instead.");
        m19408();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m19408() {
        this.f15680.m19438();
        invalidate();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m19409(InterfaceC6280 interfaceC6280) {
        ArrayList<InterfaceC6280> arrayList = this.f15661;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(interfaceC6280);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m19410(float f, float f2) {
        if (isAttachedToWindow()) {
            setProgress(f);
            setState(EnumC6281.MOVING);
            this.f15622 = f2;
            m19380(1.0f);
            return;
        }
        if (this.f15678 == null) {
            this.f15678 = new C6279();
        }
        this.f15678.m19449(f);
        this.f15678.m19452(f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void m19411(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f15678 == null) {
                this.f15678 = new C6279();
            }
            this.f15678.m19450(i);
            this.f15678.m19448(i2);
            return;
        }
        C6283 c6283 = this.f15620;
        if (c6283 != null) {
            this.f15623 = i;
            this.f15625 = i2;
            c6283.m19522(i, i2);
            this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(i), this.f15620.m19480(i2));
            m19408();
            this.f15633 = 0.0f;
            m19415();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final void m19412() {
        int childCount = getChildCount();
        this.f15680.m2746();
        this.f15637 = true;
        int width = getWidth();
        int height = getHeight();
        int iM19479 = this.f15620.m19479();
        int i = 0;
        if (iM19479 != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                C6269 c6269 = this.f15629.get(getChildAt(i2));
                if (c6269 != null) {
                    c6269.m19337(iM19479);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C6269 c62692 = this.f15629.get(getChildAt(i3));
            if (c62692 != null) {
                this.f15620.m19491(c62692);
                c62692.m19341(width, height, this.f15631, getNanoTime());
            }
        }
        float fM19498 = this.f15620.m19498();
        if (fM19498 != 0.0f) {
            boolean z = ((double) fM19498) < 0.0d;
            float fAbs = Math.abs(fM19498);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i4 = 0; i4 < childCount; i4++) {
                C6269 c62693 = this.f15629.get(getChildAt(i4));
                if (!Float.isNaN(c62693.f15526)) {
                    for (int i5 = 0; i5 < childCount; i5++) {
                        C6269 c62694 = this.f15629.get(getChildAt(i5));
                        if (!Float.isNaN(c62694.f15526)) {
                            fMin = Math.min(fMin, c62694.f15526);
                            fMax = Math.max(fMax, c62694.f15526);
                        }
                    }
                    while (i < childCount) {
                        C6269 c62695 = this.f15629.get(getChildAt(i));
                        if (!Float.isNaN(c62695.f15526)) {
                            c62695.f15528 = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c62695.f15527 = fAbs - (((fMax - c62695.f15526) / (fMax - fMin)) * fAbs);
                            } else {
                                c62695.f15527 = fAbs - (((c62695.f15526 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i++;
                    }
                    return;
                }
                float fM19319 = c62693.m19319();
                float fM19320 = c62693.m19320();
                float f = z ? fM19320 - fM19319 : fM19320 + fM19319;
                fMin2 = Math.min(fMin2, f);
                fMax2 = Math.max(fMax2, f);
            }
            while (i < childCount) {
                C6269 c62696 = this.f15629.get(getChildAt(i));
                float fM193192 = c62696.m19319();
                float fM193202 = c62696.m19320();
                float f2 = z ? fM193202 - fM193192 : fM193202 + fM193192;
                c62696.f15528 = 1.0f / (1.0f - fAbs);
                c62696.f15527 = fAbs - (((f2 - fMin2) * fAbs) / (fMax2 - fMin2));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m19413(int i, float f, float f2) {
        if (this.f15620 == null || this.f15633 == f) {
            return;
        }
        this.f15644 = true;
        this.f15630 = getNanoTime();
        float fM19485 = this.f15620.m19485() / 1000.0f;
        this.f15631 = fM19485;
        this.f15635 = f;
        this.f15637 = true;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            }
            this.f15645.m23794(this.f15633, f, f2, fM19485, this.f15620.m19492(), this.f15620.m19493());
            int i2 = this.f15624;
            this.f15635 = f;
            this.f15624 = i2;
            this.f15621 = this.f15645;
        } else if (i == 4) {
            this.f15646.m2743(f2, this.f15633, this.f15620.m19492());
            this.f15621 = this.f15646;
        } else if (i == 5) {
            if (m19378(f2, this.f15633, this.f15620.m19492())) {
                this.f15646.m2743(f2, this.f15633, this.f15620.m19492());
                this.f15621 = this.f15646;
            } else {
                this.f15645.m23794(this.f15633, f, f2, this.f15631, this.f15620.m19492(), this.f15620.m19493());
                this.f15622 = 0.0f;
                int i3 = this.f15624;
                this.f15635 = f;
                this.f15624 = i3;
                this.f15621 = this.f15645;
            }
        }
        this.f15636 = false;
        this.f15630 = getNanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m19414() {
        m19380(1.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m19415() {
        m19380(0.0f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m19416(int i) {
        if (isAttachedToWindow()) {
            m19417(i, -1, -1);
            return;
        }
        if (this.f15678 == null) {
            this.f15678 = new C6279();
        }
        this.f15678.m19448(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m19417(int i, int i2, int i3) {
        C8790 c8790;
        int iM4732;
        C6283 c6283 = this.f15620;
        if (c6283 != null && (c8790 = c6283.f1972) != null && (iM4732 = c8790.m4732(this.f15624, i, i2, i3)) != -1) {
            i = iM4732;
        }
        int i4 = this.f15624;
        if (i4 == i) {
            return;
        }
        if (this.f15623 == i) {
            m19380(0.0f);
            return;
        }
        if (this.f15625 == i) {
            m19380(1.0f);
            return;
        }
        this.f15625 = i;
        if (i4 != -1) {
            m19411(i4, i);
            m19380(1.0f);
            this.f15633 = 0.0f;
            m19414();
            return;
        }
        this.f15644 = false;
        this.f15635 = 1.0f;
        this.f15632 = 0.0f;
        this.f15633 = 0.0f;
        this.f15634 = getNanoTime();
        this.f15630 = getNanoTime();
        this.f15636 = false;
        this.f15621 = null;
        this.f15631 = this.f15620.m19485() / 1000.0f;
        this.f15623 = -1;
        this.f15620.m19522(-1, this.f15625);
        this.f15620.m19499();
        int childCount = getChildCount();
        this.f15629.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            this.f15629.put(childAt, new C6269(childAt));
        }
        this.f15637 = true;
        this.f15680.m19435(this.mLayoutWidget, null, this.f15620.m19480(i));
        m19408();
        this.f15680.m2746();
        m19384();
        int width = getWidth();
        int height = getHeight();
        for (int i6 = 0; i6 < childCount; i6++) {
            C6269 c6269 = this.f15629.get(getChildAt(i6));
            this.f15620.m19491(c6269);
            c6269.m19341(width, height, this.f15631, getNanoTime());
        }
        float fM19498 = this.f15620.m19498();
        if (fM19498 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i7 = 0; i7 < childCount; i7++) {
                C6269 c62692 = this.f15629.get(getChildAt(i7));
                float fM19320 = c62692.m19320() + c62692.m19319();
                fMin = Math.min(fMin, fM19320);
                fMax = Math.max(fMax, fM19320);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                C6269 c62693 = this.f15629.get(getChildAt(i8));
                float fM19319 = c62693.m19319();
                float fM193202 = c62693.m19320();
                c62693.f15528 = 1.0f / (1.0f - fM19498);
                c62693.f15527 = fM19498 - ((((fM19319 + fM193202) - fMin) * fM19498) / (fMax - fMin));
            }
        }
        this.f15632 = 0.0f;
        this.f15633 = 0.0f;
        this.f15637 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m19418() {
        this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(this.f15623), this.f15620.m19480(this.f15625));
        m19408();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m19419(int i, C8770 c8770) {
        C6283 c6283 = this.f15620;
        if (c6283 != null) {
            c6283.m19518(i, c8770);
        }
        m19418();
        if (this.f15624 == i) {
            c8770.m29357(this);
        }
    }

    @Override // Yue.InterfaceC6367
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(EnumC6281.SETUP);
        this.f15624 = i;
        this.f15623 = -1;
        this.f15625 = -1;
        C8768 c8768 = this.mConstraintLayoutSpec;
        if (c8768 != null) {
            c8768.m29299(i, i2, i3);
            return;
        }
        C6283 c6283 = this.f15620;
        if (c6283 != null) {
            c6283.m19480(i).m29357(this);
        }
    }

    public void setTransition(C6283.C0952 c0952) {
        this.f15620.m19523(c0952);
        setState(EnumC6281.SETUP);
        if (this.f15624 == this.f15620.m19486()) {
            this.f15633 = 1.0f;
            this.f15632 = 1.0f;
            this.f15635 = 1.0f;
        } else {
            this.f15633 = 0.0f;
            this.f15632 = 0.0f;
            this.f15635 = 0.0f;
        }
        this.f15634 = c0952.m19560(1) ? -1L : getNanoTime();
        int iM19499 = this.f15620.m19499();
        int iM19486 = this.f15620.m19486();
        if (iM19499 == this.f15623 && iM19486 == this.f15625) {
            return;
        }
        this.f15623 = iM19499;
        this.f15625 = iM19486;
        this.f15620.m19522(iM19499, iM19486);
        this.f15680.m19435(this.mLayoutWidget, this.f15620.m19480(this.f15623), this.f15620.m19480(this.f15625));
        this.f15680.m19439(this.f15623, this.f15625);
        this.f15680.m19438();
        m19408();
    }

    public C6273(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15622 = 0.0f;
        this.f15623 = -1;
        this.f15624 = -1;
        this.f15625 = -1;
        this.f15626 = 0;
        this.f15627 = 0;
        this.f15628 = true;
        this.f15629 = new HashMap<>();
        this.f15630 = 0L;
        this.f15631 = 1.0f;
        this.f15632 = 0.0f;
        this.f15633 = 0.0f;
        this.f15635 = 0.0f;
        this.f15637 = false;
        this.f15638 = false;
        this.f15642 = 0;
        this.f15644 = false;
        this.f15645 = new C7598();
        this.f15646 = new C6274();
        this.f15648 = true;
        this.f15653 = false;
        this.f15658 = false;
        this.f15659 = null;
        this.f15660 = null;
        this.f15661 = null;
        this.f15662 = 0;
        this.f15663 = -1L;
        this.f15664 = 0.0f;
        this.f15665 = 0;
        this.f15666 = 0.0f;
        this.f15667 = false;
        this.f15668 = false;
        this.f15676 = new C5618();
        this.f15677 = false;
        this.f15679 = EnumC6281.UNDEFINED;
        this.f15680 = new C6276();
        this.f15681 = false;
        this.f15682 = new RectF();
        this.f15683 = null;
        this.f15684 = new ArrayList<>();
        m19401(attributeSet);
    }

    public C6273(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15622 = 0.0f;
        this.f15623 = -1;
        this.f15624 = -1;
        this.f15625 = -1;
        this.f15626 = 0;
        this.f15627 = 0;
        this.f15628 = true;
        this.f15629 = new HashMap<>();
        this.f15630 = 0L;
        this.f15631 = 1.0f;
        this.f15632 = 0.0f;
        this.f15633 = 0.0f;
        this.f15635 = 0.0f;
        this.f15637 = false;
        this.f15638 = false;
        this.f15642 = 0;
        this.f15644 = false;
        this.f15645 = new C7598();
        this.f15646 = new C6274();
        this.f15648 = true;
        this.f15653 = false;
        this.f15658 = false;
        this.f15659 = null;
        this.f15660 = null;
        this.f15661 = null;
        this.f15662 = 0;
        this.f15663 = -1L;
        this.f15664 = 0.0f;
        this.f15665 = 0;
        this.f15666 = 0.0f;
        this.f15667 = false;
        this.f15668 = false;
        this.f15676 = new C5618();
        this.f15677 = false;
        this.f15679 = EnumC6281.UNDEFINED;
        this.f15680 = new C6276();
        this.f15681 = false;
        this.f15682 = new RectF();
        this.f15683 = null;
        this.f15684 = new ArrayList<>();
        m19401(attributeSet);
    }
}
