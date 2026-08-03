package ac;

import p077f8.AbstractC1089i;

/* JADX INFO: renamed from: ac.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0060m implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f183g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferencesC0062o f184h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0060m(SharedPreferencesC0062o sharedPreferencesC0062o, int i9) {
        this.f183g = i9;
        this.f184h = sharedPreferencesC0062o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f183g) {
            case 0:
                AbstractC1089i.m2750T0(this.f184h);
                return;
            default:
                SharedPreferencesC0062o sharedPreferencesC0062o = this.f184h;
                synchronized (sharedPreferencesC0062o) {
                    try {
                        synchronized (sharedPreferencesC0062o.f196f) {
                            sharedPreferencesC0062o.f197g = true;
                            sharedPreferencesC0062o.f196f.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC1089i.m2768g0(sharedPreferencesC0062o) && sharedPreferencesC0062o.f213w == 0) {
                            AbstractC1089i.m2766f0(sharedPreferencesC0062o);
                        }
                        if (sharedPreferencesC0062o.f198h == null) {
                            sharedPreferencesC0062o.f198h = new C0058k(SharedPreferencesC0062o.f188A);
                        }
                        if (sharedPreferencesC0062o.f194d == 0) {
                            sharedPreferencesC0062o.f194d = 12;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
