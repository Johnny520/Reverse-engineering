package p227p4;

import p136j8.C2104o;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4270t;
import p376z4.C6090d;

/* JADX INFO: renamed from: p4.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3308m extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public C3321z[] f10667f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3308m(C4270t c4270t, C4266p c4266p) {
        super(c4270t, c4266p);
        if (c4266p.f24601h.length != 0) {
            this.f10667f = null;
        } else {
            C2104o.m5294t("registers.size() == 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: b */
    public final int mo6969b() {
        m6995m();
        int iMo6969b = 0;
        for (C3321z c3321z : this.f10667f) {
            iMo6969b += c3321z.mo6969b();
        }
        return iMo6969b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: g */
    public final String mo6970g() {
        C4266p c4266p = this.f10490d;
        int length = c4266p.f24601h.length;
        StringBuilder sb2 = new StringBuilder(100);
        int iM8561j = 0;
        for (int i9 = 0; i9 < length; i9++) {
            C4265o c4265o = (C4265o) c4266p.m10840l(i9);
            C3321z c3321zM6988h = AbstractC3303h.m6988h(C4270t.f14180d, C4265o.m8557k(iM8561j, c4265o.f13966h.getType(), null), c4265o);
            if (i9 != 0) {
                sb2.append('\n');
            }
            sb2.append(c3321zM6988h.mo6970g());
            iM8561j += c4265o.m8561j();
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        return new C3308m(this.f10489c, c4266p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: l */
    public final void mo6972l(C6090d c6090d) {
        m6995m();
        for (C3321z c3321z : this.f10667f) {
            c3321z.mo6972l(c6090d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m6995m() {
        if (this.f10667f != null) {
            return;
        }
        C4266p c4266p = this.f10490d;
        int length = c4266p.f24601h.length;
        this.f10667f = new C3321z[length];
        int iM8561j = 0;
        for (int i9 = 0; i9 < length; i9++) {
            C4265o c4265o = (C4265o) c4266p.m10840l(i9);
            this.f10667f[i9] = AbstractC3303h.m6988h(C4270t.f14180d, C4265o.m8557k(iM8561j, c4265o.f13966h.getType(), null), c4265o);
            iM8561j += c4265o.m8561j();
        }
    }
}
