package p000;

import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Set;

/* JADX INFO: renamed from: J7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0395J7 extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0395J7 f1333b = null;

    /* JADX INFO: renamed from: c */
    public static final Set f1334c = null;

    /* JADX INFO: renamed from: d */
    public static final C0554Mv f1335d = null;

    static {
        f1333b = new C0395J7(new C1116Zz(AbstractC0295Gu.m625r(-273228639500341L), AbstractC0295Gu.m625r(-272700358522933L), false, AbstractC0295Gu.m625r(-272777667934261L), AbstractC0295Gu.m625r(-272829207541813L), null, 96));
        f1334c = AbstractC0513Lx.m997B(new Integer[]{570425393, 10000, 268445456, 922746929});
        f1335d = new C0554Mv(AbstractC0295Gu.m625r(-254498287122485L));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m832f(C0089C2 r6, Object r7, int r8) {
        AbstractC0295Gu.m625r(-273559351982133L);
        AbstractC0295Gu.m625r(-273623776491573L);
        C1538iG r0 = new C1538iG(r7);
        r0.m2921f(AbstractC0295Gu.m625r(-273658136229941L));
        Object r02 = r0.m2918c(null, new Object[]{Integer.valueOf(r8)});
        if (r02 == null) goto L31;
        C0089C2 r3 = new C0089C2(3, r02);
        C1538iG r03 = new C1538iG(r7);
        r03.m2921f(AbstractC0295Gu.m625r(-273692495968309L));
        Object r72 = r03.m2918c(null, new Object[]{Integer.valueOf(r8 - 1)});
        if (r72 == null) goto L31;
        C0089C2 r04 = new C0089C2(3, r72);
        TextView r62 = (TextView) r6.f200f;
        if (r62 != null) goto L11;
    L16:
        Integer r63 = (Integer) r3.f199e;
        Set r73 = f1334c;
        if (r63 != null) goto L19;
    L21:
        if (r8 <= 0) goto L31;
        Integer r64 = (Integer) r04.f199e;
        if (r64 == null) goto L28;
        if (r73.contains(r64) == false) goto L28;
        return true;
    L28:
        if (AbstractC0585Nj.m1134a(m833g(r3), m833g(r04)) == false) goto L31;
        return false;
    L19:
        if (r73.contains(r63) == false) goto L21;
        return true;
    L11:
        if (r62.getVisibility() != 0) goto L16;
        CharSequence r65 = r62.getText();
        if (r65 == null) goto L16;
        if (r65.length() == 0) goto L16;
    L31:
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static String m833g(C0089C2 r3) {
        if (r3.m142d() == true) goto L5;
        Integer r0 = (Integer) r3.f199e;
        if (r0 != null) goto L9;
    L12:
        String r32 = (String) r3.f197c;
        if (r32 == null) goto L15;
        int r02 = AbstractC2564tz.m5057R(r32, AbstractC0295Gu.m625r(-273284474075189L), 0, false, 6);
        if (1 > r02) goto L24;
        if (r02 >= 65) goto L24;
        String r33 = r32.substring(0, r02);
        AbstractC0295Gu.m625r(-273297358977077L);
        if (f1335d.f1822a.matcher(r33).matches() == false) goto L24;
        return r33;
    L24:
        return AbstractC0295Gu.m625r(-273361783486517L);
    L15:
        return AbstractC0295Gu.m625r(-273241524402229L);
    L9:
        if (f1334c.contains(r0) == false) goto L12;
        return AbstractC0295Gu.m625r(-273756920477749L) + ((Long) r3.f200f);
    L5:
        return AbstractC0295Gu.m625r(-273726855706677L);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        Method r0 = AbstractC1257cG.m2375c();
        C0223F7 r1 = new C0223F7(6);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r0).m2916a(r1);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-272936581724213L);
    }
}
