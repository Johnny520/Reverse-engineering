package p000A;

import p092S0.C1269g;
import p115X0.C1646u;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: A.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040U0 {

    /* JADX INFO: renamed from: a */
    public C0038T0 f175a;

    /* JADX INFO: renamed from: b */
    public C0038T0 f176b;

    /* JADX INFO: renamed from: c */
    public int f177c;

    /* JADX INFO: renamed from: d */
    public Long f178d;

    /* JADX INFO: renamed from: e */
    public boolean f179e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m56a(C1646u c1646u) {
        C0038T0 c0038t0;
        C1269g c1269g = c1646u.f5650a;
        this.f179e = false;
        C0038T0 c0038t02 = this.f175a;
        if (c1646u.equals(c0038t02 != null ? (C1646u) c0038t02.f170f : null)) {
            return;
        }
        String str = c1269g.f4563e;
        C0038T0 c0038t03 = this.f175a;
        if (AbstractC1665j.m2981a(str, c0038t03 != null ? ((C1646u) c0038t03.f170f).f5650a.f4563e : null)) {
            C0038T0 c0038t04 = this.f175a;
            if (c0038t04 != null) {
                c0038t04.f170f = c1646u;
                return;
            }
            return;
        }
        this.f175a = new C0038T0(0, this.f175a, c1646u);
        this.f176b = null;
        int length = c1269g.f4563e.length() + this.f177c;
        this.f177c = length;
        if (length > 100000) {
            C0038T0 c0038t05 = this.f175a;
            if ((c0038t05 != null ? (C0038T0) c0038t05.f169e : null) == null) {
                return;
            }
            while (true) {
                if (c0038t05 == null) {
                    c0038t0 = null;
                } else {
                    C0038T0 c0038t06 = (C0038T0) c0038t05.f169e;
                    if (c0038t06 != null) {
                        c0038t0 = (C0038T0) c0038t06.f169e;
                    }
                }
                if (c0038t0 == null) {
                    break;
                } else {
                    c0038t05 = (C0038T0) c0038t05.f169e;
                }
            }
            if (c0038t05 != null) {
                c0038t05.f169e = null;
            }
        }
    }
}
