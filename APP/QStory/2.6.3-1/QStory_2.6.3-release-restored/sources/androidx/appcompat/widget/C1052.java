package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p206.AbstractC8612;
import p206.InterfaceC8606;
import p206.InterfaceC8630;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1052 extends AbstractViewOnTouchListenerC1011 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f1151;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1152 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1151 = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1011
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public boolean mo1179() {
        switch (this.f1152) {
            case 0:
                C1044 c1044 = ((C1053) this.f1151).f1153;
                if (c1044.f1127 != null) {
                    return false;
                }
                c1044.m1264();
                return true;
            default:
                return super.mo1179();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1011
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1086() {
        InterfaceC8606 interfaceC8606Mo1087;
        int i = this.f1152;
        View view = this.f1151;
        switch (i) {
            case 0:
                ((C1053) view).f1153.m1263();
                break;
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC8630 interfaceC8630 = actionMenuItemView.f708;
                if (interfaceC8630 == null || !interfaceC8630.mo1019(actionMenuItemView.f713) || (interfaceC8606Mo1087 = mo1087()) == null || !interfaceC8606Mo1087.mo1206()) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1011
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC8606 mo1087() {
        C1050 c1050;
        int i = this.f1152;
        View view = this.f1151;
        switch (i) {
            case 0:
                C1050 c10502 = ((C1053) view).f1153.f1129;
                if (c10502 == null) {
                    return null;
                }
                return c10502.m13705();
            default:
                AbstractC8612 abstractC8612 = ((ActionMenuItemView) view).f706;
                if (abstractC8612 == null || (c1050 = ((C1054) abstractC8612).f1154.f1128) == null) {
                    return null;
                }
                return c1050.m13705();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052(C1053 c1053, C1053 c10532) {
        super(c10532);
        this.f1151 = c1053;
    }
}
