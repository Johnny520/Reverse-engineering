package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: g.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0105p extends AbstractC0107r {
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo233d(C0100k c0100k, C0202d c0202d) {
        String str;
        int iM247e = c0100k.m301k().m247e();
        C0079B c0079bM299i = c0100k.m299i();
        C0079B c0079bM300j = c0100k.m300j();
        int iM247e2 = c0079bM299i.m247e();
        int iMo227l = (c0079bM300j.mo227l() + c0079bM300j.m247e()) - iM247e2;
        int i2 = c0100k.m296f().f64a;
        if (i2 < 28) {
            str = i2 >= 10000 ? "040" : i2 >= 28 ? "039" : i2 >= 26 ? "038" : i2 >= 24 ? "037" : "035";
        }
        String str2 = "dex\n" + str + "\u0000";
        if (c0202d.m486d()) {
            c0202d.m484b(8, "magic: " + new C0190t(str2).m448k());
            c0202d.m484b(4, "checksum");
            c0202d.m484b(20, "signature");
            c0202d.m484b(4, "file_size:       ".concat(RuntimeDexGenerator.m13s(c0100k.m298h())));
            c0202d.m484b(4, "header_size:     ".concat(RuntimeDexGenerator.m13s(112)));
            c0202d.m484b(4, "endian_tag:      ".concat(RuntimeDexGenerator.m13s(305419896)));
            c0202d.m484b(4, "link_size:       0");
            c0202d.m484b(4, "link_off:        0");
            c0202d.m484b(4, "map_off:         ".concat(RuntimeDexGenerator.m13s(iM247e)));
        }
        for (int i3 = 0; i3 < 8; i3++) {
            c0202d.m496p(str2.charAt(i3));
        }
        c0202d.m501u(24);
        c0202d.m497q(c0100k.m298h());
        c0202d.m497q(112);
        c0202d.m497q(305419896);
        c0202d.m501u(8);
        c0202d.m497q(iM247e);
        c0100k.m306p().m336y(c0202d);
        c0100k.m307q().m336y(c0202d);
        c0100k.m304n().m336y(c0202d);
        c0100k.m297g().m315p(c0202d);
        c0100k.m303m().m340s(c0202d);
        c0100k.m295e().m262r(c0202d);
        if (c0202d.m486d()) {
            c0202d.m484b(4, "data_size:       ".concat(RuntimeDexGenerator.m13s(iMo227l)));
            c0202d.m484b(4, "data_off:        ".concat(RuntimeDexGenerator.m13s(iM247e2)));
        }
        c0202d.m497q(iMo227l);
        c0202d.m497q(iM247e2);
    }
}
