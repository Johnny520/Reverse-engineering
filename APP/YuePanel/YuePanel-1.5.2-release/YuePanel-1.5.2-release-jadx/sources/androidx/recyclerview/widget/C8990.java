package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥۣ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8990 {
    /* JADX INFO: renamed from: ۥ */
    public static int m5005(RecyclerView.C8935 c8935, AbstractC8987 abstractC8987, View view, View view2, RecyclerView.AbstractC8919 abstractC8919, boolean z) {
        if (abstractC8919.getChildCount() == 0 || c8935.m30375() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC8919.getPosition(view) - abstractC8919.getPosition(view2)) + 1;
        }
        return Math.min(abstractC8987.mo30711(), abstractC8987.mo30700(view2) - abstractC8987.mo30703(view));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m5006(RecyclerView.C8935 c8935, AbstractC8987 abstractC8987, View view, View view2, RecyclerView.AbstractC8919 abstractC8919, boolean z, boolean z2) {
        if (abstractC8919.getChildCount() == 0 || c8935.m30375() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c8935.m30375() - Math.max(abstractC8919.getPosition(view), abstractC8919.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC8919.getPosition(view), abstractC8919.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC8987.mo30700(view2) - abstractC8987.mo30703(view)) / (Math.abs(abstractC8919.getPosition(view) - abstractC8919.getPosition(view2)) + 1))) + (abstractC8987.mo30710() - abstractC8987.mo30703(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m30725(RecyclerView.C8935 c8935, AbstractC8987 abstractC8987, View view, View view2, RecyclerView.AbstractC8919 abstractC8919, boolean z) {
        if (abstractC8919.getChildCount() == 0 || c8935.m30375() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c8935.m30375();
        }
        return (int) (((abstractC8987.mo30700(view2) - abstractC8987.mo30703(view)) / (Math.abs(abstractC8919.getPosition(view) - abstractC8919.getPosition(view2)) + 1)) * c8935.m30375());
    }
}
