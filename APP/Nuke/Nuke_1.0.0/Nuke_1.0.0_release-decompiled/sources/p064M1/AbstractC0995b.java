package p064M1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p186k.C2423e;

/* JADX INFO: renamed from: M1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0995b {

    /* JADX INFO: renamed from: a */
    public final C2423e f3071a;

    /* JADX INFO: renamed from: b */
    public final C2423e f3072b;

    /* JADX INFO: renamed from: c */
    public final C2423e f3073c;

    public AbstractC0995b(C2423e c2423e, C2423e c2423e2, C2423e c2423e3) {
        this.f3071a = c2423e;
        this.f3072b = c2423e2;
        this.f3073c = c2423e3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0996c mo2040a();

    /* JADX INFO: renamed from: b */
    public final Class m2041b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2423e c2423e = this.f3073c;
        Class cls2 = (Class) c2423e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2423e.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m2042c(String str) throws NoSuchMethodException {
        C2423e c2423e = this.f3071a;
        Method method = (Method) c2423e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0995b.class.getClassLoader()).getDeclaredMethod("read", AbstractC0995b.class);
        c2423e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m2043d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C2423e c2423e = this.f3072b;
        Method method = (Method) c2423e.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2041b = m2041b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2041b.getDeclaredMethod("write", cls, AbstractC0995b.class);
        c2423e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2044e(int i5);

    /* JADX INFO: renamed from: f */
    public final Parcelable m2045f(Parcelable parcelable, int i5) {
        if (!mo2044e(i5)) {
            return parcelable;
        }
        return ((C0996c) this).f3075e.readParcelable(C0996c.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0997d m2046g() {
        String string = ((C0996c) this).f3075e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0997d) m2042c(string).invoke(null, mo2040a());
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo2047h(int i5);

    /* JADX INFO: renamed from: i */
    public final void m2048i(InterfaceC0997d interfaceC0997d) {
        if (interfaceC0997d == null) {
            ((C0996c) this).f3075e.writeString(null);
            return;
        }
        try {
            ((C0996c) this).f3075e.writeString(m2041b(interfaceC0997d.getClass()).getName());
            C0996c c0996cMo2040a = mo2040a();
            try {
                m2043d(interfaceC0997d.getClass()).invoke(null, interfaceC0997d, c0996cMo2040a);
                Parcel parcel = c0996cMo2040a.f3075e;
                int i5 = c0996cMo2040a.f3079i;
                if (i5 >= 0) {
                    int i6 = c0996cMo2040a.f3074d.get(i5);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i6);
                    parcel.writeInt(iDataPosition - i6);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
                }
                throw ((RuntimeException) e8.getCause());
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(interfaceC0997d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e9);
        }
    }
}
