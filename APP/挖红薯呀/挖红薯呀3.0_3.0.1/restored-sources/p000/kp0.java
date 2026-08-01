package p000;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends bb1 {

    /* JADX INFO: renamed from: b */
    public g31 f3249b;

    /* JADX INFO: renamed from: c */
    public List f3250c;

    /* JADX INFO: renamed from: d */
    public float f3251d;

    /* JADX INFO: renamed from: e */
    public boolean f3252e;

    /* JADX INFO: renamed from: f */
    public boolean f3253f;

    /* JADX INFO: renamed from: g */
    public final C0118d6 f3254g;

    /* JADX INFO: renamed from: h */
    public C0118d6 f3255h;

    /* JADX INFO: renamed from: i */
    public C0118d6 f3256i;

    /* JADX INFO: renamed from: j */
    public final u60 f3257j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kp0() {
        int i = ib1.f2505a;
        this.f3250c = C0294hs.f2354d;
        this.f3251d = 1.0f;
        this.f3252e = true;
        C0118d6 c0118d6M1030a = AbstractC0198f6.m1030a();
        this.f3254g = c0118d6M1030a;
        this.f3255h = c0118d6M1030a;
        this.f3257j = z60.m5422I(C0094cj.f824j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.bb1
    /* JADX INFO: renamed from: a */
    public final void mo218a(InterfaceC0812uq interfaceC0812uq) {
        if (this.f3252e) {
            r60.m3393B(this.f3250c, this.f3254g);
            m1956e();
        } else if (this.f3253f) {
            m1956e();
        }
        this.f3252e = false;
        this.f3253f = false;
        g31 g31Var = this.f3249b;
        if (g31Var != null) {
            InterfaceC0812uq.m4337h0(interfaceC0812uq, this.f3255h, g31Var, 1.0f, null, 56);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1956e() {
        float f = this.f3251d;
        C0118d6 c0118d6 = this.f3254g;
        if (f == 1.0f) {
            this.f3255h = c0118d6;
            return;
        }
        if (p30.m3002l(this.f3255h, c0118d6)) {
            this.f3255h = AbstractC0198f6.m1030a();
        } else {
            Path.FillType fillType = this.f3255h.f973a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f3255h.f973a.rewind();
            Path path = this.f3255h.f973a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        u60 u60Var = this.f3257j;
        ((C0161e6) u60Var.getValue()).f1303a.setPath(c0118d6 != null ? c0118d6.f973a : null, false);
        float length = ((C0161e6) u60Var.getValue()).f1303a.getLength();
        float f2 = 0.0f * length;
        float f3 = ((this.f3251d + 0.0f) % 1.0f) * length;
        if (f2 <= f3) {
            ((C0161e6) u60Var.getValue()).m788a(f2, f3, this.f3255h);
            return;
        }
        C0118d6 c0118d6M1030a = this.f3256i;
        if (c0118d6M1030a == null) {
            c0118d6M1030a = AbstractC0198f6.m1030a();
            this.f3256i = c0118d6M1030a;
        }
        c0118d6M1030a.m638e();
        ((C0161e6) u60Var.getValue()).m788a(f2, length, c0118d6M1030a);
        C0118d6.m634a(this.f3255h, c0118d6M1030a);
        c0118d6M1030a.m638e();
        ((C0161e6) u60Var.getValue()).m788a(0.0f, f3, c0118d6M1030a);
        C0118d6.m634a(this.f3255h, c0118d6M1030a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f3254g.toString();
    }
}
