package p175i0;

import android.view.autofill.AutofillManager;
import p041H0.C0564I;
import p056K2.C0891q;
import p112W2.InterfaceC1605g;
import p117X2.AbstractC1666k;
import p121Y1.C1753n;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2267b extends AbstractC1666k implements InterfaceC1605g {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2268c f7411e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0564I f7412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267b(C2268c c2268c, C0564I c0564i) {
        super(4);
        this.f7411e = c2268c;
        this.f7412f = c0564i;
    }

    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C2268c c2268c = this.f7411e;
        c2268c.f7418i.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        C1753n c1753n = c2268c.f7413d;
        ((AutofillManager) c1753n.f6028e).requestAutofill(c2268c.f7415f, this.f7412f.f1712e, c2268c.f7418i);
        return C0891q.f2780a;
    }
}
