package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ch */
/* JADX INFO: loaded from: classes.dex */
public final class C1265ch extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1265ch f4301b = null;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-30283814402101L), AbstractC0295Gu.m625r(-30399778519093L), AbstractC0295Gu.m625r(-30404073486389L), AbstractC0295Gu.m625r(-30438433224757L), new ViewOnClickListenerC1079Z4(7));
        f4301b = new C1265ch(new C1116Zz(AbstractC0295Gu.m625r(-30485677865013L), AbstractC0295Gu.m625r(-30507152701493L), false, AbstractC0295Gu.m625r(-28948079573045L), AbstractC0295Gu.m625r(-28973849376821L), r1, 64));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String r0 = AbstractC0295Gu.m625r(-29124173232181L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r1.m2922g(new Object[]{View.class});
        r1.m2916a(new C0620Ob(9));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-29042568853557L);
    }

    /* JADX INFO: renamed from: f */
    public final void m2406f(ViewGroup r9) {
        if (r9 == null) goto L29;
        int r0 = r9.getChildCount();
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L32;
        View r3 = r9.getChildAt(r2);
        if ((r3 instanceof TextView) == false) goto L21;
        TextView r4 = (TextView) r3;
        CharSequence r5 = r4.getText();
        AbstractC0295Gu.m625r(-28836410423349L);
        if (AbstractC2564tz.m5051L(r5, AbstractC0295Gu.m625r(-29442000812085L), false) == false) goto L21;
        String r92 = m2023c();
        if (r92 != null) goto L13;
        return;
    L13:
        if (r92.length() != 0) goto L16;
        return;
    L16:
        if (Pattern.compile(AbstractC0295Gu.m625r(-29463475648565L)).matcher(r92).matches() == false) goto L31;
        r4.setText(r92);
        return;
    L31:
        return;
    L21:
        if ((r3 instanceof ViewGroup) == false) goto L23;
        m2406f((ViewGroup) r3);
    L23:
        r2 = r2 + 1;
        goto L5
    L32:
        return;
    }
}
