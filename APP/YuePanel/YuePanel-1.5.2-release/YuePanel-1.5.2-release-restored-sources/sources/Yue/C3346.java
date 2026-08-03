package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3346 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f5293 = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f5295 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f5296 = 112;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f5297 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f5299 = -1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f5300 = 1048576;

    /* JADX INFO: renamed from: ۥ */
    public int f240 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f241 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f5301 = -1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f5302 = -1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f5303 = -1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f5304 = new int[0];

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f5305 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public TextPaint f5306;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final TextView f5307;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Context f5308;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C3348 f5309;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final RectF f5294 = new RectF();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f5298 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ */
    @InterfaceC7113(23)
    public static final class C0116 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static StaticLayout m423(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 Layout.Alignment alignment, int i, int i2, @InterfaceC6391 TextView textView, @InterfaceC6391 TextPaint textPaint, @InterfaceC6391 C3348 c3348) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c3348.mo424(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w(C3346.f5293, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0117 extends C3348 {
        @Override // Yue.C3346.C3348
        /* JADX INFO: renamed from: ۥ */
        public void mo424(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3346.m6843(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C3347 extends C0117 {
        @Override // Yue.C3346.C0117, Yue.C3346.C3348
        /* JADX INFO: renamed from: ۥ */
        public void mo424(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // Yue.C3346.C3348
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo425(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3348 {
        /* JADX INFO: renamed from: ۥ */
        public void mo424(StaticLayout.Builder builder, TextView textView) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo425(TextView textView) {
            return ((Boolean) C3346.m6843(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3346(@InterfaceC6391 TextView textView) {
        this.f5307 = textView;
        this.f5308 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5309 = new C3347();
        } else {
            this.f5309 = new C0117();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Method m6842(@InterfaceC6391 String str) {
        try {
            Method declaredMethod = f5298.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f5298.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w(f5293, "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> T m6843(@InterfaceC6391 Object obj, @InterfaceC6391 String str, @InterfaceC6391 T t) {
        try {
            return (T) m6842(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w(f5293, "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ */
    public void m421() {
        if (m6853()) {
            if (this.f241) {
                if (this.f5307.getMeasuredHeight() <= 0 || this.f5307.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5309.mo425(this.f5307) ? 1048576 : (this.f5307.getMeasuredWidth() - this.f5307.getTotalPaddingLeft()) - this.f5307.getTotalPaddingRight();
                int height = (this.f5307.getHeight() - this.f5307.getCompoundPaddingBottom()) - this.f5307.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5294;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM6846 = m6846(rectF);
                        if (fM6846 != this.f5307.getTextSize()) {
                            m6859(0, fM6846);
                        }
                    } finally {
                    }
                }
            }
            this.f241 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int[] m422(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m6844() {
        this.f240 = 0;
        this.f5302 = -1.0f;
        this.f5303 = -1.0f;
        this.f5301 = -1.0f;
        this.f5304 = new int[0];
        this.f241 = false;
    }

    @InterfaceC6391
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public StaticLayout m6845(@InterfaceC6391 CharSequence charSequence, @InterfaceC6391 Layout.Alignment alignment, int i, int i2) {
        return C0116.m423(charSequence, alignment, i, i2, this.f5307, this.f5306, this.f5309);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m6846(RectF rectF) {
        int length = this.f5304.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (m6863(this.f5304[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f5304[i3];
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m6847() {
        return Math.round(this.f5303);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m6848() {
        return Math.round(this.f5302);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m6849() {
        return Math.round(this.f5301);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] m6850() {
        return this.f5304;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m6851() {
        return this.f240;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m6852(int i) {
        TextPaint textPaint = this.f5306;
        if (textPaint == null) {
            this.f5306 = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f5306.set(this.f5307.getPaint());
        this.f5306.setTextSize(i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m6853() {
        return m6864() && this.f240 != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m6854(@InterfaceC6490 AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f5308.obtainStyledAttributes(attributeSet, C6898.C6909.f19438, i, 0);
        TextView textView = this.f5307;
        C8273.m27437(textView, textView.getContext(), C6898.C6909.f19438, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19444)) {
            this.f240 = typedArrayObtainStyledAttributes.getInt(C6898.C6909.f19444, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19443) ? typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19443, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19441) ? typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19441, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19440) ? typedArrayObtainStyledAttributes.getDimension(C6898.C6909.f19440, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19442) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19442, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m6861(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m6864()) {
            this.f240 = 0;
            return;
        }
        if (this.f240 == 1) {
            if (!this.f5305) {
                DisplayMetrics displayMetrics = this.f5308.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m6865(dimension2, dimension3, dimension);
            }
            m6860();
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m6855(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m6864()) {
            DisplayMetrics displayMetrics = this.f5308.getResources().getDisplayMetrics();
            m6865(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m6860()) {
                m421();
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m6856(@InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException {
        if (m6864()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5308.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f5304 = m422(iArrCopyOf);
                if (!m6862()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f5305 = false;
            }
            if (m6860()) {
                m421();
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m6857(int i) {
        if (m6864()) {
            if (i == 0) {
                m6844();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f5308.getResources().getDisplayMetrics();
            m6865(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m6860()) {
                m421();
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m6858(float f) {
        if (f != this.f5307.getPaint().getTextSize()) {
            this.f5307.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f5307.isInLayout();
            if (this.f5307.getLayout() != null) {
                this.f241 = false;
                try {
                    Method methodM6842 = m6842("nullLayouts");
                    if (methodM6842 != null) {
                        methodM6842.invoke(this.f5307, null);
                    }
                } catch (Exception e) {
                    Log.w(f5293, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.f5307.forceLayout();
                } else {
                    this.f5307.requestLayout();
                }
                this.f5307.invalidate();
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m6859(int i, float f) {
        Context context = this.f5308;
        m6858(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m6860() {
        if (m6864() && this.f240 == 1) {
            if (!this.f5305 || this.f5304.length == 0) {
                int iFloor = ((int) Math.floor((this.f5303 - this.f5302) / this.f5301)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f5302 + (i * this.f5301));
                }
                this.f5304 = m422(iArr);
            }
            this.f241 = true;
        } else {
            this.f241 = false;
        }
        return this.f241;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m6861(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f5304 = m422(iArr);
            m6862();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m6862() {
        boolean z = this.f5304.length > 0;
        this.f5305 = z;
        if (z) {
            this.f240 = 1;
            this.f5302 = r0[0];
            this.f5303 = r0[r1 - 1];
            this.f5301 = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m6863(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f5307.getText();
        TransformationMethod transformationMethod = this.f5307.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f5307)) != null) {
            text = transformation;
        }
        int maxLines = this.f5307.getMaxLines();
        m6852(i);
        StaticLayout staticLayoutM6845 = m6845(text, (Layout.Alignment) m6843(this.f5307, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM6845.getLineCount() <= maxLines && staticLayoutM6845.getLineEnd(staticLayoutM6845.getLineCount() - 1) == text.length())) && ((float) staticLayoutM6845.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m6864() {
        return !(this.f5307 instanceof C3306);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m6865(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f240 = 1;
        this.f5302 = f;
        this.f5303 = f2;
        this.f5301 = f3;
        this.f5305 = false;
    }
}
