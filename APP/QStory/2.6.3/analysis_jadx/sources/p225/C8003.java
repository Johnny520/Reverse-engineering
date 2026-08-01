package p225;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.InterfaceC3051;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p222.AbstractC7989;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8003 implements InterfaceC7999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f22101;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7998 f22102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Animatable f22103;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ImageView f22104;

    public C8003(ImageView imageView, int i) {
        this.f22101 = i;
        AbstractC7989.m13469(imageView, "Argument must not be null");
        this.f22104 = imageView;
        this.f22102 = new C7998(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f22104;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6772(InterfaceC3051 interfaceC3051) {
        this.f22104.setTag(R.id.glide_custom_view_target_tag, interfaceC3051);
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6773(Object obj) {
        m13482(obj);
        if (!(obj instanceof Animatable)) {
            this.f22103 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f22103 = animatable;
        animatable.start();
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo6774(C3048 c3048) {
        this.f22102.f22090.remove(c3048);
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6775() {
        Animatable animatable = this.f22103;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3051 mo6776() {
        Object tag = this.f22104.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3051) {
                return (InterfaceC3051) tag;
            }
            C5925.m11310("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6777() {
        Animatable animatable = this.f22103;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo6778(C3048 c3048) throws Throwable {
        C7998 c7998 = this.f22102;
        ArrayList arrayList = c7998.f22090;
        View view = c7998.f22091;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM13480 = c7998.m13480(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM134802 = c7998.m13480(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM13480 > 0 || iM13480 == Integer.MIN_VALUE) && (iM134802 > 0 || iM134802 == Integer.MIN_VALUE)) {
            c3048.m6598(iM13480, iM134802);
            return;
        }
        if (!arrayList.contains(c3048)) {
            arrayList.add(c3048);
        }
        if (c7998.f22089 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8001 viewTreeObserverOnPreDrawListenerC8001 = new ViewTreeObserverOnPreDrawListenerC8001(c7998);
            c7998.f22089 = viewTreeObserverOnPreDrawListenerC8001;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8001);
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6780(Drawable drawable) {
        C7998 c7998 = this.f22102;
        ViewTreeObserver viewTreeObserver = c7998.f22091.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c7998.f22089);
        }
        c7998.f22089 = null;
        c7998.f22090.clear();
        Animatable animatable = this.f22103;
        if (animatable != null) {
            animatable.stop();
        }
        m13482(null);
        this.f22103 = null;
        this.f22104.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13482(Object obj) {
        switch (this.f22101) {
            case 0:
                this.f22104.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f22104.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6781(Drawable drawable) {
        m13482(null);
        this.f22103 = null;
        this.f22104.setImageDrawable(drawable);
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6782(Drawable drawable) {
        m13482(null);
        this.f22103 = null;
        this.f22104.setImageDrawable(drawable);
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6779() {
    }
}
