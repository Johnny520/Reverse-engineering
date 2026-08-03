package p108ha;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import p230p8.C3370v;

/* JADX INFO: renamed from: ha.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1642g {

    /* JADX INFO: renamed from: a */
    public final C1635c0 f5381a;

    /* JADX INFO: renamed from: b */
    public final C3370v f5382b;

    /* JADX INFO: renamed from: c */
    public final EnumC1660t f5383c;

    /* JADX INFO: renamed from: d */
    public final long f5384d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f5385e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public volatile int f5386f;

    /* JADX INFO: renamed from: g */
    public volatile ScheduledFuture f5387g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1642g(C1635c0 c1635c0, C3370v c3370v, EnumC1660t enumC1660t, long j3) {
        this.f5381a = c1635c0;
        this.f5382b = c3370v;
        this.f5383c = enumC1660t;
        this.f5384d = j3;
    }
}
