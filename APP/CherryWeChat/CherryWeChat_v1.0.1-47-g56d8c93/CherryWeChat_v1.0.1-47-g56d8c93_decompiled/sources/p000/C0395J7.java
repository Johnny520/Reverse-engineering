package p000;

import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Set;

/* JADX INFO: renamed from: J7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0395J7 extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0395J7 f1333b = new C0395J7(new C1116Zz(AbstractC0295Gu.m625r(-273228639500341L), AbstractC0295Gu.m625r(-272700358522933L), false, AbstractC0295Gu.m625r(-272777667934261L), AbstractC0295Gu.m625r(-272829207541813L), (C2648vx) null, 96));

    /* JADX INFO: renamed from: c */
    public static final Set f1334c = AbstractC0513Lx.m997B(570425393, 10000, 268445456, 922746929);

    /* JADX INFO: renamed from: d */
    public static final C0554Mv f1335d = new C0554Mv(AbstractC0295Gu.m625r(-254498287122485L));

    /* JADX INFO: renamed from: f */
    public static boolean m832f(C0089C2 c0089c2, Object obj, int i) {
        Integer num;
        CharSequence text;
        AbstractC0295Gu.m625r(-273559351982133L);
        AbstractC0295Gu.m625r(-273623776491573L);
        C1538iG c1538iG = new C1538iG(obj);
        c1538iG.m2921f(AbstractC0295Gu.m625r(-273658136229941L));
        Object objM2918c = c1538iG.m2918c(null, Integer.valueOf(i));
        if (objM2918c != null) {
            C0089C2 c0089c22 = new C0089C2(3, objM2918c);
            C1538iG c1538iG2 = new C1538iG(obj);
            c1538iG2.m2921f(AbstractC0295Gu.m625r(-273692495968309L));
            Object objM2918c2 = c1538iG2.m2918c(null, Integer.valueOf(i - 1));
            if (objM2918c2 != null) {
                C0089C2 c0089c23 = new C0089C2(3, objM2918c2);
                TextView textView = (TextView) c0089c2.f200f;
                if (textView == null || textView.getVisibility() != 0 || (text = textView.getText()) == null || text.length() == 0) {
                    Integer num2 = (Integer) c0089c22.f199e;
                    Set set = f1334c;
                    if ((num2 == null || !set.contains(num2)) && i > 0 && (((num = (Integer) c0089c23.f199e) == null || !set.contains(num)) && AbstractC0585Nj.m1134a(m833g(c0089c22), m833g(c0089c23)))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m833g(C0089C2 c0089c2) {
        if (c0089c2.m142d()) {
            return AbstractC0295Gu.m625r(-273726855706677L);
        }
        Integer num = (Integer) c0089c2.f199e;
        if (num != null && f1334c.contains(num)) {
            return AbstractC0295Gu.m625r(-273756920477749L) + ((Long) c0089c2.f200f);
        }
        String str = (String) c0089c2.f197c;
        if (str == null) {
            return AbstractC0295Gu.m625r(-273241524402229L);
        }
        int iM5057R = AbstractC2564tz.m5057R(str, AbstractC0295Gu.m625r(-273284474075189L), 0, false, 6);
        if (1 <= iM5057R && iM5057R < 65) {
            String strSubstring = str.substring(0, iM5057R);
            AbstractC0295Gu.m625r(-273297358977077L);
            if (f1335d.f1822a.matcher(strSubstring).matches()) {
                return strSubstring;
            }
        }
        return AbstractC0295Gu.m625r(-273361783486517L);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        Method methodM2375c = AbstractC1257cG.m2375c();
        C0223F7 c0223f7 = new C0223F7(6);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(methodM2375c).m2916a(c0223f7);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-272936581724213L);
    }
}
