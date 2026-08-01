package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8344 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8349 f23008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23010;

    public ViewOnLayoutChangeListenerC8344(View view, Drawable drawable, C8349 c8349, String str) {
        this.f23010 = view;
        this.f23009 = drawable;
        this.f23008 = c8349;
        this.f23007 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23010;
        view2.removeOnLayoutChangeListener(this);
        C3062 c3062 = (C3062) ((C3062) ComponentCallbacks2C3058.m6764(view2).m6798(this.f23009).m6612(this.f23008, true)).m6626(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3062.m6788(new C8348(this, 3), c3062);
    }
}
