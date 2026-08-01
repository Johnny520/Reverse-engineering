package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C6008;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5604 extends AbstractC5600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14253;

    public C5604(String str) {
        super(C6008.f15084);
        this.f14253 = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    public final String toString() {
        return this.f14253;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo10056() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        return C8069.m13029(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f14253);
    }
}
