package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class j90 {
    public final n6 a;
    public final n6 b;
    public final n6 c;

    public j90(n6 r1, n6 r2, n6 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public abstract k90 a();

    public final Class b(Class r5) {
        String r0 = r5.getName();
        n6 r2 = this.c;
        Class r02 = (Class) r2.getOrDefault(r0, null);
        if (r02 != null) goto L6;
        Class<?> r03 = Class.forName(r5.getPackage().getName() + "." + r5.getSimpleName() + "Parcelizer", false, r5.getClassLoader());
        r2.put(r5.getName(), r03);
        return r03;
    L6:
        return r02;
    }

    public final Method c(String r5) {
        n6 r1 = this.a;
        Method r0 = (Method) r1.getOrDefault(r5, null);
        if (r0 != null) goto L6;
        System.currentTimeMillis();
        Method r02 = Class.forName(r5, true, j90.class.getClassLoader()).getDeclaredMethod("read", new Class[]{j90.class});
        r1.put(r5, r02);
        return r02;
    L6:
        return r0;
    }

    public final Method d(Class r5) {
        String r0 = r5.getName();
        n6 r2 = this.b;
        Method r02 = (Method) r2.getOrDefault(r0, null);
        if (r02 != null) goto L6;
        Class r03 = b(r5);
        System.currentTimeMillis();
        Method r04 = r03.getDeclaredMethod("write", new Class[]{r5, j90.class});
        r2.put(r5.getName(), r04);
        return r04;
    L6:
        return r02;
    }

    public abstract boolean e(int r1);

    public final Parcelable f(Parcelable r1, int r2) {
        if (e(r2) == true) goto L5;
        return r1;
    L5:
        ClassLoader r22 = k90.class.getClassLoader();
        return ((k90) this).e.readParcelable(r22);
    }

    public final l90 g() {
        String r0 = ((k90) this).e.readString();
        if (r0 != null) goto L5;
        return null;
    L5:
        k90 r2 = a();
        return (l90) c(r0).invoke(null, new Object[]{r2});
    L8:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L14:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L10:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L12:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L25;
        throw ((RuntimeException) e.getCause());
    L25:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    public abstract void h(int r1);

    public final void i(l90 r4) {
        if (r4 != null) goto L36;
        ((k90) this).e.writeString(null);
        return;
    L36:
        String r1 = b(r4.getClass()).getName();
        ((k90) this).e.writeString(r1);
        k90 r12 = a();
        d(r4.getClass()).invoke(null, new Object[]{r4, r12});     // Catch: ClassNotFoundException -> L13 NoSuchMethodException -> L15 InvocationTargetException -> L17 IllegalAccessException -> L19
        Parcel r42 = r12.e;
        int r0 = r12.i;
        if (r0 < 0) goto L40;
        int r02 = r12.d.get(r0);
        int r13 = r42.dataPosition();
        r42.setDataPosition(r02);
        r42.writeInt(r13 - r02);
        r42.setDataPosition(r13);
        return;
    L40:
        return;
    L13:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L19:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L15:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L17:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L30;
        throw ((RuntimeException) e.getCause());
    L30:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    L33:
        e = move-exception;
        throw new RuntimeException(r4.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
    }
}
