package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc3 extends t70 implements w70 {
    public static final dc3 d = new dc3(true);
    public static final String e = "VoiceSend";
    public static final hx2 f = new hx2(new y63(1));
    public static final hx2 g = new hx2(new y63(2));
    public static final hx2 h = new hx2(new y63(3));
    public static final hx2 i = new hx2(new y63(4));
    public static final hx2 j = new hx2(new y63(5));
    public static final hx2 k = new hx2(new y63(6));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j(String str) throws IllegalAccessException, InvocationTargetException {
        Object objJ;
        hx2 hx2Var = h;
        if (Modifier.isStatic(((Method) hx2Var.getValue()).getModifiers())) {
            objJ = null;
        } else {
            hp2 hp2Var = hp2.d;
            Class<?> declaringClass = ((Method) hx2Var.getValue()).getDeclaringClass();
            declaringClass.getClass();
            hp2Var.getClass();
            objJ = hp2.j(declaringClass);
        }
        Object objInvoke = ((Method) hx2Var.getValue()).invoke(objJ, null, str, Boolean.TRUE);
        String str2 = objInvoke instanceof String ? (String) objInvoke : null;
        if (str2 != null) {
            return str2;
        }
        s.l("VoiceLogic returned an empty AMR path");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(String str, int i2) throws IllegalAccessException, InvocationTargetException {
        hx2 hx2Var = g;
        Object[] objArr = ((Method) hx2Var.getValue()).getParameterCount() == 4 ? new Object[]{str, Integer.valueOf(i2), 0, null} : new Object[]{str, Integer.valueOf(i2), 0};
        Object objInvoke = ((Method) hx2Var.getValue()).invoke(null, Arrays.copyOf(objArr, objArr.length));
        Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(zb3.b);
        arrayList.add(ac3.b);
        arrayList.add(xb3.b);
        arrayList.add(cc3.b);
        arrayList.add(bc3.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }
}
