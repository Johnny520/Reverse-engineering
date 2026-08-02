package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nw implements sn0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sn0
    public final Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, go0 go0Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        m00 m00Var = (m00) obj2;
        nn0 nn0Var = (nn0) obj3;
        xm0 xm0Var = (xm0) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        rh1 rh1Var = rh1.a;
        if (i2 == 0) {
            i = (go0Var.f(rh1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= go0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= go0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= go0Var.f(m00Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= go0Var.h(nn0Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= go0Var.h(xm0Var) ? 131072 : 65536;
        }
        if (go0Var.O(i & 1, (599187 & i) != 599186)) {
            r00.c(str, zBooleanValue, m00Var, rh1Var, nn0Var, xm0Var, go0Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            go0Var.R();
        }
        return a83.a;
    }
}
