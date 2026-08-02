package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq1 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kj1.j(zj2):java.lang.Object] */
    public /* synthetic */ eq1(kj1 kj1Var) {
        this.h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) throws IllegalAccessException {
        Class cls;
        Object obj2;
        String strK;
        String str;
        int i = this.h;
        lt2Var = null;
        lt2 lt2Var = null;
        Object obj3 = null;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ki2 ki2Var = (ki2) obj;
                ki2Var.getClass();
                String str2 = ki2Var.a;
                if (!str2.equals("text")) {
                    throw new fi2("NOT_SUPPORTED", vi0.j("The '", str2, "' message segment is not supported by WeChat yet."), 8, false);
                }
                Object obj4 = ki2Var.b.get("text");
                i41 i41Var = obj4 instanceof i41 ? (i41) obj4 : null;
                if (i41Var == null || !i41Var.b()) {
                    throw new fi2("INVALID_ARGUMENT", "Text segments must contain a string text field.", 8, false);
                }
                return i41Var.a();
            case 1:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.c = false;
                return a83Var;
            case 2:
                ff2 ff2Var = (ff2) obj;
                ff2Var.getClass();
                String str3 = ff2Var.a.h;
                String str4 = ff2Var.b;
                return str3 + "=" + (str4 != null ? str4 : "");
            case 3:
                zf2 zf2Var = (zf2) obj;
                zf2Var.getClass();
                return zf2Var.c;
            case 4:
                zf2 zf2Var2 = (zf2) obj;
                zf2Var2.getClass();
                return zf2Var2.c;
            case 5:
                yy1 yy1Var = (yy1) obj;
                int i2 = p9.a;
                tu2 tu2Var = r7.b;
                yy1Var.getClass();
                Context context = (Context) op0.w(yy1Var, tu2Var);
                e70 e70Var = (e70) op0.w(yy1Var, ly.h);
                vv1 vv1Var = (vv1) op0.w(yy1Var, wv1.a);
                if (vv1Var == null) {
                    return null;
                }
                return new t8(context, e70Var, vv1Var.a, vv1Var.b);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj5 = jg3Var.a.thisObject;
                if (obj5 != null) {
                    sg1 sg1VarV = op0.y(obj5).v();
                    cls = View.class;
                    Class<View> clsA = p40.A(d72.a(cls));
                    sg1VarV.C = clsA != null ? clsA : View.class;
                    sg1VarV.l = 0;
                    Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(new Object[0]);
                    View view = objG0 instanceof View ? (View) objG0 : null;
                    if (view != null) {
                        view.setOnLongClickListener(new c12());
                    }
                }
                return a83Var;
            case 7:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                Object obj6 = jg3Var2.a.thisObject;
                if (obj6 != null) {
                    Object objN0 = mg.n0(2, jg3Var2.a());
                    Integer num = objN0 instanceof Integer ? (Integer) objN0 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        hi0 hi0VarR = op0.y(obj6).r();
                        hi0VarR.g = SparseArray.class;
                        Object objG02 = ((pi0) du.o0(hi0VarR.c())).g0();
                        SparseArray sparseArray = objG02 instanceof SparseArray ? (SparseArray) objG02 : null;
                        if (sparseArray != null && (obj2 = sparseArray.get(iIntValue)) != null) {
                            f12.d.getClass();
                            String strK2 = f12.k(obj2);
                            if (strK2 != null) {
                                Iterator it = ld3.a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (((kd3) next).b.equals(strK2)) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                kd3 kd3Var = (kd3) obj3;
                                if (kd3Var != null) {
                                    kd3Var.c.a();
                                }
                            }
                        }
                    }
                }
                return a83Var;
            case 8:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                Object obj7 = jg3Var3.a.thisObject;
                if (obj7 != null) {
                    List<kd3> listF0 = du.F0(ld3.a);
                    if (!listF0.isEmpty()) {
                        Field[] declaredFields = obj7.getClass().getDeclaredFields();
                        declaredFields.getClass();
                        Field field = (Field) mg.l0(declaredFields);
                        if (field != null) {
                            ig1.a(field);
                            Object obj8 = field.get(obj7);
                            if (obj8 != null) {
                                hi0 hi0VarR2 = op0.y(obj8).r();
                                hi0VarR2.g = SparseArray.class;
                                Object objG03 = ((pi0) du.o0(hi0VarR2.c())).g0();
                                SparseArray sparseArray2 = objG03 instanceof SparseArray ? (SparseArray) objG03 : null;
                                if (sparseArray2 != null && sparseArray2.size() != 0) {
                                    f12.d.getClass();
                                    HashSet hashSet = new HashSet();
                                    int size = sparseArray2.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        Object objValueAt = sparseArray2.valueAt(i3);
                                        if (objValueAt != null && (strK = f12.k(objValueAt)) != null) {
                                            hashSet.add(strK);
                                        }
                                    }
                                    Class<?> cls2 = sparseArray2.valueAt(0).getClass();
                                    Class<?> cls3 = cls2.getDeclaredConstructors()[0].getParameterTypes()[0];
                                    for (kd3 kd3Var2 : listF0) {
                                        int i4 = kd3Var2.a;
                                        String str5 = kd3Var2.b;
                                        if (!hashSet.contains(str5)) {
                                            cls3.getClass();
                                            sparseArray2.append(sparseArray2.size(), dt.c(cls2, new Object[]{dt.c(cls3, new Object[]{Integer.valueOf(i4), str5, "", Integer.valueOf(R.drawable.ic_github_mark_24), 0})}));
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
                cj0Var.t = mg.t0(new String[]{"com.tencent.mm.ui"});
                at atVar = new at();
                atVar.d0("compatCallBack", "com/tencent/mm/ui/PlusSubMenuHelper");
                cj0Var.u = atVar;
                return a83Var;
            case 10:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.t = mg.t0(new String[]{"com.tencent.mm.ui"});
                at atVar2 = new at();
                atVar2.d0("goto native hk offlinepay");
                cj0Var2.u = atVar2;
                return a83Var;
            case 11:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Object obj9 = jg3Var4.a()[1];
                obj9.getClass();
                ((List) obj9).add(0, dt.c(up0.H("com.tencent.widget.PopupMenuDialog$MenuItem"), new Object[]{1145, "Nuke", "QQ enhancement", Integer.valueOf(R.drawable.ic_github_mark_24)}));
                return a83Var;
            case 12:
                jg3 jg3Var5 = (jg3) obj;
                jg3Var5.getClass();
                Object obj10 = jg3Var5.a()[0];
                obj10.getClass();
                if (((View) obj10).getId() == 1145) {
                    Activity activity = up0.k;
                    if (activity == null) {
                        t11.S("hostAct");
                        throw null;
                    }
                    Activity activity2 = up0.k;
                    if (activity2 == null) {
                        t11.S("hostAct");
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
                p51Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                p51Var.a(fValueOf, 300).b = mi1.a;
                p51Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                p51Var.a(fValueOf2, 1800);
                p51Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                p51Var.a(fValueOf3, 3300);
                p51Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                p51Var.a(fValueOf4, 4800);
                p51Var.a(fValueOf4, 6000);
                return a83Var;
            case 15:
                s32 s32Var = s32.c;
                v41[] v41VarArr = xn2.a;
                yn2 yn2Var = vn2.c;
                v41 v41Var = xn2.a[1];
                ((zn2) obj).a(yn2Var, s32Var);
                return a83Var;
            case 16:
                gf2 gf2Var = (gf2) obj;
                gf2Var.getClass();
                String str6 = gf2Var.a;
                String str7 = gf2Var.b;
                if (str6 == null) {
                    return str7;
                }
                return str6 + ": " + str7;
            case 17:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                at atVar3 = new at();
                atVar3.d0("DB has been closed :[%s]");
                cj0Var3.u = atVar3;
                return a83Var;
            case 18:
                at atVar4 = (at) obj;
                atVar4.getClass();
                atVar4.c0("MicroMsg.SqliteDB", "sql is null ");
                return a83Var;
            case 19:
                cj0 cj0Var4 = (cj0) obj;
                cj0Var4.getClass();
                cj0Var4.c0(new eq1(18));
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new dc2((Map) obj);
            case 21:
                return obj;
            case 22:
                obj.getClass();
                List list = (List) obj;
                Object obj11 = list.get(0);
                in0 in0Var = (in0) bd2.h.j;
                Boolean bool = Boolean.FALSE;
                lt2 lt2Var2 = (t11.l(obj11, bool) || obj11 == null) ? null : (lt2) in0Var.j(obj11);
                Object obj12 = list.get(1);
                lt2 lt2Var3 = (t11.l(obj12, bool) || obj12 == null) ? null : (lt2) in0Var.j(obj12);
                Object obj13 = list.get(2);
                lt2 lt2Var4 = (t11.l(obj13, bool) || obj13 == null) ? null : (lt2) in0Var.j(obj13);
                Object obj14 = list.get(3);
                if (!t11.l(obj14, bool) && obj14 != null) {
                    lt2Var = (lt2) in0Var.j(obj14);
                }
                return new b13(lt2Var2, lt2Var3, lt2Var4, lt2Var);
            case 23:
                obj.getClass();
                List list2 = (List) obj;
                Object obj15 = list2.get(1);
                List list3 = (t11.l(obj15, Boolean.FALSE) || obj15 == null) ? null : (List) ((in0) bd2.a.j).j(obj15);
                Object obj16 = list2.get(0);
                String str8 = obj16 != null ? (String) obj16 : null;
                str8.getClass();
                return new sd(list3, str8);
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
                q13[] q13VarArr = p13.b;
                in0 in0Var2 = bd2.v.i;
                Boolean bool2 = Boolean.FALSE;
                t11.l(obj17, bool2);
                p13 p13Var = obj17 != null ? (p13) in0Var2.j(obj17) : null;
                p13Var.getClass();
                long j = p13Var.a;
                Object obj18 = list5.get(1);
                t11.l(obj18, bool2);
                p13 p13Var2 = obj18 != null ? (p13) in0Var2.j(obj18) : null;
                p13Var2.getClass();
                return new n03(j, p13Var2.a);
            case 27:
                obj.getClass();
                return new im0(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new xj(((Float) obj).floatValue());
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
                return new f13(fg1.i(iIntValue2, num3.intValue()));
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bd2.<clinit>():void, d12.a(org.luckypray.dexkit.DexKitBridge):void, dc2.<clinit>():void, e12.a(org.luckypray.dexkit.DexKitBridge):void, eq1.j(java.lang.Object):java.lang.Object, f12.g():void, kj1.<init>(java.io.File, int):void, op0.<clinit>():void, rb2.a(org.luckypray.dexkit.DexKitBridge):void, rp0.b0(th2):java.lang.String, s11.<clinit>():void, sb2.a(org.luckypray.dexkit.DexKitBridge):void, yr.e(zq, boolean, xm0, xm0, in0, px, int):void] */
    public /* synthetic */ eq1(int i) {
        this.h = i;
    }
}
