package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nb0 extends y70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f3259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3261c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0672rj f3262d;

    public nb0(C0672rj c0672rj, ViewGroup viewGroup, View view, View view2) {
        this.f3262d = c0672rj;
        this.f3259a = viewGroup;
        this.f3260b = view;
        this.f3261c = view2;
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: c */
    public final void mo1668c() {
        this.f3259a.getOverlay().remove(this.f3260b);
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: d */
    public final void mo1669d() {
        View view = this.f3260b;
        if (view.getParent() == null) {
            this.f3259a.getOverlay().add(view);
            return;
        }
        C0672rj c0672rj = this.f3262d;
        ArrayList arrayList = c0672rj.f5215m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = c0672rj.f5219q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) c0672rj.f5219q.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((w70) arrayList3.get(i)).mo1667a();
        }
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: e */
    public final void mo1670e(x70 x70Var) {
        this.f3261c.setTag(R.id.save_overlay_view, null);
        this.f3259a.getOverlay().remove(this.f3260b);
        x70Var.m2651u(this);
    }
}
