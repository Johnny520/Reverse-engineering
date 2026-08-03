package p373z0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import gg.AbstractC1417m;
import p085fg.InterfaceC1237r;
import p276sf.C3967n;
import p351xe.C5784e;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6061a extends AbstractC1417m implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6063c f24532g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f24533h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6061a(C6063c c6063c, int i9) {
        super(4);
        this.f24532g = c6063c;
        this.f24533h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C6063c c6063c = this.f24532g;
        C5784e c5784e = c6063c.f24536g;
        ((AutofillManager) c5784e.f23527b).notifyViewEntered(c6063c.f24538i, this.f24533h, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return C3967n.f12976a;
    }
}
