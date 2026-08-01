package p069i;

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

/* JADX INFO: renamed from: i.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690k0 {

    /* JADX INFO: renamed from: l */
    public static final RectF f2325l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f2326m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f2327a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f2328b = false;

    /* JADX INFO: renamed from: c */
    public float f2329c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f2330d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f2331e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f2332f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f2333g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f2334h;

    /* JADX INFO: renamed from: i */
    public final TextView f2335i;

    /* JADX INFO: renamed from: j */
    public final Context f2336j;

    /* JADX INFO: renamed from: k */
    public final C0681h0 f2337k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0690k0(TextView textView) {
        this.f2335i = textView;
        this.f2336j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2337k = new C0684i0();
        } else {
            this.f2337k = new C0681h0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int[] m1312b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Method m1313d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2326m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m1314e(Object obj, Object obj2, String str) {
        try {
            return m1313d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1315a() {
        if (m1317f()) {
            if (this.f2328b) {
                if (this.f2335i.getMeasuredHeight() <= 0 || this.f2335i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2337k.mo1307b(this.f2335i) ? 1048576 : (this.f2335i.getMeasuredWidth() - this.f2335i.getTotalPaddingLeft()) - this.f2335i.getTotalPaddingRight();
                int height = (this.f2335i.getHeight() - this.f2335i.getCompoundPaddingBottom()) - this.f2335i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2325l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM1316c = m1316c(rectF);
                        if (fM1316c != this.f2335i.getTextSize()) {
                            m1318g(0, fM1316c);
                        }
                    } finally {
                    }
                }
            }
            this.f2328b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1316c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2332f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f2332f[i5];
            TextView textView = this.f2335i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iM1302b = AbstractC0672e0.m1302b(textView);
            TextPaint textPaint = this.f2334h;
            if (textPaint == null) {
                this.f2334h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f2334h.set(textView.getPaint());
            this.f2334h.setTextSize(i6);
            StaticLayout staticLayoutM1305a = AbstractC0678g0.m1305a(charSequence, (Layout.Alignment) m1314e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), iM1302b, this.f2335i, this.f2334h, this.f2337k);
            if ((iM1302b == -1 || (staticLayoutM1305a.getLineCount() <= iM1302b && staticLayoutM1305a.getLineEnd(staticLayoutM1305a.getLineCount() - 1) == charSequence.length())) && staticLayoutM1305a.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f2332f[i3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1317f() {
        return m1321j() && this.f2327a != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1318g(int i2, float f) {
        Context context = this.f2336j;
        float fApplyDimension = TypedValue.applyDimension(i2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2335i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM1304a = AbstractC0675f0.m1304a(textView);
            if (textView.getLayout() != null) {
                this.f2328b = false;
                try {
                    Method methodM1313d = m1313d("nullLayouts");
                    if (methodM1313d != null) {
                        methodM1313d.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zM1304a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m1319h() {
        if (m1321j() && this.f2327a == 1) {
            if (!this.f2333g || this.f2332f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2331e - this.f2330d) / this.f2329c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f2329c) + this.f2330d);
                }
                this.f2332f = m1312b(iArr);
            }
            this.f2328b = true;
        } else {
            this.f2328b = false;
        }
        return this.f2328b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m1320i() {
        boolean z2 = this.f2332f.length > 0;
        this.f2333g = z2;
        if (z2) {
            this.f2327a = 1;
            this.f2330d = r0[0];
            this.f2331e = r0[r1 - 1];
            this.f2329c = -1.0f;
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m1321j() {
        return !(this.f2335i instanceof C0721v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1322k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f2327a = 1;
        this.f2330d = f;
        this.f2331e = f2;
        this.f2329c = f3;
        this.f2333g = false;
    }
}
