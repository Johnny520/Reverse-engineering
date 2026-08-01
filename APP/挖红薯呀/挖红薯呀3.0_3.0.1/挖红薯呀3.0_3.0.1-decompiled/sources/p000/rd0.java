package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
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
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: loaded from: classes.dex */
public abstract class rd0 {

    /* JADX INFO: renamed from: b */
    public static final C0675r3 f5363b;

    /* JADX INFO: renamed from: e */
    public static final C0186ev f5366e;

    /* JADX INFO: renamed from: q */
    public static final float f5378q = 24.0f;

    /* JADX INFO: renamed from: r */
    public static final float f5379r = 24.0f;

    /* JADX INFO: renamed from: s */
    public static r00 f5380s;

    /* JADX INFO: renamed from: a */
    public static final C0755t8 f5362a = new C0755t8();

    /* JADX INFO: renamed from: c */
    public static final C0675r3 f5364c = new C0675r3(5);

    /* JADX INFO: renamed from: d */
    public static final C0675r3 f5365d = new C0675r3(6);

    /* JADX INFO: renamed from: f */
    public static final cd1 f5367f = new cd1(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: g */
    public static final cd1 f5368g = new cd1(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: h */
    public static final cd1 f5369h = new cd1(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: i */
    public static final cd1 f5370i = new cd1(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: j */
    public static final float[] f5371j = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: k */
    public static final Object f5372k = new Object();

    /* JADX INFO: renamed from: l */
    public static final byte[] f5373l = {112, 114, 111, 0};

    /* JADX INFO: renamed from: m */
    public static final byte[] f5374m = {112, 114, 109, 0};

    /* JADX INFO: renamed from: n */
    public static final z71 f5375n = new z71(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: o */
    public static final EnumC0472mf f5376o = EnumC0472mf.f3932h;

    /* JADX INFO: renamed from: p */
    public static final float f5377p = 0.38f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 7;
        f5363b = new C0675r3(i);
        f5366e = new C0186ev(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final boolean m3442A(KeyEvent keyEvent) {
        long jM2968D = p30.m2968D(keyEvent);
        int i = y40.f7536p;
        return y40.m5209a(jM2968D, y40.f7528h) || y40.m5209a(jM2968D, y40.f7531k) || y40.m5209a(jM2968D, y40.f7535o) || y40.m5209a(jM2968D, y40.f7530j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final pe0 m3443B(pe0 pe0Var, InterfaceC0742sw interfaceC0742sw) {
        return pe0Var.mo2499c(new C0691rj(interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final pe0 m3444C(pe0 pe0Var, jn0 jn0Var) {
        return pe0Var.mo2499c(new kn0(jn0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final pe0 m3445D(pe0 pe0Var) {
        return pe0Var.mo2499c(new hn0(16.0f, 16.0f, 16.0f, 16.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final pe0 m3446E(pe0 pe0Var, float f, float f2) {
        return pe0Var.mo2499c(new hn0(f, f2, f, f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static pe0 m3447F(pe0 pe0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m3446E(pe0Var, f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static pe0 m3448G(pe0 pe0Var, float f) {
        return pe0Var.mo2499c(new hn0(0.0f, f, 0.0f, 0.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x002a */
    /* JADX INFO: renamed from: H */
    public static void m3449H(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m3450I(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + fMax;
            i2++;
            i6++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static int[] m3451J(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM1516B = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1516B += (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            iArr[i2] = iM1516B;
        }
        return iArr;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static C0732sn[] m3452K(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0732sn[] c0732snArr) throws IOException {
        byte[] bArr3 = s91.f5724z;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, s91.f5693A)) {
                C0921xc.m5134o("Unsupported meta version");
                return null;
            }
            int iM1516B = (int) AbstractC0307i4.m1516B(fileInputStream, 2);
            byte[] bArrM1515A = AbstractC0307i4.m1515A(fileInputStream, (int) AbstractC0307i4.m1516B(fileInputStream, 4), (int) AbstractC0307i4.m1516B(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C0921xc.m5134o("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1515A);
            try {
                C0732sn[] c0732snArrM3454M = m3454M(byteArrayInputStream, bArr2, iM1516B, c0732snArr);
                byteArrayInputStream.close();
                return c0732snArrM3454M;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(s91.f5719u, bArr2)) {
            C0921xc.m5134o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C0921xc.m5134o("Unsupported meta version");
            return null;
        }
        int iM1516B2 = (int) AbstractC0307i4.m1516B(fileInputStream, 1);
        byte[] bArrM1515A2 = AbstractC0307i4.m1515A(fileInputStream, (int) AbstractC0307i4.m1516B(fileInputStream, 4), (int) AbstractC0307i4.m1516B(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0921xc.m5134o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1515A2);
        try {
            C0732sn[] c0732snArrM3453L = m3453L(byteArrayInputStream2, iM1516B2, c0732snArr);
            byteArrayInputStream2.close();
            return c0732snArrM3453L;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static C0732sn[] m3453L(ByteArrayInputStream byteArrayInputStream, int i, C0732sn[] c0732snArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0732sn[0];
        }
        if (i != c0732snArr.length) {
            C0921xc.m5134o("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1516B = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC0307i4.m1550z(byteArrayInputStream, iM1516B), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0732sn c0732sn = c0732snArr[i3];
            if (!c0732sn.f5790b.equals(strArr[i3])) {
                C0921xc.m5134o("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c0732sn.f5793e = i4;
            c0732sn.f5796h = m3451J(byteArrayInputStream, i4);
        }
        return c0732snArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C0732sn[] m3454M(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0732sn[] c0732snArr) {
        C0732sn c0732sn;
        if (byteArrayInputStream.available() == 0) {
            return new C0732sn[0];
        }
        if (i != c0732snArr.length) {
            C0921xc.m5134o("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            String str = new String(AbstractC0307i4.m1550z(byteArrayInputStream, (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1516B = AbstractC0307i4.m1516B(byteArrayInputStream, 4);
            int iM1516B = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            if (c0732snArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c0732snArr.length; i3++) {
                    if (c0732snArr[i3].f5790b.equals(strSubstring)) {
                        c0732sn = c0732snArr[i3];
                        break;
                    }
                }
                c0732sn = null;
            } else {
                c0732sn = null;
            }
            if (c0732sn == null) {
                C0921xc.m5134o("Missing profile key: ".concat(str));
                return null;
            }
            c0732sn.f5792d = jM1516B;
            int[] iArrM3451J = m3451J(byteArrayInputStream, iM1516B);
            if (Arrays.equals(bArr, s91.f5723y)) {
                c0732sn.f5793e = iM1516B;
                c0732sn.f5796h = iArrM3451J;
            }
        }
        return c0732snArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static C0732sn[] m3455N(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, s91.f5720v)) {
            C0921xc.m5134o("Unsupported version");
            return null;
        }
        int iM1516B = (int) AbstractC0307i4.m1516B(fileInputStream, 1);
        byte[] bArrM1515A = AbstractC0307i4.m1515A(fileInputStream, (int) AbstractC0307i4.m1516B(fileInputStream, 4), (int) AbstractC0307i4.m1516B(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0921xc.m5134o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1515A);
        try {
            C0732sn[] c0732snArrM3456O = m3456O(byteArrayInputStream, str, iM1516B);
            byteArrayInputStream.close();
            return c0732snArrM3456O;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static C0732sn[] m3456O(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0732sn[0];
        }
        C0732sn[] c0732snArr = new C0732sn[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM1516B = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            int iM1516B2 = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
            c0732snArr[i3] = new C0732sn(str, new String(AbstractC0307i4.m1550z(byteArrayInputStream, iM1516B), StandardCharsets.UTF_8), AbstractC0307i4.m1516B(byteArrayInputStream, 4), iM1516B2, (int) AbstractC0307i4.m1516B(byteArrayInputStream, 4), (int) AbstractC0307i4.m1516B(byteArrayInputStream, 4), new int[iM1516B2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C0732sn c0732sn = c0732snArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c0732sn.f5794f;
            int i6 = c0732sn.f5795g;
            TreeMap treeMap = c0732sn.f5797i;
            int i7 = iAvailable - i5;
            int iM1516B3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM1516B3 += (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1516B3), 1);
                int iM1516B4 = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 2);
                while (iM1516B4 > 0) {
                    AbstractC0307i4.m1516B(byteArrayInputStream, 2);
                    int iM1516B5 = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 1);
                    if (iM1516B5 != 6 && iM1516B5 != 7) {
                        while (iM1516B5 > 0) {
                            AbstractC0307i4.m1516B(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM1516B6 = (int) AbstractC0307i4.m1516B(byteArrayInputStream, 1); iM1516B6 > 0; iM1516B6--) {
                                AbstractC0307i4.m1516B(byteArrayInputStream, 2);
                            }
                            iM1516B5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM1516B4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C0921xc.m5134o("Read too much data during profile line parse");
                return null;
            }
            c0732sn.f5796h = m3451J(byteArrayInputStream, c0732sn.f5793e);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC0307i4.m1550z(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c0732snArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final py0 m3457P(C0616pi c0616pi) {
        Object[] objArr = new Object[0];
        boolean zM3100d = c0616pi.m3100d(0);
        Object objM3080L = c0616pi.m3080L();
        if (zM3100d || objM3080L == C0320ii.f2572a) {
            objM3080L = new us0(7);
            c0616pi.m3107g0(objM3080L);
        }
        return (py0) r60.m3423y(objArr, py0.f4987j, (InterfaceC0298hw) objM3080L, c0616pi, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static int m3458Q(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C0921xc.m5131l("Cannot round NaN value.");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static long m3459R(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C0921xc.m5131l("Cannot round NaN value.");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static final void m3460S(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final gt0 m3461T(C0910x1 c0910x1, C0286hk c0286hk, v31 v31Var, Float f) {
        InterfaceC0470md.f3918a.getClass();
        C0427ld c0427ld = C0427ld.f3417a;
        C0111d c0111d = new C0111d(20, c0910x1, C0220fs.f1799d);
        z31 z31VarM3048d = pf1.m3048d(f);
        InterfaceC0618pk interfaceC0618pk = (InterfaceC0618pk) c0111d.f920f;
        InterfaceC0296hu interfaceC0296hu = (InterfaceC0296hu) c0111d.f919e;
        EnumC0059bl enumC0059bl = v31Var.equals(i11.f2395a) ? EnumC0059bl.f538d : EnumC0059bl.f541g;
        C0119d7 c0119d7 = new C0119d7(v31Var, interfaceC0296hu, z31VarM3048d, f, null, 3);
        InterfaceC0618pk interfaceC0618pkM1540p = AbstractC0307i4.m1540p(c0286hk.mo1328f(), interfaceC0618pk, true);
        C0436lm c0436lm = AbstractC0326io.f2592a;
        if (interfaceC0618pkM1540p != c0436lm && interfaceC0618pkM1540p.mo64l(C0496n2.f4163w) == null) {
            interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm);
        }
        AbstractC0708s g90Var = enumC0059bl == EnumC0059bl.f539e ? new g90(interfaceC0618pkM1540p, c0119d7) : new r31(interfaceC0618pkM1540p, true);
        g90Var.m3990l0(enumC0059bl, g90Var, c0119d7);
        return new gt0(z31VarM3048d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static final String m3462U(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, GOTO] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: V */
    public static boolean m3463V(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0732sn[] c0732snArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = s91.f5723y;
        byte[] bArr3 = s91.f5722x;
        byte[] bArr4 = s91.f5719u;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = s91.f5720v;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM3483l = m3483l(c0732snArr, bArr5);
                AbstractC0307i4.m1523I(byteArrayOutputStream, c0732snArr.length, 1);
                AbstractC0307i4.m1523I(byteArrayOutputStream, bArrM3483l.length, 4);
                byte[] bArrM1536l = AbstractC0307i4.m1536l(bArrM3483l);
                AbstractC0307i4.m1523I(byteArrayOutputStream, bArrM1536l.length, 4);
                byteArrayOutputStream.write(bArrM1536l);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC0307i4.m1523I(byteArrayOutputStream, c0732snArr.length, 1);
                for (C0732sn c0732sn : c0732snArr) {
                    int size = c0732sn.f5797i.size() * 4;
                    String strM3490s = m3490s(c0732sn.f5789a, c0732sn.f5790b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC0307i4.m1524J(byteArrayOutputStream, strM3490s.getBytes(charset).length);
                    AbstractC0307i4.m1524J(byteArrayOutputStream, c0732sn.f5796h.length);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, size, 4);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, c0732sn.f5791c, 4);
                    byteArrayOutputStream.write(strM3490s.getBytes(charset));
                    Iterator it = c0732sn.f5797i.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC0307i4.m1524J(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        AbstractC0307i4.m1524J(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0732sn.f5796h) {
                        AbstractC0307i4.m1524J(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = s91.f5721w;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM3483l2 = m3483l(c0732snArr, bArr6);
                AbstractC0307i4.m1523I(byteArrayOutputStream, c0732snArr.length, 1);
                AbstractC0307i4.m1523I(byteArrayOutputStream, bArrM3483l2.length, 4);
                byte[] bArrM1536l2 = AbstractC0307i4.m1536l(bArrM3483l2);
                AbstractC0307i4.m1523I(byteArrayOutputStream, bArrM1536l2.length, 4);
                byteArrayOutputStream.write(bArrM1536l2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            AbstractC0307i4.m1524J(byteArrayOutputStream, c0732snArr.length);
            for (C0732sn c0732sn2 : c0732snArr) {
                String str = c0732sn2.f5789a;
                TreeMap treeMap = c0732sn2.f5797i;
                String strM3490s2 = m3490s(str, c0732sn2.f5790b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC0307i4.m1524J(byteArrayOutputStream, strM3490s2.getBytes(charset2).length);
                AbstractC0307i4.m1524J(byteArrayOutputStream, treeMap.size());
                AbstractC0307i4.m1524J(byteArrayOutputStream, c0732sn2.f5796h.length);
                AbstractC0307i4.m1523I(byteArrayOutputStream, c0732sn2.f5791c, 4);
                byteArrayOutputStream.write(strM3490s2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC0307i4.m1524J(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0732sn2.f5796h) {
                    AbstractC0307i4.m1524J(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC0307i4.m1524J(byteArrayOutputStream2, c0732snArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0732sn c0732sn3 : c0732snArr) {
                AbstractC0307i4.m1523I(byteArrayOutputStream2, c0732sn3.f5791c, 4);
                AbstractC0307i4.m1523I(byteArrayOutputStream2, c0732sn3.f5792d, 4);
                AbstractC0307i4.m1523I(byteArrayOutputStream2, c0732sn3.f5795g, 4);
                String strM3490s3 = m3490s(c0732sn3.f5789a, c0732sn3.f5790b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM3490s3.getBytes(charset3).length;
                AbstractC0307i4.m1524J(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM3490s3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ze1 ze1Var = new ze1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ze1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0732snArr.length) {
                try {
                    C0732sn c0732sn4 = c0732snArr[i7];
                    AbstractC0307i4.m1524J(byteArrayOutputStream3, i7);
                    AbstractC0307i4.m1524J(byteArrayOutputStream3, c0732sn4.f5793e);
                    i8 = i8 + 4 + (c0732sn4.f5793e * i5);
                    int[] iArr = c0732sn4.f5796h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        AbstractC0307i4.m1524J(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ze1 ze1Var2 = new ze1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ze1Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < c0732snArr.length; i13++) {
                try {
                    C0732sn c0732sn5 = c0732snArr[i13];
                    Iterator it3 = c0732sn5.f5797i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m3473c0(byteArrayOutputStream4, iIntValue, c0732sn5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m3475d0(byteArrayOutputStream4, c0732sn5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            AbstractC0307i4.m1524J(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            AbstractC0307i4.m1523I(byteArrayOutputStream3, length4, 4);
                            AbstractC0307i4.m1524J(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            ze1 ze1Var3 = new ze1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(ze1Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            AbstractC0307i4.m1523I(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                ze1 ze1Var4 = (ze1) arrayList.get(i15);
                int i16 = ze1Var4.f7883a;
                byte[] bArr7 = ze1Var4.f7884b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                AbstractC0307i4.m1523I(byteArrayOutputStream, j, 4);
                AbstractC0307i4.m1523I(byteArrayOutputStream, size2, 4);
                if (ze1Var4.f7885c) {
                    long length5 = bArr7.length;
                    byte[] bArrM1536l3 = AbstractC0307i4.m1536l(bArr7);
                    arrayList2.add(bArrM1536l3);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, bArrM1536l3.length, 4);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, length5, 4);
                    length = bArrM1536l3.length;
                } else {
                    arrayList2.add(bArr7);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC0307i4.m1523I(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final boolean m3464W(Throwable th, InterfaceC0298hw interfaceC0298hw) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = b40.f368a;
        C0770tn c0770tn = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = br0.f562b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = C0294hs.f2354d;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof C0770tn) {
                return false;
            }
        }
        try {
            C0093ci c0093ci = (C0093ci) interfaceC0298hw.invoke();
            if (c0093ci != null && !c0093ci.f816a.isEmpty()) {
                z = true;
            }
            if (z) {
                c0093ci.getClass();
                c0770tn = new C0770tn(c0093ci);
            }
        } catch (Throwable th2) {
            c0770tn = th2;
        }
        if (c0770tn != null) {
            AbstractC0398kl.m1920f(th, c0770tn);
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static pe0 m3465X(pe0 pe0Var, py0 py0Var) {
        return pe0Var.mo2499c(p30.m2974J(me0.f3922a, C0227fz.f1823c, 518143)).mo2499c(new qy0(null, null, null, py0Var.f4991d, um0.f6264d, py0Var, true, true)).mo2499c(new fz0(py0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static final pe0 m3466Y(pe0 pe0Var, fd1 fd1Var) {
        return pe0Var.mo2499c(new n20(fd1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static Object m3467Z(InterfaceC0904ww interfaceC0904ww, Object obj, InterfaceC0322ik interfaceC0322ik) {
        interfaceC0904ww.getClass();
        InterfaceC0618pk interfaceC0618pkMo540e = interfaceC0322ik.mo540e();
        Object s30Var = interfaceC0618pkMo540e == C0220fs.f1799d ? new s30(interfaceC0322ik) : new t30(interfaceC0322ik, interfaceC0618pkMo540e);
        s91.m4048m(2, interfaceC0904ww);
        return interfaceC0904ww.invoke(obj, s30Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0913x4 m3468a(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new C0913x4(setSingleton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m3469a0(ByteArrayOutputStream byteArrayOutputStream, C0732sn c0732sn) throws IOException {
        m3475d0(byteArrayOutputStream, c0732sn);
        int i = c0732sn.f5795g;
        int[] iArr = c0732sn.f5796h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC0307i4.m1524J(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0732sn.f5797i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m3470b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static void m3471b0(ByteArrayOutputStream byteArrayOutputStream, C0732sn c0732sn, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC0307i4.m1524J(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC0307i4.m1524J(byteArrayOutputStream, c0732sn.f5793e);
        AbstractC0307i4.m1523I(byteArrayOutputStream, c0732sn.f5794f, 4);
        AbstractC0307i4.m1523I(byteArrayOutputStream, c0732sn.f5791c, 4);
        AbstractC0307i4.m1523I(byteArrayOutputStream, c0732sn.f5795g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m3472c(int i) {
        long j = ((long) i) << 32;
        int i2 = y40.f7536p;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static void m3473c0(ByteArrayOutputStream byteArrayOutputStream, int i, C0732sn c0732sn) throws IOException {
        int i2 = c0732sn.f5795g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0732sn.f5797i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final ln0 m3474d(float f, float f2, float f3, float f4) {
        return new ln0(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m3475d0(ByteArrayOutputStream byteArrayOutputStream, C0732sn c0732sn) {
        int i = 0;
        for (Map.Entry entry : c0732sn.f5797i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0307i4.m1524J(byteArrayOutputStream, iIntValue - i);
                AbstractC0307i4.m1524J(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static ln0 m3476e(float f) {
        return new ln0(0.0f, 0.0f, 0.0f, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static float m3477f(EdgeEffect edgeEffect, float f, float f2, InterfaceC0968ym interfaceC0968ym) {
        float f3 = AbstractC0138dr.f1167a;
        double dMo48b = interfaceC0968ym.mo48b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC0138dr.f1167a) * dMo48b;
        float fExp = (float) (Math.exp((AbstractC0138dr.f1168b / AbstractC0138dr.f1169c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC0463m8.m2446c(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM3458Q = m3458Q(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM3458Q);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM3458Q);
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m3478g(xz0 xz0Var) {
        sz0 sz0VarM5188k = xz0Var.m5188k();
        return !sz0VarM5188k.f5877d.m1697c(b01.f330i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m3479h(xz0 xz0Var, Resources resources) {
        Object objM1701g = xz0Var.f7471d.f5877d.m1701g(b01.f322a);
        if (objM1701g == null) {
            objM1701g = null;
        }
        List list = (List) objM1701g;
        return !AbstractC0307i4.m1545u(xz0Var) && (xz0Var.f7471d.f5879f || (xz0Var.m5191n() && ((list != null ? (String) AbstractC0960ye.m5241K(list) : null) != null || m3495x(xz0Var) != null || m3494w(xz0Var, resources) != null || m3493v(xz0Var))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static pe0 m3480i(pe0 pe0Var, xg0 xg0Var, wv0 wv0Var, boolean z, InterfaceC0298hw interfaceC0298hw) {
        return pe0Var.mo2499c(wv0Var != null ? new C0548oe(xg0Var, wv0Var, false, z, interfaceC0298hw) : wv0Var == null ? new C0548oe(xg0Var, null, false, z, interfaceC0298hw) : xg0Var != null ? c10.m386a(me0.f3922a, xg0Var, wv0Var).mo2499c(new C0548oe(xg0Var, null, false, z, interfaceC0298hw)) : new C0284hi(new C0612pe(wv0Var, z, interfaceC0298hw)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static pe0 m3481j(pe0 pe0Var, InterfaceC0298hw interfaceC0298hw) {
        return pe0Var.mo2499c(new C0548oe(null, null, true, true, interfaceC0298hw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C0780tv m3482k(Context context) {
        ProviderInfo providerInfo;
        C0703rv c0703rv;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        v50.m4402g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0703rv = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                c0703rv = new C0703rv(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c0703rv = null;
            }
        }
        if (c0703rv == null) {
            return null;
        }
        return new C0780tv(new C0741sv(context, c0703rv));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static byte[] m3483l(C0732sn[] c0732snArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C0732sn c0732sn : c0732snArr) {
            length += ((((c0732sn.f5795g * 2) + 7) & (-8)) / 8) + (c0732sn.f5793e * 2) + m3490s(c0732sn.f5789a, c0732sn.f5790b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0732sn.f5794f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, s91.f5721w)) {
            int length2 = c0732snArr.length;
            while (i < length2) {
                C0732sn c0732sn2 = c0732snArr[i];
                m3471b0(byteArrayOutputStream, c0732sn2, m3490s(c0732sn2.f5789a, c0732sn2.f5790b, bArr));
                m3469a0(byteArrayOutputStream, c0732sn2);
                i++;
            }
        } else {
            for (C0732sn c0732sn3 : c0732snArr) {
                m3471b0(byteArrayOutputStream, c0732sn3, m3490s(c0732sn3.f5789a, c0732sn3.f5790b, bArr));
            }
            int length3 = c0732snArr.length;
            while (i < length3) {
                m3469a0(byteArrayOutputStream, c0732snArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ww */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static InterfaceC0322ik m3484m(InterfaceC0322ik interfaceC0322ik, InterfaceC0322ik interfaceC0322ik2, InterfaceC0904ww interfaceC0904ww) {
        interfaceC0904ww.getClass();
        if (interfaceC0904ww instanceof AbstractC0955y9) {
            return ((AbstractC0955y9) interfaceC0904ww).mo15g(interfaceC0322ik, interfaceC0322ik2);
        }
        InterfaceC0618pk interfaceC0618pkMo540e = interfaceC0322ik2.mo540e();
        return interfaceC0618pkMo540e == C0220fs.f1799d ? new q30(interfaceC0322ik2, interfaceC0322ik, interfaceC0904ww) : new r30(interfaceC0322ik2, interfaceC0618pkMo540e, interfaceC0904ww, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC0296hu m3485n(InterfaceC0296hu interfaceC0296hu) {
        return ((interfaceC0296hu instanceof x31) || (interfaceC0296hu instanceof C0859vo)) ? interfaceC0296hu : new C0859vo(interfaceC0296hu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final pe0 m3486o(pe0 pe0Var, InterfaceC0742sw interfaceC0742sw) {
        return pe0Var.mo2499c(new C0661qq(interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m3487p(long j, long j2) {
        return j == j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final ArrayList m3488q(C0093ci c0093ci) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c0093ci.f816a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0130di c0130di = (C0130di) list.get(i);
            int i3 = c0130di.f1110a;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                }
                if (i3 == iArr[i4]) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                if (c0130di.f1110a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((C0130di) list.get(i5)).f1110a == 1000) {
                        break;
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(c0130di);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ww] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ww] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3489r(InterfaceC0296hu interfaceC0296hu, InterfaceC0904ww interfaceC0904ww, AbstractC0358jk abstractC0358jk) {
        C0591ou c0591ou;
        ?? r1;
        zt0 zt0Var;
        C0000a e;
        C0810uo c0810uo;
        ?? r12;
        C1014zr c1014zr = o30.f4442l;
        if (abstractC0358jk instanceof C0591ou) {
            c0591ou = (C0591ou) abstractC0358jk;
            int i = c0591ou.f4660k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0591ou.f4660k = i - Integer.MIN_VALUE;
            } else {
                c0591ou = new C0591ou(abstractC0358jk);
            }
        }
        Object obj = c0591ou.f4659j;
        int i2 = c0591ou.f4660k;
        int i3 = 1;
        if (i2 == 0) {
            w60.m4891M(obj);
            zt0 zt0Var2 = new zt0();
            zt0Var2.f7995d = c1014zr;
            C0810uo c0810uo2 = new C0810uo(i3, (Object) interfaceC0904ww, zt0Var2);
            try {
                c0591ou.f4656g = (m51) interfaceC0904ww;
                c0591ou.f4657h = zt0Var2;
                c0591ou.f4658i = c0810uo2;
                c0591ou.f4660k = 1;
                Object objMo609b = interfaceC0296hu.mo609b(c0810uo2, c0591ou);
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objMo609b == enumC1007zk) {
                    return enumC1007zk;
                }
                r12 = interfaceC0904ww;
                zt0Var = zt0Var2;
            } catch (C0000a e2) {
                r1 = interfaceC0904ww;
                zt0Var = zt0Var2;
                e = e2;
                c0810uo = c0810uo2;
                r12 = r1;
                if (e.f0d != c0810uo) {
                }
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0810uo = c0591ou.f4658i;
            zt0Var = c0591ou.f4657h;
            r1 = (InterfaceC0904ww) c0591ou.f4656g;
            try {
                w60.m4891M(obj);
                r12 = r1;
            } catch (C0000a e3) {
                e = e3;
                r12 = r1;
                if (e.f0d != c0810uo) {
                    throw e;
                }
            }
        }
        Object obj2 = zt0Var.f7995d;
        if (obj2 != c1014zr) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m3490s(String str, String str2, byte[] bArr) {
        byte[] bArr2 = s91.f5722x;
        byte[] bArr3 = s91.f5723y;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final r00 m3491t() {
        r00 r00Var = f5380s;
        if (r00Var != null) {
            return r00Var;
        }
        q00 q00Var = new q00("Filled.CheckCircle");
        int i = ib1.f2505a;
        g31 g31Var = new g31(C0207ff.f1702b);
        C0910x1 c0910x1 = new C0910x1(16);
        ArrayList arrayList = (ArrayList) c0910x1.f7232e;
        c0910x1.m5075o(12.0f, 2.0f);
        arrayList.add(new mp0(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
        arrayList.add(new up0(4.48f, 10.0f, 10.0f));
        arrayList.add(new up0(10.0f, -4.48f, -10.0f));
        arrayList.add(new qp0(2));
        c0910x1.m5067g();
        c0910x1.m5075o(10.0f, 17.0f);
        c0910x1.m5074n(-5.0f, -5.0f);
        c0910x1.m5074n(1.41f, -1.41f);
        c0910x1.m5073m(10.0f, 14.17f);
        c0910x1.m5074n(7.59f, -7.59f);
        c0910x1.m5073m(19.0f, 8.0f);
        c0910x1.m5074n(-9.0f, 9.0f);
        c0910x1.m5067g();
        q00.m3181a(q00Var, arrayList, g31Var);
        r00 r00VarM3182b = q00Var.m3182b();
        f5380s = r00VarM3182b;
        return r00VarM3182b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final String[] m3492u(InterfaceC0212fk interfaceC0212fk) {
        interfaceC0212fk.getClass();
        return (String[]) ((C0913x4) interfaceC0212fk).f7256b.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final boolean m3493v(xz0 xz0Var) {
        Object objM1701g = xz0Var.f7471d.f5877d.m1701g(b01.f315H);
        if (objM1701g == null) {
            objM1701g = null;
        }
        p81 p81Var = (p81) objM1701g;
        jh0 jh0Var = xz0Var.f7471d.f5877d;
        Object objM1701g2 = jh0Var.m1701g(b01.f345x);
        if (objM1701g2 == null) {
            objM1701g2 = null;
        }
        xv0 xv0Var = (xv0) objM1701g2;
        boolean z = p81Var != null;
        Object objM1701g3 = jh0Var.m1701g(b01.f314G);
        if (((Boolean) (objM1701g3 != null ? objM1701g3 : null)) == null || (xv0Var != null && xv0Var.f7427a == 4)) {
            return z;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final String m3494w(xz0 xz0Var, Resources resources) {
        sz0 sz0Var = xz0Var.f7471d;
        sz0 sz0Var2 = xz0Var.f7471d;
        Object objM1701g = sz0Var.f5877d.m1701g(b01.f323b);
        String string = null;
        if (objM1701g == null) {
            objM1701g = null;
        }
        jh0 jh0Var = sz0Var2.f5877d;
        Object objM1701g2 = jh0Var.m1701g(b01.f315H);
        if (objM1701g2 == null) {
            objM1701g2 = null;
        }
        p81 p81Var = (p81) objM1701g2;
        Object objM1701g3 = jh0Var.m1701g(b01.f345x);
        if (objM1701g3 == null) {
            objM1701g3 = null;
        }
        xv0 xv0Var = (xv0) objM1701g3;
        if (p81Var != null) {
            int iOrdinal = p81Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0921xc.m5129j();
                        return null;
                    }
                    if (objM1701g == null) {
                        objM1701g = resources.getString(C0587R.string.indeterminate);
                    }
                } else if (xv0Var != null && xv0Var.f7427a == 2 && objM1701g == null) {
                    objM1701g = resources.getString(C0587R.string.state_off);
                }
            } else if (xv0Var != null && xv0Var.f7427a == 2 && objM1701g == null) {
                objM1701g = resources.getString(C0587R.string.state_on);
            }
        }
        Object objM1701g4 = jh0Var.m1701g(b01.f314G);
        if (objM1701g4 == null) {
            objM1701g4 = null;
        }
        Boolean bool = (Boolean) objM1701g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((xv0Var == null || xv0Var.f7427a != 4) && objM1701g == null) {
                objM1701g = zBooleanValue ? resources.getString(C0587R.string.selected) : resources.getString(C0587R.string.not_selected);
            }
        }
        Object objM1701g5 = jh0Var.m1701g(b01.f324c);
        if (objM1701g5 == null) {
            objM1701g5 = null;
        }
        ys0 ys0Var = (ys0) objM1701g5;
        if (ys0Var != null) {
            if (ys0Var != ys0.f7689b) {
                if (objM1701g == null) {
                    objM1701g = resources.getString(C0587R.string.template_percent, 0);
                }
            } else if (objM1701g == null) {
                objM1701g = resources.getString(C0587R.string.in_progress);
            }
        }
        e01 e01Var = b01.f312E;
        if (jh0Var.m1697c(e01Var)) {
            jh0 jh0Var2 = new xz0(xz0Var.f7468a, true, xz0Var.f7470c, sz0Var2).m5188k().f5877d;
            Object objM1701g6 = jh0Var2.m1701g(b01.f322a);
            if (objM1701g6 == null) {
                objM1701g6 = null;
            }
            Collection collection = (Collection) objM1701g6;
            if (collection == null || collection.isEmpty()) {
                Object objM1701g7 = jh0Var2.m1701g(b01.f308A);
                if (objM1701g7 == null) {
                    objM1701g7 = null;
                }
                Collection collection2 = (Collection) objM1701g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM1701g8 = jh0Var2.m1701g(e01Var);
                    if (objM1701g8 == null) {
                        objM1701g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM1701g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(C0587R.string.state_empty);
                    }
                }
            }
            objM1701g = string;
        }
        return (String) objM1701g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final C0200f8 m3495x(xz0 xz0Var) {
        Object objM1701g = xz0Var.f7471d.f5877d.m1701g(b01.f312E);
        if (objM1701g == null) {
            objM1701g = null;
        }
        C0200f8 c0200f8 = (C0200f8) objM1701g;
        Object objM1701g2 = xz0Var.f7471d.f5877d.m1701g(b01.f308A);
        if (objM1701g2 == null) {
            objM1701g2 = null;
        }
        List list = (List) objM1701g2;
        return c0200f8 == null ? list != null ? (C0200f8) AbstractC0960ye.m5241K(list) : null : c0200f8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final C0884wc m3496y(InterfaceC0322ik interfaceC0322ik) {
        if (!(interfaceC0322ik instanceof C0179eo)) {
            return new C0884wc(1, interfaceC0322ik);
        }
        C0884wc c0884wcM944n = ((C0179eo) interfaceC0322ik).m944n();
        if (c0884wcM944n != null) {
            if (!c0884wcM944n.m4979E()) {
                c0884wcM944n = null;
            }
            if (c0884wcM944n != null) {
                return c0884wcM944n;
            }
        }
        return new C0884wc(2, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static InterfaceC0322ik m3497z(InterfaceC0322ik interfaceC0322ik) {
        InterfaceC0322ik interfaceC0322ikM1719o;
        interfaceC0322ik.getClass();
        AbstractC0358jk abstractC0358jk = interfaceC0322ik instanceof AbstractC0358jk ? (AbstractC0358jk) interfaceC0322ik : null;
        return (abstractC0358jk == null || (interfaceC0322ikM1719o = abstractC0358jk.m1719o()) == null) ? interfaceC0322ik : interfaceC0322ikM1719o;
    }
}
