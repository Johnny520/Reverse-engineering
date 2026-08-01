package p290;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import p241.AbstractC8831;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9177 extends AbstractC8831 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ View.OnLayoutChangeListener f23366;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23367;

    public /* synthetic */ C9177(View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.f23367 = i;
        this.f23366 = onLayoutChangeListener;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7333(Object obj) {
        int i = this.f23367;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f23366;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) obj;
                ViewOnLayoutChangeListenerC9176 viewOnLayoutChangeListenerC9176 = (ViewOnLayoutChangeListenerC9176) onLayoutChangeListener;
                View view = viewOnLayoutChangeListenerC9176.f23364;
                if (((String) view.getTag(C0328R.id.action_container)).equals(viewOnLayoutChangeListenerC9176.f23362)) {
                    view.setBackground(drawable);
                }
                break;
            case 1:
                Drawable drawable2 = (Drawable) obj;
                ViewOnLayoutChangeListenerC9174 viewOnLayoutChangeListenerC9174 = (ViewOnLayoutChangeListenerC9174) onLayoutChangeListener;
                View view2 = viewOnLayoutChangeListenerC9174.f23359;
                if (((String) view2.getTag(C0328R.id.action_container)).equals(viewOnLayoutChangeListenerC9174.f23356)) {
                    view2.setBackground(drawable2);
                }
                break;
            case 2:
                Drawable drawable3 = (Drawable) obj;
                ViewOnLayoutChangeListenerC9176 viewOnLayoutChangeListenerC91762 = (ViewOnLayoutChangeListenerC9176) onLayoutChangeListener;
                View view3 = viewOnLayoutChangeListenerC91762.f23364;
                if (((String) view3.getTag(C0328R.id.action_container)).equals(viewOnLayoutChangeListenerC91762.f23362)) {
                    view3.setBackground(drawable3);
                }
                break;
            default:
                Drawable drawable4 = (Drawable) obj;
                ViewOnLayoutChangeListenerC9173 viewOnLayoutChangeListenerC9173 = (ViewOnLayoutChangeListenerC9173) onLayoutChangeListener;
                View view4 = viewOnLayoutChangeListenerC9173.f23355;
                if (((String) view4.getTag(C0328R.id.action_container)).equals(viewOnLayoutChangeListenerC9173.f23352)) {
                    view4.setBackground(drawable4);
                }
                break;
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7340(Drawable drawable) {
        int i = this.f23367;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m14419(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m14420(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m14421(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m14422(Drawable drawable) {
    }
}
