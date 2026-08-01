package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import p225.AbstractC8002;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8348 extends AbstractC8002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ View.OnLayoutChangeListener f23021;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23022;

    public /* synthetic */ C8348(View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.f23022 = i;
        this.f23021 = onLayoutChangeListener;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6773(Object obj) {
        int i = this.f23022;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f23021;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) obj;
                ViewOnLayoutChangeListenerC8347 viewOnLayoutChangeListenerC8347 = (ViewOnLayoutChangeListenerC8347) onLayoutChangeListener;
                View view = viewOnLayoutChangeListenerC8347.f23019;
                if (((String) view.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8347.f23017)) {
                    view.setBackground(drawable);
                }
                break;
            case 1:
                Drawable drawable2 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8345 viewOnLayoutChangeListenerC8345 = (ViewOnLayoutChangeListenerC8345) onLayoutChangeListener;
                View view2 = viewOnLayoutChangeListenerC8345.f23014;
                if (((String) view2.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8345.f23011)) {
                    view2.setBackground(drawable2);
                }
                break;
            case 2:
                Drawable drawable3 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8347 viewOnLayoutChangeListenerC83472 = (ViewOnLayoutChangeListenerC8347) onLayoutChangeListener;
                View view3 = viewOnLayoutChangeListenerC83472.f23019;
                if (((String) view3.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC83472.f23017)) {
                    view3.setBackground(drawable3);
                }
                break;
            default:
                Drawable drawable4 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8344 viewOnLayoutChangeListenerC8344 = (ViewOnLayoutChangeListenerC8344) onLayoutChangeListener;
                View view4 = viewOnLayoutChangeListenerC8344.f23010;
                if (((String) view4.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8344.f23007)) {
                    view4.setBackground(drawable4);
                }
                break;
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6780(Drawable drawable) {
        int i = this.f23022;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m13860(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m13861(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m13862(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m13863(Drawable drawable) {
    }
}
