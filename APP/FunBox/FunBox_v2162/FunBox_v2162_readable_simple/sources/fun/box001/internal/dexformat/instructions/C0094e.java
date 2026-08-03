package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0173c;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;

/* JADX INFO: renamed from: g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0094e extends AbstractC0107r {

    /* JADX INFO: renamed from: b */
    private final C0191u f348b;

    /* JADX INFO: renamed from: c */
    private final int f349c;

    /* JADX INFO: renamed from: d */
    private final C0191u f350d;

    /* JADX INFO: renamed from: e */
    private C0086I f351e;

    /* JADX INFO: renamed from: f */
    private final C0190t f352f;

    /* JADX INFO: renamed from: g */
    private final C0093d f353g;

    /* JADX INFO: renamed from: h */
    private C0101l f354h;

    /* JADX INFO: renamed from: i */
    private C0090a f355i;

    public C0094e(C0191u r1, int r2, C0191u r3, C0194b r4, C0190t r5) {
        if (r1 == null) goto L14;
        if (r4 == null) goto L12;
        this.f348b = r1;
        this.f349c = r2;
        this.f350d = r3;
        if (r4.m504B() != 0) goto L8;
        C0086I r22 = null;
    L9:
        this.f351e = r22;
        this.f352f = r5;
        this.f353g = new C0093d(r1);
        this.f354h = null;
        this.f355i = new C0090a();
        return;
    L8:
        r22 = new C0086I(r4);
        goto L9
    L12:
        throw new NullPointerException("interfaces == null");
    L14:
        throw new NullPointerException("thisClass == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r7) {
        C0113x r0 = r7.m307q();
        C0079B r1 = r7.m293c();
        C0079B r2 = r7.m308r();
        C0113x r3 = r7.m306p();
        r0.m333v(this.f348b);
        C0093d r4 = this.f353g;
        if (r4.m274s() == true) goto L7;
        r7.m294d().m229o(r4);
        C0173c r72 = r4.m273r();
        if (r72 == null) goto L7;
        this.f354h = (C0101l) r1.m230p(new C0101l(r72));
    L7:
        C0191u r73 = this.f350d;
        if (r73 == null) goto L10;
        r0.m333v(r73);
    L10:
        C0086I r74 = this.f351e;
        if (r74 == null) goto L13;
        this.f351e = (C0086I) r2.m230p(r74);
    L13:
        C0190t r75 = this.f352f;
        if (r75 == null) goto L16;
        r3.m332u(r75);
    L16:
        this.f355i.getClass();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f413i;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r17, C0202d r18) {
        boolean r2 = r18.m486d();
        C0113x r3 = r17.m307q();
        C0191u r4 = this.f348b;
        int r5 = r3.m329r(r4);
        int r6 = -1;
        C0191u r7 = this.f350d;
        if (r7 != null) goto L5;
        int r32 = -1;
    L6:
        C0086I r8 = this.f351e;
        if (r8 != null) goto L9;
        int r82 = 0;
    L10:
        this.f355i.getClass();
        C0190t r10 = this.f352f;
        if (r10 == null) goto L14;
        r6 = r17.m306p().m328q(r10);
    L14:
        C0093d r11 = this.f353g;
        if (r11.m274s() == false) goto L17;
        int r112 = 0;
    L18:
        C0101l r12 = this.f354h;
        if (r12 != null) goto L21;
        int r122 = 0;
    L22:
        int r13 = this.f349c;
        if (r2 == false) goto L38;
        r18.m484b(0, m319g() + ' ' + r4.mo107a());
        r18.m484b(4, "  class_idx:           ".concat(RuntimeDexGenerator.m13s(r5)));
        StringBuilder r22 = new StringBuilder("  access_flags:        ");
        r22.append(RuntimeDexGenerator.m1f(r13));
        r18.m484b(4, r22.toString());
        StringBuilder r23 = new StringBuilder("  superclass_idx:      ");
        r23.append(RuntimeDexGenerator.m13s(r32));
        r23.append(" // ");
        String r15 = "<none>";
        if (r7 != null) goto L27;
        String r72 = "<none>";
    L28:
        r23.append(r72);
        r18.m484b(4, r23.toString());
        r18.m484b(4, "  interfaces_off:      ".concat(RuntimeDexGenerator.m13s(r82)));
        if (r82 == 0) goto L33;
        InterfaceC0197e r24 = this.f351e.m254m();
        int r73 = ((AbstractC0203e) r24).m504B();
        int r42 = 0;
    L31:
        if (r42 >= r73) goto L33;
        r18.m484b(0, "    " + r24.mo403b(r42).mo107a());
        r42 = r42 + 1;
    L33:
        StringBuilder r0 = new StringBuilder("  source_file_idx:     ");
        r0.append(RuntimeDexGenerator.m13s(r6));
        r0.append(" // ");
        if (r10 == null) goto L37;
        r15 = r10.mo107a();
    L37:
        r0.append(r15);
        r18.m484b(4, r0.toString());
        r18.m484b(4, "  annotations_off:     ".concat(RuntimeDexGenerator.m13s(0)));
        r18.m484b(4, "  class_data_off:      ".concat(RuntimeDexGenerator.m13s(r112)));
        r18.m484b(4, "  static_values_off:   ".concat(RuntimeDexGenerator.m13s(r122)));
        goto L38
    L27:
        r72 = r7.mo107a();
    L38:
        r18.m497q(r5);
        r18.m497q(r13);
        r18.m497q(r32);
        r18.m497q(r82);
        r18.m497q(r6);
        r18.m497q(0);
        r18.m497q(r112);
        r18.m497q(r122);
        return;
    L21:
        r122 = r12.m235f();
        goto L22
    L17:
        r112 = r11.m235f();
        goto L18
    L9:
        r82 = r8.m235f();
        goto L10
    L5:
        r32 = r3.m329r(r7);
        goto L6
    }

    /* JADX INFO: renamed from: i */
    public final void m275i(C0103n r2) {
        this.f353g.m271m(r2);
    }

    /* JADX INFO: renamed from: j */
    public final void m276j(C0103n r2) {
        this.f353g.m272n(r2);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0197e m277k() {
        C0086I r0 = this.f351e;
        if (r0 != null) goto L7;
        return C0194b.f722c;
    L7:
        return r0.m254m();
    }

    /* JADX INFO: renamed from: l */
    public final C0191u m278l() {
        return this.f350d;
    }

    /* JADX INFO: renamed from: m */
    public final C0191u m279m() {
        return this.f348b;
    }
}
