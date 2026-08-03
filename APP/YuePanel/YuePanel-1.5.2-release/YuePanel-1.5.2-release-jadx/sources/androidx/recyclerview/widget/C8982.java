package androidx.recyclerview.widget;

import Yue.C6193;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8982 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30302 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f30303 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f30304 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f30305 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f30306 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3974;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f30307;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f30308;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f30309;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f30312;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f30313;

    /* JADX INFO: renamed from: ۥ */
    public boolean f3973 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f30310 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f30311 = 0;

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3974 + ", mCurrentPosition=" + this.f30307 + ", mItemDirection=" + this.f30308 + ", mLayoutDirection=" + this.f30309 + ", mStartLine=" + this.f30310 + ", mEndLine=" + this.f30311 + C6193.f1885;
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4996(RecyclerView.C8935 c8935) {
        int i = this.f30307;
        return i >= 0 && i < c8935.m30375();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public View m4997(RecyclerView.C8929 c8929) {
        View viewM30337 = c8929.m30337(this.f30307);
        this.f30307 += this.f30308;
        return viewM30337;
    }
}
