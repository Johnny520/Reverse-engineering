package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: loaded from: classes.dex */
public final class C1442g8 extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1442g8 f5046b;

    /* JADX INFO: renamed from: c */
    public static final String f5047c;

    /* JADX INFO: renamed from: d */
    public static C2748yA f5048d;

    /* JADX INFO: renamed from: e */
    public static C2748yA f5049e;

    /* JADX INFO: renamed from: f */
    public static C2748yA f5050f;

    /* JADX INFO: renamed from: g */
    public static final C0452Kf f5051g;

    /* JADX INFO: renamed from: h */
    public static final List f5052h;

    static {
        AbstractC0295Gu.m625r(-257053792663605L);
        AbstractC0295Gu.m625r(-257165461813301L);
        AbstractC0295Gu.m625r(-257277130962997L);
        AbstractC0295Gu.m625r(-256873404037173L);
        AbstractC0295Gu.m625r(-256967893317685L);
        AbstractC0295Gu.m625r(-255417410123829L);
        AbstractC0295Gu.m625r(-255529079273525L);
        f5046b = new C1442g8(new C1116Zz(AbstractC0295Gu.m625r(-247007864158261L), AbstractC0295Gu.m625r(-247033633962037L), false, AbstractC0295Gu.m625r(-263083926747189L), AbstractC0295Gu.m625r(-263113991518261L), new C2648vx(AbstractC0295Gu.m625r(-247342871607349L), AbstractC0295Gu.m625r(-246904784943157L), AbstractC0295Gu.m625r(-246909079910453L), AbstractC0295Gu.m625r(-246943439648821L), new ViewOnClickListenerC1079Z4(2)), true));
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        f5047c = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-255614978619445L), AbstractC0295Gu.m625r(-255176891955253L));
        f5051g = C0452Kf.f1484a;
        f5052h = AbstractC2496sa.m4977b0(new C0208Et(AbstractC0295Gu.m625r(-255181186922549L), AbstractC0295Gu.m625r(-255206956726325L)), new C0208Et(AbstractC0295Gu.m625r(-255361575548981L), AbstractC0295Gu.m625r(-255941396133941L)), new C0208Et(AbstractC0295Gu.m625r(-255666518226997L), AbstractC0295Gu.m625r(-255692288030773L)), new C0208Et(AbstractC0295Gu.m625r(-255902741428277L), AbstractC0295Gu.m625r(-25580825212981L)));
    }

    /* JADX INFO: renamed from: f */
    public static int m2753f(int i, int i2, int i3, int i4) {
        if (i3 <= 0) {
            i3 = 1080;
        }
        if (i4 <= 0) {
            i4 = 1920;
        }
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        int i6 = i2 / 2;
        int i7 = i / 2;
        while (i6 / i5 >= i4 && i7 / i5 >= i3) {
            i5 *= 2;
        }
        return i5;
    }

    /* JADX INFO: renamed from: g */
    public static void m2754g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getBackground() instanceof ColorDrawable) {
                childAt.setBackground(null);
            }
            if (childAt instanceof ViewGroup) {
                m2754g((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2755h(View view, ViewGroup viewGroup) {
        while (view != null) {
            boolean zEquals = view.getClass().getName().equals(AbstractC0295Gu.m625r(-258707355072565L));
            if ((view.getBackground() instanceof ColorDrawable) || zEquals) {
                view.setBackground(null);
            }
            if (view == viewGroup) {
                return;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m2756i() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-260674450094133L), AbstractC0295Gu.m625r(-260786119243829L));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2757k(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (AbstractC0585Nj.m1134a(viewGroup.getChildAt(i).getTag(), AbstractC0295Gu.m625r(-258866268862517L))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static String m2758l() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L));
        if (strM1173b.length() <= 0) {
            return AbstractC0295Gu.m625r(-261851271133237L);
        }
        return AbstractC0295Gu.m625r(-261829796296757L) + new File(strM1173b).getName();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2759m() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-261026637412405L), false);
    }

    /* JADX INFO: renamed from: n */
    public static void m2760n() {
        C2748yA c2748yA = f5048d;
        if (c2748yA != null) {
            c2748yA.setSummary(AbstractC0295Gu.m625r(m2759m() ? -261752486885429L : -261791141591093L));
        }
        C2748yA c2748yA2 = f5049e;
        if (c2748yA2 != null) {
            c2748yA2.setSummary(m2758l());
        }
        C2748yA c2748yA3 = f5050f;
        if (c2748yA3 != null) {
            String strM2756i = m2756i();
            c2748yA3.setSummary(strM2756i.length() > 0 ? AbstractC0295Gu.m625r(-261915695642677L).concat(strM2756i) : AbstractC0295Gu.m625r(-261937170479157L));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2761o() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262572825638965L), true);
        String strM625r = AbstractC0295Gu.m625r(-262667314919477L);
        AbstractC0295Gu.m625r(-260897788393525L);
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), strM625r);
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262671609886773L), false);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1337ds c1337ds = C1337ds.f4821a;
        C1354e8 c1354e8 = new C1354e8(0);
        c1337ds.getClass();
        AbstractC0295Gu.m625r(-96456375531573L);
        C1337ds.f4822b.add(c1354e8);
        String strM625r = AbstractC0295Gu.m625r(-261597868062773L);
        C0223F7 c0223f7 = new C0223F7(13);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int i = AbstractC1450gG.f5067a;
        new C2428qs(11, AbstractC1406fG.m2718r0(strM625r)).m4870f(c0223f7);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-263178416027701L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context context) {
        AbstractC0295Gu.m625r(-263281495242805L);
        ArrayList arrayListMo1096d = super.mo1096d(context);
        AbstractC0295Gu.m625r(-263315854981173L);
        C1128aA c1128aA = new C1128aA(context);
        c1128aA.setKey(AbstractC0295Gu.m625r(-263642272495669L));
        c1128aA.setTitle(AbstractC0295Gu.m625r(-263788301383733L));
        c1128aA.setSummary(AbstractC0295Gu.m625r(-263826956089397L));
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        c1128aA.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-263380279490613L), false));
        arrayListMo1096d.add(c1128aA);
        C1128aA c1128aA2 = new C1128aA(context);
        c1128aA2.setKey(AbstractC0295Gu.m625r(-263526308378677L));
        c1128aA2.setTitle(AbstractC0295Gu.m625r(-261988710086709L));
        c1128aA2.setSummary(AbstractC0295Gu.m625r(-262010184923189L));
        c1128aA2.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-262104674203701L), false));
        arrayListMo1096d.add(c1128aA2);
        C2748yA c2748yA = new C2748yA(context);
        c2748yA.setTitle(AbstractC0295Gu.m625r(-262216343353397L));
        f5046b.getClass();
        c2748yA.setSummary(AbstractC0295Gu.m625r(m2759m() ? -261752486885429L : -261791141591093L));
        c2748yA.m5330a();
        c2748yA.setOnClickListener(new ViewOnClickListenerC1079Z4(3));
        f5048d = c2748yA;
        arrayListMo1096d.add(c2748yA);
        C2748yA c2748yA2 = new C2748yA(context);
        c2748yA2.setTitle(AbstractC0295Gu.m625r(-261688062375989L));
        c2748yA2.setSummary(m2758l());
        c2748yA2.m5330a();
        c2748yA2.setOnClickListener(new ViewOnClickListenerC1079Z4(4));
        f5049e = c2748yA2;
        arrayListMo1096d.add(c2748yA2);
        C2748yA c2748yA3 = new C2748yA(context);
        c2748yA3.setTitle(AbstractC0295Gu.m625r(-261718127147061L));
        String strM2756i = m2756i();
        c2748yA3.setSummary(strM2756i.length() > 0 ? AbstractC0295Gu.m625r(-261915695642677L).concat(strM2756i) : AbstractC0295Gu.m625r(-261937170479157L));
        c2748yA3.m5330a();
        c2748yA3.setOnClickListener(new ViewOnClickListenerC1079Z4(5));
        f5050f = c2748yA3;
        arrayListMo1096d.add(c2748yA3);
        return arrayListMo1096d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2762j() {
        if (!m2024e()) {
            return false;
        }
        if (!m2759m()) {
            return f5047c.length() > 0;
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L)).length() > 0 || m2756i().length() > 0;
    }
}
