package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k83 extends m83 {
    public final /* synthetic */ Method b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k83(Method method) {
        this.b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m83
    public final Object a(Class cls) {
        String strR = sz0.r(cls);
        if (strR == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        s.i("UnsafeAllocator is used for non-instantiable type: ".concat(strR));
        return null;
    }
}
