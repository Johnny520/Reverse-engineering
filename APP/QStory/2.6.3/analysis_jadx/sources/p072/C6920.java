package p072;

import androidx.compose.runtime.tooling.AbstractC1295;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6920 extends AbstractC1295 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f18462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6921 f18463;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6920(C6921 c6921, int i) {
        super(1);
        this.f18462 = i;
        this.f18463 = c6921;
    }

    @Override // androidx.compose.runtime.tooling.AbstractC1295
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2301(String[] strArr) {
        int i = this.f18462;
        C6921 c6921 = this.f18463;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C5925.m11310("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    c6921.f18464.f18455 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C5925.m11310("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    c6921.f18464.f18454 = strArr;
                }
                break;
        }
    }
}
