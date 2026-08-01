package top.suzhelan.qstory.p015ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7017;
import p246.C8878;
import p369.InterfaceC9702;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m151d2 = {"Ltop/suzhelan/qstory/ui/views/CustomRecycleView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "飘花落叶言子兰楪哲苏世", "L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "getOnTouchTouchCallback", "()L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "setOnTouchTouchCallback", "(L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;)V", "onTouchTouchCallback", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class CustomRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters and from kotlin metadata */
    public InterfaceC9702 onTouchTouchCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        "context";
        context.getClass();
        "attrs";
        attributeSet.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC9702 interfaceC9702;
        "ev";
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            InterfaceC9702 interfaceC97022 = this.onTouchTouchCallback;
            if (interfaceC97022 != null) {
                String strM14531 = "onClickStart";
                String str = AbstractC7017.f17361;
                AbstractC7017.m12163(strM14531, "Run Log");
                ((FollowRecycleViewLinearLayout) ((C8878) interfaceC97022).f22564).setDisableScroll(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (interfaceC9702 = this.onTouchTouchCallback) != null) {
            String strM145312 = "onClickEnd";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12163(strM145312, "Run Log");
            ((FollowRecycleViewLinearLayout) ((C8878) interfaceC9702).f22564).setDisableScroll(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC9702 getOnTouchTouchCallback() {
        return this.onTouchTouchCallback;
    }

    public final void setOnTouchTouchCallback(InterfaceC9702 interfaceC9702) {
        this.onTouchTouchCallback = interfaceC9702;
    }
}
