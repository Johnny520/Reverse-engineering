package p000;

import android.app.AndroidAppHelper;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.github.cherrywechat.HookEntry;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.theme.ThemeProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: Qk */
/* JADX INFO: loaded from: classes.dex */
public final class C0715Qk extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HookEntry f2299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XC_LoadPackage.LoadPackageParam f2300b;

    public C0715Qk(HookEntry r1, XC_LoadPackage.LoadPackageParam r2) {
        this.f2299a = r1;
        this.f2300b = r2;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam r17) {
        super.afterHookedMethod(r17);
        if (r17 == null) goto L5;
        Object r0 = r17.thisObject;
    L6:
        AbstractC0295Gu.m625r(-509975826790453L);
        Application r02 = (Application) r0;
        String r3 = AbstractC1450gG.f5069c.getClass().getName();
        AbstractC0295Gu.m625r(-509688063981621L);
        final int r5 = 0;
        if (AbstractC2564tz.m5051L(r3, AbstractC0295Gu.m625r(-509743898556469L), false) == true) goto L9;
        ClassLoader r32 = r02.getClassLoader();
        AbstractC0295Gu.m625r(-509778258294837L);
        AbstractC0295Gu.m625r(-578454785357877L);
        AbstractC1450gG.f5069c = r32;
    L9:
        C1456gf.f5172p = r02;
        XC_LoadPackage.LoadPackageParam r03 = this.f2300b;
        String r33 = r03.processName;
        AbstractC0295Gu.m625r(-509864157640757L);
        ApplicationInfo r04 = r03.appInfo;
        AbstractC0295Gu.m625r(-508266429806645L);
        AbstractC0295Gu.m625r(-579275124111413L);
        AbstractC0295Gu.m625r(-579326663718965L);
        AbstractC0295Gu.m625r(-579172044896309L);
        AbstractC1450gG.f5071e = r33;
        AbstractC0295Gu.m625r(-579240764373045L);
        AbstractC1450gG.f5072f = r04;
        Context r34 = MainApplication.f5549a;
        if (r34 != null) goto L16;
        r34 = C1456gf.f5172p;
        if (r34 != null) goto L16;
        r34 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L16:
        PackageInfo r05 = r34.getPackageManager().getPackageInfo(r04.packageName, 0);
        AbstractC1450gG.f5067a = (int) r05.getLongVersionCode();
        String r06 = r05.versionName;
        AbstractC0295Gu.m625r(-578420425619509L);
        AbstractC1450gG.f5068b = r06;
        Method r07 = AssetManager.class.getDeclaredMethod(AbstractC0295Gu.m625r(-578983066335285L), new Class[]{String.class});
        final int r35 = 1;
        r07.setAccessible(true);
        Context r4 = MainApplication.f5549a;
        if (r4 != null) goto L23;
        r4 = C1456gf.f5172p;
        if (r4 != null) goto L23;
        r4 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L23:
        AssetManager r42 = r4.getAssets();
        String r8 = AbstractC1450gG.f5070d;
        if (r8 != null) goto L27;
        AbstractC0295Gu.m625r(-578489145096245L);
        r8 = null;
    L27:
        r07.invoke(r42, new Object[]{r8});
        Class r08 = AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-842487899879477L));
        Field r43 = r08.getDeclaredField(AbstractC0295Gu.m625r(-843140734908469L));     // Catch: Exception -> L83
        r43.setAccessible(true);     // Catch: Exception -> L83
        AbstractC0828TB.f2614f = r43.getInt(null);     // Catch: Exception -> L83
        Field r44 = r08.getDeclaredField(AbstractC0295Gu.m625r(-843162209744949L));     // Catch: Exception -> L83
        r44.setAccessible(true);     // Catch: Exception -> L83
        AbstractC0828TB.f2615g = r44.getInt(null);     // Catch: Exception -> L83
        Field r09 = r08.getDeclaredField(AbstractC0295Gu.m625r(-843183684581429L));     // Catch: Exception -> L83
        r09.setAccessible(true);     // Catch: Exception -> L83
        AbstractC0828TB.f2616h = r09.getInt(null);     // Catch: Exception -> L83
    L29:
        Context r010 = MainApplication.f5549a;
        if (r010 != null) goto L36;
        r010 = C1456gf.f5172p;
        if (r010 != null) goto L36;
        r010 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L36:
        String r45 = r010.getPackageName();
        r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-843209454385205L), AbstractC0295Gu.m625r(-843325418502197L), r45);
        AbstractC0828TB.f2617i = r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-842788547590197L), AbstractC0295Gu.m625r(-842887331838005L), r45);
        AbstractC0828TB.f2618j = r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-842900216739893L), AbstractC0295Gu.m625r(-842934576478261L), r45);
        r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-842947461380149L), AbstractC0295Gu.m625r(-843029065758773L), r45);
        r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-843046245627957L), AbstractC0295Gu.m625r(-841504352368693L), r45);
        r010.getResources().getIdentifier(AbstractC0295Gu.m625r(-841521532237877L), AbstractC0295Gu.m625r(-841611726551093L), r45);
        int r011 = 20;
        LinkedHashMap r46 = AbstractC1257cG.f4258a;     // Catch: Exception -> L44
        r46.clear();     // Catch: Exception -> L44
        AbstractC1257cG.f4259b = AbstractC1257cG.m2376d().getInt(AbstractC0295Gu.m625r(-584334595586101L), -1);     // Catch: Exception -> L44
        final int r82 = 4;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584356070422581L), new C1090ZF(r82));     // Catch: Exception -> L44
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583973818333237L), new C0309H7(17));     // Catch: Exception -> L44
        final int r10 = 28;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584042537809973L), new C0309H7(r10));     // Catch: Exception -> L44
        final int r11 = 10;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584751207413813L), new C1090ZF(r11));     // Catch: Exception -> L44
        final int r112 = 22;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584845696694325L), new C1090ZF(r112));     // Catch: Exception -> L44
        final int r12 = 24;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584454854670389L), new C1090ZF(r12));     // Catch: Exception -> L44
        final int r13 = 25;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-584600883558453L), new C1090ZF(r13));     // Catch: Exception -> L44
        final int r14 = 27;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583084760102965L), new C1090ZF(r14));     // Catch: Exception -> L44
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583209314154549L), new C1090ZF(r10));     // Catch: Exception -> L44
        final int r102 = 29;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582796997294133L), new C1090ZF(r102));     // Catch: Exception -> L44
        final int r15 = 15;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582904371476533L), new C1090ZF(r15));     // Catch: Exception -> L44
        final int r2 = 26;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583582976309301L), new C1090ZF(r2));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583724710230069L), new C1134aG(r5));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583823494477877L), new C1134aG(r35));     // Catch: Exception -> L43
        final int r9 = 2;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583385407813685L), new C1134aG(r9));     // Catch: Exception -> L43
        final int r92 = 3;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-583505666897973L), new C1134aG(r92));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581989543442485L), new C1134aG(r82));     // Catch: Exception -> L43
        final int r83 = 14;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582105507559477L), new C0309H7(r83));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581676010829877L), new C0309H7(r15));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581774795077685L), new C0309H7(16));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581882169260085L), new C0309H7(18));     // Catch: Exception -> L43
        final int r152 = 19;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582539299256373L), new C0309H7(r152));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582698213046325L), new C0309H7(r011));     // Catch: Exception -> L43
        final int r012 = 21;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582281601218613L), new C0309H7(r012));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-582406155270197L), new C0309H7(r112));     // Catch: Exception -> L43
        final int r113 = 23;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580847082141749L), new C0309H7(r113));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580984521095221L), new C0309H7(r12));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580572204234805L), new C0309H7(r13));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-580688168351797L), new C0309H7(r2));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581375363119157L), new C0309H7(r14));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-581508507105333L), new C0309H7(r102));     // Catch: Exception -> L43
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581096190244917L), new C1090ZF(r5));     // Catch: Exception -> L43
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581190679525429L), new C1090ZF(r35));     // Catch: Exception -> L43
        final int r52 = 2;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-581302348675125L), new C1090ZF(r52));     // Catch: Exception -> L43
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597326871656501L), new C1090ZF(r92));     // Catch: Exception -> L43
        final int r53 = 5;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597387001198645L), new C1090ZF(r53));     // Catch: Exception -> L43
        final int r54 = 6;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597494375381045L), new C1090ZF(r54));     // Catch: Exception -> L43
        final int r55 = 7;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597554504923189L), new C1090ZF(r55));     // Catch: Exception -> L43
        final int r56 = 8;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597077763553333L), new C1090ZF(r56));     // Catch: Exception -> L43
        final int r57 = 9;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597163662899253L), new C1090ZF(r57));     // Catch: Exception -> L43
        final int r58 = 11;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597202317604917L), new C1090ZF(r58));     // Catch: Exception -> L43
        final int r59 = 12;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597283921983541L), new C1090ZF(r59));     // Catch: Exception -> L43
        final int r510 = 13;
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597885217404981L), new C1090ZF(r510));     // Catch: Exception -> L43
        AbstractC1257cG.m2373a(AbstractC0295Gu.m625r(-597996886554677L), new C1090ZF(r83));     // Catch: Exception -> L43
        final int r511 = 16;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-598099965769781L), new C1090ZF(r511));     // Catch: Exception -> L43
        final int r512 = 17;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-597713418713141L), new C1090ZF(r512));     // Catch: Exception -> L43
        final int r513 = 18;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-597833677797429L), new C1090ZF(r513));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596369093949493L), new C1090ZF(r152));     // Catch: Exception -> L43
        final int r514 = 20;
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596485058066485L), new C1090ZF(r514));     // Catch: Exception -> L43
        AbstractC1257cG.m2374b(AbstractC0295Gu.m625r(-596124280813621L), new C1090ZF(r012));     // Catch: Exception -> L43
        String r013 = AbstractC0295Gu.m625r(-596785705777205L);     // Catch: Exception -> L43
        String r515 = null;
        r46.put(r013, new C1214bG(AbstractC1257cG.m2376d().getString(r013, null), r013, new C1090ZF(r113)));     // Catch: Exception -> L84
    L47:
        if (AbstractC1257cG.f4259b == 115) goto L49;
        String r014 = AbstractC0295Gu.m625r(-518814869485621L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r36 = AbstractC1450gG.f5067a;
        C1538iG r22 = new C1538iG(AbstractC1406fG.m2718r0(r014));
        r22.m2921f(AbstractC0295Gu.m625r(-518939423537205L));
        r22.m2916a(new C0556Mx(20));
        return;
    L49:
        ArrayList r015 = new ArrayList();
        String r23 = AbstractC1450gG.f5071e;
        if (r23 != null) goto L53;
        AbstractC0295Gu.m625r(-578570749474869L);
        r23 = r515;
    L53:
        HookEntry r6 = this.f2299a;
        if (AbstractC0585Nj.m1134a(r23, r6.f5515a) == true) goto L61;
        String r24 = AbstractC1450gG.f5071e;
        if (r24 != null) goto L60;
        AbstractC0295Gu.m625r(-578570749474869L);
        r24 = r515;
    L60:
        if (AbstractC0585Nj.m1134a(r24, r6.f5516b) == true) goto L61;
    L74:
        r015.add(C0603O0.f1943a);
        ArrayList r25 = new ArrayList();
        r25.add(C1337ds.f4821a);
        r25.add(C2111jp.f7426d);
        r25.add(C2111jp.f7425c);
        r25.add(C2111jp.f7424b);
        r25.add(C2111jp.f7427e);
        r015.addAll(r25);
        r015.addAll(AbstractC0714Qj.m1499u());
        Iterator r26 = r015.iterator();
    L76:
        if (r26.hasNext() == false) goto L99;
        AbstractC2700x5 r37 = (AbstractC2700x5) r26.next();
        r37.mo369a();     // Catch: Throwable -> L80
    L80:
        th = move-exception;
        int r47 = AbstractC1450gG.f5067a;
        AbstractC1450gG.f5073g.add(th);
        AbstractC0295Gu.m625r(-508326559348789L);
        r37.mo370b();
        goto L76
    L99:
        return;
    L61:
        C0183EA.f539a.getClass();
        SharedPreferences r27 = C0183EA.f544f;
        String r516 = r27.getString(AbstractC0295Gu.m625r(-795526727465013L), AbstractC0295Gu.m625r(-795556792236085L));
        if (r516 != null) goto L65;
        r516 = AbstractC0295Gu.m625r(-795565382170677L);
    L65:
        if (r516.equals(AbstractC0295Gu.m625r(-508300789545013L)) == true) goto L73;
        String r28 = r27.getString(AbstractC0295Gu.m625r(-795526727465013L), AbstractC0295Gu.m625r(-795556792236085L));
        if (r28 != null) goto L69;
        r28 = AbstractC0295Gu.m625r(-795565382170677L);
    L69:
        C0183EA.m383k(r28);
        HashMap r29 = AbstractC0999XA.f3193a;
        String r210 = C0183EA.m378f(C0183EA.m373a());
        AbstractC0295Gu.m625r(-793709956298805L);
        if (ThemeProvider.installTheme(r210, AbstractC0999XA.f3193a, AbstractC0999XA.f3194b) == false) goto L72;
        ArrayList r211 = new ArrayList();
        r211.add(C2128k5.f7460b);
        r211.add(C2128k5.f7470l);
        r211.add(C2128k5.f7469k);
        r211.add(C2128k5.f7462d);
        r211.add(C2128k5.f7464f);
        r211.add(C2128k5.f7463e);
        r211.add(C2128k5.f7468j);
        r211.add(C2128k5.f7465g);
        r211.add(C2128k5.f7461c);
        r211.add(C1213bF.f4144a);
        r211.add(C2128k5.f7467i);
        r211.add(C2128k5.f7466h);
        r211.add(C1339du.f4823a);
        r015.addAll(r211);
        goto L74
    L72:
        C0183EA.m383k(AbstractC0295Gu.m625r(-508309379479605L));
        goto L74
    L73:
        C0183EA.m383k(AbstractC0295Gu.m625r(-508317969414197L));
    L45:
        AbstractC0295Gu.m625r(-596863015188533L);
    L43:
        r515 = null;
    L44:
        r515 = null;
        goto L45
    L5:
        r0 = null;
        goto L6
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam r7) {
        super.beforeHookedMethod(r7);
        Object r72 = r7.args[0];
        AbstractC0295Gu.m625r(-509078178625589L);
        int r0 = AbstractC1450gG.f5067a;
        ClassLoader r73 = ((Context) r72).getClassLoader();
        AbstractC0295Gu.m625r(-509340171630645L);
        AbstractC0295Gu.m625r(-578454785357877L);
        AbstractC1450gG.f5069c = r73;
        String r74 = AbstractC0295Gu.m625r(-508975099410485L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r2 = new C1538iG(AbstractC1406fG.m2718r0(r74));
        r2.m2921f(AbstractC0295Gu.m625r(-508670156732469L));
        Class r75 = Boolean.TYPE;
        r2.m2924i(r75);
        Boolean r3 = Boolean.FALSE;
        r2.m2923h(r3);
        String r22 = AbstractC0295Gu.m625r(-507175508113461L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r02 = new C1538iG(AbstractC1406fG.m2718r0(r22));
        r02.m2921f(AbstractC0295Gu.m625r(-507420321249333L));
        r02.m2924i(r75);
        r02.m2923h(r3);
    }
}
