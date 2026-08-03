package qa;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.C0570e;
import gg.AbstractC1416l;
import gg.C1421q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p015b0.C0153s;
import p036c9.C0425c2;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: qa.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3478f {

    /* JADX INFO: renamed from: l */
    public static final Set f11279l = AbstractC4156d0.m8355W("setMoney", "setFirstMoney", "setNewMoney");

    /* JADX INFO: renamed from: m */
    public static final List f11280m = AbstractC0000a.m101y0("经营账户", "经营账号", "商户账户", "商户余额", "商家账户");

    /* JADX INFO: renamed from: a */
    public final C3742g f11281a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f11282b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f11283c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f11284d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f11285e;

    /* JADX INFO: renamed from: f */
    public final ThreadLocal f11286f;

    /* JADX INFO: renamed from: g */
    public final ThreadLocal f11287g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f11288h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f11289i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f11290j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f11291k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3478f(C3742g c3742g) {
        c3742g.getClass();
        this.f11281a = c3742g;
        Context context = c3742g.f12143a;
        this.f11282b = AbstractC4302b.m8640c(context, "Hchat_fake_wallet_balance_config");
        this.f11283c = AbstractC4302b.m8640c(context, "Hchat_fake_wallet_balance_method_cache");
        this.f11284d = new WeakHashMap();
        this.f11285e = new WeakHashMap();
        this.f11286f = new ThreadLocal();
        this.f11287g = new ThreadLocal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m7270a(C3478f c3478f, EnumC3474b enumC3474b, String str) {
        C3958e c3958e;
        String strM7290b;
        SharedPreferences sharedPreferences = c3478f.f11282b;
        int iOrdinal = enumC3474b.ordinal();
        if (iOrdinal == 0) {
            c3958e = new C3958e("fake_wallet_balance_amount", "fake_wallet_balance_mode_balance");
        } else if (iOrdinal == 1) {
            c3958e = new C3958e("fake_wallet_lqt_amount", "fake_wallet_balance_mode_lqt");
        } else {
            if (iOrdinal != 2) {
                C3193a.m6822k();
                return null;
            }
            c3958e = new C3958e("fake_wallet_business_amount", "fake_wallet_balance_mode_business");
        }
        String str2 = (String) c3958e.f12961g;
        String str3 = (String) c3958e.f12962h;
        EnumC3474b enumC3474b2 = EnumC3474b.f11271i;
        String string = enumC3474b == enumC3474b2 ? sharedPreferences.getString("fake_wallet_lqt_amount", "0.00") : "0.00";
        String string2 = sharedPreferences.getString(str2, string);
        if (enumC3474b != enumC3474b2 || sharedPreferences.contains("fake_wallet_business_amount")) {
            strM7290b = "fixed";
        } else {
            C3147k c3147k = C3479g.f11292a;
            strM7290b = C3479g.m7290b(sharedPreferences, "fake_wallet_balance_mode_lqt", string, "fixed");
        }
        C3147k c3147k2 = C3479g.f11292a;
        String strM7290b2 = C3479g.m7290b(sharedPreferences, str3, string2, strM7290b);
        str.getClass();
        strM7290b2.getClass();
        BigDecimal bigDecimalAbs = C3479g.m7289a(string2).abs();
        BigDecimal bigDecimalM7289a = C3479g.m7289a(str);
        String strM7293e = C3479g.m7293e(strM7290b2, "fixed");
        if (AbstractC1416l.m3825a(strM7293e, "increase")) {
            bigDecimalAbs = bigDecimalM7289a.add(bigDecimalAbs);
        } else if (AbstractC1416l.m3825a(strM7293e, "decrease")) {
            bigDecimalAbs = bigDecimalM7289a.subtract(bigDecimalAbs);
        }
        String plainString = bigDecimalAbs.max(BigDecimal.ZERO).setScale(2, RoundingMode.HALF_UP).toPlainString();
        plainString.getClass();
        return plainString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m7271b(C3478f c3478f, View view, String str) {
        ArrayDeque arrayDeque = (ArrayDeque) c3478f.f11286f.get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            c3478f.f11286f.set(arrayDeque);
        }
        arrayDeque.addLast(Boolean.FALSE);
        C3473a c3473a = (C3473a) c3478f.f11287g.get();
        if (c3473a == null) {
            return false;
        }
        if (view != null && str != null) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                if (Character.isDigit(str.charAt(i9))) {
                    C3147k c3147k = C3479g.f11292a;
                    String plainString = C3479g.m7289a(c3473a.f11268b).toPlainString();
                    plainString.getClass();
                    String strM7281l = m7281l(str, plainString);
                    synchronized (c3478f.f11285e) {
                        c3478f.f11285e.put(view, new C3475c(c3473a.f11267a, strM7281l, str));
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m7272c(C3478f c3478f) {
        ThreadLocal threadLocal = c3478f.f11287g;
        ThreadLocal threadLocal2 = c3478f.f11286f;
        ArrayDeque arrayDeque = (ArrayDeque) threadLocal2.get();
        if (arrayDeque != null) {
            if (arrayDeque.isEmpty()) {
                threadLocal2.remove();
                threadLocal.remove();
                return;
            }
            if (((Boolean) arrayDeque.removeLast()).booleanValue()) {
                threadLocal.remove();
            }
            if (arrayDeque.isEmpty()) {
                threadLocal2.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m7273d(C3478f c3478f, EnumC3474b enumC3474b) {
        String str;
        int iOrdinal = enumC3474b.ordinal();
        if (iOrdinal == 0) {
            str = "fake_wallet_balance_enable_balance";
        } else if (iOrdinal == 1) {
            str = "fake_wallet_balance_enable_lqt";
        } else {
            if (iOrdinal != 2) {
                C3193a.m6822k();
                return false;
            }
            str = "fake_wallet_balance_enable_business";
        }
        C3147k c3147k = C3479g.f11292a;
        return C3479g.m7291c(c3478f.f11282b, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m7274e(C3478f c3478f, EnumC3474b enumC3474b, String str) {
        ArrayDeque arrayDeque = (ArrayDeque) c3478f.f11286f.get();
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(Boolean.TRUE);
        c3478f.f11287g.set(new C3473a(enumC3474b, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final String m7275f(C3478f c3478f, View view, EnumC3474b enumC3474b, String str) {
        if (view == null) {
            return str;
        }
        synchronized (c3478f.f11285e) {
            try {
                C3475c c3475c = (C3475c) c3478f.f11285e.get(view);
                if ((c3475c != null ? c3475c.f11273a : null) == enumC3474b) {
                    String str2 = c3475c.f11275c;
                    boolean z9 = false;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= str.length()) {
                            break;
                        }
                        if (Character.isDigit(str.charAt(i9))) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= str2.length()) {
                                    break;
                                }
                                if (!Character.isDigit(str2.charAt(i10))) {
                                    i10++;
                                } else if (C3479g.m7289a(str).compareTo(C3479g.m7289a(str2)) == 0) {
                                    z9 = true;
                                }
                            }
                        } else {
                            i9++;
                        }
                    }
                    if (z9) {
                        C3147k c3147k = C3479g.f11292a;
                        String plainString = C3479g.m7289a(c3475c.f11274b).toPlainString();
                        plainString.getClass();
                        return m7281l(str, plainString);
                    }
                }
                c3478f.f11285e.put(view, new C3475c(enumC3474b, str, str));
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7276g(C3478f c3478f, View view, EnumC3474b enumC3474b, String str) {
        String str2;
        if (view == null) {
            return;
        }
        synchronized (c3478f.f11285e) {
            try {
                C3475c c3475c = (C3475c) c3478f.f11285e.get(view);
                if (c3475c == null) {
                    str2 = str;
                } else {
                    if (c3475c.f11273a != enumC3474b) {
                        c3475c = null;
                    }
                    if (c3475c == null || (str2 = c3475c.f11274b) == null) {
                    }
                }
                c3478f.f11285e.put(view, new C3475c(enumC3474b, str2, str));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m7277h(C3478f c3478f, EnumC3474b enumC3474b) {
        return enumC3474b == EnumC3474b.f11270h || enumC3474b == EnumC3474b.f11271i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC3474b m7278i(C3478f c3478f, View view) {
        EnumC3474b enumC3474b;
        EnumC3474b enumC3474b2;
        EnumC3474b enumC3474bM7283r;
        Activity activity;
        EnumC3474b enumC3474bM7283r2;
        View view2 = view;
        int i9 = 0;
        while (true) {
            enumC3474b = EnumC3474b.f11270h;
            enumC3474b2 = EnumC3474b.f11269g;
            if (view2 == null || i9 >= 8) {
                break;
            }
            CharSequence contentDescription = view2.getContentDescription();
            enumC3474bM7283r = m7283r(contentDescription != null ? contentDescription.toString() : null);
            if (enumC3474bM7283r != null) {
                break;
            }
            if (view2 instanceof TextView) {
                CharSequence text = ((TextView) view2).getText();
                enumC3474bM7283r = m7283r(text != null ? text.toString() : null);
                if (enumC3474bM7283r != null) {
                    break;
                }
            } else {
                Object parent = view2.getParent();
                View view3 = parent instanceof View ? (View) parent : null;
                if (view3 instanceof ViewGroup) {
                    C1421q c1421q = new C1421q();
                    C1421q c1421q2 = new C1421q();
                    C1421q c1421q3 = new C1421q();
                    m7279j((ViewGroup) view3, view2, 0, new C0153s(c3478f, c1421q3, c1421q2, c1421q));
                    EnumC3474b enumC3474b3 = c1421q3.f4734g ? EnumC3474b.f11271i : c1421q2.f4734g ? enumC3474b : c1421q.f4734g ? enumC3474b2 : null;
                    if (enumC3474b3 != null) {
                        enumC3474bM7283r = enumC3474b3;
                        break;
                    }
                }
                i9++;
                view2 = view3;
            }
        }
        if (enumC3474bM7283r != null) {
            return enumC3474bM7283r;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = context instanceof Activity ? (Activity) context : null;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            enumC3474bM7283r2 = null;
        } else {
            CharSequence title = activity.getTitle();
            enumC3474bM7283r2 = m7283r(title != null ? title.toString() : null);
            if (enumC3474bM7283r2 == null) {
                for (Class<?> superclass = activity.getClass(); superclass != null && !superclass.equals(Activity.class); superclass = superclass.getSuperclass()) {
                    String name = superclass.getName();
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, name, locale);
                    if (AbstractC3149m.m6709h0(strM5165l, "lqt", false) || AbstractC3149m.m6709h0(strM5165l, "moneyfund", false)) {
                        enumC3474bM7283r2 = enumC3474b;
                        break;
                    }
                    if (AbstractC3149m.m6709h0(strM5165l, "walletbalancemanagerui", false) || AbstractC3149m.m6709h0(strM5165l, "mallindexui", false) || AbstractC3149m.m6709h0(strM5165l, "mallwallet", false) || AbstractC3149m.m6709h0(strM5165l, ".wallet.balance.ui.", false) || AbstractC3149m.m6709h0(strM5165l, ".plugin.mall.ui.", false)) {
                        enumC3474bM7283r2 = enumC3474b2;
                        break;
                    }
                }
                enumC3474bM7283r2 = null;
            }
        }
        if (enumC3474bM7283r2 != null) {
            return enumC3474bM7283r2;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            Locale locale2 = Locale.US;
            String strM5165l2 = AbstractC2091b.m5165l(locale2, className, locale2);
            if (AbstractC3149m.m6709h0(strM5165l2, "lqt", false)) {
                return enumC3474b;
            }
            if (AbstractC3149m.m6709h0(strM5165l2, "walletbalancemanagerui", false)) {
                return enumC3474b2;
            }
            if (AbstractC3149m.m6709h0(strM5165l2, "mallindexui", false)) {
                return enumC3474b2;
            }
            if (AbstractC3149m.m6709h0(strM5165l2, "mallwallet", false)) {
                return enumC3474b2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m7279j(View view, View view2, int i9, C0153s c0153s) {
        CharSequence text;
        String string;
        String string2;
        if (i9 > 3) {
            return;
        }
        if (view != view2) {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && (string2 = contentDescription.toString()) != null) {
                if (AbstractC3149m.m6721t0(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    c0153s.invoke(string2);
                }
            }
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null && (string = text.toString()) != null) {
                Object obj = AbstractC3149m.m6721t0(string) ? null : string;
                if (obj != null) {
                    c0153s.invoke(obj);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.getClass();
                m7279j(childAt, view2, i9 + 1, c0153s);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static View m7280k(View view) {
        if (view.getClass().getName().equals("com.robinhood.ticker.TickerView")) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            View viewM7280k = m7280k(childAt);
            if (viewM7280k != null) {
                return viewM7280k;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m7281l(String str, String str2) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() != 0) {
            int length = string.length();
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                }
                if (Character.isDigit(string.charAt(i9))) {
                    break;
                }
                i9++;
            }
            if (i9 >= 0) {
                int i10 = i9;
                while (i10 < string.length()) {
                    char cCharAt = string.charAt(i10);
                    if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                        break;
                    }
                    i10++;
                }
                return AbstractC4855en.m9264h(string.substring(0, i9), str2, string.substring(i10));
            }
            for (int i11 = 0; i11 < string.length(); i11++) {
                char cCharAt2 = string.charAt(i11);
                if (cCharAt2 == 165 || cCharAt2 == 65509) {
                    return string.concat(str2);
                }
            }
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m7282q(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes.length != 0 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && (parameterTypes.length == 1 || (parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[1], Boolean.TYPE)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static EnumC3474b m7283r(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5161h = AbstractC2091b.m5161h("\\s+", str, HttpUrl.FRAGMENT_ENCODE_SET);
        if (strM5161h.length() == 0) {
            return null;
        }
        List list = f11280m;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC3149m.m6709h0(strM5161h, (String) it.next(), false)) {
                    return EnumC3474b.f11271i;
                }
            }
        }
        if (AbstractC3149m.m6709h0(strM5161h, "零钱通", false) || AbstractC3149m.m6709h0(strM5161h, "理财通", false)) {
            return EnumC3474b.f11270h;
        }
        if (AbstractC3149m.m6709h0(strM5161h, "零钱", false) || AbstractC3149m.m6709h0(strM5161h, "钱包余额", false)) {
            return EnumC3474b.f11269g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static ValueAnimator m7284s(View view) {
        Object next;
        Iterator<T> it = KavaReflector.declaredFields(view.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ValueAnimator.class.isAssignableFrom(((Field) next).getType())) {
                break;
            }
        }
        Field field = (Field) next;
        if (field != null) {
            Object field2 = KavaReflector.readField(field, view);
            if (field2 instanceof ValueAnimator) {
                return (ValueAnimator) field2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7285m() {
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.kinda.framework.WxCrossServices", this.f11281a.f12145c);
        if (clsLoadClass != null) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listDeclaredMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (AbstractC1416l.m3825a(method.getName(), "startLqtDetailUseCaseWithBalanceInMMProcess") && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 2 && Context.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Long.TYPE)) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            int i9 = 0;
            while (it2.hasNext()) {
                C3744i.f12154b.m7763b((Method) it2.next(), new C3477e(this, 0));
                i9++;
            }
            this.f11291k = i9 > 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m7286n() {
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView", this.f11281a.f12145c);
        if (clsLoadClass != null) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listDeclaredMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 7 && parameterTypes[1].getName().equals("org.json.JSONObject")) {
                    Class<?> cls = parameterTypes[2];
                    Class cls2 = Boolean.TYPE;
                    if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[3], String.class) && AbstractC1416l.m3825a(parameterTypes[4], cls2)) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            int i9 = 0;
            while (it2.hasNext()) {
                C3744i.f12154b.m7763b((Method) it2.next(), new C3477e(this, 1));
                i9++;
            }
            this.f11290j = i9 > 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[EDGE_INSN: B:12:0x003d->B:45:0x00b2 BREAK  A[LOOP:1: B:40:0x009d->B:66:?]] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7287o() {
        Collection collectionAsList;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView", this.f11281a.f12145c);
        if (clsLoadClass != null) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listDeclaredMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length != 0 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                    if (!f11279l.contains(method.getName()) || parameterTypes.length != 1) {
                        if (parameterTypes.length != 2 && parameterTypes.length != 4) {
                            z = false;
                            break;
                        }
                        int length = parameterTypes.length - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        if (length < 0) {
                            C2104o.m5291q(AbstractC0921a.m2250m(length, "Requested element count ", " is less than zero."));
                            collectionAsList = null;
                        } else if (length == 0) {
                            collectionAsList = C4173t.f13710g;
                        } else {
                            int length2 = parameterTypes.length;
                            if (length >= length2) {
                                collectionAsList = AbstractC4165l.m8375L0(parameterTypes);
                            } else if (length == 1) {
                                collectionAsList = AbstractC0000a.m99x0(parameterTypes[length2 - 1]);
                            } else {
                                collectionAsList = Arrays.asList(AbstractC4165l.m8386u0(parameterTypes, length2 - length, length2));
                                collectionAsList.getClass();
                            }
                        }
                        if (!collectionAsList.isEmpty()) {
                            Iterator it2 = collectionAsList.iterator();
                            while (it2.hasNext()) {
                                if (!AbstractC1416l.m3825a((Class) it2.next(), Boolean.TYPE)) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it3 = arrayList.iterator();
            int i9 = 0;
            while (it3.hasNext()) {
                C3744i.f12154b.m7763b((Method) it3.next(), new C3477e(this, 2));
                i9++;
            }
            this.f11288h = i9 > 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x0101 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:0x013d */
    /* JADX DEBUG: Type inference failed for r9v15. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public final void m7288p() {
        ArrayList arrayList;
        ?? c3959f;
        ?? r02;
        Object c3959f2;
        C4173t c4173t = C4173t.f13710g;
        SharedPreferences sharedPreferences = this.f11283c;
        C0828b c0828b = C0828b.f2478a;
        C3742g c3742g = this.f11281a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|fake_wallet_balance_wekit_style_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM2090f = C0828b.m2090f(sharedPreferences, strConcat, c3742g.f12145c, "ticker_methods");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM2090f) {
            if (m7282q((Method) obj)) {
                arrayList2.add(obj);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List<Method> list = arrayList2;
        if (zIsEmpty) {
            list = null;
        }
        if (list == null) {
            Class<?> clsLoadClass = KavaReflector.loadClass("com.robinhood.ticker.TickerView", c3742g.f12145c);
            if (clsLoadClass != null) {
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
                arrayList = new ArrayList();
                for (Object obj2 : listDeclaredMethods) {
                    if (m7282q((Method) obj2)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            list = arrayList == null ? c4173t : arrayList;
            if (list.isEmpty()) {
                try {
                    DexKitBridge dexKitBridge = c3742g.f12146d;
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    c1253k.m3369l0(5, "com.robinhood.ticker.TickerView");
                    c1253k.m3374r0("Need to call #setCharacterLists first.");
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
                        if (method == null || !m7282q(method)) {
                            method = null;
                        }
                        if (method != null) {
                            c3959f.add(method);
                        }
                    }
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b == null) {
                    r02 = c3959f;
                } else {
                    AbstractC0921a.m2261x("[Hchat:FakeWalletBalance] 定位 TickerView 金额方法失败: ", thM8182b.getMessage(), thM8182b);
                    r02 = c4173t;
                }
                list = (List) r02;
                if (list.isEmpty()) {
                    try {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                            editorEdit.clear().putString("cache.key", strConcat);
                        }
                        editorEdit.remove("ticker_methods").apply();
                    } catch (Throwable unused) {
                    }
                } else {
                    c0828b.m2097j(sharedPreferences, strConcat, "ticker_methods", list);
                }
            } else {
                c0828b.m2097j(sharedPreferences, strConcat, "ticker_methods", list);
            }
        }
        Class<?> clsLoadClass2 = KavaReflector.loadClass("com.robinhood.ticker.TickerView", this.f11281a.f12145c);
        Class cls = Float.TYPE;
        cls.getClass();
        Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(clsLoadClass2, "setTextSize", cls);
        if (list.isEmpty() && methodFindDeclaredMethod == null) {
            return;
        }
        int i9 = 0;
        for (Method method2 : list) {
            C3744i.f12154b.m7763b(method2, new C0425c2(this, 13, method2));
            i9++;
        }
        if (methodFindDeclaredMethod != null) {
            C3744i.f12154b.m7763b(methodFindDeclaredMethod, new C3477e(this, 3));
            i9++;
        }
        this.f11289i = i9 > 0;
    }
}
