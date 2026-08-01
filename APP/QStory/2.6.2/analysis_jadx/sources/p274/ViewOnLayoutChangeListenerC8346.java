package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.C3012;
import com.bumptech.glide.load.resource.bitmap.C3041;
import com.bumptech.glide.request.C3048;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8346 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f23020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23021;

    public /* synthetic */ ViewOnLayoutChangeListenerC8346(View view, Drawable drawable, String str, int i) {
        this.f23021 = i;
        this.f23020 = view;
        this.f23019 = drawable;
        this.f23018 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f23021;
        Drawable drawable = this.f23019;
        View view2 = this.f23020;
        switch (i9) {
            case 0:
                view2.removeOnLayoutChangeListener(this);
                C3061 c3061 = (C3061) ((C3061) ComponentCallbacks2C3057.m6719(view2).m6755(Drawable.class).m6741(drawable).mo6559((C3048) new C3048().m6556(C3012.f9580)).m6552(new C3041(), true)).m6566(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c3061.m6743(new C8347(this, 0), c3061);
                break;
            default:
                view2.removeOnLayoutChangeListener(this);
                C3061 c30612 = (C3061) ComponentCallbacks2C3057.m6719(view2).m6753(drawable).m6566(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c30612.m6743(new C8347(this, 2), c30612);
                break;
        }
    }
}
