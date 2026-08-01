package p225;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.C3047;
import com.bumptech.glide.request.InterfaceC3050;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p222.AbstractC7988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8002 implements InterfaceC7998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f22104;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7997 f22105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Animatable f22106;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ImageView f22107;

    public C8002(ImageView imageView, int i) {
        this.f22104 = i;
        AbstractC7988.m13441(imageView, "Argument must not be null");
        this.f22107 = imageView;
        this.f22105 = new C7997(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f22107;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6727(InterfaceC3050 interfaceC3050) {
        this.f22107.setTag(R.id.glide_custom_view_target_tag, interfaceC3050);
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6728(Object obj) {
        m13454(obj);
        if (!(obj instanceof Animatable)) {
            this.f22106 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f22106 = animatable;
        animatable.start();
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6729(C3047 c3047) {
        this.f22105.f22093.remove(c3047);
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6730() {
        Animatable animatable = this.f22106;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3050 mo6731() {
        Object tag = this.f22107.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3050) {
                return (InterfaceC3050) tag;
            }
            C5919.m11249("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6732() {
        Animatable animatable = this.f22106;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6733(C3047 c3047) throws Throwable {
        C7997 c7997 = this.f22105;
        ArrayList arrayList = c7997.f22093;
        View view = c7997.f22094;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM13452 = c7997.m13452(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM134522 = c7997.m13452(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM13452 > 0 || iM13452 == Integer.MIN_VALUE) && (iM134522 > 0 || iM134522 == Integer.MIN_VALUE)) {
            c3047.m6538(iM13452, iM134522);
            return;
        }
        if (!arrayList.contains(c3047)) {
            arrayList.add(c3047);
        }
        if (c7997.f22092 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8000 viewTreeObserverOnPreDrawListenerC8000 = new ViewTreeObserverOnPreDrawListenerC8000(c7997);
            c7997.f22092 = viewTreeObserverOnPreDrawListenerC8000;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8000);
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6735(Drawable drawable) {
        C7997 c7997 = this.f22105;
        ViewTreeObserver viewTreeObserver = c7997.f22094.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c7997.f22092);
        }
        c7997.f22092 = null;
        c7997.f22093.clear();
        Animatable animatable = this.f22106;
        if (animatable != null) {
            animatable.stop();
        }
        m13454(null);
        this.f22106 = null;
        this.f22107.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13454(Object obj) {
        switch (this.f22104) {
            case 0:
                this.f22107.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f22107.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6736(Drawable drawable) {
        m13454(null);
        this.f22106 = null;
        this.f22107.setImageDrawable(drawable);
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6737(Drawable drawable) {
        m13454(null);
        this.f22106 = null;
        this.f22107.setImageDrawable(drawable);
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6734() {
    }
}
