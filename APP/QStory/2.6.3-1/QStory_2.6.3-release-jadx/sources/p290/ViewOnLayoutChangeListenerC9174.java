package p290;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.resource.bitmap.C3853;
import com.bumptech.glide.load.resource.bitmap.C3874;
import p302.C9221;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC9174 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ float f23357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23359;

    public ViewOnLayoutChangeListenerC9174(View view, Drawable drawable, float f, String str) {
        this.f23359 = view;
        this.f23358 = drawable;
        this.f23357 = f;
        this.f23356 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23359;
        view2.removeOnLayoutChangeListener(this);
        C3894 c3894M7358 = ComponentCallbacks2C3890.m7324(view2).m7358(this.f23358);
        InterfaceC9228[] interfaceC9228Arr = {new C3874(), new C3853((int) this.f23357)};
        c3894M7358.getClass();
        C3894 c3894 = (C3894) ((C3894) c3894M7358.m7172(new C9221(interfaceC9228Arr), true)).m7186(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3894.m7348(new C9177(this, 1), c3894);
    }
}
