package p086r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import p001A0.RunnableC0040m;
import p001A0.RunnableC0045r;
import p003B0.AbstractC0055a;
import p003B0.AbstractC0056b;
import p006D.AbstractC0079h;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p077m0.ViewOnClickListenerC0770h;
import p084q0.C0804d;
import p084q0.C0806f;
import p084q0.C0808h;
import p102z0.AbstractC1122e;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1134q;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.ViewOnClickListenerC1130m;

/* JADX INFO: renamed from: r0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0950w {

    /* JADX INFO: renamed from: a */
    public final Context f3411a;

    /* JADX INFO: renamed from: b */
    public final int f3412b;

    /* JADX INFO: renamed from: c */
    public final int f3413c;

    /* JADX INFO: renamed from: d */
    public final int f3414d;

    /* JADX INFO: renamed from: e */
    public final int f3415e;

    /* JADX INFO: renamed from: f */
    public WeakReference f3416f;

    /* JADX INFO: renamed from: g */
    public String f3417g;

    /* JADX INFO: renamed from: h */
    public WeakReference f3418h;

    /* JADX INFO: renamed from: i */
    public String f3419i;

    /* JADX INFO: renamed from: j */
    public WeakReference f3420j;

    /* JADX INFO: renamed from: k */
    public String f3421k;

    /* JADX INFO: renamed from: l */
    public long f3422l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0950w(Context context) {
        this.f3411a = context;
        int i2 = context.getApplicationInfo().icon;
        this.f3412b = i2 + 1;
        this.f3413c = i2 + 2;
        this.f3414d = i2 + 3;
        this.f3415e = i2 + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2112c(String str, String str2, Object obj) {
        Object c0104d;
        Object c0104d2;
        Object objM969E = AbstractC0503h.m969E(obj, "getActivity", new Object[0]);
        Activity activity = objM969E instanceof Activity ? (Activity) objM969E : null;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (str.equals("background") || str.equals("background-refresh")) {
            activity.finish();
            AbstractC0731a.m1384a("close hidden close friend chat silently", str, str2);
            return;
        }
        try {
            c0104d = AbstractC0055a.m102c("com.tencent.mm.ui.LauncherUI");
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Class cls = (Class) (c0104d instanceof C0104d ? null : c0104d);
        if (cls != null) {
            Intent intent = new Intent(activity, (Class<?>) cls);
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            activity.finish();
            activity.startActivity(intent);
        } else {
            try {
                activity.onBackPressed();
                c0104d2 = Boolean.TRUE;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            Object obj2 = Boolean.FALSE;
            if (c0104d2 instanceof C0104d) {
                c0104d2 = obj2;
            }
            if (!((Boolean) c0104d2).booleanValue() && !activity.isFinishing()) {
                KeyEvent keyEvent = new KeyEvent(0, 4);
                KeyEvent keyEvent2 = new KeyEvent(1, 4);
                if (!activity.dispatchKeyEvent(keyEvent) || !activity.dispatchKeyEvent(keyEvent2)) {
                    activity.finish();
                }
            }
        }
        AbstractC0731a.m1384a("close hidden close friend chat", str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2113e(Object obj) {
        Object c0104d;
        try {
            Object objM969E = AbstractC0503h.m969E(obj, "getArguments", new Object[0]);
            c0104d = objM969E instanceof Bundle ? (Bundle) objM969E : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        Bundle bundle = (Bundle) c0104d;
        if (bundle == null) {
            return null;
        }
        return bundle.getString("Chat_User");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m2114k(Object obj) {
        Object c0104d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(m2116o(obj, "getAdapter"));
        linkedHashSet.add(m2116o(obj, "getListView"));
        linkedHashSet.add(m2116o(obj, "getRecyclerView"));
        for (Object obj2 : linkedHashSet) {
            if (m2115l(obj2) || m2115l(m2116o(obj2, "getAdapter"))) {
                return true;
            }
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            try {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                c0104d = Boolean.valueOf(m2115l(obj3) || m2115l(m2116o(obj3, "getAdapter")));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj4 = Boolean.FALSE;
            if (c0104d instanceof C0104d) {
                c0104d = obj4;
            }
            if (((Boolean) c0104d).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2115l(Object obj) {
        Method method;
        Object c0104d;
        if (obj != null) {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (AbstractC0223g.m414a(method.getName(), "notifyDataSetChanged")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                int length2 = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (AbstractC0223g.m414a(method.getName(), "notifyDataSetChanged")) {
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                        if (parameterTypes2.length == 0) {
                            break;
                        }
                    }
                    i3++;
                }
            }
            try {
                method.setAccessible(true);
                method.invoke(obj, null);
                c0104d = Boolean.TRUE;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj2 = Boolean.FALSE;
            if (c0104d instanceof C0104d) {
                c0104d = obj2;
            }
            return ((Boolean) c0104d).booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m2116o(Object obj, String str) {
        Method method;
        Object c0104d;
        if (obj != null) {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = methods[i3];
                if (AbstractC0223g.m414a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i3++;
            }
            if (method == null) {
                Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                int length2 = declaredMethods.length;
                while (true) {
                    if (i2 >= length2) {
                        method = null;
                        break;
                    }
                    Method method2 = declaredMethods[i2];
                    if (AbstractC0223g.m414a(method2.getName(), str)) {
                        Class<?>[] parameterTypes2 = method2.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                        if (parameterTypes2.length == 0) {
                            method = method2;
                            break;
                        }
                    }
                    i2++;
                }
            }
            try {
                method.setAccessible(true);
                c0104d = method.invoke(obj, null);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                return null;
            }
            return c0104d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m2117p(String str) {
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2448x() && !C1124g.m2429e(str)) {
            String str2 = AbstractC1122e.f3783a;
            AbstractC0223g.m418e(str, "chatUser");
            String string = AbstractC0299i.m507C0(str).toString();
            String str3 = AbstractC1122e.f3783a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!AbstractC0307q.m534d0(string) && str3 != null && !AbstractC0307q.m534d0(str3) && string.equals(str3) && jCurrentTimeMillis - AbstractC1122e.f3784b <= 8000) {
                AbstractC1122e.f3783a = null;
                AbstractC1122e.f3784b = 0L;
                return false;
            }
            C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
            if (C1124g.m2443s()) {
                if (!AbstractC0307q.m534d0(str)) {
                    return c0808h.f2685b.contains(str);
                }
                AbstractC0731a.m1387d("chatUser is null or blank");
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2118a(EditText editText, Object obj, String str) {
        editText.setTag(this.f3413c, obj);
        editText.setTag(this.f3414d, str);
        int i2 = this.f3412b;
        Object tag = editText.getTag(i2);
        Boolean bool = Boolean.TRUE;
        if (AbstractC0223g.m414a(tag, bool)) {
            if (AbstractC1135r.m2498t()) {
                editText.post(new RunnableC0045r(editText, this, obj, 4));
            }
        } else {
            editText.addTextChangedListener(new C0947v(this, editText, obj));
            editText.setTag(i2, bool);
            AbstractC0731a.m1384a("chat command watcher attached", str, editText.getClass().getName());
            if (AbstractC1135r.m2498t()) {
                editText.post(new RunnableC0045r(editText, this, obj, 4));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2119b(Object obj, String str) {
        Object c0104d;
        Object c0104d2;
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        ArrayList arrayList = new ArrayList();
        try {
            Object objM969E = AbstractC0503h.m969E(obj, "getView", new Object[0]);
            c0104d = objM969E instanceof View ? (View) objM969E : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        View view = (View) c0104d;
        if (view != null) {
            arrayList.add(view);
        }
        try {
            Object objM969E2 = AbstractC0503h.m969E(obj, "getActivity", new Object[0]);
            c0104d2 = objM969E2 instanceof Activity ? (Activity) objM969E2 : null;
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        Activity activity = (Activity) c0104d2;
        if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            arrayList.add(decorView2);
        }
        View viewFindFocus = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findFocus();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if ((viewFindFocus instanceof EditText) && viewFindFocus.getVisibility() == 0) {
            linkedHashSet.add(viewFindFocus);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (View view2 : AbstractC0503h.m987s((View) it.next(), new C0804d(17))) {
                EditText editText = view2 instanceof EditText ? (EditText) view2 : null;
                if (editText != null) {
                    linkedHashSet.add(editText);
                }
            }
        }
        List listM281w0 = AbstractC0123k.m281w0(linkedHashSet);
        if (listM281w0.isEmpty()) {
            AbstractC0731a.m1387d("play chat command no visible edit text", str);
            return false;
        }
        Iterator it2 = listM281w0.iterator();
        while (it2.hasNext()) {
            m2118a((EditText) it2.next(), obj, str);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[PHI: r7
  0x0064: PHI (r7v2 java.lang.reflect.Method) = (r7v1 java.lang.reflect.Method), (r7v4 java.lang.reflect.Method) binds: [B:12:0x0032, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m2120d(Object obj) {
        Method method;
        Object c0104d;
        View view;
        Object c0104d2;
        Object c0104d3;
        Method[] methods = obj.getClass().getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                method = null;
                break;
            }
            method = methods[i3];
            if (AbstractC0223g.m414a(method.getName(), "getListView")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0) {
                    break;
                }
            }
            i3++;
        }
        if (method == null) {
            Method[] declaredMethods = obj.getClass().getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length2 = declaredMethods.length;
            while (true) {
                if (i2 >= length2) {
                    method = null;
                    break;
                }
                Method method2 = declaredMethods[i2];
                if (AbstractC0223g.m414a(method2.getName(), "getListView")) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0) {
                        method = method2;
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                view = null;
            } else {
                try {
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(obj, null);
                    c0104d = objInvoke instanceof View ? (View) objInvoke : null;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                view = (View) c0104d;
            }
        }
        if (view == null) {
            try {
                Object objMo1012c = AbstractC0514f.f1622b.mo1012c(obj, "findViewById", Integer.valueOf(AbstractC1135r.m2494p() < 2460 ? AbstractC0056b.m103a("b5n") : AbstractC1135r.m2494p() == 2429 ? AbstractC0056b.m103a("bnu") : AbstractC0056b.m103a("bm6")));
                AbstractC0223g.m416c(objMo1012c, "null cannot be cast to non-null type android.view.View");
                c0104d2 = (View) objMo1012c;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            if (c0104d2 instanceof C0104d) {
                c0104d2 = null;
            }
            view = (View) c0104d2;
        }
        if (view != null) {
            return view;
        }
        try {
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(this.f3411a.getClassLoader(), "com.tencent.mm.ui.chatting.view.MMChattingListView");
            if (clsMo1021l == null) {
                c0104d3 = null;
            } else {
                Object obj2 = AbstractC0514f.f1622b.mo1020k(obj.getClass(), clsMo1021l).get(obj);
                AbstractC0223g.m416c(obj2, "null cannot be cast to non-null type android.view.View");
                c0104d3 = (View) obj2;
            }
        } catch (Throwable th3) {
            c0104d3 = new C0104d(th3);
        }
        return (View) (c0104d3 instanceof C0104d ? null : c0104d3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final EditText m2121f(Object obj) {
        View view;
        View view2 = (View) AbstractC0514f.f1622b.mo1012c(obj, "findViewById", Integer.valueOf(AbstractC0056b.m103a("bkk")));
        EditText editText = (view2 == null || (view = (View) AbstractC0123k.m268j0(AbstractC0503h.m987s(view2, new C0804d(15)))) == null) ? null : (EditText) view;
        if (editText != null) {
            return editText;
        }
        int i2 = this.f3411a.getApplicationInfo().icon;
        View view3 = (View) AbstractC0514f.f1622b.mo1012c(obj, "getView", new Object[0]);
        Object tag = view3 != null ? view3.getTag(i2) : null;
        if (tag instanceof EditText) {
            return (EditText) tag;
        }
        EditText editText2 = (EditText) ((View) AbstractC0123k.m268j0(AbstractC0503h.m987s(view3, new C0804d(16))));
        if (editText2 != null && view3 != null) {
            view3.setTag(i2, editText2);
        }
        return editText2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2122g(final Object obj) {
        boolean zContains;
        boolean zContains2;
        Object c0104d;
        Bundle bundle = (Bundle) AbstractC0503h.m969E(obj, "getArguments", new Object[0]);
        Object objM969E = AbstractC0503h.m969E(obj, "getActivity", new Object[0]);
        AbstractC0223g.m416c(objM969E, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) objM969E;
        if (bundle == null) {
            AbstractC0731a.m1387d("chattingUI's arguments is null");
            return;
        }
        final String string = bundle.getString("Chat_User");
        if (string == null || string.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeakReference weakReference = this.f3420j;
        boolean z2 = ((weakReference != null ? weakReference.get() : null) == obj) && AbstractC0223g.m414a(this.f3421k, string) && jCurrentTimeMillis - this.f3422l < 800;
        this.f3420j = new WeakReference(obj);
        this.f3421k = string;
        this.f3422l = jCurrentTimeMillis;
        if (z2) {
            return;
        }
        m2127n(obj, string);
        C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
        boolean z3 = AbstractC1126i.f3786a;
        if (!C1124g.m2443s()) {
            zContains = false;
        } else if (AbstractC0307q.m534d0(string)) {
            AbstractC0731a.m1387d("chatUser is null or blank");
            zContains = false;
        } else {
            zContains = c0808h.f2685b.contains(string);
        }
        if (zContains) {
            this.f3418h = new WeakReference(obj);
            this.f3419i = string;
        } else {
            this.f3418h = null;
            this.f3419i = null;
        }
        if (m2117p(string)) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        } else if (C1124g.m2447w()) {
            C0808h c0808h2 = (C0808h) AbstractC0503h.m988u(C0808h.class);
            if (!C1124g.m2443s()) {
                zContains2 = false;
                if (zContains2) {
                }
            } else if (AbstractC0307q.m534d0(string)) {
                AbstractC0731a.m1387d("chatUser is null or blank");
                zContains2 = false;
                if (zContains2) {
                    m2124i(obj, activity, string, true);
                } else {
                    m2128q(obj);
                }
            } else {
                zContains2 = c0808h2.f2685b.contains(string);
                if (zContains2) {
                }
            }
        }
        Handler handler = AbstractC1134q.f3825a;
        AbstractC1134q.m2467h(this.f3411a, string);
        if (C1124g.m2443s() && C1124g.m2435k().getEnableChattingKey()) {
            if (!AbstractC1135r.m2498t()) {
                EditText editTextM2121f = m2121f(obj);
                if (editTextM2121f != null) {
                    m2118a(editTextM2121f, obj, string);
                }
            } else if (!m2119b(obj, string)) {
                try {
                    Object objM969E2 = AbstractC0503h.m969E(obj, "getView", new Object[0]);
                    c0104d = objM969E2 instanceof View ? (View) objM969E2 : null;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                final View view = (View) c0104d;
                if (view != null) {
                    int i2 = this.f3415e;
                    Object tag = view.getTag(i2);
                    Boolean bool = Boolean.TRUE;
                    if (!AbstractC0223g.m414a(tag, bool)) {
                        view.setTag(i2, bool);
                        final int i3 = 0;
                        for (Object obj2 : AbstractC0120h.m252Z(new Long[]{120L, 360L, 800L, 1500L})) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC0124l.m288b0();
                                throw null;
                            }
                            final long jLongValue = ((Number) obj2).longValue();
                            view.postDelayed(new Runnable() { // from class: r0.t
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zM2119b;
                                    C0950w c0950w = this.f3351a;
                                    c0950w.getClass();
                                    boolean zM2498t = AbstractC1135r.m2498t();
                                    Object obj3 = obj;
                                    String str = string;
                                    if (zM2498t) {
                                        zM2119b = c0950w.m2119b(obj3, str);
                                    } else {
                                        EditText editTextM2121f2 = c0950w.m2121f(obj3);
                                        if (editTextM2121f2 != null) {
                                            c0950w.m2118a(editTextM2121f2, obj3, str);
                                            zM2119b = true;
                                        } else {
                                            zM2119b = false;
                                        }
                                    }
                                    View view2 = view;
                                    int i5 = c0950w.f3415e;
                                    if (zM2119b) {
                                        view2.setTag(i5, Boolean.FALSE);
                                        AbstractC0731a.m1384a("chat command watcher attached by retry", str, "delay=" + jLongValue);
                                        return;
                                    }
                                    if (i3 == 3) {
                                        view2.setTag(i5, Boolean.FALSE);
                                        AbstractC0731a.m1387d("chat command input not found after retry", str);
                                    }
                                }
                            }, jLongValue);
                            i3 = i4;
                        }
                    }
                }
            }
        }
        C0806f c0806f = (C0806f) AbstractC0503h.m988u(C0806f.class);
        if (c0806f.f2678a) {
            AbstractC0731a.m1386c("start config ui");
            ((View) AbstractC0514f.f1622b.mo1012c(obj, "getView", new Object[0])).post(new RunnableC0040m(c0806f, obj, 4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2123h(EditText editText, Editable editable, Object obj) {
        String str;
        Object c0104d;
        Object next;
        String str2;
        String tagName;
        String string = editable.toString();
        if (string == null) {
            string = "";
        }
        String string2 = AbstractC0299i.m507C0(string).toString();
        Object tag = editText.getTag(this.f3413c);
        if (tag == null) {
            tag = obj;
        }
        String strM2113e = m2113e(tag);
        if (strM2113e == null) {
            Object tag2 = editText.getTag(this.f3414d);
            if (tag2 instanceof String) {
                strM2113e = (String) tag2;
                str = strM2113e;
            } else {
                str = null;
            }
        } else {
            str = strM2113e;
        }
        boolean z2 = false;
        try {
            Object objM969E = AbstractC0503h.m969E(tag, "getActivity", new Object[0]);
            AbstractC0223g.m416c(objM969E, "null cannot be cast to non-null type android.app.Activity");
            c0104d = (Activity) objM969E;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        Activity activity = (Activity) c0104d;
        if (activity != null) {
            switch (string2.hashCode()) {
                case -356857517:
                    if (string2.equals("#copyId") && str != null) {
                        AbstractC1135r.m2484f(str);
                        AbstractC0503h.m977O(activity, "已复制wxid:".concat(str));
                        editable.clear();
                        return true;
                    }
                    break;
                case 1139102:
                    if (string2.equals("#add") && str != null) {
                        boolean z3 = AbstractC1126i.f3786a;
                        ArrayList arrayListM2433i = C1124g.m2433i();
                        if (!arrayListM2433i.isEmpty()) {
                            Iterator it = arrayListM2433i.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (AbstractC0223g.m414a(((MaskItemBean) it.next()).getMaskId(), str)) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        if (!z2) {
                            boolean z4 = AbstractC1126i.f3786a;
                            C1124g.m2426b(new MaskItemBean(str, null, 0, null, null, null, 62, null));
                            C1124g.m2420K(str);
                            ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
                            ((C0808h) AbstractC0503h.m988u(C0808h.class)).mo1472a();
                            AbstractC0731a.m1384a("chat command add mask", str);
                        }
                        AbstractC0503h.m977O(activity, (z2 ? "已在隐藏名单中：" : "已加入隐藏名单：").concat(str));
                        editable.clear();
                        return true;
                    }
                    break;
                case 1142024:
                    if (string2.equals("#del") && str != null) {
                        boolean z5 = AbstractC1126i.f3786a;
                        Iterator it2 = C1124g.m2433i().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (AbstractC0223g.m414a(((MaskItemBean) next).getMaskId(), str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        MaskItemBean maskItemBean = (MaskItemBean) next;
                        if (maskItemBean == null || (tagName = maskItemBean.getTagName()) == null) {
                            str2 = str;
                        } else {
                            str2 = AbstractC0307q.m534d0(tagName) ? null : tagName;
                            if (str2 == null) {
                            }
                        }
                        boolean z6 = AbstractC1126i.f3786a;
                        ArrayList arrayListM2433i2 = C1124g.m2433i();
                        Iterator it3 = arrayListM2433i2.iterator();
                        AbstractC0223g.m417d(it3, "iterator(...)");
                        boolean z7 = false;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            AbstractC0223g.m417d(next2, "next(...)");
                            if (str.equals(((MaskItemBean) next2).getMaskId())) {
                                it3.remove();
                                z7 = true;
                            }
                        }
                        if (z7) {
                            C1124g.m2423N(arrayListM2433i2);
                            z2 = true;
                        } else {
                            AbstractC0731a.m1384a("remove mask item skipped", str);
                        }
                        if (z2) {
                            boolean z8 = AbstractC1126i.f3786a;
                            C1124g.m2420K(str);
                        }
                        ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
                        ((C0808h) AbstractC0503h.m988u(C0808h.class)).mo1472a();
                        AbstractC0731a.m1384a("chat command del mask", str, "removed=" + z2);
                        m2128q(tag);
                        AbstractC0503h.m977O(activity, (z2 ? "已移除隐藏名单：" : "未在隐藏名单中：").concat(str2));
                        editable.clear();
                        return true;
                    }
                    break;
                case 35525605:
                    if (string2.equals("#hide")) {
                        View viewM2120d = m2120d(tag);
                        if (viewM2120d != null) {
                            viewM2120d.setVisibility(4);
                        }
                        editable.clear();
                        return true;
                    }
                    break;
                case 35852704:
                    if (string2.equals("#show")) {
                        m2128q(tag);
                        editable.clear();
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2124i(Object obj, Activity activity, String str, boolean z2) {
        int i2;
        boolean z3 = AbstractC1126i.f3786a;
        if (C1124g.m2447w()) {
            View viewM2120d = m2120d(obj);
            if (viewM2120d != null) {
                viewM2120d.setVisibility(4);
                Object parent = viewM2120d.getParent();
                AbstractC1135r.m2473A(parent instanceof View ? (View) parent : null, new C0804d(18), AbstractC0079h.m183g(C1124g.m2435k().getChatHistoryQuickUnhideDurationMs(), 300, 5000), new ViewOnClickListenerC0770h(1, viewM2120d));
            } else if (C1124g.m2447w()) {
                Object objM969E = AbstractC0503h.m969E(obj, "getView", new Object[0]);
                ViewGroup viewGroup = objM969E instanceof ViewGroup ? (ViewGroup) objM969E : null;
                if (viewGroup != null) {
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e2) {
                            AbstractC0731a.m1385b(e2);
                            i2 = -1;
                        }
                        AbstractC1135r.f3833e = i2;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(AbstractC1135r.f3833e == 2429 ? AbstractC0056b.m103a("bm7") : AbstractC0056b.m103a("b49"));
                    if (viewGroup.findViewWithTag("chatting-onEnterBegin") == null) {
                        View view = new View(viewGroup.getContext());
                        view.setTag("chatting-onEnterBegin");
                        view.setBackground(new ColorDrawable(-1184275));
                        view.setTranslationZ(9999.0f);
                        viewGroup2.addView(view, -1, -1);
                    }
                }
            }
            if (z2) {
                try {
                    boolean z4 = AbstractC1126i.f3786a;
                    for (Object obj2 : C1124g.m2433i()) {
                        if (AbstractC0223g.m414a(((MaskItemBean) obj2).getMaskId(), str)) {
                            MaskItemBean maskItemBean = (MaskItemBean) obj2;
                            if (activity == null || 10086 == maskItemBean.getTipMode() || maskItemBean.getTipMode() != 0) {
                                return;
                            }
                            new AlertDialog.Builder(activity).setTitle("��ʾ").setIcon(activity.getApplicationInfo().icon).setMessage(MaskItemBean.TipData.Companion.from(maskItemBean).getMess()).setNegativeButton("֪����", (DialogInterface.OnClickListener) null).show();
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } catch (Exception e3) {
                    AbstractC0731a.m1387d(e3);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2125j(String str) {
        Object obj;
        boolean zContains;
        WeakReference weakReference = this.f3418h;
        if (weakReference == null || (obj = weakReference.get()) == null) {
            return;
        }
        String strM2113e = m2113e(obj);
        if (strM2113e == null && (strM2113e = this.f3419i) == null) {
            return;
        }
        C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2443s()) {
            zContains = false;
        } else if (AbstractC0307q.m534d0(strM2113e)) {
            AbstractC0731a.m1387d("chatUser is null or blank");
            zContains = false;
        } else {
            zContains = c0808h.f2685b.contains(strM2113e);
        }
        if (!zContains) {
            this.f3418h = null;
            this.f3419i = null;
        } else if (m2117p(strM2113e)) {
            m2112c(str, strM2113e, obj);
        } else if (C1124g.m2447w()) {
            m2124i(obj, null, strM2113e, false);
            AbstractC0731a.m1384a("hide current masked chat", str, strM2113e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2126m(View view, Object obj) {
        boolean zM2114k = m2114k(view);
        if (!zM2114k) {
            zM2114k = m2114k(obj);
        }
        view.invalidate();
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.invalidate();
        }
        try {
            view.requestLayout();
        } catch (Throwable unused) {
        }
        AbstractC0731a.m1384a("anti revoke refresh chat list", this.f3417g, AbstractC0174d.m355k("notified=", zM2114k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m2127n(Object obj, String str) {
        String str2 = this.f3417g;
        if (str2 != null && !str2.equals(str)) {
            Handler handler = AbstractC1134q.f3825a;
            AbstractC1134q.m2466g(this.f3417g);
            String str3 = AbstractC1122e.f3783a;
            AbstractC1122e.f3785c = C0133u.f428a;
        }
        this.f3416f = new WeakReference(obj);
        this.f3417g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: android.view.ViewParent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m2128q(Object obj) {
        View viewM2120d = m2120d(obj);
        onClickListener = null;
        View.OnClickListener onClickListener = null;
        if (viewM2120d != null) {
            viewM2120d.setVisibility(0);
            ViewParent parent = viewM2120d.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                return;
            }
            try {
                if (view.hasOnClickListeners()) {
                    onClickListener = (View.OnClickListener) AbstractC0514f.f1622b.mo1015f(AbstractC0514f.f1622b.mo1012c(view, "getListenerInfo", new Object[0]), "mOnClickListener");
                }
            } catch (Throwable unused) {
            }
            if (onClickListener instanceof ViewOnClickListenerC1130m) {
                view.setOnClickListener(((ViewOnClickListenerC1130m) onClickListener).f3804b);
                return;
            }
            return;
        }
        Object objM969E = AbstractC0503h.m969E(obj, "getView", new Object[0]);
        ViewGroup viewGroup = objM969E instanceof ViewGroup ? (ViewGroup) objM969E : null;
        View viewFindViewWithTag = viewGroup != null ? viewGroup.findViewWithTag("chatting-onEnterBegin") : null;
        if (viewFindViewWithTag != null) {
            ViewParent parent2 = viewFindViewWithTag.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewFindViewWithTag);
            }
        }
    }
}
