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
    public static final RectF f3136l = null;

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f3137m = null;

    /* JADX INFO: renamed from: a */
    public int f3138a;

    /* JADX INFO: renamed from: b */
    public boolean f3139b;

    /* JADX INFO: renamed from: c */
    public float f3140c;

    /* JADX INFO: renamed from: d */
    public float f3141d;

    /* JADX INFO: renamed from: e */
    public float f3142e;

    /* JADX INFO: renamed from: f */
    public int[] f3143f;

    /* JADX INFO: renamed from: g */
    public boolean f3144g;

    /* JADX INFO: renamed from: h */
    public TextPaint f3145h;

    /* JADX INFO: renamed from: i */
    public final TextView f3146i;

    /* JADX INFO: renamed from: j */
    public final Context f3147j;

    /* JADX INFO: renamed from: k */
    public final C0872M f3148k;

    static {
        f3136l = new RectF();
        f3137m = new ConcurrentHashMap();
    }

    public C0878P(TextView r3) {
        this.f3138a = 0;
        this.f3139b = false;
        this.f3140c = -1.0f;
        this.f3141d = -1.0f;
        this.f3142e = -1.0f;
        this.f3143f = new int[0];
        this.f3144g = false;
        this.f3146i = r3;
        this.f3147j = r3.getContext();
        if (Build.VERSION.SDK_INT < 29) goto L5;
        this.f3148k = new C0874N();
        return;
    L5:
        this.f3148k = new C0872M();
    }

    /* JADX INFO: renamed from: b */
    public static int[] m2200b(int[] r6) {
        int r02 = r6.length;
        if (r02 != 0) goto L5;
        return r6;
    L5:
        Arrays.sort(r6);
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r02) goto L14;
        int r4 = r6[r3];
        if (r4 <= 0) goto L12;
        if (Collections.binarySearch(r1, Integer.valueOf(r4)) >= 0) goto L12;
        r1.add(Integer.valueOf(r4));
    L12:
        r3 = r3 + 1;
        goto L6
    L14:
        if (r02 != r1.size()) goto L16;
        return r6;
    L16:
        int r62 = r1.size();
        int[] r03 = new int[r62];
    L17:
        if (r2 >= r62) goto L19;
        r03[r2] = ((Integer) r1.get(r2)).intValue();
        r2 = r2 + 1;
        goto L17
    L19:
        return r03;
    }

    /* JADX INFO: renamed from: d */
    public static Method m2201d(String r4) {
        ConcurrentHashMap r1 = f3137m;     // Catch: Exception -> L9
        Method r2 = (Method) r1.get(r4);     // Catch: Exception -> L9
        if (r2 != null) goto L8;
        r2 = TextView.class.getDeclaredMethod(r4, null);     // Catch: Exception -> L9
        if (r2 == null) goto L8;
        r2.setAccessible(true);     // Catch: Exception -> L9
        r1.put(r4, r2);     // Catch: Exception -> L9
    L8:
        return r2;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Object m2202e(Object r1, Object r2, String r3) {
        return m2201d(r3).invoke(r1, null);
    L4:
        th = move-exception;
        throw th;
    L10:
        return r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2203a() {
        if (m2205f() == true) goto L6;
        return;
    L6:
        if (this.f3139b == true) goto L8;
    L32:
        this.f3139b = true;
        return;
    L8:
        if (this.f3146i.getMeasuredHeight() > 0) goto L10;
        return;
    L10:
        if (this.f3146i.getMeasuredWidth() > 0) goto L13;
        return;
    L13:
        if (this.f3148k.mo2198b(this.f3146i) == false) goto L15;
        int r02 = 1048576;
    L16:
        int r1 = (this.f3146i.getHeight() - this.f3146i.getCompoundPaddingBottom()) - this.f3146i.getCompoundPaddingTop();
        if (r02 <= 0) goto L36;
        if (r1 <= 0) goto L38;
        RectF r2 = f3136l;
        monitor-enter(r2);
        r2.setEmpty();     // Catch: Throwable -> L25
        r2.right = r02;     // Catch: Throwable -> L25
        r2.bottom = r1;     // Catch: Throwable -> L25
        float r03 = m2204c(r2);     // Catch: Throwable -> L25
        if (r03 == this.f3146i.getTextSize()) goto L27;
        m2206g(0, r03);     // Catch: Throwable -> L25
    L27:
        monitor-exit(r2);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L38:
        return;
    L36:
        return;
    L15:
        r02 = (this.f3146i.getMeasuredWidth() - this.f3146i.getTotalPaddingLeft()) - this.f3146i.getTotalPaddingRight();
        goto L16
    }

    /* JADX INFO: renamed from: c */
    public final int m2204c(RectF r19) {
        int r2 = this.f3143f.length;
        if (r2 == 0) goto L29;
        int r22 = r2 - 1;
        int r5 = 0;
        int r4 = 1;
    L5:
        if (r4 > r22) goto L27;
        int r52 = (r4 + r22) / 2;
        int r6 = this.f3143f[r52];
        TextView r7 = this.f3146i;
        CharSequence r8 = r7.getText();
        TransformationMethod r9 = r7.getTransformationMethod();
        if (r9 == null) goto L11;
        CharSequence r92 = r9.getTransformation(r8, r7);
        if (r92 == null) goto L11;
        r8 = r92;
    L11:
        int r93 = r7.getMaxLines();
        TextPaint r10 = this.f3145h;
        if (r10 != null) goto L14;
        this.f3145h = new TextPaint();
    L15:
        this.f3145h.set(r7.getPaint());
        this.f3145h.setTextSize(r6);
        CharSequence r102 = r8;
        StaticLayout r62 = AbstractC0870L.m2193a(r102, (Layout.Alignment) m2202e(r7, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(r19.right), r93, this.f3146i, this.f3145h, this.f3148k);
        if (r93 == (-1)) goto L23;
        if (r62.getLineCount() > r93) goto L24;
        if (r62.getLineEnd(r62.getLineCount() - 1) == r8.length()) goto L23;
    L24:
        r5 = r52 - 1;
        r22 = r5;
    L23:
        if (r62.getHeight() > r19.bottom) goto L24;
        int r53 = r52 + 1;
        r5 = r4;
        r4 = r53;
        goto L5
    L14:
        r10.reset();
        goto L15
    L27:
        return this.f3143f[r5];
    L29:
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2205f() {
        if (m2209j() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f3138a == 0) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m2206g(int r3, float r4) {
        Context r02 = this.f3147j;
        if (r02 != null) goto L5;
        Resources r03 = Resources.getSystem();
    L6:
        float r32 = TypedValue.applyDimension(r3, r4, r03.getDisplayMetrics());
        TextView r42 = this.f3146i;
        if (r32 == r42.getPaint().getTextSize()) goto L22;
        r42.getPaint().setTextSize(r32);
        boolean r33 = r42.isInLayout();
        if (r42.getLayout() == null) goto L23;
        this.f3139b = false;
        Method r04 = m2201d("nullLayouts");     // Catch: Exception -> L19
        if (r04 == null) goto L14;
        r04.invoke(r42, null);     // Catch: Exception -> L19
    L14:
        if (r33 == true) goto L16;
        r42.requestLayout();
    L17:
        r42.invalidate();
        return;
    L16:
        r42.forceLayout();
        goto L17
    L23:
        return;
    L22:
        return;
    L5:
        r03 = r02.getResources();
        goto L6
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2207h() {
        int r1 = 0;
        if (m2209j() == true) goto L5;
    L15:
        this.f3139b = false;
    L17:
        return this.f3139b;
    L5:
        if (this.f3138a != 1) goto L15;
        if (this.f3144g == true) goto L9;
    L10:
        int r02 = ((int) Math.floor((this.f3142e - this.f3141d) / this.f3140c)) + 1;
        int[] r3 = new int[r02];
    L11:
        if (r1 >= r02) goto L13;
        r3[r1] = Math.round((r1 * this.f3140c) + this.f3141d);
        r1 = r1 + 1;
        goto L11
    L13:
        this.f3143f = m2200b(r3);
    L14:
        this.f3139b = true;
        goto L17
    L9:
        if (this.f3143f.length != 0) goto L14;
        goto L10
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2208i() {
        if (this.f3143f.length <= 0) goto L5;
        boolean r4 = true;
    L6:
        this.f3144g = r4;
        if (r4 == false) goto L9;
        this.f3138a = 1;
        this.f3141d = r0[0];
        this.f3142e = r0[r1 - 1];
        this.f3140c = -1.0f;
    L9:
        return r4;
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2209j() {
        return !(this.f3146i instanceof AbstractC0930u);
    }

    /* JADX INFO: renamed from: k */
    public final void m2210k(float r4, float r5, float r6) {
        if (r4 <= 0.0f) goto L15;
        if (r5 <= r4) goto L13;
        if (r6 <= 0.0f) goto L11;
        this.f3138a = 1;
        this.f3141d = r4;
        this.f3142e = r5;
        this.f3140c = r6;
        this.f3144g = false;
        return;
    L11:
        throw new IllegalArgumentException("The auto-size step granularity (" + r6 + "px) is less or equal to (0px)");
    L13:
        throw new IllegalArgumentException("Maximum auto-size text size (" + r5 + "px) is less or equal to minimum auto-size text size (" + r4 + "px)");
    L15:
        throw new IllegalArgumentException("Minimum auto-size text size (" + r4 + "px) is less or equal to (0px)");
    }
}
