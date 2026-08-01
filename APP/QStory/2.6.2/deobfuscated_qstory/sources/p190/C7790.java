package p190;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p192.InterfaceC7808;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7790 extends FrameLayout implements InterfaceC7808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final CollapsibleActionView f21200;

    /* JADX WARN: Multi-variable type inference failed */
    public C7790(View view) {
        super(view.getContext());
        this.f21200 = (CollapsibleActionView) view;
        addView(view);
    }
}
