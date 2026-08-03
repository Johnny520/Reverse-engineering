package p050c0;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0143i;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.N0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610N0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f1874a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1875b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1876c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f1877d = ThreadLocal.withInitial(new C0681o0(1));

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1878e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static volatile Method f1879f;

    /* JADX INFO: renamed from: g */
    public static volatile Method f1880g;

    /* JADX INFO: renamed from: h */
    public static volatile Object f1881h;

    /* JADX INFO: renamed from: i */
    public static volatile ClassLoader f1882i;

    /* JADX INFO: renamed from: a */
    public static void m1496a(TextView textView, int i2) {
        C0143i c0143i;
        ThreadLocal threadLocal;
        TextView textView2;
        CharSequence charSequenceSubstring;
        ThreadLocal threadLocal2 = f1877d;
        if (AbstractC0307g.m699a(threadLocal2.get(), Boolean.TRUE)) {
            return;
        }
        if (i2 == 1) {
            C0661h1 c0661h1 = C0661h1.f2048a;
            c0143i = new C0143i(C0661h1.m1662d("member_title_owner", "群主"), "#FFC107", "#FFFFFF");
        } else if (i2 != 2) {
            C0661h1 c0661h12 = C0661h1.f2048a;
            c0143i = new C0143i(C0661h1.m1662d("member_title_member", "成员"), "#9E9E9E", "#FFFFFF");
        } else {
            C0661h1 c0661h13 = C0661h1.f2048a;
            c0143i = new C0143i(C0661h1.m1662d("member_title_admin", "管理员"), "#2196F3", "#FFFFFF");
        }
        String str = (String) c0143i.f334a;
        String str2 = (String) c0143i.f335b;
        String str3 = (String) c0143i.f336c;
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0 || text.length() > 120) {
            return;
        }
        boolean z2 = text instanceof Spanned;
        if (z2) {
            C0607M0[] c0607m0Arr = (C0607M0[]) ((Spanned) text).getSpans(0, text.length(), C0607M0.class);
            AbstractC0307g.m700b(c0607m0Arr);
            if (!(c0607m0Arr.length == 0)) {
                return;
            }
        }
        String string = text.toString();
        if ((AbstractC0433r.m1033H0(string, str + " ", false) || AbstractC0433r.m1033H0(string, str, false)) && z2) {
            threadLocal = threadLocal2;
            Object[] spans = ((Spanned) text).getSpans(0, Math.min(str.length() + 1, text.length()), ReplacementSpan.class);
            AbstractC0307g.m702d(spans, "getSpans(...)");
            if (!(spans.length == 0)) {
                return;
            }
        } else {
            threadLocal = threadLocal2;
        }
        C0661h1 c0661h14 = C0661h1.f2048a;
        Iterator it = AbstractC0182m.m556h0(C0661h1.m1662d("member_title_owner", "群主"), C0661h1.m1662d("member_title_admin", "管理员"), C0661h1.m1662d("member_title_member", "成员")).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strM722e = AbstractC0324d.m722e((String) it.next(), " ");
            if (AbstractC0433r.m1033H0(text.toString(), strM722e, false)) {
                if (z2) {
                    charSequenceSubstring = new SpannableStringBuilder(text, strM722e.length(), text.length());
                } else {
                    charSequenceSubstring = text.toString().substring(strM722e.length());
                    AbstractC0307g.m702d(charSequenceSubstring, "substring(...)");
                }
                text = charSequenceSubstring;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(text);
        spannableStringBuilder.setSpan(new C0607M0(m1503h(str2), m1503h(str3)), 0, str.length(), 33);
        ThreadLocal threadLocal3 = threadLocal;
        threadLocal3.set(Boolean.TRUE);
        try {
            if (textView.getVisibility() != 0) {
                textView2 = textView;
                textView2.setVisibility(0);
            } else {
                textView2 = textView;
            }
            textView2.setTag(2114584578, Integer.valueOf(i2));
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            threadLocal3.set(Boolean.FALSE);
        } catch (Throwable th) {
            threadLocal3.set(Boolean.FALSE);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Method m1497b(ClassLoader classLoader, String str) throws NoSuchMethodException, ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
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
                        sb.append(m1505j(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1505j(returnType));
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

    /* JADX INFO: renamed from: c */
    public static Integer m1498c(Object obj) throws IllegalAccessException {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (AbstractC0307g.m699a(field.getType(), Integer.TYPE) || AbstractC0307g.m699a(field.getType(), Integer.class)) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 instanceof Integer) {
                            return (Integer) obj2;
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1499d(Class cls) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (AbstractC0307g.m699a(field.getName(), "field_roomowner")) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1500e() {
        Object objM116u;
        try {
            C0661h1 c0661h1 = C0661h1.f2048a;
            objM116u = Boolean.valueOf(C0661h1.m1661c("member_title", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m1501f(Context context, String str) {
        String str2;
        AtomicBoolean atomicBoolean = f1875b;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            atomicBoolean.set(true);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
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
                ZipFile zipFile = new ZipFile(str);
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
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
            AbstractC0040p.m116u(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01be A[PHI: r4
  0x01be: PHI (r4v19 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v4 java.lang.Integer) binds: [B:123:0x01bc, B:190:0x02b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[LOOP:1: B:239:0x0390->B:325:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00d6 A[EDGE_INSN: B:334:0x00d6->B:60:0x00d6 BREAK  A[LOOP:4: B:32:0x006f->B:337:0x006f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155 A[PHI: r0
  0x0155: PHI (r0v120 java.lang.Class<?>) = (r0v117 java.lang.Class<?>), (r0v121 java.lang.Class<?>) binds: [B:92:0x0152, B:83:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1502g(Object obj, View view, Object obj2) {
        Iterator it;
        Method method;
        Object objM116u;
        boolean zBooleanValue;
        ClassLoader classLoader;
        Object objM116u2;
        Integer num;
        Integer num2;
        Object objInvoke;
        Object obj3;
        int i2;
        Object objM116u3;
        Integer numM1498c;
        int i3;
        int iIntValue;
        Integer numValueOf;
        Object objM116u4;
        Throwable thM465a;
        Object objInvoke2;
        Object objM116u5;
        ClassLoader classLoader2;
        Object objM116u6;
        Object objM116u7;
        Class<?> superclass;
        int i4 = 1;
        if (!m1500e()) {
            return;
        }
        C0621R0 c0621r0 = C0621R0.f1913a;
        C0613O0 c0613o0M1524f = C0621R0.m1524f(obj2);
        if (c0613o0M1524f == null || !c0613o0M1524f.f1893c) {
            return;
        }
        Integer num3 = null;
        Integer numValueOf2 = null;
        try {
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
            it = AbstractC0182m.m556h0("getIsSend", "isSend").iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            if (zBooleanValue) {
            }
        }
        for (superclass = obj2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField("field_isSend");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(obj2);
                if (obj4 instanceof Number) {
                    if (((Number) obj4).intValue() == 1) {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        return;
                    }
                    TextView textViewM1525d = C0621R0.f1913a.m1525d(view, obj);
                    if (textViewM1525d == null) {
                        if (f1876c.compareAndSet(false, true)) {
                            m1506k("nickname missing holder=".concat(obj.getClass().getName()));
                            return;
                        }
                        return;
                    }
                    String str = c0613o0M1524f.f1891a;
                    String str2 = c0613o0M1524f.f1892b;
                    String str3 = str + "|" + str2;
                    Integer num4 = (Integer) f1878e.get(str3);
                    if (num4 != null) {
                        iIntValue = num4.intValue();
                    } else {
                        if (f1881h == null && (classLoader2 = f1882i) != null) {
                            Method method2 = f1880g;
                            if (method2 == null || (declaringClass = method2.getDeclaringClass()) == null) {
                                try {
                                    objM116u6 = classLoader2.loadClass("com.tencent.mm.storage.u2");
                                } catch (Throwable th2) {
                                    objM116u6 = AbstractC0040p.m116u(th2);
                                }
                                boolean z2 = objM116u6 instanceof C0140f;
                                Object obj5 = objM116u6;
                                if (z2) {
                                    obj5 = null;
                                }
                                Class<?> declaringClass = (Class) obj5;
                                if (declaringClass != null) {
                                    m1504i(classLoader2, declaringClass);
                                }
                            }
                            if (i2 == i3) {
                                try {
                                    C0661h1 c0661h1 = C0661h1.f2048a;
                                    objM116u7 = Boolean.valueOf(C0661h1.m1661c("member_title_show_member", true));
                                } catch (Throwable th3) {
                                    objM116u7 = AbstractC0040p.m116u(th3);
                                }
                                Boolean bool = Boolean.TRUE;
                                boolean z3 = objM116u7 instanceof C0140f;
                                Object obj6 = objM116u7;
                                if (z3) {
                                    obj6 = bool;
                                }
                                if (!((Boolean) obj6).booleanValue()) {
                                    return;
                                }
                            }
                            textViewM1525d.setTag(2114584578, Integer.valueOf(i2));
                            textViewM1525d.setTag(2114584579, c0613o0M1524f.f1892b);
                            m1496a(textViewM1525d, i2);
                            textViewM1525d.post(new RunnableC0714z0(textViewM1525d, i2, 1));
                            if (f1876c.compareAndSet(false, true)) {
                                return;
                            }
                            String str4 = c0613o0M1524f.f1891a;
                            String str5 = c0613o0M1524f.f1892b;
                            CharSequence text = textViewM1525d.getText();
                            m1506k("bound room=" + str4 + " sender=" + str5 + " role=" + i2 + " nick=" + ((Object) text) + " vis=" + textViewM1525d.getVisibility());
                            return;
                        }
                        Method method3 = f1880g;
                        Object obj7 = f1881h;
                        Object objM116u8 = C0146l.f339a;
                        if (method3 == null || obj7 == null) {
                            classLoader = f1882i;
                            if (classLoader != null) {
                                Method method4 = f1879f;
                                Class<?> declaringClass2 = method4 != null ? method4.getDeclaringClass() : null;
                                Iterator it2 = AbstractC0182m.m556h0("com.tencent.mm.storage.u2", "com.tencent.mm.storage.t2", "com.tencent.mm.model.z", "com.tencent.mm.model.s").iterator();
                                loop2: while (it2.hasNext()) {
                                    try {
                                        objM116u2 = classLoader.loadClass((String) it2.next());
                                    } catch (Throwable th4) {
                                        objM116u2 = AbstractC0040p.m116u(th4);
                                    }
                                    if (objM116u2 instanceof C0140f) {
                                        objM116u2 = null;
                                    }
                                    Class cls = (Class) objM116u2;
                                    if (cls != null) {
                                        C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
                                        while (c0172cM714c.hasNext()) {
                                            Method method5 = (Method) c0172cM714c.next();
                                            if (method5.getParameterTypes().length == i4) {
                                                if (AbstractC0307g.m699a(method5.getParameterTypes()[0], String.class)) {
                                                    Iterator it3 = it2;
                                                    if (!AbstractC0307g.m699a(method5.getReturnType(), Void.TYPE) && !AbstractC0307g.m699a(method5.getReturnType(), String.class)) {
                                                        if (declaringClass2 == null || declaringClass2.isAssignableFrom(method5.getReturnType()) || AbstractC0307g.m699a(method5.getReturnType(), declaringClass2)) {
                                                            try {
                                                                method5.setAccessible(true);
                                                                if (Modifier.isStatic(method5.getModifiers())) {
                                                                    num = null;
                                                                    num2 = null;
                                                                    try {
                                                                        objInvoke = method5.invoke(null, str);
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        objInvoke = AbstractC0040p.m116u(th);
                                                                        num2 = num;
                                                                    }
                                                                } else {
                                                                    num2 = null;
                                                                    num2 = null;
                                                                    objInvoke = (obj7 == null || !cls.isInstance(obj7)) ? null : method5.invoke(obj7, str);
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                num = null;
                                                            }
                                                            boolean z4 = objInvoke instanceof C0140f;
                                                            Object obj8 = objInvoke;
                                                            if (z4) {
                                                                obj8 = num2;
                                                            }
                                                            if (obj8 != null && m1499d(obj8.getClass())) {
                                                                obj3 = obj8;
                                                                numValueOf2 = num2;
                                                                break loop2;
                                                            }
                                                        } else {
                                                            Class<?> returnType = method5.getReturnType();
                                                            AbstractC0307g.m702d(returnType, "getReturnType(...)");
                                                            if (m1499d(returnType)) {
                                                            }
                                                        }
                                                    }
                                                    it2 = it3;
                                                }
                                                i4 = 1;
                                            }
                                        }
                                    }
                                }
                                num3 = null;
                                obj3 = num3;
                                numValueOf2 = num3;
                                i2 = 2;
                                if (obj3 != null) {
                                    try {
                                        Object objM920y = AbstractC0358S.m920y(obj3, "field_roomowner");
                                        objM116u3 = objM920y instanceof String ? (String) objM920y : numValueOf2;
                                    } catch (Throwable th7) {
                                        objM116u3 = AbstractC0040p.m116u(th7);
                                    }
                                    boolean z5 = objM116u3 instanceof C0140f;
                                    Object obj9 = objM116u3;
                                    if (z5) {
                                        obj9 = numValueOf2;
                                    }
                                    String str6 = (String) obj9;
                                    String string = numValueOf2;
                                    if (str6 != null) {
                                        string = AbstractC0425j.m1022a1(str6).toString();
                                    }
                                    if (string == 0 || string.length() == 0 || !string.equals(str2)) {
                                        Method method6 = f1879f;
                                        if (method6 != null) {
                                            try {
                                                Object objInvoke3 = method6.invoke(obj3, str2);
                                                if (objInvoke3 != null && (numM1498c = m1498c(objInvoke3)) != null && (numM1498c.intValue() & 2048) != 0) {
                                                    f1878e.put(str3, 2);
                                                    i3 = 3;
                                                }
                                            } catch (Throwable th8) {
                                                objM116u8 = AbstractC0040p.m116u(th8);
                                            }
                                            Throwable thM465a2 = AbstractC0141g.m465a(objM116u8);
                                            if (thM465a2 != null) {
                                                m1506k("getChatroomData invoke: " + thM465a2.getMessage());
                                            }
                                        }
                                        f1878e.put(str3, 3);
                                        i3 = 3;
                                        i2 = 3;
                                    } else {
                                        f1878e.put(str3, 1);
                                        i3 = 3;
                                        i2 = 1;
                                    }
                                } else {
                                    CopyOnWriteArrayList copyOnWriteArrayList = AbstractC0642b0.f1999a;
                                    AbstractC0307g.m703e(str, "room");
                                    AbstractC0307g.m703e(str2, "sender");
                                    if (AbstractC0680o.m1744g(str) && !AbstractC0425j.m1013R0(str2)) {
                                        C0199c c0199c = new C0199c(10);
                                        Object obj10 = AbstractC0642b0.f2000b.get();
                                        if (obj10 != null) {
                                            c0199c.add(obj10);
                                        }
                                        c0199c.addAll(AbstractC0642b0.f1999a);
                                        Iterator it4 = AbstractC0181l.m543o0(AbstractC0040p.m103f(c0199c)).iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next = it4.next();
                                            AbstractC0307g.m700b(next);
                                            Object objM1623j = AbstractC0642b0.m1623j(next, "SELECT roomowner, roomdata FROM chatroom WHERE chatroomname=? LIMIT 1", new String[]{str});
                                            if (objM1623j == null) {
                                                numValueOf = numValueOf2;
                                                if (numValueOf != null) {
                                                    numValueOf2 = Integer.valueOf(numValueOf.intValue());
                                                    break;
                                                }
                                            } else {
                                                try {
                                                    if (AbstractC0642b0.m1617d(objM1623j)) {
                                                        String strM1618e = AbstractC0642b0.m1618e(objM1623j, "roomowner");
                                                        if (strM1618e == null) {
                                                            strM1618e = AbstractC0642b0.m1619f(0, objM1623j);
                                                        }
                                                        if (AbstractC0307g.m699a(strM1618e != null ? AbstractC0425j.m1022a1(strM1618e).toString() : numValueOf2, str2)) {
                                                            numValueOf = 1;
                                                        } else {
                                                            byte[] bArrM1614a = AbstractC0642b0.m1614a(objM1623j);
                                                            if (bArrM1614a == null) {
                                                                bArrM1614a = AbstractC0642b0.m1615b(1, objM1623j);
                                                            }
                                                            Integer numM1621h = bArrM1614a != null ? AbstractC0642b0.m1621h(bArrM1614a, str2) : numValueOf2;
                                                            numValueOf = Integer.valueOf((numM1621h == null || (numM1621h.intValue() & 2048) == 0) ? 3 : 2);
                                                        }
                                                        AbstractC0642b0.m1616c(objM1623j);
                                                        if (numValueOf != null) {
                                                        }
                                                    } else {
                                                        AbstractC0642b0.m1616c(objM1623j);
                                                        numValueOf = numValueOf2;
                                                        if (numValueOf != null) {
                                                        }
                                                    }
                                                } finally {
                                                    AbstractC0642b0.m1616c(objM1623j);
                                                }
                                            }
                                        }
                                    }
                                    if (numValueOf2 != null) {
                                        iIntValue = numValueOf2.intValue();
                                        f1878e.put(str3, Integer.valueOf(iIntValue));
                                    } else {
                                        i3 = 3;
                                        f1878e.put(str3, 3);
                                        i2 = 3;
                                    }
                                }
                            } else {
                                obj3 = num3;
                                numValueOf2 = num3;
                                i2 = 2;
                                if (obj3 != null) {
                                }
                            }
                        } else {
                            try {
                                method3.setAccessible(true);
                                objInvoke2 = method3.invoke(obj7, str);
                            } catch (Throwable th9) {
                                objM116u4 = AbstractC0040p.m116u(th9);
                                thM465a = AbstractC0141g.m465a(objM116u4);
                                if (thM465a != null) {
                                }
                                classLoader = f1882i;
                                if (classLoader != null) {
                                }
                                if (i2 == i3) {
                                }
                                textViewM1525d.setTag(2114584578, Integer.valueOf(i2));
                                textViewM1525d.setTag(2114584579, c0613o0M1524f.f1892b);
                                m1496a(textViewM1525d, i2);
                                textViewM1525d.post(new RunnableC0714z0(textViewM1525d, i2, 1));
                                if (f1876c.compareAndSet(false, true)) {
                                }
                            }
                            if (objInvoke2 == null || !m1499d(objInvoke2.getClass())) {
                                objM116u4 = objM116u8;
                                thM465a = AbstractC0141g.m465a(objM116u4);
                                if (thM465a != null) {
                                    m1506k("getGroup invoke: " + thM465a.getMessage());
                                }
                                classLoader = f1882i;
                                if (classLoader != null) {
                                }
                            } else {
                                try {
                                    Object objM920y2 = AbstractC0358S.m920y(objInvoke2, "field_roomowner");
                                    objM116u5 = objM920y2 instanceof String ? (String) objM920y2 : null;
                                } catch (Throwable th10) {
                                    objM116u5 = AbstractC0040p.m116u(th10);
                                }
                                boolean z6 = objM116u5 instanceof C0140f;
                                Object obj11 = objM116u5;
                                if (z6) {
                                    obj11 = null;
                                }
                                obj3 = objInvoke2;
                            }
                            i2 = 2;
                            if (obj3 != null) {
                            }
                        }
                        if (i2 == i3) {
                        }
                        textViewM1525d.setTag(2114584578, Integer.valueOf(i2));
                        textViewM1525d.setTag(2114584579, c0613o0M1524f.f1892b);
                        m1496a(textViewM1525d, i2);
                        textViewM1525d.post(new RunnableC0714z0(textViewM1525d, i2, 1));
                        if (f1876c.compareAndSet(false, true)) {
                        }
                    }
                    i2 = iIntValue;
                    i3 = 3;
                    if (i2 == i3) {
                    }
                    textViewM1525d.setTag(2114584578, Integer.valueOf(i2));
                    textViewM1525d.setTag(2114584579, c0613o0M1524f.f1892b);
                    m1496a(textViewM1525d, i2);
                    textViewM1525d.post(new RunnableC0714z0(textViewM1525d, i2, 1));
                    if (f1876c.compareAndSet(false, true)) {
                    }
                } else {
                    if (obj4 instanceof Boolean) {
                        zBooleanValue = ((Boolean) obj4).booleanValue();
                    }
                    if (zBooleanValue) {
                    }
                }
                zBooleanValue = false;
                if (zBooleanValue) {
                }
            } catch (Throwable th11) {
                AbstractC0040p.m116u(th11);
            }
        }
        it = AbstractC0182m.m556h0("getIsSend", "isSend").iterator();
        while (true) {
            if (it.hasNext()) {
                break;
            }
            String str7 = (String) it.next();
            Method[] methods = obj2.getClass().getMethods();
            AbstractC0307g.m702d(methods, "getMethods(...)");
            int length = methods.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    method = null;
                    break;
                }
                method = methods[i5];
                if (AbstractC0307g.m699a(method.getName(), str7)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i5++;
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    objM116u = method.invoke(obj2, null);
                } catch (Throwable th12) {
                    objM116u = AbstractC0040p.m116u(th12);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                if (!(objM116u instanceof Number)) {
                    if (objM116u instanceof Boolean) {
                        zBooleanValue = ((Boolean) objM116u).booleanValue();
                        break;
                    }
                } else if (((Number) objM116u).intValue() == 1) {
                }
            }
        }
        if (zBooleanValue) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m1503h(String str) {
        Object objM116u;
        try {
            objM116u = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = -7829368;
        }
        return ((Number) objM116u).intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m1504i(ClassLoader classLoader, Class cls) {
        Object objM116u;
        Object objM116u2;
        Object obj;
        Object objM116u3;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Object objM116u4 = C0146l.f339a;
        char c = 0;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("rk0.k1");
            Class<?> clsLoadClass2 = classLoader.loadClass("gt1.f");
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method3 = null;
                    break;
                }
                method3 = declaredMethods[i2];
                if (Modifier.isStatic(method3.getModifiers()) && method3.getParameterTypes().length == 1 && AbstractC0307g.m699a(method3.getParameterTypes()[c], Class.class)) {
                    break;
                }
                i2++;
                c = 0;
            }
            if (method3 != null) {
                method3.setAccessible(true);
                Object objInvoke = method3.invoke(null, clsLoadClass2);
                if (objInvoke != null) {
                    Method[] methods = objInvoke.getClass().getMethods();
                    AbstractC0307g.m702d(methods, "getMethods(...)");
                    int length2 = methods.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            method4 = null;
                            break;
                        }
                        method4 = methods[i3];
                        Class<?>[] parameterTypes = method4.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && !Modifier.isStatic(method4.getModifiers()) && cls.isAssignableFrom(method4.getReturnType())) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (method4 == null) {
                        Method[] methods2 = objInvoke.getClass().getMethods();
                        AbstractC0307g.m702d(methods2, "getMethods(...)");
                        int length3 = methods2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                method4 = null;
                                break;
                            }
                            method4 = methods2[i4];
                            if (AbstractC0307g.m699a(method4.getName(), "a")) {
                                Class<?>[] parameterTypes2 = method4.getParameterTypes();
                                AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                                if (parameterTypes2.length == 0) {
                                    break;
                                }
                            }
                            i4++;
                        }
                    }
                    if (method4 != null) {
                        method4.setAccessible(true);
                        Object objInvoke2 = method4.invoke(objInvoke, null);
                        if (objInvoke2 != null && cls.isInstance(objInvoke2)) {
                            f1881h = objInvoke2;
                            m1506k("chatroomStorage via rk0.k1.s(gt1.f)." + method4.getName() + "()");
                            return;
                        }
                    }
                    for (Class<?> superclass = objInvoke.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                        while (c0172cM714c.hasNext()) {
                            Field field = (Field) c0172cM714c.next();
                            if (cls.isAssignableFrom(field.getType())) {
                                field.setAccessible(true);
                                Object obj2 = field.get(objInvoke);
                                if (obj2 != null) {
                                    f1881h = obj2;
                                    m1506k("chatroomStorage field " + superclass.getName() + "#" + field.getName());
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            objM116u = objM116u4;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1506k("rk0.k1.s path: " + thM465a.getMessage());
        }
        try {
            Method[] declaredMethods2 = classLoader.loadClass("iy0.c9").getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods2, "getDeclaredMethods(...)");
            int length4 = declaredMethods2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i5];
                if (Modifier.isStatic(method.getModifiers()) && AbstractC0307g.m699a(method.getName(), "b")) {
                    Class<?>[] parameterTypes3 = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes3, "getParameterTypes(...)");
                    if (parameterTypes3.length == 0) {
                        break;
                    }
                }
                i5++;
            }
            if (method != null) {
                method.setAccessible(true);
                Object objInvoke3 = method.invoke(null, null);
                if (objInvoke3 != null) {
                    Method[] methods3 = objInvoke3.getClass().getMethods();
                    AbstractC0307g.m702d(methods3, "getMethods(...)");
                    int length5 = methods3.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length5) {
                            method2 = null;
                            break;
                        }
                        method2 = methods3[i6];
                        if (AbstractC0307g.m699a(method2.getName(), "m")) {
                            Class<?>[] parameterTypes4 = method2.getParameterTypes();
                            AbstractC0307g.m702d(parameterTypes4, "getParameterTypes(...)");
                            if (parameterTypes4.length == 0 && cls.isAssignableFrom(method2.getReturnType())) {
                                break;
                            }
                        }
                        i6++;
                    }
                    if (method2 != null) {
                        method2.setAccessible(true);
                        Object objInvoke4 = method2.invoke(objInvoke3, null);
                        if (objInvoke4 != null) {
                            f1881h = objInvoke4;
                            m1506k("chatroomStorage via iy0.c9.b().m()");
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            objM116u4 = AbstractC0040p.m116u(th2);
        }
        Throwable thM465a2 = AbstractC0141g.m465a(objM116u4);
        if (thM465a2 != null) {
            m1506k("iy0.c9 path: " + thM465a2.getMessage());
        }
        for (String str : AbstractC0182m.m556h0("com.tencent.mm.model.z", "com.tencent.mm.model.s", "rk0.k1")) {
            try {
                objM116u2 = classLoader.loadClass(str);
            } catch (Throwable th3) {
                objM116u2 = AbstractC0040p.m116u(th3);
            }
            Object obj3 = objM116u2;
            if (obj3 instanceof C0140f) {
                obj3 = null;
            }
            Class cls2 = (Class) obj3;
            if (cls2 != null) {
                C0172c c0172cM714c2 = AbstractC0317q.m714c(cls2.getDeclaredMethods());
                while (c0172cM714c2.hasNext()) {
                    Method method5 = (Method) c0172cM714c2.next();
                    if (Modifier.isStatic(method5.getModifiers())) {
                        Class<?>[] parameterTypes5 = method5.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes5, "getParameterTypes(...)");
                        if (!(!(parameterTypes5.length == 0)) && cls.isAssignableFrom(method5.getReturnType())) {
                            try {
                                method5.setAccessible(true);
                                obj = null;
                                try {
                                    objM116u3 = method5.invoke(null, null);
                                } catch (Throwable th4) {
                                    th = th4;
                                    objM116u3 = AbstractC0040p.m116u(th);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = null;
                            }
                            if (objM116u3 instanceof C0140f) {
                                objM116u3 = obj;
                            }
                            if (objM116u3 != null) {
                                f1881h = objM116u3;
                                m1506k("chatroomStorage via " + str + "#" + method5.getName());
                                return;
                            }
                        }
                    }
                }
            }
        }
        m1506k("chatroomStorage unresolved — will use DB / class static");
    }

    /* JADX INFO: renamed from: j */
    public static String m1505j(Class cls) {
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m725h("[", m1505j(componentType));
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

    /* JADX INFO: renamed from: k */
    public static void m1506k(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-MemberTitle] " + str);
        } catch (Throwable unused) {
        }
    }
}
