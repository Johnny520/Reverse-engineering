package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc3 extends t70 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final dc3 f1989d = new dc3(true);

    /* JADX INFO: renamed from: e */
    public static final String f1990e = "VoiceSend";

    /* JADX INFO: renamed from: f */
    public static final hx2 f1991f = new hx2(new y63(1));

    /* JADX INFO: renamed from: g */
    public static final hx2 f1992g = new hx2(new y63(2));

    /* JADX INFO: renamed from: h */
    public static final hx2 f1993h = new hx2(new y63(3));

    /* JADX INFO: renamed from: i */
    public static final hx2 f1994i = new hx2(new y63(4));

    /* JADX INFO: renamed from: j */
    public static final hx2 f1995j = new hx2(new y63(5));

    /* JADX INFO: renamed from: k */
    public static final hx2 f1996k = new hx2(new y63(6));

    /* JADX INFO: renamed from: j */
    public static String m991j(String str) throws IllegalAccessException, InvocationTargetException {
        Object objM2227j;
        hx2 hx2Var = f1993h;
        if (Modifier.isStatic(((Method) hx2Var.getValue()).getModifiers())) {
            objM2227j = null;
        } else {
            hp2 hp2Var = hp2.f4103d;
            Class<?> declaringClass = ((Method) hx2Var.getValue()).getDeclaringClass();
            declaringClass.getClass();
            hp2Var.getClass();
            objM2227j = hp2.m2227j(declaringClass);
        }
        Object objInvoke = ((Method) hx2Var.getValue()).invoke(objM2227j, null, str, Boolean.TRUE);
        String str2 = objInvoke instanceof String ? (String) objInvoke : null;
        if (str2 != null) {
            return str2;
        }
        C0676s.m4653l("VoiceLogic returned an empty AMR path");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m992k(String str, int i) throws IllegalAccessException, InvocationTargetException {
        hx2 hx2Var = f1992g;
        Object[] objArr = ((Method) hx2Var.getValue()).getParameterCount() == 4 ? new Object[]{str, Integer.valueOf(i), 0, null} : new Object[]{str, Integer.valueOf(i), 0};
        Object objInvoke = ((Method) hx2Var.getValue()).invoke(null, Arrays.copyOf(objArr, objArr.length));
        Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(zb3.f13823b);
        arrayList.add(ac3.f148b);
        arrayList.add(xb3.f12957b);
        arrayList.add(cc3.f1479b);
        arrayList.add(bc3.f785b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f1990e;
    }
}
