package p255r4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4472u;
import p311v4.C4449b0;
import p311v4.C4450c;
import p311v4.C4452d;
import p311v4.C4453d0;
import p311v4.C4456f;
import p311v4.C4458g;
import p311v4.C4461j;
import p311v4.C4462k;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4469r;
import p311v4.C4473v;
import p326w4.C4683c;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3677j extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4453d0 f11938k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f11939l;

    /* JADX INFO: renamed from: m */
    public final HashMap f11940m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f11941n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f11942o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f11943p;

    /* JADX INFO: renamed from: q */
    public C4452d f11944q;

    /* JADX INFO: renamed from: r */
    public byte[] f11945r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3677j(C4453d0 c4453d0) {
        super(1, -1);
        if (c4453d0 == null) {
            C0353j.m1305c("thisClass == null");
            throw null;
        }
        this.f11938k = c4453d0;
        this.f11939l = new ArrayList(20);
        this.f11940m = new HashMap(40);
        this.f11941n = new ArrayList(20);
        this.f11942o = new ArrayList(20);
        this.f11943p = new ArrayList(20);
        this.f11944q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m7666n(C3689p c3689p, C6090d c6090d, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, "  " + str + ":");
        }
        int iMo7705d = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iMo7705d = ((AbstractC3695s) arrayList.get(i9)).mo7705d(c3689p, c6090d, iMo7705d, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m7667p(C6090d c6090d, String str, int i9) {
        if (c6090d.m10829d()) {
            c6090d.m10828c(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i9)));
        }
        c6090d.m10838n(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        ArrayList<C3693r> arrayList = this.f11939l;
        if (!arrayList.isEmpty()) {
            m7669q();
            for (C3693r c3693r : arrayList) {
                c3693r.getClass();
                c3689p.f12007i.m7708m(c3693r.f12026h);
            }
        }
        ArrayList<C3693r> arrayList2 = this.f11941n;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (C3693r c3693r2 : arrayList2) {
                c3693r2.getClass();
                c3689p.f12007i.m7708m(c3693r2.f12026h);
            }
        }
        ArrayList<C3697t> arrayList3 = this.f11942o;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (C3697t c3697t : arrayList3) {
                c3697t.getClass();
                C3678j0 c3678j0 = c3689p.f12008j;
                C3680k0 c3680k0 = c3689p.f12000b;
                c3678j0.m7672m(c3697t.f12030h);
                C3681l c3681l = c3697t.f12031i;
                if (c3681l != null) {
                    c3680k0.m7678k(c3681l);
                }
            }
        }
        ArrayList<C3697t> arrayList4 = this.f11943p;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (C3697t c3697t2 : arrayList4) {
            c3697t2.getClass();
            C3678j0 c3678j02 = c3689p.f12008j;
            C3680k0 c3680k02 = c3689p.f12000b;
            c3678j02.m7672m(c3697t2.f12030h);
            C3681l c3681l2 = c3697t2.f12031i;
            if (c3681l2 != null) {
                c3680k02.m7678k(c3681l2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11893w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        C6090d c6090d = new C6090d();
        m7668o(c3680k0.f11995b, c6090d);
        byte[] bArrM10832h = c6090d.m10832h();
        this.f11945r = bArrM10832h;
        m7684k(bArrM10832h.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        if (c6090d.m10829d()) {
            m7668o(c3689p, c6090d);
        } else {
            c6090d.m10833i(this.f11945r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m7668o(C3689p c3689p, C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        if (zM10829d) {
            c6090d.m10827b(0, m7682g() + " class data for " + this.f11938k.f14784g.mo4901a());
        }
        ArrayList arrayList = this.f11939l;
        m7667p(c6090d, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f11941n;
        m7667p(c6090d, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f11942o;
        m7667p(c6090d, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f11943p;
        m7667p(c6090d, "virtual_methods", arrayList4.size());
        m7666n(c3689p, c6090d, "static_fields", arrayList);
        m7666n(c3689p, c6090d, "instance_fields", arrayList2);
        m7666n(c3689p, c6090d, "direct_methods", arrayList3);
        m7666n(c3689p, c6090d, "virtual_methods", arrayList4);
        if (zM10829d) {
            c6090d.m10830e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final C4452d m7669q() {
        HashMap map;
        C4452d c4452d;
        AbstractC4446a abstractC4446a;
        if (this.f11944q == null) {
            ArrayList arrayList = this.f11939l;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f11940m;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC4446a abstractC4446a2 = (AbstractC4446a) map.get((C3693r) arrayList.get(size - 1));
                    if (abstractC4446a2 instanceof AbstractC4472u) {
                        if (((AbstractC4472u) abstractC4446a2).mo8914m() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC4446a2 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c4452d = null;
                } else {
                    C4450c c4450c = new C4450c(size);
                    for (int i9 = 0; i9 < size; i9++) {
                        C3693r c3693r = (C3693r) arrayList.get(i9);
                        AbstractC4446a abstractC4446a3 = (AbstractC4446a) map.get(c3693r);
                        if (abstractC4446a3 == null) {
                            C4683c c4683cM8917k = c3693r.f12026h.f14822h.m8917k();
                            switch (c4683cM8917k.f15649h) {
                                case 1:
                                    abstractC4446a = C4456f.f14789h;
                                    break;
                                case 2:
                                    abstractC4446a = C4458g.f14791h;
                                    break;
                                case 3:
                                    abstractC4446a = C4461j.f14794h;
                                    break;
                                case 4:
                                    abstractC4446a = C4462k.f14795h;
                                    break;
                                case 5:
                                    abstractC4446a = C4465n.f14798h;
                                    break;
                                case 6:
                                    abstractC4446a = C4466o.f14803j;
                                    break;
                                case 7:
                                    abstractC4446a = C4473v.f14819h;
                                    break;
                                case 8:
                                    abstractC4446a = C4449b0.f14759h;
                                    break;
                                case 9:
                                    abstractC4446a = C4469r.f14816g;
                                    break;
                                default:
                                    throw new UnsupportedOperationException("no zero for type: " + c4683cM8917k.mo4901a());
                            }
                            abstractC4446a3 = abstractC4446a;
                        }
                        c4450c.m10841m(i9, abstractC4446a3);
                    }
                    c4450c.f24613g = false;
                    c4452d = new C4452d(c4450c);
                }
                this.f11944q = c4452d;
            }
        }
        return this.f11944q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m7670r() {
        return this.f11939l.isEmpty() && this.f11941n.isEmpty() && this.f11942o.isEmpty() && this.f11943p.isEmpty();
    }
}
