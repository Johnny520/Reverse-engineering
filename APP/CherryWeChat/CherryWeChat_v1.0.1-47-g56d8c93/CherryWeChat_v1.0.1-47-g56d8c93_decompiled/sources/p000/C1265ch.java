package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ch */
/* JADX INFO: loaded from: classes.dex */
public final class C1265ch extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1265ch f4301b = new C1265ch(new C1116Zz(AbstractC0295Gu.m625r(-30485677865013L), AbstractC0295Gu.m625r(-30507152701493L), false, AbstractC0295Gu.m625r(-28948079573045L), AbstractC0295Gu.m625r(-28973849376821L), new C2648vx(AbstractC0295Gu.m625r(-30283814402101L), AbstractC0295Gu.m625r(-30399778519093L), AbstractC0295Gu.m625r(-30404073486389L), AbstractC0295Gu.m625r(-30438433224757L), new ViewOnClickListenerC1079Z4(7)), 64));

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String strM625r = AbstractC0295Gu.m625r(-29124173232181L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2922g(View.class);
        c1538iG.m2916a(new C0620Ob(9));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-29042568853557L);
    }

    /* JADX INFO: renamed from: f */
    public final void m2406f(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                CharSequence text = textView.getText();
                AbstractC0295Gu.m625r(-28836410423349L);
                if (AbstractC2564tz.m5051L(text, AbstractC0295Gu.m625r(-29442000812085L), false)) {
                    String strM2023c = m2023c();
                    if (strM2023c == null || strM2023c.length() == 0 || !Pattern.compile(AbstractC0295Gu.m625r(-29463475648565L)).matcher(strM2023c).matches()) {
                        return;
                    }
                    textView.setText(strM2023c);
                    return;
                }
            }
            if (childAt instanceof ViewGroup) {
                m2406f((ViewGroup) childAt);
            }
        }
    }
}
