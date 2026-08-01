package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class j90 {

    /* JADX INFO: renamed from: a */
    public final C0511n6 f2597a;

    /* JADX INFO: renamed from: b */
    public final C0511n6 f2598b;

    /* JADX INFO: renamed from: c */
    public final C0511n6 f2599c;

    public j90(C0511n6 c0511n6, C0511n6 c0511n62, C0511n6 c0511n63) {
        this.f2597a = c0511n6;
        this.f2598b = c0511n62;
        this.f2599c = c0511n63;
    }

    /* JADX INFO: renamed from: a */
    public abstract k90 mo1555a();

    /* JADX INFO: renamed from: b */
    public final Class m1556b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0511n6 c0511n6 = this.f2599c;
        Class cls2 = (Class) c0511n6.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0511n6.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1557c(String str) throws NoSuchMethodException {
        C0511n6 c0511n6 = this.f2597a;
        Method method = (Method) c0511n6.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, j90.class.getClassLoader()).getDeclaredMethod("read", j90.class);
        c0511n6.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1558d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0511n6 c0511n6 = this.f2598b;
        Method method = (Method) c0511n6.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM1556b = m1556b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1556b.getDeclaredMethod("write", cls, j90.class);
        c0511n6.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1559e(int i);

    /* JADX INFO: renamed from: f */
    public final Parcelable m1560f(Parcelable parcelable, int i) {
        if (!mo1559e(i)) {
            return parcelable;
        }
        return ((k90) this).f2739e.readParcelable(k90.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final l90 m1561g() {
        String string = ((k90) this).f2739e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (l90) m1557c(string).invoke(null, mo1555a());
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
    public abstract void mo1562h(int i);

    /* JADX INFO: renamed from: i */
    public final void m1563i(l90 l90Var) {
        if (l90Var == null) {
            ((k90) this).f2739e.writeString(null);
            return;
        }
        try {
            ((k90) this).f2739e.writeString(m1556b(l90Var.getClass()).getName());
            k90 k90VarMo1555a = mo1555a();
            try {
                m1558d(l90Var.getClass()).invoke(null, l90Var, k90VarMo1555a);
                Parcel parcel = k90VarMo1555a.f2739e;
                int i = k90VarMo1555a.f2743i;
                if (i >= 0) {
                    int i2 = k90VarMo1555a.f2738d.get(i);
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
            throw new RuntimeException(l90Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
