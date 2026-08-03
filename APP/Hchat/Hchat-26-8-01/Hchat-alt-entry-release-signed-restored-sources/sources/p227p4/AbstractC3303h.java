package p227p4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4270t;
import p376z4.C6090d;

/* JADX INFO: renamed from: p4.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3303h {

    /* JADX INFO: renamed from: a */
    public int f10487a;

    /* JADX INFO: renamed from: b */
    public final C3305j f10488b;

    /* JADX INFO: renamed from: c */
    public final C4270t f10489c;

    /* JADX INFO: renamed from: d */
    public final C4266p f10490d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3303h(C3305j c3305j, C4270t c4270t, C4266p c4266p) {
        if (c3305j == null) {
            C0353j.m1305c("opcode == null");
            throw null;
        }
        if (c4270t == null) {
            C0353j.m1305c("position == null");
            throw null;
        }
        if (c4266p == null) {
            C0353j.m1305c("registers == null");
            throw null;
        }
        this.f10487a = -1;
        this.f10488b = c3305j;
        this.f10489c = c4270t;
        this.f10490d = c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C3321z m6988h(C4270t c4270t, C4265o c4265o, C4265o c4265o2) {
        boolean z9 = c4265o.m8561j() == 1;
        boolean zM9196t = c4265o.f13966h.getType().m9196t();
        int i9 = c4265o.f13965g;
        return new C3321z((c4265o2.f13965g | i9) < 16 ? zM9196t ? AbstractC3306k.f10611j : z9 ? AbstractC3306k.f10587d : AbstractC3306k.f10599g : i9 < 256 ? zM9196t ? AbstractC3306k.f10615k : z9 ? AbstractC3306k.f10591e : AbstractC3306k.f10603h : zM9196t ? AbstractC3306k.f10619l : z9 ? AbstractC3306k.f10595f : AbstractC3306k.f10607i, c4270t, C4266p.m8568q(c4265o, c4265o2));
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo6968a();

    /* JADX INFO: renamed from: b */
    public abstract int mo6969b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public String mo6983c() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public String mo6984d() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m6989e() {
        int i9 = this.f10487a;
        if (i9 >= 0) {
            return i9;
        }
        C0353j.m1309g("address not yet known");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m6990f() {
        int i9 = this.f10487a;
        return i9 != -1 ? String.format("%04x", Integer.valueOf(i9)) : AbstractC0000a.m48Y0(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo6970g();

    /* JADX INFO: renamed from: i */
    public abstract AbstractC3303h mo6975i(C3305j c3305j);

    /* JADX INFO: renamed from: j */
    public abstract AbstractC3303h mo6981j(int i9);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC3303h mo6971k(C4266p c4266p);

    /* JADX INFO: renamed from: l */
    public abstract void mo6972l(C6090d c6090d);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        boolean z9;
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(m6990f());
        sb2.append(' ');
        sb2.append(this.f10489c);
        sb2.append(": ");
        sb2.append(this.f10488b.m6993a());
        C4266p c4266p = this.f10490d;
        if (c4266p.f24601h.length != 0) {
            z9 = true;
            sb2.append(c4266p.m10842n(" ", null, true));
        } else {
            z9 = false;
        }
        String strMo6968a = mo6968a();
        if (strMo6968a != null) {
            if (z9) {
                sb2.append(',');
            }
            sb2.append(' ');
            sb2.append(strMo6968a);
        }
        return sb2.toString();
    }
}
