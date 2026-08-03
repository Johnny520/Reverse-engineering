package p265s;

import android.content.Context;
import ba.EnumC0234n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p332wb.AbstractC4955ho;
import p332wb.C5491y2;

/* JADX INFO: renamed from: s.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3836i0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12565g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12566h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12567i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f12568j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f12569k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3955b f12570l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3836i0(Context context, EnumC0234n enumC0234n, int i9, InterfaceC1220a interfaceC1220a, int i10) {
        this.f12565g = 2;
        this.f12568j = context;
        this.f12569k = enumC0234n;
        this.f12566h = i9;
        this.f12570l = interfaceC1220a;
        this.f12567i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12565g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3847o.m8015b(this.f12568j, this.f12566h, (C3838j0) this.f12569k, (C3874d) this.f12570l, (C1836h0) obj, AbstractC1874r.m4617C(this.f12567i | 1));
                break;
            case 1:
                C5491y2 c5491y2 = (C5491y2) this.f12568j;
                String str = (String) this.f12569k;
                ((Integer) obj2).getClass();
                c5491y2.m9884c(AbstractC1874r.m4617C(this.f12566h | 1), this.f12567i, (InterfaceC1231l) this.f12570l, (C1836h0) obj, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9533e2((Context) this.f12568j, (EnumC0234n) this.f12569k, this.f12566h, (InterfaceC1220a) this.f12570l, (C1836h0) obj, AbstractC1874r.m4617C(this.f12567i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9296B1((String) this.f12568j, (String) this.f12569k, (InterfaceC1220a) this.f12570l, (C1836h0) obj, AbstractC1874r.m4617C(this.f12566h | 1), this.f12567i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3836i0(Object obj, int i9, C3838j0 c3838j0, C3874d c3874d, int i10) {
        this.f12565g = 0;
        this.f12568j = obj;
        this.f12566h = i9;
        this.f12569k = c3838j0;
        this.f12570l = c3874d;
        this.f12567i = i10;
    }

    public /* synthetic */ C3836i0(Object obj, String str, InterfaceC3955b interfaceC3955b, int i9, int i10, int i11) {
        this.f12565g = i11;
        this.f12568j = obj;
        this.f12569k = str;
        this.f12570l = interfaceC3955b;
        this.f12566h = i9;
        this.f12567i = i10;
    }
}
