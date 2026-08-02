package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 extends xo {
    public final Executor a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b50(Executor executor) {
        this.a = executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xo
    public final yo a(Type type, Annotation[] annotationArr) {
        if (xe1.D(type) != wo.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new sz0(7, xe1.C(0, (ParameterizedType) type), xe1.J(annotationArr, mr2.class) ? null : this.a);
        }
        s.j("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
