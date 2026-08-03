package p332wb;

import android.content.SharedPreferences;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;

/* JADX INFO: renamed from: wb.j9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5004j9 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18071g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4060x f18072h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f18073i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f18074j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18075k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18076l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5004j9(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18071g = i9;
        this.f18072h = c4060x;
        this.f18073i = c3641z;
        this.f18074j = sharedPreferences;
        this.f18075k = interfaceC1809a1;
        this.f18076l = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f18071g;
        InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        interfaceC3268x0.getClass();
        int i10 = iIntValue & 6;
        switch (i9) {
            case 0:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18072h.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences = this.f18074j;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4746bc(sharedPreferences, this.f18075k, this.f18076l, 8);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, this.f18073i, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18072h.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences2 = this.f18074j;
                    boolean zM4538h2 = c1836h0.m4538h(sharedPreferences2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C4746bc(sharedPreferences2, this.f18075k, this.f18076l, 10);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, this.f18073i, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18072h.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences3 = this.f18074j;
                    boolean zM4538h3 = c1836h0.m4538h(sharedPreferences3);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h3 || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C4746bc(sharedPreferences3, this.f18075k, this.f18076l, 11);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, this.f18073i, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                if (i10 == 0) {
                    iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, this.f18072h.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    SharedPreferences sharedPreferences4 = this.f18074j;
                    boolean zM4538h4 = c1836h0.m4538h(sharedPreferences4);
                    Object objM4514P4 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P4 == C1851l.f6155a) {
                        objM4514P4 = new C4746bc(sharedPreferences4, this.f18075k, this.f18076l, 12);
                        c1836h0.m4545k0(objM4514P4);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, this.f18073i, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P4, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
