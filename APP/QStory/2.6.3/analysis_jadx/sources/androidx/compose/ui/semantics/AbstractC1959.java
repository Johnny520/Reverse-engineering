package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.InterfaceC5168;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1959 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C1947 f5783;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C1947 f5784;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C1947 f5785;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C1947 f5786;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C1947 f5787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1947 f5788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1947 f5789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1947 f5790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1947 f5791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1947 f5792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1947 f5793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1947 f5794;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1947 f5795;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1947 f5796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C1947 f5797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1947 f5798;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1947 f5799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1947 f5800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1947 f5801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1947 f5802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1947 f5803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1947 f5804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1947 f5805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1947 f5806;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1947 f5807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1947 f5808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1947 f5809;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1947 f5810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1947 f5811;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new InterfaceC6554() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // p052.InterfaceC6554
            public final C1941 invoke(C1941 c1941, C1941 c19412) {
                String str;
                InterfaceC5168 interfaceC5168;
                if (c1941 == null || (str = c1941.f5707) == null) {
                    str = c19412.f5707;
                }
                if (c1941 == null || (interfaceC5168 = c1941.f5706) == null) {
                    interfaceC5168 = c19412.f5706;
                }
                return new C1941(str, interfaceC5168);
            }
        };
        f5793 = new C1947("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5792 = new C1947("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5791 = new C1947("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5790 = new C1947("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5789 = new C1947("ScrollByOffset");
        f5788 = new C1947("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5807 = new C1947("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5806 = new C1947("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5810 = new C1947("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5811 = new C1947("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5808 = new C1947("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5809 = new C1947("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5801 = new C1947("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5800 = new C1947("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5804 = new C1947("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5805 = new C1947("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5802 = new C1947("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5803 = new C1947("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5795 = new C1947("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5794 = new C1947("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5798 = new C1947("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5799 = new C1947("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5796 = new C1947("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5797 = new C1947("CustomActions", true, new InterfaceC6554() { // from class: androidx.compose.ui.semantics.SemanticsActions$CustomActions$1
            @Override // p052.InterfaceC6554
            public final List<Object> invoke(List<Object> list, List<Object> list2) {
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                return AbstractC4344.m8793(list2, list);
            }
        });
        f5787 = new C1947("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5786 = new C1947("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5785 = new C1947("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5784 = new C1947("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f5783 = new C1947("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1);
    }
}
