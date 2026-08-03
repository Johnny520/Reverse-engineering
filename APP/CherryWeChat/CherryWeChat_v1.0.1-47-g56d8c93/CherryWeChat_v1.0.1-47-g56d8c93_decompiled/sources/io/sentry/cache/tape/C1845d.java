package io.sentry.cache.tape;

import io.sentry.C1563B0;
import io.sentry.C1871f;
import io.sentry.cache.C1841f;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import p000.C0753Rg;

/* JADX INFO: renamed from: io.sentry.cache.tape.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1845d extends AbstractC1846e {

    /* JADX INFO: renamed from: a */
    public final C1849h f6648a;

    /* JADX INFO: renamed from: b */
    public final C0753Rg f6649b = new C0753Rg();

    /* JADX INFO: renamed from: c */
    public final C1563B0 f6650c;

    public C1845d(C1849h c1849h, C1563B0 c1563b0) {
        this.f6648a = c1849h;
        this.f6650c = c1563b0;
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final void clear() throws IOException {
        this.f6648a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6648a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1849h c1849h = this.f6648a;
        c1849h.getClass();
        return new C1844c(this, new C1848g(c1849h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.cache.tape.AbstractC1846e
    /* JADX INFO: renamed from: q */
    public final void mo4017q(Object obj) throws IOException {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        C0753Rg c0753Rg = this.f6649b;
        c0753Rg.reset();
        C1563B0 c1563b0 = this.f6650c;
        c1563b0.getClass();
        C1871f c1871f = (C1871f) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(c0753Rg, C1841f.f6643c));
        try {
            ((C1841f) c1563b0.f5600a).f6644a.getSerializer().mo3610d(c1871f, bufferedWriter);
            bufferedWriter.close();
            byte[] bArrM1542d = c0753Rg.m1542d();
            int size = c0753Rg.size();
            C1849h c1849h = this.f6648a;
            c1849h.getClass();
            byte[] bArr = c1849h.f6665g;
            if (bArrM1542d == null) {
                throw new NullPointerException("data == null");
            }
            if (size < 0 || size > bArrM1542d.length) {
                throw new IndexOutOfBoundsException();
            }
            if (c1849h.f6668j) {
                throw new IllegalStateException("closed");
            }
            int i = c1849h.f6667i;
            if (i != -1 && c1849h.f6662d == i) {
                c1849h.remove(1);
            }
            long j6 = ((long) size) + 4;
            long j7 = c1849h.f6661c;
            long jM4028y = 32;
            if (c1849h.f6662d == 0) {
                c = 1;
                j = 4;
                j2 = 32;
            } else {
                C1847f c1847f = c1849h.f6664f;
                long j8 = c1847f.f6652a;
                int i2 = c1847f.f6653b;
                j = 4;
                long j9 = c1849h.f6663e.f6652a;
                if (j8 >= j9) {
                    j2 = (j8 - j9) + 4 + ((long) i2) + 32;
                    c = 1;
                } else {
                    c = 1;
                    j2 = (((j8 + 4) + ((long) i2)) + j7) - j9;
                }
            }
            long j10 = j7 - j2;
            if (j10 < j6) {
                do {
                    j10 += j7;
                    j7 <<= c;
                } while (j10 < j6);
                c1849h.f6659a.setLength(j7);
                c1849h.f6659a.getChannel().force(c);
                C1847f c1847f2 = c1849h.f6664f;
                long jM4028y2 = c1849h.m4028y(c1847f2.f6652a + j + ((long) c1847f2.f6653b));
                if (jM4028y2 <= c1849h.f6663e.f6652a) {
                    FileChannel channel = c1849h.f6659a.getChannel();
                    channel.position(c1849h.f6661c);
                    j3 = jM4028y2 - 32;
                    if (channel.transferTo(32L, j3, channel) != j3) {
                        throw new AssertionError("Copied insufficient number of bytes!");
                    }
                } else {
                    j3 = 0;
                }
                long j11 = c1849h.f6664f.f6652a;
                long j12 = c1849h.f6663e.f6652a;
                if (j11 < j12) {
                    j5 = 0;
                    long j13 = (c1849h.f6661c + j11) - 32;
                    j4 = j7;
                    c1849h.m4029z(j4, c1849h.f6662d, j12, j13);
                    c1849h.f6664f = new C1847f(c1849h.f6664f.f6653b, j13);
                } else {
                    j4 = j7;
                    j5 = 0;
                    c1849h.m4029z(j4, c1849h.f6662d, j12, j11);
                }
                c1849h.f6661c = j4;
                long j14 = 32;
                long j15 = j3;
                while (j15 > j5) {
                    int iMin = (int) Math.min(j15, 4096);
                    c1849h.m4027x(iMin, j14, C1849h.f6658k);
                    long j16 = iMin;
                    j15 -= j16;
                    j14 += j16;
                }
            }
            boolean z = c1849h.f6662d == 0;
            if (!z) {
                C1847f c1847f3 = c1849h.f6664f;
                jM4028y = c1849h.m4028y(c1847f3.f6652a + j + ((long) c1847f3.f6653b));
            }
            long j17 = jM4028y;
            C1847f c1847f4 = new C1847f(size, j17);
            C1849h.m4018A(bArr, 0, size);
            c1849h.m4027x(4, j17, bArr);
            c1849h.m4027x(size, j17 + j, bArrM1542d);
            c1849h.m4029z(c1849h.f6661c, c1849h.f6662d + 1, z ? j17 : c1849h.f6663e.f6652a, j17);
            c1849h.f6664f = c1847f4;
            c1849h.f6662d++;
            c1849h.f6666h++;
            if (z) {
                c1849h.f6663e = c1847f4;
            }
        } finally {
        }
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final void remove(int i) {
        this.f6648a.remove(i);
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final int size() {
        return this.f6648a.f6662d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.f6648a + '}';
    }
}
