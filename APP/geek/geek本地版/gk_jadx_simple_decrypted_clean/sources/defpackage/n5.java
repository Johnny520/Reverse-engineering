package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class n5 {
    public static final RectF l = null;
    public static final ConcurrentHashMap m = null;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final k5 k;

    static {
        l = new RectF();
        m = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public n5(TextView r3) {
        this.a = 0;
        this.b = false;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new int[0];
        this.g = false;
        this.i = r3;
        this.j = r3.getContext();
        if (Build.VERSION.SDK_INT < 29) goto L6;
        this.k = new l5();
        return;
    L6:
        this.k = new k5();
    }

    public static int[] b(int[] r6) {
        int r0 = r6.length;
        if (r0 == 0) goto L15;
        Arrays.sort(r6);
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L14;
        int r4 = r6[r3];
        if (r4 <= 0) goto L12;
        if (Collections.binarySearch(r1, Integer.valueOf(r4)) >= 0) goto L12;
        r1.add(Integer.valueOf(r4));
    L12:
        r3 = r3 + 1;
        goto L6
    L14:
        if (r0 == r1.size()) goto L15;
        int r62 = r1.size();
        int[] r02 = new int[r62];
    L17:
        if (r2 >= r62) goto L19;
        r02[r2] = ((Integer) r1.get(r2)).intValue();
        r2 = r2 + 1;
        goto L17
    L19:
        return r02;
    L15:
        return r6;
    }

    public static Method d(String r4) {
        ConcurrentHashMap r1 = m;     // Catch: Exception -> L9
        Method r2 = (Method) r1.get(r4);     // Catch: Exception -> L9
        if (r2 != null) goto L11;
        r2 = TextView.class.getDeclaredMethod(r4, null);     // Catch: Exception -> L9
        if (r2 == null) goto L11;
        r2.setAccessible(true);     // Catch: Exception -> L9
        r1.put(r4, r2);     // Catch: Exception -> L9
        return r2;
    L11:
        return r2;
    L9:
        e = move-exception;
        Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + r4 + "() method", e);
        return null;
    }

    public static Object e(Object r2, String r3, Object r4) {
        return d(r3).invoke(r2, null);
    L4:
        e = move-exception;
        Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r3 + "() method", e);
        return r4;
    L6:
        th = move-exception;
        throw th;
    }

    public final void a() {
        if (f() == true) goto L6;
        return;
    L6:
        if (this.b == true) goto L8;
    L32:
        this.b = true;
        return;
    L8:
        if (this.i.getMeasuredHeight() > 0) goto L10;
        return;
    L10:
        if (this.i.getMeasuredWidth() > 0) goto L13;
        return;
    L13:
        if (this.k.b(this.i) == false) goto L15;
        int r0 = 1048576;
    L16:
        int r1 = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
        if (r0 <= 0) goto L36;
        if (r1 <= 0) goto L39;
        RectF r2 = l;
        monitor-enter(r2);
        r2.setEmpty();     // Catch: Throwable -> L25
        r2.right = r0;     // Catch: Throwable -> L25
        r2.bottom = r1;     // Catch: Throwable -> L25
        float r02 = c(r2);     // Catch: Throwable -> L25
        if (r02 == this.i.getTextSize()) goto L27;
        g(0, r02);     // Catch: Throwable -> L25
    L27:
        monitor-exit(r2);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L39:
        return;
    L36:
        return;
    L15:
        r0 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
        goto L16
    }

    public final int c(RectF r19) {
        int r2 = this.f.length;
        if (r2 == 0) goto L30;
        int r22 = r2 - 1;
        int r5 = 0;
        int r4 = 1;
    L5:
        if (r4 > r22) goto L28;
        int r52 = (r4 + r22) / 2;
        int r6 = this.f[r52];
        TextView r7 = this.i;
        CharSequence r8 = r7.getText();
        TransformationMethod r9 = r7.getTransformationMethod();
        if (r9 == null) goto L11;
        CharSequence r92 = r9.getTransformation(r8, r7);
        if (r92 == null) goto L11;
        CharSequence r10 = r92;
    L12:
        int r13 = h5.b(r7);
        TextPaint r82 = this.h;
        if (r82 != null) goto L15;
        this.h = new TextPaint();
    L16:
        this.h.set(r7.getPaint());
        this.h.setTextSize(r6);
        StaticLayout r62 = j5.a(r10, (Layout.Alignment) e(r7, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(r19.right), r13, this.i, this.h, this.k);
        if (r13 == (-1)) goto L24;
        if (r62.getLineCount() > r13) goto L25;
        if (r62.getLineEnd(r62.getLineCount() - 1) == r10.length()) goto L24;
    L25:
        r5 = r52 - 1;
        r22 = r5;
    L24:
        if (r62.getHeight() > r19.bottom) goto L25;
        int r53 = r52 + 1;
        r5 = r4;
        r4 = r53;
        goto L5
    L15:
        r82.reset();
    L11:
        r10 = r8;
        goto L12
    L28:
        return this.f[r5];
    L30:
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() == true) goto L5;
        return false;
    L5:
        if (this.a == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void g(int r4, float r5) {
        Context r0 = this.j;
        if (r0 != null) goto L5;
        Resources r02 = Resources.getSystem();
    L6:
        float r42 = TypedValue.applyDimension(r4, r5, r02.getDisplayMetrics());
        TextView r52 = this.i;
        if (r42 == r52.getPaint().getTextSize()) goto L24;
        r52.getPaint().setTextSize(r42);
        boolean r43 = i5.a(r52);
        if (r52.getLayout() == null) goto L25;
        this.b = false;
        Method r03 = d("nullLayouts");     // Catch: Exception -> L15
        if (r03 == null) goto L17;
        r03.invoke(r52, null);     // Catch: Exception -> L15
    L17:
        if (r43 == true) goto L19;
        r52.requestLayout();
    L20:
        r52.invalidate();
        return;
    L19:
        r52.forceLayout();
    L15:
        e = move-exception;
        Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
        goto L17
    L25:
        return;
    L24:
        return;
    L5:
        r02 = r0.getResources();
        goto L6
    }

    public final boolean h() {
        int r1 = 0;
        if (j() == true) goto L5;
    L15:
        this.b = false;
    L17:
        return this.b;
    L5:
        if (this.a != 1) goto L15;
        if (this.g == true) goto L9;
    L10:
        int r0 = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
        int[] r3 = new int[r0];
    L11:
        if (r1 >= r0) goto L13;
        r3[r1] = Math.round((r1 * this.c) + this.d);
        r1 = r1 + 1;
        goto L11
    L13:
        this.f = b(r3);
    L14:
        this.b = true;
        goto L17
    L9:
        if (this.f.length != 0) goto L14;
        goto L10
    }

    public final boolean i() {
        if (this.f.length <= 0) goto L5;
        boolean r4 = true;
    L6:
        this.g = r4;
        if (r4 == false) goto L9;
        this.a = 1;
        this.d = r0[0];
        this.e = r0[r1 - 1];
        this.c = -1.0f;
    L9:
        return r4;
    L5:
        r4 = false;
        goto L6
    }

    public final boolean j() {
        return !(this.i instanceof w3);
    }

    public final void k(float r4, float r5, float r6) {
        if (r4 <= 0.0f) goto L15;
        if (r5 <= r4) goto L13;
        if (r6 <= 0.0f) goto L11;
        this.a = 1;
        this.d = r4;
        this.e = r5;
        this.c = r6;
        this.g = false;
        return;
    L11:
        throw new IllegalArgumentException("The auto-size step granularity (" + r6 + "px) is less or equal to (0px)");
    L13:
        throw new IllegalArgumentException("Maximum auto-size text size (" + r5 + "px) is less or equal to minimum auto-size text size (" + r4 + "px)");
    L15:
        throw new IllegalArgumentException("Minimum auto-size text size (" + r4 + "px) is less or equal to (0px)");
    }
}
