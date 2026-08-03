package p047a0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p063j.C0957b;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0471a {

    /* JADX INFO: renamed from: a */
    public final C0957b f1050a;

    /* JADX INFO: renamed from: b */
    public final C0957b f1051b;

    /* JADX INFO: renamed from: c */
    public final C0957b f1052c;

    public AbstractC0471a(C0957b r1, C0957b r2, C0957b r3) {
        this.f1050a = r1;
        this.f1051b = r2;
        this.f1052c = r3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0472b mo1102a();

    /* JADX INFO: renamed from: b */
    public final Class m1103b(Class r5) {
        String r02 = r5.getName();
        C0957b r1 = this.f1052c;
        Class r03 = (Class) r1.getOrDefault(r02, null);
        if (r03 != null) goto L6;
        Class<?> r04 = Class.forName(r5.getPackage().getName() + "." + r5.getSimpleName() + "Parcelizer", false, r5.getClassLoader());
        r1.put(r5.getName(), r04);
        return r04;
    L6:
        return r03;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1104c(String r5) {
        C0957b r02 = this.f1050a;
        Method r1 = (Method) r02.getOrDefault(r5, null);
        if (r1 != null) goto L6;
        System.currentTimeMillis();
        Method r12 = Class.forName(r5, true, AbstractC0471a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{AbstractC0471a.class});
        r02.put(r5, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1105d(Class r5) {
        String r02 = r5.getName();
        C0957b r1 = this.f1051b;
        Method r03 = (Method) r1.getOrDefault(r02, null);
        if (r03 != null) goto L6;
        Class r04 = m1103b(r5);
        System.currentTimeMillis();
        Method r05 = r04.getDeclaredMethod("write", new Class[]{r5, AbstractC0471a.class});
        r1.put(r5.getName(), r05);
        return r05;
    L6:
        return r03;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1106e(int r1);

    /* JADX INFO: renamed from: f */
    public final Parcelable m1107f(Parcelable r1, int r2) {
        if (mo1106e(r2) == true) goto L5;
        return r1;
    L5:
        ClassLoader r22 = C0472b.class.getClassLoader();
        return ((C0472b) this).f1054e.readParcelable(r22);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0473c m1108g() {
        String r02 = ((C0472b) this).f1054e.readString();
        if (r02 != null) goto L5;
        return null;
    L5:
        C0472b r2 = mo1102a();
        return (InterfaceC0473c) m1104c(r02).invoke(null, new Object[]{r2});
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

    /* JADX INFO: renamed from: h */
    public abstract void mo1109h(int r1);

    /* JADX INFO: renamed from: i */
    public final void m1110i(InterfaceC0473c r4) {
        if (r4 != null) goto L36;
        ((C0472b) this).f1054e.writeString(null);
        return;
    L36:
        String r1 = m1103b(r4.getClass()).getName();
        ((C0472b) this).f1054e.writeString(r1);
        C0472b r12 = mo1102a();
        m1105d(r4.getClass()).invoke(null, new Object[]{r4, r12});     // Catch: ClassNotFoundException -> L13 NoSuchMethodException -> L15 InvocationTargetException -> L17 IllegalAccessException -> L19
        int r42 = r12.f1058i;
        if (r42 < 0) goto L40;
        int r43 = r12.f1053d.get(r42);
        Parcel r02 = r12.f1054e;
        int r13 = r02.dataPosition();
        r02.setDataPosition(r43);
        r02.writeInt(r13 - r43);
        r02.setDataPosition(r13);
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
