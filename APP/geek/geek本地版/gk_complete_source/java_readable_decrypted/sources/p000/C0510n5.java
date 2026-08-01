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
    public static final RectF f3332l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f3333m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f3334a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3335b = false;

    /* JADX INFO: renamed from: c */
    public float f3336c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f3337d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f3338e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f3339f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f3340g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f3341h;

    /* JADX INFO: renamed from: i */
    public final TextView f3342i;

    /* JADX INFO: renamed from: j */
    public final Context f3343j;

    /* JADX INFO: renamed from: k */
    public final C0399k5 f3344k;

    static {
        new ConcurrentHashMap();
    }

    public C0510n5(TextView textView) {
        this.f3342i = textView;
        this.f3343j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3344k = new C0436l5();
        } else {
            this.f3344k = new C0399k5();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m1905b(int[] iArr) {
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
    public static Method m1906d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3333m;
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
    public static Object m1907e(Object obj, String str, Object obj2) {
        try {
            return m1906d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1908a() {
        if (m1910f()) {
            if (this.f3335b) {
                if (this.f3342i.getMeasuredHeight() <= 0 || this.f3342i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3344k.mo1743b(this.f3342i) ? 1048576 : (this.f3342i.getMeasuredWidth() - this.f3342i.getTotalPaddingLeft()) - this.f3342i.getTotalPaddingRight();
                int height = (this.f3342i.getHeight() - this.f3342i.getCompoundPaddingBottom()) - this.f3342i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3332l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM1909c = m1909c(rectF);
                        if (fM1909c != this.f3342i.getTextSize()) {
                            m1911g(0, fM1909c);
                        }
                    } finally {
                    }
                }
            }
            this.f3335b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1909c(RectF rectF) {
        CharSequence transformation;
        int length = this.f3339f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f3339f[i4];
            TextView textView = this.f3342i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iM1348b = AbstractC0286h5.m1348b(textView);
            TextPaint textPaint = this.f3341h;
            if (textPaint == null) {
                this.f3341h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3341h.set(textView.getPaint());
            this.f3341h.setTextSize(i5);
            StaticLayout staticLayoutM1547a = AbstractC0362j5.m1547a(charSequence, (Layout.Alignment) m1907e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iM1348b, this.f3342i, this.f3341h, this.f3344k);
            if ((iM1348b == -1 || (staticLayoutM1547a.getLineCount() <= iM1348b && staticLayoutM1547a.getLineEnd(staticLayoutM1547a.getLineCount() - 1) == charSequence.length())) && staticLayoutM1547a.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f3339f[i2];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1910f() {
        return m1914j() && this.f3334a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m1911g(int i, float f) {
        Context context = this.f3343j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3342i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM1396a = AbstractC0323i5.m1396a(textView);
            if (textView.getLayout() != null) {
                this.f3335b = false;
                try {
                    Method methodM1906d = m1906d("nullLayouts");
                    if (methodM1906d != null) {
                        methodM1906d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zM1396a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1912h() {
        if (m1914j() && this.f3334a == 1) {
            if (!this.f3340g || this.f3339f.length == 0) {
                int iFloor = ((int) Math.floor((this.f3338e - this.f3337d) / this.f3336c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f3336c) + this.f3337d);
                }
                this.f3339f = m1905b(iArr);
            }
            this.f3335b = true;
        } else {
            this.f3335b = false;
        }
        return this.f3335b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1913i() {
        boolean z = this.f3339f.length > 0;
        this.f3340g = z;
        if (z) {
            this.f3334a = 1;
            this.f3337d = r0[0];
            this.f3338e = r0[r1 - 1];
            this.f3336c = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1914j() {
        return !(this.f3342i instanceof C0842w3);
    }

    /* JADX INFO: renamed from: k */
    public final void m1915k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f3334a = 1;
        this.f3337d = f;
        this.f3338e = f2;
        this.f3336c = f3;
        this.f3340g = false;
    }
}
