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

    public /* synthetic */ DialogInterfaceOnClickListenerC0536Md(int i, Object obj) {
        this.f1745a = i;
        this.f1746b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException {
        EnumC0486LC enumC0486LC;
        String strM625r;
        Editable text;
        int i2 = this.f1745a;
        Object obj = this.f1746b;
        switch (i2) {
            case 0:
                ((C0223F7) obj).mo90g(Integer.valueOf(i));
                dialogInterface.dismiss();
                return;
            case 1:
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-822340208293941L) + ((C1335dq) obj).f4809a + AbstractC0295Gu.m625r(-822400337836085L), true);
                return;
            case 2:
                ((Activity) obj).finish();
                return;
            default:
                C0701QC c0701qc = (C0701QC) obj;
                int iOrdinal = c0701qc.f2264k.ordinal();
                if (iOrdinal == 0) {
                    enumC0486LC = i != 0 ? i != 1 ? EnumC0486LC.f1595b : EnumC0486LC.f1594a : EnumC0486LC.f1596c;
                } else {
                    if (iOrdinal != 1) {
                        throw new C0232Fa();
                    }
                    enumC0486LC = i != 0 ? i != 1 ? i != 2 ? i != 3 ? EnumC0486LC.f1595b : EnumC0486LC.f1594a : EnumC0486LC.f1597d : EnumC0486LC.f1598e : EnumC0486LC.f1596c;
                }
                c0701qc.f2268o = enumC0486LC;
                dialogInterface.dismiss();
                EditText editText = c0701qc.f2258e;
                if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-484592570071093L);
                }
                c0701qc.m1431e(strM625r);
                return;
        }
    }
}
