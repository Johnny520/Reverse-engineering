package me;

import be.AbstractC0283h;
import java.util.ArrayList;
import java.util.Iterator;
import md.EnumC2824a;
import p038ce.C0556i;
import p233pd.EnumC3400k;
import p246qd.C3514r;
import p246qd.C3515s;
import p259r9.AbstractC3754e0;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;

/* JADX INFO: renamed from: me.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2835c extends AbstractC3754e0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0008 A[SYNTHETIC] */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2617d(C4322r c4322r, InterfaceC4312h interfaceC4312h) {
        boolean zM1159g;
        int iOrdinal;
        for (C4320p c4320p : interfaceC4312h.mo8643g()) {
            C3514r c3514r = c4320p.f14397l;
            EnumC3400k enumC3400k = c4320p.f14396k;
            if (c3514r != null) {
                C3515s c3515s = c3514r.f11440m;
                boolean z9 = false;
                if (c3515s == null) {
                    zM1159g = true;
                    if (zM1159g) {
                        int iOrdinal2 = enumC3400k.ordinal();
                        if (iOrdinal2 == 34 || iOrdinal2 == 38) {
                            z9 = true;
                            if (!z9) {
                            }
                        } else {
                            if (c4320p.m8686W() || (iOrdinal = enumC3400k.ordinal()) == 8 || iOrdinal == 20) {
                                c4320p.m6231w(EnumC2824a.f9168u);
                                c4320p.m6231w(EnumC2824a.f9166s);
                                z9 = true;
                            }
                            if (!z9) {
                                c4320p.f14397l = null;
                                c4322r.f14404D.remove(c3515s);
                                Iterator it = c3515s.f11445j.iterator();
                                while (it.hasNext()) {
                                    ((C3514r) it.next()).f11440m = null;
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayList = c3515s.f11445j;
                    if (!arrayList.isEmpty()) {
                        zM1159g = c3515s.m7405j() ? false : AbstractC0283h.m1159g(arrayList, new C0556i(this, c4322r));
                    }
                    if (zM1159g) {
                    }
                }
            }
        }
    }
}
