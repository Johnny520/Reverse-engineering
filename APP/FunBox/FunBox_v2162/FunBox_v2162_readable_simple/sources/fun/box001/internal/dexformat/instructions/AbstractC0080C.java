package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.error.DexGenerationException;

/* JADX INFO: renamed from: g.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080C extends AbstractC0108s implements Comparable {

    /* JADX INFO: renamed from: a */
    private final int f312a;

    /* JADX INFO: renamed from: b */
    private int f313b;

    /* JADX INFO: renamed from: c */
    private AbstractC0082E f314c;

    /* JADX INFO: renamed from: d */
    private int f315d;

    public AbstractC0080C(int r2, int r3) {
        if (r2 <= 0) goto L13;
        if (((r2 - 1) & r2) != 0) goto L13;
        if (r3 < (-1)) goto L11;
        this.f312a = r2;
        this.f313b = r3;
        this.f314c = null;
        this.f315d = -1;
        return;
    L11:
        throw new IllegalArgumentException("writeSize < -1");
    L13:
        throw new IllegalArgumentException("invalid alignment");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        int r0 = this.f313b;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        AbstractC0080C r32 = (AbstractC0080C) r3;
        if (this != r32) goto L5;
        return 0;
    L5:
        EnumC0109t r0 = mo243b();
        EnumC0109t r1 = r32.mo243b();
        if (r0 == r1) goto L9;
        return r0.compareTo(r1);
    L9:
        return mo234e(r32);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r2, C0202d r3) {
        r3.m483a(this.f312a);
    L10:
        e = move-exception;
        throw DexGenerationException.m22b("...while writing " + this, e);
    L4:
        if (this.f313b < 0) goto L9;
        r3.m487e(m235f());     // Catch: RuntimeException -> L10
        mo241l(r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("writeSize is unknown");     // Catch: RuntimeException -> L10
    }

    /* JADX INFO: renamed from: e */
    protected int mo234e(AbstractC0080C r2) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        AbstractC0080C r52 = (AbstractC0080C) r5;
        if (mo243b() == r52.mo243b()) goto L9;
        return false;
    L9:
        if (mo234e(r52) != 0) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m235f() {
        int r0 = this.f315d;
        if (r0 < 0) goto L7;
        return this.f314c.m244b(r0);
    L7:
        throw new RuntimeException("offset not yet known");
    }

    /* JADX INFO: renamed from: g */
    public final int m236g() {
        return this.f312a;
    }

    /* JADX INFO: renamed from: h */
    public final String m237h() {
        return "[" + Integer.toHexString(m235f()) + ']';
    }

    /* JADX INFO: renamed from: i */
    public final int m238i(AbstractC0082E r2, int r3) {
        if (r2 == null) goto L13;
        if (r3 < 0) goto L11;
        if (this.f314c != null) goto L9;
        int r0 = this.f312a - 1;
        int r32 = (r3 + r0) & (~r0);
        this.f314c = r2;
        this.f315d = r32;
        mo239j(r2, r32);
        return r32;
    L9:
        throw new RuntimeException("already written");
    L11:
        throw new IllegalArgumentException("offset < 0");
    L13:
        throw new NullPointerException("addedTo == null");
    }

    /* JADX INFO: renamed from: j */
    protected void mo239j(AbstractC0082E r1, int r2) {
    }

    /* JADX INFO: renamed from: k */
    public final void m240k(int r2) {
        if (r2 < 0) goto L10;
        if (this.f313b >= 0) goto L8;
        this.f313b = r2;
        return;
    L8:
        throw new UnsupportedOperationException("writeSize already set");
    L10:
        throw new IllegalArgumentException("writeSize < 0");
    }

    /* JADX INFO: renamed from: l */
    protected abstract void mo241l(C0100k r1, C0202d r2);
}
