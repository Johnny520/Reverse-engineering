package p088;

import androidx.compose.runtime.tooling.AbstractC2130;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7751 extends AbstractC2130 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f18811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5475 f18812;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7751(InterfaceC5475 interfaceC5475, int i) {
        super(1);
        this.f18811 = i;
        this.f18812 = interfaceC5475;
    }

    @Override // androidx.compose.runtime.tooling.AbstractC2130
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2861(String[] strArr) {
        int i = this.f18811;
        InterfaceC5475 interfaceC5475 = this.f18812;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C6755.m11869("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C7750) interfaceC5475).f18809.f18800 = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    C6755.m11869("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((C7750) interfaceC5475).f18809.f18799 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C6755.m11869("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C7750) interfaceC5475).f18809.f18801 = strArr;
                }
                break;
        }
    }
}
