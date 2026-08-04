package yyds;

import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: yyds.ᲈᲀᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2748 extends AbstractC1535 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ DialogXBaseRelativeLayout f13461;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2671 f13462;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2748(DialogXBaseRelativeLayout dialogXBaseRelativeLayout, InterfaceC2671 interfaceC2671) {
        super(true);
        this.f13461 = dialogXBaseRelativeLayout;
        this.f13462 = interfaceC2671;
    }

    @Override // yyds.AbstractC1535
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo3166() {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f13461;
        AbstractC0041 parentDialog = dialogXBaseRelativeLayout.getParentDialog();
        if (dialogXBaseRelativeLayout.m295()) {
            return;
        }
        InterfaceC2605 interfaceC2605 = dialogXBaseRelativeLayout.f430;
        if (interfaceC2605 != null && parentDialog != null) {
            interfaceC2605.mo380();
            return;
        }
        this.f7377 = false;
        C2241 c2241 = this.f7379;
        if (c2241 != null) {
            c2241.mo731();
        }
        try {
            this.f13462.mo15().m22();
        } finally {
            this.f7377 = true;
            C2241 c22412 = this.f7379;
            if (c22412 != null) {
                c22412.mo731();
            }
        }
    }
}
