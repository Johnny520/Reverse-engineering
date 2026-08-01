package p215oc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.C5793k;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: oc.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5720o extends AbstractC5722q {

    /* JADX INFO: renamed from: b */
    public static final a f18048b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f18049c = AtomicIntegerFieldUpdater.newUpdater(C5720o.class, "a");

    /* JADX INFO: renamed from: a */
    public volatile int f18050a;

    @Override // p215oc.AbstractC5722q
    /* JADX INFO: renamed from: a */
    public void mo23134a() {
        f18049c.incrementAndGet(this);
    }

    @Override // p215oc.AbstractC5722q
    /* JADX INFO: renamed from: b */
    public boolean mo23135b() {
        return this.f18050a > 0;
    }

    @Override // p215oc.AbstractC5722q
    /* JADX INFO: renamed from: c */
    public boolean mo23136c() {
        if (this.f18050a == 0) {
            return false;
        }
        int iDecrementAndGet = f18049c.decrementAndGet(this);
        if (iDecrementAndGet >= 0) {
            return true;
        }
        if (iDecrementAndGet == -1) {
            this.f18050a = 0;
            return false;
        }
        C5793k.m23285a("Shared copies count is negative: ", iDecrementAndGet + 1);
        return false;
    }

    /* JADX INFO: renamed from: oc.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
