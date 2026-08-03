package p000;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: jp */
/* JADX INFO: loaded from: classes.dex */
public final class C2111jp extends AbstractC0929Vk {

    /* JADX INFO: renamed from: b */
    public static final C2111jp f7424b = null;

    /* JADX INFO: renamed from: c */
    public static final C2111jp f7425c = null;

    /* JADX INFO: renamed from: d */
    public static final C2111jp f7426d = null;

    /* JADX INFO: renamed from: e */
    public static final C2111jp f7427e = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7428a;

    static {
        f7424b = new C2111jp(0);
        f7425c = new C2111jp(1);
        f7426d = new C2111jp(2);
        f7427e = new C2111jp(3);
    }

    public /* synthetic */ C2111jp(int r1) {
        this.f7428a = r1;
    }

    /* JADX INFO: renamed from: c */
    public static void m4300c(ViewGroup r10, int r11) {
        TextView r0 = (TextView) r10.findViewById(AbstractC0828TB.f2616h);
        HashMap r1 = AbstractC0999XA.f3193a;
        Drawable r112 = C1517hw.m2890b((String) AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(0, AbstractC0295Gu.m625r(-771552220018741L)), new C0208Et(1, AbstractC0295Gu.m625r(-770057571399733L)), new C0208Et(2, AbstractC0295Gu.m625r(-769675319310389L)), new C0208Et(3, AbstractC0295Gu.m625r(-769808463296565L)), new C0208Et(4, AbstractC0295Gu.m625r(-770495658063925L))}).get(Integer.valueOf(r11)));
        if (r112 == null) goto L7;
        ImageView r102 = (ImageView) r10.findViewById(AbstractC0828TB.f2614f);
        if (r102 == null) goto L7;
        r102.setImageDrawable(r112);
    L7:
        int r103 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-47214575482933L));
        if (r103 == 0) goto L11;
        r0.setTextColor(r103);
        return;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        int r1 = 3;
        int r2 = 2;
        Class r3 = null;
        switch(this.f7428a) {
            case 0: goto L29;
            case 1: goto L12;
            case 2: goto L32;
            default: goto L4;
        };
    L4:
        String r0 = AbstractC0295Gu.m625r(-518814869485621L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r22 = AbstractC1450gG.f5067a;
        C1538iG r12 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r12.m2921f(AbstractC0295Gu.m625r(-518939423537205L));
        r12.m2916a(new C0556Mx(20));
        return;
    L12:
        LinkedHashMap r02 = AbstractC1257cG.f4258a;
        C1214bG r6 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-587057604851765L));
        if (r6 == null) goto L15;
        Object r62 = r6.f4146a;
    L17:
        if ((r62 instanceof Class) == false) goto L19;
        Class r63 = (Class) r62;
    L20:
        C1538iG r7 = new C1538iG(r63);
        r7.m2921f(AbstractC0295Gu.m625r(-47141561038901L));
        r7.m2916a(new C0848Tp(1));
        C1214bG r03 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-587057604851765L));
        if (r03 == null) goto L23;
        Object r04 = r03.f4146a;
    L25:
        if ((r04 instanceof Class) == false) goto L27;
        r3 = (Class) r04;
    L27:
        C1538iG r05 = new C1538iG(r3);
        r05.m2921f(AbstractC0295Gu.m625r(-47180215744565L));
        C0848Tp r32 = new C0848Tp(r2);
        C0848Tp r23 = new C0848Tp(r1);
        AbstractC0295Gu.m625r(-576328776546357L);
        AbstractC0295Gu.m625r(-576358841317429L);
        r05.f5426h = r32;
        r05.f5427i = r23;
        r05.m2925j();
        return;
    L23:
        r04 = null;
        goto L25
    L19:
        r63 = null;
        goto L20
    L15:
        r62 = null;
        goto L17
    L29:
        String r06 = AbstractC0295Gu.m625r(-48206712928309L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r24 = AbstractC1450gG.f5067a;
        C1538iG r13 = new C1538iG(AbstractC1406fG.m2718r0(r06));
        r13.m2921f(AbstractC0295Gu.m625r(-48331266979893L));
        r13.m2916a(new C0620Ob(25));
        String r07 = AbstractC0295Gu.m625r(-48369921685557L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r14 = new C1538iG(AbstractC1406fG.m2718r0(r07));
        r14.m2921f(AbstractC0295Gu.m625r(-47944719923253L));
        r14.m2916a(new C0620Ob(26));
        return;
    L32:
        String r08 = AbstractC0295Gu.m625r(-92079803856949L);     // Catch: Throwable -> L31
        AbstractC0295Gu.m625r(-578300166535221L);     // Catch: Throwable -> L31
        int r72 = AbstractC1450gG.f5067a;     // Catch: Throwable -> L31
        C1538iG r64 = new C1538iG(AbstractC1406fG.m2718r0(r08));     // Catch: Throwable -> L31
        r64.m2921f(AbstractC0295Gu.m625r(-90653874714677L));     // Catch: Throwable -> L31
        r64.m2916a(new C0556Mx(2));     // Catch: Throwable -> L31
    L9:
        if (AbstractC1450gG.f5067a < 2980) goto L34;
        String r09 = AbstractC0295Gu.m625r(-90692529420341L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r25 = new C1538iG(AbstractC1406fG.m2718r0(r09));
        Class r010 = Integer.TYPE;
        r25.m2922g(new Object[]{null, r010, r010});
        r25.m2916a(new C0556Mx(3));
        return;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        switch(this.f7428a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0295Gu.m625r(-518763329878069L);
    L7:
        return AbstractC0295Gu.m625r(-92011084380213L);
    L9:
        return AbstractC0295Gu.m625r(-47081431496757L);
    L11:
        return AbstractC0295Gu.m625r(-48163763255349L);
    }
}
