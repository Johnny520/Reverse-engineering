package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tp0 {

    /* JADX INFO: renamed from: a */
    public static final C0771uf f10874a;

    /* JADX INFO: renamed from: d */
    public static final C0953z8 f10877d;

    /* JADX INFO: renamed from: i */
    public static final hh1 f10882i;

    /* JADX INFO: renamed from: j */
    public static final hh1 f10883j;

    /* JADX INFO: renamed from: b */
    public static final C0771uf f10875b = new C0771uf(2);

    /* JADX INFO: renamed from: c */
    public static final C0808vf f10876c = new C0808vf();

    /* JADX INFO: renamed from: e */
    public static final C0402kw f10878e = new C0402kw(-611870119, false, new C0558ow(12));

    /* JADX INFO: renamed from: f */
    public static final C0402kw f10879f = new C0402kw(1156832798, false, new C0558ow(13));

    /* JADX INFO: renamed from: g */
    public static final C0402kw f10880g = new C0402kw(-1379454417, false, new C0920ye(20));

    /* JADX INFO: renamed from: h */
    public static final C0402kw f10881h = new C0402kw(-99996876, false, new C0920ye(21));

    /* JADX INFO: renamed from: k */
    public static final y41 f10884k = y41.f13302h;

    /* JADX INFO: renamed from: l */
    public static final oa2 f10885l = new oa2();

    /* JADX INFO: renamed from: m */
    public static final Object f10886m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f10887n = new Object();

    /* JADX INFO: renamed from: o */
    public static final Object f10888o = new Object();

    /* JADX INFO: renamed from: p */
    public static final Object f10889p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f10890q = new Object();

    static {
        int i = 3;
        f10874a = new C0771uf(i);
        f10877d = new C0953z8(i);
        int i2 = 19;
        f10882i = new hh1(i2, "REMOVED_TASK");
        f10883j = new hh1(i2, "CLOSED_EMPTY");
    }

    /* JADX INFO: renamed from: B */
    public static vo2 m5340B(mn0 mn0Var) {
        vo2 vo2Var = new vo2();
        vo2Var.f12095j = gf1.m1898p(vo2Var, vo2Var, mn0Var);
        return vo2Var;
    }

    /* JADX INFO: renamed from: C */
    public static void m5341C(int i, int[] iArr, int[] iArr2, boolean z) {
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

    /* JADX INFO: renamed from: D */
    public static final long m5342D(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: E */
    public static final long m5343E(o12 o12Var, boolean z) {
        long jM4611d = rs1.m4611d(o12Var.f7422c, o12Var.f7426g);
        if (z || !o12Var.m3464b()) {
            return jM4611d;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: H */
    public static final View m5344H(t60 t60Var) {
        if (!((th1) t60Var).f10757h.f10770u) {
            kz0.m2764b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) u61.m5471a(sp0.m4933c0(t60Var));
    }

    /* JADX INFO: renamed from: I */
    public static final void m5345I(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static final long m5346J(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: K */
    public static final Object m5347K(pl0 pl0Var, int i, in0 in0Var) {
        int i2;
        int i3;
        Object objMo5j;
        th1 th1VarM4952m;
        t71 t71VarM3875Q0;
        int size;
        int i4;
        vn1 vn1Var;
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var = pl0Var.f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(pl0Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objMo5j = null;
            if (r61VarM4933c0 == null) {
                th1VarM4952m = null;
                break;
            }
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 1024) != 0) {
                while (th1Var != null) {
                    if ((th1Var.f10759j & 1024) != 0) {
                        th1VarM4952m = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                break loop0;
                            }
                            if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i5 = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            th1VarM4952m = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var.m6423b(th1Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    th1Var = th1Var.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
        pl0 pl0Var2 = (pl0) th1VarM4952m;
        if ((pl0Var2 == null || !t11.m5086l(pl0Var2.m3875Q0(), pl0Var.m3875Q0())) && (t71VarM3875Q0 = pl0Var.m3875Q0()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                C0676s.m4653l("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (t71VarM3875Q0.f10590v.f9427a.m973g().f12887n <= 0 || t71VarM3875Q0.f10590v.f9427a.m973g().f12884k.isEmpty() || !t71VarM3875Q0.f10770u) {
                return in0Var.mo5j(t71.f10589y);
            }
            boolean zM5128N0 = t71VarM3875Q0.m5128N0(i6);
            r81 r81Var = t71VarM3875Q0.f10590v;
            int iMin = zM5128N0 ? Math.min(r81Var.f9427a.m973g().f12887n - 1, ((y81) AbstractC0142du.m1166v0(r81Var.f9427a.m973g().f12884k)).f13347a) : Math.max(0, ((kx1) r81Var.f9427a.f1920e.f7821b).m2759g());
            o72 o72Var = new o72();
            C0429lm c0429lm = t71VarM3875Q0.f10591w;
            c0429lm.getClass();
            p71 p71Var = new p71(iMin, iMin);
            c0429lm.f6190a.m6423b(p71Var);
            o72Var.f7574i = p71Var;
            d91 d91Var = t71VarM3875Q0.f10590v.f9427a;
            if (d91Var.m973g().f12884k.isEmpty()) {
                i3 = 0;
            } else {
                x81 x81VarM973g = d91Var.m973g();
                int iM6047g = (int) (x81VarM973g.f12888o == qv1.f9205h ? x81VarM973g.m6047g() & 4294967295L : x81VarM973g.m6047g() >> 32);
                x81 x81VarM973g2 = d91Var.m973g();
                List list = x81VarM973g2.f12884k;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((y81) list.get(i8)).f13357k;
                    }
                    size = (i7 / list.size()) + x81VarM973g2.f12890q;
                }
                if (size != 0 && (i4 = iM6047g / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = t71VarM3875Q0.f10590v.f9427a.m973g().f12887n;
            if (i9 > i10) {
                i9 = i10;
            }
            while (objMo5j == null && t71VarM3875Q0.m5127M0((p71) o72Var.f7574i, i6) && i2 < i9) {
                p71 p71Var2 = (p71) o72Var.f7574i;
                int i11 = p71Var2.f8011a;
                int i12 = p71Var2.f8012b;
                if (t71VarM3875Q0.m5128N0(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                C0429lm c0429lm2 = t71VarM3875Q0.f10591w;
                c0429lm2.getClass();
                p71 p71Var3 = new p71(i11, i12);
                c0429lm2.f6190a.m6423b(p71Var3);
                t71VarM3875Q0.f10591w.f6190a.m6431j((p71) o72Var.f7574i);
                o72Var.f7574i = p71Var3;
                i2++;
                sp0.m4933c0(t71VarM3875Q0).m4379k();
                objMo5j = in0Var.mo5j(new s71(t71VarM3875Q0, o72Var, i6));
            }
            t71VarM3875Q0.f10591w.f6190a.m6431j((p71) o72Var.f7574i);
            sp0.m4933c0(t71VarM3875Q0).m4379k();
            return objMo5j;
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static void m5348L(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0227g4.m1799g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC0227g4.m1799g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            m5350N(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m5350N(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m5350N(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        m5350N(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: M */
    public static void m5349M(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            td0.m5164a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    /* JADX INFO: renamed from: N */
    public static void m5350N(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: O */
    public static String m5351O(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
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
        return qv2.m4289S("\n            import * as entryModule from \"./" + sb.toString() + "\";\n            globalThis.__nukeScript = entryModule;\n            if (typeof entryModule.activate === \"function\") {\n    await entryModule.activate();\n}\n        ");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5352P(Throwable th, t00 t00Var) {
        s51 s51Var;
        if (t00Var instanceof s51) {
            s51Var = (s51) t00Var;
            int i = s51Var.f9912l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s51Var.f9912l = i - Integer.MIN_VALUE;
            } else {
                s51Var = new s51(t00Var);
            }
        }
        Object obj = s51Var.f9911k;
        int i2 = s51Var.f9912l;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                fg1.m1627T(obj);
                C0676s.m4644b();
                return;
            }
        }
        fg1.m1627T(obj);
        s51Var.f9912l = 1;
        c60 c60Var = o90.f7590a;
        a20 a20Var = s51Var.f11029i;
        a20Var.getClass();
        c60Var.mo612D(a20Var, new yp0(s51Var, th));
    }

    /* JADX INFO: renamed from: Q */
    public static String m5353Q(long j) {
        return m5371s(j, 12884901888L) ? "Rgb" : m5371s(j, 12884901889L) ? "Xyz" : m5371s(j, 12884901890L) ? "Lab" : m5371s(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    /* JADX INFO: renamed from: R */
    public static final void m5354R(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m5355S(String str, Throwable th) {
        if (f10884k.ordinal() <= 2) {
            Log.w("KavaRef", String.valueOf(str), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5356a(List list, List list2, c73 c73Var, boolean z, boolean z2, in0 in0Var, mn0 mn0Var, in0 in0Var2, InterfaceC0596px interfaceC0596px, int i) {
        List list3;
        List list4;
        List listM3105t0;
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-344226455);
        int i3 = i | 18 | (go0Var.m1984h(c73Var) ? 256 : 128) | (go0Var.m1982g(z) ? 2048 : 1024) | (go0Var.m1982g(z2) ? 16384 : 8192) | (go0Var.m1984h(in0Var) ? 131072 : 65536) | (go0Var.m1984h(mn0Var) ? 1048576 : 524288) | (go0Var.m1984h(in0Var2) ? 8388608 : 4194304);
        if (go0Var.m1958O(i3 & 1, (4793491 & i3) != 4793490)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                list = AbstractC0460mg.m3105t0(rg3.f9568j);
                listM3105t0 = AbstractC0460mg.m3105t0(rg3.f9567i);
                i2 = i3 & (-127);
            } else {
                go0Var.m1961R();
                i2 = i3 & (-127);
                listM3105t0 = list2;
            }
            go0Var.m1995q();
            boolean zM1980f = go0Var.m1980f(c73Var.f1224d) | ((((i2 & 7168) ^ 3072) > 2048 && go0Var.m1982g(z)) || (i2 & 3072) == 2048);
            Object objM1956L = go0Var.m1956L();
            if (zM1980f || objM1956L == C0520nx.f7360a) {
                objM1956L = AbstractC0570p7.m3756L(c73Var.f1224d, z);
                go0Var.m1981f0(objM1956L);
            }
            list3 = list;
            ur1.m5571a((lp1) objM1956L, c73Var.f1223c, xe1.m6126i0(-928954866, new pt0(list3, mn0Var, listM3105t0, z2, in0Var, c73Var, z, in0Var2), go0Var), go0Var, 384);
            list4 = listM3105t0;
        } else {
            go0Var.m1961R();
            list3 = list;
            list4 = list2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new pt0(list3, list4, c73Var, z, z2, in0Var, mn0Var, in0Var2, i);
        }
    }

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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5357b(final String str, final in0 in0Var, uh1 uh1Var, String str2, mn0 mn0Var, mn0 mn0Var2, boolean z, int i, int i2, boolean z2, boolean z3, wb3 wb3Var, m51 m51Var, k51 k51Var, InterfaceC0596px interfaceC0596px, final int i3, final int i4, final int i5) {
        uh1 uh1Var2;
        int i6;
        int i7;
        int i8;
        mn0 mn0Var3;
        int i9;
        mn0 mn0Var4;
        int i10;
        boolean z4;
        int i11;
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
        final String str3;
        final boolean z5;
        final wb3 wb3Var2;
        final k51 k51Var2;
        final mn0 mn0Var5;
        final boolean z6;
        final uh1 uh1Var3;
        final boolean z7;
        final m51 m51Var2;
        final int i25;
        final mn0 mn0Var6;
        final int i26;
        b62 b62VarM1996r;
        int i27;
        final String str4;
        final boolean z8;
        final boolean z9;
        final wb3 wb3Var3;
        final m51 m51Var3;
        final k51 k51Var3;
        final uh1 uh1Var4;
        int i28;
        int i29;
        int i30;
        gd0 gd0Var;
        float f;
        boolean zM1978e;
        Object objM1956L;
        str.getClass();
        in0Var.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1819820874);
        int i31 = (go0Var.m1980f(str) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i31 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        int i32 = i5 & 4;
        if (i32 != 0) {
            i31 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                uh1Var2 = uh1Var;
                i31 |= go0Var.m1980f(uh1Var2) ? 256 : 128;
            }
            i6 = i5 & 8;
            if (i6 == 0) {
                i7 = i31 | 3072;
            } else {
                i7 = i31 | (go0Var.m1980f(str2) ? 2048 : 1024);
            }
            i8 = i5 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    mn0Var3 = mn0Var;
                    i7 |= go0Var.m1984h(mn0Var3) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    mn0Var4 = mn0Var2;
                } else {
                    mn0Var4 = mn0Var2;
                    if ((i3 & 196608) == 0) {
                        i7 |= go0Var.m1984h(mn0Var4) ? 131072 : 65536;
                    }
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i3 & 1572864) == 0) {
                        i7 |= go0Var.m1982g(z4) ? 1048576 : 524288;
                    }
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i3 & 12582912) == 0) {
                        i7 |= go0Var.m1976d(i12) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 100663296) == 0) {
                    i7 |= ((i5 & 256) == 0 && go0Var.m1976d(i2)) ? 67108864 : 33554432;
                }
                i13 = i5 & AIChatConfig.DefaultMaxTokens;
                if (i13 != 0) {
                    i15 = i7 | 805306368;
                    i14 = i13;
                } else {
                    i14 = i13;
                    i15 = i7 | (go0Var.m1982g(z2) ? 536870912 : 268435456);
                }
                i16 = i5 & 1024;
                if (i16 != 0) {
                    i18 = i4 | 6;
                    i17 = i16;
                } else if ((i4 & 6) == 0) {
                    i17 = i16;
                    i18 = i4 | (go0Var.m1982g(z3) ? 4 : 2);
                } else {
                    i17 = i16;
                    i18 = i4;
                }
                i19 = i5 & 2048;
                if (i19 != 0) {
                    i21 = i18 | 48;
                    i20 = i19;
                } else {
                    i20 = i19;
                    i21 = i18 | (go0Var.m1980f(wb3Var) ? 32 : 16);
                }
                int i33 = i21;
                i22 = i15;
                i23 = i5 & 4096;
                if (i23 != 0) {
                    i24 = i33 | 384;
                } else {
                    int i34 = i33;
                    if ((i4 & 384) == 0) {
                        i34 |= go0Var.m1980f(m51Var) ? 256 : 128;
                    }
                    i24 = i34;
                }
                if (go0Var.m1958O(i22 & 1, ((i22 & 306783379) == 306783378 && ((i24 | 3072) & 1171) == 1170) ? false : true)) {
                    go0Var.m1963T();
                    if ((i3 & 1) == 0 || go0Var.m2003y()) {
                        uh1 uh1Var5 = i32 != 0 ? rh1.f9587a : uh1Var2;
                        String str5 = i6 != 0 ? "" : str2;
                        if (i8 != 0) {
                            mn0Var3 = null;
                        }
                        if (i9 != 0) {
                            mn0Var4 = null;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        }
                        if (i11 != 0) {
                            i12 = 1;
                        }
                        i27 = (i5 & 256) != 0 ? z4 ? 1 : 5 : i2;
                        str4 = str5;
                        z8 = i14 != 0 ? true : z2;
                        z9 = i17 != 0 ? false : z3;
                        wb3Var3 = i20 != 0 ? gd3.f3429P : wb3Var;
                        m51Var3 = i23 != 0 ? m51.f6481c : m51Var;
                        k51Var3 = k51.f5348a;
                        uh1Var4 = uh1Var5;
                    } else {
                        go0Var.m1961R();
                        str4 = str2;
                        i27 = i2;
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
                    go0Var.m1995q();
                    Object objM1956L2 = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = op0.m3598u(Boolean.FALSE);
                        go0Var.m1981f0(objM1956L2);
                    }
                    final xk1 xk1Var = (xk1) objM1956L2;
                    final lp1 lp1Var = (lp1) go0Var.m1988j(ur1.f11452a);
                    final long j = lp1Var.f6239g;
                    boolean z11 = str.length() > 0;
                    final ya1 ya1Var = new ya1(va1.f11864b, 17, 0);
                    final gu2 gu2VarM5480a = AbstractC0768uc.m5480a(((Boolean) xk1Var.getValue()).booleanValue() ? 13.0f : 11.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "TextFieldCornerRadius", go0Var);
                    final gu2 gu2VarM5480a2 = AbstractC0768uc.m5480a((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 2.0f : 0.0f, up0.m5531J(140, null, 6), "TextFieldBorderThickness", go0Var);
                    final boolean z12 = !z10;
                    if (z10) {
                        i28 = 1;
                        i29 = 1;
                    } else {
                        i28 = 1;
                        i29 = i12 < 1 ? 1 : i12;
                    }
                    if (!z10) {
                        i28 = i27 < i29 ? i29 : i27;
                    }
                    final int i35 = i28;
                    final gu2 gu2VarM5481b = AbstractC0768uc.m5481b((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 0.996f : 1.0f, up0.m5528G(0.5f, 1500.0f, null, 4), "TextFieldScaleX", go0Var, 3120);
                    final int i36 = i29;
                    final gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 1.012f : 1.0f, up0.m5528G(0.75f, 400.0f, null, 4), "TextFieldScaleY", go0Var, 3120);
                    final gu2 gu2VarM5480a3 = AbstractC0768uc.m5480a((((Boolean) xk1Var.getValue()).booleanValue() && z8) ? 1.0f : 0.0f, up0.m5528G(0.75f, 400.0f, null, 4), "TextFieldContentOffset", go0Var);
                    final gu2 gu2VarM5481b3 = AbstractC0768uc.m5481b(z11 ? 0.0f : ((Boolean) xk1Var.getValue()).booleanValue() ? 0.52f : 0.68f, up0.m5531J(160, null, 6), "TextFieldPlaceholderAlpha", go0Var, 3120);
                    if (!z8) {
                        f = 0.45f;
                    } else if (((Boolean) xk1Var.getValue()).booleanValue() || z11) {
                        i30 = 6;
                        gd0Var = null;
                        f = 1.0f;
                        final gu2 gu2VarM5481b4 = AbstractC0768uc.m5481b(f, up0.m5531J(160, gd0Var, i30), "TextFieldIconAlpha", go0Var, 3120);
                        final gu2 gu2VarM269a = ar2.m269a((((Boolean) xk1Var.getValue()).booleanValue() || !z8) ? C0363ju.m2565b(0.0f, j) : j, up0.m5531J(180, null, 6), "TextFieldBorderColor", go0Var);
                        final gu2 gu2VarM269a2 = ar2.m269a(z8 ? C0363ju.m2565b(0.58f, lp1Var.f6235c) : lp1Var.f6233a ? C0363ju.m2565b(0.05f, C0363ju.f5212b) : C0363ju.m2565b(0.35f, C0363ju.f5212b), up0.m5531J(180, null, 6), "TextFieldContainerColor", go0Var);
                        zM1978e = go0Var.m1978e(j);
                        objM1956L = go0Var.m1956L();
                        if (!zM1978e || objM1956L == c0160eb) {
                            objM1956L = new g13(j, C0363ju.m2565b(0.2f, j));
                            go0Var.m1981f0(objM1956L);
                        }
                        ci0.m800a(h13.f3782a.mo1251a((g13) objM1956L), xe1.m6126i0(-676351626, new mn0() { // from class: pr1
                            @Override // p000.mn0
                            /* JADX INFO: renamed from: g */
                            public final Object mo12g(Object obj, Object obj2) {
                                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                go0 go0Var2 = (go0) interfaceC0596px2;
                                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    uh1 uh1VarMo4491c = uh1Var4.mo4491c(AbstractC0731te.f10693e);
                                    Object objM1956L3 = go0Var2.m1956L();
                                    final xk1 xk1Var2 = xk1Var;
                                    C0160eb c0160eb2 = C0520nx.f7360a;
                                    if (objM1956L3 == c0160eb2) {
                                        objM1956L3 = new C0590pr(xk1Var2, 18);
                                        go0Var2.m1981f0(objM1956L3);
                                    }
                                    uh1 uh1VarM1858F = gf1.m1858F(uh1VarMo4491c, (in0) objM1956L3);
                                    final long j2 = j;
                                    ft2 ft2Var = new ft2(j2);
                                    final boolean z13 = z8;
                                    final lp1 lp1Var2 = lp1Var;
                                    long j3 = z13 ? lp1Var2.f6237e : lp1Var2.f6238f;
                                    long jM4450D = rg3.m4450D(14);
                                    long jM4450D2 = rg3.m4450D(18);
                                    im0 im0Var = im0.f4681k;
                                    w02 w02Var = new w02();
                                    final ya1 ya1Var2 = ya1Var;
                                    m13 m13Var = new m13(j3, jM4450D, im0Var, 0L, 0, jM4450D2, w02Var, ya1Var2, 15073272);
                                    final boolean z14 = z10;
                                    boolean zM1982g = go0Var2.m1982g(z14);
                                    in0 in0Var2 = in0Var;
                                    boolean zM1980f = zM1982g | go0Var2.m1980f(in0Var2);
                                    Object objM1956L4 = go0Var2.m1956L();
                                    if (zM1980f || objM1956L4 == c0160eb2) {
                                        objM1956L4 = new C0315ij(in0Var2, z14);
                                        go0Var2.m1981f0(objM1956L4);
                                    }
                                    in0 in0Var3 = (in0) objM1956L4;
                                    final gu2 gu2Var = gu2VarM5481b;
                                    final gu2 gu2Var2 = gu2VarM5481b2;
                                    final boolean z15 = z12;
                                    final gu2 gu2Var3 = gu2VarM5480a;
                                    final gu2 gu2Var4 = gu2VarM269a2;
                                    final gu2 gu2Var5 = gu2VarM269a;
                                    final gu2 gu2Var6 = gu2VarM5480a2;
                                    final gu2 gu2Var7 = gu2VarM5480a3;
                                    final mn0 mn0Var9 = mn0Var7;
                                    final gu2 gu2Var8 = gu2VarM5481b4;
                                    final mn0 mn0Var10 = mn0Var8;
                                    final gu2 gu2Var9 = gu2VarM5481b3;
                                    final String str6 = str4;
                                    AbstractC0316ik.m2359a(str, in0Var3, uh1VarM1858F, z13, z9, m13Var, m51Var3, k51Var3, z14, i35, i36, wb3Var3, null, ft2Var, xe1.m6126i0(-181924685, new nn0() { // from class: rr1
                                        @Override // p000.nn0
                                        /* JADX INFO: renamed from: e */
                                        public final Object mo489e(Object obj3, Object obj4, Object obj5) {
                                            final mn0 mn0Var11 = (mn0) obj3;
                                            InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            mn0Var11.getClass();
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= ((go0) interfaceC0596px3).m1984h(mn0Var11) ? 4 : 2;
                                            }
                                            go0 go0Var3 = (go0) interfaceC0596px3;
                                            if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                kr1 kr1Var = new kr1(((za0) gu2Var3.getValue()).f13798h);
                                                yi0 yi0Var = AbstractC0731te.f10693e;
                                                boolean z16 = z14;
                                                uh1 uh1VarM5187P = AbstractC0731te.m5187P(yi0Var, z16 ? 42.0f : 48.0f, 0.0f, 2);
                                                boolean z17 = z13;
                                                boolean zM1982g2 = go0Var3.m1982g(z17);
                                                gu2 gu2Var10 = gu2Var;
                                                boolean zM1980f2 = zM1982g2 | go0Var3.m1980f(gu2Var10);
                                                gu2 gu2Var11 = gu2Var2;
                                                boolean zM1980f3 = zM1980f2 | go0Var3.m1980f(gu2Var11);
                                                Object objM1956L5 = go0Var3.m1956L();
                                                if (zM1980f3 || objM1956L5 == C0520nx.f7360a) {
                                                    objM1956L5 = new dt0(2, gu2Var10, gu2Var11, z17);
                                                    go0Var3.m1981f0(objM1956L5);
                                                }
                                                uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM5187P, (in0) objM1956L5);
                                                long j4 = ((C0363ju) gu2Var4.getValue()).f5219a;
                                                long j5 = ((C0363ju) gu2Var5.getValue()).f5219a;
                                                float f2 = ((za0) gu2Var6.getValue()).f13798h;
                                                float f3 = z16 ? 9.0f : 11.0f;
                                                jw1 jw1Var = new jw1(12.0f, f3, 12.0f, f3);
                                                final boolean z18 = z15;
                                                C0659rk c0659rk = z18 ? C0700sn.f10222j : C0700sn.f10225m;
                                                final gu2 gu2Var12 = gu2Var7;
                                                final mn0 mn0Var12 = mn0Var9;
                                                final gu2 gu2Var13 = gu2Var8;
                                                final mn0 mn0Var13 = mn0Var10;
                                                final gu2 gu2Var14 = gu2Var9;
                                                final long j6 = j2;
                                                final lp1 lp1Var3 = lp1Var2;
                                                final ya1 ya1Var3 = ya1Var2;
                                                final String str7 = str6;
                                                final xk1 xk1Var3 = xk1Var2;
                                                ci0.m807h(uh1VarM5183L, kr1Var, j4, 0L, 0.0f, j5, f2, jw1Var, c0659rk, xe1.m6126i0(-142424540, new nn0() { // from class: sr1
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
                                                    @Override // p000.nn0
                                                    /* JADX INFO: renamed from: e */
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final Object mo489e(Object obj6, Object obj7, Object obj8) {
                                                        boolean z19;
                                                        C0659rk c0659rk2;
                                                        gu2 gu2Var15;
                                                        C0160eb c0160eb3;
                                                        boolean z20;
                                                        C0160eb c0160eb4;
                                                        mn0 mn0Var14;
                                                        boolean z21;
                                                        InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj7;
                                                        int iIntValue3 = ((Integer) obj8).intValue();
                                                        C0659rk c0659rk3 = C0700sn.f10226n;
                                                        ((C0282hm) obj6).getClass();
                                                        go0 go0Var4 = (go0) interfaceC0596px4;
                                                        if (go0Var4.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            uh1 uh1VarM4675T = s11.m4675T(AbstractC0731te.f10693e, ((za0) gu2Var12.getValue()).f13798h, 0.0f, 2);
                                                            boolean z22 = z18;
                                                            ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, z22 ? C0700sn.f10231s : C0700sn.f10232t, go0Var4, 0);
                                                            int iHashCode = Long.hashCode(go0Var4.f3614T);
                                                            yy1 yy1VarM1990l = go0Var4.m1990l();
                                                            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var4, uh1VarM4675T);
                                                            InterfaceC0293hx.f4166c.getClass();
                                                            C0367jy c0367jy = C0256gx.f3727b;
                                                            go0Var4.m1969Z();
                                                            if (go0Var4.f3613S) {
                                                                go0Var4.m1989k(c0367jy);
                                                            } else {
                                                                go0Var4.m1987i0();
                                                            }
                                                            C0419lc c0419lc = C0256gx.f3730e;
                                                            yf3.m6268c(go0Var4, c0419lc, ob2VarM3265a);
                                                            C0419lc c0419lc2 = C0256gx.f3729d;
                                                            yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l);
                                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                                            C0419lc c0419lc3 = C0256gx.f3731f;
                                                            yf3.m6268c(go0Var4, c0419lc3, numValueOf);
                                                            C0799v6 c0799v6 = C0256gx.f3732g;
                                                            yf3.m6267b(go0Var4, c0799v6);
                                                            C0419lc c0419lc4 = C0256gx.f3728c;
                                                            yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M);
                                                            mn0 mn0Var15 = mn0Var12;
                                                            gu2 gu2Var16 = gu2Var13;
                                                            C0160eb c0160eb5 = C0520nx.f7360a;
                                                            rh1 rh1Var = rh1.f9587a;
                                                            if (mn0Var15 != null) {
                                                                go0Var4.m1966W(1351451385);
                                                                boolean zM1980f4 = go0Var4.m1980f(gu2Var16);
                                                                z19 = z22;
                                                                Object objM1956L6 = go0Var4.m1956L();
                                                                if (zM1980f4 || objM1956L6 == c0160eb5) {
                                                                    objM1956L6 = new hr1(gu2Var16, 3);
                                                                    go0Var4.m1981f0(objM1956L6);
                                                                }
                                                                uh1 uh1VarM5183L2 = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L6);
                                                                gu2Var15 = gu2Var16;
                                                                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(c0659rk3, false);
                                                                c0659rk2 = c0659rk3;
                                                                int iHashCode2 = Long.hashCode(go0Var4.f3614T);
                                                                yy1 yy1VarM1990l2 = go0Var4.m1990l();
                                                                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5183L2);
                                                                go0Var4.m1969Z();
                                                                c0160eb3 = c0160eb5;
                                                                if (go0Var4.f3613S) {
                                                                    go0Var4.m1989k(c0367jy);
                                                                } else {
                                                                    go0Var4.m1987i0();
                                                                }
                                                                yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d);
                                                                yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l2);
                                                                vi0.m5698q(iHashCode2, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                                yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M2);
                                                                mn0Var15.mo12g(go0Var4, 0);
                                                                z20 = true;
                                                                go0Var4.m1994p(true);
                                                                rp0.m4529O(go0Var4, AbstractC0731te.m5231q0(rh1Var, 8.0f));
                                                                go0Var4.m1994p(false);
                                                            } else {
                                                                z19 = z22;
                                                                c0659rk2 = c0659rk3;
                                                                gu2Var15 = gu2Var16;
                                                                c0160eb3 = c0160eb5;
                                                                z20 = true;
                                                                go0Var4.m1966W(1351829058);
                                                                go0Var4.m1994p(false);
                                                            }
                                                            uh1 uh1VarM5187P2 = AbstractC0731te.m5187P(new g71(1.0f, z20), 18.0f, 0.0f, 2);
                                                            nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(z19 ? C0700sn.f10222j : C0700sn.f10225m, false);
                                                            int iHashCode3 = Long.hashCode(go0Var4.f3614T);
                                                            yy1 yy1VarM1990l3 = go0Var4.m1990l();
                                                            uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5187P2);
                                                            go0Var4.m1969Z();
                                                            if (go0Var4.f3613S) {
                                                                go0Var4.m1989k(c0367jy);
                                                            } else {
                                                                go0Var4.m1987i0();
                                                            }
                                                            yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d2);
                                                            yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l3);
                                                            vi0.m5698q(iHashCode3, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                            yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M3);
                                                            gu2 gu2Var17 = gu2Var14;
                                                            boolean zM1980f5 = go0Var4.m1980f(gu2Var17);
                                                            Object objM1956L7 = go0Var4.m1956L();
                                                            if (zM1980f5) {
                                                                c0160eb4 = c0160eb3;
                                                            } else {
                                                                c0160eb4 = c0160eb3;
                                                                if (objM1956L7 == c0160eb4) {
                                                                }
                                                                C0160eb c0160eb6 = c0160eb4;
                                                                AbstractC0179eu.m1446a(str7, AbstractC0731te.m5183L(rh1Var, (in0) objM1956L7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j6 : lp1Var3.f6238f, rg3.m4450D(14), im0.f4680j, 0L, 0, rg3.m4450D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                mn0Var11.mo12g(go0Var4, 0);
                                                                go0Var4.m1994p(true);
                                                                mn0Var14 = mn0Var13;
                                                                if (mn0Var14 == null) {
                                                                    go0Var4.m1966W(1353420536);
                                                                    rp0.m4529O(go0Var4, AbstractC0731te.m5231q0(rh1Var, 8.0f));
                                                                    gu2 gu2Var18 = gu2Var15;
                                                                    boolean zM1980f6 = go0Var4.m1980f(gu2Var18);
                                                                    Object objM1956L8 = go0Var4.m1956L();
                                                                    if (zM1980f6 || objM1956L8 == c0160eb6) {
                                                                        objM1956L8 = new hr1(gu2Var18, 5);
                                                                        go0Var4.m1981f0(objM1956L8);
                                                                    }
                                                                    uh1 uh1VarM5183L3 = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L8);
                                                                    nf1 nf1VarM1060d3 = AbstractC0135dm.m1060d(c0659rk2, false);
                                                                    int iHashCode4 = Long.hashCode(go0Var4.f3614T);
                                                                    yy1 yy1VarM1990l4 = go0Var4.m1990l();
                                                                    uh1 uh1VarM5285M4 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5183L3);
                                                                    go0Var4.m1969Z();
                                                                    if (go0Var4.f3613S) {
                                                                        go0Var4.m1989k(c0367jy);
                                                                    } else {
                                                                        go0Var4.m1987i0();
                                                                    }
                                                                    yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d3);
                                                                    yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l4);
                                                                    vi0.m5698q(iHashCode4, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                                    yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M4);
                                                                    mn0Var14.mo12g(go0Var4, 0);
                                                                    z21 = true;
                                                                    go0Var4.m1994p(true);
                                                                    go0Var4.m1994p(false);
                                                                } else {
                                                                    z21 = true;
                                                                    go0Var4.m1966W(1353799170);
                                                                    go0Var4.m1994p(false);
                                                                }
                                                                go0Var4.m1994p(z21);
                                                            }
                                                            objM1956L7 = new hr1(gu2Var17, 4);
                                                            go0Var4.m1981f0(objM1956L7);
                                                            C0160eb c0160eb62 = c0160eb4;
                                                            AbstractC0179eu.m1446a(str7, AbstractC0731te.m5183L(rh1Var, (in0) objM1956L7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j6 : lp1Var3.f6238f, rg3.m4450D(14), im0.f4680j, 0L, 0, rg3.m4450D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                            mn0Var11.mo12g(go0Var4, 0);
                                                            go0Var4.m1994p(true);
                                                            mn0Var14 = mn0Var13;
                                                            if (mn0Var14 == null) {
                                                            }
                                                            go0Var4.m1994p(z21);
                                                        } else {
                                                            go0Var4.m1961R();
                                                        }
                                                        return a83.f116a;
                                                    }
                                                }, go0Var3), go0Var3, 805306368, 24);
                                            } else {
                                                go0Var3.m1961R();
                                            }
                                            return a83.f116a;
                                        }
                                    }, go0Var2), go0Var2, 0);
                                } else {
                                    go0Var2.m1961R();
                                }
                                return a83.f116a;
                            }
                        }, go0Var), go0Var, 56);
                        i25 = i12;
                        i26 = i27;
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
                        f = 0.72f;
                    }
                    i30 = 6;
                    gd0Var = null;
                    final gu2 gu2VarM5481b42 = AbstractC0768uc.m5481b(f, up0.m5531J(160, gd0Var, i30), "TextFieldIconAlpha", go0Var, 3120);
                    if (((Boolean) xk1Var.getValue()).booleanValue()) {
                        final gu2 gu2VarM269a3 = ar2.m269a((((Boolean) xk1Var.getValue()).booleanValue() || !z8) ? C0363ju.m2565b(0.0f, j) : j, up0.m5531J(180, null, 6), "TextFieldBorderColor", go0Var);
                        final gu2 gu2VarM269a22 = ar2.m269a(z8 ? C0363ju.m2565b(0.58f, lp1Var.f6235c) : lp1Var.f6233a ? C0363ju.m2565b(0.05f, C0363ju.f5212b) : C0363ju.m2565b(0.35f, C0363ju.f5212b), up0.m5531J(180, null, 6), "TextFieldContainerColor", go0Var);
                        zM1978e = go0Var.m1978e(j);
                        objM1956L = go0Var.m1956L();
                        if (!zM1978e) {
                            objM1956L = new g13(j, C0363ju.m2565b(0.2f, j));
                            go0Var.m1981f0(objM1956L);
                            ci0.m800a(h13.f3782a.mo1251a((g13) objM1956L), xe1.m6126i0(-676351626, new mn0() { // from class: pr1
                                @Override // p000.mn0
                                /* JADX INFO: renamed from: g */
                                public final Object mo12g(Object obj, Object obj2) {
                                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    go0 go0Var2 = (go0) interfaceC0596px2;
                                    if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        uh1 uh1VarMo4491c = uh1Var4.mo4491c(AbstractC0731te.f10693e);
                                        Object objM1956L3 = go0Var2.m1956L();
                                        final xk1 xk1Var2 = xk1Var;
                                        C0160eb c0160eb2 = C0520nx.f7360a;
                                        if (objM1956L3 == c0160eb2) {
                                            objM1956L3 = new C0590pr(xk1Var2, 18);
                                            go0Var2.m1981f0(objM1956L3);
                                        }
                                        uh1 uh1VarM1858F = gf1.m1858F(uh1VarMo4491c, (in0) objM1956L3);
                                        final long j2 = j;
                                        ft2 ft2Var = new ft2(j2);
                                        final boolean z13 = z8;
                                        final lp1 lp1Var2 = lp1Var;
                                        long j3 = z13 ? lp1Var2.f6237e : lp1Var2.f6238f;
                                        long jM4450D = rg3.m4450D(14);
                                        long jM4450D2 = rg3.m4450D(18);
                                        im0 im0Var = im0.f4681k;
                                        w02 w02Var = new w02();
                                        final ya1 ya1Var2 = ya1Var;
                                        m13 m13Var = new m13(j3, jM4450D, im0Var, 0L, 0, jM4450D2, w02Var, ya1Var2, 15073272);
                                        final boolean z14 = z10;
                                        boolean zM1982g = go0Var2.m1982g(z14);
                                        in0 in0Var2 = in0Var;
                                        boolean zM1980f = zM1982g | go0Var2.m1980f(in0Var2);
                                        Object objM1956L4 = go0Var2.m1956L();
                                        if (zM1980f || objM1956L4 == c0160eb2) {
                                            objM1956L4 = new C0315ij(in0Var2, z14);
                                            go0Var2.m1981f0(objM1956L4);
                                        }
                                        in0 in0Var3 = (in0) objM1956L4;
                                        final gu2 gu2Var = gu2VarM5481b;
                                        final gu2 gu2Var2 = gu2VarM5481b2;
                                        final boolean z15 = z12;
                                        final gu2 gu2Var3 = gu2VarM5480a;
                                        final gu2 gu2Var4 = gu2VarM269a22;
                                        final gu2 gu2Var5 = gu2VarM269a3;
                                        final gu2 gu2Var6 = gu2VarM5480a2;
                                        final gu2 gu2Var7 = gu2VarM5480a3;
                                        final mn0 mn0Var9 = mn0Var7;
                                        final gu2 gu2Var8 = gu2VarM5481b42;
                                        final mn0 mn0Var10 = mn0Var8;
                                        final gu2 gu2Var9 = gu2VarM5481b3;
                                        final String str6 = str4;
                                        AbstractC0316ik.m2359a(str, in0Var3, uh1VarM1858F, z13, z9, m13Var, m51Var3, k51Var3, z14, i35, i36, wb3Var3, null, ft2Var, xe1.m6126i0(-181924685, new nn0() { // from class: rr1
                                            @Override // p000.nn0
                                            /* JADX INFO: renamed from: e */
                                            public final Object mo489e(Object obj3, Object obj4, Object obj5) {
                                                final mn0 mn0Var11 = (mn0) obj3;
                                                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                mn0Var11.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= ((go0) interfaceC0596px3).m1984h(mn0Var11) ? 4 : 2;
                                                }
                                                go0 go0Var3 = (go0) interfaceC0596px3;
                                                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                                    kr1 kr1Var = new kr1(((za0) gu2Var3.getValue()).f13798h);
                                                    yi0 yi0Var = AbstractC0731te.f10693e;
                                                    boolean z16 = z14;
                                                    uh1 uh1VarM5187P = AbstractC0731te.m5187P(yi0Var, z16 ? 42.0f : 48.0f, 0.0f, 2);
                                                    boolean z17 = z13;
                                                    boolean zM1982g2 = go0Var3.m1982g(z17);
                                                    gu2 gu2Var10 = gu2Var;
                                                    boolean zM1980f2 = zM1982g2 | go0Var3.m1980f(gu2Var10);
                                                    gu2 gu2Var11 = gu2Var2;
                                                    boolean zM1980f3 = zM1980f2 | go0Var3.m1980f(gu2Var11);
                                                    Object objM1956L5 = go0Var3.m1956L();
                                                    if (zM1980f3 || objM1956L5 == C0520nx.f7360a) {
                                                        objM1956L5 = new dt0(2, gu2Var10, gu2Var11, z17);
                                                        go0Var3.m1981f0(objM1956L5);
                                                    }
                                                    uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM5187P, (in0) objM1956L5);
                                                    long j4 = ((C0363ju) gu2Var4.getValue()).f5219a;
                                                    long j5 = ((C0363ju) gu2Var5.getValue()).f5219a;
                                                    float f2 = ((za0) gu2Var6.getValue()).f13798h;
                                                    float f3 = z16 ? 9.0f : 11.0f;
                                                    jw1 jw1Var = new jw1(12.0f, f3, 12.0f, f3);
                                                    final boolean z18 = z15;
                                                    C0659rk c0659rk = z18 ? C0700sn.f10222j : C0700sn.f10225m;
                                                    final gu2 gu2Var12 = gu2Var7;
                                                    final mn0 mn0Var12 = mn0Var9;
                                                    final gu2 gu2Var13 = gu2Var8;
                                                    final mn0 mn0Var13 = mn0Var10;
                                                    final gu2 gu2Var14 = gu2Var9;
                                                    final long j6 = j2;
                                                    final lp1 lp1Var3 = lp1Var2;
                                                    final ya1 ya1Var3 = ya1Var2;
                                                    final String str7 = str6;
                                                    final xk1 xk1Var3 = xk1Var2;
                                                    ci0.m807h(uh1VarM5183L, kr1Var, j4, 0L, 0.0f, j5, f2, jw1Var, c0659rk, xe1.m6126i0(-142424540, new nn0() { // from class: sr1
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
                                                        @Override // p000.nn0
                                                        /* JADX INFO: renamed from: e */
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final Object mo489e(Object obj6, Object obj7, Object obj8) {
                                                            boolean z19;
                                                            C0659rk c0659rk2;
                                                            gu2 gu2Var15;
                                                            C0160eb c0160eb3;
                                                            boolean z20;
                                                            C0160eb c0160eb4;
                                                            mn0 mn0Var14;
                                                            boolean z21;
                                                            InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj7;
                                                            int iIntValue3 = ((Integer) obj8).intValue();
                                                            C0659rk c0659rk3 = C0700sn.f10226n;
                                                            ((C0282hm) obj6).getClass();
                                                            go0 go0Var4 = (go0) interfaceC0596px4;
                                                            if (go0Var4.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                uh1 uh1VarM4675T = s11.m4675T(AbstractC0731te.f10693e, ((za0) gu2Var12.getValue()).f13798h, 0.0f, 2);
                                                                boolean z22 = z18;
                                                                ob2 ob2VarM3265a = nb2.m3265a(tp0.f10874a, z22 ? C0700sn.f10231s : C0700sn.f10232t, go0Var4, 0);
                                                                int iHashCode = Long.hashCode(go0Var4.f3614T);
                                                                yy1 yy1VarM1990l = go0Var4.m1990l();
                                                                uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var4, uh1VarM4675T);
                                                                InterfaceC0293hx.f4166c.getClass();
                                                                C0367jy c0367jy = C0256gx.f3727b;
                                                                go0Var4.m1969Z();
                                                                if (go0Var4.f3613S) {
                                                                    go0Var4.m1989k(c0367jy);
                                                                } else {
                                                                    go0Var4.m1987i0();
                                                                }
                                                                C0419lc c0419lc = C0256gx.f3730e;
                                                                yf3.m6268c(go0Var4, c0419lc, ob2VarM3265a);
                                                                C0419lc c0419lc2 = C0256gx.f3729d;
                                                                yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l);
                                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                                C0419lc c0419lc3 = C0256gx.f3731f;
                                                                yf3.m6268c(go0Var4, c0419lc3, numValueOf);
                                                                C0799v6 c0799v6 = C0256gx.f3732g;
                                                                yf3.m6267b(go0Var4, c0799v6);
                                                                C0419lc c0419lc4 = C0256gx.f3728c;
                                                                yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M);
                                                                mn0 mn0Var15 = mn0Var12;
                                                                gu2 gu2Var16 = gu2Var13;
                                                                C0160eb c0160eb5 = C0520nx.f7360a;
                                                                rh1 rh1Var = rh1.f9587a;
                                                                if (mn0Var15 != null) {
                                                                    go0Var4.m1966W(1351451385);
                                                                    boolean zM1980f4 = go0Var4.m1980f(gu2Var16);
                                                                    z19 = z22;
                                                                    Object objM1956L6 = go0Var4.m1956L();
                                                                    if (zM1980f4 || objM1956L6 == c0160eb5) {
                                                                        objM1956L6 = new hr1(gu2Var16, 3);
                                                                        go0Var4.m1981f0(objM1956L6);
                                                                    }
                                                                    uh1 uh1VarM5183L2 = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L6);
                                                                    gu2Var15 = gu2Var16;
                                                                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(c0659rk3, false);
                                                                    c0659rk2 = c0659rk3;
                                                                    int iHashCode2 = Long.hashCode(go0Var4.f3614T);
                                                                    yy1 yy1VarM1990l2 = go0Var4.m1990l();
                                                                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5183L2);
                                                                    go0Var4.m1969Z();
                                                                    c0160eb3 = c0160eb5;
                                                                    if (go0Var4.f3613S) {
                                                                        go0Var4.m1989k(c0367jy);
                                                                    } else {
                                                                        go0Var4.m1987i0();
                                                                    }
                                                                    yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d);
                                                                    yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l2);
                                                                    vi0.m5698q(iHashCode2, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                                    yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M2);
                                                                    mn0Var15.mo12g(go0Var4, 0);
                                                                    z20 = true;
                                                                    go0Var4.m1994p(true);
                                                                    rp0.m4529O(go0Var4, AbstractC0731te.m5231q0(rh1Var, 8.0f));
                                                                    go0Var4.m1994p(false);
                                                                } else {
                                                                    z19 = z22;
                                                                    c0659rk2 = c0659rk3;
                                                                    gu2Var15 = gu2Var16;
                                                                    c0160eb3 = c0160eb5;
                                                                    z20 = true;
                                                                    go0Var4.m1966W(1351829058);
                                                                    go0Var4.m1994p(false);
                                                                }
                                                                uh1 uh1VarM5187P2 = AbstractC0731te.m5187P(new g71(1.0f, z20), 18.0f, 0.0f, 2);
                                                                nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(z19 ? C0700sn.f10222j : C0700sn.f10225m, false);
                                                                int iHashCode3 = Long.hashCode(go0Var4.f3614T);
                                                                yy1 yy1VarM1990l3 = go0Var4.m1990l();
                                                                uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5187P2);
                                                                go0Var4.m1969Z();
                                                                if (go0Var4.f3613S) {
                                                                    go0Var4.m1989k(c0367jy);
                                                                } else {
                                                                    go0Var4.m1987i0();
                                                                }
                                                                yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d2);
                                                                yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l3);
                                                                vi0.m5698q(iHashCode3, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                                yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M3);
                                                                gu2 gu2Var17 = gu2Var14;
                                                                boolean zM1980f5 = go0Var4.m1980f(gu2Var17);
                                                                Object objM1956L7 = go0Var4.m1956L();
                                                                if (zM1980f5) {
                                                                    c0160eb4 = c0160eb3;
                                                                } else {
                                                                    c0160eb4 = c0160eb3;
                                                                    if (objM1956L7 == c0160eb4) {
                                                                    }
                                                                    C0160eb c0160eb62 = c0160eb4;
                                                                    AbstractC0179eu.m1446a(str7, AbstractC0731te.m5183L(rh1Var, (in0) objM1956L7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j6 : lp1Var3.f6238f, rg3.m4450D(14), im0.f4680j, 0L, 0, rg3.m4450D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                    mn0Var11.mo12g(go0Var4, 0);
                                                                    go0Var4.m1994p(true);
                                                                    mn0Var14 = mn0Var13;
                                                                    if (mn0Var14 == null) {
                                                                        go0Var4.m1966W(1353420536);
                                                                        rp0.m4529O(go0Var4, AbstractC0731te.m5231q0(rh1Var, 8.0f));
                                                                        gu2 gu2Var18 = gu2Var15;
                                                                        boolean zM1980f6 = go0Var4.m1980f(gu2Var18);
                                                                        Object objM1956L8 = go0Var4.m1956L();
                                                                        if (zM1980f6 || objM1956L8 == c0160eb62) {
                                                                            objM1956L8 = new hr1(gu2Var18, 5);
                                                                            go0Var4.m1981f0(objM1956L8);
                                                                        }
                                                                        uh1 uh1VarM5183L3 = AbstractC0731te.m5183L(rh1Var, (in0) objM1956L8);
                                                                        nf1 nf1VarM1060d3 = AbstractC0135dm.m1060d(c0659rk2, false);
                                                                        int iHashCode4 = Long.hashCode(go0Var4.f3614T);
                                                                        yy1 yy1VarM1990l4 = go0Var4.m1990l();
                                                                        uh1 uh1VarM5285M4 = AbstractC0738tl.m5285M(go0Var4, uh1VarM5183L3);
                                                                        go0Var4.m1969Z();
                                                                        if (go0Var4.f3613S) {
                                                                            go0Var4.m1989k(c0367jy);
                                                                        } else {
                                                                            go0Var4.m1987i0();
                                                                        }
                                                                        yf3.m6268c(go0Var4, c0419lc, nf1VarM1060d3);
                                                                        yf3.m6268c(go0Var4, c0419lc2, yy1VarM1990l4);
                                                                        vi0.m5698q(iHashCode4, go0Var4, c0419lc3, go0Var4, c0799v6);
                                                                        yf3.m6268c(go0Var4, c0419lc4, uh1VarM5285M4);
                                                                        mn0Var14.mo12g(go0Var4, 0);
                                                                        z21 = true;
                                                                        go0Var4.m1994p(true);
                                                                        go0Var4.m1994p(false);
                                                                    } else {
                                                                        z21 = true;
                                                                        go0Var4.m1966W(1353799170);
                                                                        go0Var4.m1994p(false);
                                                                    }
                                                                    go0Var4.m1994p(z21);
                                                                }
                                                                objM1956L7 = new hr1(gu2Var17, 4);
                                                                go0Var4.m1981f0(objM1956L7);
                                                                C0160eb c0160eb622 = c0160eb4;
                                                                AbstractC0179eu.m1446a(str7, AbstractC0731te.m5183L(rh1Var, (in0) objM1956L7), new m13(!((Boolean) xk1Var3.getValue()).booleanValue() ? j6 : lp1Var3.f6238f, rg3.m4450D(14), im0.f4680j, 0L, 0, rg3.m4450D(18), new w02(), ya1Var3, 15073272), 0, false, 0, 0, go0Var4, 0, 1016);
                                                                mn0Var11.mo12g(go0Var4, 0);
                                                                go0Var4.m1994p(true);
                                                                mn0Var14 = mn0Var13;
                                                                if (mn0Var14 == null) {
                                                                }
                                                                go0Var4.m1994p(z21);
                                                            } else {
                                                                go0Var4.m1961R();
                                                            }
                                                            return a83.f116a;
                                                        }
                                                    }, go0Var3), go0Var3, 805306368, 24);
                                                } else {
                                                    go0Var3.m1961R();
                                                }
                                                return a83.f116a;
                                            }
                                        }, go0Var2), go0Var2, 0);
                                    } else {
                                        go0Var2.m1961R();
                                    }
                                    return a83.f116a;
                                }
                            }, go0Var), go0Var, 56);
                            i25 = i12;
                            i26 = i27;
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
                    go0Var.m1961R();
                    str3 = str2;
                    z5 = z2;
                    wb3Var2 = wb3Var;
                    k51Var2 = k51Var;
                    mn0Var5 = mn0Var3;
                    z6 = z4;
                    uh1Var3 = uh1Var2;
                    z7 = z3;
                    m51Var2 = m51Var;
                    i25 = i12;
                    mn0Var6 = mn0Var4;
                    i26 = i2;
                }
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    b62VarM1996r.f616d = new mn0() { // from class: qr1
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM3902N = pp0.m3902N(i3 | 1);
                            int iM3902N2 = pp0.m3902N(i4);
                            tp0.m5357b(str, in0Var, uh1Var3, str3, mn0Var5, mn0Var6, z6, i25, i26, z5, z7, wb3Var2, m51Var2, k51Var2, (InterfaceC0596px) obj, iM3902N, iM3902N2, i5);
                            return a83.f116a;
                        }
                    };
                    return;
                }
                return;
            }
            i7 |= 24576;
            mn0Var3 = mn0Var;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            i13 = i5 & AIChatConfig.DefaultMaxTokens;
            if (i13 != 0) {
            }
            i16 = i5 & 1024;
            if (i16 != 0) {
            }
            i19 = i5 & 2048;
            if (i19 != 0) {
            }
            int i332 = i21;
            i22 = i15;
            i23 = i5 & 4096;
            if (i23 != 0) {
            }
            if (go0Var.m1958O(i22 & 1, ((i22 & 306783379) == 306783378 && ((i24 | 3072) & 1171) == 1170) ? false : true)) {
            }
            b62VarM1996r = go0Var.m1996r();
            if (b62VarM1996r != null) {
            }
        }
        uh1Var2 = uh1Var;
        i6 = i5 & 8;
        if (i6 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        mn0Var3 = mn0Var;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i13 = i5 & AIChatConfig.DefaultMaxTokens;
        if (i13 != 0) {
        }
        i16 = i5 & 1024;
        if (i16 != 0) {
        }
        i19 = i5 & 2048;
        if (i19 != 0) {
        }
        int i3322 = i21;
        i22 = i15;
        i23 = i5 & 4096;
        if (i23 != 0) {
        }
        if (go0Var.m1958O(i22 & 1, ((i22 & 306783379) == 306783378 && ((i24 | 3072) & 1171) == 1170) ? false : true)) {
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
        }
    }

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
    /* JADX INFO: renamed from: c */
    public static final void m5358c(String str, uh1 uh1Var, nn0 nn0Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        in0 in0Var2;
        int i3;
        uh1 uh1Var2;
        nn0 nn0Var2;
        in0 in0Var3;
        ff3 ff3Var;
        str.getClass();
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(675738465);
        int i4 = i | (go0Var.m1980f(str) ? 4 : 2);
        int i5 = i4 | 28080;
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i4 | 224688;
            in0Var2 = in0Var;
        } else {
            in0Var2 = in0Var;
            i3 = i5 | (go0Var.m1984h(in0Var2) ? 131072 : 65536);
        }
        if (go0Var.m1958O(i3 & 1, (74899 & i3) != 74898)) {
            rh1 rh1Var = rh1.f9587a;
            nn0 nn0Var3 = s11.f9862b;
            in0 in0Var4 = i6 != 0 ? null : in0Var2;
            int i7 = 6;
            gu2 gu2VarM5481b = AbstractC0768uc.m5481b(0.0f, up0.m5531J(160, null, 6), "TopAppBarDividerAlpha", go0Var, 3120);
            gu2 gu2VarM5480a = AbstractC0768uc.m5480a(2.0f, up0.m5531J(160, null, 6), "TopAppBarTitleOffset", go0Var);
            gu2 gu2VarM5481b2 = AbstractC0768uc.m5481b(1.0f - (ci0.m778C(0.0f, 0.0f, 1.0f) * 0.035f), up0.m5531J(160, null, 6), "TopAppBarTitleScale", go0Var, 3120);
            tu2 tu2Var = ur1.f11452a;
            gu2 gu2VarM269a = ar2.m269a(((lp1) go0Var.m1988j(tu2Var)).f6234b, up0.m5531J(160, null, 6), "TopAppBarContainerColor", go0Var);
            yi0 yi0Var = AbstractC0731te.f10693e;
            int i8 = i3;
            long j = ((C0363ju) gu2VarM269a.getValue()).f5219a;
            iu0 iu0Var = sp0.f10267h;
            uh1 uh1VarM1896n = gf1.m1896n(yi0Var, j, iu0Var);
            WeakHashMap weakHashMap = ff3.f2953v;
            View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
            WeakHashMap weakHashMap2 = ff3.f2953v;
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
            boolean zM1984h = go0Var.m1984h(ff3Var) | go0Var.m1984h(view);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                objM1956L = new d62(9, ff3Var, view);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1450c(ff3Var, (in0) objM1956L, go0Var);
            uh1 uh1VarM5186O = AbstractC0731te.m5186O(p40.m3721c0(uh1VarM1896n, ff3Var.f2959f), 56.0f);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM5186O);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            uh1 uh1VarM1613E = fg1.m1613E(AbstractC0731te.f10695g, 8.0f, 0.0f, 2);
            C0622qk c0622qk = C0700sn.f10232t;
            ob2 ob2VarM3265a = nb2.m3265a(f10874a, c0622qk, go0Var, 48);
            int iHashCode2 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l2 = go0Var.m1990l();
            uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM1613E);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
            vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
            pb2 pb2Var = pb2.f8246a;
            uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
            nf1 nf1VarM1060d2 = AbstractC0135dm.m1060d(C0700sn.f10225m, false);
            int iHashCode3 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l3 = go0Var.m1990l();
            uh1 uh1VarM5285M3 = AbstractC0738tl.m5285M(go0Var, uh1VarM3843a);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, nf1VarM1060d2);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l3);
            vi0.m5698q(iHashCode3, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M3);
            if (in0Var4 != null) {
                go0Var.m1966W(2094852666);
                m5359d(in0Var4, go0Var, 6 | ((i8 >> 12) & 112));
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(2095028529);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
            boolean zM1980f = go0Var.m1980f(gu2VarM5480a) | go0Var.m1980f(gu2VarM5481b2);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1980f || objM1956L2 == C0520nx.f7360a) {
                objM1956L2 = new er1(gu2VarM5480a, gu2VarM5481b2, 2);
                go0Var.m1981f0(objM1956L2);
            }
            in0 in0Var5 = in0Var4;
            AbstractC0179eu.m1446a(str, AbstractC0731te.m5183L(rh1Var, (in0) objM1956L2), new m13(((lp1) go0Var.m1988j(tu2Var)).f6237e, rg3.m4450D(18), im0.f4683m, rg3.m4449C(0.5d), 0, 0L, null, null, 16777080), 0, false, 0, 0, go0Var, i8 & 14, 1016);
            uh1 uh1VarM3843a2 = pb2.m3843a(pb2Var);
            ob2 ob2VarM3265a2 = nb2.m3265a(f10875b, c0622qk, go0Var, 54);
            int iHashCode4 = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l4 = go0Var.m1990l();
            uh1 uh1VarM5285M4 = AbstractC0738tl.m5285M(go0Var, uh1VarM3843a2);
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a2);
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l4);
            vi0.m5698q(iHashCode4, go0Var, c0419lc3, go0Var, c0799v6);
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M4);
            nn0Var3.mo489e(pb2Var, go0Var, 54);
            go0Var.m1994p(true);
            go0Var.m1994p(true);
            uh1 uh1VarM5186O2 = AbstractC0731te.m5186O(new C0023am(C0700sn.f10229q, false).mo4491c(yi0Var), 1.0f);
            boolean zM1980f2 = go0Var.m1980f(gu2VarM5481b);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f2 || objM1956L3 == C0520nx.f7360a) {
                objM1956L3 = new hr1(gu2VarM5481b, i7);
                go0Var.m1981f0(objM1956L3);
            }
            AbstractC0135dm.m1057a(gf1.m1896n(AbstractC0731te.m5183L(uh1VarM5186O2, (in0) objM1956L3), ((lp1) go0Var.m1988j(tu2Var)).f6236d, iu0Var), go0Var, 0);
            go0Var.m1994p(true);
            in0Var3 = in0Var5;
            nn0Var2 = nn0Var3;
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            nn0Var2 = nn0Var;
            in0Var3 = in0Var2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0292hw(str, uh1Var2, nn0Var2, in0Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5359d(in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1520297062);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(in0Var) ? 32 : 16;
        }
        boolean z = true;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM1611C = fg1.m1611C(fg1.m1615G(rh1Var, 4.0f, 0.0f, 0.0f, 0.0f, 14).mo4491c(in0Var != null ? AbstractC0738tl.m5320s(rh1Var, new hp1(6, in0Var, z)) : rh1Var), 10.0f);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1611C);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, nf1VarM1060d);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            m5360e(null, ((lp1) go0Var.m1988j(ur1.f11452a)).f6237e, go0Var, 0);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new ge0(in0Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m5360e(uh1 uh1Var, long j, InterfaceC0596px interfaceC0596px, int i) {
        uh1 uh1Var2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-348039542);
        int i2 = i | 6 | (go0Var.m1978e(j) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM1613E = fg1.m1613E(AbstractC0731te.m5211g0(rh1Var, 18.0f), 2.0f, 0.0f, 2);
            boolean z = (i2 & 112) == 32;
            Object objM1956L = go0Var.m1956L();
            if (z || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0082c8(j, 7);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1448b(uh1VarM1613E, (in0) objM1956L, go0Var, 0);
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0952z7(uh1Var2, j, i, 4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final o62 m5361f(rz1 rz1Var, int i, q33 q33Var, y03 y03Var, boolean z, int i2) {
        o62 o62VarM6203c = y03Var != null ? y03Var.m6203c(q33Var.f8722b.mo2451p(i)) : o62.f7535e;
        float f = o62VarM6203c.f7536a;
        int iMo692T = rz1Var.mo692T(2.0f);
        return new o62(z ? (i2 - f) - iMo692T : f, o62VarM6203c.f7537b, z ? i2 - f : iMo692T + f, o62VarM6203c.f7539d);
    }

    /* JADX INFO: renamed from: g */
    public static final String m5362g(Object[] objArr, int i, int i2, AbstractC0947z2 abstractC0947z2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0947z2) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static final Object m5363h(InterfaceC0854wo interfaceC0854wo, t00 t00Var) {
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
        c0469mp.m3151u();
        c0469mp.m3153w(new r51(interfaceC0854wo, 0));
        interfaceC0854wo.mo93b(new lw0(c0469mp, 1));
        return c0469mp.m3150t();
    }

    /* JADX INFO: renamed from: i */
    public static final Object m5364i(InterfaceC0854wo interfaceC0854wo, t00 t00Var) {
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
        c0469mp.m3151u();
        c0469mp.m3153w(new r51(interfaceC0854wo, 1));
        interfaceC0854wo.mo93b(new lw0(c0469mp, 2));
        return c0469mp.m3150t();
    }

    /* JADX INFO: renamed from: m */
    public static final Object m5365m(Object obj, h63 h63Var, in0 in0Var) throws QuickJsException {
        if (obj == null) {
            return null;
        }
        C0067bt c0067bt = h63Var.f3840a;
        if (c0067bt.m592d(obj)) {
            return obj;
        }
        Class clsM3741y = p40.m3741y(c0067bt);
        if (clsM3741y.equals(Boolean.TYPE)) {
            if (obj instanceof Boolean) {
                return Boolean.valueOf(obj.equals(Boolean.TRUE));
            }
        } else if (clsM3741y.equals(Long.TYPE)) {
            if (obj instanceof Long) {
                return obj;
            }
        } else if (clsM3741y.equals(Byte.TYPE)) {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue >= -128 && jLongValue <= 127) {
                    return Byte.valueOf((byte) jLongValue);
                }
                throw new QuickJsException("Cannot cast Long(" + jLongValue + ") to Byte: value out of range.");
            }
        } else if (clsM3741y.equals(Short.TYPE)) {
            if (obj instanceof Long) {
                long jLongValue2 = ((Number) obj).longValue();
                if (jLongValue2 >= -32768 && jLongValue2 <= 32767) {
                    return Short.valueOf((short) jLongValue2);
                }
                throw new QuickJsException("Cannot cast Long(" + jLongValue2 + ") to Short: value out of range.");
            }
        } else if (clsM3741y.equals(Integer.class) || clsM3741y.equals(Integer.TYPE)) {
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
        } else if (clsM3741y.equals(Float.class) || clsM3741y.equals(Float.TYPE)) {
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
        } else if (clsM3741y.equals(Double.class) || clsM3741y.equals(Double.TYPE)) {
            if (obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Long) {
                return Double.valueOf(((Number) obj).longValue());
            }
        }
        return in0Var.mo5j(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m5366n(o12 o12Var) {
        return (o12Var.m3464b() || o12Var.f7427h || !o12Var.f7423d) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m5367o(o12 o12Var) {
        return !o12Var.f7427h && o12Var.f7423d;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m5368p(o12 o12Var) {
        return (o12Var.m3464b() || !o12Var.f7427h || o12Var.f7423d) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m5369q(o12 o12Var) {
        return o12Var.f7427h && !o12Var.f7423d;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nl1 m5370r() {
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        Signature signature;
        byte[] byteArray;
        Signature[] signingCertificateHistory;
        Signature signature2;
        try {
            x92Var = up0.f11404l;
            if (x92Var == null) {
                t11.m5067S("moduleApkPath");
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
            x92Var2 = up0.f11401i;
            if (x92Var2 == null) {
                t11.m5067S("hostContext");
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
                byteArray = (signingCertificateHistory != null || (signature2 = (Signature) AbstractC0460mg.m3097l0(signingCertificateHistory)) == null) ? null : signature2.toByteArray();
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
            if (signatureArr != null && (signature = (Signature) AbstractC0460mg.m3097l0(signatureArr)) != null) {
                byteArray = signature.toByteArray();
            }
        }
        return byteArray == null ? new nl1(null) : new nl1(MessageDigest.getInstance("SHA-256").digest(byteArray));
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m5371s(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5372t(bi0 bi0Var, int i) {
        int i2;
        MappedByteBuffer mappedByteBufferM5199a0;
        ArrayList arrayList = bi0Var.f880n;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            nm2 nm2Var = (nm2) arrayList.get(0);
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 1; i4 < size; i4++) {
                nm2 nm2Var2 = (nm2) arrayList.get(i4);
                if (nm2Var2.f7259h == nm2Var.f7260i) {
                    nm2Var.f7260i = nm2Var2.f7260i;
                } else {
                    i3++;
                    if (i3 != i4) {
                        arrayList.set(i3, nm2Var2);
                    }
                    nm2Var = nm2Var2;
                }
            }
            int i5 = i3 + 1;
            if (size > i5) {
                arrayList.subList(i5, size).clear();
            }
        }
        nm2 nm2Var3 = (nm2) arrayList.get(0);
        int i6 = nm2Var3.f7259h;
        int i7 = bi0Var.f870d;
        int i8 = i7 - bi0Var.f879m;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z = i9 < i11 + i10;
        if (!z) {
            bi0Var.f871e ^= bi0Var.f874h.m1299f(i6, i11);
        }
        int size2 = arrayList.size();
        int i12 = size2 - 1;
        int i13 = bi0Var.f870d - ((nm2) arrayList.get(i12)).f7260i;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = nm2Var3.f7259h;
        int i16 = nm2Var3.f7260i;
        int i17 = 1;
        while (i17 < size2) {
            ArrayList arrayList2 = arrayList;
            nm2 nm2Var4 = (nm2) arrayList.get(i17);
            int i18 = i17;
            int i19 = nm2Var4.f7259h - i16;
            int i20 = size2;
            byte[] bArr = (byte[]) bi0Var.f874h.f2354k;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = nm2Var4.f7260i;
            i17 = i18 + 1;
            arrayList = arrayList2;
            size2 = i20;
        }
        ArrayList arrayList3 = arrayList;
        if (i13 > 0) {
            byte[] bArr2 = (byte[]) bi0Var.f874h.f2354k;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        bi0Var.f879m = 0;
        arrayList3.clear();
        if (z) {
            bi0Var.f871e = bi0Var.f874h.m1299f(12, i9);
        } else {
            bi0Var.f871e ^= bi0Var.f874h.m1299f(i6, i10);
        }
        bi0Var.f870d = i8;
        if (bi0Var.f888v == 0) {
            bi0Var.f885s.putInt(0, -1);
            bi0Var.f885s.putLong(4, bi0Var.f871e);
            bi0Var.f885s.position(i6);
            bi0Var.f885s.put((byte[]) bi0Var.f874h.f2354k, i6, i10);
            bi0Var.f885s.putInt(0, i9);
            bi0Var.f886t.putInt(0, i9);
            bi0Var.f886t.putLong(4, bi0Var.f871e);
            bi0Var.f886t.position(i6);
            bi0Var.f886t.put((byte[]) bi0Var.f874h.f2354k, i6, i10);
        } else {
            bi0Var.f874h.m1308q(0, i9);
            bi0Var.f874h.m1309r(bi0Var.f871e, 4);
        }
        int i22 = bi0Var.f870d + i;
        if (((byte[]) bi0Var.f874h.f2354k).length - i22 > 32768) {
            int i23 = bi0.f866z;
            int iM5178G = AbstractC0731te.m5178G(i23, i22 + i23);
            byte[] bArr3 = (byte[]) bi0Var.f874h.f2354k;
            if (iM5178G >= bArr3.length) {
                i2 = 0;
            } else {
                byte[] bArr4 = new byte[iM5178G];
                i2 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, bi0Var.f870d);
                bi0Var.f874h.f2354k = bArr4;
                if (bi0Var.f888v == 0) {
                    FileChannel fileChannel = bi0Var.f883q;
                    long j = iM5178G;
                    MappedByteBuffer mappedByteBufferM5199a02 = null;
                    try {
                        fileChannel.truncate(j);
                        mappedByteBufferM5199a0 = AbstractC0731te.m5199a0(fileChannel, iM5178G);
                    } catch (IOException unused) {
                        mappedByteBufferM5199a0 = null;
                    }
                    FileChannel fileChannel2 = bi0Var.f884r;
                    try {
                        fileChannel2.truncate(j);
                        mappedByteBufferM5199a02 = AbstractC0731te.m5199a0(fileChannel2, iM5178G);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM5199a0 == null || mappedByteBufferM5199a02 == null) {
                        Log.e("FastKV", bi0Var.f868b, new Exception("map failed"));
                        AbstractC0731te.m5219k0(bi0Var);
                    } else {
                        bi0Var.f885s = mappedByteBufferM5199a0;
                        bi0Var.f886t = mappedByteBufferM5199a02;
                    }
                }
                s11.m4668M(bi0Var, "truncate finish");
            }
        }
        for (AbstractC0637qz abstractC0637qz : bi0Var.f872f.values()) {
            int i24 = abstractC0637qz.f9291a;
            if (i24 > i6) {
                int i25 = i14 - 1;
                int i26 = i2;
                while (true) {
                    if (i26 > i25) {
                        break;
                    }
                    int i27 = (i26 + i25) >>> 1;
                    int i28 = iArr[i27];
                    if (i28 >= i24) {
                        if (i28 <= i24) {
                            i25 = i27;
                            break;
                        }
                        i25 = i27 - 1;
                    } else {
                        i26 = i27 + 1;
                    }
                }
                int i29 = iArr2[i25];
                abstractC0637qz.f9291a -= i29;
                if (abstractC0637qz.mo4017a() >= 6) {
                    ((AbstractC0943yz) abstractC0637qz).f13678c -= i29;
                }
            }
        }
        s11.m4668M(bi0Var, "gc finish");
    }

    /* JADX INFO: renamed from: w */
    public static final C0067bt m5373w(yo2 yo2Var) {
        yo2Var.getClass();
        if (yo2Var instanceof zo2) {
            return m5373w(((zo2) yo2Var).f13998a);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final String m5374y() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m5375z(o12 o12Var, long j, long j2) {
        int i = o12Var.f7428i == 1 ? 1 : 0;
        long j3 = o12Var.f7422c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo1549A(Class cls);

    /* JADX INFO: renamed from: F */
    public abstract void mo2254F(C0373k3 c0373k3, C0373k3 c0373k32);

    /* JADX INFO: renamed from: G */
    public abstract void mo2255G(C0373k3 c0373k3, Thread thread);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2256j(AbstractFutureC0410l3 abstractFutureC0410l3, C0263h3 c0263h3);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2257k(AbstractFutureC0410l3 abstractFutureC0410l3, Object obj, Object obj2);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2258l(AbstractFutureC0410l3 abstractFutureC0410l3, C0373k3 c0373k3, C0373k3 c0373k32);

    /* JADX INFO: renamed from: u */
    public abstract Method mo1550u(Class cls, Field field);

    /* JADX INFO: renamed from: v */
    public abstract Constructor mo1551v(Class cls);

    /* JADX INFO: renamed from: x */
    public abstract String[] mo1552x(Class cls);
}
