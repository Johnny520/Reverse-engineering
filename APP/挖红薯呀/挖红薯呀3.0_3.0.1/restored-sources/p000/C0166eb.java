package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166eb {

    /* JADX INFO: renamed from: a */
    public final sh0 f1367a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0166eb(int i) {
        switch (i) {
            case 1:
                this.f1367a = new sh0(new a70[16]);
                break;
            default:
                this.f1367a = new sh0(new C0965yj[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m825a(CancellationException cancellationException) {
        sh0 sh0Var = this.f1367a;
        int i = sh0Var.f5770f;
        InterfaceC0798uc[] interfaceC0798ucArr = new InterfaceC0798uc[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0798ucArr[i2] = ((C0965yj) sh0Var.f5768d[i2]).f7651b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC0798ucArr[i3].mo543k(cancellationException);
        }
        if (sh0Var.f5770f == 0) {
            return;
        }
        z10.m5363c("uncancelled requests present");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m826b() {
        sh0 sh0Var = this.f1367a;
        z20 z20VarM4893O = w60.m4893O(0, sh0Var.f5770f);
        int i = z20VarM4893O.f7248d;
        int i2 = z20VarM4893O.f7249e;
        if (i <= i2) {
            while (true) {
                ((C0965yj) sh0Var.f5768d[i]).f7651b.mo541i(na1.f4229a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        sh0Var.m4077g();
    }
}
