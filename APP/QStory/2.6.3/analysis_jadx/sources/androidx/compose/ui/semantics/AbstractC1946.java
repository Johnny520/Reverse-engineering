package androidx.compose.ui.semantics;

import androidx.compose.foundation.lazy.layout.C0685;
import androidx.compose.ui.autofill.InterfaceC1409;
import androidx.compose.ui.graphics.InterfaceC1569;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1946 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f5755 = {new MutablePropertyReference1Impl(AbstractC1946.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl(AbstractC1946.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        C1947 c1947 = AbstractC1943.f5734;
        C1947 c19472 = AbstractC1959.f5793;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m3643(InterfaceC1944 interfaceC1944) {
        C1947 c1947 = AbstractC1943.f5741;
        InterfaceC5088 interfaceC5088 = f5755[6];
        Boolean bool = Boolean.TRUE;
        c1947.getClass();
        interfaceC1944.mo3590(c1947, bool);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m3644(InterfaceC1944 interfaceC1944, InterfaceC1569 interfaceC1569) {
        C1947 c1947 = AbstractC1943.f5734;
        C1947 c19472 = AbstractC1943.f5710;
        InterfaceC5088 interfaceC5088 = f5755[30];
        c19472.getClass();
        interfaceC1944.mo3590(c19472, interfaceC1569);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m3645(InterfaceC1944 interfaceC1944, int i) {
        C1947 c1947 = AbstractC1943.f5721;
        InterfaceC5088 interfaceC5088 = f5755[14];
        C1954 c1954 = new C1954(i);
        c1947.getClass();
        interfaceC1944.mo3590(c1947, c1954);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3646(InterfaceC1944 interfaceC1944, InterfaceC1409 interfaceC1409) {
        C1947 c1947 = AbstractC1943.f5734;
        C1947 c19472 = AbstractC1943.f5744;
        InterfaceC5088 interfaceC5088 = f5755[8];
        c19472.getClass();
        interfaceC1944.mo3590(c19472, interfaceC1409);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m3647(InterfaceC1944 interfaceC1944, InterfaceC6558 interfaceC6558) {
        interfaceC1944.mo3590(AbstractC1959.f5793, new C1941(null, interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m3648(InterfaceC1944 interfaceC1944, final C0685 c0685) {
        interfaceC1944.mo3590(AbstractC1959.f5783, new C1941(null, new InterfaceC6558() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final Boolean invoke(List<Float> list) {
                boolean z;
                Float f = (Float) c0685.invoke();
                if (f == null) {
                    z = false;
                } else {
                    list.add(f);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
    }
}
