package top.suzhelan.qstory.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6157;
import p230.C8048;
import p353.InterfaceC8884;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ltop/suzhelan/qstory/ui/views/CustomRecycleView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;", "飘花落叶言子兰楪哲苏世", "L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;", "getOnTouchTouchCallback", "()L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;", "setOnTouchTouchCallback", "(L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;)V", "onTouchTouchCallback", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CustomRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters and from kotlin metadata */
    public InterfaceC8884 onTouchTouchCallback;

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
        InterfaceC8884 interfaceC8884;
        "ev";
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            InterfaceC8884 interfaceC88842 = this.onTouchTouchCallback;
            if (interfaceC88842 != null) {
                String strM6668 = "onClickStart";
                String str = AbstractC6157.f16779;
                AbstractC6157.m11573(strM6668, "Run Log");
                ((FollowRecycleViewLinearLayout) ((C8048) interfaceC88842).f22221).setDisableScroll(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (interfaceC8884 = this.onTouchTouchCallback) != null) {
            String strM66682 = "onClickEnd";
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11573(strM66682, "Run Log");
            ((FollowRecycleViewLinearLayout) ((C8048) interfaceC8884).f22221).setDisableScroll(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC8884 getOnTouchTouchCallback() {
        return this.onTouchTouchCallback;
    }

    public final void setOnTouchTouchCallback(InterfaceC8884 interfaceC8884) {
        this.onTouchTouchCallback = interfaceC8884;
    }
}
