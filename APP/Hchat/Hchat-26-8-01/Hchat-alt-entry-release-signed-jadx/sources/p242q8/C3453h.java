package p242q8;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import ba.C0226f;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p062e8.C0829c;
import p077f8.AbstractC1089i;
import p099h.Hchat.utils.KavaReflector;
import p127ib.C2034b;
import p258r8.C3744i;
import p360y4.C5995c;
import p366ya.AbstractC6019i;

/* JADX INFO: renamed from: q8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3453h {

    /* JADX INFO: renamed from: a */
    public final Context f11194a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f11195b;

    /* JADX INFO: renamed from: c */
    public final C0829c f11196c;

    /* JADX INFO: renamed from: d */
    public final C2034b f11197d;

    /* JADX INFO: renamed from: e */
    public final File f11198e;

    /* JADX INFO: renamed from: f */
    public final HashSet f11199f = new HashSet();

    /* JADX INFO: renamed from: g */
    public XC_MethodHook.Unhook f11200g;

    /* JADX INFO: renamed from: h */
    public volatile Class f11201h;

    /* JADX INFO: renamed from: i */
    public volatile Class f11202i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3453h(Context context, ClassLoader classLoader, C0829c c0829c, C2034b c2034b) {
        this.f11194a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f11195b = classLoader;
        this.f11196c = c0829c;
        this.f11197d = c2034b;
        File file = new File(context.getCacheDir(), "Hchat_proxy_classes");
        this.f11198e = file;
        file.mkdirs();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m7231a(C3453h c3453h, Object obj) {
        try {
            c3453h.m7248h(obj, m7241m(obj));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [PlusMenu] 显示时添加入口失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m7232b(View view, int i9) {
        Drawable drawable;
        if (i9 != -1212373072) {
            ImageView imageViewM7242n = m7242n(view);
            if (imageViewM7242n == null) {
                return;
            }
            imageViewM7242n.setVisibility(0);
            imageViewM7242n.setImageTintList(null);
            imageViewM7242n.setColorFilter((ColorFilter) null);
            imageViewM7242n.setAlpha(1.0f);
            imageViewM7242n.setImageDrawable(new C3446a(-1, 1));
            return;
        }
        ImageView imageViewM7242n2 = m7242n(view);
        if (imageViewM7242n2 == null || (drawable = view.getContext().getDrawable(R.drawable.ic_lock_power_off)) == null) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTint(-1);
        imageViewM7242n2.setVisibility(0);
        imageViewM7242n2.setAlpha(1.0f);
        imageViewM7242n2.setImageDrawable(drawableMutate);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageViewM7242n2.setImageTintMode(mode);
        imageViewM7242n2.setImageTintList(ColorStateList.valueOf(-1));
        imageViewM7242n2.setColorFilter(-1, mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Context m7233c(C3453h c3453h, Object obj) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (!KavaReflector.isStatic(field) && Context.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    if (field2 instanceof Context) {
                        return (Context) field2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m7234d(C3453h c3453h, Object obj) {
        Object field;
        C0829c c0829c = c3453h.f11196c;
        if (obj == null || c0829c.f2501w == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                if (!KavaReflector.isStatic(field2) && c0829c.f2501w.isAssignableFrom(field2.getType()) && (field = KavaReflector.readField(field2, obj)) != null) {
                    return field;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m7235e(C3453h c3453h, Map map, Class cls, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        if (map.containsKey(cls)) {
            return cls;
        }
        String name = cls.getName();
        for (Object obj : map.keySet()) {
            if (obj == cls) {
                return obj;
            }
            if ((obj instanceof Class) && name.equals(((Class) obj).getName())) {
                return obj;
            }
            if ((obj instanceof String) && name.equals(obj)) {
                return obj;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Iterable) {
                for (Object obj2 : (Iterable) value) {
                    if (obj2 instanceof Class) {
                        String name2 = ((Class) obj2).getName();
                        for (Class cls2 : clsArr) {
                            if (cls2 != null && (obj2 == cls2 || name2.equals(cls2.getName()))) {
                                return entry.getKey();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m7236f(C3453h c3453h, Object obj, int i9) {
        int iM7246v;
        SparseArray sparseArrayM7244p = m7244p(obj);
        if (sparseArrayM7244p == null) {
            return Integer.MIN_VALUE;
        }
        return (i9 < 0 || i9 >= sparseArrayM7244p.size() || (iM7246v = m7246v(sparseArrayM7244p.valueAt(i9))) == Integer.MIN_VALUE) ? m7246v(sparseArrayM7244p.get(i9)) : iM7246v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Class m7237g(C3453h c3453h, Object obj, int i9, Class cls) {
        if (obj == null) {
            return cls;
        }
        int i10 = 0;
        for (Field field : KavaReflector.declaredFields(obj.getClass())) {
            try {
                if (field.getType() == Class.class) {
                    Object field2 = KavaReflector.readField(field, obj);
                    if (i10 == i9 && (field2 instanceof Class)) {
                        return (Class) field2;
                    }
                    i10++;
                }
            } catch (Throwable unused) {
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m7238i(SparseArray sparseArray, Class cls, Object obj, int i9, String str) {
        Object objNewInstanceByArgs;
        Class<?> cls2 = obj.getClass();
        Object objNewInstanceByArgs2 = KavaReflector.newInstanceByArgs(cls2, new Object[]{Integer.valueOf(i9), str, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0});
        if (objNewInstanceByArgs2 == null) {
            objNewInstanceByArgs2 = KavaReflector.newInstanceByArgs(cls2, new Object[]{Integer.valueOf(i9), str, HttpUrl.FRAGMENT_ENCODE_SET, 0});
        }
        if (objNewInstanceByArgs2 == null || (objNewInstanceByArgs = KavaReflector.newInstanceByArgs(cls, new Object[]{objNewInstanceByArgs2})) == null) {
            return false;
        }
        int iMax = Math.max(0, sparseArray.size());
        while (sparseArray.get(iMax) != null) {
            iMax++;
        }
        sparseArray.put(iMax, objNewInstanceByArgs);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m7239j(SparseArray sparseArray, int i9, String str) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            if (m7245u(sparseArray.valueAt(i10), str, i9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Method m7240l(Class cls) {
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if ("getView".equals(method.getName()) && !KavaReflector.isStatic(method) && parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && View.class.isAssignableFrom(parameterTypes[1]) && ViewGroup.class.isAssignableFrom(parameterTypes[2]) && View.class.isAssignableFrom(method.getReturnType())) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static BaseAdapter m7241m(Object obj) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (!KavaReflector.isStatic(field) && BaseAdapter.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    if (field2 instanceof BaseAdapter) {
                        return (BaseAdapter) field2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static ImageView m7242n(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            ImageView imageViewM7242n = m7242n(viewGroup.getChildAt(i9));
            if (imageViewM7242n != null) {
                return imageViewM7242n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m7243o(Object obj) {
        Object field;
        if (obj == null) {
            return null;
        }
        for (Field field2 : KavaReflector.declaredFields(obj.getClass())) {
            if (!KavaReflector.isStatic(field2) && (field = KavaReflector.readField(field2, obj)) != null) {
                for (Field field3 : KavaReflector.declaredFields(field.getClass())) {
                    if (!KavaReflector.isStatic(field3) && field3.getType() == Integer.TYPE) {
                        return field;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static SparseArray m7244p(Object obj) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (!KavaReflector.isStatic(field) && SparseArray.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    if (field2 instanceof SparseArray) {
                        return (SparseArray) field2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m7245u(Object obj, String str, int i9) {
        Object objM7243o = m7243o(obj);
        if (objM7243o != null) {
            boolean z9 = i9 == -1212373075;
            boolean z10 = false;
            boolean z11 = false;
            for (Field field : KavaReflector.declaredFields(objM7243o.getClass())) {
                if (!KavaReflector.isStatic(field)) {
                    Object field2 = KavaReflector.readField(field, objM7243o);
                    if ((field2 instanceof Integer) && ((Integer) field2).intValue() == i9) {
                        z10 = true;
                    } else if (((field2 instanceof CharSequence) && str.contentEquals((CharSequence) field2)) || ((field2 instanceof String) && str.equals(field2))) {
                        z11 = true;
                    }
                }
            }
            if (!z10 && (!z9 || !z11)) {
                for (Field field3 : KavaReflector.declaredFields(obj.getClass())) {
                    if (!KavaReflector.isStatic(field3)) {
                        Object field4 = KavaReflector.readField(field3, obj);
                        if ((!(field4 instanceof Integer) || ((Integer) field4).intValue() != i9) && ((!z9 || !(field4 instanceof CharSequence) || !str.contentEquals((CharSequence) field4)) && (!z9 || !(field4 instanceof String) || !str.equals(field4)))) {
                            if (field4 != null && field4 != objM7243o) {
                                Class<?> cls = field4.getClass();
                                if (!cls.isPrimitive() && !cls.getName().startsWith("java.") && z9) {
                                    for (Field field5 : KavaReflector.declaredFields(field4.getClass())) {
                                        if (!KavaReflector.isStatic(field5)) {
                                            Object field6 = KavaReflector.readField(field5, field4);
                                            if ((!(field6 instanceof CharSequence) || !str.contentEquals((CharSequence) field6)) && (!(field6 instanceof String) || !str.equals(field6))) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static int m7246v(Object obj) {
        if (m7245u(obj, "Hchat", -1212373075)) {
            return -1212373075;
        }
        if (m7245u(obj, "全部已读", -1212373073)) {
            return -1212373073;
        }
        if (m7245u(obj, "快捷终止", -1212373072)) {
            return -1212373072;
        }
        return m7245u(obj, "插件 Agent", -1212373071) ? -1212373071 : Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m7247w(SparseArray sparseArray, int i9, String str) {
        boolean z9 = false;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (m7245u(sparseArray.valueAt(size), str, i9)) {
                sparseArray.removeAt(size);
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m7248h(Object obj, BaseAdapter baseAdapter) {
        Object objM7243o;
        SparseArray sparseArrayM7244p = m7244p(obj);
        if (sparseArrayM7244p == null) {
            return;
        }
        C2034b c2034b = this.f11197d;
        boolean zM7247w = (c2034b == null || !c2034b.f6870a.getBoolean("plus_menu_enable", false)) ? m7247w(sparseArrayM7244p, -1212373075, "Hchat") : false;
        Context context = this.f11194a;
        if (!AbstractC6019i.m10782c(context)) {
            zM7247w |= m7247w(sparseArrayM7244p, -1212373073, "全部已读");
        }
        if (!AbstractC1089i.m2749T(context)) {
            zM7247w |= m7247w(sparseArrayM7244p, -1212373072, "快捷终止");
        }
        if (c2034b == null || !c2034b.f6870a.getBoolean("plugin_agent_plus_menu_enable", false)) {
            zM7247w |= m7247w(sparseArrayM7244p, -1212373071, "插件 Agent");
        }
        if (!m7253t()) {
            if (!zM7247w || baseAdapter == null) {
                return;
            }
            baseAdapter.notifyDataSetChanged();
            return;
        }
        if (m7239j(sparseArrayM7244p, -1212373075, "Hchat") && m7239j(sparseArrayM7244p, -1212373073, "全部已读") && m7239j(sparseArrayM7244p, -1212373071, "插件 Agent") && m7239j(sparseArrayM7244p, -1212373072, "快捷终止")) {
            m7249k(baseAdapter);
            if (baseAdapter != null) {
                baseAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        Object objValueAt = sparseArrayM7244p.size() > 0 ? sparseArrayM7244p.valueAt(0) : null;
        if (objValueAt == null || (objM7243o = m7243o(objValueAt)) == null) {
            return;
        }
        m7249k(baseAdapter);
        if (c2034b != null && c2034b.f6870a.getBoolean("plus_menu_enable", false) && !m7239j(sparseArrayM7244p, -1212373075, "Hchat")) {
            zM7247w |= m7238i(sparseArrayM7244p, objValueAt.getClass(), objM7243o, -1212373075, "Hchat");
        }
        if (c2034b != null && c2034b.f6870a.getBoolean("plugin_agent_plus_menu_enable", false) && !m7239j(sparseArrayM7244p, -1212373071, "插件 Agent")) {
            zM7247w |= m7238i(sparseArrayM7244p, objValueAt.getClass(), objM7243o, -1212373071, "插件 Agent");
        }
        if (AbstractC6019i.m10782c(context) && !m7239j(sparseArrayM7244p, -1212373073, "全部已读")) {
            zM7247w |= m7238i(sparseArrayM7244p, objValueAt.getClass(), objM7243o, -1212373073, "全部已读");
        }
        if (AbstractC1089i.m2749T(context) && !m7239j(sparseArrayM7244p, -1212373072, "快捷终止")) {
            zM7247w |= m7238i(sparseArrayM7244p, objValueAt.getClass(), objM7243o, -1212373072, "快捷终止");
        }
        if (!zM7247w || baseAdapter == null) {
            return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7249k(BaseAdapter baseAdapter) {
        if (baseAdapter == null) {
            return;
        }
        Class<?> cls = baseAdapter.getClass();
        synchronized (this.f11199f) {
            try {
                if (this.f11199f.contains(cls)) {
                    return;
                }
                Method methodM7240l = m7240l(cls);
                if (methodM7240l == null) {
                    return;
                }
                C3744i.f12154b.m7763b(methodM7240l, new C3449d(this, 3));
                this.f11199f.add(cls);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m7250q(Class cls) {
        HashSet hashSet = new HashSet();
        HashSet<Method> hashSet2 = new HashSet();
        Class<?> cls2 = Boolean.TYPE;
        if (cls != null) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (!KavaReflector.isStatic(method) && method.getReturnType() == cls2 && method.getParameterCount() == 0) {
                    hashSet2.add(method);
                }
            }
        }
        for (Method method2 : hashSet2) {
            if (hashSet.add(method2)) {
                C3744i.f12154b.m7763b(method2, new C3449d(this, 4));
            }
        }
        HashSet<Method> hashSet3 = new HashSet();
        for (Class superclass = cls == null ? null : cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method3 : KavaReflector.declaredMethods(superclass)) {
                Class<?>[] parameterTypes = method3.getParameterTypes();
                if (!KavaReflector.isStatic(method3) && method3.getReturnType() == cls2 && (parameterTypes.length == 0 || (parameterTypes.length == 1 && parameterTypes[0] == Integer.TYPE))) {
                    hashSet3.add(method3);
                }
            }
        }
        for (Method method4 : hashSet3) {
            if (hashSet.add(method4)) {
                C3744i.f12154b.m7763b(method4, new C3449d(this, 5));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a3 A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:42:0x0091, B:46:0x009b, B:49:0x00a1, B:51:0x00a5, B:52:0x00ad, B:54:0x00b3, B:56:0x00c1, B:60:0x00ca, B:61:0x00de, B:63:0x00e4, B:65:0x00f1, B:67:0x00f7, B:69:0x00fd, B:91:0x015d, B:92:0x016a, B:94:0x0170, B:96:0x0180, B:97:0x0185, B:98:0x0192, B:100:0x0198, B:102:0x01a4, B:104:0x01ae, B:113:0x01cb, B:117:0x01ea, B:118:0x024e, B:120:0x0254, B:122:0x0264, B:123:0x0271, B:137:0x02b0, B:136:0x02a3, B:126:0x0279, B:127:0x0281, B:129:0x0287, B:131:0x0293, B:116:0x01d0, B:70:0x0102, B:71:0x010c, B:73:0x0112, B:75:0x0120, B:77:0x0126, B:87:0x0151, B:89:0x0157, B:85:0x014b, B:80:0x012e, B:82:0x013c, B:83:0x0141, B:84:0x014a), top: B:182:0x0091, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x010c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, q8.b] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7251r() {
        Method method;
        String str;
        final String str2;
        String name;
        String name2;
        String name3;
        String name4;
        Method method2;
        String name5;
        int iModifiers;
        Method next;
        C0829c c0829c = this.f11196c;
        Class cls = c0829c.f2504z;
        if (cls != null && c0829c.f2484f != null && c0829c.f2485g != null && c0829c.f2486h != null && c0829c.f2487i != null && c0829c.f2488j != null) {
            try {
                C3744i.f12154b.m7762a(XposedHelpers.findAndHookMethod(cls, "initView", new Object[]{new C3449d(this, 6)}));
                Iterator<Method> it = KavaReflector.declaredMethods(c0829c.f2504z).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if ("onPreferenceTreeClick".equals(next.getName())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    C3744i.f12154b.m7763b(next, new C3449d(this, 7));
                    next.toString();
                }
            } catch (Throwable th2) {
                AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [Legacy] Hook 失败: "), th2);
            }
        }
        C0829c c0829c2 = this.f11196c;
        final Class cls2 = c0829c2.f2492n;
        if (cls2 != null && c0829c2.f2490l != null && c0829c2.f2491m != null && c0829c2.f2489k != null) {
            try {
                final Class cls3 = c0829c2.f2495q;
                Class cls4 = c0829c2.f2494p;
                if (cls3 != null && cls4 != null) {
                    Class cls5 = c0829c2.f2493o;
                    Class<?> cls6 = Integer.TYPE;
                    if (cls5 == null || c0829c2.f2499u == null) {
                        str = null;
                        str2 = null;
                        name = null;
                        name2 = null;
                        name3 = null;
                        name4 = null;
                    } else {
                        Iterator<Method> it2 = KavaReflector.declaredMethods(cls5).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                name5 = null;
                                break;
                            }
                            Method next2 = it2.next();
                            if (next2.getReturnType() == Class.class) {
                                name5 = next2.getName();
                                break;
                            }
                        }
                        String name6 = this.f11196c.f2499u.getName();
                        Iterator<Method> it3 = KavaReflector.declaredMethods(this.f11196c.f2493o).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                name = null;
                                break;
                            }
                            Method next3 = it3.next();
                            if (next3.getParameterCount() == 3) {
                                name = next3.getName();
                                break;
                            }
                        }
                        C0829c c0829c3 = this.f11196c;
                        Method method3 = c0829c3.f2500v;
                        if (method3 == null) {
                            Iterator<Method> it4 = KavaReflector.declaredMethods(c0829c3.f2493o).iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    name2 = null;
                                    break;
                                }
                                Method next4 = it4.next();
                                if (next4.getReturnType() == String.class && next4.getParameterCount() == 0) {
                                    Class superclass = this.f11196c.f2490l;
                                    if (superclass != null) {
                                        while (superclass != null) {
                                            try {
                                                Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(superclass, next4.getName(), next4.getParameterTypes());
                                                if (methodFindDeclaredMethod == null) {
                                                    throw new NoSuchMethodException(next4.getName());
                                                }
                                                iModifiers = KavaReflector.modifiers(methodFindDeclaredMethod);
                                                break;
                                            } catch (Throwable unused) {
                                                superclass = superclass.getSuperclass();
                                            }
                                        }
                                        iModifiers = 0;
                                        if (!KavaReflector.isAbstract(iModifiers)) {
                                            name2 = next4.getName();
                                            break;
                                        }
                                    } else {
                                        iModifiers = 0;
                                        if (!KavaReflector.isAbstract(iModifiers)) {
                                        }
                                    }
                                }
                            }
                        } else {
                            name2 = method3.getName();
                        }
                        name3 = null;
                        for (Method method4 : KavaReflector.declaredMethods(this.f11196c.f2493o)) {
                            if (method4.getReturnType() == this.f11196c.f2491m) {
                                name3 = method4.getName();
                            }
                        }
                        name4 = null;
                        for (Method method5 : KavaReflector.declaredMethods(this.f11196c.f2493o)) {
                            if (method5.getReturnType() == cls6 && !method5.getName().equals(name6)) {
                                name4 = method5.getName();
                            }
                        }
                        str2 = name5;
                        str = name6;
                    }
                    if (str2 != null && name != null && name2 != null && name3 != null && name4 != null) {
                        if (this.f11200g == null) {
                            XC_MethodHook.Unhook unhookFindAndHookMethod = XposedHelpers.findAndHookMethod(Context.class, "getString", new Object[]{cls6, new C0226f(22)});
                            this.f11200g = unhookFindAndHookMethod;
                            C3744i.f12154b.m7762a(unhookFindAndHookMethod);
                        }
                        Class<?> clsLoadClass = KavaReflector.loadClass("androidx.appcompat.app.AppCompatActivity", this.f11195b);
                        final String str3 = str;
                        final String str4 = name;
                        final String str5 = name2;
                        final String str6 = name3;
                        final String str7 = name4;
                        ?? r02 = new InvocationHandler() { // from class: q8.b
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method6, Object[] objArr) {
                                C3453h c3453h = this.f11168g;
                                String str8 = str2;
                                Class cls7 = cls2;
                                String str9 = str3;
                                String str10 = str4;
                                String str11 = str5;
                                String str12 = str6;
                                Class cls8 = cls3;
                                String str13 = str7;
                                String name7 = method6.getName();
                                Object[] objArr2 = objArr == null ? new Object[0] : objArr;
                                if (str8.equals(name7)) {
                                    return cls7;
                                }
                                if (str9 != null && str9.equals(name7)) {
                                    return 1;
                                }
                                if (str10.equals(name7) && objArr != null && objArr.length > 0) {
                                    Context context = (Context) objArr[0];
                                    context.getClass();
                                    AbstractC0018a.m231S(context, null, false);
                                    return null;
                                }
                                if (str11.equals(name7)) {
                                    return "SettingGroup_Main_Other_Hchat";
                                }
                                if (str12.equals(name7)) {
                                    if (c3453h.f11201h != null) {
                                        cls7 = c3453h.f11201h;
                                    }
                                    if (c3453h.f11202i != null) {
                                        cls8 = c3453h.f11202i;
                                    }
                                    return KavaReflector.newInstance(KavaReflector.findConstructor(c3453h.f11196c.f2491m, Class.class, Class.class), cls7, cls8);
                                }
                                if (str13.equals(name7)) {
                                    return -1212373076;
                                }
                                if (!KavaReflector.isAbstract(method6)) {
                                    return C5995c.m10731b(obj, method6, objArr2);
                                }
                                Class<?> returnType = method6.getReturnType();
                                if (returnType == Boolean.TYPE || returnType == Boolean.class) {
                                    return Boolean.FALSE;
                                }
                                if (returnType == Byte.TYPE || returnType == Byte.class) {
                                    return (byte) 0;
                                }
                                if (returnType == Short.TYPE || returnType == Short.class) {
                                    return (short) 0;
                                }
                                if (returnType == Integer.TYPE || returnType == Integer.class) {
                                    return 0;
                                }
                                if (returnType == Long.TYPE || returnType == Long.class) {
                                    return 0L;
                                }
                                if (returnType == Float.TYPE || returnType == Float.class) {
                                    return Float.valueOf(0.0f);
                                }
                                if (returnType == Double.TYPE || returnType == Double.class) {
                                    return Double.valueOf(0.0d);
                                }
                                if (returnType == Character.TYPE || returnType == Character.class) {
                                    return (char) 0;
                                }
                                return C5995c.m10731b(obj, method6, objArr2);
                            }
                        };
                        C5995c c5995c = new C5995c(this.f11196c.f2490l);
                        File file = new File(this.f11198e, "v" + Integer.toString(1));
                        c5995c.f24356c = file;
                        file.mkdir();
                        c5995c.f24355b = this.f11195b;
                        Class clsM10736a = c5995c.m10736a();
                        Constructor<?> constructorFindConstructor = KavaReflector.findConstructor(clsM10736a, clsLoadClass);
                        C3744i.f12154b.m7763b(constructorFindConstructor, new C0219e(r02, 23));
                        this.f11201h = cls2;
                        this.f11202i = cls3;
                        Iterator<Method> it5 = KavaReflector.declaredMethods(cls4).iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            Method next5 = it5.next();
                            if (next5.getReturnType() == this.f11196c.f2491m) {
                                C3744i.f12154b.m7763b(next5, new C3450e(this, cls2, cls3, clsM10736a));
                                next5.getName();
                                break;
                            }
                        }
                        Class cls7 = this.f11196c.f2489k;
                        if (cls7 == null) {
                            method2 = null;
                            if (method2 == null) {
                                C3744i.f12154b.m7763b(method2, new C3451f(this, constructorFindConstructor, r02, cls2, cls3, cls4, clsM10736a));
                            }
                            m7252s(this.f11196c.f2496r, clsM10736a, true);
                            m7252s(this.f11196c.f2498t, clsM10736a, false);
                        } else {
                            for (Method method6 : KavaReflector.declaredMethods(cls7)) {
                                if (method6.getParameterCount() == 0 && Map.class.isAssignableFrom(method6.getReturnType())) {
                                    method2 = method6;
                                    break;
                                }
                            }
                            method2 = null;
                            if (method2 == null) {
                            }
                            m7252s(this.f11196c.f2496r, clsM10736a, true);
                            m7252s(this.f11196c.f2498t, clsM10736a, false);
                        }
                    }
                }
            } catch (Throwable th3) {
                AbstractC0255e.m1030s(th3, new StringBuilder("[Hchat:SettingsInjector] [Modern] 安装失败: "), th3);
            }
        }
        try {
            Class<?> clsLoadClass2 = KavaReflector.loadClass("com.tencent.mm.ui.LauncherUI", this.f11195b);
            if (clsLoadClass2 != null) {
                C3744i c3744i = C3744i.f12154b;
                c3744i.m7762a(XposedHelpers.findAndHookMethod(clsLoadClass2, "onCreate", new Object[]{Bundle.class, new C0226f(this, 23)}));
                c3744i.m7762a(XposedHelpers.findAndHookMethod(clsLoadClass2, "onNewIntent", new Object[]{Intent.class, new C0226f(this, 24)}));
            }
        } catch (Throwable th4) {
            AbstractC0255e.m1030s(th4, new StringBuilder("[Hchat:SettingsInjector] [LauncherUI] Hook 失败: "), th4);
        }
        if (m7253t()) {
            C0829c c0829c4 = this.f11196c;
            if (c0829c4.f2501w != null && (method = c0829c4.f2502x) != null && c0829c4.f2503y != null) {
                try {
                    C3744i c3744i2 = C3744i.f12154b;
                    c3744i2.m7763b(method, new C3449d(this, 1));
                    c3744i2.m7763b(c0829c4.f2503y, new C3449d(this, 2));
                    m7250q(c0829c4.f2501w);
                    c0829c4.f2501w.getClass();
                } catch (Throwable th5) {
                    AbstractC0255e.m1030s(th5, new StringBuilder("[Hchat:SettingsInjector] [PlusMenu] Hook 失败: "), th5);
                }
            }
        }
        C2034b c2034b = this.f11197d;
        if (c2034b == null || !c2034b.f6870a.getBoolean("plus_long_press_enable", false)) {
            return;
        }
        try {
            Class<?> clsLoadClass3 = KavaReflector.loadClass("com.tencent.mm.ui.HomeUI$PlusActionView", this.f11195b);
            if (clsLoadClass3 == null) {
                return;
            }
            Iterator it6 = XposedBridge.hookAllConstructors(clsLoadClass3, new C3449d(this, 0)).iterator();
            while (it6.hasNext()) {
                C3744i.f12154b.m7762a((XC_MethodHook.Unhook) it6.next());
            }
        } catch (Throwable th6) {
            try {
                th6.getMessage();
            } catch (Throwable th7) {
                AbstractC0255e.m1030s(th7, new StringBuilder("[Hchat:SettingsInjector] [PlusLongPress] Hook 失败: "), th7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m7252s(Class cls, Class cls2, boolean z9) {
        Method next;
        if (cls == null) {
            return;
        }
        Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ("superImportUIComponents".equals(next.getName()) && next.getParameterCount() == 1 && HashSet.class.isAssignableFrom(next.getParameterTypes()[0])) {
                break;
            }
        }
        if (next == null) {
            return;
        }
        C3744i.f12154b.m7763b(next, new C3452g(this, z9, cls2, cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m7253t() {
        C2034b c2034b = this.f11197d;
        if (c2034b != null && c2034b.f6870a.getBoolean("plus_menu_enable", false)) {
            return true;
        }
        if (c2034b != null && c2034b.f6870a.getBoolean("plugin_agent_plus_menu_enable", false)) {
            return true;
        }
        Context context = this.f11194a;
        return AbstractC6019i.m10782c(context) || AbstractC1089i.m2749T(context);
    }
}
