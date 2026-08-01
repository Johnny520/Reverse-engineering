package androidx.compose.p001ui.semantics;

import androidx.compose.p001ui.autofill.InterfaceC2244;
import androidx.compose.p001ui.autofill.InterfaceC2246;
import androidx.compose.p001ui.autofill.InterfaceC2251;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.text.C2902;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2778 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C2782 f6055;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C2782 f6056;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C2782 f6057;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C2782 f6058;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C2782 f6059;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C2782 f6060;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C2782 f6061;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C2782 f6068;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C2782 f6069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2782 f6079 = new C2782("ContentDescription", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // p068.InterfaceC7383
        public final List<String> invoke(List<String> list, List<String> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2782 f6078 = new C2782("StateDescription", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2782 f6077 = new C2782("ProgressBarRangeInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2782 f6076 = new C2782("PaneTitle", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // p068.InterfaceC7383
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2782 f6075 = new C2782("SelectableGroup", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2782 f6074 = new C2782("CollectionInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2782 f6093 = new C2782("CollectionItemInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2782 f6092 = new C2782("Heading", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2782 f6096 = new C2782("TextEntryKey", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2782 f6097 = new C2782("Disabled", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2782 f6094 = new C2782("LiveRegion", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2782 f6095 = new C2782("Focused", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2782 f6087 = new C2782("IsContainer", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2782 f6086 = new C2782("IsTraversalGroup");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2782 f6090 = new C2782("IsSensitiveData");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2782 f6091 = new C2782("InvisibleToUser", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // p068.InterfaceC7383
        public final C6008 invoke(C6008 c6008, C6008 c60082) {
            return c6008;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2782 f6088 = new C2782("HideFromAccessibility", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // p068.InterfaceC7383
        public final C6008 invoke(C6008 c6008, C6008 c60082) {
            return c6008;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2782 f6089 = new C2782("ContentType", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // p068.InterfaceC7383
        public final InterfaceC2244 invoke(InterfaceC2244 interfaceC2244, InterfaceC2244 interfaceC22442) {
            return interfaceC2244;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2782 f6081 = new C2782("ContentDataType", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // p068.InterfaceC7383
        public final InterfaceC2251 invoke(InterfaceC2251 interfaceC2251, InterfaceC2251 interfaceC22512) {
            return interfaceC2251;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2782 f6080 = new C2782("FillableData", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$FillableData$1
        @Override // p068.InterfaceC7383
        public final InterfaceC2246 invoke(InterfaceC2246 interfaceC2246, InterfaceC2246 interfaceC22462) {
            return interfaceC2246;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2782 f6084 = new C2782("TraversalIndex", new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float invoke(Float f, float f2) {
            return f;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C2782 f6085 = new C2782("HorizontalScrollAxisRange", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2782 f6082 = new C2782("VerticalScrollAxisRange", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2782 f6083 = new C2782("IsPopup", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // p068.InterfaceC7383
        public final C6008 invoke(C6008 c6008, C6008 c60082) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C2782 f6067 = new C2782("IsDialog", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // p068.InterfaceC7383
        public final C6008 invoke(C6008 c6008, C6008 c60082) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C2782 f6066 = new C2782("Role", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // p068.InterfaceC7383
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m4199invokeqtAw6s((C2789) obj, ((C2789) obj2).f6118);
        }

        /* JADX INFO: renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final C2789 m4199invokeqtAw6s(C2789 c2789, int i) {
            return c2789;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C2782 f6065 = new C2782("TestTag", false, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // p068.InterfaceC7383
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C2782 f6064 = new C2782("LinkTestMarker", false, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // p068.InterfaceC7383
        public final C6008 invoke(C6008 c6008, C6008 c60082) {
            return c6008;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C2782 f6063 = new C2782("Text", true, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // p068.InterfaceC7383
        public final List<C2902> invoke(List<C2902> list, List<C2902> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C2782 f6062 = new C2782("TextSubstitution");

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C2782 f6073 = new C2782("IsShowingTextSubstitution");

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C2782 f6072 = new C2782("InputText", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C2782 f6071 = new C2782("EditableText", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C2782 f6070 = new C2782("TextSelectionRange", 0);

    static {
        SemanticsPropertyKey$1 semanticsPropertyKey$1 = SemanticsPropertyKey$1.INSTANCE;
        f6069 = new C2782("ImeAction", 0);
        f6068 = new C2782("Selected", 0);
        f6059 = new C2782("ToggleableState", 0);
        SemanticsPropertyKey$1 semanticsPropertyKey$12 = SemanticsPropertyKey$1.INSTANCE;
        f6058 = new C2782("Password", 0);
        f6061 = new C2782("Error", 0);
        f6060 = new C2782("IndexForKey");
        f6056 = new C2782("IsEditable");
        f6057 = new C2782("MaxTextLength");
        f6055 = new C2782("Shape", false, new InterfaceC7383() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Shape$1
            @Override // p068.InterfaceC7383
            public final InterfaceC2404 invoke(InterfaceC2404 interfaceC2404, InterfaceC2404 interfaceC24042) {
                return interfaceC2404;
            }
        });
    }
}
