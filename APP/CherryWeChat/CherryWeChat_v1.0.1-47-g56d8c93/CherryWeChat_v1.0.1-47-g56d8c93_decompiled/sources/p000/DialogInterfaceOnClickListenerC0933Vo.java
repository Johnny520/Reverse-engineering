package p000;

import android.content.DialogInterface;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: renamed from: Vo */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0933Vo implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0097CA f2900b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0976Wo f2901c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0933Vo(int i, C0976Wo c0976Wo, C0097CA c0097ca) {
        this.f2899a = i;
        this.f2900b = c0097ca;
        this.f2901c = c0976Wo;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2899a) {
            case 0:
                C0097CA c0097ca = this.f2900b;
                C0976Wo c0976Wo = this.f2901c;
                try {
                    if (AbstractC2675wh.m5239b0(new File(c0097ca.f230h).getParentFile())) {
                        Toast.makeText(c0976Wo.getContext(), AbstractC0295Gu.m625r(-82708185217077L), 0).show();
                        InterfaceC0884Ui interfaceC0884Ui = c0976Wo.f3055a;
                        if (interfaceC0884Ui != null) {
                            interfaceC0884Ui.mo6a();
                        }
                    }
                } catch (Exception e) {
                    Toast.makeText(c0976Wo.getContext(), AbstractC0213Ey.m405c(-82738249988149L, new StringBuilder(), e), 0).show();
                    return;
                }
                break;
            default:
                C0097CA c0097ca2 = this.f2900b;
                C0976Wo c0976Wo2 = this.f2901c;
                try {
                    C0183EA c0183ea = C0183EA.f539a;
                    String str = c0097ca2.f223a;
                    c0183ea.getClass();
                    C0183EA.m383k(str);
                    Toast.makeText(c0976Wo2.getContext(), AbstractC0295Gu.m625r(-83322365540405L), 0).show();
                    AbstractC1208bA.m2329b(new RunnableC0562N2(16, c0976Wo2), 100L);
                } catch (Exception e2) {
                    Toast.makeText(c0976Wo2.getContext(), AbstractC0213Ey.m405c(-83352430311477L, new StringBuilder(), e2), 0).show();
                }
                break;
        }
    }
}
