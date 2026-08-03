package io.sentry.cache.tape;

import io.sentry.C1563B0;
import io.sentry.C1871f;
import io.sentry.cache.C1841f;
import java.io.BufferedWriter;
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
    public final C0753Rg f6649b;

    /* JADX INFO: renamed from: c */
    public final C1563B0 f6650c;

    public C1845d(C1849h r2, C1563B0 r3) {
        this.f6649b = new C0753Rg();
        this.f6648a = r2;
        this.f6650c = r3;
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final void clear() {
        this.f6648a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6648a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1849h r1 = this.f6648a;
        r1.getClass();
        return new C1844c(this, new C1848g(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.cache.tape.AbstractC1846e
    /* JADX INFO: renamed from: q */
    public final void mo4017q(Object r28) {
        C0753Rg r0 = this.f6649b;
        r0.reset();
        C1563B0 r2 = this.f6650c;
        r2.getClass();
        C1871f r3 = (C1871f) r28;
        BufferedWriter r4 = new BufferedWriter(new OutputStreamWriter(r0, C1841f.f6643c));
        ((C1841f) r2.f5600a).f6644a.getSerializer().mo3610d(r3, r4);     // Catch: Throwable -> L67
        r4.close();
        byte[] r22 = r0.m1542d();
        int r02 = r0.size();
        C1849h r32 = this.f6648a;
        r32.getClass();
        byte[] r11 = r32.f6665g;
        if (r22 == null) goto L66;
        if (r02 < 0) goto L64;
        if (r02 > r22.length) goto L64;
        if (r32.f6668j == true) goto L62;
        int r42 = r32.f6667i;
        if (r42 != (-1)) goto L15;
    L17:
        long r43 = ((long) r02) + 4;
        long r6 = r32.f6661c;
        long r15 = 32;
        if (r32.f6662d != 0) goto L20;
        char r282 = 1;
        long r17 = 4;
        long r9 = 32;
    L24:
        long r8 = r6 - r9;
        if (r8 >= r43) goto L47;
    L27:
        r8 = r8 + r6;
        r6 = r6 << r282;
        if (r8 < r43) goto L27;
        r32.f6659a.setLength(r6);
        r32.f6659a.getChannel().force(r282);
        C1847f r44 = r32.f6664f;
        long r45 = r32.m4028y((r44.f6652a + r17) + ((long) r44.f6653b));
        if (r45 > r32.f6663e.f6652a) goto L36;
        FileChannel r82 = r32.f6659a.getChannel();
        r82.position(r32.f6661c);
        long r222 = r45 - 32;
        if (r82.transferTo(32, r222, r82) != r222) goto L35;
    L37:
        long r92 = r32.f6664f.f6652a;
        long r46 = r32.f6663e.f6652a;
        if (r92 >= r46) goto L41;
        long r19 = 0;
        long r93 = (r32.f6661c + r92) - 32;
        long r47 = r6;
        r32.m4029z(r47, r32.f6662d, r46, r93);
        r32.f6664f = new C1847f(r32.f6664f.f6653b, r93);
    L42:
        r32.f6661c = r47;
        long r62 = 32;
        long r48 = r222;
    L44:
        if (r48 <= r19) goto L47;
        int r83 = (int) Math.min(r48, 4096);
        r32.m4027x(r83, r62, C1849h.f6658k);
        long r84 = r83;
        r48 = r48 - r84;
        r62 = r62 + r84;
        goto L44
    L41:
        r47 = r6;
        r19 = 0;
        r32.m4029z(r47, r32.f6662d, r46, r92);
        goto L42
    L35:
        throw new AssertionError("Copied insufficient number of bytes!");
    L36:
        r222 = 0;
    L47:
        if (r32.f6662d != 0) goto L49;
        boolean r12 = true;
    L50:
        if (r12 == false) goto L52;
    L51:
        long r94 = r15;
        C1847f r13 = new C1847f(r02, r94);
        C1849h.m4018A(r11, 0, r02);
        r32.m4027x(4, r94, r11);
        r32.m4027x(r02, r94 + r17, r22);
        if (r12 == false) goto L56;
        long r7 = r94;
    L57:
        r32.m4029z(r32.f6661c, r32.f6662d + 1, r7, r94);
        r32.f6664f = r13;
        r32.f6662d++;
        r32.f6666h++;
        if (r12 == false) goto L81;
        r32.f6663e = r13;
        return;
    L81:
        return;
    L56:
        r7 = r32.f6663e.f6652a;
        goto L57
    L52:
        C1847f r49 = r32.f6664f;
        r15 = r32.m4028y((r49.f6652a + r17) + ((long) r49.f6653b));
        goto L51
    L49:
        r12 = false;
        goto L50
    L20:
        C1847f r85 = r32.f6664f;
        long r95 = r85.f6652a;
        int r86 = r85.f6653b;
        r17 = 4;
        long r132 = r32.f6663e.f6652a;
        if (r95 < r132) goto L23;
        r9 = (((r95 - r132) + 4) + ((long) r86)) + 32;
        r282 = 1;
        goto L24
    L23:
        r282 = 1;
        r9 = (((r95 + 4) + ((long) r86)) + r6) - r132;
        goto L24
    L15:
        if (r32.f6662d != r42) goto L17;
        r32.remove(1);
        goto L17
    L62:
        throw new IllegalStateException("closed");
    L64:
        throw new IndexOutOfBoundsException();
    L66:
        throw new NullPointerException("data == null");
    L67:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L71
        throw th;
    L71:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final void remove(int r2) {
        this.f6648a.remove(r2);
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final int size() {
        return this.f6648a.f6662d;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.f6648a + '}';
    }
}
