package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: renamed from: Io */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0375Io implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0185EC f1304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0461Ko f1305c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0375Io(int i, C0461Ko c0461Ko, C0185EC c0185ec) {
        this.f1303a = i;
        this.f1304b = c0185ec;
        this.f1305c = c0461Ko;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1303a) {
            case 0:
                C0185EC c0185ec = this.f1304b;
                C0461Ko c0461Ko = this.f1305c;
                try {
                    C0183EA c0183ea = C0183EA.f539a;
                    String str = c0185ec.f549a;
                    c0183ea.getClass();
                    File file = new File(C0183EA.m377e(str));
                    if (file.exists()) {
                        AbstractC2675wh.m5239b0(file);
                        Toast.makeText(c0461Ko.getContext(), AbstractC0295Gu.m625r(-85053237360693L), 0).show();
                    } else {
                        Toast.makeText(c0461Ko.getContext(), AbstractC0295Gu.m625r(-85079007164469L), 0).show();
                    }
                    InterfaceC0418Jo interfaceC0418Jo = c0461Ko.f1501a;
                    if (interfaceC0418Jo != null) {
                        C0299Gy c0299Gy = (C0299Gy) interfaceC0418Jo;
                        C0701QC c0701qc = (C0701QC) ((C1258ca) c0299Gy.f1012b).f4263c;
                        Context context = ((C0056BC) c0299Gy.f1013c).f130a.getContext();
                        AbstractC0295Gu.m625r(-487388593780789L);
                        c0701qc.m1433g((Activity) context);
                    }
                } catch (Exception e) {
                    Toast.makeText(c0461Ko.getContext(), AbstractC0213Ey.m405c(-85160611543093L, new StringBuilder(), e), 0).show();
                    return;
                }
                break;
            default:
                C0185EC c0185ec2 = this.f1304b;
                C0461Ko c0461Ko2 = this.f1305c;
                try {
                    C0183EA c0183ea2 = C0183EA.f539a;
                    String str2 = c0185ec2.f549a;
                    c0183ea2.getClass();
                    C0183EA.m383k(str2);
                    Toast.makeText(c0461Ko2.getContext(), AbstractC0295Gu.m625r(-85190676314165L), 0).show();
                    AbstractC1208bA.m2329b(new RunnableC0562N2(15, c0461Ko2), 100L);
                } catch (Exception e2) {
                    Toast.makeText(c0461Ko2.getContext(), AbstractC0213Ey.m405c(-84670985271349L, new StringBuilder(), e2), 0).show();
                }
                break;
        }
    }
}
