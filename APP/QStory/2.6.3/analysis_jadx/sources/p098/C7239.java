package p098;

import java.util.Arrays;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7239 extends AbstractC4878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f19279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ErrorTypeKind f19280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final String f19281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f19282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final String[] f19283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4873 f19284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7232 f19285;

    public C7239(InterfaceC4873 interfaceC4873, C7232 c7232, ErrorTypeKind errorTypeKind, List list, boolean z, String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        this.f19284 = interfaceC4873;
        this.f19285 = c7232;
        this.f19280 = errorTypeKind;
        this.f19279 = list;
        this.f19282 = z;
        this.f19283 = strArr;
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f19281 = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9730(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4873 mo9722() {
        return this.f19284;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4874 mo9723() {
        C4874.f14175.getClass();
        return C4874.f14176;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo9724() {
        return this.f19285;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        return this.f19282;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9726() {
        return this.f19279;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC4878 mo9731(boolean z) {
        String[] strArr = this.f19283;
        return new C7239(this.f19284, this.f19285, this.f19280, this.f19279, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC4914 mo9730(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC4914 mo9770(C4874 c4874) {
        c4874.getClass();
        return this;
    }
}
