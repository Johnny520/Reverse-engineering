package p000;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: qe */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0649qe extends AbstractC0493n {

    /* JADX INFO: renamed from: O */
    public nr0 f5131O;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: A0 */
    public final s51 mo689A0() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: I0 */
    public final boolean mo691I0(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n
    /* JADX INFO: renamed from: J0 */
    public final void mo692J0(KeyEvent keyEvent) {
        this.f4109y.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n, p000.qr0
    /* JADX INFO: renamed from: U */
    public final void mo758U() {
        super.mo758U();
        if (this.f5131O != null) {
            this.f5131O = null;
            m2613D0(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0493n, p000.qr0
    /* JADX INFO: renamed from: x */
    public final void mo762x(ir0 ir0Var, jr0 jr0Var, long j) {
        super.mo762x(ir0Var, jr0Var, j);
        if (jr0Var != jr0.f2934e) {
            if (jr0Var != jr0.f2935f || this.f5131O == null) {
                return;
            }
            List list = ir0Var.f2610a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nr0 nr0Var = (nr0) list.get(i);
                if (nr0Var.m2737b() && nr0Var != this.f5131O) {
                    this.f5131O = null;
                    m2613D0(false);
                    return;
                }
            }
            return;
        }
        nr0 nr0Var2 = this.f5131O;
        if (nr0Var2 == null) {
            if (m61.m2440d(ir0Var, true)) {
                nr0 nr0Var3 = (nr0) ir0Var.f2610a.get(0);
                nr0Var3.m2736a();
                this.f5131O = nr0Var3;
                if (this.f4108x) {
                    m2615F0(nr0Var3.f4307c, false);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = ir0Var.f2610a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!w60.m4903j((nr0) list2.get(i2))) {
                long jMo644M = pf1.m3039Q(this).f388B.mo644M(((nc1) pf1.m3058r(this, AbstractC0131dj.f1132s)).mo2692e());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo644M >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo644M & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    nr0 nr0Var4 = (nr0) list2.get(i3);
                    if (nr0Var4.m2737b() || w60.m4879A(nr0Var4, j, jFloatToRawIntBits)) {
                        this.f5131O = null;
                        m2613D0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((nr0) list2.get(0)).m2736a();
        if (this.f4108x) {
            m2614E0(nr0Var2.f4307c, false);
            this.f4109y.invoke();
        }
        this.f5131O = null;
    }
}
