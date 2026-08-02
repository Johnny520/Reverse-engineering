package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia3 {

    /* JADX INFO: renamed from: a */
    public final C0276hg f4511a;

    /* JADX INFO: renamed from: b */
    public final C0276hg f4512b;

    /* JADX INFO: renamed from: c */
    public final C0276hg f4513c;

    public ia3(C0276hg c0276hg, C0276hg c0276hg2, C0276hg c0276hg3) {
        this.f4511a = c0276hg;
        this.f4512b = c0276hg2;
        this.f4513c = c0276hg3;
    }

    /* JADX INFO: renamed from: a */
    public abstract ja3 mo2308a();

    /* JADX INFO: renamed from: b */
    public final Class m2309b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0276hg c0276hg = this.f4513c;
        Class cls2 = (Class) c0276hg.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0276hg.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m2310c(String str) throws NoSuchMethodException {
        C0276hg c0276hg = this.f4511a;
        Method method = (Method) c0276hg.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ia3.class.getClassLoader()).getDeclaredMethod("read", ia3.class);
        c0276hg.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m2311d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0276hg c0276hg = this.f4512b;
        Method method = (Method) c0276hg.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2309b = m2309b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2309b.getDeclaredMethod("write", cls, ia3.class);
        c0276hg.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2312e(int i);

    /* JADX INFO: renamed from: f */
    public final Parcelable m2313f(Parcelable parcelable, int i) {
        if (!mo2312e(i)) {
            return parcelable;
        }
        return ((ja3) this).f4938e.readParcelable(ja3.class.getClassLoader());
    }

    /* JADX INFO: renamed from: g */
    public final ka3 m2314g() {
        String string = ((ja3) this).f4938e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (ka3) m2310c(string).invoke(null, mo2308a());
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
    public abstract void mo2315h(int i);

    /* JADX INFO: renamed from: i */
    public final void m2316i(ka3 ka3Var) {
        if (ka3Var == null) {
            ((ja3) this).f4938e.writeString(null);
            return;
        }
        try {
            ((ja3) this).f4938e.writeString(m2309b(ka3Var.getClass()).getName());
            ja3 ja3VarMo2308a = mo2308a();
            try {
                m2311d(ka3Var.getClass()).invoke(null, ka3Var, ja3VarMo2308a);
                Parcel parcel = ja3VarMo2308a.f4938e;
                int i = ja3VarMo2308a.f4942i;
                if (i >= 0) {
                    int i2 = ja3VarMo2308a.f4937d.get(i);
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
            throw new RuntimeException(ka3Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
