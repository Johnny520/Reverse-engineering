package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.C3880;
import com.bumptech.glide.request.InterfaceC3883;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import p238.AbstractC8818;
import p241.C8829;
import p241.InterfaceC8828;
import p241.ViewTreeObserverOnPreDrawListenerC8830;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3893 implements InterfaceC8828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View f10121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8829 f10122;

    public C3893(View view) {
        AbstractC8818.m14028(view, "Argument must not be null");
        this.f10121 = view;
        this.f10122 = new C8829(view);
    }

    public final String toString() {
        return "Target for: " + this.f10121;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo7332(InterfaceC3883 interfaceC3883) {
        this.f10121.setTag(C0328R.id.glide_custom_view_target_tag, interfaceC3883);
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo7334(C3880 c3880) {
        this.f10122.f22439.remove(c3880);
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3883 mo7336() {
        Object tag = this.f10121.getTag(C0328R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC3883) {
                return (InterfaceC3883) tag;
            }
            C6755.m11869("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7338(C3880 c3880) throws Throwable {
        C8829 c8829 = this.f10122;
        ArrayList arrayList = c8829.f22439;
        View view = c8829.f22440;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM14040 = c8829.m14040(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM140402 = c8829.m14040(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM14040 > 0 || iM14040 == Integer.MIN_VALUE) && (iM140402 > 0 || iM140402 == Integer.MIN_VALUE)) {
            c3880.m7158(iM14040, iM140402);
            return;
        }
        if (!arrayList.contains(c3880)) {
            arrayList.add(c3880);
        }
        if (c8829.f22438 == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC8830 viewTreeObserverOnPreDrawListenerC8830 = new ViewTreeObserverOnPreDrawListenerC8830(c8829);
            c8829.f22438 = viewTreeObserverOnPreDrawListenerC8830;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8830);
        }
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo7340(Drawable drawable) {
        C8829 c8829 = this.f10122;
        ViewTreeObserver viewTreeObserver = c8829.f22440.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c8829.f22438);
        }
        c8829.f22438 = null;
        c8829.f22439.clear();
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7335() {
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7337() {
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo7339() {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo7333(Object obj) {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo7341(Drawable drawable) {
    }

    @Override // p241.InterfaceC8828
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo7342(Drawable drawable) {
    }
}
