package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: M5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0522M5 implements InterfaceC1444gA {

    /* JADX INFO: renamed from: a */
    public final ImageView f1703a;

    /* JADX INFO: renamed from: b */
    public final C0445KE f1704b;

    /* JADX INFO: renamed from: c */
    public Animatable f1705c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1706d;

    public C0522M5(ImageView imageView, int i) {
        this.f1706d = i;
        AbstractC0714Qj.m1488j("Argument must not be null", imageView);
        this.f1703a = imageView;
        this.f1704b = new C0445KE(imageView);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: a */
    public final InterfaceC1026Xv mo391a() {
        Object tag = this.f1703a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC1026Xv) {
            return (InterfaceC1026Xv) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: c */
    public final void mo393c(Drawable drawable) {
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        Animatable animatable = this.f1705c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: e */
    public final void mo395e(C2563ty c2563ty) {
        this.f1704b.f1462b.remove(c2563ty);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: f */
    public final void mo396f(C2563ty c2563ty) {
        C0445KE c0445ke = this.f1704b;
        ArrayList arrayList = c0445ke.f1462b;
        View view = c0445ke.f1461a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM894a = c0445ke.m894a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM894a2 = c0445ke.m894a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM894a > 0 || iM894a == Integer.MIN_VALUE) && (iM894a2 > 0 || iM894a2 == Integer.MIN_VALUE)) {
            c2563ty.m5050l(iM894a, iM894a2);
            return;
        }
        if (!arrayList.contains(c2563ty)) {
            arrayList.add(c2563ty);
        }
        if (c0445ke.f1463c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0877Ub viewTreeObserverOnPreDrawListenerC0877Ub = new ViewTreeObserverOnPreDrawListenerC0877Ub(c0445ke);
            c0445ke.f1463c = viewTreeObserverOnPreDrawListenerC0877Ub;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0877Ub);
        }
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: g */
    public final void mo397g(InterfaceC1026Xv interfaceC1026Xv) {
        this.f1703a.setTag(R.id.glide_custom_view_target_tag, interfaceC1026Xv);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: h */
    public final void mo398h(Drawable drawable) {
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: i */
    public final void mo399i(Drawable drawable) {
        C0445KE c0445ke = this.f1704b;
        ViewTreeObserver viewTreeObserver = c0445ke.f1461a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c0445ke.f1463c);
        }
        c0445ke.f1463c = null;
        c0445ke.f1462b.clear();
        Animatable animatable = this.f1705c;
        if (animatable != null) {
            animatable.stop();
        }
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: j */
    public final void mo400j(Object obj) {
        m1007l(obj);
        if (!(obj instanceof Animatable)) {
            this.f1705c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1705c = animatable;
        animatable.start();
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        Animatable animatable = this.f1705c;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1007l(Object obj) {
        switch (this.f1706d) {
            case 0:
                this.f1703a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1703a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.f1703a;
    }
}
