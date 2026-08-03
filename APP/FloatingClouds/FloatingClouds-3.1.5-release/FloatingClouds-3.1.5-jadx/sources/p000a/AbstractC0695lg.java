package p000a;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.lg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0695lg {

    /* JADX INFO: renamed from: a */
    public final C0166J1<String, Method> f2598a;

    /* JADX INFO: renamed from: b */
    public final C0166J1<String, Method> f2599b;

    /* JADX INFO: renamed from: c */
    public final C0166J1<String, Class> f2600c;

    public AbstractC0695lg(C0166J1<String, Method> c0166j1, C0166J1<String, Method> c0166j12, C0166J1<String, Class> c0166j13) {
        this.f2598a = c0166j1;
        this.f2599b = c0166j12;
        this.f2600c = c0166j13;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0714mg mo1564a();

    /* JADX INFO: renamed from: b */
    public final Class m1565b(Class<? extends InterfaceC0733ng> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0166J1<String, Class> c0166j1 = this.f2600c;
        Class orDefault = c0166j1.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0166j1.put(cls.getName(), cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1566c(String str) throws NoSuchMethodException {
        C0166J1<String, Method> c0166j1 = this.f2598a;
        Method orDefault = c0166j1.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0695lg.class.getClassLoader()).getDeclaredMethod("read", AbstractC0695lg.class);
        c0166j1.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1567d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0166J1<String, Method> c0166j1 = this.f2599b;
        Method orDefault = c0166j1.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsM1565b = m1565b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1565b.getDeclaredMethod("write", cls, AbstractC0695lg.class);
        c0166j1.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1568e();

    /* JADX INFO: renamed from: f */
    public abstract byte[] mo1569f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo1570g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo1571h(int i);

    /* JADX INFO: renamed from: i */
    public abstract int mo1572i();

    /* JADX INFO: renamed from: j */
    public abstract <T extends Parcelable> T mo1573j();

    /* JADX INFO: renamed from: k */
    public abstract String mo1574k();

    /* JADX INFO: renamed from: l */
    public final <T extends InterfaceC0733ng> T m1575l() {
        String strMo1574k = mo1574k();
        if (strMo1574k == null) {
            return null;
        }
        try {
            return (T) m1566c(strMo1574k).invoke(null, mo1564a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1576m(int i);

    /* JADX INFO: renamed from: n */
    public abstract void mo1577n(boolean z);

    /* JADX INFO: renamed from: o */
    public abstract void mo1578o(byte[] bArr);

    /* JADX INFO: renamed from: p */
    public abstract void mo1579p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    public abstract void mo1580q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo1581r(Parcelable parcelable);

    /* JADX INFO: renamed from: s */
    public abstract void mo1582s(String str);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.lg */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m1583t(InterfaceC0733ng interfaceC0733ng) {
        if (interfaceC0733ng == null) {
            mo1582s(null);
            return;
        }
        try {
            mo1582s(m1565b(interfaceC0733ng.getClass()).getName());
            C0714mg c0714mgMo1564a = mo1564a();
            try {
                m1567d(interfaceC0733ng.getClass()).invoke(null, interfaceC0733ng, c0714mgMo1564a);
                c0714mgMo1564a.m1628u();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC0733ng.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
