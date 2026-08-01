package p069i;

import androidx.appcompat.widget.ActionBarContextView;
import p099y.InterfaceC1055T;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0659a implements InterfaceC1055T {

    /* JADX INFO: renamed from: a */
    public boolean f2224a = false;

    /* JADX INFO: renamed from: b */
    public int f2225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActionBarContextView f2226c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0659a(ActionBarContextView actionBarContextView) {
        this.f2226c = actionBarContextView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: a */
    public final void mo1047a() {
        if (this.f2224a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2226c;
        actionBarContextView.f959g = null;
        super/*android.view.View*/.setVisibility(this.f2225b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: b */
    public final void mo996b() {
        this.f2224a = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: c */
    public final void mo997c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2224a = false;
    }
}
