package yyds;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᲁᛴᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2221 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10979;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2457 f10980;

    public /* synthetic */ ViewOnClickListenerC2221(C2457 c2457, int i) {
        this.f10979 = i;
        this.f10980 = c2457;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10979;
        C2457 c2457 = this.f10980;
        switch (i) {
            case 0:
                C0763 c0763 = c2457.f12138;
                c0763.getClass();
                AbstractC0041.m263(view);
                c0763.f3521 = 3;
                C0763 c07632 = c0763.f3523;
                InterfaceC2185 interfaceC2185 = c0763.f3526;
                if (interfaceC2185 != null) {
                    if (interfaceC2185 instanceof InterfaceC1376) {
                        if (!((InterfaceC1376) interfaceC2185).mo912(c07632)) {
                            c0763.m1712();
                        }
                        break;
                    } else if ((interfaceC2185 instanceof InterfaceC1006) && !((InterfaceC1006) interfaceC2185).mo1031(c07632)) {
                        c0763.m1712();
                        break;
                    }
                } else {
                    c0763.m1712();
                    break;
                }
                break;
            case 1:
                C0763 c07633 = c2457.f12138;
                c07633.getClass();
                AbstractC0041.m263(view);
                c07633.f3521 = 4;
                InterfaceC1006 interfaceC1006 = c07633.f3535;
                if (interfaceC1006 == null) {
                    c07633.m1712();
                } else if (!(interfaceC1006 instanceof InterfaceC1376)) {
                    if (!interfaceC1006.mo1031(c07633.f3523)) {
                        c07633.m1712();
                    }
                } else if (!((InterfaceC1376) interfaceC1006).mo912(c07633.f3523)) {
                    c07633.m1712();
                }
                break;
            case 2:
                C0763 c07634 = c2457.f12138;
                c07634.getClass();
                AbstractC0041.m263(view);
                c07634.f3521 = 2;
                C0763 c07635 = c07634.f3523;
                InterfaceC2185 interfaceC21852 = c07634.f3528;
                if (interfaceC21852 != null) {
                    if (interfaceC21852 instanceof InterfaceC1376) {
                        if (!((InterfaceC1376) interfaceC21852).mo912(c07635)) {
                            c07634.m1712();
                        }
                        break;
                    } else if ((interfaceC21852 instanceof InterfaceC1006) && !((InterfaceC1006) interfaceC21852).mo1031(c07635)) {
                        c07634.m1712();
                        break;
                    }
                } else {
                    c07634.m1712();
                    break;
                }
                break;
            case 3:
                if (c2457.f12138.f3517 == null) {
                    c2457.m4495(view);
                    break;
                }
                break;
            default:
                c2457.f12135.callOnClick();
                break;
        }
    }
}
