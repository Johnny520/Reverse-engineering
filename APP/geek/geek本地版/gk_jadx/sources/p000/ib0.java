package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 extends s70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f2406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f2408c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0599pj f2409d;

    public ib0(C0599pj c0599pj, ViewGroup viewGroup, View view, View view2) {
        this.f2409d = c0599pj;
        this.f2406a = viewGroup;
        this.f2407b = view;
        this.f2408c = view2;
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: c */
    public final void mo1429c() {
        this.f2406a.getOverlay().remove(this.f2407b);
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: d */
    public final void mo1430d() {
        View view = this.f2407b;
        if (view.getParent() == null) {
            this.f2406a.getOverlay().add(view);
            return;
        }
        C0599pj c0599pj = this.f2409d;
        ArrayList arrayList = c0599pj.f4237m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = c0599pj.f4241q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) c0599pj.f4241q.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((q70) arrayList3.get(i)).mo1581a();
        }
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: e */
    public final void mo1431e(r70 r70Var) {
        this.f2408c.setTag(R.id.save_overlay_view, null);
        this.f2406a.getOverlay().remove(this.f2407b);
        r70Var.m2273u(this);
    }
}
