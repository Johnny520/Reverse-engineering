package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: g.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0084G extends AbstractC0107r implements Comparable {

    /* JADX INFO: renamed from: b */
    private final C0190t f325b;

    /* JADX INFO: renamed from: c */
    private C0083F f326c;

    public C0084G(C0190t r2) {
        if (r2 == null) goto L7;
        this.f325b = r2;
        this.f326c = null;
        return;
    L7:
        throw new NullPointerException("value == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r3) {
        if (this.f326c != null) goto L6;
        C0079B r32 = r3.m305o();
        C0083F r0 = new C0083F(this.f325b);
        this.f326c = r0;
        r32.m229o(r0);
        return;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f409e;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f325b.m425b(((C0084G) r2).f325b);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r7, C0202d r8) {
        int r72 = this.f326c.m235f();
        if (r8.m486d() == false) goto L9;
        StringBuilder r0 = new StringBuilder();
        r0.append(m319g());
        r0.append(' ');
        String r1 = this.f325b.mo107a();
        if (r1.length() > 98) goto L7;
        String r2 = "";
    L8:
        r0.append("\"" + r1 + r2 + '\"');
        r8.m484b(0, r0.toString());
        r8.m484b(4, "  string_data_off: ".concat(RuntimeDexGenerator.m13s(r72)));
        goto L9
    L7:
        r1 = r1.substring(0, 95);
        r2 = "...";
    L9:
        r8.m497q(r72);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0084G) == true) goto L7;
        return false;
    L7:
        return this.f325b.equals(((C0084G) r2).f325b);
    }

    public final int hashCode() {
        return this.f325b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C0190t m253i() {
        return this.f325b;
    }
}
