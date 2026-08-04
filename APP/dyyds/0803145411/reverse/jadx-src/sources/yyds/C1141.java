package yyds;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛵᛷᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1141 implements InterfaceC2156 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1358 f5234;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final View f5235;

    public C1141(View view) {
        AbstractC0319.m992(view, "Argument must not be null");
        this.f5235 = view;
        this.f5234 = new C1358(view);
    }

    public final String toString() {
        return "Target for: " + this.f5235;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void mo2328(Drawable drawable) {
        C1358 c1358 = this.f5234;
        ViewTreeObserver viewTreeObserver = c1358.f6328.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c1358.f6330);
        }
        c1358.f6330 = null;
        c1358.f6329.clear();
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1198(InterfaceC1823 interfaceC1823) {
        this.f5235.setTag(R.id.glide_custom_view_target_tag, interfaceC1823);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1199(C0397 c0397) throws Throwable {
        C1358 c1358 = this.f5234;
        ArrayList arrayList = c1358.f6329;
        View view = c1358.f6328;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM2760 = c1358.m2760(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM27602 = c1358.m2760(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM2760 > 0 || iM2760 == Integer.MIN_VALUE) && (iM27602 > 0 || iM27602 == Integer.MIN_VALUE)) {
            c0397.m1148(iM2760, iM27602);
            return;
        }
        if (!arrayList.contains(c0397)) {
            arrayList.add(c0397);
        }
        if (c1358.f6330 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2581 viewTreeObserverOnPreDrawListenerC2581 = new ViewTreeObserverOnPreDrawListenerC2581(c1358);
            c1358.f6330 = viewTreeObserverOnPreDrawListenerC2581;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2581);
        }
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo2329(Object obj) {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1200(Drawable drawable) {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final InterfaceC1823 mo1201() {
        Object tag = this.f5235.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC1823) {
                return (InterfaceC1823) tag;
            }
            C0188.m798("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1202() {
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo1203() {
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1204() {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1205(Drawable drawable) {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1206(C0397 c0397) {
        this.f5234.f6329.remove(c0397);
    }
}
