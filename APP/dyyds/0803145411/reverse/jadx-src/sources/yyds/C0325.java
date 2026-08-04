package yyds;

import com.p000ss.android.ugc.awemes.WardDatabase;

/* JADX INFO: renamed from: yyds.ᛲᛴᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ WardDatabase f1710;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1711;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f1712;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1549 f1713;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0325(WardDatabase wardDatabase, InterfaceC0274 interfaceC0274, InterfaceC1549 interfaceC1549, boolean z, boolean z2) {
        super(2, interfaceC0274);
        this.f1710 = wardDatabase;
        this.f1711 = z;
        this.f1714 = z2;
        this.f1713 = interfaceC1549;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f1712;
        if (i != 0) {
            if (i == 1) {
                AbstractC1544.m3189(obj);
                return obj;
            }
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1544.m3189(obj);
        InterfaceC1549 interfaceC1549 = this.f1713;
        WardDatabase wardDatabase = this.f1710;
        boolean z = this.f1714;
        boolean z2 = this.f1711;
        C2002 c2002 = new C2002(wardDatabase, null, interfaceC1549, z, z2);
        this.f1712 = 1;
        Object objM346 = wardDatabase.m346(z2, c2002, this);
        EnumC1765 enumC1765 = EnumC1765.f8858;
        return objM346 == enumC1765 ? enumC1765 : objM346;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        boolean z = this.f1714;
        return new C0325(this.f1710, interfaceC0274, this.f1713, this.f1711, z);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0325) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
