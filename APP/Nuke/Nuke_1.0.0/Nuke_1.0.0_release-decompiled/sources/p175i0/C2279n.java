package p175i0;

import android.view.ViewStructure;
import p056K2.C0891q;
import p112W2.InterfaceC1605g;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: i0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2279n extends AbstractC1666k implements InterfaceC1605g {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewStructure f7434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2279n(ViewStructure viewStructure) {
        super(4);
        this.f7434e = viewStructure;
    }

    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f7434e.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return C0891q.f2780a;
    }
}
