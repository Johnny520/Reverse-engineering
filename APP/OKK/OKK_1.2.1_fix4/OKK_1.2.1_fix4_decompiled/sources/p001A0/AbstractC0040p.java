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
import java.io.IOException;
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
    public static boolean m79B(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m80C(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX INFO: renamed from: E */
    public static C0142h m81E(InterfaceC0275a interfaceC0275a) {
        AbstractC0307g.m703e(interfaceC0275a, "initializer");
        return new C0142h(interfaceC0275a);
    }

    /* JADX INFO: renamed from: F */
    public static List m82F(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0307g.m702d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: G */
    public static int m83G(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* JADX INFO: renamed from: H */
    public static int m84H(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: J */
    public static float m85J(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0216e.m601c(edgeEffect, f2, f3);
        }
        AbstractC0215d.m598a(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX INFO: renamed from: O */
    public static void m86O(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        AbstractC1111a.m2626h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: P */
    public static int m87P(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    /* JADX INFO: renamed from: S */
    public static void m88S(TextView textView, int i2) {
        m105h(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0227p.m628d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m89T(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = AbstractC0080Q.f219a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* JADX INFO: renamed from: U */
    public static void m90U(TextView textView, int i2) {
        m105h(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m91V(TextView textView, int i2) {
        m105h(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: W */
    public static Set m92W(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C0192w.f403a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            AbstractC0307g.m702d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0193x.m563g0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: X */
    public static void m93X(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m94a(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0307g.m699a(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m95a0(int i2, Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m96b(Object[] objArr, int i2, int i3, Collection collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m97b0(Object obj) throws Throwable {
        if (obj instanceof C0140f) {
            throw ((C0140f) obj).f330a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m98c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC1111a.m2626h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                AbstractC1111a.m2626h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC1111a.m2627i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static byte[] m99c0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = ((C0144j) it.next()).f337a;
            i2++;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m100d(int i2, Rect rect, Rect rect2, Rect rect3) {
        int i3;
        int i4;
        boolean zM101e = m101e(i2, rect, rect2);
        if (m101e(i2, rect, rect3) || !zM101e) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i2 != 17 && i2 != 66) {
                            int iM83G = m83G(i2, rect, rect2);
                            if (i2 == 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 == 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 == 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            return iM83G < Math.max(1, i3 - i4);
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m101e(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: e0 */
    public static ActionMode.Callback m102e0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC0229r) || callback == null) ? callback : new ActionModeCallbackC0229r(callback, textView);
    }

    /* JADX INFO: renamed from: f */
    public static C0199c m103f(C0199c c0199c) {
        c0199c.m582f();
        c0199c.f421c = true;
        return c0199c.f420b > 0 ? c0199c : C0199c.f418d;
    }

    /* JADX INFO: renamed from: g */
    public static void m104g(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m105h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m106i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m107j(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC0324d.m721d("fromIndex: ", i2, " > toIndex: ", i3));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    /* JADX INFO: renamed from: m */
    public static final void m108m(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0307g.m703e(th, "<this>");
                AbstractC0307g.m703e(th2, "exception");
                if (th != th2) {
                    Integer num = AbstractC0249a.f525a;
                    if (num == null || num.intValue() >= 19) {
                        th.addSuppressed(th2);
                        return;
                    }
                    Method method = AbstractC0246a.f524a;
                    if (method != null) {
                        method.invoke(th, th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static double m109n(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static float m110o(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    /* JADX INFO: renamed from: p */
    public static int m111p(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    /* JADX INFO: renamed from: q */
    public static int m112q(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: r */
    public static ImageView.ScaleType m113r(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX INFO: renamed from: s */
    public static final void m114s(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    /* JADX INFO: renamed from: t */
    public static final long m115t(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            outputStream.write(bArr, 0, i3);
            j2 += (long) i3;
            i3 = inputStream.read(bArr);
        }
        return j2;
    }

    /* JADX INFO: renamed from: u */
    public static final C0140f m116u(Throwable th) {
        AbstractC0307g.m703e(th, "exception");
        return new C0140f(th);
    }

    /* JADX INFO: renamed from: v */
    public static float m117v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0216e.m600b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: x */
    public static final Class m118x(InterfaceC0391a interfaceC0391a) {
        AbstractC0307g.m703e(interfaceC0391a, "<this>");
        Class clsMo696a = ((InterfaceC0302b) interfaceC0391a).mo696a();
        if (!clsMo696a.isPrimitive()) {
            return clsMo696a;
        }
        String name = clsMo696a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsMo696a;
    }

    /* JADX INFO: renamed from: y */
    public static C0054d m119y(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0054d(AbstractC0227p.m627c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM616a = AbstractC0225n.m616a(textView);
        int iM619d = AbstractC0225n.m619d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z2 = textView.getLayoutDirection() == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z2 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0227p.m626b(AbstractC0226o.m624a(textView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0054d(textPaint, textDirectionHeuristic, iM616a, iM619d);
    }

    /* JADX INFO: renamed from: A */
    public int mo120A() {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public abstract boolean mo121D();

    /* JADX INFO: renamed from: I */
    public abstract void m122I(int i2, int i3);

    /* JADX INFO: renamed from: K */
    public void mo123K(View view, int i2) {
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo124L(int i2);

    /* JADX INFO: renamed from: M */
    public abstract void mo125M(View view, int i2, int i3);

    /* JADX INFO: renamed from: N */
    public abstract void mo126N(View view, float f2, float f3);

    /* JADX INFO: renamed from: Q */
    public abstract void mo127Q(boolean z2);

    /* JADX INFO: renamed from: R */
    public abstract void mo128R(boolean z2);

    /* JADX INFO: renamed from: Y */
    public abstract void mo129Y();

    /* JADX INFO: renamed from: Z */
    public abstract void m130Z();

    /* JADX INFO: renamed from: d0 */
    public abstract boolean mo131d0(View view, int i2);

    /* JADX INFO: renamed from: f0 */
    public abstract TransformationMethod mo132f0(TransformationMethod transformationMethod);

    /* JADX INFO: renamed from: k */
    public abstract int mo133k(View view, int i2);

    /* JADX INFO: renamed from: l */
    public abstract int mo134l(View view, int i2);

    /* JADX INFO: renamed from: w */
    public abstract InputFilter[] mo135w(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: z */
    public int mo136z(View view) {
        return 0;
    }
}
