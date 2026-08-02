package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6892h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6893i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6894j;

    public /* synthetic */ mv0(bo0 bo0Var, int i) {
        this.f6892h = 3;
        this.f6893i = bo0Var;
        this.f6894j = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f6892h) {
            case 0:
                qv0 qv0Var = (qv0) this.f6893i;
                int i = this.f6894j;
                qv0Var.f9196r.getClass();
                try {
                    qv0Var.f9183D.m6353k(i, cg0.CANCEL);
                    synchronized (qv0Var) {
                        qv0Var.f9185F.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return a83.f116a;
            case 1:
                qv0 qv0Var2 = (qv0) this.f6893i;
                int i2 = this.f6894j;
                qv0Var2.f9196r.getClass();
                synchronized (qv0Var2) {
                    qv0Var2.f9185F.remove(Integer.valueOf(i2));
                }
                return a83.f116a;
            case 2:
                qv0 qv0Var3 = (qv0) this.f6893i;
                int i3 = this.f6894j;
                qv0Var3.f9196r.getClass();
                try {
                    qv0Var3.f9183D.m6353k(i3, cg0.CANCEL);
                    synchronized (qv0Var3) {
                        qv0Var3.f9185F.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return a83.f116a;
            default:
                bo0 bo0Var = (bo0) this.f6893i;
                return Integer.valueOf(((y03) bo0Var.f960e).f13267b.m2917d(this.f6894j));
        }
    }

    public /* synthetic */ mv0(qv0 qv0Var, int i, Object obj, int i2) {
        this.f6892h = i2;
        this.f6893i = qv0Var;
        this.f6894j = i;
    }

    public /* synthetic */ mv0(qv0 qv0Var, int i, List list, boolean z) {
        this.f6892h = 2;
        this.f6893i = qv0Var;
        this.f6894j = i;
    }
}
