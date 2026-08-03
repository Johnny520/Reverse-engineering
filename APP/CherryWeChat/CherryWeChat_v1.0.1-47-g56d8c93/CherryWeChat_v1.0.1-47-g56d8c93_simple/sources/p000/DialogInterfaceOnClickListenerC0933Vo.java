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

    public /* synthetic */ DialogInterfaceOnClickListenerC0933Vo(int r1, C0976Wo r2, C0097CA r3) {
        this.f2899a = r1;
        this.f2900b = r3;
        this.f2901c = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r5, int r6) {
        switch(this.f2899a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        C0097CA r52 = this.f2900b;
        C0976Wo r62 = this.f2901c;
        C0183EA r1 = C0183EA.f539a;     // Catch: Exception -> L7
        String r53 = r52.f223a;     // Catch: Exception -> L7
        r1.getClass();     // Catch: Exception -> L7
        C0183EA.m383k(r53);     // Catch: Exception -> L7
        Toast.makeText(r62.getContext(), AbstractC0295Gu.m625r(-83322365540405L), 0).show();     // Catch: Exception -> L7
        AbstractC1208bA.m2329b(new RunnableC0562N2(16, r62), 100);     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        Toast.makeText(r62.getContext(), AbstractC0213Ey.m405c(-83352430311477L, new StringBuilder(), e), 0).show();
        return;
    L10:
        C0097CA r54 = this.f2900b;
        C0976Wo r63 = this.f2901c;
    L17:
        e = move-exception;
        Toast.makeText(r63.getContext(), AbstractC0213Ey.m405c(-82738249988149L, new StringBuilder(), e), 0).show();
        return;
    L12:
        if (AbstractC2675wh.m5239b0(new File(r54.f230h).getParentFile()) == false) goto L25;
        Toast.makeText(r63.getContext(), AbstractC0295Gu.m625r(-82708185217077L), 0).show();     // Catch: Exception -> L17
        InterfaceC0884Ui r55 = r63.f3055a;     // Catch: Exception -> L17
        if (r55 == null) goto L26;
        r55.mo6a();     // Catch: Exception -> L17
        return;
    L26:
        return;
    }
}
