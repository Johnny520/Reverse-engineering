package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xk implements by2 {
    public final ImageView h;
    public final ob3 i;
    public Animatable j;
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xk(ImageView imageView, int i) {
        this.k = i;
        fg1.q("Argument must not be null", imageView);
        this.h = imageView;
        this.i = new ob3(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj) {
        switch (this.k) {
            case 0:
                this.h.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.h.setImageDrawable((Drawable) obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void f(Drawable drawable) {
        a(null);
        this.j = null;
        this.h.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void g(yq2 yq2Var) {
        this.i.b.remove(yq2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void m(yq2 yq2Var) throws Throwable {
        ob3 ob3Var = this.i;
        ArrayList arrayList = ob3Var.b;
        View view = ob3Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = ob3Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = ob3Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            yq2Var.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(yq2Var)) {
            arrayList.add(yq2Var);
        }
        if (ob3Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            nb3 nb3Var = new nb3(ob3Var);
            ob3Var.c = nb3Var;
            viewTreeObserver.addOnPreDrawListener(nb3Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void o(l82 l82Var) {
        this.h.setTag(R.id.glide_custom_view_target_tag, l82Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void p(Drawable drawable) {
        a(null);
        this.j = null;
        this.h.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Target for: " + this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final l82 u() {
        Object tag = this.h.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof l82) {
                return (l82) tag;
            }
            s.j("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void v(Drawable drawable) {
        ob3 ob3Var = this.i;
        ViewTreeObserver viewTreeObserver = ob3Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ob3Var.c);
        }
        ob3Var.c = null;
        ob3Var.b.clear();
        Animatable animatable = this.j;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        this.j = null;
        this.h.setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.by2
    public final void w(Object obj) {
        a(obj);
        if (!(obj instanceof Animatable)) {
            this.j = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.j = animatable;
        animatable.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ga1
    public final void x() {
        Animatable animatable = this.j;
        if (animatable != null) {
            animatable.start();
        }
    }
}
