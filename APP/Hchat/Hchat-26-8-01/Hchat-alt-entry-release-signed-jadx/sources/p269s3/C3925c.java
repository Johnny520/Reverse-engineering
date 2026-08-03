package p269s3;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p154k9.EnumC2359c;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p343x6.AbstractC5700d;
import sh.AbstractC4045s;
import sh.C4048t;

/* JADX INFO: renamed from: s3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3925c implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12885g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12886h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f12887i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f12888j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f12889k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f12890l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f12891m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3925c(String str, int i9, boolean z9, int i10, C4048t c4048t, InterfaceC1231l interfaceC1231l, int i11) {
        this.f12885g = 1;
        this.f12889k = str;
        this.f12886h = i9;
        this.f12887i = z9;
        this.f12888j = i10;
        this.f12890l = c4048t;
        this.f12891m = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12885g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5700d.m10272d((C3927e) this.f12889k, this.f12887i, (InterfaceC1220a) this.f12890l, (InterfaceC1220a) this.f12891m, (C1836h0) obj, AbstractC1874r.m4617C(this.f12886h | 1), this.f12888j);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(196609);
                AbstractC4045s.m8242f((String) this.f12889k, this.f12886h, this.f12887i, this.f12888j, (C4048t) this.f12890l, (InterfaceC1231l) this.f12891m, (C1836h0) obj, iM4617C);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9423R0((String) this.f12889k, (String) this.f12890l, this.f12887i, (EnumC2359c) this.f12891m, (C1836h0) obj, AbstractC1874r.m4617C(this.f12886h | 1), this.f12888j);
                break;
            default:
                String str = (String) this.f12889k;
                String str2 = (String) this.f12890l;
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9474X3(AbstractC1874r.m4617C(this.f12886h | 1), this.f12888j, (InterfaceC1231l) this.f12891m, (C1836h0) obj, str, str2, this.f12887i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3925c(String str, String str2, boolean z9, Object obj, int i9, int i10, int i11) {
        this.f12885g = i11;
        this.f12889k = str;
        this.f12890l = str2;
        this.f12887i = z9;
        this.f12891m = obj;
        this.f12886h = i9;
        this.f12888j = i10;
    }

    public /* synthetic */ C3925c(C3927e c3927e, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i9, int i10) {
        this.f12885g = 0;
        this.f12889k = c3927e;
        this.f12887i = z9;
        this.f12890l = interfaceC1220a;
        this.f12891m = interfaceC1220a2;
        this.f12886h = i9;
        this.f12888j = i10;
    }
}
