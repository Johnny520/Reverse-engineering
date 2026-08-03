package p000;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: Wq */
/* JADX INFO: loaded from: classes.dex */
public final class C0978Wq extends AbstractC0671Pj {

    /* JADX INFO: renamed from: g */
    public final int f3062g;

    public C0978Wq(int i) {
        this.f3062g = i;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: o */
    public final float mo191o(InterfaceC1300cy interfaceC1300cy) {
        float[] fArr = ((C1021Xq) interfaceC1300cy).f3237B;
        if (fArr != null) {
            return fArr[this.f3062g];
        }
        return 0.0f;
    }

    @Override // p000.AbstractC0671Pj
    /* JADX INFO: renamed from: z */
    public final void mo192z(InterfaceC1300cy interfaceC1300cy, float f) {
        C1021Xq c1021Xq = (C1021Xq) interfaceC1300cy;
        float[] fArr = c1021Xq.f3237B;
        if (fArr != null) {
            int i = this.f3062g;
            if (fArr[i] != f) {
                fArr[i] = f;
                C2464rl c2464rl = c1021Xq.f3239D;
                if (c2464rl != null) {
                    float fM1922h = c1021Xq.m1922h();
                    MaterialButton materialButton = (MaterialButton) c2464rl.f8687b;
                    int i2 = (int) (fM1922h * 0.11f);
                    if (materialButton.f4495x != i2) {
                        materialButton.f4495x = i2;
                        materialButton.m2454j();
                        materialButton.invalidate();
                    }
                }
                c1021Xq.invalidateSelf();
            }
        }
    }
}
