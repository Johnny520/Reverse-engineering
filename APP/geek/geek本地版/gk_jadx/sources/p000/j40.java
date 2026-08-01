package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j40 {

    /* JADX INFO: renamed from: a */
    public int f2547a;

    /* JADX INFO: renamed from: b */
    public int f2548b;

    /* JADX INFO: renamed from: c */
    public boolean f2549c;

    /* JADX INFO: renamed from: d */
    public boolean f2550d;

    /* JADX INFO: renamed from: e */
    public boolean f2551e;

    /* JADX INFO: renamed from: f */
    public int[] f2552f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f2553g;

    public j40(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2553g = staggeredGridLayoutManager;
        m1546a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1546a() {
        this.f2547a = -1;
        this.f2548b = Integer.MIN_VALUE;
        this.f2549c = false;
        this.f2550d = false;
        this.f2551e = false;
        int[] iArr = this.f2552f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
