package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud2 implements xn0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xn0
    public final Object b(Object[] objArr) {
        objArr.getClass();
        try {
            sp0.a0(2, objArr);
            return eu.v(Boolean.valueOf(MessageDigest.isEqual(sp0.Y("left", objArr[0]), sp0.Y("right", objArr[1]))));
        } catch (Throwable th) {
            return eu.u(th);
        }
    }
}
