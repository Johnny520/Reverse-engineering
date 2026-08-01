package androidx.compose.p001ui.semantics;

import androidx.compose.foundation.lazy.layout.C1526;
import androidx.compose.p001ui.autofill.InterfaceC2244;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2781 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f6100 = {new MutablePropertyReference1Impl(AbstractC2781.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl(AbstractC2781.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        C2782 c2782 = AbstractC2778.f6079;
        C2782 c27822 = AbstractC2794.f6138;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m4203(InterfaceC2779 interfaceC2779) {
        C2782 c2782 = AbstractC2778.f6086;
        InterfaceC5920 interfaceC5920 = f6100[6];
        Boolean bool = Boolean.TRUE;
        c2782.getClass();
        interfaceC2779.mo4150(c2782, bool);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m4204(InterfaceC2779 interfaceC2779, InterfaceC2404 interfaceC2404) {
        C2782 c2782 = AbstractC2778.f6079;
        C2782 c27822 = AbstractC2778.f6055;
        InterfaceC5920 interfaceC5920 = f6100[30];
        c27822.getClass();
        interfaceC2779.mo4150(c27822, interfaceC2404);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m4205(InterfaceC2779 interfaceC2779, int i) {
        C2782 c2782 = AbstractC2778.f6066;
        InterfaceC5920 interfaceC5920 = f6100[14];
        C2789 c2789 = new C2789(i);
        c2782.getClass();
        interfaceC2779.mo4150(c2782, c2789);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m4206(InterfaceC2779 interfaceC2779, InterfaceC2244 interfaceC2244) {
        C2782 c2782 = AbstractC2778.f6079;
        C2782 c27822 = AbstractC2778.f6089;
        InterfaceC5920 interfaceC5920 = f6100[8];
        c27822.getClass();
        interfaceC2779.mo4150(c27822, interfaceC2244);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m4207(InterfaceC2779 interfaceC2779, InterfaceC7387 interfaceC7387) {
        interfaceC2779.mo4150(AbstractC2794.f6138, new C2776(null, interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4208(InterfaceC2779 interfaceC2779, final C1526 c1526) {
        interfaceC2779.mo4150(AbstractC2794.f6128, new C2776(null, new InterfaceC7387() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final Boolean invoke(List<Float> list) {
                boolean z;
                Float f = (Float) c1526.invoke();
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
