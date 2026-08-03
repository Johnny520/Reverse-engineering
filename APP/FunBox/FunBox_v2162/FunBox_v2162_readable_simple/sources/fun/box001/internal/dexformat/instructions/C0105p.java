package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: g.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0105p extends AbstractC0107r {
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r1) {
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f408d;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: c */
    public final int mo232c() {
        return 112;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    public final void mo233d(C0100k r12, C0202d r13) {
        int r0 = r12.m301k().m247e();
        C0079B r1 = r12.m299i();
        C0079B r2 = r12.m300j();
        int r14 = r1.m247e();
        int r22 = (r2.mo227l() + r2.m247e()) - r14;
        int r3 = r12.m296f().f64a;
        if (r3 < 28) goto L6;
    L9:
        String r32 = "039";
    L16:
        String r33 = "dex\n" + r32 + "\u0000";
        if (r13.m486d() == false) goto L19;
        r13.m484b(8, "magic: " + new C0190t(r33).m448k());
        r13.m484b(4, "checksum");
        r13.m484b(20, "signature");
        r13.m484b(4, "file_size:       ".concat(RuntimeDexGenerator.m13s(r12.m298h())));
        r13.m484b(4, "header_size:     ".concat(RuntimeDexGenerator.m13s(112)));
        r13.m484b(4, "endian_tag:      ".concat(RuntimeDexGenerator.m13s(305419896)));
        r13.m484b(4, "link_size:       0");
        r13.m484b(4, "link_off:        0");
        r13.m484b(4, "map_off:         ".concat(RuntimeDexGenerator.m13s(r0)));
    L19:
        int r5 = 0;
    L20:
        if (r5 >= 8) goto L22;
        r13.m496p(r33.charAt(r5));
        r5 = r5 + 1;
        goto L20
    L22:
        r13.m501u(24);
        r13.m497q(r12.m298h());
        r13.m497q(112);
        r13.m497q(305419896);
        r13.m501u(8);
        r13.m497q(r0);
        r12.m306p().m336y(r13);
        r12.m307q().m336y(r13);
        r12.m304n().m336y(r13);
        r12.m297g().m315p(r13);
        r12.m303m().m340s(r13);
        r12.m295e().m262r(r13);
        if (r13.m486d() == false) goto L25;
        r13.m484b(4, "data_size:       ".concat(RuntimeDexGenerator.m13s(r22)));
        r13.m484b(4, "data_off:        ".concat(RuntimeDexGenerator.m13s(r14)));
    L25:
        r13.m497q(r22);
        r13.m497q(r14);
        return;
    L6:
        if (r3 < 10000) goto L8;
        r32 = "040";
        goto L16
    L8:
        if (r3 >= 28) goto L9;
        if (r3 < 26) goto L13;
        r32 = "038";
        goto L16
    L13:
        if (r3 < 24) goto L15;
        r32 = "037";
        goto L16
    L15:
        r32 = "035";
        goto L16
    }
}
