package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.C0025b;
import fun.box001.internal.dexformat.C0026c;
import fun.box001.internal.dexformat.C0027d;
import fun.box001.internal.dexformat.C0028e;
import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0092c {

    /* JADX INFO: renamed from: a */
    private final C0032i f335a;

    /* JADX INFO: renamed from: b */
    private C0028e f336b = null;

    /* JADX INFO: renamed from: c */
    private byte[] f337c = null;

    /* JADX INFO: renamed from: d */
    private int f338d = 0;

    /* JADX INFO: renamed from: e */
    private TreeMap f339e = null;

    public C0092c(C0032i c0032i) {
        this.f335a = c0032i;
    }

    /* JADX INFO: renamed from: b */
    private void m263b() {
        if (this.f336b == null) {
            this.f336b = this.f335a.m123d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m264a(C0100k c0100k) {
        m263b();
        C0113x c0113xM307q = c0100k.m307q();
        int iM504B = this.f336b.m504B();
        this.f339e = new TreeMap();
        for (int i2 = 0; i2 < iM504B; i2++) {
            this.f339e.put(this.f336b.m508k(i2).m110c(), null);
        }
        if (this.f339e.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C0202d c0202d = new C0202d();
        this.f338d = c0202d.m500t(this.f339e.size());
        for (Map.Entry entry : this.f339e.entrySet()) {
            C0026c c0026c = (C0026c) entry.getKey();
            int iM504B2 = c0026c.m504B();
            int iM504B3 = c0026c.m504B();
            boolean zEquals = iM504B3 == 0 ? false : c0026c.m507j(iM504B3 - 1).m102b().equals(C0191u.f700d);
            entry.setValue(Integer.valueOf(c0202d.m491j()));
            if (zEquals) {
                iM504B2--;
                c0202d.m499s(-iM504B2);
            } else {
                c0202d.m499s(iM504B2);
            }
            for (int i3 = 0; i3 < iM504B2; i3++) {
                C0025b c0025bJ = c0026c.m507j(i3);
                c0202d.m500t(c0113xM307q.m329r(c0025bJ.m102b()));
                c0202d.m500t(c0025bJ.m103c());
            }
            if (zEquals) {
                c0202d.m500t(c0026c.m507j(iM504B2).m103c());
            }
        }
        this.f337c = c0202d.m493m();
    }

    /* JADX INFO: renamed from: c */
    public final int m265c() {
        m263b();
        return this.f336b.m504B();
    }

    /* JADX INFO: renamed from: d */
    public final int m266d() {
        return (m265c() * 8) + this.f337c.length;
    }

    /* JADX INFO: renamed from: e */
    public final void m267e(C0202d c0202d) {
        m263b();
        if (c0202d.m486d()) {
            m263b();
            int iM504B = this.f336b.m504B();
            c0202d.m484b(0, "  tries:");
            for (int i2 = 0; i2 < iM504B; i2++) {
                C0027d c0027dK = this.f336b.m508k(i2);
                C0026c c0026cM110c = c0027dK.m110c();
                String str = "    try " + RuntimeDexGenerator.m12r(c0027dK.m111d()) + ".." + RuntimeDexGenerator.m12r(c0027dK.m109b());
                String strM106H = c0026cM110c.m106H("    ", "");
                c0202d.m484b(6, str);
                c0202d.m484b(2, strM106H);
            }
            c0202d.m484b(0, "  handlers:");
            c0202d.m484b(this.f338d, "    size: ".concat(RuntimeDexGenerator.m11q(this.f339e.size())));
            C0026c c0026c = null;
            int i3 = 0;
            for (Map.Entry entry : this.f339e.entrySet()) {
                C0026c c0026c2 = (C0026c) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (c0026c != null) {
                    c0202d.m484b(iIntValue - i3, c0026c.m106H("    ", RuntimeDexGenerator.m11q(i3).concat(": ")));
                }
                i3 = iIntValue;
                c0026c = c0026c2;
            }
            c0202d.m484b(this.f337c.length - i3, c0026c.m106H("    ", RuntimeDexGenerator.m11q(i3).concat(": ")));
        }
        int iM504B2 = this.f336b.m504B();
        for (int i4 = 0; i4 < iM504B2; i4++) {
            C0027d c0027dK2 = this.f336b.m508k(i4);
            int iM111d = c0027dK2.m111d();
            int iM109b = c0027dK2.m109b();
            int i5 = iM109b - iM111d;
            if (i5 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + RuntimeDexGenerator.m13s(iM111d) + ".." + RuntimeDexGenerator.m13s(iM109b));
            }
            c0202d.m497q(iM111d);
            c0202d.m498r(i5);
            c0202d.m498r(((Integer) this.f339e.get(c0027dK2.m110c())).intValue());
        }
        c0202d.m495o(this.f337c);
    }
}
