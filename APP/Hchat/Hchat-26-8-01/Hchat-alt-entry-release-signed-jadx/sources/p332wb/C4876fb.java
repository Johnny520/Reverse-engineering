package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import p025bc.AbstractC0255e;
import p036c9.C0500x0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.fb */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4876fb implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17116g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4544a f17117h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f17118i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f17119j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f17120k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17121l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17122m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4876fb(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f17116g = i9;
        this.f17117h = interfaceC4544a;
        this.f17118i = sharedPreferences;
        this.f17119j = interfaceC1220a;
        this.f17120k = context;
        this.f17121l = interfaceC1809a1;
        this.f17122m = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f17116g) {
            case 0:
                AbstractC5250qo abstractC5250qo = (AbstractC5250qo) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                abstractC5250qo.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c1836h0.m4534f(abstractC5250qo) : c1836h0.m4538h(abstractC5250qo) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zEquals = abstractC5250qo.equals(C5217po.f20027a);
                    SharedPreferences sharedPreferences = this.f17118i;
                    InterfaceC1809a1 interfaceC1809a1 = this.f17121l;
                    InterfaceC1809a1 interfaceC1809a12 = this.f17122m;
                    C1823e c1823e = C1851l.f6155a;
                    if (zEquals) {
                        c1836h0.m4525a0(1045863445);
                        int size = ((Set) interfaceC1809a1.getValue()).size();
                        Object objM4514P = c1836h0.m4514P();
                        if (objM4514P == c1823e) {
                            objM4514P = new C0500x0(29, interfaceC1809a1, interfaceC1809a12);
                            c1836h0.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9587k2(this.f17117h, sharedPreferences, size, this.f17119j, (InterfaceC1220a) objM4514P, c1836h0, 24576);
                        c1836h0.m4553p(false);
                    } else {
                        if (!(abstractC5250qo instanceof C5184oo)) {
                            throw AbstractC0255e.m1015d(c1836h0, 1045862107, false);
                        }
                        c1836h0.m4525a0(1045887548);
                        C5391v0 c5391v0 = ((C5184oo) abstractC5250qo).f19480a;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C4885fk(interfaceC1809a12, 16);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P2;
                        boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4538h || objM4514P3 == c1823e) {
                            objM4514P3 = new C4746bc(sharedPreferences, interfaceC1809a1, interfaceC1809a12, 9);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9504b0(this.f17120k, c5391v0, interfaceC1220a, (InterfaceC1231l) objM4514P3, c1836h0, 384);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                AbstractC5448wo abstractC5448wo = (AbstractC5448wo) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                abstractC5448wo.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c1836h02.m4534f(abstractC5448wo) : c1836h02.m4538h(abstractC5448wo) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zEquals2 = abstractC5448wo.equals(C5415vo.f21486a);
                    SharedPreferences sharedPreferences2 = this.f17118i;
                    InterfaceC1809a1 interfaceC1809a13 = this.f17121l;
                    InterfaceC1809a1 interfaceC1809a14 = this.f17122m;
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zEquals2) {
                        c1836h02.m4525a0(976038098);
                        int size2 = ((Set) interfaceC1809a13.getValue()).size();
                        Object objM4514P4 = c1836h02.m4514P();
                        if (objM4514P4 == c1823e2) {
                            objM4514P4 = new C0500x0(27, interfaceC1809a13, interfaceC1809a14);
                            c1836h02.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9659s2(this.f17117h, sharedPreferences2, size2, this.f17119j, (InterfaceC1220a) objM4514P4, c1836h02, 24576);
                        c1836h02.m4553p(false);
                    } else {
                        if (!(abstractC5448wo instanceof C5382uo)) {
                            throw AbstractC0255e.m1015d(c1836h02, 976036625, false);
                        }
                        c1836h02.m4525a0(976062779);
                        C5391v0 c5391v02 = ((C5382uo) abstractC5448wo).f21194a;
                        Object objM4514P5 = c1836h02.m4514P();
                        if (objM4514P5 == c1823e2) {
                            objM4514P5 = new C4753bj(interfaceC1809a14, 22);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P5;
                        boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                        Object objM4514P6 = c1836h02.m4514P();
                        if (zM4538h2 || objM4514P6 == c1823e2) {
                            objM4514P6 = new C4746bc(sharedPreferences2, interfaceC1809a13, interfaceC1809a14, 6);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9504b0(this.f17120k, c5391v02, interfaceC1220a2, (InterfaceC1231l) objM4514P6, c1836h02, 384);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
