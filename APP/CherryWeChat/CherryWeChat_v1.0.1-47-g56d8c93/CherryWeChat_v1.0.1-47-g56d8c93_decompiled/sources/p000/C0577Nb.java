package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.SparseArray;
import android.widget.ListView;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Nb */
/* JADX INFO: loaded from: classes.dex */
public final class C0577Nb extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0577Nb f1872b;

    /* JADX INFO: renamed from: c */
    public static volatile EnumC0319Hb f1873c;

    /* JADX INFO: renamed from: d */
    public static final List f1874d;

    static {
        AbstractC0295Gu.m625r(-33285996542005L);
        AbstractC0295Gu.m625r(-32268089292853L);
        f1872b = new C0577Nb(new C1116Zz(AbstractC0295Gu.m625r(-24571507898421L), AbstractC0295Gu.m625r(-24592982734901L), true, AbstractC0295Gu.m625r(-24713241819189L), (String) null, new C2648vx(AbstractC0295Gu.m625r(-25984552138805L), AbstractC0295Gu.m625r(-24477018617909L), AbstractC0295Gu.m625r(-24502788421685L), AbstractC0295Gu.m625r(-24541443127349L), new ViewOnClickListenerC1079Z4(6)), 80));
        f1873c = EnumC0319Hb.f1047b;
        f1874d = AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-31095563221045L), AbstractC0295Gu.m625r(-31125627992117L), AbstractC0295Gu.m625r(-31194347468853L), AbstractC0295Gu.m625r(-31224412239925L), AbstractC0295Gu.m625r(-31263066945589L), AbstractC0295Gu.m625r(-31301721651253L), AbstractC0295Gu.m625r(-30790620543029L), AbstractC0295Gu.m625r(-30820685314101L), AbstractC0295Gu.m625r(-30872224921653L), AbstractC0295Gu.m625r(-30902289692725L), AbstractC0295Gu.m625r(-30940944398389L), AbstractC0295Gu.m625r(-30983894071349L), AbstractC0295Gu.m625r(-31022548777013L), AbstractC0295Gu.m625r(-31056908515381L), AbstractC0295Gu.m625r(-31641024067637L), AbstractC0295Gu.m625r(-31692563675189L), AbstractC0295Gu.m625r(-31744103282741L), AbstractC0295Gu.m625r(-31795642890293L), AbstractC0295Gu.m625r(-31834297595957L), AbstractC0295Gu.m625r(-31868657334325L), AbstractC0295Gu.m625r(-31370441127989L), AbstractC0295Gu.m625r(-31426275702837L), AbstractC0295Gu.m625r(-31486405244981L), AbstractC0295Gu.m625r(-31559419689013L), AbstractC0295Gu.m625r(-29974576756789L), AbstractC0295Gu.m625r(-30034706298933L), AbstractC0295Gu.m625r(-30150670415925L), AbstractC0295Gu.m625r(-29699698849845L), AbstractC0295Gu.m625r(-29798483097653L), AbstractC0295Gu.m625r(-29905857280053L));
    }

    /* JADX INFO: renamed from: f */
    public static void m1118f(final boolean z) {
        String strM625r = AbstractC0295Gu.m625r(-25245817763893L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2921f(AbstractC0295Gu.m625r(-24859270707253L));
        c1538iG.m2916a(new InterfaceC1416fj() { // from class: Lb
            @Override // p000.InterfaceC1416fj
            /* JADX INFO: renamed from: g */
            public final Object mo90g(Object obj) {
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-22162031245365L);
                if (C0577Nb.f1872b.m2024e()) {
                    Object obj2 = c1494hG.f5263a.f8521b;
                    C2648vx c2648vx = new C2648vx();
                    EnumC1400fA enumC1400fA = null;
                    if (obj2 instanceof Class) {
                        c2648vx.f9163b = (Class) obj2;
                    } else {
                        c2648vx.f9164c = obj2;
                        c2648vx.f9163b = obj2 != null ? obj2.getClass() : null;
                    }
                    c2648vx.m5182e(AbstractC0295Gu.m625r(-22213570852917L));
                    ListView listView = (ListView) c2648vx.m5178a();
                    if (listView != null && !AbstractC0585Nj.m1134a(listView.getTag(R.id.tag_main_init), Object.class)) {
                        listView.setTag(R.id.tag_main_init, Object.class);
                        Context context = listView.getContext();
                        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                        String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-22986664966197L), AbstractC0295Gu.m625r(-22578643073077L));
                        C0276Gb.f894g.getClass();
                        AbstractC0295Gu.m625r(-496438089873461L);
                        EnumC1400fA[] enumC1400fAArrValues = EnumC1400fA.values();
                        int length = enumC1400fAArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            EnumC1400fA enumC1400fA2 = enumC1400fAArrValues[i2];
                            if (enumC1400fA2.f4968a.equals(strM1173b)) {
                                enumC1400fA = enumC1400fA2;
                                break;
                            }
                            i2++;
                        }
                        if (enumC1400fA == null) {
                            enumC1400fA = EnumC1400fA.f4966b;
                        }
                        C0276Gb c0276Gb = new C0276Gb(context);
                        c0276Gb.setTabStyle(enumC1400fA);
                        c0276Gb.setOnTabSelectedListener(new C0740R9(c0276Gb, listView, z));
                        C0183EA.f539a.getClass();
                        if (!C0183EA.m373a().equals(AbstractC0295Gu.m625r(-22604412876853L))) {
                            HashMap map = AbstractC0999XA.f3193a;
                            c0276Gb.setSelectedColor(C1517hw.m2889a(0, AbstractC0295Gu.m625r(-22613002811445L)));
                            c0276Gb.setUnselectedColor(C1517hw.m2889a(0, AbstractC0295Gu.m625r(-22810571307061L)));
                        }
                        listView.addHeaderView(c0276Gb);
                    }
                }
                return C0829TC.f2620a;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static String m1119g(boolean z) {
        if (z) {
            return AbstractC2453ra.m4901k0(f1874d, AbstractC0295Gu.m625r(-23124103919669L), null, null, new C0223F7(27), 30);
        }
        return AbstractC2453ra.m4901k0(f1874d, AbstractC0295Gu.m625r(-23098334115893L), null, null, new C0223F7(26), 30);
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        EnumC0319Hb enumC0319HbValueOf;
        Method method;
        C0276Gb.f894g.getClass();
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        try {
            enumC0319HbValueOf = EnumC0319Hb.valueOf(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496824636930101L), AbstractC0295Gu.m625r(-496974960785461L)));
        } catch (IllegalArgumentException unused) {
            enumC0319HbValueOf = EnumC0319Hb.f1047b;
        }
        f1873c = enumC0319HbValueOf;
        Field field = null;
        if (AbstractC1257cG.m2378f() == null) {
            m1118f(false);
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586834266552373L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            C1538iG c1538iG = new C1538iG(obj instanceof Class ? (Class) obj : null);
            C0223F7 c0223f7 = new C0223F7(24);
            AbstractC0295Gu.m625r(-576599359486005L);
            c1538iG.f5425g = c0223f7;
            c1538iG.m2924i(Cursor.class);
            c1538iG.m2917b(new C0223F7(25));
            return;
        }
        int i = 1;
        m1118f(true);
        Method[] declaredMethods = AbstractC1257cG.m2378f().getDeclaredMethods();
        AbstractC0295Gu.m625r(-24897925412917L);
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i2];
            if (method.getParameterTypes().length == 1 && AbstractC0585Nj.m1134a(method.getParameterTypes()[0], Integer.TYPE) && !AbstractC0585Nj.m1134a(method.getReturnType(), Object.class)) {
                break;
            } else {
                i2++;
            }
        }
        Class<?> returnType = method != null ? method.getReturnType() : null;
        Field[] declaredFields = AbstractC1257cG.m2378f().getDeclaredFields();
        AbstractC0295Gu.m625r(-25001004628021L);
        int length2 = declaredFields.length;
        int i3 = 0;
        loop1: while (true) {
            if (i3 >= length2) {
                break;
            }
            Field field2 = declaredFields[i3];
            Class<?> type = field2.getType();
            Field[] declaredFields2 = type.getDeclaredFields();
            AbstractC0295Gu.m625r(-23450521434165L);
            int length3 = declaredFields2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    break;
                }
                if (AbstractC0585Nj.m1134a(declaredFields2[i4].getType(), SparseArray.class)) {
                    Field[] declaredFields3 = type.getDeclaredFields();
                    AbstractC0295Gu.m625r(-23549305681973L);
                    for (Field field3 : declaredFields3) {
                        if (AbstractC0585Nj.m1134a(field3.getType(), HashMap.class)) {
                            field = field2;
                            break loop1;
                        }
                    }
                } else {
                    i4++;
                }
            }
            i3++;
        }
        if (field == null) {
            return;
        }
        C1538iG c1538iG2 = new C1538iG(field.getType());
        c1538iG2.m2922g(List.class);
        c1538iG2.m2917b(new C0352I7(i, returnType));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-24193550776373L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context context) {
        AbstractC0295Gu.m625r(-24305219926069L);
        ArrayList arrayList = new ArrayList(super.mo1096d(context));
        C2748yA c2748yA = new C2748yA(context);
        c2748yA.setTitle(AbstractC0295Gu.m625r(-24339579664437L));
        c2748yA.setSummary(AbstractC0295Gu.m625r(-24373939402805L));
        c2748yA.m5330a();
        c2748yA.setOnClickListener(new ViewOnClickListenerC0362Ib(context, 1));
        arrayList.add(c2748yA);
        C2748yA c2748yA2 = new C2748yA(context);
        c2748yA2.setTitle(AbstractC0295Gu.m625r(-24416889075765L));
        c2748yA2.setSummary(AbstractC0295Gu.m625r(-24451248814133L));
        c2748yA2.m5330a();
        c2748yA2.setOnClickListener(new ViewOnClickListenerC0362Ib(context, 0));
        arrayList.add(c2748yA2);
        return arrayList;
    }
}
