package p000;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: K7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438K7 implements InterfaceC0579Nd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1438b;

    public /* synthetic */ C0438K7(View r1, int r2) {
        this.f1437a = r2;
        this.f1438b = r1;
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public final void mo244r(EditText r6) {
        int r0 = this.f1437a;
        View r1 = this.f1438b;
        switch(r0) {
            case 0: goto L36;
            case 1: goto L27;
            case 2: goto L14;
            default: goto L4;
        };
    L4:
        String r62 = String.valueOf(r6.getText());
    L12:
        AbstractC0213Ey.m413k(-14740327757877L, r1.getContext(), 0);
        return;
    L6:
        if (Integer.parseInt(r62) <= 60) goto L9;
        Toast.makeText(r1.getContext(), AbstractC0295Gu.m625r(-14705968019509L), 0).show();     // Catch: NumberFormatException -> L12
        return;
    L9:
        SharedPreferences r02 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-14766097561653L), r62);
        if ((r1 instanceof C2748yA) == false) goto L50;
        ((C2748yA) r1).setValue(r62);
        return;
    L50:
        return;
    L14:
        String r63 = String.valueOf(r6.getText());
        if (r63.length() > 0) goto L48;
    L23:
        SharedPreferences r03 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-27973121996853L), r63);
        if ((r1 instanceof C2748yA) == false) goto L54;
        ((C2748yA) r1).setValue(r63);
        return;
    L54:
        return;
    L48:
        if (AbstractC2822zz.m5460E(r63) == false) goto L20;
        Float r04 = Float.valueOf(Float.parseFloat(r63));     // Catch: NumberFormatException -> L43
    L21:
        if (r04 != null) goto L23;
        AbstractC0213Ey.m413k(-27934467291189L, r1.getContext(), 0);
        return;
    L20:
        r04 = null;
        goto L21
    L27:
        String r64 = String.valueOf(r6.getText());
        if (r64.length() > 0) goto L30;
    L32:
        SharedPreferences r05 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-30717606098997L), r64);
        if ((r1 instanceof C2748yA) == false) goto L56;
        ((C2748yA) r1).setValue(r64);
        return;
    L56:
        return;
    L30:
        if (Pattern.compile(AbstractC0295Gu.m625r(-30580167145525L)).matcher(r64).matches() == true) goto L32;
        AbstractC0213Ey.m413k(-30670361458741L, r1.getContext(), 0);
        return;
    L36:
        String r65 = String.valueOf(r6.getText());
        new SimpleDateFormat(r65, Locale.getDefault());     // Catch: Throwable -> L41
        SharedPreferences r06 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-254055905490997L), r65);
        if ((r1 instanceof C2748yA) == false) goto L57;
        ((C2748yA) r1).setValue(r65);
        return;
    L57:
        return;
    L41:
        AbstractC0213Ey.m413k(-254025840719925L, r1.getContext(), 0);
    }
}
