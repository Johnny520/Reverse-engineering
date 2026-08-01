package retrofit2;

import androidx.appcompat.widget.C0978;
import androidx.core.view.C3075;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.C6008;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p413.InterfaceC9952;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6610 extends AbstractC6620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16206;

    public /* synthetic */ C6610(int i) {
        this.f16206 = i;
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6619 mo11730(Type type, Annotation[] annotationArr, C0978 c0978) {
        switch (this.f16206) {
            case 0:
                if (type == AbstractC6957.class) {
                    return AbstractC6615.m11749(annotationArr, InterfaceC9952.class) ? C6611.f16207 : C6611.f16212;
                }
                if (type == Void.class) {
                    return C6611.f16210;
                }
                if (AbstractC6615.f16224 && type == C6008.class) {
                    return C6611.f16209;
                }
                return null;
            default:
                if (AbstractC6615.m11746(type) != Optional.class) {
                    return null;
                }
                return new C3075(c0978.m1113(AbstractC6615.m11747(0, (ParameterizedType) type), annotationArr), 29);
        }
    }

    @Override // retrofit2.AbstractC6620
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC6619 mo11731(Type type) {
        switch (this.f16206) {
            case 0:
                if (AbstractC6962.class.isAssignableFrom(AbstractC6615.m11746(type))) {
                    return C6611.f16208;
                }
                return null;
            default:
                return super.mo11731(type);
        }
    }
}
