package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import p001A0.C0026a;
import p001A0.C0048u;
import p001A0.C0052y;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p077m0.C0768f;
import p084q0.C0804d;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;
import p102z0.C1127j;
import p102z0.C1128k;

/* JADX INFO: renamed from: r0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0932q implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final LruCache f3316a = new LruCache(24);

    /* JADX INFO: renamed from: b */
    public final Set f3317b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public volatile boolean f3318c;

    /* JADX INFO: renamed from: d */
    public Field f3319d;

    /* JADX INFO: renamed from: e */
    public Field f3320e;

    /* JADX INFO: renamed from: f */
    public Field f3321f;

    /* JADX INFO: renamed from: g */
    public Field f3322g;

    /* JADX INFO: renamed from: h */
    public Field f3323h;

    /* JADX INFO: renamed from: i */
    public Method f3324i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m2039a(C0932q c0932q, Object obj, String str) {
        Object c0104d;
        Method method;
        DisplayMetrics displayMetrics;
        int i2;
        c0932q.getClass();
        String strM2454d = AbstractC1129l.m2454d(str);
        if (strM2454d == null) {
            return false;
        }
        View view = obj instanceof View ? (View) obj : null;
        if (view == null) {
            return false;
        }
        Resources resources = view.getResources();
        int i3 = 720;
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (i2 = displayMetrics.widthPixels) >= 720) {
            i3 = i2;
        }
        Bitmap bitmapM2041c = m2041c(new File(strM2454d), i3);
        if (bitmapM2041c == null) {
            return false;
        }
        try {
            c0932q.m2045d(obj.getClass());
            Field field = c0932q.f3319d;
            if (field != null) {
                field.set(obj, str);
            }
            Field field2 = c0932q.f3320e;
            if (field2 != null) {
                field2.set(obj, bitmapM2041c);
            }
            Field field3 = c0932q.f3321f;
            if (field3 != null) {
                field3.set(obj, bitmapM2041c);
            }
            Field field4 = c0932q.f3322g;
            if (field4 != null) {
                field4.setBoolean(obj, true);
            }
            Field field5 = c0932q.f3323h;
            Object obj2 = field5 != null ? field5.get(obj) : null;
            SpinnerAdapter spinnerAdapter = obj2 instanceof SpinnerAdapter ? (SpinnerAdapter) obj2 : null;
            if (spinnerAdapter instanceof BaseAdapter) {
                ((BaseAdapter) spinnerAdapter).notifyDataSetChanged();
            } else if (spinnerAdapter != null && (method = c0932q.f3324i) != null) {
                method.invoke(obj, spinnerAdapter);
            }
            view.invalidate();
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("custom local avatar apply hd fail", str, thM246a);
        }
        Boolean bool = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = bool;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m2040b(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Bitmap m2041c(File file, int i2) {
        Object c0104d;
        Rect rect;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        if (bitmapDecodeFile == null) {
            return null;
        }
        if (bitmapDecodeFile.getWidth() <= 0 || bitmapDecodeFile.getHeight() <= 0) {
            return bitmapDecodeFile;
        }
        try {
            if (bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight() > 1.0f) {
                int height = bitmapDecodeFile.getHeight();
                int width = (bitmapDecodeFile.getWidth() - height) / 2;
                rect = new Rect(width, 0, height + width, bitmapDecodeFile.getHeight());
            } else {
                int width2 = bitmapDecodeFile.getWidth();
                int height2 = (bitmapDecodeFile.getHeight() - width2) / 2;
                rect = new Rect(0, height2, bitmapDecodeFile.getWidth(), width2 + height2);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect rect2 = new Rect(0, 0, i2, i2);
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmapDecodeFile, rect, rect2, paint);
            c0104d = bitmapCreateBitmap;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Object obj = bitmapDecodeFile;
        if (!(c0104d instanceof C0104d)) {
            obj = c0104d;
        }
        return (Bitmap) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m2042h(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length >= 2 && ImageView.class.isAssignableFrom(parameterTypes[0]) && AbstractC0223g.m414a(parameterTypes[1], String.class) && AbstractC0223g.m414a(method.getReturnType(), Void.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m2043i(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 1 && AbstractC0223g.m414a(parameterTypes[0], String.class) && AbstractC0223g.m414a(method.getReturnType(), Void.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m2044j(ImageView imageView) {
        int width = imageView.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        Integer num = null;
        if (width <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            int i2 = layoutParams.width;
            Integer numValueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                num = numValueOf2;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 156;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2045d(Class cls) {
        Method method;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object c0104d;
        if (this.f3319d != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Bitmap.class.isAssignableFrom(((Field) obj2).getType())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((Field) it.next()).setAccessible(true);
        }
        this.f3320e = (Field) AbstractC0123k.m269k0(arrayList2, 0);
        Field field = (Field) AbstractC0123k.m269k0(arrayList2, 1);
        if (field == null) {
            field = (Field) AbstractC0123k.m269k0(arrayList2, 0);
        }
        this.f3321f = field;
        Iterator it2 = arrayList.iterator();
        while (true) {
            method = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (AbstractC0223g.m414a(((Field) next).getType(), String.class)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Field field2 = (Field) next;
        if (field2 != null) {
            field2.setAccessible(true);
        } else {
            field2 = null;
        }
        this.f3319d = field2;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (AbstractC0223g.m414a(((Field) next2).getType(), Boolean.TYPE)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        Field field3 = (Field) next2;
        if (field3 != null) {
            field3.setAccessible(true);
        } else {
            field3 = null;
        }
        this.f3322g = field3;
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (it4.hasNext()) {
                next3 = it4.next();
                if (SpinnerAdapter.class.isAssignableFrom(((Field) next3).getType())) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        Field field4 = (Field) next3;
        if (field4 != null) {
            field4.setAccessible(true);
        } else {
            field4 = null;
        }
        this.f3323h = field4;
        Iterator it5 = m2040b(cls).iterator();
        while (true) {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
            Method method2 = (Method) next4;
            if (AbstractC0223g.m414a(method2.getName(), "setAdapter") && method2.getParameterTypes().length == 1 && SpinnerAdapter.class.isAssignableFrom(method2.getParameterTypes()[0])) {
                break;
            }
        }
        Method method3 = (Method) next4;
        if (method3 != null) {
            method3.setAccessible(true);
            method = method3;
        }
        this.f3324i = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m2046e(Method method) {
        Object c0104d;
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        String str = "custom-local-avatar-" + name + "#" + name2 + "#" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(11), 30);
        if (MainHook.uniqueMetaStore.contains(str)) {
            return false;
        }
        try {
            AbstractC0514f.m1027d(method, new C0926o(this, 0));
            MainHook.uniqueMetaStore.add(str);
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("custom local avatar hook method fail", str, thM246a);
        }
        Boolean bool = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = bool;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2047f(Method method) {
        Object c0104d;
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        String str = "custom-local-avatar-hd-gallery-" + name + "#" + name2 + "#" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(12), 30);
        if (MainHook.uniqueMetaStore.contains(str)) {
            return false;
        }
        try {
            AbstractC0514f.m1027d(method, new C0926o(this, 1));
            MainHook.uniqueMetaStore.add(str);
            c0104d = Boolean.TRUE;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("custom local avatar hd gallery hook fail", thM246a);
        }
        Boolean bool = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = bool;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020e  */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2048g(Context context) {
        Object c0104d;
        List list;
        Object c0104d2;
        ?? M2047f;
        Object c0104d3;
        boolean z2;
        Object c0104d4;
        Object c0104d5;
        boolean z3 = true;
        if (this.f3318c) {
            return;
        }
        C1128k c1128kM2455e = AbstractC1129l.m2455e();
        List<C1127j> list2 = C0131s.f426a;
        Object obj = null;
        if (c1128kM2455e != null) {
            list = c1128kM2455e.f3799a;
        } else {
            C1128k c1128kM2455e2 = AbstractC1129l.m2455e();
            if (c1128kM2455e2 != null) {
                list = c1128kM2455e2.f3799a;
            } else {
                boolean z4 = AbstractC1126i.f3786a;
                SharedPreferences sharedPreferencesM2438n = C1124g.m2438n();
                AbstractC0223g.m418e(sharedPreferencesM2438n, "sp");
                try {
                    Method declaredMethod = sharedPreferencesM2438n.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(sharedPreferencesM2438n, null);
                } catch (Throwable unused) {
                }
                String str = "[]";
                String string = C1124g.m2438n().getString("custom_local_avatar_methods", "[]");
                if (string == null) {
                    string = "";
                }
                try {
                    if (!AbstractC0307q.m534d0(string)) {
                        str = string;
                    }
                    c0104d = AbstractC1129l.m2459i(new JSONArray(str));
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = list2;
                }
                list = (List) c0104d;
            }
        }
        List<C1127j> list3 = list;
        List list4 = c1128kM2455e != null ? c1128kM2455e.f3800b : null;
        if (list4 != null) {
            list2 = list4;
        }
        int i2 = 0;
        for (C1127j c1127j : list3) {
            try {
                c0104d5 = Class.forName(c1127j.f3796a, false, context.getClassLoader());
            } catch (Throwable th2) {
                c0104d5 = new C0104d(th2);
            }
            if (c0104d5 instanceof C0104d) {
                c0104d5 = null;
            }
            Class cls = (Class) c0104d5;
            if (cls != null) {
                ArrayList arrayListM2040b = m2040b(cls);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM2040b) {
                    Method method = (Method) obj2;
                    if (AbstractC0223g.m414a(method.getName(), c1127j.f3797b) && m2042h(method)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (m2046e((Method) it.next())) {
                        i2++;
                    }
                }
            }
        }
        Iterator it2 = AbstractC0120h.m252Z(new String[]{"com.tencent.mm.pluginsdk.ui.u", "com.tencent.mm.pluginsdk.ui.u$b", "com.tencent.mm.pluginsdk.ui.a$b", "com.tencent.mm.feature.avatar.w"}).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            try {
                c0104d4 = Class.forName((String) it2.next(), false, context.getClassLoader());
            } catch (Throwable th3) {
                c0104d4 = new C0104d(th3);
            }
            if (c0104d4 instanceof C0104d) {
                c0104d4 = null;
            }
            Class cls2 = (Class) c0104d4;
            if (cls2 != null) {
                ArrayList arrayListM2040b2 = m2040b(cls2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayListM2040b2) {
                    if (m2042h((Method) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it3 = AbstractC0123k.m277s0(arrayList2, 8).iterator();
                while (it3.hasNext()) {
                    if (m2046e((Method) it3.next())) {
                        i3++;
                    }
                }
            }
        }
        int i4 = i2 + i3;
        int i5 = 0;
        for (C1127j c1127j2 : list2) {
            try {
                c0104d3 = Class.forName(c1127j2.f3796a, false, context.getClassLoader());
            } catch (Throwable th4) {
                c0104d3 = new C0104d(th4);
            }
            if (c0104d3 instanceof C0104d) {
                c0104d3 = null;
            }
            Class cls3 = (Class) c0104d3;
            if (cls3 == null) {
                z2 = z3;
            } else {
                ArrayList arrayListM2040b3 = m2040b(cls3);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayListM2040b3) {
                    Method method2 = (Method) obj4;
                    boolean z5 = z3;
                    if (AbstractC0223g.m414a(method2.getName(), c1127j2.f3797b) && m2043i(method2)) {
                        arrayList3.add(obj4);
                    }
                    z3 = z5;
                }
                z2 = z3;
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (m2047f((Method) it4.next())) {
                        i5++;
                    }
                }
            }
            z3 = z2;
        }
        boolean z6 = z3;
        int i6 = i4 + i5;
        try {
            c0104d2 = Class.forName("com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView", false, context.getClassLoader());
        } catch (Throwable th5) {
            c0104d2 = new C0104d(th5);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        Class cls4 = (Class) c0104d2;
        if (cls4 == null) {
            M2047f = 0;
        } else {
            Iterator it5 = m2040b(cls4).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                Method method3 = (Method) next;
                if (AbstractC0223g.m414a(method3.getName(), "setUsername") && m2043i(method3)) {
                    obj = next;
                    break;
                }
            }
            Method method4 = (Method) obj;
            if (method4 != null) {
                M2047f = m2047f(method4);
            }
        }
        int i7 = i6 + M2047f;
        this.f3318c = i7 > 0 ? z6 : false;
        AbstractC0731a.m1387d("custom local avatar hook installed", AbstractC0174d.m351g(i7, "count="), AbstractC0174d.m351g(list3.size(), "load="), AbstractC0174d.m351g(list2.size(), "hd="), AbstractC0174d.m355k("versionCached=", c1128kM2455e != null ? z6 : false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName)) {
            if (!MainHook.uniqueMetaStore.contains("custom-local-avatar-activity-result")) {
                Class cls = Integer.TYPE;
                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(Activity.class, "onActivityResult", cls, cls, Intent.class);
                if (methodMo1011b != null) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0768f(this, context, 1));
                    MainHook.uniqueMetaStore.add("custom-local-avatar-activity-result");
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
            C0052y.m98c(context, new C0048u("custom-local-avatar", "本地头像", new C0804d(8), new C0804d(9), new C0804d(10), new C0026a(16)));
            if (AbstractC1129l.m2453c().isEmpty()) {
                return;
            }
            m2048g(context);
        }
    }
}
