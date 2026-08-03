package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Jj */
/* JADX INFO: loaded from: classes.dex */
public final class C0413Jj {

    /* JADX INFO: renamed from: a */
    public final byte[] f1382a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f1383b;

    /* JADX INFO: renamed from: c */
    public C0370Ij f1384c;

    /* JADX INFO: renamed from: d */
    public int f1385d;

    public C0413Jj() {
        this.f1382a = new byte[256];
        this.f1385d = 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m857a() {
        if (this.f1384c.f1286b == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final C0370Ij m858b() {
        if (this.f1383b == null) goto L102;
        if (m857a() == true) goto L7;
        StringBuilder r0 = new StringBuilder();
        int r2 = 0;
    L10:
        if (r2 >= 6) goto L13;
        r0.append((char) m859c());
        r2 = r2 + 1;
        goto L10
    L13:
        if (r0.toString().startsWith("GIF") == true) goto L15;
        this.f1384c.f1286b = 1;
    L25:
        if (m857a() == true) goto L100;
        boolean r02 = false;
    L27:
        if (r02 == true) goto L96;
        if (m857a() == true) goto L96;
        if (this.f1384c.f1287c > Integer.MAX_VALUE) goto L96;
        int r5 = m859c();
        if (r5 != 33) goto L35;
        int r52 = m859c();
        if (r52 != 1) goto L62;
        m862f();
        goto L27
    L62:
        if (r52 != 249) goto L64;
        this.f1384c.f1288d = new C0155Dj();
        m859c();
        int r53 = m859c();
        C0155Dj r6 = this.f1384c.f1288d;
        int r8 = (r53 & 28) >> 2;
        r6.f425g = r8;
        if (r8 != 0) goto L88;
        r6.f425g = 1;
    L88:
        if ((r53 & 1) == 0) goto L90;
        boolean r54 = true;
    L91:
        r6.f424f = r54;
        short r55 = this.f1383b.getShort();
        if (r55 >= 2) goto L94;
        r55 = 10;
    L94:
        C0155Dj r7 = this.f1384c.f1288d;
        r7.f427i = r55 * 10;
        r7.f426h = m859c();
        m859c();
        goto L27
    L90:
        r54 = false;
        goto L91
    L64:
        if (r52 != 254) goto L66;
        m862f();
        goto L27
    L66:
        if (r52 != 255) goto L67;
        m860d();
        StringBuilder r56 = new StringBuilder();
        int r62 = 0;
    L69:
        byte[] r9 = this.f1382a;
        if (r62 >= 11) goto L73;
        r56.append((char) r9[r62]);
        r62 = r62 + 1;
        goto L69
    L73:
        if (r56.toString().equals("NETSCAPE2.0") == true) goto L74;
        m862f();
    L74:
        m860d();
        if (r9[0] != 1) goto L78;
        byte r57 = r9[1];
        byte r58 = r9[2];
        this.f1384c.getClass();
    L78:
        if (this.f1385d <= 0) goto L27;
        if (m857a() == false) goto L74;
    L67:
        m862f();
        goto L27
    L35:
        if (r5 != 44) goto L37;
        C0370Ij r59 = this.f1384c;
        if (r59.f1288d != null) goto L43;
        r59.f1288d = new C0155Dj();
    L43:
        r59.f1288d.f419a = this.f1383b.getShort();
        this.f1384c.f1288d.f420b = this.f1383b.getShort();
        this.f1384c.f1288d.f421c = this.f1383b.getShort();
        this.f1384c.f1288d.f422d = this.f1383b.getShort();
        int r510 = m859c();
        if ((r510 & 128) == 0) goto L46;
        boolean r63 = true;
    L47:
        int r72 = (int) Math.pow(2.0d, (r510 & 7) + 1);
        C0155Dj r82 = this.f1384c.f1288d;
        if ((r510 & 64) == 0) goto L50;
        boolean r511 = true;
    L51:
        r82.f423e = r511;
        if (r63 == false) goto L54;
        r82.f429k = m861e(r72);
    L55:
        this.f1384c.f1288d.f428j = this.f1383b.position();
        m859c();
        m862f();
        if (m857a() == true) goto L27;
        C0370Ij r512 = this.f1384c;
        r512.f1287c++;
        r512.f1289e.add(r512.f1288d);
        goto L27
    L54:
        r82.f429k = null;
        goto L55
    L50:
        r511 = false;
        goto L51
    L46:
        r63 = false;
        goto L47
    L37:
        if (r5 != 59) goto L38;
        r02 = true;
        goto L27
    L38:
        this.f1384c.f1286b = 1;
    L96:
        C0370Ij r03 = this.f1384c;
        if (r03.f1287c >= 0) goto L100;
        r03.f1286b = 1;
    L100:
        return this.f1384c;
    L15:
        this.f1384c.f1290f = this.f1383b.getShort();
        this.f1384c.f1291g = this.f1383b.getShort();
        int r04 = m859c();
        C0370Ij r513 = this.f1384c;
        if ((r04 & 128) == 0) goto L18;
        boolean r64 = true;
    L19:
        r513.f1292h = r64;
        r513.f1293i = (int) Math.pow(2.0d, (r04 & 7) + 1);
        this.f1384c.f1294j = m859c();
        C0370Ij r05 = this.f1384c;
        m859c();
        r05.getClass();
        if (this.f1384c.f1292h == false) goto L25;
        if (m857a() == true) goto L25;
        C0370Ij r06 = this.f1384c;
        r06.f1285a = m861e(r06.f1293i);
        C0370Ij r07 = this.f1384c;
        r07.f1295k = r07.f1285a[r07.f1294j];
        goto L25
    L18:
        r64 = false;
        goto L19
    L7:
        return this.f1384c;
    L102:
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* JADX INFO: renamed from: c */
    public final int m859c() {
        return this.f1383b.get() & 255;
    L5:
        this.f1384c.f1286b = 1;
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m860d() {
        int r0 = m859c();
        this.f1385d = r0;
        if (r0 <= 0) goto L14;
        int r02 = 0;
    L11:
        int r1 = this.f1385d;     // Catch: Exception -> L9
        if (r02 >= r1) goto L15;
        int r12 = r1 - r02;     // Catch: Exception -> L9
        this.f1383b.get(this.f1382a, r02, r12);     // Catch: Exception -> L9
        r02 = r02 + r12;
        goto L11
    L15:
        return;
    L9:
        this.f1384c.f1286b = 1;
        return;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m861e(int r10) {
        byte[] r0 = new byte[r10 * 3];
        int[] r1 = null;
        this.f1383b.get(r0);     // Catch: BufferUnderflowException -> L8
        r1 = new int[256];     // Catch: BufferUnderflowException -> L8
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r10) goto L7;
        int r5 = r0[r3] & 255;     // Catch: BufferUnderflowException -> L8
        int r6 = r3 + 2;     // Catch: BufferUnderflowException -> L8
        int r4 = r0[r3 + 1] & 255;     // Catch: BufferUnderflowException -> L8
        r3 = r3 + 3;     // Catch: BufferUnderflowException -> L8
        int r7 = r2 + 1;     // Catch: BufferUnderflowException -> L8
        r1[r2] = ((r4 << 8) | ((r5 << 16) | (-16777216))) | (r0[r6] & 255);     // Catch: BufferUnderflowException -> L8
        r2 = r7;
        goto L4
    L7:
        return r1;
    L8:
        this.f1384c.f1286b = 1;
        return r1;
    }

    /* JADX INFO: renamed from: f */
    public final void m862f() {
    L2:
        int r0 = m859c();
        int r1 = Math.min(this.f1383b.position() + r0, this.f1383b.limit());
        this.f1383b.position(r1);
        if (r0 > 0) goto L2;
    }
}
