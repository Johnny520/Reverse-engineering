package p290;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC9173 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C9178 f23353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23355;

    public ViewOnLayoutChangeListenerC9173(View view, Drawable drawable, C9178 c9178, String str) {
        this.f23355 = view;
        this.f23354 = drawable;
        this.f23353 = c9178;
        this.f23352 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23355;
        view2.removeOnLayoutChangeListener(this);
        C3894 c3894 = (C3894) ((C3894) ComponentCallbacks2C3890.m7324(view2).m7358(this.f23354).m7172(this.f23353, true)).m7186(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3894.m7348(new C9177(this, 3), c3894);
    }
}
