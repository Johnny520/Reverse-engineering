package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: fG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1406fG implements InterfaceC0406Jc, InterfaceC0919Va, InterfaceC0359IE {

    /* JADX INFO: renamed from: b */
    public static final C2610v1 f4983b = null;

    /* JADX INFO: renamed from: c */
    public static final C2610v1 f4984c = null;

    /* JADX INFO: renamed from: d */
    public static final Object f4985d = null;

    /* JADX INFO: renamed from: e */
    public static final byte[] f4986e = null;

    /* JADX INFO: renamed from: f */
    public static final byte[] f4987f = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4988a;

    static {
        int r2 = 10;
        f4983b = new C2610v1("UNDEFINED", r2);
        f4984c = new C2610v1("REUSABLE_CLAIMED", r2);
        f4985d = new Object();
        f4986e = new byte[]{112, 114, 111, 0};
        f4987f = new byte[]{112, 114, 109, 0};
    }

    public /* synthetic */ AbstractC1406fG(int r1) {
        this.f4988a = r1;
    }

    /* JADX INFO: renamed from: E */
    public static final C2813zq m2680E(Matcher r0, int r1, CharSequence r2) {
        if (r0.find(r1) == true) goto L7;
        return null;
    L7:
        return new C2813zq(r0, r2);
    }

    /* JADX INFO: renamed from: F */
    public static void m2681F(C2497sb r40, C2244mo r41, ArrayList r42, int r43) {
        C2497sb r0 = r40;
        C2244mo r1 = r41;
        ArrayList r10 = r42;
        if (r43 != 0) goto L6;
        int r2 = r0.f8783z0;
        C2178l7[] r3 = r0.f8764C0;
        int r15 = 0;
    L5:
        int r13 = r2;
        C2178l7[] r14 = r3;
        int r22 = 0;
    L8:
        if (r22 >= r13) goto L426;
        C2178l7 r32 = r14[r22];
        boolean r4 = r32.f7605q;
        C2454rb r5 = r32.f7589a;
        C1259cb[] r6 = r5.f8596Q;
        int r7 = 3;
        C0256Fy r16 = null;
        int r8 = 8;
        float r17 = 0.0f;
        if (r4 == true) goto L100;
        int r44 = r32.f7600l;
        int r18 = r44 * 2;
        C2454rb r12 = r5;
        C2454rb r21 = r12;
        boolean r19 = false;
    L12:
        if (r19 == true) goto L80;
        r32.f7597i++;
        C2454rb[] r9 = r12.f8631m0;
        C1259cb[] r11 = r12.f8596Q;
        r9[r44] = null;
        r12.f8629l0[r44] = null;
        if (r12.f8619g0 == r8) goto L66;
        r12.m4932j(r44);
        r11[r18].m2384e();
        int r92 = r18 + 1;
        r11[r92].m2384e();
        r11[r18].m2384e();
        r11[r92].m2384e();
        if (r32.f7590b != null) goto L18;
        r32.f7590b = r12;
    L18:
        r32.f7592d = r12;
        int r93 = r12.f8637p0[r44];
        if (r93 != r7) goto L66;
        int r82 = r12.f8641t[r44];
        if (r82 == 0) goto L27;
        if (r82 == r7) goto L27;
        if (r82 == 2) goto L27;
        int r26 = r22;
        int r27 = r44;
    L52:
        if (r27 != 0) goto L60;
        if (r12.f8639r == 0) goto L57;
    L65:
        C2454rb r23 = r21;
        if (r23 == r12) goto L69;
        r23.f8631m0[r27] = r12;
    L69:
        C1259cb r24 = r11[r18 + 1].f4270f;
        if (r24 == null) goto L75;
        C2454rb r25 = r24.f4268d;
        C1259cb r45 = r25.f8596Q[r18].f4270f;
        if (r45 == null) goto L75;
        if (r45.f4268d != r12) goto L75;
    L76:
        if (r25 != null) goto L79;
        r25 = r12;
        r19 = true;
    L79:
        r21 = r12;
        r44 = r27;
        r7 = 3;
        r8 = 8;
        r12 = r25;
        r22 = r26;
    L75:
        r25 = null;
        goto L76
    L57:
        if (r12.f8642u != 0) goto L65;
        int r28 = r12.f8643v;
        goto L65
    L60:
        if (r12.f8640s != 0) goto L65;
        if (r12.f8645x != 0) goto L65;
        int r29 = r12.f8646y;
    L27:
        r32.f7598j++;
        float r72 = r12.f8627k0[r44];
        if (r72 <= 0.0f) goto L30;
        r26 = r22;
        r32.f7599k += r72;
    L31:
        r27 = r44;
        if (r12.f8619g0 == 8) goto L46;
        if (r93 != 3) goto L46;
        if (r82 == 0) goto L38;
        if (r82 != 3) goto L46;
    L38:
        if (r72 >= 0.0f) goto L40;
        r32.f7602n = true;
    L42:
        if (r32.f7596h != null) goto L44;
        r32.f7596h = new ArrayList();
    L44:
        r32.f7596h.add(r12);
        goto L46
    L40:
        r32.f7603o = true;
    L46:
        if (r32.f7594f != null) goto L48;
        r32.f7594f = r12;
    L48:
        C2454rb r210 = r32.f7595g;
        if (r210 == null) goto L51;
        r210.f8629l0[r27] = r12;
    L51:
        r32.f7595g = r12;
        goto L52
    L30:
        r26 = r22;
    L66:
        r26 = r22;
        r27 = r44;
        goto L65
    L80:
        int r262 = r22;
        int r272 = r44;
        C2454rb r211 = r32.f7590b;
        if (r211 == null) goto L83;
        r211.f8596Q[r18].m2384e();
    L83:
        C2454rb r212 = r32.f7592d;
        if (r212 == null) goto L86;
        r212.f8596Q[r18 + 1].m2384e();
    L86:
        r32.f7591c = r12;
        if (r272 == 0) goto L89;
    L91:
        r32.f7593e = r5;
    L93:
        if (r32.f7603o == true) goto L95;
    L97:
        boolean r213 = false;
    L98:
        r32.f7604p = r213;
    L101:
        r32.f7605q = true;
        if (r10 != null) goto L104;
    L107:
        C2454rb r112 = r32.f7591c;
        C2454rb r122 = r32.f7590b;
        C2454rb r214 = r32.f7592d;
        C2454rb r46 = r32.f7593e;
        float r73 = r32.f7599k;
        int[] r83 = r0.f8637p0;
        C1259cb[] r94 = r0.f8596Q;
        if (r83[r43] != 2) goto L110;
        boolean r84 = true;
    L111:
        if (r43 != 0) goto L126;
        int r95 = r46.f8623i0;
        if (r95 != 0) goto L116;
        boolean r222 = true;
    L115:
        C1259cb[] r192 = r6;
        if (r95 != 1) goto L120;
        boolean r215 = true;
    L121:
        if (r95 != 2) goto L123;
        boolean r96 = true;
    L124:
        C2454rb r62 = r5;
        float r292 = r73;
        boolean r232 = r215;
        boolean r273 = r222;
    L125:
        boolean r216 = false;
    L139:
        if (r216 == true) goto L193;
        C1259cb[] r74 = r62.f8596Q;
        int[] r75 = r62.f8637p0;
        C1259cb r76 = r74[r15];
        if (r96 == false) goto L143;
        int r31 = 1;
    L144:
        int r35 = r76.m2384e();
        boolean r36 = r84;
        boolean r37 = r96;
        if (r75[r43] == 3) goto L147;
    L149:
        boolean r85 = false;
    L150:
        C1259cb r97 = r76.f4270f;
        if (r97 == null) goto L154;
        if (r62 == r5) goto L154;
        r35 = r97.m2384e() + r35;
    L154:
        int r98 = r35;
        if (r37 == false) goto L159;
        if (r62 == r5) goto L159;
        if (r62 == r122) goto L159;
        r31 = 8;
    L159:
        C2454rb r352 = r5;
        C1259cb r52 = r76.f4270f;
        if (r52 == null) goto L174;
        if (r62 != r122) goto L163;
        boolean r38 = r85;
        r1.m4567f(r76.f4273i, r52.f4273i, r98, 6);
    L164:
        if (r38 == false) goto L167;
        if (r37 == true) goto L167;
        r31 = 5;
    L167:
        if (r62 != r122) goto L172;
        if (r37 == false) goto L172;
        if (r62.f8598S[r43] == false) goto L172;
        int r53 = 5;
    L173:
        r1.m4566e(r76.f4273i, r76.f4270f.f4273i, r98, r53);
    L172:
        r53 = r31;
        goto L173
    L163:
        r38 = r85;
        r1.m4567f(r76.f4273i, r52.f4273i, r98, 8);
    L174:
        if (r36 == true) goto L176;
    L182:
        C1259cb r54 = r74[r15 + 1].f4270f;
        if (r54 == null) goto L188;
        C2454rb r55 = r54.f4268d;
        C1259cb r77 = r55.f8596Q[r15].f4270f;
        if (r77 == null) goto L188;
        if (r77.f4268d != r62) goto L188;
    L189:
        if (r55 == null) goto L191;
        r62 = r55;
    L192:
        r5 = r352;
        r84 = r36;
        r96 = r37;
        goto L139
    L191:
        r216 = true;
    L188:
        r55 = null;
        goto L189
    L176:
        if (r62.f8619g0 != 8) goto L178;
    L180:
        int r86 = 0;
    L181:
        r1.m4567f(r74[r15].f4273i, r94[r15].f4273i, r86, 8);
        goto L182
    L178:
        if (r75[r43] != 3) goto L180;
        r86 = 0;
        r1.m4567f(r74[r15 + 1].f4273i, r74[r15].f4273i, 0, 5);
        goto L181
    L147:
        if (r62.f8641t[r43] != 0) goto L149;
        r85 = true;
        goto L150
    L143:
        r31 = 4;
        goto L144
    L193:
        boolean r362 = r84;
        boolean r372 = r96;
        if (r214 == null) goto L211;
        int r63 = r15 + 1;
        if (r112.f8596Q[r63].f4270f == null) goto L211;
        C1259cb r56 = r214.f8596Q[r63];
        if (r214.f8637p0[r43] != 3) goto L206;
        if (r214.f8641t[r43] != 0) goto L206;
        if (r372 == true) goto L206;
        C1259cb r78 = r56.f4270f;
        if (r78.f4268d != r0) goto L206;
        r1.m4566e(r56.f4273i, r78.f4273i, -r56.m2384e(), 5);
    L210:
        r1.m4568g(r56.f4273i, r112.f8596Q[r63].f4270f.f4273i, -r56.m2384e(), 6);
    L206:
        if (r372 == false) goto L210;
        C1259cb r79 = r56.f4270f;
        if (r79.f4268d != r0) goto L210;
        r1.m4566e(r56.f4273i, r79.f4273i, -r56.m2384e(), 4);
    L211:
        if (r362 == false) goto L213;
        int r57 = r15 + 1;
        C0256Fy r64 = r94[r57].f4273i;
        C1259cb r58 = r112.f8596Q[r57];
        r1.m4567f(r64, r58.f4273i, r58.m2384e(), 8);
    L213:
        ArrayList r59 = r32.f7596h;
        if (r59 == null) goto L254;
        int r65 = r59.size();
        if (r65 <= 1) goto L254;
        if (r32.f7602n == true) goto L220;
    L222:
        C2454rb r99 = null;
        float r102 = 0.0f;
        int r87 = 0;
    L223:
        if (r87 >= r65) goto L254;
        C2454rb r710 = (C2454rb) r59.get(r87);
        float[] r02 = r710.f8627k0;
        C1259cb[] r03 = r710.f8596Q;
        float r182 = r02[r43];
        if (r182 < r17) goto L227;
    L230:
        ArrayList r30 = r59;
        int r312 = r65;
        if (r182 != r17) goto L234;
        float r20 = r102;
        r1.m4566e(r03[r15 + 1].f4273i, r03[r15].f4273i, 0, 8);
    L233:
        int r217 = r87;
        float r363 = r17;
        r102 = r20;
        int r172 = r13;
    L253:
        r87 = r217 + 1;
        r13 = r172;
        r59 = r30;
        r65 = r312;
        r17 = r363;
        goto L223
    L234:
        float r202 = r102;
        if (r99 == null) goto L251;
        C1259cb[] r510 = r99.f8596Q;
        C0256Fy r910 = r510[r15].f4273i;
        int r33 = r15 + 1;
        C0256Fy r511 = r510[r33].f4273i;
        C0256Fy r66 = r03[r15].f4273i;
        C0256Fy r103 = r03[r33].f4273i;
        C0564N4 r04 = r1.m4573l();
        C2454rb r332 = r710;
        float r711 = r17;
        r04.f1843b = r711;
        r363 = r711;
        if (r292 != r711) goto L239;
    L240:
        r217 = r87;
        r172 = r13;
        r04.f1845d.m367g(r910, 1.0f);
        r04.f1845d.m367g(r511, -1.0f);
        r04.f1845d.m367g(r103, 1.0f);
        r04.f1845d.m367g(r66, -1.0f);
    L250:
        r1.m4564c(r04);
    L252:
        r102 = r182;
        r99 = r332;
        goto L253
    L239:
        if (r202 == r182) goto L240;
        if (r202 != r363) goto L246;
        r04.f1845d.m367g(r910, 1.0f);
        r04.f1845d.m367g(r511, -1.0f);
    L244:
        r217 = r87;
        r172 = r13;
        goto L250
    L246:
        if (r182 != r17) goto L248;
        r04.f1845d.m367g(r66, 1.0f);
        r04.f1845d.m367g(r103, -1.0f);
        goto L244
    L248:
        r217 = r87;
        float r88 = (r202 / r292) / (r182 / r292);
        r172 = r13;
        r04.f1845d.m367g(r910, 1.0f);
        r04.f1845d.m367g(r511, -1.0f);
        r04.f1845d.m367g(r103, r88);
        r04.f1845d.m367g(r66, -r88);
        goto L250
    L251:
        r332 = r710;
        r217 = r87;
        r363 = r17;
        r172 = r13;
        goto L252
    L227:
        if (r32.f7604p == false) goto L229;
        r30 = r59;
        r312 = r65;
        r1.m4566e(r03[r15 + 1].f4273i, r03[r15].f4273i, 0, 4);
        r20 = r102;
        goto L233
    L229:
        r182 = 1.0f;
        goto L230
    L220:
        if (r32.f7604p == true) goto L222;
        r292 = r32.f7598j;
    L254:
        int r173 = r13;
        if (r122 == null) goto L259;
        if (r122 == r214) goto L260;
        if (r372 == false) goto L259;
    L260:
        C1259cb r05 = r192[r15];
        int r512 = r15 + 1;
        C1259cb r34 = r112.f8596Q[r512];
        C1259cb r06 = r05.f4270f;
        if (r06 == null) goto L263;
        C0256Fy r07 = r06.f4273i;
    L264:
        C1259cb r67 = r34.f4270f;
        if (r67 == null) goto L267;
        C0256Fy r68 = r67.f4273i;
    L268:
        C1259cb r712 = r122.f8596Q[r15];
        if (r214 == null) goto L271;
        r34 = r214.f8596Q[r512];
    L271:
        if (r07 == null) goto L278;
        if (r68 == null) goto L278;
        if (r43 != 0) goto L276;
        float r47 = r46.f8613d0;
    L275:
        float r513 = r47;
        int r48 = r712.m2384e();
        int r89 = r34.m2384e();
        C0256Fy r713 = r712.f4273i;
        C0256Fy r39 = r34.f4273i;
        C0256Fy r310 = r07;
        C2454rb r08 = r214;
        r1.m4563b(r713, r310, r48, r513, r68, r39, r89, 7);
    L279:
        C2244mo r110 = r41;
    L400:
        if (r273 == true) goto L402;
        if (r232 == true) goto L402;
    L425:
        r22 = r262 + 1;
        r0 = r40;
        r1 = r41;
        r10 = r42;
        r13 = r173;
    L402:
        if (r122 == null) goto L425;
        if (r122 == r08) goto L425;
        C1259cb[] r218 = r122.f8596Q;
        C1259cb r311 = r218[r15];
        if (r08 != null) goto L407;
        r08 = r122;
    L407:
        C1259cb[] r49 = r08.f8596Q;
        int r514 = r15 + 1;
        C1259cb r69 = r49[r514];
        C1259cb r714 = r311.f4270f;
        if (r714 == null) goto L410;
        C0256Fy r715 = r714.f4273i;
    L411:
        C1259cb r810 = r69.f4270f;
        if (r810 == null) goto L414;
        C0256Fy r811 = r810.f4273i;
    L415:
        if (r112 == r08) goto L420;
        C1259cb r812 = r112.f8596Q[r514].f4270f;
        if (r812 == null) goto L419;
        r16 = r812.f4273i;
    L419:
        r811 = r16;
    L420:
        if (r122 != r08) goto L422;
        r69 = r218[r514];
    L422:
        if (r715 == null) goto L425;
        if (r811 == null) goto L425;
        int r410 = r311.m2384e();
        int r09 = r49[r514].m2384e();
        r110.m4563b(r311.f4273i, r715, r410, 0.5f, r811, r69.f4273i, r09, 5);
        goto L425
    L414:
        r811 = null;
        goto L415
    L410:
        r715 = null;
        goto L411
    L276:
        r47 = r46.f8615e0;
    L278:
        r08 = r214;
        goto L279
    L267:
        r68 = null;
        goto L268
    L263:
        r07 = null;
    L259:
        r08 = r214;
        if (r273 == false) goto L341;
        if (r122 == null) goto L341;
        int r111 = r32.f7598j;
        if (r111 > 0) goto L285;
    L287:
        boolean r223 = false;
    L288:
        C2454rb r104 = r122;
        C2454rb r132 = r104;
    L289:
        if (r104 == null) goto L279;
        C1259cb[] r113 = r104.f8596Q;
        C2454rb r219 = r104.f8631m0[r43];
    L291:
        if (r219 == null) goto L295;
        int r411 = 8;
        if (r219.f8619g0 != 8) goto L296;
        r219 = r219.f8631m0[r43];
    L296:
        if (r219 != null) goto L300;
        if (r104 == r08) goto L300;
        C2454rb r183 = r219;
        C1259cb[] r203 = r192;
        C2454rb r193 = r132;
        int r133 = r411;
    L338:
        if (r104.f8619g0 == r133) goto L340;
        r193 = r104;
    L340:
        r104 = r183;
        r132 = r193;
        r192 = r203;
    L300:
        C1259cb r313 = r113[r15];
        C0256Fy r515 = r313.f4273i;
        C1259cb r610 = r313.f4270f;
        if (r610 == null) goto L303;
        C0256Fy r611 = r610.f4273i;
    L304:
        if (r132 == r104) goto L306;
        r611 = r132.f8596Q[r15 + 1].f4273i;
    L311:
        int r314 = r313.m2384e();
        int r716 = r15 + 1;
        int r813 = r113[r716].m2384e();
        if (r219 == null) goto L314;
        C1259cb r911 = r219.f8596Q[r15];
        C0256Fy r412 = r911.f4273i;
    L318:
        C0256Fy r114 = r113[r716].f4273i;
        if (r911 == null) goto L321;
        r813 = r813 + r911.m2384e();
    L321:
        int r912 = r132.f8596Q[r716].m2384e() + r314;
        if (r515 == null) goto L336;
        if (r611 == null) goto L336;
        if (r412 == null) goto L336;
        if (r114 == null) goto L336;
        if (r104 != r122) goto L328;
        r912 = r122.f8596Q[r15].m2384e();
    L328:
        if (r104 != r08) goto L330;
        r813 = r08.f8596Q[r716].m2384e();
    L330:
        C0256Fy r315 = r611;
        C0256Fy r612 = r412;
        int r413 = r912;
        if (r223 == false) goto L334;
        int r913 = 8;
    L335:
        r183 = r219;
        r203 = r192;
        r193 = r132;
        r133 = 8;
        r41.m4563b(r515, r315, r413, 0.5f, r612, r114, r813, r913);
        goto L338
    L334:
        r913 = 5;
    L336:
        r183 = r219;
        r203 = r192;
        r193 = r132;
        r133 = 8;
        goto L338
    L314:
        r911 = r112.f8596Q[r716].f4270f;
        if (r911 == null) goto L317;
        r412 = r911.f4273i;
        goto L318
    L317:
        r412 = null;
        goto L318
    L306:
        if (r104 != r122) goto L311;
        C1259cb r613 = r192[r15].f4270f;
        if (r613 == null) goto L310;
        r611 = r613.f4273i;
        goto L311
    L310:
        r611 = null;
        goto L311
    L303:
        r611 = null;
        goto L304
    L295:
        r411 = 8;
        goto L296
    L285:
        if (r32.f7597i != r111) goto L287;
        r223 = true;
    L341:
        C1259cb[] r204 = r192;
        int r134 = 8;
        if (r232 == false) goto L279;
        if (r122 == null) goto L279;
        int r115 = r32.f7598j;
        if (r115 > 0) goto L347;
    L349:
        boolean r224 = false;
    L350:
        C2454rb r116 = r122;
        C2454rb r105 = r116;
    L351:
        if (r105 == null) goto L391;
        C1259cb[] r220 = r105.f8596Q;
        C2454rb r316 = r105.f8631m0[r43];
    L353:
        if (r316 == null) goto L357;
        if (r316.f8619g0 != r134) goto L357;
        r316 = r316.f8631m0[r43];
    L357:
        if (r105 == r122) goto L386;
        if (r105 == r08) goto L386;
        if (r316 == null) goto L386;
        if (r316 != r08) goto L362;
        r316 = null;
    L362:
        C1259cb r414 = r220[r15];
        C0256Fy r221 = r414.f4273i;
        int r717 = r15 + 1;
        C0256Fy r614 = r116.f8596Q[r717].f4273i;
        int r415 = r414.m2384e();
        int r814 = r220[r717].m2384e();
        if (r316 == null) goto L368;
        C1259cb r516 = r316.f8596Q[r15];
        C0256Fy r914 = r516.f4273i;
        C1259cb r135 = r516.f4270f;
        if (r135 == null) goto L367;
        C0256Fy r136 = r135.f4273i;
    L373:
        if (r516 == null) goto L375;
        r814 = r814 + r516.m2384e();
    L375:
        int r416 = r415 + r116.f8596Q[r717].m2384e();
        C2454rb r517 = r316;
        C0256Fy r615 = r914;
        if (r224 == false) goto L378;
        int r915 = 8;
    L379:
        if (r221 == null) goto L384;
        if (r614 == null) goto L384;
        if (r615 == null) goto L384;
        if (r136 == null) goto L384;
        C2454rb r184 = r517;
        C0256Fy r718 = r136;
        C2454rb r137 = r116;
        r41.m4563b(r221, r614, r416, 0.5f, r615, r718, r814, r915);
    L385:
        r316 = r184;
    L388:
        if (r105.f8619g0 == 8) goto L390;
        r137 = r105;
    L390:
        r105 = r316;
        r116 = r137;
        r134 = 8;
    L384:
        r137 = r116;
        r184 = r517;
        goto L385
    L378:
        r915 = 4;
        goto L379
    L367:
        r136 = null;
        goto L373
    L368:
        C1259cb r916 = r08.f8596Q[r15];
        if (r916 == null) goto L371;
        C0256Fy r138 = r916.f4273i;
    L372:
        C0256Fy r392 = r138;
        r136 = r220[r717].f4273i;
        r516 = r916;
        r914 = r392;
        goto L373
    L371:
        r138 = null;
    L386:
        r137 = r116;
        goto L388
    L391:
        r110 = r41;
        C1259cb r225 = r122.f8596Q[r15];
        C1259cb r317 = r204[r15].f4270f;
        int r518 = r15 + 1;
        C1259cb r106 = r08.f8596Q[r518];
        C1259cb r139 = r112.f8596Q[r518].f4270f;
        if (r317 == null) goto L397;
        if (r122 == r08) goto L395;
        r110.m4566e(r225.f4273i, r317.f4273i, r225.m2384e(), 5);
        goto L397
    L395:
        if (r139 == null) goto L397;
        r110.m4563b(r225.f4273i, r317.f4273i, r225.m2384e(), 0.5f, r106.f4273i, r139.f4273i, r106.m2384e(), 5);
    L397:
        if (r139 == null) goto L400;
        if (r122 == r08) goto L400;
        r110.m4566e(r106.f4273i, r139.f4273i, -r106.m2384e(), 5);
        goto L400
    L347:
        if (r32.f7597i != r115) goto L349;
        r224 = true;
        goto L350
    L123:
        r96 = false;
        goto L124
    L120:
        r215 = false;
        goto L121
    L116:
        r222 = false;
        goto L115
    L126:
        r192 = r6;
        int r917 = r46.f8625j0;
        if (r917 != 0) goto L130;
        boolean r233 = true;
    L131:
        if (r917 != 1) goto L134;
        boolean r2110 = true;
    L135:
        if (r917 != 2) goto L137;
        r96 = true;
    L138:
        r62 = r5;
        r292 = r73;
        r273 = r233;
        r232 = r2110;
        goto L125
    L137:
        r96 = false;
        goto L138
    L134:
        r2110 = false;
        goto L135
    L130:
        r233 = false;
        goto L131
    L110:
        r84 = false;
        goto L111
    L104:
        if (r10.contains(r5) == true) goto L107;
        r173 = r13;
        goto L425
    L95:
        if (r32.f7602n == false) goto L97;
        r213 = true;
        goto L98
    L89:
        if (r32.f7601m == false) goto L91;
        r32.f7593e = r12;
        goto L93
    L100:
        r262 = r22;
        goto L101
    L426:
        return;
    L6:
        r2 = r0.f8762A0;
        r3 = r0.f8763B0;
        r15 = 2;
        goto L5
    }

    /* JADX INFO: renamed from: G */
    public static boolean m2682G(C0552Mt[] r6, C0552Mt[] r7) {
        if (r6 == null) goto L21;
        if (r7 == null) goto L21;
        if (r6.length == r7.length) goto L9;
        return false;
    L9:
        int r1 = 0;
    L11:
        if (r1 >= r6.length) goto L19;
        C0552Mt r2 = r6[r1];
        char r3 = r2.f1820a;
        C0552Mt r4 = r7[r1];
        if (r3 != r4.f1820a) goto L18;
        if (r2.f1821b.length != r4.f1821b.length) goto L18;
        r1 = r1 + 1;
    L18:
        return false;
    L19:
        return true;
    L21:
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static byte[] m2683H(byte[] r3) {
        Deflater r0 = new Deflater(1);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        DeflaterOutputStream r2 = new DeflaterOutputStream(r1, r0);     // Catch: Throwable -> L8
        r2.write(r3);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L8
        r0.end();
        return r1.toByteArray();
    L10:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L13
    L15:
        throw th;     // Catch: Throwable -> L8
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r0.end();
        throw th;
    }

    /* JADX INFO: renamed from: I */
    public static float[] m2684I(float[] r2, int r3) {
        if (r3 < 0) goto L10;
        int r0 = r2.length;
        if (r0 < 0) goto L8;
        int r02 = Math.min(r3, r0);
        float[] r32 = new float[r3];
        System.arraycopy(r2, 0, r32, 0, r02);
        return r32;
    L8:
        throw new ArrayIndexOutOfBoundsException();
    L10:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: J */
    public static C2648vx m2685J(Object r2) {
        C2648vx r0 = new C2648vx();
        if ((r2 instanceof Class) == false) goto L6;
        r0.f9163b = (Class) r2;
        return r0;
    L6:
        r0.f9164c = r2;
        if (r2 == null) goto L9;
        Class<?> r22 = r2.getClass();
    L10:
        r0.f9163b = r22;
        return r0;
    L9:
        r22 = null;
        goto L10
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m2686K(C0192Ed[] r8, byte[] r9) {
        int r0 = r8.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L5;
        C0192Ed r4 = r8[r2];
        r3 = r3 + (((((r4.f586g * 2) + 7) & (-8)) / 8) + (((r4.f584e * 2) + (m2693S(r4.f580a, r4.f581b, r9).getBytes(StandardCharsets.UTF_8).length + 16)) + r4.f585f));
        r2 = r2 + 1;
        goto L3
    L5:
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(r3);
        if (Arrays.equals(r9, AbstractC0148Dc.f395l) == false) goto L10;
        int r22 = r8.length;
    L8:
        if (r1 >= r22) goto L17;
        C0192Ed r42 = r8[r1];
        m2722v0(r02, r42, m2693S(r42.f580a, r42.f581b, r9));
        m2721u0(r02, r42);
        r1 = r1 + 1;
    L17:
        if (r02.size() != r3) goto L21;
        return r02.toByteArray();
    L21:
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + r02.size() + " expected=" + r3);
    L10:
        int r23 = r8.length;
        int r43 = 0;
    L11:
        if (r43 >= r23) goto L13;
        C0192Ed r5 = r8[r43];
        m2722v0(r02, r5, m2693S(r5.f580a, r5.f581b, r9));
        r43 = r43 + 1;
        goto L11
    L13:
        int r92 = r8.length;
    L14:
        if (r1 >= r92) goto L17;
        m2721u0(r02, r8[r1]);
        r1 = r1 + 1;
        goto L14
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC0828TB m2687L(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return new C0684Pw();
    L8:
        return new C2275nc();
    L10:
        return new C0684Pw();
    }

    /* JADX INFO: renamed from: M */
    public static C0552Mt[] m2688M(String r17) {
        ArrayList r1 = new ArrayList();
        int r2 = 0;
        int r5 = 0;
        int r4 = 1;
    L4:
        if (r4 >= r17.length()) goto L61;
    L6:
        if (r4 >= r17.length()) goto L15;
        char r6 = r17.charAt(r4);
        if (((r6 - 'Z') * (r6 - 'A')) > 0) goto L10;
    L11:
        if (r6 == 'e') goto L14;
        if (r6 != 'E') goto L15;
    L14:
        r4 = r4 + 1;
        goto L6
    L10:
        if (((r6 - 'z') * (r6 - 'a')) > 0) goto L14;
    L15:
        String r52 = r17.substring(r5, r4).trim();
        if (r52.isEmpty() == true) goto L59;
        if (r52.charAt(r2) != 'z') goto L20;
    L57:
        float[] r3 = new float[r2];
    L58:
        r1.add(new C0552Mt(r52.charAt(r2), r3));
        goto L59
    L20:
        if (r52.charAt(r2) == 'Z') goto L57;
        float[] r62 = new float[r52.length()];     // Catch: NumberFormatException -> L47
        int r9 = r52.length();     // Catch: NumberFormatException -> L47
        int r11 = r2;
        int r10 = 1;
    L23:
        if (r10 >= r9) goto L54;
        int r13 = r2;
        int r14 = r13;
        int r15 = r14;
        int r16 = r15;
        int r12 = r10;
    L26:
        if (r12 >= r52.length()) goto L45;
        char r32 = r52.charAt(r12);     // Catch: NumberFormatException -> L47
        if (r32 == ' ') goto L41;
        if (r32 == 'E') goto L40;
        if (r32 == 'e') goto L40;
        switch(r32) {
            case 44: goto L41;
            case 45: goto L36;
            case 46: goto L33;
            default: goto L39;
        };     // Catch: NumberFormatException -> L47
    L33:
        if (r14 != 0) goto L35;
        r13 = 0;
        r14 = 1;
    L42:
        if (r15 != 0) goto L45;
        r12 = r12 + 1;     // Catch: NumberFormatException -> L47
    L35:
        r13 = 0;
        r15 = 1;
        r16 = 1;
        goto L42
    L36:
        if (r12 == r10) goto L39;
        if (r13 == 0) goto L35;
    L39:
        r13 = 0;
    L40:
        r13 = 1;
    L41:
        r13 = 0;
        r15 = 1;
    L45:
        if (r10 >= r12) goto L49;
        r62[r11] = Float.parseFloat(r52.substring(r10, r12));     // Catch: NumberFormatException -> L47
        r11 = r11 + 1;     // Catch: NumberFormatException -> L47
    L49:
        if (r16 == 0) goto L52;
        r10 = r12;
    L51:
        r2 = 0;
        goto L23
    L52:
        r10 = r12 + 1;     // Catch: NumberFormatException -> L47
        goto L51
    L54:
        r3 = m2684I(r62, r11);     // Catch: NumberFormatException -> L47
        r2 = 0;
    L47:
        e = move-exception;
        throw new RuntimeException(AbstractC2374ph.m4814k("error in parsing \"", r52, "\""), e);
    L59:
        r5 = r4;
        r4 = r4 + 1;
        r2 = 0;
        goto L4
    L61:
        if ((r4 - r5) == 1) goto L63;
    L65:
        int r22 = 0;
    L67:
        return (C0552Mt[]) r1.toArray(new C0552Mt[r22]);
    L63:
        if (r5 >= r17.length()) goto L65;
        r22 = 0;
        r1.add(new C0552Mt(r17.charAt(r5), new float[0]));
        goto L67
    }

    /* JADX INFO: renamed from: N */
    public static Bitmap m2689N(InputStream r4, BitmapFactory.Options r5, C2656w4 r6) {
        int r0 = Build.VERSION.SDK_INT;
        Bitmap r1 = null;
        if (r0 != 34) goto L36;
        boolean r3 = false;
        if (r0 == 34) goto L8;
    L9:
        boolean r02 = false;
    L11:
        if (r02 == false) goto L36;
        boolean r62 = r6.m5217y();     // Catch: IOException -> L14
    L15:
        if (r62 == false) goto L36;
        Bitmap.Config r63 = r5.inPreferredConfig;
        Bitmap.Config r03 = Bitmap.Config.HARDWARE;
        if (r63 != r03) goto L19;
        r3 = true;
    L19:
        AbstractC0714Qj.m1484f("", r3);
        r5.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap r42 = BitmapFactory.decodeStream(r4, null, r5);     // Catch: Throwable -> L30
        if (r42 != null) goto L41;
        if (r42 != null) goto L26;
    L24:
        r5.inPreferredConfig = r03;
        return r1;
    L26:
        r42.recycle();
        goto L24
    L41:
        r1 = m2712l0(r42);     // Catch: Throwable -> L28
    L28:
        th = th;
        r1 = r42;
    L31:
        if (r1 == null) goto L33;
        r1.recycle();
    L33:
        r5.inPreferredConfig = Bitmap.Config.HARDWARE;
        throw th;
    L30:
        th = th;
    L14:
        r62 = false;
        goto L15
    L8:
        if (r5.inPreferredConfig != Bitmap.Config.HARDWARE) goto L9;
        r02 = ((Boolean) AbstractC1293cr.f4726b.get()).booleanValue();
    L36:
        return BitmapFactory.decodeStream(r4, null, r5);
    }

    /* JADX INFO: renamed from: P */
    public static C0552Mt[] m2690P(C0552Mt[] r4) {
        C0552Mt[] r0 = new C0552Mt[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L6;
        r0[r1] = new C0552Mt(r4[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m2691Q(File r6) {
        if (r6.isDirectory() == false) goto L16;
        File[] r62 = r6.listFiles();
        if (r62 != null) goto L7;
        return false;
    L7:
        int r2 = r62.length;
        int r3 = 0;
        boolean r4 = true;
    L8:
        if (r3 >= r2) goto L15;
        if (m2691Q(r62[r3]) == false) goto L13;
        if (r4 == false) goto L13;
        r4 = true;
    L14:
        r3 = r3 + 1;
    L13:
        r4 = false;
        goto L14
    L15:
        return r4;
    L16:
        r6.delete();
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static C0096C9 m2692R(DexKitBridge r16, C1117a r17) {
        int r1 = r17.m2033b(4);
        if (r1 == 0) goto L5;
        int r5 = r17.f3526b.getInt(r1 + r17.f3525a);
    L6:
        int r12 = r17.m2033b(6);
        if (r12 == 0) goto L9;
        int r6 = r17.f3526b.getInt(r12 + r17.f3525a);
    L10:
        int r13 = r17.m2033b(8);
        if (r13 == 0) goto L13;
        r17.m2035d(r13 + r17.f3525a);
    L13:
        int r14 = r17.m2033b(10);
        if (r14 == 0) goto L16;
        int r7 = r17.f3526b.getInt(r14 + r17.f3525a);
    L17:
        int r15 = r17.m2033b(12);
        Integer r3 = null;
        if (r15 == 0) goto L20;
        String r18 = r17.m2035d(r15 + r17.f3525a);
    L21:
        if (r18 != null) goto L23;
        r18 = "";
    L23:
        String r8 = r18;
        int r19 = r17.m2033b(14);
        if (r19 == 0) goto L26;
        int r110 = r17.f3526b.getInt(r19 + r17.f3525a);
    L28:
        if (r110 != (-1)) goto L30;
    L29:
        Integer r9 = r3;
        ArrayList r10 = new ArrayList();
        int r32 = r17.m2033b(16);
        if (r32 == 0) goto L34;
        int r33 = r17.m2037f(r32);
    L35:
        int r4 = 0;
    L36:
        if (r4 >= r33) goto L42;
        int r11 = r17.m2033b(16);
        if (r11 == 0) goto L40;
        int r112 = r17.f3526b.getInt((r4 * 4) + r17.m2036e(r11));
    L41:
        r10.add(Integer.valueOf(r112));
        r4 = r4 + 1;
        goto L36
    L40:
        r112 = 0;
        goto L41
    L42:
        ArrayList r113 = new ArrayList();
        int r34 = r17.m2033b(18);
        if (r34 == 0) goto L45;
        int r35 = r17.m2037f(r34);
    L46:
        int r42 = 0;
    L47:
        if (r42 >= r35) goto L53;
        int r122 = r17.m2033b(18);
        if (r122 == 0) goto L51;
        int r123 = r17.f3526b.getInt((r42 * 4) + r17.m2036e(r122));
    L52:
        r113.add(Integer.valueOf(r123));
        r42 = r42 + 1;
        goto L47
    L51:
        r123 = 0;
        goto L52
    L53:
        ArrayList r124 = new ArrayList();
        int r36 = r17.m2033b(20);
        if (r36 == 0) goto L56;
        int r37 = r17.m2037f(r36);
    L57:
        int r43 = 0;
    L58:
        if (r43 >= r37) goto L65;
        int r132 = r17.m2033b(20);
        if (r132 == 0) goto L62;
        int r133 = r17.f3526b.getInt((r43 * 4) + r17.m2036e(r132));
    L63:
        r124.add(Integer.valueOf(r133));
        r43 = r43 + 1;
        goto L58
    L62:
        r133 = 0;
        goto L63
    L65:
        return new C0096C9(r16, r5, r6, r7, r8, r9, r10, r113, r124);
    L56:
        r37 = 0;
        goto L57
    L45:
        r35 = 0;
        goto L46
    L34:
        r33 = 0;
        goto L35
    L30:
        r3 = Integer.valueOf(r110);
        goto L29
    L26:
        r110 = 0;
        goto L28
    L20:
        r18 = null;
        goto L21
    L16:
        r7 = 0;
        goto L17
    L9:
        r6 = 0;
        goto L10
    L5:
        r5 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: S */
    public static String m2693S(String r6, String r7, byte[] r8) {
        byte[] r0 = AbstractC0148Dc.f396m;
        byte[] r1 = AbstractC0148Dc.f397n;
        String r3 = "!";
        if (Arrays.equals(r8, r1) == false) goto L6;
    L7:
        Object r2 = ":";
    L10:
        if (r6.length() > 0) goto L20;
        if ("!".equals(r2) == false) goto L16;
        return r7.replace(":", "!");
    L16:
        if (":".equals(r2) == true) goto L18;
    L46:
        return r7;
    L18:
        return r7.replace("!", ":");
    L20:
        if (r7.equals("classes.dex") == false) goto L23;
        return r6;
    L23:
        if (r7.contains("!") == true) goto L39;
        if (r7.contains(":") == true) goto L39;
        if (r7.endsWith(".apk") == true) goto L46;
        StringBuilder r22 = new StringBuilder();
        r22.append(r6);
        if (Arrays.equals(r8, r1) == false) goto L34;
    L35:
        r3 = ":";
    L37:
        return AbstractC0213Ey.m410h(r22, r3, r7);
    L34:
        if (Arrays.equals(r8, r0) == false) goto L37;
    L39:
        if ("!".equals(r2) == false) goto L43;
        return r7.replace(":", "!");
    L43:
        if (":".equals(r2) == false) goto L46;
        return r7.replace("!", ":");
    L6:
        if (Arrays.equals(r8, r0) == true) goto L7;
        r2 = "!";
        goto L10
    }

    /* JADX INFO: renamed from: T */
    public static C1420fn m2694T(String r2) {
        AtomicReference r0 = AbstractC0640Ov.f2045a;
        monitor-enter(AbstractC0640Ov.class);
        Map r1 = Collections.unmodifiableMap(AbstractC0640Ov.f2048d);     // Catch: Throwable -> L11
        monitor-exit(AbstractC0640Ov.class);
        C1420fn r02 = (C1420fn) r1.get(r2);
        if (r02 == null) goto L10;
        return r02;
    L10:
        throw new GeneralSecurityException("cannot find key template: ".concat(r2));
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: U */
    public static Drawable m2695U(Context r1, int r2) {
        return C2776yw.m5347b().m5350c(r1, r2);
    }

    /* JADX INFO: renamed from: V */
    public static int m2696V(List r4, InputStream r5, C2812zp r6) {
        if (r5 != null) goto L6;
        return -1;
    L6:
        if (r5.markSupported() == true) goto L8;
        r5 = new C1340dv(r5, r6);
    L8:
        r5.mark(5242880);
        int r1 = r4.size();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L24;
        int r3 = ((InterfaceC1331dl) r4.get(r2)).mo567b(r5, r6);     // Catch: Throwable -> L16
        r5.reset();
        if (r3 != (-1)) goto L19;
        r2 = r2 + 1;
        goto L9
    L19:
        return r3;
    L16:
        th = move-exception;
        r5.reset();
        throw th;
    L24:
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public static ImageHeaderParser$ImageType m2697W(List r3, InputStream r4, C2812zp r5) {
        if (r4 != null) goto L6;
        return ImageHeaderParser$ImageType.UNKNOWN;
    L6:
        if (r4.markSupported() == true) goto L8;
        r4 = new C1340dv(r4, r5);
    L8:
        r4.mark(5242880);
        int r52 = r3.size();
        int r0 = 0;
    L9:
        if (r0 >= r52) goto L20;
        ImageHeaderParser$ImageType r1 = ((InterfaceC1331dl) r3.get(r0)).mo571f(r4);     // Catch: Throwable -> L16
        r4.reset();
        if (r1 != ImageHeaderParser$ImageType.UNKNOWN) goto L25;
        r0 = r0 + 1;
        goto L9
    L25:
        return r1;
    L16:
        th = move-exception;
        r4.reset();
        throw th;
    L20:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: X */
    public static ImageHeaderParser$ImageType m2698X(List r5, ByteBuffer r6) {
        if (r6 == null) goto L4;
        int r0 = r5.size();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L17;
        ImageHeaderParser$ImageType r3 = ((InterfaceC1331dl) r5.get(r2)).mo566a(r6);     // Catch: Throwable -> L13
        AtomicReference r4 = AbstractC2529t6.f8828a;
        ByteBuffer r42 = (ByteBuffer) r6.position(0);
        if (r3 != ImageHeaderParser$ImageType.UNKNOWN) goto L11;
        r2 = r2 + 1;
        goto L6
    L11:
        return r3;
    L13:
        th = move-exception;
        AtomicReference r02 = AbstractC2529t6.f8828a;
        ByteBuffer r62 = (ByteBuffer) r6.position(0);
        throw th;
    L17:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L4:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m2699Y(Application r2) {
        AbstractC0295Gu.m625r(-579038900910133L);
        ApplicationInfo r22 = r2.getPackageManager().getApplicationInfo(r2.getPackageName(), 128);
        AbstractC0295Gu.m625r(-579090440517685L);
        Bundle r23 = r22.metaData;
        if (r23 == null) goto L5;
        String r24 = r23.getString(AbstractC0295Gu.m625r(-577544252291125L));
    L6:
        if (r24 != null) goto L8;
        return true;
    L8:
        if (r24.length() == 0) goto L14;
        return false;
    L14:
        return true;
    L5:
        r24 = null;
        goto L6
    }

    /* JADX INFO: renamed from: Z */
    public static InterfaceC1137ac m2700Z(InterfaceC1137ac r2, InterfaceC1137ac r3) {
        if (r3 != C0366If.f1247a) goto L6;
        return r2;
    L6:
        return (InterfaceC1137ac) r3.mo25q(r2, new C0309H7(6));
    }

    /* JADX INFO: renamed from: a0 */
    public static byte[] m2701a0(InputStream r3, int r4) {
        byte[] r0 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r0, r1, r4 - r1);
        if (r2 < 0) goto L8;
        r1 = r1 + r2;
        goto L3
    L8:
        throw new IllegalStateException(AbstractC2374ph.m4812i(r4, "Not enough bytes to read: "));
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: b0 */
    public static int[] m2702b0(ByteArrayInputStream r5, int r6) {
        int[] r0 = new int[r6];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r6) goto L5;
        r2 = r2 + ((int) m2709i0(r5, 2));
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: c0 */
    public static byte[] m2703c0(FileInputStream r8, int r9, int r10) {
        Inflater r0 = new Inflater();
        byte[] r1 = new byte[r10];     // Catch: Throwable -> L15
        byte[] r2 = new byte[2048];     // Catch: Throwable -> L15
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r0.finished() == true) goto L22;
        if (r0.needsDictionary() == true) goto L22;
        if (r4 >= r9) goto L22;
        int r6 = r8.read(r2);     // Catch: Throwable -> L15
        if (r6 < 0) goto L21;
        r0.setInput(r2, 0, r6);     // Catch: Throwable -> L15
        r5 = r5 + r0.inflate(r1, r5, r10 - r5);
        r4 = r4 + r6;
        goto L5
    L17:
        e = move-exception;
        throw new IllegalStateException(e.getMessage());     // Catch: Throwable -> L15
    L21:
        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");     // Catch: Throwable -> L15
    L22:
        if (r4 != r9) goto L30;
        if (r0.finished() == false) goto L28;
        r0.end();
        return r1;
    L28:
        throw new IllegalStateException("Inflater did not finish");     // Catch: Throwable -> L15
    L30:
        throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r0.end();
        throw th;
    }

    /* JADX INFO: renamed from: d0 */
    public static C0192Ed[] m2704d0(FileInputStream r6, byte[] r7, byte[] r8, C0192Ed[] r9) {
        byte[] r0 = AbstractC0148Dc.f398o;
        if (Arrays.equals(r7, r0) == false) goto L27;
        if (Arrays.equals(AbstractC0148Dc.f393j, r8) == true) goto L25;
        if (Arrays.equals(r7, r0) == false) goto L23;
        int r72 = (int) m2709i0(r6, 1);
        long r02 = m2709i0(r6, 4);
        byte[] r82 = m2703c0(r6, (int) m2709i0(r6, 4), (int) r02);
        if (r6.read() > 0) goto L21;
        ByteArrayInputStream r62 = new ByteArrayInputStream(r82);
        C0192Ed[] r73 = m2705e0(r62, r72, r9);     // Catch: Throwable -> L14
        r62.close();
        return r73;
    L14:
        th = move-exception;
        r62.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L21:
        throw new IllegalStateException("Content found after the end of file");
    L23:
        throw new IllegalStateException("Unsupported meta version");
    L25:
        throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    L27:
        if (Arrays.equals(r7, AbstractC0148Dc.f399p) == false) goto L43;
        int r74 = (int) m2709i0(r6, 2);
        long r03 = m2709i0(r6, 4);
        byte[] r04 = m2703c0(r6, (int) m2709i0(r6, 4), (int) r03);
        if (r6.read() > 0) goto L41;
        ByteArrayInputStream r63 = new ByteArrayInputStream(r04);
        C0192Ed[] r75 = m2706f0(r63, r8, r74, r9);     // Catch: Throwable -> L34
        r63.close();
        return r75;
    L34:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L37
    L39:
        throw th;
    L37:
        th = move-exception;
        th.addSuppressed(th);
        goto L39
    L41:
        throw new IllegalStateException("Content found after the end of file");
    L43:
        throw new IllegalStateException("Unsupported meta version");
    }

    /* JADX INFO: renamed from: e0 */
    public static C0192Ed[] m2705e0(ByteArrayInputStream r8, int r9, C0192Ed[] r10) {
        int r1 = 0;
        if (r8.available() != 0) goto L7;
        return new C0192Ed[0];
    L7:
        if (r9 != r10.length) goto L19;
        String[] r0 = new String[r9];
        int[] r2 = new int[r9];
        int r3 = 0;
    L9:
        if (r3 >= r9) goto L11;
        int r5 = (int) m2709i0(r8, 2);
        r2[r3] = (int) m2709i0(r8, 2);
        r0[r3] = new String(m2701a0(r8, r5), StandardCharsets.UTF_8);
        r3 = r3 + 1;
    L11:
        if (r1 >= r9) goto L17;
        C0192Ed r32 = r10[r1];
        if (r32.f581b.equals(r0[r1]) == false) goto L16;
        int r4 = r2[r1];
        r32.f584e = r4;
        r32.f587h = m2702b0(r8, r4);
        r1 = r1 + 1;
        goto L11
    L16:
        throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
    L17:
        return r10;
    L19:
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* JADX INFO: renamed from: f0 */
    public static C0192Ed[] m2706f0(ByteArrayInputStream r10, byte[] r11, int r12, C0192Ed[] r13) {
        if (r10.available() != 0) goto L7;
        return new C0192Ed[0];
    L7:
        if (r12 != r13.length) goto L35;
        int r0 = 0;
    L9:
        if (r0 >= r12) goto L33;
        m2709i0(r10, 2);
        String r4 = new String(m2701a0(r10, (int) m2709i0(r10, 2)), StandardCharsets.UTF_8);
        long r5 = m2709i0(r10, 4);
        int r2 = (int) m2709i0(r10, 2);
        C0192Ed r7 = null;
        if (r13.length <= 0) goto L26;
        int r3 = r4.indexOf("!");
        if (r3 >= 0) goto L16;
        r3 = r4.indexOf(":");
    L16:
        if (r3 <= 0) goto L18;
        String r32 = r4.substring(r3 + 1);
    L19:
        int r8 = 0;
    L21:
        if (r8 >= r13.length) goto L26;
        if (r13[r8].f581b.equals(r32) == true) goto L24;
        r8 = r8 + 1;
        goto L21
    L24:
        r7 = r13[r8];
        goto L26
    L18:
        r32 = r4;
    L26:
        if (r7 == null) goto L32;
        r7.f583d = r5;
        int[] r33 = m2702b0(r10, r2);
        if (Arrays.equals(r11, AbstractC0148Dc.f397n) == false) goto L30;
        r7.f584e = r2;
        r7.f587h = r33;
    L30:
        r0 = r0 + 1;
        goto L9
    L32:
        throw new IllegalStateException("Missing profile key: ".concat(r4));
    L33:
        return r13;
    L35:
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    /* JADX INFO: renamed from: g0 */
    public static C0192Ed[] m2707g0(FileInputStream r5, byte[] r6, String r7) {
        if (Arrays.equals(r6, AbstractC0148Dc.f394k) == false) goto L19;
        int r62 = (int) m2709i0(r5, 1);
        long r1 = m2709i0(r5, 4);
        byte[] r0 = m2703c0(r5, (int) m2709i0(r5, 4), (int) r1);
        if (r5.read() > 0) goto L17;
        ByteArrayInputStream r52 = new ByteArrayInputStream(r0);
        C0192Ed[] r63 = m2710j0(r52, r7, r62);     // Catch: Throwable -> L10
        r52.close();
        return r63;
    L10:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw new IllegalStateException("Content found after the end of file");
    L19:
        throw new IllegalStateException("Unsupported version");
    }

    /* JADX INFO: renamed from: h0 */
    public static final String m2708h0(Reader r4) {
        StringWriter r0 = new StringWriter();
        char[] r1 = new char[8192];
        int r2 = r4.read(r1);
    L3:
        if (r2 < 0) goto L6;
        r0.write(r1, 0, r2);
        r2 = r4.read(r1);
        goto L3
    L6:
        return r0.toString();
    }

    /* JADX INFO: renamed from: i0 */
    public static long m2709i0(InputStream r6, int r7) {
        byte[] r62 = m2701a0(r6, r7);
        long r0 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r0 = r0 + (((long) (r62[r2] & 255)) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: j0 */
    public static C0192Ed[] m2710j0(ByteArrayInputStream r19, String r20, int r21) {
        int r3 = 0;
        if (r19.available() == 0) goto L5;
        C0192Ed[] r2 = new C0192Ed[r21];
        int r4 = 0;
    L8:
        if (r4 >= r21) goto L10;
        int r6 = (int) m2709i0(r19, 2);
        int r14 = (int) m2709i0(r19, 2);
        long r7 = m2709i0(r19, 4);
        r2[r4] = new C0192Ed(r20, new String(m2701a0(r19, r6), StandardCharsets.UTF_8), m2709i0(r19, 4), r14, (int) r7, (int) m2709i0(r19, 4), new int[r14], new TreeMap());
        r4 = r4 + 1;
        goto L8
    L10:
        int r42 = 0;
    L11:
        if (r42 >= r21) goto L48;
        C0192Ed r62 = r2[r42];
        int r72 = r19.available();
        int r8 = r62.f585f;
        int r9 = r62.f586g;
        TreeMap r10 = r62.f588i;
        int r73 = r72 - r8;
        int r82 = r3;
    L14:
        if (r19.available() <= r73) goto L28;
        r82 = r82 + ((int) m2709i0(r19, 2));
        r10.put(Integer.valueOf(r82), 1);
        int r11 = (int) m2709i0(r19, 2);
    L16:
        if (r11 <= 0) goto L14;
        m2709i0(r19, 2);
        int r142 = (int) m2709i0(r19, 1);
        if (r142 == 6) goto L27;
        if (r142 == 7) goto L27;
    L22:
        if (r142 <= 0) goto L27;
        m2709i0(r19, 1);
        int r15 = r3;
        int r16 = r42;
        int r32 = (int) m2709i0(r19, 1);
    L24:
        if (r32 <= 0) goto L26;
        m2709i0(r19, 2);
        r32 = r32 - 1;
        goto L24
    L26:
        r142 = r142 - 1;
        r3 = r15;
        r42 = r16;
    L27:
        r11 = r11 - 1;
        r3 = r3;
        r42 = r42;
        goto L16
    L28:
        int r152 = r3;
        int r162 = r42;
        if (r19.available() != r73) goto L47;
        r62.f587h = m2702b0(r19, r62.f584e);
        BitSet r33 = BitSet.valueOf(m2701a0(r19, (((r9 * 2) + 7) & (-8)) / 8));
        int r43 = r152;
    L31:
        if (r43 >= r9) goto L45;
        if (r33.get(r43) == false) goto L35;
        int r63 = 2;
    L37:
        if (r33.get(r43 + r9) == false) goto L39;
        r63 = r63 | 4;
    L39:
        if (r63 == 0) goto L44;
        Integer r74 = (Integer) r10.get(Integer.valueOf(r43));
        if (r74 != null) goto L43;
        r74 = Integer.valueOf(r152);
    L43:
        r10.put(Integer.valueOf(r43), Integer.valueOf(r63 | r74.intValue()));
    L44:
        r43 = r43 + 1;
        goto L31
    L35:
        r63 = r152;
        goto L37
    L45:
        r42 = r162 + 1;
        r3 = r152;
        goto L11
    L47:
        throw new IllegalStateException("Read too much data during profile line parse");
    L48:
        return r2;
    L5:
        return new C0192Ed[0];
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m2711k0(InterfaceC0190Eb r10, Object r11) {
        if ((r10 instanceof C1367ee) == false) goto L55;
        C1367ee r102 = (C1367ee) r10;
        AbstractC1217bc r0 = r102.f4894d;
        AbstractC0233Fb r1 = r102.f4895e;
        InterfaceC1137ac r2 = r1.f731b;
        Throwable r3 = C0340Hw.m726a(r11);
        if (r3 != null) goto L7;
        Object r4 = r11;
    L62:
        if (r0.mo2333u(r2) == false) goto L13;
        r102.f4896f = r4;
        r102.f5157c = 1;
        m2713m0(r0, r2, r102);
        return;
    L13:
        AbstractC2588ug r02 = AbstractC1129aB.m2050a();
        if (r02.f8957b < 4294967296L) goto L19;
        r102.f4896f = r4;
        r102.f5157c = 1;
        C0134D4 r112 = r02.f8959d;
        if (r112 != null) goto L18;
        r112 = new C0134D4();
        r02.f8959d = r112;
    L18:
        r112.addLast(r102);
        return;
    L19:
        r02.m5096y(true);
        InterfaceC1332dm r32 = (InterfaceC1332dm) r2.mo24m(C1456gf.f5162f);     // Catch: Throwable -> L25
        if (r32 != null) goto L23;
    L27:
        Object r33 = AbstractC0295Gu.m604E(r2, r102.f4897g);     // Catch: Throwable -> L25
        if (r33 == AbstractC0295Gu.f1005j) goto L31;
        C2664wC r42 = AbstractC0148Dc.m289w(r1, r2, r33);     // Catch: Throwable -> L25
    L57:
        r1.mo264f(r11);     // Catch: Throwable -> L40
        if (r42 != null) goto L35;
    L36:
        AbstractC0295Gu.m601B(r2, r33);     // Catch: Throwable -> L25
    L38:
        if (r02.m5097z() == true) goto L38;
    L39:
        r02.m5095w();
        return;
    L35:
        if (r42.m5231P() == false) goto L38;
    L40:
        th = move-exception;
        if (r42 != null) goto L43;
    L44:
        AbstractC0295Gu.m601B(r2, r33);     // Catch: Throwable -> L25
    L45:
        throw th;     // Catch: Throwable -> L25
    L43:
        if (r42.m5231P() == false) goto L45;
    L31:
        r42 = null;
        goto L57
    L23:
        if (r32.mo1745d() == true) goto L27;
        r102.mo264f(new C0297Gw(r32.mo1748p()));     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r102.m2782h(th);     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        r02.m5095w();
        throw th;
    L52:
        th = move-exception;
        throw new C1324de(th, r0, r2);
    L7:
        r4 = new C0189Ea(r3, false);
        goto L62
    L55:
        r10.mo264f(r11);
    }

    /* JADX INFO: renamed from: l0 */
    public static Bitmap m2712l0(Bitmap r8) {
        Gainmap r0 = AbstractC0499Lj.m966d(r8);
        if (r0 == null) goto L16;
        Bitmap.Config r2 = AbstractC0499Lj.m965c(r0).getConfig();
        Bitmap.Config r3 = Bitmap.Config.ALPHA_8;
        if (r2 != r3) goto L16;
        ColorMatrixColorFilter r22 = AbstractC0542Mj.f1759a;
        Bitmap r23 = AbstractC0499Lj.m965c(r0);
        if (r23.getConfig() == r3) goto L10;
    L14:
        AbstractC0499Lj.m967e(r8, r0);
        goto L16
    L10:
        if (r23.getConfig() != r3) goto L12;
        boolean r32 = true;
    L13:
        AbstractC0714Qj.m1484f("", r32);
        Bitmap r33 = Bitmap.createBitmap(r23.getWidth(), r23.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas r4 = new Canvas(r33);
        Paint r6 = new Paint();
        r6.setColorFilter(AbstractC0542Mj.f1759a);
        r4.drawBitmap(r23, 0.0f, 0.0f, r6);
        r4.setBitmap(null);
        Gainmap r24 = AbstractC0499Lj.m972j(r33);
        float[] r34 = AbstractC0499Lj.m979q(r0);
        AbstractC0499Lj.m978p(r24, r34[0], r34[1], r34[2]);
        float[] r35 = AbstractC0499Lj.m981s(r0);
        AbstractC0499Lj.m980r(r24, r35[0], r35[1], r35[2]);
        float[] r36 = AbstractC0499Lj.m970h(r0);
        AbstractC0499Lj.m969g(r24, r36[0], r36[1], r36[2]);
        float[] r37 = AbstractC0499Lj.m975m(r0);
        AbstractC0499Lj.m974l(r24, r37[0], r37[1], r37[2]);
        float[] r38 = AbstractC0499Lj.m977o(r0);
        AbstractC0499Lj.m976n(r24, r38[0], r38[1], r38[2]);
        AbstractC0499Lj.m968f(r24, AbstractC0499Lj.m963a(r0));
        AbstractC0499Lj.m973k(r24, AbstractC0499Lj.m971i(r0));
        r0 = r24;
        goto L14
    L12:
        r32 = false;
    L16:
        return r8.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m2713m0(AbstractC1217bc r1, InterfaceC1137ac r2, Runnable r3) {
        r1.mo1781t(r2, r3);     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        throw new C1324de(th, r1, r2);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m2714n0(View r2, C1021Xq r3) {
        C2101jf r0 = r3.f3241b.f2904c;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f7390a == false) goto L16;
        ViewParent r22 = r2.getParent();
        float r02 = 0.0f;
    L8:
        if ((r22 instanceof View) == false) goto L10;
        r02 = r02 + ((View) r22).getElevation();
        r22 = r22.getParent();
        goto L8
    L10:
        C0935Vq r23 = r3.f3241b;
        if (r23.f2914m == r02) goto L17;
        r23.f2914m = r02;
        r3.m1933s();
        return;
    L17:
        return;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m2715o0(Drawable r0, int r1) {
        r0.setTint(r1);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m2716p0(Drawable r0, ColorStateList r1) {
        r0.setTintList(r1);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m2717q0(Drawable r0, PorterDuff.Mode r1) {
        r0.setTintMode(r1);
    }

    /* JADX INFO: renamed from: r0 */
    public static Class m2718r0(String r3) {
        AbstractC0295Gu.m625r(-579361023457333L);
        Class<?> r0 = AbstractC1450gG.f5069c.loadClass(r3);     // Catch: Throwable -> L5
        AbstractC0295Gu.m625r(-579391088228405L);     // Catch: Throwable -> L5
        return r0;
    L6:
        throw new NullPointerException(AbstractC0295Gu.m625r(-578905756923957L).concat(r3));
    }

    /* JADX INFO: renamed from: s0 */
    public static final C1402fC m2719s0(String r8) {
        int r0 = r8.length();
        if (r0 == 0) goto L36;
        int r1 = 0;
        char r2 = r8.charAt(0);
        if (AbstractC0585Nj.m1139g(r2, 48) >= 0) goto L12;
        int r3 = 1;
        if (r0 != 1) goto L10;
        return null;
    L10:
        if (r2 != '+') goto L37;
    L13:
        int r4 = 119304647;
    L14:
        if (r3 >= r0) goto L30;
        int r5 = Character.digit(r8.charAt(r3), 10);
        if (r5 < 0) goto L38;
        if (Integer.compareUnsigned(r1, r4) <= 0) goto L24;
        if (r4 != 119304647) goto L39;
        r4 = Integer.divideUnsigned(-1, 10);
        if (Integer.compareUnsigned(r1, r4) <= 0) goto L24;
        return null;
    L39:
        return null;
    L24:
        int r12 = r1 * 10;
        int r52 = r5 + r12;
        if (Integer.compareUnsigned(r52, r12) < 0) goto L41;
        r3 = r3 + 1;
        r1 = r52;
        goto L14
    L41:
        return null;
    L38:
        return null;
    L30:
        return new C1402fC(r1);
    L37:
        return null;
    L12:
        r3 = 0;
        goto L13
    L36:
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m2720t0(ByteArrayOutputStream r19, byte[] r20, C0192Ed[] r21) {
        byte[] r3 = AbstractC0148Dc.f397n;
        byte[] r4 = AbstractC0148Dc.f396m;
        byte[] r5 = AbstractC0148Dc.f393j;
        int r8 = 0;
        if (Arrays.equals(r20, r5) == false) goto L112;
        ArrayList r1 = new ArrayList(3);
        ArrayList r42 = new ArrayList(3);
        ByteArrayOutputStream r6 = new ByteArrayOutputStream();
        m2726z0(r6, r21.length);     // Catch: Throwable -> L10
        int r10 = 2;
        int r11 = 0;
        int r12 = 2;
    L7:
        if (r11 >= r21.length) goto L12;
        C0192Ed r13 = r21[r11];     // Catch: Throwable -> L10
        m2725y0(r6, r13.f582c, 4);     // Catch: Throwable -> L10
        m2725y0(r6, r13.f583d, 4);     // Catch: Throwable -> L10
        m2725y0(r6, r13.f586g, 4);     // Catch: Throwable -> L10
        String r132 = m2693S(r13.f580a, r13.f581b, r5);     // Catch: Throwable -> L10
        Charset r14 = StandardCharsets.UTF_8;     // Catch: Throwable -> L10
        int r15 = r132.getBytes(r14).length;     // Catch: Throwable -> L10
        m2726z0(r6, r15);     // Catch: Throwable -> L10
        r12 = (r12 + 14) + r15;     // Catch: Throwable -> L10
        r6.write(r132.getBytes(r14));     // Catch: Throwable -> L10
        r11 = r11 + 1;     // Catch: Throwable -> L10
        goto L7
    L12:
        byte[] r52 = r6.toByteArray();     // Catch: Throwable -> L10
        if (r12 != r52.length) goto L106;
        C0789SF r112 = new C0789SF(1, r52, false);     // Catch: Throwable -> L10
        r6.close();
        r1.add(r112);
        ByteArrayOutputStream r53 = new ByteArrayOutputStream();
        int r62 = 0;
        int r113 = 0;
    L152:
    L24:
        th = move-exception;
        r53.close();     // Catch: Throwable -> L102
        throw th;
    L102:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L18:
        if (r62 >= r21.length) goto L26;
        C0192Ed r122 = r21[r62];     // Catch: Throwable -> L24
        m2726z0(r53, r62);     // Catch: Throwable -> L24
        m2726z0(r53, r122.f584e);     // Catch: Throwable -> L24
        r113 = (r113 + 4) + (r122.f584e * r10);     // Catch: Throwable -> L24
        int[] r123 = r122.f587h;     // Catch: Throwable -> L24
        int r152 = r123.length;     // Catch: Throwable -> L24
        int r16 = r8;
        int r202 = r10;
        int r102 = r16;
    L20:
        if (r102 >= r152) goto L22;
        int r17 = r123[r102];     // Catch: Throwable -> L24
        m2726z0(r53, r17 - r16);     // Catch: Throwable -> L24
        r102 = r102 + 1;     // Catch: Throwable -> L24
        r16 = r17;
        goto L20
    L22:
        r62 = r62 + 1;     // Catch: Throwable -> L24
        r10 = r202;
        r8 = 0;
        goto L152
    L26:
        byte[] r63 = r53.toByteArray();     // Catch: Throwable -> L24
        if (r113 != r63.length) goto L99;
        C0789SF r82 = new C0789SF(3, r63, true);     // Catch: Throwable -> L24
        r53.close();
        r1.add(r82);
        ByteArrayOutputStream r32 = new ByteArrayOutputStream();
        int r54 = 0;
        int r64 = 0;
    L157:
    L42:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L95
        throw th;
    L95:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L31:
        if (r54 >= r21.length) goto L58;
        C0192Ed r83 = r21[r54];     // Catch: Throwable -> L42
        Iterator r103 = r83.f588i.entrySet().iterator();     // Catch: Throwable -> L42
        int r114 = 0;
    L34:
        if (r103.hasNext() == false) goto L36;
        r114 = r114 | ((Integer) ((Map.Entry) r103.next()).getValue()).intValue();     // Catch: Throwable -> L42
        goto L34
    L36:
        ByteArrayOutputStream r104 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        m2723w0(r104, r114, r83);     // Catch: Throwable -> L51
        byte[] r124 = r104.toByteArray();     // Catch: Throwable -> L51
        r104.close();     // Catch: Throwable -> L42
        ByteArrayOutputStream r105 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        m2724x0(r105, r83);     // Catch: Throwable -> L44
        byte[] r84 = r105.toByteArray();     // Catch: Throwable -> L44
        r105.close();     // Catch: Throwable -> L42
        m2726z0(r32, r54);     // Catch: Throwable -> L42
        int r106 = (r124.length + 2) + r84.length;     // Catch: Throwable -> L42
        int r65 = r64 + 6;     // Catch: Throwable -> L42
        int r153 = r54;
        m2725y0(r32, r106, 4);     // Catch: Throwable -> L42
        m2726z0(r32, r114);     // Catch: Throwable -> L42
        r32.write(r124);     // Catch: Throwable -> L42
        r32.write(r84);     // Catch: Throwable -> L42
        r64 = r65 + r106;
        r54 = r153 + 1;
        goto L157
    L44:
        th = move-exception;
        r105.close();     // Catch: Throwable -> L48
    L178:
        throw th;     // Catch: Throwable -> L42
    L48:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L51:
        th = move-exception;
        r104.close();     // Catch: Throwable -> L55
    L179:
        throw th;     // Catch: Throwable -> L42
    L55:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L58:
        byte[] r2 = r32.toByteArray();     // Catch: Throwable -> L42
        if (r64 != r2.length) goto L92;
        C0789SF r55 = new C0789SF(4, r2, true);     // Catch: Throwable -> L42
        r32.close();
        r1.add(r55);
        long r22 = 4;
        long r23 = ((r22 + r22) + 4) + ((long) (r1.size() * 16));
        m2725y0(r19, r1.size(), 4);
        int r56 = 0;
    L63:
        if (r56 >= r1.size()) goto L87;
        C0789SF r66 = (C0789SF) r1.get(r56);
        int r85 = r66.f2486a;
        byte[] r107 = r66.f2487b;
        if (r85 != 1) goto L67;
        long r115 = 0;
    L81:
        m2725y0(r19, r115, 4);
        m2725y0(r19, r23, 4);
        if (r66.f2488c == false) goto L85;
        long r116 = r107.length;
        byte[] r67 = m2683H(r107);
        r42.add(r67);
        m2725y0(r19, r67.length, 4);
        m2725y0(r19, r116, 4);
        int r68 = r67.length;
    L84:
        r23 = r23 + ((long) r68);
        r56 = r56 + 1;
        goto L63
    L85:
        r42.add(r107);
        m2725y0(r19, r107.length, 4);
        m2725y0(r19, 0, 4);
        r68 = r107.length;
        goto L84
    L67:
        if (r85 != 2) goto L69;
        r115 = 1;
        goto L81
    L69:
        if (r85 != 3) goto L71;
        r115 = 2;
        goto L81
    L71:
        if (r85 != 4) goto L73;
        r115 = 3;
        goto L81
    L73:
        if (r85 != 5) goto L76;
        r115 = 4;
        goto L81
    L76:
        throw null;
    L87:
        int r86 = 0;
    L89:
        if (r86 >= r42.size()) goto L144;
        r19.write((byte[]) r42.get(r86));
        r86 = r86 + 1;
    L144:
        return true;
    L92:
        throw new IllegalStateException("Expected size " + r64 + ", does not match actual size " + r2.length);     // Catch: Throwable -> L42
    L99:
        throw new IllegalStateException("Expected size " + r113 + ", does not match actual size " + r63.length);     // Catch: Throwable -> L24
    L106:
        throw new IllegalStateException("Expected size " + r12 + ", does not match actual size " + r52.length);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L109
        throw th;
    L109:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L112:
        byte[] r57 = AbstractC0148Dc.f394k;
        if (Arrays.equals(r20, r57) == false) goto L117;
        byte[] r18 = m2686K(r21, r57);
        m2725y0(r19, r21.length, 1);
        m2725y0(r19, r18.length, 4);
        byte[] r110 = m2683H(r18);
        m2725y0(r19, r110.length, 4);
        r19.write(r110);
        return true;
    L117:
        if (Arrays.equals(r20, r4) == false) goto L128;
        m2725y0(r19, r21.length, 1);
        int r111 = r21.length;
        int r33 = 0;
    L119:
        if (r33 >= r111) goto L144;
        C0192Ed r58 = r21[r33];
        int r69 = r58.f588i.size() * 4;
        String r87 = m2693S(r58.f580a, r58.f581b, r4);
        Charset r108 = StandardCharsets.UTF_8;
        m2726z0(r19, r87.getBytes(r108).length);
        m2726z0(r19, r58.f587h.length);
        m2725y0(r19, r69, 4);
        m2725y0(r19, r58.f582c, 4);
        r19.write(r87.getBytes(r108));
        Iterator r610 = r58.f588i.keySet().iterator();
    L122:
        if (r610.hasNext() == false) goto L124;
        m2726z0(r19, ((Integer) r610.next()).intValue());
        m2726z0(r19, 0);
        goto L122
    L124:
        int[] r59 = r58.f587h;
        int r611 = r59.length;
        int r88 = 0;
    L125:
        if (r88 >= r611) goto L127;
        m2726z0(r19, r59[r88]);
        r88 = r88 + 1;
        goto L125
    L127:
        r33 = r33 + 1;
        goto L119
    L128:
        byte[] r43 = AbstractC0148Dc.f395l;
        if (Arrays.equals(r20, r43) == false) goto L133;
        byte[] r117 = m2686K(r21, r43);
        m2725y0(r19, r21.length, 1);
        m2725y0(r19, r117.length, 4);
        byte[] r118 = m2683H(r117);
        m2725y0(r19, r118.length, 4);
        r19.write(r118);
        return true;
    L133:
        if (Arrays.equals(r20, r3) == false) goto L145;
        m2726z0(r19, r21.length);
        int r119 = r21.length;
        int r89 = 0;
    L135:
        if (r89 >= r119) goto L144;
        C0192Ed r44 = r21[r89];
        String r510 = r44.f580a;
        TreeMap r612 = r44.f588i;
        String r511 = m2693S(r510, r44.f581b, r3);
        Charset r109 = StandardCharsets.UTF_8;
        m2726z0(r19, r511.getBytes(r109).length);
        m2726z0(r19, r612.size());
        m2726z0(r19, r44.f587h.length);
        m2725y0(r19, r44.f582c, 4);
        r19.write(r511.getBytes(r109));
        Iterator r512 = r612.keySet().iterator();
    L138:
        if (r512.hasNext() == false) goto L140;
        m2726z0(r19, ((Integer) r512.next()).intValue());
        goto L138
    L140:
        int[] r45 = r44.f587h;
        int r513 = r45.length;
        int r613 = 0;
    L141:
        if (r613 >= r513) goto L143;
        m2726z0(r19, r45[r613]);
        r613 = r613 + 1;
        goto L141
    L143:
        r89 = r89 + 1;
        goto L135
    L145:
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m2721u0(ByteArrayOutputStream r8, C0192Ed r9) {
        m2724x0(r8, r9);
        int r0 = r9.f586g;
        int[] r1 = r9.f587h;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L5;
        int r5 = r1[r3];
        m2726z0(r8, r5 - r4);
        r3 = r3 + 1;
        r4 = r5;
        goto L3
    L5:
        byte[] r12 = new byte[(((r0 * 2) + 7) & (-8)) / 8];
        Iterator r92 = r9.f588i.entrySet().iterator();
    L7:
        if (r92.hasNext() == false) goto L14;
        Map.Entry r22 = (Map.Entry) r92.next();
        int r32 = ((Integer) r22.getKey()).intValue();
        int r23 = ((Integer) r22.getValue()).intValue();
        if ((r23 & 2) == 0) goto L12;
        int r42 = r32 / 8;
        r12[r42] = (byte) (r12[r42] | (1 << (r32 % 8)));
    L12:
        if ((r23 & 4) == 0) goto L7;
        int r33 = r32 + r0;
        int r24 = r33 / 8;
        r12[r24] = (byte) ((1 << (r33 % 8)) | r12[r24]);
        goto L7
    L14:
        r8.write(r12);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m2722v0(ByteArrayOutputStream r4, C0192Ed r5, String r6) {
        Charset r0 = StandardCharsets.UTF_8;
        m2726z0(r4, r6.getBytes(r0).length);
        m2726z0(r4, r5.f584e);
        m2725y0(r4, r5.f585f, 4);
        m2725y0(r4, r5.f582c, 4);
        m2725y0(r4, r5.f586g, 4);
        r4.write(r6.getBytes(r0));
    }

    /* JADX INFO: renamed from: w0 */
    public static void m2723w0(ByteArrayOutputStream r10, int r11, C0192Ed r12) {
        int r0 = r12.f586g;
        byte[] r1 = new byte[(((Integer.bitCount(r11 & (-2)) * r0) + 7) & (-8)) / 8];
        Iterator r122 = r12.f588i.entrySet().iterator();
    L4:
        if (r122.hasNext() == false) goto L17;
        Map.Entry r2 = (Map.Entry) r122.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r22 = ((Integer) r2.getValue()).intValue();
        int r5 = 0;
        int r6 = 1;
    L7:
        if (r6 > 4) goto L4;
        if (r6 == 1) goto L9;
        if ((r6 & r11) == 0) goto L9;
        if ((r6 & r22) != r6) goto L16;
        int r7 = (r5 * r0) + r3;
        int r8 = r7 / 8;
        r1[r8] = (byte) ((1 << (r7 % 8)) | r1[r8]);
    L16:
        r5 = r5 + 1;
    L9:
        r6 = r6 << 1;
        goto L7
    L17:
        r10.write(r1);
    }

    /* JADX INFO: renamed from: x0 */
    public static void m2724x0(ByteArrayOutputStream r4, C0192Ed r5) {
        Iterator r52 = r5.f588i.entrySet().iterator();
        int r1 = 0;
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r52.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        if ((((Integer) r2.getValue()).intValue() & 1) == 0) goto L4;
        m2726z0(r4, r3 - r1);
        m2726z0(r4, 0);
        r1 = r3;
        goto L4
    }

    /* JADX INFO: renamed from: y0 */
    public static void m2725y0(ByteArrayOutputStream r6, long r7, int r9) {
        byte[] r0 = new byte[r9];
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L5;
        r0[r1] = (byte) ((r7 >> (r1 * 8)) & 255);
        r1 = r1 + 1;
        goto L3
    L5:
        r6.write(r0);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m2726z0(ByteArrayOutputStream r2, int r3) {
        m2725y0(r2, r3, 2);
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: A */
    public long mo1767A(InterfaceC0126Cx r1, int r2) {
        return mo841a();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: B */
    public InterfaceC0919Va mo839B(InterfaceC0126Cx r1) {
        return this;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: D */
    public double mo840D() {
        m2727O();
        throw null;
    }

    /* JADX INFO: renamed from: O */
    public void m2727O() {
        throw new C0341Hx(AbstractC0425Jv.m881a(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: a */
    public abstract long mo841a();

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: b */
    public InterfaceC0406Jc mo1768b(C2116ju r1, int r2) {
        return mo848u(r1.mo210j(r2));
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: e */
    public boolean mo842e() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: f */
    public boolean mo843f() {
        return true;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: g */
    public char mo844g() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: h */
    public Object mo845h(InterfaceC0717Qm r1) {
        return r1.deserialize(this);
    }

    public int hashCode() {
        switch(this.f4988a) {
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        return super.hashCode();
    L7:
        return toString().hashCode();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: i */
    public Object mo1769i(InterfaceC0126Cx r1, int r2, InterfaceC0717Qm r3, Object r4) {
        if (r3.getDescriptor().mo208h() == true) goto L10;
        if (mo843f() == true) goto L10;
        return null;
    L10:
        return mo845h(r3);
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: k */
    public double mo1771k(C2116ju r1, int r2) {
        return mo840D();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: l */
    public char mo1772l(C2116ju r1, int r2) {
        return mo844g();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: m */
    public float mo1773m(C2116ju r1, int r2) {
        return mo851z();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: n */
    public byte mo1774n(C2116ju r1, int r2) {
        return mo847t();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: o */
    public String mo1775o(InterfaceC0126Cx r1, int r2) {
        return mo850y();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: p */
    public abstract int mo846p();

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: q */
    public short mo1776q(C2116ju r1, int r2) {
        return mo849x();
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: r */
    public void mo1777r(InterfaceC0126Cx r1) {
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: s */
    public boolean mo1778s(InterfaceC0126Cx r1, int r2) {
        return mo842e();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: t */
    public abstract byte mo847t();

    public String toString() {
        switch(this.f4988a) {
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return AbstractC0425Jv.m881a(getClass()).m445b();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: u */
    public InterfaceC0406Jc mo848u(InterfaceC0126Cx r1) {
        return this;
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: v */
    public Object mo1779v(InterfaceC0126Cx r1, int r2, InterfaceC0717Qm r3, Object r4) {
        return mo845h(r3);
    }

    @Override // p000.InterfaceC0919Va
    /* JADX INFO: renamed from: w */
    public int mo1780w(InterfaceC0126Cx r1, int r2) {
        return mo846p();
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: x */
    public abstract short mo849x();

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: y */
    public String mo850y() {
        m2727O();
        throw null;
    }

    @Override // p000.InterfaceC0406Jc
    /* JADX INFO: renamed from: z */
    public float mo851z() {
        m2727O();
        throw null;
    }
}
