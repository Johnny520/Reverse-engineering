package p072;

import androidx.compose.runtime.tooling.AbstractC1295;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6922 extends AbstractC1295 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f18466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4643 f18467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6922(InterfaceC4643 interfaceC4643, int i) {
        super(1);
        this.f18466 = i;
        this.f18467 = interfaceC4643;
    }

    @Override // androidx.compose.runtime.tooling.AbstractC1295
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2301(String[] strArr) {
        int i = this.f18466;
        InterfaceC4643 interfaceC4643 = this.f18467;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C5925.m11310("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C6921) interfaceC4643).f18464.f18455 = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    C5925.m11310("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((C6921) interfaceC4643).f18464.f18454 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C5925.m11310("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((C6921) interfaceC4643).f18464.f18456 = strArr;
                }
                break;
        }
    }
}
