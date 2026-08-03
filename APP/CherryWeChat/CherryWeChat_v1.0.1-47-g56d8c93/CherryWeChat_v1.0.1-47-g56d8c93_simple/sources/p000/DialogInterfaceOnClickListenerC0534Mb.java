package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: renamed from: Mb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0534Mb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f1740c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1741d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0534Mb(Object r1, KeyEvent.Callback r2, Object r3, int r4) {
        this.f1738a = r4;
        this.f1739b = r1;
        this.f1740c = r2;
        this.f1741d = r3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r13, int r14) {
        int r0 = this.f1738a;
        Object r2 = this.f1741d;
        KeyEvent.Callback r3 = this.f1740c;
        Object r4 = this.f1739b;
        switch(r0) {
            case 0: goto L45;
            case 1: goto L22;
            case 2: goto L14;
            default: goto L4;
        };
    L4:
        C0784SA r9 = (C0784SA) r4;
        Activity r8 = (Activity) r3;
        String r6 = (String) r2;
        r13.dismiss();
        if (r14 != 0) goto L8;
        long r132 = -490352121215029L;
    L7:
        String r133 = AbstractC0295Gu.m625r(r132);
        if (r9.f2480g == null) goto L58;
        C1498hd r134 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0950W4(r6, r133, r8, r9, null, 3), 3);
        return;
    L58:
        return;
    L8:
        r132 = -490382185986101L;
        goto L7
    L14:
        C0185EC r42 = (C0185EC) r4;
        TextView r32 = (TextView) r3;
        C0625Og r22 = (C0625Og) r2;
        C0183EA r142 = C0183EA.f539a;     // Catch: Exception -> L19
        String r02 = r42.f549a;     // Catch: Exception -> L19
        r142.getClass();     // Catch: Exception -> L19
        File r135 = new File(C0183EA.m377e(r02));     // Catch: Exception -> L19
        if (r135.exists() == false) goto L59;
        AbstractC2675wh.m5239b0(r135);     // Catch: Exception -> L19
        Toast.makeText(r32.getContext(), AbstractC0295Gu.m625r(-97719095916597L), 0).show();     // Catch: Exception -> L19
        r22.f1989a.notifyDataSetChanged();     // Catch: Exception -> L19
        return;
    L59:
        return;
    L19:
        e = move-exception;
        Toast.makeText(r32.getContext(), AbstractC0213Ey.m405c(-97744865720373L, new StringBuilder(), e), 0).show();
        return;
    L22:
        File r43 = (File) r4;
        C0625Og r33 = (C0625Og) r3;
        C0140DA r23 = (C0140DA) r2;
        File r136 = r43.getParentFile();     // Catch: Exception -> L26
        if (r136 == null) goto L28;
        File[] r143 = r136.listFiles();     // Catch: Exception -> L26
    L29:
        if (r143 == null) goto L38;
        int r03 = r143.length;     // Catch: Exception -> L26
        int r5 = 0;
    L31:
        if (r5 >= r03) goto L38;
        File r62 = r143[r5];     // Catch: Exception -> L26
        if (r62.isDirectory() == false) goto L37;
        if (AbstractC0585Nj.m1134a(r62.getName(), r23.f364a) == true) goto L37;
        r43.delete();     // Catch: Exception -> L26
        Toast.makeText(r33.getContext(), AbstractC0295Gu.m625r(-78073915504693L), 0).show();     // Catch: Exception -> L26
    L41:
        r33.f1989a.notifyDataSetChanged();     // Catch: Exception -> L26
        return;
    L37:
        r5 = r5 + 1;     // Catch: Exception -> L26
    L38:
        if (r136 == null) goto L40;
        AbstractC2675wh.m5239b0(r136);     // Catch: Exception -> L26
    L40:
        Toast.makeText(r33.getContext(), AbstractC0295Gu.m625r(-78108275243061L), 0).show();     // Catch: Exception -> L26
        goto L41
    L28:
        r143 = null;
    L26:
        e = move-exception;
        Toast.makeText(r33.getContext(), AbstractC0213Ey.m405c(-78134045046837L, new StringBuilder(), e), 0).show();
        return;
    L45:
        View r34 = (View) r3;
        Context r24 = (Context) r2;
        String r144 = ((String[]) r4)[r14];
        SharedPreferences r04 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-23145578756149L), r144);
        if ((r34 instanceof C2748yA) == false) goto L48;
        ((C2748yA) r34).setValue(r144);
    L48:
        r13.dismiss();
        Toast.makeText(r24, AbstractC0295Gu.m625r(-23287312676917L).concat(r144), 0).show();
    }
}
