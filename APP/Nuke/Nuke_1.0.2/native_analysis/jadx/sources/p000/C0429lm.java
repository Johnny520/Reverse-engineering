package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lm */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0429lm {

    /* JADX INFO: renamed from: a */
    public final zk1 f6190a;

    public C0429lm(int i) {
        switch (i) {
            case 1:
                this.f6190a = new zk1(new p71[16]);
                break;
            default:
                this.f6190a = new zk1(new d00[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2941a(CancellationException cancellationException) {
        zk1 zk1Var = this.f6190a;
        int i = zk1Var.f13936j;
        InterfaceC0432lp[] interfaceC0432lpArr = new InterfaceC0432lp[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0432lpArr[i2] = ((d00) zk1Var.f13934h[i2]).f1799b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC0432lpArr[i3].mo2512n(cancellationException);
        }
        if (zk1Var.f13936j == 0) {
            return;
        }
        nz0.m3458c("uncancelled requests present");
    }

    /* JADX INFO: renamed from: b */
    public void m2942b() {
        zk1 zk1Var = this.f6190a;
        c11 c11VarM799X = ci0.m799X(0, zk1Var.f13936j);
        int i = c11VarM799X.f25h;
        int i2 = c11VarM799X.f26i;
        if (i <= i2) {
            while (true) {
                ((d00) zk1Var.f13934h[i]).f1799b.mo2509h(a83.f116a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        zk1Var.m6428g();
    }
}
