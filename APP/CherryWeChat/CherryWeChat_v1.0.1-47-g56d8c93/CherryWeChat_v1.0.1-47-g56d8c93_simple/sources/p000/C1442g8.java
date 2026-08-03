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
    public static final C1442g8 f5046b = null;

    /* JADX INFO: renamed from: c */
    public static final String f5047c = null;

    /* JADX INFO: renamed from: d */
    public static C2748yA f5048d;

    /* JADX INFO: renamed from: e */
    public static C2748yA f5049e;

    /* JADX INFO: renamed from: f */
    public static C2748yA f5050f;

    /* JADX INFO: renamed from: g */
    public static final C0452Kf f5051g = null;

    /* JADX INFO: renamed from: h */
    public static final List f5052h = null;

    static {
        AbstractC0295Gu.m625r(-257053792663605L);
        AbstractC0295Gu.m625r(-257165461813301L);
        AbstractC0295Gu.m625r(-257277130962997L);
        AbstractC0295Gu.m625r(-256873404037173L);
        AbstractC0295Gu.m625r(-256967893317685L);
        AbstractC0295Gu.m625r(-255417410123829L);
        AbstractC0295Gu.m625r(-255529079273525L);
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-247342871607349L), AbstractC0295Gu.m625r(-246904784943157L), AbstractC0295Gu.m625r(-246909079910453L), AbstractC0295Gu.m625r(-246943439648821L), new ViewOnClickListenerC1079Z4(2));
        f5046b = new C1442g8(new C1116Zz(AbstractC0295Gu.m625r(-247007864158261L), AbstractC0295Gu.m625r(-247033633962037L), false, AbstractC0295Gu.m625r(-263083926747189L), AbstractC0295Gu.m625r(-263113991518261L), r1, true));
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        f5047c = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-255614978619445L), AbstractC0295Gu.m625r(-255176891955253L));
        f5051g = C0452Kf.f1484a;
        f5052h = AbstractC2496sa.m4977b0(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-255181186922549L), AbstractC0295Gu.m625r(-255206956726325L)), new C0208Et(AbstractC0295Gu.m625r(-255361575548981L), AbstractC0295Gu.m625r(-255941396133941L)), new C0208Et(AbstractC0295Gu.m625r(-255666518226997L), AbstractC0295Gu.m625r(-255692288030773L)), new C0208Et(AbstractC0295Gu.m625r(-255902741428277L), AbstractC0295Gu.m625r(-25580825212981L))});
    }

    /* JADX INFO: renamed from: f */
    public static int m2753f(int r2, int r3, int r4, int r5) {
        if (r4 > 0) goto L4;
        r4 = 1080;
    L4:
        if (r5 > 0) goto L6;
        r5 = 1920;
    L6:
        int r0 = 1;
        if (r3 > r5) goto L11;
        if (r2 > r4) goto L11;
        return 1;
    L11:
        int r32 = r3 / 2;
        int r22 = r2 / 2;
    L13:
        if ((r32 / r0) < r5) goto L17;
        if ((r22 / r0) < r4) goto L17;
        r0 = r0 * 2;
    L17:
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public static void m2754g(ViewGroup r4) {
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2.getBackground() instanceof ColorDrawable) == false) goto L8;
        r2.setBackground(null);
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L10;
        m2754g((ViewGroup) r2);
    L10:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: h */
    public static void m2755h(View r3, ViewGroup r4) {
    L2:
        if (r3 == null) goto L12;
        boolean r0 = r3.getClass().getName().equals(AbstractC0295Gu.m625r(-258707355072565L));
        if ((r3.getBackground() instanceof ColorDrawable) == true) goto L6;
        if (r0 == true) goto L6;
    L7:
        if (r3 == r4) goto L20;
        Object r32 = r3.getParent();
        if ((r32 instanceof View) == true) goto L10;
        r3 = null;
        goto L2
    L10:
        r3 = (View) r32;
        goto L2
    L20:
        return;
    L6:
        r3.setBackground(null);
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public static String m2756i() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-260674450094133L), AbstractC0295Gu.m625r(-260786119243829L));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2757k(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (AbstractC0585Nj.m1134a(r6.getChildAt(r2).getTag(), AbstractC0295Gu.m625r(-258866268862517L)) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static String m2758l() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        String r02 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L));
        if (r02.length() <= 0) goto L7;
        return AbstractC0295Gu.m625r(-261829796296757L) + new File(r02).getName();
    L7:
        return AbstractC0295Gu.m625r(-261851271133237L);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2759m() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        return AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-261026637412405L), false);
    }

    /* JADX INFO: renamed from: n */
    public static void m2760n() {
        C2748yA r0 = f5048d;
        if (r0 != null) goto L5;
    L10:
        C2748yA r02 = f5049e;
        if (r02 == null) goto L13;
        r02.setSummary(m2758l());
    L13:
        C2748yA r03 = f5050f;
        if (r03 == null) goto L21;
        String r1 = m2756i();
        if (r1.length() <= 0) goto L18;
        String r12 = AbstractC0295Gu.m625r(-261915695642677L).concat(r1);
    L19:
        r03.setSummary(r12);
        return;
    L18:
        r12 = AbstractC0295Gu.m625r(-261937170479157L);
        goto L19
    L21:
        return;
    L5:
        if (m2759m() == false) goto L8;
        long r13 = -261752486885429L;
    L9:
        r0.setSummary(AbstractC0295Gu.m625r(r13));
        goto L10
    L8:
        r13 = -261791141591093L;
        goto L9
    }

    /* JADX INFO: renamed from: o */
    public static void m2761o() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262572825638965L), true);
        String r02 = AbstractC0295Gu.m625r(-262667314919477L);
        AbstractC0295Gu.m625r(-260897788393525L);
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), r02);
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262671609886773L), false);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1337ds r0 = C1337ds.f4821a;
        C1354e8 r1 = new C1354e8(0);
        r0.getClass();
        AbstractC0295Gu.m625r(-96456375531573L);
        C1337ds.f4822b.add(r1);
        String r02 = AbstractC0295Gu.m625r(-261597868062773L);
        C0223F7 r12 = new C0223F7(13);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int r3 = AbstractC1450gG.f5067a;
        new C2428qs(11, AbstractC1406fG.m2718r0(r02)).m4870f(r12);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-263178416027701L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context r7) {
        AbstractC0295Gu.m625r(-263281495242805L);
        ArrayList r0 = super.mo1096d(r7);
        AbstractC0295Gu.m625r(-263315854981173L);
        C1128aA r1 = new C1128aA(r7);
        r1.setKey(AbstractC0295Gu.m625r(-263642272495669L));
        r1.setTitle(AbstractC0295Gu.m625r(-263788301383733L));
        r1.setSummary(AbstractC0295Gu.m625r(-263826956089397L));
        SharedPreferences r2 = AbstractC0599Nx.f1939a;
        r1.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-263380279490613L), false));
        r0.add(r1);
        C1128aA r12 = new C1128aA(r7);
        r12.setKey(AbstractC0295Gu.m625r(-263526308378677L));
        r12.setTitle(AbstractC0295Gu.m625r(-261988710086709L));
        r12.setSummary(AbstractC0295Gu.m625r(-262010184923189L));
        r12.setChecked(AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-262104674203701L), false));
        r0.add(r12);
        C2748yA r13 = new C2748yA(r7);
        r13.setTitle(AbstractC0295Gu.m625r(-262216343353397L));
        f5046b.getClass();
        if (m2759m() == false) goto L6;
        long r22 = -261752486885429L;
    L7:
        r13.setSummary(AbstractC0295Gu.m625r(r22));
        r13.m5330a();
        r13.setOnClickListener(new ViewOnClickListenerC1079Z4(3));
        f5048d = r13;
        r0.add(r13);
        C2748yA r14 = new C2748yA(r7);
        r14.setTitle(AbstractC0295Gu.m625r(-261688062375989L));
        r14.setSummary(m2758l());
        r14.m5330a();
        r14.setOnClickListener(new ViewOnClickListenerC1079Z4(4));
        f5049e = r14;
        r0.add(r14);
        C2748yA r15 = new C2748yA(r7);
        r15.setTitle(AbstractC0295Gu.m625r(-261718127147061L));
        String r72 = m2756i();
        if (r72.length() <= 0) goto L10;
        String r73 = AbstractC0295Gu.m625r(-261915695642677L).concat(r72);
    L11:
        r15.setSummary(r73);
        r15.m5330a();
        r15.setOnClickListener(new ViewOnClickListenerC1079Z4(5));
        f5050f = r15;
        r0.add(r15);
        return r0;
    L10:
        r73 = AbstractC0295Gu.m625r(-261937170479157L);
        goto L11
    L6:
        r22 = -261791141591093L;
        goto L7
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2762j() {
        if (m2024e() == true) goto L5;
        return false;
    L5:
        if (m2759m() == false) goto L13;
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        if (AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L)).length() <= 0) goto L10;
        return true;
    L10:
        if (m2756i().length() <= 0) goto L20;
        return true;
    L20:
        return false;
    L13:
        if (f5047c.length() <= 0) goto L21;
        return true;
    L21:
        return false;
    }
}
