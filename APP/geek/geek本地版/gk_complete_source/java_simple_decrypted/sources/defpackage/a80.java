package defpackage;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a80 {
    public static final double[][] a = null;
    public static final double[][] b = null;
    public static final double[] c = null;
    public static final l0 d = null;
    public static final l0 e = null;
    public static final tk f = null;
    public static final l0 g = null;
    public static final boolean[] h = null;
    public static final byte[] i = null;
    public static final byte[] j = null;
    public static final byte[] k = null;
    public static final byte[] l = null;
    public static final byte[] m = null;
    public static final byte[] n = null;
    public static final byte[] o = null;
    public static final int[] p = null;
    public static final int[] q = null;
    public static RippleDrawable r = null;
    public static int s = 0;
    public static int t = 0;
    public static int u = 0;
    public static String v = "";

    static {
        a = new double[][]{new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
        b = new double[][]{new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
        c = new double[]{95.047d, 100.0d, 108.883d};
        int r2 = 27;
        d = new l0(r2, "UNDEFINED");
        e = new l0(r2, "REUSABLE_CLAIMED");
        f = new tk();
        g = new l0(r2, "CONDITION_FALSE");
        h = new boolean[3];
        i = new byte[]{48, 49, 53, 0};
        j = new byte[]{48, 49, 48, 0};
        k = new byte[]{48, 48, 57, 0};
        l = new byte[]{48, 48, 53, 0};
        m = new byte[]{48, 48, 49, 0};
        n = new byte[]{48, 48, 49, 0};
        o = new byte[]{48, 48, 50, 0};
        p = new int[]{R.attr.colorPrimary};
        q = new int[]{R.attr.colorPrimaryVariant};
    }

    public static final Object A(Object r1) {
        if ((r1 instanceof nb) == true) goto L5;
        return r1;
    L5:
        return ct.f(((nb) r1).a);
    }

    public static final void B(ld r10, Object r11) {
        if ((r10 instanceof tg) == false) goto L51;
        tg r102 = (tg) r10;
        ke r0 = r102.d;
        m50 r1 = r102.e;
        Throwable r2 = f10.a(r11);
        if (r2 != null) goto L7;
        Object r3 = r11;
    L8:
        r1.d();
        ge r22 = r1.b;
        if (r0.e() == false) goto L12;
        r102.f = r3;
        r102.c = 1;
        ip.l(r22);
        r0.d(r22, r102);
        return;
    L12:
        kj r02 = t60.a();
        if (r02.c < 4294967296L) goto L18;
        r102.f = r3;
        r102.c = 1;
        k6 r112 = r02.e;
        if (r112 != null) goto L17;
        r112 = new k6();
        r02.e = r112;
    L17:
        r112.addLast(r102);
        return;
    L18:
        r02.k(true);
        ip.l(r22);     // Catch: Throwable -> L24
        mp r5 = (mp) r22.b(vh.h);     // Catch: Throwable -> L24
        if (r5 != null) goto L22;
    L26:
        Object r32 = r102.g;     // Catch: Throwable -> L24
        ip.l(r22);     // Catch: Throwable -> L24
        Object r33 = ff.V(r22, r32);     // Catch: Throwable -> L24
        if (r33 == ff.x) goto L30;
        o80 r52 = ip.b0(r1, r22, r33);     // Catch: Throwable -> L24
    L53:
        r1.f(r11);     // Catch: Throwable -> L39
        if (r52 != null) goto L34;
    L35:
        ff.L(r22, r33);     // Catch: Throwable -> L24
    L37:
        if (r02.l() == true) goto L37;
    L38:
        r02.f();
        return;
    L34:
        if (r52.K() == false) goto L37;
    L39:
        th = move-exception;
        if (r52 != null) goto L42;
    L43:
        ff.L(r22, r33);     // Catch: Throwable -> L24
    L44:
        throw th;     // Catch: Throwable -> L24
    L42:
        if (r52.K() == false) goto L44;
    L30:
        r52 = null;
        goto L53
    L22:
        if (r5.a() == true) goto L26;
        CancellationException r113 = ((wp) r5).t();     // Catch: Throwable -> L24
        r102.a(r3, r113);     // Catch: Throwable -> L24
        r102.f(ct.f(r113));     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r102.h(th, null);     // Catch: Throwable -> L48
    L48:
        th = move-exception;
        r02.f();
        throw th;
    L7:
        r3 = new nb(r2, false);
        goto L8
    L51:
        r10.f(r11);
    }

    public static void E(Drawable r0, int r1) {
        ch.g(r0, r1);
    }

    public static void F(Drawable r0, ColorStateList r1) {
        ch.h(r0, r1);
    }

    public static void G(Drawable r0, PorterDuff.Mode r1) {
        ch.i(r0, r1);
    }

    public static void H(XmlPullParser r3) {
        int r0 = 1;
    L3:
        if (r0 <= 0) goto L11;
        int r1 = r3.next();
        if (r1 != 2) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        if (r1 != 3) goto L3;
        r0 = r0 - 1;
        goto L3
    }

    public static final Object I(ge r4, wm r5, m50 r6) {
        ge r0 = r6.b;
        ip.l(r0);
        if (((Boolean) r4.h(Boolean.FALSE, he.d)).booleanValue() == true) goto L5;
        ge r42 = r0.i(r4);
    L6:
        mp r1 = (mp) r42.b(vh.h);
        if (r1 != null) goto L9;
    L13:
        if (r42 != r0) goto L15;
        w10 r02 = new w10(r42, r6);
        return ct.x(r02, r02, r5);
    L15:
        vh r12 = vh.b;
        boolean r03 = ip.i(r42.b(r12), r0.b(r12));
        wo r13 = null;
        if (r03 == false) goto L23;
        o80 r04 = new o80(r42, r6);
        ge r43 = r04.c;
        Object r62 = ff.V(r43, null);
        Object r52 = ct.x(r04, r04, r5);     // Catch: Throwable -> L20
        ff.L(r43, r62);
        return r52;
    L20:
        th = move-exception;
        ff.L(r43, r62);
        throw th;
    L23:
        ug r05 = new ug(r42, r6);
        ip.X(r5, r05, r05);
        AtomicIntegerFieldUpdater r44 = ug.e;
    L24:
        int r53 = r44.get(r05);
        if (r53 != 0) goto L27;
        if (r44.compareAndSet(r05, 0, 1) == false) goto L24;
        return pe.a;
    L27:
        if (r53 != 2) goto L42;
        Object r45 = r05.x();
        if ((r45 instanceof wo) == false) goto L31;
        r13 = (wo) r45;
    L31:
        if (r13 == null) goto L37;
        vo r54 = r13.a;
        if (r54 == null) goto L37;
        r45 = r54;
    L37:
        if ((r45 instanceof nb) == true) goto L40;
        return r45;
    L40:
        throw ((nb) r45).a;
    L42:
        throw new IllegalStateException("Already suspended");
    L9:
        if (r1.a() == true) goto L13;
        throw ((wp) r1).t();
    L5:
        r42 = ip.t(r0, r4, false);
        goto L6
    }

    public static double J(double r8) {
        double r82 = (r8 + 16.0d) / 116.0d;
        double r4 = (r82 * r82) * r82;
        if (r4 > 0.008856451679035631d) goto L7;
        r4 = ((r82 * 116.0d) - 16.0d) / 903.2962962962963d;
    L7:
        return r4 * 100.0d;
    }

    public static void a(qc r40, ar r41, int r42) {
        qc r0 = r40;
        ar r1 = r41;
        if (r42 != 0) goto L6;
        int r2 = r0.l0;
        u8[] r3 = r0.o0;
        int r14 = 0;
    L5:
        int r12 = r2;
        u8[] r13 = r3;
        int r15 = 0;
    L8:
        if (r15 >= r12) goto L410;
        u8 r22 = r13[r15];
        boolean r32 = r22.q;
        pc r4 = r22.a;
        cc[] r5 = r4.F;
        int r6 = 3;
        a40 r16 = null;
        int r7 = 8;
        if (r32 == true) goto L99;
        int r33 = r22.l;
        int r17 = r33 * 2;
        pc r8 = r4;
        pc r11 = r8;
        boolean r18 = false;
        float r19 = 0.0f;
    L12:
        if (r18 == true) goto L79;
        r22.i++;
        pc[] r9 = r8.b0;
        cc[] r10 = r8.F;
        r9[r33] = null;
        r8.a0[r33] = null;
        if (r8.V == r7) goto L65;
        r8.h(r33);
        r10[r17].c();
        int r92 = r17 + 1;
        r10[r92].c();
        r10[r17].c();
        r10[r92].c();
        if (r22.b != null) goto L18;
        r22.b = r8;
    L18:
        r22.d = r8;
        int r93 = r8.c0[r33];
        if (r93 != r6) goto L65;
        int r72 = r8.l[r33];
        if (r72 == 0) goto L27;
        if (r72 == r6) goto L27;
        if (r72 == 2) goto L27;
        int r25 = r33;
        cc[] r26 = r5;
    L52:
        if (r25 != 0) goto L60;
        if (r8.j == 0) goto L57;
    L66:
        if (r11 == r8) goto L68;
        r11.b0[r25] = r8;
    L68:
        cc r34 = r10[r17 + 1].d;
        if (r34 == null) goto L74;
        pc r35 = r34.b;
        cc r52 = r35.F[r17].d;
        if (r52 == null) goto L74;
        if (r52.b != r8) goto L74;
    L75:
        if (r35 != null) goto L78;
        r35 = r8;
        r18 = true;
    L78:
        r11 = r8;
        r5 = r26;
        r6 = 3;
        r7 = 8;
        r8 = r35;
        r33 = r25;
    L74:
        r35 = null;
        goto L75
    L57:
        if (r8.m != 0) goto L66;
        int r36 = r8.n;
        goto L66
    L60:
        if (r8.k != 0) goto L66;
        if (r8.p != 0) goto L66;
        int r37 = r8.q;
    L27:
        r22.j++;
        float r62 = r8.Z[r33];
        if (r62 <= 0.0f) goto L30;
        r25 = r33;
        r22.k += r62;
    L31:
        r26 = r5;
        if (r8.V == 8) goto L46;
        if (r93 != 3) goto L46;
        if (r72 == 0) goto L38;
        if (r72 != 3) goto L46;
    L38:
        if (r62 >= 0.0f) goto L40;
        r22.n = true;
    L42:
        if (r22.h != null) goto L44;
        r22.h = new ArrayList();
    L44:
        r22.h.add(r8);
        goto L46
    L40:
        r22.o = true;
    L46:
        if (r22.f != null) goto L48;
        r22.f = r8;
    L48:
        pc r38 = r22.g;
        if (r38 == null) goto L51;
        r38.a0[r25] = r8;
    L51:
        r22.g = r8;
        goto L52
    L30:
        r25 = r33;
    L65:
        r25 = r33;
        r26 = r5;
        goto L66
    L79:
        int r252 = r33;
        cc[] r262 = r5;
        pc r39 = r22.b;
        if (r39 == null) goto L82;
        r39.F[r17].c();
    L82:
        pc r310 = r22.d;
        if (r310 == null) goto L85;
        r310.F[r17 + 1].c();
    L85:
        r22.c = r8;
        if (r252 == 0) goto L88;
    L90:
        r22.e = r4;
    L92:
        if (r22.o == true) goto L94;
    L96:
        boolean r311 = false;
    L97:
        r22.p = r311;
    L100:
        r22.q = true;
        pc r102 = r22.c;
        pc r112 = r22.b;
        pc r312 = r22.d;
        pc r53 = r22.e;
        float r63 = r22.k;
        int[] r73 = r0.c0;
        cc[] r82 = r0.F;
        if (r73[r42] != 2) goto L103;
        boolean r74 = true;
    L104:
        if (r42 != 0) goto L119;
        int r94 = r53.X;
        if (r94 != 0) goto L109;
        boolean r21 = true;
    L108:
        float r172 = r63;
        if (r94 != 1) goto L113;
        boolean r182 = true;
    L114:
        if (r94 != 2) goto L116;
        boolean r95 = true;
    L117:
        pc r64 = r4;
        boolean r28 = r74;
        boolean r253 = r21;
    L118:
        boolean r222 = false;
    L132:
        if (r222 == true) goto L182;
        cc[] r75 = r64.F;
        int[] r76 = r64.c0;
        cc r77 = r75[r14];
        if (r95 == false) goto L136;
        int r30 = 1;
    L137:
        int r342 = r77.c();
        cc[] r352 = r82;
        boolean r362 = r95;
        if (r76[r42] == 3) goto L140;
    L142:
        boolean r83 = false;
    L143:
        cc r96 = r77.d;
        if (r96 == null) goto L147;
        if (r64 == r4) goto L147;
        r342 = r96.c() + r342;
    L147:
        int r97 = r342;
        if (r362 == false) goto L152;
        if (r64 == r4) goto L152;
        if (r64 == r112) goto L152;
        r30 = 5;
    L152:
        pc r343 = r4;
        cc r43 = r77.d;
        if (r43 == null) goto L162;
        if (r64 != r112) goto L156;
        boolean r372 = r83;
        int r382 = r12;
        r1.f(r77.g, r43.g, r97, 6);
    L157:
        if (r372 == false) goto L160;
        if (r362 == true) goto L160;
        int r44 = 5;
    L161:
        r1.e(r77.g, r77.d.g, r97, r44);
    L163:
        if (r28 == true) goto L165;
    L171:
        cc r45 = r75[r14 + 1].d;
        if (r45 == null) goto L177;
        pc r46 = r45.b;
        cc r78 = r46.F[r14].d;
        if (r78 == null) goto L177;
        if (r78.b != r64) goto L177;
    L178:
        if (r46 == null) goto L180;
        r64 = r46;
    L181:
        r4 = r343;
        r82 = r352;
        r95 = r362;
        r12 = r382;
        goto L132
    L180:
        r222 = true;
    L177:
        r46 = null;
        goto L178
    L165:
        if (r64.V != 8) goto L167;
    L169:
        int r84 = 0;
    L170:
        r1.f(r75[r14].g, r352[r14].g, r84, 8);
        goto L171
    L167:
        if (r76[r42] != 3) goto L169;
        r84 = 0;
        r1.f(r75[r14 + 1].g, r75[r14].g, 0, 5);
    L160:
        r44 = r30;
        goto L161
    L156:
        r372 = r83;
        r382 = r12;
        r1.f(r77.g, r43.g, r97, 8);
        goto L157
    L162:
        r382 = r12;
        goto L163
    L140:
        if (r64.l[r42] != 0) goto L142;
        r83 = true;
        goto L143
    L136:
        r30 = 4;
        goto L137
    L182:
        cc[] r353 = r82;
        boolean r363 = r95;
        int r383 = r12;
        if (r312 == null) goto L200;
        int r65 = r14 + 1;
        if (r102.F[r65].d == null) goto L200;
        cc r47 = r312.F[r65];
        if (r312.c0[r42] != 3) goto L195;
        if (r312.l[r42] != 0) goto L195;
        if (r363 == true) goto L195;
        cc r79 = r47.d;
        if (r79.b != r0) goto L195;
        r1.e(r47.g, r79.g, -r47.c(), 5);
    L199:
        r1.g(r47.g, r102.F[r65].d.g, -r47.c(), 6);
    L195:
        if (r363 == false) goto L199;
        cc r710 = r47.d;
        if (r710.b != r0) goto L199;
        r1.e(r47.g, r710.g, -r47.c(), 4);
    L200:
        if (r28 == false) goto L202;
        int r48 = r14 + 1;
        a40 r66 = r353[r48].g;
        cc r49 = r102.F[r48];
        r1.f(r66, r49.g, r49.c(), 8);
    L202:
        ArrayList r410 = r22.h;
        if (r410 == null) goto L243;
        int r67 = r410.size();
        if (r67 <= 1) goto L243;
        if (r22.n == true) goto L209;
    L211:
        pc r98 = null;
        float r122 = r19;
        int r85 = 0;
    L212:
        if (r85 >= r67) goto L243;
        pc r711 = (pc) r410.get(r85);
        float[] r02 = r711.Z;
        cc[] r03 = r711.F;
        float r212 = r02[r42];
        if (r212 < r19) goto L216;
    L219:
        ArrayList r29 = r410;
        int r302 = r67;
        if (r212 != r19) goto L223;
        float r20 = r122;
        r1.e(r03[r14 + 1].g, r03[r14].g, 0, 8);
    L222:
        int r24 = r85;
        float r354 = r19;
        r122 = r20;
        u8[] r192 = r13;
    L242:
        r85 = r24 + 1;
        r13 = r192;
        r410 = r29;
        r67 = r302;
        r19 = r354;
        goto L212
    L223:
        float r202 = r122;
        if (r98 == null) goto L240;
        cc[] r411 = r98.F;
        a40 r99 = r411[r14].g;
        int r322 = r14 + 1;
        a40 r412 = r411[r322].g;
        a40 r68 = r03[r14].g;
        a40 r123 = r03[r322].g;
        p6 r04 = r1.k();
        pc r323 = r711;
        float r712 = r19;
        r04.b = r712;
        r354 = r712;
        if (r172 != r712) goto L228;
    L229:
        r24 = r85;
        r192 = r13;
        r04.d.i(r99, 1.0f);
        r04.d.i(r412, -1.0f);
        r04.d.i(r123, 1.0f);
        r04.d.i(r68, -1.0f);
    L239:
        r1.c(r04);
    L241:
        r122 = r212;
        r98 = r323;
        goto L242
    L228:
        if (r202 == r212) goto L229;
        if (r202 != r354) goto L235;
        r04.d.i(r99, 1.0f);
        r04.d.i(r412, -1.0f);
    L233:
        r24 = r85;
        r192 = r13;
        goto L239
    L235:
        if (r212 != r19) goto L237;
        r04.d.i(r68, 1.0f);
        r04.d.i(r123, -1.0f);
        goto L233
    L237:
        r24 = r85;
        float r86 = (r202 / r172) / (r212 / r172);
        r192 = r13;
        r04.d.i(r99, 1.0f);
        r04.d.i(r412, -1.0f);
        r04.d.i(r123, r86);
        r04.d.i(r68, -r86);
        goto L239
    L240:
        r323 = r711;
        r24 = r85;
        r354 = r19;
        r192 = r13;
        goto L241
    L216:
        if (r22.p == false) goto L218;
        r29 = r410;
        r302 = r67;
        r1.e(r03[r14 + 1].g, r03[r14].g, 0, 4);
        r20 = r122;
        goto L222
    L218:
        r212 = 1.0f;
        goto L219
    L209:
        if (r22.p == true) goto L211;
        r172 = r22.j;
    L243:
        u8[] r193 = r13;
        if (r112 == null) goto L248;
        if (r112 == r312) goto L249;
        if (r363 == false) goto L248;
    L249:
        cc r05 = r262[r14];
        int r413 = r14 + 1;
        cc r23 = r102.F[r413];
        cc r06 = r05.d;
        if (r06 == null) goto L252;
        a40 r07 = r06.g;
    L253:
        cc r27 = r23.d;
        if (r27 == null) goto L256;
        a40 r69 = r27.g;
    L257:
        cc r210 = r112.F[r14];
        cc r414 = r312.F[r413];
        if (r07 == null) goto L264;
        if (r69 == null) goto L264;
        if (r42 != 0) goto L262;
        float r54 = r53.S;
    L263:
        a40 r313 = r07;
        pc r08 = r312;
        r1.b(r210.g, r313, r210.c(), r54, r69, r414.g, r414.c(), 7);
    L265:
        ar r110 = r41;
    L387:
        if (r253 == true) goto L389;
        if (r182 == true) goto L389;
    L409:
        r15 = r15 + 1;
        r0 = r40;
        r1 = r41;
        r13 = r193;
        r12 = r383;
    L389:
        if (r112 == null) goto L409;
        if (r112 == r08) goto L409;
        cc[] r211 = r112.F;
        cc r314 = r211[r14];
        int r55 = r14 + 1;
        cc r415 = r08.F[r55];
        cc r610 = r314.d;
        if (r610 == null) goto L394;
        a40 r611 = r610.g;
    L395:
        cc r713 = r415.d;
        if (r713 == null) goto L398;
        a40 r714 = r713.g;
    L399:
        if (r102 == r08) goto L404;
        cc r715 = r102.F[r55].d;
        if (r715 == null) goto L403;
        r16 = r715.g;
    L403:
        r714 = r16;
    L404:
        if (r112 != r08) goto L406;
        r415 = r211[r55];
    L406:
        if (r611 == null) goto L409;
        if (r714 == null) goto L409;
        int r213 = r314.c();
        int r87 = r08.F[r55].c();
        a40 r315 = r611;
        r110.b(r314.g, r315, r213, 0.5f, r714, r415.g, r87, 5);
        goto L409
    L398:
        r714 = null;
        goto L399
    L394:
        r611 = null;
        goto L395
    L262:
        r54 = r53.T;
    L264:
        r08 = r312;
        goto L265
    L256:
        r69 = null;
        goto L257
    L252:
        r07 = null;
    L248:
        r08 = r312;
        if (r253 == false) goto L328;
        if (r112 == null) goto L328;
        int r111 = r22.j;
        if (r111 > 0) goto L271;
    L273:
        boolean r223 = false;
    L274:
        pc r124 = r112;
        pc r132 = r124;
    L275:
        if (r124 == null) goto L265;
        cc[] r113 = r124.F;
        pc r214 = r124.b0[r42];
    L277:
        if (r214 == null) goto L281;
        int r56 = 8;
        if (r214.V != 8) goto L282;
        r214 = r214.b0[r42];
    L282:
        if (r214 != null) goto L286;
        if (r124 == r08) goto L286;
        pc r173 = r214;
        pc r203 = r132;
        int r133 = r56;
    L325:
        if (r124.V == r133) goto L327;
        r203 = r124;
    L327:
        r124 = r173;
        r132 = r203;
    L286:
        cc r316 = r113[r14];
        a40 r416 = r316.g;
        cc r612 = r316.d;
        if (r612 == null) goto L289;
        a40 r613 = r612.g;
    L290:
        if (r132 == r124) goto L292;
        r613 = r132.F[r14 + 1].g;
    L298:
        int r317 = r316.c();
        int r716 = r14 + 1;
        int r88 = r113[r716].c();
        if (r214 == null) goto L301;
        cc r910 = r214.F[r14];
        a40 r57 = r910.g;
        a40 r114 = r113[r716].g;
    L306:
        if (r910 == null) goto L308;
        r88 = r88 + r910.c();
    L308:
        if (r132 == null) goto L310;
        r317 = r317 + r132.F[r716].c();
    L310:
        if (r416 == null) goto L323;
        if (r613 == null) goto L323;
        if (r57 == null) goto L323;
        if (r114 == null) goto L323;
        if (r124 != r112) goto L316;
        r317 = r112.F[r14].c();
    L316:
        if (r124 != r08) goto L318;
        r88 = r08.F[r716].c();
    L318:
        if (r223 == false) goto L321;
        int r911 = 8;
    L322:
        r173 = r214;
        r203 = r132;
        r133 = 8;
        r41.b(r416, r613, r317, 0.5f, r57, r114, r88, r911);
        goto L325
    L321:
        r911 = 5;
    L323:
        r173 = r214;
        r203 = r132;
        r133 = 8;
        goto L325
    L301:
        r910 = r102.F[r716].d;
        if (r910 == null) goto L304;
        r57 = r910.g;
    L305:
        r114 = r113[r716].g;
        goto L306
    L304:
        r57 = null;
        goto L305
    L292:
        if (r124 != r112) goto L298;
        if (r132 != r124) goto L298;
        cc r614 = r262[r14].d;
        if (r614 == null) goto L297;
        r613 = r614.g;
        goto L298
    L297:
        r613 = null;
        goto L298
    L289:
        r613 = null;
        goto L290
    L281:
        r56 = 8;
        goto L282
    L271:
        if (r22.i != r111) goto L273;
        r223 = true;
    L328:
        int r134 = 8;
        if (r182 == false) goto L265;
        if (r112 == null) goto L265;
        int r115 = r22.j;
        if (r115 > 0) goto L334;
    L336:
        boolean r224 = false;
    L337:
        pc r116 = r112;
        pc r125 = r116;
    L338:
        if (r125 == null) goto L378;
        cc[] r215 = r125.F;
        pc r318 = r125.b0[r42];
    L340:
        if (r318 == null) goto L344;
        if (r318.V != r134) goto L344;
        r318 = r318.b0[r42];
    L344:
        if (r125 == r112) goto L373;
        if (r125 == r08) goto L373;
        if (r318 == null) goto L373;
        if (r318 != r08) goto L349;
        r318 = null;
    L349:
        cc r417 = r215[r14];
        a40 r216 = r417.g;
        int r717 = r14 + 1;
        a40 r615 = r116.F[r717].g;
        int r418 = r417.c();
        int r89 = r215[r717].c();
        if (r318 == null) goto L355;
        cc r58 = r318.F[r14];
        a40 r912 = r58.g;
        cc r135 = r58.d;
        if (r135 == null) goto L354;
        a40 r136 = r135.g;
    L360:
        if (r58 == null) goto L362;
        r89 = r89 + r58.c();
    L362:
        int r419 = r418 + r116.F[r717].c();
        if (r224 == false) goto L365;
        int r718 = 8;
    L366:
        if (r216 == null) goto L371;
        if (r615 == null) goto L371;
        if (r912 == null) goto L371;
        if (r136 == null) goto L371;
        pc r174 = r318;
        a40 r616 = r912;
        int r913 = r718;
        a40 r719 = r136;
        pc r137 = r116;
        r41.b(r216, r615, r419, 0.5f, r616, r719, r89, r913);
    L372:
        r318 = r174;
    L375:
        if (r125.V == 8) goto L377;
        r137 = r125;
    L377:
        r125 = r318;
        r116 = r137;
        r134 = 8;
    L371:
        r137 = r116;
        r174 = r318;
        goto L372
    L365:
        r718 = 4;
        goto L366
    L354:
        r136 = null;
        goto L360
    L355:
        cc r914 = r08.F[r14];
        if (r914 == null) goto L358;
        a40 r138 = r914.g;
    L359:
        a40 r392 = r138;
        r136 = r215[r717].g;
        r58 = r914;
        r912 = r392;
        goto L360
    L358:
        r138 = null;
    L373:
        r137 = r116;
        goto L375
    L378:
        r110 = r41;
        cc r217 = r112.F[r14];
        cc r319 = r262[r14].d;
        int r59 = r14 + 1;
        cc r126 = r08.F[r59];
        cc r139 = r102.F[r59].d;
        if (r319 == null) goto L384;
        if (r112 == r08) goto L382;
        r110.e(r217.g, r319.g, r217.c(), 5);
        goto L384
    L382:
        if (r139 == null) goto L384;
        r110.b(r217.g, r319.g, r217.c(), 0.5f, r126.g, r139.g, r126.c(), 5);
    L384:
        if (r139 == null) goto L387;
        if (r112 == r08) goto L387;
        r110.e(r126.g, r139.g, -r126.c(), 5);
        goto L387
    L334:
        if (r22.i != r115) goto L336;
        r224 = true;
        goto L337
    L116:
        r95 = false;
        goto L117
    L113:
        r182 = false;
        goto L114
    L109:
        r21 = false;
        goto L108
    L119:
        r172 = r63;
        int r915 = r53.Y;
        if (r915 != 0) goto L123;
        boolean r225 = true;
    L124:
        if (r915 != 1) goto L127;
        r182 = true;
    L128:
        if (r915 != 2) goto L130;
        r95 = true;
    L131:
        r64 = r4;
        r28 = r74;
        r253 = r225;
        goto L118
    L130:
        r95 = false;
        goto L131
    L127:
        r182 = false;
        goto L128
    L123:
        r225 = false;
        goto L124
    L103:
        r74 = false;
        goto L104
    L94:
        if (r22.n == false) goto L96;
        r311 = true;
        goto L97
    L88:
        if (r22.m == false) goto L90;
        r22.e = r8;
        goto L92
    L99:
        r262 = r5;
        r19 = 0.0f;
        goto L100
    L410:
        return;
    L6:
        r2 = r0.m0;
        r3 = r0.n0;
        r14 = 2;
        goto L5
    }

    public static void b(m50 r2) {
        if (r2.b() != 2) goto L5;
        return;
    L5:
        ClassCastException r0 = new ClassCastException(r2.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
        ip.U(r0, a80.class.getName());
        throw r0;
    }

    public static void c(Context r1, AttributeSet r2, int r3, int r4) {
        TypedArray r22 = r1.obtainStyledAttributes(r2, wy.B, r3, r4);
        boolean r32 = r22.getBoolean(1, false);
        r22.recycle();
        if (r32 == false) goto L11;
        TypedValue r23 = new TypedValue();
        if (r1.getTheme().resolveAttribute(R.attr.isMaterialTheme, r23, true) == true) goto L7;
    L10:
        f(r1, q, "Theme.MaterialComponents");
        goto L11
    L7:
        if (r23.type != 18) goto L11;
        if (r23.data == 0) goto L10;
    L11:
        f(r1, p, "Theme.AppCompat");
    }

    public static void d(int r3, int r4, int r5) {
        if (r3 < 0) goto L10;
        if (r4 > r5) goto L10;
        if (r3 > r4) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("fromIndex: " + r3 + " > toIndex: " + r4);
    L10:
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }

    public static void e(Context r5, AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        TypedArray r0 = r5.obtainStyledAttributes(r6, wy.B, r8, r9);
        boolean r2 = false;
        if (r0.getBoolean(2, false) == true) goto L7;
        r0.recycle();
        return;
    L7:
        if (r10.length == 0) goto L9;
        TypedArray r52 = r5.obtainStyledAttributes(r6, r7, r8, r9);
        int r62 = r10.length;
        int r72 = 0;
    L12:
        if (r72 >= r62) goto L17;
        if (r52.getResourceId(r10[r72], -1) == (-1)) goto L15;
        r72 = r72 + 1;
        goto L12
    L15:
        r52.recycle();
    L18:
        r0.recycle();
        if (r2 == false) goto L22;
        return;
    L22:
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    L17:
        r52.recycle();
    L10:
        r2 = true;
        goto L18
    L9:
        if (r0.getResourceId(0, -1) == (-1)) goto L18;
        goto L10
    }

    public static void f(Context r2, int[] r3, String r4) {
        TypedArray r22 = r2.obtainStyledAttributes(r3);
        int r0 = 0;
    L4:
        if (r0 >= r3.length) goto L10;
        if (r22.hasValue(r0) == false) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        r22.recycle();
        throw new IllegalArgumentException(z30.j("The style on this component requires your app theme to be ", r4, " (or a descendant)."));
    L10:
        r22.recycle();
    }

    public static wk g(Context r8) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        vh r0 = new jf(16);
    L6:
        PackageManager r1 = r8.getPackageManager();
        zt.f("Package manager required to locate emoji font provider", r1);
        int r3 = 0;
        Iterator<ResolveInfo> r2 = r1.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
    L8:
        if (r2.hasNext() == false) goto L16;
        ProviderInfo r4 = r2.next().providerInfo;
        if (r4 == null) goto L8;
        ApplicationInfo r6 = r4.applicationInfo;
        if (r6 == null) goto L8;
        if ((r6.flags & 1) != 1) goto L8;
    L17:
        if (r4 != null) goto L30;
    L18:
        y1 r12 = null;
    L26:
        if (r12 != null) goto L29;
        return null;
    L29:
        return new wk(new vk(r8, r12));
    L30:
        String r22 = r4.authority;     // Catch: PackageManager.NameNotFoundException -> L24
        String r42 = r4.packageName;     // Catch: PackageManager.NameNotFoundException -> L24
        Signature[] r02 = r0.g(r1, r42);     // Catch: PackageManager.NameNotFoundException -> L24
        ArrayList r13 = new ArrayList();     // Catch: PackageManager.NameNotFoundException -> L24
        int r62 = r02.length;     // Catch: PackageManager.NameNotFoundException -> L24
    L20:
        if (r3 >= r62) goto L22;
        r13.add(r02[r3].toByteArray());     // Catch: PackageManager.NameNotFoundException -> L24
        r3 = r3 + 1;     // Catch: PackageManager.NameNotFoundException -> L24
        goto L20
    L22:
        r12 = new y1(r22, r42, "emojicompat-emoji-font", Collections.singletonList(r13));     // Catch: PackageManager.NameNotFoundException -> L24
    L24:
        e = move-exception;
        Log.wtf("emoji2.text.DefaultEmojiConfig", e);
        goto L18
    L16:
        r4 = null;
        goto L17
    L5:
        r0 = new vh(16);
        goto L6
    }

    public static String h(String r6) {
        ip.o("hexStr", r6);
        if (r6.length() != 0) goto L6;
        return "";
    L6:
        int r0 = r6.length() / 2;
        byte[] r1 = new byte[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        int r3 = r2 * 2;
        String r32 = r6.substring(r3, r3 + 2);
        ip.n("substring(...)", r32);
        ff.h(16);
        r1[r2] = (byte) (Integer.parseInt(r32, 16) ^ 90);
        r2 = r2 + 1;
        goto L7
    L10:
        return new String(r1, c9.a);
    }

    public static int i(double r2) {
        double r22 = r2 / 100.0d;
        if (r22 > 0.0031308d) goto L5;
        double r23 = r22 * 12.92d;
    L6:
        int r24 = (int) Math.round(r23 * 255.0d);
        if (r24 >= 0) goto L11;
        return 0;
    L11:
        if (r24 <= 255) goto L13;
        return 255;
    L13:
        return r24;
    L5:
        r23 = (Math.pow(r22, 0.4166666666666667d) * 1.055d) - 0.055d;
        goto L6
    }

    public static View j(View r5) {
        if ((r5 instanceof ImageView) == false) goto L6;
        return r5;
    L6:
        if ((r5 instanceof ViewGroup) == false) goto L13;
        ViewGroup r52 = (ViewGroup) r5;
        int r0 = r52.getChildCount();
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L17;
        View r2 = r52.getChildAt(r1);
        ip.n("getChildAt(...)", r2);
        View r22 = j(r2);
        if (r22 != null) goto L11;
        r1 = r1 + 1;
        goto L8
    L11:
        return r22;
    L17:
        return null;
    L13:
        return null;
    }

    public static float k(EdgeEffect r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return uh.b(r2);
    }

    public static f2 m(Context r18, y1 r19) {
        PackageManager r1 = r18.getPackageManager();
        Resources r2 = r18.getResources();
        String r3 = (String) r19.b;
        String r4 = (String) r19.c;
        ProviderInfo r6 = r1.resolveContentProvider(r3, 0);
        if (r6 == null) goto L72;
        if (r6.packageName.equals(r4) == false) goto L70;
        Signature[] r12 = r1.getPackageInfo(r6.packageName, 64).signatures;
        ArrayList r32 = new ArrayList();
        int r42 = r12.length;
        int r7 = 0;
    L7:
        if (r7 >= r42) goto L9;
        r32.add(r12[r7].toByteArray());
        r7 = r7 + 1;
        goto L7
    L9:
        tk r13 = f;
        Collections.sort(r32, r13);
        List r43 = (List) r19.e;
        if (r43 != null) goto L13;
        r43 = z(r2, 0);
    L13:
        int r22 = 0;
    L14:
        Cursor r8 = null;
        if (r22 >= r43.size()) goto L26;
        ArrayList r72 = new ArrayList((Collection) r43.get(r22));
        Collections.sort(r72, r13);
        if (r32.size() != r72.size()) goto L24;
        int r9 = 0;
    L21:
        if (r9 >= r32.size()) goto L28;
        if (Arrays.equals((byte[]) r32.get(r9), (byte[]) r72.get(r9)) == false) goto L24;
        r9 = r9 + 1;
    L28:
        if (r6 == null) goto L30;
        String r23 = r6.authority;
        ArrayList r33 = new ArrayList();
        Uri r10 = new Uri.Builder().scheme("content").authority(r23).build();
        Uri r24 = new Uri.Builder().scheme("content").authority(r23).appendPath("file").build();
        r8 = uk.a(r18.getContentResolver(), r10, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) r19.d}, null, null);     // Catch: Throwable -> L42
        if (r8 != null) goto L35;
    L62:
        if (r8 == null) goto L65;
        r8.close();
    L65:
        return new f2(0, (gl[]) r33.toArray(new gl[0]));
    L35:
        if (r8.getCount() <= 0) goto L62;
        int r0 = r8.getColumnIndex("result_code");     // Catch: Throwable -> L42
        r33 = new ArrayList();     // Catch: Throwable -> L42
        int r44 = r8.getColumnIndex("_id");     // Catch: Throwable -> L42
        int r62 = r8.getColumnIndex("file_id");     // Catch: Throwable -> L42
        int r73 = r8.getColumnIndex("font_ttc_index");     // Catch: Throwable -> L42
        int r92 = r8.getColumnIndex("font_weight");     // Catch: Throwable -> L42
        int r11 = r8.getColumnIndex("font_italic");     // Catch: Throwable -> L42
    L37:
        if (r8.moveToNext() == false) goto L62;
        if (r0 == (-1)) goto L44;
        int r17 = r8.getInt(r0);     // Catch: Throwable -> L42
    L45:
        if (r73 == (-1)) goto L47;
        int r14 = r8.getInt(r73);     // Catch: Throwable -> L42
    L48:
        if (r62 != (-1)) goto L51;
        Uri r122 = ContentUris.withAppendedId(r10, r8.getLong(r44));     // Catch: Throwable -> L42
    L50:
        Uri r132 = r122;
        if (r92 == (-1)) goto L54;
        int r15 = r8.getInt(r92);     // Catch: Throwable -> L42
    L55:
        if (r11 != (-1)) goto L57;
    L59:
        boolean r16 = false;
    L60:
        r33.add(new gl(r132, r14, r15, r16, r17));     // Catch: Throwable -> L42
        goto L37
    L57:
        if (r8.getInt(r11) != 1) goto L59;
        r16 = true;
        goto L60
    L54:
        r15 = 400;
        goto L55
    L51:
        r122 = ContentUris.withAppendedId(r24, r8.getLong(r62));     // Catch: Throwable -> L42
        goto L50
    L47:
        r14 = 0;
        goto L48
    L44:
        r17 = 0;
    L42:
        th = move-exception;
        if (r8 == null) goto L68;
        r8.close();
    L68:
        throw th;
    L30:
        return new f2(1, null);
    L24:
        r22 = r22 + 1;
        goto L14
    L26:
        r6 = null;
        goto L28
    L70:
        throw new PackageManager.NameNotFoundException("Found content provider " + r3 + ", but package was not " + r4);
    L72:
        throw new PackageManager.NameNotFoundException("No package found for authority: " + r3);
    }

    public static int n(Activity r3) {
        "act";
        gn r0 = gn.a;
        String r1 = "key_custom_accent_color";
        r0.getClass();
        String r02 = gn.d(r1, "");
        if (r02.length() <= 0) goto L7;
        return Color.parseColor(r02);
    L7:
        if ((r3.getResources().getConfiguration().uiMode & 48) != 32) goto L10;
        String r32 = "z8u0MsxsEw==\n";
        String r03 = "7POGcfQtI4I=\n";
    L11:
        return Color.parseColor(u40.a(r32, r03));
    L10:
        r32 = "O1JE1o6DLw==\n";
        r03 = "GGJzlb+1H68=\n";
        goto L11
    }

    public static final void o(ge r4, Throwable r5) {
        Iterator r0 = le.a.iterator();
    L4:
        if (r0.hasNext() == true) goto L17;
        ip.f(r5, new ng(r4));     // Catch: Throwable -> L16
    L14:
        Thread r42 = Thread.currentThread();
        r42.getUncaughtExceptionHandler().uncaughtException(r42, r5);
        return;
    L17:
        ((i2) ((CoroutineExceptionHandler) r0.next())).d(r5);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        if (r5 != th) goto L11;
        Throwable r2 = r5;
    L12:
        Thread r1 = Thread.currentThread();
        r1.getUncaughtExceptionHandler().uncaughtException(r1, r2);
        goto L4
    L11:
        r2 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        ip.f(r2, r5);
        goto L12
    }

    public static zg p(mp r9, sp r10, int r11) {
        boolean r1 = true;
        if ((r11 & 1) == 0) goto L5;
        boolean r0 = false;
    L7:
        if ((r11 & 2) != 0) goto L10;
        r1 = false;
    L10:
        wp r92 = (wp) r9;
        r92.getClass();
        Throwable r112 = null;
        if (r0 == true) goto L13;
        sp r2 = r10;
    L19:
        r2.d = r92;
    L20:
        Object r3 = r92.x();
        if ((r3 instanceof ui) == true) goto L22;
        if ((r3 instanceof vo) == false) goto L81;
        vo r4 = (vo) r3;
        mw r5 = r4.d();
        if (r5 == null) goto L46;
        zg r6 = nw.a;
        if (r0 == false) goto L73;
        if ((r3 instanceof up) == false) goto L73;
        monitor-enter(r3);
        Throwable r7 = ((up) r3).c();     // Catch: Throwable -> L59
        if (r7 == null) goto L62;
        if ((r10 instanceof ea) == false) goto L69;
        if (((up) r3).f() == false) goto L62;
    L69:
        monitor-exit(r3);
    L74:
        if (r7 != null) goto L75;
        if (r92.j(r4, r5, r2) == false) goto L20;
    L80:
        return r2;
    L75:
        if (r1 == false) goto L77;
        r10.f(r7);
    L77:
        return r6;
    L62:
        if (r92.j((vo) r3, r5, r2) == true) goto L65;
        monitor-exit(r3);
        goto L20
    L65:
        if (r7 == null) goto L66;
        r6 = r2;
        goto L69
    L66:
        monitor-exit(r3);
        return r2;
    L59:
        th = move-exception;
        throw th;
    L73:
        r7 = null;
        goto L74
    L46:
        r92.H((sp) r3);
        goto L20
    L81:
        if (r1 == false) goto L90;
        if ((r3 instanceof nb) == false) goto L85;
        nb r32 = (nb) r3;
    L86:
        if (r32 == null) goto L88;
        r112 = r32.a;
    L88:
        r10.f(r112);
        goto L90
    L85:
        r32 = null;
    L90:
        return nw.a;
    L22:
        ui r42 = (ui) r3;
        if (r42.a == true) goto L24;
        mw r33 = new mw();
        if (r42.a == false) goto L34;
        vo r52 = r33;
    L35:
        AtomicReferenceFieldUpdater r62 = wp.a;
    L37:
        if (r62.compareAndSet(r92, r42, r52) == true) goto L20;
        if (r62.get(r92) == r42) goto L37;
    L34:
        r52 = new uo(r33);
        goto L35
    L24:
        AtomicReferenceFieldUpdater r53 = wp.a;
    L26:
        if (r53.compareAndSet(r92, r3, r2) == true) goto L80;
        if (r53.get(r92) == r3) goto L26;
    L13:
        if ((r10 instanceof op) == false) goto L15;
        r2 = (op) r10;
    L16:
        if (r2 != null) goto L19;
        r2 = new jp(r10);
        goto L19
    L15:
        r2 = null;
        goto L16
    L5:
        r0 = true;
        goto L7
    }

    public static final i q(Object[] r1) {
        ip.o("array", r1);
        return new i(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p40 r(oe r1, ge r2, wm r3, int r4) {
        if ((r4 & 1) == 0) goto L5;
        r2 = wi.a;
    L5:
        ge r12 = ip.t(r1.e(), r2, true);
        xf r22 = wg.a;
        if (r12 != r22) goto L8;
    L10:
        p40 r23 = new p40(r12, true);
        int r13 = z30.t(1);
        if (r13 == 0) goto L35;
        if (r13 != 1) goto L14;
    L34:
        return r23;
    L14:
        if (r13 != 2) goto L16;
        ip.z(((m50) r3).a(r23)).f(vh.n);
        goto L34
    L16:
        if (r13 != 3) goto L32;
        ge r14 = r23.c;     // Catch: Throwable -> L24
        Object r42 = ff.V(r14, null);     // Catch: Throwable -> L24
        b((m50) r3);     // Catch: Throwable -> L26
        Object r32 = r3.e(r23, r23);     // Catch: Throwable -> L26
        ff.L(r14, r42);     // Catch: Throwable -> L24
        if (r32 == pe.a) goto L34;
        r23.f(r32);
        return r23;
    L26:
        th = move-exception;
        ff.L(r14, r42);     // Catch: Throwable -> L24
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r23.f(ct.f(th));
        return r23;
    L32:
        throw new pb();
    L35:
        ip.X(r3, r23, r23);
        return r23;
    L8:
        if (r12.b(vh.b) != null) goto L10;
        r12 = r12.i(r22);
        goto L10
    }

    public static double s(int r6) {
        double r0 = ((double) r6) / 255.0d;
        if (r0 > 0.040449936d) goto L7;
        double r02 = r0 / 12.92d;
    L6:
        return r02 * 100.0d;
    L7:
        r02 = Math.pow((r0 + 0.055d) / 1.055d, 2.4d);
        goto L6
    }

    public static int t(float r3, int r4, int r5) {
        return Color.argb(r5, gt.e((int) (Color.red(r4) * r3), 255), gt.e((int) (Color.green(r4) * r3), 255), gt.e((int) (Color.blue(r4) * r3), 255));
    }

    public static TypedArray u(Context r0, AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
        c(r0, r1, r3, r4);
        e(r0, r1, r2, r3, r4, r5);
        return r0.obtainStyledAttributes(r1, r2, r3, r4);
    }

    public static void v(EditorInfo r0, InputConnection r1, TextView r2) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (r0.hintText != null) goto L11;
        ViewParent r02 = r2.getParent();
    L7:
        if ((r02 instanceof View) == false) goto L12;
        r02 = r02.getParent();
        goto L7
    L12:
        return;
    }

    public static float w(EdgeEffect r2, float r3, float r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        th.a(r2, r3, r4);
        return r3;
    L5:
        return uh.c(r2, r3, r4);
    }

    public static cl x(XmlResourceParser r24, Resources r25) {
    L3:
        int r1 = r24.next();
        if (r1 == 2) goto L7;
        if (r1 != 1) goto L3;
    L7:
        if (r1 != 2) goto L65;
        r24.require(2, null, "font-family");
        if (r24.getName().equals("font-family") == false) goto L62;
        TypedArray r4 = r25.obtainAttributes(Xml.asAttributeSet(r24), ty.b);
        String r7 = r4.getString(0);
        String r9 = r4.getString(4);
        String r11 = r4.getString(5);
        int r12 = r4.getResourceId(1, 0);
        int r13 = r4.getInteger(2, 1);
        int r14 = r4.getInteger(3, 500);
        String r8 = r4.getString(6);
        r4.recycle();
        if (r7 == null) goto L19;
        if (r9 == null) goto L19;
        if (r11 == null) goto L19;
    L15:
        if (r24.next() == 3) goto L18;
        H(r24);
        goto L15
    L18:
        return new fl(new y1(r7, r9, r11, z(r25, r12)), r13, r14, r8);
    L19:
        ArrayList r42 = new ArrayList();
    L21:
        if (r24.next() == 3) goto L58;
        if (r24.getEventType() != 2) goto L21;
        if (r24.getName().equals("font") == true) goto L27;
        H(r24);
        goto L21
    L27:
        TypedArray r72 = r25.obtainAttributes(Xml.asAttributeSet(r24), ty.c);
        int r82 = 8;
        if (r72.hasValue(8) == true) goto L31;
        r82 = 1;
    L31:
        int r18 = r72.getInt(r82, 400);
        if (r72.hasValue(6) == false) goto L34;
        int r83 = 6;
    L36:
        if (1 != r72.getInt(r83, 0)) goto L38;
        boolean r23 = true;
    L39:
        int r84 = 9;
        if (r72.hasValue(9) == true) goto L43;
        r84 = 3;
    L43:
        int r92 = 7;
        if (r72.hasValue(7) == true) goto L47;
        r92 = 4;
    L47:
        String r22 = r72.getString(r92);
        int r19 = r72.getInt(r84, 0);
        if (r72.hasValue(5) == false) goto L50;
        int r85 = 5;
    L51:
        int r20 = r72.getResourceId(r85, 0);
        String r21 = r72.getString(r85);
        r72.recycle();
    L53:
        if (r24.next() == 3) goto L55;
        H(r24);
        goto L53
    L55:
        r42.add(new el(r18, r19, r20, r21, r22, r23));
        goto L21
    L50:
        r85 = 0;
        goto L51
    L38:
        r23 = false;
        goto L39
    L34:
        r83 = 2;
        goto L36
    L58:
        if (r42.isEmpty() == false) goto L61;
        return null;
    L61:
        return new dl((el[]) r42.toArray(new el[0]));
    L62:
        H(r24);
        return null;
    L65:
        throw new XmlPullParserException("No start tag found");
    }

    public static ge y(ge r2, ge r3) {
        ip.o("context", r3);
        if (r3 != wi.a) goto L6;
        return r2;
    L6:
        return (ge) r3.h(r2, new jb(1));
    }

    public static List z(Resources r8, int r9) {
        if (r9 == 0) goto L4;
        TypedArray r0 = r8.obtainTypedArray(r9);
    L11:
        th = move-exception;
        r0.recycle();
        throw th;
    L7:
        if (r0.length() != 0) goto L13;
        List r82 = Collections.EMPTY_LIST;     // Catch: Throwable -> L11
        r0.recycle();
        return r82;
    L13:
        ArrayList r1 = new ArrayList();     // Catch: Throwable -> L11
        if (bl.a(r0, 0) != 1) goto L25;
        int r92 = 0;
    L17:
        if (r92 >= r0.length()) goto L29;
        int r3 = r0.getResourceId(r92, 0);     // Catch: Throwable -> L11
        if (r3 == 0) goto L24;
        String[] r32 = r8.getStringArray(r3);     // Catch: Throwable -> L11
        ArrayList r4 = new ArrayList();     // Catch: Throwable -> L11
        int r5 = r32.length;     // Catch: Throwable -> L11
        int r6 = 0;
    L21:
        if (r6 >= r5) goto L23;
        r4.add(Base64.decode(r32[r6], 0));     // Catch: Throwable -> L11
        r6 = r6 + 1;     // Catch: Throwable -> L11
        goto L21
    L23:
        r1.add(r4);     // Catch: Throwable -> L11
    L24:
        r92 = r92 + 1;     // Catch: Throwable -> L11
    L29:
        r0.recycle();
        return r1;
    L25:
        String[] r83 = r8.getStringArray(r9);     // Catch: Throwable -> L11
        ArrayList r93 = new ArrayList();     // Catch: Throwable -> L11
        int r33 = r83.length;     // Catch: Throwable -> L11
        int r42 = 0;
    L26:
        if (r42 >= r33) goto L28;
        r93.add(Base64.decode(r83[r42], 0));     // Catch: Throwable -> L11
        r42 = r42 + 1;     // Catch: Throwable -> L11
        goto L26
    L28:
        r1.add(r93);     // Catch: Throwable -> L11
        goto L29
    L4:
        return Collections.EMPTY_LIST;
    }

    public abstract void C(boolean r1);

    public abstract void D(boolean r1);

    public abstract InputFilter[] l(InputFilter[] r1);
}
