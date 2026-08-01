package p274;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.resource.bitmap.C3021;
import com.bumptech.glide.load.resource.bitmap.C3042;
import p286.C8392;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC8345 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ String f23011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ float f23012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Drawable f23013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ View f23014;

    public ViewOnLayoutChangeListenerC8345(View view, Drawable drawable, float f, String str) {
        this.f23014 = view;
        this.f23013 = drawable;
        this.f23012 = f;
        this.f23011 = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f23014;
        view2.removeOnLayoutChangeListener(this);
        C3062 c3062M6798 = ComponentCallbacks2C3058.m6764(view2).m6798(this.f23013);
        InterfaceC8399[] interfaceC8399Arr = {new C3042(), new C3021((int) this.f23012)};
        c3062M6798.getClass();
        C3062 c3062 = (C3062) ((C3062) c3062M6798.m6612(new C8392(interfaceC8399Arr), true)).m6626(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        c3062.m6788(new C8348(this, 1), c3062);
    }
}
