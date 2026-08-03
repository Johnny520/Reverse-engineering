package p251r;

import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: r.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3625j implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11687g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3626k f11688h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11689i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11690j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3625j(int i9, Object obj, C3626k c3626k) {
        this.f11688h = c3626k;
        this.f11689i = i9;
        this.f11690j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1836h0 c1836h0 = (C1836h0) obj;
        Integer num = (Integer) obj2;
        switch (this.f11687g) {
            case 0:
                num.getClass();
                this.f11688h.m7605a(this.f11689i, this.f11690j, c1836h0, AbstractC1874r.m4617C(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f11688h.m7605a(this.f11689i, this.f11690j, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3625j(C3626k c3626k, int i9, Object obj, int i10) {
        this.f11688h = c3626k;
        this.f11689i = i9;
        this.f11690j = obj;
    }
}
