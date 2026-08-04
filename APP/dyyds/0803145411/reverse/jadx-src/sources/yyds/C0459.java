package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᲁᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0459 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f2301;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0119 f2302;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0119 f2303;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public String f2304;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f2305;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0172 f2306;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f2307;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f2308;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Iterator f2309;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459(C0119 c0119, String str, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f2303 = c0119;
        this.f2301 = str;
        this.f2305 = str2;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f2308;
        C2746 c2746 = C2746.f13459;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            this.f2308 = 1;
            return this.f2303.m560(this.f2301, this.f2305, this) == enumC1765 ? enumC1765 : c2746;
        }
        if (i == 1) {
            AbstractC1544.m3189(obj);
            return c2746;
        }
        if (i != 2) {
            C0188.m800(AbstractC2328.m4341(-688014678983534L));
            return null;
        }
        int i2 = this.f2307;
        Iterator it = this.f2309;
        String str = this.f2304;
        C0119 c0119 = this.f2302;
        C0172 c0172 = this.f2306;
        AbstractC1544.m3189(obj);
        while (it.hasNext()) {
            String str2 = ((String) c0172.f997) + '/' + ((String) it.next());
            c0172.f997 = str2;
            this.f2306 = c0172;
            this.f2302 = c0119;
            this.f2304 = str;
            this.f2309 = it;
            this.f2307 = i2;
            this.f2308 = 2;
            if (c0119.m560(str2, str, this) == enumC1765) {
            }
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C0459(this.f2303, this.f2301, this.f2305, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0459) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
