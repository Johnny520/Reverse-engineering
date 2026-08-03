package p050c0;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p006D.RunnableC0129u;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;
import p052d0.C0758s;

/* JADX INFO: renamed from: c0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0665j extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2066b;

    public /* synthetic */ C0665j(int r1, boolean r2) {
        this.f2066b = r1;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r20) {
        String r1 = "";
        int r7 = 1;
        ViewGroup r8 = null;
        Object r82 = null;
        SharedPreferences r83 = null;
        Menu r84 = null;
        ViewGroup r85 = null;
        ViewGroup r86 = null;
        ViewGroup r87 = null;
        switch(this.f2066b) {
            case 2: goto L301;
            case 3: goto L4;
            case 4: goto L4;
            case 5: goto L258;
            case 6: goto L4;
            case 7: goto L4;
            case 8: goto L4;
            case 9: goto L4;
            case 10: goto L4;
            case 11: goto L255;
            case 12: goto L253;
            case 13: goto L246;
            case 14: goto L239;
            case 15: goto L227;
            case 16: goto L225;
            case 17: goto L4;
            case 18: goto L223;
            case 19: goto L4;
            case 20: goto L213;
            case 21: goto L4;
            case 22: goto L4;
            case 23: goto L208;
            case 24: goto L203;
            case 25: goto L119;
            case 26: goto L111;
            case 27: goto L10;
            case 28: goto L4;
            case 29: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0709x1 r12 = C0703v1.m1792a();
        if (r12.f2230a == false) goto L381;
        C0706w1.m1797a(C0706w1.f2217a, r20.f2669b, r12.f2231b);
        return;
    L381:
        return;
    L10:
        C0688q1 r13 = C0688q1.f2163a;
        Object r02 = r20.f2669b;
        if (r02 == null) goto L385;
        C0139e r14 = (C0139e) C0688q1.f2173k.remove(r02);
        InterfaceC0286l r2 = (InterfaceC0286l) C0688q1.f2174l.remove(r02);
        if (r14 != null) goto L17;
        if (r2 != null) goto L17;
        return;
    L17:
        if (r14 == null) goto L19;
        String r15 = (String) r14.f328a;
    L20:
        Object r4 = C0688q1.m1776m(r02, "r");
        if (r4 != null) goto L26;
        r4 = C0688q1.m1776m(r02, "f150798r");
        if (r4 != null) goto L26;
        r4 = C0688q1.m1776m(r02, "f150798R");
    L26:
        if (r4 == null) goto L48;
        String r11 = C0688q1.m1777n(r4, "f231704f");
        if (r11 != null) goto L30;
    L37:
        r11 = C0688q1.m1777n(r4, "f");
        if (r11 != null) goto L40;
    L45:
        r11 = C0688q1.m1775l(r4);
        if (r11 == null) goto L48;
    L78:
        if (r11 != null) goto L80;
    L83:
        AbstractC0685p1 r42 = C0682o1.f2140a;
    L363:
        Object r3 = C0688q1.m1776m(r02, "r");     // Catch: Throwable -> L90
        if (r3 != null) goto L87;
        r3 = C0688q1.m1776m(r02, "f150798r");     // Catch: Throwable -> L90
    L87:
        if (r3 == null) goto L92;
        Object r03 = r3.getClass().getName();     // Catch: Throwable -> L90
    L95:
        if ((r03 instanceof C0140f) == true) goto L98;
        r82 = r03;
    L98:
        C0688q1.m1782s("cgi cb sender=" + r15 + " name=" + r11 + " result=" + r42.getClass().getSimpleName() + " resp=" + ((String) r82));
        boolean r04 = r42 instanceof C0679n1;
        if (r04 == false) goto L102;
        if (r15 == null) goto L102;
        C0688q1.f2170h.put(r15, ((C0679n1) r42).f2136a);
        C0688q1.m1780q();
    L102:
        if (r2 != null) goto L359;
        if (r04 == false) goto L383;
        if (r15 == null) goto L384;
        C0688q1.f2169g.post(new RunnableC0673l1(r15, r42, r7));
        return;
    L384:
        return;
    L383:
        return;
    L359:
        r2.invoke(r42);     // Catch: Throwable -> L105
        return;
    L105:
        th = move-exception;
        AbstractC0040p.m116u(th);
        return;
    L92:
        r03 = null;
    L90:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L95
    L80:
        if (AbstractC0425j.m1013R0(r11) == true) goto L83;
        r42 = new C0679n1(AbstractC0425j.m1022a1(r11).toString());
        goto L363
    L40:
        if (C0688q1.m1774j(r11) == true) goto L43;
        r11 = null;
    L43:
        if (r11 == null) goto L45;
    L30:
        if ((!AbstractC0425j.m1013R0(r11)) == true) goto L32;
    L34:
        r11 = null;
    L35:
        if (r11 == null) goto L37;
    L32:
        if (r11.length() > 16) goto L34;
    L48:
        Object r43 = C0688q1.m1776m(r02, "f206693n");
        if (r43 != null) goto L51;
        r43 = C0688q1.m1776m(r02, "n");
    L51:
        if (r43 == null) goto L74;
        Object r112 = C0688q1.m1776m(r43, "f66769b");
        if (r112 != null) goto L57;
        r112 = C0688q1.m1776m(r43, "b");
        if (r112 != null) goto L57;
        Object r44 = null;
    L60:
        if (r44 == null) goto L74;
        String r10 = C0688q1.m1777n(r44, "f231704f");
        if (r10 != null) goto L64;
    L71:
        r11 = C0688q1.m1775l(r44);
        if (r11 == null) goto L74;
    L64:
        if ((!AbstractC0425j.m1013R0(r10)) == true) goto L66;
    L68:
        r11 = null;
    L69:
        if (r11 == null) goto L71;
    L66:
        if (r10.length() > 16) goto L68;
        r11 = r10;
    L57:
        r44 = C0688q1.m1776m(r112, "f66756a");
        if (r44 != null) goto L60;
        r44 = C0688q1.m1776m(r112, "a");
    L74:
        r11 = C0688q1.m1775l(r02);
        if (r11 != null) goto L78;
        r11 = null;
        goto L78
    L19:
        r15 = null;
        goto L20
    L385:
        return;
    L111:
        WeakReference r16 = C0670k1.f2090g;
        if (r16 == null) goto L114;
        Object r17 = r16.get();
    L116:
        if (r17 != r20.f2669b) goto L388;
        C0670k1.f2090g = new WeakReference(null);
        return;
    L388:
        return;
    L114:
        r17 = null;
        goto L116
    L119:
        Object r102 = r20.f2672e;
        if ((r102 instanceof Number) == false) goto L122;
        Number r103 = (Number) r102;
    L123:
        if (r103 != null) goto L125;
    L127:
        Object[] r5 = r20.f2670c;
        AbstractC0307g.m702d(r5, "args");
        int r6 = r5.length;
        int r113 = 0;
    L128:
        if (r113 >= r6) goto L133;
        Object r122 = r5[r113];
        if ((r122 instanceof String) == true) goto L135;
        r113 = r113 + 1;
    L135:
        if ((r122 instanceof String) == false) goto L137;
        String r123 = (String) r122;
    L138:
        if (r123 != null) goto L141;
        return;
    L141:
        if (r123.equals("message") == false) goto L397;
        Object[] r05 = r20.f2670c;
        AbstractC0307g.m702d(r05, "args");
        int r45 = r05.length;
        int r52 = 0;
    L144:
        if (r52 >= r45) goto L149;
        Object r62 = r05[r52];
        if ((r62 instanceof ContentValues) == true) goto L151;
        r52 = r52 + 1;
    L151:
        if ((r62 instanceof ContentValues) == false) goto L153;
        ContentValues r63 = (ContentValues) r62;
    L154:
        if (r63 == null) goto L398;
        C0595I0 r06 = C0595I0.f1818a;
        C0598J0 r07 = C0586F0.m1413a();     // Catch: Throwable -> L165
        if (r07.f1828a == true) goto L160;
        return;
    L160:
        if (r07.f1829b == false) goto L390;
        Integer r08 = r63.getAsInteger("isSend");     // Catch: Throwable -> L165
        if (r08 == null) goto L167;
    L164:
        int r09 = r08.intValue();     // Catch: Throwable -> L165
    L171:
        if (r09 != 1) goto L391;
        Integer r010 = r63.getAsInteger("type");     // Catch: Throwable -> L165
        if (r010 == null) goto L176;
    L175:
        int r011 = r010.intValue();     // Catch: Throwable -> L165
        String r32 = r63.getAsString("content");     // Catch: Throwable -> L165
        if (r32 != null) goto L185;
        String r22 = r63.getAsString("field_content");     // Catch: Throwable -> L165
        if (r22 == null) goto L187;
        r1 = r22;
    L187:
        if (C0595I0.f1822e.m1788c(C0595I0.m1480h(r63, r011, r1)) == false) goto L393;
        Context r23 = C0595I0.f1824g;     // Catch: Throwable -> L165
        if (r23 == null) goto L192;
        r83 = r23.getSharedPreferences("abc_input_stats", 0);     // Catch: Throwable -> L165
    L192:
        if (r83 == null) goto L394;
        String r24 = LocalDate.now().toString();     // Catch: Throwable -> L165
        AbstractC0307g.m702d(r24, "toString(...)");     // Catch: Throwable -> L165
        C0595I0.m1481i(r83, AbstractC0358S.m877b(C0595I0.m1479g(r83, r24), r011, r1));     // Catch: Throwable -> L165
        View r012 = C0595I0.f1825h;     // Catch: Throwable -> L165
        if (r012 == null) goto L198;
        r012.post(new RunnableC0129u(r012, 3));     // Catch: Throwable -> L165
    L198:
        Object r013 = C0146l.f339a;     // Catch: Throwable -> L165
    L201:
        AbstractC0141g.m465a(r013);
        return;
    L394:
        return;
    L393:
        return;
    L185:
        r1 = r32;
        goto L187
    L176:
        r010 = r63.getAsInteger("field_type");     // Catch: Throwable -> L165
        if (r010 != null) goto L175;
        return;
    L391:
        return;
    L167:
        r08 = r63.getAsInteger("field_isSend");     // Catch: Throwable -> L165
        if (r08 != null) goto L164;
        r09 = 0;
        goto L171
    L390:
        return;
    L165:
        th = move-exception;
        r013 = AbstractC0040p.m116u(th);
        goto L201
    L398:
        return;
    L153:
        r63 = null;
        goto L154
    L149:
        r62 = null;
        goto L151
    L397:
        return;
    L137:
        r123 = null;
        goto L138
    L133:
        r122 = null;
        goto L135
    L125:
        if (r103.longValue() > 0) goto L127;
        return;
    L122:
        r103 = null;
        goto L123
    L203:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L399;
        C0687q0.m1756c(r20.f2669b);
        return;
    L399:
        return;
    L208:
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L400;
        C0687q0.m1756c(r20.f2669b);
        return;
    L400:
        return;
    L213:
        C0678n0 r18 = C0678n0.f2116a;
        if (C0678n0.m1725p() == false) goto L401;
        Object r014 = r20.f2669b;
        if ((r014 instanceof Menu) == false) goto L219;
        r84 = (Menu) r014;
    L219:
        if (r84 == null) goto L402;
        C0678n0.m1713b(r18, r84);
        return;
    L402:
        return;
    L401:
        return;
    L223:
        C0639a0 r19 = C0639a0.f1967a;
        C0639a0.f1962B = r20.f2669b;
        return;
    L225:
        C0639a0.f1961A = r20.f2669b;
        return;
    L227:
        Object r015 = r20.f2669b;
        if ((r015 instanceof ViewGroup) == false) goto L230;
        r85 = (ViewGroup) r015;
    L230:
        if (r85 == null) goto L403;
        C0594I r016 = C0594I.f1812a;
        Class<?> r017 = r85.getClass();
    L233:
        if (r017 == null) goto L404;
        if (r017.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView") == true) goto L236;
        r017 = r017.getSuperclass();
        goto L233
    L236:
        C0594I.m1469a(r85);
        return;
    L404:
        return;
    L403:
        return;
    L239:
        Object r018 = r20.f2669b;
        if ((r018 instanceof ViewGroup) == false) goto L242;
        r86 = (ViewGroup) r018;
    L242:
        if (r86 == null) goto L405;
        C0594I.m1469a(r86);
        return;
    L405:
        return;
    L246:
        Object r019 = r20.f2669b;
        if ((r019 instanceof ViewGroup) == false) goto L249;
        r87 = (ViewGroup) r019;
    L249:
        if (r87 == null) goto L406;
        C0594I.m1469a(r87);
        return;
    L406:
        return;
    L253:
        C0710y.m1807b();
        return;
    L255:
        C0710y.m1807b();
        return;
    L301:
        Object[] r72 = r20.f2670c;
        AbstractC0307g.m702d(r72, "args");
        Object r46 = AbstractC0179j.m536m0(r72);
        if (r46 == null) goto L411;
        AtomicBoolean r73 = C0677n.f2105a;
        C0677n.f2114j = r20.f2669b;
        AtomicBoolean r020 = C0677n.f2105a;
        Object r021 = C0677n.m1694c(r46, "field_type");
        if ((r021 instanceof Number) == false) goto L307;
        Number r022 = (Number) r021;
    L308:
        if (r022 == null) goto L310;
        Integer r023 = Integer.valueOf(r022.intValue());
    L311:
        if (r023 == null) goto L358;
        int r114 = r023.intValue();
        Object r024 = C0677n.m1694c(r46, "field_content");
        if ((r024 instanceof String) == false) goto L315;
        String r025 = (String) r024;
    L316:
        if (r025 != null) goto L318;
        String r124 = "";
    L319:
        Object r026 = C0677n.m1694c(r46, "field_talker");
        if ((r026 instanceof String) == false) goto L322;
        String r027 = (String) r026;
    L323:
        Long r110 = C0677n.m1701j(r46, "field_msgSvrId");
        if (r110 == null) goto L326;
    L325:
        long r111 = r110.longValue();
    L330:
        String r33 = AbstractC0680o.m1740c(r124);
        if (r33 != null) goto L339;
        if (r027 != null) goto L334;
    L338:
        String r162 = null;
    L340:
        Long r74 = C0677n.m1701j(r46, "field_createTime");
        if (r74 == null) goto L343;
        long r142 = r74.longValue();
    L344:
        C0652e1 r34 = new C0652e1(r114, r124, r027, r142, r162, r111);
        Long r75 = C0677n.m1701j(r46, "field_msgId");
        if (r75 == null) goto L347;
        long r76 = r75.longValue();
    L348:
        C0677n.m1704m(r34, r76, r111, r027);
        ArrayList r028 = AbstractC0179j.m535l0(new Long[]{Long.valueOf(r76), Long.valueOf(r111)});
        ArrayList r115 = new ArrayList();
        Iterator r029 = r028.iterator();
    L350:
        if (r029.hasNext() == false) goto L354;
        Object r25 = r029.next();
        if (((Number) r25).longValue() <= 0) goto L350;
        r115.add(r25);
        goto L350
    L354:
        Iterator r030 = r115.iterator();
    L356:
        if (r030.hasNext() == false) goto L412;
        C0677n.f2112h.put(Long.valueOf(((Number) r030.next()).longValue()), r46);
        goto L356
    L412:
        return;
    L347:
        r76 = 0;
        goto L348
    L343:
        r142 = 0;
        goto L344
    L334:
        if (AbstractC0680o.m1745h(r027) == false) goto L338;
        if (AbstractC0680o.m1744g(r027) == true) goto L338;
        r162 = r027;
        goto L340
    L339:
        r162 = r33;
        goto L340
    L326:
        r110 = C0677n.m1701j(r46, "field_newMsgId");
        if (r110 != null) goto L325;
        r111 = 0;
        goto L330
    L322:
        r027 = null;
        goto L323
    L318:
        r124 = r025;
        goto L319
    L315:
        r025 = null;
        goto L316
    L358:
        return;
    L310:
        r023 = null;
        goto L311
    L307:
        r022 = null;
        goto L308
    L411:
        return;
    L258:
        if (C0710y.m1807b() == false) goto L410;
        C0588G r116 = C0588G.f1768a;
        Object r53 = r20.f2669b;
        AbstractC0307g.m702d(r53, "thisObject");
        Object r031 = AbstractC0358S.m920y(r53, "mViewPager");     // Catch: Throwable -> L265
        if ((r031 instanceof ViewGroup) == false) goto L267;
        Object r032 = (ViewGroup) r031;     // Catch: Throwable -> L265
    L269:
        boolean r117 = r032 instanceof C0140f;
        Object r033 = r032;
        if (r117 == false) goto L272;
        r033 = null;
    L272:
        ViewGroup r118 = (ViewGroup) r033;
        Object r034 = AbstractC0358S.m920y(r53, "mTabsAdapter");     // Catch: Throwable -> L275
    L278:
        if ((r034 instanceof C0140f) == false) goto L280;
        Object r64 = null;
    L281:
        if (r118 == null) goto L299;
        if (r64 == null) goto L299;
        ViewParent r035 = r118.getParent();
        if ((r035 instanceof ViewGroup) == false) goto L287;
        r8 = (ViewGroup) r035;
    L287:
        ViewGroup r35 = r8;
        if (r35 != null) goto L290;
        C0588G.m1436w("skip: no parent");
        return;
    L290:
        C0758s r036 = C0588G.f1770c;
        if (r036 != null) goto L293;
    L298:
        r118.post(new RunnableC0573B(r35, r118, r53, r64, 0));
        return;
    L293:
        if (r036.isAttachedToWindow() == false) goto L298;
        C0588G.f1771d = r64;
        Method r119 = C0588G.m1421h(r64.getClass());
        if (r119 != null) goto L297;
        r119 = C0588G.f1772e;
    L297:
        C0588G.f1772e = r119;
        C0588G.m1423j(r35);
        r036.bringToFront();
        r036.requestLayout();
        C0588G.m1436w("already attached, re-hide native");
        return;
    L299:
        C0588G.m1436w("skip: pager/adapter missing");
        return;
    L280:
        r64 = r034;
    L275:
        th = move-exception;
        r034 = AbstractC0040p.m116u(th);
        goto L278
    L267:
        r032 = null;
    L265:
        th = move-exception;
        r032 = AbstractC0040p.m116u(th);
        goto L269
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r23) {
        boolean r5 = true;
        String r6 = null;
        Bitmap r62 = null;
        View r63 = null;
        Integer r64 = null;
        Drawable r65 = null;
        View r66 = null;
        Number r67 = null;
        String r68 = null;
        r68 = null;
        String r69 = null;
        Number r610 = null;
        r6 = null;
        switch(this.f2066b) {
            case 0: goto L370;
            case 1: goto L367;
            case 3: goto L292;
            case 4: goto L282;
            case 6: goto L265;
            case 7: goto L217;
            case 8: goto L193;
            case 9: goto L179;
            case 10: goto L161;
            case 17: goto L118;
            case 19: goto L67;
            case 21: goto L45;
            case 22: goto L29;
            case 28: goto L10;
            case 29: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0709x1 r02 = C0703v1.m1792a();
        if (r02.f2230a == false) goto L425;
        Object[] r1 = r23.f2670c;
        float r03 = r02.f2231b;
        r1[1] = Float.valueOf(r03);
        C0706w1.m1798b(C0706w1.f2217a, "drawable.<init>", r03);
        return;
    L425:
        return;
    L10:
        C0709x1 r04 = C0703v1.m1792a();
        if (r04.f2230a == false) goto L427;
        Object[] r2 = r23.f2670c;
        AbstractC0307g.m702d(r2, "args");
        Object r22 = AbstractC0179j.m537n0(0, r2);
        if ((r22 instanceof Bitmap) == false) goto L16;
        r62 = (Bitmap) r22;
    L16:
        if (r62 != null) goto L19;
        return;
    L19:
        if (r62.isRecycled() == false) goto L21;
        return;
    L21:
        if (r23.f2670c.length < 3) goto L429;
        float r24 = Math.min(r62.getWidth(), r62.getHeight());
        if (r24 <= 1.0f) goto L430;
        r23.f2670c[2] = Float.valueOf(r04.f2231b * r24);
        return;
    L430:
        return;
    L429:
        return;
    L427:
        return;
    L67:
        C0678n0 r25 = C0678n0.f2116a;
        Object r12 = r23.f2669b;
        if (r12 != null) goto L71;
        return;
    L71:
        if (C0678n0.f2128m == true) goto L443;
        Set r26 = C0678n0.f2127l;
        AbstractC0307g.m702d(r26, "dbIdentitySeen");
        monitor-enter(r26);
    L88:
        th = move-exception;
        throw th;
    L76:
        if (C0678n0.f2128m == false) goto L80;
        monitor-exit(r26);
        return;
    L80:
        if (r26.contains(r12) == false) goto L83;
        monitor-exit(r26);
        return;
    L83:
        CopyOnWriteArrayList r611 = C0678n0.f2125j;     // Catch: Throwable -> L88
        if ((r611 instanceof Collection) == true) goto L86;
    L90:
        Iterator r612 = r611.iterator();     // Catch: Throwable -> L88
    L92:
        if (r612.hasNext() == false) goto L99;
        if (r612.next() != r12) goto L92;
        C0678n0.f2127l.add(r12);     // Catch: Throwable -> L88
        monitor-exit(r26);
        return;
    L99:
        if (AbstractC0307g.m699a(C0678n0.f2126k.computeIfAbsent(r12.getClass(), new C0612O(new C0570A(7), 3)), Boolean.TRUE) == true) goto L102;
        monitor-exit(r26);
        return;
    L102:
        C0678n0.f2127l.add(r12);     // Catch: Throwable -> L88
        CopyOnWriteArrayList r4 = C0678n0.f2125j;     // Catch: Throwable -> L88
        if (r4.size() < 4) goto L107;
        C0678n0.f2128m = true;     // Catch: Throwable -> L88
        monitor-exit(r26);
        return;
    L107:
        monitor-exit(r26);
        r4.add(r12);
        if (r4.size() < 4) goto L112;
        C0678n0.f2128m = true;
    L112:
        if (r4.size() > 2) goto L441;
        C0678n0.m1711C("remember db=" + r12.getClass().getName() + " total=" + r4.size());
        return;
    L441:
        return;
    L86:
        if (r611.isEmpty() == false) goto L90;
    L443:
        return;
    L193:
        Object r3 = r23.f2669b;
        if ((r3 instanceof View) == false) goto L196;
        View r32 = (View) r3;
    L197:
        if (r32 != null) goto L200;
        return;
    L200:
        if (C0710y.m1807b() == true) goto L202;
        return;
    L202:
        if (C0588G.f1777j == false) goto L205;
        return;
    L205:
        if (C0588G.m1414a(r32) == false) goto L470;
        Object r33 = r23.f2670c[0];
        if ((r33 instanceof Number) == false) goto L210;
        r67 = (Number) r33;
    L210:
        if (r67 == null) goto L465;
        int r34 = r67.intValue();
        if (r34 == 8) goto L466;
        if (r34 == 4) goto L467;
        r23.f2670c[0] = 8;
        return;
    L467:
        return;
    L466:
        return;
    L465:
        return;
    L470:
        return;
    L196:
        r32 = null;
        goto L197
    L292:
        C0686q r05 = C0683p.m1753a();
        if (r05.f2145a == false) goto L490;
        Object[] r27 = r23.f2670c;
        AbstractC0307g.m702d(r27, "args");
        Object r28 = AbstractC0179j.m537n0(0, r27);
        if (r28 == null) goto L298;
        String r29 = r28.toString();
    L299:
        String r9 = "";
        if (r29 != null) goto L302;
        r29 = "";
    L302:
        Object[] r10 = r23.f2670c;
        AbstractC0307g.m702d(r10, "args");
        Object r102 = AbstractC0179j.m537n0(1, r10);
        if ((r102 instanceof Number) == false) goto L305;
        Number r103 = (Number) r102;
    L307:
        if (r103 == null) goto L309;
        long r13 = r103.longValue();
    L310:
        Object[] r104 = r23.f2670c;
        AbstractC0307g.m702d(r104, "args");
        Object r35 = AbstractC0179j.m537n0(3, r104);
        if (r35 == null) goto L313;
        String r36 = r35.toString();
    L314:
        if (r36 == null) goto L317;
        r9 = r36;
    L317:
        boolean r37 = AbstractC0680o.m1746i(r9);
        if (r37 == false) goto L322;
        C0572A1.m1384a(new long[]{r13});
        AtomicBoolean r42 = C0677n.f2105a;
        C0677n.m1708q("MARKED self revoke source serverId=" + r13);
        if (r05.f2147c == true) goto L322;
        return;
    L322:
        boolean r43 = r05.f2146b;
        if (r43 == false) goto L365;
        AtomicBoolean r52 = C0677n.f2105a;
        if (r13 <= 0) goto L365;
        if (r43 == false) goto L365;
        Object r44 = C0677n.f2114j;
        if (r44 == null) goto L365;
        Method r7 = C0677n.f2113i;
        if (r7 == null) goto L365;
        Object r105 = C0677n.f2112h.get(Long.valueOf(r13));
        if (r105 == null) goto L365;
        C0652e1 r15 = C0677n.m1705n(r13, r13, r29);
        if (AbstractC0425j.m1013R0(r9) == false) goto L340;
        r9 = "recalled a message";
    L340:
        AbstractC0358S r06 = AbstractC0680o.m1738a(new C0700u1(r13, 10000, r9), r15, r05.f2147c, r05.f2148d, true, AbstractC0642b0.m1620g(AbstractC0680o.m1752o(AbstractC0680o.m1746i(r9), r15, r29, r9), r9));
        if (r06.equals(C0694s1.f2193z) == true) goto L365;
        if ((r06 instanceof C0697t1) == false) goto L364;
        String r07 = ((C0697t1) r06).f2198z;
        if (AbstractC0425j.m1013R0(r07) == true) goto L365;
        C0677n.m1706o(r105, 10000, "field_type");     // Catch: Throwable -> L358
        C0677n.m1706o(r105, r07, "field_content");     // Catch: Throwable -> L358
        if (r15 == null) goto L351;
        long r11 = r15.f2027d;     // Catch: Throwable -> L358
    L352:
        C0677n.m1706o(r105, Long.valueOf(r11 + 1), "field_createTime");     // Catch: Throwable -> L358
        C0677n.m1706o(r105, r07, "x0");     // Catch: Throwable -> L358
        Boolean r92 = Boolean.FALSE;     // Catch: Throwable -> L355
        r7.invoke(r44, new Object[]{r105, r92, r92});     // Catch: Throwable -> L355
    L356:
        C0677n.m1708q("inserted source revoke notice serverId=" + r13 + " notice=" + AbstractC0425j.m1021Z0(r07, 48));     // Catch: Throwable -> L358
        Object r08 = C0146l.f339a;     // Catch: Throwable -> L358
    L360:
        Throwable r09 = AbstractC0141g.m465a(r08);
        if (r09 == null) goto L365;
        AtomicBoolean r45 = C0677n.f2105a;
        C0677n.m1708q("source revoke notice failed serverId=" + r13 + ": " + r09.getMessage());
        goto L365
    L355:
        r7.invoke(r44, new Object[]{r105, Boolean.FALSE});     // Catch: Throwable -> L358
        goto L356
    L351:
        r11 = 0;
    L358:
        th = move-exception;
        r08 = AbstractC0040p.m116u(th);
        goto L360
    L364:
        throw new C0137c();
    L365:
        r23.m1946c(null);
        AtomicBoolean r010 = C0677n.f2105a;
        C0677n.m1708q("BLOCKED source revoke serverId=" + r13 + " talker=" + r29 + " self=" + r37);
        return;
    L313:
        r36 = null;
        goto L314
    L309:
        r13 = 0;
        goto L310
    L305:
        r103 = null;
        goto L307
    L298:
        r29 = null;
        goto L299
    L490:
        return;
    L367:
        CopyOnWriteArrayList r011 = AbstractC0642b0.f1999a;
        AbstractC0642b0.m1626m(r23.f2669b);
        return;
    L29:
        if (AbstractC0307g.m699a(C0687q0.f2162i.get(), Boolean.TRUE) == true) goto L431;
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L432;
        Object r012 = r23.f2669b;
        if ((r012 instanceof View) == false) goto L37;
        r63 = (View) r012;
    L37:
        if (r63 != null) goto L40;
        return;
    L40:
        if (C0687q0.m1754a(r63) == false) goto L434;
        r23.f2670c[0] = Float.valueOf(0.0f);
        return;
    L434:
        return;
    L432:
        return;
    L431:
        return;
    L45:
        if (AbstractC0307g.m699a(C0687q0.f2162i.get(), Boolean.TRUE) == true) goto L437;
        C0687q0.m1755b();
        if (C0687q0.f2156c == false) goto L438;
        Object r013 = r23.f2669b;
        if ((r013 instanceof View) == false) goto L53;
        View r014 = (View) r013;
    L54:
        if (r014 != null) goto L57;
        return;
    L57:
        if (C0687q0.m1754a(r014) == false) goto L440;
        Object r015 = r23.f2670c[0];
        if ((r015 instanceof Integer) == false) goto L62;
        r64 = (Integer) r015;
    L62:
        if (r64 != null) goto L64;
        return;
    L64:
        if (r64.intValue() == 8) goto L436;
        r23.f2670c[0] = 8;
        return;
    L436:
        return;
    L440:
        return;
    L53:
        r014 = null;
        goto L54
    L438:
        return;
    L437:
        return;
    L118:
        if (C0683p.m1753a().f2152h == false) goto L453;
        Object r016 = r23.f2669b;
        if ((r016 instanceof View) == false) goto L123;
        View r017 = (View) r016;
    L124:
        if (r017 == null) goto L454;
        Object r210 = r017.getTag(C1031R.id.abc_tag_bubble_msg_type);
        if ((r210 instanceof Integer) == false) goto L129;
        Integer r211 = (Integer) r210;
    L130:
        if (r211 == null) goto L449;
        int r212 = r211.intValue();
        Object r38 = r017.getTag(C1031R.id.abc_tag_bubble_supports_custom);
        if ((r38 instanceof Boolean) == false) goto L134;
        Boolean r39 = (Boolean) r38;
    L135:
        if (r39 == null) goto L137;
        boolean r213 = r39.booleanValue();
    L138:
        C0422g r310 = AbstractC0600K.f1833a;
        if (AbstractC0425j.m1005J0(r017.getClass().getName(), "MMNeat7extView", false) == false) goto L142;
        if (r213 == false) goto L142;
    L144:
        if (r5 == true) goto L146;
        r017.setTag(C1031R.id.abc_tag_bubble_source, null);
        return;
    L146:
        Object r311 = r017.getTag(C1031R.id.abc_tag_bubble_is_send);
        if ((r311 instanceof Boolean) == false) goto L149;
        Boolean r312 = (Boolean) r311;
    L150:
        if (r312 == null) goto L451;
        boolean r313 = r312.booleanValue();
        ConcurrentHashMap r46 = AbstractC0626U.f1936a;
        String r47 = AbstractC0626U.m1534g(C0639a0.f1965E, r313);
        Object[] r53 = r23.f2670c;
        AbstractC0307g.m702d(r53, "args");
        Object r54 = AbstractC0179j.m537n0(0, r53);
        if ((r54 instanceof Drawable) == false) goto L154;
        r65 = (Drawable) r54;
    L154:
        if (r65 == null) goto L156;
        r017.setTag(C1031R.id.abc_tag_bubble_original_background, r65);
    L156:
        Context r55 = r017.getContext();
        AbstractC0307g.m702d(r55, "getContext(...)");
        C0618Q r314 = AbstractC0626U.m1532e(r55, C0639a0.f1965E, r313);
        if (r314 == null) goto L452;
        r23.f2670c[0] = r314.f1908a;
        r017.setTag(C1031R.id.abc_tag_bubble_source, r47);
        return;
    L452:
        return;
    L451:
        return;
    L149:
        r312 = null;
    L142:
        r5 = false;
        goto L144
    L137:
        r213 = AbstractC0600K.m1486a("", r212);
        goto L138
    L134:
        r39 = null;
        goto L135
    L449:
        return;
    L129:
        r211 = null;
        goto L130
    L454:
        return;
    L123:
        r017 = null;
        goto L124
    L453:
        return;
    L161:
        if (C0710y.m1807b() == true) goto L163;
        return;
    L163:
        if (C0588G.f1777j == true) goto L457;
        Object r018 = r23.f2669b;
        if ((r018 instanceof View) == false) goto L168;
        View r019 = (View) r018;
    L169:
        if (r019 != null) goto L172;
        return;
    L172:
        if (C0588G.m1414a(r019) == false) goto L459;
        Object[] r020 = r23.f2670c;
        if (r020[0] == null) goto L456;
        r020[0] = null;
        return;
    L456:
        return;
    L459:
        return;
    L168:
        r019 = null;
        goto L169
    L457:
        return;
    L179:
        if (C0710y.m1807b() == true) goto L181;
        return;
    L181:
        if (C0588G.f1777j == true) goto L461;
        Object r021 = r23.f2669b;
        if ((r021 instanceof View) == false) goto L186;
        r66 = (View) r021;
    L186:
        if (r66 != null) goto L189;
        return;
    L189:
        if (C0588G.m1414a(r66) == false) goto L463;
        r23.f2670c[0] = 0;
        return;
    L463:
        return;
    L461:
        return;
    L217:
        if (C0710y.m1807b() == true) goto L219;
        return;
    L219:
        if (C0588G.f1783p == true) goto L473;
        Object r022 = r23.f2669b;
        if ((r022 instanceof TextView) == false) goto L224;
        TextView r023 = (TextView) r022;
    L225:
        if (r023 != null) goto L228;
        return;
    L228:
        if (r023.getId() != 16908308) goto L475;
        C0588G r214 = C0588G.f1768a;
        Context r215 = r023.getContext();
        AbstractC0307g.m702d(r215, "getContext(...)");
        if (C0588G.m1431r(r215) == true) goto L234;
        return;
    L234:
        if (C0588G.m1428o(r023) == false) goto L477;
        Object[] r024 = r23.f2670c;
        AbstractC0307g.m702d(r024, "args");
        Object r025 = AbstractC0179j.m537n0(0, r024);
        if (r025 != null) goto L240;
        return;
    L240:
        if ((r025 instanceof CharSequence) == false) goto L242;
        CharSequence r026 = (CharSequence) r025;
    L243:
        if (r026 == null) goto L472;
        String r027 = r026.toString();
        if (r027 == null) goto L479;
        String r216 = C0588G.m1415b(r027);
        if (r216 != null) goto L260;
        String r217 = (String) AbstractC0181l.m545q0(C0710y.m1808c(), C0588G.f1784q);
        if (r217 != null) goto L252;
    L256:
        if (r68 == null) goto L480;
        r216 = r68;
        goto L260
    L480:
        return;
    L252:
        if (AbstractC0425j.m1013R0(r027) == false) goto L254;
    L255:
        r68 = r217;
        goto L256
    L254:
        if (C0588G.m1430q((String) C0588G.m1433t(r027).f328a) == false) goto L256;
    L260:
        if (r216.equals(r027) == true) goto L481;
        r23.f2670c[0] = r216;
        return;
    L481:
        return;
    L479:
        return;
    L472:
        return;
    L242:
        r026 = null;
        goto L243
    L477:
        return;
    L475:
        return;
    L224:
        r023 = null;
        goto L225
    L473:
        return;
    L265:
        if (C0710y.m1807b() == true) goto L267;
        return;
    L267:
        if (C0588G.f1783p == true) goto L484;
        Object[] r028 = r23.f2670c;
        AbstractC0307g.m702d(r028, "args");
        Object r029 = AbstractC0179j.m537n0(0, r028);
        if ((r029 instanceof String) == false) goto L272;
        r69 = (String) r029;
    L272:
        if (r69 == null) goto L485;
        String r030 = C0588G.m1415b(r69);
        if (r030 != null) goto L278;
        return;
    L278:
        if (r030.equals(r69) == true) goto L483;
        r23.f2670c[0] = r030;
        return;
    L483:
        return;
    L485:
        return;
    L484:
        return;
    L282:
        if (C0710y.m1807b() == false) goto L489;
        Object r031 = r23.f2670c[0];
        if ((r031 instanceof Number) == false) goto L287;
        r610 = (Number) r031;
    L287:
        if (r610 != null) goto L289;
        return;
    L289:
        if (r610.intValue() == 0) goto L488;
        r23.f2670c[0] = 0;
        return;
    L488:
        return;
    L489:
        return;
    L370:
        if (C0683p.m1753a().f2150f == false) goto L492;
        Object[] r032 = r23.f2670c;
        AbstractC0307g.m702d(r032, "args");
        int r218 = r032.length;
        int r315 = 0;
    L373:
        if (r315 >= r218) goto L378;
        if ((r032[r315] instanceof String) == true) goto L379;
        r315 = r315 + 1;
    L379:
        if (r315 < 0) goto L493;
        Object r033 = r23.f2670c[r315];
        if ((r033 instanceof String) == false) goto L384;
        String r034 = (String) r033;
    L385:
        if (r034 == null) goto L494;
        C0422g r219 = AbstractC0671l.f2092a;
        if (AbstractC0425j.m1013R0(r034) == false) goto L391;
    L411:
        if (r6 == null) goto L495;
        r23.f2670c[r315] = r6;
        return;
    L495:
        return;
    L391:
        if (AbstractC0425j.m1005J0(r034, "(sourceType & 2 != 0 )  AND", false) == false) goto L393;
        r034 = AbstractC0433r.m1031F0(r034, "(sourceType & 2 != 0 )  AND", "", false);
        boolean r220 = true;
    L395:
        if (AbstractC0425j.m1005J0(r034, "(sourceType & 2 != 0)  AND", false) == false) goto L398;
        r034 = AbstractC0433r.m1031F0(r034, "(sourceType & 2 != 0)  AND", "", false);
        r220 = true;
    L398:
        if (AbstractC0425j.m1005J0(r034, "(sourceType & 2 != 0) AND", false) == false) goto L401;
        r034 = AbstractC0433r.m1031F0(r034, "(sourceType & 2 != 0) AND", "", false);
        r220 = true;
    L401:
        if (AbstractC0425j.m1005J0(r034, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", false) == false) goto L404;
        r034 = AbstractC0433r.m1031F0(r034, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", false);
        r220 = true;
    L404:
        if (AbstractC0425j.m1005J0(r034, "WHERE SnsInfo.userName=", true) == true) goto L406;
    L408:
        r5 = r220;
    L409:
        if (r5 == false) goto L411;
        r6 = r034;
        goto L411
    L406:
        if (AbstractC0425j.m1005J0(r034, "(snsId >=", false) == false) goto L408;
        r034 = AbstractC0433r.m1031F0(r034, "(snsId >=", "(1=1 or snsId >=", false);
        goto L409
    L393:
        r220 = false;
        goto L395
    L494:
        return;
    L384:
        r034 = null;
        goto L385
    L493:
        return;
    L378:
        r315 = -1;
        goto L379
    }

    public C0665j(int r1) {
        this.f2066b = r1;
        switch(r1) {
            case 8: goto L34;
            case 9: goto L32;
            case 10: goto L30;
            case 11: goto L4;
            case 12: goto L4;
            case 13: goto L28;
            case 14: goto L26;
            case 15: goto L24;
            case 16: goto L22;
            case 17: goto L4;
            case 18: goto L4;
            case 19: goto L20;
            case 20: goto L18;
            case 21: goto L16;
            case 22: goto L14;
            case 23: goto L12;
            case 24: goto L10;
            case 25: goto L4;
            case 26: goto L8;
            case 27: goto L4;
            case 28: goto L4;
            case 29: goto L6;
            default: goto L4;
        };
    L4:
        C0588G r12 = C0588G.f1768a;
        return;
    L6:
        C0706w1 r13 = C0706w1.f2217a;
        return;
    L8:
        C0670k1 r14 = C0670k1.f2084a;
        return;
    L10:
        C0687q0 r15 = C0687q0.f2154a;
        return;
    L12:
        C0687q0 r16 = C0687q0.f2154a;
        return;
    L14:
        C0687q0 r17 = C0687q0.f2154a;
        return;
    L16:
        C0687q0 r18 = C0687q0.f2154a;
        return;
    L18:
        C0678n0 r19 = C0678n0.f2116a;
        return;
    L20:
        C0678n0 r110 = C0678n0.f2116a;
        return;
    L22:
        C0639a0 r111 = C0639a0.f1967a;
        return;
    L24:
        C0594I r112 = C0594I.f1812a;
        return;
    L26:
        C0594I r113 = C0594I.f1812a;
        return;
    L28:
        C0594I r114 = C0594I.f1812a;
        return;
    L30:
        C0588G r115 = C0588G.f1768a;
        return;
    L32:
        C0588G r116 = C0588G.f1768a;
        return;
    L34:
        C0588G r117 = C0588G.f1768a;
    }
}
