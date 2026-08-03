package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.C0025b;
import fun.box001.internal.dexformat.C0026c;
import fun.box001.internal.dexformat.C0027d;
import fun.box001.internal.dexformat.C0028e;
import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0092c {

    /* JADX INFO: renamed from: a */
    private final C0032i f335a;

    /* JADX INFO: renamed from: b */
    private C0028e f336b;

    /* JADX INFO: renamed from: c */
    private byte[] f337c;

    /* JADX INFO: renamed from: d */
    private int f338d;

    /* JADX INFO: renamed from: e */
    private TreeMap f339e;

    public C0092c(C0032i r2) {
        this.f335a = r2;
        this.f336b = null;
        this.f337c = null;
        this.f338d = 0;
        this.f339e = null;
    }

    /* JADX INFO: renamed from: b */
    private void m263b() {
        if (this.f336b != null) goto L6;
        this.f336b = this.f335a.m123d();
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m264a(C0100k r10) {
        m263b();
        C0113x r102 = r10.m307q();
        int r0 = this.f336b.m504B();
        this.f339e = new TreeMap();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L6;
        this.f339e.put(this.f336b.m508k(r2).m110c(), null);
        r2 = r2 + 1;
        goto L3
    L6:
        if (this.f339e.size() > 65535) goto L26;
        C0202d r02 = new C0202d();
        this.f338d = r02.m500t(this.f339e.size());
        Iterator r22 = this.f339e.entrySet().iterator();
    L9:
        if (r22.hasNext() == false) goto L23;
        Map.Entry r3 = (Map.Entry) r22.next();
        C0026c r4 = (C0026c) r3.getKey();
        int r5 = r4.m504B();
        int r6 = r4.m504B();
        if (r6 != 0) goto L13;
        boolean r62 = false;
    L14:
        r3.setValue(Integer.valueOf(r02.m491j()));
        if (r62 == false) goto L17;
        r5 = r5 - 1;
        r02.m499s(-r5);
    L18:
        int r32 = 0;
    L19:
        if (r32 >= r5) goto L21;
        C0025b r7 = r4.m507j(r32);
        r02.m500t(r102.m329r(r7.m102b()));
        r02.m500t(r7.m103c());
        r32 = r32 + 1;
        goto L19
    L21:
        if (r62 == false) goto L9;
        r02.m500t(r4.m507j(r5).m103c());
        goto L9
    L17:
        r02.m499s(r5);
        goto L18
    L13:
        r62 = r4.m507j(r6 - 1).m102b().equals(C0191u.f700d);
        goto L14
    L23:
        this.f337c = r02.m493m();
        return;
    L26:
        throw new UnsupportedOperationException("too many catch handlers");
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
    public final void m267e(C0202d r11) {
        m263b();
        int r2 = 0;
        if (r11.m486d() == false) goto L16;
        m263b();
        int r0 = this.f336b.m504B();
        r11.m484b(0, "  tries:");
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L8;
        C0027d r5 = this.f336b.m508k(r3);
        C0026c r6 = r5.m110c();
        String r52 = "    try " + RuntimeDexGenerator.m12r(r5.m111d()) + ".." + RuntimeDexGenerator.m12r(r5.m109b());
        String r4 = r6.m106H("    ", "");
        r11.m484b(6, r52);
        r11.m484b(2, r4);
        r3 = r3 + 1;
        goto L6
    L8:
        r11.m484b(0, "  handlers:");
        r11.m484b(this.f338d, "    size: ".concat(RuntimeDexGenerator.m11q(this.f339e.size())));
        Iterator r02 = this.f339e.entrySet().iterator();
        C0026c r32 = null;
        int r53 = 0;
    L10:
        if (r02.hasNext() == false) goto L15;
        Map.Entry r62 = (Map.Entry) r02.next();
        C0026c r8 = (C0026c) r62.getKey();
        int r63 = ((Integer) r62.getValue()).intValue();
        if (r32 == null) goto L14;
        r11.m484b(r63 - r53, r32.m106H("    ", RuntimeDexGenerator.m11q(r53).concat(": ")));
    L14:
        r53 = r63;
        r32 = r8;
        goto L10
    L15:
        r11.m484b(this.f337c.length - r53, r32.m106H("    ", RuntimeDexGenerator.m11q(r53).concat(": ")));
    L16:
        int r03 = this.f336b.m504B();
    L17:
        if (r2 >= r03) goto L23;
        C0027d r33 = this.f336b.m508k(r2);
        int r42 = r33.m111d();
        int r54 = r33.m109b();
        int r64 = r54 - r42;
        if (r64 >= 65536) goto L22;
        r11.m497q(r42);
        r11.m498r(r64);
        r11.m498r(((Integer) this.f339e.get(r33.m110c())).intValue());
        r2 = r2 + 1;
        goto L17
    L22:
        throw new UnsupportedOperationException("bogus exception range: " + RuntimeDexGenerator.m13s(r42) + ".." + RuntimeDexGenerator.m13s(r54));
    L23:
        r11.m495o(this.f337c);
    }
}
