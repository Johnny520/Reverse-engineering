package yyds;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: yyds.ᲇᲇᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2558 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12630;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f12631;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f12632;

    public /* synthetic */ C2558(Object obj, int i, Object obj2) {
        this.f12630 = i;
        this.f12631 = obj;
        this.f12632 = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f12630;
        Object obj = this.f12632;
        Object obj2 = this.f12631;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-235277881344878L);
                ((C0312) obj2).f1627.mo511((C0324) obj, Boolean.valueOf(z));
                break;
            case 1:
                C0172 c0172 = (C0172) obj;
                AbstractC2328.m4341(-186701801227118L);
                ((C2086) obj2).f10340.setVisibility((!z || AbstractC1544.m3188(c0172.f997, AbstractC2328.m4341(-186757635801966L))) ? 8 : 0);
                break;
            default:
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) obj;
                AbstractC2328.m4341(-161473163330414L);
                ((AbstractC0222) obj2).mo879(Boolean.valueOf(z));
                AbstractC1960.m3789(AbstractC2328.m4341(-161528997905262L));
                if (interfaceC1549 != null) {
                    interfaceC1549.mo371(Boolean.valueOf(z));
                }
                break;
        }
    }
}
