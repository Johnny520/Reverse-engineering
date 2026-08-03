package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0824sc;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.dg */
/* JADX INFO: loaded from: classes.dex */
public final class C0543dg extends AbstractC0524cg {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f1956j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public g f1957b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f1958c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f1959d;

    /* JADX INFO: renamed from: e */
    public boolean f1960e;

    /* JADX INFO: renamed from: f */
    public boolean f1961f;

    /* JADX INFO: renamed from: g */
    public final float[] f1962g;

    /* JADX INFO: renamed from: h */
    public final Matrix f1963h;

    /* JADX INFO: renamed from: i */
    public final Rect f1964i;

    /* JADX INFO: renamed from: a.dg$a */
    public static class a extends e {
    }

    /* JADX INFO: renamed from: a.dg$b */
    public static class b extends e {

        /* JADX INFO: renamed from: d */
        public C0948z3 f1965d;

        /* JADX INFO: renamed from: f */
        public C0948z3 f1967f;

        /* JADX INFO: renamed from: e */
        public float f1966e = 0.0f;

        /* JADX INFO: renamed from: g */
        public float f1968g = 1.0f;

        /* JADX INFO: renamed from: h */
        public float f1969h = 1.0f;

        /* JADX INFO: renamed from: i */
        public float f1970i = 0.0f;

        /* JADX INFO: renamed from: j */
        public float f1971j = 1.0f;

        /* JADX INFO: renamed from: k */
        public float f1972k = 0.0f;

        /* JADX INFO: renamed from: l */
        public Paint.Cap f1973l = Paint.Cap.BUTT;

        /* JADX INFO: renamed from: m */
        public Paint.Join f1974m = Paint.Join.MITER;

        /* JADX INFO: renamed from: n */
        public float f1975n = 4.0f;

        @Override // p000a.C0543dg.d
        /* JADX INFO: renamed from: a */
        public final boolean mo1316a() {
            return this.f1967f.m2239b() || this.f1965d.m2239b();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // p000a.C0543dg.d
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo1317b(int[] iArr) {
            boolean z;
            C0948z3 c0948z3 = this.f1967f;
            boolean z2 = false;
            if (c0948z3.m2239b()) {
                ColorStateList colorStateList = c0948z3.f3560b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != c0948z3.f3561c) {
                    c0948z3.f3561c = colorForState;
                    z = true;
                } else {
                    z = false;
                }
            }
            C0948z3 c0948z32 = this.f1965d;
            if (c0948z32.m2239b()) {
                ColorStateList colorStateList2 = c0948z32.f3560b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != c0948z32.f3561c) {
                    c0948z32.f3561c = colorForState2;
                    z2 = true;
                }
            }
            return z | z2;
        }

        public float getFillAlpha() {
            return this.f1969h;
        }

        public int getFillColor() {
            return this.f1967f.f3561c;
        }

        public float getStrokeAlpha() {
            return this.f1968g;
        }

        public int getStrokeColor() {
            return this.f1965d.f3561c;
        }

        public float getStrokeWidth() {
            return this.f1966e;
        }

        public float getTrimPathEnd() {
            return this.f1971j;
        }

        public float getTrimPathOffset() {
            return this.f1972k;
        }

        public float getTrimPathStart() {
            return this.f1970i;
        }

        public void setFillAlpha(float f) {
            this.f1969h = f;
        }

        public void setFillColor(int i) {
            this.f1967f.f3561c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f1968g = f;
        }

        public void setStrokeColor(int i) {
            this.f1965d.f3561c = i;
        }

        public void setStrokeWidth(float f) {
            this.f1966e = f;
        }

        public void setTrimPathEnd(float f) {
            this.f1971j = f;
        }

        public void setTrimPathOffset(float f) {
            this.f1972k = f;
        }

