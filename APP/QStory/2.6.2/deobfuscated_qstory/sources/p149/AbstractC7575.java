package p149;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0257;
import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0257 f20511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0257 f20512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0257 f20513;

    public AbstractC7575(C0257 c0257, C0257 c02572, C0257 c02573) {
        this.f20513 = c0257;
        this.f20512 = c02572;
        this.f20511 = c02573;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Parcelable m12772(Parcelable parcelable, int i) {
        if (!mo12769(i)) {
            return parcelable;
        }
        return ((C7574) this).f20504.readParcelable(C7574.class.getClassLoader());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract boolean mo12769(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m12773(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0257 c0257 = this.f20512;
        Method method = (Method) c0257.get(name);
        if (method != null) {
            return method;
        }
        Class clsM12775 = m12775(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM12775.getDeclaredMethod("write", cls, AbstractC7575.class);
        c0257.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method m12774(String str) throws NoSuchMethodException {
        C0257 c0257 = this.f20513;
        Method method = (Method) c0257.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC7575.class.getClassLoader()).getDeclaredMethod("read", AbstractC7575.class);
        c0257.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class m12775(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0257 c0257 = this.f20511;
        Class cls2 = (Class) c0257.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0257.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C7574 mo12770();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo12771(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7573 m12776() {
        String string = ((C7574) this).f20504.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC7573) m12774(string).invoke(null, mo12770());
        } catch (ClassNotFoundException e) {
            C0276.m847("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            C0276.m847("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0276.m847("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            C0276.m847("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12777(InterfaceC7573 interfaceC7573) {
        if (interfaceC7573 == null) {
            ((C7574) this).f20504.writeString(null);
            return;
        }
        try {
            ((C7574) this).f20504.writeString(m12775(interfaceC7573.getClass()).getName());
            C7574 c7574Mo12770 = mo12770();
            try {
                m12773(interfaceC7573.getClass()).invoke(null, interfaceC7573, c7574Mo12770);
                Parcel parcel = c7574Mo12770.f20504;
                int i = c7574Mo12770.f20509;
                if (i >= 0) {
                    int i2 = c7574Mo12770.f20505.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C0276.m847("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                C0276.m847("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                C0276.m847("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                C0276.m847("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            C0276.m847(interfaceC7573.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
