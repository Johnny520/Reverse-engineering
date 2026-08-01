package p353y4;

import bsh.AbstractC1143c4;
import bsh.C1163d2;
import bsh.C1174f1;
import bsh.C1279w4;
import bsh.InterfaceC1188h3;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9566c extends C1279w4 {
    public C9566c(String str) {
        super("SecurityError: " + str);
    }

    /* JADX INFO: renamed from: d */
    public static String m37495d(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Class clsM4149S = AbstractC1143c4.m4149S(objArr[i10]);
            strArr[i10] = clsM4149S != null ? clsM4149S.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    /* JADX INFO: renamed from: e */
    public static C9566c m37496e(Class cls, Object[] objArr) {
        return new C9566c(String.format("Can't call this construct: new %s(%s)", cls.getName(), m37495d(objArr)));
    }

    /* JADX INFO: renamed from: f */
    public static C9566c m37497f(Class cls) {
        return new C9566c(String.format("Can't extend this class: %s", cls.getName()));
    }

    /* JADX INFO: renamed from: g */
    public static C9566c m37498g(Object obj, String str) {
        return new C9566c(String.format("Can't get this field: %s.%s", obj.getClass().getTypeName(), str));
    }

    /* JADX INFO: renamed from: h */
    public static C9566c m37499h(Class cls, String str) {
        return new C9566c(String.format("Can't get this static field: %s.%s", cls.getTypeName(), str));
    }

    /* JADX INFO: renamed from: i */
    public static C9566c m37500i(Class cls) {
        return new C9566c(String.format("Can't implement this interface: %s", cls.getName()));
    }

    /* JADX INFO: renamed from: j */
    public static C9566c m37501j(String str, Object[] objArr) {
        return new C9566c(String.format("Can't invoke this local method: %s(%s)", str, m37495d(objArr)));
    }

    /* JADX INFO: renamed from: k */
    public static C9566c m37502k(Object obj, String str, Object[] objArr) {
        return new C9566c(String.format("Can't invoke this method: %s.%s(%s)", obj.getClass().getTypeName(), str, m37495d(objArr)));
    }

    /* JADX INFO: renamed from: l */
    public static C9566c m37503l(Class cls, String str, Object[] objArr) {
        return new C9566c(String.format("Can't invoke this static method: %s.%s(%s)", cls.getTypeName(), str, m37495d(objArr)));
    }

    /* JADX INFO: renamed from: m */
    public static C9566c m37504m(Class cls, Object[] objArr) {
        return new C9566c(String.format("Can't call this construct using reflection: new %s(%s)", cls.getName(), m37495d(objArr)));
    }

    /* JADX INFO: renamed from: n */
    public static C9566c m37505n(Object obj, String str) {
        return new C9566c(String.format("Can't get this field using reflection: %s.%s", obj.getClass().getTypeName(), str));
    }

    /* JADX INFO: renamed from: o */
    public static C9566c m37506o(Class cls, String str) {
        return new C9566c(String.format("Can't get this static field using reflection: %s.%s", cls.getTypeName(), str));
    }

    /* JADX INFO: renamed from: p */
    public static C9566c m37507p(Object obj, String str, Object[] objArr) {
        return new C9566c(String.format("Can't invoke this method using reflection: %s.%s(%s)", obj.getClass().getTypeName(), str, m37495d(objArr)));
    }

    /* JADX INFO: renamed from: q */
    public static C9566c m37508q(Class cls, String str, Object[] objArr) {
        return new C9566c(String.format("Can't invoke this static method using reflection: %s.%s(%s)", cls.getTypeName(), str, m37495d(objArr)));
    }

    @Override // bsh.C1279w4
    /* JADX INFO: renamed from: a */
    public C1163d2 mo5167a(InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        return new C1163d2(getMessage(), interfaceC1188h3, c1174f1);
    }

    @Override // bsh.C1279w4
    /* JADX INFO: renamed from: b */
    public C1163d2 mo5168b(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        return new C1163d2(getMessage(), interfaceC1188h3, c1174f1);
    }
}
