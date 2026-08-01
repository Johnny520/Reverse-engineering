package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.C3013;
import com.bumptech.glide.load.resource.bitmap.C3042;
import com.bumptech.glide.request.C3049;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8347 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f23019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23020;

    public /* synthetic */ ViewOnLayoutChangeListenerC8347(View view, Drawable drawable, String str, int i) {
        this.f23020 = i;
        this.f23019 = view;
        this.f23018 = drawable;
        this.f23017 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f23020;
        Drawable drawable = this.f23018;
        View view2 = this.f23019;
        switch (i9) {
            case 0:
                view2.removeOnLayoutChangeListener(this);
                C3062 c3062 = (C3062) ((C3062) ComponentCallbacks2C3058.m6764(view2).m6800(Drawable.class).m6786(drawable).mo6619((C3049) new C3049().m6616(C3013.f9582)).m6612(new C3042(), true)).m6626(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c3062.m6788(new C8348(this, 0), c3062);
                break;
            default:
                view2.removeOnLayoutChangeListener(this);
                C3062 c30622 = (C3062) ComponentCallbacks2C3058.m6764(view2).m6798(drawable).m6626(view2.getMeasuredWidth(), view2.getMeasuredHeight());
                c30622.m6788(new C8348(this, 2), c30622);
                break;
        }
    }
}
