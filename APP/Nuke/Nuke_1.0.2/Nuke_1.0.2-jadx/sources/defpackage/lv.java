package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lv extends xo {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xo
    public final yo a(Type type, Annotation[] annotationArr) {
        if (xe1.D(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            s.l("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeC = xe1.C(0, (ParameterizedType) type);
        if (xe1.D(typeC) != q92.class) {
            return new jv(0, typeC);
        }
        if (typeC instanceof ParameterizedType) {
            return new jv(1, xe1.C(0, (ParameterizedType) typeC));
        }
        s.l("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
