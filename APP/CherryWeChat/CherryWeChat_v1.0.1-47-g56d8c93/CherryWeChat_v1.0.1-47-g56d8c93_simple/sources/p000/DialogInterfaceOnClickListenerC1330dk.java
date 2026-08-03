package p000;

import android.content.DialogInterface;
import android.widget.Toast;

/* JADX INFO: renamed from: dk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1330dk implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1505hk f4806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0185EC f4807c;

    public /* synthetic */ DialogInterfaceOnClickListenerC1330dk(C1505hk r2, C0185EC r3) {
        this.f4805a = 1;
        this.f4806b = r2;
        this.f4807c = r3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r9, int r10) {
        int r92 = this.f4805a;
        C1505hk r102 = this.f4806b;
        switch(r92) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        EnumC0099CC r5 = EnumC0099CC.f236d;
        C0185EC r93 = C0185EC.m386a(this.f4807c, null, null, null, null, r5, false, 3932159);
        int r0 = C1505hk.f5336g;
        r102.m2881b(r93);
        return;
    L6:
        C0185EC r94 = this.f4807c;
        C0183EA r02 = C0183EA.f539a;     // Catch: Exception -> L9
        String r95 = r94.f549a;     // Catch: Exception -> L9
        r02.getClass();     // Catch: Exception -> L9
        C0183EA.m383k(r95);     // Catch: Exception -> L9
        Toast.makeText(r102.getContext(), AbstractC0295Gu.m625r(-71128953387061L), 0).show();     // Catch: Exception -> L9
        AbstractC1208bA.m2329b(new RunnableC0562N2(14, r102), 100);     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        Toast.makeText(r102.getContext(), AbstractC0213Ey.m405c(-71159018158133L, new StringBuilder(), e), 0).show();
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC1330dk(C0185EC r2, C1505hk r3) {
        this.f4805a = 0;
        this.f4807c = r2;
        this.f4806b = r3;
    }
}
