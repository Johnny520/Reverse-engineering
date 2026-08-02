package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import com.dokar.quickjs.binding.JsObject;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UTFDataFormatException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf1 {

    /* JADX INFO: renamed from: a */
    public static final C0402kw f3484a = new C0402kw(-117350969, false, new C0558ow(16));

    /* JADX INFO: renamed from: b */
    public static final C0402kw f3485b = new C0402kw(311456068, false, new C0558ow(17));

    /* JADX INFO: renamed from: c */
    public static final C0612qa f3486c = new C0612qa(2);

    /* JADX INFO: renamed from: d */
    public static sx0 f3487d;

    /* JADX INFO: renamed from: e */
    public static sx0 f3488e;

    /* JADX INFO: renamed from: A */
    public static final void m1853A(j61 j61Var) {
        sp0.m4933c0(j61Var).m4347E();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m1854B(C0043b5 c0043b5) {
        try {
            boolean zM435v = c0043b5.m435v();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM435v;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM435v);
            return zM435v;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m1855C(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX INFO: renamed from: D */
    public static int m1856D(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        c80.m678v(vi0.m5689h("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static final void m1857E(t91 t91Var, k03 k03Var, us1 us1Var) {
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            z03 z03VarM5146d = t91Var.m5146d();
            if (z03VarM5146d == null) {
                return;
            }
            t03 t03Var = t91Var.f10626e;
            if (t03Var == null) {
                return;
            }
            c61 c61VarM5145c = t91Var.m5145c();
            if (c61VarM5145c == null) {
                return;
            }
            AbstractC0179eu.m1438S(k03Var, t91Var.f10622a, z03VarM5146d.f13697a, c61VarM5145c, t03Var, t91Var.m5144b(), us1Var);
        } finally {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final uh1 m1858F(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new mk0(in0Var));
    }

    /* JADX INFO: renamed from: G */
    public static final uh1 m1859G(uh1 uh1Var, in0 in0Var) {
        return uh1Var.mo4491c(new ut1(in0Var));
    }

    /* JADX INFO: renamed from: H */
    public static final Boolean m1860H(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        c80.m672p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static k31 m1861I(l41 l41Var) {
        boolean z;
        try {
            try {
                l41Var.m2814I();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (k31) v53.f11747z.mo97b(l41Var);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return a41.f49h;
                }
                throw new t31(e);
            }
        } catch (ke1 e3) {
            throw new t31(e3);
        } catch (IOException e4) {
            throw new t31(e4);
        } catch (NumberFormatException e5) {
            throw new t31(e5);
        }
    }

    /* JADX INFO: renamed from: J */
    public static final bg2 m1862J(Object obj) {
        d41 d41Var;
        Boolean boolM1860H;
        Boolean boolM1860H2;
        JsObject jsObjectM4937e0 = sp0.m4937e0("request", obj);
        JsObject jsObjectM4937e02 = sp0.m4937e0("request.media", jsObjectM4937e0.get((Object) "media"));
        Object obj2 = jsObjectM4937e02.get((Object) "metadata");
        boolean zBooleanValue = false;
        if (obj2 != null) {
            j31 j31VarM1878Z = m1878Z(obj2, "request.media.metadata", 0);
            d41Var = j31VarM1878Z instanceof d41 ? (d41) j31VarM1878Z : null;
            if (d41Var == null) {
                c80.m672p("INVALID_ARGUMENT", "request.media.metadata must be an object.", 0, null, null, 28);
                return null;
            }
        } else {
            d41Var = new d41(ce0.f1492h);
        }
        d41 d41Var2 = d41Var;
        String strM4941g0 = sp0.m4941g0("request.media.platform", jsObjectM4937e02.get((Object) "platform"));
        String strM4941g02 = sp0.m4941g0("request.media.accountId", jsObjectM4937e02.get((Object) "accountId"));
        String strM4941g03 = sp0.m4941g0("request.media.id", jsObjectM4937e02.get((Object) "id"));
        String strM4941g04 = sp0.m4941g0("request.media.kind", jsObjectM4937e02.get((Object) "kind"));
        Object obj3 = jsObjectM4937e02.get((Object) "expiresAt");
        ai2 ai2Var = new ai2(strM4941g0, strM4941g02, strM4941g03, strM4941g04, obj3 != null ? Long.valueOf(sp0.m4935d0(obj3, "request.media.expiresAt", Long.MIN_VALUE, Long.MAX_VALUE)) : null, d41Var2);
        hg2 hg2VarM2274y = i51.m2274y("request.destination", jsObjectM4937e0.get((Object) "destination"));
        fg2 fg2Var = hg2VarM2274y.f4002a;
        if (fg2Var == fg2.f2985h) {
            c80.m672p("PERMISSION_DENIED", "Media cannot be downloaded into package.", 0, null, null, 28);
            return null;
        }
        JsObject jsObjectM4920S = sp0.m4920S("request.options", jsObjectM4937e0.get((Object) "options"));
        String lowerCase = fg2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        di2 di2Var = new di2(lowerCase, hg2VarM2274y.f4003b);
        boolean zBooleanValue2 = (jsObjectM4920S == null || (boolM1860H2 = m1860H(jsObjectM4920S, "overwrite")) == null) ? false : boolM1860H2.booleanValue();
        if (jsObjectM4920S != null && (boolM1860H = m1860H(jsObjectM4920S, "createParents")) != null) {
            zBooleanValue = boolM1860H.booleanValue();
        }
        return new bg2(ai2Var, di2Var, zBooleanValue2, zBooleanValue);
    }

    /* JADX INFO: renamed from: K */
    public static final zj2 m1863K(Object obj) {
        JsObject jsObjectM4937e0 = sp0.m4937e0("request", obj);
        JsObject jsObjectM4937e02 = sp0.m4937e0("request.conversation", jsObjectM4937e0.get((Object) "conversation"));
        yf2 yf2Var = new yf2(sp0.m4941g0("request.conversation".concat(".platform"), jsObjectM4937e02.get((Object) "platform")), sp0.m4941g0("request.conversation".concat(".accountId"), jsObjectM4937e02.get((Object) "accountId")), sp0.m4941g0("request.conversation".concat(".id"), jsObjectM4937e02.get((Object) "id")), sp0.m4941g0("request.conversation".concat(".type"), jsObjectM4937e02.get((Object) "type")), sp0.m4921T(jsObjectM4937e02, "name"));
        Object obj2 = jsObjectM4937e0.get((Object) "segments");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            c80.m672p("INVALID_ARGUMENT", "request.segments must be an array.", 0, null, null, 28);
            return null;
        }
        if (list.isEmpty() || list.size() > 128) {
            c80.m672p("INVALID_ARGUMENT", "request.segments must contain 1 to 128 items.", 0, null, null, 28);
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        int i = 0;
        for (Object obj3 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            JsObject jsObjectM4937e03 = sp0.m4937e0("request.segments[" + i + "]", obj3);
            String strM4941g0 = sp0.m4941g0("request.segments[" + i + "].type", jsObjectM4937e03.get((Object) "type"));
            if (pv2.m4006s0(strM4941g0)) {
                c80.m672p("INVALID_ARGUMENT", "Message segment type must not be blank.", 0, null, null, 28);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : jsObjectM4937e03.entrySet()) {
                if (!t11.m5086l(entry.getKey(), "type")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(xe1.m6103U(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                String str = (String) entry2.getKey();
                linkedHashMap2.put(key, m1878Z(entry2.getValue(), "request.segments[" + i + "]." + str, 0));
            }
            arrayList.add(new ki2(new d41(linkedHashMap2), strM4941g0));
            i = i2;
        }
        return new zj2(yf2Var, arrayList, sp0.m4921T(jsObjectM4937e0, "replyTo"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v7 x7) = (r6v6 x7), (r6v8 x7) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v5 u23) = (r21v4 u23), (r21v6 u23) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v9 sd) = (r22v8 sd), (r22v10 sd) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v15 v8) = (r23v14 v8), (r23v16 v8) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 k00) = (r24v5 k00), (r24v7 k00) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v6 va2) = (r26v5 va2), (r26v7 va2) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [android.view.ViewStructure] */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1864L(ViewStructure viewStructure, r61 r61Var, AutofillId autofillId, String str, q62 q62Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        u23 u23Var;
        C0690sd c0690sd;
        C0801v8 c0801v8;
        C0874x7 c0874x7;
        boolean z;
        k00 k00Var;
        Boolean bool;
        va2 va2Var;
        boolean z2;
        Integer num;
        int i2;
        List list;
        ?? r13;
        String[] strArrM4905A;
        String[] strArrM4905A2;
        rk1 rk1Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        rk1 rk1Var2;
        u23 u23Var2;
        C0690sd c0690sd2;
        C0801v8 c0801v82;
        yn2 yn2Var = vn2.f12058a;
        yn2 yn2Var2 = kn2.f5659a;
        ln2 ln2VarM4391w = r61Var.m4391w();
        int i4 = 8;
        if (ln2VarM4391w == null || (rk1Var2 = ln2VarM4391w.f6221h) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            u23Var = null;
            c0690sd = null;
            c0801v8 = null;
            c0874x7 = null;
            z = false;
            k00Var = null;
            bool = null;
            va2Var = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = rk1Var2.f9619b;
            j = 128;
            Object[] objArr4 = rk1Var2.f9620c;
            long[] jArr3 = rk1Var2.f9618a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                c0874x7 = null;
                j2 = 255;
                z = false;
                u23Var2 = null;
                c0690sd2 = null;
                c0801v82 = null;
                k00Var = null;
                bool = null;
                va2Var = null;
                z2 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                yn2 yn2Var3 = (yn2) obj;
                                if (t11.m5086l(yn2Var3, vn2.f12076s)) {
                                    obj2.getClass();
                                    c0874x7 = (C0874x7) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12058a)) {
                                    obj2.getClass();
                                    String str2 = (String) AbstractC0142du.m1161q0((List) obj2);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (t11.m5086l(yn2Var3, vn2.f12075r)) {
                                    obj2.getClass();
                                    k00Var = (k00) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12077t)) {
                                    obj2.getClass();
                                    c0801v82 = (C0801v8) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12047G)) {
                                    obj2.getClass();
                                    c0690sd2 = (C0690sd) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12069l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (t11.m5086l(yn2Var3, vn2.f12056P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12052L)) {
                                    z2 = true;
                                } else if (t11.m5086l(yn2Var3, vn2.f12072o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (t11.m5086l(yn2Var3, vn2.f12083z)) {
                                    obj2.getClass();
                                    va2Var = (va2) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12050J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (t11.m5086l(yn2Var3, vn2.f12051K)) {
                                    obj2.getClass();
                                    u23Var2 = (u23) obj2;
                                } else if (t11.m5086l(yn2Var3, kn2.f5660b)) {
                                    viewStructure.setClickable(true);
                                } else if (t11.m5086l(yn2Var3, kn2.f5661c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (t11.m5086l(yn2Var3, kn2.f5681w)) {
                                    viewStructure.setFocusable(true);
                                } else if (t11.m5086l(yn2Var3, kn2.f5669k)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                c0874x7 = null;
                z = false;
                u23Var2 = null;
                c0690sd2 = null;
                c0801v82 = null;
                k00Var = null;
                bool = null;
                va2Var = null;
                z2 = false;
                num = null;
            }
            u23Var = u23Var2;
            c0690sd = c0690sd2;
            c0801v8 = c0801v82;
        }
        ln2 ln2VarM4391w2 = r61Var.m4391w();
        if (ln2VarM4391w2 != null && ln2VarM4391w2.f6223j && !ln2VarM4391w2.f6224k) {
            ln2VarM4391w2 = ln2VarM4391w2.m2947b();
            lk1 lk1Var = new lk1(((zk1) ((jk1) r61Var.m4382n()).f5084i).f13936j);
            lk1Var.m2927c(r61Var.m4382n());
            while (lk1Var.m2933i()) {
                r61 r61Var2 = (r61) lk1Var.m2935k(lk1Var.f6164b - 1);
                ln2 ln2VarM4391w3 = r61Var2.m4391w();
                if (ln2VarM4391w3 != null && !ln2VarM4391w3.f6223j) {
                    ln2VarM4391w2.m2949d(ln2VarM4391w3);
                    if (!ln2VarM4391w3.f6224k) {
                        lk1Var.m2927c(r61Var2.m4382n());
                    }
                }
            }
        }
        if (ln2VarM4391w2 == null || (rk1Var = ln2VarM4391w2.f6221h) == null) {
            i2 = 1;
            list = null;
        } else {
            Object[] objArr5 = rk1Var.f9619b;
            Object[] objArr6 = rk1Var.f9620c;
            long[] jArr4 = rk1Var.f9618a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 1;
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i10];
                    int i11 = i4;
                    List list2 = list;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i10 - length2)) >>> 31);
                        i2 = i9;
                        list = list2;
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i10 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                yn2 yn2Var4 = (yn2) obj3;
                                objArr2 = objArr5;
                                if (t11.m5086l(yn2Var4, vn2.f12067j)) {
                                    viewStructure.setEnabled(false);
                                } else if (t11.m5086l(yn2Var4, vn2.f12043C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i11;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i11;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i2 = i9;
                        i3 = i11;
                        list = list2;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i4 = i3;
                    i9 = i2;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(r61Var.f9385i);
        if (r61Var.m4389u() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = c0874x7 != null ? Integer.valueOf(c0874x7.f12854a) : z ? Integer.valueOf(i2) : u23Var != null ? Integer.valueOf(i) : null;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (c0690sd != null) {
            String strM3992H0 = c0690sd.f10051i;
            if (strM3992H0.length() >= 5000) {
                strM3992H0 = (Character.isHighSurrogate(strM3992H0.charAt(4999)) && Character.isLowSurrogate(strM3992H0.charAt(5000))) ? pv2.m3992H0(strM3992H0, 4999) : pv2.m3992H0(strM3992H0, 5000);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strM3992H0));
        }
        if (c0801v8 != null) {
            viewStructure.setAutofillValue(c0801v8.f11816a);
        }
        if (k00Var != null && (strArrM4905A2 = sp0.m4905A(k00Var)) != null) {
            viewStructure.setAutofillHints(strArrM4905A2);
        }
        q62Var.f8751b.m1313v(r61Var.f9385i, new b22(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (u23Var != null) {
            ?? r132 = i2;
            viewStructure.setCheckable(r132);
            viewStructure.setChecked(u23Var == u23.f11081h ? r132 == true ? 1 : 0 : false);
            r13 = r132;
        } else {
            ?? r133 = i2;
            r13 = r133;
            if (bool != null) {
                viewStructure.setCheckable(r133);
                viewStructure.setChecked(bool.booleanValue());
                r13 = r133;
            }
        }
        k00.f5292a.getClass();
        String[] strArrM4905A3 = sp0.m4905A(j00.f4870b);
        strArrM4905A3.getClass();
        if (strArrM4905A3.length == 0) {
            um2.m5519i("Array is empty.");
            return;
        }
        ?? r23 = (z2 || ((k00Var == null || (strArrM4905A = sp0.m4905A(k00Var)) == null || AbstractC0460mg.m3100o0(strArrM4905A, strArrM4905A3[0]) < 0) ? 0 : r13) != 0) ? r13 : 0;
        viewStructure.setDataIsSensitive((r23 != 0 || zBooleanValue) ? r13 : 0);
        viewStructure.setVisibility(((zn1) r61Var.f9372M.f12034e).m6458a1() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String strM2210i = "";
            for (int i15 = 0; i15 < size; i15++) {
                C0690sd c0690sd3 = (C0690sd) list.get(i15);
                StringBuilder sb = new StringBuilder();
                sb.append(strM2210i);
                strM2210i = hk1.m2210i(sb, c0690sd3.f10051i, '\n');
            }
            viewStructure.setText(strM2210i);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((jk1) r61Var.m4382n()).isEmpty() && va2Var != null) {
            viewStructure.setClassName("android.widget.ImageView");
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (r23 != 0) {
                viewStructure.setInputType(129);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static final Object m1865M(Object[] objArr, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        return m1866N(Arrays.copyOf(objArr, objArr.length), s11.f9865e, xm0Var, interfaceC0596px, ((i << 6) & 7168) | 384);
    }

    /* JADX INFO: renamed from: N */
    public static final Object m1866N(Object[] objArr, wc2 wc2Var, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        Object[] objArr2;
        wc2 wc2Var2;
        Object obj;
        Object objMo978d;
        go0 go0Var = (go0) interfaceC0596px;
        long j = go0Var.f3614T;
        xe1.m6127j(36);
        String string = Long.toString(j, 36);
        string.getClass();
        wc2Var.getClass();
        fc2 fc2Var = (fc2) go0Var.m1988j(hc2.f3953a);
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            Object objMo137e = (fc2Var == null || (objMo978d = fc2Var.mo978d(string)) == null) ? null : wc2Var.mo137e(objMo978d);
            if (objMo137e == null) {
                objMo137e = xm0Var.mo6a();
            }
            objArr2 = objArr;
            wc2Var2 = wc2Var;
            bc2 bc2Var = new bc2(wc2Var2, fc2Var, string, objMo137e, objArr2);
            go0Var.m1981f0(bc2Var);
            objM1956L = bc2Var;
        } else {
            objArr2 = objArr;
            wc2Var2 = wc2Var;
        }
        bc2 bc2Var2 = (bc2) objM1956L;
        Object objMo6a = Arrays.equals(objArr2, bc2Var2.f782l) ? bc2Var2.f781k : null;
        if (objMo6a == null) {
            objMo6a = xm0Var.mo6a();
        }
        boolean zM1984h = go0Var.m1984h(bc2Var2) | ((((i & 112) ^ 48) > 32 && go0Var.m1984h(wc2Var2)) || (i & 48) == 32) | go0Var.m1984h(fc2Var) | go0Var.m1980f(string) | go0Var.m1984h(objMo6a) | go0Var.m1984h(objArr2);
        Object objM1956L2 = go0Var.m1956L();
        if (zM1984h || objM1956L2 == c0160eb) {
            Object[] objArr3 = objArr2;
            obj = objMo6a;
            C0459mf c0459mf = new C0459mf(bc2Var2, wc2Var2, fc2Var, string, obj, objArr3);
            go0Var.m1981f0(c0459mf);
            objM1956L2 = c0459mf;
        } else {
            obj = objMo6a;
        }
        AbstractC0179eu.m1468r((xm0) objM1956L2, go0Var);
        return obj;
    }

    /* JADX INFO: renamed from: O */
    public static final Object m1867O(Object[] objArr, wc2 wc2Var, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        return m1866N(Arrays.copyOf(objArr, objArr.length), wc2Var, xm0Var, interfaceC0596px, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: P */
    public static final nl2 m1868P(InterfaceC0596px interfaceC0596px) {
        Object[] objArr = new Object[0];
        boolean zM1976d = ((go0) interfaceC0596px).m1976d(0);
        go0 go0Var = (go0) interfaceC0596px;
        Object objM1956L = go0Var.m1956L();
        if (zM1976d || objM1956L == C0520nx.f7360a) {
            objM1956L = new hn1(14);
            go0Var.m1981f0(objM1956L);
        }
        return (nl2) m1867O(objArr, nl2.f7215j, (xm0) objM1956L, go0Var, 0);
    }

    /* JADX INFO: renamed from: Q */
    public static int m1869Q(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C0676s.m4651j("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: R */
    public static long m1870R(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C0676s.m4651j("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: S */
    public static Bitmap m1871S(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = np0.f7277a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    fg1.m1640o("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(np0.f7277a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM1581u = AbstractC0195f9.m1581u(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM1581u.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM1581u.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM1581u.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM1581u.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM1581u.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM1581u.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM1581u.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM1581u;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: T */
    public static final void m1872T(o03 o03Var, t91 t91Var, k03 k03Var, xx0 xx0Var, us1 us1Var) {
        sz0 sz0Var = t91Var.f10625d;
        n10 n10Var = t91Var.f10643v;
        n10 n10Var2 = t91Var.f10644w;
        o72 o72Var = new o72();
        C0444m0 c0444m0 = new C0444m0(sz0Var, n10Var, o72Var);
        v02 v02Var = o03Var.f7408a;
        v02Var.mo2881f(k03Var, xx0Var, c0444m0, n10Var2);
        t03 t03Var = new t03(o03Var, v02Var);
        o03Var.f7409b.set(t03Var);
        o72Var.f7574i = t03Var;
        t91Var.f10626e = t03Var;
        m1857E(t91Var, k03Var, us1Var);
    }

    /* JADX INFO: renamed from: U */
    public static final long m1873U(x13 x13Var) {
        return sp0.m4930b(Color.HSVToColor(new float[]{ci0.m778C(x13Var.f12767a, 0.0f, 359.999f), ci0.m778C(x13Var.f12768b, 0.0f, 1.0f), ci0.m778C(x13Var.f12769c, 0.0f, 1.0f)}));
    }

    /* JADX INFO: renamed from: V */
    public static final x13 m1874V(String str) {
        C0363ju c0363juM3758N = AbstractC0570p7.m3758N(str);
        if (c0363juM3758N == null) {
            return null;
        }
        long j = c0363juM3758N.f5219a;
        float[] fArr = new float[3];
        Color.colorToHSV(sp0.m4947j0(j), fArr);
        return new x13(ci0.m778C(fArr[0], 0.0f, 359.999f), ci0.m778C(fArr[1], 0.0f, 1.0f), ci0.m778C(fArr[2], 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: W */
    public static final JsObject m1875W(yf2 yf2Var) {
        return new JsObject(we1.m5876q0(new ow1("platform", yf2Var.f13438a), new ow1("accountId", yf2Var.f13439b), new ow1("id", yf2Var.f13440c), new ow1("type", yf2Var.f13441d), new ow1("name", yf2Var.f13442e)));
    }

    /* JADX INFO: renamed from: X */
    public static final JsObject m1876X(ci2 ci2Var, jh2 jh2Var) {
        ci2Var.getClass();
        jh2Var.getClass();
        ow1 ow1Var = new ow1("eventId", ci2Var.f1572a);
        ow1 ow1Var2 = new ow1("receivedAt", Long.valueOf(ci2Var.f1573b));
        ow1 ow1Var3 = new ow1("platform", "wechat");
        id2 id2Var = ci2Var.f1574c;
        ow1 ow1Var4 = new ow1("account", new JsObject(we1.m5876q0(new ow1("platform", "wechat"), new ow1("id", id2Var.f4573a), new ow1("name", id2Var.f4574b))));
        ow1 ow1Var5 = new ow1("conversation", m1875W(ci2Var.f1575d));
        cl2 cl2Var = ci2Var.f1576e;
        ow1 ow1Var6 = new ow1("sender", new JsObject(we1.m5876q0(new ow1("id", cl2Var.f1616a), new ow1("name", null), new ow1("displayName", null), new ow1("isSelf", Boolean.valueOf(cl2Var.f1617b)))));
        ti2 ti2Var = ci2Var.f1577f;
        ow1 ow1Var7 = new ow1("id", ti2Var.f10788a);
        ow1 ow1Var8 = new ow1("timestamp", Long.valueOf(ti2Var.f10789b));
        ow1 ow1Var9 = new ow1("direction", "incoming");
        ow1 ow1Var10 = new ow1("text", ti2Var.f10790c);
        List<ei2> list = ti2Var.f10791d;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        for (ei2 ei2Var : list) {
            pe1 pe1Var = new pe1();
            ei2Var.getClass();
            ow1 ow1Var11 = ow1Var4;
            pe1Var.put("type", "text");
            for (Iterator it = ei2Var.f2457a.f1861h.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                pe1Var.put((String) entry.getKey(), t11.m5069U((j31) entry.getValue()));
            }
            arrayList.add(new JsObject(pe1Var.m3852b()));
            ow1Var4 = ow1Var11;
        }
        return new JsObject(we1.m5876q0(ow1Var, ow1Var2, ow1Var3, ow1Var4, ow1Var5, ow1Var6, new ow1("message", new JsObject(we1.m5876q0(ow1Var7, ow1Var8, ow1Var9, ow1Var10, new ow1("segments", arrayList)))), new ow1("rawMessage", jh2Var.m2499a(ci2Var.f1578g))));
    }

    /* JADX INFO: renamed from: Y */
    public static final JsObject m1877Y(ak2 ak2Var) {
        ak2Var.getClass();
        return new JsObject(we1.m5876q0(new ow1("id", null), new ow1("timestamp", Long.valueOf(ak2Var.f238a)), new ow1("conversation", m1875W(ak2Var.f239b))));
    }

    /* JADX INFO: renamed from: Z */
    public static final j31 m1878Z(Object obj, String str, int i) {
        if (i > 16) {
            c80.m672p("INVALID_ARGUMENT", str.concat(" is nested too deeply."), 0, null, null, 28);
            return null;
        }
        if (obj == null) {
            return z31.INSTANCE;
        }
        if (obj instanceof String) {
            return l31.m2795c((String) obj);
        }
        if (obj instanceof Boolean) {
            return l31.m2793a((Boolean) obj);
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
                return l31.m2794b(number);
            }
            c80.m672p("INVALID_ARGUMENT", str.concat(" must be finite."), 0, null, null, 28);
            return null;
        }
        if (obj instanceof JsObject) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str2 = (String) entry.getKey();
                linkedHashMap.put(key, m1878Z(entry.getValue(), str + "." + str2, i + 1));
            }
            return new d41(linkedHashMap);
        }
        if (!(obj instanceof List)) {
            throw new sd2("INVALID_ARGUMENT", str + " contains unsupported value type " + obj.getClass().getName() + ".", false, null, null, 28);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
        int i2 = 0;
        for (Object obj2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            arrayList.add(m1878Z(obj2, str + "[" + i2 + "]", i + 1));
            i2 = i3;
        }
        return new z21(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0605 A[PHI: r12 r22 r24
  0x0605: PHI (r12v22 xx0) = (r12v15 xx0), (r12v23 xx0) binds: [B:280:0x0603, B:277:0x05f4] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r22v7 boolean) = (r22v2 boolean), (r22v9 boolean) binds: [B:280:0x0603, B:277:0x05f4] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r24v11 o03) = (r24v2 o03), (r24v12 o03) binds: [B:280:0x0603, B:277:0x05f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0624 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0853 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x09c0  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1879a(final k03 k03Var, final in0 in0Var, final uh1 uh1Var, final m13 m13Var, final wb3 wb3Var, final in0 in0Var2, final ft2 ft2Var, final boolean z, final int i, final int i2, final xx0 xx0Var, final k51 k51Var, final boolean z2, final boolean z3, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i3, final int i4) {
        int i5;
        int i6;
        go0 go0Var;
        int i7;
        C0690sd c0690sd;
        f13 f13Var;
        go0 go0Var2;
        tz2 tz2Var;
        q33 q33Var;
        us1 us1Var;
        int i8;
        int i9;
        o03 o03Var;
        xl0 xl0Var;
        C0416l9 c0416l9;
        yk0 yk0Var;
        td3 td3Var;
        C0690sd c0690sd2;
        Object t91Var;
        long j;
        e70 e70Var;
        m13 m13Var2;
        boolean z4;
        gl0 gl0Var;
        C0160eb c0160eb;
        long j2;
        boolean z5;
        iz2 iz2Var;
        sz0 sz0Var;
        f13 f13Var2;
        long j3;
        boolean z6;
        boolean z7;
        yk0 yk0Var2;
        k03 k03Var2;
        k03 k03VarM2598a;
        Object objM1956L;
        C0160eb c0160eb2;
        w73 w73Var;
        Object objM1956L2;
        Object objM1956L3;
        Object objM1956L4;
        w73 w73Var2;
        p02 p02Var;
        boolean z8;
        int i10;
        xx0 xx0Var2;
        boolean z9;
        o03 o03Var2;
        boolean zM1984h;
        Object obj;
        go0 go0Var3;
        final t91 t91Var2;
        gl0 gl0Var2;
        int i11;
        C0160eb c0160eb3;
        int i12;
        w73 w73Var3;
        int i13;
        C0548om c0548om;
        j20 j20Var;
        us1 us1Var2;
        k03 k03Var3;
        b03 b03Var;
        boolean z10;
        o03 o03Var3;
        xx0 xx0Var3;
        t91 t91Var3;
        boolean z11;
        boolean z12;
        Object c0793v0;
        b03 b03Var2;
        uh1 uh1Var2;
        final t91 t91Var4;
        xk1 xk1Var;
        o03 o03Var4;
        final b03 b03Var3;
        final us1 us1Var3;
        final td3 td3Var2;
        boolean zM1984h2;
        Object objM1956L5;
        td3 td3Var3;
        uh1 uh1VarM5320s;
        final t91 t91Var5;
        uh1 uh1VarM5320s2;
        boolean zM1984h3;
        Object objM1956L6;
        int i14;
        int i15;
        Object objM1956L7;
        int i16;
        xx0 xx0Var4;
        boolean z13;
        boolean zBooleanValue;
        C0416l9 c0416l92;
        boolean zM1982g;
        Object objM1956L8;
        uh1 uh1VarMo4491c;
        Object ft2Var2;
        long j4;
        boolean zM1984h4;
        Object objM1956L9;
        int i17;
        boolean z14;
        long j5 = k03Var.f5297b;
        f13 f13Var3 = k03Var.f5298c;
        C0690sd c0690sd3 = k03Var.f5296a;
        go0 go0Var4 = (go0) interfaceC0596px;
        go0Var4.m1967X(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (go0Var4.m1980f(k03Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= go0Var4.m1984h(in0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= go0Var4.m1980f(uh1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= go0Var4.m1980f(m13Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= go0Var4.m1980f(wb3Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= go0Var4.m1984h(in0Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= go0Var4.m1980f(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= go0Var4.m1980f(ft2Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= go0Var4.m1982g(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= go0Var4.m1976d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (go0Var4.m1976d(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= go0Var4.m1980f(xx0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= go0Var4.m1980f(k51Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= go0Var4.m1982g(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= go0Var4.m1982g(z3) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= go0Var4.m1984h(c0402kw) ? 131072 : 65536;
        }
        int i18 = i6 | 1572864;
        if (go0Var4.m1958O(i5 & 1, ((i5 & 306783379) == 306783378 && (i18 & 599187) == 599186) ? false : true)) {
            go0Var4.m1963T();
            if ((i3 & 1) != 0 && !go0Var4.m2003y()) {
                go0Var4.m1961R();
            }
            go0Var4.m1995q();
            Object objM1956L10 = go0Var4.m1956L();
            C0160eb c0160eb4 = C0520nx.f7360a;
            if (objM1956L10 == c0160eb4) {
                objM1956L10 = new gl0();
                go0Var4.m1981f0(objM1956L10);
            }
            gl0 gl0Var3 = (gl0) objM1956L10;
            Object objM1956L11 = go0Var4.m1956L();
            if (objM1956L11 == c0160eb4) {
                o91 o91Var = p91.f8043a;
                objM1956L11 = new C0416l9();
                go0Var4.m1981f0(objM1956L11);
            }
            C0416l9 c0416l93 = (C0416l9) objM1956L11;
            Object objM1956L12 = go0Var4.m1956L();
            if (objM1956L12 == c0160eb4) {
                objM1956L12 = new o03(c0416l93);
                go0Var4.m1981f0(objM1956L12);
            }
            o03 o03Var5 = (o03) objM1956L12;
            e70 e70Var2 = (e70) go0Var4.m1988j(AbstractC0441ly.f6382h);
            xl0 xl0Var2 = (xl0) go0Var4.m1988j(AbstractC0441ly.f6385k);
            long j6 = ((g13) go0Var4.m1988j(h13.f3782a)).f3252b;
            yk0 yk0Var3 = (yk0) go0Var4.m1988j(AbstractC0441ly.f6383i);
            td3 td3Var4 = (td3) go0Var4.m1988j(AbstractC0441ly.f6395u);
            bt2 bt2Var = (bt2) go0Var4.m1988j(AbstractC0441ly.f6391q);
            qv1 qv1Var = qv1.f9205h;
            qv1 qv1Var2 = (i == 1 && !z && xx0Var.f13214a) ? qv1.f9206i : qv1Var;
            go0Var4.m1966W(-213744626);
            Object[] objArr = {qv1Var2};
            dq1 dq1Var = tz2.f11012g;
            boolean zM1976d = go0Var4.m1976d(qv1Var2.ordinal());
            Object objM1956L13 = go0Var4.m1956L();
            if (zM1976d || objM1956L13 == c0160eb4) {
                objM1956L13 = new C0727ta(4, qv1Var2);
                go0Var4.m1981f0(objM1956L13);
            }
            tz2 tz2Var2 = (tz2) m1867O(objArr, dq1Var, (xm0) objM1956L13, go0Var4, 0);
            go0Var4.m1994p(false);
            if (((qv1) tz2Var2.f11018f.getValue()) != qv1Var2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(qv1Var2 == qv1Var ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i19 = i5 & 14;
            boolean z15 = (i19 == 4) | ((i5 & 57344) == 16384);
            Object objM1956L14 = go0Var4.m1956L();
            if (z15 || objM1956L14 == c0160eb4) {
                q33 q33VarM2887a = l93.m2887a(wb3Var, c0690sd3);
                us1 us1Var4 = q33VarM2887a.f8722b;
                if (f13Var3 != null) {
                    long j7 = f13Var3.f2739a;
                    int i20 = f13.f2738c;
                    i7 = i19;
                    f13Var = f13Var3;
                    int iMo2451p = us1Var4.mo2451p((int) (j7 >> 32));
                    int iMo2451p2 = us1Var4.mo2451p((int) (j7 & 4294967295L));
                    int iMin = Math.min(iMo2451p, iMo2451p2);
                    int iMax = Math.max(iMo2451p, iMo2451p2);
                    C0615qd c0615qd = new C0615qd(q33VarM2887a.f8721a);
                    c0690sd = c0690sd3;
                    c0615qd.f8898i.add(new C0576pd(iMin, iMax, new lt2(0L, 0L, (im0) null, (gm0) null, (hm0) null, (mx2) null, (String) null, 0L, (C0888xj) null, (m03) null, (kc1) null, 0L, gz2.f3747c, (bq2) null, 61439), ""));
                    objM1956L14 = new q33(c0615qd.m4138b(), us1Var4);
                } else {
                    i7 = i19;
                    c0690sd = c0690sd3;
                    f13Var = f13Var3;
                    objM1956L14 = q33VarM2887a;
                }
                go0Var4.m1981f0(objM1956L14);
            } else {
                i7 = i19;
                c0690sd = c0690sd3;
                f13Var = f13Var3;
            }
            q33 q33Var2 = (q33) objM1956L14;
            C0690sd c0690sd4 = q33Var2.f8721a;
            us1 us1Var5 = q33Var2.f8722b;
            b62 b62VarM2002x = go0Var4.m2002x();
            if (b62VarM2002x == null) {
                C0676s.m4653l("no recompose scope found");
                return;
            }
            b62VarM2002x.f614b |= 1;
            boolean zM1980f = go0Var4.m1980f(bt2Var);
            Object objM1956L15 = go0Var4.m1956L();
            if (zM1980f || objM1956L15 == c0160eb4) {
                go0Var2 = go0Var4;
                tz2Var = tz2Var2;
                q33Var = q33Var2;
                us1Var = us1Var5;
                i8 = i18;
                i9 = i7;
                o03Var = o03Var5;
                xl0Var = xl0Var2;
                c0416l9 = c0416l93;
                yk0Var = yk0Var3;
                td3Var = td3Var4;
                c0690sd2 = c0690sd;
                j = j5;
                e70Var = e70Var2;
                m13Var2 = m13Var;
                z4 = z;
                gl0Var = gl0Var3;
                c0160eb = c0160eb4;
                j2 = j6;
                t91Var = new t91(new iz2(c0690sd4, m13Var2, z4, e70Var, xl0Var, 0), b62VarM2002x, bt2Var);
                go0Var2.m1981f0(t91Var);
            } else {
                m13Var2 = m13Var;
                z4 = z;
                go0Var2 = go0Var4;
                tz2Var = tz2Var2;
                q33Var = q33Var2;
                us1Var = us1Var5;
                i8 = i18;
                i9 = i7;
                o03Var = o03Var5;
                xl0Var = xl0Var2;
                c0416l9 = c0416l93;
                yk0Var = yk0Var3;
                td3Var = td3Var4;
                c0690sd2 = c0690sd;
                t91Var = objM1956L15;
                j = j5;
                e70Var = e70Var2;
                gl0Var = gl0Var3;
                c0160eb = c0160eb4;
                j2 = j6;
            }
            t91 t91Var6 = (t91) t91Var;
            t91Var6.f10642u = in0Var;
            t91Var6.f10647z = j2;
            C0043b5 c0043b5 = t91Var6.f10639r;
            c0043b5.f563j = k51Var;
            c0043b5.f564k = yk0Var;
            t91Var6.f10631j = c0690sd2;
            iz2 iz2Var2 = t91Var6.f10622a;
            if (t11.m5086l(iz2Var2.f4847a, c0690sd4) && t11.m5086l(iz2Var2.f4848b, m13Var2) && iz2Var2.f4851e == z4) {
                z5 = true;
                if (iz2Var2.f4852f == 1 && iz2Var2.f4849c == Integer.MAX_VALUE && iz2Var2.f4850d == 1 && t11.m5086l(iz2Var2.f4853g, e70Var) && t11.m5086l(iz2Var2.f4855i, be0.f819h) && iz2Var2.f4854h == xl0Var) {
                    iz2Var = iz2Var2;
                }
                m13 m13Var3 = m13Var2;
                final e70 e70Var3 = e70Var;
                if (t91Var6.f10622a != iz2Var) {
                    t91Var6.f10637p = z5;
                }
                t91Var6.f10622a = iz2Var;
                sz0Var = t91Var6.f10625d;
                t03 t03Var = t91Var6.f10626e;
                f13Var2 = f13Var;
                boolean zM5086l = t11.m5086l(f13Var2, ((sd0) sz0Var.f10437j).m4802h());
                if (t11.m5086l(((k03) sz0Var.f10436i).f5296a.f10051i, c0690sd2.f10051i)) {
                    j3 = j;
                    sz0Var.f10437j = new sd0(c0690sd2, j3);
                    z7 = z5;
                    z6 = false;
                } else {
                    j3 = j;
                    if (f13.m1493b(((k03) sz0Var.f10436i).f5297b, j3)) {
                        z6 = false;
                    } else {
                        ((sd0) sz0Var.f10437j).m4806l(f13.m1497f(j3), f13.m1496e(j3));
                        z6 = true;
                    }
                    z7 = false;
                }
                if (f13Var2 != null) {
                    sd0 sd0Var = (sd0) sz0Var.f10437j;
                    sd0Var.f10057d = -1;
                    sd0Var.f10058e = -1;
                } else {
                    long j8 = f13Var2.f2739a;
                    if (!f13.m1494c(j8)) {
                        yk0Var2 = yk0Var;
                        ((sd0) sz0Var.f10437j).m4805k(f13.m1497f(j8), f13.m1496e(j8));
                    }
                    if (z7 || !(z6 || zM5086l)) {
                        sd0 sd0Var2 = (sd0) sz0Var.f10437j;
                        sd0Var2.f10057d = -1;
                        sd0Var2.f10058e = -1;
                        k03Var2 = k03Var;
                        k03VarM2598a = k03.m2598a(k03Var2, null, 0L, 3);
                    } else {
                        k03Var2 = k03Var;
                        k03VarM2598a = k03Var2;
                    }
                    k03 k03Var4 = (k03) sz0Var.f10436i;
                    sz0Var.f10436i = k03VarM2598a;
                    if (t03Var != null) {
                        t03Var.m5048a(k03Var4, k03VarM2598a);
                    }
                    objM1956L = go0Var2.m1956L();
                    c0160eb2 = c0160eb;
                    if (objM1956L == c0160eb2) {
                        objM1956L = new w73();
                        go0Var2.m1981f0(objM1956L);
                    }
                    w73Var = (w73) objM1956L;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (w73Var.f12390e) {
                        w73Var.f12389d = Long.valueOf(jCurrentTimeMillis);
                        w73Var.m5860a(k03Var2);
                        objM1956L2 = go0Var2.m1956L();
                        if (objM1956L2 == c0160eb2) {
                            objM1956L2 = AbstractC0179eu.m1422C(go0Var2);
                            go0Var2.m1981f0(objM1956L2);
                        }
                        final j20 j20Var2 = (j20) objM1956L2;
                        objM1956L3 = go0Var2.m1956L();
                        if (objM1956L3 == c0160eb2) {
                            objM1956L3 = new C0548om();
                            go0Var2.m1981f0(objM1956L3);
                        }
                        final C0548om c0548om2 = (C0548om) objM1956L3;
                        objM1956L4 = go0Var2.m1956L();
                        if (objM1956L4 == c0160eb2) {
                            objM1956L4 = new b03(w73Var);
                            go0Var2.m1981f0(objM1956L4);
                        }
                        final b03 b03Var4 = (b03) objM1956L4;
                        final us1 us1Var6 = us1Var;
                        b03Var4.f481b = us1Var6;
                        b03Var4.f485f = wb3Var;
                        b03Var4.f482c = t91Var6.f10643v;
                        b03Var4.f483d = t91Var6;
                        b03Var4.f484e.setValue(k03Var2);
                        b03Var4.f502w = new f13(j3);
                        b03Var4.f487h = (InterfaceC0668rt) go0Var2.m1988j(AbstractC0441ly.f6380f);
                        b03Var4.f488i = j20Var2;
                        b03Var4.f490k = (bs0) go0Var2.m1988j(AbstractC0441ly.f6386l);
                        gl0 gl0Var4 = gl0Var;
                        b03Var4.f491l = gl0Var4;
                        final boolean z16 = !z3;
                        b03Var4.f492m.setValue(Boolean.valueOf(z16));
                        b03Var4.f493n.setValue(Boolean.valueOf(z2));
                        go0Var2.m1966W(1966756105);
                        kc1 kc1Var = m13Var3.f6435a.f6311k;
                        tu2 tu2Var = r02.f9309a;
                        go0Var2.m1966W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                            go0Var2.m1994p(false);
                            w73Var2 = w73Var;
                            z8 = false;
                            p02Var = null;
                        } else {
                            Context context = (Context) go0Var2.m1988j(AbstractC0646r7.f9411b);
                            a20 a20Var = (a20) go0Var2.m1988j(r02.f9309a);
                            boolean zM1980f2 = go0Var2.m1980f(a20Var) | go0Var2.m1980f(context) | go0Var2.m1980f(kc1Var);
                            w73Var2 = w73Var;
                            Object objM1956L16 = go0Var2.m1956L();
                            if (zM1980f2 || objM1956L16 == c0160eb2) {
                                r02.f9310b.getClass();
                                objM1956L16 = new p02(a20Var, context, rm2.f9647h, kc1Var);
                                go0Var2.m1981f0(objM1956L16);
                            }
                            p02Var = (p02) objM1956L16;
                            z8 = false;
                            go0Var2.m1994p(false);
                        }
                        b03Var4.f489j = p02Var;
                        go0Var2.m1994p(z8);
                        t91Var6.m5144b();
                        int i21 = i8;
                        int i22 = i21 & 7168;
                        boolean zM1984h5 = go0Var2.m1984h(t91Var6) | (i22 != 2048 ? true : z8) | ((i21 & 57344) != 16384);
                        o03 o03Var6 = o03Var;
                        int i23 = i9;
                        boolean zM1984h6 = zM1984h5 | go0Var2.m1984h(o03Var6) | (i23 != 4);
                        i10 = (i21 & 112) ^ 48;
                        if (i10 <= 32) {
                            xx0Var2 = xx0Var;
                            if (go0Var2.m1980f(xx0Var2)) {
                                z9 = zM1984h6;
                                o03Var2 = o03Var6;
                            }
                            zM1984h = z9 | z | go0Var2.m1984h(us1Var6) | go0Var2.m1984h(j20Var2) | go0Var2.m1984h(c0548om2) | go0Var2.m1984h(b03Var4);
                            Object objM1956L17 = go0Var2.m1956L();
                            if (zM1984h || objM1956L17 == c0160eb2) {
                                final xx0 xx0Var5 = xx0Var2;
                                go0Var3 = go0Var2;
                                t91Var2 = t91Var6;
                                gl0Var2 = gl0Var4;
                                i11 = i22;
                                c0160eb3 = c0160eb2;
                                i12 = i23;
                                w73Var3 = w73Var2;
                                final o03 o03Var7 = o03Var2;
                                i13 = i21;
                                obj = new in0() { // from class: h10
                                    @Override // p000.in0
                                    /* JADX INFO: renamed from: j */
                                    public final Object mo5j(Object obj2) {
                                        z03 z03VarM5146d;
                                        kl0 kl0Var = (kl0) obj2;
                                        t91 t91Var7 = t91Var2;
                                        boolean zM5144b = t91Var7.m5144b();
                                        boolean zM2718a = kl0Var.m2718a();
                                        a83 a83Var = a83.f116a;
                                        if (zM5144b != zM2718a) {
                                            t91Var7.f10627f.setValue(Boolean.valueOf(kl0Var.m2718a()));
                                            boolean zM5144b2 = t91Var7.m5144b();
                                            k03 k03Var5 = k03Var;
                                            us1 us1Var7 = us1Var6;
                                            if (zM5144b2 && z2 && !z3) {
                                                gf1.m1872T(o03Var7, t91Var7, k03Var5, xx0Var5, us1Var7);
                                            } else {
                                                gf1.m1901s(t91Var7);
                                            }
                                            if (kl0Var.m2718a() && (z03VarM5146d = t91Var7.m5146d()) != null) {
                                                AbstractC0570p7.m3745A(j20Var2, null, new C0793v0(c0548om2, k03Var5, t91Var7, z03VarM5146d, us1Var7, (t00) null), 3);
                                            }
                                            if (!kl0Var.m2718a()) {
                                                b03Var4.m343g(null);
                                            }
                                        }
                                        return a83Var;
                                    }
                                };
                                c0548om = c0548om2;
                                j20Var = j20Var2;
                                us1Var2 = us1Var6;
                                k03Var3 = k03Var;
                                b03Var = b03Var4;
                                z10 = z2;
                                o03Var3 = o03Var7;
                                xx0Var3 = xx0Var5;
                                go0Var3.m1981f0(obj);
                            } else {
                                c0160eb3 = c0160eb2;
                                i12 = i23;
                                c0548om = c0548om2;
                                xx0Var3 = xx0Var2;
                                t91Var2 = t91Var6;
                                w73Var3 = w73Var2;
                                go0Var3 = go0Var2;
                                obj = objM1956L17;
                                i13 = i21;
                                j20Var = j20Var2;
                                gl0Var2 = gl0Var4;
                                us1Var2 = us1Var6;
                                b03Var = b03Var4;
                                o03Var3 = o03Var2;
                                k03Var3 = k03Var;
                                i11 = i22;
                                z10 = z2;
                            }
                            uh1 uh1VarM6142s = xe1.m6142s(m1858F(fg1.m1648w(gl0Var2), (in0) obj), z10);
                            xk1 xk1VarM3601x = op0.m3601x(Boolean.valueOf((z10 || z3) ? false : true), go0Var3);
                            boolean zM1980f3 = go0Var3.m1980f(xk1VarM3601x) | go0Var3.m1984h(t91Var2) | go0Var3.m1984h(o03Var3) | go0Var3.m1984h(b03Var);
                            if (i10 > 32 || !go0Var3.m1980f(xx0Var3)) {
                                t91Var3 = t91Var2;
                                if ((i13 & 48) != 32) {
                                    z11 = false;
                                }
                                z12 = z11 | zM1980f3;
                                Object objM1956L18 = go0Var3.m1956L();
                                if (z12 || objM1956L18 == c0160eb3) {
                                    o03 o03Var8 = o03Var3;
                                    b03 b03Var5 = b03Var;
                                    xx0 xx0Var6 = xx0Var3;
                                    b03Var2 = b03Var5;
                                    uh1Var2 = uh1VarM6142s;
                                    t91Var4 = t91Var3;
                                    c0793v0 = new C0793v0(t91Var4, xk1VarM3601x, o03Var8, b03Var2, xx0Var6, (t00) null);
                                    xk1Var = xk1VarM3601x;
                                    o03Var3 = o03Var8;
                                    go0Var3.m1981f0(c0793v0);
                                } else {
                                    c0793v0 = objM1956L18;
                                    b03Var2 = b03Var;
                                    uh1Var2 = uh1VarM6142s;
                                    t91Var4 = t91Var3;
                                    xk1Var = xk1VarM3601x;
                                }
                                AbstractC0179eu.m1456f(go0Var3, (mn0) c0793v0, a83.f116a);
                                C0647r8 c0647r8 = new C0647r8(1, new n10(t91Var4, 4));
                                rh1 rh1Var = rh1.f9587a;
                                uh1 uh1VarM5804a = vw2.m5804a(rh1Var, 8675309, c0647r8);
                                o03Var4 = o03Var3;
                                final gl0 gl0Var5 = gl0Var2;
                                b03Var3 = b03Var2;
                                final boolean z17 = z10;
                                us1Var3 = us1Var2;
                                j20 j20Var3 = j20Var;
                                uh1 uh1VarMo4491c2 = (!z2 ? AbstractC0738tl.m5320s(uh1VarM5804a, new wt0(10, new in0() { // from class: oz2
                                    @Override // p000.in0
                                    /* JADX INFO: renamed from: j */
                                    public final Object mo5j(Object obj2) {
                                        bt2 bt2Var2;
                                        rs1 rs1Var = (rs1) obj2;
                                        t91 t91Var7 = t91Var4;
                                        if (!t91Var7.m5144b()) {
                                            gl0.m1938a(gl0Var5);
                                        } else if (!z3 && (bt2Var2 = t91Var7.f10624c) != null) {
                                            ((v60) bt2Var2).m5626b();
                                        }
                                        if (t91Var7.m5144b() && z17) {
                                            if (t91Var7.m5143a() != tr0.f10907i) {
                                                z03 z03VarM5146d = t91Var7.m5146d();
                                                if (z03VarM5146d != null) {
                                                    long j9 = rs1Var.f9744a;
                                                    sz0 sz0Var2 = t91Var7.f10625d;
                                                    n10 n10Var = t91Var7.f10643v;
                                                    int iMo2449n = us1Var3.mo2449n(z03VarM5146d.m6376b(j9, true));
                                                    n10Var.mo5j(k03.m2598a((k03) sz0Var2.f10436i, null, fg1.m1636i(iMo2449n, iMo2449n), 5));
                                                    if (t91Var7.f10622a.f4847a.f10051i.length() > 0) {
                                                        t91Var7.f10632k.setValue(tr0.f10908j);
                                                    }
                                                }
                                            } else {
                                                b03Var3.m343g(rs1Var);
                                            }
                                        }
                                        return a83.f116a;
                                    }
                                })) : uh1VarM5804a).mo4491c(new uw2(b03Var3.f478A, b03Var3.f505z, new C0647r8(4, b03Var3), 4));
                                m12.f6433a.getClass();
                                uh1 uh1VarMo4491c3 = uh1VarMo4491c2.mo4491c(new k12());
                                final uh1 uh1VarM4264s = qp0.m4264s(rh1Var, new C0444m0(t91Var4, k03Var3, us1Var3, 5));
                                td3Var2 = td3Var;
                                zM1984h2 = go0Var3.m1984h(t91Var4) | (i11 != 2048) | go0Var3.m1980f(td3Var2) | go0Var3.m1984h(b03Var3) | (i12 != 4) | go0Var3.m1984h(us1Var3);
                                objM1956L5 = go0Var3.m1956L();
                                if (!zM1984h2 || objM1956L5 == c0160eb3) {
                                    final k03 k03Var5 = k03Var3;
                                    in0 in0Var3 = new in0() { // from class: i10
                                        @Override // p000.in0
                                        /* JADX INFO: renamed from: j */
                                        public final Object mo5j(Object obj2) {
                                            t03 t03Var2;
                                            c61 c61Var;
                                            c61 c61Var2;
                                            t91 t91Var7 = t91Var4;
                                            nx1 nx1Var = t91Var7.f10636o;
                                            c61 c61Var3 = (c61) obj2;
                                            t91Var7.f10629h = c61Var3;
                                            z03 z03VarM5146d = t91Var7.m5146d();
                                            if (z03VarM5146d != null) {
                                                z03VarM5146d.f13698b = c61Var3;
                                            }
                                            if (z2) {
                                                tr0 tr0VarM5143a = t91Var7.m5143a();
                                                tr0 tr0Var = tr0.f10907i;
                                                b03 b03Var6 = b03Var3;
                                                k03 k03Var6 = k03Var5;
                                                if (tr0VarM5143a == tr0Var) {
                                                    if (((Boolean) t91Var7.f10633l.getValue()).booleanValue() && ((Boolean) ((k91) td3Var2).f5408a.getValue()).booleanValue()) {
                                                        b03Var6.m354r();
                                                    } else {
                                                        b03Var6.m351o();
                                                    }
                                                    t91Var7.f10634m.setValue(Boolean.valueOf(s11.m4670O(b03Var6, true)));
                                                    t91Var7.f10635n.setValue(Boolean.valueOf(s11.m4670O(b03Var6, false)));
                                                    nx1Var.setValue(Boolean.valueOf(f13.m1494c(k03Var6.f5297b)));
                                                } else if (t91Var7.m5143a() == tr0.f10908j) {
                                                    nx1Var.setValue(Boolean.valueOf(s11.m4670O(b03Var6, true)));
                                                }
                                                us1 us1Var7 = us1Var3;
                                                gf1.m1857E(t91Var7, k03Var6, us1Var7);
                                                z03 z03VarM5146d2 = t91Var7.m5146d();
                                                if (z03VarM5146d2 != null && (t03Var2 = t91Var7.f10626e) != null && t91Var7.m5144b() && (c61Var = z03VarM5146d2.f13698b) != null && c61Var.mo653w() && (c61Var2 = z03VarM5146d2.f13699c) != null) {
                                                    y03 y03Var = z03VarM5146d2.f13697a;
                                                    C0967zm c0967zm = new C0967zm(3, c61Var);
                                                    o62 o62VarM3578D = op0.m3578D(c61Var);
                                                    o62 o62VarMo644J = c61Var.mo644J(c61Var2, false);
                                                    if (t11.m5086l((t03) t03Var2.f10465a.f7409b.get(), t03Var2)) {
                                                        t03Var2.f10466b.mo2876a(k03Var6, us1Var7, y03Var, c0967zm, o62VarM3578D, o62VarMo644J);
                                                    }
                                                }
                                            }
                                            return a83.f116a;
                                        }
                                    };
                                    td3Var3 = td3Var2;
                                    go0Var3.m1981f0(in0Var3);
                                    objM1956L5 = in0Var3;
                                } else {
                                    td3Var3 = td3Var2;
                                }
                                final uh1 uh1VarM5053E = t11.m5053E(rh1Var, (in0) objM1956L5);
                                t91 t91Var7 = t91Var4;
                                uh1VarM5320s = rh1Var;
                                t10 t10Var = new t10(q33Var, k03Var, t91Var7, z3, z2, wb3Var instanceof tx1, us1Var3, b03Var3, xx0Var, gl0Var5);
                                t91Var5 = t91Var7;
                                if (!z2 && !z3 && ((Boolean) ((k91) td3Var3).f5408a.getValue()).booleanValue() && f13.m1494c(((f13) t91Var5.f10620A.getValue()).f2739a) && f13.m1494c(((f13) t91Var5.f10621B.getValue()).f2739a)) {
                                    uh1VarM5320s2 = uh1VarM5320s;
                                } else {
                                    b81 b81Var = new b81(ft2Var, t91Var5, k03Var, us1Var3, 7);
                                    t91Var5 = t91Var5;
                                    uh1VarM5320s2 = AbstractC0738tl.m5320s(uh1VarM5320s, b81Var);
                                }
                                zM1984h3 = go0Var3.m1984h(b03Var3);
                                objM1956L6 = go0Var3.m1956L();
                                if (!zM1984h3 || objM1956L6 == c0160eb3) {
                                    i14 = 0;
                                    objM1956L6 = new j10(b03Var3, i14);
                                    go0Var3.m1981f0(objM1956L6);
                                } else {
                                    i14 = 0;
                                }
                                AbstractC0179eu.m1450c(b03Var3, (in0) objM1956L6, go0Var3);
                                i15 = (go0Var3.m1984h(t91Var5) ? 1 : 0) | (go0Var3.m1984h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.m1980f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                objM1956L7 = go0Var3.m1956L();
                                if (i15 != 0 || objM1956L7 == c0160eb3) {
                                    i16 = i14;
                                    C0575pc c0575pc = new C0575pc(t91Var5, o03Var4, k03Var, xx0Var, 2);
                                    xx0Var4 = xx0Var;
                                    go0Var3.m1981f0(c0575pc);
                                    objM1956L7 = c0575pc;
                                } else {
                                    i16 = i14;
                                    xx0Var4 = xx0Var;
                                }
                                AbstractC0179eu.m1450c(xx0Var4, (in0) objM1956L7, go0Var3);
                                final n10 n10Var = t91Var5.f10643v;
                                final boolean z18 = i != 1 ? 1 : i16;
                                final int i24 = xx0Var4.f13218e;
                                final w73 w73Var4 = w73Var3;
                                uh1 uh1VarM5320s3 = AbstractC0738tl.m5320s(uh1VarM5320s, new nn0() { // from class: nz2
                                    @Override // p000.nn0
                                    /* JADX INFO: renamed from: e */
                                    public final Object mo489e(Object obj2, Object obj3, Object obj4) {
                                        ((Integer) obj4).getClass();
                                        go0 go0Var5 = (go0) ((InterfaceC0596px) obj3);
                                        go0Var5.m1966W(851809892);
                                        Object objM1956L19 = go0Var5.m1956L();
                                        C0160eb c0160eb5 = C0520nx.f7360a;
                                        if (objM1956L19 == c0160eb5) {
                                            objM1956L19 = new e13();
                                            go0Var5.m1981f0(objM1956L19);
                                        }
                                        e13 e13Var = (e13) objM1956L19;
                                        Object objM1956L20 = go0Var5.m1956L();
                                        if (objM1956L20 == c0160eb5) {
                                            objM1956L20 = new n40();
                                            go0Var5.m1981f0(objM1956L20);
                                        }
                                        mz2 mz2Var = new mz2(t91Var5, b03Var3, k03Var, z16, z18, e13Var, us1Var3, w73Var4, (n40) objM1956L20, n10Var, i24);
                                        boolean zM1984h7 = go0Var5.m1984h(mz2Var);
                                        Object objM1956L21 = go0Var5.m1956L();
                                        if (zM1984h7 || objM1956L21 == c0160eb5) {
                                            C0151e2 c0151e2 = new C0151e2(1, mz2Var, mz2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 8);
                                            go0Var5.m1981f0(c0151e2);
                                            objM1956L21 = c0151e2;
                                        }
                                        uh1 uh1VarM5523B = up0.m5523B((in0) ((yn0) objM1956L21));
                                        go0Var5.m1994p(false);
                                        return uh1VarM5523B;
                                    }
                                });
                                int i25 = xx0Var4.f13217d;
                                z13 = (i25 == 7 || i25 == 8) ? false : true;
                                zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                                c0416l92 = c0416l9;
                                zM1982g = go0Var3.m1982g(z13) | go0Var3.m1984h(c0416l92);
                                objM1956L8 = go0Var3.m1956L();
                                if (!zM1982g || objM1956L8 == c0160eb3) {
                                    objM1956L8 = new p00(1, c0416l92, z13);
                                    go0Var3.m1981f0(objM1956L8);
                                }
                                xm0 xm0Var = (xm0) objM1956L8;
                                if (zBooleanValue || !bw2.f1059a) {
                                    uh1VarMo4491c = uh1VarM5320s;
                                } else {
                                    uh1VarMo4491c = (z13 ? new cw2(qp0.f9075q) : uh1VarM5320s).mo4491c(new zv2(xm0Var));
                                }
                                ft2Var2 = (AbstractC0024an) go0Var3.m1988j(AbstractC0657ri.f9588a);
                                j4 = ((C0363ju) go0Var3.m1988j(AbstractC0657ri.f9589b)).f5219a;
                                if (!C0363ju.m2566c(j4, sp0.m4930b(1308617531))) {
                                    ft2Var2 = new ft2(j4);
                                }
                                zM1984h4 = go0Var3.m1984h(t91Var5) | go0Var3.m1980f(ft2Var2);
                                objM1956L9 = go0Var3.m1956L();
                                if (!zM1984h4 || objM1956L9 == c0160eb3) {
                                    objM1956L9 = new C0115d2(12, t91Var5, ft2Var2);
                                    go0Var3.m1981f0(objM1956L9);
                                }
                                uh1 uh1VarMo4491c4 = AbstractC0691se.m4826O(uh1Var.mo4491c(qp0.m4266u(uh1VarM5320s, (in0) objM1956L9)), c0416l92, t91Var5, b03Var3).mo4491c(uh1VarMo4491c).mo4491c(uh1Var2);
                                i17 = 11;
                                int i26 = 3;
                                final tz2 tz2Var3 = tz2Var;
                                uh1 uh1VarMo4491c5 = t11.m5053E(up0.m5524C(up0.m5524C(uh1VarMo4491c4, new C0962zh(i17, yk0Var2, t91Var5)), new C0962zh(i26, t91Var5, b03Var3)).mo4491c(uh1VarM5320s3).mo4491c(new C0477mx(new C0085cb(i26, tz2Var3, z2))).mo4491c(uh1VarMo4491c3).mo4491c(t10Var), new n10(t91Var5, 0)).mo4491c(new C0529o5(new C0016af(20, b03Var3, j20Var3)));
                                z14 = !z2 && t91Var5.m5144b() && ((Boolean) t91Var5.f10638q.getValue()).booleanValue() && ((Boolean) ((k91) td3Var3).f5408a.getValue()).booleanValue();
                                if (z14 && he1.m2147a()) {
                                    uh1VarM5320s = AbstractC0738tl.m5320s(uh1VarM5320s, new wt0(i17, b03Var3));
                                }
                                go0 go0Var5 = go0Var3;
                                final uh1 uh1Var3 = uh1VarM5320s;
                                final C0548om c0548om3 = c0548om;
                                final boolean z19 = z14;
                                final uh1 uh1Var4 = uh1VarM5320s2;
                                final t91 t91Var8 = t91Var5;
                                mn0 mn0Var = new mn0() { // from class: f10
                                    @Override // p000.mn0
                                    /* JADX INFO: renamed from: g */
                                    public final Object mo12g(Object obj2, Object obj3) {
                                        InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        go0 go0Var6 = (go0) interfaceC0596px2;
                                        if (go0Var6.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final t91 t91Var9 = t91Var8;
                                            final m13 m13Var4 = m13Var;
                                            final int i27 = i2;
                                            final int i28 = i;
                                            final tz2 tz2Var4 = tz2Var3;
                                            final k03 k03Var6 = k03Var;
                                            final wb3 wb3Var2 = wb3Var;
                                            final uh1 uh1Var5 = uh1Var4;
                                            final uh1 uh1Var6 = uh1VarM4264s;
                                            final uh1 uh1Var7 = uh1VarM5053E;
                                            final uh1 uh1Var8 = uh1Var3;
                                            final C0548om c0548om4 = c0548om3;
                                            final b03 b03Var6 = b03Var3;
                                            final boolean z20 = z19;
                                            final boolean z21 = z3;
                                            final in0 in0Var4 = in0Var2;
                                            final us1 us1Var7 = us1Var3;
                                            final e70 e70Var4 = e70Var3;
                                            c0402kw.mo489e(xe1.m6126i0(-44346382, new mn0() { // from class: k10
                                                @Override // p000.mn0
                                                /* JADX INFO: renamed from: g */
                                                public final Object mo12g(Object obj4, Object obj5) {
                                                    uh1 ma3Var;
                                                    final k03 k03Var7 = k03Var6;
                                                    long j9 = k03Var7.f5297b;
                                                    InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    go0 go0Var7 = (go0) interfaceC0596px3;
                                                    if (go0Var7.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        final t91 t91Var10 = t91Var9;
                                                        uh1 uh1VarM5187P = AbstractC0731te.m5187P(rh1.f9587a, ((za0) t91Var10.f10628g.getValue()).f13798h, 0.0f, 2);
                                                        int i29 = i27;
                                                        final int i30 = i28;
                                                        op0.m3577C(i29, i30);
                                                        m13 m13Var5 = m13Var4;
                                                        if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                            uh1VarM5187P = uh1VarM5187P.mo4491c(new os0(m13Var5, i29, i30));
                                                        }
                                                        uh1 uh1Var9 = uh1VarM5187P;
                                                        boolean zM1984h7 = go0Var7.m1984h(t91Var10);
                                                        Object objM1956L19 = go0Var7.m1956L();
                                                        if (zM1984h7 || objM1956L19 == C0520nx.f7360a) {
                                                            objM1956L19 = new C0727ta(5, t91Var10);
                                                            go0Var7.m1981f0(objM1956L19);
                                                        }
                                                        xm0 xm0Var2 = (xm0) objM1956L19;
                                                        tz2 tz2Var5 = tz2Var4;
                                                        qv1 qv1Var3 = (qv1) tz2Var5.f11018f.getValue();
                                                        int i31 = f13.f2738c;
                                                        int iM1497f = (int) (j9 >> 32);
                                                        long j10 = tz2Var5.f11017e;
                                                        if (iM1497f == ((int) (j10 >> 32)) && (iM1497f = (int) (j9 & 4294967295L)) == ((int) (4294967295L & j10))) {
                                                            iM1497f = f13.m1497f(j9);
                                                        }
                                                        tz2Var5.f11017e = j9;
                                                        q33 q33VarM2887a2 = l93.m2887a(wb3Var2, k03Var7.f5296a);
                                                        int iOrdinal = qv1Var3.ordinal();
                                                        if (iOrdinal == 0) {
                                                            ma3Var = new ma3(tz2Var5, iM1497f, q33VarM2887a2, xm0Var2);
                                                        } else {
                                                            if (iOrdinal != 1) {
                                                                c80.m675s();
                                                                return null;
                                                            }
                                                            ma3Var = new hu0(tz2Var5, iM1497f, q33VarM2887a2, xm0Var2);
                                                        }
                                                        uh1 uh1VarM1639n = fg1.m1639n(AbstractC0731te.m5185N(uh1Var9, 0.0f, 0.0f, 0.0f, null, 520191).mo4491c(ma3Var).mo4491c(uh1Var5).mo4491c(uh1Var6).mo4491c(new i03(m13Var5)).mo4491c(uh1Var7).mo4491c(uh1Var8), c0548om4);
                                                        final b03 b03Var7 = b03Var6;
                                                        final boolean z22 = z20;
                                                        final boolean z23 = z21;
                                                        final in0 in0Var5 = in0Var4;
                                                        final us1 us1Var8 = us1Var7;
                                                        final e70 e70Var5 = e70Var4;
                                                        rg3.m4472h(uh1VarM1639n, xe1.m6126i0(1412697320, new mn0() { // from class: l10
                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                            /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
                                                            @Override // p000.mn0
                                                            /* JADX INFO: renamed from: g */
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object mo12g(Object obj6, Object obj7) {
                                                                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                boolean z24 = true;
                                                                go0 go0Var8 = (go0) interfaceC0596px4;
                                                                if (go0Var8.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    t91 t91Var11 = t91Var10;
                                                                    o10 o10Var = new o10(t91Var11, in0Var5, k03Var7, us1Var8, e70Var5, i30);
                                                                    int iHashCode = Long.hashCode(go0Var8.f3614T);
                                                                    yy1 yy1VarM1990l = go0Var8.m1990l();
                                                                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var8, rh1.f9587a);
                                                                    InterfaceC0293hx.f4166c.getClass();
                                                                    C0367jy c0367jy = C0256gx.f3727b;
                                                                    go0Var8.m1969Z();
                                                                    if (go0Var8.f3613S) {
                                                                        go0Var8.m1989k(c0367jy);
                                                                    } else {
                                                                        go0Var8.m1987i0();
                                                                    }
                                                                    yf3.m6268c(go0Var8, C0256gx.f3730e, o10Var);
                                                                    yf3.m6268c(go0Var8, C0256gx.f3729d, yy1VarM1990l);
                                                                    yf3.m6268c(go0Var8, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                                                    yf3.m6267b(go0Var8, C0256gx.f3732g);
                                                                    yf3.m6268c(go0Var8, C0256gx.f3728c, uh1VarM5285M);
                                                                    go0Var8.m1994p(true);
                                                                    tr0 tr0VarM5143a = t91Var11.m5143a();
                                                                    tr0 tr0Var = tr0.f10906h;
                                                                    boolean z25 = z22;
                                                                    if (tr0VarM5143a == tr0Var || t91Var11.m5145c() == null) {
                                                                        z24 = false;
                                                                        b03 b03Var8 = b03Var7;
                                                                        gf1.m1883c(b03Var8, z24, go0Var8, 0);
                                                                        if (t91Var11.m5143a() == tr0.f10908j || z23 || !z25) {
                                                                            go0Var8.m1966W(-714589318);
                                                                            go0Var8.m1994p(false);
                                                                        } else {
                                                                            go0Var8.m1966W(-714666198);
                                                                            gf1.m1885d(b03Var8, go0Var8, 0);
                                                                            go0Var8.m1994p(false);
                                                                        }
                                                                    } else {
                                                                        c61 c61VarM5145c = t91Var11.m5145c();
                                                                        c61VarM5145c.getClass();
                                                                        if (!c61VarM5145c.mo653w() || !z25) {
                                                                        }
                                                                        b03 b03Var82 = b03Var7;
                                                                        gf1.m1883c(b03Var82, z24, go0Var8, 0);
                                                                        if (t91Var11.m5143a() == tr0.f10908j) {
                                                                            go0Var8.m1966W(-714589318);
                                                                            go0Var8.m1994p(false);
                                                                        }
                                                                    }
                                                                } else {
                                                                    go0Var8.m1961R();
                                                                }
                                                                return a83.f116a;
                                                            }
                                                        }, go0Var7), go0Var7, 48);
                                                    } else {
                                                        go0Var7.m1961R();
                                                    }
                                                    return a83.f116a;
                                                }
                                            }, go0Var6), go0Var6, 6);
                                        } else {
                                            go0Var6.m1961R();
                                        }
                                        return a83.f116a;
                                    }
                                };
                                go0Var = go0Var5;
                                m1881b(uh1VarMo4491c5, b03Var3, xe1.m6126i0(-814563849, mn0Var, go0Var), go0Var, 384);
                            } else {
                                t91Var3 = t91Var2;
                            }
                            z11 = true;
                            z12 = z11 | zM1980f3;
                            Object objM1956L182 = go0Var3.m1956L();
                            if (z12) {
                                o03 o03Var82 = o03Var3;
                                b03 b03Var52 = b03Var;
                                xx0 xx0Var62 = xx0Var3;
                                b03Var2 = b03Var52;
                                uh1Var2 = uh1VarM6142s;
                                t91Var4 = t91Var3;
                                c0793v0 = new C0793v0(t91Var4, xk1VarM3601x, o03Var82, b03Var2, xx0Var62, (t00) null);
                                xk1Var = xk1VarM3601x;
                                o03Var3 = o03Var82;
                                go0Var3.m1981f0(c0793v0);
                                AbstractC0179eu.m1456f(go0Var3, (mn0) c0793v0, a83.f116a);
                                C0647r8 c0647r82 = new C0647r8(1, new n10(t91Var4, 4));
                                rh1 rh1Var2 = rh1.f9587a;
                                uh1 uh1VarM5804a2 = vw2.m5804a(rh1Var2, 8675309, c0647r82);
                                o03Var4 = o03Var3;
                                final gl0 gl0Var52 = gl0Var2;
                                b03Var3 = b03Var2;
                                final boolean z172 = z10;
                                us1Var3 = us1Var2;
                                j20 j20Var32 = j20Var;
                                uh1 uh1VarMo4491c22 = (!z2 ? AbstractC0738tl.m5320s(uh1VarM5804a2, new wt0(10, new in0() { // from class: oz2
                                    @Override // p000.in0
                                    /* JADX INFO: renamed from: j */
                                    public final Object mo5j(Object obj2) {
                                        bt2 bt2Var2;
                                        rs1 rs1Var = (rs1) obj2;
                                        t91 t91Var72 = t91Var4;
                                        if (!t91Var72.m5144b()) {
                                            gl0.m1938a(gl0Var52);
                                        } else if (!z3 && (bt2Var2 = t91Var72.f10624c) != null) {
                                            ((v60) bt2Var2).m5626b();
                                        }
                                        if (t91Var72.m5144b() && z172) {
                                            if (t91Var72.m5143a() != tr0.f10907i) {
                                                z03 z03VarM5146d = t91Var72.m5146d();
                                                if (z03VarM5146d != null) {
                                                    long j9 = rs1Var.f9744a;
                                                    sz0 sz0Var2 = t91Var72.f10625d;
                                                    n10 n10Var2 = t91Var72.f10643v;
                                                    int iMo2449n = us1Var3.mo2449n(z03VarM5146d.m6376b(j9, true));
                                                    n10Var2.mo5j(k03.m2598a((k03) sz0Var2.f10436i, null, fg1.m1636i(iMo2449n, iMo2449n), 5));
                                                    if (t91Var72.f10622a.f4847a.f10051i.length() > 0) {
                                                        t91Var72.f10632k.setValue(tr0.f10908j);
                                                    }
                                                }
                                            } else {
                                                b03Var3.m343g(rs1Var);
                                            }
                                        }
                                        return a83.f116a;
                                    }
                                })) : uh1VarM5804a2).mo4491c(new uw2(b03Var3.f478A, b03Var3.f505z, new C0647r8(4, b03Var3), 4));
                                m12.f6433a.getClass();
                                uh1 uh1VarMo4491c32 = uh1VarMo4491c22.mo4491c(new k12());
                                final uh1 uh1VarM4264s2 = qp0.m4264s(rh1Var2, new C0444m0(t91Var4, k03Var3, us1Var3, 5));
                                td3Var2 = td3Var;
                                zM1984h2 = go0Var3.m1984h(t91Var4) | (i11 != 2048) | go0Var3.m1980f(td3Var2) | go0Var3.m1984h(b03Var3) | (i12 != 4) | go0Var3.m1984h(us1Var3);
                                objM1956L5 = go0Var3.m1956L();
                                if (zM1984h2) {
                                    final k03 k03Var52 = k03Var3;
                                    in0 in0Var32 = new in0() { // from class: i10
                                        @Override // p000.in0
                                        /* JADX INFO: renamed from: j */
                                        public final Object mo5j(Object obj2) {
                                            t03 t03Var2;
                                            c61 c61Var;
                                            c61 c61Var2;
                                            t91 t91Var72 = t91Var4;
                                            nx1 nx1Var = t91Var72.f10636o;
                                            c61 c61Var3 = (c61) obj2;
                                            t91Var72.f10629h = c61Var3;
                                            z03 z03VarM5146d = t91Var72.m5146d();
                                            if (z03VarM5146d != null) {
                                                z03VarM5146d.f13698b = c61Var3;
                                            }
                                            if (z2) {
                                                tr0 tr0VarM5143a = t91Var72.m5143a();
                                                tr0 tr0Var = tr0.f10907i;
                                                b03 b03Var6 = b03Var3;
                                                k03 k03Var6 = k03Var52;
                                                if (tr0VarM5143a == tr0Var) {
                                                    if (((Boolean) t91Var72.f10633l.getValue()).booleanValue() && ((Boolean) ((k91) td3Var2).f5408a.getValue()).booleanValue()) {
                                                        b03Var6.m354r();
                                                    } else {
                                                        b03Var6.m351o();
                                                    }
                                                    t91Var72.f10634m.setValue(Boolean.valueOf(s11.m4670O(b03Var6, true)));
                                                    t91Var72.f10635n.setValue(Boolean.valueOf(s11.m4670O(b03Var6, false)));
                                                    nx1Var.setValue(Boolean.valueOf(f13.m1494c(k03Var6.f5297b)));
                                                } else if (t91Var72.m5143a() == tr0.f10908j) {
                                                    nx1Var.setValue(Boolean.valueOf(s11.m4670O(b03Var6, true)));
                                                }
                                                us1 us1Var7 = us1Var3;
                                                gf1.m1857E(t91Var72, k03Var6, us1Var7);
                                                z03 z03VarM5146d2 = t91Var72.m5146d();
                                                if (z03VarM5146d2 != null && (t03Var2 = t91Var72.f10626e) != null && t91Var72.m5144b() && (c61Var = z03VarM5146d2.f13698b) != null && c61Var.mo653w() && (c61Var2 = z03VarM5146d2.f13699c) != null) {
                                                    y03 y03Var = z03VarM5146d2.f13697a;
                                                    C0967zm c0967zm = new C0967zm(3, c61Var);
                                                    o62 o62VarM3578D = op0.m3578D(c61Var);
                                                    o62 o62VarMo644J = c61Var.mo644J(c61Var2, false);
                                                    if (t11.m5086l((t03) t03Var2.f10465a.f7409b.get(), t03Var2)) {
                                                        t03Var2.f10466b.mo2876a(k03Var6, us1Var7, y03Var, c0967zm, o62VarM3578D, o62VarMo644J);
                                                    }
                                                }
                                            }
                                            return a83.f116a;
                                        }
                                    };
                                    td3Var3 = td3Var2;
                                    go0Var3.m1981f0(in0Var32);
                                    objM1956L5 = in0Var32;
                                    final uh1 uh1VarM5053E2 = t11.m5053E(rh1Var2, (in0) objM1956L5);
                                    t91 t91Var72 = t91Var4;
                                    uh1VarM5320s = rh1Var2;
                                    t10 t10Var2 = new t10(q33Var, k03Var, t91Var72, z3, z2, wb3Var instanceof tx1, us1Var3, b03Var3, xx0Var, gl0Var52);
                                    t91Var5 = t91Var72;
                                    if (z2) {
                                        if (!z2 && !z3 && ((Boolean) ((k91) td3Var3).f5408a.getValue()).booleanValue() && f13.m1494c(((f13) t91Var5.f10620A.getValue()).f2739a) && f13.m1494c(((f13) t91Var5.f10621B.getValue()).f2739a)) {
                                        }
                                        zM1984h3 = go0Var3.m1984h(b03Var3);
                                        objM1956L6 = go0Var3.m1956L();
                                        if (zM1984h3) {
                                            i14 = 0;
                                            objM1956L6 = new j10(b03Var3, i14);
                                            go0Var3.m1981f0(objM1956L6);
                                            AbstractC0179eu.m1450c(b03Var3, (in0) objM1956L6, go0Var3);
                                            if (i10 > 32) {
                                                i15 = (go0Var3.m1984h(t91Var5) ? 1 : 0) | (go0Var3.m1984h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.m1980f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                                objM1956L7 = go0Var3.m1956L();
                                                if (i15 != 0) {
                                                    i16 = i14;
                                                    C0575pc c0575pc2 = new C0575pc(t91Var5, o03Var4, k03Var, xx0Var, 2);
                                                    xx0Var4 = xx0Var;
                                                    go0Var3.m1981f0(c0575pc2);
                                                    objM1956L7 = c0575pc2;
                                                    AbstractC0179eu.m1450c(xx0Var4, (in0) objM1956L7, go0Var3);
                                                    final in0 n10Var2 = t91Var5.f10643v;
                                                    if (i != 1) {
                                                    }
                                                    final int i242 = xx0Var4.f13218e;
                                                    final w73 w73Var42 = w73Var3;
                                                    uh1 uh1VarM5320s32 = AbstractC0738tl.m5320s(uh1VarM5320s, new nn0() { // from class: nz2
                                                        @Override // p000.nn0
                                                        /* JADX INFO: renamed from: e */
                                                        public final Object mo489e(Object obj2, Object obj3, Object obj4) {
                                                            ((Integer) obj4).getClass();
                                                            go0 go0Var52 = (go0) ((InterfaceC0596px) obj3);
                                                            go0Var52.m1966W(851809892);
                                                            Object objM1956L19 = go0Var52.m1956L();
                                                            C0160eb c0160eb5 = C0520nx.f7360a;
                                                            if (objM1956L19 == c0160eb5) {
                                                                objM1956L19 = new e13();
                                                                go0Var52.m1981f0(objM1956L19);
                                                            }
                                                            e13 e13Var = (e13) objM1956L19;
                                                            Object objM1956L20 = go0Var52.m1956L();
                                                            if (objM1956L20 == c0160eb5) {
                                                                objM1956L20 = new n40();
                                                                go0Var52.m1981f0(objM1956L20);
                                                            }
                                                            mz2 mz2Var = new mz2(t91Var5, b03Var3, k03Var, z16, z18, e13Var, us1Var3, w73Var42, (n40) objM1956L20, n10Var2, i242);
                                                            boolean zM1984h7 = go0Var52.m1984h(mz2Var);
                                                            Object objM1956L21 = go0Var52.m1956L();
                                                            if (zM1984h7 || objM1956L21 == c0160eb5) {
                                                                C0151e2 c0151e2 = new C0151e2(1, mz2Var, mz2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 8);
                                                                go0Var52.m1981f0(c0151e2);
                                                                objM1956L21 = c0151e2;
                                                            }
                                                            uh1 uh1VarM5523B = up0.m5523B((in0) ((yn0) objM1956L21));
                                                            go0Var52.m1994p(false);
                                                            return uh1VarM5523B;
                                                        }
                                                    });
                                                    int i252 = xx0Var4.f13217d;
                                                    if (i252 == 7) {
                                                        zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                                                        c0416l92 = c0416l9;
                                                        zM1982g = go0Var3.m1982g(z13) | go0Var3.m1984h(c0416l92);
                                                        objM1956L8 = go0Var3.m1956L();
                                                        if (!zM1982g) {
                                                            objM1956L8 = new p00(1, c0416l92, z13);
                                                            go0Var3.m1981f0(objM1956L8);
                                                            xm0 xm0Var2 = (xm0) objM1956L8;
                                                            if (zBooleanValue) {
                                                                uh1VarMo4491c = uh1VarM5320s;
                                                                ft2Var2 = (AbstractC0024an) go0Var3.m1988j(AbstractC0657ri.f9588a);
                                                                j4 = ((C0363ju) go0Var3.m1988j(AbstractC0657ri.f9589b)).f5219a;
                                                                if (!C0363ju.m2566c(j4, sp0.m4930b(1308617531))) {
                                                                }
                                                                zM1984h4 = go0Var3.m1984h(t91Var5) | go0Var3.m1980f(ft2Var2);
                                                                objM1956L9 = go0Var3.m1956L();
                                                                if (!zM1984h4) {
                                                                    objM1956L9 = new C0115d2(12, t91Var5, ft2Var2);
                                                                    go0Var3.m1981f0(objM1956L9);
                                                                    uh1 uh1VarMo4491c42 = AbstractC0691se.m4826O(uh1Var.mo4491c(qp0.m4266u(uh1VarM5320s, (in0) objM1956L9)), c0416l92, t91Var5, b03Var3).mo4491c(uh1VarMo4491c).mo4491c(uh1Var2);
                                                                    i17 = 11;
                                                                    int i262 = 3;
                                                                    final tz2 tz2Var32 = tz2Var;
                                                                    uh1 uh1VarMo4491c52 = t11.m5053E(up0.m5524C(up0.m5524C(uh1VarMo4491c42, new C0962zh(i17, yk0Var2, t91Var5)), new C0962zh(i262, t91Var5, b03Var3)).mo4491c(uh1VarM5320s32).mo4491c(new C0477mx(new C0085cb(i262, tz2Var32, z2))).mo4491c(uh1VarMo4491c32).mo4491c(t10Var2), new n10(t91Var5, 0)).mo4491c(new C0529o5(new C0016af(20, b03Var3, j20Var32)));
                                                                    if (z2) {
                                                                        if (z14) {
                                                                            uh1VarM5320s = AbstractC0738tl.m5320s(uh1VarM5320s, new wt0(i17, b03Var3));
                                                                        }
                                                                        go0 go0Var52 = go0Var3;
                                                                        final uh1 uh1Var32 = uh1VarM5320s;
                                                                        final C0548om c0548om32 = c0548om;
                                                                        final boolean z192 = z14;
                                                                        final uh1 uh1Var42 = uh1VarM5320s2;
                                                                        final t91 t91Var82 = t91Var5;
                                                                        mn0 mn0Var2 = new mn0() { // from class: f10
                                                                            @Override // p000.mn0
                                                                            /* JADX INFO: renamed from: g */
                                                                            public final Object mo12g(Object obj2, Object obj3) {
                                                                                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                                                                                int iIntValue = ((Integer) obj3).intValue();
                                                                                go0 go0Var6 = (go0) interfaceC0596px2;
                                                                                if (go0Var6.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                    final t91 t91Var9 = t91Var82;
                                                                                    final m13 m13Var4 = m13Var;
                                                                                    final int i27 = i2;
                                                                                    final int i28 = i;
                                                                                    final tz2 tz2Var4 = tz2Var32;
                                                                                    final k03 k03Var6 = k03Var;
                                                                                    final wb3 wb3Var2 = wb3Var;
                                                                                    final uh1 uh1Var5 = uh1Var42;
                                                                                    final uh1 uh1Var6 = uh1VarM4264s2;
                                                                                    final uh1 uh1Var7 = uh1VarM5053E2;
                                                                                    final uh1 uh1Var8 = uh1Var32;
                                                                                    final C0548om c0548om4 = c0548om32;
                                                                                    final b03 b03Var6 = b03Var3;
                                                                                    final boolean z20 = z192;
                                                                                    final boolean z21 = z3;
                                                                                    final in0 in0Var4 = in0Var2;
                                                                                    final us1 us1Var7 = us1Var3;
                                                                                    final e70 e70Var4 = e70Var3;
                                                                                    c0402kw.mo489e(xe1.m6126i0(-44346382, new mn0() { // from class: k10
                                                                                        @Override // p000.mn0
                                                                                        /* JADX INFO: renamed from: g */
                                                                                        public final Object mo12g(Object obj4, Object obj5) {
                                                                                            uh1 ma3Var;
                                                                                            final k03 k03Var7 = k03Var6;
                                                                                            long j9 = k03Var7.f5297b;
                                                                                            InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj4;
                                                                                            int iIntValue2 = ((Integer) obj5).intValue();
                                                                                            go0 go0Var7 = (go0) interfaceC0596px3;
                                                                                            if (go0Var7.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                final t91 t91Var10 = t91Var9;
                                                                                                uh1 uh1VarM5187P = AbstractC0731te.m5187P(rh1.f9587a, ((za0) t91Var10.f10628g.getValue()).f13798h, 0.0f, 2);
                                                                                                int i29 = i27;
                                                                                                final int i30 = i28;
                                                                                                op0.m3577C(i29, i30);
                                                                                                m13 m13Var5 = m13Var4;
                                                                                                if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                                                                    uh1VarM5187P = uh1VarM5187P.mo4491c(new os0(m13Var5, i29, i30));
                                                                                                }
                                                                                                uh1 uh1Var9 = uh1VarM5187P;
                                                                                                boolean zM1984h7 = go0Var7.m1984h(t91Var10);
                                                                                                Object objM1956L19 = go0Var7.m1956L();
                                                                                                if (zM1984h7 || objM1956L19 == C0520nx.f7360a) {
                                                                                                    objM1956L19 = new C0727ta(5, t91Var10);
                                                                                                    go0Var7.m1981f0(objM1956L19);
                                                                                                }
                                                                                                xm0 xm0Var22 = (xm0) objM1956L19;
                                                                                                tz2 tz2Var5 = tz2Var4;
                                                                                                qv1 qv1Var3 = (qv1) tz2Var5.f11018f.getValue();
                                                                                                int i31 = f13.f2738c;
                                                                                                int iM1497f = (int) (j9 >> 32);
                                                                                                long j10 = tz2Var5.f11017e;
                                                                                                if (iM1497f == ((int) (j10 >> 32)) && (iM1497f = (int) (j9 & 4294967295L)) == ((int) (4294967295L & j10))) {
                                                                                                    iM1497f = f13.m1497f(j9);
                                                                                                }
                                                                                                tz2Var5.f11017e = j9;
                                                                                                q33 q33VarM2887a2 = l93.m2887a(wb3Var2, k03Var7.f5296a);
                                                                                                int iOrdinal = qv1Var3.ordinal();
                                                                                                if (iOrdinal == 0) {
                                                                                                    ma3Var = new ma3(tz2Var5, iM1497f, q33VarM2887a2, xm0Var22);
                                                                                                } else {
                                                                                                    if (iOrdinal != 1) {
                                                                                                        c80.m675s();
                                                                                                        return null;
                                                                                                    }
                                                                                                    ma3Var = new hu0(tz2Var5, iM1497f, q33VarM2887a2, xm0Var22);
                                                                                                }
                                                                                                uh1 uh1VarM1639n = fg1.m1639n(AbstractC0731te.m5185N(uh1Var9, 0.0f, 0.0f, 0.0f, null, 520191).mo4491c(ma3Var).mo4491c(uh1Var5).mo4491c(uh1Var6).mo4491c(new i03(m13Var5)).mo4491c(uh1Var7).mo4491c(uh1Var8), c0548om4);
                                                                                                final b03 b03Var7 = b03Var6;
                                                                                                final boolean z22 = z20;
                                                                                                final boolean z23 = z21;
                                                                                                final in0 in0Var5 = in0Var4;
                                                                                                final us1 us1Var8 = us1Var7;
                                                                                                final e70 e70Var5 = e70Var4;
                                                                                                rg3.m4472h(uh1VarM1639n, xe1.m6126i0(1412697320, new mn0() { // from class: l10
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
                                                                                                    @Override // p000.mn0
                                                                                                    /* JADX INFO: renamed from: g */
                                                                                                    /*
                                                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                                                    */
                                                                                                    public final Object mo12g(Object obj6, Object obj7) {
                                                                                                        InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj6;
                                                                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                                                                        boolean z24 = true;
                                                                                                        go0 go0Var8 = (go0) interfaceC0596px4;
                                                                                                        if (go0Var8.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                            t91 t91Var11 = t91Var10;
                                                                                                            o10 o10Var = new o10(t91Var11, in0Var5, k03Var7, us1Var8, e70Var5, i30);
                                                                                                            int iHashCode = Long.hashCode(go0Var8.f3614T);
                                                                                                            yy1 yy1VarM1990l = go0Var8.m1990l();
                                                                                                            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var8, rh1.f9587a);
                                                                                                            InterfaceC0293hx.f4166c.getClass();
                                                                                                            C0367jy c0367jy = C0256gx.f3727b;
                                                                                                            go0Var8.m1969Z();
                                                                                                            if (go0Var8.f3613S) {
                                                                                                                go0Var8.m1989k(c0367jy);
                                                                                                            } else {
                                                                                                                go0Var8.m1987i0();
                                                                                                            }
                                                                                                            yf3.m6268c(go0Var8, C0256gx.f3730e, o10Var);
                                                                                                            yf3.m6268c(go0Var8, C0256gx.f3729d, yy1VarM1990l);
                                                                                                            yf3.m6268c(go0Var8, C0256gx.f3731f, Integer.valueOf(iHashCode));
                                                                                                            yf3.m6267b(go0Var8, C0256gx.f3732g);
                                                                                                            yf3.m6268c(go0Var8, C0256gx.f3728c, uh1VarM5285M);
                                                                                                            go0Var8.m1994p(true);
                                                                                                            tr0 tr0VarM5143a = t91Var11.m5143a();
                                                                                                            tr0 tr0Var = tr0.f10906h;
                                                                                                            boolean z25 = z22;
                                                                                                            if (tr0VarM5143a == tr0Var || t91Var11.m5145c() == null) {
                                                                                                                z24 = false;
                                                                                                                b03 b03Var82 = b03Var7;
                                                                                                                gf1.m1883c(b03Var82, z24, go0Var8, 0);
                                                                                                                if (t91Var11.m5143a() == tr0.f10908j || z23 || !z25) {
                                                                                                                    go0Var8.m1966W(-714589318);
                                                                                                                    go0Var8.m1994p(false);
                                                                                                                } else {
                                                                                                                    go0Var8.m1966W(-714666198);
                                                                                                                    gf1.m1885d(b03Var82, go0Var8, 0);
                                                                                                                    go0Var8.m1994p(false);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c61 c61VarM5145c = t91Var11.m5145c();
                                                                                                                c61VarM5145c.getClass();
                                                                                                                if (!c61VarM5145c.mo653w() || !z25) {
                                                                                                                }
                                                                                                                b03 b03Var822 = b03Var7;
                                                                                                                gf1.m1883c(b03Var822, z24, go0Var8, 0);
                                                                                                                if (t91Var11.m5143a() == tr0.f10908j) {
                                                                                                                    go0Var8.m1966W(-714589318);
                                                                                                                    go0Var8.m1994p(false);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            go0Var8.m1961R();
                                                                                                        }
                                                                                                        return a83.f116a;
                                                                                                    }
                                                                                                }, go0Var7), go0Var7, 48);
                                                                                            } else {
                                                                                                go0Var7.m1961R();
                                                                                            }
                                                                                            return a83.f116a;
                                                                                        }
                                                                                    }, go0Var6), go0Var6, 6);
                                                                                } else {
                                                                                    go0Var6.m1961R();
                                                                                }
                                                                                return a83.f116a;
                                                                            }
                                                                        };
                                                                        go0Var = go0Var52;
                                                                        m1881b(uh1VarMo4491c52, b03Var3, xe1.m6126i0(-814563849, mn0Var2, go0Var), go0Var, 384);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i15 = (go0Var3.m1984h(t91Var5) ? 1 : 0) | (go0Var3.m1984h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.m1980f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                                objM1956L7 = go0Var3.m1956L();
                                                if (i15 != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            xx0Var2 = xx0Var;
                        }
                        z9 = zM1984h6;
                        o03Var2 = o03Var6;
                        boolean z20 = (i21 & 48) != 32;
                        zM1984h = z9 | z20 | go0Var2.m1984h(us1Var6) | go0Var2.m1984h(j20Var2) | go0Var2.m1984h(c0548om2) | go0Var2.m1984h(b03Var4);
                        Object objM1956L172 = go0Var2.m1956L();
                        if (zM1984h) {
                            final xx0 xx0Var52 = xx0Var2;
                            go0Var3 = go0Var2;
                            t91Var2 = t91Var6;
                            gl0Var2 = gl0Var4;
                            i11 = i22;
                            c0160eb3 = c0160eb2;
                            i12 = i23;
                            w73Var3 = w73Var2;
                            final o03 o03Var72 = o03Var2;
                            i13 = i21;
                            obj = new in0() { // from class: h10
                                @Override // p000.in0
                                /* JADX INFO: renamed from: j */
                                public final Object mo5j(Object obj2) {
                                    z03 z03VarM5146d;
                                    kl0 kl0Var = (kl0) obj2;
                                    t91 t91Var73 = t91Var2;
                                    boolean zM5144b = t91Var73.m5144b();
                                    boolean zM2718a = kl0Var.m2718a();
                                    a83 a83Var = a83.f116a;
                                    if (zM5144b != zM2718a) {
                                        t91Var73.f10627f.setValue(Boolean.valueOf(kl0Var.m2718a()));
                                        boolean zM5144b2 = t91Var73.m5144b();
                                        k03 k03Var53 = k03Var;
                                        us1 us1Var7 = us1Var6;
                                        if (zM5144b2 && z2 && !z3) {
                                            gf1.m1872T(o03Var72, t91Var73, k03Var53, xx0Var52, us1Var7);
                                        } else {
                                            gf1.m1901s(t91Var73);
                                        }
                                        if (kl0Var.m2718a() && (z03VarM5146d = t91Var73.m5146d()) != null) {
                                            AbstractC0570p7.m3745A(j20Var2, null, new C0793v0(c0548om2, k03Var53, t91Var73, z03VarM5146d, us1Var7, (t00) null), 3);
                                        }
                                        if (!kl0Var.m2718a()) {
                                            b03Var4.m343g(null);
                                        }
                                    }
                                    return a83Var;
                                }
                            };
                            c0548om = c0548om2;
                            j20Var = j20Var2;
                            us1Var2 = us1Var6;
                            k03Var3 = k03Var;
                            b03Var = b03Var4;
                            z10 = z2;
                            o03Var3 = o03Var72;
                            xx0Var3 = xx0Var52;
                            go0Var3.m1981f0(obj);
                            uh1 uh1VarM6142s2 = xe1.m6142s(m1858F(fg1.m1648w(gl0Var2), (in0) obj), z10);
                            if (z10) {
                                xk1 xk1VarM3601x2 = op0.m3601x(Boolean.valueOf((z10 || z3) ? false : true), go0Var3);
                                boolean zM1980f32 = go0Var3.m1980f(xk1VarM3601x2) | go0Var3.m1984h(t91Var2) | go0Var3.m1984h(o03Var3) | go0Var3.m1984h(b03Var);
                                if (i10 > 32) {
                                    t91Var3 = t91Var2;
                                    if ((i13 & 48) != 32) {
                                        z11 = true;
                                    }
                                    z12 = z11 | zM1980f32;
                                    Object objM1956L1822 = go0Var3.m1956L();
                                    if (z12) {
                                    }
                                }
                            }
                        }
                    } else {
                        Long l = w73Var.f12389d;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        }
                        objM1956L2 = go0Var2.m1956L();
                        if (objM1956L2 == c0160eb2) {
                        }
                        final j20 j20Var22 = (j20) objM1956L2;
                        objM1956L3 = go0Var2.m1956L();
                        if (objM1956L3 == c0160eb2) {
                        }
                        final C0548om c0548om22 = (C0548om) objM1956L3;
                        objM1956L4 = go0Var2.m1956L();
                        if (objM1956L4 == c0160eb2) {
                        }
                        final b03 b03Var42 = (b03) objM1956L4;
                        final us1 us1Var62 = us1Var;
                        b03Var42.f481b = us1Var62;
                        b03Var42.f485f = wb3Var;
                        b03Var42.f482c = t91Var6.f10643v;
                        b03Var42.f483d = t91Var6;
                        b03Var42.f484e.setValue(k03Var2);
                        b03Var42.f502w = new f13(j3);
                        b03Var42.f487h = (InterfaceC0668rt) go0Var2.m1988j(AbstractC0441ly.f6380f);
                        b03Var42.f488i = j20Var22;
                        b03Var42.f490k = (bs0) go0Var2.m1988j(AbstractC0441ly.f6386l);
                        gl0 gl0Var42 = gl0Var;
                        b03Var42.f491l = gl0Var42;
                        final boolean z162 = !z3;
                        b03Var42.f492m.setValue(Boolean.valueOf(z162));
                        b03Var42.f493n.setValue(Boolean.valueOf(z2));
                        go0Var2.m1966W(1966756105);
                        kc1 kc1Var2 = m13Var3.f6435a.f6311k;
                        tu2 tu2Var2 = r02.f9309a;
                        go0Var2.m1966W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                        }
                        b03Var42.f489j = p02Var;
                        go0Var2.m1994p(z8);
                        t91Var6.m5144b();
                        int i212 = i8;
                        int i222 = i212 & 7168;
                        boolean zM1984h52 = go0Var2.m1984h(t91Var6) | (i222 != 2048 ? true : z8) | ((i212 & 57344) != 16384);
                        o03 o03Var62 = o03Var;
                        int i232 = i9;
                        boolean zM1984h62 = zM1984h52 | go0Var2.m1984h(o03Var62) | (i232 != 4);
                        i10 = (i212 & 112) ^ 48;
                        if (i10 <= 32) {
                        }
                        z9 = zM1984h62;
                        o03Var2 = o03Var62;
                        if ((i212 & 48) != 32) {
                        }
                        zM1984h = z9 | z20 | go0Var2.m1984h(us1Var62) | go0Var2.m1984h(j20Var22) | go0Var2.m1984h(c0548om22) | go0Var2.m1984h(b03Var42);
                        Object objM1956L1722 = go0Var2.m1956L();
                        if (zM1984h) {
                        }
                    }
                }
                yk0Var2 = yk0Var;
                if (z7) {
                    sd0 sd0Var22 = (sd0) sz0Var.f10437j;
                    sd0Var22.f10057d = -1;
                    sd0Var22.f10058e = -1;
                    k03Var2 = k03Var;
                    k03VarM2598a = k03.m2598a(k03Var2, null, 0L, 3);
                    k03 k03Var42 = (k03) sz0Var.f10436i;
                    sz0Var.f10436i = k03VarM2598a;
                    if (t03Var != null) {
                    }
                    objM1956L = go0Var2.m1956L();
                    c0160eb2 = c0160eb;
                    if (objM1956L == c0160eb2) {
                    }
                    w73Var = (w73) objM1956L;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (w73Var.f12390e) {
                    }
                }
            } else {
                z5 = true;
            }
            iz2Var = new iz2(c0690sd4, m13Var2, z4, e70Var, xl0Var, 0);
            m13 m13Var32 = m13Var2;
            final e70 e70Var32 = e70Var;
            if (t91Var6.f10622a != iz2Var) {
            }
            t91Var6.f10622a = iz2Var;
            sz0Var = t91Var6.f10625d;
            t03 t03Var2 = t91Var6.f10626e;
            f13Var2 = f13Var;
            boolean zM5086l2 = t11.m5086l(f13Var2, ((sd0) sz0Var.f10437j).m4802h());
            if (t11.m5086l(((k03) sz0Var.f10436i).f5296a.f10051i, c0690sd2.f10051i)) {
            }
            if (f13Var2 != null) {
            }
            yk0Var2 = yk0Var;
            if (z7) {
            }
        } else {
            go0Var = go0Var4;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: g10
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM3902N = pp0.m3902N(i3 | 1);
                    int iM3902N2 = pp0.m3902N(i4);
                    gf1.m1879a(k03Var, in0Var, uh1Var, m13Var, wb3Var, in0Var2, ft2Var, z, i, i2, xx0Var, k51Var, z2, z3, c0402kw, (InterfaceC0596px) obj2, iM3902N, iM3902N2);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static String m1880a0(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX INFO: renamed from: b */
    public static final void m1881b(uh1 uh1Var, b03 b03Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2036174316);
        int i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i | (go0Var.m1984h(b03Var) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, true);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1Var);
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
            s11.m4692f(b03Var, c0402kw, go0Var, (i2 >> 3) & 126);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new tt0(uh1Var, b03Var, c0402kw, i, 5);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static uh1 m1882b0(uh1 uh1Var, nl2 nl2Var) {
        return uh1Var.mo4491c(ci0.m825z(rh1.f9587a, iu0.f4785c)).mo4491c(new ol2(null, null, nl2Var.f7219d, qv1.f9205h, nl2Var, true, true)).mo4491c(new cm2(nl2Var));
    }

    /* JADX INFO: renamed from: c */
    public static final void m1883c(b03 b03Var, boolean z, InterfaceC0596px interfaceC0596px, int i) {
        z03 z03VarM5146d;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(626339208);
        int i2 = (go0Var.m1984h(b03Var) ? 4 : 2) | i | (go0Var.m1982g(z) ? 32 : 16);
        if (!go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            go0Var.m1961R();
        } else if (z) {
            go0Var.m1966W(1530097388);
            t91 t91Var = b03Var.f483d;
            y03 y03Var = null;
            if (t91Var != null && (z03VarM5146d = t91Var.m5146d()) != null) {
                y03 y03Var2 = z03VarM5146d.f13697a;
                t91 t91Var2 = b03Var.f483d;
                if (!(t91Var2 != null ? t91Var2.f10637p : true)) {
                    y03Var = y03Var2;
                }
            }
            if (y03Var == null) {
                go0Var.m1966W(1530097387);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(1530097388);
                if (f13.m1494c(b03Var.m350n().f5297b)) {
                    go0Var.m1966W(2110860558);
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(2109807302);
                    int iMo2451p = b03Var.f481b.mo2451p((int) (b03Var.m350n().f5297b >> 32));
                    int iMo2451p2 = b03Var.f481b.mo2451p((int) (b03Var.m350n().f5297b & 4294967295L));
                    c92 c92VarM6201a = y03Var.m6201a(iMo2451p);
                    c92 c92VarM6201a2 = y03Var.m6201a(Math.max(iMo2451p2 - 1, 0));
                    t91 t91Var3 = b03Var.f483d;
                    if (t91Var3 == null || !((Boolean) t91Var3.f10634m.getValue()).booleanValue()) {
                        go0Var.m1966W(2110490542);
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(2110225306);
                        up0.m5538c(true, c92VarM6201a, b03Var, go0Var, ((i2 << 6) & 896) | 6);
                        go0Var.m1994p(false);
                    }
                    t91 t91Var4 = b03Var.f483d;
                    if (t91Var4 == null || !((Boolean) t91Var4.f10635n.getValue()).booleanValue()) {
                        go0Var.m1966W(2110838734);
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(2110574459);
                        up0.m5538c(false, c92VarM6201a2, b03Var, go0Var, ((i2 << 6) & 896) | 6);
                        go0Var.m1994p(false);
                    }
                    go0Var.m1994p(false);
                }
                t91 t91Var5 = b03Var.f483d;
                if (t91Var5 != null) {
                    nx1 nx1Var = t91Var5.f10633l;
                    if (!t11.m5086l(b03Var.f500u.f5296a.f10051i, b03Var.m350n().f5296a.f10051i)) {
                        nx1Var.setValue(Boolean.FALSE);
                    }
                    if (t91Var5.m5144b()) {
                        if (((Boolean) nx1Var.getValue()).booleanValue()) {
                            b03Var.m354r();
                        } else {
                            b03Var.m351o();
                        }
                    }
                }
                go0Var.m1994p(false);
            }
            go0Var.m1994p(false);
        } else {
            go0Var.m1966W(1989076778);
            go0Var.m1994p(false);
            b03Var.m351o();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new m10(b03Var, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1884c0(a20 a20Var, Object obj, Object obj2, mn0 mn0Var, t00 t00Var) throws Throwable {
        C0322iq c0322iq;
        Object objM1629V;
        Object objMo12g;
        if (t00Var instanceof C0322iq) {
            c0322iq = (C0322iq) t00Var;
            int i = c0322iq.f4741o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0322iq.f4741o = i - Integer.MIN_VALUE;
            } else {
                c0322iq = new C0322iq(t00Var);
            }
        }
        Object obj3 = c0322iq.f4740n;
        int i2 = c0322iq.f4741o;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = c0322iq.f4739m;
            a20 a20Var2 = c0322iq.f4738l;
            try {
                fg1.m1627T(obj3);
                objM1629V = obj4;
                a20Var = a20Var2;
                fg1.m1620M(a20Var, objM1629V);
                return obj3;
            } catch (Throwable th) {
                objM1629V = obj4;
                a20Var = a20Var2;
                th = th;
                fg1.m1620M(a20Var, objM1629V);
                throw th;
            }
        }
        fg1.m1627T(obj3);
        objM1629V = fg1.m1629V(a20Var, obj2);
        try {
            c0322iq.f4737k = obj;
            c0322iq.f4738l = a20Var;
            c0322iq.f4739m = objM1629V;
            c0322iq.f4741o = 1;
            xt2 xt2Var = new xt2(c0322iq, a20Var);
            if (mn0Var == null) {
                objMo12g = m1886d0(mn0Var, obj, xt2Var);
            } else {
                xe1.m6119f(2, mn0Var);
                objMo12g = mn0Var.mo12g(obj, xt2Var);
            }
            obj3 = objMo12g;
            Object obj5 = k20.f5323h;
            if (obj3 == obj5) {
                return obj5;
            }
            fg1.m1620M(a20Var, objM1629V);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            fg1.m1620M(a20Var, objM1629V);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1885d(b03 b03Var, InterfaceC0596px interfaceC0596px, int i) {
        C0690sd c0690sdM349m;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1436003720);
        int i2 = 2;
        int i3 = (go0Var.m1984h(b03Var) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            t91 t91Var = b03Var.f483d;
            if (t91Var == null || !((Boolean) t91Var.f10636o.getValue()).booleanValue() || (c0690sdM349m = b03Var.m349m()) == null || c0690sdM349m.f10051i.length() <= 0) {
                go0Var.m1966W(-2111042550);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-2112351432);
                boolean zM1980f = go0Var.m1980f(b03Var);
                Object objM1956L = go0Var.m1956L();
                C0160eb c0160eb = C0520nx.f7360a;
                if (zM1980f || objM1956L == c0160eb) {
                    objM1956L = new xz2(b03Var);
                    go0Var.m1981f0(objM1956L);
                }
                kz2 kz2Var = (kz2) objM1956L;
                e70 e70Var = (e70) go0Var.m1988j(AbstractC0441ly.f6382h);
                us1 us1Var = b03Var.f481b;
                long j = b03Var.m350n().f5297b;
                int i4 = f13.f2738c;
                int iMo2451p = us1Var.mo2451p((int) (j >> 32));
                t91 t91Var2 = b03Var.f483d;
                z03 z03VarM5146d = t91Var2 != null ? t91Var2.m5146d() : null;
                z03VarM5146d.getClass();
                y03 y03Var = z03VarM5146d.f13697a;
                o62 o62VarM6203c = y03Var.m6203c(ci0.m779D(iMo2451p, 0, y03Var.f13266a.f12754a.f10051i.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((e70Var.mo689A(2.0f) / 2.0f) + o62VarM6203c.f7536a)) << 32) | (((long) Float.floatToRawIntBits(o62VarM6203c.f7539d)) & 4294967295L);
                boolean zM1978e = go0Var.m1978e(jFloatToRawIntBits);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1978e || objM1956L2 == c0160eb) {
                    objM1956L2 = new p10(jFloatToRawIntBits);
                    go0Var.m1981f0(objM1956L2);
                }
                ws1 ws1Var = (ws1) objM1956L2;
                boolean zM1984h = go0Var.m1984h(kz2Var) | go0Var.m1984h(b03Var);
                Object objM1956L3 = go0Var.m1956L();
                if (zM1984h || objM1956L3 == c0160eb) {
                    objM1956L3 = new s10(kz2Var, b03Var);
                    go0Var.m1981f0(objM1956L3);
                }
                uh1 uh1VarM5804a = vw2.m5804a(rh1.f9587a, kz2Var, (PointerInputEventHandler) objM1956L3);
                boolean zM1978e2 = go0Var.m1978e(jFloatToRawIntBits);
                Object objM1956L4 = go0Var.m1956L();
                if (zM1978e2 || objM1956L4 == c0160eb) {
                    objM1956L4 = new C0082c8(jFloatToRawIntBits, i2);
                    go0Var.m1981f0(objM1956L4);
                }
                AbstractC0157e8.m1289a(ws1Var, nn2.m3321a(uh1VarM5804a, false, (in0) objM1956L4), 0L, go0Var, 0);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0686s9(i, 5, b03Var);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static Object m1886d0(mn0 mn0Var, Object obj, t00 t00Var) {
        mn0Var.getClass();
        a20 a20VarMo2508f = t00Var.mo2508f();
        Object w11Var = a20VarMo2508f == zd0.f13837h ? new w11(t00Var) : new x11(t00Var, a20VarMo2508f);
        xe1.m6119f(2, mn0Var);
        return mn0Var.mo12g(obj, w11Var);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1887e(final boolean z, final String str, final String str2, final String str3, final List list, final boolean z2, final in0 in0Var, final xm0 xm0Var, final xm0 xm0Var2, InterfaceC0596px interfaceC0596px, final int i) {
        go0 go0Var;
        Object c0756u0;
        String str4;
        xk1 xk1Var;
        String str5;
        int i2;
        str.getClass();
        str2.getClass();
        list.getClass();
        in0Var.getClass();
        xm0Var.getClass();
        xm0Var2.getClass();
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(799923100);
        int i3 = i | (go0Var2.m1982g(z) ? 4 : 2) | (go0Var2.m1980f(str) ? 32 : 16) | (go0Var2.m1980f(str2) ? 256 : 128) | (go0Var2.m1980f(str3) ? 2048 : 1024) | (go0Var2.m1980f(list) ? 16384 : 8192) | (go0Var2.m1982g(z2) ? 131072 : 65536) | (go0Var2.m1984h(in0Var) ? 1048576 : 524288) | (go0Var2.m1984h(xm0Var) ? 8388608 : 4194304) | (go0Var2.m1984h(xm0Var2) ? 67108864 : 33554432);
        if (go0Var2.m1958O(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objM1956L = go0Var2.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            Object obj = objM1956L;
            if (z3 || objM1956L == c0160eb) {
                List listM3757M = AbstractC0570p7.m3757M(str2);
                ArrayList arrayList = new ArrayList();
                Iterator it = listM3757M.iterator();
                while (it.hasNext()) {
                    C0363ju c0363juM3758N = AbstractC0570p7.m3758N((String) it.next());
                    if (c0363juM3758N != null) {
                        arrayList.add(c0363juM3758N);
                    }
                }
                go0Var2.m1981f0(arrayList);
                obj = arrayList;
            }
            final List list2 = (List) obj;
            boolean z4 = ((57344 & i3) == 16384) | (i4 == 256);
            Object objM1956L2 = go0Var2.m1956L();
            Object obj2 = objM1956L2;
            if (z4 || objM1956L2 == c0160eb) {
                List listM3753I = AbstractC0570p7.m3753I(str2, list);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listM3753I.iterator();
                while (it2.hasNext()) {
                    C0363ju c0363juM3758N2 = AbstractC0570p7.m3758N((String) it2.next());
                    if (c0363juM3758N2 != null) {
                        arrayList2.add(c0363juM3758N2);
                    }
                }
                go0Var2.m1981f0(arrayList2);
                obj2 = arrayList2;
            }
            final List list3 = (List) obj2;
            Object objM1956L3 = go0Var2.m1956L();
            if (objM1956L3 == c0160eb) {
                x13 x13VarM1874V = m1874V(str3 == null ? str2 : str3);
                if (x13VarM1874V == null) {
                    x13VarM1874V = new x13(330.0f, 0.7f, 0.93f);
                }
                objM1956L3 = op0.m3598u(x13VarM1874V);
                go0Var2.m1981f0(objM1956L3);
            }
            xk1 xk1Var2 = (xk1) objM1956L3;
            boolean z5 = ((i3 & 7168) == 2048) | (i4 == 256);
            Object objM1956L4 = go0Var2.m1956L();
            if (z5 || objM1956L4 == c0160eb) {
                str4 = str3;
                xk1Var = xk1Var2;
                str5 = str2;
                i2 = 1;
                c0756u0 = new C0756u0(str4, str5, xk1Var, null, 5);
                go0Var2.m1981f0(c0756u0);
            } else {
                c0756u0 = objM1956L4;
                xk1Var = xk1Var2;
                str5 = str2;
                i2 = 1;
                str4 = str3;
            }
            AbstractC0179eu.m1457g(str4, str5, (mn0) c0756u0, go0Var2);
            String strM4462P = rg3.m4462P(R.string.home_settings_theme_color_dialog_title, go0Var2);
            C0402kw c0402kwM6126i0 = xe1.m6126i0(1615906809, new C0237ge(i2, xm0Var, xm0Var2, z2), go0Var2);
            final String str6 = str5;
            final String str7 = str4;
            final xk1 xk1Var3 = xk1Var;
            go0 go0Var3 = go0Var2;
            qp0.m4249d(z, xm0Var, null, strM4462P, null, c0402kwM6126i0, xe1.m6126i0(1510281200, new nn0() { // from class: s13
                @Override // p000.nn0
                /* JADX INFO: renamed from: e */
                public final Object mo489e(Object obj3, Object obj4, Object obj5) {
                    String strM4462P2;
                    long jM2565b;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((C0069bv) obj3).getClass();
                    go0 go0Var4 = (go0) interfaceC0596px2;
                    if (go0Var4.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                        uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(AbstractC0731te.f10693e, 0.0f, 420.0f, 1), gf1.m1868P(go0Var4));
                        C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var4, 0);
                        int iHashCode = Long.hashCode(go0Var4.f3614T);
                        yy1 yy1VarM1990l = go0Var4.m1990l();
                        uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var4, uh1VarM1882b0);
                        InterfaceC0293hx.f4166c.getClass();
                        C0367jy c0367jy = C0256gx.f3727b;
                        go0Var4.m1969Z();
                        if (go0Var4.f3613S) {
                            go0Var4.m1989k(c0367jy);
                        } else {
                            go0Var4.m1987i0();
                        }
                        yf3.m6268c(go0Var4, C0256gx.f3730e, c0032avM6346a);
                        yf3.m6268c(go0Var4, C0256gx.f3729d, yy1VarM1990l);
                        yf3.m6268c(go0Var4, C0256gx.f3731f, Integer.valueOf(iHashCode));
                        yf3.m6267b(go0Var4, C0256gx.f3732g);
                        yf3.m6268c(go0Var4, C0256gx.f3728c, uh1VarM5285M);
                        gf1.m1889g(rg3.m4462P(R.string.home_settings_theme_color_presets, go0Var4), go0Var4, 0);
                        List list4 = list2;
                        String str8 = str7;
                        in0 in0Var2 = in0Var;
                        gf1.m1891i(list4, str8, in0Var2, go0Var4, 0);
                        List list5 = list3;
                        boolean zIsEmpty = list5.isEmpty();
                        rh1 rh1Var = rh1.f9587a;
                        if (zIsEmpty) {
                            go0Var4.m1966W(-1016555704);
                            go0Var4.m1994p(false);
                        } else {
                            go0Var4.m1966W(-1016926650);
                            rp0.m4529O(go0Var4, AbstractC0731te.m5186O(rh1Var, 16.0f));
                            gf1.m1889g(rg3.m4462P(R.string.home_settings_theme_color_recent, go0Var4), go0Var4, 0);
                            gf1.m1891i(list5, str8, in0Var2, go0Var4, 0);
                            go0Var4.m1994p(false);
                        }
                        gf1.m1889g(vi0.m5687f(rh1Var, 16.0f, go0Var4, R.string.home_settings_theme_color_custom, go0Var4), go0Var4, 0);
                        tp0.m5357b(str, in0Var2, null, str6, null, xe1.m6126i0(-6519394, new C0481n0(str8, 11), go0Var4), false, 0, 0, false, false, null, new m51(2, 122), null, go0Var4, 196608, 384, 12244);
                        uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        if (str8 == null) {
                            go0Var4.m1966W(1629804526);
                            strM4462P2 = rg3.m4462P(R.string.home_settings_invalid_color, go0Var4);
                            go0Var4.m1994p(false);
                        } else {
                            go0Var4.m1966W(1629803844);
                            go0Var4.m1994p(false);
                            strM4462P2 = str8;
                        }
                        if (str8 == null) {
                            go0Var4.m1966W(-1015518010);
                            jM2565b = C0363ju.m2565b(0.72f, ((lp1) go0Var4.m1988j(ur1.f11452a)).f6238f);
                            go0Var4.m1994p(false);
                        } else {
                            go0Var4.m1966W(-1015415462);
                            jM2565b = ((lp1) go0Var4.m1988j(ur1.f11452a)).f6238f;
                            go0Var4.m1994p(false);
                        }
                        AbstractC0179eu.m1446a(strM4462P2, uh1VarM1615G, new m13(jM2565b, rg3.m4450D(12), im0.f4681k, 0L, 0, rg3.m4450D(16), null, null, 16646136), 0, false, 0, 0, go0Var4, 48, 1016);
                        gf1.m1889g(vi0.m5687f(rh1Var, 16.0f, go0Var4, R.string.home_settings_theme_color_palette, go0Var4), go0Var4, 0);
                        xk1 xk1Var4 = xk1Var3;
                        x13 x13Var = (x13) xk1Var4.getValue();
                        boolean zM1980f = go0Var4.m1980f(in0Var2);
                        Object objM1956L5 = go0Var4.m1956L();
                        if (zM1980f || objM1956L5 == C0520nx.f7360a) {
                            objM1956L5 = new d62(3, in0Var2, xk1Var4);
                            go0Var4.m1981f0(objM1956L5);
                        }
                        gf1.m1888f(x13Var, (in0) objM1956L5, go0Var4, 0);
                        go0Var4.m1994p(true);
                    } else {
                        go0Var4.m1961R();
                    }
                    return a83.f116a;
                }
            }, go0Var2), go0Var3, 1769472 | (i3 & 14) | ((i3 >> 18) & 112), 20);
            go0Var = go0Var3;
        } else {
            go0 go0Var4 = go0Var2;
            go0Var4.m1961R();
            go0Var = go0Var4;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(z, str, str2, str3, list, z2, in0Var, xm0Var, xm0Var2, i) { // from class: t13

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f10493h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ String f10494i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ String f10495j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ String f10496k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ List f10497l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ boolean f10498m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ in0 f10499n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ xm0 f10500o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ xm0 f10501p;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM3902N = pp0.m3902N(1);
                    gf1.m1887e(this.f10493h, this.f10494i, this.f10495j, this.f10496k, this.f10497l, this.f10498m, this.f10499n, this.f10500o, this.f10501p, (InterfaceC0596px) obj3, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1888f(x13 x13Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1059164154);
        int i2 = 2;
        int i3 = (go0Var.m1980f(x13Var) ? 4 : 2) | i | (go0Var.m1984h(in0Var) ? 32 : 16);
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(new C0884xf(10.0f, new C0676s(i2)), C0700sn.f10233u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1.f9587a);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            int i4 = i3 & 126;
            m1893k(x13Var, in0Var, go0Var, i4);
            m1892j(x13Var, in0Var, go0Var, i4);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new r13(x13Var, in0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1889g(String str, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(33252188);
        int i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0179eu.m1446a(str, null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6237e, rg3.m4450D(13), im0.f4682l, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, i2 & 14, 1018);
            rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1.f9587a, 8.0f));
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0481n0(str, i, 12);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m1890h(final C0363ju c0363ju, uh1 uh1Var, boolean z, final float f, xm0 xm0Var, InterfaceC0596px interfaceC0596px, final int i, final int i2) {
        boolean z2;
        int i3;
        xm0 xm0Var2;
        int i4;
        final uh1 uh1Var2;
        final xm0 xm0Var3;
        long j;
        long jM2565b;
        rh1 rh1Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(168475778);
        int i5 = i | (go0Var.m1980f(c0363ju) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (go0Var.m1982g(z2) ? 256 : 128);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
            xm0Var2 = xm0Var;
        } else {
            xm0Var2 = xm0Var;
            i4 = i3 | (go0Var.m1984h(xm0Var2) ? 16384 : 8192);
        }
        if (go0Var.m1958O(i4 & 1, (i4 & 9363) != 9362)) {
            if (i7 != 0) {
                z2 = false;
            }
            xm0 xm0Var4 = i8 != 0 ? null : xm0Var2;
            fb2 fb2VarM1827a = gb2.m1827a(10.0f);
            rh1 rh1Var2 = rh1.f9587a;
            uh1 uh1VarM5287O = xm0Var4 != null ? AbstractC0738tl.m5287O(rh1Var2, xm0Var4) : rh1Var2;
            uh1 uh1VarM825z = ci0.m825z(AbstractC0731te.m5211g0(rh1Var2, f), fb2VarM1827a);
            if (c0363ju == null) {
                go0Var.m1966W(-1303519415);
                j = ((lp1) go0Var.m1988j(ur1.f11452a)).f6235c;
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1303520221);
                go0Var.m1994p(false);
                j = c0363ju.f5219a;
            }
            uh1 uh1VarM1896n = m1896n(uh1VarM825z, j, sp0.f10267h);
            float f2 = z2 ? 2.0f : 1.0f;
            if (z2) {
                go0Var.m1966W(-1754273284);
                jM2565b = ((lp1) go0Var.m1988j(ur1.f11452a)).f6237e;
                go0Var.m1994p(false);
            } else if (c0363ju == null) {
                go0Var.m1966W(-1754181183);
                jM2565b = ((lp1) go0Var.m1988j(ur1.f11452a)).f6236d;
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1754111898);
                jM2565b = C0363ju.m2565b(0.18f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f);
                go0Var.m1994p(false);
            }
            uh1 uh1VarMo4491c = uh1VarM1896n.mo4491c(new C0660rl(f2, new ft2(jM2565b), fb2VarM1827a)).mo4491c(uh1VarM5287O);
            nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10226n, false);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarMo4491c);
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
            if (z2 && c0363ju != null) {
                go0Var.m1966W(1261979587);
                sx0 sx0VarM4625b = AbstractC0691se.f10073f;
                if (sx0VarM4625b == null) {
                    rx0 rx0Var = new rx0("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i9 = s93.f9998a;
                    ft2 ft2Var = new ft2(C0363ju.f5212b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new cy1(9.0f, 16.17f));
                    arrayList.add(new by1(4.83f, 12.0f));
                    arrayList.add(new jy1(-1.42f, 1.41f));
                    arrayList.add(new by1(9.0f, 19.0f));
                    arrayList.add(new by1(21.0f, 7.0f));
                    arrayList.add(new jy1(-1.41f, -1.41f));
                    arrayList.add(yx1.f13662c);
                    rx0.m4624a(rx0Var, arrayList, ft2Var);
                    sx0VarM4625b = rx0Var.m4625b();
                    AbstractC0691se.f10073f = sx0VarM4625b;
                }
                sx0 sx0Var = sx0VarM4625b;
                uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1Var2, 0.52f * f);
                AbstractC0708su abstractC0708suM2569f = C0363ju.m2569f(c0363ju.f5219a);
                if (!tp0.m5371s(abstractC0708suM2569f.f10369b, 12884901888L)) {
                    jz0.m2596a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) tp0.m5353Q(abstractC0708suM2569f.f10369b)));
                }
                ga2 ga2Var = ((ka2) abstractC0708suM2569f).f5431p;
                float fMo687e = (float) ((ga2Var.mo687e(C0363ju.m2568e(r13)) * 0.0722d) + (ga2Var.mo687e(C0363ju.m2570g(r13)) * 0.7152d) + (ga2Var.mo687e(C0363ju.m2571h(r13)) * 0.2126d));
                if (fMo687e < 0.0f) {
                    fMo687e = 0.0f;
                }
                fx0.m1724a(sx0Var, uh1VarM5211g0, ((fMo687e > 1.0f ? 1 : (fMo687e == 1.0f ? 0 : -1)) > 0 ? 1.0f : fMo687e) > 0.58f ? C0363ju.m2565b(0.72f, C0363ju.f5212b) : C0363ju.f5213c, go0Var, 48);
                go0Var.m1994p(false);
                rh1Var = rh1Var2;
            } else if (c0363ju == null) {
                go0Var.m1966W(1262422670);
                rh1Var = rh1Var2;
                AbstractC0179eu.m1446a("!", null, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(16), im0.f4683m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var = go0Var;
                go0Var.m1994p(false);
            } else {
                rh1Var = rh1Var2;
                go0Var.m1966W(1262732422);
                go0Var.m1994p(false);
            }
            go0Var.m1994p(true);
            xm0Var3 = xm0Var4;
            uh1Var2 = rh1Var;
        } else {
            go0Var.m1961R();
            uh1Var2 = uh1Var;
            xm0Var3 = xm0Var2;
        }
        final boolean z3 = z2;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(uh1Var2, z3, f, xm0Var3, i, i2) { // from class: u13

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ uh1 f11061i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f11062j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ float f11063k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ xm0 f11064l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ int f11065m;

                {
                    this.f11065m = i2;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(3073);
                    gf1.m1890h(this.f11060h, this.f11061i, this.f11062j, this.f11063k, this.f11064l, (InterfaceC0596px) obj, iM3902N, this.f11065m);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m1891i(List list, String str, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1949900876);
        int i3 = 2;
        int i4 = (go0Var.m1980f(list) ? 4 : 2) | i | (go0Var.m1980f(str) ? 32 : 16) | (go0Var.m1984h(in0Var) ? 256 : 128);
        if (go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
            float f = 8.0f;
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(new C0884xf(8.0f, new C0676s(i3)), C0700sn.f10233u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            rh1 rh1Var = rh1.f9587a;
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, rh1Var);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            go0Var.m1966W(-932834156);
            for (List list2 : AbstractC0142du.m1156l0(6, list)) {
                ob2 ob2VarM3265a = nb2.m3265a(new C0884xf(f, new C0676s(i3)), C0700sn.f10232t, go0Var, 54);
                int iHashCode2 = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l2 = go0Var.m1990l();
                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, rh1Var);
                InterfaceC0293hx.f4166c.getClass();
                C0367jy c0367jy2 = C0256gx.f3727b;
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy2);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, C0256gx.f3730e, ob2VarM3265a);
                yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l2);
                yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                yf3.m6267b(go0Var, C0256gx.f3732g);
                yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M2);
                go0Var.m1966W(-19073330);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    long j = ((C0363ju) it.next()).f5219a;
                    boolean zM1978e = go0Var.m1978e(j);
                    Object objM1956L = go0Var.m1956L();
                    C0160eb c0160eb = C0520nx.f7360a;
                    if (zM1978e || objM1956L == c0160eb) {
                        objM1956L = AbstractC0570p7.m3759O(j);
                        go0Var.m1981f0(objM1956L);
                    }
                    String str2 = (String) objM1956L;
                    C0363ju c0363ju = new C0363ju(j);
                    boolean zM5086l = t11.m5086l(str2, str);
                    boolean zM1980f = ((i4 & 896) == 256) | go0Var.m1980f(str2);
                    Object objM1956L2 = go0Var.m1956L();
                    if (zM1980f || objM1956L2 == c0160eb) {
                        i2 = 1;
                        objM1956L2 = new bu1(in0Var, str2, i2);
                        go0Var.m1981f0(objM1956L2);
                    } else {
                        i2 = 1;
                    }
                    m1890h(c0363ju, null, zM5086l, 34.0f, (xm0) objM1956L2, go0Var, 3072, 2);
                    rh1Var = rh1Var;
                }
                go0Var.m1994p(false);
                go0Var.m1994p(true);
                f = 8.0f;
                i3 = 2;
            }
            go0Var.m1994p(false);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new tt0(list, str, in0Var, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m1892j(x13 x13Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        xk1 xk1Var;
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2132943518);
        int i4 = (go0Var.m1980f(x13Var) ? 4 : 2) | i | (go0Var.m1984h(in0Var) ? 32 : 16);
        char c = 1;
        if (go0Var.m1958O(i4 & 1, (i4 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(new h11(0L));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var2 = (xk1) objM1956L;
            int i5 = i4 & 14;
            xk1 xk1VarM3601x = op0.m3601x(x13Var, go0Var);
            xk1 xk1VarM3601x2 = op0.m3601x(in0Var, go0Var);
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                float f = 359.999f;
                List listM1435P = AbstractC0179eu.m1435P(Float.valueOf(0.0f), Float.valueOf(60.0f), Float.valueOf(120.0f), Float.valueOf(180.0f), Float.valueOf(240.0f), Float.valueOf(300.0f), Float.valueOf(359.999f));
                i3 = 0;
                ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM1435P, 10));
                Iterator it = listM1435P.iterator();
                while (it.hasNext()) {
                    float fM778C = ci0.m778C(((Number) it.next()).floatValue(), 0.0f, f);
                    float fM778C2 = ci0.m778C(1.0f, 0.0f, 1.0f);
                    float fM778C3 = ci0.m778C(1.0f, 0.0f, 1.0f);
                    float[] fArr = new float[3];
                    fArr[0] = fM778C;
                    fArr[c] = fM778C2;
                    fArr[2] = fM778C3;
                    arrayList.add(new C0363ju(sp0.m4930b(Color.HSVToColor(fArr))));
                    xk1VarM3601x = xk1VarM3601x;
                    c = 1;
                    f = 359.999f;
                }
                xk1Var = xk1VarM3601x;
                go0Var.m1981f0(arrayList);
                objM1956L2 = arrayList;
            } else {
                xk1Var = xk1VarM3601x;
                i3 = 0;
            }
            List list = (List) objM1956L2;
            boolean zM1974c = go0Var.m1974c(x13Var.f12767a);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1974c || objM1956L3 == c0160eb) {
                objM1956L3 = new C0363ju(m1873U(x13.m6023a(x13Var, 0.0f, 1.0f, 1.0f, 1)));
                go0Var.m1981f0(objM1956L3);
            }
            long j = ((C0363ju) objM1956L3).f5219a;
            fb2 fb2VarM1827a = gb2.m1827a(999.0f);
            uh1 uh1VarMo4491c = ci0.m825z(AbstractC0731te.m5186O(AbstractC0731te.f10693e, 28.0f), fb2VarM1827a).mo4491c(new C0660rl(1.0f, new ft2(((lp1) go0Var.m1988j(ur1.f11452a)).f6236d), fb2VarM1827a));
            Object objM1956L4 = go0Var.m1956L();
            if (objM1956L4 == c0160eb) {
                objM1956L4 = new C0590pr(xk1Var2, 25);
                go0Var.m1981f0(objM1956L4);
            }
            uh1 uh1VarM1859G = m1859G(uh1VarMo4491c, (in0) objM1956L4);
            h11 h11Var = new h11(((h11) xk1Var2.getValue()).f3775a);
            xk1 xk1Var3 = xk1Var;
            boolean zM1980f = go0Var.m1980f(xk1VarM3601x2) | go0Var.m1980f(xk1Var3);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1980f || objM1956L5 == c0160eb) {
                objM1956L5 = new w13(xk1Var2, xk1VarM3601x2, xk1Var3, i3);
                go0Var.m1981f0(objM1956L5);
            }
            uh1 uh1VarM5804a = vw2.m5804a(uh1VarM1859G, h11Var, (PointerInputEventHandler) objM1956L5);
            boolean zM1984h = go0Var.m1984h(list) | (i5 == 4) | go0Var.m1978e(j);
            Object objM1956L6 = go0Var.m1956L();
            if (zM1984h || objM1956L6 == c0160eb) {
                objM1956L6 = new wo1(list, x13Var, j);
                go0Var.m1981f0(objM1956L6);
            }
            i2 = 0;
            AbstractC0179eu.m1448b(uh1VarM5804a, (in0) objM1956L6, go0Var, 0);
        } else {
            i2 = 0;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new r13(x13Var, in0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m1893k(x13 x13Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-473367067);
        int i2 = (go0Var.m1980f(x13Var) ? 4 : 2) | i | (go0Var.m1984h(in0Var) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(new h11(0L));
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            int i3 = i2 & 14;
            xk1 xk1VarM3601x = op0.m3601x(x13Var, go0Var);
            xk1 xk1VarM3601x2 = op0.m3601x(in0Var, go0Var);
            boolean zM1974c = go0Var.m1974c(x13Var.f12767a);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1974c || objM1956L2 == c0160eb) {
                C0363ju c0363ju = new C0363ju(m1873U(x13.m6023a(x13Var, 0.0f, 1.0f, 1.0f, 1)));
                go0Var.m1981f0(c0363ju);
                objM1956L2 = c0363ju;
            }
            long j = ((C0363ju) objM1956L2).f5219a;
            fb2 fb2VarM1827a = gb2.m1827a(12.0f);
            uh1 uh1VarMo4491c = ci0.m825z(up0.m5541f(AbstractC0731te.f10693e), fb2VarM1827a).mo4491c(new C0660rl(1.0f, new ft2(((lp1) go0Var.m1988j(ur1.f11452a)).f6236d), fb2VarM1827a));
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = new C0590pr(xk1Var, 26);
                go0Var.m1981f0(objM1956L3);
            }
            uh1 uh1VarM1859G = m1859G(uh1VarMo4491c, (in0) objM1956L3);
            h11 h11Var = new h11(((h11) xk1Var.getValue()).f3775a);
            boolean zM1980f = go0Var.m1980f(xk1VarM3601x2) | go0Var.m1980f(xk1VarM3601x);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1980f || objM1956L4 == c0160eb) {
                objM1956L4 = new w13(xk1Var, xk1VarM3601x2, xk1VarM3601x, 1);
                go0Var.m1981f0(objM1956L4);
            }
            uh1 uh1VarM5804a = vw2.m5804a(uh1VarM1859G, h11Var, (PointerInputEventHandler) objM1956L4);
            boolean zM1978e = go0Var.m1978e(j) | (i3 == 4);
            Object objM1956L5 = go0Var.m1956L();
            if (zM1978e || objM1956L5 == c0160eb) {
                objM1956L5 = new bp1(j, x13Var);
                go0Var.m1981f0(objM1956L5);
            }
            AbstractC0179eu.m1448b(uh1VarM5804a, (in0) objM1956L5, go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new r13(x13Var, in0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m1894l(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, long j) {
        if (((int) (((h11) xk1Var.getValue()).f3775a >> 32)) <= 0) {
            return;
        }
        ((in0) xk1Var2.getValue()).mo5j(x13.m6023a((x13) xk1Var3.getValue(), ci0.m778C(ci0.m778C(Float.intBitsToFloat((int) (j >> 32)) / ((int) (((h11) xk1Var.getValue()).f3775a >> 32)), 0.0f, 1.0f) * 359.999f, 0.0f, 359.999f), 0.0f, 0.0f, 6));
    }

    /* JADX INFO: renamed from: m */
    public static final void m1895m(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, long j) {
        if (((int) (((h11) xk1Var.getValue()).f3775a >> 32)) <= 0 || ((int) (((h11) xk1Var.getValue()).f3775a & 4294967295L)) <= 0) {
            return;
        }
        ((in0) xk1Var2.getValue()).mo5j(x13.m6023a((x13) xk1Var3.getValue(), 0.0f, ci0.m778C(Float.intBitsToFloat((int) (j >> 32)) / ((int) (((h11) xk1Var.getValue()).f3775a >> 32)), 0.0f, 1.0f), ci0.m778C(1.0f - (Float.intBitsToFloat((int) (j & 4294967295L)) / ((int) (4294967295L & ((h11) xk1Var.getValue()).f3775a))), 0.0f, 1.0f), 1));
    }

    /* JADX INFO: renamed from: n */
    public static final uh1 m1896n(uh1 uh1Var, long j, eq2 eq2Var) {
        return uh1Var.mo4491c(new C0463mj(j, eq2Var));
    }

    /* JADX INFO: renamed from: o */
    public static int m1897o(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static t00 m1898p(t00 t00Var, t00 t00Var2, mn0 mn0Var) {
        mn0Var.getClass();
        if (mn0Var instanceof AbstractC0658rj) {
            return ((AbstractC0658rj) mn0Var).mo13p(t00Var2, t00Var);
        }
        a20 a20VarMo2508f = t00Var2.mo2508f();
        return a20VarMo2508f == zd0.f13837h ? new u11(t00Var2, t00Var, mn0Var) : new v11(t00Var2, a20VarMo2508f, mn0Var, t00Var);
    }

    /* JADX INFO: renamed from: q */
    public static String m1899q(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c = (char) (byteBuffer.get() & 255);
            if (c == 0) {
                return sb.toString();
            }
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & 63)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static Bitmap m1900r(InputStream inputStream, BitmapFactory.Options options, C0043b5 c0043b5) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !AbstractC0691se.m4851v(options) || !m1854B(c0043b5)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        Bitmap.Config config = options.inPreferredConfig;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        fg1.m1640o("", config == config2);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                options.inPreferredConfig = config2;
                return null;
            }
            try {
                Bitmap bitmapM1871S = m1871S(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = config2;
                return bitmapM1871S;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m1901s(t91 t91Var) {
        t03 t03Var = t91Var.f10626e;
        if (t03Var != null) {
            t91Var.f10643v.mo5j(k03.m2598a((k03) t91Var.f10625d.f10436i, null, 0L, 3));
            o03 o03Var = t03Var.f10465a;
            AtomicReference atomicReference = o03Var.f7409b;
            while (true) {
                if (atomicReference.compareAndSet(t03Var, null)) {
                    o03Var.f7408a.mo2882g();
                    break;
                } else if (atomicReference.get() != t03Var) {
                    break;
                }
            }
        }
        t91Var.f10626e = null;
    }

    /* JADX INFO: renamed from: t */
    public static C0769ud m1902t(DexKitBridge dexKitBridge, C0073c c0073c) {
        Object objValueOf;
        dexKitBridge.getClass();
        int iM3661b = c0073c.m3661b(4);
        if (iM3661b != 0) {
            c0073c.f7869b.getInt(iM3661b + c0073c.f7868a);
        }
        int i = 6;
        int iM3661b2 = c0073c.m3661b(6);
        if (iM3661b2 != 0) {
            c0073c.f7869b.getInt(iM3661b2 + c0073c.f7868a);
        }
        int iM3661b3 = c0073c.m3661b(8);
        String strM3663d = iM3661b3 != 0 ? c0073c.m3663d(iM3661b3 + c0073c.f7868a) : null;
        strM3663d.getClass();
        int iM3661b4 = c0073c.m3661b(10);
        byte b = iM3661b4 != 0 ? c0073c.f7869b.get(iM3661b4 + c0073c.f7868a) : (byte) 0;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            C0676s.m4651j(vi0.m5688g("Unknown AnnotationVisibilityType: ", b));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM3661b5 = c0073c.m3661b(12);
        int iM3665f = iM3661b5 != 0 ? c0073c.m3665f(iM3661b5) : 0;
        int i2 = 0;
        while (i2 < iM3665f) {
            C0000a c0000a = new C0000a();
            int iM3661b6 = c0073c.m3661b(12);
            if (iM3661b6 != 0) {
                int iM3660a = c0073c.m3660a((i2 * 4) + c0073c.m3664e(iM3661b6));
                ByteBuffer byteBuffer = c0073c.f7869b;
                byteBuffer.getClass();
                c0000a.m3662c(iM3660a, byteBuffer);
            } else {
                c0000a = null;
            }
            c0000a.getClass();
            C0000a c0000a2 = new C0000a();
            int iM3661b7 = c0000a.m3661b(i);
            if (iM3661b7 != 0) {
                int iM3660a2 = c0000a.m3660a(iM3661b7 + c0000a.f7868a);
                ByteBuffer byteBuffer2 = c0000a.f7869b;
                byteBuffer2.getClass();
                c0000a2.m3662c(iM3660a2, byteBuffer2);
            } else {
                c0000a2 = null;
            }
            c0000a2.getClass();
            int iM3661b8 = c0000a.m3661b(4);
            String strM3663d2 = iM3661b8 != 0 ? c0000a.m3663d(iM3661b8 + c0000a.f7868a) : null;
            strM3663d2.getClass();
            int iM3661b9 = c0000a2.m3661b(i);
            int iM6143t = xe1.m6143t(iM3661b9 != 0 ? c0000a2.f7869b.get(iM3661b9 + c0000a2.f7868a) : (byte) 0);
            switch (vi0.m5702u(iM6143t)) {
                case 0:
                    ox2 ox2VarM4k = c0000a2.m4k(new C0259h());
                    ox2VarM4k.getClass();
                    C0259h c0259h = (C0259h) ox2VarM4k;
                    int iM3661b10 = c0259h.m3661b(4);
                    objValueOf = Byte.valueOf(iM3661b10 != 0 ? c0259h.f7869b.get(iM3661b10 + c0259h.f7868a) : (byte) 0);
                    break;
                case 1:
                    ox2 ox2VarM4k2 = c0000a2.m4k(new C0523o());
                    ox2VarM4k2.getClass();
                    C0523o c0523o = (C0523o) ox2VarM4k2;
                    int iM3661b11 = c0523o.m3661b(4);
                    objValueOf = Short.valueOf(iM3661b11 != 0 ? c0523o.f7869b.getShort(iM3661b11 + c0523o.f7868a) : (short) 0);
                    break;
                case 2:
                    ox2 ox2VarM4k3 = c0000a2.m4k(new C0296i());
                    ox2VarM4k3.getClass();
                    C0296i c0296i = (C0296i) ox2VarM4k3;
                    int iM3661b12 = c0296i.m3661b(4);
                    objValueOf = Short.valueOf(iM3661b12 != 0 ? c0296i.f7869b.getShort(iM3661b12 + c0296i.f7868a) : (short) 0);
                    break;
                case 3:
                    ox2 ox2VarM4k4 = c0000a2.m4k(new C0406l());
                    ox2VarM4k4.getClass();
                    C0406l c0406l = (C0406l) ox2VarM4k4;
                    int iM3661b13 = c0406l.m3661b(4);
                    objValueOf = Integer.valueOf(iM3661b13 != 0 ? c0406l.f7869b.getInt(iM3661b13 + c0406l.f7868a) : 0);
                    break;
                case 4:
                    ox2 ox2VarM4k5 = c0000a2.m4k(new C0443m());
                    ox2VarM4k5.getClass();
                    C0443m c0443m = (C0443m) ox2VarM4k5;
                    int iM3661b14 = c0443m.m3661b(4);
                    objValueOf = Long.valueOf(iM3661b14 != 0 ? c0443m.f7869b.getLong(iM3661b14 + c0443m.f7868a) : 0L);
                    break;
                case 5:
                    ox2 ox2VarM4k6 = c0000a2.m4k(new C0369k());
                    ox2VarM4k6.getClass();
                    C0369k c0369k = (C0369k) ox2VarM4k6;
                    int iM3661b15 = c0369k.m3661b(4);
                    objValueOf = Float.valueOf(iM3661b15 != 0 ? c0369k.f7869b.getFloat(iM3661b15 + c0369k.f7868a) : 0.0f);
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    ox2 ox2VarM4k7 = c0000a2.m4k(new C0331j());
                    ox2VarM4k7.getClass();
                    C0331j c0331j = (C0331j) ox2VarM4k7;
                    int iM3661b16 = c0331j.m3661b(4);
                    objValueOf = Double.valueOf(iM3661b16 != 0 ? c0331j.f7869b.getDouble(iM3661b16 + c0331j.f7868a) : 0.0d);
                    break;
                case 7:
                    ox2 ox2VarM4k8 = c0000a2.m4k(new C0562p());
                    ox2VarM4k8.getClass();
                    C0562p c0562p = (C0562p) ox2VarM4k8;
                    int iM3661b17 = c0562p.m3661b(4);
                    objValueOf = iM3661b17 != 0 ? c0562p.m3663d(iM3661b17 + c0562p.f7868a) : null;
                    objValueOf.getClass();
                    break;
                case 8:
                    ox2 ox2VarM4k9 = c0000a2.m4k(new C0185f());
                    ox2VarM4k9.getClass();
                    objValueOf = AbstractC0738tl.m5327z(dexKitBridge, (C0185f) ox2VarM4k9);
                    break;
                case 9:
                    ox2 ox2VarM4k10 = c0000a2.m4k(new C0638r());
                    ox2VarM4k10.getClass();
                    objValueOf = p40.m3737t(dexKitBridge, (C0638r) ox2VarM4k10);
                    break;
                case 10:
                    ox2 ox2VarM4k11 = c0000a2.m4k(new C0599q());
                    ox2VarM4k11.getClass();
                    objValueOf = AbstractC0691se.m4813B(dexKitBridge, (C0599q) ox2VarM4k11);
                    break;
                case 11:
                    ox2 ox2VarM4k12 = c0000a2.m4k(new C0037b());
                    ox2VarM4k12.getClass();
                    objValueOf = fg1.m1649x(dexKitBridge, (C0037b) ox2VarM4k12);
                    break;
                case 12:
                    ox2 ox2VarM4k13 = c0000a2.m4k(new C0073c());
                    ox2VarM4k13.getClass();
                    objValueOf = m1902t(dexKitBridge, (C0073c) ox2VarM4k13);
                    break;
                case 13:
                    ox2 ox2VarM4k14 = c0000a2.m4k(new C0480n());
                    ox2VarM4k14.getClass();
                    objValueOf = (C0480n) ox2VarM4k14;
                    break;
                case 14:
                    ox2 ox2VarM4k15 = c0000a2.m4k(new C0222g());
                    ox2VarM4k15.getClass();
                    C0222g c0222g = (C0222g) ox2VarM4k15;
                    int iM3661b18 = c0222g.m3661b(4);
                    objValueOf = Boolean.valueOf((iM3661b18 == 0 || c0222g.f7869b.get(iM3661b18 + c0222g.f7868a) == 0) ? false : true);
                    break;
                default:
                    c80.m675s();
                    return null;
            }
            arrayList.add(new C0806vd(dexKitBridge, strM3663d2, new C0882xd(iM6143t, objValueOf)));
            i2++;
            i = 6;
        }
        return new C0769ud(dexKitBridge, strM3663d, arrayList);
    }

    /* JADX INFO: renamed from: u */
    public static final String m1903u(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: v */
    public static final float m1904v(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX INFO: renamed from: w */
    public static boolean m1905w() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC0045b7.f620U0 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0045b7.f620U0 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0045b7.f621V0 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0045b7.f620U0;
                ViewTreeObserverOnGlobalLayoutListenerC0045b7.f621V0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC0045b7.f621V0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return t11.m5086l(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static eb2 m1906x(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C0676s.m4651j(vi0.m5688g("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new eb2(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m1907y(w03 w03Var, Layout layout, C0093cj c0093cj, int i, RectF rectF, om2 om2Var, C0686s9 c0686s9, boolean z) {
        f61[] f61VarArr;
        f61[] f61VarArr2;
        int i2;
        int iMo1103c;
        int i3;
        int i4;
        int iMo1102b;
        Bidi bidiCreateLineBidi;
        boolean z2;
        float fM1477a;
        float fM1477a2;
        float fM1477a3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = w03Var.f12246f;
        int lineStart2 = layout2.getLineStart(i);
        int iM5819f = w03Var.m5819f(i);
        if (i5 < (iM5819f - lineStart2) * 2) {
            lz0.m2988a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        eu0 eu0Var = new eu0(w03Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iM5819f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !zIsRtlCharAt) {
                fM1477a = eu0Var.m1477a(lineStart2, z3, z3, true);
                fM1477a3 = eu0Var.m1477a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && zIsRtlCharAt) {
                z2 = z4;
                fM1477a3 = eu0Var.m1477a(lineStart2, false, false, false);
                fM1477a = eu0Var.m1477a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (zIsRtlCharAt) {
                    fM1477a2 = eu0Var.m1477a(lineStart2, false, false, true);
                    fM1477a = eu0Var.m1477a(lineStart2 + 1, true, true, true);
                } else {
                    fM1477a = eu0Var.m1477a(lineStart2, false, false, false);
                    fM1477a2 = eu0Var.m1477a(lineStart2 + 1, true, true, false);
                }
                fM1477a3 = fM1477a2;
            }
            fArr[i6] = fM1477a;
            fArr[i6 + 1] = fM1477a3;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) c0093cj.f1579a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM835j = c0093cj.m835j(lineStart3, false);
        int iM836k = c0093cj.m836k(iM835j);
        int i7 = lineStart3 - iM836k;
        int i8 = lineEnd2 - iM836k;
        Bidi bidiM830e = c0093cj.m830e(iM835j);
        if (bidiM830e == null || (bidiCreateLineBidi = bidiM830e.createLineBidi(i7, i8)) == null) {
            f61VarArr = new f61[]{new f61(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            f61VarArr = new f61[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                f61VarArr[i9] = new f61(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        a11 c11Var = z ? new c11(0, f61VarArr.length - 1, 1) : new a11(f61VarArr.length - 1, 0, -1);
        int i11 = c11Var.f25h;
        int i12 = c11Var.f26i;
        int i13 = c11Var.f27j;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            f61 f61Var = f61VarArr[i11];
            boolean z5 = f61Var.f2815c;
            int iMo1105k = f61Var.f2813a;
            int iMo1106l = f61Var.f2814b;
            float f = z5 ? fArr[((iMo1106l - 1) - lineStart) * 2] : fArr[(iMo1105k - lineStart) * 2];
            float fM1904v = z5 ? m1904v(iMo1105k, lineStart, fArr) : m1904v(iMo1106l - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                f61VarArr2 = f61VarArr;
                if (fM1904v >= f2) {
                    float f3 = rectF.right;
                    if (f > f3) {
                        iMo1106l = -1;
                        iMo1105k = iMo1106l;
                    } else {
                        if ((z5 || f3 < fM1904v) && (!z5 || f2 > f)) {
                            int i15 = iMo1106l;
                            int i16 = iMo1105k;
                            while (i15 - i16 > 1) {
                                int i17 = (i15 + i16) / 2;
                                float f4 = fArr[(i17 - lineStart) * 2];
                                int i18 = i15;
                                if ((z5 || f4 <= rectF.right) && (!z5 || f4 >= rectF.left)) {
                                    i15 = i18;
                                    i16 = i17;
                                } else {
                                    i15 = i17;
                                }
                            }
                            i2 = z5 ? i15 : i16;
                        } else {
                            i2 = iMo1106l - 1;
                        }
                        int iMo1102b2 = om2Var.mo1102b(i2 + 1);
                        if (iMo1102b2 != -1 && (iMo1103c = om2Var.mo1103c(iMo1102b2)) > iMo1105k) {
                            if (iMo1102b2 < iMo1105k) {
                                iMo1102b2 = iMo1105k;
                            }
                            if (iMo1103c <= iMo1106l) {
                                iMo1106l = iMo1103c;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo1102b3 = iMo1102b2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((iMo1106l - 1) - lineStart) * 2] : fArr[(iMo1102b3 - lineStart) * 2];
                                rectF2.right = z5 ? m1904v(iMo1102b3, lineStart, fArr) : m1904v(iMo1106l - 1, lineStart, fArr);
                                if (((Boolean) c0686s9.mo12g(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo1106l = om2Var.mo1106l(iMo1106l);
                                if (iMo1106l == -1 || iMo1106l <= iMo1105k) {
                                    break;
                                }
                                iMo1102b3 = om2Var.mo1102b(iMo1106l);
                                if (iMo1102b3 < iMo1105k) {
                                    iMo1102b3 = iMo1105k;
                                }
                            }
                            iMo1106l = -1;
                            iMo1105k = iMo1106l;
                        }
                    }
                }
            } else if (fM1904v >= f2) {
                float f5 = rectF.right;
                if (f > f5) {
                    f61VarArr2 = f61VarArr;
                    iMo1105k = -1;
                } else {
                    if ((z5 || f2 > f) && (!z5 || f5 < fM1904v)) {
                        int i19 = iMo1106l;
                        int i20 = iMo1105k;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z5 || f6 <= rectF.left) && (!z5 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z5 ? i3 : i20;
                    } else {
                        i4 = iMo1105k;
                    }
                    int iMo1103c2 = om2Var.mo1103c(i4);
                    if (iMo1103c2 != -1 && (iMo1102b = om2Var.mo1102b(iMo1103c2)) < iMo1106l) {
                        if (iMo1102b >= iMo1105k) {
                            iMo1105k = iMo1102b;
                        }
                        if (iMo1103c2 > iMo1106l) {
                            iMo1103c2 = iMo1106l;
                        }
                        f61VarArr2 = f61VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo1103c3 = iMo1103c2;
                        while (true) {
                            rectF3.left = z5 ? fArr[((iMo1103c3 - 1) - lineStart) * 2] : fArr[(iMo1105k - lineStart) * 2];
                            rectF3.right = z5 ? m1904v(iMo1105k, lineStart, fArr) : m1904v(iMo1103c3 - 1, lineStart, fArr);
                            if (((Boolean) c0686s9.mo12g(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo1105k = om2Var.mo1105k(iMo1105k);
                            if (iMo1105k == -1 || iMo1105k >= iMo1106l) {
                                break;
                            }
                            iMo1103c3 = om2Var.mo1103c(iMo1105k);
                            if (iMo1103c3 > iMo1106l) {
                                iMo1103c3 = iMo1106l;
                            }
                        }
                    }
                    iMo1105k = -1;
                }
            }
            if (iMo1105k >= 0) {
                return iMo1105k;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            f61VarArr = f61VarArr2;
        }
    }

    /* JADX INFO: renamed from: z */
    public static t00 m1908z(t00 t00Var) {
        t00Var.getClass();
        u00 u00Var = t00Var instanceof u00 ? (u00) t00Var : null;
        if (u00Var == null || (t00Var = u00Var.f11030j) != null) {
            return t00Var;
        }
        c20 c20Var = (c20) u00Var.mo2508f().mo15o(gd3.f3438p);
        t00 k90Var = c20Var != null ? new k90(c20Var, u00Var) : u00Var;
        u00Var.f11030j = k90Var;
        return k90Var;
    }
}
