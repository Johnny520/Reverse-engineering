package p072;

import androidx.compose.runtime.tooling.AbstractC1295;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6921 extends AbstractC1295 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f18471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4642 f18472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6921(InterfaceC4642 interfaceC4642, int i) {
        super(1);
        this.f18471 = i;
        this.f18472 = interfaceC4642;
    }

    @Override // androidx.compose.runtime.tooling.AbstractC1295
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2291(String[] strArr) {
        int i = this.f18471;
        InterfaceC4642 interfaceC4642 = this.f18472;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C5919.m11249("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C6920) interfaceC4642).f18469.f18460 = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    C5919.m11249("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((C6920) interfaceC4642).f18469.f18459 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C5919.m11249("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C6920) interfaceC4642).f18469.f18461 = strArr;
                }
                break;
        }
    }
}
