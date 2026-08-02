package p000;

import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends iy0 {
    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_HEADER_ITEM;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 112;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        int iM2516b = ((eh1) z70Var.f13753d).m2516b();
        eh1 eh1Var = (eh1) z70Var.f13751b;
        eh1 eh1Var2 = (eh1) z70Var.f13753d;
        int iM2516b2 = eh1Var.m2516b();
        int iM2516b3 = eh1Var2.m2516b();
        eh1Var2.m2518f();
        int i = (iM2516b3 + eh1Var2.f2445i) - iM2516b2;
        String strM5691j = vi0.m5691j("dex\n", "035", "\u0000");
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("magic: ".concat(new q30(strM5691j).m4048g()), 8);
            c0929yn.m6292c("checksum", 4);
            c0929yn.m6292c("signature", 20);
            int i2 = z70Var.f13750a;
            if (i2 < 0) {
                c80.m667j("file size not yet known");
                return;
            }
            c0929yn.m6292c("file_size:       ".concat(pp0.m3899K(i2)), 4);
            c0929yn.m6292c("header_size:     ".concat(pp0.m3899K(112)), 4);
            c0929yn.m6292c("endian_tag:      ".concat(pp0.m3899K(305419896)), 4);
            c0929yn.m6292c("link_size:       0", 4);
            c0929yn.m6292c("link_off:        0", 4);
            c0929yn.m6292c("map_off:         ".concat(pp0.m3899K(iM2516b)), 4);
        }
        for (int i3 = 0; i3 < 8; i3++) {
            c0929yn.m6297i(strM5691j.charAt(i3));
        }
        c0929yn.m6302n(24);
        int i4 = z70Var.f13750a;
        if (i4 < 0) {
            c80.m667j("file size not yet known");
            return;
        }
        c0929yn.m6298j(i4);
        c0929yn.m6298j(112);
        c0929yn.m6298j(305419896);
        c0929yn.m6302n(8);
        c0929yn.m6298j(iM2516b);
        b42 b42Var = (b42) z70Var.f13757h;
        b42Var.m2518f();
        int size = ((TreeMap) b42Var.f555g).size();
        int iM2516b4 = size == 0 ? 0 : b42Var.m2516b();
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("string_ids_size: ".concat(pp0.m3899K(size)), 4);
            c0929yn.m6292c("string_ids_off:  ".concat(pp0.m3899K(iM2516b4)), 4);
        }
        c0929yn.m6298j(size);
        c0929yn.m6298j(iM2516b4);
        b42 b42Var2 = (b42) z70Var.f13758i;
        b42Var2.m2518f();
        TreeMap treeMap = (TreeMap) b42Var2.f555g;
        int size2 = treeMap.size();
        int iM2516b5 = size2 == 0 ? 0 : b42Var2.m2516b();
        if (size2 > 65536) {
            throw new a80(null, String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536));
        }
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("type_ids_size:   ".concat(pp0.m3899K(size2)), 4);
            c0929yn.m6292c("type_ids_off:    ".concat(pp0.m3899K(iM2516b5)), 4);
        }
        c0929yn.m6298j(size2);
        c0929yn.m6298j(iM2516b5);
        b42 b42Var3 = (b42) z70Var.f13759j;
        b42Var3.m2518f();
        int size3 = ((TreeMap) b42Var3.f555g).size();
        int iM2516b6 = size3 == 0 ? 0 : b42Var3.m2516b();
        if (size3 > 65536) {
            c80.m676t("too many proto ids");
            return;
        }
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("proto_ids_size:  ".concat(pp0.m3899K(size3)), 4);
            c0929yn.m6292c("proto_ids_off:   ".concat(pp0.m3899K(iM2516b6)), 4);
        }
        c0929yn.m6298j(size3);
        c0929yn.m6298j(iM2516b6);
        ni0 ni0Var = (ni0) z70Var.f13760k;
        ni0Var.m2518f();
        int size4 = ni0Var.f7164f.size();
        int iM2516b7 = size4 == 0 ? 0 : ni0Var.m2516b();
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("field_ids_size:  ".concat(pp0.m3899K(size4)), 4);
            c0929yn.m6292c("field_ids_off:   ".concat(pp0.m3899K(iM2516b7)), 4);
        }
        c0929yn.m6298j(size4);
        c0929yn.m6298j(iM2516b7);
        xg1 xg1Var = (xg1) z70Var.f13761l;
        xg1Var.m2518f();
        int size5 = xg1Var.f13025f.size();
        int iM2516b8 = size5 == 0 ? 0 : xg1Var.m2516b();
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("method_ids_size: ".concat(pp0.m3899K(size5)), 4);
            c0929yn.m6292c("method_ids_off:  ".concat(pp0.m3899K(iM2516b8)), 4);
        }
        c0929yn.m6298j(size5);
        c0929yn.m6298j(iM2516b8);
        C0934ys c0934ys = (C0934ys) z70Var.f13762m;
        c0934ys.m2518f();
        int size6 = c0934ys.f13601f.size();
        int iM2516b9 = size6 != 0 ? c0934ys.m2516b() : 0;
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("class_defs_size: ".concat(pp0.m3899K(size6)), 4);
            c0929yn.m6292c("class_defs_off:  ".concat(pp0.m3899K(iM2516b9)), 4);
        }
        c0929yn.m6298j(size6);
        c0929yn.m6298j(iM2516b9);
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("data_size:       ".concat(pp0.m3899K(i)), 4);
            c0929yn.m6292c("data_off:        ".concat(pp0.m3899K(iM2516b2)), 4);
        }
        c0929yn.m6298j(i);
        c0929yn.m6298j(iM2516b2);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
    }
}
