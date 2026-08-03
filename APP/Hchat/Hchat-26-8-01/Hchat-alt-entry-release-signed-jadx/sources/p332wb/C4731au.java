package p332wb;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p080fb.C1142k2;
import p080fb.EnumC1182u2;

/* JADX INFO: renamed from: wb.au */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4731au {

    /* JADX INFO: renamed from: a */
    public final C1142k2 f15941a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f15942b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f15943c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4731au(C1142k2 c1142k2) {
        c1142k2.getClass();
        this.f15941a = c1142k2;
        this.f15942b = new AtomicReference(null);
        this.f15943c = new CountDownLatch(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9244a(EnumC1182u2 enumC1182u2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f15942b;
            if (atomicReference.compareAndSet(null, enumC1182u2)) {
                this.f15943c.countDown();
                return;
            }
        } while (atomicReference.get() == null);
    }
}
