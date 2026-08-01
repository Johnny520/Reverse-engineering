package p118X3;

import java.io.Closeable;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: X3.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1687I implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final C1686H f5761e;

    /* JADX INFO: renamed from: d */
    public C1685G f5762d;

    static {
        C2709h c2709h = C2709h.f8630g;
        AbstractC1665j.m2985e(c2709h, "<this>");
        C2706e c2706e = new C2706e();
        c2706e.m4703E(c2709h);
        f5761e = new C1686H(null, c2709h.f8631d.length, c2706e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.Charset m3006b() {
        /*
            r7 = this;
            X3.u r0 = r7.mo506d()
            if (r0 == 0) goto L39
            X2.t r1 = p118X3.C1711u.f5877d
            java.lang.String[] r0 = r0.f5881c
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 0
            int r1 = com.bumptech.glide.AbstractC1926h.m3576s(r3, r1, r2)
            r2 = 0
            if (r1 < 0) goto L2f
            r4 = r3
        L17:
            r5 = r0[r4]
            if (r5 != 0) goto L1d
            r5 = r3
            goto L23
        L1d:
            java.lang.String r6 = "charset"
            boolean r5 = r5.equalsIgnoreCase(r6)
        L23:
            if (r5 == 0) goto L2a
            int r4 = r4 + 1
            r0 = r0[r4]
            goto L30
        L2a:
            if (r4 == r1) goto L2f
            int r4 = r4 + 2
            goto L17
        L2f:
            r0 = r2
        L30:
            if (r0 != 0) goto L33
            goto L37
        L33:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L37
        L37:
            if (r2 != 0) goto L3b
        L39:
            java.nio.charset.Charset r2 = p149d3.AbstractC1973a.f6662a
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p118X3.AbstractC1687I.m3006b():java.nio.charset.Charset");
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo505c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC1774e.m3161b(mo507f());
    }

    /* JADX INFO: renamed from: d */
    public abstract C1711u mo506d();

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC2708g mo507f();
}
