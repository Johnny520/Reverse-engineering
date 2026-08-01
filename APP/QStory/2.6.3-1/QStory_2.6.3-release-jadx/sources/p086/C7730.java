package p086;

import io.ktor.util.C5043;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7730 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5554[] f18751;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7730(int i, InterfaceC5554[] interfaceC5554Arr) {
        if (interfaceC5554Arr == null) {
            C6755.m11869("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = interfaceC5554Arr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            C5043.m9164(interfaceC5554Arr.getClass(), "Empty enum: ");
            throw null;
        }
        byte b = 0;
        super(i, i2, b, b);
        this.f18751 = interfaceC5554Arr;
    }

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo12740(int i) {
        int i2 = (1 << this.f18748) - 1;
        int i3 = this.f18749;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC5554 interfaceC5554 : this.f18751) {
            if (interfaceC5554.getNumber() == i4) {
                return interfaceC5554;
            }
        }
        return null;
    }
}
