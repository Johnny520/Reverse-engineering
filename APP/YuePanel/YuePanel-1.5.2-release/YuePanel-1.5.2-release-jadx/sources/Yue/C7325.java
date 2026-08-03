package Yue;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7325 {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ AtomicLongFieldUpdater f2808 = AtomicLongFieldUpdater.newUpdater(C7325.class, "number");

    @InterfaceC6399
    private volatile /* synthetic */ long number = 1;

    /* JADX INFO: renamed from: ۥ */
    public final long m3573() {
        return f2808.incrementAndGet(this);
    }
}
