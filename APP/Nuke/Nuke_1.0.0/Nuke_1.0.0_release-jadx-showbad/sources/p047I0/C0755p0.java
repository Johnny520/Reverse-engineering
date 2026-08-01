package p047I0;

import android.content.Context;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: I0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0755p0 extends AbstractC0713b {

    /* JADX INFO: renamed from: l */
    public final C1366i0 f2344l;

    /* JADX INFO: renamed from: m */
    public boolean f2345m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0755p0(Context context) {
        super(context);
        this.f2344l = AbstractC1385s.m2629s(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: b */
    public final void mo1210b(int i5, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(420213850);
        int i6 = (c1383r.m2586h(this) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 3) != 2)) {
            InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f2344l.getValue();
            if (interfaceC1603e == null) {
                c1383r.m2568W(-1238823553);
            } else {
                c1383r.m2568W(98585282);
                interfaceC1603e.mo0g(c1383r, 0);
            }
            c1383r.m2597p(false);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0710a(this, i5, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0755p0.class.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0713b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2345m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContent(InterfaceC1603e interfaceC1603e) {
        this.f2345m = true;
        this.f2344l.setValue(interfaceC1603e);
        if (isAttachedToWindow()) {
            if (this.f2258g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            m1213e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
