package p241;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.C3880;
import com.bumptech.glide.request.InterfaceC3883;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import p238.AbstractC8818;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8832 implements InterfaceC8828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f22446;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8827 f22447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Animatable f22448;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ImageView f22449;

    public C8832(ImageView imageView, int i) {
        this.f22446 = i;
        AbstractC8818.m14028(imageView, "Argument must not be null");
        this.f22449 = imageView;
        this.f22447 = new C8827(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f22449;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7332(InterfaceC3883 interfaceC3883) {
        this.f22449.setTag(C0328R.id.glide_custom_view_target_tag, interfaceC3883);
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7333(Object obj) {
        m14041(obj);
        if (!(obj instanceof Animatable)) {
            this.f22448 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f22448 = animatable;
        animatable.start();
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo7334(C3880 c3880) {
        this.f22447.f22435.remove(c3880);
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335() {
        Animatable animatable = this.f22448;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3883 mo7336() {
        Object tag = this.f22449.getTag(C0328R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3883) {
                return (InterfaceC3883) tag;
            }
            C6755.m11869("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7337() {
        Animatable animatable = this.f22448;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7338(C3880 c3880) throws Throwable {
        C8827 c8827 = this.f22447;
        ArrayList arrayList = c8827.f22435;
        View view = c8827.f22436;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM14039 = c8827.m14039(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM140392 = c8827.m14039(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM14039 > 0 || iM14039 == Integer.MIN_VALUE) && (iM140392 > 0 || iM140392 == Integer.MIN_VALUE)) {
            c3880.m7158(iM14039, iM140392);
            return;
        }
        if (!arrayList.contains(c3880)) {
            arrayList.add(c3880);
        }
        if (c8827.f22434 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8830 viewTreeObserverOnPreDrawListenerC8830 = new ViewTreeObserverOnPreDrawListenerC8830(c8827);
            c8827.f22434 = viewTreeObserverOnPreDrawListenerC8830;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8830);
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7340(Drawable drawable) {
        C8827 c8827 = this.f22447;
        ViewTreeObserver viewTreeObserver = c8827.f22436.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c8827.f22434);
        }
        c8827.f22434 = null;
        c8827.f22435.clear();
        Animatable animatable = this.f22448;
        if (animatable != null) {
            animatable.stop();
        }
        m14041(null);
        this.f22448 = null;
        this.f22449.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14041(Object obj) {
        switch (this.f22446) {
            case 0:
                this.f22449.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f22449.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7341(Drawable drawable) {
        m14041(null);
        this.f22448 = null;
        this.f22449.setImageDrawable(drawable);
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7342(Drawable drawable) {
        m14041(null);
        this.f22448 = null;
        this.f22449.setImageDrawable(drawable);
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7339() {
    }
}
