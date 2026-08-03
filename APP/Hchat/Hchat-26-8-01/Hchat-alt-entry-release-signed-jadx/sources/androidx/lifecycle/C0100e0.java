package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p012ah.C0086a;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3536s;
import p302ud.C4322r;
import p357y1.C5956y1;

/* JADX INFO: renamed from: androidx.lifecycle.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0100e0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f284a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0100e0(C4322r c4322r) {
        List<C3515s> list = c4322r.f14404D;
        this.f284a = new LinkedHashMap(list.size());
        for (C3515s c3515s : list) {
            this.f284a.put(c3515s, new C3536s(c3515s));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m545a() {
        LinkedHashMap linkedHashMap = this.f284a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C5956y1) it.next()).m10674a();
        }
        linkedHashMap.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public AbstractC3506j m546b(AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        return abstractC3508l instanceof C3514r ? m547c(((C3514r) abstractC3508l).f11440m).f11504c : abstractC3508l.mo7375I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public C3536s m547c(C3515s c3515s) {
        C3536s c3536s = (C3536s) this.f284a.get(c3515s);
        if (c3536s != null) {
            return c3536s;
        }
        C0086a.m452k("TypeSearchVarInfo not found in map for var: ".concat(String.valueOf(c3515s)));
        return null;
    }

    public C0100e0(int i9) {
        switch (i9) {
            case 1:
                this.f284a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f284a = new LinkedHashMap();
                break;
        }
    }
}
