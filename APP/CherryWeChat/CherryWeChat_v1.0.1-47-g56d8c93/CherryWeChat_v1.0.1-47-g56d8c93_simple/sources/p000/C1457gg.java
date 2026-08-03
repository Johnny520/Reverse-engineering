package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes.dex */
public final class C1457gg {

    /* JADX INFO: renamed from: a */
    public final C2563ty f5175a;

    /* JADX INFO: renamed from: b */
    public final Executor f5176b;

    public C1457gg(C2563ty r1, Executor r2) {
        this.f5175a = r1;
        this.f5176b = r2;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1457gg) == true) goto L5;
        return false;
    L5:
        return this.f5175a.equals(((C1457gg) r2).f5175a);
    }

    public final int hashCode() {
        return this.f5175a.hashCode();
    }
}
