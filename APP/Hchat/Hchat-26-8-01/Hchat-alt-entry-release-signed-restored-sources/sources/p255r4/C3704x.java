package p255r4;

import bsh.C0353j;
import java.util.TreeMap;
import p000a.AbstractC0000a;
import p060e4.C0825b;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p311v4.C4451c0;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3704x extends AbstractC3706z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11880j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        return 112;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        int iM7696b = c3689p.f12002d.m7696b();
        C3680k0 c3680k0 = c3689p.f12000b;
        C3680k0 c3680k02 = c3689p.f12002d;
        int iM7696b2 = c3680k0.m7696b();
        int iM7696b3 = c3680k02.m7696b();
        c3680k02.m7698f();
        int i9 = (iM7696b3 + c3680k02.f11959i) - iM7696b2;
        String strM2251n = AbstractC0921a.m2251n("dex\n", "035", "\u0000");
        if (c6090d.m10829d()) {
            c6090d.m10827b(8, "magic: ".concat(new C4451c0(strM2251n).m8901l()));
            c6090d.m10827b(4, "checksum");
            c6090d.m10827b(20, "signature");
            int i10 = c3689p.f12016r;
            if (i10 < 0) {
                C0353j.m1309g("file size not yet known");
                return;
            }
            c6090d.m10827b(4, "file_size:       ".concat(AbstractC0000a.m48Y0(i10)));
            c6090d.m10827b(4, "header_size:     ".concat(AbstractC0000a.m48Y0(112)));
            c6090d.m10827b(4, "endian_tag:      ".concat(AbstractC0000a.m48Y0(305419896)));
            c6090d.m10827b(4, "link_size:       0");
            c6090d.m10827b(4, "link_off:        0");
            c6090d.m10827b(4, "map_off:         ".concat(AbstractC0000a.m48Y0(iM7696b)));
        }
        for (int i11 = 0; i11 < 8; i11++) {
            c6090d.m10834j(strM2251n.charAt(i11));
        }
        c6090d.m10839o(24);
        int i12 = c3689p.f12016r;
        if (i12 < 0) {
            C0353j.m1309g("file size not yet known");
            return;
        }
        c6090d.m10835k(i12);
        c6090d.m10835k(112);
        c6090d.m10835k(305419896);
        c6090d.m10839o(8);
        c6090d.m10835k(iM7696b);
        C3674h0 c3674h0 = c3689p.f12004f;
        c3674h0.m7698f();
        int size = ((TreeMap) c3674h0.f11932g).size();
        int iM7696b4 = size == 0 ? 0 : c3674h0.m7696b();
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "string_ids_size: ".concat(AbstractC0000a.m48Y0(size)));
            c6090d.m10827b(4, "string_ids_off:  ".concat(AbstractC0000a.m48Y0(iM7696b4)));
        }
        c6090d.m10835k(size);
        c6090d.m10835k(iM7696b4);
        C3674h0 c3674h02 = c3689p.f12005g;
        c3674h02.m7698f();
        TreeMap treeMap = (TreeMap) c3674h02.f11932g;
        int size2 = treeMap.size();
        int iM7696b5 = size2 == 0 ? 0 : c3674h02.m7696b();
        if (size2 > 65536) {
            throw new C0825b(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "type_ids_size:   ".concat(AbstractC0000a.m48Y0(size2)));
            c6090d.m10827b(4, "type_ids_off:    ".concat(AbstractC0000a.m48Y0(iM7696b5)));
        }
        c6090d.m10835k(size2);
        c6090d.m10835k(iM7696b5);
        C3674h0 c3674h03 = c3689p.f12006h;
        c3674h03.m7698f();
        int size3 = ((TreeMap) c3674h03.f11932g).size();
        int iM7696b6 = size3 == 0 ? 0 : c3674h03.m7696b();
        if (size3 > 65536) {
            C2104o.m5297w("too many proto ids");
            return;
        }
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "proto_ids_size:  ".concat(AbstractC0000a.m48Y0(size3)));
            c6090d.m10827b(4, "proto_ids_off:   ".concat(AbstractC0000a.m48Y0(iM7696b6)));
        }
        c6090d.m10835k(size3);
        c6090d.m10835k(iM7696b6);
        C3703w c3703w = c3689p.f12007i;
        c3703w.m7698f();
        int size4 = c3703w.f12037f.size();
        int iM7696b7 = size4 == 0 ? 0 : c3703w.m7696b();
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "field_ids_size:  ".concat(AbstractC0000a.m48Y0(size4)));
            c6090d.m10827b(4, "field_ids_off:   ".concat(AbstractC0000a.m48Y0(iM7696b7)));
        }
        c6090d.m10835k(size4);
        c6090d.m10835k(iM7696b7);
        C3678j0 c3678j0 = c3689p.f12008j;
        c3678j0.m7698f();
        int size5 = c3678j0.f11946f.size();
        int iM7696b8 = size5 == 0 ? 0 : c3678j0.m7696b();
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "method_ids_size: ".concat(AbstractC0000a.m48Y0(size5)));
            c6090d.m10827b(4, "method_ids_off:  ".concat(AbstractC0000a.m48Y0(iM7696b8)));
        }
        c6090d.m10835k(size5);
        c6090d.m10835k(iM7696b8);
        C3671g c3671g = c3689p.f12009k;
        c3671g.m7698f();
        int size6 = c3671g.f11926g.size();
        int iM7696b9 = size6 != 0 ? c3671g.m7696b() : 0;
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "class_defs_size: ".concat(AbstractC0000a.m48Y0(size6)));
            c6090d.m10827b(4, "class_defs_off:  ".concat(AbstractC0000a.m48Y0(iM7696b9)));
        }
        c6090d.m10835k(size6);
        c6090d.m10835k(iM7696b9);
        if (c6090d.m10829d()) {
            c6090d.m10827b(4, "data_size:       ".concat(AbstractC0000a.m48Y0(i9)));
            c6090d.m10827b(4, "data_off:        ".concat(AbstractC0000a.m48Y0(iM7696b2)));
        }
        c6090d.m10835k(i9);
        c6090d.m10835k(iM7696b2);
    }

    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
    }
}
