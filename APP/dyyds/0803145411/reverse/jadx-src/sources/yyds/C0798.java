package yyds;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᛲᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0798 extends View {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList f3660;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final float f3661;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3662;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Paint f3663;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int[] f3664;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0798(MainActivity mainActivity, int i) {
        super(mainActivity);
        this.f3662 = i;
        switch (i) {
            case 1:
                AbstractC2328.m4341(-1702988465472366L);
                super(mainActivity);
                this.f3664 = new int[0];
                this.f3660 = new ArrayList();
                this.f3663 = new Paint(1);
                this.f3661 = getResources().getDisplayMetrics().density;
                break;
            default:
                AbstractC2328.m4341(-297924274324334L);
                this.f3664 = new int[0];
                this.f3660 = new ArrayList();
                this.f3663 = new Paint(1);
                this.f3661 = getResources().getDisplayMetrics().density;
                setLayerType(2, null);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int i = this.f3662;
        ArrayList arrayList = this.f3660;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-297984403866478L);
                super.onDraw(canvas);
                if (arrayList.isEmpty()) {
                    m1841();
                    if (arrayList.isEmpty()) {
                    }
                }
                float width = getWidth();
                float height = getHeight();
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, width, height);
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Paint paint = this.f3663;
                    if (!zHasNext) {
                        canvas.restore();
                        paint.setShader(null);
                        postInvalidateOnAnimation();
                    } else {
                        C0739 c0739 = (C0739) it.next();
                        c0739.f3433 += c0739.f3432;
                        c0739.f3434 += c0739.f3437;
                        float f = c0739.f3431 + 0.008f;
                        c0739.f3431 = f;
                        float fSin = ((((float) Math.sin(f)) * 0.18f) + 0.82f) * c0739.f3438;
                        c0739.f3436 = fSin;
                        if (c0739.f3433 < (-fSin) * 0.3f) {
                            c0739.f3432 = Math.abs(c0739.f3432);
                        }
                        if (c0739.f3433 > (c0739.f3436 * 0.3f) + width) {
                            c0739.f3432 = -Math.abs(c0739.f3432);
                        }
                        if (c0739.f3434 < (-c0739.f3436) * 0.3f) {
                            c0739.f3437 = Math.abs(c0739.f3437);
                        }
                        if (c0739.f3434 > (c0739.f3436 * 0.3f) + height) {
                            c0739.f3437 = -Math.abs(c0739.f3437);
                        }
                        float f2 = c0739.f3433;
                        float f3 = c0739.f3434;
                        float f4 = c0739.f3436;
                        int i2 = c0739.f3435 & 16777215;
                        paint.setShader(new RadialGradient(f2, f3, f4, new int[]{402653184 | i2, i2 | 100663296, 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                        paint.setAlpha(255);
                        float f5 = c0739.f3433;
                        float f6 = c0739.f3436;
                        float f7 = c0739.f3434;
                        canvas2.drawRect(f5 - f6, f7 - f6, f5 + f6, f7 + f6, paint);
                        canvas2 = canvas;
                    }
                    break;
                }
                break;
            default:
                AbstractC2328.m4341(-1703057184949102L);
                super.onDraw(canvas);
                Iterator it2 = arrayList.iterator();
                AbstractC2328.m4341(-1703087249720174L);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    AbstractC2328.m4341(-1703147379262318L);
                    C0180 c0180 = (C0180) next;
                    int i3 = c0180.f1018;
                    int i4 = c0180.f1014 + 1;
                    c0180.f1014 = i4;
                    if (i4 >= i3) {
                        it2.remove();
                    } else {
                        float f8 = c0180.f1016;
                        float f9 = c0180.f1019;
                        c0180.f1016 = f8 + f9;
                        float f10 = c0180.f1017;
                        float f11 = c0180.f1021;
                        c0180.f1017 = f10 + f11;
                        c0180.f1021 = (this.f3661 * 0.35f) + f11;
                        c0180.f1019 = f9 * 0.985f;
                        int i5 = c0180.f1020;
                        Paint paint2 = this.f3663;
                        paint2.setColor(i5);
                        paint2.setAlpha((int) ((1.0f - (c0180.f1014 / i3)) * 255.0f));
                        canvas2.drawCircle(c0180.f1016, c0180.f1017, c0180.f1015, paint2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    postInvalidateOnAnimation();
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.f3662) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                m1841();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m1841() {
        if (getWidth() == 0 || getHeight() == 0 || this.f3664.length == 0) {
            return;
        }
        ArrayList arrayList = this.f3660;
        arrayList.clear();
        int[] iArr = this.f3664;
        float width = getWidth();
        float height = getHeight();
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i % iArr.length];
            float fMin = ((i * 0.1f) + 0.35f) * Math.min(width, height);
            float f = this.f3661;
            float fM1483 = AbstractC0598.m1483(fMin, 120.0f * f, 600.0f * f);
            C1510 c1510 = AbstractC2497.f12305;
            float fM3134 = c1510.m3134() * width;
            float fM31342 = c1510.m3134() * height;
            float fM31343 = (c1510.m3134() - 0.5f) * 0.35f * f;
            float fM31344 = (c1510.m3134() - 0.5f) * 0.35f * f;
            float fM31345 = c1510.m3134() * 1000.0f;
            C0739 c0739 = new C0739();
            c0739.f3433 = fM3134;
            c0739.f3434 = fM31342;
            c0739.f3436 = fM1483;
            c0739.f3438 = fM1483;
            c0739.f3432 = fM31343;
            c0739.f3437 = fM31344;
            c0739.f3435 = i2;
            c0739.f3431 = fM31345;
            arrayList.add(c0739);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m1842(float f, float f2) {
        int[] iArr = this.f3664;
        if (iArr.length == 0) {
            iArr = null;
        }
        if (iArr == null) {
            return;
        }
        for (int i = 0; i < 22; i++) {
            C1510 c1510 = AbstractC2497.f12305;
            AbstractC0638 abstractC0638 = AbstractC2497.f12306;
            double dNextDouble = abstractC0638.mo1532().nextDouble() * 2.0d * 3.141592653589793d;
            float fM3134 = (c1510.m3134() * 9.0f) + 2.0f;
            float f3 = this.f3661;
            double d = fM3134 * f3;
            this.f3660.add(new C0180(f, f2, (float) (Math.cos(dNextDouble) * d), ((float) (Math.sin(dNextDouble) * d)) - (3.5f * f3), ((c1510.m3134() * 3.0f) + 2.0f) * f3, iArr[abstractC0638.m1531(iArr.length)], abstractC0638.m1531(20) + 28));
        }
        postInvalidateOnAnimation();
    }
}
