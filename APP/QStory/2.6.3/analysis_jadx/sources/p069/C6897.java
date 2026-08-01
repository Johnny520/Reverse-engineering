package p069;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import net.bytebuddy.description.type.TypeDescription;
import p097.InterfaceC7223;
import p098.C7240;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世楪兰苏子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6897 extends AbstractC4878 implements InterfaceC7223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4874 f18351;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f18352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4870 f18353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6895 f18354;

    public C6897(AbstractC4870 abstractC4870, C6895 c6895, boolean z, C4874 c4874) {
        abstractC4870.getClass();
        c4874.getClass();
        this.f18353 = abstractC4870;
        this.f18354 = c6895;
        this.f18352 = z;
        this.f18351 = c4874;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f18353);
        sb.append(')');
        sb.append(this.f18352 ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return new C6897(this.f18353.mo9739(abstractC4861), this.f18354, this.f18352, this.f18351);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4873 mo9722() {
        return this.f18354;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4874 mo9723() {
        return this.f18351;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo9724() {
        return C7240.m12472(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        return this.f18352;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9726() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C6897(this.f18353, this.f18354, this.f18352, c4874);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        if (z == this.f18352) {
            return this;
        }
        return new C6897(this.f18353, this.f18354, z, this.f18351);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return new C6897(this.f18353.mo9739(abstractC4861), this.f18354, this.f18352, this.f18351);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC4914 mo9731(boolean z) {
        if (z == this.f18352) {
            return this;
        }
        return new C6897(this.f18353, this.f18354, z, this.f18351);
    }
}
