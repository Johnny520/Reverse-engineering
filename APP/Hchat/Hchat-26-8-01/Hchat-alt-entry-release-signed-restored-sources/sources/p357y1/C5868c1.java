package p357y1;

import android.app.Activity;
import p002a1.C0010h;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1876r1;

/* JADX INFO: renamed from: y1.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5868c1 extends AbstractC5858a {

    /* JADX INFO: renamed from: p */
    public final C1845j1 f23832p;

    /* JADX INFO: renamed from: q */
    public boolean f23833q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5868c1(Activity activity) {
        super(activity);
        this.f23832p = AbstractC1874r.m4639u(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: a */
    public final void mo10551a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(420213850);
        int i10 = (c1836h0.m4538h(this) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f23832p.getValue();
            if (interfaceC1235p == null) {
                c1836h0.m4525a0(-1238823553);
            } else {
                c1836h0.m4525a0(98585282);
                interfaceC1235p.invoke(c1836h0, 0);
            }
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0010h(this, i9, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C5868c1.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f23833q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContent(InterfaceC1235p interfaceC1235p) {
        this.f23833q = true;
        this.f23832p.setValue(interfaceC1235p);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m10554e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
