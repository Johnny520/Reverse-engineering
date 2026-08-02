package p000;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface fr2 extends Closeable, Flushable {
    /* JADX INFO: renamed from: a */
    o23 mo1174a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: d */
    void mo1175d(C0209fn c0209fn, long j);

    void flush();
}
