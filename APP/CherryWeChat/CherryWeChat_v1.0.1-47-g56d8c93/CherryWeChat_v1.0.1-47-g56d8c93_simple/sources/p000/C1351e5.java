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

    public /* synthetic */ C1351e5(int r1, Object r2) {
        this.f4853a = r1;
        this.f4854b = r2;
    }

    /* JADX INFO: renamed from: a */
    private final void m2609a(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2610b(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2611c(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2612d(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: e */
    private final void m2613e(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: f */
    private final void m2614f(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: g */
    private final void m2615g(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: h */
    private final void m2616h(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: i */
    private final void m2617i(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: j */
    private final void m2618j(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: k */
    private final void m2619k(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: l */
    private final void m2620l(int r1, int r2, int r3, CharSequence r4) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r5) {
        int r0 = this.f4853a;
        Object r1 = this.f4854b;
        switch(r0) {
            case 0: goto L55;
            case 1: goto L48;
            case 2: goto L39;
            case 3: goto L18;
            case 4: goto L11;
            default: goto L4;
        };
    L4:
        C0701QC r12 = (C0701QC) r1;
        if (r5 == null) goto L8;
        String r52 = r5.toString();
        if (r52 == null) goto L8;
    L9:
        r12.m1431e(r52);
        return;
    L8:
        r52 = AbstractC0295Gu.m625r(-485945484769333L);
        goto L9
    L11:
        C1495ha r13 = (C1495ha) r1;
        if (r5 == null) goto L15;
        String r53 = r5.toString();
        if (r53 == null) goto L15;
    L16:
        r13.m2859e(r53);
        return;
    L15:
        r53 = AbstractC0295Gu.m625r(-84817014159413L);
        goto L16
    L18:
        TextView r14 = (TextView) r1;
        if (r5 == null) goto L63;
        String r54 = r5.toString();
        if (AbstractC0585Nj.m1134a(r54, AbstractC0295Gu.m625r(-65369402243125L)) == false) goto L23;
    L35:
        HashMap r02 = AbstractC0999XA.f3193a;
        String r03 = C1517hw.m2892d(AbstractC0295Gu.m625r(-65399467014197L), AbstractC0295Gu.m625r(-64939905513525L));
        if (r03.equals(AbstractC0295Gu.m625r(-64952790415413L)) == true) goto L69;
        r14.setText(AbstractC0085Bz.m133K(r54, AbstractC0295Gu.m625r(-64965675317301L), r03));
        return;
    L69:
        return;
    L23:
        if (r54.startsWith(AbstractC0295Gu.m625r(-65382287145013L)) == true) goto L35;
        if (r54.equals(AbstractC0295Gu.m625r(-64978560219189L)) == false) goto L31;
        HashMap r04 = AbstractC0999XA.f3193a;
        String r05 = C1517hw.m2892d(AbstractC0295Gu.m625r(-64995740088373L), AbstractC0295Gu.m625r(-65090229368885L));
        if (r05.equals(AbstractC0295Gu.m625r(-65107409238069L)) == true) goto L64;
        r14.setText(AbstractC0085Bz.m133K(r54, AbstractC0295Gu.m625r(-65124589107253L), r05));
        return;
    L64:
        return;
    L31:
        if (r54.equals(AbstractC0295Gu.m625r(-65141768976437L)) == false) goto L66;
        HashMap r06 = AbstractC0999XA.f3193a;
        String r07 = C1517hw.m2892d(AbstractC0295Gu.m625r(-65704409692213L), AbstractC0295Gu.m625r(-65807488907317L));
        if (r07.equals(AbstractC0295Gu.m625r(-65820373809205L)) == true) goto L67;
        r14.setText(AbstractC0085Bz.m133K(r54, AbstractC0295Gu.m625r(-65833258711093L), r07));
        return;
    L67:
        return;
    L66:
        return;
    L63:
        return;
    L39:
        C0841Ti r15 = (C0841Ti) r1;
        if (r5 == null) goto L45;
        String r55 = r5.toString();
        if (r55 == null) goto L45;
        String r56 = AbstractC2564tz.m5070e0(r55).toString();
        if (r56 == null) goto L45;
    L46:
        r15.f2680h = r56;
        r15.m1663a();
        return;
    L45:
        r56 = AbstractC0295Gu.m625r(-77549929494581L);
        goto L46
    L48:
        C1495ha r16 = (C1495ha) r1;
        if (r5 == null) goto L52;
        String r57 = r5.toString();
        if (r57 == null) goto L52;
    L53:
        r16.m2858a(r57);
        return;
    L52:
        r57 = AbstractC0295Gu.m625r(-88381837015093L);
        goto L53
    L55:
        Button r17 = (Button) r1;
        if (C1395f5.f4957b.m2024e() == true) goto L58;
        return;
    L58:
        if (AbstractC2564tz.m5051L(String.valueOf(r5), AbstractC0295Gu.m625r(-184979946469429L), true) == true) goto L60;
        return;
    L60:
        if (r17.getVisibility() != 0) goto L72;
        r17.performClick();
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r12 = this.f4853a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r12 = this.f4853a;
    }
}
