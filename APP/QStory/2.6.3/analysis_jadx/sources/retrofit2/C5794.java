package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5794 extends AbstractC5777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Executor f15892;

    public C5794(Executor executor) {
        this.f15892 = executor;
    }

    @Override // retrofit2.AbstractC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5796 mo11168(Type type, Annotation[] annotationArr) {
        if (AbstractC5785.m11187(type) != InterfaceC5778.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C4871(AbstractC5785.m11188(0, (ParameterizedType) type), 1, AbstractC5785.m11190(annotationArr, InterfaceC5757.class) ? null : this.f15892);
        }
        C5925.m11310("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
