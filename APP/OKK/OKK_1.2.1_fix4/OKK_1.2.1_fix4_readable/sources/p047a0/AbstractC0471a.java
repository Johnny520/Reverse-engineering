package p047a0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p063j.C0957b;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0471a {

    /* JADX INFO: renamed from: a */
    public final C0957b f1050a;

    /* JADX INFO: renamed from: b */
    public final C0957b f1051b;

    /* JADX INFO: renamed from: c */
    public final C0957b f1052c;

    public AbstractC0471a(C0957b c0957b, C0957b c0957b2, C0957b c0957b3) {
        this.f1050a = c0957b;
        this.f1051b = c0957b2;
        this.f1052c = c0957b3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0472b mo1102a();

    /* JADX INFO: renamed from: b */
    public final Class m1103b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0957b c0957b = this.f1052c;
        Class cls2 = (Class) c0957b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0957b.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1104c(String str) throws NoSuchMethodException {
        C0957b c0957b = this.f1050a;
        Method method = (Method) c0957b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0471a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0471a.class);
        c0957b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1105d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0957b c0957b = this.f1051b;
        Method method = (Method) c0957b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM1103b = m1103b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1103b.getDeclaredMethod("write", cls, AbstractC0471a.class);
        c0957b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1106e(int i2);

    /* JADX INFO: renamed from: f */
    public final Parcelable m1107f(Parcelable parcelable, int i2) {
        if (!mo1106e(i2)) {
            return parcelable;
        }
        return ((C0472b) this).f1054e.readParcelable(C0472b.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0473c m1108g() {
        String string = ((C0472b) this).f1054e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0473c) m1104c(string).invoke(null, mo1102a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1109h(int i2);

    /* JADX INFO: renamed from: i */
    public final void m1110i(InterfaceC0473c interfaceC0473c) {
        if (interfaceC0473c == null) {
            ((C0472b) this).f1054e.writeString(null);
            return;
        }
        try {
            ((C0472b) this).f1054e.writeString(m1103b(interfaceC0473c.getClass()).getName());
            C0472b c0472bMo1102a = mo1102a();
            try {
                m1105d(interfaceC0473c.getClass()).invoke(null, interfaceC0473c, c0472bMo1102a);
                int i2 = c0472bMo1102a.f1058i;
                if (i2 >= 0) {
                    int i3 = c0472bMo1102a.f1053d.get(i2);
                    Parcel parcel = c0472bMo1102a.f1054e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(iDataPosition - i3);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(interfaceC0473c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
