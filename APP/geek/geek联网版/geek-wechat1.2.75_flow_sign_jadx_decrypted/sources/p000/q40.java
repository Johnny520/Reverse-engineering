package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q40 {

    /* JADX INFO: renamed from: a */
    public int f3793a;

    /* JADX INFO: renamed from: b */
    public int f3794b;

    /* JADX INFO: renamed from: c */
    public boolean f3795c;

    /* JADX INFO: renamed from: d */
    public boolean f3796d;

    /* JADX INFO: renamed from: e */
    public boolean f3797e;

    /* JADX INFO: renamed from: f */
    public int[] f3798f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3799g;

    public q40(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3799g = staggeredGridLayoutManager;
        m2112a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2112a() {
        this.f3793a = -1;
        this.f3794b = Integer.MIN_VALUE;
        this.f3795c = false;
        this.f3796d = false;
        this.f3797e = false;
        int[] iArr = this.f3798f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
