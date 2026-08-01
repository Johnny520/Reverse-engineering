package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8343 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8348 f23009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23011;

    public ViewOnLayoutChangeListenerC8343(View view, Drawable drawable, C8348 c8348, String str) {
        this.f23011 = view;
        this.f23010 = drawable;
        this.f23009 = c8348;
        this.f23008 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23011;
        view2.removeOnLayoutChangeListener(this);
        C3061 c3061 = (C3061) ((C3061) ComponentCallbacks2C3057.m6719(view2).m6753(this.f23010).m6552(this.f23009, true)).m6566(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3061.m6743(new C8347(this, 3), c3061);
    }
}
