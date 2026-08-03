package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import p025bc.AbstractC0255e;
import p065eb.C0884o;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.vj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5410vj implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21429g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4544a f21430h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f21431i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f21432j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f21433k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21434l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21435m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21436n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5410vj(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f21429g = i9;
        this.f21430h = interfaceC4544a;
        this.f21431i = sharedPreferences;
        this.f21432j = interfaceC1220a;
        this.f21433k = context;
        this.f21434l = interfaceC1809a1;
        this.f21435m = interfaceC1809a12;
        this.f21436n = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f21429g) {
            case 0:
                AbstractC5349to abstractC5349to = (AbstractC5349to) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                abstractC5349to.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h0.m4534f(abstractC5349to) : c1836h0.m4538h(abstractC5349to) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zEquals = abstractC5349to.equals(C5316so.f20704a);
                    SharedPreferences sharedPreferences = this.f21431i;
                    InterfaceC1809a1 interfaceC1809a1 = this.f21434l;
                    InterfaceC1809a1 interfaceC1809a12 = this.f21435m;
                    boolean z9 = true;
                    InterfaceC1809a1 interfaceC1809a13 = this.f21436n;
                    C1823e c1823e = C1851l.f6155a;
                    if (zEquals) {
                        c1836h0.m4525a0(-312475028);
                        Set set = (Set) interfaceC1809a1.getValue();
                        Set set2 = (Set) interfaceC1809a12.getValue();
                        Object objM4514P = c1836h0.m4514P();
                        if (objM4514P == c1823e) {
                            objM4514P = new C4714ad(interfaceC1809a12, interfaceC1809a1, interfaceC1809a13, 6);
                            c1836h0.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9605m2(this.f21430h, sharedPreferences, set, set2, this.f21432j, (InterfaceC1231l) objM4514P, c1836h0, 196608);
                        c1836h0.m4553p(false);
                    } else {
                        if (!(abstractC5349to instanceof C5283ro)) {
                            throw AbstractC0255e.m1015d(c1836h0, -312475959, false);
                        }
                        c1836h0.m4525a0(-312442551);
                        C5391v0 c5391v0 = ((C5283ro) abstractC5349to).f20509b;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C5509yk(interfaceC1809a13, 23);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P2;
                        if ((iIntValue & 14) != 4 && ((iIntValue & 8) == 0 || !c1836h0.m4538h(abstractC5349to))) {
                            z9 = false;
                        }
                        boolean zM4538h = c1836h0.m4538h(sharedPreferences) | z9;
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4538h || objM4514P3 == c1823e) {
                            C0884o c0884o = new C0884o(abstractC5349to, sharedPreferences, interfaceC1809a12, interfaceC1809a1, interfaceC1809a13, 18);
                            c1836h0.m4545k0(c0884o);
                            objM4514P3 = c0884o;
                        }
                        AbstractC4955ho.m9504b0(this.f21433k, c5391v0, interfaceC1220a, (InterfaceC1231l) objM4514P3, c1836h0, 384);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                AbstractC5151no abstractC5151no = (AbstractC5151no) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                abstractC5151no.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c1836h02.m4534f(abstractC5151no) : c1836h02.m4538h(abstractC5151no) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zEquals2 = abstractC5151no.equals(C5118mo.f19001a);
                    SharedPreferences sharedPreferences2 = this.f21431i;
                    InterfaceC1809a1 interfaceC1809a14 = this.f21434l;
                    InterfaceC1809a1 interfaceC1809a15 = this.f21435m;
                    boolean z10 = true;
                    InterfaceC1809a1 interfaceC1809a16 = this.f21436n;
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h02.m4525a0(-2114031208);
                        C5491y2 c5491y2 = C5491y2.f22063k;
                        Set set3 = (Set) interfaceC1809a14.getValue();
                        Set set4 = (Set) interfaceC1809a15.getValue();
                        Object objM4514P4 = c1836h02.m4514P();
                        if (objM4514P4 == c1823e2) {
                            objM4514P4 = new C4714ad(interfaceC1809a15, interfaceC1809a14, interfaceC1809a16, 8);
                            c1836h02.m4545k0(objM4514P4);
                        }
                        c5491y2.m9920v(this.f21430h, sharedPreferences2, set3, set4, this.f21432j, (InterfaceC1231l) objM4514P4, c1836h02, 1769472);
                        c1836h02.m4553p(false);
                    } else {
                        if (!(abstractC5151no instanceof C5085lo)) {
                            throw AbstractC0255e.m1015d(c1836h02, -2114032214, false);
                        }
                        c1836h02.m4525a0(-2113998806);
                        C5391v0 c5391v02 = ((C5085lo) abstractC5151no).f18768b;
                        Object objM4514P5 = c1836h02.m4514P();
                        if (objM4514P5 == c1823e2) {
                            objM4514P5 = new C4919gl(interfaceC1809a16, 20);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P5;
                        if ((iIntValue2 & 14) != 4 && ((iIntValue2 & 8) == 0 || !c1836h02.m4538h(abstractC5151no))) {
                            z10 = false;
                        }
                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2) | z10;
                        Object objM4514P6 = c1836h02.m4514P();
                        if (zM4538h2 || objM4514P6 == c1823e2) {
                            objM4514P6 = new C0884o(abstractC5151no, sharedPreferences2, interfaceC1809a15, interfaceC1809a14, interfaceC1809a16, 19);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9504b0(this.f21433k, c5391v02, interfaceC1220a2, (InterfaceC1231l) objM4514P6, c1836h02, 384);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
