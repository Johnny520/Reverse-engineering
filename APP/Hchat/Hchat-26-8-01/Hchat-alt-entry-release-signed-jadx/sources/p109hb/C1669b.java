package p109hb;

import gg.AbstractC1416l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: hb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1669b {

    /* JADX INFO: renamed from: a */
    public final String f5509a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f5510b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f5511c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1669b(String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f5509a = str;
        this.f5510b = atomicBoolean;
        this.f5511c = countDownLatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669b)) {
            return false;
        }
        C1669b c1669b = (C1669b) obj;
        return AbstractC1416l.m3825a(this.f5509a, c1669b.f5509a) && AbstractC1416l.m3825a(this.f5510b, c1669b.f5510b) && AbstractC1416l.m3825a(this.f5511c, c1669b.f5511c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5511c.hashCode() + ((this.f5510b.hashCode() + (this.f5509a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SendOperation(id=" + this.f5509a + ", canceled=" + this.f5510b + ", cancelSignal=" + this.f5511c + ")";
    }
}
