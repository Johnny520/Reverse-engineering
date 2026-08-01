package p149;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C0257;
import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0257 f20506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0257 f20507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0257 f20508;

    public AbstractC7576(C0257 c0257, C0257 c02572, C0257 c02573) {
        this.f20508 = c0257;
        this.f20507 = c02572;
        this.f20506 = c02573;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Parcelable m12801(Parcelable parcelable, int i) {
        if (!mo12798(i)) {
            return parcelable;
        }
        return ((C7575) this).f20499.readParcelable(C7575.class.getClassLoader());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract boolean mo12798(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method m12802(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0257 c0257 = this.f20507;
        Method method = (Method) c0257.get(name);
        if (method != null) {
            return method;
        }
        Class clsM12804 = m12804(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM12804.getDeclaredMethod("write", cls, AbstractC7576.class);
        c0257.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Method m12803(String str) throws NoSuchMethodException {
        C0257 c0257 = this.f20508;
        Method method = (Method) c0257.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC7576.class.getClassLoader()).getDeclaredMethod("read", AbstractC7576.class);
        c0257.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class m12804(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0257 c0257 = this.f20506;
        Class cls2 = (Class) c0257.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0257.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C7575 mo12799();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo12800(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7574 m12805() {
        String string = ((C7575) this).f20499.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC7574) m12803(string).invoke(null, mo12799());
        } catch (ClassNotFoundException e) {
            C0276.m848("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            C0276.m848("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0276.m848("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            C0276.m848("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12806(InterfaceC7574 interfaceC7574) {
        if (interfaceC7574 == null) {
            ((C7575) this).f20499.writeString(null);
            return;
        }
        try {
            ((C7575) this).f20499.writeString(m12804(interfaceC7574.getClass()).getName());
            C7575 c7575Mo12799 = mo12799();
            try {
                m12802(interfaceC7574.getClass()).invoke(null, interfaceC7574, c7575Mo12799);
                Parcel parcel = c7575Mo12799.f20499;
                int i = c7575Mo12799.f20504;
                if (i >= 0) {
                    int i2 = c7575Mo12799.f20500.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C0276.m848("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                C0276.m848("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                C0276.m848("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                C0276.m848("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            C0276.m848(interfaceC7574.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
