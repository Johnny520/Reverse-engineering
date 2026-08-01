package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C5175;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4771 extends AbstractC4767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13904;

    public C4771(String str) {
        super(C5175.f14739);
        this.f13904 = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    public final String toString() {
        return this.f13904;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo9507() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        interfaceC4485.getClass();
        return C7239.m12443(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f13904);
    }
}
