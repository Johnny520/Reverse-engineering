package p361yc;

import ae.C0307f;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p098g9.C2562p;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2560n;
import p098g9.InterfaceC2561o;
import p300uc.C8661o;
import p329wc.InterfaceC9218f;
import p376zd.C9994h0;

/* JADX INFO: renamed from: yc.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9689e2 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9218f[] f32925a = new InterfaceC9218f[0];

    /* JADX INFO: renamed from: a */
    public static final Set m37878a(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        if (interfaceC9218f instanceof InterfaceC9731n) {
            return ((InterfaceC9731n) interfaceC9218f).mo35899b();
        }
        HashSet hashSet = new HashSet(interfaceC9218f.mo35891e());
        int iMo35891e = interfaceC9218f.mo35891e();
        for (int i10 = 0; i10 < iMo35891e; i10++) {
            hashSet.add(interfaceC9218f.mo35892f(i10));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9218f[] m37879b(List list) {
        InterfaceC9218f[] interfaceC9218fArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC9218fArr = (InterfaceC9218f[]) list.toArray(new InterfaceC9218f[0])) == null) ? f32925a : interfaceC9218fArr;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2549c m37880c(InterfaceC2560n interfaceC2560n) {
        interfaceC2560n.getClass();
        InterfaceC2550d interfaceC2550dMo3877e = interfaceC2560n.mo3877e();
        if (interfaceC2550dMo3877e instanceof InterfaceC2549c) {
            return (InterfaceC2549c) interfaceC2550dMo3877e;
        }
        if (!(interfaceC2550dMo3877e instanceof InterfaceC2561o)) {
            C0307f.m923a("Only KClass supported as classifier, got ", interfaceC2550dMo3877e);
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC2550dMo3877e + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC2550dMo3877e + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC2550dMo3877e + '.');
    }

    /* JADX INFO: renamed from: d */
    public static final String m37881d(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        String strMo3794w = interfaceC2549c.mo3794w();
        if (strMo3794w == null) {
            strMo3794w = "<local class name not available>";
        }
        return m37882e(strMo3794w);
    }

    /* JADX INFO: renamed from: e */
    public static final String m37882e(String str) {
        str.getClass();
        return "Serializer for class '" + str + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    /* JADX INFO: renamed from: f */
    public static final Void m37883f(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        throw new C8661o(m37881d(interfaceC2549c));
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2560n m37884g(C2562p c2562p) {
        c2562p.getClass();
        InterfaceC2560n interfaceC2560nM9084c = c2562p.m9084c();
        if (interfaceC2560nM9084c != null) {
            return interfaceC2560nM9084c;
        }
        C9994h0.m38667a("Star projections in type arguments are not allowed, but had ", c2562p.m9084c());
        return null;
    }
}
