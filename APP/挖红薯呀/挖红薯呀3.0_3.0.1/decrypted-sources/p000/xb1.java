package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb1 {

    /* JADX INFO: renamed from: a */
    public final C0121d9 f7320a;

    /* JADX INFO: renamed from: b */
    public final C0121d9 f7321b;

    /* JADX INFO: renamed from: c */
    public final C0121d9 f7322c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xb1(C0121d9 c0121d9, C0121d9 c0121d92, C0121d9 c0121d93) {
        this.f7320a = c0121d9;
        this.f7321b = c0121d92;
        this.f7322c = c0121d93;
    }

    /* JADX INFO: renamed from: a */
    public abstract yb1 mo5114a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Class m5115b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0121d9 c0121d9 = this.f7322c;
        Class cls2 = (Class) c0121d9.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0121d9.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Method m5116c(String str) throws NoSuchMethodException {
        C0121d9 c0121d9 = this.f7320a;
        Method method = (Method) c0121d9.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, xb1.class.getClassLoader()).getDeclaredMethod("read", xb1.class);
        c0121d9.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Method m5117d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0121d9 c0121d9 = this.f7321b;
        Method method = (Method) c0121d9.get(name);
        if (method != null) {
            return method;
        }
        Class clsM5115b = m5115b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM5115b.getDeclaredMethod("write", cls, xb1.class);
        c0121d9.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo5118e(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Parcelable m5119f(Parcelable parcelable, int i) {
        if (!mo5118e(i)) {
            return parcelable;
        }
        return ((yb1) this).f7602e.readParcelable(yb1.class.getClassLoader());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final zb1 m5120g() {
        String string = ((yb1) this).f7602e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (zb1) m5116c(string).invoke(null, mo5114a());
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
    public abstract void mo5121h(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m5122i(zb1 zb1Var) {
        if (zb1Var == null) {
            ((yb1) this).f7602e.writeString(null);
            return;
        }
        try {
            ((yb1) this).f7602e.writeString(m5115b(zb1Var.getClass()).getName());
            yb1 yb1VarMo5114a = mo5114a();
            try {
                m5117d(zb1Var.getClass()).invoke(null, zb1Var, yb1VarMo5114a);
                Parcel parcel = yb1VarMo5114a.f7602e;
                int i = yb1VarMo5114a.f7606i;
                if (i >= 0) {
                    int i2 = yb1VarMo5114a.f7601d.get(i);
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
            throw new RuntimeException(zb1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
