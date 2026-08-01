package p000;

import android.content.Context;

/* JADX INFO: renamed from: bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0067bg extends AbstractC0545o3 {

    /* JADX INFO: renamed from: c */
    public boolean f727c;

    /* JADX INFO: renamed from: d */
    public boolean f728d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f729e;

    /* JADX INFO: renamed from: j */
    public final C0138d4 m521j(Context context) {
        if (this.f728d) {
            return this.f729e;
        }
        n40 n40Var = (n40) this.f3364a;
        C0138d4 c0138d4M1209x = g80.m1209x(context, n40Var.f3216c, n40Var.f3214a == 2, this.f727c);
        this.f729e = c0138d4M1209x;
        this.f728d = true;
        return c0138d4M1209x;
    }
}
