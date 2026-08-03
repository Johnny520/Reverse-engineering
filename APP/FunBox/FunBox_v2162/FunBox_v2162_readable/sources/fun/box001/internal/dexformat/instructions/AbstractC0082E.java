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

    public AbstractC0082E(String str, C0100k c0100k, int i2) {
        if (c0100k == null) {
            throw new NullPointerException("file == null");
        }
        if (i2 <= 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f319a = str;
        this.f320b = c0100k;
        this.f321c = i2;
        this.f322d = -1;
        this.f323e = false;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo224a(AbstractC0108s abstractC0108s);

    /* JADX INFO: renamed from: b */
    public final int m244b(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i3 = this.f322d;
        if (i3 >= 0) {
            return i3 + i2;
        }
        throw new RuntimeException("fileOffset not yet set");
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
        int i2 = this.f322d;
        if (i2 >= 0) {
            return i2;
        }
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
    public final int m249i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f322d >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i3 = this.f321c - 1;
        int i4 = (i2 + i3) & (~i3);
        this.f322d = i4;
        return i4;
    }

    /* JADX INFO: renamed from: j */
    protected final void m250j() {
        if (!this.f323e) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: k */
    protected final void m251k() {
        if (this.f323e) {
            throw new RuntimeException("already prepared");
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo227l();

    /* JADX INFO: renamed from: m */
    public final void m252m(C0202d c0202d) {
        m250j();
        c0202d.m483a(this.f321c);
        int iM491j = c0202d.m491j();
        int i2 = this.f322d;
        if (i2 < 0) {
            this.f322d = iM491j;
        } else if (i2 != iM491j) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iM491j + ", but expected " + this.f322d);
        }
        if (c0202d.m486d()) {
            String str = this.f319a;
            if (str != null) {
                c0202d.m484b(0, "\n" + str + ":");
            } else if (iM491j != 0) {
                c0202d.m484b(0, "\n");
            }
        }
        mo228n(c0202d);
    }

    /* JADX INFO: renamed from: n */
    protected abstract void mo228n(C0202d c0202d);
}
