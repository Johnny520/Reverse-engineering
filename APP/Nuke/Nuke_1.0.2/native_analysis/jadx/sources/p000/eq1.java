package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2561h;

    public /* synthetic */ eq1(kj1 kj1Var) {
        this.f2561h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) throws IllegalAccessException {
        Class cls;
        Object obj2;
        String strM1491k;
        String str;
        int i = this.f2561h;
        lt2Var = null;
        lt2 lt2Var = null;
        Object obj3 = null;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj;
                ki2Var.getClass();
                String str2 = ki2Var.f5586a;
                if (!str2.equals("text")) {
                    throw new fi2("NOT_SUPPORTED", vi0.m5691j("The '", str2, "' message segment is not supported by WeChat yet."), 8, false);
                }
                Object obj4 = ki2Var.f5587b.get("text");
                i41 i41Var = obj4 instanceof i41 ? (i41) obj4 : null;
                if (i41Var == null || !i41Var.mo2264b()) {
                    throw new fi2("INVALID_ARGUMENT", "Text segments must contain a string text field.", 8, false);
                }
                return i41Var.mo2263a();
            case 1:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.f1849c = false;
                return a83Var;
            case 2:
                ff2 ff2Var = (ff2) obj;
                ff2Var.getClass();
                String str3 = ff2Var.f2951a.f2431h;
                String str4 = ff2Var.f2952b;
                return str3 + "=" + (str4 != null ? str4 : "");
            case 3:
                zf2 zf2Var = (zf2) obj;
                zf2Var.getClass();
                return zf2Var.f13878c;
            case 4:
                zf2 zf2Var2 = (zf2) obj;
                zf2Var2.getClass();
                return zf2Var2.f13878c;
            case 5:
                yy1 yy1Var = (yy1) obj;
                int i2 = AbstractC0572p9.f8042a;
                tu2 tu2Var = AbstractC0646r7.f9411b;
                yy1Var.getClass();
                Context context = (Context) op0.m3600w(yy1Var, tu2Var);
                e70 e70Var = (e70) op0.m3600w(yy1Var, AbstractC0441ly.f6382h);
                vv1 vv1Var = (vv1) op0.m3600w(yy1Var, wv1.f12690a);
                if (vv1Var == null) {
                    return null;
                }
                return new C0725t8(context, e70Var, vv1Var.f12188a, vv1Var.f12189b);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj5 = jg3Var.f5028a.thisObject;
                if (obj5 != null) {
                    sg1 sg1VarM3244v = op0.m3602y(obj5).m3244v();
                    cls = View.class;
                    Class<View> clsM3691A = p40.m3691A(d72.m967a(cls));
                    sg1VarM3244v.f10113C = clsM3691A != null ? clsM3691A : View.class;
                    sg1VarM3244v.f10120l = 0;
                    Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(new Object[0]);
                    View view = objM6415g0 instanceof View ? (View) objM6415g0 : null;
                    if (view != null) {
                        view.setOnLongClickListener(new c12());
                    }
                }
                return a83Var;
            case 7:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                Object obj6 = jg3Var2.f5028a.thisObject;
                if (obj6 != null) {
                    Object objM3099n0 = AbstractC0460mg.m3099n0(2, jg3Var2.m2496a());
                    Integer num = objM3099n0 instanceof Integer ? (Integer) objM3099n0 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        hi0 hi0VarM3241r = op0.m3602y(obj6).m3241r();
                        hi0VarM3241r.f4030g = SparseArray.class;
                        Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
                        SparseArray sparseArray = objM3867g0 instanceof SparseArray ? (SparseArray) objM3867g0 : null;
                        if (sparseArray != null && (obj2 = sparseArray.get(iIntValue)) != null) {
                            f12.f2735d.getClass();
                            String strM1491k2 = f12.m1491k(obj2);
                            if (strM1491k2 != null) {
                                Iterator it = ld3.f6074a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (((kd3) next).f5476b.equals(strM1491k2)) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                kd3 kd3Var = (kd3) obj3;
                                if (kd3Var != null) {
                                    kd3Var.f5477c.mo6a();
                                }
                            }
                        }
                    }
                }
                return a83Var;
            case 8:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                Object obj7 = jg3Var3.f5028a.thisObject;
                if (obj7 != null) {
                    List<kd3> listM1148F0 = AbstractC0142du.m1148F0(ld3.f6074a);
                    if (!listM1148F0.isEmpty()) {
                        Field[] declaredFields = obj7.getClass().getDeclaredFields();
                        declaredFields.getClass();
                        Field field = (Field) AbstractC0460mg.m3097l0(declaredFields);
                        if (field != null) {
                            ig1.m2344a(field);
                            Object obj8 = field.get(obj7);
                            if (obj8 != null) {
                                hi0 hi0VarM3241r2 = op0.m3602y(obj8).m3241r();
                                hi0VarM3241r2.f4030g = SparseArray.class;
                                Object objM3867g02 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r2.m2194c())).m3867g0();
                                SparseArray sparseArray2 = objM3867g02 instanceof SparseArray ? (SparseArray) objM3867g02 : null;
                                if (sparseArray2 != null && sparseArray2.size() != 0) {
                                    f12.f2735d.getClass();
                                    HashSet hashSet = new HashSet();
                                    int size = sparseArray2.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        Object objValueAt = sparseArray2.valueAt(i3);
                                        if (objValueAt != null && (strM1491k = f12.m1491k(objValueAt)) != null) {
                                            hashSet.add(strM1491k);
                                        }
                                    }
                                    Class<?> cls2 = sparseArray2.valueAt(0).getClass();
                                    Class<?> cls3 = cls2.getDeclaredConstructors()[0].getParameterTypes()[0];
                                    for (kd3 kd3Var2 : listM1148F0) {
                                        int i4 = kd3Var2.f5475a;
                                        String str5 = kd3Var2.f5476b;
                                        if (!hashSet.contains(str5)) {
                                            cls3.getClass();
                                            sparseArray2.append(sparseArray2.size(), AbstractC0141dt.m1142c(cls2, new Object[]{AbstractC0141dt.m1142c(cls3, new Object[]{Integer.valueOf(i4), str5, "", Integer.valueOf(R.drawable.ic_github_mark_24), 0})}));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return a83Var;
            case 9:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui"});
                C0030at c0030at = new C0030at();
                c0030at.m272d0("compatCallBack", "com/tencent/mm/ui/PlusSubMenuHelper");
                cj0Var.f1585u = c0030at;
                return a83Var;
            case 10:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui"});
                C0030at c0030at2 = new C0030at();
                c0030at2.m272d0("goto native hk offlinepay");
                cj0Var2.f1585u = c0030at2;
                return a83Var;
            case 11:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Object obj9 = jg3Var4.m2496a()[1];
                obj9.getClass();
                ((List) obj9).add(0, AbstractC0141dt.m1142c(up0.m5529H("com.tencent.widget.PopupMenuDialog$MenuItem"), new Object[]{1145, "Nuke", "QQ enhancement", Integer.valueOf(R.drawable.ic_github_mark_24)}));
                return a83Var;
            case 12:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object obj10 = jg3Var5.m2496a()[0];
                obj10.getClass();
                if (((View) obj10).getId() == 1145) {
                    Activity activity = up0.f11403k;
                    if (activity == null) {
                        t11.m5067S("hostAct");
                        throw null;
                    }
                    Activity activity2 = up0.f11403k;
                    if (activity2 == null) {
                        t11.m5067S("hostAct");
                        throw null;
                    }
                    activity.startActivity(new Intent(activity2, (Class<?>) HomeActivity.class));
                }
                return a83Var;
            case 13:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size2 = listQueryIntentActivities.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i5);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 14:
                p51 p51Var = (p51) obj;
                p51Var.f7980a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                p51Var.m3744a(fValueOf, 300).f7528b = mi1.f6655a;
                p51Var.m3744a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                p51Var.m3744a(fValueOf2, 1800);
                p51Var.m3744a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                p51Var.m3744a(fValueOf3, 3300);
                p51Var.m3744a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                p51Var.m3744a(fValueOf4, 4800);
                p51Var.m3744a(fValueOf4, 6000);
                return a83Var;
            case 15:
                s32 s32Var = s32.f9897c;
                v41[] v41VarArr = xn2.f13086a;
                yn2 yn2Var = vn2.f12060c;
                v41 v41Var = xn2.f13086a[1];
                ((zn2) obj).mo1533a(yn2Var, s32Var);
                return a83Var;
            case 16:
                gf2 gf2Var = (gf2) obj;
                gf2Var.getClass();
                String str6 = gf2Var.f3489a;
                String str7 = gf2Var.f3490b;
                if (str6 == null) {
                    return str7;
                }
                return str6 + ": " + str7;
            case 17:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                C0030at c0030at3 = new C0030at();
                c0030at3.m272d0("DB has been closed :[%s]");
                cj0Var3.f1585u = c0030at3;
                return a83Var;
            case 18:
                C0030at c0030at4 = (C0030at) obj;
                c0030at4.getClass();
                c0030at4.m271c0("MicroMsg.SqliteDB", "sql is null ");
                return a83Var;
            case 19:
                cj0 cj0Var4 = (cj0) obj;
                cj0Var4.getClass();
                cj0Var4.m845c0(new eq1(18));
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new dc2((Map) obj);
            case 21:
                return obj;
            case 22:
                obj.getClass();
                List list = (List) obj;
                Object obj11 = list.get(0);
                in0 in0Var = (in0) bd2.f799h.f2148j;
                Boolean bool = Boolean.FALSE;
                lt2 lt2Var2 = (t11.m5086l(obj11, bool) || obj11 == null) ? null : (lt2) in0Var.mo5j(obj11);
                Object obj12 = list.get(1);
                lt2 lt2Var3 = (t11.m5086l(obj12, bool) || obj12 == null) ? null : (lt2) in0Var.mo5j(obj12);
                Object obj13 = list.get(2);
                lt2 lt2Var4 = (t11.m5086l(obj13, bool) || obj13 == null) ? null : (lt2) in0Var.mo5j(obj13);
                Object obj14 = list.get(3);
                if (!t11.m5086l(obj14, bool) && obj14 != null) {
                    lt2Var = (lt2) in0Var.mo5j(obj14);
                }
                return new b13(lt2Var2, lt2Var3, lt2Var4, lt2Var);
            case 23:
                obj.getClass();
                List list2 = (List) obj;
                Object obj15 = list2.get(1);
                List list3 = (t11.m5086l(obj15, Boolean.FALSE) || obj15 == null) ? null : (List) ((in0) bd2.f792a.f2148j).mo5j(obj15);
                Object obj16 = list2.get(0);
                String str8 = obj16 != null ? (String) obj16 : null;
                str8.getClass();
                return new C0690sd(list3, str8);
            case 24:
                obj.getClass();
                return new gz2(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list4 = (List) obj;
                return new m03(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 26:
                obj.getClass();
                List list5 = (List) obj;
                Object obj17 = list5.get(0);
                q13[] q13VarArr = p13.f7927b;
                in0 in0Var2 = bd2.f813v.f162i;
                Boolean bool2 = Boolean.FALSE;
                t11.m5086l(obj17, bool2);
                p13 p13Var = obj17 != null ? (p13) in0Var2.mo5j(obj17) : null;
                p13Var.getClass();
                long j = p13Var.f7929a;
                Object obj18 = list5.get(1);
                t11.m5086l(obj18, bool2);
                p13 p13Var2 = obj18 != null ? (p13) in0Var2.mo5j(obj18) : null;
                p13Var2.getClass();
                return new n03(j, p13Var2.f7929a);
            case 27:
                obj.getClass();
                return new im0(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new C0888xj(((Float) obj).floatValue());
            default:
                obj.getClass();
                List list6 = (List) obj;
                Object obj19 = list6.get(0);
                Integer num2 = obj19 != null ? (Integer) obj19 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj20 = list6.get(1);
                Integer num3 = obj20 != null ? (Integer) obj20 : null;
                num3.getClass();
                return new f13(fg1.m1636i(iIntValue2, num3.intValue()));
        }
    }

    public /* synthetic */ eq1(int i) {
        this.f2561h = i;
    }
}
