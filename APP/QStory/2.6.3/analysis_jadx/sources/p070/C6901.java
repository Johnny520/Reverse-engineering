package p070;

import io.ktor.util.C4211;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6901 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4722[] f18406;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6901(int i, InterfaceC4722[] interfaceC4722Arr) {
        if (interfaceC4722Arr == null) {
            C5925.m11310("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = interfaceC4722Arr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            C4211.m8605(interfaceC4722Arr.getClass(), "Empty enum: ");
            throw null;
        }
        byte b = 0;
        super(i, i2, b, b);
        this.f18406 = interfaceC4722Arr;
    }

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo12181(int i) {
        int i2 = (1 << this.f18403) - 1;
        int i3 = this.f18404;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC4722 interfaceC4722 : this.f18406) {
            if (interfaceC4722.getNumber() == i4) {
                return interfaceC4722;
            }
        }
        return null;
    }
}
