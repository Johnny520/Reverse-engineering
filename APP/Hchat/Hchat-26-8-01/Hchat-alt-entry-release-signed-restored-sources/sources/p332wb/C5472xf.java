package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.xf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5472xf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21926g = 2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f21927h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f21928i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f21929j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f21930k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f21931l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f21932m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f21933n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21934o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5472xf(Context context, String str, String str2, int i9, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, int i10, int i11) {
        this.f21933n = context;
        this.f21927h = str;
        this.f21928i = str2;
        this.f21929j = i9;
        this.f21930k = interfaceC1231l;
        this.f21934o = interfaceC1231l2;
        this.f21931l = i10;
        this.f21932m = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21926g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9571i4(this.f21927h, this.f21928i, (String) this.f21933n, (List) this.f21934o, this.f21929j, this.f21930k, (C1836h0) obj, AbstractC1874r.m4617C(this.f21931l | 1), this.f21932m);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9719z2((SharedPreferences) this.f21933n, this.f21927h, this.f21928i, (ArrayList) this.f21934o, this.f21929j, this.f21930k, (C1836h0) obj, AbstractC1874r.m4617C(this.f21931l | 1), this.f21932m);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9613n1((Context) this.f21933n, this.f21927h, this.f21928i, this.f21929j, this.f21930k, (InterfaceC1231l) this.f21934o, (C1836h0) obj, AbstractC1874r.m4617C(this.f21931l | 1), this.f21932m);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5472xf(SharedPreferences sharedPreferences, String str, String str2, ArrayList arrayList, int i9, InterfaceC1231l interfaceC1231l, int i10, int i11) {
        this.f21933n = sharedPreferences;
        this.f21927h = str;
        this.f21928i = str2;
        this.f21934o = arrayList;
        this.f21929j = i9;
        this.f21930k = interfaceC1231l;
        this.f21931l = i10;
        this.f21932m = i11;
    }

    public /* synthetic */ C5472xf(String str, String str2, String str3, List list, int i9, InterfaceC1231l interfaceC1231l, int i10, int i11) {
        this.f21927h = str;
        this.f21928i = str2;
        this.f21933n = str3;
        this.f21934o = list;
        this.f21929j = i9;
        this.f21930k = interfaceC1231l;
        this.f21931l = i10;
        this.f21932m = i11;
    }
}
