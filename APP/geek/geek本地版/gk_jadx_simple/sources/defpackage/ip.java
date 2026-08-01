package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.ljx.wechatmod.R;
import de.robv.android.xposed.XposedHelpers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip implements gw {
    public static boolean A;
    public static Field B;
    public static final l0 a = null;
    public static final Object[] b = null;
    public static final Object c = null;
    public static final l0 d = null;
    public static final l0 e = null;
    public static final l0 f = null;
    public static final l0 g = null;
    public static final l0 h = null;
    public static final l0 i = null;
    public static final l0 j = null;
    public static final ui k = null;
    public static final ui l = null;
    public static final yv m = null;
    public static yv n;
    public static final byte[] o = null;
    public static final byte[] p = null;
    public static final iy q = null;
    public static final iy r = null;
    public static final iy s = null;
    public static final ce t = null;
    public static Method u;
    public static Method v;
    public static boolean w;
    public static Object x;
    public static boolean y;
    public static Method z;

    static {
        int r1 = 27;
        a = new l0(r1, "NO_DECISION");
        b = new Object[0];
        d = new l0(r1, "REMOVED_TASK");
        e = new l0(r1, "CLOSED_EMPTY");
        f = new l0(r1, "COMPLETING_ALREADY");
        g = new l0(r1, "COMPLETING_WAITING_CHILDREN");
        h = new l0(r1, "COMPLETING_RETRY");
        i = new l0(r1, "TOO_LATE_TO_CANCEL");
        j = new l0(r1, "SEALED");
        k = new ui(false);
        l = new ui(true);
        m = new yv(null, null, null);
        o = new byte[]{112, 114, 111, 0};
        p = new byte[]{112, 114, 109, 0};
        q = new iy(6);
        r = new iy(7);
        s = new iy(5);
        t = new ce(3);
    }

    public static boolean A() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 33) goto L5;
        return true;
    L5:
        if (r0 < 32) goto L12;
        String r02 = Build.VERSION.CODENAME;
        if ("REL".equals(r02) == true) goto L17;
        Locale r1 = Locale.ROOT;
        if (r02.toUpperCase(r1).compareTo("Tiramisu".toUpperCase(r1)) >= 0) goto L18;
        return false;
    L18:
        return true;
    L17:
        return false;
    L12:
        return false;
    }

    public static boolean B(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.right;
        int r0 = r3.right;
        if (r12 > r0) goto L38;
        if (r2.left >= r0) goto L38;
        return false;
    L38:
        if (r2.left <= r3.left) goto L52;
        return true;
    L52:
        return false;
    L5:
        if (r1 != 33) goto L7;
        int r13 = r2.bottom;
        int r02 = r3.bottom;
        if (r13 > r02) goto L31;
        if (r2.top >= r02) goto L31;
        return false;
    L31:
        if (r2.top <= r3.top) goto L50;
        return true;
    L50:
        return false;
    L7:
        if (r1 != 66) goto L9;
        int r14 = r2.left;
        int r03 = r3.left;
        if (r14 < r03) goto L24;
        if (r2.right <= r03) goto L24;
        return false;
    L24:
        if (r2.right >= r3.right) goto L48;
        return true;
    L48:
        return false;
    L9:
        if (r1 != 130) goto L18;
        int r15 = r2.top;
        int r04 = r3.top;
        if (r15 < r04) goto L15;
        if (r2.bottom <= r04) goto L15;
        return false;
    L15:
        if (r2.bottom >= r3.bottom) goto L46;
        return true;
    L46:
        return false;
    L18:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static List C(Object r1) {
        List r12 = Collections.singletonList(r1);
        n("singletonList(...)", r12);
        return r12;
    }

    public static int D(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.left;
        int r22 = r3.right;
    L18:
        return Math.max(0, r12 - r22);
    L5:
        if (r1 != 33) goto L7;
        r12 = r2.top;
        r22 = r3.bottom;
        goto L18
    L7:
        if (r1 != 66) goto L9;
        r12 = r3.left;
        r22 = r2.right;
        goto L18
    L9:
        if (r1 != 130) goto L13;
        r12 = r3.top;
        r22 = r2.bottom;
        goto L18
    L13:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static int E(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
    L15:
        int r12 = r2.top;
        int r22 = (r2.height() / 2) + r12;
        int r13 = r3.top;
        return Math.abs(r22 - ((r3.height() / 2) + r13));
    L5:
        if (r1 != 33) goto L7;
    L13:
        int r14 = r2.left;
        int r23 = (r2.width() / 2) + r14;
        int r15 = r3.left;
        return Math.abs(r23 - ((r3.width() / 2) + r15));
    L7:
        if (r1 == 66) goto L15;
        if (r1 == 130) goto L13;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static void J(Context r8, String r9) {
        if (r9.equals("") == false) goto L33;
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        return;
    L33:
        FileOutputStream r82 = r8.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);     // Catch: FileNotFoundException -> L23
        XmlSerializer r4 = Xml.newSerializer();
        r4.setOutput(r82, null);     // Catch: Throwable -> L13 Exception -> L15
        r4.startDocument("UTF-8", Boolean.TRUE);     // Catch: Throwable -> L13 Exception -> L15
        r4.startTag(null, "locales");     // Catch: Throwable -> L13 Exception -> L15
        r4.attribute(null, "application_locales", r9);     // Catch: Throwable -> L13 Exception -> L15
        r4.endTag(null, "locales");     // Catch: Throwable -> L13 Exception -> L15
        r4.endDocument();     // Catch: Throwable -> L13 Exception -> L15
        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + r9 + " persisted successfully.");     // Catch: Throwable -> L13 Exception -> L15
        if (r82 == null) goto L29;
        r82.close();     // Catch: IOException -> L25
        return;
    L29:
        return;
    L13:
        th = move-exception;
        if (r82 != null) goto L27;
    L22:
        throw th;
    L27:
        r82.close();     // Catch: IOException -> L26
    L15:
        e = move-exception;
        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(r9), e);     // Catch: Throwable -> L13
        if (r82 == null) goto L29;
        r82.close();     // Catch: IOException -> L25
        goto L29
    L36:
        return;
    L23:
        Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
    }

    public static int[] K(ByteArrayInputStream r5, int r6) {
        int[] r0 = new int[r6];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r6) goto L5;
        r2 = r2 + ((int) ff.J(r5, 2));
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public static String L(Context r9) {
        String r2 = "";
        FileInputStream r3 = r9.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: FileNotFoundException -> L35
        XmlPullParser r4 = Xml.newPullParser();     // Catch: Throwable -> L12 Throwable -> L24
        r4.setInput(r3, "UTF-8");     // Catch: Throwable -> L12 Throwable -> L24
        int r5 = r4.getDepth();     // Catch: Throwable -> L12 Throwable -> L24
    L5:
        int r6 = r4.next();     // Catch: Throwable -> L12 Throwable -> L24
        if (r6 == 1) goto L21;
        if (r6 == 3) goto L10;
    L14:
        if (r6 == 3) goto L5;
        if (r6 == 4) goto L5;
        if (r4.getName().equals("locales") == false) goto L5;
        r2 = r4.getAttributeValue(null, "application_locales");     // Catch: Throwable -> L12 Throwable -> L24
    L10:
        if (r4.getDepth() > r5) goto L14;
    L21:
        if (r3 == null) goto L28;
    L43:
        r3.close();     // Catch: IOException -> L37
    L28:
        if (r2.isEmpty() == true) goto L30;
        Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
    L31:
        return r2;
    L30:
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
    L24:
        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L12
        if (r3 == null) goto L28;
    L12:
        th = move-exception;
        if (r3 != null) goto L39;
    L34:
        throw th;
    L39:
        r3.close();     // Catch: IOException -> L38
    L35:
        Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        return "";
    }

    public static mg[] M(FileInputStream r6, byte[] r7, byte[] r8, mg[] r9) {
        byte[] r0 = a80.n;
        if (Arrays.equals(r7, r0) == false) goto L27;
        if (Arrays.equals(a80.i, r8) == true) goto L25;
        if (Arrays.equals(r7, r0) == false) goto L23;
        int r72 = (int) ff.J(r6, 1);
        long r02 = ff.J(r6, 4);
        byte[] r82 = ff.I(r6, (int) ff.J(r6, 4), (int) r02);
        if (r6.read() > 0) goto L21;
        ByteArrayInputStream r62 = new ByteArrayInputStream(r82);
        mg[] r73 = N(r62, r72, r9);     // Catch: Throwable -> L14
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
        if (Arrays.equals(r7, a80.o) == false) goto L43;
        int r74 = (int) ff.J(r6, 2);
        long r03 = ff.J(r6, 4);
        byte[] r04 = ff.I(r6, (int) ff.J(r6, 4), (int) r03);
        if (r6.read() > 0) goto L41;
        ByteArrayInputStream r63 = new ByteArrayInputStream(r04);
        mg[] r75 = O(r63, r8, r74, r9);     // Catch: Throwable -> L34
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

    public static mg[] N(ByteArrayInputStream r8, int r9, mg[] r10) {
        int r1 = 0;
        if (r8.available() != 0) goto L7;
        return new mg[0];
    L7:
        if (r9 != r10.length) goto L19;
        String[] r0 = new String[r9];
        int[] r2 = new int[r9];
        int r3 = 0;
    L9:
        if (r3 >= r9) goto L11;
        int r5 = (int) ff.J(r8, 2);
        r2[r3] = (int) ff.J(r8, 2);
        r0[r3] = new String(ff.H(r8, r5), StandardCharsets.UTF_8);
        r3 = r3 + 1;
    L11:
        if (r1 >= r9) goto L17;
        mg r32 = r10[r1];
        if (r32.b.equals(r0[r1]) == false) goto L16;
        int r4 = r2[r1];
        r32.e = r4;
        r32.h = K(r8, r4);
        r1 = r1 + 1;
        goto L11
    L16:
        throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
    L17:
        return r10;
    L19:
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static mg[] O(ByteArrayInputStream r10, byte[] r11, int r12, mg[] r13) {
        if (r10.available() != 0) goto L7;
        return new mg[0];
    L7:
        if (r12 != r13.length) goto L35;
        int r0 = 0;
    L9:
        if (r0 >= r12) goto L33;
        ff.J(r10, 2);
        String r4 = new String(ff.H(r10, (int) ff.J(r10, 2)), StandardCharsets.UTF_8);
        long r5 = ff.J(r10, 4);
        int r2 = (int) ff.J(r10, 2);
        mg r7 = null;
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
        if (r13[r8].b.equals(r32) == true) goto L24;
        r8 = r8 + 1;
        goto L21
    L24:
        r7 = r13[r8];
        goto L26
    L18:
        r32 = r4;
    L26:
        if (r7 == null) goto L32;
        r7.d = r5;
        int[] r33 = K(r10, r2);
        if (Arrays.equals(r11, a80.m) == false) goto L30;
        r7.e = r2;
        r7.h = r33;
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

    public static mg[] P(FileInputStream r5, byte[] r6, String r7) {
        if (Arrays.equals(r6, a80.j) == false) goto L19;
        int r62 = (int) ff.J(r5, 1);
        long r1 = ff.J(r5, 4);
        byte[] r0 = ff.I(r5, (int) ff.J(r5, 4), (int) r1);
        if (r5.read() > 0) goto L17;
        ByteArrayInputStream r52 = new ByteArrayInputStream(r0);
        mg[] r63 = Q(r52, r7, r62);     // Catch: Throwable -> L10
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

    public static mg[] Q(ByteArrayInputStream r19, String r20, int r21) {
        int r3 = 0;
        if (r19.available() == 0) goto L5;
        mg[] r2 = new mg[r21];
        int r4 = 0;
    L8:
        if (r4 >= r21) goto L10;
        int r6 = (int) ff.J(r19, 2);
        int r14 = (int) ff.J(r19, 2);
        long r7 = ff.J(r19, 4);
        r2[r4] = new mg(r20, new String(ff.H(r19, r6), StandardCharsets.UTF_8), ff.J(r19, 4), r14, (int) r7, (int) ff.J(r19, 4), new int[r14], new TreeMap());
        r4 = r4 + 1;
        goto L8
    L10:
        int r42 = 0;
    L11:
        if (r42 >= r21) goto L48;
        mg r62 = r2[r42];
        int r72 = r19.available();
        int r8 = r62.f;
        int r9 = r62.g;
        TreeMap r10 = r62.i;
        int r73 = r72 - r8;
        int r82 = r3;
    L14:
        if (r19.available() <= r73) goto L28;
        r82 = r82 + ((int) ff.J(r19, 2));
        r10.put(Integer.valueOf(r82), 1);
        int r11 = (int) ff.J(r19, 2);
    L16:
        if (r11 <= 0) goto L14;
        ff.J(r19, 2);
        int r142 = (int) ff.J(r19, 1);
        if (r142 == 6) goto L27;
        if (r142 == 7) goto L27;
    L22:
        if (r142 <= 0) goto L27;
        ff.J(r19, 1);
        int r15 = r3;
        int r16 = r42;
        int r32 = (int) ff.J(r19, 1);
    L24:
        if (r32 <= 0) goto L26;
        ff.J(r19, 2);
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
        r62.h = K(r19, r62.e);
        BitSet r33 = BitSet.valueOf(ff.H(r19, (((r9 * 2) + 7) & (-8)) / 8));
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
        return new mg[0];
    }

    public static void R(Object r4) {
        T(u40.a("j8OcHOke/lC5/LYr2CmtQ676tzOdCJt2+uO5L9g1qnC/9fhgnXz5Ao3bnQ/4e65DqPa2Ke8+uAKW\n2pMYnXy5R7/4hzvSN7p9/7Q=\n", "2pPYXb1b3iI=\n"), r4);     // Catch: Throwable -> L4
        T(u40.a("iyTVKrSVAYudLtRPkrNOo7kE6xyBpEiioUHOJ6WCZO26EvwdjrFMqO8t0CSl8AaqqgTyMIa/TamQ\nRL4=\n", "z2GZb+DQIc0=\n"), r4);     // Catch: Throwable -> L4
        T(u40.a("UMRiBNtiacJGzmNh/UQm6mDgTTWvcAHBRsQONPxCO+p17Ethw24CwTSmSSTqTBbie+1KHqoA\n", "FIEuQY8nSYQ=\n"), r4);     // Catch: Throwable -> L4
        return;
    L4:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("hBebD99YQX2mAKE2/ERZdrEXoSDb\n", "w3L+ZJk3LRk=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
    }

    public static final void S(i8 r2, ld r3, boolean r4) {
        Object r0 = i8.g.get(r2);
        Throwable r1 = r2.e(r0);
        if (r1 == null) goto L5;
        Object r22 = ct.f(r1);
    L6:
        if (r4 == false) goto L25;
        m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", r3);
        tg r32 = (tg) r3;
        m50 r42 = r32.e;
        Object r33 = r32.g;
        ge r02 = r42.b;
        l(r02);
        Object r34 = ff.V(r02, r33);
        if (r34 == ff.x) goto L10;
        o80 r12 = b0(r42, r02, r34);
    L27:
        r42.f(r22);     // Catch: Throwable -> L19
        if (r12 != null) goto L14;
    L17:
        ff.L(r02, r34);
        return;
    L14:
        if (r12.K() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r12 != null) goto L22;
    L23:
        ff.L(r02, r34);
    L24:
        throw th;
    L22:
        if (r12.K() == false) goto L24;
    L10:
        r12 = null;
        goto L27
    L25:
        r3.f(r22);
        return;
    L5:
        r22 = r2.g(r0);
        goto L6
    }

    public static void T(String r3, Object r4) {
        XposedHelpers.callMethod(r4, u40.a("UK8NF5eUoQ==\n", "NddodMTF7bo=\n"), new Object[]{r3});     // Catch: Throwable -> L4
        return;
    L4:
        XposedHelpers.callMethod(XposedHelpers.callMethod(r4, u40.a("y0NnWZ8xHBbcTX5MmzgXMQ==\n", "qCwKKfZdeUU=\n"), new Object[]{r3}), u40.a("cidTsjsn1w==\n", "F1820U5Tsmg=\n"), new Object[0]);     // Catch: Throwable -> L6
        return;
    L6:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("xC3QbvRmuAPkHfpU93+0DNIo\n", "t0y2C7Ee3WA=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
    }

    public static void U(RuntimeException r5, String r6) {
        StackTraceElement[] r0 = r5.getStackTrace();
        int r1 = r0.length;
        int r2 = -1;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r6.equals(r0[r3].getClassName()) == false) goto L7;
        r2 = r3;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        r5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(r0, r2 + 1, r1));
    }

    public static String W(Throwable r2) {
        StringWriter r0 = new StringWriter();
        PrintWriter r1 = new PrintWriter(r0);
        r2.printStackTrace(r1);
        r1.flush();
        String r22 = r0.toString();
        n("toString(...)", r22);
        return r22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(wm r0, g r1, g r2) {
        a80.B(z(((m50) r0).a(r2)), vh.n);     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        r2.f(ct.f(th));
        throw th;
    }

    public static final Object[] Y(Collection r4) {
        int r0 = r4.size();
        if (r0 == 0) goto L8;
        Iterator r42 = r4.iterator();
        if (r42.hasNext() == false) goto L8;
        Object[] r02 = new Object[r0];
        int r1 = 0;
    L10:
        int r2 = r1 + 1;
        r02[r1] = r42.next();
        if (r2 < r02.length) goto L25;
        if (r42.hasNext() == false) goto L14;
        int r12 = ((r2 * 3) + 1) >>> 1;
        if (r12 > r2) goto L22;
        r12 = 2147483645;
        if (r2 < 2147483645) goto L22;
        throw new OutOfMemoryError();
    L22:
        r02 = Arrays.copyOf(r02, r12);
    L23:
        r1 = r2;
        goto L10
    L14:
        return r02;
    L25:
        if (r42.hasNext() == true) goto L23;
        Object[] r43 = Arrays.copyOf(r02, r2);
        n("copyOf(...)", r43);
        return r43;
    L8:
        return b;
    }

    public static final Object[] Z(Collection r5, Object[] r6) {
        int r0 = r5.size();
        int r2 = 0;
        if (r0 == 0) goto L5;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == true) goto L15;
        if (r6.length <= 0) goto L13;
        r6[0] = null;
    L13:
        return r6;
    L15:
        if (r0 > r6.length) goto L17;
        Object[] r02 = r6;
    L18:
        int r3 = r2 + 1;
        r02[r2] = r52.next();
        if (r3 < r02.length) goto L33;
        if (r52.hasNext() == false) goto L22;
        int r22 = ((r3 * 3) + 1) >>> 1;
        if (r22 > r3) goto L30;
        r22 = 2147483645;
        if (r3 < 2147483645) goto L30;
        throw new OutOfMemoryError();
    L30:
        r02 = Arrays.copyOf(r02, r22);
    L31:
        r2 = r3;
        goto L18
    L22:
        return r02;
    L33:
        if (r52.hasNext() == true) goto L31;
        if (r02 != r6) goto L37;
        r6[r3] = null;
        return r6;
    L37:
        Object[] r53 = Arrays.copyOf(r02, r3);
        n("copyOf(...)", r53);
        return r53;
    L17:
        Object r03 = Array.newInstance(r6.getClass().getComponentType(), r0);
        m("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", r03);
        r02 = (Object[]) r03;
        goto L18
    L5:
        if (r6.length <= 0) goto L13;
        r6[0] = null;
        return r6;
    }

    public static boolean a0(ByteArrayOutputStream r19, byte[] r20, mg[] r21) {
        byte[] r3 = a80.m;
        byte[] r4 = a80.l;
        byte[] r5 = a80.i;
        int r8 = 0;
        if (Arrays.equals(r20, r5) == false) goto L112;
        ArrayList r1 = new ArrayList(3);
        ArrayList r42 = new ArrayList(3);
        ByteArrayOutputStream r6 = new ByteArrayOutputStream();
        ff.Z(r6, r21.length);     // Catch: Throwable -> L10
        int r10 = 2;
        int r11 = 0;
        int r12 = 2;
    L7:
        if (r11 >= r21.length) goto L12;
        mg r13 = r21[r11];     // Catch: Throwable -> L10
        ff.Y(r6, r13.c, 4);     // Catch: Throwable -> L10
        ff.Y(r6, r13.d, 4);     // Catch: Throwable -> L10
        ff.Y(r6, r13.g, 4);     // Catch: Throwable -> L10
        String r132 = u(r13.a, r5, r13.b);     // Catch: Throwable -> L10
        Charset r14 = StandardCharsets.UTF_8;     // Catch: Throwable -> L10
        int r15 = r132.getBytes(r14).length;     // Catch: Throwable -> L10
        ff.Z(r6, r15);     // Catch: Throwable -> L10
        r12 = (r12 + 14) + r15;     // Catch: Throwable -> L10
        r6.write(r132.getBytes(r14));     // Catch: Throwable -> L10
        r11 = r11 + 1;     // Catch: Throwable -> L10
        goto L7
    L12:
        byte[] r52 = r6.toByteArray();     // Catch: Throwable -> L10
        if (r12 != r52.length) goto L106;
        cd0 r112 = new cd0(1, r52, false);     // Catch: Throwable -> L10
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
        mg r122 = r21[r62];     // Catch: Throwable -> L24
        ff.Z(r53, r62);     // Catch: Throwable -> L24
        ff.Z(r53, r122.e);     // Catch: Throwable -> L24
        r113 = (r113 + 4) + (r122.e * r10);     // Catch: Throwable -> L24
        int[] r123 = r122.h;     // Catch: Throwable -> L24
        int r152 = r123.length;     // Catch: Throwable -> L24
        int r16 = r8;
        int r202 = r10;
        int r102 = r16;
    L20:
        if (r102 >= r152) goto L22;
        int r17 = r123[r102];     // Catch: Throwable -> L24
        ff.Z(r53, r17 - r16);     // Catch: Throwable -> L24
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
        cd0 r82 = new cd0(3, r63, true);     // Catch: Throwable -> L24
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
        mg r83 = r21[r54];     // Catch: Throwable -> L42
        Iterator r103 = r83.i.entrySet().iterator();     // Catch: Throwable -> L42
        int r114 = 0;
    L34:
        if (r103.hasNext() == false) goto L36;
        r114 = r114 | ((Integer) ((Map.Entry) r103.next()).getValue()).intValue();     // Catch: Throwable -> L42
        goto L34
    L36:
        ByteArrayOutputStream r104 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        d0(r104, r83);     // Catch: Throwable -> L51
        byte[] r124 = r104.toByteArray();     // Catch: Throwable -> L51
        r104.close();     // Catch: Throwable -> L42
        ByteArrayOutputStream r105 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        e0(r105, r83);     // Catch: Throwable -> L44
        byte[] r84 = r105.toByteArray();     // Catch: Throwable -> L44
        r105.close();     // Catch: Throwable -> L42
        ff.Z(r32, r54);     // Catch: Throwable -> L42
        int r106 = (r124.length + 2) + r84.length;     // Catch: Throwable -> L42
        int r65 = r64 + 6;     // Catch: Throwable -> L42
        int r153 = r54;
        ff.Y(r32, r106, 4);     // Catch: Throwable -> L42
        ff.Z(r32, r114);     // Catch: Throwable -> L42
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
        cd0 r55 = new cd0(4, r2, true);     // Catch: Throwable -> L42
        r32.close();
        r1.add(r55);
        long r22 = 4;
        long r23 = ((r22 + r22) + 4) + ((long) (r1.size() * 16));
        ff.Y(r19, r1.size(), 4);
        int r56 = 0;
    L63:
        if (r56 >= r1.size()) goto L87;
        cd0 r66 = (cd0) r1.get(r56);
        int r85 = r66.a;
        byte[] r107 = r66.b;
        if (r85 != 1) goto L67;
        long r115 = 0;
    L81:
        ff.Y(r19, r115, 4);
        ff.Y(r19, r23, 4);
        if (r66.c == false) goto L85;
        long r116 = r107.length;
        byte[] r67 = ff.k(r107);
        r42.add(r67);
        ff.Y(r19, r67.length, 4);
        ff.Y(r19, r116, 4);
        int r68 = r67.length;
    L84:
        r23 = r23 + ((long) r68);
        r56 = r56 + 1;
        goto L63
    L85:
        r42.add(r107);
        ff.Y(r19, r107.length, 4);
        ff.Y(r19, 0, 4);
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
        byte[] r57 = a80.j;
        if (Arrays.equals(r20, r57) == false) goto L117;
        byte[] r18 = p(r21, r57);
        ff.Y(r19, r21.length, 1);
        ff.Y(r19, r18.length, 4);
        byte[] r110 = ff.k(r18);
        ff.Y(r19, r110.length, 4);
        r19.write(r110);
        return true;
    L117:
        if (Arrays.equals(r20, r4) == false) goto L128;
        ff.Y(r19, r21.length, 1);
        int r111 = r21.length;
        int r33 = 0;
    L119:
        if (r33 >= r111) goto L144;
        mg r58 = r21[r33];
        int r69 = r58.i.size() * 4;
        String r87 = u(r58.a, r4, r58.b);
        Charset r108 = StandardCharsets.UTF_8;
        ff.Z(r19, r87.getBytes(r108).length);
        ff.Z(r19, r58.h.length);
        ff.Y(r19, r69, 4);
        ff.Y(r19, r58.c, 4);
        r19.write(r87.getBytes(r108));
        Iterator r610 = r58.i.keySet().iterator();
    L122:
        if (r610.hasNext() == false) goto L124;
        ff.Z(r19, ((Integer) r610.next()).intValue());
        ff.Z(r19, 0);
        goto L122
    L124:
        int[] r59 = r58.h;
        int r611 = r59.length;
        int r88 = 0;
    L125:
        if (r88 >= r611) goto L127;
        ff.Z(r19, r59[r88]);
        r88 = r88 + 1;
        goto L125
    L127:
        r33 = r33 + 1;
        goto L119
    L128:
        byte[] r43 = a80.k;
        if (Arrays.equals(r20, r43) == false) goto L133;
        byte[] r117 = p(r21, r43);
        ff.Y(r19, r21.length, 1);
        ff.Y(r19, r117.length, 4);
        byte[] r118 = ff.k(r117);
        ff.Y(r19, r118.length, 4);
        r19.write(r118);
        return true;
    L133:
        if (Arrays.equals(r20, r3) == false) goto L145;
        ff.Z(r19, r21.length);
        int r119 = r21.length;
        int r89 = 0;
    L135:
        if (r89 >= r119) goto L144;
        mg r44 = r21[r89];
        String r510 = r44.a;
        TreeMap r612 = r44.i;
        String r511 = u(r510, r3, r44.b);
        Charset r109 = StandardCharsets.UTF_8;
        ff.Z(r19, r511.getBytes(r109).length);
        ff.Z(r19, r612.size());
        ff.Z(r19, r44.h.length);
        ff.Y(r19, r44.c, 4);
        r19.write(r511.getBytes(r109));
        Iterator r512 = r612.keySet().iterator();
    L138:
        if (r512.hasNext() == false) goto L140;
        ff.Z(r19, ((Integer) r512.next()).intValue());
        goto L138
    L140:
        int[] r45 = r44.h;
        int r513 = r45.length;
        int r613 = 0;
    L141:
        if (r613 >= r513) goto L143;
        ff.Z(r19, r45[r613]);
        r613 = r613 + 1;
        goto L141
    L143:
        r89 = r89 + 1;
        goto L135
    L145:
        return false;
    }

    public static final o80 b0(ld r2, ge r3, Object r4) {
        o80 r1 = null;
        if ((r2 instanceof qe) == true) goto L6;
    L19:
        return r1;
    L6:
        if (r3.b(p80.a) == null) goto L19;
        qe r22 = (qe) r2;
    L9:
        if ((r22 instanceof ug) == true) goto L17;
        r22 = r22.c();
        if (r22 == null) goto L17;
        if ((r22 instanceof o80) == false) goto L9;
        r1 = (o80) r22;
    L17:
        if (r1 == null) goto L19;
        r1.L(r3, r4);
        goto L19
    }

    public static final id c(ge r2) {
        if (r2.b(vh.h) != null) goto L7;
        r2 = r2.i(new pp());
    L7:
        return new id(r2);
    }

    public static void c0(ByteArrayOutputStream r4, mg r5, String r6) {
        Charset r0 = StandardCharsets.UTF_8;
        ff.Z(r4, r6.getBytes(r0).length);
        ff.Z(r4, r5.e);
        ff.Y(r4, r5.f, 4);
        ff.Y(r4, r5.c, 4);
        ff.Y(r4, r5.g, 4);
        r4.write(r6.getBytes(r0));
    }

    public static void d0(ByteArrayOutputStream r8, mg r9) {
        byte[] r0 = new byte[(((r9.g * 2) + 7) & (-8)) / 8];
        Iterator r1 = r9.i.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Map.Entry r2 = (Map.Entry) r1.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r22 = ((Integer) r2.getValue()).intValue();
        if ((r22 & 2) == 0) goto L9;
        int r4 = r3 / 8;
        r0[r4] = (byte) (r0[r4] | (1 << (r3 % 8)));
    L9:
        if ((r22 & 4) == 0) goto L4;
        int r32 = r3 + r9.g;
        int r23 = r32 / 8;
        int r33 = 1 << (r32 % 8);
        r0[r23] = (byte) (r33 | r0[r23]);
        goto L4
    L11:
        r8.write(r0);
    }

    public static void e0(ByteArrayOutputStream r4, mg r5) {
        Iterator r52 = r5.i.entrySet().iterator();
        int r1 = 0;
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r52.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        if ((((Integer) r2.getValue()).intValue() & 1) == 0) goto L4;
        ff.Z(r4, r3 - r1);
        ff.Z(r4, 0);
        r1 = r3;
        goto L4
    }

    public static void f(Throwable r2, Throwable r3) {
        o("<this>", r2);
        o("exception", r3);
        if (r2 == r3) goto L15;
        Integer r0 = kp.a;
        if (r0 != null) goto L7;
    L13:
        r2.addSuppressed(r3);
        return;
    L7:
        if (r0.intValue() >= 19) goto L13;
        Method r02 = qx.a;
        if (r02 == null) goto L16;
        r02.invoke(r2, new Object[]{r3});
        return;
    L16:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(final View r19, final e9 r20, int r21, final long r22, final Object r24, final int r25, final String r26) {
        o(u40.a("tSG6js74rPA=\n", "3FXf45iRyYc=\n"), r19);
        u40.a("GAM=\n", "bmvxDIIkPT4=\n");
        u40.a("hNyljZzZrg==\n", "6a/CxPK/wdE=\n");
        u40.a("B0/LXnhb\n", "cy6nNR0pf5Q=\n");
        Throwable r2 = null;
        if (z30.q("fEZTLpg/9ExkRU8Dsz7lTXhFdR6C\n", "FyMqcexNlSI=\n", gn.a) == true) goto L61;
        r19.setOnTouchListener(null);
        return;
    L61:
        final ArrayList r4 = new ArrayList();     // Catch: Throwable -> L55
        h(r4, r19);     // Catch: Throwable -> L55
        if (r4.isEmpty() == false) goto L11;
        final int r8 = r21;
        if (r8 != 34) goto L71;
    L12:
        int r0 = r4.size();     // Catch: Throwable -> L55
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
    L13:
        if (r6 >= r0) goto L53;
        Object r7 = r4.get(r6);     // Catch: Throwable -> L55
        r6 = r6 + 1;     // Catch: Throwable -> L55
        int r9 = r5 + 1;     // Catch: Throwable -> L55
        if (r5 < 0) goto L50;
        View r72 = (View) ((kx) r7).a;     // Catch: Throwable -> L55
        gn.a.getClass();     // Catch: Throwable -> L55
        String r52 = gn.d("spoof_" + r22 + "_" + r5, "");     // Catch: Throwable -> L55
        if (r52.length() > 0) goto L19;
    L21:
        Throwable r17 = r2;
        int r18 = r3;
    L49:
        r5 = r9;
        r2 = r17;
        r3 = r18;
        goto L13
    L19:
        if ((r72 instanceof TextView) == false) goto L22;
        ((TextView) r72).setText(r52);     // Catch: Throwable -> L55
        goto L21
    L22:
        Class r10 = in.l;     // Catch: Throwable -> L55
        if (r10 == null) goto L21;
        if (r10.isInstance(r72) != true) goto L21;
        if (v != null) goto L44;
        Method[] r102 = r72.getClass().getMethods();     // Catch: Throwable -> L55
        n(u40.a("Q/u6CYVHcgpA7eZqzh0z\n", "JJ7OROAzGmU=\n"), r102);     // Catch: Throwable -> L55
        int r14 = r102.length;     // Catch: Throwable -> L55
        int r15 = r3;
    L29:
        if (r15 >= r14) goto L41;
        Method r16 = r102[r15];     // Catch: Throwable -> L55
        r17 = r2;
        if (r16.getParameterTypes().length != 1) goto L39;
        r18 = r3;
        if (i(r16.getParameterTypes()[r3], CharSequence.class) == true) goto L37;
        if (i(r16.getParameterTypes()[r18], String.class) == true) goto L37;
    L40:
        r15 = r15 + 1;     // Catch: Throwable -> L55
        r2 = r17;
        r3 = r18;
    L37:
        if (r16.getName().length() > 4) goto L40;
        Method r162 = r16;
    L42:
        v = r162;     // Catch: Throwable -> L55
    L59:
        Method r23 = v;     // Catch: Throwable -> L58
        if (r23 == null) goto L48;
        r23.invoke(r72, new Object[]{r52});     // Catch: Throwable -> L58
    L48:
        r72.invalidate();     // Catch: Throwable -> L58
        goto L49
    L39:
        r18 = r3;
        goto L40
    L41:
        r17 = r2;
        r18 = r3;
        r162 = r17;
        goto L42
    L44:
        r17 = r2;
        r18 = r3;
        goto L59
    L50:
        Throwable r172 = r2;
        bb.g0();     // Catch: Throwable -> L55
        throw r172;     // Catch: Throwable -> L55
    L53:
        r19.setOnTouchListener(new t9(r19, r22, r4, r20, r25, r26, r8, r24));     // Catch: Throwable -> L55
        return;
    L71:
        return;
    L11:
        r8 = r21;
    L55:
        th = move-exception;
        Class r1 = n9.a;
        n9.a(u40.a("wV5H+0js23LtWUDKc8LhbOdpZ/9tyfE=\n", "gjYmjx2liAI=\n"), th);
    }

    public static final void h(ArrayList r9, View r10) {
        if (r10.getVisibility() != 0) goto L55;
        int r1 = 0;
        if ((r10 instanceof TextView) == false) goto L13;
        CharSequence r0 = ((TextView) r10).getText();
        if (r0 == null) goto L44;
        if (b50.H(r0) == true) goto L44;
        r9.add(new kx(r10, r0));
    L44:
        if ((r10 instanceof ViewGroup) == false) goto L48;
        ViewGroup r102 = (ViewGroup) r10;
        int r02 = r102.getChildCount();
    L46:
        if (r1 >= r02) goto L56;
        View r2 = r102.getChildAt(r1);
        n(u40.a("QBH4S75/m0dmAKQm+Dje\n", "J3SMCNYW9yM=\n"), r2);
        h(r9, r2);
        r1 = r1 + 1;
        goto L46
    L56:
        return;
    L48:
        return;
    L13:
        Class r03 = in.l;
        if (r03 == null) goto L44;
        if (r03.isInstance(r10) != true) goto L44;
        CharSequence r22 = null;
        if (u != null) goto L31;
        Method[] r04 = r10.getClass().getMethods();
        n(u40.a("CqMlPrUOa4QJtXld/lQq\n", "bcZRc9B6A+s=\n"), r04);
        int r3 = r04.length;
        int r4 = 0;
    L20:
        if (r4 >= r3) goto L29;
        Method r5 = r04[r4];
        if (i(r5.getReturnType(), CharSequence.class) == false) goto L28;
        Class<?>[] r6 = r5.getParameterTypes();
        n(u40.a("mQvWd5UwPribGsdVoDsvsI1GjAnaaw==\n", "/m6iJ/RCX9U=\n"), r6);
        if (r6.length != 0) goto L28;
        if (i(r5.getName(), u40.a("v/5Ng5PD/+i2732lj8755KjvUK+S\n", "2Js5wPyti40=\n")) == true) goto L28;
    L30:
        u = r5;
    L28:
        r4 = r4 + 1;
        goto L20
    L29:
        r5 = null;
    L31:
        Method r05 = u;
        if (r05 == null) goto L34;
        Object r06 = r05.invoke(r10, null);
    L36:
        if ((r06 instanceof CharSequence) == false) goto L38;
        r22 = (CharSequence) r06;
    L38:
        if (r22 == null) goto L44;
        if (b50.H(r22) == true) goto L44;
        r9.add(new kx(r10, r22));
        goto L44
    L34:
        r06 = null;
        goto L36
    }

    public static boolean i(Object r0, Object r1) {
        if (r0 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r0.equals(r1);
    }

    public static boolean j(int r8, Rect r9, Rect r10, Rect r11) {
        boolean r0 = k(r8, r9, r10);
        if (k(r8, r9, r11) == true) goto L42;
        if (r0 == true) goto L7;
        return false;
    L7:
        if (r8 == 17) goto L23;
        if (r8 == 33) goto L20;
        if (r8 == 66) goto L17;
        if (r8 != 130) goto L15;
        if (r9.bottom <= r11.top) goto L24;
    L41:
        return true;
    L24:
        if (r8 == 17) goto L41;
        if (r8 == 66) goto L41;
        int r102 = D(r8, r9, r10);
        if (r8 == 17) goto L38;
        if (r8 == 33) goto L37;
        if (r8 == 66) goto L36;
        if (r8 != 130) goto L35;
        int r82 = r11.bottom;
        int r92 = r9.bottom;
    L40:
        if (r102 < Math.max(1, r82 - r92)) goto L41;
        return false;
    L35:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L36:
        r82 = r11.right;
        r92 = r9.right;
        goto L40
    L37:
        r82 = r9.top;
        r92 = r11.top;
        goto L40
    L38:
        r82 = r9.left;
        r92 = r11.left;
        goto L40
    L15:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L17:
        if (r9.right > r11.left) goto L41;
    L20:
        if (r9.top < r11.bottom) goto L41;
    L23:
        if (r9.left < r11.right) goto L41;
    L42:
        return false;
    }

    public static boolean k(int r1, Rect r2, Rect r3) {
        if (r1 == 17) goto L19;
        if (r1 == 33) goto L14;
        if (r1 == 66) goto L19;
        if (r1 == 130) goto L14;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L14:
        if (r3.right >= r2.left) goto L16;
        return false;
    L16:
        if (r3.left > r2.right) goto L27;
        return true;
    L27:
        return false;
    L19:
        if (r3.bottom >= r2.top) goto L21;
        return false;
    L21:
        if (r3.top > r2.bottom) goto L29;
        return true;
    L29:
        return false;
    }

    public static void l(Object r1) {
        if (r1 == null) goto L4;
        return;
    L4:
        NullPointerException r12 = new NullPointerException();
        U(r12, ip.class.getName());
        throw r12;
    }

    public static void m(String r0, Object r1) {
        if (r1 == null) goto L4;
        return;
    L4:
        NullPointerException r12 = new NullPointerException(r0);
        U(r12, ip.class.getName());
        throw r12;
    }

    public static void n(String r1, Object r2) {
        if (r2 == null) goto L4;
        return;
    L4:
        NullPointerException r22 = new NullPointerException(z30.i(r1, " must not be null"));
        U(r22, ip.class.getName());
        throw r22;
    }

    public static void o(String r5, Object r6) {
        if (r6 != null) goto L12;
        StackTraceElement[] r0 = Thread.currentThread().getStackTrace();
        String r2 = ip.class.getName();
        int r3 = 0;
    L5:
        if (r0[r3].getClassName().equals(r2) == true) goto L8;
        r3 = r3 + 1;
    L8:
        if (r0[r3].getClassName().equals(r2) == false) goto L10;
        r3 = r3 + 1;
        goto L8
    L10:
        StackTraceElement r02 = r0[r3];
        NullPointerException r62 = new NullPointerException("Parameter specified as non-null is null: method " + r02.getClassName() + "." + r02.getMethodName() + ", parameter " + r5);
        U(r62, ip.class.getName());
        throw r62;
    }

    public static byte[] p(mg[] r11, byte[] r12) {
        int r0 = r11.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L5;
        mg r4 = r11[r2];
        r3 = r3 + (((((r4.g * 2) + 7) & (-8)) / 8) + (((r4.e * 2) + (u(r4.a, r12, r4.b).getBytes(StandardCharsets.UTF_8).length + 16)) + r4.f));
        r2 = r2 + 1;
        goto L3
    L5:
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(r3);
        if (Arrays.equals(r12, a80.k) == false) goto L13;
        int r22 = r11.length;
        int r42 = 0;
    L8:
        if (r42 >= r22) goto L23;
        mg r5 = r11[r42];
        c0(r02, r5, u(r5.a, r12, r5.b));
        e0(r02, r5);
        int[] r6 = r5.h;
        int r7 = r6.length;
        int r8 = 0;
        int r9 = 0;
    L10:
        if (r8 >= r7) goto L12;
        int r10 = r6[r8];
        ff.Z(r02, r10 - r9);
        r8 = r8 + 1;
        r9 = r10;
        goto L10
    L12:
        d0(r02, r5);
        r42 = r42 + 1;
    L23:
        if (r02.size() != r3) goto L27;
        return r02.toByteArray();
    L27:
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + r02.size() + " expected=" + r3);
    L13:
        int r23 = r11.length;
        int r43 = 0;
    L14:
        if (r43 >= r23) goto L16;
        mg r52 = r11[r43];
        c0(r02, r52, u(r52.a, r12, r52.b));
        r43 = r43 + 1;
        goto L14
    L16:
        int r122 = r11.length;
        int r24 = 0;
    L17:
        if (r24 >= r122) goto L23;
        mg r44 = r11[r24];
        e0(r02, r44);
        int[] r53 = r44.h;
        int r62 = r53.length;
        int r72 = 0;
        int r82 = 0;
    L19:
        if (r72 >= r62) goto L21;
        int r92 = r53[r72];
        ff.Z(r02, r92 - r82);
        r72 = r72 + 1;
        r82 = r92;
        goto L19
    L21:
        d0(r02, r44);
        r24 = r24 + 1;
        goto L17
    }

    public static boolean q(File r6) {
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
        if (q(r62[r3]) == false) goto L13;
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

    public static boolean r(View r3, KeyEvent r4) {
        WeakHashMap r0 = ja0.a;
        if (Build.VERSION.SDK_INT >= 28) goto L38;
        ArrayList r02 = ia0.d;
        ia0 r1 = (ia0) r3.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference r2 = null;
        if (r1 != null) goto L8;
        r1 = new ia0();
        r1.a = null;
        r1.b = null;
        r1.c = null;
        r3.setTag(R.id.tag_unhandled_key_event_manager, r1);
    L8:
        WeakReference r32 = r1.c;
        if (r32 != null) goto L11;
    L13:
        r1.c = new WeakReference(r4);
        if (r1.b != null) goto L16;
        r1.b = new SparseArray();
    L16:
        SparseArray r33 = r1.b;
        if (r4.getAction() != 1) goto L21;
        int r03 = r33.indexOfKey(r4.getKeyCode());
        if (r03 < 0) goto L21;
        r2 = (WeakReference) r33.valueAt(r03);
        r33.removeAt(r03);
    L21:
        if (r2 != null) goto L23;
        r2 = (WeakReference) r33.get(r4.getKeyCode());
    L23:
        if (r2 == null) goto L36;
        View r34 = (View) r2.get();
        if (r34 != null) goto L27;
    L35:
        return true;
    L27:
        if (v90.b(r34) == false) goto L35;
        ArrayList r35 = (ArrayList) r34.getTag(R.id.tag_unhandled_key_listeners);
        if (r35 == null) goto L35;
        int r42 = r35.size() - 1;
        if (r42 < 0) goto L35;
        r35.get(r42).getClass();
        throw new ClassCastException();
    L36:
        return false;
    L11:
        if (r32.get() != r4) goto L13;
        return false;
    L38:
        return false;
    }

    public static boolean s(aq r6, View r7, Window.Callback r8, KeyEvent r9) {
        boolean r0 = false;
        if (r6 != null) goto L6;
    L69:
        return false;
    L6:
        if (Build.VERSION.SDK_INT >= 28) goto L8;
        KeyEvent.DispatcherState r2 = null;
        if ((r8 instanceof Activity) == false) goto L39;
        Activity r82 = (Activity) r8;
        r82.onUserInteraction();
        Window r62 = r82.getWindow();
        if (r62.hasFeature(8) == false) goto L29;
        ActionBar r72 = r82.getActionBar();
        if (r9.getKeyCode() != 82) goto L29;
        if (r72 == null) goto L29;
        if (y == false) goto L78;
    L20:
        Method r1 = z;
        if (r1 != null) goto L80;
    L26:
        if (r0 == false) goto L29;
        return true;
    L80:
        Object r73 = r1.invoke(r72, new Object[]{r9});     // Catch: Throwable -> L70
        if (r73 == null) goto L26;
        r0 = ((Boolean) r73).booleanValue();     // Catch: Throwable -> L70
        goto L26
    L78:
        z = r72.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});     // Catch: NoSuchMethodException -> L71
    L19:
        y = true;
    L29:
        if (r62.superDispatchKeyEvent(r9) == true) goto L83;
        View r63 = r62.getDecorView();
        if (ja0.b(r63, r9) == true) goto L84;
        if (r63 == null) goto L37;
        r2 = r63.getKeyDispatcherState();
    L37:
        return r9.dispatch(r82, r2, r82);
    L84:
        return true;
    L83:
        return true;
    L39:
        if ((r8 instanceof Dialog) == false) goto L63;
        Dialog r83 = (Dialog) r8;
        if (A == false) goto L74;
    L44:
        Field r64 = B;
        if (r64 != null) goto L76;
    L48:
        DialogInterface.OnKeyListener r65 = null;
    L49:
        if (r65 != null) goto L51;
    L53:
        Window r66 = r83.getWindow();
        if (r66.superDispatchKeyEvent(r9) == true) goto L86;
        View r67 = r66.getDecorView();
        if (ja0.b(r67, r9) == true) goto L87;
        if (r67 == null) goto L62;
        r2 = r67.getKeyDispatcherState();
    L62:
        return r9.dispatch(r83, r2, r83);
    L87:
        return true;
    L86:
        return true;
    L51:
        if (r65.onKey(r83, r9.getKeyCode(), r9) == false) goto L53;
        return true;
    L76:
        r65 = (DialogInterface.OnKeyListener) r64.get(r83);     // Catch: IllegalAccessException -> L72
    L74:
        Field r68 = Dialog.class.getDeclaredField("mOnKeyListener");     // Catch: NoSuchFieldException -> L73
        B = r68;     // Catch: NoSuchFieldException -> L73
        r68.setAccessible(true);     // Catch: NoSuchFieldException -> L73
    L43:
        A = true;
        goto L44
    L63:
        if (r7 == null) goto L67;
        if (ja0.b(r7, r9) == false) goto L67;
    L68:
        return true;
    L67:
        if (r6.c(r9) == false) goto L69;
    L8:
        return r6.c(r9);
    }

    public static final ge t(ge r3, ge r4, boolean r5) {
        Boolean r52 = Boolean.FALSE;
        he r0 = he.d;
        boolean r1 = ((Boolean) r3.h(r52, r0)).booleanValue();
        boolean r53 = ((Boolean) r4.h(r52, r0)).booleanValue();
        if (r1 == true) goto L7;
        if (r53 == true) goto L7;
        return r3.i(r4);
    L7:
        he r02 = new he(2, 5);
        wi r12 = wi.a;
        ge r32 = (ge) r3.h(r12, r02);
        Object r42 = r4;
        if (r53 == false) goto L11;
        r42 = r4.h(r12, he.c);
    L11:
        return r32.i((ge) r42);
    }

    public static String u(String r6, byte[] r7, String r8) {
        byte[] r0 = a80.l;
        byte[] r1 = a80.m;
        String r3 = "!";
        if (Arrays.equals(r7, r1) == false) goto L6;
    L7:
        Object r2 = ":";
    L10:
        if (r6.length() > 0) goto L20;
        if ("!".equals(r2) == false) goto L16;
        return r8.replace(":", "!");
    L16:
        if (":".equals(r2) == true) goto L18;
    L46:
        return r8;
    L18:
        return r8.replace("!", ":");
    L20:
        if (r8.equals("classes.dex") == false) goto L23;
        return r6;
    L23:
        if (r8.contains("!") == true) goto L39;
        if (r8.contains(":") == true) goto L39;
        if (r8.endsWith(".apk") == true) goto L46;
        StringBuilder r22 = new StringBuilder();
        r22.append(r6);
        if (Arrays.equals(r7, r1) == false) goto L34;
    L35:
        r3 = ":";
    L37:
        return z30.l(r22, r3, r8);
    L34:
        if (Arrays.equals(r7, r0) == false) goto L37;
    L39:
        if ("!".equals(r2) == false) goto L43;
        return r8.replace(":", "!");
    L43:
        if (":".equals(r2) == false) goto L46;
        return r8.replace("!", ":");
    L6:
        if (Arrays.equals(r7, r0) == true) goto L7;
        r2 = "!";
        goto L10
    }

    public static ColorStateList v(Context r8, int r9) {
        Resources r0 = r8.getResources();
        Resources.Theme r82 = r8.getTheme();
        a10 r1 = new a10(r0, r82);
        Object r2 = c10.c;
        monitor-enter(r2);
        SparseArray r3 = (SparseArray) c10.b.get(r1);     // Catch: Throwable -> L16
        ColorStateList r4 = null;
        if (r3 != null) goto L7;
    L25:
        monitor-exit(r2);     // Catch: Throwable -> L16
        ColorStateList r32 = null;
    L27:
        if (r32 == null) goto L29;
        return r32;
    L29:
        ThreadLocal r22 = c10.a;
        TypedValue r33 = (TypedValue) r22.get();
        if (r33 != null) goto L32;
        r33 = new TypedValue();
        r22.set(r33);
    L32:
        r0.getValue(r9, r33, true);
        int r23 = r33.type;
        if (r23 < 28) goto L59;
        if (r23 > 31) goto L59;
    L42:
        if (r4 == null) goto L56;
        Object r24 = c10.c;
        monitor-enter(r24);
        WeakHashMap r02 = c10.b;     // Catch: Throwable -> L48
        SparseArray r34 = (SparseArray) r02.get(r1);     // Catch: Throwable -> L48
        if (r34 != null) goto L50;
        r34 = new SparseArray();     // Catch: Throwable -> L48
        r02.put(r1, r34);     // Catch: Throwable -> L48
    L50:
        r34.append(r9, new z00(r4, r1.a.getConfiguration(), r82));     // Catch: Throwable -> L48
        monitor-exit(r24);     // Catch: Throwable -> L48
        return r4;
    L48:
        th = move-exception;
        throw th;
    L56:
        return y00.b(r0, r9, r82);
    L59:
        r4 = hb.a(r0, r0.getXml(r9), r82);     // Catch: Exception -> L40
    L40:
        e = move-exception;
        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
        goto L42
    L7:
        if (r3.size() <= 0) goto L25;
        z00 r5 = (z00) r3.get(r9);     // Catch: Throwable -> L16
        if (r5 == null) goto L25;
        if (r5.b.equals(r0.getConfiguration()) == false) goto L24;
        if (r82 == null) goto L14;
    L18:
        if (r82 == null) goto L24;
        if (r5.c != r82.hashCode()) goto L24;
    L21:
        r32 = r5.a;     // Catch: Throwable -> L16
        monitor-exit(r2);     // Catch: Throwable -> L16
        goto L27
    L14:
        if (r5.c == 0) goto L21;
    L24:
        r3.remove(r9);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    public static ArrayList x(MaterialToolbar r4, CharSequence r5) {
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

    public static ld z(ld r2) {
        o("<this>", r2);
        if ((r2 instanceof m50) == false) goto L5;
        m50 r0 = (m50) r2;
    L6:
        if (r0 == null) goto L15;
        r2 = r0.c;
        if (r2 != null) goto L15;
        ge r22 = r0.b;
        l(r22);
        md r23 = (md) r22.b(vh.b);
        if (r23 == null) goto L12;
        ld r1 = new tg((ke) r23, r0);
    L13:
        r0.c = r1;
        return r1;
    L12:
        r1 = r0;
    L15:
        return r2;
    L5:
        r0 = null;
        goto L6
    }

    public abstract void F(Throwable r1);

    public abstract View G(int r1);

    public abstract boolean H();

    public abstract void I(a8 r1);

    public abstract void V(Object r1, float r2);

    public abstract void w(p30 r1, float r2, float r3);

    public abstract float y(Object r1);
}
