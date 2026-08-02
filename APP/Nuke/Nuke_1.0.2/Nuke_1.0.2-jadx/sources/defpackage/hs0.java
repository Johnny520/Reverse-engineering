package defpackage;

import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends iy0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_HEADER_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 112;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        int iB = ((eh1) z70Var.d).b();
        eh1 eh1Var = (eh1) z70Var.b;
        eh1 eh1Var2 = (eh1) z70Var.d;
        int iB2 = eh1Var.b();
        int iB3 = eh1Var2.b();
        eh1Var2.f();
        int i = (iB3 + eh1Var2.i) - iB2;
        String strJ = vi0.j("dex\n", "035", "\u0000");
        if (ynVar.d()) {
            ynVar.c("magic: ".concat(new q30(strJ).g()), 8);
            ynVar.c("checksum", 4);
            ynVar.c("signature", 20);
            int i2 = z70Var.a;
            if (i2 < 0) {
                c80.j("file size not yet known");
                return;
            }
            ynVar.c("file_size:       ".concat(pp0.K(i2)), 4);
            ynVar.c("header_size:     ".concat(pp0.K(112)), 4);
            ynVar.c("endian_tag:      ".concat(pp0.K(305419896)), 4);
            ynVar.c("link_size:       0", 4);
            ynVar.c("link_off:        0", 4);
            ynVar.c("map_off:         ".concat(pp0.K(iB)), 4);
        }
        for (int i3 = 0; i3 < 8; i3++) {
            ynVar.i(strJ.charAt(i3));
        }
        ynVar.n(24);
        int i4 = z70Var.a;
        if (i4 < 0) {
            c80.j("file size not yet known");
            return;
        }
        ynVar.j(i4);
        ynVar.j(112);
        ynVar.j(305419896);
        ynVar.n(8);
        ynVar.j(iB);
        b42 b42Var = (b42) z70Var.h;
        b42Var.f();
        int size = ((TreeMap) b42Var.g).size();
        int iB4 = size == 0 ? 0 : b42Var.b();
        if (ynVar.d()) {
            ynVar.c("string_ids_size: ".concat(pp0.K(size)), 4);
            ynVar.c("string_ids_off:  ".concat(pp0.K(iB4)), 4);
        }
        ynVar.j(size);
        ynVar.j(iB4);
        b42 b42Var2 = (b42) z70Var.i;
        b42Var2.f();
        TreeMap treeMap = (TreeMap) b42Var2.g;
        int size2 = treeMap.size();
        int iB5 = size2 == 0 ? 0 : b42Var2.b();
        if (size2 > 65536) {
            throw new a80(null, String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536));
        }
        if (ynVar.d()) {
            ynVar.c("type_ids_size:   ".concat(pp0.K(size2)), 4);
            ynVar.c("type_ids_off:    ".concat(pp0.K(iB5)), 4);
        }
        ynVar.j(size2);
        ynVar.j(iB5);
        b42 b42Var3 = (b42) z70Var.j;
        b42Var3.f();
        int size3 = ((TreeMap) b42Var3.g).size();
        int iB6 = size3 == 0 ? 0 : b42Var3.b();
        if (size3 > 65536) {
            c80.t("too many proto ids");
            return;
        }
        if (ynVar.d()) {
            ynVar.c("proto_ids_size:  ".concat(pp0.K(size3)), 4);
            ynVar.c("proto_ids_off:   ".concat(pp0.K(iB6)), 4);
        }
        ynVar.j(size3);
        ynVar.j(iB6);
        ni0 ni0Var = (ni0) z70Var.k;
        ni0Var.f();
        int size4 = ni0Var.f.size();
        int iB7 = size4 == 0 ? 0 : ni0Var.b();
        if (ynVar.d()) {
            ynVar.c("field_ids_size:  ".concat(pp0.K(size4)), 4);
            ynVar.c("field_ids_off:   ".concat(pp0.K(iB7)), 4);
        }
        ynVar.j(size4);
        ynVar.j(iB7);
        xg1 xg1Var = (xg1) z70Var.l;
        xg1Var.f();
        int size5 = xg1Var.f.size();
        int iB8 = size5 == 0 ? 0 : xg1Var.b();
        if (ynVar.d()) {
            ynVar.c("method_ids_size: ".concat(pp0.K(size5)), 4);
            ynVar.c("method_ids_off:  ".concat(pp0.K(iB8)), 4);
        }
        ynVar.j(size5);
        ynVar.j(iB8);
        ys ysVar = (ys) z70Var.m;
        ysVar.f();
        int size6 = ysVar.f.size();
        int iB9 = size6 != 0 ? ysVar.b() : 0;
        if (ynVar.d()) {
            ynVar.c("class_defs_size: ".concat(pp0.K(size6)), 4);
            ynVar.c("class_defs_off:  ".concat(pp0.K(iB9)), 4);
        }
        ynVar.j(size6);
        ynVar.j(iB9);
        if (ynVar.d()) {
            ynVar.c("data_size:       ".concat(pp0.K(i)), 4);
            ynVar.c("data_off:        ".concat(pp0.K(iB2)), 4);
        }
        ynVar.j(i);
        ynVar.j(iB2);
    }

    @Override // defpackage.f21
    public final void a(z70 z70Var) {
    }
}
