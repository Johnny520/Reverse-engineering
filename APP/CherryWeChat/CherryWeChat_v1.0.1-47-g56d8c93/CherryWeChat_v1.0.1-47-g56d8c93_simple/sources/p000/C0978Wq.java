package p000;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Wq */
/* JADX INFO: loaded from: classes.dex */
public final class C0978Wq extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final int f3062g;

    public C0978Wq(int r1) {
        this.f3062g = r1;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: o */
    public final float mo191o(InterfaceC1300cy r2) {
        float[] r22 = ((C1021Xq) r2).f3237B;
        if (r22 != null) goto L5;
        return 0.0f;
    L5:
        return r22[this.f3062g];
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: z */
    public final void mo192z(InterfaceC1300cy r4, float r5) {
        C1021Xq r42 = (C1021Xq) r4;
        float[] r0 = r42.f3237B;
        if (r0 == null) goto L13;
        int r1 = this.f3062g;
        if (r0[r1] == r5) goto L14;
        r0[r1] = r5;
        C2464rl r52 = r42.f3239D;
        if (r52 == null) goto L11;
        float r02 = r42.m1922h();
        MaterialButton r53 = (MaterialButton) r52.f8687b;
        int r03 = (int) (r02 * 0.11f);
        if (r53.f4495x == r03) goto L11;
        r53.f4495x = r03;
        r53.m2454j();
        r53.invalidate();
    L11:
        r42.invalidateSelf();
        return;
    L14:
        return;
    }
}
