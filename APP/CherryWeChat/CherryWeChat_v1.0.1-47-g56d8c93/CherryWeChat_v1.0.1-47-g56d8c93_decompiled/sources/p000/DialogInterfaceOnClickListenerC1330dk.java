package p000;

import android.content.DialogInterface;
import android.widget.Toast;

/* JADX INFO: renamed from: dk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1330dk implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4805a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1505hk f4806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0185EC f4807c;

    public /* synthetic */ DialogInterfaceOnClickListenerC1330dk(C1505hk c1505hk, C0185EC c0185ec) {
        this.f4806b = c1505hk;
        this.f4807c = c0185ec;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f4805a;
        C1505hk c1505hk = this.f4806b;
        switch (i2) {
            case 0:
                C0185EC c0185ec = this.f4807c;
                try {
                    C0183EA c0183ea = C0183EA.f539a;
                    String str = c0185ec.f549a;
                    c0183ea.getClass();
                    C0183EA.m383k(str);
                    Toast.makeText(c1505hk.getContext(), AbstractC0295Gu.m625r(-71128953387061L), 0).show();
                    AbstractC1208bA.m2329b(new RunnableC0562N2(14, c1505hk), 100L);
                } catch (Exception e) {
                    Toast.makeText(c1505hk.getContext(), AbstractC0213Ey.m405c(-71159018158133L, new StringBuilder(), e), 0).show();
                    return;
                }
                break;
            default:
                C0185EC c0185ecM386a = C0185EC.m386a(this.f4807c, null, null, null, null, EnumC0099CC.f236d, false, 3932159);
                int i3 = C1505hk.f5336g;
                c1505hk.m2881b(c0185ecM386a);
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC1330dk(C0185EC c0185ec, C1505hk c1505hk) {
        this.f4807c = c0185ec;
        this.f4806b = c1505hk;
    }
}
