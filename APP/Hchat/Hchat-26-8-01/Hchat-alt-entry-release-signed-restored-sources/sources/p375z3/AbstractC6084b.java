package p375z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012ah.C0086a;
import p069f.C0930e;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6084b {

    /* JADX INFO: renamed from: a */
    public final C0930e f24578a;

    /* JADX INFO: renamed from: b */
    public final C0930e f24579b;

    /* JADX INFO: renamed from: c */
    public final C0930e f24580c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6084b(C0930e c0930e, C0930e c0930e2, C0930e c0930e3) {
        this.f24578a = c0930e;
        this.f24579b = c0930e2;
        this.f24580c = c0930e3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C6085c mo10816a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Class m10817b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0930e c0930e = this.f24580c;
        Class cls2 = (Class) c0930e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(AbstractC4855en.m9265i(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        c0930e.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Method m10818c(String str) throws NoSuchMethodException {
        C0930e c0930e = this.f24578a;
        Method method = (Method) c0930e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC6084b.class.getClassLoader()).getDeclaredMethod("read", AbstractC6084b.class);
        c0930e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Method m10819d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0930e c0930e = this.f24579b;
        Method method = (Method) c0930e.get(name);
        if (method != null) {
            return method;
        }
        Class clsM10817b = m10817b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM10817b.getDeclaredMethod("write", cls, AbstractC6084b.class);
        c0930e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo10820e(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Parcelable m10821f(Parcelable parcelable, int i9) {
        if (!mo10820e(i9)) {
            return parcelable;
        }
        return ((C6085c) this).f24582e.readParcelable(C6085c.class.getClassLoader());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC6086d m10822g() {
        String string = ((C6085c) this).f24582e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC6086d) m10818c(string).invoke(null, mo10816a());
        } catch (ClassNotFoundException e6) {
            C0086a.m457p("VersionedParcel encountered ClassNotFoundException", e6);
            return null;
        } catch (IllegalAccessException e7) {
            C0086a.m457p("VersionedParcel encountered IllegalAccessException", e7);
            return null;
        } catch (NoSuchMethodException e10) {
            C0086a.m457p("VersionedParcel encountered NoSuchMethodException", e10);
            return null;
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            C0086a.m457p("VersionedParcel encountered InvocationTargetException", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo10823h(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10824i(InterfaceC6086d interfaceC6086d) {
        if (interfaceC6086d == null) {
            ((C6085c) this).f24582e.writeString(null);
            return;
        }
        try {
            ((C6085c) this).f24582e.writeString(m10817b(interfaceC6086d.getClass()).getName());
            C6085c c6085cMo10816a = mo10816a();
            try {
                m10819d(interfaceC6086d.getClass()).invoke(null, interfaceC6086d, c6085cMo10816a);
                Parcel parcel = c6085cMo10816a.f24582e;
                int i9 = c6085cMo10816a.f24586i;
                if (i9 >= 0) {
                    int i10 = c6085cMo10816a.f24581d.get(i9);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(iDataPosition - i10);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e6) {
                C0086a.m457p("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e7) {
                C0086a.m457p("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e10) {
                C0086a.m457p("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                C0086a.m457p("VersionedParcel encountered InvocationTargetException", e11);
            }
        } catch (ClassNotFoundException e12) {
            C0086a.m457p(interfaceC6086d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
