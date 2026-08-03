package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0194b;

/* JADX INFO: renamed from: g.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0081D extends AbstractC0107r {

    /* JADX INFO: renamed from: b */
    private final C0193a f316b;

    /* JADX INFO: renamed from: c */
    private final C0190t f317c;

    /* JADX INFO: renamed from: d */
    private C0086I f318d;

    public C0081D(C0193a r9) {
        if (r9 == null) goto L20;
        this.f316b = r9;
        C0194b r0 = r9.m457d();
        int r1 = r0.m504B();
        StringBuilder r2 = new StringBuilder(r1 + 1);
        char r3 = r9.m458e().m471h().charAt(0);
        if (r3 != '[') goto L7;
        r3 = 'L';
    L7:
        r2.append(r3);
        int r32 = 0;
    L8:
        if (r32 >= r1) goto L13;
        char r7 = r0.m515r(r32).m471h().charAt(0);
        if (r7 != '[') goto L12;
        r7 = 'L';
    L12:
        r2.append(r7);
        r32 = r32 + 1;
        goto L8
    L13:
        this.f317c = new C0190t(r2.toString());
        C0194b r92 = r9.m457d();
        if (r92.m504B() != 0) goto L16;
        C0086I r93 = null;
    L17:
        this.f318d = r93;
        return;
    L16:
        r93 = new C0086I(r92);
        goto L17
    L20:
        throw new NullPointerException("prototype == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r4) {
        C0113x r0 = r4.m306p();
        C0113x r1 = r4.m307q();
        C0079B r42 = r4.m308r();
        r1.m335x(this.f316b.m458e());
        r0.m332u(this.f317c);
        C0086I r02 = this.f318d;
        if (r02 == null) goto L6;
        this.f318d = (C0086I) r42.m230p(r02);
        return;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f411g;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 12;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r11, C0202d r12) {
        C0113x r0 = r11.m306p();
        C0190t r1 = this.f317c;
        int r02 = r0.m328q(r1);
        C0113x r112 = r11.m307q();
        C0193a r2 = this.f316b;
        int r113 = r112.m331t(r2.m458e());
        C0086I r3 = this.f318d;
        if (r3 != null) goto L5;
        int r32 = 0;
    L7:
        if (r12.m486d() == false) goto L14;
        StringBuilder r5 = new StringBuilder();
        r5.append(r2.m458e().mo107a());
        r5.append(" proto(");
        C0194b r6 = r2.m457d();
        int r7 = r6.m504B();
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L13;
        if (r8 == 0) goto L12;
        r5.append(", ");
    L12:
        r5.append(r6.m515r(r8).mo107a());
        r8 = r8 + 1;
        goto L9
    L13:
        r5.append(")");
        r12.m484b(0, m319g() + ' ' + r5.toString());
        r12.m484b(4, "  shorty_idx:      " + RuntimeDexGenerator.m13s(r02) + " // " + r1.m448k());
        r12.m484b(4, "  return_type_idx: " + RuntimeDexGenerator.m13s(r113) + " // " + r2.m458e().mo107a());
        r12.m484b(4, "  parameters_off:  ".concat(RuntimeDexGenerator.m13s(r32)));
    L14:
        r12.m497q(r02);
        r12.m497q(r113);
        r12.m497q(r32);
        return;
    L5:
        r32 = r3.m235f();
        goto L7
    }
}
