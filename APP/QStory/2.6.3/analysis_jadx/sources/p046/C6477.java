package p046;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import net.bytebuddy.description.method.MethodDescription;
import p079.AbstractC6989;
import p098.C7240;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6477 implements InterfaceC6478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4462 f17765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f17766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4882 f17767;

    public C6477(AbstractC4878 abstractC4878, Map map, InterfaceC4462 interfaceC4462) {
        if (abstractC4878 == null) {
            m11994(0);
            throw null;
        }
        if (map == null) {
            m11994(1);
            throw null;
        }
        this.f17767 = abstractC4878;
        this.f17766 = map;
        this.f17765 = interfaceC4462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11994(int i) {
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

    @Override // p046.InterfaceC6478
    public final AbstractC4882 getType() {
        AbstractC4882 abstractC4882 = this.f17767;
        if (abstractC4882 != null) {
            return abstractC4882;
        }
        m11994(3);
        throw null;
    }

    public final String toString() {
        return C4744.f13890.m9474(this, null);
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9176() {
        Map map = this.f17766;
        if (map != null) {
            return map;
        }
        m11994(4);
        throw null;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4462 mo9177() {
        return this.f17765;
    }

    @Override // p046.InterfaceC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4687 mo9178() {
        AbstractC6989 abstractC6989M9500 = AbstractC4773.m9500(this);
        if (abstractC6989M9500 != null) {
            if (C7240.m12467(abstractC6989M9500)) {
                abstractC6989M9500 = null;
            }
            if (abstractC6989M9500 != null) {
                return AbstractC4773.m9501(abstractC6989M9500);
            }
        }
        return null;
    }
}
