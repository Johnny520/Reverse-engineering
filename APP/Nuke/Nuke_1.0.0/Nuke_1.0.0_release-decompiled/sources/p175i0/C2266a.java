package p175i0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import p056K2.C0891q;
import p112W2.InterfaceC1605g;
import p117X2.AbstractC1666k;
import p121Y1.C1753n;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2266a extends AbstractC1666k implements InterfaceC1605g {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2268c f7409e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2266a(C2268c c2268c, int i5) {
        super(4);
        this.f7409e = c2268c;
        this.f7410f = i5;
    }

    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C2268c c2268c = this.f7409e;
        C1753n c1753n = c2268c.f7413d;
        ((AutofillManager) c1753n.f6028e).notifyViewEntered(c2268c.f7415f, this.f7410f, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return C0891q.f2780a;
    }
}
