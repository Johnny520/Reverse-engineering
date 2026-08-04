package yyds;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᲁᛵᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2245 extends AbstractC0171 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public /* synthetic */ Object f11084;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ View f11085;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11086;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245(View view, InterfaceC0274 interfaceC0274) {
        super(interfaceC0274);
        this.f11085 = view;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        Object obj2;
        int i = this.f11086;
        View view = this.f11085;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            C1728 c1728 = (C1728) this.f11084;
            this.f11084 = c1728;
            this.f11086 = 1;
            c1728.m3459(view, this);
            return enumC1765;
        }
        C2746 c2746 = C2746.f13459;
        if (i != 1) {
            if (i == 2) {
                AbstractC1544.m3189(obj);
                return c2746;
            }
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C1728 c17282 = (C1728) this.f11084;
        AbstractC1544.m3189(obj);
        if (view instanceof ViewGroup) {
            this.f11084 = null;
            this.f11086 = 2;
            c17282.getClass();
            C0945 c0945 = new C0945(new C0437(2, (ViewGroup) view));
            if (c0945.f4407.hasNext()) {
                c17282.f8728 = c0945;
                c17282.f8729 = 2;
                c17282.f8730 = this;
                obj2 = enumC1765;
            } else {
                obj2 = c2746;
            }
            if (obj2 != enumC1765) {
                obj2 = c2746;
            }
            if (obj2 == enumC1765) {
                return enumC1765;
            }
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C2245 c2245 = new C2245(this.f11085, interfaceC0274);
        c2245.f11084 = obj;
        return c2245;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C2245) mo630((C1728) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
