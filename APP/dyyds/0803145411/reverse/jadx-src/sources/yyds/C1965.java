package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲀᛳᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1965 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9860;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f9861;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9862;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1127 f9863;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1965(Object obj, Context context, C1127 c1127, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f9862 = i;
        this.f9860 = obj;
        this.f9861 = context;
        this.f9863 = c1127;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i = this.f9862;
        int i2 = 0;
        int i3 = 1;
        C2746 c2746 = C2746.f13459;
        C1127 c1127 = this.f9863;
        Context context = this.f9861;
        Object obj2 = this.f9860;
        InterfaceC0274 interfaceC0274 = null;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789((String) obj2);
                    C0695.f3286.getClass();
                    boolean zM1612 = C0695.m1612(context);
                    TextView textView = c1127.f5195;
                    if (zM1612) {
                        textView.setText(AbstractC2328.m4341(-171879869088622L));
                        AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context, c1127, interfaceC0274, i2), 3);
                    } else {
                        textView.setText(AbstractC2328.m4341(-171725250265966L));
                    }
                }
                Throwable thM4249 = C2248.m4249(obj2);
                if (thM4249 != null) {
                    String message = thM4249.getMessage();
                    if (message == null) {
                        message = AbstractC2328.m4341(-141952536970094L);
                    }
                    AbstractC1960.m3789(message);
                }
                break;
            case 1:
                AbstractC1544.m3189(obj);
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789((String) obj2);
                    C0695.f3286.getClass();
                    boolean zM16122 = C0695.m1612(context);
                    TextView textView2 = c1127.f5190;
                    if (zM16122) {
                        textView2.setText(AbstractC2328.m4341(-171673710658414L));
                        AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context, c1127, interfaceC0274, i3), 3);
                    } else {
                        textView2.setText(AbstractC2328.m4341(-171613581116270L));
                    }
                }
                Throwable thM42492 = C2248.m4249(obj2);
                if (thM42492 != null) {
                    String message2 = thM42492.getMessage();
                    if (message2 == null) {
                        message2 = AbstractC2328.m4341(-149808032154478L);
                    }
                    AbstractC1960.m3789(message2);
                }
                break;
            case 2:
                AbstractC1544.m3189(obj);
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-235565644153710L));
                    new AlertDialog.Builder(context).setTitle(AbstractC2328.m4341(-171398832751470L)).setMessage(AbstractC2328.m4341(-171420307587950L)).setPositiveButton(AbstractC2328.m4341(-171579221377902L), new DialogInterfaceOnClickListenerC2477(context, c1127, i2)).setNegativeButton(AbstractC2328.m4341(-171600696214382L), (DialogInterface.OnClickListener) null).show();
                }
                Throwable thM42493 = C2248.m4249(obj2);
                if (thM42493 != null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-235600003892078L) + thM42493.getMessage());
                }
                break;
            default:
                AbstractC1544.m3189(obj);
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789((String) obj2);
                    C0695.f3286.getClass();
                    boolean zM16123 = C0695.m1612(context);
                    TextView textView3 = c1127.f5190;
                    if (zM16123) {
                        textView3.setText(AbstractC2328.m4341(-171673710658414L));
                        AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context, c1127, interfaceC0274, i3), 3);
                    } else {
                        textView3.setText(AbstractC2328.m4341(-171613581116270L));
                    }
                }
                Throwable thM42494 = C2248.m4249(obj2);
                if (thM42494 != null) {
                    String message3 = thM42494.getMessage();
                    if (message3 == null) {
                        message3 = AbstractC2328.m4341(-216929781056366L);
                    }
                    AbstractC1960.m3789(message3);
                }
                break;
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f9862) {
            case 0:
                return new C1965(this.f9860, this.f9861, this.f9863, interfaceC0274, 0);
            case 1:
                return new C1965(this.f9860, this.f9861, this.f9863, interfaceC0274, 1);
            case 2:
                return new C1965(this.f9860, this.f9861, this.f9863, interfaceC0274, 2);
            default:
                return new C1965(this.f9860, this.f9861, this.f9863, interfaceC0274, 3);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f9862;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C1965) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 1:
                ((C1965) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 2:
                ((C1965) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C1965) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
