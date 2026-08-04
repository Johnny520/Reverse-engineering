package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᛷᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1144 implements InterfaceC2156 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Animatable f5239;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ImageView f5240;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f5241;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0195 f5242;

    public C1144(ImageView imageView, int i) {
        this.f5241 = i;
        this.f5240 = imageView;
        this.f5242 = new C0195(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f5240;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo2328(Drawable drawable) {
        C0195 c0195 = this.f5242;
        ViewTreeObserver viewTreeObserver = c0195.f1156.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c0195.f1158);
        }
        c0195.f1158 = null;
        c0195.f1157.clear();
        Animatable animatable = this.f5239;
        if (animatable != null) {
            animatable.stop();
        }
        m2330(null);
        this.f5239 = null;
        this.f5240.setImageDrawable(drawable);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1198(InterfaceC1823 interfaceC1823) {
        this.f5240.setTag(R.id.glide_custom_view_target_tag, interfaceC1823);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1199(C0397 c0397) throws Throwable {
        C0195 c0195 = this.f5242;
        ArrayList arrayList = c0195.f1157;
        ImageView imageView = c0195.f1156;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM826 = c0195.m826(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iM8262 = c0195.m826(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM826 > 0 || iM826 == Integer.MIN_VALUE) && (iM8262 > 0 || iM8262 == Integer.MIN_VALUE)) {
            c0397.m1148(iM826, iM8262);
            return;
        }
        if (!arrayList.contains(c0397)) {
            arrayList.add(c0397);
        }
        if (c0195.f1158 == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2581 viewTreeObserverOnPreDrawListenerC2581 = new ViewTreeObserverOnPreDrawListenerC2581(c0195);
            c0195.f1158 = viewTreeObserverOnPreDrawListenerC2581;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2581);
        }
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2329(Object obj) {
        m2330(obj);
        if (!(obj instanceof Animatable)) {
            this.f5239 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f5239 = animatable;
        animatable.start();
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1200(Drawable drawable) {
        m2330(null);
        this.f5239 = null;
        this.f5240.setImageDrawable(drawable);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final InterfaceC1823 mo1201() {
        Object tag = this.f5240.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC1823) {
                return (InterfaceC1823) tag;
            }
            C0188.m798("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1202() {
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m2330(Object obj) {
        int i = this.f5241;
        ImageView imageView = this.f5240;
        switch (i) {
            case 0:
                imageView.setImageBitmap((Bitmap) obj);
                break;
            default:
                imageView.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo1203() {
        Animatable animatable = this.f5239;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1204() {
        Animatable animatable = this.f5239;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1205(Drawable drawable) {
        m2330(null);
        this.f5239 = null;
        this.f5240.setImageDrawable(drawable);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1206(C0397 c0397) {
        this.f5242.f1157.remove(c0397);
    }
}
