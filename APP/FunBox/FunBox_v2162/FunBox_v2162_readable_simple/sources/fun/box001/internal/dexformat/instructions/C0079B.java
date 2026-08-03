package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.AbstractC0040q;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.error.DexGenerationException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: g.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0079B extends AbstractC0082E {

    /* JADX INFO: renamed from: j */
    private static final Comparator f307j = null;

    /* JADX INFO: renamed from: f */
    private final ArrayList f308f;

    /* JADX INFO: renamed from: g */
    private final HashMap f309g;

    /* JADX INFO: renamed from: h */
    private final int f310h;

    /* JADX INFO: renamed from: i */
    private int f311i;

    static {
        f307j = new C0078A();
    }

    public C0079B(String r1, C0100k r2, int r3, int r4) {
        super(r1, r2, r3);
        this.f308f = new ArrayList(100);
        this.f309g = new HashMap(100);
        this.f310h = r4;
        this.f311i = -1;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: a */
    public final int mo224a(AbstractC0108s r1) {
        return ((AbstractC0080C) r1).m235f();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f308f;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: h */
    protected final void mo226h() {
        C0100k r0 = m246d();
        int r1 = 0;
    L3:
        ArrayList r2 = this.f308f;
        int r3 = r2.size();
        if (r1 < r3) goto L6;
        return;
    L6:
        if (r1 >= r3) goto L3;
        ((AbstractC0080C) r2.get(r1)).mo242a(r0);
        r1 = r1 + 1;
        goto L6
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: l */
    public final int mo227l() {
        m250j();
        return this.f311i;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: n */
    protected final void mo228n(C0202d r11) {
        boolean r0 = r11.m486d();
        C0100k r1 = m246d();
        Iterator r2 = this.f308f.iterator();
        boolean r6 = true;
        int r5 = 0;
    L4:
        if (r2.hasNext() == false) goto L15;
        AbstractC0080C r7 = (AbstractC0080C) r2.next();
        if (r0 == false) goto L10;
        if (r6 == false) goto L9;
        r6 = false;
        goto L10
    L9:
        r11.m484b(0, "\n");
    L10:
        int r8 = r7.m236g() - 1;
        int r82 = (~r8) & (r5 + r8);
        if (r5 == r82) goto L13;
        r11.m501u(r82 - r5);
        r5 = r82;
    L13:
        r7.mo233d(r1, r11);
        r5 = r5 + r7.mo232c();
        goto L4
    L15:
        if (r5 != this.f311i) goto L18;
        return;
    L18:
        throw new RuntimeException("output size mismatch");
    }

    /* JADX INFO: renamed from: o */
    public final void m229o(AbstractC0080C r3) {
        m251k();
        if (r3.m236g() > m245c()) goto L8;
        this.f308f.add(r3);
        return;
    L8:
        throw new IllegalArgumentException("incompatible item alignment");     // Catch: NullPointerException -> L9
    L10:
        throw new NullPointerException("item == null");
    }

    /* JADX INFO: renamed from: p */
    public final synchronized AbstractC0080C m230p(AbstractC0080C r2) {
        monitor-enter(this);
        m251k();     // Catch: Throwable -> L10
        AbstractC0080C r0 = (AbstractC0080C) this.f309g.get(r2);     // Catch: Throwable -> L10
        if (r0 == null) goto L7;
        monitor-exit(this);
        return r0;
    L7:
        m229o(r2);     // Catch: Throwable -> L10
        this.f309g.put(r2, r2);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r2;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: q */
    public final void m231q() {
        m250j();
        int r0 = AbstractC0040q.m183b(this.f310h);
        ArrayList r1 = this.f308f;
        if (r0 != 1) goto L5;
        Collections.sort(r1, f307j);
    L9:
        int r02 = r1.size();
        int r2 = 0;
        int r3 = 0;
    L10:
        if (r2 >= r02) goto L21;
        AbstractC0080C r4 = (AbstractC0080C) r1.get(r2);
        int r5 = r4.m238i(this, r3);     // Catch: RuntimeException -> L15
        if (r5 < r3) goto L18;
        r3 = r4.mo232c() + r5;     // Catch: RuntimeException -> L15
        r2 = r2 + 1;     // Catch: RuntimeException -> L15
        goto L10
    L18:
        throw new RuntimeException("bogus place() result for " + r4);     // Catch: RuntimeException -> L15
    L15:
        e = move-exception;
        throw DexGenerationException.m22b("...while placing " + r4, e);
    L21:
        this.f311i = r3;
        return;
    L5:
        if (r0 != 2) goto L9;
        Collections.sort(r1);
        goto L9
    }
}
