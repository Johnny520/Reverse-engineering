package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaEngine;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ny */
/* JADX INFO: loaded from: classes.dex */
public final class C2297ny extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8051e;

    /* JADX INFO: renamed from: f */
    public Object f8052f;

    /* JADX INFO: renamed from: g */
    public int f8053g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0972Wk f8054h;

    public /* synthetic */ C2297ny(C2340oy r1, InterfaceC0190Eb r2, int r3) {
        this.f8051e = r3;
        this.f8054h = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f8051e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return ((C2297ny) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C2297ny) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L9:
        return ((C2297ny) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f8051e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C2297ny((String) this.f8052f, (C0762Rp) this.f8054h, r3);
    L7:
        return new C2297ny((C2340oy) this.f8054h, r3, 1);
    L9:
        return new C2297ny((C2340oy) this.f8054h, r3, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Eb] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.TextView] */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r17) {
        int r0 = this.f8051e;
        int r2 = 4;
        Object r3 = C0829TC.f2620a;
        EnumC1453gc r4 = EnumC1453gc.f5148a;
        ?? r5 = 0;
        TextView r52 = null;
        InterfaceC0972Wk r7 = this.f8054h;
        int r8 = 0;
        int r9 = 2;
        switch(r0) {
            case 0: goto L105;
            case 1: goto L23;
            default: goto L4;
        };
    L4:
        C0762Rp r12 = (C0762Rp) r7;
        int r02 = this.f8053g;
        if (r02 == 0) goto L15;
        if (r02 == 1) goto L11;
        if (r02 != 2) goto L10;
        AbstractC0628Oj.m1232T(r17);
    L22:
        return r3;
    L10:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-130506876254261L));
    L11:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L13
    L181:
        goto L22
    L15:
        AbstractC0628Oj.m1232T(r17);
        long r72 = System.currentTimeMillis();     // Catch: Exception -> L13
        Object r11 = LuaEngine.INSTANCE.m5465executeIoAF18A((String) this.f8052f);     // Catch: Exception -> L13
        long r13 = System.currentTimeMillis() - r72;     // Catch: Exception -> L13
        C1498hd r03 = AbstractC1499he.f5282a;     // Catch: Exception -> L13
        C2283nk r04 = AbstractC1106Zp.f3500a;     // Catch: Exception -> L13
        C0720Qp r10 = new C0720Qp(r11, r12, r13, null);     // Catch: Exception -> L13
        this.f8053g = 1;     // Catch: Exception -> L13
        if (AbstractC0585Nj.m1133N(r04, r10, this) == r4) goto L21;
        r3 = r4;
    L13:
        e = move-exception;
        C1498hd r6 = AbstractC1499he.f5282a;
        C2283nk r62 = AbstractC1106Zp.f3500a;
        C0993X4 r73 = new C0993X4(r12, e, r5, r2);
        this.f8053g = 2;
        if (AbstractC0585Nj.m1133N(r62, r73, this) != r4) goto L22;
    L21:
        r3 = r4;
        goto L181
    L23:
        C2340oy r74 = (C2340oy) r7;
        switch(this.f8053g) {
            case 0: goto L44;
            case 1: goto L42;
            case 2: goto L40;
            case 3: goto L37;
            case 4: goto L34;
            case 5: goto L31;
            case 6: goto L27;
            default: goto L26;
        };
    L27:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
        Object r05 = r17;
    L83:
        C0905V2 r06 = (C0905V2) r05;     // Catch: Exception -> L29
        TextView r22 = r74.f8213b;     // Catch: Exception -> L29
        if (r22 != null) goto L86;
        AbstractC0295Gu.m625r(-479309760297013L);     // Catch: Exception -> L29
        r22 = null;
    L86:
        StringBuilder r42 = new StringBuilder();     // Catch: Exception -> L29
        r42.append(AbstractC0295Gu.m625r(-479382774741045L) + r06.f2822e + AbstractC0295Gu.m625r(-478863083698229L));     // Catch: Exception -> L29
        if (r06.f2822e < 7) goto L89;
        r42.append(AbstractC0295Gu.m625r(-478875968600117L));     // Catch: Exception -> L29
    L89:
        r22.setText(r42.toString());     // Catch: Exception -> L29
        C2340oy.m4749g(r74, true);     // Catch: Exception -> L29
        return r3;
    L31:
        C0862U2 r07 = (C0862U2) this.f8052f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
    L80:
        C1456gf r23 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L29
        String r08 = r07.f2725e.f2586a;     // Catch: Exception -> L29
        this.f8052f = null;     // Catch: Exception -> L29
        this.f8053g = 6;     // Catch: Exception -> L29
        r23.getClass();     // Catch: Exception -> L29
        C1498hd r24 = AbstractC1499he.f5282a;     // Catch: Exception -> L29
        r05 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(r8, r5, r08), this);     // Catch: Exception -> L29
        if (r05 != r4) goto L83;
    L187:
        return r4;
    L34:
        r07 = (C0862U2) this.f8052f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
        Object r25 = r17;
    L75:
        C0862U2 r26 = (C0862U2) r25;     // Catch: Exception -> L29
        C2340oy.f8211e = false;     // Catch: Exception -> L29
        if (r26.f2721a == false) goto L90;
        C2340oy.m4748f(r74);     // Catch: Exception -> L29
        C2340oy.m4749g(r74, true);     // Catch: Exception -> L29
        Toast.makeText(r74.getContext(), AbstractC0295Gu.m625r(-479288285460533L), 0).show();     // Catch: Exception -> L29
        this.f8052f = r07;     // Catch: Exception -> L29
        this.f8053g = 5;     // Catch: Exception -> L29
        if (AbstractC1293cr.m2557v(1000, this) != r4) goto L80;
    L90:
        C2340oy.m4747e(r74);     // Catch: Exception -> L29
        C2340oy.m4749g(r74, false);     // Catch: Exception -> L29
        Toast.makeText(r74.getContext(), r26.f2722b, 0).show();     // Catch: Exception -> L29
        return r3;
    L37:
        r07 = (C0862U2) this.f8052f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
    L72:
        C1456gf r92 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L29
        C0819T2 r102 = r07.f2725e;     // Catch: Exception -> L29
        String r112 = r102.f2586a;     // Catch: Exception -> L29
        int r103 = r102.f2588c;     // Catch: Exception -> L29
        this.f8052f = r07;     // Catch: Exception -> L29
        this.f8053g = 4;     // Catch: Exception -> L29
        r92.getClass();     // Catch: Exception -> L29
        C1498hd r27 = AbstractC1499he.f5282a;     // Catch: Exception -> L29
        r25 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0991X2(r103, null, r112), this);     // Catch: Exception -> L29
        if (r25 != r4) goto L75;
    L40:
        r07 = (C0862U2) this.f8052f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
        Object r93 = r17;
    L56:
        C0905V2 r94 = (C0905V2) r93;     // Catch: Exception -> L29
        if (r94.f2821d >= r07.f2725e.f2588c) goto L59;
    L62:
        Intent r95 = new Intent();     // Catch: Exception -> L29
        Context r104 = MainApplication.f5549a;     // Catch: Exception -> L29
        if (r104 != null) goto L69;
        r104 = C1456gf.f5172p;     // Catch: Exception -> L29
        if (r104 != null) goto L69;
        r104 = AndroidAppHelper.currentApplication();     // Catch: Exception -> L29
        AbstractC0295Gu.m625r(-836852902787125L);     // Catch: Exception -> L29
    L69:
        String r105 = r104.getApplicationInfo().packageName;     // Catch: Exception -> L29
        AbstractC0295Gu.m625r(-837656061671477L);     // Catch: Exception -> L29
        r95.setClassName(r105, AbstractC0295Gu.m625r(-478498011478069L));     // Catch: Exception -> L29
        r95.putExtra(AbstractC0295Gu.m625r(-479258220689461L), r07.f2725e.f2587b);     // Catch: Exception -> L29
        r95.addFlags(268435456);     // Catch: Exception -> L29
        r74.getContext().startActivity(r95);     // Catch: Exception -> L29
        this.f8052f = r07;     // Catch: Exception -> L29
        this.f8053g = 3;     // Catch: Exception -> L29
        if (AbstractC1293cr.m2557v(3000, this) != r4) goto L72;
    L59:
        if (r94.f2818a == false) goto L62;
        C2340oy.f8211e = false;     // Catch: Exception -> L29
        C2340oy.m4748f(r74);     // Catch: Exception -> L29
        C2340oy.m4749g(r74, true);     // Catch: Exception -> L29
        return r3;
    L42:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L29
        Object r09 = r17;
    L48:
        r07 = (C0862U2) r09;     // Catch: Exception -> L29
        if (r07.f2721a == false) goto L91;
        C0819T2 r106 = r07.f2725e;     // Catch: Exception -> L29
        if (r106 == null) goto L91;
        C1456gf r113 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L29
        String r107 = r106.f2586a;     // Catch: Exception -> L29
        this.f8052f = r07;     // Catch: Exception -> L29
        this.f8053g = 2;     // Catch: Exception -> L29
        r113.getClass();     // Catch: Exception -> L29
        C1498hd r96 = AbstractC1499he.f5282a;     // Catch: Exception -> L29
        r93 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(r8, r5, r107), this);     // Catch: Exception -> L29
        if (r93 != r4) goto L56;
    L91:
        Toast.makeText(r74.getContext(), r07.f2722b, 0).show();     // Catch: Exception -> L29
        C2340oy.m4747e(r74);     // Catch: Exception -> L29
        C2340oy.m4749g(r74, false);     // Catch: Exception -> L29
        C2340oy.f8211e = false;     // Catch: Exception -> L29
        return r3;
    L44:
        AbstractC0628Oj.m1232T(r17);
        C1456gf r010 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L29
        this.f8053g = 1;     // Catch: Exception -> L29
        r010.getClass();     // Catch: Exception -> L29
        C1498hd r011 = AbstractC1499he.f5282a;     // Catch: Exception -> L29
        r09 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(r9, r5), this);     // Catch: Exception -> L29
        if (r09 != r4) goto L48;
    L26:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-477505874032693L));
    L29:
        e = move-exception;
        AbstractC0295Gu.m625r(-478931803174965L);
        AbstractC0295Gu.m625r(-478953278011445L);
        C2340oy.f8211e = false;
        Toast.makeText(r74.getContext(), AbstractC0295Gu.m625r(-478991932717109L), 0).show();
        String r012 = e.getMessage();
        if (r012 != null) goto L96;
    L102:
        C2340oy.m4747e(r74);
    L103:
        C2340oy.m4749g(r74, false);
        return r3;
    L96:
        if (AbstractC2564tz.m5051L(r012, AbstractC0295Gu.m625r(-479039177357365L), false) != true) goto L102;
        TextView r013 = r74.f8213b;
        if (r013 != null) goto L100;
        AbstractC0295Gu.m625r(-479052062259253L);
    L101:
        r52.setText(AbstractC0295Gu.m625r(-477475809261621L));
        C2340oy.m4746a(r74);
        goto L103
    L100:
        r52 = r013;
        goto L101
    L105:
        C2340oy r75 = (C2340oy) r7;
        int r014 = this.f8053g;
        if (r014 == 0) goto L118;
        if (r014 == 1) goto L116;
        if (r014 != 2) goto L115;
        C0862U2 r015 = (C0862U2) this.f8052f;
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L112
        Object r28 = r17;
    L130:
        C0905V2 r29 = (C0905V2) r28;     // Catch: Exception -> L112
        String r43 = r29.f2823f;     // Catch: Exception -> L112
        int r97 = r29.f2822e;
        boolean r108 = r29.f2818a;
        if (r43 != null) goto L135;
    L140:
        TextView r44 = r75.f8213b;     // Catch: Exception -> L112
        if (r44 != null) goto L143;
        AbstractC0295Gu.m625r(-479975480227893L);     // Catch: Exception -> L112
        r44 = null;
    L143:
        StringBuilder r114 = new StringBuilder();     // Catch: Exception -> L112
        if (r108 == false) goto L148;
        r114.append(AbstractC0295Gu.m625r(-480048494671925L));     // Catch: Exception -> L112
        if (r97 <= 0) goto L149;
        r114.append(AbstractC0295Gu.m625r(-480091444344885L) + r97 + AbstractC0295Gu.m625r(-480121509115957L));     // Catch: Exception -> L112
    L149:
        r44.setText(r114.toString());     // Catch: Exception -> L112
        if (r29.f2821d < r015.f2725e.f2588c) goto L154;
        if (r108 == false) goto L154;
        C2340oy.m4748f(r75);     // Catch: Exception -> L112
        C2340oy.m4749g(r75, true);     // Catch: Exception -> L112
        return r3;
    L154:
        TextView r016 = r75.f8212a;     // Catch: Exception -> L112
        if (r016 != null) goto L157;
        AbstractC0295Gu.m625r(-480181638658101L);     // Catch: Exception -> L112
        r016 = null;
    L157:
        r016.setText(AbstractC0295Gu.m625r(-478588205791285L));     // Catch: Exception -> L112
        C2340oy.m4747e(r75);     // Catch: Exception -> L112
        C2340oy.m4749g(r75, false);     // Catch: Exception -> L112
        return r3;
    L148:
        r114.append(AbstractC0295Gu.m625r(-480134394017845L));     // Catch: Exception -> L112
        goto L149
    L135:
        if (AbstractC2564tz.m5051L(r43, AbstractC0295Gu.m625r(-480409271924789L), false) != true) goto L140;
        C2340oy.m4746a(r75);     // Catch: Exception -> L112
        TextView r017 = r75.f8213b;     // Catch: Exception -> L112
        if (r017 != null) goto L139;
        AbstractC0295Gu.m625r(-480422156826677L);     // Catch: Exception -> L112
        r017 = null;
    L139:
        r017.setText(AbstractC0295Gu.m625r(-479945415456821L));     // Catch: Exception -> L112
        C2340oy.m4749g(r75, false);     // Catch: Exception -> L112
        return r3;
    L115:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-478291853047861L));
    L116:
        AbstractC0628Oj.m1232T(r17);     // Catch: Exception -> L112
        Object r018 = r17;
    L122:
        r015 = (C0862U2) r018;     // Catch: Exception -> L112
        if (r015.f2721a == false) goto L158;
        C0819T2 r210 = r015.f2725e;     // Catch: Exception -> L112
        if (r210 == null) goto L158;
        C1456gf r109 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L112
        String r211 = r210.f2586a;     // Catch: Exception -> L112
        this.f8052f = r015;     // Catch: Exception -> L112
        this.f8053g = 2;     // Catch: Exception -> L112
        r109.getClass();     // Catch: Exception -> L112
        C1498hd r98 = AbstractC1499he.f5282a;     // Catch: Exception -> L112
        r28 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(r8, r5, r211), this);     // Catch: Exception -> L112
        if (r28 != r4) goto L130;
    L191:
        return r4;
    L158:
        String r019 = r015.f2722b;     // Catch: Exception -> L112
        if (r019 != null) goto L161;
    L166:
        C2340oy.m4747e(r75);     // Catch: Exception -> L112
        return r3;
    L161:
        if (AbstractC2564tz.m5051L(r019, AbstractC0295Gu.m625r(-480293307807797L), false) != true) goto L166;
        C2340oy.m4746a(r75);     // Catch: Exception -> L112
        TextView r020 = r75.f8213b;     // Catch: Exception -> L112
        if (r020 != null) goto L165;
        AbstractC0295Gu.m625r(-480306192709685L);     // Catch: Exception -> L112
        r020 = null;
    L165:
        r020.setText(AbstractC0295Gu.m625r(-480379207153717L));     // Catch: Exception -> L112
        return r3;
    L118:
        AbstractC0628Oj.m1232T(r17);
        C1456gf r021 = AbstractC1077Z2.f3440a;     // Catch: Exception -> L112
        this.f8053g = 1;     // Catch: Exception -> L112
        r021.getClass();     // Catch: Exception -> L112
        C1498hd r022 = AbstractC1499he.f5282a;     // Catch: Exception -> L112
        r018 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(r9, r5), this);     // Catch: Exception -> L112
        if (r018 != r4) goto L122;
    L112:
        e = move-exception;
        AbstractC0295Gu.m625r(-478618270562357L);
        AbstractC0295Gu.m625r(-478639745398837L);
        Toast.makeText(r75.getContext(), AbstractC0213Ey.m405c(-478678400104501L, new StringBuilder(), e), 0).show();
        String r023 = e.getMessage();
        if (r023 != null) goto L171;
    L177:
        C2340oy.m4747e(r75);
    L178:
        C2340oy.m4749g(r75, false);
        return r3;
    L171:
        if (AbstractC2564tz.m5051L(r023, AbstractC0295Gu.m625r(-478725644744757L), false) != true) goto L177;
        C2340oy.m4746a(r75);
        TextView r024 = r75.f8213b;
        if (r024 != null) goto L175;
        AbstractC0295Gu.m625r(-478738529646645L);
    L176:
        r5.setText(AbstractC0295Gu.m625r(-478811544090677L));
        goto L178
    L175:
        r5 = r024;
        goto L176
    }

    public C2297ny(String r2, C0762Rp r3, InterfaceC0190Eb r4) {
        this.f8051e = 2;
        this.f8052f = r2;
        this.f8054h = r3;
        super(r4);
    }
}
