package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud2 implements xn0 {
    @Override // p000.xn0
    /* JADX INFO: renamed from: b */
    public final Object mo5172b(Object[] objArr) {
        objArr.getClass();
        try {
            sp0.m4929a0(2, objArr);
            return AbstractC0179eu.m1472v(Boolean.valueOf(MessageDigest.isEqual(sp0.m4926Y("left", objArr[0]), sp0.m4926Y("right", objArr[1]))));
        } catch (Throwable th) {
            return AbstractC0179eu.m1471u(th);
        }
    }
}
