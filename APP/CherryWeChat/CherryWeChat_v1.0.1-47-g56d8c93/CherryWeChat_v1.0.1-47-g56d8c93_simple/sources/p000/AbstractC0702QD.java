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

    public AbstractC0702QD(C0521M4 r1, C0521M4 r2, C0521M4 r3) {
        this.f2269a = r1;
        this.f2270b = r2;
        this.f2271c = r3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C0744RD mo1437a();

    /* JADX INFO: renamed from: b */
    public final Class m1438b(Class r5) {
        String r0 = r5.getName();
        C0521M4 r1 = this.f2271c;
        Class r02 = (Class) r1.get(r0);
        if (r02 != null) goto L6;
        Class<?> r03 = Class.forName(r5.getPackage().getName() + "." + r5.getSimpleName() + "Parcelizer", false, r5.getClassLoader());
        r1.put(r5.getName(), r03);
        return r03;
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: c */
    public final Method m1439c(String r5) {
        C0521M4 r0 = this.f2269a;
        Method r1 = (Method) r0.get(r5);
        if (r1 != null) goto L6;
        System.currentTimeMillis();
        Method r12 = Class.forName(r5, true, AbstractC0702QD.class.getClassLoader()).getDeclaredMethod("read", new Class[]{AbstractC0702QD.class});
        r0.put(r5, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: d */
    public final Method m1440d(Class r5) {
        String r0 = r5.getName();
        C0521M4 r1 = this.f2270b;
        Method r02 = (Method) r1.get(r0);
        if (r02 != null) goto L6;
        Class r03 = m1438b(r5);
        System.currentTimeMillis();
        Method r04 = r03.getDeclaredMethod("write", new Class[]{r5, AbstractC0702QD.class});
        r1.put(r5.getName(), r04);
        return r04;
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1441e(int r1);

    /* JADX INFO: renamed from: f */
    public final int m1442f(int r1, int r2) {
        if (mo1441e(r2) == true) goto L6;
        return r1;
    L6:
        return ((C0744RD) this).f2375e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m1443g(Parcelable r1, int r2) {
        if (mo1441e(r2) == true) goto L5;
        return r1;
    L5:
        ClassLoader r22 = C0744RD.class.getClassLoader();
        return ((C0744RD) this).f2375e.readParcelable(r22);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0787SD m1444h() {
        String r0 = ((C0744RD) this).f2375e.readString();
        if (r0 != null) goto L5;
        return null;
    L5:
        C0744RD r2 = mo1437a();
        return (InterfaceC0787SD) m1439c(r0).invoke(null, new Object[]{r2});
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

    /* JADX INFO: renamed from: i */
    public abstract void mo1445i(int r1);

    /* JADX INFO: renamed from: j */
    public final void m1446j(int r1, int r2) {
        mo1445i(r2);
        ((C0744RD) this).f2375e.writeInt(r1);
    }

    /* JADX INFO: renamed from: k */
    public final void m1447k(Parcelable r2, int r3) {
        mo1445i(r3);
        ((C0744RD) this).f2375e.writeParcelable(r2, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m1448l(InterfaceC0787SD r4) {
        if (r4 != null) goto L36;
        ((C0744RD) this).f2375e.writeString(null);
        return;
    L36:
        String r1 = m1438b(r4.getClass()).getName();
        ((C0744RD) this).f2375e.writeString(r1);
        C0744RD r12 = mo1437a();
        m1440d(r4.getClass()).invoke(null, new Object[]{r4, r12});     // Catch: ClassNotFoundException -> L13 NoSuchMethodException -> L15 InvocationTargetException -> L17 IllegalAccessException -> L19
        Parcel r42 = r12.f2375e;
        int r0 = r12.f2379i;
        if (r0 < 0) goto L40;
        int r02 = r12.f2374d.get(r0);
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
