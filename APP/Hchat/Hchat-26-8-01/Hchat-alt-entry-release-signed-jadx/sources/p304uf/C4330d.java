package p304uf;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import ba.C0226f;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.C1423s;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p010aa.C0036d;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p070f0.C0980l;
import p080fb.AbstractC1184v0;
import p080fb.C1121f1;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p168l9.C2537c;
import p174m.C2576b;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p244qb.RunnableC3483d;
import p253r1.InterfaceC3644a;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p316v9.C4539a;
import p316v9.C4540b;
import p366ya.C6017g;
import p381zb.AbstractC6134c;
import tf.AbstractC4171r;
import tf.C4173t;
import va.EnumC4542b;
import va.ViewOnClickListenerC4541a;
import wf.InterfaceC5560f;

/* JADX INFO: renamed from: uf.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4330d implements InterfaceC5560f, InterfaceC3644a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14471g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [pa.c.<init>(u3.c, i.e0):void, va.c.<clinit>():void, x0.d.<clinit>():void, x2.i.<clinit>():void, xd.d.<clinit>():void] */
    public /* synthetic */ C4330d(int i9) {
        this.f14471g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m8740B(Object obj, int i9, Object obj2) {
        ArrayList<Method> arrayListM8745G = m8745G(obj.getClass());
        if (!arrayListM8745G.isEmpty()) {
            for (Method method : arrayListM8745G) {
                if ((method.getParameterTypes().length == 2 && method.getParameterTypes()[0].isAssignableFrom(obj2.getClass()) && AbstractC1416l.m3825a(method.getParameterTypes()[1], Integer.TYPE)) ? KavaReflector.invokeSuccessfully(method, obj, obj2, Integer.valueOf(i9)) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m8741C(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC4302b.m8640c(context, "Hchat_disable_hot_update_config").getBoolean("disable_hot_update_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m8742D(Method method) {
        return method.getParameterTypes().length == 2 && AbstractC1416l.m3825a(method.getParameterTypes()[0], String.class) && method.getParameterTypes()[1].getName().equals("com.tencent.mm.plugin.hp.util.TinkerSyncResponse") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m8743E(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls2 : parameterTypes) {
            if (AbstractC1416l.m3825a(cls2, cls) || cls2.getName().equals("com.tencent.mm.plugin.hp.util.TinkerSyncResponse")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m8744F(Method method) {
        return (method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], File.class)) || (AbstractC1416l.m3825a(method.getName(), "onGYNetEnd") && method.getParameterTypes().length >= 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static ArrayList m8745G(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredMethods(cls));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8746H(Object obj) {
        Object next;
        KavaReflector.invokeMethod(obj, "notifyDataSetChanged", new Object[0]);
        Iterator it = m8745G(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            if (AbstractC1416l.m3825a(method.getName(), "notifyDataSetChanged")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (z9) {
                    break;
                }
            }
        }
        Method method2 = (Method) next;
        if (method2 != null) {
            KavaReflector.invoke(method2, obj, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static Integer m8747I(Object obj, String str) {
        Integer num;
        Iterator it = m8745G(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Method method = (Method) it.next();
            if (method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], String.class) && AbstractC1416l.m3825a(method.getReturnType(), Integer.TYPE)) {
                Object objInvoke = KavaReflector.invoke(method, obj, str);
                num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                if (num != null && num.intValue() >= 0) {
                    break;
                }
            }
        }
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m8748J(Object obj) {
        String str;
        Object field = KavaReflector.readField(obj, "q");
        String str2 = field instanceof String ? (String) field : null;
        if (str2 != null) {
            return str2;
        }
        for (Method method : m8745G(obj.getClass())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), String.class)) {
                Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
                if (objInvoke instanceof String) {
                    str = (String) objInvoke;
                }
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static String m8749K(Activity activity, EnumC4542b enumC4542b) {
        String str;
        String string;
        Object c3959f;
        Intent intent = activity.getIntent();
        int iOrdinal = enumC4542b.ordinal();
        if (iOrdinal == 0) {
            String[] strArr = {intent.getStringExtra("Contact_User"), intent.getStringExtra("Contact_Username")};
            int i9 = 0;
            while (true) {
                if (i9 >= 2) {
                    str = null;
                    break;
                }
                str = strArr[i9];
                if (str != null && !AbstractC3149m.m6721t0(str)) {
                    break;
                }
                i9++;
            }
            string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        } else {
            if (iOrdinal != 1) {
                C3193a.m6822k();
                return null;
            }
            string = intent.getStringExtra("RoomInfo_Id");
        }
        if (string != null && !AbstractC3149m.m6721t0(string)) {
            return AbstractC3149m.m6703R0(string).toString();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                try {
                    Object obj = extras.get(it.next());
                    c3959f = obj instanceof String ? (String) obj : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                String str2 = (String) c3959f;
                String string2 = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!AbstractC3149m.m6721t0(string2) && ((enumC4542b == EnumC4542b.f14992h && (AbstractC3156t.m6733W(string2, "@chatroom", false) || AbstractC3156t.m6733W(string2, "@im.chatroom", false))) || (enumC4542b == EnumC4542b.f14991g && AbstractC6134c.m10905b(string2)))) {
                    return string2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int m8750L(ViewGroup viewGroup) {
        C1423s c1423s = new C1423s();
        C1423s c1423s2 = new C1423s();
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof AbsListView) || (childAt instanceof ScrollView) || AbstractC3149m.m6709h0(childAt.getClass().getName(), "RecyclerView", false)) {
                c1423s.f4736g += 30;
                break;
            }
        }
        m8762l(viewGroup, 0, new C0980l(c1423s2, c1423s, 1));
        int i10 = c1423s.f4736g;
        int childCount2 = viewGroup.getChildCount();
        if (childCount2 > 12) {
            childCount2 = 12;
        }
        int i11 = i10 + childCount2;
        c1423s.f4736g = i11;
        if (c1423s2.f4736g == 0) {
            c1423s.f4736g = i11 - 20;
        }
        if (viewGroup.getParent() instanceof ScrollView) {
            c1423s.f4736g += 10;
        }
        return c1423s.f4736g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m8751a(C4330d c4330d, Method method) {
        Class<?> returnType = method.getReturnType();
        if (AbstractC1416l.m3825a(returnType, Integer.TYPE) || AbstractC1416l.m3825a(returnType, Integer.class)) {
            return 0;
        }
        return (AbstractC1416l.m3825a(returnType, Boolean.TYPE) || AbstractC1416l.m3825a(returnType, Boolean.class)) ? Boolean.FALSE : (AbstractC1416l.m3825a(returnType, Long.TYPE) || AbstractC1416l.m3825a(returnType, Long.class)) ? 0L : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m8752b(View view, float f3) {
        C3147k c3147k = C6017g.f24443e;
        return (int) TypedValue.applyDimension(1, f3, view.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m8753c(float f3, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fAbs = Math.abs(f3);
        float fSignum = Math.signum(f3);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i9 = -(iBinarySearch + 1);
        int i10 = i9 - 1;
        if (i10 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            float f15 = fArr2[fArr.length - 1];
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return (f15 / f14) * f3;
        }
        if (i10 == -1) {
            float f16 = fArr[0];
            f12 = fArr2[0];
            f13 = f16;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f17 = fArr[i10];
            float f18 = fArr[i9];
            f10 = fArr2[i10];
            f11 = f17;
            f12 = fArr2[i9];
            f13 = f18;
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (fAbs - f11) / (f13 - f11)))) + f10) * fSignum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m8754d(View view) {
        C3147k c3147k = C6017g.f24443e;
        int height = view.getHeight();
        Integer numValueOf = Integer.valueOf(height);
        if (height <= 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : view.getMeasuredHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m8755e(View view) {
        C3147k c3147k = C6017g.f24443e;
        int width = view.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : view.getMeasuredWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m8756f(Object obj, String str, Method method) {
        String strConcat = "ID: ".concat(str);
        KavaReflector.writeField(obj, "h", strConcat);
        KavaReflector.writeField(obj, "m", HttpUrl.FRAGMENT_ENCODE_SET);
        List list = C4173t.f13710g;
        List list2 = null;
        if (method != null) {
            ArrayList arrayListM8745G = m8745G(obj.getClass());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListM8745G) {
                Method method2 = (Method) obj2;
                if (method2.getParameterTypes().length == 1 && CharSequence.class.isAssignableFrom(method2.getParameterTypes()[0]) && AbstractC1416l.m3825a(method2.getReturnType(), Void.TYPE)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            for (Object obj3 : arrayList) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                Method method3 = (Method) obj3;
                String str2 = "HchatTitleProbe" + i9;
                m8760j(obj, list);
                KavaReflector.invoke(method3, obj, str2);
                Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
                if (AbstractC1416l.m3825a(objInvoke != null ? objInvoke.toString() : null, str2)) {
                    arrayList2.add(method3);
                }
                i9 = i10;
            }
            m8760j(obj, list);
            list2 = arrayList2;
        }
        if (list2 != null) {
            list = list2;
        }
        if (list.isEmpty()) {
            Method methodFindMethod = KavaReflector.findMethod(obj.getClass(), "L", CharSequence.class);
            if (methodFindMethod != null) {
                KavaReflector.invoke(methodFindMethod, obj, strConcat);
            }
        } else {
            m8760j(obj, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KavaReflector.invoke((Method) it.next(), obj, strConcat);
            }
        }
        KavaReflector.writeField(obj, "m", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m8757g(Object obj, Activity activity, String str) {
        for (Method method : m8745G(obj.getClass())) {
            if (method.getParameterTypes().length == 1 && View.OnClickListener.class.isAssignableFrom(method.getParameterTypes()[0]) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                KavaReflector.invoke(method, obj, new ViewOnClickListenerC4541a(activity, str, 2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m8758h(Activity activity, String str, int i9) {
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.postDelayed(new RunnableC3483d(str, viewGroup, activity, i9), i9 == 0 ? 0L : 120L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m8759i(View view, Activity activity, String str) {
        view.setTag("Hchat:ProfileId:Value:".concat(str));
        int iRgb = (activity.getResources().getConfiguration().uiMode & 48) == 32 ? Color.rgb(25, 25, 25) : -1;
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.colorBackground});
        typedArrayObtainStyledAttributes.getClass();
        int i9 = 0;
        try {
            iRgb = typedArrayObtainStyledAttributes.getColor(0, iRgb);
        } catch (Throwable unused) {
        }
        typedArrayObtainStyledAttributes.recycle();
        view.setBackgroundColor(iRgb);
        boolean z9 = view instanceof ViewGroup;
        if (z9) {
            m8767q((ViewGroup) view, new C2576b(new C1423s(), 20, activity));
        }
        TextView textView = null;
        if (z9) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i9);
                if (childAt instanceof TextView) {
                    textView = (TextView) childAt;
                    break;
                }
                i9++;
            }
        }
        if (textView != null) {
            textView.setText("ID: ".concat(str));
        }
        view.setOnClickListener(new ViewOnClickListenerC4541a(activity, str, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m8760j(Object obj, List list) {
        for (Method method : m8745G(obj.getClass())) {
            if (!list.contains(method) && method.getParameterTypes().length == 1 && CharSequence.class.isAssignableFrom(method.getParameterTypes()[0]) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                KavaReflector.invoke(method, obj, HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
        KavaReflector.writeField(obj, "h", HttpUrl.FRAGMENT_ENCODE_SET);
        KavaReflector.writeField(obj, "m", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8761k(ViewGroup viewGroup, ArrayList arrayList) {
        if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1 && !(viewGroup instanceof FrameLayout) && !(viewGroup instanceof ScrollView)) {
            int width = viewGroup.getWidth();
            if (width != 0) {
                Context context = viewGroup.getContext();
                context.getClass();
                if (width > m8763m(context, 220.0f)) {
                    arrayList.add(viewGroup);
                }
            }
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            if (childAt instanceof ViewGroup) {
                m8761k((ViewGroup) childAt, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m8762l(View view, int i9, InterfaceC1231l interfaceC1231l) {
        if (i9 > 4) {
            return;
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string = text != null ? text.toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(string)) {
                interfaceC1231l.invoke(string);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.getClass();
                m8762l(childAt, i9 + 1, interfaceC1231l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m8763m(Context context, float f3) {
        return (int) ((f3 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static View m8764n(ViewGroup viewGroup) {
        View viewM8764n;
        Object tag = viewGroup.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if ((str != null && AbstractC3156t.m6740d0(str, "Hchat:ProfileId:Value:", false)) || AbstractC1416l.m3825a(viewGroup.getTag(), "Hchat:ProfileId:Row")) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            Object tag2 = childAt.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if ((str2 != null && AbstractC3156t.m6740d0(str2, "Hchat:ProfileId:Value:", false)) || AbstractC1416l.m3825a(childAt.getTag(), "Hchat:ProfileId:Row")) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewM8764n = m8764n((ViewGroup) childAt)) != null) {
                return viewM8764n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m8765o(Object obj, String str) {
        Object obj2;
        Object objInvoke;
        Iterator it = m8745G(obj.getClass()).iterator();
        do {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Method method = (Method) it.next();
            if (method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], String.class) && AbstractC3149m.m6709h0(method.getReturnType().getName(), "Preference", false) && (objInvoke = KavaReflector.invoke(method, obj, str)) != null && AbstractC1416l.m3825a(m8748J(objInvoke), str)) {
                obj2 = objInvoke;
            }
        } while (obj2 == null);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static TextView m8766p(ViewGroup viewGroup, InterfaceC1231l interfaceC1231l) {
        TextView textViewM8766p;
        int childCount = viewGroup.getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                CharSequence text = textView.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (((Boolean) interfaceC1231l.invoke(string)).booleanValue()) {
                    return textView;
                }
            }
            if ((childAt instanceof ViewGroup) && (textViewM8766p = m8766p((ViewGroup) childAt, interfaceC1231l)) != null) {
                return textViewM8766p;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m8767q(ViewGroup viewGroup, C2576b c2576b) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof TextView) {
                c2576b.invoke(childAt);
            } else if (childAt instanceof ViewGroup) {
                m8767q((ViewGroup) childAt, c2576b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m8768r(Class cls, Class[] clsArr, InterfaceC1231l interfaceC1231l) {
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "initView", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        if (methodFindMethodRecursive != null) {
            C3744i.f12154b.m7763b(methodFindMethodRecursive, new C2537c(interfaceC1231l, 1));
            return;
        }
        AbstractC1184v0.m3203m("[Hchat:ProfileId] 未找到 " + cls.getName() + "#initView");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m8769s(Context context, ClassLoader classLoader) {
        Object next;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.chatroom.ui.ChatroomInfoUI", classLoader);
        if (clsLoadClass == null) {
            AbstractC1184v0.m3203m("[Hchat:ProfileId] 未找到群聊资料页类");
            return;
        }
        m8768r(clsLoadClass, new Class[0], new C1121f1(context, 2));
        Iterator it = m8745G(clsLoadClass).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            if (AbstractC1416l.m3825a(method.getName(), "onPreferenceTreeClick") && method.getParameterTypes().length >= 2) {
                break;
            }
        }
        Method method2 = (Method) next;
        if (method2 != null) {
            C3744i.f12154b.m7763b(method2, new C0226f(26));
        } else {
            AbstractC1184v0.m3203m("[Hchat:ProfileId] 未找到群聊资料页 Preference 点击方法");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8770w(ClassLoader classLoader) {
        Object c3959f;
        Throwable thM8182b;
        Method[] declaredMethods;
        int length;
        boolean z9;
        int i9;
        Method method;
        try {
            declaredMethods = classLoader.loadClass("com.tencent.tinker.loader.app.TinkerApplication").getDeclaredMethods();
            declaredMethods.getClass();
            length = declaredMethods.length;
            z9 = false;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            if (i9 >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i9];
            if (AbstractC1416l.m3825a(method.getName(), "getTinkerFlags")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z10 = parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getReturnType(), Integer.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Integer.class));
                if (z10) {
                    break;
                }
                i9++;
            }
            thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook getTinkerFlags 失败: ", thM8182b.getMessage(), thM8182b);
            }
            Boolean bool = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
                c3959f = bool;
            }
            return ((Boolean) c3959f).booleanValue();
        }
        if (method == null) {
            AbstractC1184v0.m3203m("[Hchat:HotUpdate] 未找到 TinkerApplication.getTinkerFlags");
        } else {
            C3744i.f12154b.m7763b(method, new C0226f(25));
            z9 = true;
        }
        c3959f = Boolean.valueOf(z9);
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
        }
        Boolean bool2 = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public void m8771A(Context context, ClassLoader classLoader) {
        if (context == null || classLoader == null || !m8741C(context)) {
            return;
        }
        String str = System.identityHashCode(classLoader) + ":" + classLoader;
        synchronized (this) {
            HashSet hashSet = C4540b.f14986h;
            if (hashSet.contains(str)) {
                return;
            }
            C4330d c4330d = C4540b.f14983e;
            boolean zM8770w = m8770w(classLoader);
            boolean zM8775x = c4330d.m8775x(classLoader);
            if (zM8770w || zM8775x) {
                hashSet.add(str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void m8772t(ClassLoader classLoader) {
        Object c3959f;
        try {
            Method[] declaredMethods = classLoader.loadClass("com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService").getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                boolean z9 = true;
                if (method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].getName().equals("com.tencent.tinker.lib.service.PatchResult") || !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                    z9 = false;
                }
                if (z9) {
                    arrayList.add(method);
                }
            }
            for (Method method2 : arrayList) {
                C3744i c3744i = C3744i.f12154b;
                method2.getClass();
                c3744i.m7763b(method2, new C4539a(this, method2, 0));
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null || (thM8182b instanceof ClassNotFoundException)) {
            return;
        }
        AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook LegacyTinkerCore 失败: ", thM8182b.getMessage(), thM8182b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f14471g) {
            case 5:
                return "CompositionErrorContext";
            case 6:
            default:
                return super.toString();
            case 7:
                return "default";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x009f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x006f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m8773u(ClassLoader classLoader, DexKitBridge dexKitBridge, SharedPreferences sharedPreferences, String str) {
        ?? c3959f;
        Object c3959f2;
        XC_MethodHook.Unhook c3959f3;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, str, classLoader, "manual_updater");
        if (methodM2087c != null) {
            C4330d c4330d = C4540b.f14983e;
            if (!m8742D(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c == null) {
                try {
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("start to run patch", "hot patch verfiy signature error", "patch applying is blocked by TinkerEnsuranceOnFault"));
                    c0570e.f1764h = c1253k;
                    Iterator it = dexKitBridge.findMethod(c0570e).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c3959f = 0;
                            break;
                        }
                        C1730o c1730o = (C1730o) it.next();
                        try {
                            c1730o.getClass();
                            c3959f2 = c1730o.m4348p().m6023b(classLoader);
                        } catch (Throwable th2) {
                            c3959f2 = new C3959f(th2);
                        }
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = null;
                        }
                        Method method = (Method) c3959f2;
                        if (method == null || !m8742D(method)) {
                            method = null;
                        }
                        if (method != null) {
                            c3959f = method;
                            break;
                        }
                    }
                    if (c3959f != 0) {
                        C0828b.m2092h(sharedPreferences, str, "manual_updater", c3959f);
                    } else {
                        try {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                                editorEdit.clear().putString("cache.key", str);
                            }
                            editorEdit.remove("manual_updater").apply();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                methodM2087c = (Method) (c3959f instanceof C3959f ? 0 : c3959f);
            }
        }
        if (methodM2087c == null) {
            AbstractC1184v0.m3203m("[Hchat:HotUpdate] 未找到热更新补丁应用入口");
            return;
        }
        try {
            c3959f3 = C3744i.f12154b.m7763b(methodM2087c, new C4539a(this, methodM2087c, 1));
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f3);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook 补丁应用入口失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public void m8774v(ClassLoader classLoader, DexKitBridge dexKitBridge, SharedPreferences sharedPreferences, String str) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        C0828b c0828b = C0828b.f2478a;
        try {
            try {
                c3959f = classLoader.loadClass("com.tencent.mm.plugin.hp.util.TinkerSyncResponse");
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            Class cls = (Class) c3959f;
            if (cls == null) {
                AbstractC1184v0.m3203m("[Hchat:HotUpdate] 未找到 TinkerSyncResponse 类");
                return;
            }
            List listM2090f = C0828b.m2090f(sharedPreferences, str, classLoader, "sync_response_consumer");
            ArrayList<Method> arrayList = new ArrayList();
            for (Object obj : listM2090f) {
                if (m8743E(cls, (Method) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, C4540b.f14985g);
                c0570e.f1764h = c1253k;
                C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                arrayList = new ArrayList();
                for (C1730o c1730o : c1731pFindMethod) {
                    try {
                        c1730o.getClass();
                        c3959f3 = c1730o.m4348p().m6023b(classLoader);
                    } catch (Throwable th3) {
                        c3959f3 = new C3959f(th3);
                    }
                    if (c3959f3 instanceof C3959f) {
                        c3959f3 = null;
                    }
                    Method method = (Method) c3959f3;
                    if (method == null || !m8743E(cls, method)) {
                        method = null;
                    }
                    if (method != null) {
                        arrayList.add(method);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                        editorEdit.clear().putString("cache.key", str);
                    }
                    editorEdit.remove("sync_response_consumer").apply();
                } catch (Throwable unused) {
                }
            } else {
                c0828b.m2097j(sharedPreferences, str, "sync_response_consumer", arrayList);
            }
            int i9 = 0;
            for (Method method2 : arrayList) {
                C3744i.f12154b.m7763b(method2, new C4539a(this, method2, 2));
                i9++;
            }
            if (i9 == 0) {
                AbstractC1184v0.m3203m("[Hchat:HotUpdate] 未找到热更新下发响应消费入口");
            }
            c3959f2 = C3967n.f12976a;
        } catch (Throwable th4) {
            c3959f2 = new C3959f(th4);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f2);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook 热更新下发响应消费失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m8775x(ClassLoader classLoader) {
        Object c3959f;
        Throwable thM8182b;
        Method[] declaredMethods;
        ArrayList<Method> arrayList;
        int length;
        boolean z9;
        int i9;
        try {
            declaredMethods = classLoader.loadClass("com.tencent.tinker.loader.TinkerLoader").getDeclaredMethods();
            declaredMethods.getClass();
            arrayList = new ArrayList();
            length = declaredMethods.length;
            z9 = false;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            boolean z10 = true;
            if (i9 >= length) {
                break;
            }
            Method method = declaredMethods[i9];
            if (!AbstractC1416l.m3825a(method.getName(), "tryLoadPatchFilesInternal") || method.getParameterTypes().length < 2 || !method.getParameterTypes()[0].getName().equals("com.tencent.tinker.loader.app.TinkerApplication") || !AbstractC1416l.m3825a(method.getParameterTypes()[1], Intent.class)) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(method);
            }
            i9++;
            thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook TinkerLoader 失败: ", thM8182b.getMessage(), thM8182b);
            }
            Boolean bool = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
                c3959f = bool;
            }
            return ((Boolean) c3959f).booleanValue();
        }
        if (arrayList.isEmpty()) {
            AbstractC1184v0.m3203m("[Hchat:HotUpdate] 未找到 TinkerLoader.tryLoadPatchFilesInternal");
        } else {
            for (Method method2 : arrayList) {
                C3744i c3744i = C3744i.f12154b;
                method2.getClass();
                c3744i.m7763b(method2, new C0036d(this, method2, classLoader, 4));
            }
            z9 = true;
        }
        c3959f = Boolean.valueOf(z9);
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
        }
        Boolean bool2 = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public void m8776y(ClassLoader classLoader, DexKitBridge dexKitBridge, SharedPreferences sharedPreferences, String str) {
        Object c3959f;
        Object c3959f2;
        C0828b c0828b = C0828b.f2478a;
        try {
            List listM2090f = C0828b.m2090f(sharedPreferences, str, classLoader, "upgrade_response");
            ArrayList<Method> arrayList = new ArrayList();
            for (Object obj : listM2090f) {
                if (m8744F((Method) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, C4540b.f14984f);
                c0570e.f1764h = c1253k;
                C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                arrayList = new ArrayList();
                for (C1730o c1730o : c1731pFindMethod) {
                    try {
                        c1730o.getClass();
                        c3959f2 = c1730o.m4348p().m6023b(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    Method method = null;
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method2 = (Method) c3959f2;
                    if (method2 != null && m8744F(method2)) {
                        method = method2;
                    }
                    if (method != null) {
                        arrayList.add(method);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                        editorEdit.clear().putString("cache.key", str);
                    }
                    editorEdit.remove("upgrade_response").apply();
                } catch (Throwable unused) {
                }
            } else {
                c0828b.m2097j(sharedPreferences, str, "upgrade_response", arrayList);
            }
            for (Method method3 : arrayList) {
                C3744i.f12154b.m7763b(method3, new C4539a(this, method3, 3));
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:HotUpdate] Hook 热更新响应处理失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m8777z(DexKitBridge dexKitBridge, ClassLoader classLoader, Context context) {
        if (context == null || classLoader == null || dexKitBridge == null || !m8741C(context)) {
            return;
        }
        m8771A(context, classLoader);
        String str = System.identityHashCode(classLoader) + ":" + classLoader;
        synchronized (this) {
            HashSet hashSet = C4540b.f14987i;
            if (hashSet.contains(str)) {
                return;
            }
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_hot_update_method_cache");
            String str2 = C3087k.m6557a(context, classLoader).f8202h;
            C4330d c4330d = C4540b.f14983e;
            c4330d.m8774v(classLoader, dexKitBridge, sharedPreferencesM8640c, str2);
            c4330d.m8776y(classLoader, dexKitBridge, sharedPreferencesM8640c, str2);
            c4330d.m8773u(classLoader, dexKitBridge, sharedPreferencesM8640c, str2);
            c4330d.m8772t(classLoader);
            hashSet.add(str);
        }
    }
}
