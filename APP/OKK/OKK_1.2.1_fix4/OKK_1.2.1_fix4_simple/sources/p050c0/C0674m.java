package p050c0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0486k;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p056f0.C0802M;
import p056f0.C0810V;
import p056f0.C0813Y;
import p056f0.C0826f0;

/* JADX INFO: renamed from: c0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0674m extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2101c;

    public /* synthetic */ C0674m(int r1, Object r2) {
        this.f2100b = r1;
        this.f2101c = r2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b r11) {
        final int r02 = 3;
        final int r1 = 2;
        final int r2 = 1;
        View r3 = null;
        Activity r32 = null;
        final int r4 = 0;
        switch(this.f2100b) {
            case 1: goto L65;
            case 3: goto L57;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0810V r5 = (C0810V) this.f2101c;
        Object[] r7 = r11.f2670c;
        AbstractC0307g.m702d(r7, "args");
        Object r72 = AbstractC0179j.m537n0(0, r7);
        if ((r72 instanceof Integer) == false) goto L8;
        Integer r73 = (Integer) r72;
    L9:
        if (r73 != null) goto L11;
        return;
    L11:
        if (r73.intValue() != 658720) goto L77;
        Object[] r74 = r11.f2670c;
        AbstractC0307g.m702d(r74, "args");
        Object r75 = AbstractC0179j.m537n0(1, r74);
        if ((r75 instanceof Integer) == false) goto L16;
        Integer r76 = (Integer) r75;
    L17:
        if (r76 != null) goto L20;
        return;
    L20:
        if (r76.intValue() != (-1)) goto L79;
        Object[] r77 = r11.f2670c;
        AbstractC0307g.m702d(r77, "args");
        Object r12 = AbstractC0179j.m537n0(2, r77);
        if ((r12 instanceof Intent) == false) goto L25;
        Intent r13 = (Intent) r12;
    L26:
        if (r13 == null) goto L80;
        Object r112 = r11.f2669b;
        if ((r112 instanceof Activity) == false) goto L31;
        r32 = (Activity) r112;
    L31:
        if (r32 == null) goto L81;
        Uri r113 = r13.getData();
        if (r113 == null) goto L82;
        String r14 = C0810V.m2081a(r5, r113);     // Catch: Throwable -> L47
        if (r14 != null) goto L39;
    L49:
        C0810V.m2105z(r32, "无法解析所选目录，请重试");     // Catch: Throwable -> L47
        return;
    L39:
        if (AbstractC0425j.m1013R0(r14) == true) goto L49;
        C0651e0 r78 = C0651e0.f2022a;     // Catch: Throwable -> L47
        C0651e0.m1635d(r14);     // Catch: Throwable -> L47
        String r79 = r113.toString();     // Catch: Throwable -> L47
        AbstractC0307g.m702d(r79, "toString(...)");     // Catch: Throwable -> L47
        C0661h1 r8 = C0661h1.f2048a;     // Catch: Throwable -> L47
        C0661h1.m1664h("download_redirect_tree_uri", r79);     // Catch: Throwable -> L47
        r32.getContentResolver().takePersistableUriPermission(r113, 3);     // Catch: Throwable -> L44
    L46:
        C0661h1.f2048a.m1667g("download_redirect_enabled", true, false);     // Catch: Throwable -> L47
        C0810V.m2105z(r32, "下载目录已设置：".concat(r14));     // Catch: Throwable -> L47
        Object r114 = C0146l.f339a;     // Catch: Throwable -> L47
    L52:
        Throwable r115 = AbstractC0141g.m465a(r114);
        if (r115 == null) goto L76;
        String r116 = "设置目录失败：" + r115.getMessage();
        r5.getClass();
        C0810V.m2105z(r32, r116);
        return;
    L76:
        return;
    L44:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L47
    L47:
        th = move-exception;
        r114 = AbstractC0040p.m116u(th);
        goto L52
    L82:
        return;
    L81:
        return;
    L80:
        return;
    L25:
        r13 = null;
        goto L26
    L79:
        return;
    L16:
        r76 = null;
        goto L17
    L77:
        return;
    L8:
        r73 = null;
        goto L9
    L57:
        if (C0693s0.f2192f == false) goto L84;
        final Object r117 = r11.f2669b;
        if (r117 == null) goto L85;
        ((C0693s0) this.f2101c).m1791a(r117);
        Handler r33 = C0693s0.f2190d;
        r33.postDelayed(new RunnableC0690r0(r4, r117), 120);
        r33.postDelayed(new RunnableC0690r0(r2, r117), 360);
        r33.postDelayed(new RunnableC0690r0(r1, r117), 800);
        r33.postDelayed(new RunnableC0690r0(r02, r117), 1600);
        return;
    L85:
        return;
    L84:
        return;
    L65:
        if (C0710y.m1807b() == false) goto L86;
        Object r118 = r11.f2669b;
        if ((r118 instanceof View) == false) goto L70;
        r3 = (View) r118;
    L70:
        ((C0588G) this.f2101c).getClass();
        C0588G.m1437x(r3);
        return;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b r11) {
        int r1 = 2;
        ContentValues r2 = null;
        String r22 = null;
        r22 = null;
        r22 = null;
        Activity r23 = null;
        String r24 = null;
        int r3 = 0;
        Object r5 = this.f2101c;
        int r6 = 1;
        switch(this.f2100b) {
            case 0: goto L205;
            case 1: goto L203;
            case 2: goto L198;
            case 3: goto L4;
            case 4: goto L148;
            case 5: goto L94;
            case 6: goto L89;
            case 7: goto L82;
            case 8: goto L4;
            case 9: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Object r02 = r11.f2669b;
        AbstractC0307g.m702d(r02, "thisObject");
        Object[] r8 = r11.f2670c;
        AbstractC0307g.m702d(r8, "args");
        Object r12 = AbstractC0179j.m537n0(2, r8);
        ((C0826f0) r5).getClass();
    L9:
        th = move-exception;
        Object r03 = AbstractC0040p.m116u(th);
    L27:
        Boolean r13 = Boolean.FALSE;
        boolean r4 = r03 instanceof C0140f;
        Object r04 = r03;
        if (r4 == false) goto L31;
        r04 = r13;
    L31:
        if (((Boolean) r04).booleanValue() == false) goto L321;
        Object r05 = r11.f2669b;
        AbstractC0307g.m702d(r05, "thisObject");
        Field r14 = C0826f0.m2138d(r05.getClass(), new C0813Y(22));     // Catch: Throwable -> L37
        if (r14 == null) goto L39;
        r14.setAccessible(true);     // Catch: Throwable -> L37
        Object r06 = r14.get(r05);     // Catch: Throwable -> L37
    L41:
        if ((r06 instanceof Context) == false) goto L44;
        Object r07 = (Context) r06;     // Catch: Throwable -> L37
    L46:
        boolean r15 = r07 instanceof C0140f;
        Object r08 = r07;
        if (r15 == false) goto L49;
        r08 = null;
    L49:
        Context r09 = (Context) r08;
        if (r09 != null) goto L53;
        return;
    L53:
        if ((r09 instanceof Activity) == false) goto L55;
        Activity r16 = (Activity) r09;
    L56:
        if (r16 == null) goto L58;
    L68:
        if (r16 != null) goto L70;
    L78:
        Toast.makeText(r09, "无法打开设置", 0).show();
    L79:
        r11.m1946c(null);
        return;
    L70:
        if (r16.isFinishing() == true) goto L78;
        C0810V.f2933a.m2106w(r16, C0802M.f2917b);     // Catch: Throwable -> L73
        C0826f0.m2146l("embedded ui shown");     // Catch: Throwable -> L73
        Object r17 = C0146l.f339a;     // Catch: Throwable -> L73
    L75:
        Throwable r18 = AbstractC0141g.m465a(r17);
        if (r18 == null) goto L79;
        Toast.makeText(r09, "打开失败: " + r18.getMessage(), 0).show();
        C0826f0 r010 = C0826f0.f2992a;
        C0826f0.m2146l("open fail: " + r18.getMessage());
    L73:
        th = move-exception;
        r17 = AbstractC0040p.m116u(th);
        goto L75
    L58:
        if ((r09 instanceof ContextWrapper) == false) goto L60;
        ContextWrapper r19 = (ContextWrapper) r09;
    L61:
        if (r19 == null) goto L63;
        Context r110 = r19.getBaseContext();
    L65:
        if ((r110 instanceof Activity) == false) goto L67;
        r16 = (Activity) r110;
        goto L68
    L67:
        r16 = null;
        goto L68
    L63:
        r110 = null;
        goto L65
    L60:
        r19 = null;
        goto L61
    L55:
        r16 = null;
        goto L56
    L44:
        r07 = null;
        goto L46
    L39:
        r06 = null;
    L37:
        th = move-exception;
        r07 = AbstractC0040p.m116u(th);
        goto L46
    L321:
        return;
    L7:
        if ((r12 instanceof Number) == false) goto L11;
        Number r111 = (Number) r12;     // Catch: Throwable -> L9
    L12:
        if (r111 == null) goto L15;
        int r112 = r111.intValue();     // Catch: Throwable -> L9
        SparseArray r011 = C0826f0.m2143i(r02);     // Catch: Throwable -> L9
        if (r011 == null) goto L15;
        Object r012 = r011.get(r112);     // Catch: Throwable -> L9
        if (r012 == null) goto L15;
        Object r013 = C0826f0.m2144j(r012);     // Catch: Throwable -> L9
        if (r013 == null) goto L15;
        if (C0826f0.m2145k(r013) != 168566822) goto L15;
        boolean r014 = true;
    L24:
        r03 = Boolean.valueOf(r014);     // Catch: Throwable -> L9
    L15:
        r014 = false;
        goto L24
    L11:
        r111 = null;
        goto L12
    L89:
        C0709x1 r015 = C0703v1.m1792a();
        if (r015.f2230a == false) goto L325;
        C0706w1.m1797a((C0706w1) r5, r11.f2669b, r015.f2231b);
        return;
    L325:
        return;
    L94:
        C0688q1 r52 = (C0688q1) r5;
        r52.getClass();
        if (C0688q1.m1771g() == false) goto L326;
        Object[] r7 = r11.f2670c;
        AbstractC0307g.m702d(r7, "args");
        Object r42 = AbstractC0179j.m537n0(1, r7);
        if (r42 == null) goto L327;
        Object r016 = AbstractC0358S.m887g(r42, "j", new Object[0]);     // Catch: Throwable -> L104
        if ((r016 instanceof String) == false) goto L106;
        Object r017 = (String) r016;     // Catch: Throwable -> L104
    L108:
        boolean r43 = r017 instanceof C0140f;
        Object r018 = r017;
        if (r43 == false) goto L111;
        r018 = null;
    L111:
        String r019 = (String) r018;
        if (r019 != null) goto L115;
        return;
    L115:
        if (r019.equals("achat_real_name_tail") == false) goto L329;
        Object r020 = r11.f2669b;
        if ((r020 instanceof Activity) == false) goto L120;
        Activity r021 = (Activity) r020;
    L121:
        if (r021 == null) goto L330;
        String r44 = C0688q1.m1778o(r021);
        if (r44 != null) goto L126;
    L145:
        Toast.makeText(r021, "无法获取微信 ID", 0).show();
    L146:
        r11.m1946c(Boolean.TRUE);
        return;
    L126:
        if (AbstractC0425j.m1013R0(r44) == true) goto L145;
        String r72 = (String) C0688q1.f2170h.get(r44);
        if (r72 == null) goto L131;
        Toast.makeText(r021, "实名: ".concat(r72), 0).show();
        goto L146
    L131:
        Toast.makeText(r021, "正在获取...", 0).show();
        Intent r73 = r021.getIntent();
        if (r73 == null) goto L137;
        String r74 = r73.getStringExtra("room_name");
        if (r74 == null) goto L137;
    L136:
        r22 = r74;
    L144:
        C0688q1.f2171i.remove(r44);
        AtomicBoolean r75 = new AtomicBoolean(false);
        r52.m1783c(r44, r22, new C0641b(r75, r021, r6));
        C0688q1.f2169g.postDelayed(new RunnableC0486k(r75, r44, r021, r1), 13000);
    L137:
        Intent r76 = r021.getIntent();
        if (r76 == null) goto L144;
        r74 = r76.getStringExtra("Chat_User");
        if (r74 == null) goto L144;
        if (AbstractC0433r.m1028C0(r74, "@chatroom") == false) goto L144;
    L330:
        return;
    L120:
        r021 = null;
        goto L121
    L329:
        return;
    L106:
        r017 = null;
    L104:
        th = move-exception;
        r017 = AbstractC0040p.m116u(th);
        goto L108
    L327:
        return;
    L326:
        return;
    L148:
        ((C0655f1) r5).getClass();
        if (C0655f1.m1637b() == false) goto L331;
        Object[] r113 = r11.f2670c;
        AbstractC0307g.m702d(r113, "args");
        Object r114 = AbstractC0179j.m537n0(1, r113);
        if (r114 == null) goto L332;
        Object r022 = AbstractC0358S.m887g(r114, "j", new Object[0]);     // Catch: Throwable -> L158
        if ((r022 instanceof String) == false) goto L160;
        Object r023 = (String) r022;     // Catch: Throwable -> L158
    L162:
        boolean r45 = r023 instanceof C0140f;
        Object r024 = r023;
        if (r45 == false) goto L165;
        r024 = null;
    L165:
        String r025 = (String) r024;
        if (r025 == null) goto L300;
    L179:
        if (r025 != null) goto L182;
        return;
    L182:
        if (r025.equals("achat_profile_id") == false) goto L334;
        Object r026 = r11.f2669b;
        if ((r026 instanceof Activity) == false) goto L187;
        r23 = (Activity) r026;
    L187:
        if (r23 == null) goto L335;
        String r027 = C0655f1.m1638c(r23);
        if ((!AbstractC0425j.m1013R0(r027)) == true) goto L304;
    L196:
        r11.m1946c(Boolean.TRUE);
        return;
    L304:
        Object r115 = r23.getSystemService("clipboard");     // Catch: Throwable -> L193
        AbstractC0307g.m701c(r115, "null cannot be cast to non-null type android.content.ClipboardManager");     // Catch: Throwable -> L193
        ((ClipboardManager) r115).setPrimaryClip(ClipData.newPlainText("wxid", r027));     // Catch: Throwable -> L193
    L195:
        Toast.makeText(r23, "已复制 ".concat(r027), 0).show();
    L193:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L195
    L335:
        return;
    L334:
        return;
    L300:
        Object r028 = AbstractC0358S.m920y(r114, "f191135q");     // Catch: Throwable -> L171
        if ((r028 instanceof String) == false) goto L173;
        Object r029 = (String) r028;     // Catch: Throwable -> L171
    L175:
        boolean r116 = r029 instanceof C0140f;
        Object r030 = r029;
        if (r116 == false) goto L178;
        r030 = null;
    L178:
        r025 = (String) r030;
        goto L179
    L173:
        r029 = null;
    L171:
        th = move-exception;
        r029 = AbstractC0040p.m116u(th);
        goto L175
    L160:
        r023 = null;
    L158:
        th = move-exception;
        r023 = AbstractC0040p.m116u(th);
        goto L162
    L332:
        return;
    L331:
        return;
    L198:
        ((C0645c0) r5).getClass();
        if (C0645c0.m1628a() == false) goto L336;
        r11.m1946c(Boolean.FALSE);
        return;
    L336:
        return;
    L203:
        C0710y.m1807b();
        return;
    L205:
        CopyOnWriteArrayList r031 = AbstractC0642b0.f1999a;
        AbstractC0642b0.m1626m(r11.f2669b);
        Object[] r032 = r11.f2670c;
        AbstractC0307g.m702d(r032, "args");
        int r117 = r032.length;
        int r77 = 0;
    L206:
        if (r77 >= r117) goto L211;
        Object r82 = r032[r77];
        if ((r82 instanceof String) == true) goto L213;
        r77 = r77 + 1;
    L213:
        if ((r82 instanceof String) == false) goto L215;
        String r83 = (String) r82;
    L216:
        if (r83 == null) goto L340;
        C0686q r033 = C0683p.m1753a();
        String r53 = (String) r5;
        if (r033.f2149e == false) goto L242;
        List r118 = AbstractC0604L0.f1853a;
        AbstractC0307g.m703e(r53, "methodName");
        List r119 = AbstractC0604L0.f1853a;
        if ((r119 instanceof Collection) == true) goto L223;
    L225:
        Iterator r120 = r119.iterator();
    L227:
        if (r120.hasNext() == false) goto L231;
        if (AbstractC0425j.m1005J0(r83, (String) r120.next(), true) == false) goto L227;
        boolean r121 = r53.equals("delete");
    L232:
        if (r121 == false) goto L242;
        AtomicBoolean r034 = C0677n.f2105a;
        if (r53.equals("delete") == false) goto L236;
    L239:
        Object r035 = 1;
    L240:
        r11.m1946c(r035);
        C0677n.m1708q("BLOCKED media table " + r53 + " on " + r83);
        return;
    L236:
        if (AbstractC0433r.m1033H0(r53, "update", false) == true) goto L239;
        r035 = 1L;
    L231:
        r121 = false;
        goto L232
    L223:
        if (r119.isEmpty() == false) goto L225;
    L242:
        if (r83.equalsIgnoreCase("rcontact") == false) goto L277;
        Object[] r1110 = r11.f2670c;
        AbstractC0307g.m702d(r1110, "args");
        int r036 = r1110.length;
    L244:
        if (r3 >= r036) goto L249;
        Object r122 = r1110[r3];
        if ((r122 instanceof ContentValues) == true) goto L251;
        r3 = r3 + 1;
    L251:
        if ((r122 instanceof ContentValues) == false) goto L253;
        ContentValues r123 = (ContentValues) r122;
    L254:
        CopyOnWriteArrayList r1111 = AbstractC0642b0.f1999a;
        if (r123 == null) goto L341;
        String r1112 = r123.getAsString("username");
        if (r1112 == null) goto L260;
        r24 = AbstractC0425j.m1022a1(r1112).toString();
    L260:
        if (r24 != null) goto L263;
        r24 = "";
    L263:
        if (r24.length() != 0) goto L266;
        return;
    L266:
        if (AbstractC0680o.m1744g(r24) == true) goto L343;
        String r1113 = r123.getAsString("conRemark");
        String r037 = r123.getAsString("nickname");
        String r124 = r123.getAsString("alias");
        String r1114 = AbstractC0680o.m1739b(r1113);
        if (r1114 != null) goto L273;
        r1114 = AbstractC0680o.m1739b(r037);
        if (r1114 != null) goto L273;
        r1114 = AbstractC0680o.m1739b(r124);
    L273:
        if (r1114 == null) goto L344;
        AbstractC0642b0.f2001c.put(r24, r1114);
        return;
    L344:
        return;
    L343:
        return;
    L341:
        return;
    L253:
        r123 = null;
        goto L254
    L249:
        r122 = null;
        goto L251
    L277:
        if (r83.equals("message") == true) goto L280;
        return;
    L280:
        if (r033.f2145a == false) goto L346;
        Object[] r125 = r11.f2670c;
        AbstractC0307g.m702d(r125, "args");
        int r46 = r125.length;
    L283:
        if (r3 >= r46) goto L288;
        Object r78 = r125[r3];
        if ((r78 instanceof ContentValues) == true) goto L290;
        r3 = r3 + 1;
    L290:
        if ((r78 instanceof ContentValues) == false) goto L292;
        r2 = (ContentValues) r78;
    L292:
        if (r2 != null) goto L295;
        return;
    L295:
        if (C0677n.m1692a(r53, r2, r033) == false) goto L339;
        r11.m1946c(1);
        return;
    L339:
        return;
    L288:
        r78 = null;
        goto L290
    L346:
        return;
    L340:
        return;
    L215:
        r83 = null;
        goto L216
    L211:
        r82 = null;
        goto L213
    L82:
        if (((Boolean) C0605L1.m1490e(C0605L1.f1854a).f334a).booleanValue() == false) goto L323;
        Object[] r1115 = r11.f2670c;
        AbstractC0307g.m702d(r1115, "args");
        Object r1116 = AbstractC0179j.m536m0(r1115);
        if (r1116 == null) goto L324;
        Class<?> r1117 = r1116.getClass();
        ((C0611N1) r5).getClass();
        C0611N1.m1508b(r1117);
        return;
    L324:
        return;
    }

    public C0674m(int r1) {
        this.f2100b = r1;
        switch(r1) {
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L4;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L4;
            case 8: goto L4;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        this.f2101c = C0588G.f1768a;
        return;
    L6:
        this.f2101c = C0826f0.f2992a;
        return;
    L8:
        this.f2101c = C0706w1.f2217a;
        return;
    L10:
        this.f2101c = C0688q1.f2163a;
        return;
    L12:
        this.f2101c = C0693s0.f2187a;
        return;
    L14:
        this.f2101c = C0645c0.f2005a;
    }
}
