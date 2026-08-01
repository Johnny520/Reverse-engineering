package p000A;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.AbstractC1926h;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import nuke.p209ui.HomeActivity;
import p010B3.AbstractC0222a;
import p010B3.InstrumentationC0229h;
import p011B4.AbstractC0231b;
import p015C2.C0242b;
import p015C2.C0243c;
import p016C3.C0245b;
import p021D3.C0274k;
import p021D3.RunnableC0269f;
import p026E3.C0285a;
import p028F.MenuItemOnMenuItemClickListenerC0362w;
import p028F.RunnableC0346g;
import p044H3.AbstractC0646a;
import p056K2.C0887m;
import p056K2.C0891q;
import p058L.AbstractC0907I;
import p058L.C0911M;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p066M3.C1005a;
import p066M3.C1006b;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p081Q.AbstractC1159b;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p115X0.C1630e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p121Y1.C1753n;
import p128a.AbstractC1785a;
import p137b3.InterfaceC1855c;
import p149d3.AbstractC1976d;
import p203n.C2618A;
import p203n.C2665l;
import p204n0.C2683b;
import p227r.EnumC2983d0;
import p243t4.C3221a;
import p243t4.C3223c;
import p243t4.C3224d;
import p243t4.C3225e;
import p243t4.C3226f;
import p243t4.C3227g;
import p243t4.C3228h;
import p243t4.C3229i;
import p243t4.C3230j;
import p243t4.C3231k;
import p249u4.C3346a;
import p249u4.C3347b;
import p263x2.AbstractC3448a;
import p269y2.C3491a;
import p269y2.C3492b;
import p271y4.AbstractC3501c;
import p275z2.C3516b;
import p277z4.C3526d;

