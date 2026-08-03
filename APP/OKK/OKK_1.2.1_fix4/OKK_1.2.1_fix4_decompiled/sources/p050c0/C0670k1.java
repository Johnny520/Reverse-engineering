package p050c0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670k1 {

    /* JADX INFO: renamed from: a */
    public static final C0670k1 f2084a = new C0670k1();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2085b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2086c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2087d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2088e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f2089f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public static volatile WeakReference f2090g;

    /* JADX INFO: renamed from: h */
    public static volatile Method f2091h;

    /* JADX INFO: renamed from: a */
    public static final Object m1679a(View view) {
        if (view == null) {
            return m1681c();
        }
        int i2 = 0;
        for (Object parent = view; (parent instanceof View) && i2 < 20; parent = ((View) parent).getParent()) {
            if (m1683e(parent)) {
                return parent;
            }
            i2++;
        }
        return m1681c();
    }

    /* JADX INFO: renamed from: b */
    public static final int m1680b(Method method) {
        int i2 = method.getDeclaringClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") ? 50 : 0;
        int length = method.getName().length();
        int i3 = length != 1 ? length != 2 ? i2 + 10 : i2 + 5 : i2 - 30;
        String name = method.getName();
        if (name == null) {
            return i3;
        }
        int iHashCode = name.hashCode();
        if (iHashCode != 3055) {
            if (iHashCode == 3459) {
                return !name.equals("n1") ? i3 : i3 + 80;
            }
            if (iHashCode != 3675 || !name.equals("u0")) {
                return i3;
            }
        } else if (!name.equals("a0")) {
            return i3;
        }
        return i3 - 40;
    }

    /* JADX INFO: renamed from: c */
    public static Object m1681c() {
        WeakReference weakReference = f2090g;
        Object obj = weakReference != null ? weakReference.get() : null;
        if ((obj instanceof View) && ((View) obj).isAttachedToWindow() && m1683e(obj)) {
            return obj;
        }
        if (obj == null || !m1683e(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Method m1682d(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
        if (iM1011P0 <= 1 || iM1010O0 <= iM1011P0) {
            throw new IllegalArgumentException(str.toString());
        }
        String strSubstring = str.substring(1, iM1011P0 - 1);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        String strM1032G0 = AbstractC0433r.m1032G0(strSubstring, '/', '.');
        String strSubstring2 = str.substring(iM1011P0 + 2, iM1010O0);
        AbstractC0307g.m702d(strSubstring2, "substring(...)");
        String strSubstring3 = str.substring(iM1010O0);
        AbstractC0307g.m702d(strSubstring3, "substring(...)");
        for (Class<?> clsLoadClass = classLoader.loadClass(strM1032G0); clsLoadClass != null; clsLoadClass = clsLoadClass.getSuperclass()) {
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0307g.m699a(method.getName(), strSubstring2)) {
                    StringBuilder sb = new StringBuilder("(");
                    C0172c c0172cM714c = AbstractC0317q.m714c(method.getParameterTypes());
                    while (c0172cM714c.hasNext()) {
                        Class cls = (Class) c0172cM714c.next();
                        AbstractC0307g.m700b(cls);
                        sb.append(m1690l(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1690l(returnType));
                    String string = sb.toString();
                    AbstractC0307g.m702d(string, "toString(...)");
                    if (string.equals(strSubstring3)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new NoSuchMethodException(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1683e(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1684f(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        if (!AbstractC0307g.m699a(method.getReturnType(), Void.TYPE) && !AbstractC0307g.m699a(method.getReturnType(), Void.class)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 2) {
            return false;
        }
        Class<?> cls = parameterTypes[0];
        AbstractC0307g.m702d(cls, "get(...)");
        Class cls2 = Boolean.TYPE;
        if (cls.equals(cls2) || cls.equals(Boolean.class)) {
            Class<?> cls3 = parameterTypes[1];
            AbstractC0307g.m702d(cls3, "get(...)");
            if (cls3.equals(cls2) || cls3.equals(Boolean.class)) {
                String name = method.getDeclaringClass().getName();
                if (!name.equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && !AbstractC0433r.m1033H0(name, "com.tencent.mm.pluginsdk.ui.chat.", false)) {
                    return false;
                }
                String name2 = method.getName();
                AbstractC0307g.m700b(name2);
                return !AbstractC0433r.m1033H0(name2, "set", false) || name2.length() <= 6;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1685g() {
        Object objM116u;
        try {
            C0661h1 c0661h1 = C0661h1.f2048a;
            objM116u = Boolean.valueOf(C0661h1.m1661c("quote_delete_clear", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1686h(View view, Object obj) {
        Object objM116u;
        boolean z2 = view instanceof TextView;
        if (z2) {
            CharSequence text = ((TextView) view).getText();
            String string = text != null ? text.toString() : null;
            if (string != null && string.length() != 0) {
                return false;
            }
        }
        if (obj == null) {
            obj = m1681c();
        }
        if (obj != null) {
            try {
                Object objM887g = AbstractC0358S.m887g(obj, "getLastText", new Object[0]);
                objM116u = objM887g instanceof CharSequence ? (CharSequence) objM887g : null;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            CharSequence charSequence = (CharSequence) objM116u;
            String string2 = charSequence != null ? charSequence.toString() : null;
            if (string2 != null && string2.length() != 0) {
                return false;
            }
        }
        if (!z2) {
            return obj != null;
        }
        CharSequence text2 = ((TextView) view).getText();
        return text2 == null || text2.length() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1687i(Context context, String str) {
        Object objM116u;
        String str2;
        Throwable thM465a;
        ZipFile zipFile;
        Object objM116u2 = C0146l.f339a;
        AtomicBoolean atomicBoolean = f2088e;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            objM116u = objM116u2;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (!(objM116u instanceof C0140f)) {
            atomicBoolean.set(true);
            return;
        }
        if (str == null) {
            return;
        }
        if (Process.is64Bit()) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            AbstractC0307g.m702d(strArr, "SUPPORTED_64_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr);
            if (str2 == null) {
                str2 = "arm64-v8a";
            }
        } else {
            String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
            AbstractC0307g.m702d(strArr2, "SUPPORTED_32_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr2);
            if (str2 == null) {
                str2 = "armeabi-v7a";
            }
        }
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_", str2, "_libdexkit.so"));
        try {
            zipFile = new ZipFile(str);
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        try {
            ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
            if (entry == null) {
                AbstractC0040p.m108m(zipFile, null);
                return;
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC0307g.m700b(inputStream);
                    AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                    AbstractC0040p.m108m(fileOutputStream, null);
                    AbstractC0040p.m108m(inputStream, null);
                    AbstractC0040p.m108m(zipFile, null);
                    System.load(file.getAbsolutePath());
                    atomicBoolean.set(true);
                    thM465a = AbstractC0141g.m465a(objM116u2);
                    if (thM465a == null) {
                        m1691m("load dexkit native fail: " + thM465a.getMessage());
                        return;
                    }
                    return;
                } finally {
                }
            } finally {
            }
            thM465a = AbstractC0141g.m465a(objM116u2);
            if (thM465a == null) {
            }
        } finally {
        }
        objM116u2 = AbstractC0040p.m116u(th2);
    }

    /* JADX INFO: renamed from: j */
    public static void m1688j(Class cls) {
        Object obj;
        if (f2091h != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                Method method = (Method) c0172cM714c.next();
                AbstractC0307g.m700b(method);
                if (m1684f(method)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                Method method2 = (Method) next;
                Method method3 = (Method) next2;
                int iM112q = AbstractC0040p.m112q(Integer.valueOf(m1680b(method2)), Integer.valueOf(m1680b(method3)));
                if (iM112q == 0) {
                    iM112q = AbstractC0040p.m112q(Integer.valueOf(method3.getName().length()), Integer.valueOf(method2.getName().length()));
                }
                if (iM112q == 0) {
                    iM112q = AbstractC0040p.m112q(method2.getName(), method3.getName());
                }
                if (iM112q < 0) {
                    next = next2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        Method method4 = (Method) obj;
        if (method4 != null) {
            method4.setAccessible(true);
            f2091h = method4;
            m1691m("resolved clearQuote by score: " + method4.getName() + " from=" + AbstractC0181l.m546r0(arrayList, null, null, null, new C0570A(21), 31));
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1689k(Object obj, String str) throws Throwable {
        Object objM116u;
        if (obj == null && (obj = m1681c()) == null) {
            return false;
        }
        Method method = f2091h;
        if (method == null) {
            m1688j(obj.getClass());
            method = f2091h;
        }
        if (method == null) {
            m1691m("clear quote: no method (" + str + ")");
            return false;
        }
        try {
            method.setAccessible(true);
            boolean[][] zArr = {new boolean[]{false, true}, new boolean[]{true, true}, new boolean[]{false, false}};
            Throwable th = null;
            for (int i2 = 0; i2 < 3; i2++) {
                boolean[] zArr2 = zArr[i2];
                try {
                    method.invoke(obj, Boolean.valueOf(zArr2[0]), Boolean.valueOf(zArr2[1]));
                    objM116u = Boolean.TRUE;
                } catch (Throwable th2) {
                    objM116u = AbstractC0040p.m116u(th2);
                }
                Throwable thM465a = AbstractC0141g.m465a(objM116u);
                if (thM465a != null) {
                    objM116u = Boolean.FALSE;
                    th = thM465a;
                }
                if (((Boolean) objM116u).booleanValue()) {
                    if (obj instanceof View) {
                        View view = (View) obj;
                        for (int i3 = 0; view != null && i3 < 5; i3++) {
                            view.requestLayout();
                            view.invalidate();
                            Object parent = view.getParent();
                            view = parent instanceof View ? (View) parent : null;
                        }
                    }
                    m1691m("clear quote ok via " + str + " method=" + method.getName() + " args=" + zArr2[0] + "," + zArr2[1]);
                    return true;
                }
            }
            if (th == null) {
                throw new IllegalStateException("clear quote invoke failed");
            }
            throw th;
        } catch (Throwable th3) {
            Object objM116u2 = AbstractC0040p.m116u(th3);
            Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
            if (thM465a2 != null) {
                m1691m("clear quote fail: " + thM465a2.getMessage());
                objM116u2 = Boolean.FALSE;
            }
            return ((Boolean) objM116u2).booleanValue();
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m1690l(Class cls) {
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m725h("[", m1690l(componentType));
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        cls.equals(Void.TYPE);
        return "V";
    }

    /* JADX INFO: renamed from: m */
    public static void m1691m(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-QuoteDelClear] " + str);
        } catch (Throwable unused) {
        }
    }
}
