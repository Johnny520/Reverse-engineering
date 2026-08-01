package p088;

import androidx.compose.runtime.tooling.AbstractC2130;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7749 extends AbstractC2130 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f18807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7750 f18808;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7749(C7750 c7750, int i) {
        super(1);
        this.f18807 = i;
        this.f18808 = c7750;
    }

    @Override // androidx.compose.runtime.tooling.AbstractC2130
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2861(String[] strArr) {
        int i = this.f18807;
        C7750 c7750 = this.f18808;
        switch (i) {
            case 0:
                if (strArr == null) {
                    C6755.m11869("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    c7750.f18809.f18800 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    C6755.m11869("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    c7750.f18809.f18799 = strArr;
                }
                break;
        }
    }
}
