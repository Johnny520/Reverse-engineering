package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: renamed from: Md */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0536Md implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1746b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0536Md(int r1, Object r2) {
        this.f1745a = r1;
        this.f1746b = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r6, int r7) {
        int r0 = this.f1745a;
        Object r2 = this.f1746b;
        switch(r0) {
            case 0: goto L38;
            case 1: goto L36;
            case 2: goto L34;
            default: goto L4;
        };
    L4:
        C0701QC r22 = (C0701QC) r2;
        int r02 = r22.f2264k.ordinal();
        if (r02 == 0) goto L20;
        if (r02 != 1) goto L19;
        if (r7 == 0) goto L17;
        if (r7 != 1) goto L10;
        EnumC0486LC r72 = EnumC0486LC.f1598e;
    L25:
        r22.f2268o = r72;
        r6.dismiss();
        EditText r62 = r22.f2258e;
        if (r62 == null) goto L31;
        Editable r63 = r62.getText();
        if (r63 == null) goto L31;
        String r64 = r63.toString();
        if (r64 == null) goto L31;
    L32:
        r22.m1431e(r64);
        return;
    L31:
        r64 = AbstractC0295Gu.m625r(-484592570071093L);
        goto L32
    L10:
        if (r7 != 2) goto L12;
        r72 = EnumC0486LC.f1597d;
        goto L25
    L12:
        if (r7 == 3) goto L14;
        r72 = EnumC0486LC.f1595b;
        goto L25
    L14:
        r72 = EnumC0486LC.f1594a;
        goto L25
    L17:
        r72 = EnumC0486LC.f1596c;
        goto L25
    L19:
        throw new C0232Fa();
    L20:
        if (r7 == 0) goto L24;
        if (r7 == 1) goto L23;
        r72 = EnumC0486LC.f1595b;
        goto L25
    L23:
        r72 = EnumC0486LC.f1594a;
        goto L25
    L24:
        r72 = EnumC0486LC.f1596c;
        goto L25
    L34:
        ((Activity) r2).finish();
        return;
    L36:
        SharedPreferences r65 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-822340208293941L) + ((C1335dq) r2).f4809a + AbstractC0295Gu.m625r(-822400337836085L), true);
        return;
    L38:
        ((C0223F7) r2).mo90g(Integer.valueOf(r7));
        r6.dismiss();
    }
}
