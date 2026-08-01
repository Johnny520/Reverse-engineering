package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0510n5 {

    /* JADX INFO: renamed from: l */
    public static final RectF f3222l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f3223m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f3224a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3225b = false;

    /* JADX INFO: renamed from: c */
    public float f3226c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f3227d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f3228e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f3229f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f3230g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f3231h;

    /* JADX INFO: renamed from: i */
    public final TextView f3232i;

    /* JADX INFO: renamed from: j */
    public final Context f3233j;

    /* JADX INFO: renamed from: k */
    public final C0399k5 f3234k;

    static {
        new ConcurrentHashMap();
    }

    public C0510n5(TextView textView) {
        this.f3232i = textView;
        this.f3233j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3234k = new C0436l5();
        } else {
            this.f3234k = new C0399k5();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m1916b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static Method m1917d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3223m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m1918e(Object obj, String str, Object obj2) {
        try {
            return m1917d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1919a() {
        if (m1921f()) {
            if (this.f3225b) {
                if (this.f3232i.getMeasuredHeight() <= 0 || this.f3232i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3234k.mo1736b(this.f3232i) ? 1048576 : (this.f3232i.getMeasuredWidth() - this.f3232i.getTotalPaddingLeft()) - this.f3232i.getTotalPaddingRight();
                int height = (this.f3232i.getHeight() - this.f3232i.getCompoundPaddingBottom()) - this.f3232i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3222l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM1920c = m1920c(rectF);
                        if (fM1920c != this.f3232i.getTextSize()) {
                            m1922g(0, fM1920c);
                        }
                    } finally {
                    }
                }
            }
            this.f3225b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1920c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3229f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f3229f[i4];
            TextView textView = this.f3232i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iM1356b = AbstractC0286h5.m1356b(textView);
            TextPaint textPaint = this.f3231h;
            if (textPaint == null) {
                this.f3231h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3231h.set(textView.getPaint());
            this.f3231h.setTextSize(i5);
            StaticLayout staticLayoutM1565a = AbstractC0362j5.m1565a(charSequence, (Layout.Alignment) m1918e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iM1356b, this.f3232i, this.f3231h, this.f3234k);
            if ((iM1356b == -1 || (staticLayoutM1565a.getLineCount() <= iM1356b && staticLayoutM1565a.getLineEnd(staticLayoutM1565a.getLineCount() - 1) == charSequence.length())) && staticLayoutM1565a.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f3229f[i2];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1921f() {
        return m1925j() && this.f3224a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m1922g(int i, float f) {
        Context context = this.f3233j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3232i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM1457a = AbstractC0323i5.m1457a(textView);
            if (textView.getLayout() != null) {
                this.f3225b = false;
                try {
                    Method methodM1917d = m1917d("nullLayouts");
                    if (methodM1917d != null) {
                        methodM1917d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zM1457a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1923h() {
        if (m1925j() && this.f3224a == 1) {
            if (!this.f3230g || this.f3229f.length == 0) {
                int iFloor = ((int) Math.floor((this.f3228e - this.f3227d) / this.f3226c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f3226c) + this.f3227d);
                }
                this.f3229f = m1916b(iArr);
            }
            this.f3225b = true;
        } else {
            this.f3225b = false;
        }
        return this.f3225b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1924i() {
        boolean z = this.f3229f.length > 0;
        this.f3230g = z;
        if (z) {
            this.f3224a = 1;
            this.f3227d = r0[0];
            this.f3228e = r0[r1 - 1];
            this.f3226c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1925j() {
        return !(this.f3232i instanceof C0842w3);
    }

    /* JADX INFO: renamed from: k */
    public final void m1926k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f3224a = 1;
        this.f3227d = f;
        this.f3228e = f2;
        this.f3226c = f3;
        this.f3230g = false;
    }
}
