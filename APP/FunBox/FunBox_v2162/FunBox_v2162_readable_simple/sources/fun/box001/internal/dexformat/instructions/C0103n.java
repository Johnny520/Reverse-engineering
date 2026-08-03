package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.data.C0194b;

/* JADX INFO: renamed from: g.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0103n extends AbstractC0102m implements Comparable {

    /* JADX INFO: renamed from: b */
    private final C0187q f403b;

    /* JADX INFO: renamed from: c */
    private final C0096g f404c;

    public C0103n(C0187q r2, int r3, C0032i r4, C0194b r5) {
        super(r3);
        if (r2 == null) goto L14;
        this.f403b = r2;
        if (r4 != null) goto L8;
        this.f404c = null;
        return;
    L8:
        if ((r3 & 8) == 0) goto L10;
        boolean r32 = true;
    L11:
        this.f404c = new C0096g(r2, r4, r32, r5);
        return;
    L10:
        r32 = false;
        goto L11
    L14:
        throw new NullPointerException("method == null");
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f403b.mo107a();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0102m
    /* JADX INFO: renamed from: b */
    public final int mo312b(C0100k r8, C0202d r9, int r10, int r11) {
        C0115z r82 = r8.m303m();
        C0187q r0 = this.f403b;
        int r83 = r82.m338q(r0);
        int r102 = r83 - r10;
        int r1 = m313e();
        C0096g r3 = this.f404c;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        boolean r4 = true;
        if (r32 == 0) goto L9;
        boolean r5 = true;
    L11:
        if ((r1 & 1280) == 0) goto L14;
        r4 = false;
    L14:
        if (r5 != r4) goto L21;
        if (r9.m486d() == false) goto L18;
        r9.m484b(0, String.format("  [%x] %s", new Object[]{Integer.valueOf(r11), r0.mo107a()}));
        r9.m484b(RuntimeDexGenerator.m15u(r102), "    method_idx:   ".concat(RuntimeDexGenerator.m13s(r83)));
        r9.m484b(RuntimeDexGenerator.m15u(r1), "    access_flags: " + RuntimeDexGenerator.m8m(r1));
        r9.m484b(RuntimeDexGenerator.m15u(r32), "    code_off:     ".concat(RuntimeDexGenerator.m13s(r32)));
    L18:
        r9.m500t(r102);
        r9.m500t(r1);
        r9.m500t(r32);
        return r83;
    L21:
        throw new UnsupportedOperationException("code vs. access_flags mismatch");
    L9:
        r5 = false;
        goto L11
    L5:
        r32 = r3.m235f();
        goto L6
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f403b.m425b(((C0103n) r2).f403b);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0103n) == true) goto L6;
        return false;
    L6:
        if (this.f403b.m425b(((C0103n) r3).f403b) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m314f(C0100k r3) {
        C0115z r0 = r3.m303m();
        C0079B r32 = r3.m309s();
        r0.m339r(this.f403b);
        C0096g r02 = this.f404c;
        if (r02 == null) goto L6;
        r32.m229o(r02);
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(100);
        r0.append(C0103n.class.getName());
        r0.append('{');
        r0.append(RuntimeDexGenerator.m11q(m313e()));
        r0.append(' ');
        r0.append(this.f403b);
        C0096g r2 = this.f404c;
        if (r2 == null) goto L5;
        r0.append(' ');
        r0.append(r2);
    L5:
        r0.append('}');
        return r0.toString();
    }
}
