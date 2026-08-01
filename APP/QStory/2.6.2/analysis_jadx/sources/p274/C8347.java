package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import p225.AbstractC8001;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8347 extends AbstractC8001 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ View.OnLayoutChangeListener f23022;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23023;

    public /* synthetic */ C8347(View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.f23023 = i;
        this.f23022 = onLayoutChangeListener;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6728(Object obj) {
        int i = this.f23023;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f23022;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) obj;
                ViewOnLayoutChangeListenerC8346 viewOnLayoutChangeListenerC8346 = (ViewOnLayoutChangeListenerC8346) onLayoutChangeListener;
                View view = viewOnLayoutChangeListenerC8346.f23020;
                if (((String) view.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8346.f23018)) {
                    view.setBackground(drawable);
                }
                break;
            case 1:
                Drawable drawable2 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8344 viewOnLayoutChangeListenerC8344 = (ViewOnLayoutChangeListenerC8344) onLayoutChangeListener;
                View view2 = viewOnLayoutChangeListenerC8344.f23015;
                if (((String) view2.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8344.f23012)) {
                    view2.setBackground(drawable2);
                }
                break;
            case 2:
                Drawable drawable3 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8346 viewOnLayoutChangeListenerC83462 = (ViewOnLayoutChangeListenerC8346) onLayoutChangeListener;
                View view3 = viewOnLayoutChangeListenerC83462.f23020;
                if (((String) view3.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC83462.f23018)) {
                    view3.setBackground(drawable3);
                }
                break;
            default:
                Drawable drawable4 = (Drawable) obj;
                ViewOnLayoutChangeListenerC8343 viewOnLayoutChangeListenerC8343 = (ViewOnLayoutChangeListenerC8343) onLayoutChangeListener;
                View view4 = viewOnLayoutChangeListenerC8343.f23011;
                if (((String) view4.getTag(R.id.action_container)).equals(viewOnLayoutChangeListenerC8343.f23008)) {
                    view4.setBackground(drawable4);
                }
                break;
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6735(Drawable drawable) {
        int i = this.f23023;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    private final void m13843(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    private final void m13844(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    private final void m13845(Drawable drawable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    private final void m13846(Drawable drawable) {
    }
}
