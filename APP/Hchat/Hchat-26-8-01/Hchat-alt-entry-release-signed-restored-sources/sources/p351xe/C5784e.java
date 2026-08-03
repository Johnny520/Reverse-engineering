package p351xe;

import android.view.View;
import android.view.autofill.AutofillManager;
import md.EnumC2824a;
import p025bc.AbstractC0255e;
import p222p.AbstractC3199a;
import p233pd.C3398i;
import p246qd.AbstractC3508l;
import p278t0.C4079c;
import p278t0.InterfaceC4080d;
import p291u0.AbstractC4228a;

/* JADX INFO: renamed from: xe.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5784e implements InterfaceC4080d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23526a;

    /* JADX INFO: renamed from: b */
    public Object f23527b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5784e(int i9) {
        this.f23526a = i9;
        switch (i9) {
            case 1:
                C4079c c4079c = new C4079c();
                this.f23527b = c4079c;
                if (!c4079c.f13518b) {
                    if (c4079c.f13519c) {
                        AbstractC4228a.m8492a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c4079c.m8263a();
                    c4079c.f13519c = true;
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public AbstractC3508l m10466a() {
        return ((C3398i) this.f23527b).mo7179S(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m10467b(View view, int i9, boolean z9) {
        ((AutofillManager) this.f23527b).notifyViewVisibilityChanged(view, i9, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f23526a) {
            case 2:
                C3398i c3398i = (C3398i) this.f23527b;
                return AbstractC0255e.m1033v(String.valueOf(c3398i.mo7179S(0)), " ", AbstractC3199a.m6833f(c3398i.f10945p), " ", String.valueOf(m10466a()));
            default:
                return super.toString();
        }
    }

    public C5784e(AutofillManager autofillManager) {
        this.f23526a = 3;
        this.f23527b = autofillManager;
    }

    public C5784e(C3398i c3398i) {
        this.f23526a = 2;
        c3398i.m6231w(EnumC2824a.f9170w);
        this.f23527b = c3398i;
    }
}
