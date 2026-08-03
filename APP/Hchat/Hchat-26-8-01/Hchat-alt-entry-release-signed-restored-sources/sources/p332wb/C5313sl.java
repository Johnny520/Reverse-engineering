package p332wb;

import android.content.Context;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.sl */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5313sl implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20692g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20693h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20694i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f20695j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f20696k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1220a f20697l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1231l f20698m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5313sl(int i9, int i10, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, String str, List list, List list2) {
        this.f20692g = i10;
        this.f20693h = context;
        this.f20694i = str;
        this.f20695j = list;
        this.f20696k = list2;
        this.f20697l = interfaceC1220a;
        this.f20698m = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20692g) {
            case 0:
                ((Integer) obj2).getClass();
                int iM4617C = AbstractC1874r.m4617C(24577);
                AbstractC4955ho.m9550g1(this.f20693h, this.f20694i, this.f20695j, this.f20696k, this.f20697l, this.f20698m, (C1836h0) obj, iM4617C);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4617C2 = AbstractC1874r.m4617C(24577);
                AbstractC4955ho.m9640q1(this.f20693h, this.f20694i, this.f20695j, this.f20696k, this.f20697l, this.f20698m, (C1836h0) obj, iM4617C2);
                break;
        }
        return C3967n.f12976a;
    }
}
