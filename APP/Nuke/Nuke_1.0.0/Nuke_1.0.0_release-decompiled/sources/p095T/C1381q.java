package p095T;

import p158f0.C2087s;

/* JADX INFO: renamed from: T.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1381q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4860b;

    public /* synthetic */ C1381q(int i5, Object obj) {
        this.f4859a = i5;
        this.f4860b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2544a() {
        switch (this.f4859a) {
            case 0:
                C1383r c1383r = (C1383r) this.f4860b;
                c1383r.f4863A--;
                break;
            default:
                C2087s c2087s = (C2087s) this.f4860b;
                c2087s.f6993k--;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2545b() {
        switch (this.f4859a) {
            case 0:
                ((C1383r) this.f4860b).f4863A++;
                break;
            default:
                ((C2087s) this.f4860b).f6993k++;
                break;
        }
    }
}
