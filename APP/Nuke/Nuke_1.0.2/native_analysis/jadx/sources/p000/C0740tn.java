package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: renamed from: tn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0740tn extends w00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10852a;

    @Override // p000.w00
    /* JADX INFO: renamed from: a */
    public x00 mo2549a(Type type) {
        switch (this.f10852a) {
            case 0:
                if (o82.class.isAssignableFrom(xe1.m6086D(type))) {
                    return C0700sn.f10237y;
                }
                return null;
            default:
                return super.mo2549a(type);
        }
    }

    @Override // p000.w00
    /* JADX INFO: renamed from: b */
    public final x00 mo2550b(Type type, Annotation[] annotationArr, C0093cj c0093cj) {
        switch (this.f10852a) {
            case 0:
                if (type == u92.class) {
                    return xe1.m6092J(annotationArr, bv2.class) ? gd3.f3435m : gd3.f3434l;
                }
                if (type == Void.class) {
                    return gd3.f3436n;
                }
                if (xe1.f12999h && type == a83.class) {
                    return C0700sn.f10238z;
                }
                return null;
            default:
                if (xe1.m6086D(type) != Optional.class) {
                    return null;
                }
                return new hh1(2, c0093cj.m841p(xe1.m6085C(0, (ParameterizedType) type), annotationArr));
        }
    }
}
