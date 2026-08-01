package p068h;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p069i.AbstractViewOnTouchListenerC0724w0;
import p069i.C0677g;
import p069i.C0680h;
import p069i.C0686j;
import p069i.C0689k;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0583b extends AbstractViewOnTouchListenerC0724w0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1979k = 0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View f1980l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1980l = actionMenuItemView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractViewOnTouchListenerC0724w0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0579D mo1171b() {
        C0677g c0677g;
        switch (this.f1979k) {
            case 0:
                AbstractC0584c abstractC0584c = ((ActionMenuItemView) this.f1980l).f920m;
                if (abstractC0584c == null || (c0677g = ((C0680h) abstractC0584c).f2293a.f2321u) == null) {
                    return null;
                }
                return c0677g.m1205a();
            default:
                C0677g c0677g2 = ((C0686j) this.f1980l).f2301e.f2320t;
                if (c0677g2 == null) {
                    return null;
                }
                return c0677g2.m1205a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractViewOnTouchListenerC0724w0
    /* JADX INFO: renamed from: c */
    public final boolean mo1172c() {
        InterfaceC0579D interfaceC0579DMo1171b;
        switch (this.f1979k) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1980l;
                InterfaceC0593l interfaceC0593l = actionMenuItemView.f918k;
                return interfaceC0593l != null && interfaceC0593l.mo649d(actionMenuItemView.f915h) && (interfaceC0579DMo1171b = mo1171b()) != null && interfaceC0579DMo1171b.mo1144a();
            default:
                ((C0686j) this.f1980l).f2301e.m1311l();
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractViewOnTouchListenerC0724w0
    /* JADX INFO: renamed from: d */
    public boolean mo1173d() {
        switch (this.f1979k) {
            case 1:
                C0689k c0689k = ((C0686j) this.f1980l).f2301e;
                if (c0689k.f2322v != null) {
                    return false;
                }
                c0689k.m1309f();
                return true;
            default:
                return super.mo1173d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583b(C0686j c0686j, C0686j c0686j2) {
        super(c0686j2);
        this.f1980l = c0686j;
    }
}
