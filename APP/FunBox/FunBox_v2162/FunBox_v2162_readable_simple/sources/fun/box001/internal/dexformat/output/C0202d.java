package fun.box001.internal.dexformat.output;

import fun.box001.internal.error.DexGenerationException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0202d implements InterfaceC0199a {

    /* JADX INFO: renamed from: a */
    private final boolean f792a;

    /* JADX INFO: renamed from: b */
    private byte[] f793b;

    /* JADX INFO: renamed from: c */
    private int f794c;

    /* JADX INFO: renamed from: d */
    private boolean f795d;

    /* JADX INFO: renamed from: e */
    private ArrayList f796e;

    /* JADX INFO: renamed from: f */
    private int f797f;

    /* JADX INFO: renamed from: g */
    private int f798g;

    public C0202d() {
        this(new byte[1000], true);
    }

    /* JADX INFO: renamed from: g */
    private void m481g(int r4) {
        byte[] r0 = this.f793b;
        if (r0.length >= r4) goto L6;
        byte[] r42 = new byte[(r4 * 2) + 1000];
        System.arraycopy(r0, 0, r42, 0, this.f794c);
        this.f793b = r42;
        return;
    }

    /* JADX INFO: renamed from: l */
    private static void m482l() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: a */
    public final void m483a(int r4) {
        int r0 = r4 - 1;
        if (r4 < 0) goto L16;
        if ((r4 & r0) != 0) goto L16;
        int r42 = (this.f794c + r0) & (~r0);
        if (this.f792a == false) goto L10;
        m481g(r42);
    L11:
        Arrays.fill(this.f793b, this.f794c, r42, (byte) 0);
        this.f794c = r42;
        return;
    L10:
        if (r42 <= this.f793b.length) goto L11;
        m482l();
        throw null;
    L16:
        throw new IllegalArgumentException("bogus alignment");
    }

    /* JADX INFO: renamed from: b */
    public final void m484b(int r4, String r5) {
        if (this.f796e != null) goto L5;
        return;
    L5:
        m488f();
        int r0 = this.f796e.size();
        if (r0 != 0) goto L8;
        int r02 = 0;
    L9:
        int r1 = this.f794c;
        if (r02 > r1) goto L12;
        r02 = r1;
    L12:
        this.f796e.add(new C0201c(r5, r02, r4 + r02));
        return;
    L8:
        r02 = ((C0201c) this.f796e.get(r0 - 1)).m479a();
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m485c(String r5) {
        if (this.f796e != null) goto L5;
        return;
    L5:
        m488f();
        this.f796e.add(new C0201c(r5, this.f794c, Integer.MAX_VALUE));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m486d() {
        if (this.f796e == null) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m487e(int r4) {
        if (this.f794c != r4) goto L6;
        return;
    L6:
        throw new DexGenerationException("expected cursor " + r4 + "; actual value: " + this.f794c, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m488f() {
        ArrayList r0 = this.f796e;
        if (r0 != null) goto L5;
        return;
    L5:
        int r02 = r0.size();
        if (r02 == 0) goto L9;
        ((C0201c) this.f796e.get(r02 - 1)).m480b(this.f794c);
        return;
    }

    /* JADX INFO: renamed from: h */
    public final int m489h() {
        int r0 = this.f798g;
        int r1 = (r0 * 2) + 8;
        int r02 = (r0 / 2) + r1;
        return this.f797f - r02;
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m490i() {
        return this.f793b;
    }

    /* JADX INFO: renamed from: j */
    public final int m491j() {
        return this.f794c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m492k() {
        return this.f795d;
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m493m() {
        int r0 = this.f794c;
        byte[] r1 = new byte[r0];
        System.arraycopy(this.f793b, 0, r1, 0, r0);
        return r1;
    }

    /* JADX INFO: renamed from: n */
    public final void m494n(C0200b r4) {
        int r0 = r4.m478b();
        int r1 = this.f794c;
        int r02 = r0 + r1;
        if (this.f792a == false) goto L6;
        m481g(r02);
    L7:
        r4.m477a(this.f793b, r1);
        this.f794c = r02;
        return;
    L6:
        if (r02 <= this.f793b.length) goto L7;
        m482l();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final void m495o(byte[] r7) {
        int r0 = r7.length;
        int r1 = this.f794c;
        int r2 = r1 + r0;
        int r4 = 0 + r0;
        if (((0 | r0) | r2) < 0) goto L16;
        if (r4 > r7.length) goto L16;
        if (this.f792a == false) goto L10;
        m481g(r2);
    L11:
        System.arraycopy(r7, 0, this.f793b, r1, r0);
        this.f794c = r2;
        return;
    L10:
        if (r2 <= this.f793b.length) goto L11;
        m482l();
        throw null;
    L16:
        throw new IndexOutOfBoundsException("bytes.length " + r7.length + "; 0..!" + r2);
    }

    /* JADX INFO: renamed from: p */
    public final void m496p(int r4) {
        int r0 = this.f794c;
        int r1 = r0 + 1;
        if (this.f792a == false) goto L6;
        m481g(r1);
    L7:
        this.f793b[r0] = (byte) r4;
        this.f794c = r1;
        return;
    L6:
        if (r1 <= this.f793b.length) goto L7;
        m482l();
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public final void m497q(int r6) {
        int r0 = this.f794c;
        int r1 = r0 + 4;
        if (this.f792a == false) goto L6;
        m481g(r1);
    L7:
        byte[] r2 = this.f793b;
        r2[r0] = (byte) r6;
        r2[r0 + 1] = (byte) (r6 >> 8);
        r2[r0 + 2] = (byte) (r6 >> 16);
        r2[r0 + 3] = (byte) (r6 >> 24);
        this.f794c = r1;
        return;
    L6:
        if (r1 <= this.f793b.length) goto L7;
        m482l();
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public final void m498r(int r5) {
        int r0 = this.f794c;
        int r1 = r0 + 2;
        if (this.f792a == false) goto L6;
        m481g(r1);
    L7:
        byte[] r2 = this.f793b;
        r2[r0] = (byte) r5;
        r2[r0 + 1] = (byte) (r5 >> 8);
        this.f794c = r1;
        return;
    L6:
        if (r1 <= this.f793b.length) goto L7;
        m482l();
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final void m499s(int r8) {
        if (this.f792a == false) goto L5;
        m481g(this.f794c + 5);
    L5:
        int r0 = r8 >> 7;
        if ((Integer.MIN_VALUE & r8) != 0) goto L8;
        int r1 = 0;
    L9:
        boolean r4 = true;
    L10:
        int r6 = r0;
        int r02 = r8;
        r8 = r6;
        if (r4 == false) goto L23;
        if (r8 == r1) goto L14;
    L17:
        r4 = true;
    L18:
        int r03 = r02 & 127;
        if (r4 == false) goto L21;
        int r5 = 128;
    L22:
        m496p((byte) (r03 | r5));
        r0 = r8 >> 7;
        goto L10
    L21:
        r5 = 0;
        goto L22
    L14:
        if ((r8 & 1) != ((r02 >> 6) & 1)) goto L17;
        r4 = false;
        goto L18
    L23:
        return;
    L8:
        r1 = -1;
        goto L9
    }

    /* JADX INFO: renamed from: t */
    public final int m500t(int r3) {
        if (this.f792a == false) goto L5;
        m481g(this.f794c + 5);
    L5:
        int r0 = this.f794c;
    L6:
        int r1 = r3 >>> 7;
        int r32 = r3 & 127;
        if (r1 == 0) goto L9;
        m496p((byte) (r32 | 128));
        r3 = r1;
        goto L6
    L9:
        m496p((byte) r32);
        return this.f794c - r0;
    }

    /* JADX INFO: renamed from: u */
    public final void m501u(int r4) {
        if (r4 < 0) goto L13;
        int r0 = this.f794c + r4;
        if (this.f792a == false) goto L7;
        m481g(r0);
    L8:
        Arrays.fill(this.f793b, this.f794c, r0, (byte) 0);
        this.f794c = r0;
        return;
    L7:
        if (r0 <= this.f793b.length) goto L8;
        m482l();
        throw null;
    L13:
        throw new IllegalArgumentException("count < 0");
    }

    public C0202d(byte[] r2) {
        this(r2, false);
    }

    private C0202d(byte[] r1, boolean r2) {
        this.f792a = r2;
        this.f793b = r1;
        this.f794c = 0;
        this.f795d = false;
        this.f796e = null;
        this.f797f = 0;
        this.f798g = 0;
    }
}
