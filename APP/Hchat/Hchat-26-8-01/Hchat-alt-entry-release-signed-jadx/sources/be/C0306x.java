package be;

import af.C0084g;
import java.util.ArrayList;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p199nd.C2991w;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4317m;
import p351xe.C5791l;

/* JADX INFO: renamed from: be.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0306x extends AbstractC0269a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0306x.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        C4322r c4322r2;
        if (c4322r.f14415p) {
            return;
        }
        for (C4305a c4305a : c4322r.f14425z) {
            for (C4320p c4320p : c4305a.f14351l) {
                if (c4320p.f14396k == EnumC3400k.f10963O) {
                    C3403n c3403n = (C3403n) c4320p;
                    InterfaceC4317m interfaceC4317m = (InterfaceC4317m) c3403n.f9217g.mo6237c(C2825b.f9182I);
                    if (interfaceC4317m instanceof C4322r) {
                        C4322r c4322r3 = (C4322r) interfaceC4317m;
                        try {
                            C2991w c2991wM1081Q = C0271b.m1081Q(c4322r3);
                            if (c2991wM1081Q == null) {
                                c4322r.m6380I("Class process forced to load method for inline: ".concat(String.valueOf(c4322r3)));
                                c4322r.f14411l.f14371k.f14452r.m1989a(c4322r3.f14411l);
                                c2991wM1081Q = C0271b.m1081Q(c4322r3);
                                if (c2991wM1081Q == null) {
                                    c4322r.m6383L("Failed to check method for inline after forced process".concat(String.valueOf(c4322r3)));
                                    c4322r2 = c4322r;
                                }
                            }
                            if (!(c2991wM1081Q.f9763g == null)) {
                                c4322r2 = c4322r;
                                m1220i(c4322r2, c4322r3, c2991wM1081Q, c4305a, c3403n);
                            }
                            c4322r2 = c4322r;
                        } catch (Exception e6) {
                            throw new C0084g("Failed to process method for inline: ".concat(String.valueOf(c4322r3)), e6);
                        }
                    } else {
                        c4322r2 = c4322r;
                    }
                } else {
                    c4322r2 = c4322r;
                }
                c4322r = c4322r2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0007, B:5:0x0011, B:6:0x0018, B:8:0x001b, B:11:0x0029, B:12:0x0035, B:14:0x003b, B:17:0x0047, B:18:0x006b, B:20:0x006f, B:21:0x0093, B:23:0x009d, B:24:0x00c2, B:26:0x00c7, B:37:0x00ec, B:29:0x00d3, B:32:0x00de, B:35:0x00e5), top: B:49:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0007, B:5:0x0011, B:6:0x0018, B:8:0x001b, B:11:0x0029, B:12:0x0035, B:14:0x003b, B:17:0x0047, B:18:0x006b, B:20:0x006f, B:21:0x0093, B:23:0x009d, B:24:0x00c2, B:26:0x00c7, B:37:0x00ec, B:29:0x00d3, B:32:0x00de, B:35:0x00e5), top: B:49:0x0007 }] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1220i(C4322r c4322r, C4322r c4322r2, C2991w c2991w, C4305a c4305a, C3403n c3403n) {
        C3514r c3514r;
        boolean z9;
        C4320p c4320p = c2991w.f9763g;
        C4320p c4320pMo7167O = c4320p.mo7167O();
        boolean z10 = false;
        try {
            if (c4322r2.f14410k.f10152i.isEmpty()) {
                c3514r = c3403n.f14397l;
                if (c3514r == null) {
                }
                z10 = true;
            } else {
                int i9 = c4322r2.f14416q;
                AbstractC3508l[] abstractC3508lArr = new AbstractC3508l[i9];
                int[] iArr = c2991w.f9764h;
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    abstractC3508lArr[iArr[i10]] = c3403n.mo7179S(i10);
                }
                ArrayList<C3514r> arrayList = new ArrayList();
                c4320pMo7167O.mo8340U(arrayList);
                for (C3514r c3514r2 : arrayList) {
                    int i11 = c3514r2.f11439l;
                    if (i11 >= i9) {
                        c4322r.m6383L("Unknown register number '" + String.valueOf(c3514r2) + "' in method call: " + String.valueOf(c4322r2));
                        break;
                    }
                    AbstractC3508l abstractC3508l = abstractC3508lArr[i11];
                    if (abstractC3508l == null) {
                        c4322r.m6383L("Not passed register '" + String.valueOf(c3514r2) + "' in method call: " + String.valueOf(c4322r2));
                        break;
                    }
                    if (!c4320pMo7167O.mo7181b0(c3514r2, abstractC3508l.mo7374H())) {
                        c4322r.m6383L("Failed to replace arg " + String.valueOf(c3514r2) + " for method inline: " + String.valueOf(c4322r2));
                        break;
                    }
                }
                c3514r = c3403n.f14397l;
                if (c3514r == null) {
                    c4320pMo7167O.m8688d0(c3514r.mo7374H());
                } else if (c3514r != null) {
                    z9 = false;
                    if (z9) {
                        C3514r c3514rM8704c0 = c4322r.m8704c0(c4322r2.f14419t);
                        c3514rM8704c0.mo7390p("unused");
                        c4320pMo7167O.m8688d0(c3514rM8704c0);
                    }
                } else {
                    if (c3403n.f9217g.mo6235a(EnumC2824a.f9133S) || c4320p.f14396k == EnumC3400k.f10960L) {
                        z9 = false;
                        if (z9) {
                        }
                    } else {
                        z9 = !c4322r2.m8701Z();
                        if (z9) {
                        }
                    }
                }
                z10 = true;
            }
        } catch (Exception e6) {
            c4322r.m6384M("Method inline failed with exception", e6);
        }
        if (z10) {
            InterfaceC4317m interfaceC4317m = (InterfaceC4317m) c4320pMo7167O.f9217g.mo6237c(C2825b.f9182I);
            if (AbstractC0000a.m20K0(c4322r, c4305a, c3403n, c4320pMo7167O)) {
                if (interfaceC4317m != null) {
                    c4320pMo7167O.m6233y(interfaceC4317m);
                }
                c4322r2.f14408H.remove(c4322r);
                c4320p.mo8342h0(new C0305w(this, c4322r, c4322r2));
                return;
            }
        }
        c4322r.m6383L("Failed to inline method: ".concat(String.valueOf(c4322r2)));
        C5791l.m10478j(c4322r, c4320pMo7167O);
        c3403n.mo8341Z();
    }
}
