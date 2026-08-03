package p373z0;

import android.view.autofill.AutofillManager;
import gg.AbstractC1417m;
import p085fg.InterfaceC1237r;
import p276sf.C3967n;
import p339x1.C5602f0;
import p351xe.C5784e;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6062b extends AbstractC1417m implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6063c f24534g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5602f0 f24535h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6062b(C6063c c6063c, C5602f0 c5602f0) {
        super(4);
        this.f24534g = c6063c;
        this.f24535h = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C6063c c6063c = this.f24534g;
        c6063c.f24541l.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        C5784e c5784e = c6063c.f24536g;
        ((AutofillManager) c5784e.f23527b).requestAutofill(c6063c.f24538i, this.f24535h.f22791h, c6063c.f24541l);
        return C3967n.f12976a;
    }
}
