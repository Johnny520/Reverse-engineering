package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: TB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0828TB {

    /* JADX INFO: renamed from: a */
    public static final C0178E5 f2609a = null;

    /* JADX INFO: renamed from: b */
    public static final C2220m6 f2610b = null;

    /* JADX INFO: renamed from: c */
    public static final C0668Pg f2611c = null;

    /* JADX INFO: renamed from: d */
    public static final C0963Wb f2612d = null;

    /* JADX INFO: renamed from: e */
    public static ViewOnClickListenerC0996X7 f2613e = null;

    /* JADX INFO: renamed from: f */
    public static int f2614f = 0;

    /* JADX INFO: renamed from: g */
    public static int f2615g = 0;

    /* JADX INFO: renamed from: h */
    public static int f2616h = 0;

    /* JADX INFO: renamed from: i */
    public static int f2617i = 0;

    /* JADX INFO: renamed from: j */
    public static int f2618j = 0;

    /* JADX INFO: renamed from: k */
    public static boolean f2619k = true;

    static {
        f2609a = new C0178E5();
        f2610b = new C2220m6(11);
        f2611c = new C0668Pg(25);
        f2612d = new C0963Wb(7);
    }

    /* JADX INFO: renamed from: A */
    public static final void m1625A(C0523M6 r3, InterfaceC0190Eb r4, boolean r5) {
        Object r0 = C0523M6.f1708g.get(r3);
        Throwable r1 = r3.mo1013d(r0);
        if (r1 == null) goto L5;
        Object r32 = new C0297Gw(r1);
    L6:
        if (r5 == false) goto L25;
        C1367ee r42 = (C1367ee) r4;
        AbstractC0233Fb r52 = r42.f4895e;
        Object r02 = r42.f4897g;
        InterfaceC1137ac r12 = r52.f731b;
        Object r03 = AbstractC0295Gu.m604E(r12, r02);
        if (r03 == AbstractC0295Gu.f1005j) goto L10;
        C2664wC r53 = AbstractC0148Dc.m289w(r52, r12, r03);
    L27:
        r42.f4895e.mo264f(r32);     // Catch: Throwable -> L19
        if (r53 != null) goto L14;
    L17:
        AbstractC0295Gu.m601B(r12, r03);
        return;
    L14:
        if (r53.m5231P() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r53 != null) goto L22;
    L23:
        AbstractC0295Gu.m601B(r12, r03);
    L24:
        throw th;
    L22:
        if (r53.m5231P() == false) goto L24;
    L10:
        r53 = null;
        goto L27
    L25:
        r4.mo264f(r32);
        return;
    L5:
        r32 = r3.mo1014g(r0);
        goto L6
    }

    /* JADX INFO: renamed from: D */
    public static void m1626D(int r6, C1496hb r7, C2454rb r8, boolean r9) {
        float r0 = r8.f8613d0;
        C1259cb r1 = r8.f8588I;
        int r2 = r1.f4270f.m2383d();
        C1259cb r3 = r8.f8590K;
        int r4 = r3.f4270f.m2383d();
        int r12 = r1.m2384e() + r2;
        int r32 = r4 - r3.m2384e();
        if (r2 != r4) goto L5;
        r0 = 0.5f;
    L6:
        int r13 = r8.m4937q();
        int r33 = (r4 - r2) - r13;
        if (r2 <= r4) goto L9;
        r33 = (r2 - r4) - r13;
    L9:
        if (r33 <= 0) goto L12;
        float r02 = (r0 * r33) + 0.5f;
    L13:
        int r03 = ((int) r02) + r2;
        int r34 = r03 + r13;
        if (r2 <= r4) goto L16;
        r34 = r03 - r13;
    L16:
        r8.m4919J(r03, r34);
        m1648q(r6 + 1, r7, r8, r9);
        return;
    L12:
        r02 = r0 * r33;
        goto L13
    L5:
        r2 = r12;
        r4 = r32;
        goto L6
    }

    /* JADX INFO: renamed from: E */
    public static void m1627E(int r7, C2454rb r8, C1496hb r9, C2454rb r10, boolean r11) {
        float r0 = r10.f8613d0;
        C1259cb r1 = r10.f8588I;
        int r12 = r1.m2384e() + r1.f4270f.m2383d();
        C1259cb r2 = r10.f8590K;
        int r3 = r2.f4270f.m2383d() - r2.m2384e();
        if (r3 < r12) goto L20;
        int r22 = r10.m4937q();
        if (r10.f8619g0 == 8) goto L18;
        int r4 = r10.f8639r;
        if (r4 == 2) goto L9;
        if (r4 != 0) goto L15;
        r22 = r3 - r12;
    L15:
        r22 = Math.max(r10.f8642u, r22);
        int r82 = r10.f8643v;
        if (r82 <= 0) goto L18;
        r22 = Math.min(r82, r22);
        goto L18
    L9:
        if ((r8 instanceof C2497sb) == false) goto L11;
        int r83 = r8.m4937q();
    L12:
        r22 = (int) ((r10.f8613d0 * 0.5f) * r83);
        goto L15
    L11:
        r83 = r8.f8599T.m4937q();
    L18:
        int r13 = r12 + ((int) ((r0 * ((r3 - r12) - r22)) + 0.5f));
        r10.m4919J(r13, r22 + r13);
        m1648q(r7 + 1, r9, r10, r11);
        return;
    }

    /* JADX INFO: renamed from: F */
    public static void m1628F(int r6, C1496hb r7, C2454rb r8) {
        float r0 = r8.f8615e0;
        C1259cb r1 = r8.f8589J;
        int r2 = r1.f4270f.m2383d();
        C1259cb r3 = r8.f8591L;
        int r4 = r3.f4270f.m2383d();
        int r12 = r1.m2384e() + r2;
        int r32 = r4 - r3.m2384e();
        if (r2 != r4) goto L5;
        r0 = 0.5f;
    L6:
        int r13 = r8.m4933k();
        int r33 = (r4 - r2) - r13;
        if (r2 <= r4) goto L9;
        r33 = (r2 - r4) - r13;
    L9:
        if (r33 <= 0) goto L12;
        float r02 = (r0 * r33) + 0.5f;
    L11:
        int r03 = (int) r02;
        int r34 = r2 + r03;
        int r5 = r34 + r13;
        if (r2 <= r4) goto L16;
        r34 = r2 - r03;
        r5 = r34 - r13;
    L16:
        r8.m4920K(r34, r5);
        m1633K(r6 + 1, r7, r8);
        return;
    L12:
        r02 = r0 * r33;
        goto L11
    L5:
        r2 = r12;
        r4 = r32;
        goto L6
    }

    /* JADX INFO: renamed from: G */
    public static void m1629G(int r7, C2454rb r8, C1496hb r9, C2454rb r10) {
        float r0 = r10.f8615e0;
        C1259cb r1 = r10.f8589J;
        int r12 = r1.m2384e() + r1.f4270f.m2383d();
        C1259cb r2 = r10.f8591L;
        int r3 = r2.f4270f.m2383d() - r2.m2384e();
        if (r3 < r12) goto L20;
        int r22 = r10.m4933k();
        if (r10.f8619g0 == 8) goto L18;
        int r4 = r10.f8640s;
        if (r4 == 2) goto L9;
        if (r4 != 0) goto L15;
        r22 = r3 - r12;
    L15:
        r22 = Math.max(r10.f8645x, r22);
        int r82 = r10.f8646y;
        if (r82 <= 0) goto L18;
        r22 = Math.min(r82, r22);
        goto L18
    L9:
        if ((r8 instanceof C2497sb) == false) goto L11;
        int r83 = r8.m4933k();
    L12:
        r22 = (int) ((r0 * 0.5f) * r83);
        goto L15
    L11:
        r83 = r8.f8599T.m4933k();
    L18:
        int r13 = r12 + ((int) ((r0 * ((r3 - r12) - r22)) + 0.5f));
        r10.m4920K(r13, r22 + r13);
        m1633K(r7 + 1, r9, r10);
        return;
    }

    /* JADX INFO: renamed from: H */
    public static void m1630H(ViewGroup r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        AbstractC2314oE.m4725b(r2, r3);
        return;
    L7:
        if (f2619k == false) goto L14;
        AbstractC2314oE.m4725b(r2, r3);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        f2619k = false;
        return;
    }

    /* JADX INFO: renamed from: I */
    public static void m1631I(String r5, Object r6) {
        if (r6 != null) goto L4;
        String r62 = "null";
    L5:
        ClassCastException r63 = new ClassCastException(r62 + " cannot be cast to " + r5);
        String r52 = AbstractC0828TB.class.getName();
        StackTraceElement[] r0 = r63.getStackTrace();
        int r1 = r0.length;
        int r2 = -1;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L11;
        if (r52.equals(r0[r3].getClassName()) == false) goto L10;
        r2 = r3;
    L10:
        r3 = r3 + 1;
        goto L6
    L11:
        r63.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r0, r2 + 1, r1));
        throw r63;
    L4:
        r62 = r6.getClass().getName();
        goto L5
    }

    /* JADX INFO: renamed from: J */
    public static C0286Gl m1632J(int r2, int r3) {
        if (r3 > Integer.MIN_VALUE) goto L7;
        C0286Gl r22 = C0286Gl.f930d;
        return C0286Gl.f930d;
    L7:
        return new C0286Gl(r2, r3 - 1, 1);
    }

    /* JADX INFO: renamed from: K */
    public static void m1633K(int r19, C1496hb r20, C2454rb r21) {
        if (r21.f8632n == false) goto L6;
        return;
    L6:
        if ((r21 instanceof C2497sb) == false) goto L8;
    L12:
        C1259cb r3 = r21.mo4340i(3);
        C1259cb r4 = r21.mo4340i(5);
        int r5 = r3.m2383d();
        int r6 = r4.m2383d();
        HashSet r7 = r3.f4265a;
        if (r7 != null) goto L15;
    L74:
        boolean r18 = true;
        r18 = true;
        r18 = true;
        if ((r21 instanceof C2150kk) == false) goto L77;
        return;
    L77:
        HashSet r32 = r4.f4265a;
        if (r32 != null) goto L80;
    L138:
        C1259cb r33 = r21.mo4340i(6);
        if (r33.f4265a != null) goto L141;
    L164:
        r21.f8632n = r18;
        return;
    L141:
        if (r33.f4267c == false) goto L164;
        int r42 = r33.m2383d();
        Iterator r34 = r33.f4265a.iterator();
    L144:
        if (r34.hasNext() == false) goto L164;
        C1259cb r52 = (C1259cb) r34.next();
        C2454rb r62 = r52.f4268d;
        int r11 = r19 + 1;
        boolean r72 = m1638e(r62);
        C1259cb r8 = r62.f8592M;
        if (r62.m4946z() == false) goto L150;
        if (r72 == false) goto L150;
        C2497sb.m4979V(r62, r20, new C0178E5());
    L150:
        if (r62.f8637p0[r18 ? 1 : 0] != 3) goto L155;
        if (r72 == true) goto L155;
    L153:
        boolean r53 = r18 ? 1 : 0;
    L163:
        r18 = r53;
    L155:
        if (r62.m4946z() == true) goto L144;
        if (r52 != r8) goto L153;
        int r54 = r52.m2384e() + r42;
        if (r62.f8584E == true) goto L161;
        r53 = r18 ? 1 : 0;
    L162:
        m1633K(r11, r20, r62);
        goto L163
    L161:
        int r73 = r54 - r62.f8607a0;
        int r9 = r62.f8601V + r73;
        r62.f8605Z = r73;
        r62.f8589J.m2391l(r73);
        r62.f8591L.m2391l(r9);
        r8.m2391l(r54);
        r53 = r18 ? 1 : 0;
        r62.f8628l = r53;
        goto L162
    L80:
        if (r4.f4267c == false) goto L138;
        Iterator r35 = r32.iterator();
    L83:
        if (r35.hasNext() == false) goto L138;
        C1259cb r43 = (C1259cb) r35.next();
        C2454rb r55 = r43.f4268d;
        int r74 = r19 + 1;
        boolean r82 = m1638e(r55);
        C1259cb r10 = r55.f8589J;
        C1259cb r112 = r55.f8591L;
        if (r55.m4946z() == false) goto L88;
        if (r82 == false) goto L88;
        C2497sb.m4979V(r55, r20, new C0178E5());
    L88:
        if (r43 != r10) goto L93;
        C1259cb r12 = r112.f4270f;
        if (r12 == null) goto L93;
        if (r12.f4267c == false) goto L93;
    L98:
        boolean r122 = true;
    L100:
        int r13 = r55.f8637p0[1];
        if (r13 != 3) goto L124;
        if (r82 == true) goto L124;
        if (r13 != 3) goto L83;
        if (r55.f8646y < 0) goto L83;
        if (r55.f8645x < 0) goto L83;
        if (r55.f8619g0 == 8) goto L116;
        if (r55.f8640s != 0) goto L83;
        if (r55.f8602W != 0.0f) goto L83;
    L116:
        if (r55.m4945y() == true) goto L83;
        if (r55.f8585F == true) goto L83;
        if (r122 == false) goto L83;
        if (r55.m4945y() == true) goto L83;
        m1629G(r74, r21, r20, r55);
    L124:
        if (r55.m4946z() == true) goto L83;
        if (r43 != r10) goto L130;
        if (r112.f4270f != null) goto L130;
        int r44 = r10.m2384e() + r6;
        r55.m4920K(r44, r55.m4933k() + r44);
        m1633K(r74, r20, r55);
    L130:
        if (r43 != r112) goto L134;
        if (r10.f4270f != null) goto L134;
        int r45 = r6 - r112.m2384e();
        r55.m4920K(r45 - r55.m4933k(), r45);
        m1633K(r74, r20, r55);
    L134:
        if (r122 == false) goto L83;
        if (r55.m4945y() == true) goto L83;
        m1628F(r74, r20, r55);
    L93:
        if (r43 != r112) goto L99;
        C1259cb r123 = r10.f4270f;
        if (r123 == null) goto L99;
        if (r123.f4267c == true) goto L98;
    L99:
        r122 = false;
        goto L100
    L15:
        if (r3.f4267c == false) goto L74;
        Iterator r36 = r7.iterator();
    L18:
        if (r36.hasNext() == false) goto L74;
        C1259cb r75 = (C1259cb) r36.next();
        C2454rb r124 = r75.f4268d;
        int r132 = r19 + 1;
        boolean r14 = m1638e(r124);
        C1259cb r15 = r124.f8589J;
        C1259cb r83 = r124.f8591L;
        if (r124.m4946z() == false) goto L23;
        if (r14 == false) goto L23;
        C2497sb.m4979V(r124, r20, new C0178E5());
    L23:
        if (r75 != r15) goto L28;
        C1259cb r102 = r83.f4270f;
        if (r102 == null) goto L28;
        if (r102.f4267c == false) goto L28;
    L33:
        boolean r103 = true;
    L36:
        int r113 = r124.f8637p0[1];
        if (r113 != 3) goto L60;
        if (r14 == true) goto L60;
        if (r113 != 3) goto L18;
        if (r124.f8646y < 0) goto L18;
        if (r124.f8645x < 0) goto L18;
        if (r124.f8619g0 == 8) goto L52;
        if (r124.f8640s != 0) goto L18;
        if (r124.f8602W != 0.0f) goto L18;
    L52:
        if (r124.m4945y() == true) goto L18;
        if (r124.f8585F == true) goto L18;
        if (r103 == false) goto L18;
        if (r124.m4945y() == true) goto L18;
        m1629G(r132, r21, r20, r124);
    L60:
        if (r124.m4946z() == true) goto L18;
        if (r75 != r15) goto L66;
        if (r83.f4270f != null) goto L66;
        int r76 = r15.m2384e() + r5;
        r124.m4920K(r76, r124.m4933k() + r76);
        m1633K(r132, r20, r124);
    L66:
        if (r75 != r83) goto L70;
        if (r15.f4270f != null) goto L70;
        int r77 = r5 - r83.m2384e();
        r124.m4920K(r77 - r124.m4933k(), r77);
        m1633K(r132, r20, r124);
    L70:
        if (r103 == false) goto L18;
        if (r124.m4945y() == true) goto L18;
        m1628F(r132, r20, r124);
    L28:
        if (r75 != r83) goto L35;
        C1259cb r104 = r15.f4270f;
        if (r104 == null) goto L35;
        if (r104.f4267c == true) goto L33;
    L35:
        r103 = false;
        goto L36
    L8:
        if (r21.m4946z() == false) goto L12;
        if (m1638e(r21) == false) goto L12;
        C2497sb.m4979V(r21, r20, new C0178E5());
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX INFO: renamed from: M */
    public static void m1634M(Context r18, Executor r19, InterfaceC0080Bu r20, boolean r21) {
        Context r0 = r18.getApplicationContext();
        String r2 = r0.getPackageName();
        ApplicationInfo r3 = r0.getApplicationInfo();
        AssetManager r4 = r0.getAssets();
        String r6 = new File(r3.sourceDir).getName();
        PackageInfo r10 = r18.getPackageManager().getPackageInfo(r2, 0);     // Catch: PackageManager.NameNotFoundException -> L243
        File r11 = r18.getFilesDir();
        if (r21 == true) goto L28;
        File r02 = new File(r11, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (r02.exists() == true) goto L271;
    L8:
        boolean r03 = false;
    L25:
        if (r03 == false) goto L28;
        r18.getPackageName();
        AbstractC0166Du.m315c(r18, false);
        return;
    L271:
        DataInputStream r32 = new DataInputStream(new FileInputStream(r02));     // Catch: IOException -> L246
        long r14 = r32.readLong();     // Catch: Throwable -> L18
        r32.close();     // Catch: IOException -> L246
        if (r14 != r10.lastUpdateTime) goto L15;
        r03 = true;
    L16:
        if (r03 == false) goto L25;
        r20.mo131b(2, null);
        goto L25
    L15:
        r03 = false;
        goto L16
    L18:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L22
        goto L8
    L295:
        throw th;     // Catch: IOException -> L246
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L246
        throw th;     // Catch: IOException -> L246
    L28:
        r18.getPackageName();
        byte[] r13 = AbstractC1406fG.f4986e;
        File r7 = new File(new File("/data/misc/profiles/cur/0", r2), "primary.prof");
        C0063Bd r22 = new C0063Bd(r4, r19, r20, r6, r7);
        byte[] r42 = r22.f148c;
        if (r42 != null) goto L33;
        r22.m99b(3, Integer.valueOf(Build.VERSION.SDK_INT));
    L31:
        boolean r72 = true;
    L236:
        boolean r9 = false;
        ?? r73 = r72;
    L237:
        if (r9 == false) goto L240;
        if (r21 == false) goto L240;
        ?? r92 = r73;
    L241:
        AbstractC0166Du.m315c(r18, r92);
        return;
    L240:
        r92 = 0;
        goto L241
    L33:
        if (r7.exists() == true) goto L35;
    L42:
        r72 = true;
        r22.m99b(4, null);
        goto L236
    L39:
        if (r7.createNewFile() == true) goto L43;
        r22.m99b(4, null);     // Catch: IOException -> L42
    L43:
        r22.f151f = true;
        ?? r74 = r22.m98a(r4, "dexopt/baseline.prof");     // Catch: IOException -> L46 FileNotFoundException -> L48
    L270:
        if (r74 != 0) goto L291;
    L82:
        C0192Ed[] r04 = r22.f152g;
        if (r04 == null) goto L117;
        r74 = Build.VERSION.SDK_INT;
        if (r74 < 31) goto L117;
        String r75 = "dexopt/baseline.profm";
        FileInputStream r33 = r22.m98a(r4, "dexopt/baseline.profm");     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
        ?? r76 = r75;
        if (r33 != null) goto L284;
        if (r33 == null) goto L114;
        r33.close();     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
        r76 = r75;
    L114:
        C0063Bd r05 = null;
        r74 = r76;
    L115:
        if (r05 == null) goto L117;
        r22 = r05;
        goto L117
    L284:
    L99:
        th = move-exception;
        r33.close();     // Catch: Throwable -> L105
        throw th;     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
    L105:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
        throw th;     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
    L89:
        if (Arrays.equals(AbstractC1406fG.f4987f, AbstractC1406fG.m2701a0(r33, 4)) == false) goto L102;
        byte[] r77 = AbstractC1406fG.m2701a0(r33, 4);     // Catch: Throwable -> L99
        r22.f152g = AbstractC1406fG.m2704d0(r33, r77, r42, r04);     // Catch: Throwable -> L99
        r33.close();     // Catch: IllegalStateException -> L93 IOException -> L95 FileNotFoundException -> L97
        r05 = r22;
        r74 = r77;
        goto L115
    L102:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L99
    L97:
        e = move-exception;
        r20.mo131b(9, e);
        r76 = r74;
    L95:
        e = move-exception;
        r20.mo131b(7, e);
        r76 = r74;
    L93:
        e = move-exception;
        r22.f152g = null;
        r20.mo131b(8, e);
        r76 = r74;
    L117:
        InterfaceC0080Bu r34 = r22.f147b;
        C0192Ed[] r06 = r22.f152g;
        byte[] r43 = r22.f148c;
        ?? r78 = r74;
        r78 = r74;
        if (r06 == null) goto L148;
        if (r43 == null) goto L148;
        ?? r79 = r22.f151f;
        if (r79 == 0) goto L147;
        r79 = new ByteArrayOutputStream();     // Catch: IllegalStateException -> L129 IOException -> L131
        r79.write(r13);     // Catch: Throwable -> L133
        r79.write(r43);     // Catch: Throwable -> L133
        if (AbstractC1406fG.m2720t0(r79, r43, r06) == true) goto L135;
        r34.mo131b(5, null);     // Catch: Throwable -> L133
        r22.f152g = null;     // Catch: Throwable -> L133
        r79.close();     // Catch: IllegalStateException -> L129 IOException -> L131
        r78 = r79;
        goto L148
    L135:
        r22.f153h = r79.toByteArray();     // Catch: Throwable -> L133
        r79.close();     // Catch: IllegalStateException -> L129 IOException -> L131
        ?? r710 = r79;
    L145:
        r22.f152g = null;
        r78 = r710;
    L133:
        th = move-exception;
        r79.close();     // Catch: Throwable -> L140
    L298:
        throw th;     // Catch: IllegalStateException -> L129 IOException -> L131
    L140:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L129 IOException -> L131
        throw th;     // Catch: IllegalStateException -> L129 IOException -> L131
    L131:
        e = move-exception;
        r34.mo131b(7, e);
        r710 = r79;
    L129:
        e = move-exception;
        r34.mo131b(8, e);
        r710 = r79;
        goto L145
    L147:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L148:
        byte[] r07 = r22.f153h;
        if (r07 != null) goto L255;
        boolean r62 = false;
        ?? r711 = 1;
    L228:
        if (r62 == false) goto L230;
        m1653w(r10, r11);
    L230:
        r9 = r62;
        r73 = r711;
        goto L237
    L255:
        if (r22.f151f == false) goto L234;
        ByteArrayInputStream r35 = new ByteArrayInputStream(r07);     // Catch: Throwable -> L172 IOException -> L219 FileNotFoundException -> L221
        FileOutputStream r44 = new FileOutputStream(r22.f149d);     // Catch: Throwable -> L212
        FileChannel r5 = r44.getChannel();     // Catch: Throwable -> L205
        FileLock r63 = r5.tryLock();     // Catch: Throwable -> L197
        if (r63 == null) goto L190;
    L187:
        th = th;
    L185:
        Throwable r93 = th;
        if (r63 == null) goto L299;
        r63.close();     // Catch: Throwable -> L194
    L300:
        throw r93;     // Catch: Throwable -> L182
    L194:
        th = move-exception;
        r93.addSuppressed(th);     // Catch: Throwable -> L182
        throw r93;     // Catch: Throwable -> L182
    L299:
        throw r93;     // Catch: Throwable -> L182
    L159:
        if (r63.isValid() == false) goto L190;
        byte[] r08 = new byte[512];     // Catch: Throwable -> L187
    L161:
        int r712 = r35.read(r08);     // Catch: Throwable -> L187
        if (r712 <= 0) goto L165;
        r44.write(r08, 0, r712);     // Catch: Throwable -> L187
        goto L161
    L165:
        r711 = 1;
        r22.m99b(1, null);     // Catch: Throwable -> L184
        r63.close();     // Catch: Throwable -> L182
        r5.close();     // Catch: Throwable -> L180
        r44.close();     // Catch: Throwable -> L178
        r35.close();     // Catch: Throwable -> L172 IOException -> L174 FileNotFoundException -> L176
        r22.f153h = null;
        r22.f152g = null;
        r62 = true;
    L190:
        throw new IOException("Unable to acquire a lock on the underlying file channel.");     // Catch: Throwable -> L184
    L182:
        th = th;
    L183:
        Throwable r64 = th;
        if (r5 == null) goto L301;
        r5.close();     // Catch: Throwable -> L202
    L302:
        throw r64;     // Catch: Throwable -> L180
    L202:
        th = move-exception;
        r64.addSuppressed(th);     // Catch: Throwable -> L180
        throw r64;     // Catch: Throwable -> L180
    L301:
        throw r64;     // Catch: Throwable -> L180
    L184:
        th = th;
    L197:
        th = th;
    L205:
        th = th;
    L181:
        Throwable r52 = th;
        r44.close();     // Catch: Throwable -> L209
    L303:
        throw r52;     // Catch: Throwable -> L178
    L209:
        th = move-exception;
        r52.addSuppressed(th);     // Catch: Throwable -> L178
        throw r52;     // Catch: Throwable -> L178
    L180:
        th = th;
    L212:
        th = th;
    L179:
        Throwable r45 = th;
        r35.close();     // Catch: Throwable -> L216
        throw r45;     // Catch: Throwable -> L172 IOException -> L174 FileNotFoundException -> L176
    L216:
        th = move-exception;
        r45.addSuppressed(th);     // Catch: Throwable -> L172 IOException -> L174 FileNotFoundException -> L176
        throw r45;     // Catch: Throwable -> L172 IOException -> L174 FileNotFoundException -> L176
    L178:
        th = th;
        goto L179
    L176:
        e = e;
    L225:
        r22.m99b(6, e);     // Catch: Throwable -> L172
        ?? r713 = r78;
    L224:
        r22.f153h = null;
        r22.f152g = null;
        r62 = false;
        r711 = r713;
    L174:
        e = e;
    L223:
        r22.m99b(7, e);     // Catch: Throwable -> L172
        r713 = r78;
    L221:
        e = e;
        r78 = 1;
    L219:
        e = e;
        r78 = 1;
        goto L223
    L234:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    L172:
        th = move-exception;
        r22.f153h = null;
        r22.f152g = null;
        throw th;
    L291:
    L64:
        e = move-exception;
        r20.mo131b(7, e);     // Catch: Throwable -> L60
    L276:
        r74.close();     // Catch: IOException -> L71
    L75:
        C0192Ed[] r94 = null;
    L76:
        r22.f152g = r94;
    L71:
        e = move-exception;
        r20.mo131b(7, e);
    L62:
        e = move-exception;
        r20.mo131b(8, e);     // Catch: Throwable -> L60
        goto L276
    L54:
        if (Arrays.equals(r13, AbstractC1406fG.m2701a0(r74, 4)) == false) goto L67;
        r94 = AbstractC1406fG.m2707g0(r74, AbstractC1406fG.m2701a0(r74, 4), r22.f150e);     // Catch: Throwable -> L60 IllegalStateException -> L62 IOException -> L64
        r74.close();     // Catch: IOException -> L58
    L58:
        e = move-exception;
        r20.mo131b(7, e);
        goto L76
    L67:
        throw new IllegalStateException("Invalid magic");     // Catch: Throwable -> L60 IllegalStateException -> L62 IOException -> L64
    L60:
        th = move-exception;
        r74.close();     // Catch: IOException -> L79
        throw th;
    L79:
        e = move-exception;
        r20.mo131b(7, e);
        throw th;
    L48:
        e = move-exception;
        r20.mo131b(6, e);
    L50:
        r74 = 0;
    L46:
        e = move-exception;
        r20.mo131b(7, e);
        goto L50
    L35:
        if (r7.canWrite() == true) goto L43;
        r22.m99b(4, null);
    L243:
        e = move-exception;
        r20.mo131b(7, e);
        AbstractC0166Du.m315c(r18, false);
    }

    /* JADX INFO: renamed from: b */
    public static final C2473ru m1635b(String r3, AbstractC2293nu r4) {
        if (AbstractC2564tz.m5059T(r3) == true) goto L15;
        Object r0 = ((C2426qq) AbstractC2645vu.f9157a.values()).iterator();
    L6:
        if (((AbstractC2289nq) r0).hasNext() == false) goto L13;
        InterfaceC0717Qm r1 = (InterfaceC0717Qm) ((C2203lq) r0).next();
        if (r3.equals(r1.getDescriptor().mo203b()) == false) goto L6;
        throw new IllegalArgumentException(AbstractC2607uz.m5118D("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + r3 + " there already exists " + AbstractC0425Jv.m881a(r1.getClass()).m445b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
    L13:
        return new C2473ru(r3, r4);
    L15:
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    /* JADX INFO: renamed from: c */
    public static void m1636c(int r2, Object r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if ((r3 instanceof Function) == true) goto L6;
    L26:
        m1631I("kotlin.jvm.functions.Function" + r2, r3);
        throw null;
    L6:
        if ((r3 instanceof InterfaceC2325oj) == false) goto L9;
        int r0 = ((InterfaceC2325oj) r3).mo122b();
    L24:
        if (r0 != r2) goto L26;
        return;
    L9:
        if ((r3 instanceof InterfaceC0884Ui) == false) goto L12;
        r0 = 0;
        goto L24
    L12:
        if ((r3 instanceof InterfaceC1416fj) == false) goto L15;
        r0 = 1;
        goto L24
    L15:
        if ((r3 instanceof Function2) == false) goto L18;
        r0 = 2;
        goto L24
    L18:
        if ((r3 instanceof C0373Im) == false) goto L21;
        r0 = 3;
        goto L24
    L21:
        if ((r3 instanceof C1354e8) == false) goto L23;
        r0 = 4;
        goto L24
    L23:
        r0 = -1;
        goto L24
    }

    /* JADX INFO: renamed from: d */
    public static final C0212Ex m1637d(String r7, AbstractC1406fG r8, InterfaceC0126Cx[] r9, InterfaceC1416fj r10) {
        if (AbstractC2564tz.m5059T(r7) == true) goto L11;
        if (r8.equals(C0128Cz.f298g) == true) goto L9;
        C0268G9 r6 = new C0268G9(r7);
        r10.mo90g(r6);
        return new C0212Ex(r7, r8, r6.f860b.size(), AbstractC0650P4.m1316K(r9), r6);
    L9:
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
    L11:
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1638e(C2454rb r8) {
        int[] r0 = r8.f8637p0;
        int r2 = r0[0];
        int r02 = r0[1];
        C2454rb r4 = r8.f8599T;
        if (r4 == null) goto L5;
        C2497sb r42 = (C2497sb) r4;
    L6:
        if (r42 == null) goto L8;
        int r5 = r42.f8637p0[0];
    L8:
        if (r42 == null) goto L11;
        int r43 = r42.f8637p0[1];
    L11:
        if (r2 != 1) goto L13;
    L29:
        boolean r22 = true;
    L30:
        if (r02 != 1) goto L32;
    L48:
        boolean r03 = true;
    L50:
        if (r8.f8602W <= 0.0f) goto L54;
        if (r22 == true) goto L56;
        if (r03 == false) goto L54;
    L56:
        return true;
    L54:
        if (r22 == false) goto L57;
        if (r03 == true) goto L56;
    L57:
        return false;
    L32:
        if (r8.mo4335B() == true) goto L48;
        if (r02 == 2) goto L48;
        if (r02 == 3) goto L36;
    L41:
        if (r02 == 3) goto L43;
    L47:
        r03 = false;
        goto L50
    L43:
        if (r8.f8640s != 1) goto L47;
        if (r8.m4941u(1, r8.m4933k()) == false) goto L47;
    L36:
        if (r8.f8640s != 0) goto L41;
        if (r8.f8602W != 0.0f) goto L41;
        if (r8.m4940t(1) == true) goto L48;
    L13:
        if (r8.mo4334A() == true) goto L29;
        if (r2 == 2) goto L29;
        if (r2 == 3) goto L17;
    L22:
        if (r2 == 3) goto L24;
    L28:
        r22 = false;
        goto L30
    L24:
        if (r8.f8639r != 1) goto L28;
        if (r8.m4941u(0, r8.m4937q()) == false) goto L28;
    L17:
        if (r8.f8639r != 0) goto L22;
        if (r8.f8602W != 0.0f) goto L22;
        if (r8.m4940t(0) == true) goto L29;
    L5:
        r42 = null;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public static int m1639f(int r2, int r3) {
        if (r3 < 0) goto L10;
        if (r2 >= 0) goto L6;
        return 0;
    L6:
        if (r2 <= r3) goto L8;
        return r3;
    L8:
        return r2;
    L10:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r3, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    /* JADX INFO: renamed from: g */
    public static long m1640g(long r3) {
        if (r3 >= (-4611686018427387903L)) goto L6;
        return -4611686018427387903L;
    L6:
        if (r3 <= 4611686018427387903L) goto L8;
        return 4611686018427387903L;
    L8:
        return r3;
    }

    /* JADX INFO: renamed from: h */
    public static String m1641h(AbstractC2744y6 r5) {
        StringBuilder r0 = new StringBuilder(r5.size());
        int r1 = 0;
    L4:
        if (r1 >= r5.size()) goto L30;
        byte r2 = r5.mo5220a(r1);
        if (r2 != 34) goto L8;
        r0.append("\\\"");
    L28:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 != 39) goto L10;
        r0.append("\\'");
        goto L28
    L10:
        if (r2 == 92) goto L25;
        switch(r2) {
            case 7: goto L24;
            case 8: goto L23;
            case 9: goto L22;
            case 10: goto L21;
            case 11: goto L20;
            case 12: goto L19;
            case 13: goto L18;
            default: goto L13;
        };
    L18:
        r0.append("\\r");
        goto L28
    L19:
        r0.append("\\f");
        goto L28
    L20:
        r0.append("\\v");
        goto L28
    L21:
        r0.append("\\n");
        goto L28
    L22:
        r0.append("\\t");
        goto L28
    L23:
        r0.append("\\b");
        goto L28
    L24:
        r0.append("\\a");
        goto L28
    L13:
        if (r2 >= 32) goto L15;
    L17:
        r0.append('\\');
        r0.append((char) (((r2 >>> 6) & 3) + 48));
        r0.append((char) (((r2 >>> 3) & 7) + 48));
        r0.append((char) ((r2 & 7) + 48));
        goto L28
    L15:
        if (r2 > 126) goto L17;
        r0.append((char) r2);
        goto L28
    L25:
        r0.append("\\\\");
        goto L28
    L30:
        return r0.toString();
    }

    /* JADX INFO: renamed from: i */
    public static ColorStateList m1642i(Context r2, C2656w4 r3, int r4) {
        TypedArray r0 = (TypedArray) r3.f9196b;
        if (r0.hasValue(r4) == false) goto L10;
        int r02 = r0.getResourceId(r4, 0);
        if (r02 == 0) goto L10;
        ColorStateList r22 = AbstractC0295Gu.m622o(r2, r02);
        if (r22 == null) goto L10;
        return r22;
    L10:
        return r3.m5209p(r4);
    }

    /* JADX INFO: renamed from: j */
    public static ColorStateList m1643j(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        ColorStateList r12 = AbstractC0295Gu.m622o(r1, r0);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getColorStateList(r3);
    }

    /* JADX INFO: renamed from: l */
    public static Drawable m1644l(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L10;
        int r0 = r2.getResourceId(r3, 0);
        if (r0 == 0) goto L10;
        Drawable r12 = AbstractC1406fG.m2695U(r1, r0);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r2.getDrawable(r3);
    }

    /* JADX INFO: renamed from: n */
    public static final int m1645n(InterfaceC0126Cx r5, AbstractC2242mm r6, String r7) {
        C2379pm r0 = r6.f7922a;
        m1652v(r5, r6);
        int r02 = r5.mo202a(r7);
        if (r02 == (-3)) goto L6;
    L7:
        return r02;
    L6:
        if (r6.f7922a.f8377g == false) goto L7;
        C0132D2 r03 = r6.f7924c;
        C1389f r2 = new C1389f(5, r5, r6);
        Map r62 = (Map) ((ConcurrentHashMap) r03.f328b).get(r5);
        C2220m6 r3 = f2610b;
        Object r4 = null;
        if (r62 == null) goto L11;
        Object r63 = r62.get(r3);
    L12:
        if (r63 == null) goto L15;
        r4 = r63;
    L15:
        if (r4 != null) goto L21;
        r4 = r2.mo6a();
        ConcurrentHashMap r64 = (ConcurrentHashMap) r03.f328b;
        Object r04 = r64.get(r5);
        if (r04 != null) goto L20;
        r04 = new ConcurrentHashMap(2);
        r64.put(r5, r04);
    L20:
        ((Map) r04).put(r3, r4);
    L21:
        Integer r52 = (Integer) ((Map) r4).get(r7);
        if (r52 != null) goto L24;
        return -3;
    L24:
        return r52.intValue();
    L11:
        r63 = null;
        goto L12
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m1646o(MaterialToolbar r4, CharSequence r5) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r4.getChildCount()) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof TextView) == false) goto L10;
        TextView r22 = (TextView) r2;
        if (TextUtils.equals(r22.getText(), r5) == false) goto L10;
        r0.add(r22);
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        return r0;
    }

    /* JADX INFO: renamed from: p */
    public static void m1647p(String r2, InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int r1 = AbstractC1450gG.f5067a;
        new C2428qs(11, AbstractC1406fG.m2718r0(r2)).m4870f(r3);
    }

    /* JADX INFO: renamed from: q */
    public static void m1648q(int r19, C1496hb r20, C2454rb r21, boolean r22) {
        if (r21.f8630m == false) goto L6;
        return;
    L6:
        if ((r21 instanceof C2497sb) == false) goto L8;
    L12:
        C1259cb r3 = r21.mo4340i(2);
        C1259cb r4 = r21.mo4340i(4);
        int r5 = r3.m2383d();
        int r6 = r4.m2383d();
        HashSet r7 = r3.f4265a;
        if (r7 == null) goto L75;
        if (r3.f4267c == false) goto L75;
        Iterator r32 = r7.iterator();
    L18:
        if (r32.hasNext() == false) goto L75;
        C1259cb r72 = (C1259cb) r32.next();
        C2454rb r13 = r72.f4268d;
        int r14 = r19 + 1;
        boolean r15 = m1638e(r13);
        C1259cb r8 = r13.f8588I;
        C1259cb r11 = r13.f8590K;
        if (r13.m4946z() == false) goto L23;
        if (r15 == false) goto L23;
        boolean r18 = true;
        C2497sb.m4979V(r13, r20, new C0178E5());
    L24:
        if (r72 != r8) goto L29;
        C1259cb r12 = r11.f4270f;
        if (r12 == null) goto L29;
        if (r12.f4267c == false) goto L29;
    L34:
        boolean r122 = r18;
    L36:
        int r9 = r13.f8637p0[0];
        if (r9 != 3) goto L60;
        if (r15 == true) goto L60;
        if (r9 != 3) goto L18;
        if (r13.f8643v < 0) goto L18;
        if (r13.f8642u < 0) goto L18;
        if (r13.f8619g0 == 8) goto L52;
        if (r13.f8639r != 0) goto L18;
        if (r13.f8602W != 0.0f) goto L18;
    L52:
        if (r13.m4944x() == true) goto L18;
        if (r13.f8585F == true) goto L18;
        if (r122 == false) goto L18;
        if (r13.m4944x() == true) goto L18;
        m1627E(r14, r21, r20, r13, r22);
    L60:
        if (r13.m4946z() == true) goto L18;
        if (r72 != r8) goto L66;
        if (r11.f4270f != null) goto L66;
        int r73 = r8.m2384e() + r5;
        r13.m4919J(r73, r13.m4937q() + r73);
        m1648q(r14, r20, r13, r22);
    L66:
        if (r72 != r11) goto L70;
        if (r8.f4270f != null) goto L70;
        int r74 = r5 - r11.m2384e();
        r13.m4919J(r74 - r13.m4937q(), r74);
        m1648q(r14, r20, r13, r22);
    L70:
        if (r122 == false) goto L18;
        if (r13.m4944x() == true) goto L18;
        m1626D(r14, r20, r13, r22);
    L29:
        if (r72 != r11) goto L35;
        C1259cb r123 = r8.f4270f;
        if (r123 == null) goto L35;
        if (r123.f4267c == true) goto L34;
    L35:
        r122 = false;
    L23:
        r18 = true;
    L75:
        if ((r21 instanceof C2150kk) == false) goto L77;
        return;
    L77:
        HashSet r33 = r4.f4265a;
        if (r33 != null) goto L80;
    L139:
        r21.f8630m = true;
        return;
    L80:
        if (r4.f4267c == false) goto L139;
        Iterator r34 = r33.iterator();
    L83:
        if (r34.hasNext() == false) goto L139;
        C1259cb r42 = (C1259cb) r34.next();
        C2454rb r52 = r42.f4268d;
        int r124 = r19 + 1;
        boolean r75 = m1638e(r52);
        C1259cb r82 = r52.f8588I;
        C1259cb r92 = r52.f8590K;
        if (r52.m4946z() == false) goto L88;
        if (r75 == false) goto L88;
        C2497sb.m4979V(r52, r20, new C0178E5());
    L88:
        if (r42 != r82) goto L93;
        C1259cb r112 = r92.f4270f;
        if (r112 == null) goto L93;
        if (r112.f4267c == false) goto L93;
    L98:
        boolean r113 = true;
    L100:
        int r132 = r52.f8637p0[0];
        if (r132 != 3) goto L125;
        if (r75 == true) goto L125;
        if (r132 != 3) goto L83;
        if (r52.f8643v < 0) goto L83;
        if (r52.f8642u < 0) goto L83;
        if (r52.f8619g0 == 8) goto L116;
        if (r52.f8639r != 0) goto L83;
        if (r52.f8602W != 0.0f) goto L83;
    L116:
        if (r52.m4944x() == true) goto L83;
        if (r52.f8585F == true) goto L83;
        if (r113 == false) goto L83;
        if (r52.m4944x() == true) goto L83;
        m1627E(r124, r21, r20, r52, r22);
    L125:
        if (r52.m4946z() == true) goto L83;
        if (r42 != r82) goto L131;
        if (r92.f4270f != null) goto L131;
        int r43 = r82.m2384e() + r6;
        r52.m4919J(r43, r52.m4937q() + r43);
        m1648q(r124, r20, r52, r22);
    L131:
        if (r42 != r92) goto L135;
        if (r82.f4270f != null) goto L135;
        int r44 = r6 - r92.m2384e();
        r52.m4919J(r44 - r52.m4937q(), r44);
        m1648q(r124, r20, r52, r22);
    L135:
        if (r113 == false) goto L83;
        if (r52.m4944x() == true) goto L83;
        m1626D(r124, r20, r52, r22);
    L93:
        if (r42 != r92) goto L99;
        C1259cb r114 = r82.f4270f;
        if (r114 == null) goto L99;
        if (r114.f4267c == true) goto L98;
    L99:
        r113 = false;
        goto L100
    L8:
        if (r21.m4946z() == false) goto L12;
        if (m1638e(r21) == false) goto L12;
        C2497sb.m4979V(r21, r20, new C0178E5());
        goto L12
    }

    /* JADX INFO: renamed from: r */
    public static final void m1649r(C0523M6 r6, C0394J6 r7) {
        AtomicReferenceFieldUpdater r0 = C0523M6.f1708g;
    L3:
        Object r1 = r0.get(r6);
        if ((r1 instanceof C0388J0) == true) goto L6;
        Throwable r3 = null;
        if ((r1 instanceof C0394J6) == true) goto L47;
        if ((r1 instanceof C0189Ea) == true) goto L15;
        if ((r1 instanceof C0103Ca) == true) goto L25;
        C0103Ca r2 = new C0103Ca(r1, r7, r3, 28);
    L42:
        if (r0.compareAndSet(r6, r1, r2) == true) goto L69;
        if (r0.get(r6) == r1) goto L42;
    L69:
        return;
    L25:
        C0103Ca r22 = (C0103Ca) r1;
        if (r22.f244b != null) goto L38;
        Throwable r4 = r22.f247e;
        if (r4 != null) goto L29;
        C0103Ca r23 = C0103Ca.m151a(r22, r7, null, 29);
    L33:
        if (r0.compareAndSet(r6, r1, r23) == true) goto L68;
        if (r0.get(r6) == r1) goto L33;
    L68:
        return;
    L29:
        r6.m1016j(r7, r4);
        return;
    L38:
        C0523M6.m1008o(r7, r1);
        throw null;
    L15:
        C0189Ea r02 = (C0189Ea) r1;
        if (C0189Ea.f574b.compareAndSet(r02, 0, 1) == true) goto L18;
        C0523M6.m1008o(r7, r1);
        throw null;
    L18:
        if ((r1 instanceof C0652P6) == false) goto L43;
        r6.m1016j(r7, r02.f575a);
        return;
    L43:
        return;
    L47:
        C0523M6.m1008o(r7, r1);
        throw null;
    L6:
        if (r0.compareAndSet(r6, r1, r7) == true) goto L67;
        if (r0.get(r6) == r1) goto L6;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1650t(Context r1) {
        if (r1.getResources().getConfiguration().fontScale < 1.3f) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static Typeface m1651u(Configuration r2, Typeface r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return null;
    L5:
        if (AbstractC0951W5.m1808a(r2) != Integer.MAX_VALUE) goto L7;
        return null;
    L7:
        if (AbstractC0951W5.m1808a(r2) == 0) goto L14;
        if (r3 == null) goto L15;
        int r0 = r3.getWeight();
        return Typeface.create(r3, AbstractC0585Nj.m1137e(AbstractC0951W5.m1808a(r2) + r0, 1, 1000), r3.isItalic());
    L15:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final void m1652v(InterfaceC0126Cx r1, AbstractC2242mm r2) {
        if (AbstractC0585Nj.m1134a(r1.mo204c(), C0128Cz.f298g) == false) goto L6;
        C2379pm r12 = r2.f7922a;
        return;
    }

    /* JADX INFO: renamed from: w */
    public static void m1653w(PackageInfo r2, File r3) {
        DataOutputStream r32 = new DataOutputStream(new FileOutputStream(new File(r3, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));     // Catch: IOException -> L13
        r32.writeLong(r2.lastUpdateTime);     // Catch: Throwable -> L7
        r32.close();     // Catch: IOException -> L13
        return;
    L7:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L13
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L13
    }

    /* JADX INFO: renamed from: x */
    public static void m1654x(EditorInfo r0, InputConnection r1, TextView r2) {
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

    /* JADX INFO: renamed from: B */
    public abstract void mo101B(boolean r1);

    /* JADX INFO: renamed from: C */
    public abstract void mo102C(boolean r1);

    /* JADX INFO: renamed from: L */
    public abstract TransformationMethod mo103L(TransformationMethod r1);

    /* JADX INFO: renamed from: k */
    public abstract void mo1382k(C1195ay r1, float r2, float r3);

    /* JADX INFO: renamed from: m */
    public abstract InputFilter[] mo104m(InputFilter[] r1);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo105s();

    /* JADX INFO: renamed from: y */
    public abstract View mo852y(int r1);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo853z();
}
