package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import java.util.Collection;

/* JADX INFO: renamed from: g.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0082E {

    /* JADX INFO: renamed from: a */
    private final String f319a;

    /* JADX INFO: renamed from: b */
    private final C0100k f320b;

    /* JADX INFO: renamed from: c */
    private final int f321c;

    /* JADX INFO: renamed from: d */
    private int f322d;

    /* JADX INFO: renamed from: e */
    private boolean f323e;

    public AbstractC0082E(String r2, C0100k r3, int r4) {
        if (r3 == null) goto L12;
        if (r4 <= 0) goto L10;
        if (((r4 - 1) & r4) != 0) goto L10;
        this.f319a = r2;
        this.f320b = r3;
        this.f321c = r4;
        this.f322d = -1;
        this.f323e = false;
        return;
    L10:
        throw new IllegalArgumentException("invalid alignment");
    L12:
        throw new NullPointerException("file == null");
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo224a(AbstractC0108s r1);

    /* JADX INFO: renamed from: b */
    public final int m244b(int r2) {
        if (r2 < 0) goto L10;
        int r0 = this.f322d;
        if (r0 < 0) goto L8;
        return r0 + r2;
    L8:
        throw new RuntimeException("fileOffset not yet set");
    L10:
        throw new IllegalArgumentException("relative < 0");
    }

    /* JADX INFO: renamed from: c */
    public final int m245c() {
        return this.f321c;
    }

    /* JADX INFO: renamed from: d */
    public final C0100k m246d() {
        return this.f320b;
    }

    /* JADX INFO: renamed from: e */
    public final int m247e() {
        int r0 = this.f322d;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new RuntimeException("fileOffset not set");
    }

    /* JADX INFO: renamed from: f */
    public abstract Collection mo225f();

    /* JADX INFO: renamed from: g */
    public final void m248g() {
        m251k();
        mo226h();
        this.f323e = true;
    }

    /* JADX INFO: renamed from: h */
    protected abstract void mo226h();

    /* JADX INFO: renamed from: i */
    public final int m249i(int r2) {
        if (r2 < 0) goto L10;
        if (this.f322d >= 0) goto L8;
        int r0 = this.f321c - 1;
        int r22 = (r2 + r0) & (~r0);
        this.f322d = r22;
        return r22;
    L8:
        throw new RuntimeException("fileOffset already set");
    L10:
        throw new IllegalArgumentException("fileOffset < 0");
    }

    /* JADX INFO: renamed from: j */
    protected final void m250j() {
        if (this.f323e == false) goto L6;
        return;
    L6:
        throw new RuntimeException("not prepared");
    }

    /* JADX INFO: renamed from: k */
    protected final void m251k() {
        if (this.f323e == true) goto L6;
        return;
    L6:
        throw new RuntimeException("already prepared");
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo227l();

    /* JADX INFO: renamed from: m */
    public final void m252m(C0202d r5) {
        m250j();
        r5.m483a(this.f321c);
        int r0 = r5.m491j();
        int r1 = this.f322d;
        if (r1 >= 0) goto L5;
        this.f322d = r0;
    L7:
        if (r5.m486d() == false) goto L13;
        String r3 = this.f319a;
        if (r3 == null) goto L11;
        r5.m484b(0, "\n" + r3 + ":");
        goto L13
    L11:
        if (r0 == 0) goto L13;
        r5.m484b(0, "\n");
    L13:
        mo228n(r5);
        return;
    L5:
        if (r1 == r0) goto L7;
        throw new RuntimeException("alignment mismatch: for " + this + ", at " + r0 + ", but expected " + this.f322d);
    }

    /* JADX INFO: renamed from: n */
    protected abstract void mo228n(C0202d r1);
}
