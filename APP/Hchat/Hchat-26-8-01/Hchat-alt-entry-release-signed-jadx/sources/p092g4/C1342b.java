package p092g4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p089g1.C1275d;
import p136j8.C2104o;
import p295u4.AbstractC4259i;
import p295u4.AbstractC4269s;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4268r;
import p295u4.C4270t;
import p295u4.C4272v;
import p311v4.C4466o;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;

/* JADX INFO: renamed from: g4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1342b {

    /* JADX INFO: renamed from: a */
    public final C1349i f4424a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4425b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C1347g f4426c;

    /* JADX INFO: renamed from: d */
    public boolean f4427d;

    /* JADX INFO: renamed from: e */
    public final C1348h f4428e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4429f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4430g;

    /* JADX INFO: renamed from: h */
    public final C4270t f4431h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4432i;

    /* JADX INFO: renamed from: j */
    public final C4682b f4433j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1342b(C1344d c1344d) {
        ArrayList arrayList = new ArrayList();
        this.f4429f = arrayList;
        this.f4430g = new ArrayList();
        this.f4431h = C4270t.f14180d;
        new ArrayList();
        this.f4432i = new ArrayList();
        this.f4433j = C4682b.f15591i;
        C1349i c1349i = c1344d.f4436a;
        this.f4424a = c1349i;
        if ((c1344d.f4437b & 8) != 0) {
            this.f4428e = null;
        } else {
            C1348h c1348h = new C1348h(this, c1349i.f4462a);
            this.f4428e = c1348h;
            arrayList.add(c1348h);
        }
        C1350j[] c1350jArr = c1349i.f4465d.f4482a;
        for (C1350j c1350j : c1350jArr) {
            this.f4429f.add(new C1348h(this, c1350j));
        }
        C1347g c1347g = new C1347g();
        this.f4426c = c1347g;
        m3613b(c1347g);
        this.f4426c.f4453c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3611d(C1348h c1348h, C1350j c1350j) {
        if (c1348h.f4459b.equals(c1350j)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("requested ");
        sb2.append(c1350j);
        C1350j c1350j2 = c1348h.f4459b;
        sb2.append(" but was ");
        sb2.append(c1350j2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3612a(AbstractC4259i abstractC4259i, C1347g c1347g) {
        C1347g c1347g2 = this.f4426c;
        if (c1347g2 == null || !c1347g2.f4453c) {
            C2104o.m5276A("no current label");
            return;
        }
        c1347g2.f4451a.add(abstractC4259i);
        int i9 = abstractC4259i.f13947g.f13975e;
        if (i9 == 1) {
            if (c1347g == null) {
                return;
            }
            C1275d.m3412f(c1347g, "unexpected branch: ");
            return;
        }
        if (i9 == 2) {
            if (c1347g == null) {
                this.f4426c = null;
                return;
            } else {
                C1275d.m3412f(c1347g, "unexpected branch: ");
                return;
            }
        }
        if (i9 == 3) {
            if (c1347g == null) {
                C2104o.m5294t("branch == null");
                return;
            } else {
                this.f4426c.f4455e = c1347g;
                this.f4426c = null;
                return;
            }
        }
        if (i9 == 4) {
            if (c1347g == null) {
                C2104o.m5294t("branch == null");
                return;
            }
            List list = Collections.EMPTY_LIST;
            C1347g c1347g3 = new C1347g();
            m3613b(c1347g3);
            C1347g c1347g4 = this.f4426c;
            c1347g4.f4455e = c1347g3;
            c1347g4.f4456f = c1347g;
            c1347g4.f4454d = list;
            this.f4426c = c1347g3;
            c1347g3.f4453c = true;
            return;
        }
        if (i9 != 6) {
            C2104o.m5289o();
            return;
        }
        if (c1347g != null) {
            C1275d.m3412f(c1347g, "unexpected branch: ");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f4432i);
        C1347g c1347g5 = new C1347g();
        m3613b(c1347g5);
        C1347g c1347g6 = this.f4426c;
        c1347g6.f4455e = c1347g5;
        c1347g6.f4456f = null;
        c1347g6.f4454d = arrayList;
        this.f4426c = c1347g5;
        c1347g5.f4453c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3613b(C1347g c1347g) {
        C1342b c1342b = c1347g.f4452b;
        if (c1342b == this) {
            return;
        }
        if (c1342b != null) {
            C2104o.m5294t("Cannot adopt label; it belongs to another Code");
        } else {
            c1347g.f4452b = this;
            this.f4425b.add(c1347g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3614c(C1348h c1348h, C1348h c1348h2) {
        C4268r c4268rM8579d;
        C1350j c1350j = c1348h2.f4459b;
        if (c1350j.f4480b.m9196t()) {
            m3612a(new C4272v(AbstractC4269s.f14107h2, this.f4431h, C4266p.m8567p(c1348h2.m3624a()), this.f4433j, c1348h.f4459b.f4481c), null);
            m3620j(c1348h, true);
            return;
        }
        C4683c c4683c = c1350j.f4480b;
        C4683c c4683c2 = c1348h.f4459b.f4480b;
        if (c4683c.f15649h != 6) {
            c4268rM8579d = AbstractC4269s.m8579d(c4683c2, c4683c);
        } else {
            int i9 = c4683c2.f15649h;
            if (i9 == 2) {
                c4268rM8579d = AbstractC4269s.f14154t1;
            } else if (i9 == 3) {
                c4268rM8579d = AbstractC4269s.f14158u1;
            } else if (i9 == 8) {
                c4268rM8579d = AbstractC4269s.f14162v1;
            }
        }
        m3612a(new C4263m(c4268rM8579d, this.f4431h, c1348h.m3624a(), c1348h2.m3624a()), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C1348h m3615e(int i9, C1350j c1350j) {
        if (this.f4428e != null) {
            i9++;
        }
        C1348h c1348h = (C1348h) this.f4429f.get(i9);
        m3611d(c1348h, c1350j);
        return c1348h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3616f() {
        if (this.f4427d) {
            throw new AssertionError();
        }
        this.f4427d = true;
        int iM9188i = 0;
        for (C1348h c1348h : this.f4430g) {
            c1348h.f4460c = iM9188i;
            C1350j c1350j = c1348h.f4459b;
            c1348h.f4461d = C4265o.m8557k(iM9188i, c1350j.f4480b, null);
            iM9188i += c1350j.f4480b.m9188i();
        }
        ArrayList arrayList = new ArrayList();
        int iM9188i2 = iM9188i;
        for (C1348h c1348h2 : this.f4429f) {
            C4466o c4466oM8909o = C4466o.m8909o(iM9188i2 - iM9188i);
            c1348h2.f4460c = iM9188i2;
            C1350j c1350j2 = c1348h2.f4459b;
            c1348h2.f4461d = C4265o.m8557k(iM9188i2, c1350j2.f4480b, null);
            iM9188i2 += c1350j2.f4480b.m9188i();
            arrayList.add(new C4262l(AbstractC4269s.m8583h(c1350j2.f4480b), this.f4431h, c1348h2.m3624a(), C4266p.f13968i, c4466oM8909o));
        }
        ((C1347g) this.f4425b.get(0)).f4451a.addAll(0, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3617g(C4268r c4268r, C1349i c1349i, C1348h c1348h, C1348h c1348h2, C1348h... c1348hArr) {
        int i9 = c1348h2 != null ? 1 : 0;
        C4266p c4266p = new C4266p(c1348hArr.length + i9);
        if (c1348h2 != null) {
            c4266p.m10841m(0, c1348h2.m3624a());
        }
        for (int i10 = 0; i10 < c1348hArr.length; i10++) {
            c4266p.m10841m(i10 + i9, c1348hArr[i10].m3624a());
        }
        m3612a(new C4272v(c4268r, this.f4431h, c4266p, this.f4433j, c1349i.f4466e), null);
        if (c1348h != null) {
            m3620j(c1348h, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3618h(C1349i c1349i, C1348h c1348h, C1348h c1348h2, C1348h... c1348hArr) {
        C4681a c4681aM9174d = C4681a.m9174d(c1349i.m3625a(true));
        C4268r c4268r = AbstractC4269s.f14076a;
        m3617g(new C4268r(51, c4681aM9174d.m9176c(), C4682b.f15598p), c1349i, c1348h, c1348h2, c1348hArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3619i(C1348h c1348h, Object obj) {
        C4268r c4268rM8578c = obj == null ? AbstractC4269s.f14144r : AbstractC4269s.m8578c(c1348h.f4459b.f4480b);
        int i9 = c4268rM8578c.f13975e;
        C4270t c4270t = this.f4431h;
        if (i9 == 1) {
            m3612a(new C4262l(c4268rM8578c, c4270t, c1348h.m3624a(), C4266p.f13968i, AbstractC1341a.m3603s(obj)), null);
        } else {
            m3612a(new C4272v(c4268rM8578c, c4270t, C4266p.f13968i, this.f4433j, AbstractC1341a.m3603s(obj)), null);
            m3620j(c1348h, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m3620j(C1348h c1348h, boolean z9) {
        m3612a(new C4263m(z9 ? AbstractC4269s.m8585j(c1348h.f4459b.f4480b) : AbstractC4269s.m8584i(c1348h.f4459b.f4480b), this.f4431h, c1348h.m3624a(), C4266p.f13968i), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C1348h m3621k(C1350j c1350j) {
        if (this.f4427d) {
            C2104o.m5276A("Cannot allocate locals after adding instructions");
            return null;
        }
        C1348h c1348h = new C1348h(this, c1350j);
        this.f4430g.add(c1348h);
        return c1348h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m3622l(C1348h c1348h) {
        C1350j c1350j = c1348h.f4459b;
        C1350j c1350j2 = c1348h.f4459b;
        C1349i c1349i = this.f4424a;
        if (c1350j.equals(c1349i.f4463b)) {
            m3612a(new C4263m(AbstractC4269s.m8587l(c1350j2.f4480b), this.f4431h, (C4265o) null, C4266p.m8567p(c1348h.m3624a())), null);
        } else {
            throw new IllegalArgumentException("declared " + c1349i.f4463b + " but returned " + c1350j2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m3623m() {
        C1349i c1349i = this.f4424a;
        if (c1349i.f4463b.equals(C1350j.f4475l)) {
            m3612a(new C4263m(AbstractC4269s.f14166w1, this.f4431h, (C4265o) null, C4266p.f13968i), null);
        } else {
            C0353j.m1304b(c1349i.f4463b, "declared ", " but returned void");
        }
    }
}
