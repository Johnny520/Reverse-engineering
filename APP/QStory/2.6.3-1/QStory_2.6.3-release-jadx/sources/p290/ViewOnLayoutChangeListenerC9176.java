package p290;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.C3845;
import com.bumptech.glide.load.resource.bitmap.C3874;
import com.bumptech.glide.request.C3881;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC9176 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f23364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23365;

    public /* synthetic */ ViewOnLayoutChangeListenerC9176(View view, Drawable drawable, String str, int i) {
        this.f23365 = i;
        this.f23364 = view;
        this.f23363 = drawable;
        this.f23362 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f23365;
        Drawable drawable = this.f23363;
        View view2 = this.f23364;
        switch (i9) {
            case 0:
                view2.removeOnLayoutChangeListener(this);
                C3894 c3894 = (C3894) ((C3894) ComponentCallbacks2C3890.m7324(view2).m7360(Drawable.class).m7346(drawable).mo7179((C3881) new C3881().m7176(C3845.f9927)).m7172(new C3874(), true)).m7186(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c3894.m7348(new C9177(this, 0), c3894);
                break;
            default:
                view2.removeOnLayoutChangeListener(this);
                C3894 c38942 = (C3894) ComponentCallbacks2C3890.m7324(view2).m7358(drawable).m7186(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c38942.m7348(new C9177(this, 2), c38942);
                break;
        }
    }
}
