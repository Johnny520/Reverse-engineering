package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4772 extends AbstractC4768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13908;

    public C4772(String str) {
        super(C5176.f14739);
        this.f13908 = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    public final String toString() {
        return this.f13908;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo9497() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        interfaceC4486.getClass();
        return C7240.m12470(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f13908);
    }
}
