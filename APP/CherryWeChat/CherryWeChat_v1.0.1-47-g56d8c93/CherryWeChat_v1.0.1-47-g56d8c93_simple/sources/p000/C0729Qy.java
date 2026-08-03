package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: Qy */
/* JADX INFO: loaded from: classes.dex */
public final class C0729Qy {

    /* JADX INFO: renamed from: a */
    public int f2336a;

    /* JADX INFO: renamed from: b */
    public int f2337b;

    /* JADX INFO: renamed from: c */
    public boolean f2338c;

    /* JADX INFO: renamed from: d */
    public boolean f2339d;

    /* JADX INFO: renamed from: e */
    public boolean f2340e;

    /* JADX INFO: renamed from: f */
    public int[] f2341f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f2342g;

    public C0729Qy(StaggeredGridLayoutManager r1) {
        this.f2342g = r1;
        m1517a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1517a() {
        this.f2336a = -1;
        this.f2337b = Integer.MIN_VALUE;
        this.f2338c = false;
        this.f2339d = false;
        this.f2340e = false;
        int[] r1 = this.f2341f;
        if (r1 == null) goto L6;
        Arrays.fill(r1, -1);
        return;
    }
}
