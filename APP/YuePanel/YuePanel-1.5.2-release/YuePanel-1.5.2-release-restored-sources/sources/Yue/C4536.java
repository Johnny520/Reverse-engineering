package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4536 extends Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f9692 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f9693 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f9694 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f9695 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final float f9696 = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: ۥ */
    public final Paint f949;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f950;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f9697;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f9698;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f9699;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f9700;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Path f9701;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f9702;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f9703;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f9704;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float f9705;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f9706;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۨ$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0430 {
    }

    public C4536(Context context) {
        Paint paint = new Paint();
        this.f949 = paint;
        this.f9701 = new Path();
        this.f9703 = false;
        this.f9706 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C6898.C6909.f19601, C6898.C1110.f18468, C6898.C6908.f19149);
        m13303(typedArrayObtainStyledAttributes.getColor(C6898.C6909.f19605, 0));
        m13302(typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19609, 0.0f));
        m13307(typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19608, true));
        m13305(Math.round(typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19607, 0.0f)));
        this.f9702 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6898.C6909.f19606, 0);
        this.f9697 = Math.round(typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19604, 0.0f));
        this.f950 = Math.round(typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19602, 0.0f));
        this.f9698 = typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19603, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static float m13290(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f9706;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C4520.m13227(this) == 0 : C4520.m13227(this) == 1))) {
            z = true;
        }
        float f = this.f950;
        float fM13290 = m13290(this.f9697, (float) Math.sqrt(f * f * 2.0f), this.f9704);
        float fM132902 = m13290(this.f9697, this.f9698, this.f9704);
        float fRound = Math.round(m13290(0.0f, this.f9705, this.f9704));
        float fM132903 = m13290(0.0f, f9696, this.f9704);
        float fM132904 = m13290(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f9704);
        double d = fM13290;
        double d2 = fM132903;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f9701.rewind();
        float fM132905 = m13290(this.f9699 + this.f949.getStrokeWidth(), -this.f9705, this.f9704);
        float f2 = (-fM132902) / 2.0f;
        this.f9701.moveTo(f2 + fRound, 0.0f);
        this.f9701.rLineTo(fM132902 - (fRound * 2.0f), 0.0f);
        this.f9701.moveTo(f2, fM132905);
        this.f9701.rLineTo(fRound2, fRound3);
        this.f9701.moveTo(f2, -fM132905);
        this.f9701.rLineTo(fRound2, -fRound3);
        this.f9701.close();
        canvas.save();
        float strokeWidth = this.f949.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f9699);
        if (this.f9700) {
            canvas.rotate(fM132904 * (this.f9703 ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f9701, this.f949);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9702;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9702;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f949.getAlpha()) {
            this.f949.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f949.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ */
    public float m1473() {
        return this.f950;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m1474() {
        return this.f9698;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m13291() {
        return this.f9697;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m13292() {
        return this.f949.getStrokeWidth();
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m13293() {
        return this.f949.getColor();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m13294() {
        return this.f9706;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m13295() {
        return this.f9699;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Paint m13296() {
        return this.f949;
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m13297() {
        return this.f9704;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m13298() {
        return this.f9700;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m13299(float f) {
        if (this.f950 != f) {
            this.f950 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m13300(float f) {
        if (this.f9698 != f) {
            this.f9698 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m13301(float f) {
        if (this.f9697 != f) {
            this.f9697 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m13302(float f) {
        if (this.f949.getStrokeWidth() != f) {
            this.f949.setStrokeWidth(f);
            this.f9705 = (float) (((double) (f / 2.0f)) * Math.cos(f9696));
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m13303(@InterfaceC3897 int i) {
        if (i != this.f949.getColor()) {
            this.f949.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m13304(int i) {
        if (i != this.f9706) {
            this.f9706 = i;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m13305(float f) {
        if (f != this.f9699) {
            this.f9699 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m13306(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        if (this.f9704 != f) {
            this.f9704 = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m13307(boolean z) {
        if (this.f9700 != z) {
            this.f9700 = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m13308(boolean z) {
        if (this.f9703 != z) {
            this.f9703 = z;
            invalidateSelf();
        }
    }
}
