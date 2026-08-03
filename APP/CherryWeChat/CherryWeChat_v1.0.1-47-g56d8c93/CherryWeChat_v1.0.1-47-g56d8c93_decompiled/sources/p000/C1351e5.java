package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1351e5 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4854b;

    public /* synthetic */ C1351e5(int i, Object obj) {
        this.f4853a = i;
        this.f4854b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m2609a(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2610b(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2611c(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2612d(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: e */
    private final void m2613e(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: f */
    private final void m2614f(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: g */
    private final void m2615g(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: h */
    private final void m2616h(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: i */
    private final void m2617i(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: j */
    private final void m2618j(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: k */
    private final void m2619k(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: l */
    private final void m2620l(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strM625r;
        String strM625r2;
        String string;
        String strM625r3;
        String strM625r4;
        int i = this.f4853a;
        Object obj = this.f4854b;
        switch (i) {
            case 0:
                Button button = (Button) obj;
                if (C1395f5.f4957b.m2024e() && AbstractC2564tz.m5051L(String.valueOf(editable), AbstractC0295Gu.m625r(-184979946469429L), true) && button.getVisibility() == 0) {
                    button.performClick();
                    break;
                }
                break;
            case 1:
                C1495ha c1495ha = (C1495ha) obj;
                if (editable == null || (strM625r = editable.toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-88381837015093L);
                }
                c1495ha.m2858a(strM625r);
                break;
            case 2:
                C0841Ti c0841Ti = (C0841Ti) obj;
                if (editable == null || (string = editable.toString()) == null || (strM625r2 = AbstractC2564tz.m5070e0(string).toString()) == null) {
                    strM625r2 = AbstractC0295Gu.m625r(-77549929494581L);
                }
                c0841Ti.f2680h = strM625r2;
                c0841Ti.m1663a();
                break;
            case 3:
                TextView textView = (TextView) obj;
                if (editable != null) {
                    String string2 = editable.toString();
                    if (AbstractC0585Nj.m1134a(string2, AbstractC0295Gu.m625r(-65369402243125L)) || string2.startsWith(AbstractC0295Gu.m625r(-65382287145013L))) {
                        HashMap map = AbstractC0999XA.f3193a;
                        String strM2892d = C1517hw.m2892d(AbstractC0295Gu.m625r(-65399467014197L), AbstractC0295Gu.m625r(-64939905513525L));
                        if (!strM2892d.equals(AbstractC0295Gu.m625r(-64952790415413L))) {
                            textView.setText(AbstractC0085Bz.m133K(string2, AbstractC0295Gu.m625r(-64965675317301L), strM2892d));
                        }
                    } else if (string2.equals(AbstractC0295Gu.m625r(-64978560219189L))) {
                        HashMap map2 = AbstractC0999XA.f3193a;
                        String strM2892d2 = C1517hw.m2892d(AbstractC0295Gu.m625r(-64995740088373L), AbstractC0295Gu.m625r(-65090229368885L));
                        if (!strM2892d2.equals(AbstractC0295Gu.m625r(-65107409238069L))) {
                            textView.setText(AbstractC0085Bz.m133K(string2, AbstractC0295Gu.m625r(-65124589107253L), strM2892d2));
                        }
                    } else if (string2.equals(AbstractC0295Gu.m625r(-65141768976437L))) {
                        HashMap map3 = AbstractC0999XA.f3193a;
                        String strM2892d3 = C1517hw.m2892d(AbstractC0295Gu.m625r(-65704409692213L), AbstractC0295Gu.m625r(-65807488907317L));
                        if (!strM2892d3.equals(AbstractC0295Gu.m625r(-65820373809205L))) {
                            textView.setText(AbstractC0085Bz.m133K(string2, AbstractC0295Gu.m625r(-65833258711093L), strM2892d3));
                        }
                    }
                }
                break;
            case 4:
                C1495ha c1495ha2 = (C1495ha) obj;
                if (editable == null || (strM625r3 = editable.toString()) == null) {
                    strM625r3 = AbstractC0295Gu.m625r(-84817014159413L);
                }
                c1495ha2.m2859e(strM625r3);
                break;
            default:
                C0701QC c0701qc = (C0701QC) obj;
                if (editable == null || (strM625r4 = editable.toString()) == null) {
                    strM625r4 = AbstractC0295Gu.m625r(-485945484769333L);
                }
                c0701qc.m1431e(strM625r4);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f4853a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f4853a;
    }
}
