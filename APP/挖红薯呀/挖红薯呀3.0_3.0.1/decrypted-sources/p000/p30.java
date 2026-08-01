package p000;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p30 {

    /* JADX INFO: renamed from: e */
    public static gv0 f4738e;

    /* JADX INFO: renamed from: g */
    public static final C0111d f4740g;

    /* JADX INFO: renamed from: h */
    public static final C0111d f4741h;

    /* JADX INFO: renamed from: i */
    public static final C0111d f4742i;

    /* JADX INFO: renamed from: j */
    public static final C0111d f4743j;

    /* JADX INFO: renamed from: k */
    public static final C0111d f4744k;

    /* JADX INFO: renamed from: a */
    public static final float[] f4734a = new float[91];

    /* JADX INFO: renamed from: b */
    public static final C0836vd f4735b = new C0836vd();

    /* JADX INFO: renamed from: c */
    public static final hr0 f4736c = new hr0(new er0());

    /* JADX INFO: renamed from: d */
    public static final C1009zm f4737d = new C1009zm(1.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final jo0 f4739f = new jo0(5);

    /* JADX INFO: renamed from: l */
    public static final Object f4745l = new Object();

    /* JADX INFO: renamed from: m */
    public static final sx0 f4746m = new sx0(19);

    /* JADX INFO: renamed from: n */
    public static final C0815ut f4747n = new C0815ut();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 19;
        f4740g = new C0111d(i, new rx0(20), new sx0(7));
        f4741h = new C0111d(i, new rx0(21), new sx0(8));
        f4742i = new C0111d(i, new rx0(22), new sx0(9));
        f4743j = new C0111d(i, new rx0(23), new sx0(10));
        f4744k = new C0111d(i, new rx0(24), new sx0(11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final float m2965A(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final float m2966B(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = h71.f2164a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : b10.f348a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final float m2967C(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = h71.f2164a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? b10.f348a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final long m2968D(KeyEvent keyEvent) {
        return rd0.m3472c(keyEvent.getKeyCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final c41 m2969E(c31 c31Var) {
        c41 c41Var = c31Var.f650d;
        c41Var.getClass();
        return (c41) t21.m4182t(c41Var, c31Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final int m2970F(c31 c31Var) {
        c41 c41Var = c31Var.f650d;
        c41Var.getClass();
        return ((c41) t21.m4170h(c41Var)).f691e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final int m2971G(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final pe0 m2972H(pe0 pe0Var, InterfaceC0742sw interfaceC0742sw) {
        return pe0Var.mo2499c(new C0385ka(interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final pe0 m2973I(pe0 pe0Var, float f, long j, x01 x01Var, boolean z, long j2, long j3) {
        return pe0Var.mo2499c(new C0905wx(f, j, x01Var, z, j2, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static pe0 m2974J(pe0 pe0Var, x01 x01Var, int i) {
        long j = t81.f5953a;
        if ((i & 2048) != 0) {
            x01Var = pf1.f4843i;
        }
        long j2 = AbstractC0979yx.f7702a;
        return m2973I(pe0Var, 0.0f, j, x01Var, true, j2, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final boolean m2975K(InterfaceC0966yk interfaceC0966yk) {
        c40 c40Var = (c40) interfaceC0966yk.mo1328f().mo64l(C0496n2.f4129I);
        if (c40Var != null) {
            return c40Var.mo479b();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static final boolean m2976L(long j) {
        return (j & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static final boolean m2977M(long j) {
        return (j & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static boolean m2978N(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static final pe0 m2979O(pe0 pe0Var, x70 x70Var, f80 f80Var, um0 um0Var, boolean z) {
        return pe0Var.mo2499c(new i80(x70Var, f80Var, um0Var, z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final boolean m2980P(c31 c31Var, InterfaceC0742sw interfaceC0742sw) {
        int i;
        AbstractC0112d0 abstractC0112d0;
        Object objInvoke;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (f4745l) {
                c41 c41Var = c31Var.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            qq0 qq0VarMo10e = abstractC0112d0.mo10e();
            objInvoke = interfaceC0742sw.invoke(qq0VarMo10e);
            AbstractC0112d0 abstractC0112d0M3301c = qq0VarMo10e.m3301c();
            if (m3002l(abstractC0112d0M3301c, abstractC0112d0)) {
                break;
            }
            c41 c41Var3 = c31Var.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = m3003m((c41) t21.m4185w(c41Var3, c31Var, l21VarM4172j), i, abstractC0112d0M3301c, true);
            }
            t21.m4176n(l21VarM4172j, c31Var);
        } while (!zM3003m);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static void m2981Q(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final pe0 m2982R(pe0 pe0Var, InterfaceC0742sw interfaceC0742sw) {
        return pe0Var.mo2499c(new fl0(interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static final byte[] m2983S(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m3012v(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static void m2984T(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static final long m2985U(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static void m2986V(String str) {
        C0725sg c0725sg = new C0725sg("lateinit property " + str + " has not been initialized");
        m2984T(c0725sg, p30.class.getName());
        throw c0725sg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final int m2987W(long j) {
        float[] fArr = C0687rf.f5387a;
        return (int) (C0207ff.m1092a(j, C0687rf.f5391e) >>> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
  0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2988X(long j, EnumC1013zq enumC1013zq) {
        long j2;
        TimeUnit timeUnit = enumC1013zq.f7983d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            C0675r3 c0675r3 = AbstractC0935xq.f7397d;
            long j3 = jConvert2 << 1;
            int i = AbstractC0972yq.f7686a;
            return j3;
        }
        if (enumC1013zq.compareTo(EnumC1013zq.MILLISECONDS) < 0) {
            return m3014x(w60.m4908o(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = enumC1013zq.ordinal();
        long j4 = 0;
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                C0921xc.m5130k(enumC1013zq, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j4;
        } else {
            j4 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j2 <= 4611686018427387903L) {
                    jAbs = j2;
                }
            } else if (j2 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j2;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j2;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return m3014x(jSignum * jAbs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x000d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [et0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: Y */
    public static final ArrayList m2989Y(v11 v11Var, int i, Integer num) {
        ?? et0Var = new et0(v11Var);
        int iM4381q = v11Var.m4381q(i);
        C0788u2 c0788u2M4365a = v11Var.m4365a(i);
        while (i >= 0) {
            et0Var.m968c(v11Var.m4373i(i), v11Var.m4375k(i) ? v11Var.m4380p(v11Var.f6375b, i) : C0320ii.f2572a, v11Var.f6374a.m4832f(i), num);
            if (iM4381q >= 0) {
                C0788u2 c0788u2 = c0788u2M4365a;
                c0788u2M4365a = v11Var.m4365a(iM4381q);
                i = iM4381q;
                iM4381q = v11Var.m4381q(iM4381q);
                num = c0788u2;
            } else {
                i = iM4381q;
                num = c0788u2M4365a;
            }
        }
        return et0Var.f1526a;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x01ad */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:174:0x0260 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:176:0x0263 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:292:0x01c8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:293:0x015c */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2990Z(Context context, Executor executor, ss0 ss0Var, boolean z) {
        boolean z2;
        ?? M1168e;
        C0732sn[] c0732snArrM3455N;
        C0732sn[] c0732snArr;
        C0732sn[] c0732snArr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r73;
        C0215fn c0215fn;
        ?? r74;
        FileInputStream fileInputStreamM1168e;
        ?? r75;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                ss0Var.mo1737f(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        xs0.m5151c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = rd0.f5373l;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0215fn c0215fn2 = new C0215fn(assets, executor, ss0Var, name, file2);
            byte[] bArr3 = (byte[]) c0215fn2.f1773d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c0215fn2.m1169f(4, null);
                    }
                    c0215fn2.f1770a = true;
                    try {
                        M1168e = c0215fn2.m1168e(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        ss0Var.mo1737f(6, e);
                        M1168e = 0;
                    } catch (IOException e2) {
                        ss0Var.mo1737f(7, e2);
                        M1168e = 0;
                    }
                    try {
                        if (M1168e != 0) {
                            try {
                                try {
                                } catch (IOException e3) {
                                    ss0Var.mo1737f(7, e3);
                                    try {
                                        M1168e.close();
                                    } catch (IOException e4) {
                                        ss0Var.mo1737f(7, e4);
                                    }
                                    c0732snArrM3455N = null;
                                    c0215fn2.f1777h = c0732snArrM3455N;
                                    c0732snArr = (C0732sn[]) c0215fn2.f1777h;
                                    if (c0732snArr != null) {
                                    }
                                    ss0 ss0Var2 = (ss0) c0215fn2.f1772c;
                                    c0732snArr2 = (C0732sn[]) c0215fn2.f1777h;
                                    byte[] bArr4 = (byte[]) c0215fn2.f1773d;
                                    ?? r76 = M1168e;
                                    r76 = M1168e;
                                    if (c0732snArr2 != null) {
                                    }
                                    bArr = (byte[]) c0215fn2.f1774e;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                                }
                            } catch (IllegalStateException e5) {
                                ss0Var.mo1737f(8, e5);
                                M1168e.close();
                                c0732snArrM3455N = null;
                                c0215fn2.f1777h = c0732snArrM3455N;
                                c0732snArr = (C0732sn[]) c0215fn2.f1777h;
                                if (c0732snArr != null) {
                                }
                                ss0 ss0Var22 = (ss0) c0215fn2.f1772c;
                                c0732snArr2 = (C0732sn[]) c0215fn2.f1777h;
                                byte[] bArr42 = (byte[]) c0215fn2.f1773d;
                                ?? r762 = M1168e;
                                r762 = M1168e;
                                if (c0732snArr2 != null) {
                                }
                                bArr = (byte[]) c0215fn2.f1774e;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                r75 = r72;
                                xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                            }
                            if (!Arrays.equals(bArr2, AbstractC0307i4.m1550z(M1168e, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0732snArrM3455N = rd0.m3455N(M1168e, AbstractC0307i4.m1550z(M1168e, 4), (String) c0215fn2.f1776g);
                            try {
                                M1168e.close();
                            } catch (IOException e6) {
                                ss0Var.mo1737f(7, e6);
                            }
                            c0215fn2.f1777h = c0732snArrM3455N;
                        }
                        c0732snArr = (C0732sn[]) c0215fn2.f1777h;
                        if (c0732snArr != null && (M1168e = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                M1168e = "dexopt/baseline.profm";
                                fileInputStreamM1168e = c0215fn2.m1168e(assets, "dexopt/baseline.profm");
                                r74 = M1168e;
                            } catch (FileNotFoundException e7) {
                                ss0Var.mo1737f(9, e7);
                                r74 = M1168e;
                                c0215fn = null;
                                M1168e = r74;
                            } catch (IOException e8) {
                                ss0Var.mo1737f(7, e8);
                                r74 = M1168e;
                                c0215fn = null;
                                M1168e = r74;
                            } catch (IllegalStateException e9) {
                                c0215fn2.f1777h = null;
                                ss0Var.mo1737f(8, e9);
                                r74 = M1168e;
                                c0215fn = null;
                                M1168e = r74;
                            }
                            if (fileInputStreamM1168e == null) {
                                try {
                                    if (!Arrays.equals(rd0.f5374m, AbstractC0307i4.m1550z(fileInputStreamM1168e, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM1550z = AbstractC0307i4.m1550z(fileInputStreamM1168e, 4);
                                    c0215fn2.f1777h = rd0.m3452K(fileInputStreamM1168e, bArrM1550z, bArr3, c0732snArr);
                                    fileInputStreamM1168e.close();
                                    c0215fn = c0215fn2;
                                    M1168e = bArrM1550z;
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM1168e != null) {
                                    fileInputStreamM1168e.close();
                                    r74 = M1168e;
                                }
                                c0215fn = null;
                                M1168e = r74;
                            }
                            if (c0215fn != null) {
                                c0215fn2 = c0215fn;
                            }
                        }
                        ss0 ss0Var222 = (ss0) c0215fn2.f1772c;
                        c0732snArr2 = (C0732sn[]) c0215fn2.f1777h;
                        byte[] bArr422 = (byte[]) c0215fn2.f1773d;
                        ?? r7622 = M1168e;
                        r7622 = M1168e;
                        if (c0732snArr2 != null && bArr422 != null) {
                            byteArrayOutputStream = c0215fn2.f1770a;
                            if (byteArrayOutputStream != 0) {
                                C0921xc.m5134o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr422);
                                } finally {
                                }
                            } catch (IOException e10) {
                                ss0Var222.mo1737f(7, e10);
                                r73 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                ss0Var222.mo1737f(8, e11);
                                r73 = byteArrayOutputStream;
                            }
                            if (rd0.m3463V(byteArrayOutputStream, bArr422, c0732snArr2)) {
                                c0215fn2.f1774e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                c0215fn2.f1777h = null;
                                r7622 = r73;
                            } else {
                                ss0Var222.mo1737f(5, null);
                                c0215fn2.f1777h = null;
                                byteArrayOutputStream.close();
                                r7622 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) c0215fn2.f1774e;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!c0215fn2.f1770a) {
                                    C0921xc.m5134o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) c0215fn2.f1775f);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i = byteArrayInputStream.read(bArr5);
                                                                                    if (i <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i);
                                                                                    }
                                                                                }
                                                                                r72 = 1;
                                                                                c0215fn2.m1169f(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0215fn2.f1774e = null;
                                                                                c0215fn2.f1777h = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th9) {
                                                                        th2.addSuppressed(th9);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        c0215fn2.m1169f(6, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e13) {
                                        e = e13;
                                        c0215fn2.m1169f(7, e);
                                        r7 = r7622;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7622 = 1;
                                    c0215fn2.m1169f(6, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e15) {
                                    e = e15;
                                    r7622 = 1;
                                    c0215fn2.m1169f(7, e);
                                    r7 = r7622;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    xs0.m5151c(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                c0215fn2.f1774e = null;
                                c0215fn2.f1777h = null;
                            }
                        }
                        if (z3) {
                            m2981Q(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c0215fn2.m1169f(4, null);
                        }
                        c0215fn2.f1770a = true;
                        M1168e = c0215fn2.m1168e(assets, "dexopt/baseline.prof");
                        if (M1168e != 0) {
                        }
                        c0732snArr = (C0732sn[]) c0215fn2.f1777h;
                        if (c0732snArr != null) {
                            M1168e = "dexopt/baseline.profm";
                            fileInputStreamM1168e = c0215fn2.m1168e(assets, "dexopt/baseline.profm");
                            r74 = M1168e;
                            if (fileInputStreamM1168e == null) {
                            }
                            if (c0215fn != null) {
                            }
                        }
                        ss0 ss0Var2222 = (ss0) c0215fn2.f1772c;
                        c0732snArr2 = (C0732sn[]) c0215fn2.f1777h;
                        byte[] bArr4222 = (byte[]) c0215fn2.f1773d;
                        ?? r76222 = M1168e;
                        r76222 = M1168e;
                        if (c0732snArr2 != null) {
                            byteArrayOutputStream = c0215fn2.f1770a;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr = (byte[]) c0215fn2.f1774e;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        c0215fn2.m1169f(4, null);
                    }
                }
                xs0.m5151c(context, (z4 || !z) ? 0 : r75);
            }
            c0215fn2.m1169f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            xs0.m5151c(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e16) {
            ss0Var.mo1737f(7, e16);
            xs0.m5151c(context, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m2991a(float f, float f2, float f3, float f4, AbstractC0549of abstractC0549of) {
        int i;
        int i2;
        int i3;
        float fMo254b;
        float fMo253a;
        int i4;
        int i5;
        int i6;
        int i7;
        float fMo254b2;
        float fMo253a2;
        int i8;
        int i9;
        int i10;
        float f5;
        if (abstractC0549of.mo2741c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i13 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = C0207ff.f1708h;
            return j;
        }
        if (((int) (abstractC0549of.f4545b >> 32)) != 3) {
            v10.m4364a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = abstractC0549of.f4546c;
        if (i15 == -1) {
            v10.m4364a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo254b3 = abstractC0549of.mo254b(0);
        float fMo253a3 = abstractC0549of.mo253a(0);
        if (f >= fMo254b3) {
            fMo254b3 = f;
        }
        if (fMo254b3 <= fMo253a3) {
            fMo253a3 = fMo254b3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo253a3);
        int i16 = iFloatToRawIntBits >>> 31;
        int i17 = (iFloatToRawIntBits >>> 23) & 255;
        int i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    fMo254b = abstractC0549of.mo254b(1);
                    fMo253a = abstractC0549of.mo253a(1);
                    if (f2 >= fMo254b) {
                        fMo254b = f2;
                    }
                    if (fMo254b <= fMo253a) {
                        fMo253a = fMo254b;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo253a);
                    int i20 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i21 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                fMo254b2 = abstractC0549of.mo254b(2);
                                fMo253a2 = abstractC0549of.mo253a(2);
                                if (f3 >= fMo254b2) {
                                    fMo254b2 = f3;
                                }
                                if (fMo254b2 <= fMo253a2) {
                                    fMo253a2 = fMo254b2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo253a2);
                                int i23 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i27 = C0207ff.f1708h;
                                            return j2;
                                        }
                                        i9 = i26;
                                        i = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i272 = C0207ff.f1708h;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fMo254b2 = abstractC0549of.mo254b(2);
                    fMo253a2 = abstractC0549of.mo253a(2);
                    if (f3 >= fMo254b2) {
                    }
                    if (fMo254b2 <= fMo253a2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo253a2);
                    int i232 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2722 = C0207ff.f1708h;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        fMo254b = abstractC0549of.mo254b(1);
        fMo253a = abstractC0549of.mo253a(1);
        if (f2 >= fMo254b) {
        }
        if (fMo254b <= fMo253a) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo253a);
        int i202 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i212 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fMo254b2 = abstractC0549of.mo254b(2);
        fMo253a2 = abstractC0549of.mo253a(2);
        if (f3 >= fMo254b2) {
        }
        if (fMo254b2 <= fMo253a2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo253a2);
        int i2322 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j2222 = (((long) i15) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i27222 = C0207ff.f1708h;
        return j2222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m2992b(int i) {
        long j = ((long) i) << 32;
        int i2 = C0207ff.f1708h;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m2993c(long j) {
        long j2 = j << 32;
        int i = C0207ff.f1708h;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static long m2994d(int i, int i2, int i3) {
        return m2992b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C0286hk m2995e(InterfaceC0618pk interfaceC0618pk) {
        if (interfaceC0618pk.mo64l(C0496n2.f4129I) == null) {
            interfaceC0618pk = interfaceC0618pk.mo63h(new e40(null));
        }
        return new C0286hk(interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final long m2996f(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : w60.m4908o(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m2997g(int i, sh0 sh0Var) {
        int i2 = sh0Var.f5770f - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = sh0Var.f5768d;
            int i5 = ((k30) objArr[i4]).f3000a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((k30) objArr[i3]).f3000a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float m2998h(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m2999i(s71 s71Var) {
        er0 er0Var;
        hr0 hr0Var = s71Var.f5671c;
        C0066bs c0066bs = (hr0Var == null || (er0Var = hr0Var.f2353a) == null) ? null : new C0066bs(er0Var.f1522b);
        boolean z = false;
        if (c0066bs != null && c0066bs.f563a == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m3000j(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m3001k(C0156e1 c0156e1, xz0 xz0Var) {
        sz0 sz0Var = xz0Var.f7471d;
        jh0 jh0Var = sz0Var.f5877d;
        Object objM1701g = sz0Var.f5877d.m1701g(b01.f345x);
        if (objM1701g == null) {
            objM1701g = null;
        }
        xv0 xv0Var = (xv0) objM1701g;
        if (rd0.m3478g(xz0Var)) {
            if (xv0Var != null && xv0Var.f7427a == 8) {
                return;
            }
            Object objM1701g2 = jh0Var.m1701g(rz0.f5611x);
            if (objM1701g2 == null) {
                objM1701g2 = null;
            }
            C0533o0 c0533o0 = (C0533o0) objM1701g2;
            if (c0533o0 != null) {
                c0156e1.m764a(new C0002a1(null, R.id.accessibilityActionPageUp, c0533o0.f4377a, null));
            }
            Object objM1701g3 = jh0Var.m1701g(rz0.f5613z);
            if (objM1701g3 == null) {
                objM1701g3 = null;
            }
            C0533o0 c0533o02 = (C0533o0) objM1701g3;
            if (c0533o02 != null) {
                c0156e1.m764a(new C0002a1(null, R.id.accessibilityActionPageDown, c0533o02.f4377a, null));
            }
            Object objM1701g4 = jh0Var.m1701g(rz0.f5612y);
            if (objM1701g4 == null) {
                objM1701g4 = null;
            }
            C0533o0 c0533o03 = (C0533o0) objM1701g4;
            if (c0533o03 != null) {
                c0156e1.m764a(new C0002a1(null, R.id.accessibilityActionPageLeft, c0533o03.f4377a, null));
            }
            Object objM1701g5 = jh0Var.m1701g(rz0.f5586A);
            if (objM1701g5 == null) {
                objM1701g5 = null;
            }
            C0533o0 c0533o04 = (C0533o0) objM1701g5;
            if (c0533o04 != null) {
                c0156e1.m764a(new C0002a1(null, R.id.accessibilityActionPageRight, c0533o04.f4377a, null));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m3002l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final boolean m3003m(c41 c41Var, int i, AbstractC0112d0 abstractC0112d0, boolean z) {
        boolean z2;
        synchronized (f4745l) {
            try {
                int i2 = c41Var.f690d;
                if (i2 == i) {
                    c41Var.f689c = abstractC0112d0;
                    z2 = true;
                    if (z) {
                        c41Var.f691e++;
                    }
                    c41Var.f690d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3004n(r51 r51Var, jr0 jr0Var, AbstractC0955y9 abstractC0955y9) {
        C0150dw c0150dw;
        EnumC1007zk enumC1007zk;
        int size;
        int i;
        if (abstractC0955y9 instanceof C0150dw) {
            c0150dw = (C0150dw) abstractC0955y9;
            int i2 = c0150dw.f1202j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0150dw.f1202j = i2 - Integer.MIN_VALUE;
            } else {
                c0150dw = new C0150dw(abstractC0955y9);
            }
        }
        Object objM3387a = c0150dw.f1201i;
        int i3 = c0150dw.f1202j;
        if (i3 == 0) {
            w60.m4891M(objM3387a);
            List list = r51Var.f5302i.f5650v.f2610a;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((nr0) list.get(i4)).f4308d) {
                    c0150dw.f1199g = r51Var;
                    c0150dw.f1200h = jr0Var;
                    c0150dw.f1202j = 1;
                    objM3387a = r51Var.m3387a(jr0Var, c0150dw);
                    enumC1007zk = EnumC1007zk.f7916d;
                    if (objM3387a == enumC1007zk) {
                    }
                    List list2 = ((ir0) objM3387a).f2610a;
                    size = list2.size();
                    i = 0;
                    while (i < size) {
                    }
                    return na1.f4229a;
                }
            }
            return na1.f4229a;
        }
        if (i3 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jr0 jr0Var2 = c0150dw.f1200h;
        r51 r51Var2 = c0150dw.f1199g;
        w60.m4891M(objM3387a);
        jr0Var = jr0Var2;
        r51Var = r51Var2;
        List list22 = ((ir0) objM3387a).f2610a;
        size = list22.size();
        i = 0;
        while (i < size) {
            if (((nr0) list22.get(i)).f4308d) {
                c0150dw.f1199g = r51Var;
                c0150dw.f1200h = jr0Var;
                c0150dw.f1202j = 1;
                objM3387a = r51Var.m3387a(jr0Var, c0150dw);
                enumC1007zk = EnumC1007zk.f7916d;
                if (objM3387a == enumC1007zk) {
                    return enumC1007zk;
                }
                List list222 = ((ir0) objM3387a).f2610a;
                size = list222.size();
                i = 0;
                while (i < size) {
                }
            } else {
                i++;
            }
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final Object m3005o(rr0 rr0Var, InterfaceC0904ww interfaceC0904ww, InterfaceC0322ik interfaceC0322ik) {
        EnumC1007zk enumC1007zk;
        na1 na1Var;
        C0187ew c0187ew = new C0187ew(interfaceC0322ik.mo540e(), interfaceC0904ww, null, 0);
        s51 s51Var = (s51) rr0Var;
        s51Var.getClass();
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(interfaceC0322ik));
        c0884wc.m4992v();
        r51 r51Var = new r51(s51Var, c0884wc);
        synchronized (s51Var.f5652x) {
            s51Var.f5651w.m4072b(r51Var);
            InterfaceC0322ik interfaceC0322ikM3497z = rd0.m3497z(rd0.m3484m(r51Var, r51Var, c0187ew));
            enumC1007zk = EnumC1007zk.f7916d;
            pw0 pw0Var = new pw0(interfaceC0322ikM3497z);
            na1Var = na1.f4229a;
            pw0Var.mo541i(na1Var);
        }
        c0884wc.m4994y(new C0711s2(23, r51Var));
        Object objM4990t = c0884wc.m4990t();
        return objM4990t == enumC1007zk ? objM4990t : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x0092) to fix multi-entry loop: BACK_EDGE: B:35:0x0092 -> B:27:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [et0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [u2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: p */
    public static final List m3006p(z11 z11Var, Integer num, int i, Integer num2) {
        int iM5371E;
        int iM5405s;
        dh0 dh0Var;
        if (z11Var.f7773w || z11Var.m5402p() == 0) {
            return C0294hs.f2354d;
        }
        ?? et0Var = new et0(z11Var);
        if (num2 != null) {
            iM5371E = num2.intValue();
        } else {
            iM5371E = z11Var.f7772v;
            if (iM5371E < 0) {
                iM5371E = z11Var.m5371E(z11Var.f7752b, i);
            }
        }
        if (num == 0) {
            int iM5380N = z11Var.f7759i - z11Var.m5380N(z11Var.f7752b, z11Var.m5404r(i));
            ug0 ug0Var = z11Var.f7769s;
            num = Integer.valueOf(iM5380N + ((ug0Var == null || (dh0Var = (dh0) ug0Var.m4248b(i)) == null) ? 0 : dh0Var.f1109b));
        }
        int iM5404r = z11Var.m5404r(i) * 5;
        int[] iArr = z11Var.f7752b;
        if (iM5404r < iArr.length) {
            iM5405s = z11Var.m5405s(i);
        } else {
            int iM5371E2 = iM5371E >= 0 ? z11Var.m5371E(iArr, iM5371E) : iM5371E;
            iM5405s = z11Var.m5405s(iM5371E);
            int i2 = iM5371E;
            iM5371E = iM5371E2;
            i = i2;
        }
        while (i >= 0) {
            et0Var.m968c(iM5405s, (z11Var.f7752b[(z11Var.m5404r(i) * 5) + 1] & 536870912) != 0 ? z11Var.m5406t(i) : C0320ii.f2572a, z11Var.m5381O(i), num);
            num = z11Var.m5389b(i);
            if (iM5371E >= 0) {
                int iM5371E3 = z11Var.m5371E(z11Var.f7752b, iM5371E);
                iM5405s = z11Var.m5405s(iM5371E);
                int i3 = iM5371E;
                iM5371E = iM5371E3;
                i = i3;
            } else {
                i = iM5371E;
            }
        }
        return et0Var.f1526a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m3007q(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new z20(2, 36, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static int m3008r(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static int m3009s(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final int m3010t(long j, long j2) {
        boolean zM2977M = m2977M(j);
        if (zM2977M != m2977M(j2)) {
            return zM2977M ? -1 : 1;
        }
        return (Math.min(m2965A(j), m2965A(j2)) >= 0.0f && m2976L(j) != m2976L(j2)) ? m2976L(j) ? -1 : 1 : (int) Math.signum(m2965A(j) - m2965A(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3011u(long j, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long jM1092a = C0207ff.m1092a(j, C0207ff.m1097f(j2));
        float fM1095d = C0207ff.m1095d(j2);
        float fM1095d2 = C0207ff.m1095d(jM1092a);
        float f = 1.0f - fM1095d2;
        float f2 = (fM1095d * f) + fM1095d2;
        float fM1099h = f2 == 0.0f ? 0.0f : (((C0207ff.m1099h(j2) * fM1095d) * f) + (C0207ff.m1099h(jM1092a) * fM1095d2)) / f2;
        float fM1098g = f2 == 0.0f ? 0.0f : (((C0207ff.m1098g(j2) * fM1095d) * f) + (C0207ff.m1098g(jM1092a) * fM1095d2)) / f2;
        float fM1096e = f2 == 0.0f ? 0.0f : (((C0207ff.m1096e(j2) * fM1095d) * f) + (C0207ff.m1096e(jM1092a) * fM1095d2)) / f2;
        AbstractC0549of abstractC0549ofM1097f = C0207ff.m1097f(j2);
        if (abstractC0549ofM1097f.mo2741c()) {
            return ((long) (((int) ((fM1096e * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((fM1099h * 255.0f) + 0.5f)) << 16)) | (((int) ((fM1098g * 255.0f) + 0.5f)) << 8)))) << 32;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fM1099h);
        int i10 = iFloatToRawIntBits >>> 31;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        int i12 = iFloatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i15 = i12 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i15) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fM1098g);
                    int i16 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i17 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i17 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i18 = i17 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i18) + 1) | (i16 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fM1096e);
                                int i19 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i20 = 8388607 & iFloatToRawIntBits3;
                                if (i8 != 255) {
                                    int i21 = i8 - 112;
                                    if (i21 < 31) {
                                        if (i21 > 0) {
                                            i14 = i20 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i21 << 10) | i14) + 1) | (i19 << 15);
                                            } else {
                                                i13 = i21;
                                            }
                                        } else if (i21 >= -10) {
                                            int i22 = (i20 | 8388608) >> (1 - i21);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i13 = 0;
                                            i14 = i22 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                    return ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0549ofM1097f.f4546c) & 63);
                                }
                                i13 = 31;
                                i14 = i20 == 0 ? 0 : 512;
                                i9 = (i19 << 15) | (i13 << 10) | i14;
                                return ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0549ofM1097f.f4546c) & 63);
                            }
                            i6 = i18;
                        } else if (i5 >= -10) {
                            int i23 = (i17 | 8388608) >> (1 - i5);
                            if ((i23 & 4096) != 0) {
                                i23 += 8192;
                            }
                            i6 = i23 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i16 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fM1096e);
                    int i192 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i202 = 8388607 & iFloatToRawIntBits32;
                    if (i8 != 255) {
                    }
                    i9 = (i192 << 15) | (i13 << 10) | i14;
                    return ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0549ofM1097f.f4546c) & 63);
                }
                i2 = i15;
            } else if (i >= -10) {
                int i24 = (i12 | 8388608) >> (1 - i);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i2 = i24 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fM1098g);
        int i162 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i172 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i162 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fM1096e);
        int i1922 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2022 = 8388607 & iFloatToRawIntBits322;
        if (i8 != 255) {
        }
        i9 = (i1922 << 15) | (i13 << 10) | i14;
        return ((((long) ((short) i9)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC0549ofM1097f.f4546c) & 63);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final long m3012v(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final Object m3013w(InterfaceC0904ww interfaceC0904ww, InterfaceC0322ik interfaceC0322ik) {
        gy0 gy0Var = new gy0(interfaceC0322ik, interfaceC0322ik.mo540e());
        return g60.m1220s(gy0Var, gy0Var, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final long m3014x(long j) {
        long j2 = (j << 1) + 1;
        AbstractC0935xq.f7397d.getClass();
        int i = AbstractC0972yq.f7686a;
        return j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final boolean m3015y(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final Integer m3016z(v11 v11Var, AbstractC0727si abstractC0727si, int i, int i2) {
        Integer numM3016z;
        int[] iArr = v11Var.f6375b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (v11Var.m4374j(i) && v11Var.m4373i(i) == 206 && m3002l(v11Var.m4380p(iArr, i), AbstractC0653qi.f5155e)) {
                Object objM4372h = v11Var.m4372h(i, 0);
                ku0 ku0Var = objM4372h instanceof ku0 ? (ku0) objM4372h : null;
                ju0 ju0Var = ku0Var != null ? ku0Var.f3270a : null;
                C0475mi c0475mi = ju0Var instanceof C0475mi ? (C0475mi) ju0Var : null;
                if (c0475mi != null && c0475mi.f3983d == abstractC0727si) {
                    return Integer.valueOf(i);
                }
            }
            if (v11Var.m4368d(i) && (numM3016z = m3016z(v11Var, abstractC0727si, i + 1, i3)) != null) {
                return Integer.valueOf(numM3016z.intValue());
            }
            i = i3;
        }
    }
}
