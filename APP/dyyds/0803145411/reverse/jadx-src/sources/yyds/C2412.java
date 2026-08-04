package yyds;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: yyds.ᲇᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2412 extends AbstractViewOnTouchListenerC0067 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f11888;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11889 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f11888 = actionMenuItemView;
    }

    @Override // yyds.AbstractViewOnTouchListenerC0067
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC0911 mo438() {
        C0640 c0640;
        int i = this.f11889;
        View view = this.f11888;
        switch (i) {
            case 0:
                AbstractC2290 abstractC2290 = ((ActionMenuItemView) view).f46;
                if (abstractC2290 == null || (c0640 = ((C1568) abstractC2290).f7963.f6012) == null) {
                    return null;
                }
                return c0640.m3360();
            default:
                C0640 c06402 = ((C0977) view).f4472.f6013;
                if (c06402 == null) {
                    return null;
                }
                return c06402.m3360();
        }
    }

    @Override // yyds.AbstractViewOnTouchListenerC0067
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo439() {
        InterfaceC0911 interfaceC0911Mo438;
        int i = this.f11889;
        View view = this.f11888;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                InterfaceC1632 interfaceC1632 = actionMenuItemView.f53;
                if (interfaceC1632 == null || !interfaceC1632.mo30(actionMenuItemView.f48) || (interfaceC0911Mo438 = mo438()) == null || !interfaceC0911Mo438.mo1515()) {
                }
                break;
            default:
                ((C0977) view).f4472.m2604();
                break;
        }
        return true;
    }

    @Override // yyds.AbstractViewOnTouchListenerC0067
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public boolean mo440() {
        switch (this.f11889) {
            case 1:
                C1313 c1313 = ((C0977) this.f11888).f4472;
                if (c1313.f6009 != null) {
                    return false;
                }
                c1313.m2605();
                return true;
            default:
                return super.mo440();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412(C0977 c0977, C0977 c09772) {
        super(c09772);
        this.f11888 = c0977;
    }
}
