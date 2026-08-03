package p001A0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002B.C0054d;
import p006D.AbstractC0080Q;
import p007D0.C0140f;
import p007D0.C0142h;
import p007D0.C0144j;
import p009E0.AbstractC0193x;
import p009E0.C0192w;
import p011F0.C0199c;
import p017J.AbstractC0215d;
import p017J.AbstractC0216e;
import p017J.AbstractC0225n;
import p017J.AbstractC0226o;
import p017J.AbstractC0227p;
import p017J.ActionModeCallbackC0229r;
import p022L0.AbstractC0246a;
import p024M0.AbstractC0249a;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.InterfaceC0302b;
import p034S.AbstractC0324d;
import p038U0.InterfaceC0391a;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: A0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0040p {
    /* JADX INFO: renamed from: B */
    public static boolean m79B(int r3, Rect r4, Rect r5) {
        if (r3 != 17) goto L5;
        int r32 = r4.right;
        int r02 = r5.right;
        if (r32 > r02) goto L41;
        if (r4.left >= r02) goto L41;
        return false;
    L41:
        if (r4.left > r5.left) goto L43;
        return false;
    L43:
        return true;
    L5:
        if (r3 != 33) goto L7;
        int r33 = r4.bottom;
        int r03 = r5.bottom;
        if (r33 > r03) goto L33;
        if (r4.top >= r03) goto L33;
        return false;
    L33:
        if (r4.top > r5.top) goto L35;
        return false;
    L35:
        return true;
    L7:
        if (r3 != 66) goto L9;
        int r34 = r4.left;
        int r04 = r5.left;
        if (r34 < r04) goto L25;
        if (r4.right <= r04) goto L25;
        return false;
    L25:
        if (r4.right < r5.right) goto L27;
        return false;
    L27:
        return true;
    L9:
        if (r3 != 130) goto L19;
        int r35 = r4.top;
        int r05 = r5.top;
        if (r35 < r05) goto L15;
        if (r4.bottom <= r05) goto L15;
        return false;
    L15:
        if (r4.bottom < r5.bottom) goto L17;
        return false;
    L17:
        return true;
    L19:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: C */
    public static boolean m80C(EditText r02) {
        if (r02.getInputType() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static C0142h m81E(InterfaceC0275a r1) {
        AbstractC0307g.m703e(r1, "initializer");
        return new C0142h(r1);
    }

    /* JADX INFO: renamed from: F */
    public static List m82F(Object r1) {
        List r12 = Collections.singletonList(r1);
        AbstractC0307g.m702d(r12, "singletonList(...)");
        return r12;
    }

    /* JADX INFO: renamed from: G */
    public static int m83G(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.left;
        int r22 = r3.right;
    L18:
        return Math.max(0, r12 - r22);
    L5:
        if (r1 != 33) goto L7;
        r12 = r2.top;
        r22 = r3.bottom;
        goto L18
    L7:
        if (r1 != 66) goto L9;
        r12 = r3.left;
        r22 = r2.right;
        goto L18
    L9:
        if (r1 != 130) goto L13;
        r12 = r3.top;
        r22 = r2.bottom;
        goto L18
    L13:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: H */
    public static int m84H(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
    L15:
        int r12 = r2.top;
        int r22 = (r2.height() / 2) + r12;
        int r13 = r3.top;
        return Math.abs(r22 - ((r3.height() / 2) + r13));
    L5:
        if (r1 != 33) goto L7;
    L13:
        int r14 = r2.left;
        int r23 = (r2.width() / 2) + r14;
        int r15 = r3.left;
        return Math.abs(r23 - ((r3.width() / 2) + r15));
    L7:
        if (r1 == 66) goto L15;
        if (r1 == 130) goto L13;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: J */
    public static float m85J(EdgeEffect r2, float r3, float r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        AbstractC0215d.m598a(r2, r3, r4);
        return r3;
    L5:
        return AbstractC0216e.m601c(r2, r3, r4);
    }

    /* JADX INFO: renamed from: O */
    public static void m86O(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7) {
        Drawable r02 = r6.getDrawable();
        if (r6.getDrawable() == null) goto L10;
        if (r7 != null) goto L6;
        return;
    L6:
        if (r7.isStateful() == false) goto L12;
        int[] r52 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r52.length;
        int[] r53 = Arrays.copyOf(r52, r52.length + r1.length);
        System.arraycopy(r1, 0, r53, r2, r1.length);
        int r54 = r7.getColorForState(r53, r7.getDefaultColor());
        Drawable r72 = r02.mutate();
        AbstractC1111a.m2626h(r72, ColorStateList.valueOf(r54));
        r6.setImageDrawable(r72);
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: P */
    public static int m87P(float r1) {
        if (Float.isNaN(r1) == true) goto L7;
        return Math.round(r1);
    L7:
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* JADX INFO: renamed from: S */
    public static void m88S(TextView r3, int r4) {
        m105h(r4);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        AbstractC0227p.m628d(r3, r4);
        return;
    L6:
        Paint.FontMetricsInt r02 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L9;
        int r03 = r02.top;
    L11:
        if (r4 <= Math.abs(r03)) goto L14;
        int r42 = r4 + r03;
        r3.setPadding(r3.getPaddingLeft(), r42, r3.getPaddingRight(), r3.getPaddingBottom());
        return;
    L14:
        return;
    L9:
        r03 = r02.ascent;
        goto L11
    }

    /* JADX INFO: renamed from: T */
    public static void m89T(CheckableImageButton r3, View.OnLongClickListener r4) {
        Field r02 = AbstractC0080Q.f219a;
        boolean r03 = r3.hasOnClickListeners();
        boolean r1 = false;
        int r2 = 1;
        if (r4 == null) goto L5;
        boolean r42 = true;
    L6:
        if (r03 == true) goto L8;
        if (r42 == true) goto L8;
    L9:
        r3.setFocusable(r1);
        r3.setClickable(r03);
        r3.setPressable(r03);
        r3.setLongClickable(r42);
        if (r1 == true) goto L13;
        r2 = 2;
    L13:
        r3.setImportantForAccessibility(r2);
        return;
    L8:
        r1 = true;
        goto L9
    L5:
        r42 = false;
        goto L6
    }

    /* JADX INFO: renamed from: U */
    public static void m90U(TextView r3, int r4) {
        m105h(r4);
        Paint.FontMetricsInt r02 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L5;
        int r03 = r02.bottom;
    L7:
        if (r4 <= Math.abs(r03)) goto L10;
        int r42 = r4 - r03;
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingRight(), r42);
        return;
    L10:
        return;
    L5:
        r03 = r02.descent;
        goto L7
    }

    /* JADX INFO: renamed from: V */
    public static void m91V(TextView r2, int r3) {
        m105h(r3);
        if (r3 == r2.getPaint().getFontMetricsInt(null)) goto L6;
        r2.setLineSpacing(r3 - r0, 1.0f);
        return;
    }

    /* JADX INFO: renamed from: W */
    public static Set m92W(Object... r4) {
        int r02 = r4.length;
        if (r02 == 0) goto L11;
        int r2 = 0;
        if (r02 == 1) goto L9;
        LinkedHashSet r03 = new LinkedHashSet(AbstractC0193x.m563g0(r4.length));
        int r1 = r4.length;
    L7:
        if (r2 >= r1) goto L14;
        r03.add(r4[r2]);
        r2 = r2 + 1;
        goto L7
    L14:
        return r03;
    L9:
        Set r04 = Collections.singleton(r4[0]);
        AbstractC0307g.m702d(r04, "singleton(...)");
        return r04;
    L11:
        return C0192w.f403a;
    }

    /* JADX INFO: renamed from: X */
    public static void m93X(EditorInfo r2, CharSequence r3, int r4, int r5) {
        if (r2.extras != null) goto L5;
        r2.extras = new Bundle();
    L5:
        if (r3 == null) goto L7;
        SpannableStringBuilder r02 = new SpannableStringBuilder(r3);
    L8:
        r2.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", r02);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", r4);
        r2.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", r5);
        return;
    L7:
        r02 = null;
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m94a(Object[] r4, int r5, int r6, List r7) {
        if (r6 != r7.size()) goto L15;
        int r02 = 0;
    L6:
        if (r02 >= r6) goto L11;
        if (AbstractC0307g.m699a(r4[r5 + r02], r7.get(r02)) == false) goto L16;
        r02 = r02 + 1;
        goto L6
    L16:
        return false;
    L11:
        return true;
    L15:
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m95a0(int r1, Object[] r2) {
        AbstractC0307g.m703e(r2, "array");
        if (r1 >= r2.length) goto L6;
        r2[r1] = null;
        return;
    }

    /* JADX INFO: renamed from: b */
    public static final String m96b(Object[] r3, int r4, int r5, Collection r6) {
        StringBuilder r02 = new StringBuilder((r5 * 3) + 2);
        r02.append("[");
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L11;
        if (r1 <= 0) goto L6;
        r02.append(", ");
    L6:
        Object r2 = r3[r4 + r1];
        if (r2 != r6) goto L9;
        r02.append("(this Collection)");
    L10:
        r1 = r1 + 1;
        goto L3
    L9:
        r02.append(r2);
        goto L10
    L11:
        r02.append("]");
        String r32 = r02.toString();
        AbstractC0307g.m702d(r32, "toString(...)");
        return r32;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m97b0(Object r1) {
        if ((r1 instanceof C0140f) == true) goto L6;
        return;
    L6:
        throw ((C0140f) r1).f330a;
    }

    /* JADX INFO: renamed from: c */
    public static void m98c(TextInputLayout r5, CheckableImageButton r6, ColorStateList r7, PorterDuff.Mode r8) {
        Drawable r02 = r6.getDrawable();
        if (r02 == null) goto L13;
        r02 = r02.mutate();
        if (r7 != null) goto L7;
    L9:
        AbstractC1111a.m2626h(r02, r7);
    L10:
        if (r8 == null) goto L13;
        AbstractC1111a.m2627i(r02, r8);
        goto L13
    L7:
        if (r7.isStateful() == false) goto L9;
        int[] r52 = r5.getDrawableState();
        int[] r1 = r6.getDrawableState();
        int r2 = r52.length;
        int[] r53 = Arrays.copyOf(r52, r52.length + r1.length);
        System.arraycopy(r1, 0, r53, r2, r1.length);
        AbstractC1111a.m2626h(r02, ColorStateList.valueOf(r7.getColorForState(r53, r7.getDefaultColor())));
    L13:
        if (r6.getDrawable() == r02) goto L16;
        r6.setImageDrawable(r02);
        return;
    }

    /* JADX INFO: renamed from: c0 */
    public static byte[] m99c0(ArrayList r4) {
        byte[] r02 = new byte[r4.size()];
        Iterator r42 = r4.iterator();
        int r1 = 0;
    L4:
        if (r42.hasNext() == false) goto L6;
        r02[r1] = ((C0144j) r42.next()).f337a;
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100d(int r9, Rect r10, Rect r11, Rect r12) {
        boolean r02 = m101e(r9, r10, r11);
        if (m101e(r9, r10, r12) == true) goto L44;
        if (r02 == false) goto L44;
        if (r9 == 17) goto L23;
        if (r9 == 33) goto L20;
        if (r9 == 66) goto L17;
        if (r9 != 130) goto L15;
        if (r10.bottom <= r12.top) goto L24;
    L43:
        return true;
    L24:
        if (r9 == 17) goto L43;
        if (r9 == 66) goto L43;
        int r112 = m83G(r9, r10, r11);
        if (r9 == 17) goto L38;
        if (r9 == 33) goto L37;
        if (r9 == 66) goto L36;
        if (r9 != 130) goto L35;
        int r92 = r12.bottom;
        int r102 = r10.bottom;
    L40:
        if (r112 < Math.max(1, r92 - r102)) goto L42;
        return false;
    L42:
        return true;
    L35:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L36:
        r92 = r12.right;
        r102 = r10.right;
        goto L40
    L37:
        r92 = r10.top;
        r102 = r12.top;
        goto L40
    L38:
        r92 = r10.left;
        r102 = r12.left;
        goto L40
    L15:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L17:
        if (r10.right > r12.left) goto L43;
    L20:
        if (r10.top < r12.bottom) goto L43;
    L23:
        if (r10.left < r12.right) goto L43;
    L44:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m101e(int r3, Rect r4, Rect r5) {
        if (r3 == 17) goto L20;
        if (r3 == 33) goto L14;
        if (r3 == 66) goto L20;
        if (r3 == 130) goto L14;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L14:
        if (r5.right >= r4.left) goto L16;
        return false;
    L16:
        if (r5.left <= r4.right) goto L18;
        return false;
    L18:
        return true;
    L20:
        if (r5.bottom >= r4.top) goto L22;
        return false;
    L22:
        if (r5.top <= r4.bottom) goto L24;
        return false;
    L24:
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public static ActionMode.Callback m102e0(ActionMode.Callback r2, TextView r3) {
        if (Build.VERSION.SDK_INT <= 27) goto L5;
    L10:
        return r2;
    L5:
        if ((r2 instanceof ActionModeCallbackC0229r) == true) goto L10;
        if (r2 == null) goto L10;
        return new ActionModeCallbackC0229r(r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public static C0199c m103f(C0199c r1) {
        r1.m582f();
        r1.f421c = true;
        if (r1.f420b <= 0) goto L6;
        return r1;
    L6:
        return C0199c.f418d;
    }

    /* JADX INFO: renamed from: g */
    public static void m104g(String r02, boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r02);
    }

    /* JADX INFO: renamed from: h */
    public static void m105h(int r02) {
        if (r02 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: i */
    public static void m106i(Object r02, String r1) {
        if (r02 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r1);
    }

    /* JADX INFO: renamed from: j */
    public static void m107j(int r3, int r4, int r5) {
        if (r3 < 0) goto L10;
        if (r4 > r5) goto L10;
        if (r3 > r4) goto L8;
        return;
    L8:
        throw new IllegalArgumentException(AbstractC0324d.m721d("fromIndex: ", r3, " > toIndex: ", r4));
    L10:
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }

    /* JADX INFO: renamed from: m */
    public static final void m108m(Closeable r2, Throwable r3) {
        if (r2 == null) goto L22;
        if (r3 != null) goto L20;
        r2.close();
        return;
    L20:
        r2.close();     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        AbstractC0307g.m703e(r3, "<this>");
        AbstractC0307g.m703e(th, "exception");
        if (r3 == th) goto L24;
        Integer r02 = AbstractC0249a.f525a;
        if (r02 != null) goto L13;
    L18:
        r3.addSuppressed(th);
        return;
    L13:
        if (r02.intValue() >= 19) goto L18;
        Method r03 = AbstractC0246a.f524a;
        if (r03 == null) goto L25;
        r03.invoke(r3, new Object[]{th});
        return;
    L25:
        return;
    L24:
        return;
    }

    /* JADX INFO: renamed from: n */
    public static double m109n(double r1, double r3, double r5) {
        if (r3 > r5) goto L12;
        if (r1 >= r3) goto L8;
        return r3;
    L8:
        if (r1 <= r5) goto L10;
        return r5;
    L10:
        return r1;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r5 + " is less than minimum " + r3 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static float m110o(float r2, float r3, float r4) {
        if (r3 > r4) goto L12;
        if (r2 >= r3) goto L8;
        return r3;
    L8:
        if (r2 <= r4) goto L10;
        return r4;
    L10:
        return r2;
    L12:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r4 + " is less than minimum " + r3 + '.');
    }

    /* JADX INFO: renamed from: p */
    public static int m111p(int r2, int r3, int r4) {
        if (r3 > r4) goto L9;
        if (r2 >= r3) goto L5;
        return r3;
    L5:
        if (r2 <= r4) goto L7;
        return r4;
    L7:
        return r2;
    L9:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + r4 + " is less than minimum " + r3 + '.');
    }

    /* JADX INFO: renamed from: q */
    public static int m112q(Comparable r02, Comparable r1) {
        if (r02 != r1) goto L5;
        return 0;
    L5:
        if (r02 != null) goto L8;
        return -1;
    L8:
        if (r1 != null) goto L12;
        return 1;
    L12:
        return r02.compareTo(r1);
    }

    /* JADX INFO: renamed from: r */
    public static ImageView.ScaleType m113r(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 5) goto L18;
        if (r1 == 6) goto L16;
        return ImageView.ScaleType.CENTER;
    L16:
        return ImageView.ScaleType.CENTER_INSIDE;
    L18:
        return ImageView.ScaleType.CENTER_CROP;
    L20:
        return ImageView.ScaleType.FIT_END;
    L22:
        return ImageView.ScaleType.FIT_CENTER;
    L24:
        return ImageView.ScaleType.FIT_START;
    L26:
        return ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: s */
    public static final void m114s(int r3, int r4) {
        if (r3 > r4) goto L5;
        return;
    L5:
        throw new IndexOutOfBoundsException("toIndex (" + r3 + ") is greater than size (" + r4 + ").");
    }

    /* JADX INFO: renamed from: t */
    public static final long m115t(InputStream r5, OutputStream r6, int r7) {
        byte[] r72 = new byte[r7];
        int r02 = r5.read(r72);
        long r1 = 0;
    L3:
        if (r02 < 0) goto L5;
        r6.write(r72, 0, r02);
        r1 = r1 + ((long) r02);
        r02 = r5.read(r72);
        goto L3
    L5:
        return r1;
    }

    /* JADX INFO: renamed from: u */
    public static final C0140f m116u(Throwable r1) {
        AbstractC0307g.m703e(r1, "exception");
        return new C0140f(r1);
    }

    /* JADX INFO: renamed from: v */
    public static float m117v(EdgeEffect r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return AbstractC0216e.m600b(r2);
    }

    /* JADX INFO: renamed from: x */
    public static final Class m118x(InterfaceC0391a r2) {
        AbstractC0307g.m703e(r2, "<this>");
        Class r22 = ((InterfaceC0302b) r2).mo696a();
        if (r22.isPrimitive() == true) goto L5;
        return r22;
    L5:
        String r02 = r22.getName();
        switch(r02.hashCode()) {
            case -1325958191: goto L41;
            case 104431: goto L37;
            case 3039496: goto L33;
            case 3052374: goto L29;
            case 3327612: goto L25;
            case 3625364: goto L21;
            case 64711720: goto L17;
            case 97526364: goto L13;
            case 109413500: goto L9;
            default: goto L53;
        };
    L53:
        return r22;
    L9:
        if (r02.equals("short") == false) goto L54;
        return Short.class;
    L54:
        return r22;
    L13:
        if (r02.equals("float") == false) goto L55;
        return Float.class;
    L55:
        return r22;
    L17:
        if (r02.equals("boolean") == false) goto L56;
        return Boolean.class;
    L56:
        return r22;
    L21:
        if (r02.equals("void") == false) goto L57;
        return Void.class;
    L57:
        return r22;
    L25:
        if (r02.equals("long") == false) goto L58;
        return Long.class;
    L58:
        return r22;
    L29:
        if (r02.equals("char") == false) goto L59;
        return Character.class;
    L59:
        return r22;
    L33:
        if (r02.equals("byte") == false) goto L60;
        return Byte.class;
    L60:
        return r22;
    L37:
        if (r02.equals("int") == false) goto L61;
        return Integer.class;
    L61:
        return r22;
    L41:
        if (r02.equals("double") == false) goto L62;
        return Double.class;
    L62:
        return r22;
    }

    /* JADX INFO: renamed from: y */
    public static C0054d m119y(TextView r7) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 28) goto L5;
        TextPaint r2 = new TextPaint(r7.getPaint());
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int r32 = AbstractC0225n.m616a(r7);
        int r4 = AbstractC0225n.m619d(r7);
        if ((r7.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L9;
        TextDirectionHeuristic r72 = TextDirectionHeuristics.LTR;
    L36:
        return new C0054d(r2, r72, r32, r4);
    L9:
        boolean r5 = true;
        if (r02 < 28) goto L21;
        if ((r7.getInputType() & 15) != 3) goto L21;
        byte r73 = Character.getDirectionality(AbstractC0227p.m626b(AbstractC0226o.m624a(r7.getTextLocale()))[0].codePointAt(0));
        if (r73 != 1) goto L16;
    L19:
        r72 = TextDirectionHeuristics.RTL;
        goto L36
    L16:
        if (r73 == 2) goto L19;
        r72 = TextDirectionHeuristics.LTR;
    L21:
        if (r7.getLayoutDirection() == 1) goto L25;
        r5 = false;
    L25:
        switch(r7.getTextDirection()) {
            case 2: goto L34;
            case 3: goto L33;
            case 4: goto L32;
            case 5: goto L31;
            case 6: goto L30;
            case 7: goto L29;
            default: goto L26;
        };
    L26:
        if (r5 == false) goto L28;
        r72 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L36
    L28:
        r72 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        goto L36
    L29:
        r72 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L36
    L30:
        r72 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        goto L36
    L31:
        r72 = TextDirectionHeuristics.LOCALE;
        goto L36
    L32:
        r72 = TextDirectionHeuristics.RTL;
        goto L36
    L33:
        r72 = TextDirectionHeuristics.LTR;
        goto L36
    L34:
        r72 = TextDirectionHeuristics.ANYRTL_LTR;
        goto L36
    L5:
        return new C0054d(AbstractC0227p.m627c(r7));
    }

    /* JADX INFO: renamed from: A */
    public int mo120A() {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public abstract boolean mo121D();

    /* JADX INFO: renamed from: I */
    public abstract void m122I(int r1, int r2);

    /* JADX INFO: renamed from: K */
    public void mo123K(View r1, int r2) {
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo124L(int r1);

    /* JADX INFO: renamed from: M */
    public abstract void mo125M(View r1, int r2, int r3);

    /* JADX INFO: renamed from: N */
    public abstract void mo126N(View r1, float r2, float r3);

    /* JADX INFO: renamed from: Q */
    public abstract void mo127Q(boolean r1);

    /* JADX INFO: renamed from: R */
    public abstract void mo128R(boolean r1);

    /* JADX INFO: renamed from: Y */
    public abstract void mo129Y();

    /* JADX INFO: renamed from: Z */
    public abstract void m130Z();

    /* JADX INFO: renamed from: d0 */
    public abstract boolean mo131d0(View r1, int r2);

    /* JADX INFO: renamed from: f0 */
    public abstract TransformationMethod mo132f0(TransformationMethod r1);

    /* JADX INFO: renamed from: k */
    public abstract int mo133k(View r1, int r2);

    /* JADX INFO: renamed from: l */
    public abstract int mo134l(View r1, int r2);

    /* JADX INFO: renamed from: w */
    public abstract InputFilter[] mo135w(InputFilter[] r1);

    /* JADX INFO: renamed from: z */
    public int mo136z(View r1) {
        return 0;
    }
}
