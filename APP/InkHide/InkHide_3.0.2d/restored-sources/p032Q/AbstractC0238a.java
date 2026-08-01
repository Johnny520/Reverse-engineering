package p032Q;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p075l.C0744b;

/* JADX INFO: renamed from: Q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238a {

    /* JADX INFO: renamed from: a */
    public final C0744b f572a;

    /* JADX INFO: renamed from: b */
    public final C0744b f573b;

    /* JADX INFO: renamed from: c */
    public final C0744b f574c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0238a(C0744b c0744b, C0744b c0744b2, C0744b c0744b3) {
        this.f572a = c0744b;
        this.f573b = c0744b2;
        this.f574c = c0744b3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0239b mo449a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Class m450b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0744b c0744b = this.f574c;
        Class cls2 = (Class) c0744b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0744b.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Method m451c(String str) throws NoSuchMethodException {
        C0744b c0744b = this.f572a;
        Method method = (Method) c0744b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0238a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0238a.class);
        c0744b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Method m452d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0744b c0744b = this.f573b;
        Method method = (Method) c0744b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM450b = m450b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM450b.getDeclaredMethod("write", cls, AbstractC0238a.class);
        c0744b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo453e(int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Parcelable m454f(Parcelable parcelable, int i2) {
        if (!mo453e(i2)) {
            return parcelable;
        }
        return ((C0239b) this).f576e.readParcelable(C0239b.class.getClassLoader());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC0240c m455g() {
        String string = ((C0239b) this).f576e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0240c) m451c(string).invoke(null, mo449a());
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
    public abstract void mo456h(int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m457i(InterfaceC0240c interfaceC0240c) {
        if (interfaceC0240c == null) {
            ((C0239b) this).f576e.writeString(null);
            return;
        }
        try {
            ((C0239b) this).f576e.writeString(m450b(interfaceC0240c.getClass()).getName());
            C0239b c0239bMo449a = mo449a();
            try {
                m452d(interfaceC0240c.getClass()).invoke(null, interfaceC0240c, c0239bMo449a);
                int i2 = c0239bMo449a.f580i;
                if (i2 >= 0) {
                    int i3 = c0239bMo449a.f575d.get(i2);
                    Parcel parcel = c0239bMo449a.f576e;
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
            throw new RuntimeException(interfaceC0240c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
