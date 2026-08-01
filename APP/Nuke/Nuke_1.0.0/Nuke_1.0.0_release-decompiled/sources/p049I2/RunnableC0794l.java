package p049I2;

import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: I2.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0794l implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2540d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SharedPreferencesC0796n f2541e;

    public /* synthetic */ RunnableC0794l(SharedPreferencesC0796n sharedPreferencesC0796n, int i5) {
        this.f2540d = i5;
        this.f2541e = sharedPreferencesC0796n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2540d) {
            case 0:
                SharedPreferencesC0796n sharedPreferencesC0796n = this.f2541e;
                sharedPreferencesC0796n.getClass();
                AbstractC1784a.m3216b0(sharedPreferencesC0796n);
                return;
            default:
                SharedPreferencesC0796n sharedPreferencesC0796n2 = this.f2541e;
                synchronized (sharedPreferencesC0796n2) {
                    try {
                        synchronized (sharedPreferencesC0796n2.f2553f) {
                            sharedPreferencesC0796n2.f2554g = true;
                            sharedPreferencesC0796n2.f2553f.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC1784a.m3192F(sharedPreferencesC0796n2) && sharedPreferencesC0796n2.f2569v == 0) {
                            AbstractC1784a.m3191E(sharedPreferencesC0796n2);
                        }
                        if (sharedPreferencesC0796n2.f2555h == null) {
                            sharedPreferencesC0796n2.f2555h = new C0793k(SharedPreferencesC0796n.f2547z, 0);
                        }
                        if (sharedPreferencesC0796n2.f2551d == 0) {
                            sharedPreferencesC0796n2.f2551d = 12;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
