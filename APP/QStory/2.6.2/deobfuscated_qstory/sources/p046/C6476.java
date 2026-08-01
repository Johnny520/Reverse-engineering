package p046;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import net.bytebuddy.description.method.MethodDescription;
import p079.AbstractC6988;
import p098.C7239;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6476 implements InterfaceC6477 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4461 f17769;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f17770;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4881 f17771;

    public C6476(AbstractC4877 abstractC4877, Map map, InterfaceC4461 interfaceC4461) {
        if (abstractC4877 == null) {
            m11951(0);
            throw null;
        }
        if (map == null) {
            m11951(1);
            throw null;
        }
        this.f17771 = abstractC4877;
        this.f17770 = map;
        this.f17769 = interfaceC4461;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11951(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p046.InterfaceC6477
    public final AbstractC4881 getType() {
        AbstractC4881 abstractC4881 = this.f17771;
        if (abstractC4881 != null) {
            return abstractC4881;
        }
        m11951(3);
        throw null;
    }

    public final String toString() {
        return C4743.f13886.m9484(this, null);
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9186() {
        Map map = this.f17770;
        if (map != null) {
            return map;
        }
        m11951(4);
        throw null;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4461 mo9187() {
        return this.f17769;
    }

    @Override // p046.InterfaceC6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4686 mo9188() {
        AbstractC6988 abstractC6988M9510 = AbstractC4772.m9510(this);
        if (abstractC6988M9510 != null) {
            if (C7239.m12440(abstractC6988M9510)) {
                abstractC6988M9510 = null;
            }
            if (abstractC6988M9510 != null) {
                return AbstractC4772.m9511(abstractC6988M9510);
            }
        }
        return null;
    }
}
