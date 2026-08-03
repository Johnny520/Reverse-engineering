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
    public static final C2111jp f7424b = new C2111jp(0);

    /* JADX INFO: renamed from: c */
    public static final C2111jp f7425c = new C2111jp(1);

    /* JADX INFO: renamed from: d */
    public static final C2111jp f7426d = new C2111jp(2);

    /* JADX INFO: renamed from: e */
    public static final C2111jp f7427e = new C2111jp(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7428a;

    public /* synthetic */ C2111jp(int i) {
        this.f7428a = i;
    }

    /* JADX INFO: renamed from: c */
    public static void m4300c(ViewGroup viewGroup, int i) {
        ImageView imageView;
        TextView textView = (TextView) viewGroup.findViewById(AbstractC0828TB.f2616h);
        HashMap map = AbstractC0999XA.f3193a;
        Drawable drawableM2890b = C1517hw.m2890b((String) AbstractC2598uq.m5110L(new C0208Et(0, AbstractC0295Gu.m625r(-771552220018741L)), new C0208Et(1, AbstractC0295Gu.m625r(-770057571399733L)), new C0208Et(2, AbstractC0295Gu.m625r(-769675319310389L)), new C0208Et(3, AbstractC0295Gu.m625r(-769808463296565L)), new C0208Et(4, AbstractC0295Gu.m625r(-770495658063925L))).get(Integer.valueOf(i)));
        if (drawableM2890b != null && (imageView = (ImageView) viewGroup.findViewById(AbstractC0828TB.f2614f)) != null) {
            imageView.setImageDrawable(drawableM2890b);
        }
        int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-47214575482933L));
        if (iM2889a != 0) {
            textView.setTextColor(iM2889a);
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        int i = 3;
        int i2 = 2;
        switch (this.f7428a) {
            case 0:
                String strM625r = AbstractC0295Gu.m625r(-48206712928309L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i3 = AbstractC1450gG.f5067a;
                C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
                c1538iG.m2921f(AbstractC0295Gu.m625r(-48331266979893L));
                c1538iG.m2916a(new C0620Ob(25));
                String strM625r2 = AbstractC0295Gu.m625r(-48369921685557L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG2 = new C1538iG(AbstractC1406fG.m2718r0(strM625r2));
                c1538iG2.m2921f(AbstractC0295Gu.m625r(-47944719923253L));
                c1538iG2.m2916a(new C0620Ob(26));
                break;
            case 1:
                LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
                C1214bG c1214bG = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-587057604851765L));
                Object obj = c1214bG != null ? c1214bG.f4146a : null;
                C1538iG c1538iG3 = new C1538iG(obj instanceof Class ? (Class) obj : null);
                c1538iG3.m2921f(AbstractC0295Gu.m625r(-47141561038901L));
                c1538iG3.m2916a(new C0848Tp(1));
                C1214bG c1214bG2 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-587057604851765L));
                Object obj2 = c1214bG2 != null ? c1214bG2.f4146a : null;
                C1538iG c1538iG4 = new C1538iG(obj2 instanceof Class ? (Class) obj2 : null);
                c1538iG4.m2921f(AbstractC0295Gu.m625r(-47180215744565L));
                C0848Tp c0848Tp = new C0848Tp(i2);
                C0848Tp c0848Tp2 = new C0848Tp(i);
                AbstractC0295Gu.m625r(-576328776546357L);
                AbstractC0295Gu.m625r(-576358841317429L);
                c1538iG4.f5426h = c0848Tp;
                c1538iG4.f5427i = c0848Tp2;
                c1538iG4.m2925j();
                break;
            case 2:
                try {
                    String strM625r3 = AbstractC0295Gu.m625r(-92079803856949L);
                    AbstractC0295Gu.m625r(-578300166535221L);
                    int i4 = AbstractC1450gG.f5067a;
                    C1538iG c1538iG5 = new C1538iG(AbstractC1406fG.m2718r0(strM625r3));
                    c1538iG5.m2921f(AbstractC0295Gu.m625r(-90653874714677L));
                    c1538iG5.m2916a(new C0556Mx(2));
                    break;
                } catch (Throwable unused) {
                }
                if (AbstractC1450gG.f5067a >= 2980) {
                    String strM625r4 = AbstractC0295Gu.m625r(-90692529420341L);
                    AbstractC0295Gu.m625r(-578300166535221L);
                    C1538iG c1538iG6 = new C1538iG(AbstractC1406fG.m2718r0(strM625r4));
                    Class cls = Integer.TYPE;
                    c1538iG6.m2922g(null, cls, cls);
                    c1538iG6.m2916a(new C0556Mx(3));
                }
                break;
            default:
                String strM625r5 = AbstractC0295Gu.m625r(-518814869485621L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i5 = AbstractC1450gG.f5067a;
                C1538iG c1538iG7 = new C1538iG(AbstractC1406fG.m2718r0(strM625r5));
                c1538iG7.m2921f(AbstractC0295Gu.m625r(-518939423537205L));
                c1538iG7.m2916a(new C0556Mx(20));
                break;
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        switch (this.f7428a) {
            case 0:
                return AbstractC0295Gu.m625r(-48163763255349L);
            case 1:
                return AbstractC0295Gu.m625r(-47081431496757L);
            case 2:
                return AbstractC0295Gu.m625r(-92011084380213L);
            default:
                return AbstractC0295Gu.m625r(-518763329878069L);
        }
    }
}
