package p000a;

import java.util.ArrayList;
import p000a.C0222M3;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.a8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478a8 extends C0240N3 {

    /* JADX INFO: renamed from: e0 */
    public float f1792e0 = -1.0f;

    /* JADX INFO: renamed from: f0 */
    public int f1793f0 = -1;

    /* JADX INFO: renamed from: g0 */
    public int f1794g0 = -1;

    /* JADX INFO: renamed from: h0 */
    public C0222M3 f1795h0 = this.f838z;

    /* JADX INFO: renamed from: i0 */
    public int f1796i0 = 0;

    public C0478a8() {
        this.f790H.clear();
        this.f790H.add(this.f1795h0);
        int length = this.f789G.length;
        for (int i = 0; i < length; i++) {
            this.f789G[i] = this.f1795h0;
        }
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: A */
    public final void mo637A(C0029B9 c0029b9) {
        if (this.f793K == null) {
            return;
        }
        C0222M3 c0222m3 = this.f1795h0;
        c0029b9.getClass();
        int iM69m = C0029B9.m69m(c0222m3);
        if (this.f1796i0 == 1) {
            this.f798P = iM69m;
            this.f799Q = 0;
            m658v(this.f793K.m645i());
            m661y(0);
            return;
        }
        this.f798P = 0;
        this.f799Q = iM69m;
        m661y(this.f793K.m648l());
        m658v(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m1163B(int i) {
        if (this.f1796i0 == i) {
            return;
        }
        this.f1796i0 = i;
        ArrayList<C0222M3> arrayList = this.f790H;
        arrayList.clear();
        if (this.f1796i0 == 1) {
            this.f1795h0 = this.f837y;
        } else {
            this.f1795h0 = this.f838z;
        }
        arrayList.add(this.f1795h0);
        C0222M3[] c0222m3Arr = this.f789G;
        int length = c0222m3Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0222m3Arr[i2] = this.f1795h0;
        }
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: a */
    public final void mo357a(C0029B9 c0029b9) {
        C0258O3 c0258o3 = (C0258O3) this.f793K;
        if (c0258o3 == null) {
            return;
        }
        C0222M3 c0222m3Mo643g = c0258o3.mo643g(C0222M3.a.f751a);
        C0222M3 c0222m3Mo643g2 = c0258o3.mo643g(C0222M3.a.f753c);
        C0240N3 c0240n3 = this.f793K;
        C0240N3.a aVar = C0240N3.a.f840b;
        boolean z = c0240n3 != null && c0240n3.f792J[0] == aVar;
        if (this.f1796i0 == 0) {
            c0222m3Mo643g = c0258o3.mo643g(C0222M3.a.f752b);
            c0222m3Mo643g2 = c0258o3.mo643g(C0222M3.a.f754d);
            C0240N3 c0240n32 = this.f793K;
            z = c0240n32 != null && c0240n32.f792J[1] == aVar;
        }
        if (this.f1793f0 != -1) {
            C0693le c0693leM79j = c0029b9.m79j(this.f1795h0);
            c0029b9.m74e(c0693leM79j, c0029b9.m79j(c0222m3Mo643g), this.f1793f0, 8);
            if (z) {
                c0029b9.m75f(c0029b9.m79j(c0222m3Mo643g2), c0693leM79j, 0, 5);
                return;
            }
            return;
        }
        if (this.f1794g0 != -1) {
            C0693le c0693leM79j2 = c0029b9.m79j(this.f1795h0);
            C0693le c0693leM79j3 = c0029b9.m79j(c0222m3Mo643g2);
            c0029b9.m74e(c0693leM79j2, c0693leM79j3, -this.f1794g0, 8);
            if (z) {
                c0029b9.m75f(c0693leM79j2, c0029b9.m79j(c0222m3Mo643g), 0, 5);
                c0029b9.m75f(c0693leM79j3, c0693leM79j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f1792e0 != -1.0f) {
            C0693le c0693leM79j4 = c0029b9.m79j(this.f1795h0);
            C0693le c0693leM79j5 = c0029b9.m79j(c0222m3Mo643g2);
            float f = this.f1792e0;
            C0184K1 c0184k1M80k = c0029b9.m80k();
            c0184k1M80k.f636d.mo343c(c0693leM79j4, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693leM79j5, f);
            c0029b9.m72c(c0184k1M80k);
        }
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: b */
    public final boolean mo638b() {
        return true;
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: g */
    public final C0222M3 mo643g(C0222M3.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f1796i0 == 1) {
                    return this.f1795h0;
                }
                break;
            case 2:
            case 4:
                if (this.f1796i0 == 0) {
                    return this.f1795h0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
