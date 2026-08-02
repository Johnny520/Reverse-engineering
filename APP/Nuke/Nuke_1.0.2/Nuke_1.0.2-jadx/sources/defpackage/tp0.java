package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.dokar.quickjs.QuickJsException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tp0 {
    public static final uf a;
    public static final z8 d;
    public static final hh1 i;
    public static final hh1 j;
    public static final uf b = new uf(2);
    public static final vf c = new vf();
    public static final kw e = new kw(-611870119, false, new ow(12));
    public static final kw f = new kw(1156832798, false, new ow(13));
    public static final kw g = new kw(-1379454417, false, new ye(20));
    public static final kw h = new kw(-99996876, false, new ye(21));
    public static final y41 k = y41.h;
    public static final oa2 l = new oa2();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static final Object q = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 3;
        a = new uf(i2);
        d = new z8(i2);
        int i3 = 19;
        i = new hh1(i3, "REMOVED_TASK");
        j = new hh1(i3, "CLOSED_EMPTY");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vo2 B(mn0 mn0Var) {
        vo2 vo2Var = new vo2();
        vo2Var.j = gf1.p(vo2Var, vo2Var, mn0Var);
        return vo2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x002a */
    public static void C(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long D(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long E(o12 o12Var, boolean z) {
        long jD = rs1.d(o12Var.c, o12Var.g);
        if (z || !o12Var.b()) {
            return jD;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final View H(t60 t60Var) {
        if (!((th1) t60Var).h.u) {
            kz0.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) u61.a(sp0.c0(t60Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void I(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long J(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object K(pl0 pl0Var, int i2, in0 in0Var) {
        int i3;
        int i4;
        Object objJ;
        th1 th1VarM;
        t71 t71VarQ0;
        int size;
        int i5;
        vn1 vn1Var;
        if (!pl0Var.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var = pl0Var.h.l;
        r61 r61VarC0 = sp0.c0(pl0Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objJ = null;
            if (r61VarC0 == null) {
                th1VarM = null;
                break;
            }
            if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                while (th1Var != null) {
                    if ((th1Var.j & 1024) != 0) {
                        th1VarM = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof pl0) {
                                break loop0;
                            }
                            if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i6 = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var.b(th1Var2);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    th1Var = th1Var.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
        pl0 pl0Var2 = (pl0) th1VarM;
        if ((pl0Var2 == null || !t11.l(pl0Var2.Q0(), pl0Var.Q0())) && (t71VarQ0 = pl0Var.Q0()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                s.l("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (t71VarQ0.v.a.g().n <= 0 || t71VarQ0.v.a.g().k.isEmpty() || !t71VarQ0.u) {
                return in0Var.j(t71.y);
            }
            boolean zN0 = t71VarQ0.N0(i7);
            r81 r81Var = t71VarQ0.v;
            int iMin = zN0 ? Math.min(r81Var.a.g().n - 1, ((y81) du.v0(r81Var.a.g().k)).a) : Math.max(0, ((kx1) r81Var.a.e.b).g());
            o72 o72Var = new o72();
            lm lmVar = t71VarQ0.w;
            lmVar.getClass();
            p71 p71Var = new p71(iMin, iMin);
            lmVar.a.b(p71Var);
            o72Var.i = p71Var;
            d91 d91Var = t71VarQ0.v.a;
            if (d91Var.g().k.isEmpty()) {
                i4 = 0;
            } else {
                x81 x81VarG = d91Var.g();
                int iG = (int) (x81VarG.o == qv1.h ? x81VarG.g() & 4294967295L : x81VarG.g() >> 32);
                x81 x81VarG2 = d91Var.g();
                List list = x81VarG2.k;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size2; i9++) {
                        i8 += ((y81) list.get(i9)).k;
                    }
                    size = (i8 / list.size()) + x81VarG2.q;
                }
                if (size != 0 && (i5 = iG / size) >= 1) {
                    i4 = i5;
                }
            }
            int i10 = i4 * 2;
            int i11 = t71VarQ0.v.a.g().n;
            if (i10 > i11) {
                i10 = i11;
            }
            while (objJ == null && t71VarQ0.M0((p71) o72Var.i, i7) && i3 < i10) {
                p71 p71Var2 = (p71) o72Var.i;
                int i12 = p71Var2.a;
                int i13 = p71Var2.b;
                if (t71VarQ0.N0(i7)) {
                    i13++;
                } else {
                    i12--;
                }
                lm lmVar2 = t71VarQ0.w;
                lmVar2.getClass();
                p71 p71Var3 = new p71(i12, i13);
                lmVar2.a.b(p71Var3);
                t71VarQ0.w.a.j((p71) o72Var.i);
                o72Var.i = p71Var3;
                i3++;
                sp0.c0(t71VarQ0).k();
                objJ = in0Var.j(new s71(t71VarQ0, o72Var, i7));
            }
            t71VarQ0.w.a.j((p71) o72Var.i);
            sp0.c0(t71VarQ0).k();
            return objJ;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void L(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            g4.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            g4.g(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            N(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            N(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            N(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        N(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void M(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            td0.a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void N(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String O(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                sb.append("\\\\");
            }
        }
        return qv2.S("\n            import * as entryModule from \"./" + sb.toString() + "\";\n            globalThis.__nukeScript = entryModule;\n            if (typeof entryModule.activate === \"function\") {\n    await entryModule.activate();\n}\n        ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P(Throwable th, t00 t00Var) {
        s51 s51Var;
        if (t00Var instanceof s51) {
            s51Var = (s51) t00Var;
            int i2 = s51Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s51Var.l = i2 - Integer.MIN_VALUE;
            } else {
                s51Var = new s51(t00Var);
            }
        }
        Object obj = s51Var.k;
        int i3 = s51Var.l;
        if (i3 != 0) {
            if (i3 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                fg1.T(obj);
                s.b();
                return;
            }
        }
        fg1.T(obj);
        s51Var.l = 1;
        c60 c60Var = o90.a;
        a20 a20Var = s51Var.i;
        a20Var.getClass();
        c60Var.D(a20Var, new yp0(s51Var, th));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Q(long j2) {
        return s(j2, 12884901888L) ? "Rgb" : s(j2, 12884901889L) ? "Xyz" : s(j2, 12884901890L) ? "Lab" : s(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void R(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(String str, Throwable th) {
        if (k.ordinal() <= 2) {
            Log.w("KavaRef", String.valueOf(str), th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(List list, List list2, c73 c73Var, boolean z, boolean z2, in0 in0Var, mn0 mn0Var, in0 in0Var2, px pxVar, int i2) {
        List list3;
        List list4;
        List listT0;
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-344226455);
        int i4 = i2 | 18 | (go0Var.h(c73Var) ? 256 : 128) | (go0Var.g(z) ? 2048 : 1024) | (go0Var.g(z2) ? 16384 : 8192) | (go0Var.h(in0Var) ? 131072 : 65536) | (go0Var.h(mn0Var) ? 1048576 : 524288) | (go0Var.h(in0Var2) ? 8388608 : 4194304);
        if (go0Var.O(i4 & 1, (4793491 & i4) != 4793490)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                list = mg.t0(rg3.j);
                listT0 = mg.t0(rg3.i);
                i3 = i4 & (-127);
            } else {
                go0Var.R();
                i3 = i4 & (-127);
                listT0 = list2;
            }
            go0Var.q();
            boolean zF = go0Var.f(c73Var.d) | ((((i3 & 7168) ^ 3072) > 2048 && go0Var.g(z)) || (i3 & 3072) == 2048);
            Object objL = go0Var.L();
            if (zF || objL == nx.a) {
                objL = p7.L(c73Var.d, z);
                go0Var.f0(objL);
            }
            list3 = list;
            ur1.a((lp1) objL, c73Var.c, xe1.i0(-928954866, new pt0(list3, mn0Var, listT0, z2, in0Var, c73Var, z, in0Var2), go0Var), go0Var, 384);
            list4 = listT0;
        } else {
            go0Var.R();
            list3 = list;
            list4 = list2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new pt0(list3, list4, c73Var, z, z2, in0Var, mn0Var, in0Var2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final in0 in0Var, uh1 uh1Var, String str2, mn0 mn0Var, mn0 mn0Var2, boolean z, int i2, int i3, boolean z2, boolean z3, wb3 wb3Var, m51 m51Var, k51 k51Var, px pxVar, final int i4, final int i5, final int i6) {
        uh1 uh1Var2;
        int i7;
        int i8;
        int i9;
        mn0 mn0Var3;
        int i10;
        mn0 mn0Var4;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final String str3;
        final boolean z5;
        final wb3 wb3Var2;
        final k51 k51Var2;
        final mn0 mn0Var5;
        final boolean z6;
        final uh1 uh1Var3;
        final boolean z7;
        final m51 m51Var2;
        final int i26;
        final mn0 mn0Var6;
        final int i27;
        b62 b62VarR;
        int i28;
        final String str4;
        final boolean z8;
        final boolean z9;
        final wb3 wb3Var3;
        final m51 m51Var3;
        final k51 k51Var3;
        final uh1 uh1Var4;
        int i29;
        int i30;
        int i31;
        gd0 gd0Var;
        float f2;
        boolean zE;
        Object objL;
        str.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1819820874);
        int i32 = (go0Var.f(str) ? 4 : 2) | i4;
        if ((i4 & 48) == 0) {
            i32 |= go0Var.h(in0Var) ? 32 : 16;
        }
        int i33 = i6 & 4;
        if (i33 != 0) {
            i32 |= 384;
        } else {
            if ((i4 & 384) == 0) {
                uh1Var2 = uh1Var;
                i32 |= go0Var.f(uh1Var2) ? 256 : 128;
            }
            i7 = i6 & 8;
            if (i7 == 0) {
                i8 = i32 | 3072;
            } else {
                i8 = i32 | (go0Var.f(str2) ? 2048 : 1024);
            }
            i9 = i6 & 16;
            if (i9 != 0) {
                if ((i4 & 24576) == 0) {
                    mn0Var3 = mn0Var;
                    i8 |= go0Var.h(mn0Var3) ? 16384 : 8192;
                }
                i10 = i6 & 32;
                if (i10 != 0) {
                    i8 |= 196608;
                    mn0Var4 = mn0Var2;
                } else {
                    mn0Var4 = mn0Var2;
                    if ((i4 & 196608) == 0) {
                        i8 |= go0Var.h(mn0Var4) ? 131072 : 65536;
                    }
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i8 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 1572864) == 0) {
                        i8 |= go0Var.g(z4) ? 1048576 : 524288;
                    }
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i8 |= 12582912;
                    i13 = i2;
                } else {
                    i13 = i2;
                    if ((i4 & 12582912) == 0) {
                        i8 |= go0Var.d(i13) ? 8388608 : 4194304;
                    }
                }
                if ((i4 & 100663296) == 0) {
                    i8 |= ((i6 & 256) == 0 && go0Var.d(i3)) ? 67108864 : 33554432;
                }
                i14 = i6 & AIChatConfig.DefaultMaxTokens;
                if (i14 != 0) {
                    i16 = i8 | 805306368;
                    i15 = i14;
                } else {
                    i15 = i14;
                    i16 = i8 | (go0Var.g(z2) ? 536870912 : 268435456);
                }
                i17 = i6 & 1024;
                if (i17 != 0) {
                    i19 = i5 | 6;
                    i18 = i17;
                } else if ((i5 & 6) == 0) {
                    i18 = i17;
                    i19 = i5 | (go0Var.g(z3) ? 4 : 2);
                } else {
                    i18 = i17;
                    i19 = i5;
                }
                i20 = i6 & 2048;
                if (i20 != 0) {
                    i22 = i19 | 48;
                    i21 = i20;
                } else {
                    i21 = i20;
                    i22 = i19 | (go0Var.f(wb3Var) ? 32 : 16);
                }
                int i34 = i22;
                i23 = i16;
                i24 = i6 & 4096;
                if (i24 != 0) {
                    i25 = i34 | 384;
                } else {
                    int i35 = i34;
                    if ((i5 & 384) == 0) {
                        i35 |= go0Var.f(m51Var) ? 256 : 128;
                    }
                    i25 = i35;
                }
                if (go0Var.O(i23 & 1, ((i23 & 306783379) == 306783378 && ((i25 | 3072) & 1171) == 1170) ? false : true)) {
                    go0Var.T();
                    if ((i4 & 1) == 0 || go0Var.y()) {
                        uh1 uh1Var5 = i33 != 0 ? rh1.a : uh1Var2;
                        String str5 = i7 != 0 ? "" : str2;
                        if (i9 != 0) {
                            mn0Var3 = null;
                        }
                        if (i10 != 0) {
                            mn0Var4 = null;
                        }
                        if (i11 != 0) {
                            z4 = true;
                        }
                        if (i12 != 0) {
                            i13 = 1;
                        }
                        i28 = (i6 & 256) != 0 ? z4 ? 1 : 5 : i3;
                        str4 = str5;
                        z8 = i15 != 0 ? true : z2;
                        z9 = i18 != 0 ? false : z3;
                        wb3Var3 = i21 != 0 ? gd3.P : wb3Var;
                        m51Var3 = i24 != 0 ? m51.c : m51Var;
                        k51Var3 = k51.a;
                        uh1Var4 = uh1Var5;
                    } else {
                        go0Var.R();
                        str4 = str2;
                        i28 = i3;
                        z8 = z2;
                        z9 = z3;
                        wb3Var3 = wb3Var;
                        m51Var3 = m51Var;
                        k51Var3 = k51Var;
                        uh1Var4 = uh1Var2;
                    }
                    final mn0 mn0Var7 = mn0Var3;
                    final mn0 mn0Var8 = mn0Var4;
                    final boolean z10 = z4;
                    go0Var.q();
                    Object objL2 = go0Var.L();
                    eb ebVar = nx.a;
                    if (objL2 == ebVar) {
                        objL2 = op0.u(Boolean.FALSE);
                        go0Var.f0(objL2);
                    }
                    final xk1 xk1Var = (xk1) objL2;
                    final lp1 lp1Var = (lp1) go0Var.j(ur1.a);
                    final long j2 = lp1Var.g;
                    boolean z11 = str.length() > 0;
                    final ya1 ya1Var = new ya1(va1.b, 17, 0);
                    final gu2 gu2VarA = uc.a(((Boolean) xk1Var.getValue()).booleanValue() ? 13.0f : 11.0f, up0.G(0.5f, 1500.0f, null, 4), "TextFieldCornerRadius", go0Var);
                    final gu2 gu2VarA2 = uc.a((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 2.0f : 0.0f, up0.J(140, null, 6), "TextFieldBorderThickness", go0Var);
                    final boolean z12 = !z10;
                    if (z10) {
                        i29 = 1;
                        i30 = 1;
                    } else {
                        i29 = 1;
                        i30 = i13 < 1 ? 1 : i13;
                    }
                    if (!z10) {
                        i29 = i28 < i30 ? i30 : i28;
                    }
                    final int i36 = i29;
                    final gu2 gu2VarB = uc.b((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 0.996f : 1.0f, up0.G(0.5f, 1500.0f, null, 4), "TextFieldScaleX", go0Var, 3120);
                    final int i37 = i30;
                    final gu2 gu2VarB2 = uc.b((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 1.012f : 1.0f, up0.G(0.75f, 400.0f, null, 4), "TextFieldScaleY", go0Var, 3120);
                    final gu2 gu2VarA3 = uc.a((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 1.0f : 0.0f, up0.G(0.75f, 400.0f, null, 4), "TextFieldContentOffset", go0Var);
                    final gu2 gu2VarB3 = uc.b(z11 ? 0.0f : ((Boolean) xk1Var.getValue()).booleanValue() ? 0.52f : 0.68f, up0.J(160, null, 6), "TextFieldPlaceholderAlpha", go0Var, 3120);
                    if (!z8) {
                        f2 = 0.45f;
                    } else if (((Boolean) xk1Var.getValue()).booleanValue() || z11) {
                        i31 = 6;
                        gd0Var = null;
                        f2 = 1.0f;
                        final gu2 gu2VarB4 = uc.b(f2, up0.J(160, gd0Var, i31), "TextFieldIconAlpha", go0Var, 3120);
                        final gu2 gu2VarA4 = ar2.a((((Boolean) xk1Var.getValue()).booleanValue() || !z8) ? ju.b(0.0f, j2) : j2, up0.J(180, null, 6), "TextFieldBorderColor", go0Var);
                        final gu2 gu2VarA5 = ar2.a(z8 ? ju.b(0.58f, lp1Var.c) : lp1Var.a ? ju.b(0.05f, ju.b) : ju.b(0.35f, ju.b), up0.J(180, null, 6), "TextFieldContainerColor", go0Var);
                        zE = go0Var.e(j2);
                        objL = go0Var.L();
                        if (!zE || objL == ebVar) {
                            objL = new g13(j2, ju.b(0.2f, j2));
                            go0Var.f0(objL);
                        }
                        ci0.a(h13.a.a((g13) objL), xe1.i0(-676351626, new mn0() { // from class: pr1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // defpackage.mn0
                            public final Object g(Object obj, Object obj2) {
                                px pxVar2 = (px) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                go0 go0Var2 = (go0) pxVar2;
                                if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    uh1 uh1VarC = uh1Var4.c(te.e);
                                    Object objL3 = go0Var2.L();
                                    final xk1 xk1Var2 = xk1Var;
                                    eb ebVar2 = nx.a;
                                    if (objL3 == ebVar2) {
                                        objL3 = new pr(xk1Var2, 18);
                                        go0Var2.f0(objL3);
                                    }
                                    uh1 uh1VarF = gf1.F(uh1VarC, (in0) objL3);
                                    final long j3 = j2;
                                    ft2 ft2Var = new ft2(j3);
                                    final boolean z13 = z8;
                                    final lp1 lp1Var2 = lp1Var;
                                    long j4 = z13 ? lp1Var2.e : lp1Var2.f;
                                    long jD = rg3.D(14);
                                    long jD2 = rg3.D(18);
                                    im0 im0Var = im0.k;
                                    w02 w02Var = new w02();
                                    final ya1 ya1Var2 = ya1Var;
                                    m13 m13Var = new m13(j4, jD, im0Var, 0L, 0, jD2, w02Var, ya1Var2, 15073272);
                                    final boolean z14 = z10;
                                    boolean zG = go0Var2.g(z14);
                                    in0 in0Var2 = in0Var;
                                    boolean zF = zG | go0Var2.f(in0Var2);
                                    Object objL4 = go0Var2.L();
                                    if (zF || objL4 == ebVar2) {
                                        objL4 = new ij(in0Var2, z14);
                                        go0Var2.f0(objL4);
                                    }
                                    in0 in0Var3 = (in0) objL4;
                                    final gu2 gu2Var = gu2VarB;
                                    final gu2 gu2Var2 = gu2VarB2;
                                    final boolean z15 = z12;
                                    final gu2 gu2Var3 = gu2VarA;
                                    final gu2 gu2Var4 = gu2VarA5;
                                    final gu2 gu2Var5 = gu2VarA4;
                                    final gu2 gu2Var6 = gu2VarA2;
                                    final gu2 gu2Var7 = gu2VarA3;
                                    final mn0 mn0Var9 = mn0Var7;
                                    final gu2 gu2Var8 = gu2VarB4;
                                    final mn0 mn0Var10 = mn0Var8;
                                    final gu2 gu2Var9 = gu2VarB3;
                                    final String str6 = str4;
                                    ik.a(str, in0Var3, uh1VarF, z13, z9, m13Var, m51Var3, k51Var3, z14, i36, i37, wb3Var3, null, ft2Var, xe1.i0(-181924685, new nn0() { // from class: rr1
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // defpackage.nn0
                                        public final Object e(Object obj3, Object obj4, Object obj5) {
                                            final mn0 mn0Var11 = (mn0) obj3;
                                            px pxVar3 = (px) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            mn0Var11.getClass();
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= ((go0) pxVar3).h(mn0Var11) ? 4 : 2;
                                            }
                                            go0 go0Var3 = (go0) pxVar3;
                                            if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                kr1 kr1Var = new kr1(((za0) gu2Var3.getValue()).h);
                                                yi0 yi0Var = te.e;
                                                boolean z16 = z14;
                                                uh1 uh1VarP = te.P(yi0Var, z16 ? 42.0f : 48.0f, 0.0f, 2);
                                                boolean z17 = z13;
                                                boolean zG2 = go0Var3.g(z17);
                                                gu2 gu2Var10 = gu2Var;
                                                boolean zF2 = zG2 | go0Var3.f(gu2Var10);
                                                gu2 gu2Var11 = gu2Var2;
                                                boolean zF3 = zF2 | go0Var3.f(gu2Var11);
                                                Object objL5 = go0Var3.L();
                                                if (zF3 || objL5 == nx.a) {
                                                    objL5 = new dt0(2, gu2Var10, gu2Var11, z17);
                                                    go0Var3.f0(objL5);
                                                }
                                                uh1 uh1VarL = te.L(uh1VarP, (in0) objL5);
                                                long j5 = ((ju) gu2Var4.getValue()).a;
                                                long j6 = ((ju) gu2Var5.getValue()).a;
                                                float f3 = ((za0) gu2Var6.getValue()).h;
                                                float f4 = z16 ? 9.0f : 11.0f;
                                                jw1 jw1Var = new jw1(12.0f, f4, 12.0f, f4);
                                                final boolean z18 = z15;
                                                rk rkVar = z18 ? sn.j : sn.m;
                                                final gu2 gu2Var12 = gu2Var7;
                                                final mn0 mn0Var12 = mn0Var9;
                                                final gu2 gu2Var13 = gu2Var8;
                                                final mn0 mn0Var13 = mn0Var10;
                                                final gu2 gu2Var14 = gu2Var9;
                                                final long j7 = j3;
                                                final lp1 lp1Var3 = lp1Var2;
                                                final ya1 ya1Var3 = ya1Var2;
                                                final String str7 = str6;
                                                final xk1 xk1Var3 = xk1Var2;
                                                ci0.h(uh1VarL, kr1Var, j5, 0L, 0.0f, j6, f3, jw1Var, rkVar, xe1.i0(-142424540, new nn0() { // from class: sr1
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
                                                    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
                                                    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
                                                    /* JADX WARN: Removed duplicated region for block: B:62:0x025b  */
                                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                     */
                                                    @Override // defpackage.nn0
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final Object e(Object obj6, Object obj7, Object obj8) {
                                                        boolean z19;
                                                        rk rkVar2;
                                                        gu2 gu2Var15;
                                                        eb ebVar3;
                                                        boolean z20;
                                                        eb ebVar4;
                                                        mn0 mn0Var14;
                                                        boolean z21;
                                                        px pxVar4 = (px) obj7;
                                                        int iIntValue3 = ((Integer) obj8).intValue();
                                                        rk rkVar3 = sn.n;
                                                        ((hm) obj6).getClass();
                                                        go0 go0Var4 = (go0) pxVar4;
                                                        if (go0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            uh1 uh1VarT = s11.T(te.e, ((za0) gu2Var12.getValue()).h, 0.0f, 2);
                                                            boolean z22 = z18;
                                                            ob2 ob2VarA = nb2.a(tp0.a, z22 ? sn.s : sn.t, go0Var4, 0);
                                                            int iHashCode = Long.hashCode(go0Var4.T);
                                                            yy1 yy1VarL = go0Var4.l();
                                                            uh1 uh1VarM = tl.M(go0Var4, uh1VarT);
                                                            hx.c.getClass();
                                                            jy jyVar = gx.b;
                                                            go0Var4.Z();
                                                            if (go0Var4.S) {
                                                                go0Var4.k(jyVar);
                                                            } else {
                                                                go0Var4.i0();
                                                            }
                                                            lc lcVar = gx.e;
                                                            yf3.c(go0Var4, lcVar, ob2VarA);
                                                            lc lcVar2 = gx.d;
                                                            yf3.c(go0Var4, lcVar2, yy1VarL);
                                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                                            lc lcVar3 = gx.f;
                                                            yf3.c(go0Var4, lcVar3, numValueOf);
                                                            v6 v6Var = gx.g;
                                                            yf3.b(go0Var4, v6Var);
                                                            lc lcVar4 = gx.c;
                                                            yf3.c(go0Var4, lcVar4, uh1VarM);
                                                            mn0 mn0Var15 = mn0Var12;
                                                            gu2 gu2Var16 = gu2Var13;
                                                            eb ebVar5 = nx.a;
                                                            rh1 rh1Var = rh1.a;
                                                            if (mn0Var15 != null) {
                                                                go0Var4.W(1351451385);
                                                                boolean zF4 = go0Var4.f(gu2Var16);
                                                                z19 = z22;
                                                                Object objL6 = go0Var4.L();
                                                                if (zF4 || objL6 == ebVar5) {
                                                                    objL6 = new hr1(gu2Var16, 3);
                                                                    go0Var4.f0(objL6);
                                                                }
                                                                uh1 uh1VarL2 = te.L(rh1Var, (in0) objL6);
                                                                gu2Var15 = gu2Var16;
                                                                nf1 nf1VarD = dm.d(rkVar3, false);
                                                                rkVar2 = rkVar3;
                                                                int iHashCode2 = Long.hashCode(go0Var4.T);
                                                                yy1 yy1VarL2 = go0Var4.l();
                                                                uh1 uh1VarM2 = tl.M(go0Var4, uh1VarL2);
                                                                go0Var4.Z();
                                                                ebVar3 = ebVar5;
                                                                if (go0Var4.S) {
                                                                    go0Var4.k(jyVar);
                                                                } else {
                                                                    go0Var4.i0();
                                                                }
                                                                yf3.c(go0Var4, lcVar, nf1VarD);
                                                                yf3.c(go0Var4, lcVar2, yy1VarL2);
                                                                vi0.q(iHashCode2, go0Var4, lcVar3, go0Var4, v6Var);
                                                                yf3.c(go0Var4, lcVar4, uh1VarM2);
                                                                mn0Var15.g(go0Var4, 0);
                                                                z20 = true;
                                                                go0Var4.p(true);
                                                                rp0.O(go0Var4, te.q0(rh1Var, 8.0f));
                                                                go0Var4.p(false);
                                                            } else {
                                                                z19 = z22;
                                                                rkVar2 = rkVar3;
                                                                gu2Var15 = gu2Var16;
                                                                ebVar3 = ebVar5;
                                                                z20 = true;
                                                                go0Var4.W(1351829058);
                                                                go0Var4.p(false);
                                                            }
                                                            uh1 uh1VarP2 = te.P(new g71(1.0f, z20), 18.0f, 0.0f, 2);
                                                            nf1 nf1VarD2 = dm.d(z19 ? sn.j : sn.m, false);
                                                            int iHashCode3 = Long.hashCode(go0Var4.T);
                                                            yy1 yy1VarL3 = go0Var4.l();
                                                            uh1 uh1VarM3 = tl.M(go0Var4, uh1VarP2);
                                                            go0Var4.Z();
                                                            if (go0Var4.S) {
                                                                go0Var4.k(jyVar);
                                                            } else {
                                                                go0Var4.i0();
                                                            }
                                                            yf3.c(go0Var4, lcVar, nf1VarD2);
                                                            yf3.c(go0Var4, lcVar2, yy1VarL3);
                                                            vi0.q(iHashCode3, go0Var4, lcVar3, go0Var4, v6Var);
                                                            yf3.c(go0Var4, lcVar4, uh1VarM3);
                                                            gu2 gu2Var17 = gu2Var14;
                                                            boolean zF5 = go0Var4.f(gu2Var17);
                                                            Object objL7 = go0Var4.L();
                                                            if (zF5) {
                                                                ebVar4 = ebVar3;
                                                            } else {
                                                                ebVar4 = ebVar3;
                                                                if (objL7 == ebVar4) {
                                                                }
                                                                eb ebVar6 = ebVar4;
                                                                eu.a(str7, te.L(rh1Var, (in0) objL7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j7 : lp1Var3.f, rg3.D(14), im0.j, 0L, 0, rg3.D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                mn0Var11.g(go0Var4, 0);
                                                                go0Var4.p(true);
                                                                mn0Var14 = mn0Var13;
                                                                if (mn0Var14 == null) {
                                                                    go0Var4.W(1353420536);
                                                                    rp0.O(go0Var4, te.q0(rh1Var, 8.0f));
                                                                    gu2 gu2Var18 = gu2Var15;
                                                                    boolean zF6 = go0Var4.f(gu2Var18);
                                                                    Object objL8 = go0Var4.L();
                                                                    if (zF6 || objL8 == ebVar6) {
                                                                        objL8 = new hr1(gu2Var18, 5);
                                                                        go0Var4.f0(objL8);
                                                                    }
                                                                    uh1 uh1VarL3 = te.L(rh1Var, (in0) objL8);
                                                                    nf1 nf1VarD3 = dm.d(rkVar2, false);
                                                                    int iHashCode4 = Long.hashCode(go0Var4.T);
                                                                    yy1 yy1VarL4 = go0Var4.l();
                                                                    uh1 uh1VarM4 = tl.M(go0Var4, uh1VarL3);
                                                                    go0Var4.Z();
                                                                    if (go0Var4.S) {
                                                                        go0Var4.k(jyVar);
                                                                    } else {
                                                                        go0Var4.i0();
                                                                    }
                                                                    yf3.c(go0Var4, lcVar, nf1VarD3);
                                                                    yf3.c(go0Var4, lcVar2, yy1VarL4);
                                                                    vi0.q(iHashCode4, go0Var4, lcVar3, go0Var4, v6Var);
                                                                    yf3.c(go0Var4, lcVar4, uh1VarM4);
                                                                    mn0Var14.g(go0Var4, 0);
                                                                    z21 = true;
                                                                    go0Var4.p(true);
                                                                    go0Var4.p(false);
                                                                } else {
                                                                    z21 = true;
                                                                    go0Var4.W(1353799170);
                                                                    go0Var4.p(false);
                                                                }
                                                                go0Var4.p(z21);
                                                            }
                                                            objL7 = new hr1(gu2Var17, 4);
                                                            go0Var4.f0(objL7);
                                                            eb ebVar62 = ebVar4;
                                                            eu.a(str7, te.L(rh1Var, (in0) objL7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j7 : lp1Var3.f, rg3.D(14), im0.j, 0L, 0, rg3.D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                            mn0Var11.g(go0Var4, 0);
                                                            go0Var4.p(true);
                                                            mn0Var14 = mn0Var13;
                                                            if (mn0Var14 == null) {
                                                            }
                                                            go0Var4.p(z21);
                                                        } else {
                                                            go0Var4.R();
                                                        }
                                                        return a83.a;
                                                    }
                                                }, go0Var3), go0Var3, 805306368, 24);
                                            } else {
                                                go0Var3.R();
                                            }
                                            return a83.a;
                                        }
                                    }, go0Var2), go0Var2, 0);
                                } else {
                                    go0Var2.R();
                                }
                                return a83.a;
                            }
                        }, go0Var), go0Var, 56);
                        i26 = i13;
                        i27 = i28;
                        uh1Var3 = uh1Var4;
                        z5 = z8;
                        z6 = z10;
                        z7 = z9;
                        m51Var2 = m51Var3;
                        k51Var2 = k51Var3;
                        wb3Var2 = wb3Var3;
                        mn0Var5 = mn0Var7;
                        mn0Var6 = mn0Var8;
                        str3 = str4;
                    } else {
                        f2 = 0.72f;
                    }
                    i31 = 6;
                    gd0Var = null;
                    final gu2 gu2VarB42 = uc.b(f2, up0.J(160, gd0Var, i31), "TextFieldIconAlpha", go0Var, 3120);
                    if (((Boolean) xk1Var.getValue()).booleanValue()) {
                        final gu2 gu2VarA42 = ar2.a((((Boolean) xk1Var.getValue()).booleanValue() || !z8) ? ju.b(0.0f, j2) : j2, up0.J(180, null, 6), "TextFieldBorderColor", go0Var);
                        final gu2 gu2VarA52 = ar2.a(z8 ? ju.b(0.58f, lp1Var.c) : lp1Var.a ? ju.b(0.05f, ju.b) : ju.b(0.35f, ju.b), up0.J(180, null, 6), "TextFieldContainerColor", go0Var);
                        zE = go0Var.e(j2);
                        objL = go0Var.L();
                        if (!zE) {
                            objL = new g13(j2, ju.b(0.2f, j2));
                            go0Var.f0(objL);
                            ci0.a(h13.a.a((g13) objL), xe1.i0(-676351626, new mn0() { // from class: pr1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.mn0
                                public final Object g(Object obj, Object obj2) {
                                    px pxVar2 = (px) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    go0 go0Var2 = (go0) pxVar2;
                                    if (go0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        uh1 uh1VarC = uh1Var4.c(te.e);
                                        Object objL3 = go0Var2.L();
                                        final xk1 xk1Var2 = xk1Var;
                                        eb ebVar2 = nx.a;
                                        if (objL3 == ebVar2) {
                                            objL3 = new pr(xk1Var2, 18);
                                            go0Var2.f0(objL3);
                                        }
                                        uh1 uh1VarF = gf1.F(uh1VarC, (in0) objL3);
                                        final long j3 = j2;
                                        ft2 ft2Var = new ft2(j3);
                                        final boolean z13 = z8;
                                        final lp1 lp1Var2 = lp1Var;
                                        long j4 = z13 ? lp1Var2.e : lp1Var2.f;
                                        long jD = rg3.D(14);
                                        long jD2 = rg3.D(18);
                                        im0 im0Var = im0.k;
                                        w02 w02Var = new w02();
                                        final ya1 ya1Var2 = ya1Var;
                                        m13 m13Var = new m13(j4, jD, im0Var, 0L, 0, jD2, w02Var, ya1Var2, 15073272);
                                        final boolean z14 = z10;
                                        boolean zG = go0Var2.g(z14);
                                        in0 in0Var2 = in0Var;
                                        boolean zF = zG | go0Var2.f(in0Var2);
                                        Object objL4 = go0Var2.L();
                                        if (zF || objL4 == ebVar2) {
                                            objL4 = new ij(in0Var2, z14);
                                            go0Var2.f0(objL4);
                                        }
                                        in0 in0Var3 = (in0) objL4;
                                        final gu2 gu2Var = gu2VarB;
                                        final gu2 gu2Var2 = gu2VarB2;
                                        final boolean z15 = z12;
                                        final gu2 gu2Var3 = gu2VarA;
                                        final gu2 gu2Var4 = gu2VarA52;
                                        final gu2 gu2Var5 = gu2VarA42;
                                        final gu2 gu2Var6 = gu2VarA2;
                                        final gu2 gu2Var7 = gu2VarA3;
                                        final mn0 mn0Var9 = mn0Var7;
                                        final gu2 gu2Var8 = gu2VarB42;
                                        final mn0 mn0Var10 = mn0Var8;
                                        final gu2 gu2Var9 = gu2VarB3;
                                        final String str6 = str4;
                                        ik.a(str, in0Var3, uh1VarF, z13, z9, m13Var, m51Var3, k51Var3, z14, i36, i37, wb3Var3, null, ft2Var, xe1.i0(-181924685, new nn0() { // from class: rr1
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // defpackage.nn0
                                            public final Object e(Object obj3, Object obj4, Object obj5) {
                                                final mn0 mn0Var11 = (mn0) obj3;
                                                px pxVar3 = (px) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                mn0Var11.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= ((go0) pxVar3).h(mn0Var11) ? 4 : 2;
                                                }
                                                go0 go0Var3 = (go0) pxVar3;
                                                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    kr1 kr1Var = new kr1(((za0) gu2Var3.getValue()).h);
                                                    yi0 yi0Var = te.e;
                                                    boolean z16 = z14;
                                                    uh1 uh1VarP = te.P(yi0Var, z16 ? 42.0f : 48.0f, 0.0f, 2);
                                                    boolean z17 = z13;
                                                    boolean zG2 = go0Var3.g(z17);
                                                    gu2 gu2Var10 = gu2Var;
                                                    boolean zF2 = zG2 | go0Var3.f(gu2Var10);
                                                    gu2 gu2Var11 = gu2Var2;
                                                    boolean zF3 = zF2 | go0Var3.f(gu2Var11);
                                                    Object objL5 = go0Var3.L();
                                                    if (zF3 || objL5 == nx.a) {
                                                        objL5 = new dt0(2, gu2Var10, gu2Var11, z17);
                                                        go0Var3.f0(objL5);
                                                    }
                                                    uh1 uh1VarL = te.L(uh1VarP, (in0) objL5);
                                                    long j5 = ((ju) gu2Var4.getValue()).a;
                                                    long j6 = ((ju) gu2Var5.getValue()).a;
                                                    float f3 = ((za0) gu2Var6.getValue()).h;
                                                    float f4 = z16 ? 9.0f : 11.0f;
                                                    jw1 jw1Var = new jw1(12.0f, f4, 12.0f, f4);
                                                    final boolean z18 = z15;
                                                    rk rkVar = z18 ? sn.j : sn.m;
                                                    final gu2 gu2Var12 = gu2Var7;
                                                    final mn0 mn0Var12 = mn0Var9;
                                                    final gu2 gu2Var13 = gu2Var8;
                                                    final mn0 mn0Var13 = mn0Var10;
                                                    final gu2 gu2Var14 = gu2Var9;
                                                    final long j7 = j3;
                                                    final lp1 lp1Var3 = lp1Var2;
                                                    final ya1 ya1Var3 = ya1Var2;
                                                    final String str7 = str6;
                                                    final xk1 xk1Var3 = xk1Var2;
                                                    ci0.h(uh1VarL, kr1Var, j5, 0L, 0.0f, j6, f3, jw1Var, rkVar, xe1.i0(-142424540, new nn0() { // from class: sr1
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
                                                        /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
                                                        /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
                                                        /* JADX WARN: Removed duplicated region for block: B:62:0x025b  */
                                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                         */
                                                        @Override // defpackage.nn0
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final Object e(Object obj6, Object obj7, Object obj8) {
                                                            boolean z19;
                                                            rk rkVar2;
                                                            gu2 gu2Var15;
                                                            eb ebVar3;
                                                            boolean z20;
                                                            eb ebVar4;
                                                            mn0 mn0Var14;
                                                            boolean z21;
                                                            px pxVar4 = (px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            rk rkVar3 = sn.n;
                                                            ((hm) obj6).getClass();
                                                            go0 go0Var4 = (go0) pxVar4;
                                                            if (go0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                uh1 uh1VarT = s11.T(te.e, ((za0) gu2Var12.getValue()).h, 0.0f, 2);
                                                                boolean z22 = z18;
                                                                ob2 ob2VarA = nb2.a(tp0.a, z22 ? sn.s : sn.t, go0Var4, 0);
                                                                int iHashCode = Long.hashCode(go0Var4.T);
                                                                yy1 yy1VarL = go0Var4.l();
                                                                uh1 uh1VarM = tl.M(go0Var4, uh1VarT);
                                                                hx.c.getClass();
                                                                jy jyVar = gx.b;
                                                                go0Var4.Z();
                                                                if (go0Var4.S) {
                                                                    go0Var4.k(jyVar);
                                                                } else {
                                                                    go0Var4.i0();
                                                                }
                                                                lc lcVar = gx.e;
                                                                yf3.c(go0Var4, lcVar, ob2VarA);
                                                                lc lcVar2 = gx.d;
                                                                yf3.c(go0Var4, lcVar2, yy1VarL);
                                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                                lc lcVar3 = gx.f;
                                                                yf3.c(go0Var4, lcVar3, numValueOf);
                                                                v6 v6Var = gx.g;
                                                                yf3.b(go0Var4, v6Var);
                                                                lc lcVar4 = gx.c;
                                                                yf3.c(go0Var4, lcVar4, uh1VarM);
                                                                mn0 mn0Var15 = mn0Var12;
                                                                gu2 gu2Var16 = gu2Var13;
                                                                eb ebVar5 = nx.a;
                                                                rh1 rh1Var = rh1.a;
                                                                if (mn0Var15 != null) {
                                                                    go0Var4.W(1351451385);
                                                                    boolean zF4 = go0Var4.f(gu2Var16);
                                                                    z19 = z22;
                                                                    Object objL6 = go0Var4.L();
                                                                    if (zF4 || objL6 == ebVar5) {
                                                                        objL6 = new hr1(gu2Var16, 3);
                                                                        go0Var4.f0(objL6);
                                                                    }
                                                                    uh1 uh1VarL2 = te.L(rh1Var, (in0) objL6);
                                                                    gu2Var15 = gu2Var16;
                                                                    nf1 nf1VarD = dm.d(rkVar3, false);
                                                                    rkVar2 = rkVar3;
                                                                    int iHashCode2 = Long.hashCode(go0Var4.T);
                                                                    yy1 yy1VarL2 = go0Var4.l();
                                                                    uh1 uh1VarM2 = tl.M(go0Var4, uh1VarL2);
                                                                    go0Var4.Z();
                                                                    ebVar3 = ebVar5;
                                                                    if (go0Var4.S) {
                                                                        go0Var4.k(jyVar);
                                                                    } else {
                                                                        go0Var4.i0();
                                                                    }
                                                                    yf3.c(go0Var4, lcVar, nf1VarD);
                                                                    yf3.c(go0Var4, lcVar2, yy1VarL2);
                                                                    vi0.q(iHashCode2, go0Var4, lcVar3, go0Var4, v6Var);
                                                                    yf3.c(go0Var4, lcVar4, uh1VarM2);
                                                                    mn0Var15.g(go0Var4, 0);
                                                                    z20 = true;
                                                                    go0Var4.p(true);
                                                                    rp0.O(go0Var4, te.q0(rh1Var, 8.0f));
                                                                    go0Var4.p(false);
                                                                } else {
                                                                    z19 = z22;
                                                                    rkVar2 = rkVar3;
                                                                    gu2Var15 = gu2Var16;
                                                                    ebVar3 = ebVar5;
                                                                    z20 = true;
                                                                    go0Var4.W(1351829058);
                                                                    go0Var4.p(false);
                                                                }
                                                                uh1 uh1VarP2 = te.P(new g71(1.0f, z20), 18.0f, 0.0f, 2);
                                                                nf1 nf1VarD2 = dm.d(z19 ? sn.j : sn.m, false);
                                                                int iHashCode3 = Long.hashCode(go0Var4.T);
                                                                yy1 yy1VarL3 = go0Var4.l();
                                                                uh1 uh1VarM3 = tl.M(go0Var4, uh1VarP2);
                                                                go0Var4.Z();
                                                                if (go0Var4.S) {
                                                                    go0Var4.k(jyVar);
                                                                } else {
                                                                    go0Var4.i0();
                                                                }
                                                                yf3.c(go0Var4, lcVar, nf1VarD2);
                                                                yf3.c(go0Var4, lcVar2, yy1VarL3);
                                                                vi0.q(iHashCode3, go0Var4, lcVar3, go0Var4, v6Var);
                                                                yf3.c(go0Var4, lcVar4, uh1VarM3);
                                                                gu2 gu2Var17 = gu2Var14;
                                                                boolean zF5 = go0Var4.f(gu2Var17);
                                                                Object objL7 = go0Var4.L();
                                                                if (zF5) {
                                                                    ebVar4 = ebVar3;
                                                                } else {
                                                                    ebVar4 = ebVar3;
                                                                    if (objL7 == ebVar4) {
                                                                    }
                                                                    eb ebVar62 = ebVar4;
                                                                    eu.a(str7, te.L(rh1Var, (in0) objL7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j7 : lp1Var3.f, rg3.D(14), im0.j, 0L, 0, rg3.D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                    mn0Var11.g(go0Var4, 0);
                                                                    go0Var4.p(true);
                                                                    mn0Var14 = mn0Var13;
                                                                    if (mn0Var14 == null) {
                                                                        go0Var4.W(1353420536);
                                                                        rp0.O(go0Var4, te.q0(rh1Var, 8.0f));
                                                                        gu2 gu2Var18 = gu2Var15;
                                                                        boolean zF6 = go0Var4.f(gu2Var18);
                                                                        Object objL8 = go0Var4.L();
                                                                        if (zF6 || objL8 == ebVar62) {
                                                                            objL8 = new hr1(gu2Var18, 5);
                                                                            go0Var4.f0(objL8);
                                                                        }
                                                                        uh1 uh1VarL3 = te.L(rh1Var, (in0) objL8);
                                                                        nf1 nf1VarD3 = dm.d(rkVar2, false);
                                                                        int iHashCode4 = Long.hashCode(go0Var4.T);
                                                                        yy1 yy1VarL4 = go0Var4.l();
                                                                        uh1 uh1VarM4 = tl.M(go0Var4, uh1VarL3);
                                                                        go0Var4.Z();
                                                                        if (go0Var4.S) {
                                                                            go0Var4.k(jyVar);
                                                                        } else {
                                                                            go0Var4.i0();
                                                                        }
                                                                        yf3.c(go0Var4, lcVar, nf1VarD3);
                                                                        yf3.c(go0Var4, lcVar2, yy1VarL4);
                                                                        vi0.q(iHashCode4, go0Var4, lcVar3, go0Var4, v6Var);
                                                                        yf3.c(go0Var4, lcVar4, uh1VarM4);
                                                                        mn0Var14.g(go0Var4, 0);
                                                                        z21 = true;
                                                                        go0Var4.p(true);
                                                                        go0Var4.p(false);
                                                                    } else {
                                                                        z21 = true;
                                                                        go0Var4.W(1353799170);
                                                                        go0Var4.p(false);
                                                                    }
                                                                    go0Var4.p(z21);
                                                                }
                                                                objL7 = new hr1(gu2Var17, 4);
                                                                go0Var4.f0(objL7);
                                                                eb ebVar622 = ebVar4;
                                                                eu.a(str7, te.L(rh1Var, (in0) objL7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j7 : lp1Var3.f, rg3.D(14), im0.j, 0L, 0, rg3.D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                mn0Var11.g(go0Var4, 0);
                                                                go0Var4.p(true);
                                                                mn0Var14 = mn0Var13;
                                                                if (mn0Var14 == null) {
                                                                }
                                                                go0Var4.p(z21);
                                                            } else {
                                                                go0Var4.R();
                                                            }
                                                            return a83.a;
                                                        }
                                                    }, go0Var3), go0Var3, 805306368, 24);
                                                } else {
                                                    go0Var3.R();
                                                }
                                                return a83.a;
                                            }
                                        }, go0Var2), go0Var2, 0);
                                    } else {
                                        go0Var2.R();
                                    }
                                    return a83.a;
                                }
                            }, go0Var), go0Var, 56);
                            i26 = i13;
                            i27 = i28;
                            uh1Var3 = uh1Var4;
                            z5 = z8;
                            z6 = z10;
                            z7 = z9;
                            m51Var2 = m51Var3;
                            k51Var2 = k51Var3;
                            wb3Var2 = wb3Var3;
                            mn0Var5 = mn0Var7;
                            mn0Var6 = mn0Var8;
                            str3 = str4;
                        }
                    }
                } else {
                    go0Var.R();
                    str3 = str2;
                    z5 = z2;
                    wb3Var2 = wb3Var;
                    k51Var2 = k51Var;
                    mn0Var5 = mn0Var3;
                    z6 = z4;
                    uh1Var3 = uh1Var2;
                    z7 = z3;
                    m51Var2 = m51Var;
                    i26 = i13;
                    mn0Var6 = mn0Var4;
                    i27 = i3;
                }
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    b62VarR.d = new mn0() { // from class: qr1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = pp0.N(i4 | 1);
                            int iN2 = pp0.N(i5);
                            tp0.b(str, in0Var, uh1Var3, str3, mn0Var5, mn0Var6, z6, i26, i27, z5, z7, wb3Var2, m51Var2, k51Var2, (px) obj, iN, iN2, i6);
                            return a83.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 |= 24576;
            mn0Var3 = mn0Var;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i14 = i6 & AIChatConfig.DefaultMaxTokens;
            if (i14 != 0) {
            }
            i17 = i6 & 1024;
            if (i17 != 0) {
            }
            i20 = i6 & 2048;
            if (i20 != 0) {
            }
            int i342 = i22;
            i23 = i16;
            i24 = i6 & 4096;
            if (i24 != 0) {
            }
            if (go0Var.O(i23 & 1, ((i23 & 306783379) == 306783378 && ((i25 | 3072) & 1171) == 1170) ? false : true)) {
            }
            b62VarR = go0Var.r();
            if (b62VarR != null) {
            }
        }
        uh1Var2 = uh1Var;
        i7 = i6 & 8;
        if (i7 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        mn0Var3 = mn0Var;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i14 = i6 & AIChatConfig.DefaultMaxTokens;
        if (i14 != 0) {
        }
        i17 = i6 & 1024;
        if (i17 != 0) {
        }
        i20 = i6 & 2048;
        if (i20 != 0) {
        }
        int i3422 = i22;
        i23 = i16;
        i24 = i6 & 4096;
        if (i24 != 0) {
        }
        if (go0Var.O(i23 & 1, ((i23 & 306783379) == 306783378 && ((i25 | 3072) & 1171) == 1170) ? false : true)) {
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(String str, uh1 uh1Var, nn0 nn0Var, in0 in0Var, px pxVar, int i2, int i3) {
        in0 in0Var2;
        int i4;
        uh1 uh1Var2;
        nn0 nn0Var2;
        in0 in0Var3;
        ff3 ff3Var;
        str.getClass();
        go0 go0Var = (go0) pxVar;
        go0Var.X(675738465);
        int i5 = i2 | (go0Var.f(str) ? 4 : 2);
        int i6 = i5 | 28080;
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 = i5 | 224688;
            in0Var2 = in0Var;
        } else {
            in0Var2 = in0Var;
            i4 = i6 | (go0Var.h(in0Var2) ? 131072 : 65536);
        }
        if (go0Var.O(i4 & 1, (74899 & i4) != 74898)) {
            rh1 rh1Var = rh1.a;
            nn0 nn0Var3 = s11.b;
            in0 in0Var4 = i7 != 0 ? null : in0Var2;
            int i8 = 6;
            gu2 gu2VarB = uc.b(0.0f, up0.J(160, null, 6), "TopAppBarDividerAlpha", go0Var, 3120);
            gu2 gu2VarA = uc.a(2.0f, up0.J(160, null, 6), "TopAppBarTitleOffset", go0Var);
            gu2 gu2VarB2 = uc.b(1.0f - (ci0.C(0.0f, 0.0f, 1.0f) * 0.035f), up0.J(160, null, 6), "TopAppBarTitleScale", go0Var, 3120);
            tu2 tu2Var = ur1.a;
            gu2 gu2VarA2 = ar2.a(((lp1) go0Var.j(tu2Var)).b, up0.J(160, null, 6), "TopAppBarContainerColor", go0Var);
            yi0 yi0Var = te.e;
            int i9 = i4;
            long j2 = ((ju) gu2VarA2.getValue()).a;
            iu0 iu0Var = sp0.h;
            uh1 uh1VarN = gf1.n(yi0Var, j2, iu0Var);
            WeakHashMap weakHashMap = ff3.v;
            View view = (View) go0Var.j(r7.f);
            WeakHashMap weakHashMap2 = ff3.v;
            synchronized (weakHashMap2) {
                try {
                    Object ff3Var2 = weakHashMap2.get(view);
                    if (ff3Var2 == null) {
                        ff3Var2 = new ff3(view);
                        weakHashMap2.put(view, ff3Var2);
                    }
                    ff3Var = (ff3) ff3Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean zH = go0Var.h(ff3Var) | go0Var.h(view);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                objL = new d62(9, ff3Var, view);
                go0Var.f0(objL);
            }
            eu.c(ff3Var, (in0) objL, go0Var);
            uh1 uh1VarO = te.O(p40.c0(uh1VarN, ff3Var.f), 56.0f);
            nf1 nf1VarD = dm.d(sn.j, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarO);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, nf1VarD);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            uh1 uh1VarE = fg1.E(te.g, 8.0f, 0.0f, 2);
            qk qkVar = sn.t;
            ob2 ob2VarA = nb2.a(a, qkVar, go0Var, 48);
            int iHashCode2 = Long.hashCode(go0Var.T);
            yy1 yy1VarL2 = go0Var.l();
            uh1 uh1VarM2 = tl.M(go0Var, uh1VarE);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, ob2VarA);
            yf3.c(go0Var, lcVar2, yy1VarL2);
            vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM2);
            pb2 pb2Var = pb2.a;
            uh1 uh1VarA = pb2.a(pb2Var);
            nf1 nf1VarD2 = dm.d(sn.m, false);
            int iHashCode3 = Long.hashCode(go0Var.T);
            yy1 yy1VarL3 = go0Var.l();
            uh1 uh1VarM3 = tl.M(go0Var, uh1VarA);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, nf1VarD2);
            yf3.c(go0Var, lcVar2, yy1VarL3);
            vi0.q(iHashCode3, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM3);
            if (in0Var4 != null) {
                go0Var.W(2094852666);
                d(in0Var4, go0Var, 6 | ((i9 >> 12) & 112));
                go0Var.p(false);
            } else {
                go0Var.W(2095028529);
                go0Var.p(false);
            }
            go0Var.p(true);
            boolean zF = go0Var.f(gu2VarA) | go0Var.f(gu2VarB2);
            Object objL2 = go0Var.L();
            if (zF || objL2 == nx.a) {
                objL2 = new er1(gu2VarA, gu2VarB2, 2);
                go0Var.f0(objL2);
            }
            in0 in0Var5 = in0Var4;
            eu.a(str, te.L(rh1Var, (in0) objL2), new m13(((lp1) go0Var.j(tu2Var)).e, rg3.D(18), im0.m, rg3.C(0.5d), 0, 0L, null, null, 16777080), 0, false, 0, 0, go0Var, i9 & 14, 1016);
            uh1 uh1VarA2 = pb2.a(pb2Var);
            ob2 ob2VarA2 = nb2.a(b, qkVar, go0Var, 54);
            int iHashCode4 = Long.hashCode(go0Var.T);
            yy1 yy1VarL4 = go0Var.l();
            uh1 uh1VarM4 = tl.M(go0Var, uh1VarA2);
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, lcVar, ob2VarA2);
            yf3.c(go0Var, lcVar2, yy1VarL4);
            vi0.q(iHashCode4, go0Var, lcVar3, go0Var, v6Var);
            yf3.c(go0Var, lcVar4, uh1VarM4);
            nn0Var3.e(pb2Var, go0Var, 54);
            go0Var.p(true);
            go0Var.p(true);
            uh1 uh1VarO2 = te.O(new am(sn.q, false).c(yi0Var), 1.0f);
            boolean zF2 = go0Var.f(gu2VarB);
            Object objL3 = go0Var.L();
            if (zF2 || objL3 == nx.a) {
                objL3 = new hr1(gu2VarB, i8);
                go0Var.f0(objL3);
            }
            dm.a(gf1.n(te.L(uh1VarO2, (in0) objL3), ((lp1) go0Var.j(tu2Var)).d, iu0Var), go0Var, 0);
            go0Var.p(true);
            in0Var3 = in0Var5;
            nn0Var2 = nn0Var3;
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            nn0Var2 = nn0Var;
            in0Var3 = in0Var2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new hw(str, uh1Var2, nn0Var2, in0Var3, i2, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(in0 in0Var, px pxVar, int i2) {
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1520297062);
        if ((i2 & 6) == 0) {
            i3 = (go0Var.h(null) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= go0Var.h(in0Var) ? 32 : 16;
        }
        boolean z = true;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            rh1 rh1Var = rh1.a;
            uh1 uh1VarC = fg1.C(fg1.G(rh1Var, 4.0f, 0.0f, 0.0f, 0.0f, 14).c(in0Var != null ? tl.s(rh1Var, new hp1(6, in0Var, z)) : rh1Var), 10.0f);
            nf1 nf1VarD = dm.d(sn.n, false);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarC);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, nf1VarD);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            e(null, ((lp1) go0Var.j(ur1.a)).e, go0Var, 0);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ge0(in0Var, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(uh1 uh1Var, long j2, px pxVar, int i2) {
        uh1 uh1Var2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-348039542);
        int i3 = i2 | 6 | (go0Var.e(j2) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            rh1 rh1Var = rh1.a;
            uh1 uh1VarE = fg1.E(te.g0(rh1Var, 18.0f), 2.0f, 0.0f, 2);
            boolean z = (i3 & 112) == 32;
            Object objL = go0Var.L();
            if (z || objL == nx.a) {
                objL = new c8(j2, 7);
                go0Var.f0(objL);
            }
            eu.b(uh1VarE, (in0) objL, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new z7(uh1Var2, j2, i2, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o62 f(rz1 rz1Var, int i2, q33 q33Var, y03 y03Var, boolean z, int i3) {
        o62 o62VarC = y03Var != null ? y03Var.c(q33Var.b.p(i2)) : o62.e;
        float f2 = o62VarC.a;
        int iT = rz1Var.T(2.0f);
        return new o62(z ? (i3 - f2) - iT : f2, o62VarC.b, z ? i3 - f2 : iT + f2, o62VarC.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String g(Object[] objArr, int i2, int i3, z2 z2Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == z2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object h(wo woVar, t00 t00Var) {
        mp mpVar = new mp(1, gf1.z(t00Var));
        mpVar.u();
        mpVar.w(new r51(woVar, 0));
        woVar.b(new lw0(mpVar, 1));
        return mpVar.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object i(wo woVar, t00 t00Var) {
        mp mpVar = new mp(1, gf1.z(t00Var));
        mpVar.u();
        mpVar.w(new r51(woVar, 1));
        woVar.b(new lw0(mpVar, 2));
        return mpVar.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object m(Object obj, h63 h63Var, in0 in0Var) throws QuickJsException {
        if (obj == null) {
            return null;
        }
        bt btVar = h63Var.a;
        if (btVar.d(obj)) {
            return obj;
        }
        Class clsY = p40.y(btVar);
        if (clsY.equals(Boolean.TYPE)) {
            if (obj instanceof Boolean) {
                return Boolean.valueOf(obj.equals(Boolean.TRUE));
            }
        } else if (clsY.equals(Long.TYPE)) {
            if (obj instanceof Long) {
                return obj;
            }
        } else if (clsY.equals(Byte.TYPE)) {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue >= -128 && jLongValue <= 127) {
                    return Byte.valueOf((byte) jLongValue);
                }
                throw new QuickJsException("Cannot cast Long(" + jLongValue + ") to Byte: value out of range.");
            }
        } else if (clsY.equals(Short.TYPE)) {
            if (obj instanceof Long) {
                long jLongValue2 = ((Number) obj).longValue();
                if (jLongValue2 >= -32768 && jLongValue2 <= 32767) {
                    return Short.valueOf((short) jLongValue2);
                }
                throw new QuickJsException("Cannot cast Long(" + jLongValue2 + ") to Short: value out of range.");
            }
        } else if (clsY.equals(Integer.class) || clsY.equals(Integer.TYPE)) {
            if (obj instanceof Long) {
                long jLongValue3 = ((Number) obj).longValue();
                if (jLongValue3 >= -2147483648L && jLongValue3 <= 2147483647L) {
                    return Integer.valueOf((int) jLongValue3);
                }
                throw new QuickJsException("Cannot cast Long(" + jLongValue3 + ") to Int: value out of range.");
            }
            if (obj instanceof Integer) {
                return obj;
            }
        } else if (clsY.equals(Float.class) || clsY.equals(Float.TYPE)) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (dDoubleValue >= 1.401298464324817E-45d && dDoubleValue <= 3.4028234663852886E38d) {
                    return Float.valueOf((float) dDoubleValue);
                }
                throw new QuickJsException("Cannot cast Double(" + dDoubleValue + ") to Float: value out of range.");
            }
            if (obj instanceof Float) {
                return obj;
            }
            if (obj instanceof Long) {
                return Float.valueOf(((Number) obj).longValue());
            }
        } else if (clsY.equals(Double.class) || clsY.equals(Double.TYPE)) {
            if (obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Long) {
                return Double.valueOf(((Number) obj).longValue());
            }
        }
        return in0Var.j(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean n(o12 o12Var) {
        return (o12Var.b() || o12Var.h || !o12Var.d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean o(o12 o12Var) {
        return !o12Var.h && o12Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(o12 o12Var) {
        return (o12Var.b() || !o12Var.h || o12Var.d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean q(o12 o12Var) {
        return o12Var.h && !o12Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nl1 r() {
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        Signature signature;
        byte[] byteArray;
        Signature[] signingCertificateHistory;
        Signature signature2;
        try {
            x92Var = up0.l;
            if (x92Var == null) {
                t11.S("moduleApkPath");
                throw null;
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = "";
        }
        String str = (String) x92Var;
        try {
            x92Var2 = up0.i;
            if (x92Var2 == null) {
                t11.S("hostContext");
                throw null;
            }
        } catch (Throwable th2) {
            x92Var2 = new x92(th2);
        }
        if (x92Var2 instanceof x92) {
            x92Var2 = null;
        }
        Context context = (Context) x92Var2;
        if (context == null) {
            return new nl1(null);
        }
        if (str.length() == 0) {
            return new nl1(null);
        }
        try {
            x92Var3 = context.getPackageManager().getPackageArchiveInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217728 : 64);
        } catch (Throwable th3) {
            x92Var3 = new x92(th3);
        }
        if (x92Var3 instanceof x92) {
            x92Var3 = null;
        }
        PackageInfo packageInfo = (PackageInfo) x92Var3;
        if (packageInfo == null) {
            return new nl1(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo == null || (signingCertificateHistory = signingInfo.getApkContentsSigners()) == null) {
                signingCertificateHistory = signingInfo != null ? signingInfo.getSigningCertificateHistory() : null;
                byteArray = (signingCertificateHistory != null || (signature2 = (Signature) mg.l0(signingCertificateHistory)) == null) ? null : signature2.toByteArray();
            } else {
                if (signingCertificateHistory.length == 0) {
                    signingCertificateHistory = null;
                }
                if (signingCertificateHistory == null) {
                }
                if (signingCertificateHistory != null) {
                }
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && (signature = (Signature) mg.l0(signatureArr)) != null) {
                byteArray = signature.toByteArray();
            }
        }
        return byteArray == null ? new nl1(null) : new nl1(MessageDigest.getInstance("SHA-256").digest(byteArray));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(bi0 bi0Var, int i2) {
        int i3;
        MappedByteBuffer mappedByteBufferA0;
        ArrayList arrayList = bi0Var.n;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            nm2 nm2Var = (nm2) arrayList.get(0);
            int size = arrayList.size();
            int i4 = 0;
            for (int i5 = 1; i5 < size; i5++) {
                nm2 nm2Var2 = (nm2) arrayList.get(i5);
                if (nm2Var2.h == nm2Var.i) {
                    nm2Var.i = nm2Var2.i;
                } else {
                    i4++;
                    if (i4 != i5) {
                        arrayList.set(i4, nm2Var2);
                    }
                    nm2Var = nm2Var2;
                }
            }
            int i6 = i4 + 1;
            if (size > i6) {
                arrayList.subList(i6, size).clear();
            }
        }
        nm2 nm2Var3 = (nm2) arrayList.get(0);
        int i7 = nm2Var3.h;
        int i8 = bi0Var.d;
        int i9 = i8 - bi0Var.m;
        int i10 = i9 - 12;
        int i11 = i9 - i7;
        int i12 = i8 - i7;
        boolean z = i10 < i12 + i11;
        if (!z) {
            bi0Var.e ^= bi0Var.h.f(i7, i12);
        }
        int size2 = arrayList.size();
        int i13 = size2 - 1;
        int i14 = bi0Var.d - ((nm2) arrayList.get(i13)).i;
        int i15 = i14 > 0 ? size2 : i13;
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        int i16 = nm2Var3.h;
        int i17 = nm2Var3.i;
        int i18 = 1;
        while (i18 < size2) {
            ArrayList arrayList2 = arrayList;
            nm2 nm2Var4 = (nm2) arrayList.get(i18);
            int i19 = i18;
            int i20 = nm2Var4.h - i17;
            int i21 = size2;
            byte[] bArr = (byte[]) bi0Var.h.k;
            System.arraycopy(bArr, i17, bArr, i16, i20);
            int i22 = i19 - 1;
            iArr[i22] = i17;
            iArr2[i22] = i17 - i16;
            i16 += i20;
            i17 = nm2Var4.i;
            i18 = i19 + 1;
            arrayList = arrayList2;
            size2 = i21;
        }
        ArrayList arrayList3 = arrayList;
        if (i14 > 0) {
            byte[] bArr2 = (byte[]) bi0Var.h.k;
            System.arraycopy(bArr2, i17, bArr2, i16, i14);
            iArr[i13] = i17;
            iArr2[i13] = i17 - i16;
        }
        bi0Var.m = 0;
        arrayList3.clear();
        if (z) {
            bi0Var.e = bi0Var.h.f(12, i10);
        } else {
            bi0Var.e ^= bi0Var.h.f(i7, i11);
        }
        bi0Var.d = i9;
        if (bi0Var.v == 0) {
            bi0Var.s.putInt(0, -1);
            bi0Var.s.putLong(4, bi0Var.e);
            bi0Var.s.position(i7);
            bi0Var.s.put((byte[]) bi0Var.h.k, i7, i11);
            bi0Var.s.putInt(0, i10);
            bi0Var.t.putInt(0, i10);
            bi0Var.t.putLong(4, bi0Var.e);
            bi0Var.t.position(i7);
            bi0Var.t.put((byte[]) bi0Var.h.k, i7, i11);
        } else {
            bi0Var.h.q(0, i10);
            bi0Var.h.r(bi0Var.e, 4);
        }
        int i23 = bi0Var.d + i2;
        if (((byte[]) bi0Var.h.k).length - i23 > 32768) {
            int i24 = bi0.z;
            int iG = te.G(i24, i23 + i24);
            byte[] bArr3 = (byte[]) bi0Var.h.k;
            if (iG >= bArr3.length) {
                i3 = 0;
            } else {
                byte[] bArr4 = new byte[iG];
                i3 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, bi0Var.d);
                bi0Var.h.k = bArr4;
                if (bi0Var.v == 0) {
                    FileChannel fileChannel = bi0Var.q;
                    long j2 = iG;
                    MappedByteBuffer mappedByteBufferA02 = null;
                    try {
                        fileChannel.truncate(j2);
                        mappedByteBufferA0 = te.a0(fileChannel, iG);
                    } catch (IOException unused) {
                        mappedByteBufferA0 = null;
                    }
                    FileChannel fileChannel2 = bi0Var.r;
                    try {
                        fileChannel2.truncate(j2);
                        mappedByteBufferA02 = te.a0(fileChannel2, iG);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferA0 == null || mappedByteBufferA02 == null) {
                        Log.e("FastKV", bi0Var.b, new Exception("map failed"));
                        te.k0(bi0Var);
                    } else {
                        bi0Var.s = mappedByteBufferA0;
                        bi0Var.t = mappedByteBufferA02;
                    }
                }
                s11.M(bi0Var, "truncate finish");
            }
        }
        for (qz qzVar : bi0Var.f.values()) {
            int i25 = qzVar.a;
            if (i25 > i7) {
                int i26 = i15 - 1;
                int i27 = i3;
                while (true) {
                    if (i27 > i26) {
                        break;
                    }
                    int i28 = (i27 + i26) >>> 1;
                    int i29 = iArr[i28];
                    if (i29 >= i25) {
                        if (i29 <= i25) {
                            i26 = i28;
                            break;
                        }
                        i26 = i28 - 1;
                    } else {
                        i27 = i28 + 1;
                    }
                }
                int i30 = iArr2[i26];
                qzVar.a -= i30;
                if (qzVar.a() >= 6) {
                    ((yz) qzVar).c -= i30;
                }
            }
        }
        s11.M(bi0Var, "gc finish");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final bt w(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var instanceof zo2) {
            return w(((zo2) yo2Var).a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String y() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(o12 o12Var, long j2, long j3) {
        int i2 = o12Var.i == 1 ? 1 : 0;
        long j4 = o12Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    public abstract boolean A(Class cls);

    public abstract void F(k3 k3Var, k3 k3Var2);

    public abstract void G(k3 k3Var, Thread thread);

    public abstract boolean j(l3 l3Var, h3 h3Var);

    public abstract boolean k(l3 l3Var, Object obj, Object obj2);

    public abstract boolean l(l3 l3Var, k3 k3Var, k3 k3Var2);

    public abstract Method u(Class cls, Field field);

    public abstract Constructor v(Class cls);

    public abstract String[] x(Class cls);
}
