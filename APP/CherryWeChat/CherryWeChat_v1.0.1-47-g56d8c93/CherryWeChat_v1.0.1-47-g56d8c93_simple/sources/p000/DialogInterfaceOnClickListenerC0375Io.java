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

    public /* synthetic */ DialogInterfaceOnClickListenerC0375Io(int r1, C0461Ko r2, C0185EC r3) {
        this.f1303a = r1;
        this.f1304b = r3;
        this.f1305c = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r5, int r6) {
        switch(this.f1303a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        C0185EC r52 = this.f1304b;
        C0461Ko r62 = this.f1305c;
        C0183EA r1 = C0183EA.f539a;     // Catch: Exception -> L7
        String r53 = r52.f549a;     // Catch: Exception -> L7
        r1.getClass();     // Catch: Exception -> L7
        C0183EA.m383k(r53);     // Catch: Exception -> L7
        Toast.makeText(r62.getContext(), AbstractC0295Gu.m625r(-85190676314165L), 0).show();     // Catch: Exception -> L7
        AbstractC1208bA.m2329b(new RunnableC0562N2(15, r62), 100);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        Toast.makeText(r62.getContext(), AbstractC0213Ey.m405c(-84670985271349L, new StringBuilder(), e), 0).show();
        return;
    L10:
        C0185EC r54 = this.f1304b;
        C0461Ko r63 = this.f1305c;
        C0183EA r2 = C0183EA.f539a;     // Catch: Exception -> L14
        String r55 = r54.f549a;     // Catch: Exception -> L14
        r2.getClass();     // Catch: Exception -> L14
        File r12 = new File(C0183EA.m377e(r55));     // Catch: Exception -> L14
        if (r12.exists() == false) goto L16;
        AbstractC2675wh.m5239b0(r12);     // Catch: Exception -> L14
        Toast.makeText(r63.getContext(), AbstractC0295Gu.m625r(-85053237360693L), 0).show();     // Catch: Exception -> L14
    L17:
        InterfaceC0418Jo r56 = r63.f1501a;     // Catch: Exception -> L14
        if (r56 == null) goto L28;
        C0299Gy r57 = (C0299Gy) r56;     // Catch: Exception -> L14
        C0701QC r13 = (C0701QC) ((C1258ca) r57.f1012b).f4263c;     // Catch: Exception -> L14
        Context r58 = ((C0056BC) r57.f1013c).f130a.getContext();     // Catch: Exception -> L14
        AbstractC0295Gu.m625r(-487388593780789L);     // Catch: Exception -> L14
        r13.m1433g((Activity) r58);     // Catch: Exception -> L14
        return;
    L28:
        return;
    L16:
        Toast.makeText(r63.getContext(), AbstractC0295Gu.m625r(-85079007164469L), 0).show();     // Catch: Exception -> L14
    L14:
        e = move-exception;
        Toast.makeText(r63.getContext(), AbstractC0213Ey.m405c(-85160611543093L, new StringBuilder(), e), 0).show();
    }
}
