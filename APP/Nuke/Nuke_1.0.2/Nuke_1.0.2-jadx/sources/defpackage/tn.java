package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tn extends w00 {
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w00
    public x00 a(Type type) {
        switch (this.a) {
            case 0:
                if (o82.class.isAssignableFrom(xe1.D(type))) {
                    return sn.y;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w00
    public final x00 b(Type type, Annotation[] annotationArr, cj cjVar) {
        switch (this.a) {
            case 0:
                if (type == u92.class) {
                    return xe1.J(annotationArr, bv2.class) ? gd3.m : gd3.l;
                }
                if (type == Void.class) {
                    return gd3.n;
                }
                if (xe1.h && type == a83.class) {
                    return sn.z;
                }
                return null;
            default:
                if (xe1.D(type) != Optional.class) {
                    return null;
                }
                return new hh1(2, cjVar.p(xe1.C(0, (ParameterizedType) type), annotationArr));
        }
    }
}