        public void setTrimPathStart(float f) {
            this.f1970i = f;
        }
    }

    /* JADX INFO: renamed from: a.dg$d */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public boolean mo1316a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo1317b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a.dg$g */
    public static class g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f2006a;

        /* JADX INFO: renamed from: b */
        public f f2007b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f2008c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f2009d;

        /* JADX INFO: renamed from: e */
        public boolean f2010e;

        /* JADX INFO: renamed from: f */
        public Bitmap f2011f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f2012g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f2013h;

        /* JADX INFO: renamed from: i */
        public int f2014i;

        /* JADX INFO: renamed from: j */
        public boolean f2015j;

        /* JADX INFO: renamed from: k */
        public boolean f2016k;

        /* JADX INFO: renamed from: l */
        public Paint f2017l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2006a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C0543dg(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C0543dg(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0543dg() {
        this.f1961f = true;
        this.f1962g = new float[9];
        this.f1963h = new Matrix();
        this.f1964i = new Rect();
        g gVar = new g();
        gVar.f2008c = null;
        gVar.f2009d = f1956j;
        gVar.f2007b = new f();
        this.f1957b = gVar;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1315a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1914a;
        if (drawable == null) {
            return false;
        }
        C0893w5.a.m2170b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1964i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1959d;
        if (colorFilter == null) {
            colorFilter = this.f1958c;
        }
        Matrix matrix = this.f1963h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1962g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C0893w5.b.m2178a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f1957b;
        Bitmap bitmap = gVar.f2011f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gVar.f2011f.getHeight()) {
            gVar.f2011f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gVar.f2016k = true;
        }
        if (this.f1961f) {
            g gVar2 = this.f1957b;
            if (gVar2.f2016k || gVar2.f2012g != gVar2.f2008c || gVar2.f2013h != gVar2.f2009d || gVar2.f2015j != gVar2.f2010e || gVar2.f2014i != gVar2.f2007b.getRootAlpha()) {
                g gVar3 = this.f1957b;
                gVar3.f2011f.eraseColor(0);
                Canvas canvas2 = new Canvas(gVar3.f2011f);
                f fVar = gVar3.f2007b;
                fVar.m1319a(fVar.f1997g, f.f1990p, canvas2, iMin, iMin2);
                g gVar4 = this.f1957b;
                gVar4.f2012g = gVar4.f2008c;
                gVar4.f2013h = gVar4.f2009d;
                gVar4.f2014i = gVar4.f2007b.getRootAlpha();
                gVar4.f2015j = gVar4.f2010e;
                gVar4.f2016k = false;
            }
        } else {
            g gVar5 = this.f1957b;
            gVar5.f2011f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar5.f2011f);
            f fVar2 = gVar5.f2007b;
            fVar2.m1319a(fVar2.f1997g, f.f1990p, canvas3, iMin, iMin2);
        }
        g gVar6 = this.f1957b;
        if (gVar6.f2007b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar6.f2017l == null) {
                Paint paint2 = new Paint();
                gVar6.f2017l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f2017l.setAlpha(gVar6.f2007b.getRootAlpha());
            gVar6.f2017l.setColorFilter(colorFilter);
            paint = gVar6.f2017l;
        }
        canvas.drawBitmap(gVar6.f2011f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getAlpha() : this.f1957b.f2007b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1957b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1914a;
        return drawable != null ? C0893w5.a.m2171c(drawable) : this.f1959d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1914a != null) {
            return new h(this.f1914a.getConstantState());
        }
        this.f1957b.f2006a = getChangingConfigurations();
        return this.f1957b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1957b.f2007b.f1999i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1957b.f2007b.f1998h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.isAutoMirrored() : this.f1957b.f2010e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.f1957b;
        if (gVar == null) {
            return false;
        }
        f fVar = gVar.f2007b;
        if (fVar.f2004n == null) {
            fVar.f2004n = Boolean.valueOf(fVar.f1997g.mo1316a());
        }
        if (fVar.f2004n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f1957b.f2008c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1960e && super.mutate() == this) {
            g gVar = this.f1957b;
            g gVar2 = new g();
            gVar2.f2008c = null;
            gVar2.f2009d = f1956j;
            if (gVar != null) {
                gVar2.f2006a = gVar.f2006a;
                f fVar = new f(gVar.f2007b);
                gVar2.f2007b = fVar;
                if (gVar.f2007b.f1995e != null) {
                    fVar.f1995e = new Paint(gVar.f2007b.f1995e);
                }
                if (gVar.f2007b.f1994d != null) {
                    gVar2.f2007b.f1994d = new Paint(gVar.f2007b.f1994d);
                }
                gVar2.f2008c = gVar.f2008c;
                gVar2.f2009d = gVar.f2009d;
                gVar2.f2010e = gVar.f2010e;
            }
            this.f1957b = gVar2;
            this.f1960e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f1957b;
        ColorStateList colorStateList = gVar.f2008c;
        if (colorStateList == null || (mode = gVar.f2009d) == null) {
            z = false;
        } else {
            this.f1958c = m1315a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        f fVar = gVar.f2007b;
        if (fVar.f2004n == null) {
            fVar.f2004n = Boolean.valueOf(fVar.f1997g.mo1316a());
        }
        if (fVar.f2004n.booleanValue()) {
            boolean zMo1317b = gVar.f2007b.f1997g.mo1317b(iArr);
            gVar.f2016k |= zMo1317b;
            if (zMo1317b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1957b.f2007b.getRootAlpha() != i) {
            this.f1957b.f2007b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1957b.f2010e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1959d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.m2168a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2176h(drawable, colorStateList);
            return;
        }
        g gVar = this.f1957b;
        if (gVar.f2008c != colorStateList) {
            gVar.f2008c = colorStateList;
            this.f1958c = m1315a(colorStateList, gVar.f2009d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2177i(drawable, mode);
            return;
        }
        g gVar = this.f1957b;
        if (gVar.f2009d != mode) {
            gVar.f2009d = mode;
            this.f1958c = m1315a(gVar.f2008c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1914a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: a.dg$h */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f2018a;

        public h(Drawable.ConstantState constantState) {
            this.f2018a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f2018a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2018a.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C0543dg c0543dg = new C0543dg();
            c0543dg.f1914a = (VectorDrawable) this.f2018a.newDrawable();
            return c0543dg;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C0543dg c0543dg = new C0543dg();
            c0543dg.f1914a = (VectorDrawable) this.f2018a.newDrawable(resources);
            return c0543dg;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0543dg c0543dg = new C0543dg();
            c0543dg.f1914a = (VectorDrawable) this.f2018a.newDrawable(resources, theme);
            return c0543dg;
        }
    }

    /* JADX INFO: renamed from: a.dg$e */
    public static abstract class e extends d {

        /* JADX INFO: renamed from: a */
        public C0824sc.a[] f1987a;

        /* JADX INFO: renamed from: b */
        public String f1988b;

        /* JADX INFO: renamed from: c */
        public int f1989c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this.f1987a = null;
            this.f1989c = 0;
        }

        public C0824sc.a[] getPathData() {
            return this.f1987a;
        }

        public String getPathName() {
            return this.f1988b;
        }

        public void setPathData(C0824sc.a[] aVarArr) {
            C0824sc.a[] aVarArr2 = this.f1987a;
            boolean z = false;
            if (aVarArr2 != null && aVarArr != null && aVarArr2.length == aVarArr.length) {
                int i = 0;
                while (true) {
                    if (i >= aVarArr2.length) {
                        z = true;
                        break;
                    }
                    C0824sc.a aVar = aVarArr2[i];
                    char c = aVar.f3282a;
                    C0824sc.a aVar2 = aVarArr[i];
                    if (c != aVar2.f3282a || aVar.f3283b.length != aVar2.f3283b.length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z) {
                this.f1987a = C0824sc.m1923c(aVarArr);
                return;
            }
            C0824sc.a[] aVarArr3 = this.f1987a;
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                aVarArr3[i2].f3282a = aVarArr[i2].f3282a;
                int i3 = 0;
                while (true) {
                    float[] fArr = aVarArr[i2].f3283b;
                    if (i3 < fArr.length) {
                        aVarArr3[i2].f3283b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f1987a = null;
            this.f1989c = 0;
            this.f1988b = eVar.f1988b;
            this.f1987a = C0824sc.m1923c(eVar.f1987a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar;
        int i;
        int i2;
        char c2;
        int i3;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f1914a;
        if (drawable != null) {
            C0893w5.a.m2172d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f1957b;
        gVar.f2007b = new f();
        TypedArray typedArrayM594c = C0216Lf.m594c(resources, theme, attributeSet, C0774q0.f3057a);
        g gVar2 = this.f1957b;
        f fVar2 = gVar2.f2007b;
        int i4 = !C0216Lf.m593b(xmlPullParser, "tintMode") ? -1 : typedArrayM594c.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f2009d = mode;
        int i5 = 1;
        ColorStateList colorStateListM1977a = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM594c.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListM1977a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM594c.getResources();
                int resourceId = typedArrayM594c.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = C0853u3.f3352a;
                try {
                    colorStateListM1977a = C0853u3.m1977a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM1977a;
        if (colorStateList != null) {
            gVar2.f2008c = colorStateList;
        }
        boolean z = gVar2.f2010e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM594c.getBoolean(5, z);
        }
        gVar2.f2010e = z;
        float f2 = fVar2.f2000j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f2 = typedArrayM594c.getFloat(7, f2);
        }
        fVar2.f2000j = f2;
        float f3 = fVar2.f2001k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f3 = typedArrayM594c.getFloat(8, f3);
        }
        fVar2.f2001k = f3;
        if (fVar2.f2000j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM594c.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            fVar2.f1998h = typedArrayM594c.getDimension(3, fVar2.f1998h);
            float dimension = typedArrayM594c.getDimension(2, fVar2.f1999i);
            fVar2.f1999i = dimension;
            if (fVar2.f1998h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM594c.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM594c.getFloat(4, alpha);
                }
                fVar2.setAlpha(alpha);
                String string = typedArrayM594c.getString(0);
                if (string != null) {
                    fVar2.f2003m = string;
                    fVar2.f2005o.put(string, fVar2);
                }
                typedArrayM594c.recycle();
                gVar.f2006a = getChangingConfigurations();
                gVar.f2016k = true;
                g gVar3 = this.f1957b;
                f fVar3 = gVar3.f2007b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(fVar3.f1997g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i = depth;
                        C0166J1<String, Object> c0166j1 = fVar3.f2005o;
                        if (zEquals) {
                            b bVar = new b();
                            TypedArray typedArrayM594c2 = C0216Lf.m594c(resources, theme, attributeSet, C0774q0.f3059c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                fVar = fVar3;
                                String string2 = typedArrayM594c2.getString(0);
                                if (string2 != null) {
                                    bVar.f1988b = string2;
                                }
                                String string3 = typedArrayM594c2.getString(2);
                                if (string3 != null) {
                                    bVar.f1987a = C0824sc.m1922b(string3);
                                }
                                bVar.f1967f = C0216Lf.m592a(typedArrayM594c2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = bVar.f1969h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f4 = typedArrayM594c2.getFloat(12, f4);
                                }
                                bVar.f1969h = f4;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM594c2.getInt(8, -1) : -1;
                                Paint.Cap cap2 = bVar.f1973l;
                                if (i7 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap2 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                bVar.f1973l = cap;
                                int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM594c2.getInt(9, -1) : -1;
                                Paint.Join join2 = bVar.f1974m;
                                if (i8 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i8 != 1) {
                                    join = i8 != 2 ? join2 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                bVar.f1974m = join;
                                float f5 = bVar.f1975n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f5 = typedArrayM594c2.getFloat(10, f5);
                                }
                                bVar.f1975n = f5;
                                bVar.f1965d = C0216Lf.m592a(typedArrayM594c2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = bVar.f1968g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f6 = typedArrayM594c2.getFloat(11, f6);
                                }
                                bVar.f1968g = f6;
                                float f7 = bVar.f1966e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f7 = typedArrayM594c2.getFloat(4, f7);
                                }
                                bVar.f1966e = f7;
                                float f8 = bVar.f1971j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f8 = typedArrayM594c2.getFloat(6, f8);
                                }
                                bVar.f1971j = f8;
                                float f9 = bVar.f1972k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f9 = typedArrayM594c2.getFloat(7, f9);
                                }
                                bVar.f1972k = f9;
                                float f10 = bVar.f1970i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f10 = typedArrayM594c2.getFloat(5, f10);
                                }
                                bVar.f1970i = f10;
                                int i9 = bVar.f1989c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i9 = typedArrayM594c2.getInt(13, i9);
                                }
                                bVar.f1989c = i9;
                            } else {
                                fVar = fVar3;
                            }
                            typedArrayM594c2.recycle();
                            cVar.f1977b.add(bVar);
                            if (bVar.getPathName() != null) {
                                c0166j1.put(bVar.getPathName(), bVar);
                            }
                            gVar3.f2006a = gVar3.f2006a;
                            i3 = 1;
                            z2 = false;
                            c2 = '\b';
                        } else {
                            fVar = fVar3;
                            c2 = '\b';
                            if ("clip-path".equals(name)) {
                                a aVar = new a();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM594c3 = C0216Lf.m594c(resources, theme, attributeSet, C0774q0.f3060d);
                                    String string4 = typedArrayM594c3.getString(0);
                                    if (string4 != null) {
                                        aVar.f1988b = string4;
                                    }
                                    String string5 = typedArrayM594c3.getString(1);
                                    if (string5 != null) {
                                        aVar.f1987a = C0824sc.m1922b(string5);
                                    }
                                    aVar.f1989c = !C0216Lf.m593b(xmlPullParser, "fillType") ? 0 : typedArrayM594c3.getInt(2, 0);
                                    typedArrayM594c3.recycle();
                                }
                                cVar.f1977b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    c0166j1.put(aVar.getPathName(), aVar);
                                }
                                gVar3.f2006a = gVar3.f2006a;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray typedArrayM594c4 = C0216Lf.m594c(resources, theme, attributeSet, C0774q0.f3058b);
                                float f11 = cVar2.f1978c;
                                if (C0216Lf.m593b(xmlPullParser, "rotation")) {
                                    f11 = typedArrayM594c4.getFloat(5, f11);
                                }
                                cVar2.f1978c = f11;
                                i3 = 1;
                                cVar2.f1979d = typedArrayM594c4.getFloat(1, cVar2.f1979d);
                                cVar2.f1980e = typedArrayM594c4.getFloat(2, cVar2.f1980e);
                                float f12 = cVar2.f1981f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f12 = typedArrayM594c4.getFloat(3, f12);
                                }
                                cVar2.f1981f = f12;
                                float f13 = cVar2.f1982g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f13 = typedArrayM594c4.getFloat(4, f13);
                                }
                                cVar2.f1982g = f13;
                                float f14 = cVar2.f1983h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f14 = typedArrayM594c4.getFloat(6, f14);
                                }
                                cVar2.f1983h = f14;
                                float f15 = cVar2.f1984i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f15 = typedArrayM594c4.getFloat(7, f15);
                                }
                                cVar2.f1984i = f15;
                                String string6 = typedArrayM594c4.getString(0);
                                if (string6 != null) {
                                    cVar2.f1986k = string6;
                                }
                                cVar2.m1318c();
                                typedArrayM594c4.recycle();
                                cVar.f1977b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    c0166j1.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar3.f2006a = gVar3.f2006a;
                            }
                            i3 = 1;
                        }
                        i2 = i3;
                    } else {
                        fVar = fVar3;
                        i = depth;
                        i2 = i5;
                        c2 = '\b';
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i2;
                    depth = i;
                    fVar3 = fVar;
                }
                if (!z2) {
                    this.f1958c = m1315a(gVar.f2008c, gVar.f2009d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM594c.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM594c.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* JADX INFO: renamed from: a.dg$c */
    public static class c extends d {

        /* JADX INFO: renamed from: a */
        public final Matrix f1976a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<d> f1977b;

        /* JADX INFO: renamed from: c */
        public float f1978c;

        /* JADX INFO: renamed from: d */
        public float f1979d;

        /* JADX INFO: renamed from: e */
        public float f1980e;

        /* JADX INFO: renamed from: f */
        public float f1981f;

        /* JADX INFO: renamed from: g */
        public float f1982g;

        /* JADX INFO: renamed from: h */
        public float f1983h;

        /* JADX INFO: renamed from: i */
        public float f1984i;

        /* JADX INFO: renamed from: j */
        public final Matrix f1985j;

        /* JADX INFO: renamed from: k */
        public String f1986k;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            this.f1976a = new Matrix();
            this.f1977b = new ArrayList<>();
            this.f1978c = 0.0f;
            this.f1979d = 0.0f;
            this.f1980e = 0.0f;
            this.f1981f = 1.0f;
            this.f1982g = 1.0f;
            this.f1983h = 0.0f;
            this.f1984i = 0.0f;
            this.f1985j = new Matrix();
            this.f1986k = null;
        }

        @Override // p000a.C0543dg.d
        /* JADX INFO: renamed from: a */
        public final boolean mo1316a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.f1977b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).mo1316a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // p000a.C0543dg.d
        /* JADX INFO: renamed from: b */
        public final boolean mo1317b(int[] iArr) {
            int i = 0;
            boolean zMo1317b = false;
            while (true) {
                ArrayList<d> arrayList = this.f1977b;
                if (i >= arrayList.size()) {
                    return zMo1317b;
                }
                zMo1317b |= arrayList.get(i).mo1317b(iArr);
                i++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m1318c() {
            Matrix matrix = this.f1985j;
            matrix.reset();
            matrix.postTranslate(-this.f1979d, -this.f1980e);
            matrix.postScale(this.f1981f, this.f1982g);
            matrix.postRotate(this.f1978c, 0.0f, 0.0f);
            matrix.postTranslate(this.f1983h + this.f1979d, this.f1984i + this.f1980e);
        }

        public String getGroupName() {
            return this.f1986k;
        }

        public Matrix getLocalMatrix() {
            return this.f1985j;
        }

        public float getPivotX() {
            return this.f1979d;
        }

        public float getPivotY() {
            return this.f1980e;
        }

        public float getRotation() {
            return this.f1978c;
        }

        public float getScaleX() {
            return this.f1981f;
        }

        public float getScaleY() {
            return this.f1982g;
        }

        public float getTranslateX() {
            return this.f1983h;
        }

        public float getTranslateY() {
            return this.f1984i;
        }

        public void setPivotX(float f) {
            if (f != this.f1979d) {
                this.f1979d = f;
                m1318c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f1980e) {
                this.f1980e = f;
                m1318c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f1978c) {
                this.f1978c = f;
                m1318c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f1981f) {
                this.f1981f = f;
                m1318c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f1982g) {
                this.f1982g = f;
                m1318c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f1983h) {
                this.f1983h = f;
                m1318c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f1984i) {
                this.f1984i = f;
                m1318c();
            }
        }

        public c(c cVar, C0166J1<String, Object> c0166j1) {
            e aVar;
            this.f1976a = new Matrix();
            this.f1977b = new ArrayList<>();
            this.f1978c = 0.0f;
            this.f1979d = 0.0f;
            this.f1980e = 0.0f;
            this.f1981f = 1.0f;
            this.f1982g = 1.0f;
            this.f1983h = 0.0f;
            this.f1984i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1985j = matrix;
            this.f1986k = null;
            this.f1978c = cVar.f1978c;
            this.f1979d = cVar.f1979d;
            this.f1980e = cVar.f1980e;
            this.f1981f = cVar.f1981f;
            this.f1982g = cVar.f1982g;
            this.f1983h = cVar.f1983h;
            this.f1984i = cVar.f1984i;
            String str = cVar.f1986k;
            this.f1986k = str;
            if (str != null) {
                c0166j1.put(str, this);
            }
            matrix.set(cVar.f1985j);
            ArrayList<d> arrayList = cVar.f1977b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.f1977b.add(new c((c) dVar, c0166j1));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f1966e = 0.0f;
                        bVar2.f1968g = 1.0f;
                        bVar2.f1969h = 1.0f;
                        bVar2.f1970i = 0.0f;
                        bVar2.f1971j = 1.0f;
                        bVar2.f1972k = 0.0f;
                        bVar2.f1973l = Paint.Cap.BUTT;
                        bVar2.f1974m = Paint.Join.MITER;
                        bVar2.f1975n = 4.0f;
                        bVar2.f1965d = bVar.f1965d;
                        bVar2.f1966e = bVar.f1966e;
                        bVar2.f1968g = bVar.f1968g;
                        bVar2.f1967f = bVar.f1967f;
                        bVar2.f1989c = bVar.f1989c;
                        bVar2.f1969h = bVar.f1969h;
                        bVar2.f1970i = bVar.f1970i;
                        bVar2.f1971j = bVar.f1971j;
                        bVar2.f1972k = bVar.f1972k;
                        bVar2.f1973l = bVar.f1973l;
                        bVar2.f1974m = bVar.f1974m;
                        bVar2.f1975n = bVar.f1975n;
                        aVar = bVar2;
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1977b.add(aVar);
                    String str2 = aVar.f1988b;
                    if (str2 != null) {
                        c0166j1.put(str2, aVar);
                    }
                }
            }
        }
    }

    public C0543dg(g gVar) {
        this.f1961f = true;
        this.f1962g = new float[9];
        this.f1963h = new Matrix();
        this.f1964i = new Rect();
        this.f1957b = gVar;
        this.f1958c = m1315a(gVar.f2008c, gVar.f2009d);
    }

    /* JADX INFO: renamed from: a.dg$f */
    public static class f {

        /* JADX INFO: renamed from: p */
        public static final Matrix f1990p = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f1991a;

        /* JADX INFO: renamed from: b */
        public final Path f1992b;

        /* JADX INFO: renamed from: c */
        public final Matrix f1993c;

        /* JADX INFO: renamed from: d */
        public Paint f1994d;

        /* JADX INFO: renamed from: e */
        public Paint f1995e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f1996f;

        /* JADX INFO: renamed from: g */
        public final c f1997g;

        /* JADX INFO: renamed from: h */
        public float f1998h;

        /* JADX INFO: renamed from: i */
        public float f1999i;

        /* JADX INFO: renamed from: j */
        public float f2000j;

        /* JADX INFO: renamed from: k */
        public float f2001k;

        /* JADX INFO: renamed from: l */
        public int f2002l;

        /* JADX INFO: renamed from: m */
        public String f2003m;

        /* JADX INFO: renamed from: n */
        public Boolean f2004n;

        /* JADX INFO: renamed from: o */
        public final C0166J1<String, Object> f2005o;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f() {
            this.f1993c = new Matrix();
            this.f1998h = 0.0f;
            this.f1999i = 0.0f;
            this.f2000j = 0.0f;
            this.f2001k = 0.0f;
            this.f2002l = 255;
            this.f2003m = null;
            this.f2004n = null;
            this.f2005o = new C0166J1<>();
            this.f1997g = new c();
            this.f1991a = new Path();
            this.f1992b = new Path();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m1319a(c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            char c;
            float f;
            float f2;
            int i3;
            c cVar2 = cVar;
            char c2 = 1;
            cVar2.f1976a.set(matrix);
            Matrix matrix2 = cVar2.f1976a;
            matrix2.preConcat(cVar2.f1985j);
            canvas.save();
            char c3 = 0;
            int i4 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar2.f1977b;
                if (i4 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i4);
                if (dVar instanceof c) {
                    m1319a((c) dVar, matrix2, canvas, i, i2);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f3 = i / this.f2000j;
                    float f4 = i2 / this.f2001k;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix3 = this.f1993c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c3], fArr[c2]);
                    boolean z = c2;
                    boolean z2 = c3;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[z2 ? 1 : 0] * fArr[3]) - (fArr[z ? 1 : 0] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f1991a;
                        eVar.getClass();
                        path.reset();
                        C0824sc.a[] aVarArr = eVar.f1987a;
                        if (aVarArr != null) {
                            C0824sc.a.m1925b(aVarArr, path);
                        }
                        Path path2 = this.f1992b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.f1989c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f6 = bVar.f1970i;
                            if (f6 != 0.0f || bVar.f1971j != 1.0f) {
                                float f7 = bVar.f1972k;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (bVar.f1971j + f7) % 1.0f;
                                if (this.f1996f == null) {
                                    this.f1996f = new PathMeasure();
                                }
                                this.f1996f.setPath(path, z2);
                                float length = this.f1996f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f1996f.getSegment(f10, length, path, z);
                                    f = 0.0f;
                                    this.f1996f.getSegment(0.0f, f11, path, z);
                                } else {
                                    f = 0.0f;
                                    this.f1996f.getSegment(f10, f11, path, z);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix3);
                            C0948z3 c0948z3 = bVar.f1967f;
                            if ((c0948z3.f3559a == null && c0948z3.f3561c == 0) ? false : true) {
                                if (this.f1995e == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f1995e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = this.f1995e;
                                Shader shader = c0948z3.f3559a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f1969h * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = c0948z3.f3561c;
                                    float f12 = bVar.f1969h;
                                    PorterDuff.Mode mode = C0543dg.f1956j;
                                    f2 = 255.0f;
                                    paint2.setColor((i5 & i3) | (((int) (Color.alpha(i5) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.f1989c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f2 = 255.0f;
                                i3 = 16777215;
                            }
                            C0948z3 c0948z32 = bVar.f1965d;
                            if (c0948z32.f3559a != null || c0948z32.f3561c != 0) {
                                if (this.f1994d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f1994d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f1994d;
                                Paint.Join join = bVar.f1974m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f1973l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f1975n);
                                Shader shader2 = c0948z32.f3559a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f1968g * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = c0948z32.f3561c;
                                    float f13 = bVar.f1968g;
                                    PorterDuff.Mode mode2 = C0543dg.f1956j;
                                    paint4.setColor((i6 & i3) | (((int) (Color.alpha(i6) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f1966e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c = 1;
                    i4++;
                    cVar2 = cVar;
                    c2 = c;
                    c3 = 0;
                }
                c = c2;
                i4++;
                cVar2 = cVar;
                c2 = c;
                c3 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2002l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f2002l = i;
        }

        public f(f fVar) {
            this.f1993c = new Matrix();
            this.f1998h = 0.0f;
            this.f1999i = 0.0f;
            this.f2000j = 0.0f;
            this.f2001k = 0.0f;
            this.f2002l = 255;
            this.f2003m = null;
            this.f2004n = null;
            C0166J1<String, Object> c0166j1 = new C0166J1<>();
            this.f2005o = c0166j1;
            this.f1997g = new c(fVar.f1997g, c0166j1);
            this.f1991a = new Path(fVar.f1991a);
            this.f1992b = new Path(fVar.f1992b);
            this.f1998h = fVar.f1998h;
            this.f1999i = fVar.f1999i;
            this.f2000j = fVar.f2000j;
            this.f2001k = fVar.f2001k;
            this.f2002l = fVar.f2002l;
            this.f2003m = fVar.f2003m;
            String str = fVar.f2003m;
            if (str != null) {
                c0166j1.put(str, this);
            }
            this.f2004n = fVar.f2004n;
        }
    }
}
