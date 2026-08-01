package p206;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p208.InterfaceC8638;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8620 extends FrameLayout implements InterfaceC8638 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CollapsibleActionView f21542;

    /* JADX WARN: Multi-variable type inference failed */
    public C8620(View view) {
        super(view.getContext());
        this.f21542 = (CollapsibleActionView) view;
        addView(view);
    }
}
