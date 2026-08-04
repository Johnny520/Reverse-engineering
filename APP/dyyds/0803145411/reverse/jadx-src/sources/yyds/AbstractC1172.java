package yyds;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛵᛸᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1172 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1505 f5378;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1505 f5379;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1505 f5380;

    public AbstractC1172(C1505 c1505, C1505 c15052, C1505 c15053) {
        this.f5378 = c1505;
        this.f5379 = c15052;
        this.f5380 = c15053;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public abstract void mo2360(int i);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2361(InterfaceC2636 interfaceC2636) {
        if (interfaceC2636 == null) {
            ((C2664) this).f13073.writeString(null);
            return;
        }
        try {
            ((C2664) this).f13073.writeString(m2364(interfaceC2636.getClass()).getName());
            C2664 c2664Mo2363 = mo2363();
            try {
                m2368(interfaceC2636.getClass()).invoke(null, interfaceC2636, c2664Mo2363);
                Parcel parcel = c2664Mo2363.f13073;
                int i = c2664Mo2363.f13072;
                if (i >= 0) {
                    int i2 = c2664Mo2363.f13078.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                C1693.m3442("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                C1693.m3442("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                C1693.m3442("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                C1693.m3442("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            C1693.m3442(interfaceC2636.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract boolean mo2362(int i);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public abstract C2664 mo2363();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Class m2364(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1505 c1505 = this.f5380;
        Class cls2 = (Class) c1505.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1505.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC2636 m2365() {
        String string = ((C2664) this).f13073.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC2636) m2366(string).invoke(null, mo2363());
        } catch (ClassNotFoundException e) {
            C1693.m3442("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            C1693.m3442("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C1693.m3442("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            C1693.m3442("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Method m2366(String str) throws NoSuchMethodException {
        C1505 c1505 = this.f5378;
        Method method = (Method) c1505.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1172.class.getClassLoader()).getDeclaredMethod("read", AbstractC1172.class);
        c1505.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Parcelable m2367(Parcelable parcelable, int i) {
        if (!mo2362(i)) {
            return parcelable;
        }
        return ((C2664) this).f13073.readParcelable(C2664.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Method m2368(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C1505 c1505 = this.f5379;
        Method method = (Method) c1505.get(name);
        if (method != null) {
            return method;
        }
        Class clsM2364 = m2364(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2364.getDeclaredMethod("write", cls, AbstractC1172.class);
        c1505.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }
}
