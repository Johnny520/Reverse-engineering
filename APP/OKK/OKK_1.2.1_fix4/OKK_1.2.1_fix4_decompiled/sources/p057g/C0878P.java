package p057g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: g.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0878P {

    /* JADX INFO: renamed from: l */
    public static final RectF f3136l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f3137m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f3138a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3139b = false;

    /* JADX INFO: renamed from: c */
    public float f3140c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f3141d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f3142e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f3143f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f3144g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f3145h;

    /* JADX INFO: renamed from: i */
    public final TextView f3146i;

    /* JADX INFO: renamed from: j */
    public final Context f3147j;

    /* JADX INFO: renamed from: k */
    public final C0872M f3148k;

    public C0878P(TextView textView) {
        this.f3146i = textView;
        this.f3147j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3148k = new C0874N();
        } else {
            this.f3148k = new C0872M();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m2200b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public static Method m2201d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3137m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m2202e(Object obj, Object obj2, String str) {
        try {
            return m2201d(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2203a() {
        if (m2205f()) {
            if (this.f3139b) {
                if (this.f3146i.getMeasuredHeight() <= 0 || this.f3146i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3148k.mo2198b(this.f3146i) ? 1048576 : (this.f3146i.getMeasuredWidth() - this.f3146i.getTotalPaddingLeft()) - this.f3146i.getTotalPaddingRight();
                int height = (this.f3146i.getHeight() - this.f3146i.getCompoundPaddingBottom()) - this.f3146i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3136l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM2204c = m2204c(rectF);
                        if (fM2204c != this.f3146i.getTextSize()) {
                            m2206g(0, fM2204c);
                        }
                    } finally {
                    }
                }
            }
            this.f3139b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2204c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3143f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f3143f[i5];
            TextView textView = this.f3146i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f3145h;
            if (textPaint == null) {
                this.f3145h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3145h.set(textView.getPaint());
            this.f3145h.setTextSize(i6);
            StaticLayout staticLayoutM2193a = AbstractC0870L.m2193a(text, (Layout.Alignment) m2202e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f3146i, this.f3145h, this.f3148k);
            if ((maxLines == -1 || (staticLayoutM2193a.getLineCount() <= maxLines && staticLayoutM2193a.getLineEnd(staticLayoutM2193a.getLineCount() - 1) == text.length())) && staticLayoutM2193a.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f3143f[i3];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2205f() {
        return m2209j() && this.f3138a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m2206g(int i2, float f2) {
        Context context = this.f3147j;
        float fApplyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3146i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3139b = false;
                try {
                    Method methodM2201d = m2201d("nullLayouts");
                    if (methodM2201d != null) {
                        methodM2201d.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2207h() {
        if (m2209j() && this.f3138a == 1) {
            if (!this.f3144g || this.f3143f.length == 0) {
                int iFloor = ((int) Math.floor((this.f3142e - this.f3141d) / this.f3140c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f3140c) + this.f3141d);
                }
                this.f3143f = m2200b(iArr);
            }
            this.f3139b = true;
        } else {
            this.f3139b = false;
        }
        return this.f3139b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2208i() {
        boolean z2 = this.f3143f.length > 0;
        this.f3144g = z2;
        if (z2) {
            this.f3138a = 1;
            this.f3141d = r0[0];
            this.f3142e = r0[r1 - 1];
            this.f3140c = -1.0f;
        }
        return z2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2209j() {
        return !(this.f3146i instanceof AbstractC0930u);
    }

    /* JADX INFO: renamed from: k */
    public final void m2210k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3138a = 1;
        this.f3141d = f2;
        this.f3142e = f3;
        this.f3140c = f4;
        this.f3144g = false;
    }
}
