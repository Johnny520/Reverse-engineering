package p216oe;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p302ud.C4320p;
import td.C4146b;

/* JADX INFO: renamed from: oe.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3133a {

    /* JADX INFO: renamed from: a */
    public final C4320p f10161a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f10162b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f10163c;

    /* JADX INFO: renamed from: d */
    public final int f10164d;

    /* JADX INFO: renamed from: e */
    public int f10165e;

    /* JADX INFO: renamed from: f */
    public C3133a f10166f;

    /* JADX INFO: renamed from: g */
    public ArrayList f10167g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3133a(C4320p c4320p, ArrayList arrayList, int i9) {
        this.f10161a = c4320p;
        this.f10162b = arrayList;
        this.f10164d = i9;
        this.f10165e = i9;
        ArrayList arrayList2 = new ArrayList();
        m6668a(c4320p, arrayList2);
        this.f10163c = arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6668a(C4320p c4320p, ArrayList arrayList) {
        EnumC3400k enumC3400k = c4320p.f14396k;
        List<AbstractC3508l> list = c4320p.f14398m;
        if (enumC3400k == EnumC3400k.f10966R) {
            arrayList.addAll(((C4146b) c4320p).f13664o.m10795J());
        }
        for (AbstractC3508l abstractC3508l : list) {
            abstractC3508l.getClass();
            if (abstractC3508l instanceof C3514r) {
                arrayList.add((C3514r) abstractC3508l);
            }
        }
        for (AbstractC3508l abstractC3508l2 : list) {
            abstractC3508l2.getClass();
            if (abstractC3508l2 instanceof C3509m) {
                m6668a(((C3509m) abstractC3508l2).f11421l, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m6669e(C4320p c4320p, BitSet bitSet) {
        C3514r c3514r;
        if (bitSet.isEmpty() || (c3514r = c4320p.f14397l) == null) {
            return false;
        }
        return bitSet.get(c3514r.f11439l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m6670b() {
        if (!this.f10161a.m8680N()) {
            return false;
        }
        ArrayList arrayList = this.f10167g;
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C3133a) it.next()).m6670b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6671c(BitSet bitSet) {
        Iterator it = this.f10163c.iterator();
        while (it.hasNext()) {
            bitSet.set(((C3514r) it.next()).f11439l);
        }
        ArrayList arrayList = this.f10167g;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C3133a) it2.next()).m6671c(bitSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C3133a m6672d() {
        C3133a c3133aM6672d;
        C3133a c3133a = this.f10166f;
        if (c3133a != null && (c3133aM6672d = c3133a.m6672d()) != null) {
            this.f10166f = c3133aM6672d;
        }
        return this.f10166f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f10165e;
        C3133a c3133a = this.f10166f;
        return "ArgsInfo: |" + i9 + " ->" + String.valueOf(c3133a == null ? "-" : Integer.valueOf(c3133a.f10164d)) + " " + String.valueOf(this.f10163c) + " : " + String.valueOf(this.f10161a);
    }
}
