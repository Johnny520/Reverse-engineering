package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Nb */
/* JADX INFO: loaded from: classes.dex */
public final class C0577Nb extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0577Nb f1872b = null;

    /* JADX INFO: renamed from: c */
    public static volatile EnumC0319Hb f1873c;

    /* JADX INFO: renamed from: d */
    public static final List f1874d = null;

    static {
        AbstractC0295Gu.m625r(-33285996542005L);
        AbstractC0295Gu.m625r(-32268089292853L);
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-25984552138805L), AbstractC0295Gu.m625r(-24477018617909L), AbstractC0295Gu.m625r(-24502788421685L), AbstractC0295Gu.m625r(-24541443127349L), new ViewOnClickListenerC1079Z4(6));
        f1872b = new C0577Nb(new C1116Zz(AbstractC0295Gu.m625r(-24571507898421L), AbstractC0295Gu.m625r(-24592982734901L), true, AbstractC0295Gu.m625r(-24713241819189L), null, r1, 80));
        f1873c = EnumC0319Hb.f1047b;
        f1874d = AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-31095563221045L), AbstractC0295Gu.m625r(-31125627992117L), AbstractC0295Gu.m625r(-31194347468853L), AbstractC0295Gu.m625r(-31224412239925L), AbstractC0295Gu.m625r(-31263066945589L), AbstractC0295Gu.m625r(-31301721651253L), AbstractC0295Gu.m625r(-30790620543029L), AbstractC0295Gu.m625r(-30820685314101L), AbstractC0295Gu.m625r(-30872224921653L), AbstractC0295Gu.m625r(-30902289692725L), AbstractC0295Gu.m625r(-30940944398389L), AbstractC0295Gu.m625r(-30983894071349L), AbstractC0295Gu.m625r(-31022548777013L), AbstractC0295Gu.m625r(-31056908515381L), AbstractC0295Gu.m625r(-31641024067637L), AbstractC0295Gu.m625r(-31692563675189L), AbstractC0295Gu.m625r(-31744103282741L), AbstractC0295Gu.m625r(-31795642890293L), AbstractC0295Gu.m625r(-31834297595957L), AbstractC0295Gu.m625r(-31868657334325L), AbstractC0295Gu.m625r(-31370441127989L), AbstractC0295Gu.m625r(-31426275702837L), AbstractC0295Gu.m625r(-31486405244981L), AbstractC0295Gu.m625r(-31559419689013L), AbstractC0295Gu.m625r(-29974576756789L), AbstractC0295Gu.m625r(-30034706298933L), AbstractC0295Gu.m625r(-30150670415925L), AbstractC0295Gu.m625r(-29699698849845L), AbstractC0295Gu.m625r(-29798483097653L), AbstractC0295Gu.m625r(-29905857280053L)});
    }

    /* JADX INFO: renamed from: f */
    public static void m1118f(final boolean r4) {
        String r0 = AbstractC0295Gu.m625r(-25245817763893L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r1.m2921f(AbstractC0295Gu.m625r(-24859270707253L));
        r1.m2916a(new C0491Lb(r4));
    }

    /* JADX INFO: renamed from: g */
    public static String m1119g(boolean r8) {
        if (r8 == true) goto L5;
        String r3 = AbstractC0295Gu.m625r(-23098334115893L);
        C0223F7 r6 = new C0223F7(26);
        return AbstractC2453ra.m4901k0(f1874d, r3, null, null, r6, 30);
    L5:
        String r32 = AbstractC0295Gu.m625r(-23124103919669L);
        C0223F7 r62 = new C0223F7(27);
        return AbstractC2453ra.m4901k0(f1874d, r32, null, null, r62, 30);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C0276Gb.f894g.getClass();
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        EnumC0319Hb r02 = EnumC0319Hb.valueOf(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496824636930101L), AbstractC0295Gu.m625r(-496974960785461L)));     // Catch: IllegalArgumentException -> L5
    L6:
        f1873c = r02;
        Class r2 = null;
        Field r22 = null;
        if (AbstractC1257cG.m2378f() == null) goto L40;
        int r03 = 1;
        m1118f(true);
        Method[] r3 = AbstractC1257cG.m2378f().getDeclaredMethods();
        AbstractC0295Gu.m625r(-24897925412917L);
        int r4 = r3.length;
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L18;
        Method r6 = r3[r5];
        if (r6.getParameterTypes().length != 1) goto L17;
        if (AbstractC0585Nj.m1134a(r6.getParameterTypes()[0], Integer.TYPE) == false) goto L17;
        if (AbstractC0585Nj.m1134a(r6.getReturnType(), Object.class) == true) goto L17;
    L19:
        if (r6 == null) goto L21;
        Class<?> r32 = r6.getReturnType();
    L22:
        Field[] r42 = AbstractC1257cG.m2378f().getDeclaredFields();
        AbstractC0295Gu.m625r(-25001004628021L);
        int r52 = r42.length;
        int r62 = 0;
    L23:
        if (r62 >= r52) goto L36;
        Field r7 = r42[r62];
        Class<?> r8 = r7.getType();
        Field[] r9 = r8.getDeclaredFields();
        AbstractC0295Gu.m625r(-23450521434165L);
        int r10 = r9.length;
        int r11 = 0;
    L25:
        if (r11 >= r10) goto L35;
        if (AbstractC0585Nj.m1134a(r9[r11].getType(), SparseArray.class) == true) goto L28;
        r11 = r11 + 1;
        goto L25
    L28:
        Field[] r82 = r8.getDeclaredFields();
        AbstractC0295Gu.m625r(-23549305681973L);
        int r92 = r82.length;
        int r102 = 0;
    L29:
        if (r102 >= r92) goto L35;
        if (AbstractC0585Nj.m1134a(r82[r102].getType(), HashMap.class) == true) goto L32;
        r102 = r102 + 1;
        goto L29
    L32:
        r22 = r7;
    L35:
        r62 = r62 + 1;
    L36:
        if (r22 != null) goto L38;
        return;
    L38:
        C1538iG r23 = new C1538iG(r22.getType());
        r23.m2922g(new Object[]{List.class});
        r23.m2917b(new C0352I7(r03, r32));
        return;
    L21:
        r32 = null;
    L17:
        r5 = r5 + 1;
        goto L9
    L18:
        r6 = null;
        goto L19
    L40:
        m1118f(false);
        C1214bG r04 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586834266552373L));
        if (r04 == null) goto L43;
        Object r05 = r04.f4146a;
    L45:
        if ((r05 instanceof Class) == false) goto L47;
        r2 = (Class) r05;
    L47:
        C1538iG r06 = new C1538iG(r2);
        C0223F7 r1 = new C0223F7(24);
        AbstractC0295Gu.m625r(-576599359486005L);
        r06.f5425g = r1;
        r06.m2924i(Cursor.class);
        r06.m2917b(new C0223F7(25));
        return;
    L43:
        r05 = null;
    L5:
        r02 = EnumC0319Hb.f1047b;
        goto L6
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-24193550776373L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context r5) {
        AbstractC0295Gu.m625r(-24305219926069L);
        ArrayList r1 = new ArrayList(super.mo1096d(r5));
        C2748yA r0 = new C2748yA(r5);
        r0.setTitle(AbstractC0295Gu.m625r(-24339579664437L));
        r0.setSummary(AbstractC0295Gu.m625r(-24373939402805L));
        r0.m5330a();
        r0.setOnClickListener(new ViewOnClickListenerC0362Ib(r5, 1));
        r1.add(r0);
        C2748yA r02 = new C2748yA(r5);
        r02.setTitle(AbstractC0295Gu.m625r(-24416889075765L));
        r02.setSummary(AbstractC0295Gu.m625r(-24451248814133L));
        r02.m5330a();
        r02.setOnClickListener(new ViewOnClickListenerC0362Ib(r5, 0));
        r1.add(r02);
        return r1;
    }
}
