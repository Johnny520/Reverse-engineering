package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.github.cherrywechat.HookEntry;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.theme.ThemeProvider;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.luckypray.dexkit.DexKitBridge;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Qk */
/* JADX INFO: loaded from: classes.dex */
public final class C0715Qk extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HookEntry f2299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XC_LoadPackage.LoadPackageParam f2300b;

    public C0715Qk(HookEntry hookEntry, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f2299a = hookEntry;
        this.f2300b = loadPackageParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x063b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, InvocationTargetException {
        String str;
        super.afterHookedMethod(methodHookParam);
        Object obj = methodHookParam != null ? methodHookParam.thisObject : null;
        AbstractC0295Gu.m625r(-509975826790453L);
        Application application = (Application) obj;
        String name = AbstractC1450gG.f5069c.getClass().getName();
        AbstractC0295Gu.m625r(-509688063981621L);
        final int i = 0;
        if (!AbstractC2564tz.m5051L(name, AbstractC0295Gu.m625r(-509743898556469L), false)) {
            ClassLoader classLoader = application.getClassLoader();
            AbstractC0295Gu.m625r(-509778258294837L);
            AbstractC0295Gu.m625r(-578454785357877L);
            AbstractC1450gG.f5069c = classLoader;
        }
        C1456gf.f5172p = application;
        XC_LoadPackage.LoadPackageParam loadPackageParam = this.f2300b;
        String str2 = loadPackageParam.processName;
        AbstractC0295Gu.m625r(-509864157640757L);
        ApplicationInfo applicationInfo = loadPackageParam.appInfo;
        AbstractC0295Gu.m625r(-508266429806645L);
        AbstractC0295Gu.m625r(-579275124111413L);
        AbstractC0295Gu.m625r(-579326663718965L);
        AbstractC0295Gu.m625r(-579172044896309L);
        AbstractC1450gG.f5071e = str2;
        AbstractC0295Gu.m625r(-579240764373045L);
        AbstractC1450gG.f5072f = applicationInfo;
        Context contextCurrentApplication = MainApplication.f5549a;
        if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
            contextCurrentApplication = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        PackageInfo packageInfo = contextCurrentApplication.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        AbstractC1450gG.f5067a = (int) packageInfo.getLongVersionCode();
        String str3 = packageInfo.versionName;
        AbstractC0295Gu.m625r(-578420425619509L);
        AbstractC1450gG.f5068b = str3;
        Method declaredMethod = AssetManager.class.getDeclaredMethod(AbstractC0295Gu.m625r(-578983066335285L), String.class);
        final int i2 = 1;
        declaredMethod.setAccessible(true);
        Context contextCurrentApplication2 = MainApplication.f5549a;
        if (contextCurrentApplication2 == null && (contextCurrentApplication2 = C1456gf.f5172p) == null) {
            contextCurrentApplication2 = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        AssetManager assets = contextCurrentApplication2.getAssets();
        String str4 = AbstractC1450gG.f5070d;
        if (str4 == null) {
            AbstractC0295Gu.m625r(-578489145096245L);
            str4 = null;
        }
        declaredMethod.invoke(assets, str4);
        Class clsM2718r0 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-842487899879477L));
        try {
            Field declaredField = clsM2718r0.getDeclaredField(AbstractC0295Gu.m625r(-843140734908469L));
            declaredField.setAccessible(true);
            AbstractC0828TB.f2614f = declaredField.getInt(null);
            Field declaredField2 = clsM2718r0.getDeclaredField(AbstractC0295Gu.m625r(-843162209744949L));
            declaredField2.setAccessible(true);
            AbstractC0828TB.f2615g = declaredField2.getInt(null);
            Field declaredField3 = clsM2718r0.getDeclaredField(AbstractC0295Gu.m625r(-843183684581429L));
            declaredField3.setAccessible(true);
            AbstractC0828TB.f2616h = declaredField3.getInt(null);
        } catch (Exception unused) {
        }
        Context contextCurrentApplication3 = MainApplication.f5549a;
        if (contextCurrentApplication3 == null && (contextCurrentApplication3 = C1456gf.f5172p) == null) {
            contextCurrentApplication3 = AndroidAppHelper.currentApplication();
            AbstractC0295Gu.m625r(-836852902787125L);
        }
        String packageName = contextCurrentApplication3.getPackageName();
        contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-843209454385205L), AbstractC0295Gu.m625r(-843325418502197L), packageName);
        AbstractC0828TB.f2617i = contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-842788547590197L), AbstractC0295Gu.m625r(-842887331838005L), packageName);
        AbstractC0828TB.f2618j = contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-842900216739893L), AbstractC0295Gu.m625r(-842934576478261L), packageName);
        contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-842947461380149L), AbstractC0295Gu.m625r(-843029065758773L), packageName);
        contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-843046245627957L), AbstractC0295Gu.m625r(-841504352368693L), packageName);
        contextCurrentApplication3.getResources().getIdentifier(AbstractC0295Gu.m625r(-841521532237877L), AbstractC0295Gu.m625r(-841611726551093L), packageName);
        int i3 = 20;
        try {
            LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
            linkedHashMap.clear();
            AbstractC1257cG.f4259b = AbstractC1257cG.m2376d().getInt(AbstractC0295Gu.m625r(-584334595586101L), -1);
            final int i4 = 4;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584356070422581L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i4) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i5 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i5));
                                        map.put(Integer.valueOf(i5), field.getName());
                                        i5 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583973818333237L), new C0309H7(17));
            final int i5 = 28;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584042537809973L), new C0309H7(i5));
            final int i6 = 10;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584751207413813L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i6) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i7 = 22;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584845696694325L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i7) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i8 = 24;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584454854670389L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i8) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i9 = 25;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584600883558453L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i9) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i10 = 27;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583084760102965L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i10) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583209314154549L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i5) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i11 = 29;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582796997294133L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i11) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i12 = 15;
            AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582904371476533L), new Function2() { // from class: ZF
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: d */
                public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objInvoke;
                    Method methodM2920e;
                    DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                    ClassLoader classLoader2 = (ClassLoader) obj3;
                    switch (i12) {
                        case 0:
                            AbstractC0295Gu.m625r(-568610720315445L);
                            AbstractC0295Gu.m625r(-568640785086517L);
                            C2147kh c2147kh = new C2147kh(1);
                            C0182E9 c0182e9 = new C0182E9();
                            c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                            c2147kh.f7512m = c0182e9;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                        case 1:
                            AbstractC0295Gu.m625r(-569439649003573L);
                            AbstractC0295Gu.m625r(-569469713774645L);
                            C2147kh c2147kh2 = new C2147kh(1);
                            C0182E9 c0182e92 = new C0182E9();
                            c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                            c2147kh2.f7512m = c0182e92;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                        case 2:
                            AbstractC0295Gu.m625r(-569177655998517L);
                            AbstractC0295Gu.m625r(-569207720769589L);
                            C2147kh c2147kh3 = new C2147kh(1);
                            C0182E9 c0182e93 = new C0182E9();
                            c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                            C2147kh c2147kh4 = c0182e93.f537m;
                            if (c2147kh4 == null) {
                                c2147kh4 = new C2147kh(0);
                            }
                            c0182e93.f537m = c2147kh4;
                            c2147kh4.f7512m = new C0243Fl(0);
                            c2147kh3.f7512m = c0182e93;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                        case 3:
                            AbstractC0295Gu.m625r(-567807561431093L);
                            AbstractC0295Gu.m625r(-567837626202165L);
                            C2147kh c2147kh5 = new C2147kh(1);
                            C0182E9 c0182e94 = new C0182E9();
                            c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                            c2147kh5.f7512m = c0182e94;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                        case 4:
                            C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                            C0850Tr c0850Tr = new C0850Tr();
                            c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                            c2147khM4811h.f7512m = c0850Tr;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                        case 5:
                            AbstractC0295Gu.m625r(-567614287902773L);
                            AbstractC0295Gu.m625r(-568194108487733L);
                            C2147kh c2147kh6 = new C2147kh(1);
                            C0182E9 c0182e95 = new C0182E9();
                            c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                            c2147kh6.f7512m = c0182e95;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                        case 6:
                            AbstractC0295Gu.m625r(-567949295351861L);
                            AbstractC0295Gu.m625r(-567979360122933L);
                            C2147kh c2147kh7 = new C2147kh(1);
                            C0182E9 c0182e96 = new C0182E9();
                            c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                            c2147kh7.f7512m = c0182e96;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                        case 7:
                            AbstractC0295Gu.m625r(-566562020915253L);
                            AbstractC0295Gu.m625r(-566592085686325L);
                            C2147kh c2147kh8 = new C2147kh(1);
                            C0182E9 c0182e97 = new C0182E9();
                            c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                            c2147kh8.f7512m = c0182e97;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            AbstractC0295Gu.m625r(-566334387648565L);
                            AbstractC0295Gu.m625r(-566364452419637L);
                            C2147kh c2147kh9 = new C2147kh(1);
                            C0182E9 c0182e98 = new C0182E9();
                            c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                            c2147kh9.f7512m = c0182e98;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            AbstractC0295Gu.m625r(-567197676075061L);
                            AbstractC0295Gu.m625r(-567227740846133L);
                            C2147kh c2147kh10 = new C2147kh(1);
                            C0182E9 c0182e99 = new C0182E9();
                            c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                            c2147kh10.f7512m = c0182e99;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                        case 10:
                            C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                            C0850Tr c0850Tr2 = new C0850Tr();
                            c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                            c2147khM4811h2.f7512m = c0850Tr2;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                        case 11:
                            AbstractC0295Gu.m625r(-566965747841077L);
                            AbstractC0295Gu.m625r(-566995812612149L);
                            C2147kh c2147kh11 = new C2147kh(1);
                            C0182E9 c0182e910 = new C0182E9();
                            c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                            c2147kh11.f7512m = c0182e910;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                        case 12:
                            AbstractC0295Gu.m625r(-565518343862325L);
                            AbstractC0295Gu.m625r(-565548408633397L);
                            C2147kh c2147kh12 = new C2147kh(1);
                            C0182E9 c0182e911 = new C0182E9();
                            c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                            c2147kh12.f7512m = c0182e911;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                        case 13:
                            AbstractC0295Gu.m625r(-565286415628341L);
                            AbstractC0295Gu.m625r(-565316480399413L);
                            C2147kh c2147kh13 = new C2147kh(1);
                            C0182E9 c0182e912 = new C0182E9();
                            c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                            c2147kh13.f7512m = c0182e912;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                        case 14:
                            AbstractC0295Gu.m625r(-566085279545397L);
                            AbstractC0295Gu.m625r(-566115344316469L);
                            C2147kh c2147kh14 = new C2147kh(1);
                            C0182E9 c0182e913 = new C0182E9();
                            c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                            c2147kh14.f7512m = c0182e913;
                            return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                        case 15:
                            C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                            C0850Tr c0850Tr3 = new C0850Tr();
                            c0850Tr3.m1683N(0);
                            c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                            c2147khM4811h3.f7512m = c0850Tr3;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                        case 16:
                            C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                            C0850Tr c0850Tr4 = new C0850Tr();
                            c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                            c2147khM4811h4.f7512m = c0850Tr4;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                        case 17:
                            C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                            C0850Tr c0850Tr5 = new C0850Tr();
                            c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                            c2147khM4811h5.f7512m = c0850Tr5;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        case 18:
                            C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                            C0850Tr c0850Tr6 = new C0850Tr();
                            c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                            c2147khM4811h6.f7512m = c0850Tr6;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                        case 19:
                            C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                            C0850Tr c0850Tr7 = new C0850Tr();
                            c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                            c2147khM4811h7.f7512m = c0850Tr7;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                        case LuaJitConsts.LUA_MINSTACK /* 20 */:
                            C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                            C0850Tr c0850Tr8 = new C0850Tr();
                            c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                            c2147khM4811h8.f7512m = c0850Tr8;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                        case 21:
                            C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                            C0850Tr c0850Tr9 = new C0850Tr();
                            c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                            c2147khM4811h9.f7512m = c0850Tr9;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                        case 22:
                            C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                            C0850Tr c0850Tr10 = new C0850Tr();
                            c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                            c2147khM4811h10.f7512m = c0850Tr10;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                        case 23:
                            AbstractC0295Gu.m625r(-563985040537653L);
                            AbstractC0295Gu.m625r(-564015105308725L);
                            Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                            Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                            Object objNewInstance = cls.getConstructor(null).newInstance(null);
                            HashMap map = new HashMap();
                            Field[] fields = cls.getFields();
                            AbstractC0295Gu.m625r(-564045170079797L);
                            int i52 = 100;
                            for (Field field : fields) {
                                if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                    if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                        field.set(objNewInstance, 1024);
                                    } else {
                                        field.set(objNewInstance, Integer.valueOf(i52));
                                        map.put(Integer.valueOf(i52), field.getName());
                                        i52 += 100;
                                    }
                                }
                            }
                            C1538iG c1538iG = new C1538iG(objNewInstance);
                            c1538iG.m2924i(ContentValues.class);
                            Object obj4 = c1538iG.f5419a;
                            if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                try {
                                    objInvoke = methodM2920e.invoke(obj4, null);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                    objInvoke = null;
                                } catch (InvocationTargetException e2) {
                                    e2.printStackTrace();
                                    objInvoke = null;
                                }
                                break;
                            } else {
                                objInvoke = null;
                            }
                            ContentValues contentValues = (ContentValues) objInvoke;
                            return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                        case 24:
                            C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                            C0850Tr c0850Tr11 = new C0850Tr();
                            c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                            c0850Tr11.m1683N(5);
                            c2147khM4811h11.f7512m = c0850Tr11;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                        case 25:
                            C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                            C0850Tr c0850Tr12 = new C0850Tr();
                            c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                            c0850Tr12.m1683N(5);
                            c2147khM4811h12.f7512m = c0850Tr12;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                        case 26:
                            C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                            C0850Tr c0850Tr13 = new C0850Tr();
                            c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                            c2147khM4811h13.f7512m = c0850Tr13;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                        case 27:
                            C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                            C0850Tr c0850Tr14 = new C0850Tr();
                            c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                            c2147khM4811h14.f7512m = c0850Tr14;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                        case 28:
                            C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                            C0850Tr c0850Tr15 = new C0850Tr();
                            c0850Tr15.m1683N(0);
                            List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                            ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                            Iterator it = listSingletonList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C2435qz((String) it.next(), 5));
                            }
                            c0850Tr15.f2701p = new ArrayList(arrayList);
                            c2147khM4811h15.f7512m = c0850Tr15;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                        default:
                            C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                            C0850Tr c0850Tr16 = new C0850Tr();
                            c0850Tr16.m1683N(1);
                            c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                            c2147khM4811h16.f7512m = c0850Tr16;
                            return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                    }
                }
            });
            final int i13 = 26;
            try {
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583582976309301L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i13) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583724710230069L), new Function2() { // from class: aG
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) {
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i) {
                            case 0:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-593594545076277L, -593624609847349L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1683N(6);
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-593654674618421L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 1:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-593298192332853L, -593328257103925L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-593358321874997L)));
                                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-593461401090101L), AbstractC0295Gu.m625r(-591906622928949L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 2:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591962457503797L, -591992522274869L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-592022587045941L)));
                                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591575910447157L), AbstractC0295Gu.m625r(-591670399727669L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 3:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-591734824237109L, -591764889008181L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-591794953779253L)));
                                c0850Tr4.m1685P(AbstractC0295Gu.m625r(-592447788808245L), AbstractC0295Gu.m625r(-592542278088757L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-592293169985589L, -592323234756661L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1684O(AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-592353299527733L), null, AbstractC0295Gu.m625r(-590807111301173L)));
                                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-590884420712501L), AbstractC0295Gu.m625r(-590978909993013L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583823494477877L), new Function2() { // from class: aG
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) {
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i2) {
                            case 0:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-593594545076277L, -593624609847349L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1683N(6);
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-593654674618421L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 1:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-593298192332853L, -593328257103925L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-593358321874997L)));
                                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-593461401090101L), AbstractC0295Gu.m625r(-591906622928949L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 2:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591962457503797L, -591992522274869L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-592022587045941L)));
                                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591575910447157L), AbstractC0295Gu.m625r(-591670399727669L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 3:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-591734824237109L, -591764889008181L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-591794953779253L)));
                                c0850Tr4.m1685P(AbstractC0295Gu.m625r(-592447788808245L), AbstractC0295Gu.m625r(-592542278088757L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-592293169985589L, -592323234756661L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1684O(AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-592353299527733L), null, AbstractC0295Gu.m625r(-590807111301173L)));
                                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-590884420712501L), AbstractC0295Gu.m625r(-590978909993013L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i14 = 2;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583385407813685L), new Function2() { // from class: aG
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) {
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i14) {
                            case 0:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-593594545076277L, -593624609847349L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1683N(6);
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-593654674618421L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 1:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-593298192332853L, -593328257103925L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-593358321874997L)));
                                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-593461401090101L), AbstractC0295Gu.m625r(-591906622928949L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 2:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591962457503797L, -591992522274869L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-592022587045941L)));
                                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591575910447157L), AbstractC0295Gu.m625r(-591670399727669L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 3:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-591734824237109L, -591764889008181L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-591794953779253L)));
                                c0850Tr4.m1685P(AbstractC0295Gu.m625r(-592447788808245L), AbstractC0295Gu.m625r(-592542278088757L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-592293169985589L, -592323234756661L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1684O(AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-592353299527733L), null, AbstractC0295Gu.m625r(-590807111301173L)));
                                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-590884420712501L), AbstractC0295Gu.m625r(-590978909993013L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i15 = 3;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583505666897973L), new Function2() { // from class: aG
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) {
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i15) {
                            case 0:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-593594545076277L, -593624609847349L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1683N(6);
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-593654674618421L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 1:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-593298192332853L, -593328257103925L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-593358321874997L)));
                                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-593461401090101L), AbstractC0295Gu.m625r(-591906622928949L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 2:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591962457503797L, -591992522274869L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-592022587045941L)));
                                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591575910447157L), AbstractC0295Gu.m625r(-591670399727669L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 3:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-591734824237109L, -591764889008181L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-591794953779253L)));
                                c0850Tr4.m1685P(AbstractC0295Gu.m625r(-592447788808245L), AbstractC0295Gu.m625r(-592542278088757L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-592293169985589L, -592323234756661L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1684O(AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-592353299527733L), null, AbstractC0295Gu.m625r(-590807111301173L)));
                                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-590884420712501L), AbstractC0295Gu.m625r(-590978909993013L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581989543442485L), new Function2() { // from class: aG
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) {
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i4) {
                            case 0:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-593594545076277L, -593624609847349L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1683N(6);
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-593654674618421L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 1:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-593298192332853L, -593328257103925L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-593358321874997L)));
                                c0850Tr2.m1685P(AbstractC0295Gu.m625r(-593461401090101L), AbstractC0295Gu.m625r(-591906622928949L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 2:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-591962457503797L, -591992522274869L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-592022587045941L)));
                                c0850Tr3.m1685P(AbstractC0295Gu.m625r(-591575910447157L), AbstractC0295Gu.m625r(-591670399727669L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 3:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-591734824237109L, -591764889008181L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1684O(Collections.singletonList(AbstractC0295Gu.m625r(-591794953779253L)));
                                c0850Tr4.m1685P(AbstractC0295Gu.m625r(-592447788808245L), AbstractC0295Gu.m625r(-592542278088757L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-592293169985589L, -592323234756661L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1684O(AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-592353299527733L), null, AbstractC0295Gu.m625r(-590807111301173L)));
                                c0850Tr5.m1685P(AbstractC0295Gu.m625r(-590884420712501L), AbstractC0295Gu.m625r(-590978909993013L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i16 = 14;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582105507559477L), new C0309H7(i16));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581676010829877L), new C0309H7(i12));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581774795077685L), new C0309H7(16));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581882169260085L), new C0309H7(18));
                final int i17 = 19;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582539299256373L), new C0309H7(i17));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582698213046325L), new C0309H7(i3));
                final int i18 = 21;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582281601218613L), new C0309H7(i18));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582406155270197L), new C0309H7(i7));
                final int i19 = 23;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580847082141749L), new C0309H7(i19));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580984521095221L), new C0309H7(i8));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580572204234805L), new C0309H7(i9));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580688168351797L), new C0309H7(i13));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581375363119157L), new C0309H7(i10));
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581508507105333L), new C0309H7(i11));
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581096190244917L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581190679525429L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i2) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i20 = 2;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581302348675125L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i20) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597326871656501L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i15) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i21 = 5;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597387001198645L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i21) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i22 = 6;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597494375381045L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i22) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i23 = 7;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597554504923189L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i23) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i24 = 8;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597077763553333L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i24) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i25 = 9;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597163662899253L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i25) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i26 = 11;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597202317604917L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i26) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i27 = 12;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597283921983541L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i27) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i28 = 13;
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597885217404981L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i28) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597996886554677L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i16) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i29 = 16;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-598099965769781L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i29) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i30 = 17;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-597713418713141L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i30) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i31 = 18;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-597833677797429L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i31) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596369093949493L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i17) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                final int i32 = 20;
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596485058066485L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i32) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596124280813621L), new Function2() { // from class: ZF
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: d */
                    public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                        Object objInvoke;
                        Method methodM2920e;
                        DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                        ClassLoader classLoader2 = (ClassLoader) obj3;
                        switch (i18) {
                            case 0:
                                AbstractC0295Gu.m625r(-568610720315445L);
                                AbstractC0295Gu.m625r(-568640785086517L);
                                C2147kh c2147kh = new C2147kh(1);
                                C0182E9 c0182e9 = new C0182E9();
                                c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                c2147kh.f7512m = c0182e9;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                            case 1:
                                AbstractC0295Gu.m625r(-569439649003573L);
                                AbstractC0295Gu.m625r(-569469713774645L);
                                C2147kh c2147kh2 = new C2147kh(1);
                                C0182E9 c0182e92 = new C0182E9();
                                c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                c2147kh2.f7512m = c0182e92;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                            case 2:
                                AbstractC0295Gu.m625r(-569177655998517L);
                                AbstractC0295Gu.m625r(-569207720769589L);
                                C2147kh c2147kh3 = new C2147kh(1);
                                C0182E9 c0182e93 = new C0182E9();
                                c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                C2147kh c2147kh4 = c0182e93.f537m;
                                if (c2147kh4 == null) {
                                    c2147kh4 = new C2147kh(0);
                                }
                                c0182e93.f537m = c2147kh4;
                                c2147kh4.f7512m = new C0243Fl(0);
                                c2147kh3.f7512m = c0182e93;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                            case 3:
                                AbstractC0295Gu.m625r(-567807561431093L);
                                AbstractC0295Gu.m625r(-567837626202165L);
                                C2147kh c2147kh5 = new C2147kh(1);
                                C0182E9 c0182e94 = new C0182E9();
                                c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                c2147kh5.f7512m = c0182e94;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                            case 4:
                                C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                C0850Tr c0850Tr = new C0850Tr();
                                c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                c2147khM4811h.f7512m = c0850Tr;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                            case 5:
                                AbstractC0295Gu.m625r(-567614287902773L);
                                AbstractC0295Gu.m625r(-568194108487733L);
                                C2147kh c2147kh6 = new C2147kh(1);
                                C0182E9 c0182e95 = new C0182E9();
                                c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                c2147kh6.f7512m = c0182e95;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                            case 6:
                                AbstractC0295Gu.m625r(-567949295351861L);
                                AbstractC0295Gu.m625r(-567979360122933L);
                                C2147kh c2147kh7 = new C2147kh(1);
                                C0182E9 c0182e96 = new C0182E9();
                                c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                c2147kh7.f7512m = c0182e96;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                            case 7:
                                AbstractC0295Gu.m625r(-566562020915253L);
                                AbstractC0295Gu.m625r(-566592085686325L);
                                C2147kh c2147kh8 = new C2147kh(1);
                                C0182E9 c0182e97 = new C0182E9();
                                c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                c2147kh8.f7512m = c0182e97;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                AbstractC0295Gu.m625r(-566334387648565L);
                                AbstractC0295Gu.m625r(-566364452419637L);
                                C2147kh c2147kh9 = new C2147kh(1);
                                C0182E9 c0182e98 = new C0182E9();
                                c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                c2147kh9.f7512m = c0182e98;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                AbstractC0295Gu.m625r(-567197676075061L);
                                AbstractC0295Gu.m625r(-567227740846133L);
                                C2147kh c2147kh10 = new C2147kh(1);
                                C0182E9 c0182e99 = new C0182E9();
                                c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                c2147kh10.f7512m = c0182e99;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                            case 10:
                                C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                C0850Tr c0850Tr2 = new C0850Tr();
                                c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                c2147khM4811h2.f7512m = c0850Tr2;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                            case 11:
                                AbstractC0295Gu.m625r(-566965747841077L);
                                AbstractC0295Gu.m625r(-566995812612149L);
                                C2147kh c2147kh11 = new C2147kh(1);
                                C0182E9 c0182e910 = new C0182E9();
                                c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                c2147kh11.f7512m = c0182e910;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                            case 12:
                                AbstractC0295Gu.m625r(-565518343862325L);
                                AbstractC0295Gu.m625r(-565548408633397L);
                                C2147kh c2147kh12 = new C2147kh(1);
                                C0182E9 c0182e911 = new C0182E9();
                                c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                c2147kh12.f7512m = c0182e911;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                            case 13:
                                AbstractC0295Gu.m625r(-565286415628341L);
                                AbstractC0295Gu.m625r(-565316480399413L);
                                C2147kh c2147kh13 = new C2147kh(1);
                                C0182E9 c0182e912 = new C0182E9();
                                c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                c2147kh13.f7512m = c0182e912;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                            case 14:
                                AbstractC0295Gu.m625r(-566085279545397L);
                                AbstractC0295Gu.m625r(-566115344316469L);
                                C2147kh c2147kh14 = new C2147kh(1);
                                C0182E9 c0182e913 = new C0182E9();
                                c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                c2147kh14.f7512m = c0182e913;
                                return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                            case 15:
                                C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                C0850Tr c0850Tr3 = new C0850Tr();
                                c0850Tr3.m1683N(0);
                                c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                c2147khM4811h3.f7512m = c0850Tr3;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                            case 16:
                                C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                C0850Tr c0850Tr4 = new C0850Tr();
                                c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                c2147khM4811h4.f7512m = c0850Tr4;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                            case 17:
                                C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                C0850Tr c0850Tr5 = new C0850Tr();
                                c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                c2147khM4811h5.f7512m = c0850Tr5;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                            case 18:
                                C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                C0850Tr c0850Tr6 = new C0850Tr();
                                c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                c2147khM4811h6.f7512m = c0850Tr6;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                            case 19:
                                C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                C0850Tr c0850Tr7 = new C0850Tr();
                                c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                c2147khM4811h7.f7512m = c0850Tr7;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                C0850Tr c0850Tr8 = new C0850Tr();
                                c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                c2147khM4811h8.f7512m = c0850Tr8;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                            case 21:
                                C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                C0850Tr c0850Tr9 = new C0850Tr();
                                c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                c2147khM4811h9.f7512m = c0850Tr9;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                            case 22:
                                C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                C0850Tr c0850Tr10 = new C0850Tr();
                                c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                c2147khM4811h10.f7512m = c0850Tr10;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                            case 23:
                                AbstractC0295Gu.m625r(-563985040537653L);
                                AbstractC0295Gu.m625r(-564015105308725L);
                                Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                HashMap map = new HashMap();
                                Field[] fields = cls.getFields();
                                AbstractC0295Gu.m625r(-564045170079797L);
                                int i52 = 100;
                                for (Field field : fields) {
                                    if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                        if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                            field.set(objNewInstance, 1024);
                                        } else {
                                            field.set(objNewInstance, Integer.valueOf(i52));
                                            map.put(Integer.valueOf(i52), field.getName());
                                            i52 += 100;
                                        }
                                    }
                                }
                                C1538iG c1538iG = new C1538iG(objNewInstance);
                                c1538iG.m2924i(ContentValues.class);
                                Object obj4 = c1538iG.f5419a;
                                if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                    try {
                                        objInvoke = methodM2920e.invoke(obj4, null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                        objInvoke = null;
                                    } catch (InvocationTargetException e2) {
                                        e2.printStackTrace();
                                        objInvoke = null;
                                    }
                                    break;
                                } else {
                                    objInvoke = null;
                                }
                                ContentValues contentValues = (ContentValues) objInvoke;
                                return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                            case 24:
                                C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                C0850Tr c0850Tr11 = new C0850Tr();
                                c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                c0850Tr11.m1683N(5);
                                c2147khM4811h11.f7512m = c0850Tr11;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                            case 25:
                                C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                C0850Tr c0850Tr12 = new C0850Tr();
                                c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                c0850Tr12.m1683N(5);
                                c2147khM4811h12.f7512m = c0850Tr12;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                            case 26:
                                C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                C0850Tr c0850Tr13 = new C0850Tr();
                                c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                c2147khM4811h13.f7512m = c0850Tr13;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                            case 27:
                                C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                C0850Tr c0850Tr14 = new C0850Tr();
                                c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                c2147khM4811h14.f7512m = c0850Tr14;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                            case 28:
                                C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                C0850Tr c0850Tr15 = new C0850Tr();
                                c0850Tr15.m1683N(0);
                                List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                Iterator it = listSingletonList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new C2435qz((String) it.next(), 5));
                                }
                                c0850Tr15.f2701p = new ArrayList(arrayList);
                                c2147khM4811h15.f7512m = c0850Tr15;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                            default:
                                C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                C0850Tr c0850Tr16 = new C0850Tr();
                                c0850Tr16.m1683N(1);
                                c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                c2147khM4811h16.f7512m = c0850Tr16;
                                return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                        }
                    }
                });
                String strM625r = AbstractC0295Gu.m625r(-596785705777205L);
                str = null;
                try {
                    linkedHashMap.put(strM625r, new C1214bG(AbstractC1257cG.m2376d().getString(strM625r, null), strM625r, new Function2() { // from class: ZF
                        @Override // kotlin.jvm.functions.Function2
                        /* JADX INFO: renamed from: d */
                        public final Object mo446d(Object obj2, Object obj3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                            Object objInvoke;
                            Method methodM2920e;
                            DexKitBridge dexKitBridge = (DexKitBridge) obj2;
                            ClassLoader classLoader2 = (ClassLoader) obj3;
                            switch (i19) {
                                case 0:
                                    AbstractC0295Gu.m625r(-568610720315445L);
                                    AbstractC0295Gu.m625r(-568640785086517L);
                                    C2147kh c2147kh = new C2147kh(1);
                                    C0182E9 c0182e9 = new C0182E9();
                                    c0182e9.m372O(AbstractC0295Gu.m625r(-568670849857589L), AbstractC0295Gu.m625r(-569353749657653L));
                                    c2147kh.f7512m = c0182e9;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh).m5219a()).m144g().m158a(classLoader2);
                                case 1:
                                    AbstractC0295Gu.m625r(-569439649003573L);
                                    AbstractC0295Gu.m625r(-569469713774645L);
                                    C2147kh c2147kh2 = new C2147kh(1);
                                    C0182E9 c0182e92 = new C0182E9();
                                    c0182e92.m372O(AbstractC0295Gu.m625r(-569499778545717L), AbstractC0295Gu.m625r(-569044512012341L), AbstractC0295Gu.m625r(-569078871750709L));
                                    c2147kh2.f7512m = c0182e92;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh2).m5219a()).m144g().m158a(classLoader2);
                                case 2:
                                    AbstractC0295Gu.m625r(-569177655998517L);
                                    AbstractC0295Gu.m625r(-569207720769589L);
                                    C2147kh c2147kh3 = new C2147kh(1);
                                    C0182E9 c0182e93 = new C0182E9();
                                    c0182e93.m372O(AbstractC0295Gu.m625r(-569237785540661L), AbstractC0295Gu.m625r(-567730252019765L));
                                    C2147kh c2147kh4 = c0182e93.f537m;
                                    if (c2147kh4 == null) {
                                        c2147kh4 = new C2147kh(0);
                                    }
                                    c0182e93.f537m = c2147kh4;
                                    c2147kh4.f7512m = new C0243Fl(0);
                                    c2147kh3.f7512m = c0182e93;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh3).m5219a()).m144g().m158a(classLoader2);
                                case 3:
                                    AbstractC0295Gu.m625r(-567807561431093L);
                                    AbstractC0295Gu.m625r(-567837626202165L);
                                    C2147kh c2147kh5 = new C2147kh(1);
                                    C0182E9 c0182e94 = new C0182E9();
                                    c0182e94.m372O(AbstractC0295Gu.m625r(-567867690973237L), AbstractC0295Gu.m625r(-567416719407157L));
                                    c2147kh5.f7512m = c0182e94;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh5).m5219a()).m144g().m158a(classLoader2);
                                case 4:
                                    C2147kh c2147khM4811h = AbstractC2374ph.m4811h(-596674036627509L, -596704101398581L);
                                    C0850Tr c0850Tr = new C0850Tr();
                                    c0850Tr.m1686Q(AbstractC0295Gu.m625r(-596734166169653L), AbstractC0295Gu.m625r(-595218042714165L));
                                    c2147khM4811h.f7512m = c0850Tr;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h).m5219a()).m1562g().m293a(classLoader2);
                                case 5:
                                    AbstractC0295Gu.m625r(-567614287902773L);
                                    AbstractC0295Gu.m625r(-568194108487733L);
                                    C2147kh c2147kh6 = new C2147kh(1);
                                    C0182E9 c0182e95 = new C0182E9();
                                    c0182e95.m372O(AbstractC0295Gu.m625r(-568224173258805L), AbstractC0295Gu.m625r(-568434626656309L));
                                    c2147kh6.f7512m = c0182e95;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh6).m5219a()).m144g().m158a(classLoader2);
                                case 6:
                                    AbstractC0295Gu.m625r(-567949295351861L);
                                    AbstractC0295Gu.m625r(-567979360122933L);
                                    C2147kh c2147kh7 = new C2147kh(1);
                                    C0182E9 c0182e96 = new C0182E9();
                                    c0182e96.m372O(AbstractC0295Gu.m625r(-568009424894005L), AbstractC0295Gu.m625r(-568108209141813L));
                                    c2147kh7.f7512m = c0182e96;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh7).m5219a()).m144g().m158a(classLoader2);
                                case 7:
                                    AbstractC0295Gu.m625r(-566562020915253L);
                                    AbstractC0295Gu.m625r(-566592085686325L);
                                    C2147kh c2147kh8 = new C2147kh(1);
                                    C0182E9 c0182e97 = new C0182E9();
                                    c0182e97.m372O(AbstractC0295Gu.m625r(-566622150457397L), AbstractC0295Gu.m625r(-566261373204533L));
                                    c2147kh8.f7512m = c0182e97;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh8).m5219a()).m144g().m158a(classLoader2);
                                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                                    AbstractC0295Gu.m625r(-566334387648565L);
                                    AbstractC0295Gu.m625r(-566364452419637L);
                                    C2147kh c2147kh9 = new C2147kh(1);
                                    C0182E9 c0182e98 = new C0182E9();
                                    c0182e98.m372O(AbstractC0295Gu.m625r(-566394517190709L), AbstractC0295Gu.m625r(-566523366209589L));
                                    c2147kh9.f7512m = c0182e98;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh9).m5219a()).m144g().m158a(classLoader2);
                                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                                    AbstractC0295Gu.m625r(-567197676075061L);
                                    AbstractC0295Gu.m625r(-567227740846133L);
                                    C2147kh c2147kh10 = new C2147kh(1);
                                    C0182E9 c0182e99 = new C0182E9();
                                    c0182e99.m372O(AbstractC0295Gu.m625r(-567257805617205L), AbstractC0295Gu.m625r(-567335115028533L));
                                    c2147kh10.f7512m = c0182e99;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh10).m5219a()).m144g().m158a(classLoader2);
                                case 10:
                                    C2147kh c2147khM4811h2 = AbstractC2374ph.m4811h(-595918122383413L, -595398431340597L);
                                    C0850Tr c0850Tr2 = new C0850Tr();
                                    c0850Tr2.m1686Q(AbstractC0295Gu.m625r(-595428496111669L), AbstractC0295Gu.m625r(-595510100490293L));
                                    c2147khM4811h2.f7512m = c0850Tr2;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h2).m5219a()).m1562g().m293a(classLoader2);
                                case 11:
                                    AbstractC0295Gu.m625r(-566965747841077L);
                                    AbstractC0295Gu.m625r(-566995812612149L);
                                    C2147kh c2147kh11 = new C2147kh(1);
                                    C0182E9 c0182e910 = new C0182E9();
                                    c0182e910.m372O(AbstractC0295Gu.m625r(-567025877383221L), AbstractC0295Gu.m625r(-565458214320181L));
                                    c2147kh11.f7512m = c0182e910;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh11).m5219a()).m144g().m158a(classLoader2);
                                case 12:
                                    AbstractC0295Gu.m625r(-565518343862325L);
                                    AbstractC0295Gu.m625r(-565548408633397L);
                                    C2147kh c2147kh12 = new C2147kh(1);
                                    C0182E9 c0182e911 = new C0182E9();
                                    c0182e911.m372O(AbstractC0295Gu.m625r(-565578473404469L), AbstractC0295Gu.m625r(-565668667717685L));
                                    c2147kh12.f7512m = c0182e911;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh12).m5219a()).m144g().m158a(classLoader2);
                                case 13:
                                    AbstractC0295Gu.m625r(-565286415628341L);
                                    AbstractC0295Gu.m625r(-565316480399413L);
                                    C2147kh c2147kh13 = new C2147kh(1);
                                    C0182E9 c0182e912 = new C0182E9();
                                    c0182e912.m372O(AbstractC0295Gu.m625r(-565346545170485L), AbstractC0295Gu.m625r(-566012265101365L));
                                    c2147kh13.f7512m = c0182e912;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh13).m5219a()).m144g().m158a(classLoader2);
                                case 14:
                                    AbstractC0295Gu.m625r(-566085279545397L);
                                    AbstractC0295Gu.m625r(-566115344316469L);
                                    C2147kh c2147kh14 = new C2147kh(1);
                                    C0182E9 c0182e913 = new C0182E9();
                                    c0182e913.m372O(AbstractC0295Gu.m625r(-566145409087541L), AbstractC0295Gu.m625r(-565823286540341L));
                                    c2147kh14.f7512m = c0182e913;
                                    return ((C0096C9) dexKitBridge.m4738i(c2147kh14).m5219a()).m144g().m158a(classLoader2);
                                case 15:
                                    C2147kh c2147khM4811h3 = AbstractC2374ph.m4811h(-593130688608309L, -593160753379381L);
                                    C0850Tr c0850Tr3 = new C0850Tr();
                                    c0850Tr3.m1683N(0);
                                    c0850Tr3.m1686Q(AbstractC0295Gu.m625r(-592641062336565L));
                                    c2147khM4811h3.f7512m = c0850Tr3;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h3).m5219a()).m1562g().m293a(classLoader2);
                                case 16:
                                    C2147kh c2147khM4811h4 = AbstractC2374ph.m4811h(-565947840591925L, -564328637921333L);
                                    C0850Tr c0850Tr4 = new C0850Tr();
                                    c0850Tr4.m1686Q(AbstractC0295Gu.m625r(-564358702692405L), AbstractC0295Gu.m625r(-564487551711285L));
                                    c2147khM4811h4.f7512m = c0850Tr4;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h4).m5219a()).m1562g().m293a(classLoader2);
                                case 17:
                                    C2147kh c2147khM4811h5 = AbstractC2374ph.m4811h(-564083824785461L, -564113889556533L);
                                    C0850Tr c0850Tr5 = new C0850Tr();
                                    c0850Tr5.m1686Q(AbstractC0295Gu.m625r(-564143954327605L));
                                    c2147khM4811h5.f7512m = c0850Tr5;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h5).m5219a()).m1562g().m293a(classLoader2);
                                case 18:
                                    C2147kh c2147khM4811h6 = AbstractC2374ph.m4811h(-564294278182965L, -564324342954037L);
                                    C0850Tr c0850Tr6 = new C0850Tr();
                                    c0850Tr6.m1686Q(AbstractC0295Gu.m625r(-564904163538997L), AbstractC0295Gu.m625r(-565110321969205L));
                                    c2147khM4811h6.f7512m = c0850Tr6;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h6).m5219a()).m1562g().m293a(classLoader2);
                                case 19:
                                    C2147kh c2147khM4811h7 = AbstractC2374ph.m4811h(-564629285632053L, -564659350403125L);
                                    C0850Tr c0850Tr7 = new C0850Tr();
                                    c0850Tr7.m1686Q(AbstractC0295Gu.m625r(-564689415174197L), AbstractC0295Gu.m625r(-564788199422005L));
                                    c2147khM4811h7.f7512m = c0850Tr7;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h7).m5219a()).m1562g().m293a(classLoader2);
                                case LuaJitConsts.LUA_MINSTACK /* 20 */:
                                    C2147kh c2147khM4811h8 = AbstractC2374ph.m4811h(-563246306162741L, -563276370933813L);
                                    C0850Tr c0850Tr8 = new C0850Tr();
                                    c0850Tr8.m1686Q(AbstractC0295Gu.m625r(-563306435704885L), AbstractC0295Gu.m625r(-563452464592949L));
                                    c2147khM4811h8.f7512m = c0850Tr8;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h8).m5219a()).m1562g().m293a(classLoader2);
                                case 21:
                                    C2147kh c2147khM4811h9 = AbstractC2374ph.m4811h(-563104572241973L, -563134637013045L);
                                    C0850Tr c0850Tr9 = new C0850Tr();
                                    c0850Tr9.m1686Q(AbstractC0295Gu.m625r(-563164701784117L), AbstractC0295Gu.m625r(-563800356943925L));
                                    c2147khM4811h9.f7512m = c0850Tr9;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h9).m5219a()).m1562g().m293a(classLoader2);
                                case 22:
                                    C2147kh c2147khM4811h10 = AbstractC2374ph.m4811h(-595583114934325L, -595613179705397L);
                                    C0850Tr c0850Tr10 = new C0850Tr();
                                    c0850Tr10.m1686Q(AbstractC0295Gu.m625r(-595643244476469L), AbstractC0295Gu.m625r(-594075581413429L));
                                    c2147khM4811h10.f7512m = c0850Tr10;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h10).m5219a()).m1562g().m293a(classLoader2);
                                case 23:
                                    AbstractC0295Gu.m625r(-563985040537653L);
                                    AbstractC0295Gu.m625r(-564015105308725L);
                                    Class<?>[] parameterTypes = AbstractC1257cG.m2379g().getParameterTypes();
                                    Class<?> cls = AbstractC1257cG.m2379g().getParameterTypes()[(parameterTypes.length != 1 && parameterTypes.length == 2 && AbstractC0585Nj.m1134a(parameterTypes[0], String.class)) ? (char) 1 : (char) 0];
                                    Object objNewInstance = cls.getConstructor(null).newInstance(null);
                                    HashMap map = new HashMap();
                                    Field[] fields = cls.getFields();
                                    AbstractC0295Gu.m625r(-564045170079797L);
                                    int i52 = 100;
                                    for (Field field : fields) {
                                        if (AbstractC0585Nj.m1134a(field.getType(), Integer.TYPE)) {
                                            if (AbstractC0585Nj.m1134a(field.get(objNewInstance), -1)) {
                                                field.set(objNewInstance, 1024);
                                            } else {
                                                field.set(objNewInstance, Integer.valueOf(i52));
                                                map.put(Integer.valueOf(i52), field.getName());
                                                i52 += 100;
                                            }
                                        }
                                    }
                                    C1538iG c1538iG = new C1538iG(objNewInstance);
                                    c1538iG.m2924i(ContentValues.class);
                                    Object obj4 = c1538iG.f5419a;
                                    if (obj4 != null && (methodM2920e = c1538iG.m2920e()) != null) {
                                        try {
                                            objInvoke = methodM2920e.invoke(obj4, null);
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace();
                                            objInvoke = null;
                                        } catch (InvocationTargetException e2) {
                                            e2.printStackTrace();
                                            objInvoke = null;
                                        }
                                        break;
                                    } else {
                                        objInvoke = null;
                                    }
                                    ContentValues contentValues = (ContentValues) objInvoke;
                                    return (String) map.get(contentValues != null ? contentValues.getAsInteger(AbstractC0295Gu.m625r(-563559838775349L)) : null);
                                case 24:
                                    C2147kh c2147khM4811h11 = AbstractC2374ph.m4811h(-594255970039861L, -594286034810933L);
                                    C0850Tr c0850Tr11 = new C0850Tr();
                                    c0850Tr11.m1686Q(AbstractC0295Gu.m625r(-593766343768117L), AbstractC0295Gu.m625r(-593852243114037L));
                                    c0850Tr11.m1683N(5);
                                    c2147khM4811h11.f7512m = c0850Tr11;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h11).m5219a()).m1562g().m293a(classLoader2);
                                case 25:
                                    C2147kh c2147khM4811h12 = AbstractC2374ph.m4811h(-594578092587061L, -594608157358133L);
                                    C0850Tr c0850Tr12 = new C0850Tr();
                                    c0850Tr12.m1686Q(AbstractC0295Gu.m625r(-594638222129205L), AbstractC0295Gu.m625r(-594732711409717L));
                                    c0850Tr12.m1683N(5);
                                    c2147khM4811h12.f7512m = c0850Tr12;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h12).m5219a()).m1562g().m293a(classLoader2);
                                case 26:
                                    C2147kh c2147khM4811h13 = AbstractC2374ph.m4811h(-592752731486261L, -592782796257333L);
                                    C0850Tr c0850Tr13 = new C0850Tr();
                                    c0850Tr13.m1686Q(AbstractC0295Gu.m625r(-592812861028405L), AbstractC0295Gu.m625r(-593478580959285L));
                                    c2147khM4811h13.f7512m = c0850Tr13;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h13).m5219a()).m1562g().m293a(classLoader2);
                                case 27:
                                    C2147kh c2147khM4811h14 = AbstractC2374ph.m4811h(-594307509647413L, -594337574418485L);
                                    C0850Tr c0850Tr14 = new C0850Tr();
                                    c0850Tr14.m1686Q(AbstractC0295Gu.m625r(-594367639189557L), AbstractC0295Gu.m625r(-594419178797109L), AbstractC0295Gu.m625r(-594487898273845L));
                                    c2147khM4811h14.f7512m = c0850Tr14;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h14).m5219a()).m1562g().m293a(classLoader2);
                                case 28:
                                    C2147kh c2147khM4811h15 = AbstractC2374ph.m4811h(-594556617750581L, -592937415079989L);
                                    C0850Tr c0850Tr15 = new C0850Tr();
                                    c0850Tr15.m1683N(0);
                                    List listSingletonList = Collections.singletonList(AbstractC0295Gu.m625r(-592967479851061L));
                                    ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(listSingletonList, 10));
                                    Iterator it = listSingletonList.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new C2435qz((String) it.next(), 5));
                                    }
                                    c0850Tr15.f2701p = new ArrayList(arrayList);
                                    c2147khM4811h15.f7512m = c0850Tr15;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h15).m5219a()).m1562g().m293a(classLoader2);
                                default:
                                    C2147kh c2147khM4811h16 = AbstractC2374ph.m4811h(-593001839589429L, -593031904360501L);
                                    C0850Tr c0850Tr16 = new C0850Tr();
                                    c0850Tr16.m1683N(1);
                                    c0850Tr16.m1686Q(AbstractC0295Gu.m625r(-593061969131573L));
                                    c2147khM4811h16.f7512m = c0850Tr16;
                                    return ((C0764Rr) dexKitBridge.m4739l(c2147khM4811h16).m5219a()).m1562g().m293a(classLoader2);
                            }
                        }
                    }));
                } catch (Exception unused2) {
                    AbstractC0295Gu.m625r(-596863015188533L);
                }
            } catch (Exception unused3) {
                str = null;
            }
        } catch (Exception unused4) {
            str = null;
        }
        if (AbstractC1257cG.f4259b != 115) {
            String strM625r2 = AbstractC0295Gu.m625r(-518814869485621L);
            AbstractC0295Gu.m625r(-578300166535221L);
            int i33 = AbstractC1450gG.f5067a;
            C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r2));
            c1538iG.m2921f(AbstractC0295Gu.m625r(-518939423537205L));
            c1538iG.m2916a(new C0556Mx(20));
            return;
        }
        ArrayList<AbstractC2700x5> arrayList = new ArrayList();
        String str5 = AbstractC1450gG.f5071e;
        if (str5 == null) {
            AbstractC0295Gu.m625r(-578570749474869L);
            str5 = str;
        }
        HookEntry hookEntry = this.f2299a;
        if (AbstractC0585Nj.m1134a(str5, hookEntry.f5515a)) {
            C0183EA.f539a.getClass();
            SharedPreferences sharedPreferences = C0183EA.f544f;
            String string = sharedPreferences.getString(AbstractC0295Gu.m625r(-795526727465013L), AbstractC0295Gu.m625r(-795556792236085L));
            if (string == null) {
                string = AbstractC0295Gu.m625r(-795565382170677L);
            }
            if (string.equals(AbstractC0295Gu.m625r(-508300789545013L))) {
                C0183EA.m383k(AbstractC0295Gu.m625r(-508317969414197L));
            } else {
                String string2 = sharedPreferences.getString(AbstractC0295Gu.m625r(-795526727465013L), AbstractC0295Gu.m625r(-795556792236085L));
                if (string2 == null) {
                    string2 = AbstractC0295Gu.m625r(-795565382170677L);
                }
                C0183EA.m383k(string2);
                HashMap map = AbstractC0999XA.f3193a;
                String strM378f = C0183EA.m378f(C0183EA.m373a());
                AbstractC0295Gu.m625r(-793709956298805L);
                if (ThemeProvider.installTheme(strM378f, AbstractC0999XA.f3193a, AbstractC0999XA.f3194b)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(C2128k5.f7460b);
                    arrayList2.add(C2128k5.f7470l);
                    arrayList2.add(C2128k5.f7469k);
                    arrayList2.add(C2128k5.f7462d);
                    arrayList2.add(C2128k5.f7464f);
                    arrayList2.add(C2128k5.f7463e);
                    arrayList2.add(C2128k5.f7468j);
                    arrayList2.add(C2128k5.f7465g);
                    arrayList2.add(C2128k5.f7461c);
                    arrayList2.add(C1213bF.f4144a);
                    arrayList2.add(C2128k5.f7467i);
                    arrayList2.add(C2128k5.f7466h);
                    arrayList2.add(C1339du.f4823a);
                    arrayList.addAll(arrayList2);
                } else {
                    C0183EA.m383k(AbstractC0295Gu.m625r(-508309379479605L));
                }
            }
        } else {
            String str6 = AbstractC1450gG.f5071e;
            if (str6 == null) {
                AbstractC0295Gu.m625r(-578570749474869L);
                str6 = str;
            }
            if (AbstractC0585Nj.m1134a(str6, hookEntry.f5516b)) {
            }
        }
        arrayList.add(C0603O0.f1943a);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1337ds.f4821a);
        arrayList3.add(C2111jp.f7426d);
        arrayList3.add(C2111jp.f7425c);
        arrayList3.add(C2111jp.f7424b);
        arrayList3.add(C2111jp.f7427e);
        arrayList.addAll(arrayList3);
        arrayList.addAll(AbstractC0714Qj.m1499u());
        for (AbstractC2700x5 abstractC2700x5 : arrayList) {
            try {
                abstractC2700x5.mo369a();
            } catch (Throwable th) {
                int i34 = AbstractC1450gG.f5067a;
                AbstractC1450gG.f5073g.add(th);
                AbstractC0295Gu.m625r(-508326559348789L);
                abstractC2700x5.mo370b();
            }
        }
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        super.beforeHookedMethod(methodHookParam);
        Object obj = methodHookParam.args[0];
        AbstractC0295Gu.m625r(-509078178625589L);
        int i = AbstractC1450gG.f5067a;
        ClassLoader classLoader = ((Context) obj).getClassLoader();
        AbstractC0295Gu.m625r(-509340171630645L);
        AbstractC0295Gu.m625r(-578454785357877L);
        AbstractC1450gG.f5069c = classLoader;
        String strM625r = AbstractC0295Gu.m625r(-508975099410485L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2921f(AbstractC0295Gu.m625r(-508670156732469L));
        Class cls = Boolean.TYPE;
        c1538iG.m2924i(cls);
        Boolean bool = Boolean.FALSE;
        c1538iG.m2923h(bool);
        String strM625r2 = AbstractC0295Gu.m625r(-507175508113461L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG c1538iG2 = new C1538iG(AbstractC1406fG.m2718r0(strM625r2));
        c1538iG2.m2921f(AbstractC0295Gu.m625r(-507420321249333L));
        c1538iG2.m2924i(cls);
        c1538iG2.m2923h(bool);
    }
}
