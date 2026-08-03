package p050da;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ca.RunnableC0537x;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p086fh.C1253k;
import p099h.Hchat.R;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p136j8.AbstractC2091b;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: da.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0762h {

    /* JADX INFO: renamed from: k */
    public static final List f2275k = AbstractC0000a.m101y0("bjx", "bj2");

    /* JADX INFO: renamed from: a */
    public final C3742g f2276a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f2277b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f2278c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f2279d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f2280e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f2281f;

    /* JADX INFO: renamed from: g */
    public final C3962i f2282g;

    /* JADX INFO: renamed from: h */
    public final C3962i f2283h;

    /* JADX INFO: renamed from: i */
    public final C3962i f2284i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f2285j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0762h(C3742g c3742g) {
        c3742g.getClass();
        this.f2276a = c3742g;
        Context context = c3742g.f12143a;
        this.f2277b = AbstractC4302b.m8640c(context, "Hchat_message_text_color_config");
        this.f2278c = AbstractC4302b.m8640c(context, "Hchat_message_text_color_method_cache");
        this.f2279d = new ConcurrentHashMap();
        this.f2280e = new ConcurrentHashMap();
        this.f2281f = new ConcurrentHashMap();
        final int i9 = 0;
        this.f2282g = new C3962i(new InterfaceC1220a(this) { // from class: da.a

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0762h f2255h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2255h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                int identifier;
                switch (i9) {
                    case 0:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bkl", "id", "com.tencent.mm");
                        break;
                    case 1:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bs2", "id", "com.tencent.mm");
                        break;
                    default:
                        List list = C0762h.f2275k;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int identifier2 = this.f2255h.f2276a.f12143a.getResources().getIdentifier((String) it.next(), "id", "com.tencent.mm");
                            Integer numValueOf = Integer.valueOf(identifier2);
                            if (identifier2 == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList.add(numValueOf);
                            }
                        }
                        return arrayList;
                }
                return Integer.valueOf(identifier);
            }
        });
        final int i10 = 1;
        this.f2283h = new C3962i(new InterfaceC1220a(this) { // from class: da.a

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0762h f2255h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2255h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                int identifier;
                switch (i10) {
                    case 0:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bkl", "id", "com.tencent.mm");
                        break;
                    case 1:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bs2", "id", "com.tencent.mm");
                        break;
                    default:
                        List list = C0762h.f2275k;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int identifier2 = this.f2255h.f2276a.f12143a.getResources().getIdentifier((String) it.next(), "id", "com.tencent.mm");
                            Integer numValueOf = Integer.valueOf(identifier2);
                            if (identifier2 == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList.add(numValueOf);
                            }
                        }
                        return arrayList;
                }
                return Integer.valueOf(identifier);
            }
        });
        final int i11 = 2;
        this.f2284i = new C3962i(new InterfaceC1220a(this) { // from class: da.a

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0762h f2255h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2255h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                int identifier;
                switch (i11) {
                    case 0:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bkl", "id", "com.tencent.mm");
                        break;
                    case 1:
                        identifier = this.f2255h.f2276a.f12143a.getResources().getIdentifier("bs2", "id", "com.tencent.mm");
                        break;
                    default:
                        List list = C0762h.f2275k;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int identifier2 = this.f2255h.f2276a.f12143a.getResources().getIdentifier((String) it.next(), "id", "com.tencent.mm");
                            Integer numValueOf = Integer.valueOf(identifier2);
                            if (identifier2 == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList.add(numValueOf);
                            }
                        }
                        return arrayList;
                }
                return Integer.valueOf(identifier);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static TextView m1951A(View view) {
        if (m1961m(view)) {
            Object objInvokeMethod = KavaReflector.invokeMethod(view, "getWrappedTextView", new Object[0]);
            TextView textView = objInvokeMethod instanceof TextView ? (TextView) objInvokeMethod : null;
            if (textView != null) {
                return textView;
            }
            if (view instanceof TextView) {
                return (TextView) view;
            }
        } else if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[PHI: r1
  0x0016: PHI (r1v18 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v3 java.lang.Integer) binds: [B:6:0x0014, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m1952a(C0762h c0762h, View view, C0760f c0760f) {
        int measuredWidth;
        int iIntValue;
        c0762h.getClass();
        View view2 = c0760f.f2270a;
        TextView textView = c0760f.f2271b;
        int width = view2.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            measuredWidth = numValueOf.intValue();
        } else {
            int width2 = textView.getWidth();
            numValueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                measuredWidth = textView.getMeasuredWidth();
            }
        }
        int height = view2.getHeight();
        Integer numValueOf2 = Integer.valueOf(height);
        if (height <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        } else {
            int height2 = textView.getHeight();
            Integer numValueOf3 = height2 > 0 ? Integer.valueOf(height2) : null;
            iIntValue = numValueOf3 != null ? numValueOf3.intValue() : textView.getMeasuredHeight();
        }
        if (measuredWidth < 0) {
            measuredWidth = 0;
        }
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        int i9 = measuredWidth * iIntValue;
        if (view2.getBackground() != null || textView.getBackground() != null) {
            i9 += 100000;
        }
        if (textView.getTextSize() >= ((int) TypedValue.applyDimension(1, 13.0f, textView.getResources().getDisplayMetrics()))) {
            i9 += 20000;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        return iArr[1] >= iArr2[1] ? i9 + 5000 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1953b(String str, LinkedHashSet linkedHashSet) {
        int i9;
        String strM1966s = m1966s(str);
        if (strM1966s.length() == 0) {
            return;
        }
        linkedHashSet.add(strM1966s);
        int iM6719r0 = AbstractC3149m.m6719r0(strM1966s, ":\n", 0, false, 6);
        if (iM6719r0 <= 0 || (i9 = iM6719r0 + 2) >= strM1966s.length()) {
            return;
        }
        linkedHashSet.add(m1966s(strM1966s.substring(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1954c(String str, ArrayList arrayList) {
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str != null) {
                arrayList.add(new C3958e(0, str));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1955d(View view) {
        if (AbstractC1416l.m3825a(view.getTag(R.id.hchat_message_text_color_applied), Boolean.TRUE)) {
            TextView textViewM1951A = m1951A(view);
            Object tag = view.getTag(R.id.hchat_message_text_color_original);
            C0756b c0756b = tag instanceof C0756b ? (C0756b) tag : null;
            if (textViewM1951A == null || c0756b == null) {
                Object tag2 = view.getTag(R.id.hchat_message_text_color_original);
                Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
                Object tag3 = view.getTag(R.id.hchat_message_text_color_value);
                Integer num2 = tag3 instanceof Integer ? (Integer) tag3 : null;
                if (num != null && num2 != null && textViewM1951A != null && textViewM1951A.getCurrentTextColor() == num2.intValue()) {
                    textViewM1951A.getPaint().setShader(null);
                    int iIntValue = num.intValue();
                    if (m1961m(view)) {
                        KavaReflector.invokeMethod(view, "setTextColor", num);
                    }
                    textViewM1951A.setTextColor(iIntValue);
                    textViewM1951A.invalidate();
                    view.invalidate();
                }
            } else {
                int i9 = c0756b.f2260e;
                if (c0756b.f2261f != null && textViewM1951A.getPaint().getShader() == c0756b.f2261f) {
                    textViewM1951A.getPaint().setShader(c0756b.f2259d);
                }
                if (textViewM1951A.getCurrentTextColor() == i9) {
                    ColorStateList colorStateList = c0756b.f2256a;
                    if (m1961m(view)) {
                        KavaReflector.invokeMethod(view, "setTextColor", Integer.valueOf(colorStateList.getDefaultColor()));
                    }
                    textViewM1951A.setTextColor(colorStateList);
                    textViewM1951A.invalidate();
                    view.invalidate();
                }
                if (textViewM1951A.getPaint().linkColor == i9) {
                    ColorStateList colorStateList2 = c0756b.f2257b;
                    int i10 = c0756b.f2258c;
                    textViewM1951A.setLinkTextColor(colorStateList2);
                    if (m1961m(view)) {
                        KavaReflector.invokeMethod(view, "setLinkTextColor", Integer.valueOf(i10));
                    }
                }
            }
            view.setTag(R.id.hchat_message_text_color_applied, null);
            view.setTag(R.id.hchat_message_text_color_original, null);
            view.setTag(R.id.hchat_message_text_color_value, null);
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                childAt.getClass();
                m1955d(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1 A[EDGE_INSN: B:56:0x00b1->B:45:0x00b1 BREAK  A[LOOP:0: B:7:0x001f->B:62:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[LOOP:0: B:7:0x001f->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1956e(View view, List list, boolean z9, ArrayList arrayList) {
        Object next;
        TextView textViewM1951A = m1951A(view);
        if (textViewM1951A != null) {
            String strM1966s = m1966s(m1965r(view, textViewM1951A));
            if (strM1966s.length() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C0758d c0758d = (C0758d) next;
                    boolean zEquals = true;
                    if (z9) {
                        String str = c0758d.f2265a;
                        if (!strM1966s.equals(str)) {
                            if (AbstractC3149m.m6710i0(str, '#')) {
                                String strM6737a0 = AbstractC3156t.m6737a0(str, "#", HttpUrl.FRAGMENT_ENCODE_SET, false);
                                if (strM6737a0.length() >= 2) {
                                    zEquals = AbstractC3156t.m6737a0(strM1966s, "#", HttpUrl.FRAGMENT_ENCODE_SET, false).equals(strM6737a0);
                                }
                            } else {
                                zEquals = false;
                            }
                        }
                        if (!zEquals) {
                            break;
                        }
                    } else {
                        String str2 = c0758d.f2265a;
                        if (str2.length() >= 2 && strM1966s.length() <= (str2.length() * 3) + 12) {
                            if (!AbstractC3149m.m6709h0(strM1966s, str2, false)) {
                                if (AbstractC3149m.m6710i0(str2, '#')) {
                                    String strM6737a02 = AbstractC3156t.m6737a0(str2, "#", HttpUrl.FRAGMENT_ENCODE_SET, false);
                                    if (strM6737a02.length() >= 2) {
                                        String strM6737a03 = AbstractC3156t.m6737a0(strM1966s, "#", HttpUrl.FRAGMENT_ENCODE_SET, false);
                                        if (strM6737a02.length() < 2 || strM6737a03.length() > (strM6737a02.length() * 3) + 12 || !AbstractC3149m.m6709h0(strM6737a03, strM6737a02, false)) {
                                        }
                                    }
                                }
                            }
                            if (!zEquals) {
                            }
                        }
                    }
                }
                C0758d c0758d2 = (C0758d) next;
                if (c0758d2 != null) {
                    arrayList.add(new C0759e(new C0760f(view, textViewM1951A), c0758d2, z9));
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m1956e(childAt, list, z9, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1957f(View view, List list, boolean z9, ArrayList arrayList) {
        TextView textViewM1951A = m1951A(view);
        if (textViewM1951A != null) {
            String strM1962n = m1962n(m1965r(view, textViewM1951A));
            if (strM1962n.length() > 0 && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (z9 ? strM1962n.equals(str) : (str.length() >= 2 && strM1962n.length() <= (str.length() * 3) + 12) ? AbstractC3149m.m6709h0(strM1962n, str, false) : false) {
                        arrayList.add(new C0760f(view, textViewM1951A));
                        break;
                    }
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m1957f(childAt, list, z9, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1958g(View view, ArrayList arrayList) {
        TextView textViewM1951A = m1961m(view) ? m1951A(view) : null;
        if (textViewM1951A != null) {
            String strM1966s = m1966s(m1965r(view, textViewM1951A));
            if (!AbstractC3149m.m6721t0(strM1966s) && strM1966s.length() <= 1200) {
                Pattern patternCompile = Pattern.compile("\\d{1,2}:\\d{2}");
                patternCompile.getClass();
                if (!patternCompile.matcher(strM1966s).matches() && !strM1966s.equals("已读") && !strM1966s.equals("未读")) {
                    int width = textViewM1951A.getWidth();
                    Integer numValueOf = Integer.valueOf(width);
                    if (width <= 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : textViewM1951A.getMeasuredWidth();
                    int height = textViewM1951A.getHeight();
                    Integer numValueOf2 = height > 0 ? Integer.valueOf(height) : null;
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : textViewM1951A.getMeasuredHeight();
                    if (iIntValue > 0 && iIntValue2 > 0 && iIntValue2 >= ((int) TypedValue.applyDimension(1, 12.0f, textViewM1951A.getResources().getDisplayMetrics()))) {
                        arrayList.add(new C0760f(view, textViewM1951A));
                    }
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m1958g(childAt, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1959h(View view, ArrayList arrayList) {
        if (view.getVisibility() != 0) {
            return;
        }
        TextView textViewM1951A = m1951A(view);
        if (textViewM1951A != null && !AbstractC3149m.m6721t0(m1972y(view, textViewM1951A))) {
            arrayList.add(new C0760f(view, textViewM1951A));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m1959h(childAt, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Object m1960j(Object obj, int i9, Set set, int i10) {
        Object field;
        Object objM1960j;
        if (i9 >= 0 && i10 <= 3 && set.add(obj)) {
            Object objM1963o = m1963o(i9, obj);
            if (objM1963o != null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                setNewSetFromMap.getClass();
                if (!(m1973z(0, objM1963o, setNewSetFromMap) != null)) {
                    objM1963o = null;
                }
                if (objM1963o != null) {
                    return objM1963o;
                }
            }
            String name = obj.getClass().getName();
            if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false) && !(obj instanceof View) && !(obj instanceof ViewGroup)) {
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    for (Field field2 : KavaReflector.declaredFields(superclass)) {
                        Class<?> type = field2.getType();
                        if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && (field = KavaReflector.readField(field2, obj)) != null && (objM1960j = m1960j(field, i9, set, i10 + 1)) != null) {
                            return objM1960j;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m1961m(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.equals("com.tencent.mm.ui.widget.MMNeat7extView") || name.equals("com.tencent.neattextview.textview.view.NeatTextView") || AbstractC3149m.m6709h0(name, "NeatTextView", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m1962n(String str) {
        String strReplace = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "\u200b", HttpUrl.FRAGMENT_ENCODE_SET, false), "\ufeff", HttpUrl.FRAGMENT_ENCODE_SET, false).replace((char) 160, ' ');
        strReplace.getClass();
        return AbstractC3149m.m6703R0(strReplace).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m1963o(int i9, Object obj) {
        if (obj == null || i9 < 0) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i9 < list.size()) {
                return list.get(i9);
            }
        }
        Class<?> cls = obj.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(cls, "get", cls2), obj, Integer.valueOf(i9));
        return objInvoke != null ? objInvoke : KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "get", cls2), obj, Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static long m1964q(Object obj) {
        String[] strArr = {"getMsgId", "getMsgID", "getId"};
        for (int i9 = 0; i9 < 3; i9++) {
            Long lM1970w = m1970w(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), strArr[i9], new Class[0]), obj, new Object[0]));
            if (lM1970w != null) {
                long jLongValue = lM1970w.longValue();
                if (jLongValue > 0) {
                    return jLongValue;
                }
            }
        }
        String[] strArr2 = {"field_msgId", "msgId", "msgID", "id"};
        for (int i10 = 0; i10 < 4; i10++) {
            Long lM1970w2 = m1970w(KavaReflector.readField(obj, strArr2[i10]));
            if (lM1970w2 != null) {
                long jLongValue2 = lM1970w2.longValue();
                if (jLongValue2 > 0) {
                    return jLongValue2;
                }
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m1965r(View view, TextView textView) {
        String string;
        String string2;
        String string3;
        Object objInvokeMethod = KavaReflector.invokeMethod(view, "a", new Object[0]);
        CharSequence charSequence = objInvokeMethod instanceof CharSequence ? (CharSequence) objInvokeMethod : null;
        if (charSequence != null && (string3 = charSequence.toString()) != null) {
            if (AbstractC3149m.m6721t0(string3)) {
                string3 = null;
            }
            if (string3 != null) {
                return string3;
            }
        }
        Object field = KavaReflector.readField(view, "x");
        CharSequence charSequence2 = field instanceof CharSequence ? (CharSequence) field : null;
        if (charSequence2 != null && (string2 = charSequence2.toString()) != null) {
            if (AbstractC3149m.m6721t0(string2)) {
                string2 = null;
            }
            if (string2 != null) {
                return string2;
            }
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && (string = contentDescription.toString()) != null) {
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        CharSequence text = textView.getText();
        String string4 = text != null ? text.toString() : null;
        return string4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m1966s(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == 160 || cCharAt == 8199 || cCharAt == 8239) {
                sb2.append(' ');
            } else if (cCharAt != 8288 && cCharAt != 65279) {
                if (cCharAt == 65283) {
                    sb2.append('#');
                } else if (cCharAt != 65532) {
                    switch (cCharAt) {
                        case 8203:
                        case 8204:
                        case 8205:
                        case 8206:
                        case 8207:
                            break;
                        default:
                            sb2.append(cCharAt);
                            break;
                    }
                }
            }
        }
        String strM5161h = AbstractC2091b.m5161h("[ \\t\\x0B\\f\\r]+", sb2.toString(), " ");
        Pattern patternCompile = Pattern.compile(" *\\n *");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll("\n");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Integer m1967t(String str) {
        Object c3959f;
        String strM419l = AbstractC0063p.m419l(str);
        if (strM419l.length() == 0) {
            return null;
        }
        try {
            c3959f = Integer.valueOf(Color.parseColor(strM419l));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Integer) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C0757c m1968u(String str) {
        String strM420m = AbstractC0063p.m420m(str);
        if (strM420m.length() == 0) {
            return null;
        }
        List listM8403L1 = AbstractC4166m.m8403L1(2, AbstractC3149m.m6691F0(strM420m, new char[]{','}, 6));
        String str2 = (String) AbstractC4166m.m8424v1(listM8403L1);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Integer numM1967t = m1967t(str2);
        if (numM1967t == null) {
            return null;
        }
        int iIntValue = numM1967t.intValue();
        String str4 = (String) AbstractC4166m.m8425w1(1, listM8403L1);
        if (str4 != null) {
            str3 = str4;
        }
        Integer numM1967t2 = m1967t(str3);
        return new C0757c(iIntValue, numM1967t2 != null ? numM1967t2.intValue() : iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Integer m1969v(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Long m1970w(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6743g0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static Object m1971x(Object obj, String str, String str2, String str3) {
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), str, new Class[0]), obj, new Object[0]);
        if (objInvoke != null) {
            return objInvoke;
        }
        Object field = KavaReflector.readField(obj, str2);
        return field != null ? field : KavaReflector.readField(obj, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static CharSequence m1972y(View view, TextView textView) {
        Object objInvokeMethod = KavaReflector.invokeMethod(view, "a", new Object[0]);
        CharSequence charSequence = objInvokeMethod instanceof CharSequence ? (CharSequence) objInvokeMethod : null;
        if (charSequence != null) {
            if (!(charSequence.length() > 0)) {
                charSequence = null;
            }
            if (charSequence != null) {
                return charSequence;
            }
        }
        Object field = KavaReflector.readField(view, "x");
        CharSequence charSequence2 = field instanceof CharSequence ? (CharSequence) field : null;
        if (charSequence2 != null) {
            CharSequence charSequence3 = charSequence2.length() > 0 ? charSequence2 : null;
            if (charSequence3 != null) {
                return charSequence3;
            }
        }
        CharSequence text = textView.getText();
        text.getClass();
        return text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1973z(int i9, Object obj, Set set) {
        Object field;
        Object objM1973z;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            String name = obj.getClass().getName();
            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false)) {
                if (m1964q(obj) > 0) {
                    return obj;
                }
                if (!AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false) || (obj instanceof View) || (obj instanceof ViewGroup)) {
                    return null;
                }
                if (obj instanceof Collection) {
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        Object objM1973z2 = m1973z(i9 + 1, it.next(), set);
                        if (objM1973z2 != null) {
                            return objM1973z2;
                        }
                    }
                } else {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            Class<?> type = field2.getType();
                            if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && (field = KavaReflector.readField(field2, obj)) != null && (objM1973z = m1973z(i9 + 1, field, set)) != null) {
                                return objM1973z;
                            }
                        }
                    }
                }
            } else {
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(obj.getClass());
                if (listDeclaredMethods == null || !listDeclaredMethods.isEmpty()) {
                    for (Method method : listDeclaredMethods) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getName(), "getMsgId") || AbstractC1416l.m3825a(method.getName(), "getMsgID"))) {
                            if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Long.class)) {
                                if (m1964q(obj) > 0) {
                                }
                            }
                        }
                    }
                }
                if (AbstractC3156t.m6740d0(name, "java.", false)) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m1974B(View view, TextView textView, C0757c c0757c, C0756b c0756b) {
        TextPaint paint = textView.getPaint();
        CharSequence text = textView.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        float fMeasureText = paint.measureText(string);
        float width = view.getWidth();
        float f3 = fMeasureText < width ? width : fMeasureText;
        if (f3 <= 0.0f) {
            view.post(new RunnableC0537x(view, c0756b, this, textView, c0757c, 3));
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f3, 0.0f, c0757c.f2262a, c0757c.f2263b, Shader.TileMode.CLAMP);
        c0756b.f2261f = linearGradient;
        textView.getPaint().setShader(linearGradient);
        textView.invalidate();
        view.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0052 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: i */
    public final List m1975i(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f2276a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:MessageTextColor] 定位聊天消息绑定方法异常: ", thM8182b.getMessage(), thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m1976k(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f2281f;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            return field;
        }
        Class superclass = cls;
        while (true) {
            Object obj = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field field2 = (Field) next;
                if (AbstractC1416l.m3825a(field2.getName(), "itemView") || AbstractC1416l.m3825a(field2.getType(), View.class)) {
                    obj = next;
                    break;
                }
            }
            Field field3 = (Field) obj;
            if (field3 != null) {
                concurrentHashMap.put(cls, field3);
                return field3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m1977l(Method method) {
        Class<?> superclass;
        Object c3959f;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 2 || !AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE) || (superclass = parameterTypes[0]) == null) {
            return false;
        }
        try {
            c3959f = Boolean.valueOf(this.f2276a.f12145c.loadClass("androidx.recyclerview.widget.RecyclerView$ViewHolder").isAssignableFrom(superclass));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        if (!((Boolean) c3959f).booleanValue() && m1976k(superclass) == null) {
            while (superclass != null && !superclass.equals(Object.class)) {
                List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                if (listDeclaredFields == null || !listDeclaredFields.isEmpty()) {
                    Iterator<T> it = listDeclaredFields.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1416l.m3825a(((Field) it.next()).getType(), View.class)) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Method m1978p() {
        C3742g c3742g = this.f2276a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Object obj = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|message_text_color_v3") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f2278c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "adapter_bind");
        if (methodM2087c != null) {
            if (!m1977l(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        List listM1975i = m1975i("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[", "msgInfo");
        if (listM1975i.isEmpty()) {
            listM1975i = m1975i("MicroMsg.ChattingDataAdapterV3", "holder", "itemView");
        }
        Iterator it = listM1975i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m1977l((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "adapter_bind", method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                editorEdit.clear().putString("cache.key", strConcat);
            }
            editorEdit.remove("adapter_bind").apply();
        } catch (Throwable unused) {
        }
        return method;
    }
}
