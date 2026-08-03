package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1220y {
    /* JADX INFO: renamed from: a */
    public static int m3004a(RecyclerView.C1186w c1186w, AbstractC1214s abstractC1214s, View view, View view2, RecyclerView.AbstractC1175l abstractC1175l, boolean z) {
        if (abstractC1175l.m2860v() == 0 || c1186w.m2887b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.AbstractC1175l.m2827H(view) - RecyclerView.AbstractC1175l.m2827H(view2)) + 1;
        }
        return Math.min(abstractC1214s.mo2989l(), abstractC1214s.mo2979b(view2) - abstractC1214s.mo2982e(view));
    }

    /* JADX INFO: renamed from: b */
    public static int m3005b(RecyclerView.C1186w c1186w, AbstractC1214s abstractC1214s, View view, View view2, RecyclerView.AbstractC1175l abstractC1175l, boolean z, boolean z2) {
        if (abstractC1175l.m2860v() == 0 || c1186w.m2887b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c1186w.m2887b() - Math.max(RecyclerView.AbstractC1175l.m2827H(view), RecyclerView.AbstractC1175l.m2827H(view2))) - 1) : Math.max(0, Math.min(RecyclerView.AbstractC1175l.m2827H(view), RecyclerView.AbstractC1175l.m2827H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC1214s.mo2979b(view2) - abstractC1214s.mo2982e(view)) / (Math.abs(RecyclerView.AbstractC1175l.m2827H(view) - RecyclerView.AbstractC1175l.m2827H(view2)) + 1))) + (abstractC1214s.mo2988k() - abstractC1214s.mo2982e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m3006c(RecyclerView.C1186w c1186w, AbstractC1214s abstractC1214s, View view, View view2, RecyclerView.AbstractC1175l abstractC1175l, boolean z) {
        if (abstractC1175l.m2860v() == 0 || c1186w.m2887b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1186w.m2887b();
        }
        return (int) (((abstractC1214s.mo2979b(view2) - abstractC1214s.mo2982e(view)) / (Math.abs(RecyclerView.AbstractC1175l.m2827H(view) - RecyclerView.AbstractC1175l.m2827H(view2)) + 1)) * c1186w.m2887b());
    }
}
