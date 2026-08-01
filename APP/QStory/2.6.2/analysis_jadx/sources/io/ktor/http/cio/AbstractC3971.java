package io.ktor.http.cio;

import io.ktor.http.cio.internals.C3952;
import java.io.Closeable;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3971 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3952 f12212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3973 f12213;

    public AbstractC3971(C3973 c3973, C3952 c3952) {
        c3952.getClass();
        this.f12213 = c3973;
        this.f12212 = c3952;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12212.m8347();
        this.f12213.m8387();
    }
}
