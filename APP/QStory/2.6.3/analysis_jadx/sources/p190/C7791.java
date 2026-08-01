package p190;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p192.InterfaceC7809;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7791 extends FrameLayout implements InterfaceC7809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CollapsibleActionView f21197;

    /* JADX WARN: Multi-variable type inference failed */
    public C7791(View view) {
        super(view.getContext());
        this.f21197 = (CollapsibleActionView) view;
        addView(view);
    }
}
