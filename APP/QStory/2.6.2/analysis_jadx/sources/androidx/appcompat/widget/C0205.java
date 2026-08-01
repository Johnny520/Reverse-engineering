package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p190.AbstractC7782;
import p190.InterfaceC7776;
import p190.InterfaceC7800;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0205 extends AbstractViewOnTouchListenerC0164 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f806;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f807 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f806 = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo618() {
        switch (this.f807) {
            case 0:
                C0197 c0197 = ((C0206) this.f806).f808;
                if (c0197.f782 != null) {
                    return false;
                }
                c0197.m703();
                return true;
            default:
                return super.mo618();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo525() {
        InterfaceC7776 interfaceC7776Mo526;
        int i = this.f807;
        View view = this.f806;
        switch (i) {
            case 0:
                ((C0206) view).f808.m702();
                break;
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC7800 interfaceC7800 = actionMenuItemView.f363;
                if (interfaceC7800 == null || !interfaceC7800.mo458(actionMenuItemView.f368) || (interfaceC7776Mo526 = mo526()) == null || !interfaceC7776Mo526.mo645()) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7776 mo526() {
        C0203 c0203;
        int i = this.f807;
        View view = this.f806;
        switch (i) {
            case 0:
                C0203 c02032 = ((C0206) view).f808.f784;
                if (c02032 == null) {
                    return null;
                }
                return c02032.m13118();
            default:
                AbstractC7782 abstractC7782 = ((ActionMenuItemView) view).f361;
                if (abstractC7782 == null || (c0203 = ((C0207) abstractC7782).f809.f783) == null) {
                    return null;
                }
                return c0203.m13118();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205(C0206 c0206, C0206 c02062) {
        super(c02062);
        this.f806 = c0206;
    }
}
