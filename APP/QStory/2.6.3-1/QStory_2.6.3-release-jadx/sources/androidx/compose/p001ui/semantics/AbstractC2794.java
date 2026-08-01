package androidx.compose.p001ui.semantics;

import java.util.List;
import kotlin.InterfaceC6000;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2794 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C2782 f6128;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C2782 f6129;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C2782 f6130;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C2782 f6131;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C2782 f6132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2782 f6133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2782 f6134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2782 f6135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2782 f6136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2782 f6137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2782 f6138;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2782 f6139;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2782 f6140;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2782 f6141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2782 f6142;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2782 f6143;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C2782 f6144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2782 f6145;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2782 f6146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2782 f6147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2782 f6148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2782 f6149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2782 f6150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2782 f6151;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2782 f6152;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2782 f6153;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2782 f6154;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2782 f6155;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2782 f6156;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // p068.InterfaceC7383
            public final C2776 invoke(C2776 c2776, C2776 c27762) {
                String str;
                InterfaceC6000 interfaceC6000;
                if (c2776 == null || (str = c2776.f6052) == null) {
                    str = c27762.f6052;
                }
                if (c2776 == null || (interfaceC6000 = c2776.f6051) == null) {
                    interfaceC6000 = c27762.f6051;
                }
                return new C2776(str, interfaceC6000);
            }
        };
        f6138 = new C2782("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6137 = new C2782("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6136 = new C2782("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6135 = new C2782("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6134 = new C2782("ScrollByOffset");
        f6133 = new C2782("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6152 = new C2782("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6151 = new C2782("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6155 = new C2782("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6156 = new C2782("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6153 = new C2782("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6154 = new C2782("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6146 = new C2782("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6145 = new C2782("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6149 = new C2782("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6150 = new C2782("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6147 = new C2782("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6148 = new C2782("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6140 = new C2782("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6139 = new C2782("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6143 = new C2782("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6144 = new C2782("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6141 = new C2782("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6142 = new C2782("CustomActions", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsActions$CustomActions$1
            @Override // p068.InterfaceC7383
            public final List<Object> invoke(List<Object> list, List<Object> list2) {
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                return AbstractC5176.m9352(list2, list);
            }
        });
        f6132 = new C2782("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6131 = new C2782("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6130 = new C2782("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6129 = new C2782("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1);
        f6128 = new C2782("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1);
    }
}
