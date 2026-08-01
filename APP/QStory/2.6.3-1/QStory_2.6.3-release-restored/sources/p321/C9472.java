package p321;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import java.util.BitSet;
import java.util.Objects;
import p025.AbstractC7012;
import p180.AbstractC8496;
import p181.C8506;
import p181.C8507;
import p315.AbstractC9426;
import p315.AbstractC9427;
import p324.C9480;
import p328.C9488;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9472 extends Drawable implements InterfaceC9448 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C9475[] f24640;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Paint f24641;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float[] f24642;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float[] f24643;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC9474 f24644;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C8506 f24645;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C8507[] f24646;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f24647;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f24648;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C9469 f24649;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f24650;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Paint f24651;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Region f24652;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Region f24653;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f24654;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final RectF f24655;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Path f24656;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public PorterDuffColorFilter f24657;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuffColorFilter f24658;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C9467 f24659;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C9471 f24660;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C9480 f24661;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Paint f24662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final BitSet f24663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC9450[] f24664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f24665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Path f24666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24667;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f24668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C9470 f24669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC9450[] f24670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9471 f24671;

    static {
        Paint paint = new Paint(1);
        f24641 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f24640 = new C9475[4];
        int i = 0;
        while (true) {
            C9475[] c9475Arr = f24640;
            if (i >= c9475Arr.length) {
                return;
            }
            c9475Arr[i] = new C9475(i);
            i++;
        }
    }

    public C9472(C9470 c9470) {
        this.f24671 = new C9471(this);
        this.f24670 = new AbstractC9450[4];
        this.f24664 = new AbstractC9450[4];
        this.f24663 = new BitSet(8);
        this.f24665 = new Matrix();
        this.f24666 = new Path();
        this.f24656 = new Path();
        this.f24655 = new RectF();
        this.f24654 = new RectF();
        this.f24653 = new Region();
        this.f24652 = new Region();
        Paint paint = new Paint(1);
        this.f24651 = paint;
        Paint paint2 = new Paint(1);
        this.f24662 = paint2;
        this.f24661 = new C9480();
        this.f24659 = C9467.m14874();
        this.f24648 = new RectF();
        this.f24647 = true;
        this.f24650 = true;
        this.f24646 = new C8507[4];
        this.f24669 = c9470;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m14894();
        m14896(getState());
        this.f24660 = new C9471(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f24658;
        Paint paint2 = this.f24651;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f24669.f24635;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24657;
        Paint paint3 = this.f24662;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f24669.f24638);
        int alpha2 = paint3.getAlpha();
        int i2 = this.f24669.f24635;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m14906() || !m14901();
        Paint.Style style = this.f24669.f24632;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f24667;
            paint = paint2;
            Path path = this.f24666;
            if (z2) {
                if (z) {
                    m14890(m14904(), path);
                }
                this.f24667 = false;
            }
            if (m14906()) {
                canvas.save();
                canvas.translate((int) (((double) this.f24669.f24631) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24669.f24631)));
                if (this.f24647) {
                    Rect bounds = getBounds();
                    RectF rectF = this.f24648;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        C3775.m6967(rectF, AbstractC0900.m709(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "));
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC7012.m12133(this.f24669.f24629, 2, (int) rectF.width(), iWidth), AbstractC7012.m12133(this.f24669.f24629, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.f24669.f24629;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    m14887(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m14887(canvas);
                    canvas.restore();
                }
            }
            m14886(canvas, paint, path, this.f24669.f24628.mo14851(), this.f24643, m14904());
        } else {
            paint = paint2;
        }
        if (m14898()) {
            if (this.f24668) {
                C9469 c9469M14907 = m14907();
                C9468 c9468M14882 = c9469M14907.m14882();
                InterfaceC9454 interfaceC9454 = c9469M14907.f24612;
                C9471 c9471 = this.f24671;
                c9468M14882.f24600 = c9471.m14884(interfaceC9454);
                c9468M14882.f24599 = c9471.m14884(c9469M14907.f24611);
                c9468M14882.f24605 = c9471.m14884(c9469M14907.f24617);
                c9468M14882.f24606 = c9471.m14884(c9469M14907.f24618);
                this.f24649 = c9468M14882.m14878();
                float[] fArr = this.f24643;
                if (fArr != null) {
                    if (this.f24642 == null) {
                        this.f24642 = new float[fArr.length];
                    }
                    float fM14908 = m14908();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.f24643;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.f24642[i5] = Math.max(0.0f, fArr2[i5] - fM14908);
                        i5++;
                    }
                } else {
                    this.f24642 = null;
                }
                if (z) {
                    C9469 c9469 = this.f24649;
                    float[] fArr3 = this.f24642;
                    float f3 = this.f24669.f24637;
                    RectF rectFM14904 = m14904();
                    RectF rectF2 = this.f24654;
                    rectF2.set(rectFM14904);
                    float fM149082 = m14908();
                    rectF2.inset(fM149082, fM149082);
                    this.f24659.m14876(c9469, fArr3, f3, rectF2, null, this.f24656);
                }
                this.f24668 = false;
            }
            mo7834(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24669.f24635;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f24669;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f24669.getClass();
        RectF rectFM14904 = m14904();
        if (rectFM14904.isEmpty()) {
            return;
        }
        float fM14889 = m14889(rectFM14904, this.f24669.f24628.mo14851(), this.f24643);
        if (fM14889 >= 0.0f) {
            outline.setRoundRect(getBounds(), fM14889 * this.f24669.f24637);
            return;
        }
        boolean z = this.f24667;
        Path path = this.f24666;
        if (z) {
            m14890(rectFM14904, path);
            this.f24667 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC9426.m14793(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC9427.m14794(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC9427.m14794(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f24669.f24634;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f24653;
        region.set(bounds);
        RectF rectFM14904 = m14904();
        Path path = this.f24666;
        m14890(rectFM14904, path);
        Region region2 = this.f24652;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f24667 = true;
        this.f24668 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f24669.f24624;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f24669.getClass();
        ColorStateList colorStateList2 = this.f24669.f24625;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f24669.f24626;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f24669.f24628.mo14849();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f24669 = new C9470(this.f24669);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f24667 = true;
        this.f24668 = true;
        super.onBoundsChange(rect);
        if (!this.f24669.f24628.mo14849() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        C8507[] c8507Arr = this.f24646;
        int length = c8507Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                C8507 c8507 = c8507Arr[i];
                if (c8507 != null && c8507.f21164) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        m14893(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f24669.f24628.mo14849()) {
            m14893(iArr, false);
        }
        boolean z = m14896(iArr) || m14894();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C9470 c9470 = this.f24669;
        if (c9470.f24635 != i) {
            c9470.f24635 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24669.getClass();
        super.invalidateSelf();
    }

    public void setOnCornerSizeChangeListener(InterfaceC9474 interfaceC9474) {
        this.f24644 = interfaceC9474;
    }

    @Override // p321.InterfaceC9448
    public final void setShapeAppearanceModel(C9469 c9469) {
        this.f24669.f24628 = c9469;
        this.f24643 = null;
        this.f24642 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24669.f24624 = colorStateList;
        m14894();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C9470 c9470 = this.f24669;
        if (c9470.f24623 != mode) {
            c9470.f24623 = mode;
            m14894();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14885() {
        C9470 c9470 = this.f24669;
        float f = c9470.f24630 + 0.0f;
        c9470.f24629 = (int) Math.ceil(0.75f * f);
        this.f24669.f24631 = (int) Math.ceil(f * 0.25f);
        m14894();
        if (m14906() || !m14901()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo7834(Canvas canvas) {
        C9469 c9469 = this.f24649;
        float[] fArr = this.f24642;
        RectF rectFM14904 = m14904();
        RectF rectF = this.f24654;
        rectF.set(rectFM14904);
        float fM14908 = m14908();
        rectF.inset(fM14908, fM14908);
        m14886(canvas, this.f24662, this.f24656, c9469, fArr, rectF);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14886(Canvas canvas, Paint paint, Path path, C9469 c9469, float[] fArr, RectF rectF) {
        float fM14889 = m14889(rectF, c9469, fArr);
        if (fM14889 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM14889 * this.f24669.f24637;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14887(Canvas canvas) {
        if (this.f24663.cardinality() > 0) {
            Log.w("飘花落叶言子楪苏兰世哲", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f24669.f24631;
        Path path = this.f24666;
        C9480 c9480 = this.f24661;
        if (i != 0) {
            canvas.drawPath(path, c9480.f24695);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC9450 abstractC9450 = this.f24670[i2];
            int i3 = this.f24669.f24629;
            Matrix matrix = AbstractC9450.f24558;
            abstractC9450.mo14865(matrix, c9480, i3, canvas);
            this.f24664[i2].mo14865(matrix, c9480, this.f24669.f24629, canvas);
        }
        if (this.f24647) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f24669.f24631));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24669.f24631));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f24641);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14888(int i) {
        C9470 c9470 = this.f24669;
        float f = c9470.f24630 + 0.0f + c9470.f24636;
        C9488 c9488 = c9470.f24627;
        return (c9488 != null && c9488.f24755 && AbstractC8496.m13532(i, Opcodes.CONST_METHOD_TYPE) == c9488.f24752) ? c9488.m14917(f, i) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14889(RectF rectF, C9469 c9469, float[] fArr) {
        if (fArr == null) {
            if (c9469.m14883(rectF)) {
                return c9469.f24612.mo14871(rectF);
            }
            return -1.0f;
        }
        if (this.f24650) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14890(RectF rectF, Path path) {
        this.f24659.m14876(this.f24669.f24628.mo14851(), this.f24643, this.f24669.f24637, rectF, this.f24660, path);
        if (this.f24669.f24633 != 1.0f) {
            Matrix matrix = this.f24665;
            matrix.reset();
            float f = this.f24669.f24633;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f24648, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14891() {
        this.f24661.m14910(-12303292);
        this.f24669.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14892(float f) {
        C9470 c9470 = this.f24669;
        if (c9470.f24637 != f) {
            c9470.f24637 = f;
            this.f24667 = true;
            this.f24668 = true;
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[EDGE_INSN: B:55:0x0053->B:27:0x0053 BREAK  A[LOOP:0: B:18:0x003a->B:23:0x0044]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14893(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFM14904 = m14904();
        if (!this.f24669.f24628.mo14849() || rectFM14904.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.f24645 == null);
        if (this.f24643 == null) {
            this.f24643 = new float[4];
        }
        C9469 c9469Mo14853 = this.f24669.f24628.mo14853(iArr);
        float[] fArr = this.f24643;
        if (fArr.length <= 1) {
            z2 = !c9469Mo14853.m14883(m14904());
        } else {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
            if (!c9469Mo14853.m14883(m14904())) {
            }
        }
        this.f24650 = z2;
        if (!z2) {
            this.f24667 = true;
            this.f24668 = true;
        }
        while (i < 4) {
            this.f24659.getClass();
            float fMo14871 = (i != 1 ? i != 2 ? i != 3 ? c9469Mo14853.f24611 : c9469Mo14853.f24612 : c9469Mo14853.f24617 : c9469Mo14853.f24618).mo14871(rectFM14904);
            if (z3) {
                this.f24643[i] = fMo14871;
            }
            C8507[] c8507Arr = this.f24646;
            C8507 c8507 = c8507Arr[i];
            if (c8507 != null) {
                c8507.m13544(fMo14871);
                if (z3) {
                    c8507Arr[i].m13543();
                }
            }
            i++;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean m14894() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24658;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f24657;
        C9470 c9470 = this.f24669;
        ColorStateList colorStateList = c9470.f24624;
        PorterDuff.Mode mode = c9470.f24623;
        if (colorStateList == null || mode == null) {
            int color = this.f24651.getColor();
            int iM14888 = m14888(color);
            porterDuffColorFilter = iM14888 != color ? new PorterDuffColorFilter(iM14888, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m14888(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f24658 = porterDuffColorFilter;
        this.f24669.getClass();
        this.f24657 = null;
        this.f24669.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f24658) && Objects.equals(porterDuffColorFilter3, this.f24657)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14895(InterfaceC9464 interfaceC9464) {
        if (interfaceC9464 instanceof C9469) {
            setShapeAppearanceModel((C9469) interfaceC9464);
            return;
        }
        C9446 c9446 = (C9446) interfaceC9464;
        C9470 c9470 = this.f24669;
        if (c9470.f24628 != c9446) {
            c9470.f24628 = c9446;
            m14893(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m14896(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f24669.f24626 == null || color2 == (colorForState2 = this.f24669.f24626.getColorForState(iArr, (color2 = (paint2 = this.f24651).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f24669.f24625 == null || color == (colorForState = this.f24669.f24625.getColorForState(iArr, (color = (paint = this.f24662).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14897(Context context) {
        this.f24669.f24627 = new C9488(context);
        m14885();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m14898() {
        Paint.Style style = this.f24669.f24632;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24662.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14899(float f) {
        C9470 c9470 = this.f24669;
        if (c9470.f24630 != f) {
            c9470.f24630 = f;
            m14885();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14900(ColorStateList colorStateList) {
        C9470 c9470 = this.f24669;
        if (c9470.f24626 != colorStateList) {
            c9470.f24626 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14901() {
        if (this.f24669.f24628.mo14853(getState()).m14883(m14904())) {
            return this.f24643 == null || this.f24650;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14902(C8506 c8506) {
        if (this.f24645 == c8506) {
            return;
        }
        this.f24645 = c8506;
        int i = 0;
        while (true) {
            C8507[] c8507Arr = this.f24646;
            if (i >= c8507Arr.length) {
                m14893(getState(), true);
                invalidateSelf();
                return;
            }
            if (c8507Arr[i] == null) {
                c8507Arr[i] = new C8507(this, f24640[i]);
            }
            C8507 c8507 = c8507Arr[i];
            C8506 c85062 = new C8506();
            float f = (float) c8506.f21188;
            if (f < 0.0f) {
                C6755.m11869("Damping ratio must be non-negative");
                return;
            }
            c85062.f21188 = f;
            c85062.f21187 = false;
            double d = c8506.f21189;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                C6755.m11869("Spring stiffness constant must be positive.");
                return;
            }
            c85062.f21189 = Math.sqrt(f2);
            c85062.f21187 = false;
            c8507.f21195 = c85062;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m14903() {
        float[] fArr = this.f24643;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM14904 = m14904();
        C9469 c9469M14907 = m14907();
        C9467 c9467 = this.f24659;
        c9467.getClass();
        float fMo14871 = c9469M14907.f24612.mo14871(rectFM14904);
        C9469 c9469M149072 = m14907();
        c9467.getClass();
        float fMo148712 = c9469M149072.f24617.mo14871(rectFM14904) + fMo14871;
        C9469 c9469M149073 = m14907();
        c9467.getClass();
        float fMo148713 = fMo148712 - c9469M149073.f24618.mo14871(rectFM14904);
        C9469 c9469M149074 = m14907();
        c9467.getClass();
        return (fMo148713 - c9469M149074.f24611.mo14871(rectFM14904)) / 2.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final RectF m14904() {
        Rect bounds = getBounds();
        RectF rectF = this.f24655;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m14905() {
        float[] fArr = this.f24643;
        return fArr != null ? fArr[3] : this.f24669.f24628.mo14851().f24612.mo14871(m14904());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14906() {
        C9470 c9470 = this.f24669;
        c9470.getClass();
        return c9470.f24629 > 0 && !m14901() && !this.f24666.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9469 m14907() {
        return this.f24669.f24628.mo14851();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m14908() {
        if (m14898()) {
            return this.f24662.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public C9472(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C9469.m14880(context, attributeSet, i, i2).m14878());
    }

    public C9472(C9469 c9469) {
        this(new C9470(c9469));
    }

    public C9472(InterfaceC9464 interfaceC9464) {
        this(new C9470(interfaceC9464));
    }

    public C9472() {
        this(new C9469());
    }
}
