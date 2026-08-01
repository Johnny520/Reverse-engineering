package p062;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import net.bytebuddy.description.method.MethodDescription;
import p095.AbstractC7818;
import p114.C8069;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7306 implements InterfaceC7307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5294 f18110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f18111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5714 f18112;

    public C7306(AbstractC5710 abstractC5710, Map map, InterfaceC5294 interfaceC5294) {
        if (abstractC5710 == null) {
            m12553(0);
            throw null;
        }
        if (map == null) {
            m12553(1);
            throw null;
        }
        this.f18112 = abstractC5710;
        this.f18111 = map;
        this.f18110 = interfaceC5294;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m12553(int i) {
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

    @Override // p062.InterfaceC7307
    public final AbstractC5714 getType() {
        AbstractC5714 abstractC5714 = this.f18112;
        if (abstractC5714 != null) {
            return abstractC5714;
        }
        m12553(3);
        throw null;
    }

    public final String toString() {
        return C5576.f14235.m10033(this, null);
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo9735() {
        Map map = this.f18111;
        if (map != null) {
            return map;
        }
        m12553(4);
        throw null;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5294 mo9736() {
        return this.f18110;
    }

    @Override // p062.InterfaceC7307
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5519 mo9737() {
        AbstractC7818 abstractC7818M10059 = AbstractC5605.m10059(this);
        if (abstractC7818M10059 != null) {
            if (C8069.m13026(abstractC7818M10059)) {
                abstractC7818M10059 = null;
            }
            if (abstractC7818M10059 != null) {
                return AbstractC5605.m10060(abstractC7818M10059);
            }
        }
        return null;
    }
}
