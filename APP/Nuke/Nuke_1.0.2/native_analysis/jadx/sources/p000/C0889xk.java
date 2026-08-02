package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: xk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0889xk implements by2 {

    /* JADX INFO: renamed from: h */
    public final ImageView f13064h;

    /* JADX INFO: renamed from: i */
    public final ob3 f13065i;

    /* JADX INFO: renamed from: j */
    public Animatable f13066j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f13067k;

    public C0889xk(ImageView imageView, int i) {
        this.f13067k = i;
        fg1.m1642q("Argument must not be null", imageView);
        this.f13064h = imageView;
        this.f13065i = new ob3(imageView);
    }

    /* JADX INFO: renamed from: a */
    public final void m6158a(Object obj) {
        switch (this.f13067k) {
            case 0:
                this.f13064h.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f13064h.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: f */
    public final void mo599f(Drawable drawable) {
        m6158a(null);
        this.f13066j = null;
        this.f13064h.setImageDrawable(drawable);
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: g */
    public final void mo600g(yq2 yq2Var) {
        this.f13065i.f7618b.remove(yq2Var);
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: m */
    public final void mo601m(yq2 yq2Var) throws Throwable {
        ob3 ob3Var = this.f13065i;
        ArrayList arrayList = ob3Var.f7618b;
        View view = ob3Var.f7617a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM3552a = ob3Var.m3552a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM3552a2 = ob3Var.m3552a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM3552a > 0 || iM3552a == Integer.MIN_VALUE) && (iM3552a2 > 0 || iM3552a2 == Integer.MIN_VALUE)) {
            yq2Var.m6311l(iM3552a, iM3552a2);
            return;
        }
        if (!arrayList.contains(yq2Var)) {
            arrayList.add(yq2Var);
        }
        if (ob3Var.f7619c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            nb3 nb3Var = new nb3(ob3Var);
            ob3Var.f7619c = nb3Var;
            viewTreeObserver.addOnPreDrawListener(nb3Var);
        }
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: o */
    public final void mo602o(l82 l82Var) {
        this.f13064h.setTag(R.id.glide_custom_view_target_tag, l82Var);
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: p */
    public final void mo603p(Drawable drawable) {
        m6158a(null);
        this.f13066j = null;
        this.f13064h.setImageDrawable(drawable);
    }

    public final String toString() {
        return "Target for: " + this.f13064h;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: u */
    public final l82 mo604u() {
        Object tag = this.f13064h.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof l82) {
                return (l82) tag;
            }
            C0676s.m4651j("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: v */
    public final void mo605v(Drawable drawable) {
        ob3 ob3Var = this.f13065i;
        ViewTreeObserver viewTreeObserver = ob3Var.f7617a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ob3Var.f7619c);
        }
        ob3Var.f7619c = null;
        ob3Var.f7618b.clear();
        Animatable animatable = this.f13066j;
        if (animatable != null) {
            animatable.stop();
        }
        m6158a(null);
        this.f13066j = null;
        this.f13064h.setImageDrawable(drawable);
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: w */
    public final void mo606w(Object obj) {
        m6158a(obj);
        if (!(obj instanceof Animatable)) {
            this.f13066j = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f13066j = animatable;
        animatable.start();
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public final void mo881x() {
        Animatable animatable = this.f13066j;
        if (animatable != null) {
            animatable.start();
        }
    }
}
