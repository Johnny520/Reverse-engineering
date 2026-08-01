package io.ktor.http.cio;

import io.ktor.http.cio.internals.C4785;
import java.io.Closeable;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4804 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4785 f12561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4806 f12562;

    public AbstractC4804(C4806 c4806, C4785 c4785) {
        c4785.getClass();
        this.f12562 = c4806;
        this.f12561 = c4785;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12561.m8896();
        this.f12562.m8936();
    }
}
