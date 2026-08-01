package ad;

import p172l8.C4700i0;
import p185m8.C5096o;

/* JADX INFO: renamed from: ad.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0269k {

    /* JADX INFO: renamed from: a */
    public final C5096o f660a = new C5096o();

    /* JADX INFO: renamed from: b */
    public int f661b;

    /* JADX INFO: renamed from: a */
    public final void m791a(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            try {
                if (this.f661b + cArr.length < AbstractC0257g.f637a) {
                    this.f661b += cArr.length;
                    this.f660a.addLast(cArr);
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final char[] m792b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f660a.m20636y();
            if (cArr != null) {
                this.f661b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
