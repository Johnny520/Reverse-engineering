package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kh */
/* JADX INFO: loaded from: classes.dex */
public final class C2147kh extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7511l;

    /* JADX INFO: renamed from: m */
    public AbstractC0828TB f7512m;

    public /* synthetic */ C2147kh(int r1) {
        this.f7511l = r1;
    }

    /* JADX INFO: renamed from: N */
    public final int m4332N(C0110Ch r12) {
        switch(this.f7511l) {
            case 0: goto L56;
            case 1: goto L50;
            default: goto L4;
        };
    L4:
        C0850Tr r0 = (C0850Tr) this.f7512m;
        if (r0 == null) goto L47;
        C2435qz r2 = r0.f2697l;
        if (r2 == null) goto L9;
        int r22 = r2.m4889N(r12);
    L10:
        C0182E9 r4 = r0.f2698m;
        if (r4 == null) goto L13;
        int r42 = r4.m371N(r12);
    L14:
        C0182E9 r5 = r0.f2699n;
        if (r5 == null) goto L17;
        int r52 = r5.m371N(r12);
    L18:
        C0294Gt r6 = r0.f2700o;
        if (r6 == null) goto L37;
        List r7 = r6.f994l;
        if (r7 == null) goto L31;
        ArrayList r9 = new ArrayList(AbstractC2539ta.m5019d0(r7, 10));
        Iterator r72 = r7.iterator();
    L24:
        if (r72.hasNext() == false) goto L30;
        C0251Ft r10 = (C0251Ft) r72.next();
        if (r10 != null) goto L29;
        r10 = new C0251Ft();
    L29:
        r9.add(Integer.valueOf(r10.m522N(r12)));
        goto L24
    L30:
        int r73 = r12.m164c(AbstractC2453ra.m4907q0(r9));
    L32:
        C0243Fl r62 = r6.f995m;
        if (r62 == null) goto L35;
        int r63 = r62.m515N(r12);
    L36:
        r12.m170i(2);
        r12.m162a(1, r63);
        r12.m162a(0, r73);
        int r64 = r12.m165d();
        r12.m166e(r64);
    L38:
        ArrayList r02 = r0.f2701p;
        if (r02 == null) goto L45;
        ArrayList r8 = new ArrayList(AbstractC2539ta.m5019d0(r02, 10));
        Iterator r03 = r02.iterator();
    L42:
        if (r03.hasNext() == false) goto L44;
        r8.add(Integer.valueOf(((C2435qz) r03.next()).m4889N(r12)));
        goto L42
    L44:
        int r04 = r12.m164c(AbstractC2453ra.m4907q0(r8));
    L46:
        r12.m170i(14);
        r12.m162a(13, 0);
        r12.m162a(12, 0);
        r12.m162a(11, 0);
        r12.m162a(10, 0);
        r12.m162a(9, 0);
        r12.m162a(8, 0);
        r12.m162a(7, r04);
        r12.m162a(6, 0);
        r12.m162a(5, 0);
        r12.m162a(4, r64);
        r12.m162a(3, r52);
        r12.m162a(2, r42);
        r12.m162a(1, 0);
        r12.m162a(0, r22);
        int r05 = r12.m165d();
        r12.m166e(r05);
    L48:
        r12.m170i(7);
        r12.m162a(6, r05);
        r12.m162a(4, 0);
        r12.m162a(3, 0);
        r12.m162a(1, 0);
        r12.m162a(0, 0);
        int r06 = r12.m165d();
        r12.m166e(r06);
        return r06;
    L45:
        r04 = 0;
        goto L46
    L35:
        r63 = 0;
        goto L36
    L31:
        r73 = 0;
        goto L32
    L37:
        r64 = 0;
        goto L38
    L17:
        r52 = 0;
        goto L18
    L13:
        r42 = 0;
        goto L14
    L9:
        r22 = 0;
        goto L10
    L47:
        r05 = 0;
        goto L48
    L50:
        C0182E9 r07 = (C0182E9) this.f7512m;
        if (r07 == null) goto L53;
        int r08 = r07.m371N(r12);
    L54:
        r12.m170i(6);
        r12.m162a(5, r08);
        r12.m162a(3, 0);
        r12.m162a(1, 0);
        r12.m162a(0, 0);
        int r09 = r12.m165d();
        r12.m166e(r09);
        return r09;
    L53:
        r08 = 0;
        goto L54
    L56:
        C0243Fl r010 = (C0243Fl) this.f7512m;
        if (r010 == null) goto L59;
        int r011 = r010.m515N(r12);
    L60:
        r12.m170i(3);
        r12.m162a(2, r011);
        r12.m162a(0, 0);
        int r012 = r12.m165d();
        r12.m166e(r012);
        return r012;
    L59:
        r011 = 0;
        goto L60
    }
}
