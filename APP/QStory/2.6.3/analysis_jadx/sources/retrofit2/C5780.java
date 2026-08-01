package retrofit2;

import androidx.appcompat.widget.C0131;
import androidx.core.view.C2242;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.C5176;
import p007.AbstractC6128;
import p007.AbstractC6133;
import p397.InterfaceC9123;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5780 extends AbstractC5790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15861;

    public /* synthetic */ C5780(int i) {
        this.f15861 = i;
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5789 mo11171(Type type, Annotation[] annotationArr, C0131 c0131) {
        switch (this.f15861) {
            case 0:
                if (type == AbstractC6128.class) {
                    return AbstractC5785.m11190(annotationArr, InterfaceC9123.class) ? C5781.f15862 : C5781.f15867;
                }
                if (type == Void.class) {
                    return C5781.f15865;
                }
                if (AbstractC5785.f15879 && type == C5176.class) {
                    return C5781.f15864;
                }
                return null;
            default:
                if (AbstractC5785.m11187(type) != Optional.class) {
                    return null;
                }
                return new C2242(c0131.m553(AbstractC5785.m11188(0, (ParameterizedType) type), annotationArr), 29);
        }
    }

    @Override // retrofit2.AbstractC5790
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC5789 mo11172(Type type) {
        switch (this.f15861) {
            case 0:
                if (AbstractC6133.class.isAssignableFrom(AbstractC5785.m11187(type))) {
                    return C5781.f15863;
                }
                return null;
            default:
                return super.mo11172(type);
        }
    }
}
