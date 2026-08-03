package p332wb;

import android.content.Context;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;

/* JADX INFO: renamed from: wb.xd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5470xd implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21912g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f21913h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f21914i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f21915j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f21916k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f21917l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f21918m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC3955b f21919n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21920o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5470xd(int i9, int i10, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, String str, List list, List list2) {
        this.f21917l = context;
        this.f21913h = str;
        this.f21918m = list;
        this.f21914i = interfaceC1220a;
        this.f21919n = interfaceC1231l;
        this.f21920o = list2;
        this.f21915j = i9;
        this.f21916k = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21912g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9382M(this.f21913h, this.f21914i, (String) this.f21917l, (InterfaceC1220a) this.f21919n, (String) this.f21918m, (InterfaceC1220a) this.f21920o, (C1836h0) obj, AbstractC1874r.m4617C(this.f21915j | 1), this.f21916k);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9525d3((Context) this.f21917l, this.f21913h, (List) this.f21918m, this.f21914i, (InterfaceC1231l) this.f21919n, (List) this.f21920o, (C1836h0) obj, AbstractC1874r.m4617C(this.f21915j | 1), this.f21916k);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5470xd(String str, InterfaceC1220a interfaceC1220a, String str2, InterfaceC1220a interfaceC1220a2, String str3, InterfaceC1220a interfaceC1220a3, int i9, int i10) {
        this.f21913h = str;
        this.f21914i = interfaceC1220a;
        this.f21917l = str2;
        this.f21919n = interfaceC1220a2;
        this.f21918m = str3;
        this.f21920o = interfaceC1220a3;
        this.f21915j = i9;
        this.f21916k = i10;
    }
}
