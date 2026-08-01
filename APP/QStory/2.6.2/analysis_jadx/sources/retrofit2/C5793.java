package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5793 extends AbstractC5776 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Executor f15892;

    public C5793(Executor executor) {
        this.f15892 = executor;
    }

    @Override // retrofit2.AbstractC5776
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5795 mo11111(Type type, Annotation[] annotationArr) {
        if (AbstractC5784.m11130(type) != InterfaceC5777.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C4870(AbstractC5784.m11131(0, (ParameterizedType) type), 1, AbstractC5784.m11133(annotationArr, InterfaceC5756.class) ? null : this.f15892);
        }
        C5919.m11249("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
