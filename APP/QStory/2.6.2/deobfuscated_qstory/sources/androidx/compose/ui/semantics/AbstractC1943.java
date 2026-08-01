package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.InterfaceC1409;
import androidx.compose.ui.autofill.InterfaceC1411;
import androidx.compose.ui.autofill.InterfaceC1416;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.text.C2068;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1943 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final C1947 f5709;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C1947 f5710;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C1947 f5711;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C1947 f5712;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C1947 f5713;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C1947 f5714;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C1947 f5715;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C1947 f5722;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C1947 f5723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1947 f5733 = new C1947("ContentDescription", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // p052.InterfaceC6553
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
    public static final C1947 f5732 = new C1947("StateDescription", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1947 f5731 = new C1947("ProgressBarRangeInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1947 f5730 = new C1947("PaneTitle", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // p052.InterfaceC6553
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1947 f5729 = new C1947("SelectableGroup", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1947 f5728 = new C1947("CollectionInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1947 f5747 = new C1947("CollectionItemInfo", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1947 f5746 = new C1947("Heading", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1947 f5750 = new C1947("TextEntryKey", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1947 f5751 = new C1947("Disabled", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1947 f5748 = new C1947("LiveRegion", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1947 f5749 = new C1947("Focused", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1947 f5741 = new C1947("IsContainer", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1947 f5740 = new C1947("IsTraversalGroup");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1947 f5744 = new C1947("IsSensitiveData");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1947 f5745 = new C1947("InvisibleToUser", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // p052.InterfaceC6553
        public final C5175 invoke(C5175 c5175, C5175 c51752) {
            return c5175;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1947 f5742 = new C1947("HideFromAccessibility", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // p052.InterfaceC6553
        public final C5175 invoke(C5175 c5175, C5175 c51752) {
            return c5175;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1947 f5743 = new C1947("ContentType", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // p052.InterfaceC6553
        public final InterfaceC1409 invoke(InterfaceC1409 interfaceC1409, InterfaceC1409 interfaceC14092) {
            return interfaceC1409;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1947 f5735 = new C1947("ContentDataType", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // p052.InterfaceC6553
        public final InterfaceC1416 invoke(InterfaceC1416 interfaceC1416, InterfaceC1416 interfaceC14162) {
            return interfaceC1416;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1947 f5734 = new C1947("FillableData", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$FillableData$1
        @Override // p052.InterfaceC6553
        public final InterfaceC1411 invoke(InterfaceC1411 interfaceC1411, InterfaceC1411 interfaceC14112) {
            return interfaceC1411;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1947 f5738 = new C1947("TraversalIndex", new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float invoke(Float f, float f2) {
            return f;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1947 f5739 = new C1947("HorizontalScrollAxisRange", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1947 f5736 = new C1947("VerticalScrollAxisRange", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C1947 f5737 = new C1947("IsPopup", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // p052.InterfaceC6553
        public final C5175 invoke(C5175 c5175, C5175 c51752) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C1947 f5721 = new C1947("IsDialog", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // p052.InterfaceC6553
        public final C5175 invoke(C5175 c5175, C5175 c51752) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C1947 f5720 = new C1947("Role", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // p052.InterfaceC6553
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m3629invokeqtAw6s((C1954) obj, ((C1954) obj2).f5772);
        }

        /* JADX INFO: renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final C1954 m3629invokeqtAw6s(C1954 c1954, int i) {
            return c1954;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C1947 f5719 = new C1947("TestTag", false, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // p052.InterfaceC6553
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C1947 f5718 = new C1947("LinkTestMarker", false, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // p052.InterfaceC6553
        public final C5175 invoke(C5175 c5175, C5175 c51752) {
            return c5175;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C1947 f5717 = new C1947("Text", true, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // p052.InterfaceC6553
        public final List<C2068> invoke(List<C2068> list, List<C2068> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C1947 f5716 = new C1947("TextSubstitution");

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C1947 f5727 = new C1947("IsShowingTextSubstitution");

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C1947 f5726 = new C1947("InputText", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final C1947 f5725 = new C1947("EditableText", 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C1947 f5724 = new C1947("TextSelectionRange", 0);

    static {
        SemanticsPropertyKey$1 semanticsPropertyKey$1 = SemanticsPropertyKey$1.INSTANCE;
        f5723 = new C1947("ImeAction", 0);
        f5722 = new C1947("Selected", 0);
        f5713 = new C1947("ToggleableState", 0);
        SemanticsPropertyKey$1 semanticsPropertyKey$12 = SemanticsPropertyKey$1.INSTANCE;
        f5712 = new C1947("Password", 0);
        f5715 = new C1947("Error", 0);
        f5714 = new C1947("IndexForKey");
        f5710 = new C1947("IsEditable");
        f5711 = new C1947("MaxTextLength");
        f5709 = new C1947("Shape", false, new InterfaceC6553() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Shape$1
            @Override // p052.InterfaceC6553
            public final InterfaceC1569 invoke(InterfaceC1569 interfaceC1569, InterfaceC1569 interfaceC15692) {
                return interfaceC1569;
            }
        });
    }
}
