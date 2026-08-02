package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface fr2 extends Closeable, Flushable {
    o23 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d(fn fnVar, long j);

    void flush();
}
