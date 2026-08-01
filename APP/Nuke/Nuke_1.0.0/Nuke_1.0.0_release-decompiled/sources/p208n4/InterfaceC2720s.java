package p208n4;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: n4.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2720s extends Closeable, Flushable {
    /* JADX INFO: renamed from: a */
    AbstractC2724w mo3339a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* JADX INFO: renamed from: p */
    void mo3343p(C2706e c2706e, long j5);
}
