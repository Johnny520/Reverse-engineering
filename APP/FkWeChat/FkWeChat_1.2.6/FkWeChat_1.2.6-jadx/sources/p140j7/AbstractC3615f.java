package p140j7;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.WatchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p010a9.InterfaceC0184l;
import p034c7.C1353a;
import p034c7.InterfaceC1359d;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2556j;
import p110h9.AbstractC2901c;
import p127i9.AbstractC3366d;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p211o8.AbstractC5661b;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: j7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3615f {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f10051a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final Class f10052b = InterfaceC1359d.class;

    /* JADX INFO: renamed from: c */
    public static final Class f10053c = C1353a.class;

    /* JADX INFO: renamed from: a */
    public static Comparable m13530a(InterfaceC2552f interfaceC2552f) {
        interfaceC2552f.getClass();
        return Integer.valueOf(interfaceC2552f.mo3778d().size());
    }

    /* JADX INFO: renamed from: b */
    public static Comparable m13531b(InterfaceC2552f interfaceC2552f) {
        interfaceC2552f.getClass();
        boolean z10 = false;
        if (!interfaceC2552f.mo3778d().isEmpty() && m13538i((InterfaceC2556j) interfaceC2552f.mo3778d().get(0))) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: c */
    public static Comparable m13532c(InterfaceC2552f interfaceC2552f) {
        interfaceC2552f.getClass();
        List listMo3778d = interfaceC2552f.mo3778d();
        int i10 = 0;
        if (listMo3778d == null || !listMo3778d.isEmpty()) {
            Iterator it = listMo3778d.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC2556j) it.next()).mo9078k() && (i10 = i10 + 1) < 0) {
                    AbstractC5114x.m20809x();
                }
            }
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2552f m13533d(List list) {
        list.getClass();
        return (InterfaceC2552f) AbstractC5081g0.m20589w0(AbstractC5081g0.m20542N0(list, AbstractC5661b.m22867b(new InterfaceC0184l() { // from class: j7.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3615f.m13531b((InterfaceC2552f) obj);
            }
        }, new InterfaceC0184l() { // from class: j7.d
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3615f.m13532c((InterfaceC2552f) obj);
            }
        }, new InterfaceC0184l() { // from class: j7.e
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3615f.m13530a((InterfaceC2552f) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: e */
    public static final Class m13534e() {
        return f10053c;
    }

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal m13535f() {
        return f10051a;
    }

    /* JADX INFO: renamed from: g */
    public static final WatchEvent.Modifier m13536g() {
        if (System.getenv("ANDROID_DATA") != null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.sun.nio.file.SensitivityWatchEventModifier");
            Object obj = cls.getField("HIGH").get(cls);
            if (obj instanceof WatchEvent.Modifier) {
                return (WatchEvent.Modifier) obj;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m13537h(InterfaceC2552f interfaceC2552f) {
        interfaceC2552f.getClass();
        if (interfaceC2552f.mo3820u() || interfaceC2552f.mo3818A() || interfaceC2552f.mo3819k() || interfaceC2552f.mo3781j()) {
            return false;
        }
        InterfaceC2556j interfaceC2556jM10548b = AbstractC2901c.m10548b(interfaceC2552f);
        if (interfaceC2556jM10548b != null && !m13538i(interfaceC2556jM10548b) && !m13539j(interfaceC2556jM10548b)) {
            return false;
        }
        Method methodM12583e = AbstractC3366d.m12583e(interfaceC2552f);
        if (methodM12583e == null) {
            return true;
        }
        if (methodM12583e.isSynthetic()) {
            return false;
        }
        return (Modifier.isStatic(methodM12583e.getModifiers()) && interfaceC2552f.mo3778d().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m13538i(InterfaceC2556j interfaceC2556j) {
        interfaceC2556j.getClass();
        return m13540k(interfaceC2556j, f10053c);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m13539j(InterfaceC2556j interfaceC2556j) {
        interfaceC2556j.getClass();
        return m13540k(interfaceC2556j, f10052b);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m13540k(InterfaceC2556j interfaceC2556j, Class cls) {
        interfaceC2556j.getClass();
        cls.getClass();
        Type typeM12585g = AbstractC3366d.m12585g(interfaceC2556j.getType());
        Class<?> cls2 = typeM12585g instanceof Class ? (Class) typeM12585g : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final Class m13541l(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2549c m13542m(Class cls) {
        cls.getClass();
        Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
        if (metadata == null || metadata.m16759k() != 1) {
            metadata = null;
        }
        if (metadata != null) {
            return AbstractC9886a.m38370e(cls);
        }
        return null;
    }
}
