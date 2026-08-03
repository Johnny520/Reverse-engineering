package p321w;

import gg.AbstractC1416l;
import p190n2.C2884s;
import p227p4.C3315t;

/* JADX INFO: renamed from: w.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4630q1 {

    /* JADX INFO: renamed from: a */
    public C3315t f15352a;

    /* JADX INFO: renamed from: b */
    public C3315t f15353b;

    /* JADX INFO: renamed from: c */
    public int f15354c;

    /* JADX INFO: renamed from: d */
    public Long f15355d;

    /* JADX INFO: renamed from: e */
    public boolean f15356e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9054a(C2884s c2884s) {
        C3315t c3315t;
        C2884s c2884s2;
        this.f15356e = false;
        C3315t c3315t2 = this.f15352a;
        if (AbstractC1416l.m3825a(c2884s, c3315t2 != null ? (C2884s) c3315t2.f10678i : null)) {
            return;
        }
        String str = c2884s.f9316a.f6529h;
        C3315t c3315t3 = this.f15352a;
        boolean zM3825a = AbstractC1416l.m3825a(str, (c3315t3 == null || (c2884s2 = (C2884s) c3315t3.f10678i) == null) ? null : c2884s2.f9316a.f6529h);
        C3315t c3315t4 = this.f15352a;
        if (zM3825a) {
            if (c3315t4 != null) {
                c3315t4.f10678i = c2884s;
                return;
            }
            return;
        }
        this.f15352a = new C3315t(c3315t4, 14, c2884s);
        this.f15353b = null;
        int length = c2884s.f9316a.f6529h.length() + this.f15354c;
        this.f15354c = length;
        if (length > 100000) {
            C3315t c3315t5 = this.f15352a;
            if ((c3315t5 != null ? (C3315t) c3315t5.f10677h : null) == null) {
                return;
            }
            while (true) {
                if (c3315t5 == null) {
                    c3315t = null;
                } else {
                    C3315t c3315t6 = (C3315t) c3315t5.f10677h;
                    if (c3315t6 != null) {
                        c3315t = (C3315t) c3315t6.f10677h;
                    }
                }
                if (c3315t == null) {
                    break;
                } else {
                    c3315t5 = (C3315t) c3315t5.f10677h;
                }
            }
            if (c3315t5 != null) {
                c3315t5.f10677h = null;
            }
        }
    }
}
