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
import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import java.util.BitSet;
import java.util.Objects;
import p009.AbstractC6183;
import p164.AbstractC7667;
import p165.C7677;
import p165.C7678;
import p299.AbstractC8597;
import p299.AbstractC8598;
import p308.C8651;
import p312.C8659;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8643 extends Drawable implements InterfaceC8619 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C8646[] f24295;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Paint f24296;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public float[] f24297;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public float[] f24298;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public InterfaceC8645 f24299;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C7677 f24300;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C7678[] f24301;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f24302;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final RectF f24303;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C8640 f24304;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f24305;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Paint f24306;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Region f24307;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Region f24308;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f24309;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final RectF f24310;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Path f24311;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public PorterDuffColorFilter f24312;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public PorterDuffColorFilter f24313;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C8638 f24314;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C8642 f24315;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C8651 f24316;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Paint f24317;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final BitSet f24318;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC8621[] f24319;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f24320;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Path f24321;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24322;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f24323;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8641 f24324;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC8621[] f24325;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8642 f24326;

    static {
        Paint paint = new Paint(1);
        f24296 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f24295 = new C8646[4];
        int i = 0;
        while (true) {
            C8646[] c8646Arr = f24295;
            if (i >= c8646Arr.length) {
                return;
            }
            c8646Arr[i] = new C8646(i);
            i++;
        }
    }

    public C8643(C8641 c8641) {
        this.f24326 = new C8642(this);
        this.f24325 = new AbstractC8621[4];
        this.f24319 = new AbstractC8621[4];
        this.f24318 = new BitSet(8);
        this.f24320 = new Matrix();
        this.f24321 = new Path();
        this.f24311 = new Path();
        this.f24310 = new RectF();
        this.f24309 = new RectF();
        this.f24308 = new Region();
        this.f24307 = new Region();
        Paint paint = new Paint(1);
        this.f24306 = paint;
        Paint paint2 = new Paint(1);
        this.f24317 = paint2;
        this.f24316 = new C8651();
        this.f24314 = C8638.m14315();
        this.f24303 = new RectF();
        this.f24302 = true;
        this.f24305 = true;
        this.f24301 = new C7678[4];
        this.f24324 = c8641;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m14335();
        m14337(getState());
        this.f24315 = new C8642(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f24313;
        Paint paint2 = this.f24306;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f24324.f24290;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24312;
        Paint paint3 = this.f24317;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f24324.f24293);
        int alpha2 = paint3.getAlpha();
        int i2 = this.f24324.f24290;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m14347() || !m14342();
        Paint.Style style = this.f24324.f24287;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f24322;
            paint = paint2;
            Path path = this.f24321;
            if (z2) {
                if (z) {
                    m14331(m14345(), path);
                }
                this.f24322 = false;
            }
            if (m14347()) {
                canvas.save();
                canvas.translate((int) (((double) this.f24324.f24286) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24324.f24286)));
                if (this.f24302) {
                    Rect bounds = getBounds();
                    RectF rectF = this.f24303;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        C2942.m6407(rectF, AbstractC0053.m149(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "));
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC6183.m11574(this.f24324.f24284, 2, (int) rectF.width(), iWidth), AbstractC6183.m11574(this.f24324.f24284, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.f24324.f24284;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    m14328(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m14328(canvas);
                    canvas.restore();
                }
            }
            m14327(canvas, paint, path, this.f24324.f24283.mo14292(), this.f24298, m14345());
        } else {
            paint = paint2;
        }
        if (m14339()) {
            if (this.f24323) {
                C8640 c8640M14348 = m14348();
                C8639 c8639M14323 = c8640M14348.m14323();
                InterfaceC8625 interfaceC8625 = c8640M14348.f24267;
                C8642 c8642 = this.f24326;
                c8639M14323.f24255 = c8642.m14325(interfaceC8625);
                c8639M14323.f24254 = c8642.m14325(c8640M14348.f24266);
                c8639M14323.f24260 = c8642.m14325(c8640M14348.f24272);
                c8639M14323.f24261 = c8642.m14325(c8640M14348.f24273);
                this.f24304 = c8639M14323.m14319();
                float[] fArr = this.f24298;
                if (fArr != null) {
                    if (this.f24297 == null) {
                        this.f24297 = new float[fArr.length];
                    }
                    float fM14349 = m14349();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.f24298;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.f24297[i5] = Math.max(0.0f, fArr2[i5] - fM14349);
                        i5++;
                    }
                } else {
                    this.f24297 = null;
                }
                if (z) {
                    C8640 c8640 = this.f24304;
                    float[] fArr3 = this.f24297;
                    float f3 = this.f24324.f24292;
                    RectF rectFM14345 = m14345();
                    RectF rectF2 = this.f24309;
                    rectF2.set(rectFM14345);
                    float fM143492 = m14349();
                    rectF2.inset(fM143492, fM143492);
                    this.f24314.m14317(c8640, fArr3, f3, rectF2, null, this.f24311);
                }
                this.f24323 = false;
            }
            mo7275(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24324.f24290;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f24324;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f24324.getClass();
        RectF rectFM14345 = m14345();
        if (rectFM14345.isEmpty()) {
            return;
        }
        float fM14330 = m14330(rectFM14345, this.f24324.f24283.mo14292(), this.f24298);
        if (fM14330 >= 0.0f) {
            outline.setRoundRect(getBounds(), fM14330 * this.f24324.f24292);
            return;
        }
        boolean z = this.f24322;
        Path path = this.f24321;
        if (z) {
            m14331(rectFM14345, path);
            this.f24322 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC8597.m14234(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC8598.m14235(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC8598.m14235(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f24324.f24289;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f24308;
        region.set(bounds);
        RectF rectFM14345 = m14345();
        Path path = this.f24321;
        m14331(rectFM14345, path);
        Region region2 = this.f24307;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f24322 = true;
        this.f24323 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f24324.f24279;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f24324.getClass();
        ColorStateList colorStateList2 = this.f24324.f24280;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f24324.f24281;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f24324.f24283.mo14290();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f24324 = new C8641(this.f24324);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f24322 = true;
        this.f24323 = true;
        super.onBoundsChange(rect);
        if (!this.f24324.f24283.mo14290() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        C7678[] c7678Arr = this.f24301;
        int length = c7678Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                C7678 c7678 = c7678Arr[i];
                if (c7678 != null && c7678.f20819) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        m14334(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f24324.f24283.mo14290()) {
            m14334(iArr, false);
        }
        boolean z = m14337(iArr) || m14335();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C8641 c8641 = this.f24324;
        if (c8641.f24290 != i) {
            c8641.f24290 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24324.getClass();
        super.invalidateSelf();
    }

    public void setOnCornerSizeChangeListener(InterfaceC8645 interfaceC8645) {
        this.f24299 = interfaceC8645;
    }

    @Override // p305.InterfaceC8619
    public final void setShapeAppearanceModel(C8640 c8640) {
        this.f24324.f24283 = c8640;
        this.f24298 = null;
        this.f24297 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24324.f24279 = colorStateList;
        m14335();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C8641 c8641 = this.f24324;
        if (c8641.f24278 != mode) {
            c8641.f24278 = mode;
            m14335();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14326() {
        C8641 c8641 = this.f24324;
        float f = c8641.f24285 + 0.0f;
        c8641.f24284 = (int) Math.ceil(0.75f * f);
        this.f24324.f24286 = (int) Math.ceil(f * 0.25f);
        m14335();
        if (m14347() || !m14342()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo7275(Canvas canvas) {
        C8640 c8640 = this.f24304;
        float[] fArr = this.f24297;
        RectF rectFM14345 = m14345();
        RectF rectF = this.f24309;
        rectF.set(rectFM14345);
        float fM14349 = m14349();
        rectF.inset(fM14349, fM14349);
        m14327(canvas, this.f24317, this.f24311, c8640, fArr, rectF);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14327(Canvas canvas, Paint paint, Path path, C8640 c8640, float[] fArr, RectF rectF) {
        float fM14330 = m14330(rectF, c8640, fArr);
        if (fM14330 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM14330 * this.f24324.f24292;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14328(Canvas canvas) {
        if (this.f24318.cardinality() > 0) {
            Log.w("飘花落叶言子楪苏兰世哲", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f24324.f24286;
        Path path = this.f24321;
        C8651 c8651 = this.f24316;
        if (i != 0) {
            canvas.drawPath(path, c8651.f24350);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC8621 abstractC8621 = this.f24325[i2];
            int i3 = this.f24324.f24284;
            Matrix matrix = AbstractC8621.f24213;
            abstractC8621.mo14306(matrix, c8651, i3, canvas);
            this.f24319[i2].mo14306(matrix, c8651, this.f24324.f24284, canvas);
        }
        if (this.f24302) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f24324.f24286));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f24324.f24286));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f24296);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m14329(int i) {
        C8641 c8641 = this.f24324;
        float f = c8641.f24285 + 0.0f + c8641.f24291;
        C8659 c8659 = c8641.f24282;
        return (c8659 != null && c8659.f24410 && AbstractC7667.m12973(i, Opcodes.CONST_METHOD_TYPE) == c8659.f24407) ? c8659.m14358(f, i) : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m14330(RectF rectF, C8640 c8640, float[] fArr) {
        if (fArr == null) {
            if (c8640.m14324(rectF)) {
                return c8640.f24267.mo14312(rectF);
            }
            return -1.0f;
        }
        if (this.f24305) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14331(RectF rectF, Path path) {
        this.f24314.m14317(this.f24324.f24283.mo14292(), this.f24298, this.f24324.f24292, rectF, this.f24315, path);
        if (this.f24324.f24288 != 1.0f) {
            Matrix matrix = this.f24320;
            matrix.reset();
            float f = this.f24324.f24288;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f24303, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14332() {
        this.f24316.m14351(-12303292);
        this.f24324.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14333(float f) {
        C8641 c8641 = this.f24324;
        if (c8641.f24292 != f) {
            c8641.f24292 = f;
            this.f24322 = true;
            this.f24323 = true;
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
    public final void m14334(int[] r9, boolean r10) {
        /*
            r8 = this;
            android.graphics.RectF r0 = r8.m14345()
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r1 = r8.f24324
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r1.f24283
            boolean r1 = r1.mo14290()
            if (r1 == 0) goto L98
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L98
        L16:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世兰哲 r1 = r8.f24300
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r10 = r10 | r1
            float[] r1 = r8.f24298
            r4 = 4
            if (r1 != 0) goto L29
            float[] r1 = new float[r4]
            r8.f24298 = r1
        L29:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r1 = r8.f24324
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r1 = r1.f24283
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r9 = r1.mo14294(r9)
            float[] r1 = r8.f24298
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
            android.graphics.RectF r1 = r8.m14345()
            boolean r1 = r9.m14324(r1)
            if (r1 == 0) goto L53
            r1 = r3
            goto L54
        L53:
            r1 = r2
        L54:
            r8.f24305 = r1
            if (r1 != 0) goto L5c
            r8.f24322 = r3
            r8.f24323 = r3
        L5c:
            if (r2 >= r4) goto L93
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲兰苏世 r1 = r8.f24314
            r1.getClass()
            if (r2 == r3) goto L74
            r1 = 2
            if (r2 == r1) goto L71
            r1 = 3
            if (r2 == r1) goto L6e
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24266
            goto L76
        L6e:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24267
            goto L76
        L71:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24272
            goto L76
        L74:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r1 = r9.f24273
        L76:
            float r1 = r1.mo14312(r0)
            if (r10 == 0) goto L80
            float[] r5 = r8.f24298
            r5[r2] = r1
        L80:
            飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰[] r5 = r8.f24301
            r6 = r5[r2]
            if (r6 == 0) goto L90
            r6.m12985(r1)
            if (r10 == 0) goto L90
            r1 = r5[r2]
            r1.m12984()
        L90:
            int r2 = r2 + 1
            goto L5c
        L93:
            if (r10 == 0) goto L98
            r8.invalidateSelf()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305.C8643.m14334(int[], boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean m14335() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24313;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f24312;
        C8641 c8641 = this.f24324;
        ColorStateList colorStateList = c8641.f24279;
        PorterDuff.Mode mode = c8641.f24278;
        if (colorStateList == null || mode == null) {
            int color = this.f24306.getColor();
            int iM14329 = m14329(color);
            porterDuffColorFilter = iM14329 != color ? new PorterDuffColorFilter(iM14329, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m14329(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f24313 = porterDuffColorFilter;
        this.f24324.getClass();
        this.f24312 = null;
        this.f24324.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f24313) && Objects.equals(porterDuffColorFilter3, this.f24312)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14336(InterfaceC8635 interfaceC8635) {
        if (interfaceC8635 instanceof C8640) {
            setShapeAppearanceModel((C8640) interfaceC8635);
            return;
        }
        C8617 c8617 = (C8617) interfaceC8635;
        C8641 c8641 = this.f24324;
        if (c8641.f24283 != c8617) {
            c8641.f24283 = c8617;
            m14334(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m14337(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f24324.f24281 == null || color2 == (colorForState2 = this.f24324.f24281.getColorForState(iArr, (color2 = (paint2 = this.f24306).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f24324.f24280 == null || color == (colorForState = this.f24324.f24280.getColorForState(iArr, (color = (paint = this.f24317).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14338(Context context) {
        this.f24324.f24282 = new C8659(context);
        m14326();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m14339() {
        Paint.Style style = this.f24324.f24287;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24317.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14340(float f) {
        C8641 c8641 = this.f24324;
        if (c8641.f24285 != f) {
            c8641.f24285 = f;
            m14326();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14341(ColorStateList colorStateList) {
        C8641 c8641 = this.f24324;
        if (c8641.f24281 != colorStateList) {
            c8641.f24281 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14342() {
        if (this.f24324.f24283.mo14294(getState()).m14324(m14345())) {
            return this.f24298 == null || this.f24305;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14343(C7677 c7677) {
        if (this.f24300 == c7677) {
            return;
        }
        this.f24300 = c7677;
        int i = 0;
        while (true) {
            C7678[] c7678Arr = this.f24301;
            if (i >= c7678Arr.length) {
                m14334(getState(), true);
                invalidateSelf();
                return;
            }
            if (c7678Arr[i] == null) {
                c7678Arr[i] = new C7678(this, f24295[i]);
            }
            C7678 c7678 = c7678Arr[i];
            C7677 c76772 = new C7677();
            float f = (float) c7677.f20843;
            if (f < 0.0f) {
                C5925.m11310("Damping ratio must be non-negative");
                return;
            }
            c76772.f20843 = f;
            c76772.f20842 = false;
            double d = c7677.f20844;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                C5925.m11310("Spring stiffness constant must be positive.");
                return;
            }
            c76772.f20844 = Math.sqrt(f2);
            c76772.f20842 = false;
            c7678.f20850 = c76772;
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m14344() {
        float[] fArr = this.f24298;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM14345 = m14345();
        C8640 c8640M14348 = m14348();
        C8638 c8638 = this.f24314;
        c8638.getClass();
        float fMo14312 = c8640M14348.f24267.mo14312(rectFM14345);
        C8640 c8640M143482 = m14348();
        c8638.getClass();
        float fMo143122 = c8640M143482.f24272.mo14312(rectFM14345) + fMo14312;
        C8640 c8640M143483 = m14348();
        c8638.getClass();
        float fMo143123 = fMo143122 - c8640M143483.f24273.mo14312(rectFM14345);
        C8640 c8640M143484 = m14348();
        c8638.getClass();
        return (fMo143123 - c8640M143484.f24266.mo14312(rectFM14345)) / 2.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final RectF m14345() {
        Rect bounds = getBounds();
        RectF rectF = this.f24310;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float m14346() {
        float[] fArr = this.f24298;
        return fArr != null ? fArr[3] : this.f24324.f24283.mo14292().f24267.mo14312(m14345());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14347() {
        C8641 c8641 = this.f24324;
        c8641.getClass();
        return c8641.f24284 > 0 && !m14342() && !this.f24321.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8640 m14348() {
        return this.f24324.f24283.mo14292();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float m14349() {
        if (m14339()) {
            return this.f24317.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public C8643(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C8640.m14321(context, attributeSet, i, i2).m14319());
    }

    public C8643(C8640 c8640) {
        this(new C8641(c8640));
    }

    public C8643(InterfaceC8635 interfaceC8635) {
        this(new C8641(interfaceC8635));
    }

    public C8643() {
        this(new C8640());
    }
}
