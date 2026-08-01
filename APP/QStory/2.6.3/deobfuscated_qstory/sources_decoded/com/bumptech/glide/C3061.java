package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.C3048;
import com.bumptech.glide.request.InterfaceC3051;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p222.AbstractC7989;
import p225.C8000;
import p225.InterfaceC7999;
import p225.ViewTreeObserverOnPreDrawListenerC8001;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3061 implements InterfaceC7999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f9776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8000 f9777;

    public C3061(View view) {
        AbstractC7989.m13469(view, "Argument must not be null");
        this.f9776 = view;
        this.f9777 = new C8000(view);
    }

    public final String toString() {
        return "Target for: " + this.f9776;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo6772(InterfaceC3051 interfaceC3051) {
        this.f9776.setTag(R.id.glide_custom_view_target_tag, interfaceC3051);
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo6774(C3048 c3048) {
        this.f9777.f22094.remove(c3048);
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3051 mo6776() {
        Object tag = this.f9776.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3051) {
                return (InterfaceC3051) tag;
            }
            C5925.m11310("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo6778(C3048 c3048) throws Throwable {
        C8000 c8000 = this.f9777;
        ArrayList arrayList = c8000.f22094;
        View view = c8000.f22095;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM13481 = c8000.m13481(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM134812 = c8000.m13481(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM13481 > 0 || iM13481 == Integer.MIN_VALUE) && (iM134812 > 0 || iM134812 == Integer.MIN_VALUE)) {
            c3048.m6598(iM13481, iM134812);
            return;
        }
        if (!arrayList.contains(c3048)) {
            arrayList.add(c3048);
        }
        if (c8000.f22093 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8001 viewTreeObserverOnPreDrawListenerC8001 = new ViewTreeObserverOnPreDrawListenerC8001(c8000);
            c8000.f22093 = viewTreeObserverOnPreDrawListenerC8001;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8001);
        }
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo6780(Drawable drawable) {
        C8000 c8000 = this.f9777;
        ViewTreeObserver viewTreeObserver = c8000.f22095.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c8000.f22093);
        }
        c8000.f22093 = null;
        c8000.f22094.clear();
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6775() {
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6777() {
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo6779() {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo6773(Object obj) {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo6781(Drawable drawable) {
    }

    @Override // p225.InterfaceC7999
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo6782(Drawable drawable) {
    }
}
