package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.resource.bitmap.C3020;
import com.bumptech.glide.load.resource.bitmap.C3041;
import p286.C8391;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8344 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ float f23013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23015;

    public ViewOnLayoutChangeListenerC8344(View view, Drawable drawable, float f, String str) {
        this.f23015 = view;
        this.f23014 = drawable;
        this.f23013 = f;
        this.f23012 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23015;
        view2.removeOnLayoutChangeListener(this);
        C3061 c3061M6753 = ComponentCallbacks2C3057.m6719(view2).m6753(this.f23014);
        InterfaceC8398[] interfaceC8398Arr = {new C3041(), new C3020((int) this.f23013)};
        c3061M6753.getClass();
        C3061 c3061 = (C3061) ((C3061) c3061M6753.m6552(new C8391(interfaceC8398Arr), true)).m6566(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3061.m6743(new C8347(this, 1), c3061);
    }
}
