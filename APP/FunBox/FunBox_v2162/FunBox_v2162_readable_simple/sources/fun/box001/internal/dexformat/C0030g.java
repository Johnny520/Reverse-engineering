package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.C0168s;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0030g extends AbstractC0037n {

    /* JADX INFO: renamed from: e */
    private final AbstractC0171a f93e;

    /* JADX INFO: renamed from: f */
    private int f94f;

    /* JADX INFO: renamed from: g */
    private int f95g;

    public C0030g(C0035l r1, C0168s r2, C0164o r3, AbstractC0171a r4) {
        super(r1, r2, r3);
        if (r4 == null) goto L7;
        this.f93e = r4;
        this.f94f = -1;
        this.f95g = -1;
        return;
    L7:
        throw new NullPointerException("constant == null");
    }

    /* JADX INFO: renamed from: A */
    public final void m113A(int r2) {
        if (r2 < 0) goto L10;
        if (this.f95g >= 0) goto L8;
        this.f95g = r2;
        return;
    L8:
        throw new IllegalStateException("class index already set");
    L10:
        throw new IllegalArgumentException("index < 0");
    }

    /* JADX INFO: renamed from: B */
    public final void m114B(int r2) {
        if (r2 < 0) goto L10;
        if (this.f94f >= 0) goto L8;
        this.f94f = r2;
        return;
    L8:
        throw new IllegalStateException("index already set");
    L10:
        throw new IllegalArgumentException("index < 0");
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: a */
    protected final String mo84a() {
        return this.f93e.mo107a();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: c */
    public final String mo115c() {
        if (this.f94f < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        return "";
    L9:
        StringBuilder r02 = new StringBuilder(20);
        r02.append(this.f93e.mo427f());
        r02.append('@');
        int r1 = this.f94f;
        if (r1 >= 65536) goto L12;
        String r12 = RuntimeDexGenerator.m11q(r1);
    L13:
        r02.append(r12);
        return r02.toString();
    L12:
        r12 = RuntimeDexGenerator.m13s(r1);
        goto L13
    L5:
        r0 = false;
        goto L6
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: d */
    public final String mo116d() {
        AbstractC0171a r0 = this.f93e;
        if ((r0 instanceof C0190t) == false) goto L7;
        return ((C0190t) r0).m448k();
    L7:
        return r0.mo107a();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: u */
    public final AbstractC0033j mo85u(C0035l r5) {
        C0030g r0 = new C0030g(r5, m139l(), m140m(), this.f93e);
        int r52 = this.f94f;
        if (r52 < 0) goto L5;
        r0.m114B(r52);
    L5:
        int r53 = this.f95g;
        if (r53 < 0) goto L8;
        r0.m113A(r53);
    L8:
        return r0;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0033j
    /* JADX INFO: renamed from: w */
    public final AbstractC0033j mo86w(C0164o r5) {
        C0030g r0 = new C0030g(m138k(), m139l(), r5, this.f93e);
        int r52 = this.f94f;
        if (r52 < 0) goto L5;
        r0.m114B(r52);
    L5:
        int r53 = this.f95g;
        if (r53 < 0) goto L8;
        r0.m113A(r53);
    L8:
        return r0;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0171a m117y() {
        return this.f93e;
    }

    /* JADX INFO: renamed from: z */
    public final int m118z() {
        int r0 = this.f94f;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("index not yet set for " + this.f93e);
    }
}