/* JADX INFO: renamed from: A.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0071l implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f305d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.O0.<clinit>():void, A.n.h(java.lang.Object):java.lang.Object, A.o0.<init>(A.u0, T.t0, I0.N0):void, D3.k.g():java.lang.String, G2.a.f(h0.p, boolean, java.lang.String, W2.f, b0.e, T.m, int):void, J.u.<init>(android.view.View, J.a, J.n):void, L.I.<clinit>():void, L.W.<init>(A.U0):void, M3.b.a(org.luckypray.dexkit.DexKitBridge):void, M3.b.d():void, P.S.b(W2.a, h0.p, boolean, o0.M, P.k, P.S, u.U, b0.e, T.m, int):void] */
    public /* synthetic */ C0071l(int i5) {
        this.f305d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06dc  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        String str;
        C3230j c3230j;
        int i5 = this.f305d;
        Class cls = Integer.TYPE;
        Class cls2 = Void.TYPE;
        int i6 = 2;
        int i7 = 1;
        C0891q c0891q = C0891q.f2780a;
        int i8 = 0;
        switch (i5) {
            case 0:
                int i9 = AbstractC0079p.f363a;
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                return c0891q;
            case 2:
                C0911M c0911m = (C0911M) obj;
                String str2 = c0911m.f2835g.f4563e;
                long j5 = c0911m.f2834f;
                int i10 = C1259L.f4537c;
                int i11 = (int) (j5 & 4294967295L);
                int iOffsetByCodePoints = (i11 > 0 && i11 > 0) ? Character.offsetByCodePoints(str2, i11, -1) : -1;
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C1630e(((int) (c0911m.f2834f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 3:
                C0911M c0911m2 = (C0911M) obj;
                String str3 = c0911m2.f2835g.f4563e;
                long j6 = c0911m2.f2834f;
                int i12 = C1259L.f4537c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str3);
                int iFollowing = characterInstance.following((int) (j6 & 4294967295L));
                if (iFollowing != -1) {
                    return new C1630e(0, iFollowing - ((int) (c0911m2.f2834f & 4294967295L)));
                }
                return null;
            case 4:
                C0911M c0911m3 = (C0911M) obj;
                Integer numM1911e = c0911m3.m1911e();
                if (numM1911e == null) {
                    return null;
                }
                int iIntValue = numM1911e.intValue();
                long j7 = c0911m3.f2834f;
                int i13 = C1259L.f4537c;
                return new C1630e(((int) (j7 & 4294967295L)) - iIntValue, 0);
            case 5:
                C0911M c0911m4 = (C0911M) obj;
                Integer numM1910d = c0911m4.m1910d();
                if (numM1910d == null) {
                    return null;
                }
                int iIntValue2 = numM1910d.intValue();
                long j8 = c0911m4.f2834f;
                int i14 = C1259L.f4537c;
                return new C1630e(0, iIntValue2 - ((int) (j8 & 4294967295L)));
            case 6:
                C0911M c0911m5 = (C0911M) obj;
                Integer numM1909c = c0911m5.m1909c();
                if (numM1909c == null) {
                    return null;
                }
                int iIntValue3 = numM1909c.intValue();
                long j9 = c0911m5.f2834f;
                int i15 = C1259L.f4537c;
                return new C1630e(((int) (j9 & 4294967295L)) - iIntValue3, 0);
            case 7:
                C0911M c0911m6 = (C0911M) obj;
                Integer numM1908b = c0911m6.m1908b();
                if (numM1908b == null) {
                    return null;
                }
                int iIntValue4 = numM1908b.intValue();
                long j10 = c0911m6.f2834f;
                int i16 = C1259L.f4537c;
                return new C1630e(0, iIntValue4 - ((int) (j10 & 4294967295L)));
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                EnumC2983d0 enumC2983d0 = ((Boolean) obj2).booleanValue() ? EnumC2983d0.f9447d : EnumC2983d0.f9448e;
                Object obj3 = list.get(0);
                AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C0029O0(enumC2983d0, ((Float) obj3).floatValue());
            case 9:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i17);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 10:
                C0285a c0285a = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a, "$this$after");
                Object objM3528e = AbstractC1925g.m3528e(c0285a, 0);
                AbstractC1665j.m2982b(objM3528e);
                Context context2 = (Application) objM3528e;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context2;
                }
                AbstractC1785a.f6095a = applicationContext;
                ClassLoader classLoader = context2.getClassLoader();
                AbstractC1665j.m2984d(classLoader, "getClassLoader(...)");
                AbstractC1785a.f6096b = classLoader;
                String str4 = AbstractC1785a.f6098d;
                if (str4 == null) {
                    AbstractC1665j.m2991k("moduleApkPath");
                    throw null;
                }
                Resources resources = context2.getResources();
                AbstractC1665j.m2984d(resources, "getResources(...)");
                AbstractC1926h.m3561d(resources, str4);
                C0887m c0887m = C0274k.f881a;
                C0274k.m480w(C0274k.m460c());
                return c0891q;
            case 11:
                C0285a c0285a2 = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a2, "$this$after");
                Object obj4 = c0285a2.f913a.thisObject;
                AbstractC1665j.m2983c(obj4, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) obj4;
                AbstractC1785a.f6097c = activity;
                Context applicationContext2 = activity.getApplicationContext();
                if (applicationContext2 == null) {
                    applicationContext2 = activity;
                }
                AbstractC1785a.f6095a = applicationContext2;
                ClassLoader classLoader2 = activity.getClassLoader();
                AbstractC1665j.m2984d(classLoader2, "getClassLoader(...)");
                AbstractC1785a.f6096b = classLoader2;
                if (AbstractC1785a.f6098d == null) {
                    AbstractC1665j.m2991k("moduleApkPath");
                    throw null;
                }
                if (AbstractC0222a.f770b != 0) {
                    AbstractC0222a.f770b = R.string.app_name;
                }
                AbstractC0222a.f774f = activity.getClassLoader();
                AbstractC0222a.f773e = AbstractC0222a.class.getClassLoader();
                AbstractC0222a.f771c = activity;
                try {
                    AbstractC0222a.f772d = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 1).activities[0].name;
                    if (!AbstractC0222a.f769a.getAndSet(true)) {
                        try {
                            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                            declaredField.setAccessible(true);
                            Object obj5 = declaredField.get(null);
                            Field declaredField2 = obj5.getClass().getDeclaredField("mInstrumentation");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj5, new InstrumentationC0229h((Instrumentation) declaredField2.get(obj5)));
                            AbstractC0222a.m325a(obj5);
                            AbstractC0222a.m326b();
                            try {
                                AbstractC0222a.m327c();
                                break;
                            } catch (Exception unused) {
                            }
                        } catch (Exception e5) {
                            throw new RuntimeException(e5);
                        }
                    }
                    if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI") || activity.getClass().getName().equals("com.tencent.mobileqq.activity.SplashActivity") || activity.getClass().getName().equals("com.ss.android.ugc.aweme.main.MainActivity")) {
                        int i18 = 0;
                        if (C0274k.f884d.compareAndSet(false, true)) {
                            C0887m c0887m2 = C0274k.f881a;
                            AbstractC0646a[] abstractC0646aArrM460c = C0274k.m460c();
                            C0274k.m480w(abstractC0646aArrM460c);
                            Thread thread = new Thread(new RunnableC0269f(abstractC0646aArrM460c, i18));
                            thread.setName("NukeInit");
                            thread.setDaemon(true);
                            thread.start();
                        }
                    }
                    return c0891q;
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new RuntimeException(e6);
                }
            case 12:
                AbstractC0646a abstractC0646a = (AbstractC0646a) obj;
                AbstractC1665j.m2985e(abstractC0646a, "hooker");
                return abstractC0646a.mo1118c() + ":" + abstractC0646a.getClass().getName();
            case 13:
                C2618A c2618a = (C2618A) obj;
                AbstractC1665j.m2985e(c2618a, "$this$keyframes");
                c2618a.f8325a = 150;
                c2618a.m4571a(Float.valueOf(1.0f), 0);
                c2618a.m4571a(Float.valueOf(1.018f), 45);
                c2618a.m4571a(Float.valueOf(0.92f), 150);
                return c0891q;
            case 14:
                C2618A c2618a2 = (C2618A) obj;
                AbstractC1665j.m2985e(c2618a2, "$this$keyframes");
                c2618a2.f8325a = 160;
                c2618a2.m4571a(Float.valueOf(0.0f), 0);
                Float fValueOf = Float.valueOf(1.0f);
                c2618a2.m4571a(fValueOf, 80);
                c2618a2.m4571a(fValueOf, 160);
                return c0891q;
            case 15:
                C2618A c2618a3 = (C2618A) obj;
                AbstractC1665j.m2985e(c2618a3, "$this$keyframes");
                c2618a3.f8325a = 300;
                c2618a3.m4571a(Float.valueOf(0.94f), 0);
                c2618a3.m4571a(Float.valueOf(1.025f), 110);
                c2618a3.m4571a(Float.valueOf(0.995f), 210);
                c2618a3.m4571a(Float.valueOf(1.0f), 300);
                return c0891q;
            case 16:
                C2618A c2618a4 = (C2618A) obj;
                AbstractC1665j.m2985e(c2618a4, "$this$keyframes");
                c2618a4.f8325a = 150;
                c2618a4.m4571a(Float.valueOf(1.0f), 0);
                c2618a4.m4571a(Float.valueOf(1.012f), 45);
                c2618a4.m4571a(Float.valueOf(0.94f), 150);
                return c0891q;
            case 17:
                C2618A c2618a5 = (C2618A) obj;
                AbstractC1665j.m2985e(c2618a5, "$this$keyframes");
                c2618a5.f8325a = 300;
                c2618a5.m4571a(Float.valueOf(0.92f), 0);
                c2618a5.m4571a(Float.valueOf(1.04f), 110);
                c2618a5.m4571a(Float.valueOf(0.99f), 210);
                c2618a5.m4571a(Float.valueOf(1.0f), 300);
                return c0891q;
            case 18:
                return c0891q;
            case 19:
                return c0891q;
            case 20:
                C2683b c2683b = (C2683b) obj;
                long j11 = c2683b.f8556a;
                return (9223372034707292159L & j11) != 9205357640488583168L ? new C2665l(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (c2683b.f8556a & 4294967295L))) : AbstractC0907I.f2820a;
            case 21:
                C2665l c2665l = (C2665l) obj;
                return new C2683b((((long) Float.floatToRawIntBits(c2665l.f8486a)) << 32) | (((long) Float.floatToRawIntBits(c2665l.f8487b)) & 4294967295L));
            case 22:
                C0285a c0285a3 = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a3, "$this$after");
                Activity activity2 = AbstractC1785a.f6097c;
                if (activity2 != null) {
                    activity2.runOnUiThread(new RunnableC0346g(i6, c0285a3));
                    return c0891q;
                }
                AbstractC1665j.m2991k("hostAct");
                throw null;
            case 23:
                C0285a c0285a4 = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a4, "$this$after");
                XC_MethodHook.MethodHookParam methodHookParam = c0285a4.f913a;
                C1006b.f3118d.getClass();
                StringBuilder sb = new StringBuilder();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                AbstractC1665j.m2984d(stackTrace, "getStackTrace(...)");
                int length = stackTrace.length;
                int i19 = 0;
                while (i19 < length) {
                    sb.append(stackTrace[i19].toString());
                    sb.append("\n");
                    i19++;
                    i8 = i8;
                }
                int i20 = i8;
                String string = sb.toString();
                AbstractC1665j.m2984d(string, "toString(...)");
                if (AbstractC1976d.m3629W(string, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI.onCreate")) {
                    int i21 = AbstractC3448a.f10763a;
                    Object obj6 = methodHookParam.thisObject;
                    AbstractC1665j.m2982b(obj6);
                    C1753n c1753nM3507u = AbstractC1924f.m3507u(obj6);
                    C3491a c3491a = new C3491a();
                    c3491a.f10964a = (C3516b) c1753nM3507u.f6028e;
                    c3491a.f10868g = LinkedList.class;
                    C0242b c0242b = (C0242b) AbstractC0973m.m2012S(c3491a.m5750b());
                    Field field = c0242b.f813g;
                    Field field2 = field != null ? field : null;
                    if (field2 != null && !field2.isAccessible()) {
                        field2.setAccessible(true);
                    }
                    Object obj7 = field.get(c0242b.f855f);
                    AbstractC1665j.m2983c(obj7, "null cannot be cast to non-null type java.util.LinkedList<*>");
                    if (((LinkedList) obj7).size() != 1) {
                        Activity activity3 = AbstractC1785a.f6097c;
                        if (activity3 == null) {
                            AbstractC1665j.m2991k("hostAct");
                            throw null;
                        }
                        Object objNewInstance = AbstractC1924f.m3512z("com.tencent.mm.ui.base.preference.Preference").getDeclaredConstructor(Context.class).newInstance(activity3);
                        C3492b c3492bM3111E = AbstractC1924f.m3507u(objNewInstance).m3111E();
                        c3492bM3111E.f10869A = cls2;
                        Object[] objArrCopyOf = Arrays.copyOf(new Object[]{String.class}, 1);
                        ArrayList arrayList2 = c3492bM3111E.f10870g;
                        AbstractC1665j.m2985e(arrayList2, "<this>");
                        AbstractC1665j.m2985e(objArrCopyOf, "elements");
                        arrayList2.addAll(AbstractC0972l.m1987K(objArrCopyOf));
                        ((C0243c) AbstractC0973m.m2012S(c3492bM3111E.m5751b())).m446K("nuke_entry");
                        C1005a c1005a = C1005a.f3117e;
                        c1005a.getClass();
                        C0887m c0887m3 = C0274k.f881a;
                        C0245b c0245bM466i = C0274k.m466i();
                        String str5 = (String) c1005a.f1354d;
                        String strM449c = c0245bM466i.m449c(str5);
                        if (strM449c == null) {
                            strM449c = "";
                        }
                        if (strM449c.length() == 0) {
                            throw new AssertionError(AbstractC0231b.m400k("DexDesc ", str5, " not found in cache!"));
                        }
                        C3526d c3526d = new C3526d(strM449c);
                        ClassLoader classLoader3 = AbstractC1785a.f6096b;
                        if (classLoader3 == null) {
                            AbstractC1665j.m2991k("hostClassLoader");
                            throw null;
                        }
                        c3526d.m5774a(classLoader3, null).invoke(objNewInstance, "Nuke");
                        Object obj8 = methodHookParam.thisObject;
                        AbstractC1665j.m2982b(obj8);
                        Method[] declaredMethods = obj8.getClass().getDeclaredMethods();
                        AbstractC1665j.m2984d(declaredMethods, "getDeclaredMethods(...)");
                        int length2 = declaredMethods.length;
                        int i22 = i20;
                        while (true) {
                            if (i22 < length2) {
                                Method method = declaredMethods[i22];
                                if (method.getParameterCount() == 2 && AbstractC1665j.m2981a(method.getParameterTypes()[i20], AbstractC1924f.m3512z("com.tencent.mm.ui.base.preference.Preference")) && AbstractC1665j.m2981a(method.getParameterTypes()[1], cls)) {
                                    method.setAccessible(true);
                                    method.invoke(methodHookParam.thisObject, objNewInstance, Integer.valueOf(i20));
                                } else {
                                    i22++;
                                }
                            }
                        }
                    }
                }
                return c0891q;
            case 24:
                C0285a c0285a5 = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a5, "$this$before");
                Object objM3528e2 = AbstractC1925g.m3528e(c0285a5, 0);
                AbstractC1665j.m2982b(objM3528e2);
                Adapter adapter = ((AdapterView) objM3528e2).getAdapter();
                Integer num = (Integer) AbstractC1925g.m3528e(c0285a5, 2);
                int i23 = AbstractC3448a.f10763a;
                C3492b c3492bM3111E2 = AbstractC1924f.m3507u(adapter).m3111E();
                c3492bM3111E2.f10965b = "getItem";
                Object objM446K = ((C0243c) AbstractC0973m.m2012S(c3492bM3111E2.m5751b())).m446K(num);
                if (objM446K != null && "Nuke".equals(objM446K.toString())) {
                    Activity activity4 = AbstractC1785a.f6097c;
                    if (activity4 == null) {
                        AbstractC1665j.m2991k("hostAct");
                        throw null;
                    }
                    Activity activity5 = AbstractC1785a.f6097c;
                    if (activity5 == null) {
                        AbstractC1665j.m2991k("hostAct");
                        throw null;
                    }
                    activity4.startActivity(new Intent(activity5, (Class<?>) HomeActivity.class));
                    c0285a5.f913a.setResult((Object) null);
                }
                return c0891q;
            case 25:
                C0285a c0285a6 = (C0285a) obj;
                AbstractC1665j.m2985e(c0285a6, "$this$after");
                Object obj9 = c0285a6.f913a.thisObject;
                AbstractC1665j.m2983c(obj9, "null cannot be cast to non-null type android.app.Activity");
                Activity activity6 = (Activity) obj9;
                if (activity6.getClass().equals(AbstractC1924f.m3512z("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"))) {
                    C1006b c1006b = C1006b.f3118d;
                    MenuItemOnMenuItemClickListenerC0362w menuItemOnMenuItemClickListenerC0362w = new MenuItemOnMenuItemClickListenerC0362w(i7, activity6);
                    c1006b.getClass();
                    int i24 = AbstractC3448a.f10763a;
                    C3492b c3492bM3111E3 = AbstractC1924f.m3507u(activity6).m3111E();
                    c3492bM3111E3.f10965b = "addTextOptionMenu";
                    Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{AbstractC1676u.m2995a(cls), AbstractC1676u.m2995a(String.class), AbstractC1676u.m2995a(MenuItem.OnMenuItemClickListener.class)}, 3);
                    ArrayList arrayList3 = c3492bM3111E3.f10870g;
                    AbstractC1665j.m2985e(arrayList3, "<this>");
                    AbstractC1665j.m2985e(objArrCopyOf2, "elements");
                    arrayList3.addAll(AbstractC0972l.m1987K(objArrCopyOf2));
                    C3516b c3516b = c3492bM3111E3.f10964a;
                    if (c3516b != null) {
                        c3516b.f10963c = true;
                    }
                    ((C0243c) AbstractC0973m.m2012S(c3492bM3111E3.m5751b())).m446K(9999, "Nuke", menuItemOnMenuItemClickListenerC0362w);
                }
                return c0891q;
            case 26:
                C3229i c3229i = (C3229i) obj;
                AbstractC1665j.m2985e(c3229i, "$this$matcher");
                ArrayList arrayList4 = new ArrayList(1);
                Number number = new Number[]{0}[0];
                C3347b c3347b = new C3347b();
                AbstractC1665j.m2985e(number, "number");
                if (number instanceof Byte) {
                    c3347b.f10406a = new C3223c(number.byteValue());
                    c3347b.f10407b = 1;
                } else if (number instanceof Short) {
                    c3347b.f10406a = new C3228h(number.shortValue());
                    c3347b.f10407b = 2;
                } else if (number instanceof Integer) {
                    c3347b.f10406a = new C3226f(number.intValue());
                    c3347b.f10407b = 3;
                } else if (number instanceof Long) {
                    c3347b.f10406a = new C3227g(number.longValue());
                    c3347b.f10407b = 4;
                } else if (number instanceof Float) {
                    c3347b.f10406a = new C3225e(number.floatValue());
                    c3347b.f10407b = 5;
                } else if (number instanceof Double) {
                    c3347b.f10406a = new C3224d(number.doubleValue());
                    c3347b.f10407b = 6;
                }
                arrayList4.add(c3347b);
                c3229i.f10017d = AbstractC0973m.m2026g0(arrayList4);
                AbstractC1665j.m2984d(cls2, "TYPE");
                C3221a c3221a = new C3221a();
                C3221a.m5493K(c3221a, AbstractC3501c.m5754b(cls2));
                c3229i.f10015b = c3221a;
                if (c3229i.f10016c == null) {
                    c3229i.f10016c = new C3231k();
                }
                C3231k c3231k = c3229i.f10016c;
                AbstractC1665j.m2982b(c3231k);
                c3231k.f10020c = new C3346a();
                C3231k c3231k2 = new C3231k();
                c3231k2.f10019b = AbstractC0973m.m2026g0(C0981u.f3047d);
                Class cls3 = new Class[]{CharSequence.class}[0];
                if (cls3 != null) {
                    c3230j = new C3230j();
                    C3221a c3221a2 = new C3221a();
                    C3221a.m5493K(c3221a2, AbstractC3501c.m5754b(cls3));
                    c3230j.f10018b = c3221a2;
                } else {
                    c3230j = null;
                }
                List arrayList5 = c3231k2.f10019b;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                c3231k2.f10019b = arrayList5;
                arrayList5.add(c3230j);
                c3229i.f10016c = c3231k2;
                return c0891q;
            case 27:
                AbstractC1134u.m2189b((InterfaceC1136w) obj, 0);
                return c0891q;
            case 28:
                InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
                C1135v c1135v = AbstractC1132s.f3749l;
                InterfaceC1855c interfaceC1855c = AbstractC1134u.f3766a[5];
                ((InterfaceC1136w) obj).mo1128a(c1135v, Boolean.TRUE);
                return c0891q;
            default:
                float f2 = AbstractC1159b.f3801a;
                return c0891q;
        }
    }
}
