package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class o90 {

    /* JADX INFO: renamed from: a */
    public final C0511n6 f3422a;

    /* JADX INFO: renamed from: b */
    public final C0511n6 f3423b;

    /* JADX INFO: renamed from: c */
    public final C0511n6 f3424c;

    public o90(C0511n6 c0511n6, C0511n6 c0511n62, C0511n6 c0511n63) {
        this.f3422a = c0511n6;
        this.f3423b = c0511n62;
        this.f3424c = c0511n63;
    }

    /* JADX INFO: renamed from: a */
    public abstract p90 mo1992a();

    /* JADX INFO: renamed from: b */
    public final Class m1993b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0511n6 c0511n6 = this.f3424c;
        Class cls2 = (Class) c0511n6.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0511n6.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1994c(String str) throws NoSuchMethodException {
        C0511n6 c0511n6 = this.f3422a;
        Method method = (Method) c0511n6.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, o90.class.getClassLoader()).getDeclaredMethod("read", o90.class);
        c0511n6.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1995d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0511n6 c0511n6 = this.f3423b;
        Method method = (Method) c0511n6.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM1993b = m1993b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1993b.getDeclaredMethod("write", cls, o90.class);
        c0511n6.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1996e(int i);

    /* JADX INFO: renamed from: f */
    public final Parcelable m1997f(Parcelable parcelable, int i) {
        if (!mo1996e(i)) {
            return parcelable;
        }
        return ((p90) this).f3626e.readParcelable(p90.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final q90 m1998g() {
        String string = ((p90) this).f3626e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (q90) m1994c(string).invoke(null, mo1992a());
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

    /* JADX INFO: renamed from: h */
    public abstract void mo1999h(int i);

    /* JADX INFO: renamed from: i */
    public final void m2000i(q90 q90Var) {
        if (q90Var == null) {
            ((p90) this).f3626e.writeString(null);
            return;
        }
        try {
            ((p90) this).f3626e.writeString(m1993b(q90Var.getClass()).getName());
            p90 p90VarMo1992a = mo1992a();
            try {
                m1995d(q90Var.getClass()).invoke(null, q90Var, p90VarMo1992a);
                Parcel parcel = p90VarMo1992a.f3626e;
                int i = p90VarMo1992a.f3630i;
                if (i >= 0) {
                    int i2 = p90VarMo1992a.f3625d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
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
            throw new RuntimeException(q90Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
