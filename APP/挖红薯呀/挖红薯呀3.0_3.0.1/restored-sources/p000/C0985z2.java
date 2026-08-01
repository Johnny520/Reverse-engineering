package p000;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0985z2 extends c50 implements InterfaceC0978yw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0004a3 f7775d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7776e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0985z2(C0004a3 c0004a3, int i) {
        super(4);
        this.f7775d = c0004a3;
        this.f7776e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0978yw
    /* JADX INFO: renamed from: b */
    public final Object mo259b(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        C0004a3 c0004a3 = this.f7775d;
        C0910x1 c0910x1 = c0004a3.f30d;
        ((AutofillManager) c0910x1.f7232e).notifyViewEntered(c0004a3.f32f, this.f7776e, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return na1.f4229a;
    }
}
