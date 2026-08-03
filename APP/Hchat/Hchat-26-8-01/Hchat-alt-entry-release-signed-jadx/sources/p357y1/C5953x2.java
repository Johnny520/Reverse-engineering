package p357y1;

import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0106k;
import androidx.lifecycle.InterfaceC0110o;
import androidx.lifecycle.InterfaceC0112q;
import p071f1.C1021p;
import p085fg.InterfaceC1235p;
import p099h.Hchat.R;
import p117i0.C1871q;
import p117i0.InterfaceC1859n;

/* JADX INFO: renamed from: y1.x2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5953x2 implements InterfaceC1859n, InterfaceC0110o {

    /* JADX INFO: renamed from: g */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f24185g;

    /* JADX INFO: renamed from: h */
    public final C1871q f24186h;

    /* JADX INFO: renamed from: i */
    public boolean f24187i;

    /* JADX INFO: renamed from: j */
    public C0114s f24188j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1235p f24189k = AbstractC5864b1.f23821a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5953x2(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C1871q c1871q) {
        this.f24185g = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f24186h = c1871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0110o
    /* JADX INFO: renamed from: b */
    public final void mo548b(InterfaceC0112q interfaceC0112q, EnumC0106k enumC0106k) {
        if (enumC0106k == EnumC0106k.ON_DESTROY) {
            m10672e();
        } else {
            if (enumC0106k != EnumC0106k.ON_CREATE || this.f24187i) {
                return;
            }
            m10673f(this.f24189k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10672e() {
        if (!this.f24187i) {
            this.f24187i = true;
            this.f24185g.getView().setTag(R.id.wrapped_composition_tag, null);
            C0114s c0114s = this.f24188j;
            if (c0114s != null) {
                c0114s.m557f(this);
            }
            this.f24188j = null;
        }
        this.f24186h.m4600m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10673f(InterfaceC1235p interfaceC1235p) {
        this.f24185g.setOnReadyForComposition(new C1021p(this, 11, interfaceC1235p));
    }
}
