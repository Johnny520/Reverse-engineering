package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p190.AbstractC7783;
import p190.InterfaceC7777;
import p190.InterfaceC7801;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    public boolean mo619() {
        switch (this.f807) {
            case 0:
                C0197 c0197 = ((C0206) this.f806).f808;
                if (c0197.f782 != null) {
                    return false;
                }
                c0197.m704();
                return true;
            default:
                return super.mo619();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo526() {
        InterfaceC7777 interfaceC7777Mo527;
        int i = this.f807;
        View view = this.f806;
        switch (i) {
            case 0:
                ((C0206) view).f808.m703();
                break;
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC7801 interfaceC7801 = actionMenuItemView.f363;
                if (interfaceC7801 == null || !interfaceC7801.mo459(actionMenuItemView.f368) || (interfaceC7777Mo527 = mo527()) == null || !interfaceC7777Mo527.mo646()) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7777 mo527() {
        C0203 c0203;
        int i = this.f807;
        View view = this.f806;
        switch (i) {
            case 0:
                C0203 c02032 = ((C0206) view).f808.f784;
                if (c02032 == null) {
                    return null;
                }
                return c02032.m13146();
            default:
                AbstractC7783 abstractC7783 = ((ActionMenuItemView) view).f361;
                if (abstractC7783 == null || (c0203 = ((C0207) abstractC7783).f809.f783) == null) {
                    return null;
                }
                return c0203.m13146();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205(C0206 c0206, C0206 c02062) {
        super(c02062);
        this.f806 = c0206;
    }
}
