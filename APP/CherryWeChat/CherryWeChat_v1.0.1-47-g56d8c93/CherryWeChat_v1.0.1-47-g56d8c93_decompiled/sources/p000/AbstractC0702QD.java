package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: QD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0702QD {

    /* JADX INFO: renamed from: a */
    public final C0521M4 f2269a;

    /* JADX INFO: renamed from: b */
    public final C0521M4 f2270b;

    /* JADX INFO: renamed from: c */
    public final C0521M4 f2271c;

    public AbstractC0702QD(C0521M4 c0521m4, C0521M4 c0521m42, C0521M4 c0521m43) {
        this.f2269a = c0521m4;
        this.f2270b = c0521m42;
        this.f2271c = c0521m43;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0744RD mo1437a();

    /* JADX INFO: renamed from: b */
    public final Class m1438b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0521M4 c0521m4 = this.f2271c;
        Class cls2 = (Class) c0521m4.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0521m4.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1439c(String str) throws NoSuchMethodException {
        C0521M4 c0521m4 = this.f2269a;
        Method method = (Method) c0521m4.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0702QD.class.getClassLoader()).getDeclaredMethod("read", AbstractC0702QD.class);
        c0521m4.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1440d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0521M4 c0521m4 = this.f2270b;
        Method method = (Method) c0521m4.get(name);
        if (method != null) {
            return method;
        }
        Class clsM1438b = m1438b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM1438b.getDeclaredMethod("write", cls, AbstractC0702QD.class);
        c0521m4.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1441e(int i);

    /* JADX INFO: renamed from: f */
    public final int m1442f(int i, int i2) {
        return !mo1441e(i2) ? i : ((C0744RD) this).f2375e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m1443g(Parcelable parcelable, int i) {
        if (!mo1441e(i)) {
            return parcelable;
        }
        return ((C0744RD) this).f2375e.readParcelable(C0744RD.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0787SD m1444h() {
        String string = ((C0744RD) this).f2375e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0787SD) m1439c(string).invoke(null, mo1437a());
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

    /* JADX INFO: renamed from: i */
    public abstract void mo1445i(int i);

    /* JADX INFO: renamed from: j */
    public final void m1446j(int i, int i2) {
        mo1445i(i2);
        ((C0744RD) this).f2375e.writeInt(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m1447k(Parcelable parcelable, int i) {
        mo1445i(i);
        ((C0744RD) this).f2375e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m1448l(InterfaceC0787SD interfaceC0787SD) {
        if (interfaceC0787SD == null) {
            ((C0744RD) this).f2375e.writeString(null);
            return;
        }
        try {
            ((C0744RD) this).f2375e.writeString(m1438b(interfaceC0787SD.getClass()).getName());
            C0744RD c0744rdMo1437a = mo1437a();
            try {
                m1440d(interfaceC0787SD.getClass()).invoke(null, interfaceC0787SD, c0744rdMo1437a);
                Parcel parcel = c0744rdMo1437a.f2375e;
                int i = c0744rdMo1437a.f2379i;
                if (i >= 0) {
                    int i2 = c0744rdMo1437a.f2374d.get(i);
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
            throw new RuntimeException(interfaceC0787SD.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
