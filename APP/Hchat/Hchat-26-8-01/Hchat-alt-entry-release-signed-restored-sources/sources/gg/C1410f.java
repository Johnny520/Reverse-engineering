package gg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mg.InterfaceC2840b;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1221b;
import p085fg.InterfaceC1222c;
import p085fg.InterfaceC1223d;
import p085fg.InterfaceC1224e;
import p085fg.InterfaceC1225f;
import p085fg.InterfaceC1226g;
import p085fg.InterfaceC1227h;
import p085fg.InterfaceC1228i;
import p085fg.InterfaceC1229j;
import p085fg.InterfaceC1230k;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1232m;
import p085fg.InterfaceC1233n;
import p085fg.InterfaceC1234o;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p085fg.InterfaceC1237r;
import p085fg.InterfaceC1238s;
import p085fg.InterfaceC1239t;
import p085fg.InterfaceC1240u;
import p085fg.InterfaceC1241v;
import p085fg.InterfaceC1242w;
import p218og.AbstractC3149m;
import p276sf.C3958e;
import tf.AbstractC4167n;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: gg.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1410f implements InterfaceC2840b, InterfaceC1409e {

    /* JADX INFO: renamed from: b */
    public static final Map f4728b;

    /* JADX INFO: renamed from: a */
    public final Class f4729a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listM101y0 = AbstractC0000a.m101y0(InterfaceC1220a.class, InterfaceC1231l.class, InterfaceC1235p.class, InterfaceC1236q.class, InterfaceC1237r.class, InterfaceC1238s.class, InterfaceC1239t.class, InterfaceC1240u.class, InterfaceC1241v.class, InterfaceC1242w.class, InterfaceC1221b.class, InterfaceC1222c.class, InterfaceC1223d.class, InterfaceC1224e.class, InterfaceC1225f.class, InterfaceC1226g.class, InterfaceC1227h.class, InterfaceC1228i.class, InterfaceC1229j.class, InterfaceC1230k.class, InterfaceC1232m.class, InterfaceC1233n.class, InterfaceC1234o.class);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM101y0));
        int i9 = 0;
        for (Object obj : listM101y0) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            arrayList.add(new C3958e((Class) obj, Integer.valueOf(i9)));
            i9 = i10;
        }
        f4728b = AbstractC4178y.m8442e0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1410f(Class cls) {
        cls.getClass();
        this.f4729a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1409e
    /* JADX INFO: renamed from: a */
    public final Class mo3818a() {
        return this.f4729a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3819b() {
        String strM3826b;
        Class cls = this.f4729a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strM3826b2 = AbstractC1416l.m3826b(cls.getName());
            return strM3826b2 == null ? cls.getCanonicalName() : strM3826b2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strM3826b = AbstractC1416l.m3826b(componentType.getName())) != null) {
            strConcat = strM3826b.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3820c() {
        String strM3830f;
        Class cls = this.f4729a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM3830f2 = AbstractC1416l.m3830f(cls.getName());
                return strM3830f2 == null ? cls.getSimpleName() : strM3830f2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM3830f = AbstractC1416l.m3830f(componentType.getName())) != null) {
                strConcat = strM3830f.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC3149m.m6696K0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC3149m.m6695J0(simpleName, '$', simpleName);
        }
        return AbstractC3149m.m6696K0(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m3821d(Object obj) {
        Class clsM49Z = this.f4729a;
        clsM49Z.getClass();
        Map map = f4728b;
        map.getClass();
        Integer num = (Integer) map.get(clsM49Z);
        if (num != null) {
            return AbstractC1428x.m3839d(num.intValue(), obj);
        }
        if (clsM49Z.isPrimitive()) {
            clsM49Z = AbstractC0000a.m49Z(AbstractC1426v.m3834a(clsM49Z));
        }
        return clsM49Z.isInstance(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1410f) && AbstractC0000a.m49Z(this).equals(AbstractC0000a.m49Z((InterfaceC2840b) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0000a.m49Z(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4729a.toString() + " (Kotlin reflection is not available)";
    }
}
