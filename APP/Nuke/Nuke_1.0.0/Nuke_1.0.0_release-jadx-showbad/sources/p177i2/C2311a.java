package p177i2;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.dartcv.nuke.R;
import p171h2.C2239f;
import p171h2.InterfaceC2236c;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2311a implements InterfaceC2313c {

    /* JADX INFO: renamed from: d */
    public final ImageView f7546d;

    /* JADX INFO: renamed from: e */
    public final C2315e f7547e;

    /* JADX INFO: renamed from: f */
    public Animatable f7548f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7549g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2311a(ImageView imageView, int i5) {
        this.f7549g = i5;
        AbstractC2503g.m4445c(imageView, "Argument must not be null");
        this.f7546d = imageView;
        this.f7547e = new C2315e(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4143a(Object obj) {
        switch (this.f7549g) {
            case 0:
                this.f7546d.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f7546d.setImageDrawable((Drawable) obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: d */
    public final void mo3377d(InterfaceC2236c interfaceC2236c) {
        this.f7546d.setTag(R.id.glide_custom_view_target_tag, interfaceC2236c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: f */
    public final void mo3378f(Drawable drawable) {
        m4143a(null);
        this.f7548f = null;
        this.f7546d.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: j */
    public final void mo3379j(C2239f c2239f) throws Throwable {
        C2315e c2315e = this.f7547e;
        ArrayList arrayList = c2315e.f7553b;
        View view = c2315e.f7552a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM4144a = c2315e.m4144a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM4144a2 = c2315e.m4144a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM4144a > 0 || iM4144a == Integer.MIN_VALUE) && (iM4144a2 > 0 || iM4144a2 == Integer.MIN_VALUE)) {
            c2239f.m4067l(iM4144a, iM4144a2);
            return;
        }
        if (!arrayList.contains(c2239f)) {
            arrayList.add(c2239f);
        }
        if (c2315e.f7554c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2314d viewTreeObserverOnPreDrawListenerC2314d = new ViewTreeObserverOnPreDrawListenerC2314d(c2315e);
            c2315e.f7554c = viewTreeObserverOnPreDrawListenerC2314d;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2314d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: p */
    public final void mo3380p(Drawable drawable) {
        m4143a(null);
        this.f7548f = null;
        this.f7546d.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: t */
    public final InterfaceC2236c mo3381t() {
        Object tag = this.f7546d.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2236c) {
            return (InterfaceC2236c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Target for: " + this.f7546d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: u */
    public final void mo3382u(Drawable drawable) {
        C2315e c2315e = this.f7547e;
        ViewTreeObserver viewTreeObserver = c2315e.f7552a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2315e.f7554c);
        }
        c2315e.f7554c = null;
        c2315e.f7553b.clear();
        Animatable animatable = this.f7548f;
        if (animatable != null) {
            animatable.stop();
        }
        m4143a(null);
        this.f7548f = null;
        this.f7546d.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: v */
    public final void mo3383v(C2239f c2239f) {
        this.f7547e.f7553b.remove(c2239f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: w */
    public final void mo3384w(Object obj) {
        m4143a(obj);
        if (!(obj instanceof Animatable)) {
            this.f7548f = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f7548f = animatable;
        animatable.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p154e2.InterfaceC2024c
    /* JADX INFO: renamed from: x */
    public final void mo2852x() {
        Animatable animatable = this.f7548f;
        if (animatable != null) {
            animatable.start();
        }
    }
}
