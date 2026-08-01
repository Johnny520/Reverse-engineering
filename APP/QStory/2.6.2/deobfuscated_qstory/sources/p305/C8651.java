package p305;

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
import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import com.android.dx.io.Opcodes;
import java.util.BitSet;
import java.util.Objects;
import p007.AbstractC6136;
import p164.AbstractC7666;
import p165.C7676;
import p165.C7677;
import p299.AbstractC8605;
import p299.AbstractC8606;
import p308.C8659;
import p312.C8667;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8651 extends Drawable implements InterfaceC8627 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C8654[] f24304;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Paint f24305;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float[] f24306;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float[] f24307;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC8653 f24308;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C7676 f24309;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7677[] f24310;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f24311;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f24312;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C8648 f24313;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f24314;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Paint f24315;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Region f24316;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Region f24317;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f24318;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final RectF f24319;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Path f24320;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public PorterDuffColorFilter f24321;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuffColorFilter f24322;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8646 f24323;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C8650 f24324;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C8659 f24325;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Paint f24326;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final BitSet f24327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC8629[] f24328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f24329;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Path f24330;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24331;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f24332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8649 f24333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC8629[] f24334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8650 f24335;

    static {
        Paint paint = new Paint(1);
        f24305 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f24304 = new C8654[4];
        int i = 0;
        while (true) {
            C8654[] c8654Arr = f24304;
            if (i >= c8654Arr.length) {
                return;
            }
            c8654Arr[i] = new C8654(i);
            i++;
        }
    }

    public C8651(C8649 c8649) {
        this.f24335 = new C8650(this);
        this.f24334 = new AbstractC8629[4];
        this.f24328 = new AbstractC8629[4];
        this.f24327 = new BitSet(8);
        this.f24329 = new Matrix();
        this.f24330 = new Path();
        this.f24320 = new Path();
        this.f24319 = new RectF();
        this.f24318 = new RectF();
        this.f24317 = new Region();
        this.f24316 = new Region();
        Paint paint = new Paint(1);
        this.f24315 = paint;
        Paint paint2 = new Paint(1);
        this.f24326 = paint2;
        this.f24325 = new C8659();
        this.f24323 = C8646.m14297();
        this.f24312 = new RectF();
        this.f24311 = true;
        this.f24314 = true;
        this.f24310 = new C7677[4];
        this.f24333 = c8649;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m14317();
        m14319(getState());
        this.f24324 = new C8650(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f24322;
        Paint paint2 = this.f24315;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f24333.f24299;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24321;
        Paint paint3 = this.f24326;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f24333.f24302);
        int alpha2 = paint3.getAlpha();
        int i2 = this.f24333.f24299;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m14329() || !m14324();
        Paint.Style style = this.f24333.f24296;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f24331;
            paint = paint2;
            Path path = this.f24330;
            if (z2) {
                if (z) {
                    m14313(m14327(), path);
                }
                this.f24331 = false;
            }
            if (m14329()) {
                canvas.save();
                canvas.translate((int) (((double) this.f24333.f24295) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24333.f24295)));
                if (this.f24311) {
                    Rect bounds = getBounds();
                    RectF rectF = this.f24312;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        C2941.m6349(rectF, AbstractC0053.m151(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "));
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC6136.m11541(this.f24333.f24293, 2, (int) rectF.width(), iWidth), AbstractC6136.m11541(this.f24333.f24293, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.f24333.f24293;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    m14310(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m14310(canvas);
                    canvas.restore();
                }
            }
            m14309(canvas, paint, path, this.f24333.f24292.mo14273(), this.f24307, m14327());
        } else {
            paint = paint2;
        }
        if (m14321()) {
            if (this.f24332) {
                C8648 c8648M14330 = m14330();
                C8647 c8647M14305 = c8648M14330.m14305();
                InterfaceC8633 interfaceC8633 = c8648M14330.f24276;
                C8650 c8650 = this.f24335;
                c8647M14305.f24264 = c8650.m14307(interfaceC8633);
                c8647M14305.f24263 = c8650.m14307(c8648M14330.f24275);
                c8647M14305.f24269 = c8650.m14307(c8648M14330.f24281);
                c8647M14305.f24270 = c8650.m14307(c8648M14330.f24282);
                this.f24313 = c8647M14305.m14301();
                float[] fArr = this.f24307;
                if (fArr != null) {
                    if (this.f24306 == null) {
                        this.f24306 = new float[fArr.length];
                    }
                    float fM14331 = m14331();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.f24307;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.f24306[i5] = Math.max(0.0f, fArr2[i5] - fM14331);
                        i5++;
                    }
                } else {
                    this.f24306 = null;
                }
                if (z) {
                    C8648 c8648 = this.f24313;
                    float[] fArr3 = this.f24306;
                    float f3 = this.f24333.f24301;
                    RectF rectFM14327 = m14327();
                    RectF rectF2 = this.f24318;
                    rectF2.set(rectFM14327);
                    float fM143312 = m14331();
                    rectF2.inset(fM143312, fM143312);
                    this.f24323.m14299(c8648, fArr3, f3, rectF2, null, this.f24320);
                }
                this.f24332 = false;
            }
            mo7288(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24333.f24299;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f24333;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f24333.getClass();
        RectF rectFM14327 = m14327();
        if (rectFM14327.isEmpty()) {
            return;
        }
        float fM14312 = m14312(rectFM14327, this.f24333.f24292.mo14273(), this.f24307);
        if (fM14312 >= 0.0f) {
            outline.setRoundRect(getBounds(), fM14312 * this.f24333.f24301);
            return;
        }
        boolean z = this.f24331;
        Path path = this.f24330;
        if (z) {
            m14313(rectFM14327, path);
            this.f24331 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC8605.m14215(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC8606.m14216(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC8606.m14216(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f24333.f24298;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f24317;
        region.set(bounds);
        RectF rectFM14327 = m14327();
        Path path = this.f24330;
        m14313(rectFM14327, path);
        Region region2 = this.f24316;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f24331 = true;
        this.f24332 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f24333.f24288;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f24333.getClass();
        ColorStateList colorStateList2 = this.f24333.f24289;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f24333.f24290;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f24333.f24292.mo14271();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f24333 = new C8649(this.f24333);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f24331 = true;
        this.f24332 = true;
        super.onBoundsChange(rect);
        if (!this.f24333.f24292.mo14271() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        C7677[] c7677Arr = this.f24310;
        int length = c7677Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                C7677 c7677 = c7677Arr[i];
                if (c7677 != null && c7677.f20824) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        m14316(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f24333.f24292.mo14271()) {
            m14316(iArr, false);
        }
        boolean z = m14319(iArr) || m14317();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C8649 c8649 = this.f24333;
        if (c8649.f24299 != i) {
            c8649.f24299 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24333.getClass();
        super.invalidateSelf();
    }

    public void setOnCornerSizeChangeListener(InterfaceC8653 interfaceC8653) {
        this.f24308 = interfaceC8653;
    }

    @Override // p305.InterfaceC8627
    public final void setShapeAppearanceModel(C8648 c8648) {
        this.f24333.f24292 = c8648;
        this.f24307 = null;
        this.f24306 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24333.f24288 = colorStateList;
        m14317();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C8649 c8649 = this.f24333;
        if (c8649.f24287 != mode) {
            c8649.f24287 = mode;
            m14317();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14308() {
        C8649 c8649 = this.f24333;
        float f = c8649.f24294 + 0.0f;
        c8649.f24293 = (int) Math.ceil(0.75f * f);
        this.f24333.f24295 = (int) Math.ceil(f * 0.25f);
        m14317();
        if (m14329() || !m14324()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo7288(Canvas canvas) {
        C8648 c8648 = this.f24313;
        float[] fArr = this.f24306;
        RectF rectFM14327 = m14327();
        RectF rectF = this.f24318;
        rectF.set(rectFM14327);
        float fM14331 = m14331();
        rectF.inset(fM14331, fM14331);
        m14309(canvas, this.f24326, this.f24320, c8648, fArr, rectF);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14309(Canvas canvas, Paint paint, Path path, C8648 c8648, float[] fArr, RectF rectF) {
        float fM14312 = m14312(rectF, c8648, fArr);
        if (fM14312 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM14312 * this.f24333.f24301;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14310(Canvas canvas) {
        if (this.f24327.cardinality() > 0) {
            Log.w("飘花落叶言子楪苏兰世哲", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f24333.f24295;
        Path path = this.f24330;
        C8659 c8659 = this.f24325;
        if (i != 0) {
            canvas.drawPath(path, c8659.f24359);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC8629 abstractC8629 = this.f24334[i2];
            int i3 = this.f24333.f24293;
            Matrix matrix = AbstractC8629.f24222;
            abstractC8629.mo14287(matrix, c8659, i3, canvas);
            this.f24328[i2].mo14287(matrix, c8659, this.f24333.f24293, canvas);
        }
        if (this.f24311) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f24333.f24295));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24333.f24295));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f24305);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14311(int i) {
        C8649 c8649 = this.f24333;
        float f = c8649.f24294 + 0.0f + c8649.f24300;
        C8667 c8667 = c8649.f24291;
        return (c8667 != null && c8667.f24419 && AbstractC7666.m12944(i, Opcodes.CONST_METHOD_TYPE) == c8667.f24416) ? c8667.m14340(f, i) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14312(RectF rectF, C8648 c8648, float[] fArr) {
        if (fArr == null) {
            if (c8648.m14306(rectF)) {
                return c8648.f24276.mo14294(rectF);
            }
            return -1.0f;
        }
        if (this.f24314) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14313(RectF rectF, Path path) {
        this.f24323.m14299(this.f24333.f24292.mo14273(), this.f24307, this.f24333.f24301, rectF, this.f24324, path);
        if (this.f24333.f24297 != 1.0f) {
            Matrix matrix = this.f24329;
            matrix.reset();
            float f = this.f24333.f24297;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f24312, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14314() {
        this.f24325.m14333(-12303292);
        this.f24333.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14315(float f) {
        C8649 c8649 = this.f24333;
        if (c8649.f24301 != f) {
            c8649.f24301 = f;
            this.f24331 = true;
            this.f24332 = true;
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[EDGE_INSN: B:55:0x0053->B:27:0x0053 BREAK  A[LOOP:0: B:18:0x003a->B:23:0x0044]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14316(int[] r9, boolean r10) {
        /*
            r8 = this;
            android.graphics.RectF r0 = r8.m14327()
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r1 = r8.f24333
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r1.f24292
            boolean r1 = r1.mo14271()
            if (r1 == 0) goto L98
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L98
        L16:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r8.f24309
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r10 = r10 | r1
            float[] r1 = r8.f24307
            r4 = 4
            if (r1 != 0) goto L29
            float[] r1 = new float[r4]
            r8.f24307 = r1
        L29:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r1 = r8.f24333
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r1.f24292
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r9 = r1.mo14275(r9)
            float[] r1 = r8.f24307
            int r5 = r1.length
            if (r5 > r3) goto L37
            goto L47
        L37:
            r5 = r1[r2]
            r6 = r3
        L3a:
            int r7 = r1.length
            if (r6 >= r7) goto L47
            r7 = r1[r6]
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L44
            goto L53
        L44:
            int r6 = r6 + 1
            goto L3a
        L47:
            android.graphics.RectF r1 = r8.m14327()
            boolean r1 = r9.m14306(r1)
            if (r1 == 0) goto L53
            r1 = r3
            goto L54
        L53:
            r1 = r2
        L54:
            r8.f24314 = r1
            if (r1 != 0) goto L5c
            r8.f24331 = r3
            r8.f24332 = r3
        L5c:
            if (r2 >= r4) goto L93
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲兰苏世 r1 = r8.f24323
            r1.getClass()
            if (r2 == r3) goto L74
            r1 = 2
            if (r2 == r1) goto L71
            r1 = 3
            if (r2 == r1) goto L6e
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24275
            goto L76
        L6e:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24276
            goto L76
        L71:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24281
            goto L76
        L74:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24282
        L76:
            float r1 = r1.mo14294(r0)
            if (r10 == 0) goto L80
            float[] r5 = r8.f24307
            r5[r2] = r1
        L80:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰[] r5 = r8.f24310
            r6 = r5[r2]
            if (r6 == 0) goto L90
            r6.m12956(r1)
            if (r10 == 0) goto L90
            r1 = r5[r2]
            r1.m12955()
        L90:
            int r2 = r2 + 1
            goto L5c
        L93:
            if (r10 == 0) goto L98
            r8.invalidateSelf()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305.C8651.m14316(int[], boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean m14317() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24322;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f24321;
        C8649 c8649 = this.f24333;
        ColorStateList colorStateList = c8649.f24288;
        PorterDuff.Mode mode = c8649.f24287;
        if (colorStateList == null || mode == null) {
            int color = this.f24315.getColor();
            int iM14311 = m14311(color);
            porterDuffColorFilter = iM14311 != color ? new PorterDuffColorFilter(iM14311, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m14311(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f24322 = porterDuffColorFilter;
        this.f24333.getClass();
        this.f24321 = null;
        this.f24333.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f24322) && Objects.equals(porterDuffColorFilter3, this.f24321)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14318(InterfaceC8643 interfaceC8643) {
        if (interfaceC8643 instanceof C8648) {
            setShapeAppearanceModel((C8648) interfaceC8643);
            return;
        }
        C8625 c8625 = (C8625) interfaceC8643;
        C8649 c8649 = this.f24333;
        if (c8649.f24292 != c8625) {
            c8649.f24292 = c8625;
            m14316(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m14319(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f24333.f24290 == null || color2 == (colorForState2 = this.f24333.f24290.getColorForState(iArr, (color2 = (paint2 = this.f24315).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f24333.f24289 == null || color == (colorForState = this.f24333.f24289.getColorForState(iArr, (color = (paint = this.f24326).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14320(Context context) {
        this.f24333.f24291 = new C8667(context);
        m14308();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m14321() {
        Paint.Style style = this.f24333.f24296;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24326.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14322(float f) {
        C8649 c8649 = this.f24333;
        if (c8649.f24294 != f) {
            c8649.f24294 = f;
            m14308();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14323(ColorStateList colorStateList) {
        C8649 c8649 = this.f24333;
        if (c8649.f24290 != colorStateList) {
            c8649.f24290 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14324() {
        if (this.f24333.f24292.mo14275(getState()).m14306(m14327())) {
            return this.f24307 == null || this.f24314;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14325(C7676 c7676) {
        if (this.f24309 == c7676) {
            return;
        }
        this.f24309 = c7676;
        int i = 0;
        while (true) {
            C7677[] c7677Arr = this.f24310;
            if (i >= c7677Arr.length) {
                m14316(getState(), true);
                invalidateSelf();
                return;
            }
            if (c7677Arr[i] == null) {
                c7677Arr[i] = new C7677(this, f24304[i]);
            }
            C7677 c7677 = c7677Arr[i];
            C7676 c76762 = new C7676();
            float f = (float) c7676.f20848;
            if (f < 0.0f) {
                C5919.m11249("Damping ratio must be non-negative");
                return;
            }
            c76762.f20848 = f;
            c76762.f20847 = false;
            double d = c7676.f20849;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                C5919.m11249("Spring stiffness constant must be positive.");
                return;
            }
            c76762.f20849 = Math.sqrt(f2);
            c76762.f20847 = false;
            c7677.f20855 = c76762;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m14326() {
        float[] fArr = this.f24307;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM14327 = m14327();
        C8648 c8648M14330 = m14330();
        C8646 c8646 = this.f24323;
        c8646.getClass();
        float fMo14294 = c8648M14330.f24276.mo14294(rectFM14327);
        C8648 c8648M143302 = m14330();
        c8646.getClass();
        float fMo142942 = c8648M143302.f24281.mo14294(rectFM14327) + fMo14294;
        C8648 c8648M143303 = m14330();
        c8646.getClass();
        float fMo142943 = fMo142942 - c8648M143303.f24282.mo14294(rectFM14327);
        C8648 c8648M143304 = m14330();
        c8646.getClass();
        return (fMo142943 - c8648M143304.f24275.mo14294(rectFM14327)) / 2.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final RectF m14327() {
        Rect bounds = getBounds();
        RectF rectF = this.f24319;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m14328() {
        float[] fArr = this.f24307;
        return fArr != null ? fArr[3] : this.f24333.f24292.mo14273().f24276.mo14294(m14327());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14329() {
        C8649 c8649 = this.f24333;
        c8649.getClass();
        return c8649.f24293 > 0 && !m14324() && !this.f24330.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8648 m14330() {
        return this.f24333.f24292.mo14273();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m14331() {
        if (m14321()) {
            return this.f24326.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public C8651(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C8648.m14303(context, attributeSet, i, i2).m14301());
    }

    public C8651(C8648 c8648) {
        this(new C8649(c8648));
    }

    public C8651(InterfaceC8643 interfaceC8643) {
        this(new C8649(interfaceC8643));
    }

    public C8651() {
        this(new C8648());
    }
}
