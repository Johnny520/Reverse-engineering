package p001A0;

import android.content.Context;
import com.p055lu.wxmask.MainHook;
import com.p055lu.wxmask.config.AppConfigUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.luckypray.dexkit.DexKitBridge;
import p005C0.C0071e;
import p009E0.C0103c;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p038T0.C0282g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0294d;
import p040U0.C0297g;
import p043W0.C0353a;
import p047Z0.C0361a;
import p047Z0.C0362b;
import p050a1.C0368a;
import p050a1.C0369b;
import p052b1.C0499d;
import p052b1.C0505j;
import p052b1.C0506k;
import p059d0.InterfaceC0518c;
import p070i0.AbstractC0731a;
import p077m0.InterfaceC0765c;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0026a implements InterfaceC0204l, InterfaceC0518c, InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.a.c(java.lang.Object):java.lang.Object, A0.h.a(java.lang.Object):java.lang.Object, A0.h.j(java.lang.Object):java.lang.Object, A0.m.run():void, C0.d.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, c0.f.<clinit>():void, com.lu.wxmask.MainHook.handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, com.lu.wxmask.config.AppConfigUtil.<clinit>():void, q0.d.c(java.lang.Object):java.lang.Object, r0.A1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.H0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.L0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.f1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void] */
    public /* synthetic */ C0026a(int i2) {
        this.f203a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) {
        switch (this.f203a) {
            case 20:
                C0071e c0071e = C0071e.f323a;
                return C0071e.m153a((Method) accessibleObject);
            case 26:
                Method method = (Method) accessibleObject;
                if (AbstractC0223g.m414a(method.getName(), "rawQueryWithFactory")) {
                    AbstractC0731a.m1384a("rawQueryWithFactory", Integer.valueOf(method.getParameterTypes().length));
                    if (method.getParameterTypes().length == 4) {
                        return true;
                    }
                }
                return false;
            default:
                return InterfaceC0765c.m1428a("com.tencent.mm.contact.d").isAssignableFrom(((Field) accessibleObject).getType());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.lu.wxmask.config.AppConfigUtil.a():z0.x */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f203a) {
            case 25:
                return AppConfigUtil.releaseNoteExpiredSetting_delegate$lambda$0();
            default:
                return new C0297g("^SELECT (FTS5MetaContact|FTS5MetaTopHits|FTS5MetaKefuContact|FTS5MetaFeature|FTS5MetaWeApp|FTS5MetaFinderFollow|FTS5MetaFavorite)\\.docid, type, subtype, entity_id, aux_index,.*");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8c(Object obj) {
        Object next;
        C0505j c0505j;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        boolean z2;
        switch (this.f203a) {
            case 0:
                DexKitBridge dexKitBridge = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge, "bridge");
                C0353a c0353a = new C0353a(1);
                C0362b c0362b = new C0362b();
                c0362b.m626d0("MsgInfo processAddMsg insert db error");
                c0353a.f828f = c0362b;
                List listM281w0 = AbstractC0123k.m281w0(dexKitBridge.m1442e(c0353a));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM281w0) {
                    String strM1007c = ((C0505j) obj2).m1007c();
                    int iM517o0 = AbstractC0299i.m517o0(strM1007c, ')', 0, 6);
                    if (iM517o0 > 2 && AbstractC0307q.m538h0(strM1007c, false, "(L")) {
                        String strSubstring = strM1007c.substring(1, iM517o0);
                        AbstractC0223g.m417d(strSubstring, "substring(...)");
                        int i2 = 0;
                        for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                            if (strSubstring.charAt(i3) == ';') {
                                i2++;
                            }
                        }
                        if (i2 == 1) {
                            arrayList.add(obj2);
                        }
                    }
                }
                C0505j c0505j2 = (C0505j) AbstractC0123k.m268j0(AbstractC0123k.m276r0(arrayList, new C0033f(2, new C0033f(1, new C0032e(1)))));
                C0030c c0030c = c0505j2 != null ? new C0030c(c0505j2.m1006b().f1869a, c0505j2.m1006b().f1870b, c0505j2.m1007c()) : null;
                if (c0030c == null) {
                    AbstractC0731a.m1387d("anti revoke storage dexkit no valid candidate", AbstractC0123k.m271m0(listM281w0, ";", null, null, new C0026a(3), 30));
                }
                return c0030c;
            case 1:
                DexKitBridge dexKitBridge2 = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge2, "bridge");
                C0353a c0353a2 = new C0353a(1);
                C0362b c0362b2 = new C0362b();
                c0362b2.m626d0("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s");
                c0353a2.f828f = c0362b2;
                List<C0505j> listM281w02 = AbstractC0123k.m281w0(dexKitBridge2.m1442e(c0353a2));
                if (listM281w02.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(listM281w02));
                for (C0505j c0505j3 : listM281w02) {
                    int i4 = AbstractC0223g.m414a(c0505j3.m1007c(), "(Ljava/lang/String;JLcom/tencent/mm/modelbase/p0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V") ? 100 : 0;
                    if (AbstractC0299i.m511i0(c0505j3.m1007c(), "Lcom/tencent/mm/modelbase/p0;", false)) {
                        i4 += 30;
                    }
                    if (AbstractC0307q.m538h0(c0505j3.m1007c(), false, "(Ljava/lang/String;J")) {
                        i4 += 20;
                    }
                    if (AbstractC0307q.m532b0(c0505j3.m1007c(), ";)V")) {
                        i4 += 10;
                    }
                    C0282g c0282g = new C0282g(C0297g.m501c(new C0297g("Ljava/lang/String;"), c0505j3.m1007c()));
                    int i5 = 0;
                    while (c0282g.hasNext()) {
                        c0282g.next();
                        i5++;
                        if (i5 < 0) {
                            AbstractC0124l.m287a0();
                            throw null;
                        }
                    }
                    if (i5 >= 4) {
                        i4 += 10;
                    }
                    if (AbstractC0307q.m538h0(c0505j3.m1006b().f1869a, false, "com.tencent.mm")) {
                        i4 += 5;
                    }
                    if (AbstractC0299i.m511i0(c0505j3.m1006b().f1869a, "revoke", true) || AbstractC0299i.m511i0(c0505j3.m1006b().f1870b, "revoke", true)) {
                        i4 += 5;
                    }
                    arrayList2.add(new C0103c(c0505j3, Integer.valueOf(i4)));
                }
                List listM276r0 = AbstractC0123k.m276r0(arrayList2, new C0033f(0, new C0032e(0)));
                Iterator it = listM276r0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((Number) ((C0103c) next).f395b).intValue() > 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                C0103c c0103c = (C0103c) next;
                if (c0103c == null || (c0505j = (C0505j) c0103c.f394a) == null) {
                    AbstractC0731a.m1387d("anti revoke dexkit no valid candidate", AbstractC0123k.m271m0(listM281w02, ";", null, null, new C0026a(4), 30));
                    return null;
                }
                if (listM276r0.size() > 1) {
                    AbstractC0731a.m1387d("anti revoke dexkit candidates", AbstractC0123k.m271m0(AbstractC0123k.m277s0(listM276r0, 8), ";", null, null, new C0026a(5), 30));
                }
                return new C0028b(c0505j.m1006b().f1869a, c0505j.m1006b().f1870b, c0505j.m1007c());
            case 2:
                DexKitBridge dexKitBridge3 = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge3, "bridge");
                C0353a c0353a3 = new C0353a(1);
                c0353a3.f827e = AbstractC0120h.m262j0(new String[]{"com.tencent.mm.sdk.platformtools"});
                C0362b c0362b3 = new C0362b();
                c0362b3.m626d0("MicroMsg.SDK.XmlParser", "[ %s ]");
                c0353a3.f828f = c0362b3;
                List listM281w03 = AbstractC0123k.m281w0(dexKitBridge3.m1442e(c0353a3));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listM281w03) {
                    C0505j c0505j4 = (C0505j) obj3;
                    if (AbstractC0307q.m538h0(c0505j4.m1007c(), false, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)") && AbstractC0299i.m511i0(c0505j4.m1007c(), "Ljava/util/", false)) {
                        arrayList3.add(obj3);
                    }
                }
                C0505j c0505j5 = (C0505j) AbstractC0123k.m268j0(AbstractC0123k.m276r0(arrayList3, new C0033f(4, new C0033f(3, new C0032e(2)))));
                if (c0505j5 != null) {
                    return new C0031d(c0505j5.m1006b().f1869a, c0505j5.m1006b().f1870b, c0505j5.m1007c());
                }
                return null;
            case 3:
                C0505j c0505j6 = (C0505j) obj;
                AbstractC0223g.m418e(c0505j6, "it");
                return c0505j6.m1006b().f1869a + "#" + c0505j6.m1006b().f1870b + c0505j6.m1007c();
            case 4:
                C0505j c0505j7 = (C0505j) obj;
                AbstractC0223g.m418e(c0505j7, "it");
                return c0505j7.m1006b().f1869a + "#" + c0505j7.m1006b().f1870b + c0505j7.m1007c();
            case 5:
                C0103c c0103c2 = (C0103c) obj;
                AbstractC0223g.m418e(c0103c2, "it");
                C0505j c0505j8 = (C0505j) c0103c2.f394a;
                String str = c0505j8.m1006b().f1869a;
                String str2 = c0505j8.m1006b().f1870b;
                String strM1007c2 = c0505j8.m1007c();
                StringBuilder sb = new StringBuilder();
                sb.append(c0103c2.f395b);
                sb.append(":");
                sb.append(str);
                sb.append("#");
                return AbstractC0174d.m356l(sb, str2, strM1007c2);
            case 6:
                return ((Class) obj).getName();
            case 7:
                Class cls = (Class) obj;
                AbstractC0223g.m418e(cls, "it");
                return cls.getName();
            case 8:
                Class cls2 = (Class) obj;
                AbstractC0223g.m418e(cls2, "it");
                return cls2.getName();
            case 9:
                Class cls3 = (Class) obj;
                AbstractC0223g.m418e(cls3, "it");
                return cls3.getName();
            case 10:
                Class cls4 = (Class) obj;
                AbstractC0223g.m418e(cls4, "clazz");
                return cls4.getName();
            case 11:
                Class cls5 = (Class) obj;
                AbstractC0223g.m418e(cls5, "clazz");
                return cls5.getName();
            case 12:
                Class cls6 = (Class) obj;
                AbstractC0223g.m418e(cls6, "clazz");
                return cls6.getName();
            case 13:
                return ((Class) obj).getName();
            case 14:
                Class cls7 = (Class) obj;
                AbstractC0223g.m418e(cls7, "it");
                return cls7.getName();
            case 15:
                Class cls8 = (Class) obj;
                AbstractC0223g.m418e(cls8, "it");
                return cls8.getName();
            case 16:
                AbstractC0223g.m418e((Context) obj, "it");
                return C0109i.f404a;
            case 17:
                DexKitBridge dexKitBridge4 = (DexKitBridge) obj;
                AbstractC0223g.m418e(dexKitBridge4, "bridge");
                C0353a c0353a4 = new C0353a(1);
                c0353a4.f827e = AbstractC0120h.m262j0(new String[]{"com.tencent.mm.pluginsdk.ui.chat"});
                C0362b c0362b4 = new C0362b();
                c0362b4.m626d0("MicroMsg.ChatFooter", "send msg onClick");
                c0353a4.f828f = c0362b4;
                C0506k<C0505j> c0506kM1442e = dexKitBridge4.m1442e(c0353a4);
                Iterator it2 = c0506kM1442e.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        C0505j c0505j9 = (C0505j) next2;
                        String str3 = (!AbstractC0223g.m414a(c0505j9.m1006b().f1870b, "onClick") ? 1 : 0) + ":" + c0505j9.m1006b().f1869a + "#" + c0505j9.m1006b().f1870b + c0505j9.m1007c();
                        do {
                            Object next7 = it2.next();
                            C0505j c0505j10 = (C0505j) next7;
                            String str4 = (!AbstractC0223g.m414a(c0505j10.m1006b().f1870b, "onClick") ? 1 : 0) + ":" + c0505j10.m1006b().f1869a + "#" + c0505j10.m1006b().f1870b + c0505j10.m1007c();
                            if (str3.compareTo(str4) > 0) {
                                str3 = str4;
                                next2 = next7;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                C0505j c0505j11 = (C0505j) next2;
                if (c0505j11 == null) {
                    AbstractC0731a.m1387d("read trace send click method not found");
                } else {
                    ArrayList arrayList4 = new ArrayList(AbstractC0125m.m289c0(c0506kM1442e));
                    for (C0505j c0505j12 : c0506kM1442e) {
                        arrayList4.add(new C0019T(c0505j12.m1006b().f1869a, c0505j12.m1006b().f1870b, c0505j12.m1007c()));
                    }
                    List listM281w04 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4));
                    C0353a c0353a5 = new C0353a(0);
                    C0361a c0361a = new C0361a();
                    c0361a.m619a0("<appmsg appid=\"", "parse amessage xml failed");
                    c0353a5.f828f = c0361a;
                    Iterator it3 = dexKitBridge4.m1441d(c0353a5).iterator();
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (it3.hasNext()) {
                            String str5 = ((C0499d) next3).m962b().f1863a;
                            do {
                                Object next8 = it3.next();
                                String str6 = ((C0499d) next8).m962b().f1863a;
                                if (str5.compareTo(str6) > 0) {
                                    next3 = next8;
                                    str5 = str6;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    C0499d c0499d = (C0499d) next3;
                    if (c0499d == null) {
                        AbstractC0731a.m1387d("read trace appmsg content class not found");
                    } else {
                        C0353a c0353a6 = new C0353a(0);
                        C0361a c0361a2 = new C0361a();
                        c0361a2.m619a0("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath");
                        c0353a6.f828f = c0361a2;
                        Iterator it4 = dexKitBridge4.m1441d(c0353a6).iterator();
                        if (it4.hasNext()) {
                            next4 = it4.next();
                            if (it4.hasNext()) {
                                String str7 = ((C0499d) next4).m962b().f1863a;
                                do {
                                    Object next9 = it4.next();
                                    String str8 = ((C0499d) next9).m962b().f1863a;
                                    if (str7.compareTo(str8) > 0) {
                                        next4 = next9;
                                        str7 = str8;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next4 = null;
                        }
                        C0499d c0499d2 = (C0499d) next4;
                        if (c0499d2 == null) {
                            AbstractC0731a.m1387d("read trace appmsg logic class not found");
                        } else {
                            C0353a c0353a7 = new C0353a(1);
                            C0362b c0362b5 = new C0362b();
                            C0362b.m620Y(c0362b5, c0499d.m962b().f1863a);
                            C0362b.m621a0(c0362b5, 9);
                            c0362b5.m625c0(String.class.getName());
                            String str9 = c0499d.m962b().f1863a;
                            AbstractC0223g.m418e(str9, "typeName");
                            C0361a c0361a3 = new C0361a();
                            c0361a3.m617Y(str9, 5, false);
                            c0362b5.f853g = c0361a3;
                            ArrayList arrayList5 = new ArrayList(1);
                            arrayList5.add(new C0369b(new String[]{"parse msg failed"}[0]));
                            c0362b5.f855i = AbstractC0123k.m283y0(arrayList5);
                            c0353a7.f828f = c0362b5;
                            Iterator it5 = dexKitBridge4.m1442e(c0353a7).iterator();
                            if (it5.hasNext()) {
                                next5 = it5.next();
                                if (it5.hasNext()) {
                                    C0505j c0505j13 = (C0505j) next5;
                                    String str10 = c0505j13.m1006b().f1869a + "#" + c0505j13.m1006b().f1870b + c0505j13.m1007c();
                                    do {
                                        Object next10 = it5.next();
                                        C0505j c0505j14 = (C0505j) next10;
                                        String str11 = c0505j14.m1006b().f1869a + "#" + c0505j14.m1006b().f1870b + c0505j14.m1007c();
                                        if (str10.compareTo(str11) > 0) {
                                            next5 = next10;
                                            str10 = str11;
                                        }
                                    } while (it5.hasNext());
                                }
                            } else {
                                next5 = null;
                            }
                            C0505j c0505j15 = (C0505j) next5;
                            if (c0505j15 == null) {
                                AbstractC0731a.m1387d("read trace parse xml method not found");
                            } else {
                                C0353a c0353a8 = new C0353a(1);
                                C0362b c0362b6 = new C0362b();
                                C0362b.m620Y(c0362b6, c0499d2.m962b().f1863a);
                                C0362b.m621a0(c0362b6, 8);
                                if (c0362b6.f854h == null) {
                                    c0362b6.f854h = new C0353a(2);
                                }
                                C0353a c0353a9 = c0362b6.f854h;
                                AbstractC0223g.m415b(c0353a9);
                                C0368a c0368a = new C0368a(1);
                                c0368a.f864e = 6;
                                c0368a.f865f = 6;
                                c0353a9.f828f = c0368a;
                                c0362b6.m625c0(c0499d.m962b().f1863a, String.class.getName(), null, null, null, null);
                                c0353a8.f828f = c0362b6;
                                Iterator it6 = dexKitBridge4.m1442e(c0353a8).iterator();
                                if (it6.hasNext()) {
                                    next6 = it6.next();
                                    if (it6.hasNext()) {
                                        C0505j c0505j16 = (C0505j) next6;
                                        String str12 = c0505j16.m1006b().f1869a + "#" + c0505j16.m1006b().f1870b + c0505j16.m1007c();
                                        do {
                                            Object next11 = it6.next();
                                            C0505j c0505j17 = (C0505j) next11;
                                            String str13 = c0505j17.m1006b().f1869a + "#" + c0505j17.m1006b().f1870b + c0505j17.m1007c();
                                            if (str12.compareTo(str13) > 0) {
                                                next6 = next11;
                                                str12 = str13;
                                            }
                                        } while (it6.hasNext());
                                    }
                                } else {
                                    next6 = null;
                                }
                                C0505j c0505j18 = (C0505j) next6;
                                if (c0505j18 != null) {
                                    return new C0018S(c0505j11.m1006b().f1869a, c0505j11.m1006b().f1870b, c0505j11.m1007c(), listM281w04, c0499d.m962b().f1863a, c0505j15.m1006b().f1870b, c0505j15.m1007c(), c0499d2.m962b().f1863a, c0505j18.m1006b().f1870b, c0505j18.m1007c());
                                }
                                AbstractC0731a.m1387d("read trace send appmsg method not found");
                            }
                        }
                    }
                }
                return null;
            case 18:
                C0294d c0294d = (C0294d) obj;
                AbstractC0223g.m418e(c0294d, "it");
                String strGroup = c0294d.f670a.group();
                AbstractC0223g.m417d(strGroup, "group(...)");
                return strGroup;
            case 19:
                String str14 = (String) obj;
                AbstractC0223g.m418e(str14, "it");
                if (!AbstractC0307q.m538h0(str14, false, "com.tencent.mm")) {
                    Pattern patternCompile = Pattern.compile("[a-z]{2,4}\\d?\\.[a-zA-Z_$][\\w$]*");
                    AbstractC0223g.m417d(patternCompile, "compile(...)");
                    z2 = patternCompile.matcher(str14).matches();
                }
                return Boolean.valueOf(z2);
            default:
                String str15 = (String) obj;
                AbstractC0223g.m418e(str15, "it");
                return "\"" + str15 + "\"";
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.lu.wxmask.MainHook.b(java.lang.Throwable):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m9d(Throwable th) {
        switch (this.f203a) {
            case 21:
                th.printStackTrace();
                break;
            default:
                MainHook.lambda$handleLoadPackage$0(th);
                break;
        }
    }
}
