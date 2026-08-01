package p295u6;

import java.io.Closeable;
import p310v6.C8843d;

/* JADX INFO: renamed from: u6.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8554s implements Closeable {

    /* JADX INFO: renamed from: q */
    public final C8552q f28548q;

    /* JADX INFO: renamed from: r */
    public final C8843d f28549r;

    public AbstractC8554s(C8552q c8552q, C8843d c8843d) {
        c8552q.getClass();
        c8843d.getClass();
        this.f28548q = c8552q;
        this.f28549r = c8843d;
    }

    /* JADX INFO: renamed from: c */
    public final C8552q m32926c() {
        return this.f28548q;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m32927d();
    }

    /* JADX INFO: renamed from: d */
    public final void m32927d() {
        this.f28549r.m33963o();
        this.f28548q.m32914k();
    }
}
