package p165;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1104;
import androidx.collection.C1123;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1104 f20851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1104 f20852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1104 f20853;

    public AbstractC8405(C1104 c1104, C1104 c11042, C1104 c11043) {
        this.f20853 = c1104;
        this.f20852 = c11042;
        this.f20851 = c11043;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Parcelable m13360(Parcelable parcelable, int i) {
        if (!mo13357(i)) {
            return parcelable;
        }
        return ((C8404) this).f20844.readParcelable(C8404.class.getClassLoader());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract boolean mo13357(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m13361(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C1104 c1104 = this.f20852;
        Method method = (Method) c1104.get(name);
        if (method != null) {
            return method;
        }
        Class clsM13363 = m13363(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM13363.getDeclaredMethod("write", cls, AbstractC8405.class);
        c1104.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method m13362(String str) throws NoSuchMethodException {
        C1104 c1104 = this.f20853;
        Method method = (Method) c1104.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC8405.class.getClassLoader()).getDeclaredMethod("read", AbstractC8405.class);
        c1104.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class m13363(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1104 c1104 = this.f20851;
        Class cls2 = (Class) c1104.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1104.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C8404 mo13358();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo13359(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8403 m13364() {
        String string = ((C8404) this).f20844.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC8403) m13362(string).invoke(null, mo13358());
        } catch (ClassNotFoundException e) {
            C1123.m1408("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            C1123.m1408("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C1123.m1408("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            C1123.m1408("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13365(InterfaceC8403 interfaceC8403) {
        if (interfaceC8403 == null) {
            ((C8404) this).f20844.writeString(null);
            return;
        }
        try {
            ((C8404) this).f20844.writeString(m13363(interfaceC8403.getClass()).getName());
            C8404 c8404Mo13358 = mo13358();
            try {
                m13361(interfaceC8403.getClass()).invoke(null, interfaceC8403, c8404Mo13358);
                Parcel parcel = c8404Mo13358.f20844;
                int i = c8404Mo13358.f20849;
                if (i >= 0) {
                    int i2 = c8404Mo13358.f20845.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C1123.m1408("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                C1123.m1408("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                C1123.m1408("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                C1123.m1408("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            C1123.m1408(interfaceC8403.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
