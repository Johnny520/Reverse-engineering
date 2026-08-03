package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import p036c9.C0423c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p345x8.C5726s;

/* JADX INFO: renamed from: wb.mc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5106mc implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18903g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18904h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f18905i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18906j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18907k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18908l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f18909m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5106mc(SharedPreferences sharedPreferences, int i9, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f18908l = sharedPreferences;
        this.f18905i = i9;
        this.f18909m = interfaceC1220a;
        this.f18904h = interfaceC1809a1;
        this.f18906j = interfaceC1809a12;
        this.f18907k = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f18903g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18908l;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18909m;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-965891442, new C0423c0(sharedPreferences, this.f18905i, interfaceC1220a, this.f18904h, this.f18906j, this.f18907k), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C5726s c5726s = (C5726s) this.f18908l;
                Context context = (Context) this.f18909m;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(705857798, new C0423c0(c5726s, this.f18904h, this.f18905i, context, this.f18906j, this.f18907k), c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5106mc(C5726s c5726s, InterfaceC1809a1 interfaceC1809a1, int i9, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f18908l = c5726s;
        this.f18904h = interfaceC1809a1;
        this.f18905i = i9;
        this.f18909m = context;
        this.f18906j = interfaceC1809a12;
        this.f18907k = interfaceC1809a13;
    }
}
