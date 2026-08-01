package retrofit2;

import androidx.appcompat.widget.C0131;
import androidx.core.view.C2242;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.C5175;
import p015.AbstractC6201;
import p015.AbstractC6206;
import p384.InterfaceC9070;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5779 extends AbstractC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15861;

    public /* synthetic */ C5779(int i) {
        this.f15861 = i;
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5788 mo11114(Type type, Annotation[] annotationArr, C0131 c0131) {
        switch (this.f15861) {
            case 0:
                if (type == AbstractC6201.class) {
                    return AbstractC5784.m11133(annotationArr, InterfaceC9070.class) ? C5780.f15862 : C5780.f15867;
                }
                if (type == Void.class) {
                    return C5780.f15865;
                }
                if (AbstractC5784.f15879 && type == C5175.class) {
                    return C5780.f15864;
                }
                return null;
            default:
                if (AbstractC5784.m11130(type) != Optional.class) {
                    return null;
                }
                return new C2242(c0131.m552(AbstractC5784.m11131(0, (ParameterizedType) type), annotationArr), 29);
        }
    }

    @Override // retrofit2.AbstractC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5788 mo11115(Type type) {
        switch (this.f15861) {
            case 0:
                if (AbstractC6206.class.isAssignableFrom(AbstractC5784.m11130(type))) {
                    return C5780.f15863;
                }
                return null;
            default:
                return super.mo11115(type);
        }
    }
}
