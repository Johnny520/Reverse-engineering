package io.ktor.http.cio;

import io.ktor.http.cio.internals.C3953;
import java.io.Closeable;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3972 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3953 f12216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3974 f12217;

    public AbstractC3972(C3974 c3974, C3953 c3953) {
        c3953.getClass();
        this.f12217 = c3974;
        this.f12216 = c3953;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12216.m8337();
        this.f12217.m8377();
    }
}
