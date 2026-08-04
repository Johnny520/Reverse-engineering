package yyds;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.ModuleMain;
import com.p000ss.android.ugc.awemes.wrapper.ModuleMainWrapper;
import io.github.libxposed.api.XposedInterface;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: yyds.ᲈᛷᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2701 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static ClassLoader f13258;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String f13259;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C1355 f13260;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2701 f13261;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static ModuleMain f13262;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static String f13263;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final ConcurrentHashMap f13264;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C2014 f13265;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static ApplicationInfo f13266;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static C0474 f13267;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static ApplicationInfo f13268;

    static {
        AbstractC2328.m4341(-747083364205422L);
        f13261 = new C2701();
        Executors.newSingleThreadExecutor();
        new AtomicLong(0L);
        String strM4341 = AbstractC2328.m4341(-747268047799150L);
        Locale locale = Locale.US;
        new SimpleDateFormat(strM4341, locale);
        new SimpleDateFormat(AbstractC2328.m4341(-747315292439406L), locale);
        f13265 = new C2014(23, (byte) 0);
        f13264 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static ModuleMainWrapper m4785() {
        ModuleMain moduleMain = f13262;
        if (moduleMain != null) {
            return moduleMain;
        }
        AbstractC2328.m4341(-739846344311662L);
        return null;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Field m4786(Object obj, String str) {
        AbstractC2328.m4341(-745717564605294L);
        AbstractC2328.m4341(-745734744474478L);
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            int i = 0;
            while (i < declaredFields.length) {
                int i2 = i + 1;
                try {
                    Field field = declaredFields[i];
                    Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                    int i3 = 0;
                    while (i3 < declaredAnnotations.length) {
                        int i4 = i3 + 1;
                        try {
                            Annotation annotation = declaredAnnotations[i3];
                            if (AbstractC0578.m1456(annotation).mo3993().getName().equals(AbstractC2328.m4341(-745799168983918L))) {
                                try {
                                    if (AbstractC1544.m3188(m4791(annotation), str)) {
                                        field.setAccessible(true);
                                        return field;
                                    }
                                    continue;
                                } catch (Exception e) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-745983852577646L), e);
                                }
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new NoSuchElementException(e3.getMessage());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static ClassLoader m4787() {
        ClassLoader classLoader = f13258;
        if (classLoader != null) {
            return classLoader;
        }
        AbstractC2328.m4341(-740499179340654L);
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static Method m4788(C0757 c0757, ClassLoader classLoader) {
        C0474 c0474 = null;
        if (c0757 == null) {
            return null;
        }
        if (classLoader == null) {
            f13261.getClass();
            C0474 c04742 = f13267;
            if (c04742 != null) {
                c0474 = c04742;
            } else {
                AbstractC2328.m4341(-740288725943150L);
            }
            classLoader = c0474.getDefaultClassLoader();
        }
        return C0757.m1702(c0757, classLoader);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Object m4789(Object obj, String str) {
        AbstractC2328.m4341(-745382557156206L);
        AbstractC2328.m4341(-745399737025390L);
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            int i = 0;
            while (i < declaredFields.length) {
                int i2 = i + 1;
                try {
                    Field field = declaredFields[i];
                    Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                    int i3 = 0;
                    while (i3 < declaredAnnotations.length) {
                        int i4 = i3 + 1;
                        try {
                            Annotation annotation = declaredAnnotations[i3];
                            if (AbstractC0578.m1456(annotation).mo3993().getName().equals(AbstractC2328.m4341(-745464161534830L))) {
                                try {
                                    if (AbstractC1544.m3188(m4791(annotation), str)) {
                                        field.setAccessible(true);
                                        return field.get(obj);
                                    }
                                    continue;
                                } catch (Exception e) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-745648845128558L), e);
                                }
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new NoSuchElementException(e3.getMessage());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String m4790(List list) {
        Object next;
        AbstractC2328.m4341(-743552901088110L);
        List listM4854 = AbstractC2725.m4854(AbstractC2328.m4341(-743582965859182L), AbstractC2328.m4341(-743608735662958L), AbstractC2328.m4341(-743630210499438L));
        Iterator it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            if (!listM4854.isEmpty()) {
                Iterator it2 = listM4854.iterator();
                while (it2.hasNext()) {
                    if (AbstractC0473.m1301(str, (String) it2.next(), true)) {
                        break loop0;
                    }
                }
            }
        }
        String str2 = (String) next;
        return str2 == null ? (String) AbstractC1595.m3280(list) : str2;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static String m4791(Annotation annotation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clsMo3993 = AbstractC0578.m1456(annotation).mo3993();
        ConcurrentHashMap concurrentHashMap = f13264;
        Method method = (Method) concurrentHashMap.get(clsMo3993);
        if (method == null) {
            method = clsMo3993.getMethod(AbstractC2328.m4341(-745356787352430L), null);
            concurrentHashMap.put(clsMo3993, method);
        }
        Object objInvoke = method.invoke(annotation, null);
        if (objInvoke instanceof String) {
            return (String) objInvoke;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4792(C1829 c1829) {
        Object c2658;
        XposedInterface.Invoker invoker;
        AbstractC2328.m4341(-740984510645102L);
        XposedInterface.Chain chain = c1829.f9188;
        try {
            Executable executable = chain.getExecutable();
            AbstractC2328.m4341(-741014575416174L);
            boolean z = executable instanceof Method;
            C2701 c2701 = f13261;
            if (z) {
                c2701.getClass();
                invoker = m4785().getInvoker((Method) executable);
            } else if (!(executable instanceof Constructor)) {
                C2336.f11496.m4354(AbstractC2328.m4341(-741096179794798L).concat(executable.getClass().getName()));
                return;
            } else {
                c2701.getClass();
                invoker = m4785().getInvoker((Constructor) executable);
            }
            XposedInterface.Invoker type = invoker.setType(XposedInterface.Invoker.Type.ORIGIN);
            Object thisObject = chain.getThisObject();
            Object[] array = c1829.f9186.toArray(new Object[0]);
            c2658 = type.invoke(thisObject, Arrays.copyOf(array, array.length));
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-741225028813678L) + thM4249.getMessage(), thM4249);
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static void m4793(View view) {
        m4807(view != null ? view.getContext() : null);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static Object m4794(Object obj, String str) {
        AbstractC2328.m4341(-741474136916846L);
        if (obj != null) {
            try {
                int i = AbstractC2293.f11258;
                C2014 c2014M1327 = AbstractC0476.m1327(obj);
                ((C0903) c2014M1327.f10074).f4118 = 2;
                C0802 c0802M3893 = c2014M1327.m3893();
                c0802M3893.m4478();
                c0802M3893.f12003 = str;
                C1558 c1558 = (C1558) AbstractC1595.m3281(c0802M3893.mo736());
                Object objM3209 = c1558 != null ? c1558.m3209() : null;
                if (objM3209 != null) {
                    return objM3209;
                }
            } catch (Exception e) {
                m4802(obj + AbstractC2328.m4341(-741499906720622L) + str + AbstractC2328.m4341(-741572921164654L) + e.getMessage());
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static Object m4795(Object obj, String str) {
        AbstractC2328.m4341(-745227938333550L);
        if (obj == null) {
            return null;
        }
        return m4789(obj, str);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Context m4796(Context context, boolean z) {
        AbstractC2328.m4341(-744278750561134L);
        m4807(context);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        int i = configuration.uiMode;
        configuration.uiMode = z ? (i & (-49)) | 32 : (i & (-49)) | 16;
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        m4807(contextCreateConfigurationContext);
        return contextCreateConfigurationContext;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static void m4797(Object obj, String str, Object obj2) {
        AbstractC2328.m4341(-741340992930670L);
        if (obj != null) {
            try {
                int i = AbstractC2293.f11258;
                C2014 c2014M1327 = AbstractC0476.m1327(obj);
                ((C0903) c2014M1327.f10074).f4118 = 2;
                C0802 c0802M3893 = c2014M1327.m3893();
                c0802M3893.m4478();
                c0802M3893.f12003 = str;
                C1558 c1558 = (C1558) AbstractC1595.m3281(c0802M3893.mo736());
                if (c1558 != null) {
                    c1558.m3482();
                    c1558.f7953.set(c1558.f3014, obj2);
                }
            } catch (Exception e) {
                m4802(obj + AbstractC2328.m4341(-741366762734446L) + str + AbstractC2328.m4341(-741439777178478L) + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static String m4798(String str) throws NoSuchAlgorithmException {
        AbstractC2328.m4341(-739734675161966L);
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC2328.m4341(-739764739933038L));
        byte[] bytes = str.getBytes(AbstractC0347.f1806);
        AbstractC2328.m4341(-739781919802222L);
        return AbstractC2070.m3943(messageDigest.digest(bytes), AbstractC2328.m4341(-739842049344366L), new C2200(16));
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static String m4799(Object obj, String str) {
        AbstractC2328.m4341(-741607280903022L);
        Object objM4794 = m4794(obj, str);
        if (objM4794 instanceof String) {
            return (String) objM4794;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Object m4800(Object obj, String str) {
        Object objM4794;
        if (AbstractC0473.m1313(str) || (objM4794 = m4794(obj, str)) == null) {
            return null;
        }
        return objM4794;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static void m4801(String str, Throwable th) {
        AbstractC2328.m4341(-742882886189934L);
        if (th == null) {
            m4785().log(4, AbstractC2328.m4341(-742917245928302L), str);
        } else {
            m4785().log(4, AbstractC2328.m4341(-742943015732078L), str, th);
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static void m4802(String str) {
        AbstractC2328.m4341(-742848526451566L);
        m4801(str, null);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static String m4803(String str) {
        AbstractC2328.m4341(-743982397817710L);
        String absolutePath = m4805(str).getAbsolutePath();
        AbstractC2328.m4341(-744012462588782L);
        return absolutePath;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static ApplicationInfo m4804() {
        ApplicationInfo applicationInfo = f13268;
        if (applicationInfo != null) {
            return applicationInfo;
        }
        AbstractC2328.m4341(-740056797709166L);
        return null;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static File m4805(String str) {
        AbstractC2328.m4341(-743875023635310L);
        C1509.f7142.getClass();
        String strM4341 = (String) C1509.f7250.m1579(C1509.f7179[104]);
        if (AbstractC0473.m1313(strM4341)) {
            strM4341 = AbstractC2328.m4341(-743905088406382L);
        }
        return new File(AbstractC0473.m1299(strM4341, '/') + '/' + AbstractC0473.m1304(str, '/'));
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static Object m4806(Object obj, String str) {
        Object objM4789;
        AbstractC2328.m4341(-745292362842990L);
        if (obj == null || (objM4789 = m4789(obj, str)) == null) {
            return null;
        }
        return objM4789;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m4807(Context context) {
        if (context == null) {
            m4802(AbstractC2328.m4341(-741688885281646L));
            return false;
        }
        ApplicationInfo applicationInfo = f13266;
        if (applicationInfo == null) {
            AbstractC2328.m4341(-739927948690286L);
            applicationInfo = null;
        }
        String str = applicationInfo.sourceDir;
        try {
            Resources resources = context.getResources();
            AbstractC2328.m4341(-741886453777262L);
            AssetManager assets = resources.getAssets();
            AbstractC2328.m4341(-741963763188590L);
            try {
                return f13265.m3890(assets, new C2661(assets, str, resources, 6));
            } catch (Exception e) {
                m4801(AbstractC2328.m4341(-742328835408750L) + context.getClass().getName() + AbstractC2328.m4341(-742496339133294L) + Integer.toHexString(System.identityHashCode(resources)) + AbstractC2328.m4341(-742552173708142L) + Integer.toHexString(System.identityHashCode(assets)) + AbstractC2328.m4341(-742595123381102L) + str + AbstractC2328.m4341(-742655252923246L) + Integer.toHexString(R.layout.dialog_setting_layout), e);
                return false;
            }
        } catch (Exception e2) {
            m4801(AbstractC2328.m4341(-742028187698030L) + context.getClass().getName() + AbstractC2328.m4341(-742268705866606L) + str, e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static String m4808() {
        String str = f13259;
        if (str != null) {
            return str;
        }
        AbstractC2328.m4341(-740602258555758L);
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static String m4809(Context context) {
        AbstractC2328.m4341(-745094794347374L);
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r1 = r1.getSuperclass();
     */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m4810(Object obj, String str) throws IllegalAccessException {
        if (obj == null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-745129154085742L));
            return null;
        }
        if (str != null && !AbstractC0473.m1313(str)) {
            Class<?> superclass = obj.getClass();
            while (superclass != null) {
                Field[] declaredFields = superclass.getDeclaredFields();
                int i = 0;
                while (true) {
                    if (i < declaredFields.length) {
                        int i2 = i + 1;
                        try {
                            Field field = declaredFields[i];
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null && obj2.getClass().getName().equals(str)) {
                                return obj2;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static void m4811(C1829 c1829) {
        AbstractC2328.m4341(-740924381102958L);
        c1829.m3587(null);
    }
}
