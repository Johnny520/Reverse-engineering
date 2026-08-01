package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.C3047;
import com.bumptech.glide.request.InterfaceC3050;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p222.AbstractC7988;
import p225.C7999;
import p225.InterfaceC7998;
import p225.ViewTreeObserverOnPreDrawListenerC8000;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3060 implements InterfaceC7998 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f9767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7999 f9768;

    public C3060(View view) {
        AbstractC7988.m13441(view, "Argument must not be null");
        this.f9767 = view;
        this.f9768 = new C7999(view);
    }

    public final String toString() {
        return "Target for: " + this.f9767;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo6727(InterfaceC3050 interfaceC3050) {
        this.f9767.setTag(R.id.glide_custom_view_target_tag, interfaceC3050);
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo6729(C3047 c3047) {
        this.f9768.f22097.remove(c3047);
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3050 mo6731() {
        Object tag = this.f9767.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3050) {
                return (InterfaceC3050) tag;
            }
            C5919.m11249("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo6733(C3047 c3047) throws Throwable {
        C7999 c7999 = this.f9768;
        ArrayList arrayList = c7999.f22097;
        View view = c7999.f22098;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM13453 = c7999.m13453(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM134532 = c7999.m13453(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM13453 > 0 || iM13453 == Integer.MIN_VALUE) && (iM134532 > 0 || iM134532 == Integer.MIN_VALUE)) {
            c3047.m6538(iM13453, iM134532);
            return;
        }
        if (!arrayList.contains(c3047)) {
            arrayList.add(c3047);
        }
        if (c7999.f22096 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8000 viewTreeObserverOnPreDrawListenerC8000 = new ViewTreeObserverOnPreDrawListenerC8000(c7999);
            c7999.f22096 = viewTreeObserverOnPreDrawListenerC8000;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8000);
        }
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo6735(Drawable drawable) {
        C7999 c7999 = this.f9768;
        ViewTreeObserver viewTreeObserver = c7999.f22098.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c7999.f22096);
        }
        c7999.f22096 = null;
        c7999.f22097.clear();
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6730() {
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6732() {
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo6734() {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo6728(Object obj) {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo6736(Drawable drawable) {
    }

    @Override // p225.InterfaceC7998
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo6737(Drawable drawable) {
    }
}
