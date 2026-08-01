package p070;

import io.ktor.util.C4210;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6900 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4721[] f18411;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6900(int i, InterfaceC4721[] interfaceC4721Arr) {
        if (interfaceC4721Arr == null) {
            C5919.m11249("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = interfaceC4721Arr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            C4210.m8615(interfaceC4721Arr.getClass(), "Empty enum: ");
            throw null;
        }
        byte b = 0;
        super(i, i2, b, b);
        this.f18411 = interfaceC4721Arr;
    }

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo12153(int i) {
        int i2 = (1 << this.f18408) - 1;
        int i3 = this.f18409;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC4721 interfaceC4721 : this.f18411) {
            if (interfaceC4721.getNumber() == i4) {
                return interfaceC4721;
            }
        }
        return null;
    }
}
