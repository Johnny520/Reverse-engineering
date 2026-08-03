package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: gh */
/* JADX INFO: loaded from: classes.dex */
public final class C1458gh extends AbstractC2603uv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1545ih f5177a;

    public C1458gh(C1545ih r1) {
        this.f5177a = r1;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView r9, int r10, int r11) {
        int r102 = r9.computeHorizontalScrollOffset();
        int r92 = r9.computeVerticalScrollOffset();
        C1545ih r112 = this.f5177a;
        int r0 = r112.f5470a;
        int r1 = r112.f5488s.computeVerticalScrollRange();
        int r2 = r112.f5487r;
        if ((r1 - r2) <= 0) goto L6;
        if (r2 < r0) goto L6;
        boolean r3 = true;
    L7:
        r112.f5489t = r3;
        int r32 = r112.f5488s.computeHorizontalScrollRange();
        int r6 = r112.f5486q;
        if ((r32 - r6) <= 0) goto L11;
        if (r6 < r0) goto L11;
        boolean r02 = true;
    L12:
        r112.f5490u = r02;
        boolean r7 = r112.f5489t;
        if (r7 == true) goto L20;
        if (r02 == true) goto L20;
        if (r112.f5491v == 0) goto L29;
        r112.m2967g(0);
        return;
    L29:
        return;
    L20:
        if (r7 == false) goto L23;
        float r4 = r2;
        r112.f5481l = (int) ((((r4 / 2.0f) + r92) * r4) / r1);
        r112.f5480k = Math.min(r2, (r2 * r2) / r1);
    L23:
        if (r112.f5490u == false) goto L25;
        float r93 = r102;
        float r103 = r6;
        r112.f5484o = (int) ((((r103 / 2.0f) + r93) * r103) / r32);
        r112.f5483n = Math.min(r6, (r6 * r6) / r32);
    L25:
        int r94 = r112.f5491v;
        if (r94 == 0) goto L30;
        if (r94 == 1) goto L30;
        return;
    L30:
        r112.m2967g(1);
        return;
    L11:
        r02 = false;
    L6:
        r3 = false;
        goto L7
    }
}
