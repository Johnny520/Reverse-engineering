package p098;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p049.AbstractC6530;
import p049.C6521;

/* JADX INFO: renamed from: 飘花落叶言世苏子哲兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7238 implements InterfaceC4873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f19276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f19277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ErrorTypeKind f19278;

    public C7238(ErrorTypeKind errorTypeKind, String... strArr) {
        errorTypeKind.getClass();
        this.f19278 = errorTypeKind;
        this.f19276 = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f19277 = String.format(debugText, Arrays.copyOf(new Object[]{String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    public final List getParameters() {
        return EmptyList.INSTANCE;
    }

    public final String toString() {
        return this.f19277;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9493() {
        return (C6521) C6521.f17830.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC4477 mo9211() {
        C7240.f19291.getClass();
        return C7240.f19289;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9212() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4873
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Collection mo9494() {
        return EmptyList.INSTANCE;
    }
}
