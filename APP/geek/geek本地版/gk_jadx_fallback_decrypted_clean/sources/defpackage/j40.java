package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j40 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager g;

    public j40(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            r0.a()
            return
    }

    public final void a() {
            r2 = this;
            r0 = -1
            r2.a = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.b = r1
            r1 = 0
            r2.c = r1
            r2.d = r1
            r2.e = r1
            int[] r1 = r2.f
            if (r1 == 0) goto L15
            java.util.Arrays.fill(r1, r0)
        L15:
            return
    }
}
