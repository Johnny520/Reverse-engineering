package p000a;

import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0855u5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IPlugin f3360b;

    public /* synthetic */ RunnableC0855u5(IPlugin iPlugin, int i) {
        this.f3359a = i;
        this.f3360b = iPlugin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3359a) {
            case 0:
                if (this == ((C0874v5) this.f3360b).f3424e) {
                    C0915x8 c0915x8 = C0915x8.f3530a;
                    if (!C0915x8.m2203a()) {
                        ((C0874v5) this.f3360b).f3425f++;
                        long j = ((C0874v5) this.f3360b).f3425f <= 60 ? 1000L : 5000L;
                        ((C0874v5) this.f3360b).getClass();
                        if (C0874v5.m2093f() && ((C0874v5) this.f3360b).f3420a) {
                            ((C0874v5) this.f3360b).m2100l();
                            if (!((C0874v5) this.f3360b).f3421b.isEmpty()) {
                                ((C0874v5) this.f3360b).m2099k();
                                ((C0874v5) this.f3360b).f3423d.postDelayed(this, j);
                            } else {
                                ((C0874v5) this.f3360b).m2099k();
                                ((C0874v5) this.f3360b).m2098j();
                                String str = ((C0874v5) this.f3360b).f3425f <= 60 ? "fast" : "slow";
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"DotIndicator: DB checker: all read, dot hidden (after " + ((C0874v5) this.f3360b).f3425f + " checks, " + str + ")"}, 1));
                            }
                        } else {
                            ((C0874v5) this.f3360b).m2098j();
                        }
                    } else {
                        ((C0874v5) this.f3360b).f3423d.postDelayed(this, 5000L);
                    }
                    break;
                }
                break;
            case 1:
                if (this == ((C0874v5) this.f3360b).f3424e) {
                    ((C0874v5) this.f3360b).f3425f++;
                    ((C0874v5) this.f3360b).getClass();
                    if (C0874v5.m2093f() && ((C0874v5) this.f3360b).f3420a && ((C0874v5) this.f3360b).f3425f <= 8) {
                        ((C0874v5) this.f3360b).m2100l();
                        if (!((C0874v5) this.f3360b).f3421b.isEmpty()) {
                            ((C0874v5) this.f3360b).m2099k();
                            ((C0874v5) this.f3360b).f3423d.postDelayed(this, 400L);
                        } else {
                            ((C0874v5) this.f3360b).m2099k();
                            ((C0874v5) this.f3360b).m2098j();
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(((C0874v5) this.f3360b).f3425f, "DotIndicator: fast-recheck: all read, dot hidden (after ", " checks)")}, 1));
                        }
                    } else {
                        ((C0874v5) this.f3360b).m2098j();
                        if (((C0874v5) this.f3360b).f3420a) {
                            ((C0874v5) this.f3360b).m2097i();
                        }
                    }
                    break;
                }
                break;
            default:
                if (this == ((C0738o2) this.f3360b).f2919f) {
                    ((C0738o2) this.f3360b).f2920g++;
                    ((C0738o2) this.f3360b).getClass();
                    if (C0738o2.m1747e() && ((C0738o2) this.f3360b).f2914a && ((C0738o2) this.f3360b).f2920g <= 8) {
                        ((C0738o2) this.f3360b).m1755l();
                        if (!((C0738o2) this.f3360b).f2916c.isEmpty()) {
                            ((C0738o2) this.f3360b).m1754k();
                            ((C0738o2) this.f3360b).f2918e.postDelayed(this, 400L);
                        } else {
                            ((C0738o2) this.f3360b).m1754k();
                            ((C0738o2) this.f3360b).m1753j();
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(((C0738o2) this.f3360b).f2920g, "BoldBottomTab: fast-recheck: all read, bold reset (after ", " checks)")}, 1));
                        }
                    } else {
                        ((C0738o2) this.f3360b).m1753j();
                        if (((C0738o2) this.f3360b).f2914a) {
                            ((C0738o2) this.f3360b).m1752i();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
