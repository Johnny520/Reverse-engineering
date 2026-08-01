package top.suzhelan.qstory.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6188;
import p230.C8049;
import p287.AbstractC8405;
import p353.InterfaceC8873;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ltop/suzhelan/qstory/ui/views/CustomRecycleView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "飘花落叶言子兰楪哲苏世", "L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "getOnTouchTouchCallback", "()L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;", "setOnTouchTouchCallback", "(L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;)V", "onTouchTouchCallback", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CustomRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters and from kotlin metadata */
    public InterfaceC8873 onTouchTouchCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
        AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵");
        attributeSet.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC8873 interfaceC8873;
        AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵喵呜呜");
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            InterfaceC8873 interfaceC88732 = this.onTouchTouchCallback;
            if (interfaceC88732 != null) {
                String strM13972 = AbstractC8405.m13972(2720);
                String str = AbstractC6188.f17016;
                AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                ((FollowRecycleViewLinearLayout) ((C8049) interfaceC88732).f22219).setDisableScroll(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (interfaceC8873 = this.onTouchTouchCallback) != null) {
            String strM139722 = AbstractC8405.m13972(2721);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11604(strM139722, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
            ((FollowRecycleViewLinearLayout) ((C8049) interfaceC8873).f22219).setDisableScroll(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC8873 getOnTouchTouchCallback() {
        return this.onTouchTouchCallback;
    }

    public final void setOnTouchTouchCallback(InterfaceC8873 interfaceC8873) {
        this.onTouchTouchCallback = interfaceC8873;
    }
}
