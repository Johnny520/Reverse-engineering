package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j40 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public j40(StaggeredGridLayoutManager r1) {
        this.g = r1;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] r1 = this.f;
        if (r1 == null) goto L6;
        Arrays.fill(r1, -1);
        return;
    }
}
