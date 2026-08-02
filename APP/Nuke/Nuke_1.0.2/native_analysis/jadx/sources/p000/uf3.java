package p000;

import java.util.ArrayList;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements fa1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ s00 f11278h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0880xb f11279i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ i62 f11280j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ o72 f11281k;

    public uf3(s00 s00Var, C0880xb c0880xb, i62 i62Var, o72 o72Var) {
        this.f11278h = s00Var;
        this.f11279i = c0880xb;
        this.f11280j = i62Var;
        this.f11281k = o72Var;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        boolean z;
        InterfaceC0432lp interfaceC0432lpM2294y = null;
        switch (tf3.f10726a[z91Var.ordinal()]) {
            case 1:
                AbstractC0570p7.m3745A(this.f11278h, null, new C0379k9(this.f11281k, this.f11280j, ia1Var, this, null, 11), 1);
                return;
            case 2:
                C0880xb c0880xb = this.f11279i;
                if (c0880xb != null) {
                    f90 f90Var = (f90) c0880xb.f12935j;
                    synchronized (f90Var.f2863b) {
                        try {
                            synchronized (f90Var.f2863b) {
                                z = f90Var.f2862a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) f90Var.f2864c;
                                f90Var.f2864c = (ArrayList) f90Var.f2865d;
                                f90Var.f2865d = arrayList;
                                f90Var.f2862a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((t00) arrayList.get(i)).mo2509h(a83.f116a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i62 i62Var = this.f11280j;
                synchronized (i62Var.f4293c) {
                    if (i62Var.f4310t) {
                        i62Var.f4310t = false;
                        interfaceC0432lpM2294y = i62Var.m2294y();
                    }
                    break;
                }
                if (interfaceC0432lpM2294y != null) {
                    ((C0469mp) interfaceC0432lpM2294y).mo2509h(a83.f116a);
                    return;
                }
                return;
            case 3:
                i62 i62Var2 = this.f11280j;
                synchronized (i62Var2.f4293c) {
                    i62Var2.f4310t = true;
                }
                return;
            case 4:
                this.f11280j.m2293x();
                return;
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
            case 7:
                return;
            default:
                c80.m675s();
                return;
        }
    }
}
