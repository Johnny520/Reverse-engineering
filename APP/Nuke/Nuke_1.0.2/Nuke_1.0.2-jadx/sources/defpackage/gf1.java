package defpackage;

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
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
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
import nuke.module.wechat.ai.AIChatConfig;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf1 {
    public static final kw a = new kw(-117350969, false, new ow(16));
    public static final kw b = new kw(311456068, false, new ow(17));
    public static final qa c = new qa(2);
    public static sx0 d;
    public static sx0 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void A(j61 j61Var) {
        sp0.c0(j61Var).E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean B(b5 b5Var) {
        try {
            boolean zV = b5Var.v();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zV;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zV);
            return zV;
        } catch (IOException e2) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean C(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int D(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        c80.v(vi0.h("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void E(t91 t91Var, k03 k03Var, us1 us1Var) {
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            z03 z03VarD = t91Var.d();
            if (z03VarD == null) {
                return;
            }
            t03 t03Var = t91Var.e;
            if (t03Var == null) {
                return;
            }
            c61 c61VarC = t91Var.c();
            if (c61VarC == null) {
                return;
            }
            eu.S(k03Var, t91Var.a, z03VarD.a, c61VarC, t03Var, t91Var.b(), us1Var);
        } finally {
            tl.U(vr2VarB, vr2VarK, in0VarE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 F(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new mk0(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 G(uh1 uh1Var, in0 in0Var) {
        return uh1Var.c(new ut1(in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean H(JsObject jsObject, String str) {
        Object obj = jsObject.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        c80.p("INVALID_ARGUMENT", str.concat(" must be a boolean."), 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static k31 I(l41 l41Var) {
        boolean z;
        try {
            try {
                l41Var.I();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return (k31) v53.z.b(l41Var);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return a41.h;
                }
                throw new t31(e);
            }
        } catch (ke1 e4) {
            throw new t31(e4);
        } catch (IOException e5) {
            throw new t31(e5);
        } catch (NumberFormatException e6) {
            throw new t31(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final bg2 J(Object obj) {
        d41 d41Var;
        Boolean boolH;
        Boolean boolH2;
        JsObject jsObjectE0 = sp0.e0("request", obj);
        JsObject jsObjectE02 = sp0.e0("request.media", jsObjectE0.get((Object) "media"));
        Object obj2 = jsObjectE02.get((Object) "metadata");
        boolean zBooleanValue = false;
        if (obj2 != null) {
            j31 j31VarZ = Z(obj2, "request.media.metadata", 0);
            d41Var = j31VarZ instanceof d41 ? (d41) j31VarZ : null;
            if (d41Var == null) {
                c80.p("INVALID_ARGUMENT", "request.media.metadata must be an object.", 0, null, null, 28);
                return null;
            }
        } else {
            d41Var = new d41(ce0.h);
        }
        d41 d41Var2 = d41Var;
        String strG0 = sp0.g0("request.media.platform", jsObjectE02.get((Object) "platform"));
        String strG02 = sp0.g0("request.media.accountId", jsObjectE02.get((Object) "accountId"));
        String strG03 = sp0.g0("request.media.id", jsObjectE02.get((Object) "id"));
        String strG04 = sp0.g0("request.media.kind", jsObjectE02.get((Object) "kind"));
        Object obj3 = jsObjectE02.get((Object) "expiresAt");
        ai2 ai2Var = new ai2(strG0, strG02, strG03, strG04, obj3 != null ? Long.valueOf(sp0.d0(obj3, "request.media.expiresAt", Long.MIN_VALUE, Long.MAX_VALUE)) : null, d41Var2);
        hg2 hg2VarY = i51.y("request.destination", jsObjectE0.get((Object) "destination"));
        fg2 fg2Var = hg2VarY.a;
        if (fg2Var == fg2.h) {
            c80.p("PERMISSION_DENIED", "Media cannot be downloaded into package.", 0, null, null, 28);
            return null;
        }
        JsObject jsObjectS = sp0.S("request.options", jsObjectE0.get((Object) "options"));
        String lowerCase = fg2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        di2 di2Var = new di2(lowerCase, hg2VarY.b);
        boolean zBooleanValue2 = (jsObjectS == null || (boolH2 = H(jsObjectS, "overwrite")) == null) ? false : boolH2.booleanValue();
        if (jsObjectS != null && (boolH = H(jsObjectS, "createParents")) != null) {
            zBooleanValue = boolH.booleanValue();
        }
        return new bg2(ai2Var, di2Var, zBooleanValue2, zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final zj2 K(Object obj) {
        JsObject jsObjectE0 = sp0.e0("request", obj);
        JsObject jsObjectE02 = sp0.e0("request.conversation", jsObjectE0.get((Object) "conversation"));
        yf2 yf2Var = new yf2(sp0.g0("request.conversation".concat(".platform"), jsObjectE02.get((Object) "platform")), sp0.g0("request.conversation".concat(".accountId"), jsObjectE02.get((Object) "accountId")), sp0.g0("request.conversation".concat(".id"), jsObjectE02.get((Object) "id")), sp0.g0("request.conversation".concat(".type"), jsObjectE02.get((Object) "type")), sp0.T(jsObjectE02, "name"));
        Object obj2 = jsObjectE0.get((Object) "segments");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            c80.p("INVALID_ARGUMENT", "request.segments must be an array.", 0, null, null, 28);
            return null;
        }
        if (list.isEmpty() || list.size() > 128) {
            c80.p("INVALID_ARGUMENT", "request.segments must contain 1 to 128 items.", 0, null, null, 28);
            return null;
        }
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        int i = 0;
        for (Object obj3 : list) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            JsObject jsObjectE03 = sp0.e0("request.segments[" + i + "]", obj3);
            String strG0 = sp0.g0("request.segments[" + i + "].type", jsObjectE03.get((Object) "type"));
            if (pv2.s0(strG0)) {
                c80.p("INVALID_ARGUMENT", "Message segment type must not be blank.", 0, null, null, 28);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : jsObjectE03.entrySet()) {
                if (!t11.l(entry.getKey(), "type")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(xe1.U(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                String str = (String) entry2.getKey();
                linkedHashMap2.put(key, Z(entry2.getValue(), "request.segments[" + i + "]." + str, 0));
            }
            arrayList.add(new ki2(new d41(linkedHashMap2), strG0));
            i = i2;
        }
        return new zj2(yf2Var, arrayList, sp0.T(jsObjectE0, "replyTo"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L(ViewStructure viewStructure, r61 r61Var, AutofillId autofillId, String str, q62 q62Var) {
        int i;
        long j;
        long j2;
        char c2;
        long j3;
        boolean zBooleanValue;
        u23 u23Var;
        sd sdVar;
        v8 v8Var;
        x7 x7Var;
        boolean z;
        k00 k00Var;
        Boolean bool;
        va2 va2Var;
        boolean z2;
        Integer num;
        int i2;
        List list;
        ?? r13;
        String[] strArrA;
        String[] strArrA2;
        rk1 rk1Var;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        rk1 rk1Var2;
        u23 u23Var2;
        sd sdVar2;
        v8 v8Var2;
        yn2 yn2Var = vn2.a;
        yn2 yn2Var2 = kn2.a;
        ln2 ln2VarW = r61Var.w();
        int i4 = 8;
        if (ln2VarW == null || (rk1Var2 = ln2VarW.h) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            u23Var = null;
            sdVar = null;
            v8Var = null;
            x7Var = null;
            z = false;
            k00Var = null;
            bool = null;
            va2Var = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr3 = rk1Var2.b;
            j = 128;
            Object[] objArr4 = rk1Var2.c;
            long[] jArr3 = rk1Var2.a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i5 = 0;
                x7Var = null;
                j2 = 255;
                z = false;
                u23Var2 = null;
                sdVar2 = null;
                v8Var2 = null;
                k00Var = null;
                bool = null;
                va2Var = null;
                z2 = false;
                num = null;
                c2 = 7;
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
                                if (t11.l(yn2Var3, vn2.s)) {
                                    obj2.getClass();
                                    x7Var = (x7) obj2;
                                } else if (t11.l(yn2Var3, vn2.a)) {
                                    obj2.getClass();
                                    String str2 = (String) du.q0((List) obj2);
                                    if (str2 != null) {
                                        viewStructure.setContentDescription(str2);
                                    }
                                } else if (t11.l(yn2Var3, vn2.r)) {
                                    obj2.getClass();
                                    k00Var = (k00) obj2;
                                } else if (t11.l(yn2Var3, vn2.t)) {
                                    obj2.getClass();
                                    v8Var2 = (v8) obj2;
                                } else if (t11.l(yn2Var3, vn2.G)) {
                                    obj2.getClass();
                                    sdVar2 = (sd) obj2;
                                } else if (t11.l(yn2Var3, vn2.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (t11.l(yn2Var3, vn2.P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (t11.l(yn2Var3, vn2.L)) {
                                    z2 = true;
                                } else if (t11.l(yn2Var3, vn2.o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (t11.l(yn2Var3, vn2.z)) {
                                    obj2.getClass();
                                    va2Var = (va2) obj2;
                                } else if (t11.l(yn2Var3, vn2.J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (t11.l(yn2Var3, vn2.K)) {
                                    obj2.getClass();
                                    u23Var2 = (u23) obj2;
                                } else if (t11.l(yn2Var3, kn2.b)) {
                                    viewStructure.setClickable(true);
                                } else if (t11.l(yn2Var3, kn2.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (t11.l(yn2Var3, kn2.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (t11.l(yn2Var3, kn2.k)) {
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
                c2 = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                x7Var = null;
                z = false;
                u23Var2 = null;
                sdVar2 = null;
                v8Var2 = null;
                k00Var = null;
                bool = null;
                va2Var = null;
                z2 = false;
                num = null;
            }
            u23Var = u23Var2;
            sdVar = sdVar2;
            v8Var = v8Var2;
        }
        ln2 ln2VarW2 = r61Var.w();
        if (ln2VarW2 != null && ln2VarW2.j && !ln2VarW2.k) {
            ln2VarW2 = ln2VarW2.b();
            lk1 lk1Var = new lk1(((zk1) ((jk1) r61Var.n()).i).j);
            lk1Var.c(r61Var.n());
            while (lk1Var.i()) {
                r61 r61Var2 = (r61) lk1Var.k(lk1Var.b - 1);
                ln2 ln2VarW3 = r61Var2.w();
                if (ln2VarW3 != null && !ln2VarW3.j) {
                    ln2VarW2.d(ln2VarW3);
                    if (!ln2VarW3.k) {
                        lk1Var.c(r61Var2.n());
                    }
                }
            }
        }
        if (ln2VarW2 == null || (rk1Var = ln2VarW2.h) == null) {
            i2 = 1;
            list = null;
        } else {
            Object[] objArr5 = rk1Var.b;
            Object[] objArr6 = rk1Var.c;
            long[] jArr4 = rk1Var.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 1;
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i10];
                    int i11 = i4;
                    List list2 = list;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
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
                                if (t11.l(yn2Var4, vn2.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (t11.l(yn2Var4, vn2.C)) {
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
        Integer numValueOf = Integer.valueOf(r61Var.i);
        if (r61Var.u() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = x7Var != null ? Integer.valueOf(x7Var.a) : z ? Integer.valueOf(i2) : u23Var != null ? Integer.valueOf(i) : null;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (sdVar != null) {
            String strH0 = sdVar.i;
            if (strH0.length() >= 5000) {
                strH0 = (Character.isHighSurrogate(strH0.charAt(4999)) && Character.isLowSurrogate(strH0.charAt(5000))) ? pv2.H0(strH0, 4999) : pv2.H0(strH0, 5000);
            }
            viewStructure.setAutofillValue(AutofillValue.forText(strH0));
        }
        if (v8Var != null) {
            viewStructure.setAutofillValue(v8Var.a);
        }
        if (k00Var != null && (strArrA2 = sp0.A(k00Var)) != null) {
            viewStructure.setAutofillHints(strArrA2);
        }
        q62Var.b.v(r61Var.i, new b22(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (u23Var != null) {
            ?? r132 = i2;
            viewStructure.setCheckable(r132);
            viewStructure.setChecked(u23Var == u23.h ? r132 == true ? 1 : 0 : false);
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
        k00.a.getClass();
        String[] strArrA3 = sp0.A(j00.b);
        strArrA3.getClass();
        if (strArrA3.length == 0) {
            um2.i("Array is empty.");
            return;
        }
        ?? r23 = (z2 || ((k00Var == null || (strArrA = sp0.A(k00Var)) == null || mg.o0(strArrA, strArrA3[0]) < 0) ? 0 : r13) != 0) ? r13 : 0;
        viewStructure.setDataIsSensitive((r23 != 0 || zBooleanValue) ? r13 : 0);
        viewStructure.setVisibility(((zn1) r61Var.M.e).a1() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String strI = "";
            for (int i15 = 0; i15 < size; i15++) {
                sd sdVar3 = (sd) list.get(i15);
                StringBuilder sb = new StringBuilder();
                sb.append(strI);
                strI = hk1.i(sb, sdVar3.i, '\n');
            }
            viewStructure.setText(strI);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((jk1) r61Var.n()).isEmpty() && va2Var != null) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object M(Object[] objArr, xm0 xm0Var, px pxVar, int i) {
        return N(Arrays.copyOf(objArr, objArr.length), s11.e, xm0Var, pxVar, ((i << 6) & 7168) | 384);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object N(Object[] objArr, wc2 wc2Var, xm0 xm0Var, px pxVar, int i) {
        Object[] objArr2;
        wc2 wc2Var2;
        Object obj;
        Object objD;
        go0 go0Var = (go0) pxVar;
        long j = go0Var.T;
        xe1.j(36);
        String string = Long.toString(j, 36);
        string.getClass();
        wc2Var.getClass();
        fc2 fc2Var = (fc2) go0Var.j(hc2.a);
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            Object objE = (fc2Var == null || (objD = fc2Var.d(string)) == null) ? null : wc2Var.e(objD);
            if (objE == null) {
                objE = xm0Var.a();
            }
            objArr2 = objArr;
            wc2Var2 = wc2Var;
            bc2 bc2Var = new bc2(wc2Var2, fc2Var, string, objE, objArr2);
            go0Var.f0(bc2Var);
            objL = bc2Var;
        } else {
            objArr2 = objArr;
            wc2Var2 = wc2Var;
        }
        bc2 bc2Var2 = (bc2) objL;
        Object objA = Arrays.equals(objArr2, bc2Var2.l) ? bc2Var2.k : null;
        if (objA == null) {
            objA = xm0Var.a();
        }
        boolean zH = go0Var.h(bc2Var2) | ((((i & 112) ^ 48) > 32 && go0Var.h(wc2Var2)) || (i & 48) == 32) | go0Var.h(fc2Var) | go0Var.f(string) | go0Var.h(objA) | go0Var.h(objArr2);
        Object objL2 = go0Var.L();
        if (zH || objL2 == ebVar) {
            Object[] objArr3 = objArr2;
            obj = objA;
            mf mfVar = new mf(bc2Var2, wc2Var2, fc2Var, string, obj, objArr3);
            go0Var.f0(mfVar);
            objL2 = mfVar;
        } else {
            obj = objA;
        }
        eu.r((xm0) objL2, go0Var);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object O(Object[] objArr, wc2 wc2Var, xm0 xm0Var, px pxVar, int i) {
        return N(Arrays.copyOf(objArr, objArr.length), wc2Var, xm0Var, pxVar, ((i << 3) & 7168) | 384);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final nl2 P(px pxVar) {
        Object[] objArr = new Object[0];
        boolean zD = ((go0) pxVar).d(0);
        go0 go0Var = (go0) pxVar;
        Object objL = go0Var.L();
        if (zD || objL == nx.a) {
            objL = new hn1(14);
            go0Var.f0(objL);
        }
        return (nl2) O(objArr, nl2.j, (xm0) objL, go0Var, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int Q(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        s.j("Cannot round NaN value.");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long R(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        s.j("Cannot round NaN value.");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap S(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = np0.a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    fg1.o("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(np0.a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapU = f9.u(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapU.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapU.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapU.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapU.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapU.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapU.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapU.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapU;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void T(o03 o03Var, t91 t91Var, k03 k03Var, xx0 xx0Var, us1 us1Var) {
        sz0 sz0Var = t91Var.d;
        n10 n10Var = t91Var.v;
        n10 n10Var2 = t91Var.w;
        o72 o72Var = new o72();
        m0 m0Var = new m0(sz0Var, n10Var, o72Var);
        v02 v02Var = o03Var.a;
        v02Var.f(k03Var, xx0Var, m0Var, n10Var2);
        t03 t03Var = new t03(o03Var, v02Var);
        o03Var.b.set(t03Var);
        o72Var.i = t03Var;
        t91Var.e = t03Var;
        E(t91Var, k03Var, us1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long U(x13 x13Var) {
        return sp0.b(Color.HSVToColor(new float[]{ci0.C(x13Var.a, 0.0f, 359.999f), ci0.C(x13Var.b, 0.0f, 1.0f), ci0.C(x13Var.c, 0.0f, 1.0f)}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final x13 V(String str) {
        ju juVarN = p7.N(str);
        if (juVarN == null) {
            return null;
        }
        long j = juVarN.a;
        float[] fArr = new float[3];
        Color.colorToHSV(sp0.j0(j), fArr);
        return new x13(ci0.C(fArr[0], 0.0f, 359.999f), ci0.C(fArr[1], 0.0f, 1.0f), ci0.C(fArr[2], 0.0f, 1.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject W(yf2 yf2Var) {
        return new JsObject(we1.q0(new ow1("platform", yf2Var.a), new ow1("accountId", yf2Var.b), new ow1("id", yf2Var.c), new ow1("type", yf2Var.d), new ow1("name", yf2Var.e)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject X(ci2 ci2Var, jh2 jh2Var) {
        ci2Var.getClass();
        jh2Var.getClass();
        ow1 ow1Var = new ow1("eventId", ci2Var.a);
        ow1 ow1Var2 = new ow1("receivedAt", Long.valueOf(ci2Var.b));
        ow1 ow1Var3 = new ow1("platform", "wechat");
        id2 id2Var = ci2Var.c;
        ow1 ow1Var4 = new ow1("account", new JsObject(we1.q0(new ow1("platform", "wechat"), new ow1("id", id2Var.a), new ow1("name", id2Var.b))));
        ow1 ow1Var5 = new ow1("conversation", W(ci2Var.d));
        cl2 cl2Var = ci2Var.e;
        ow1 ow1Var6 = new ow1("sender", new JsObject(we1.q0(new ow1("id", cl2Var.a), new ow1("name", null), new ow1("displayName", null), new ow1("isSelf", Boolean.valueOf(cl2Var.b)))));
        ti2 ti2Var = ci2Var.f;
        ow1 ow1Var7 = new ow1("id", ti2Var.a);
        ow1 ow1Var8 = new ow1("timestamp", Long.valueOf(ti2Var.b));
        ow1 ow1Var9 = new ow1("direction", "incoming");
        ow1 ow1Var10 = new ow1("text", ti2Var.c);
        List<ei2> list = ti2Var.d;
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        for (ei2 ei2Var : list) {
            pe1 pe1Var = new pe1();
            ei2Var.getClass();
            ow1 ow1Var11 = ow1Var4;
            pe1Var.put("type", "text");
            for (Iterator it = ei2Var.a.h.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                pe1Var.put((String) entry.getKey(), t11.U((j31) entry.getValue()));
            }
            arrayList.add(new JsObject(pe1Var.b()));
            ow1Var4 = ow1Var11;
        }
        return new JsObject(we1.q0(ow1Var, ow1Var2, ow1Var3, ow1Var4, ow1Var5, ow1Var6, new ow1("message", new JsObject(we1.q0(ow1Var7, ow1Var8, ow1Var9, ow1Var10, new ow1("segments", arrayList)))), new ow1("rawMessage", jh2Var.a(ci2Var.g))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final JsObject Y(ak2 ak2Var) {
        ak2Var.getClass();
        return new JsObject(we1.q0(new ow1("id", null), new ow1("timestamp", Long.valueOf(ak2Var.a)), new ow1("conversation", W(ak2Var.b))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final j31 Z(Object obj, String str, int i) {
        if (i > 16) {
            c80.p("INVALID_ARGUMENT", str.concat(" is nested too deeply."), 0, null, null, 28);
            return null;
        }
        if (obj == null) {
            return z31.INSTANCE;
        }
        if (obj instanceof String) {
            return l31.c((String) obj);
        }
        if (obj instanceof Boolean) {
            return l31.a((Boolean) obj);
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
                return l31.b(number);
            }
            c80.p("INVALID_ARGUMENT", str.concat(" must be finite."), 0, null, null, 28);
            return null;
        }
        if (obj instanceof JsObject) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str2 = (String) entry.getKey();
                linkedHashMap.put(key, Z(entry.getValue(), str + "." + str2, i + 1));
            }
            return new d41(linkedHashMap);
        }
        if (!(obj instanceof List)) {
            throw new sd2("INVALID_ARGUMENT", str + " contains unsupported value type " + obj.getClass().getName() + ".", false, null, null, 28);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
        int i2 = 0;
        for (Object obj2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                eu.a0();
                throw null;
            }
            arrayList.add(Z(obj2, str + "[" + i2 + "]", i + 1));
            i2 = i3;
        }
        return new z21(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v35, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v36, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v48, resolved type: boolean */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final k03 k03Var, final in0 in0Var, final uh1 uh1Var, final m13 m13Var, final wb3 wb3Var, final in0 in0Var2, final ft2 ft2Var, final boolean z, final int i, final int i2, final xx0 xx0Var, final k51 k51Var, final boolean z2, final boolean z3, final kw kwVar, px pxVar, final int i3, final int i4) {
        int i5;
        int i6;
        go0 go0Var;
        int i7;
        sd sdVar;
        f13 f13Var;
        go0 go0Var2;
        tz2 tz2Var;
        q33 q33Var;
        us1 us1Var;
        int i8;
        int i9;
        o03 o03Var;
        xl0 xl0Var;
        l9 l9Var;
        yk0 yk0Var;
        td3 td3Var;
        sd sdVar2;
        Object t91Var;
        long j;
        e70 e70Var;
        m13 m13Var2;
        boolean z4;
        gl0 gl0Var;
        eb ebVar;
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
        k03 k03VarA;
        Object objL;
        eb ebVar2;
        w73 w73Var;
        Object objL2;
        Object objL3;
        Object objL4;
        w73 w73Var2;
        p02 p02Var;
        boolean z8;
        int i10;
        xx0 xx0Var2;
        boolean z9;
        o03 o03Var2;
        boolean zH;
        Object obj;
        go0 go0Var3;
        final t91 t91Var2;
        gl0 gl0Var2;
        int i11;
        eb ebVar3;
        int i12;
        w73 w73Var3;
        int i13;
        om omVar;
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
        Object v0Var;
        b03 b03Var2;
        uh1 uh1Var2;
        final t91 t91Var4;
        xk1 xk1Var;
        o03 o03Var4;
        final b03 b03Var3;
        final us1 us1Var3;
        final td3 td3Var2;
        boolean zH2;
        Object objL5;
        td3 td3Var3;
        uh1 uh1VarS;
        final t91 t91Var5;
        uh1 uh1VarS2;
        boolean zH3;
        Object objL6;
        int i14;
        int i15;
        Object objL7;
        int i16;
        xx0 xx0Var4;
        boolean z13;
        boolean zBooleanValue;
        l9 l9Var2;
        boolean zG;
        Object objL8;
        uh1 uh1VarC;
        Object ft2Var2;
        long j4;
        boolean zH4;
        Object objL9;
        int i17;
        boolean z14;
        long j5 = k03Var.b;
        f13 f13Var3 = k03Var.c;
        sd sdVar3 = k03Var.a;
        go0 go0Var4 = (go0) pxVar;
        go0Var4.X(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (go0Var4.f(k03Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= go0Var4.h(in0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= go0Var4.f(uh1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= go0Var4.f(m13Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= go0Var4.f(wb3Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= go0Var4.h(in0Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= go0Var4.f(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= go0Var4.f(ft2Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= go0Var4.g(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= go0Var4.d(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (go0Var4.d(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= go0Var4.f(xx0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= go0Var4.f(k51Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= go0Var4.g(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= go0Var4.g(z3) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= go0Var4.h(kwVar) ? 131072 : 65536;
        }
        int i18 = i6 | 1572864;
        if (go0Var4.O(i5 & 1, ((i5 & 306783379) == 306783378 && (i18 & 599187) == 599186) ? false : true)) {
            go0Var4.T();
            if ((i3 & 1) != 0 && !go0Var4.y()) {
                go0Var4.R();
            }
            go0Var4.q();
            Object objL10 = go0Var4.L();
            eb ebVar4 = nx.a;
            if (objL10 == ebVar4) {
                objL10 = new gl0();
                go0Var4.f0(objL10);
            }
            gl0 gl0Var3 = (gl0) objL10;
            Object objL11 = go0Var4.L();
            if (objL11 == ebVar4) {
                o91 o91Var = p91.a;
                objL11 = new l9();
                go0Var4.f0(objL11);
            }
            l9 l9Var3 = (l9) objL11;
            Object objL12 = go0Var4.L();
            if (objL12 == ebVar4) {
                objL12 = new o03(l9Var3);
                go0Var4.f0(objL12);
            }
            o03 o03Var5 = (o03) objL12;
            e70 e70Var2 = (e70) go0Var4.j(ly.h);
            xl0 xl0Var2 = (xl0) go0Var4.j(ly.k);
            long j6 = ((g13) go0Var4.j(h13.a)).b;
            yk0 yk0Var3 = (yk0) go0Var4.j(ly.i);
            td3 td3Var4 = (td3) go0Var4.j(ly.u);
            bt2 bt2Var = (bt2) go0Var4.j(ly.q);
            qv1 qv1Var = qv1.h;
            qv1 qv1Var2 = (i == 1 && !z && xx0Var.a) ? qv1.i : qv1Var;
            go0Var4.W(-213744626);
            Object[] objArr = {qv1Var2};
            dq1 dq1Var = tz2.g;
            boolean zD = go0Var4.d(qv1Var2.ordinal());
            Object objL13 = go0Var4.L();
            if (zD || objL13 == ebVar4) {
                objL13 = new ta(4, qv1Var2);
                go0Var4.f0(objL13);
            }
            tz2 tz2Var2 = (tz2) O(objArr, dq1Var, (xm0) objL13, go0Var4, 0);
            go0Var4.p(false);
            if (((qv1) tz2Var2.f.getValue()) != qv1Var2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(qv1Var2 == qv1Var ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i19 = i5 & 14;
            boolean z15 = (i19 == 4) | ((i5 & 57344) == 16384);
            Object objL14 = go0Var4.L();
            if (z15 || objL14 == ebVar4) {
                q33 q33VarA = l93.a(wb3Var, sdVar3);
                us1 us1Var4 = q33VarA.b;
                if (f13Var3 != null) {
                    long j7 = f13Var3.a;
                    int i20 = f13.c;
                    i7 = i19;
                    f13Var = f13Var3;
                    int iP = us1Var4.p((int) (j7 >> 32));
                    int iP2 = us1Var4.p((int) (j7 & 4294967295L));
                    int iMin = Math.min(iP, iP2);
                    int iMax = Math.max(iP, iP2);
                    qd qdVar = new qd(q33VarA.a);
                    sdVar = sdVar3;
                    qdVar.i.add(new pd(iMin, iMax, new lt2(0L, 0L, (im0) null, (gm0) null, (hm0) null, (mx2) null, (String) null, 0L, (xj) null, (m03) null, (kc1) null, 0L, gz2.c, (bq2) null, 61439), ""));
                    objL14 = new q33(qdVar.b(), us1Var4);
                } else {
                    i7 = i19;
                    sdVar = sdVar3;
                    f13Var = f13Var3;
                    objL14 = q33VarA;
                }
                go0Var4.f0(objL14);
            } else {
                i7 = i19;
                sdVar = sdVar3;
                f13Var = f13Var3;
            }
            q33 q33Var2 = (q33) objL14;
            sd sdVar4 = q33Var2.a;
            us1 us1Var5 = q33Var2.b;
            b62 b62VarX = go0Var4.x();
            if (b62VarX == null) {
                s.l("no recompose scope found");
                return;
            }
            b62VarX.b |= 1;
            boolean zF = go0Var4.f(bt2Var);
            Object objL15 = go0Var4.L();
            if (zF || objL15 == ebVar4) {
                go0Var2 = go0Var4;
                tz2Var = tz2Var2;
                q33Var = q33Var2;
                us1Var = us1Var5;
                i8 = i18;
                i9 = i7;
                o03Var = o03Var5;
                xl0Var = xl0Var2;
                l9Var = l9Var3;
                yk0Var = yk0Var3;
                td3Var = td3Var4;
                sdVar2 = sdVar;
                j = j5;
                e70Var = e70Var2;
                m13Var2 = m13Var;
                z4 = z;
                gl0Var = gl0Var3;
                ebVar = ebVar4;
                j2 = j6;
                t91Var = new t91(new iz2(sdVar4, m13Var2, z4, e70Var, xl0Var, 0), b62VarX, bt2Var);
                go0Var2.f0(t91Var);
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
                l9Var = l9Var3;
                yk0Var = yk0Var3;
                td3Var = td3Var4;
                sdVar2 = sdVar;
                t91Var = objL15;
                j = j5;
                e70Var = e70Var2;
                gl0Var = gl0Var3;
                ebVar = ebVar4;
                j2 = j6;
            }
            t91 t91Var6 = (t91) t91Var;
            t91Var6.u = in0Var;
            t91Var6.z = j2;
            b5 b5Var = t91Var6.r;
            b5Var.j = k51Var;
            b5Var.k = yk0Var;
            t91Var6.j = sdVar2;
            iz2 iz2Var2 = t91Var6.a;
            if (t11.l(iz2Var2.a, sdVar4) && t11.l(iz2Var2.b, m13Var2) && iz2Var2.e == z4) {
                z5 = true;
                if (iz2Var2.f == 1 && iz2Var2.c == Integer.MAX_VALUE && iz2Var2.d == 1 && t11.l(iz2Var2.g, e70Var) && t11.l(iz2Var2.i, be0.h) && iz2Var2.h == xl0Var) {
                    iz2Var = iz2Var2;
                }
                m13 m13Var3 = m13Var2;
                final e70 e70Var3 = e70Var;
                if (t91Var6.a != iz2Var) {
                    t91Var6.p = z5;
                }
                t91Var6.a = iz2Var;
                sz0Var = t91Var6.d;
                t03 t03Var = t91Var6.e;
                f13Var2 = f13Var;
                boolean zL = t11.l(f13Var2, ((sd0) sz0Var.j).h());
                if (t11.l(((k03) sz0Var.i).a.i, sdVar2.i)) {
                    j3 = j;
                    sz0Var.j = new sd0(sdVar2, j3);
                    z7 = z5;
                    z6 = false;
                } else {
                    j3 = j;
                    if (f13.b(((k03) sz0Var.i).b, j3)) {
                        z6 = false;
                    } else {
                        ((sd0) sz0Var.j).l(f13.f(j3), f13.e(j3));
                        z6 = true;
                    }
                    z7 = false;
                }
                if (f13Var2 != null) {
                    sd0 sd0Var = (sd0) sz0Var.j;
                    sd0Var.d = -1;
                    sd0Var.e = -1;
                } else {
                    long j8 = f13Var2.a;
                    if (!f13.c(j8)) {
                        yk0Var2 = yk0Var;
                        ((sd0) sz0Var.j).k(f13.f(j8), f13.e(j8));
                    }
                    if (z7 || !(z6 || zL)) {
                        sd0 sd0Var2 = (sd0) sz0Var.j;
                        sd0Var2.d = -1;
                        sd0Var2.e = -1;
                        k03Var2 = k03Var;
                        k03VarA = k03.a(k03Var2, null, 0L, 3);
                    } else {
                        k03Var2 = k03Var;
                        k03VarA = k03Var2;
                    }
                    k03 k03Var4 = (k03) sz0Var.i;
                    sz0Var.i = k03VarA;
                    if (t03Var != null) {
                        t03Var.a(k03Var4, k03VarA);
                    }
                    objL = go0Var2.L();
                    ebVar2 = ebVar;
                    if (objL == ebVar2) {
                        objL = new w73();
                        go0Var2.f0(objL);
                    }
                    w73Var = (w73) objL;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (w73Var.e) {
                        w73Var.d = Long.valueOf(jCurrentTimeMillis);
                        w73Var.a(k03Var2);
                        objL2 = go0Var2.L();
                        if (objL2 == ebVar2) {
                            objL2 = eu.C(go0Var2);
                            go0Var2.f0(objL2);
                        }
                        final j20 j20Var2 = (j20) objL2;
                        objL3 = go0Var2.L();
                        if (objL3 == ebVar2) {
                            objL3 = new om();
                            go0Var2.f0(objL3);
                        }
                        final om omVar2 = (om) objL3;
                        objL4 = go0Var2.L();
                        if (objL4 == ebVar2) {
                            objL4 = new b03(w73Var);
                            go0Var2.f0(objL4);
                        }
                        final b03 b03Var4 = (b03) objL4;
                        final us1 us1Var6 = us1Var;
                        b03Var4.b = us1Var6;
                        b03Var4.f = wb3Var;
                        b03Var4.c = t91Var6.v;
                        b03Var4.d = t91Var6;
                        b03Var4.e.setValue(k03Var2);
                        b03Var4.w = new f13(j3);
                        b03Var4.h = (rt) go0Var2.j(ly.f);
                        b03Var4.i = j20Var2;
                        b03Var4.k = (bs0) go0Var2.j(ly.l);
                        gl0 gl0Var4 = gl0Var;
                        b03Var4.l = gl0Var4;
                        final boolean z16 = !z3;
                        b03Var4.m.setValue(Boolean.valueOf(z16));
                        b03Var4.n.setValue(Boolean.valueOf(z2));
                        go0Var2.W(1966756105);
                        kc1 kc1Var = m13Var3.a.k;
                        tu2 tu2Var = r02.a;
                        go0Var2.W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                            go0Var2.p(false);
                            w73Var2 = w73Var;
                            z8 = false;
                            p02Var = null;
                        } else {
                            Context context = (Context) go0Var2.j(r7.b);
                            a20 a20Var = (a20) go0Var2.j(r02.a);
                            boolean zF2 = go0Var2.f(a20Var) | go0Var2.f(context) | go0Var2.f(kc1Var);
                            w73Var2 = w73Var;
                            Object objL16 = go0Var2.L();
                            if (zF2 || objL16 == ebVar2) {
                                r02.b.getClass();
                                objL16 = new p02(a20Var, context, rm2.h, kc1Var);
                                go0Var2.f0(objL16);
                            }
                            p02Var = (p02) objL16;
                            z8 = false;
                            go0Var2.p(false);
                        }
                        b03Var4.j = p02Var;
                        go0Var2.p(z8);
                        t91Var6.b();
                        int i21 = i8;
                        int i22 = i21 & 7168;
                        boolean zH5 = go0Var2.h(t91Var6) | (i22 != 2048 ? true : z8) | ((i21 & 57344) != 16384);
                        o03 o03Var6 = o03Var;
                        int i23 = i9;
                        boolean zH6 = zH5 | go0Var2.h(o03Var6) | (i23 != 4);
                        i10 = (i21 & 112) ^ 48;
                        if (i10 <= 32) {
                            xx0Var2 = xx0Var;
                            if (go0Var2.f(xx0Var2)) {
                                z9 = zH6;
                                o03Var2 = o03Var6;
                            }
                            zH = z9 | z | go0Var2.h(us1Var6) | go0Var2.h(j20Var2) | go0Var2.h(omVar2) | go0Var2.h(b03Var4);
                            Object objL17 = go0Var2.L();
                            if (zH || objL17 == ebVar2) {
                                final xx0 xx0Var5 = xx0Var2;
                                go0Var3 = go0Var2;
                                t91Var2 = t91Var6;
                                gl0Var2 = gl0Var4;
                                i11 = i22;
                                ebVar3 = ebVar2;
                                i12 = i23;
                                w73Var3 = w73Var2;
                                final o03 o03Var7 = o03Var2;
                                i13 = i21;
                                obj = new in0() { // from class: h10
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.in0
                                    public final Object j(Object obj2) {
                                        z03 z03VarD;
                                        kl0 kl0Var = (kl0) obj2;
                                        t91 t91Var7 = t91Var2;
                                        boolean zB = t91Var7.b();
                                        boolean zA = kl0Var.a();
                                        a83 a83Var = a83.a;
                                        if (zB != zA) {
                                            t91Var7.f.setValue(Boolean.valueOf(kl0Var.a()));
                                            boolean zB2 = t91Var7.b();
                                            k03 k03Var5 = k03Var;
                                            us1 us1Var7 = us1Var6;
                                            if (zB2 && z2 && !z3) {
                                                gf1.T(o03Var7, t91Var7, k03Var5, xx0Var5, us1Var7);
                                            } else {
                                                gf1.s(t91Var7);
                                            }
                                            if (kl0Var.a() && (z03VarD = t91Var7.d()) != null) {
                                                p7.A(j20Var2, null, new v0(omVar2, k03Var5, t91Var7, z03VarD, us1Var7, (t00) null), 3);
                                            }
                                            if (!kl0Var.a()) {
                                                b03Var4.g(null);
                                            }
                                        }
                                        return a83Var;
                                    }
                                };
                                omVar = omVar2;
                                j20Var = j20Var2;
                                us1Var2 = us1Var6;
                                k03Var3 = k03Var;
                                b03Var = b03Var4;
                                z10 = z2;
                                o03Var3 = o03Var7;
                                xx0Var3 = xx0Var5;
                                go0Var3.f0(obj);
                            } else {
                                ebVar3 = ebVar2;
                                i12 = i23;
                                omVar = omVar2;
                                xx0Var3 = xx0Var2;
                                t91Var2 = t91Var6;
                                w73Var3 = w73Var2;
                                go0Var3 = go0Var2;
                                obj = objL17;
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
                            uh1 uh1VarS3 = xe1.s(F(fg1.w(gl0Var2), (in0) obj), z10);
                            xk1 xk1VarX = op0.x(Boolean.valueOf((z10 || z3) ? false : true), go0Var3);
                            boolean zF3 = go0Var3.f(xk1VarX) | go0Var3.h(t91Var2) | go0Var3.h(o03Var3) | go0Var3.h(b03Var);
                            if (i10 > 32 || !go0Var3.f(xx0Var3)) {
                                t91Var3 = t91Var2;
                                if ((i13 & 48) != 32) {
                                    z11 = false;
                                }
                                z12 = z11 | zF3;
                                Object objL18 = go0Var3.L();
                                if (z12 || objL18 == ebVar3) {
                                    o03 o03Var8 = o03Var3;
                                    b03 b03Var5 = b03Var;
                                    xx0 xx0Var6 = xx0Var3;
                                    b03Var2 = b03Var5;
                                    uh1Var2 = uh1VarS3;
                                    t91Var4 = t91Var3;
                                    v0Var = new v0(t91Var4, xk1VarX, o03Var8, b03Var2, xx0Var6, (t00) null);
                                    xk1Var = xk1VarX;
                                    o03Var3 = o03Var8;
                                    go0Var3.f0(v0Var);
                                } else {
                                    v0Var = objL18;
                                    b03Var2 = b03Var;
                                    uh1Var2 = uh1VarS3;
                                    t91Var4 = t91Var3;
                                    xk1Var = xk1VarX;
                                }
                                eu.f(go0Var3, (mn0) v0Var, a83.a);
                                r8 r8Var = new r8(1, new n10(t91Var4, 4));
                                rh1 rh1Var = rh1.a;
                                uh1 uh1VarA = vw2.a(rh1Var, 8675309, r8Var);
                                o03Var4 = o03Var3;
                                final gl0 gl0Var5 = gl0Var2;
                                b03Var3 = b03Var2;
                                final boolean z17 = z10;
                                us1Var3 = us1Var2;
                                j20 j20Var3 = j20Var;
                                uh1 uh1VarC2 = (!z2 ? tl.s(uh1VarA, new wt0(10, new in0() { // from class: oz2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.in0
                                    public final Object j(Object obj2) {
                                        bt2 bt2Var2;
                                        rs1 rs1Var = (rs1) obj2;
                                        t91 t91Var7 = t91Var4;
                                        if (!t91Var7.b()) {
                                            gl0.a(gl0Var5);
                                        } else if (!z3 && (bt2Var2 = t91Var7.c) != null) {
                                            ((v60) bt2Var2).b();
                                        }
                                        if (t91Var7.b() && z17) {
                                            if (t91Var7.a() != tr0.i) {
                                                z03 z03VarD = t91Var7.d();
                                                if (z03VarD != null) {
                                                    long j9 = rs1Var.a;
                                                    sz0 sz0Var2 = t91Var7.d;
                                                    n10 n10Var = t91Var7.v;
                                                    int iN = us1Var3.n(z03VarD.b(j9, true));
                                                    n10Var.j(k03.a((k03) sz0Var2.i, null, fg1.i(iN, iN), 5));
                                                    if (t91Var7.a.a.i.length() > 0) {
                                                        t91Var7.k.setValue(tr0.j);
                                                    }
                                                }
                                            } else {
                                                b03Var3.g(rs1Var);
                                            }
                                        }
                                        return a83.a;
                                    }
                                })) : uh1VarA).c(new uw2(b03Var3.A, b03Var3.z, new r8(4, b03Var3), 4));
                                m12.a.getClass();
                                uh1 uh1VarC3 = uh1VarC2.c(new k12());
                                final uh1 uh1VarS4 = qp0.s(rh1Var, new m0(t91Var4, k03Var3, us1Var3, 5));
                                td3Var2 = td3Var;
                                zH2 = go0Var3.h(t91Var4) | (i11 != 2048) | go0Var3.f(td3Var2) | go0Var3.h(b03Var3) | (i12 != 4) | go0Var3.h(us1Var3);
                                objL5 = go0Var3.L();
                                if (!zH2 || objL5 == ebVar3) {
                                    final k03 k03Var5 = k03Var3;
                                    in0 in0Var3 = new in0() { // from class: i10
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // defpackage.in0
                                        public final Object j(Object obj2) {
                                            t03 t03Var2;
                                            c61 c61Var;
                                            c61 c61Var2;
                                            t91 t91Var7 = t91Var4;
                                            nx1 nx1Var = t91Var7.o;
                                            c61 c61Var3 = (c61) obj2;
                                            t91Var7.h = c61Var3;
                                            z03 z03VarD = t91Var7.d();
                                            if (z03VarD != null) {
                                                z03VarD.b = c61Var3;
                                            }
                                            if (z2) {
                                                tr0 tr0VarA = t91Var7.a();
                                                tr0 tr0Var = tr0.i;
                                                b03 b03Var6 = b03Var3;
                                                k03 k03Var6 = k03Var5;
                                                if (tr0VarA == tr0Var) {
                                                    if (((Boolean) t91Var7.l.getValue()).booleanValue() && ((Boolean) ((k91) td3Var2).a.getValue()).booleanValue()) {
                                                        b03Var6.r();
                                                    } else {
                                                        b03Var6.o();
                                                    }
                                                    t91Var7.m.setValue(Boolean.valueOf(s11.O(b03Var6, true)));
                                                    t91Var7.n.setValue(Boolean.valueOf(s11.O(b03Var6, false)));
                                                    nx1Var.setValue(Boolean.valueOf(f13.c(k03Var6.b)));
                                                } else if (t91Var7.a() == tr0.j) {
                                                    nx1Var.setValue(Boolean.valueOf(s11.O(b03Var6, true)));
                                                }
                                                us1 us1Var7 = us1Var3;
                                                gf1.E(t91Var7, k03Var6, us1Var7);
                                                z03 z03VarD2 = t91Var7.d();
                                                if (z03VarD2 != null && (t03Var2 = t91Var7.e) != null && t91Var7.b() && (c61Var = z03VarD2.b) != null && c61Var.w() && (c61Var2 = z03VarD2.c) != null) {
                                                    y03 y03Var = z03VarD2.a;
                                                    zm zmVar = new zm(3, c61Var);
                                                    o62 o62VarD = op0.D(c61Var);
                                                    o62 o62VarJ = c61Var.J(c61Var2, false);
                                                    if (t11.l((t03) t03Var2.a.b.get(), t03Var2)) {
                                                        t03Var2.b.a(k03Var6, us1Var7, y03Var, zmVar, o62VarD, o62VarJ);
                                                    }
                                                }
                                            }
                                            return a83.a;
                                        }
                                    };
                                    td3Var3 = td3Var2;
                                    go0Var3.f0(in0Var3);
                                    objL5 = in0Var3;
                                } else {
                                    td3Var3 = td3Var2;
                                }
                                final uh1 uh1VarE = t11.E(rh1Var, (in0) objL5);
                                t91 t91Var7 = t91Var4;
                                uh1VarS = rh1Var;
                                t10 t10Var = new t10(q33Var, k03Var, t91Var7, z3, z2, wb3Var instanceof tx1, us1Var3, b03Var3, xx0Var, gl0Var5);
                                t91Var5 = t91Var7;
                                if (!z2 && !z3 && ((Boolean) ((k91) td3Var3).a.getValue()).booleanValue() && f13.c(((f13) t91Var5.A.getValue()).a) && f13.c(((f13) t91Var5.B.getValue()).a)) {
                                    uh1VarS2 = uh1VarS;
                                } else {
                                    b81 b81Var = new b81(ft2Var, t91Var5, k03Var, us1Var3, 7);
                                    t91Var5 = t91Var5;
                                    uh1VarS2 = tl.s(uh1VarS, b81Var);
                                }
                                zH3 = go0Var3.h(b03Var3);
                                objL6 = go0Var3.L();
                                if (!zH3 || objL6 == ebVar3) {
                                    i14 = 0;
                                    objL6 = new j10(b03Var3, i14);
                                    go0Var3.f0(objL6);
                                } else {
                                    i14 = 0;
                                }
                                eu.c(b03Var3, (in0) objL6, go0Var3);
                                i15 = (go0Var3.h(t91Var5) ? 1 : 0) | (go0Var3.h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                objL7 = go0Var3.L();
                                if (i15 != 0 || objL7 == ebVar3) {
                                    i16 = i14;
                                    pc pcVar = new pc(t91Var5, o03Var4, k03Var, xx0Var, 2);
                                    xx0Var4 = xx0Var;
                                    go0Var3.f0(pcVar);
                                    objL7 = pcVar;
                                } else {
                                    i16 = i14;
                                    xx0Var4 = xx0Var;
                                }
                                eu.c(xx0Var4, (in0) objL7, go0Var3);
                                final n10 n10Var = t91Var5.v;
                                final boolean z18 = i != 1 ? 1 : i16;
                                final int i24 = xx0Var4.e;
                                final w73 w73Var4 = w73Var3;
                                uh1 uh1VarS5 = tl.s(uh1VarS, new nn0() { // from class: nz2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.nn0
                                    public final Object e(Object obj2, Object obj3, Object obj4) {
                                        ((Integer) obj4).getClass();
                                        go0 go0Var5 = (go0) ((px) obj3);
                                        go0Var5.W(851809892);
                                        Object objL19 = go0Var5.L();
                                        eb ebVar5 = nx.a;
                                        if (objL19 == ebVar5) {
                                            objL19 = new e13();
                                            go0Var5.f0(objL19);
                                        }
                                        e13 e13Var = (e13) objL19;
                                        Object objL20 = go0Var5.L();
                                        if (objL20 == ebVar5) {
                                            objL20 = new n40();
                                            go0Var5.f0(objL20);
                                        }
                                        mz2 mz2Var = new mz2(t91Var5, b03Var3, k03Var, z16, z18, e13Var, us1Var3, w73Var4, (n40) objL20, n10Var, i24);
                                        boolean zH7 = go0Var5.h(mz2Var);
                                        Object objL21 = go0Var5.L();
                                        if (zH7 || objL21 == ebVar5) {
                                            e2 e2Var = new e2(1, mz2Var, mz2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 8);
                                            go0Var5.f0(e2Var);
                                            objL21 = e2Var;
                                        }
                                        uh1 uh1VarB = up0.B((in0) ((yn0) objL21));
                                        go0Var5.p(false);
                                        return uh1VarB;
                                    }
                                });
                                int i25 = xx0Var4.d;
                                z13 = (i25 == 7 || i25 == 8) ? false : true;
                                zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                                l9Var2 = l9Var;
                                zG = go0Var3.g(z13) | go0Var3.h(l9Var2);
                                objL8 = go0Var3.L();
                                if (!zG || objL8 == ebVar3) {
                                    objL8 = new p00(1, l9Var2, z13);
                                    go0Var3.f0(objL8);
                                }
                                xm0 xm0Var = (xm0) objL8;
                                if (zBooleanValue || !bw2.a) {
                                    uh1VarC = uh1VarS;
                                } else {
                                    uh1VarC = (z13 ? new cw2(qp0.q) : uh1VarS).c(new zv2(xm0Var));
                                }
                                ft2Var2 = (an) go0Var3.j(ri.a);
                                j4 = ((ju) go0Var3.j(ri.b)).a;
                                if (!ju.c(j4, sp0.b(1308617531))) {
                                    ft2Var2 = new ft2(j4);
                                }
                                zH4 = go0Var3.h(t91Var5) | go0Var3.f(ft2Var2);
                                objL9 = go0Var3.L();
                                if (!zH4 || objL9 == ebVar3) {
                                    objL9 = new d2(12, t91Var5, ft2Var2);
                                    go0Var3.f0(objL9);
                                }
                                uh1 uh1VarC4 = se.O(uh1Var.c(qp0.u(uh1VarS, (in0) objL9)), l9Var2, t91Var5, b03Var3).c(uh1VarC).c(uh1Var2);
                                i17 = 11;
                                int i26 = 3;
                                final tz2 tz2Var3 = tz2Var;
                                uh1 uh1VarC5 = t11.E(up0.C(up0.C(uh1VarC4, new zh(i17, yk0Var2, t91Var5)), new zh(i26, t91Var5, b03Var3)).c(uh1VarS5).c(new mx(new cb(i26, tz2Var3, z2))).c(uh1VarC3).c(t10Var), new n10(t91Var5, 0)).c(new o5(new af(20, b03Var3, j20Var3)));
                                z14 = !z2 && t91Var5.b() && ((Boolean) t91Var5.q.getValue()).booleanValue() && ((Boolean) ((k91) td3Var3).a.getValue()).booleanValue();
                                if (z14 && he1.a()) {
                                    uh1VarS = tl.s(uh1VarS, new wt0(i17, b03Var3));
                                }
                                go0 go0Var5 = go0Var3;
                                final uh1 uh1Var3 = uh1VarS;
                                final om omVar3 = omVar;
                                final boolean z19 = z14;
                                final uh1 uh1Var4 = uh1VarS2;
                                final t91 t91Var8 = t91Var5;
                                mn0 mn0Var = new mn0() { // from class: f10
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.mn0
                                    public final Object g(Object obj2, Object obj3) {
                                        px pxVar2 = (px) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        go0 go0Var6 = (go0) pxVar2;
                                        if (go0Var6.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final t91 t91Var9 = t91Var8;
                                            final m13 m13Var4 = m13Var;
                                            final int i27 = i2;
                                            final int i28 = i;
                                            final tz2 tz2Var4 = tz2Var3;
                                            final k03 k03Var6 = k03Var;
                                            final wb3 wb3Var2 = wb3Var;
                                            final uh1 uh1Var5 = uh1Var4;
                                            final uh1 uh1Var6 = uh1VarS4;
                                            final uh1 uh1Var7 = uh1VarE;
                                            final uh1 uh1Var8 = uh1Var3;
                                            final om omVar4 = omVar3;
                                            final b03 b03Var6 = b03Var3;
                                            final boolean z20 = z19;
                                            final boolean z21 = z3;
                                            final in0 in0Var4 = in0Var2;
                                            final us1 us1Var7 = us1Var3;
                                            final e70 e70Var4 = e70Var3;
                                            kwVar.e(xe1.i0(-44346382, new mn0() { // from class: k10
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // defpackage.mn0
                                                public final Object g(Object obj4, Object obj5) {
                                                    uh1 ma3Var;
                                                    final k03 k03Var7 = k03Var6;
                                                    long j9 = k03Var7.b;
                                                    px pxVar3 = (px) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    go0 go0Var7 = (go0) pxVar3;
                                                    if (go0Var7.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        final t91 t91Var10 = t91Var9;
                                                        uh1 uh1VarP = te.P(rh1.a, ((za0) t91Var10.g.getValue()).h, 0.0f, 2);
                                                        int i29 = i27;
                                                        final int i30 = i28;
                                                        op0.C(i29, i30);
                                                        m13 m13Var5 = m13Var4;
                                                        if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                            uh1VarP = uh1VarP.c(new os0(m13Var5, i29, i30));
                                                        }
                                                        uh1 uh1Var9 = uh1VarP;
                                                        boolean zH7 = go0Var7.h(t91Var10);
                                                        Object objL19 = go0Var7.L();
                                                        if (zH7 || objL19 == nx.a) {
                                                            objL19 = new ta(5, t91Var10);
                                                            go0Var7.f0(objL19);
                                                        }
                                                        xm0 xm0Var2 = (xm0) objL19;
                                                        tz2 tz2Var5 = tz2Var4;
                                                        qv1 qv1Var3 = (qv1) tz2Var5.f.getValue();
                                                        int i31 = f13.c;
                                                        int iF = (int) (j9 >> 32);
                                                        long j10 = tz2Var5.e;
                                                        if (iF == ((int) (j10 >> 32)) && (iF = (int) (j9 & 4294967295L)) == ((int) (4294967295L & j10))) {
                                                            iF = f13.f(j9);
                                                        }
                                                        tz2Var5.e = j9;
                                                        q33 q33VarA2 = l93.a(wb3Var2, k03Var7.a);
                                                        int iOrdinal = qv1Var3.ordinal();
                                                        if (iOrdinal == 0) {
                                                            ma3Var = new ma3(tz2Var5, iF, q33VarA2, xm0Var2);
                                                        } else {
                                                            if (iOrdinal != 1) {
                                                                c80.s();
                                                                return null;
                                                            }
                                                            ma3Var = new hu0(tz2Var5, iF, q33VarA2, xm0Var2);
                                                        }
                                                        uh1 uh1VarN = fg1.n(te.N(uh1Var9, 0.0f, 0.0f, 0.0f, null, 520191).c(ma3Var).c(uh1Var5).c(uh1Var6).c(new i03(m13Var5)).c(uh1Var7).c(uh1Var8), omVar4);
                                                        final b03 b03Var7 = b03Var6;
                                                        final boolean z22 = z20;
                                                        final boolean z23 = z21;
                                                        final in0 in0Var5 = in0Var4;
                                                        final us1 us1Var8 = us1Var7;
                                                        final e70 e70Var5 = e70Var4;
                                                        rg3.h(uh1VarN, xe1.i0(1412697320, new mn0() { // from class: l10
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                            /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
                                                            @Override // defpackage.mn0
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object g(Object obj6, Object obj7) {
                                                                px pxVar4 = (px) obj6;
                                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                                boolean z24 = true;
                                                                go0 go0Var8 = (go0) pxVar4;
                                                                if (go0Var8.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    t91 t91Var11 = t91Var10;
                                                                    o10 o10Var = new o10(t91Var11, in0Var5, k03Var7, us1Var8, e70Var5, i30);
                                                                    int iHashCode = Long.hashCode(go0Var8.T);
                                                                    yy1 yy1VarL = go0Var8.l();
                                                                    uh1 uh1VarM = tl.M(go0Var8, rh1.a);
                                                                    hx.c.getClass();
                                                                    jy jyVar = gx.b;
                                                                    go0Var8.Z();
                                                                    if (go0Var8.S) {
                                                                        go0Var8.k(jyVar);
                                                                    } else {
                                                                        go0Var8.i0();
                                                                    }
                                                                    yf3.c(go0Var8, gx.e, o10Var);
                                                                    yf3.c(go0Var8, gx.d, yy1VarL);
                                                                    yf3.c(go0Var8, gx.f, Integer.valueOf(iHashCode));
                                                                    yf3.b(go0Var8, gx.g);
                                                                    yf3.c(go0Var8, gx.c, uh1VarM);
                                                                    go0Var8.p(true);
                                                                    tr0 tr0VarA = t91Var11.a();
                                                                    tr0 tr0Var = tr0.h;
                                                                    boolean z25 = z22;
                                                                    if (tr0VarA == tr0Var || t91Var11.c() == null) {
                                                                        z24 = false;
                                                                        b03 b03Var8 = b03Var7;
                                                                        gf1.c(b03Var8, z24, go0Var8, 0);
                                                                        if (t91Var11.a() == tr0.j || z23 || !z25) {
                                                                            go0Var8.W(-714589318);
                                                                            go0Var8.p(false);
                                                                        } else {
                                                                            go0Var8.W(-714666198);
                                                                            gf1.d(b03Var8, go0Var8, 0);
                                                                            go0Var8.p(false);
                                                                        }
                                                                    } else {
                                                                        c61 c61VarC = t91Var11.c();
                                                                        c61VarC.getClass();
                                                                        if (!c61VarC.w() || !z25) {
                                                                        }
                                                                        b03 b03Var82 = b03Var7;
                                                                        gf1.c(b03Var82, z24, go0Var8, 0);
                                                                        if (t91Var11.a() == tr0.j) {
                                                                            go0Var8.W(-714589318);
                                                                            go0Var8.p(false);
                                                                        }
                                                                    }
                                                                } else {
                                                                    go0Var8.R();
                                                                }
                                                                return a83.a;
                                                            }
                                                        }, go0Var7), go0Var7, 48);
                                                    } else {
                                                        go0Var7.R();
                                                    }
                                                    return a83.a;
                                                }
                                            }, go0Var6), go0Var6, 6);
                                        } else {
                                            go0Var6.R();
                                        }
                                        return a83.a;
                                    }
                                };
                                go0Var = go0Var5;
                                b(uh1VarC5, b03Var3, xe1.i0(-814563849, mn0Var, go0Var), go0Var, 384);
                            } else {
                                t91Var3 = t91Var2;
                            }
                            z11 = true;
                            z12 = z11 | zF3;
                            Object objL182 = go0Var3.L();
                            if (z12) {
                                o03 o03Var82 = o03Var3;
                                b03 b03Var52 = b03Var;
                                xx0 xx0Var62 = xx0Var3;
                                b03Var2 = b03Var52;
                                uh1Var2 = uh1VarS3;
                                t91Var4 = t91Var3;
                                v0Var = new v0(t91Var4, xk1VarX, o03Var82, b03Var2, xx0Var62, (t00) null);
                                xk1Var = xk1VarX;
                                o03Var3 = o03Var82;
                                go0Var3.f0(v0Var);
                                eu.f(go0Var3, (mn0) v0Var, a83.a);
                                r8 r8Var2 = new r8(1, new n10(t91Var4, 4));
                                rh1 rh1Var2 = rh1.a;
                                uh1 uh1VarA2 = vw2.a(rh1Var2, 8675309, r8Var2);
                                o03Var4 = o03Var3;
                                final gl0 gl0Var52 = gl0Var2;
                                b03Var3 = b03Var2;
                                final boolean z172 = z10;
                                us1Var3 = us1Var2;
                                j20 j20Var32 = j20Var;
                                uh1 uh1VarC22 = (!z2 ? tl.s(uh1VarA2, new wt0(10, new in0() { // from class: oz2
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // defpackage.in0
                                    public final Object j(Object obj2) {
                                        bt2 bt2Var2;
                                        rs1 rs1Var = (rs1) obj2;
                                        t91 t91Var72 = t91Var4;
                                        if (!t91Var72.b()) {
                                            gl0.a(gl0Var52);
                                        } else if (!z3 && (bt2Var2 = t91Var72.c) != null) {
                                            ((v60) bt2Var2).b();
                                        }
                                        if (t91Var72.b() && z172) {
                                            if (t91Var72.a() != tr0.i) {
                                                z03 z03VarD = t91Var72.d();
                                                if (z03VarD != null) {
                                                    long j9 = rs1Var.a;
                                                    sz0 sz0Var2 = t91Var72.d;
                                                    n10 n10Var2 = t91Var72.v;
                                                    int iN = us1Var3.n(z03VarD.b(j9, true));
                                                    n10Var2.j(k03.a((k03) sz0Var2.i, null, fg1.i(iN, iN), 5));
                                                    if (t91Var72.a.a.i.length() > 0) {
                                                        t91Var72.k.setValue(tr0.j);
                                                    }
                                                }
                                            } else {
                                                b03Var3.g(rs1Var);
                                            }
                                        }
                                        return a83.a;
                                    }
                                })) : uh1VarA2).c(new uw2(b03Var3.A, b03Var3.z, new r8(4, b03Var3), 4));
                                m12.a.getClass();
                                uh1 uh1VarC32 = uh1VarC22.c(new k12());
                                final uh1 uh1VarS42 = qp0.s(rh1Var2, new m0(t91Var4, k03Var3, us1Var3, 5));
                                td3Var2 = td3Var;
                                zH2 = go0Var3.h(t91Var4) | (i11 != 2048) | go0Var3.f(td3Var2) | go0Var3.h(b03Var3) | (i12 != 4) | go0Var3.h(us1Var3);
                                objL5 = go0Var3.L();
                                if (zH2) {
                                    final k03 k03Var52 = k03Var3;
                                    in0 in0Var32 = new in0() { // from class: i10
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // defpackage.in0
                                        public final Object j(Object obj2) {
                                            t03 t03Var2;
                                            c61 c61Var;
                                            c61 c61Var2;
                                            t91 t91Var72 = t91Var4;
                                            nx1 nx1Var = t91Var72.o;
                                            c61 c61Var3 = (c61) obj2;
                                            t91Var72.h = c61Var3;
                                            z03 z03VarD = t91Var72.d();
                                            if (z03VarD != null) {
                                                z03VarD.b = c61Var3;
                                            }
                                            if (z2) {
                                                tr0 tr0VarA = t91Var72.a();
                                                tr0 tr0Var = tr0.i;
                                                b03 b03Var6 = b03Var3;
                                                k03 k03Var6 = k03Var52;
                                                if (tr0VarA == tr0Var) {
                                                    if (((Boolean) t91Var72.l.getValue()).booleanValue() && ((Boolean) ((k91) td3Var2).a.getValue()).booleanValue()) {
                                                        b03Var6.r();
                                                    } else {
                                                        b03Var6.o();
                                                    }
                                                    t91Var72.m.setValue(Boolean.valueOf(s11.O(b03Var6, true)));
                                                    t91Var72.n.setValue(Boolean.valueOf(s11.O(b03Var6, false)));
                                                    nx1Var.setValue(Boolean.valueOf(f13.c(k03Var6.b)));
                                                } else if (t91Var72.a() == tr0.j) {
                                                    nx1Var.setValue(Boolean.valueOf(s11.O(b03Var6, true)));
                                                }
                                                us1 us1Var7 = us1Var3;
                                                gf1.E(t91Var72, k03Var6, us1Var7);
                                                z03 z03VarD2 = t91Var72.d();
                                                if (z03VarD2 != null && (t03Var2 = t91Var72.e) != null && t91Var72.b() && (c61Var = z03VarD2.b) != null && c61Var.w() && (c61Var2 = z03VarD2.c) != null) {
                                                    y03 y03Var = z03VarD2.a;
                                                    zm zmVar = new zm(3, c61Var);
                                                    o62 o62VarD = op0.D(c61Var);
                                                    o62 o62VarJ = c61Var.J(c61Var2, false);
                                                    if (t11.l((t03) t03Var2.a.b.get(), t03Var2)) {
                                                        t03Var2.b.a(k03Var6, us1Var7, y03Var, zmVar, o62VarD, o62VarJ);
                                                    }
                                                }
                                            }
                                            return a83.a;
                                        }
                                    };
                                    td3Var3 = td3Var2;
                                    go0Var3.f0(in0Var32);
                                    objL5 = in0Var32;
                                    final uh1 uh1VarE2 = t11.E(rh1Var2, (in0) objL5);
                                    t91 t91Var72 = t91Var4;
                                    uh1VarS = rh1Var2;
                                    t10 t10Var2 = new t10(q33Var, k03Var, t91Var72, z3, z2, wb3Var instanceof tx1, us1Var3, b03Var3, xx0Var, gl0Var52);
                                    t91Var5 = t91Var72;
                                    if (z2) {
                                        if (!z2 && !z3 && ((Boolean) ((k91) td3Var3).a.getValue()).booleanValue() && f13.c(((f13) t91Var5.A.getValue()).a) && f13.c(((f13) t91Var5.B.getValue()).a)) {
                                        }
                                        zH3 = go0Var3.h(b03Var3);
                                        objL6 = go0Var3.L();
                                        if (zH3) {
                                            i14 = 0;
                                            objL6 = new j10(b03Var3, i14);
                                            go0Var3.f0(objL6);
                                            eu.c(b03Var3, (in0) objL6, go0Var3);
                                            if (i10 > 32) {
                                                i15 = (go0Var3.h(t91Var5) ? 1 : 0) | (go0Var3.h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                                objL7 = go0Var3.L();
                                                if (i15 != 0) {
                                                    i16 = i14;
                                                    pc pcVar2 = new pc(t91Var5, o03Var4, k03Var, xx0Var, 2);
                                                    xx0Var4 = xx0Var;
                                                    go0Var3.f0(pcVar2);
                                                    objL7 = pcVar2;
                                                    eu.c(xx0Var4, (in0) objL7, go0Var3);
                                                    final in0 n10Var2 = t91Var5.v;
                                                    if (i != 1) {
                                                    }
                                                    final int i242 = xx0Var4.e;
                                                    final w73 w73Var42 = w73Var3;
                                                    uh1 uh1VarS52 = tl.s(uh1VarS, new nn0() { // from class: nz2
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // defpackage.nn0
                                                        public final Object e(Object obj2, Object obj3, Object obj4) {
                                                            ((Integer) obj4).getClass();
                                                            go0 go0Var52 = (go0) ((px) obj3);
                                                            go0Var52.W(851809892);
                                                            Object objL19 = go0Var52.L();
                                                            eb ebVar5 = nx.a;
                                                            if (objL19 == ebVar5) {
                                                                objL19 = new e13();
                                                                go0Var52.f0(objL19);
                                                            }
                                                            e13 e13Var = (e13) objL19;
                                                            Object objL20 = go0Var52.L();
                                                            if (objL20 == ebVar5) {
                                                                objL20 = new n40();
                                                                go0Var52.f0(objL20);
                                                            }
                                                            mz2 mz2Var = new mz2(t91Var5, b03Var3, k03Var, z16, z18, e13Var, us1Var3, w73Var42, (n40) objL20, n10Var2, i242);
                                                            boolean zH7 = go0Var52.h(mz2Var);
                                                            Object objL21 = go0Var52.L();
                                                            if (zH7 || objL21 == ebVar5) {
                                                                e2 e2Var = new e2(1, mz2Var, mz2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 8);
                                                                go0Var52.f0(e2Var);
                                                                objL21 = e2Var;
                                                            }
                                                            uh1 uh1VarB = up0.B((in0) ((yn0) objL21));
                                                            go0Var52.p(false);
                                                            return uh1VarB;
                                                        }
                                                    });
                                                    int i252 = xx0Var4.d;
                                                    if (i252 == 7) {
                                                        zBooleanValue = ((Boolean) xk1Var.getValue()).booleanValue();
                                                        l9Var2 = l9Var;
                                                        zG = go0Var3.g(z13) | go0Var3.h(l9Var2);
                                                        objL8 = go0Var3.L();
                                                        if (!zG) {
                                                            objL8 = new p00(1, l9Var2, z13);
                                                            go0Var3.f0(objL8);
                                                            xm0 xm0Var2 = (xm0) objL8;
                                                            if (zBooleanValue) {
                                                                uh1VarC = uh1VarS;
                                                                ft2Var2 = (an) go0Var3.j(ri.a);
                                                                j4 = ((ju) go0Var3.j(ri.b)).a;
                                                                if (!ju.c(j4, sp0.b(1308617531))) {
                                                                }
                                                                zH4 = go0Var3.h(t91Var5) | go0Var3.f(ft2Var2);
                                                                objL9 = go0Var3.L();
                                                                if (!zH4) {
                                                                    objL9 = new d2(12, t91Var5, ft2Var2);
                                                                    go0Var3.f0(objL9);
                                                                    uh1 uh1VarC42 = se.O(uh1Var.c(qp0.u(uh1VarS, (in0) objL9)), l9Var2, t91Var5, b03Var3).c(uh1VarC).c(uh1Var2);
                                                                    i17 = 11;
                                                                    int i262 = 3;
                                                                    final tz2 tz2Var32 = tz2Var;
                                                                    uh1 uh1VarC52 = t11.E(up0.C(up0.C(uh1VarC42, new zh(i17, yk0Var2, t91Var5)), new zh(i262, t91Var5, b03Var3)).c(uh1VarS52).c(new mx(new cb(i262, tz2Var32, z2))).c(uh1VarC32).c(t10Var2), new n10(t91Var5, 0)).c(new o5(new af(20, b03Var3, j20Var32)));
                                                                    if (z2) {
                                                                        if (z14) {
                                                                            uh1VarS = tl.s(uh1VarS, new wt0(i17, b03Var3));
                                                                        }
                                                                        go0 go0Var52 = go0Var3;
                                                                        final uh1 uh1Var32 = uh1VarS;
                                                                        final om omVar32 = omVar;
                                                                        final boolean z192 = z14;
                                                                        final uh1 uh1Var42 = uh1VarS2;
                                                                        final t91 t91Var82 = t91Var5;
                                                                        mn0 mn0Var2 = new mn0() { // from class: f10
                                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                            @Override // defpackage.mn0
                                                                            public final Object g(Object obj2, Object obj3) {
                                                                                px pxVar2 = (px) obj2;
                                                                                int iIntValue = ((Integer) obj3).intValue();
                                                                                go0 go0Var6 = (go0) pxVar2;
                                                                                if (go0Var6.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                    final t91 t91Var9 = t91Var82;
                                                                                    final m13 m13Var4 = m13Var;
                                                                                    final int i27 = i2;
                                                                                    final int i28 = i;
                                                                                    final tz2 tz2Var4 = tz2Var32;
                                                                                    final k03 k03Var6 = k03Var;
                                                                                    final wb3 wb3Var2 = wb3Var;
                                                                                    final uh1 uh1Var5 = uh1Var42;
                                                                                    final uh1 uh1Var6 = uh1VarS42;
                                                                                    final uh1 uh1Var7 = uh1VarE2;
                                                                                    final uh1 uh1Var8 = uh1Var32;
                                                                                    final om omVar4 = omVar32;
                                                                                    final b03 b03Var6 = b03Var3;
                                                                                    final boolean z20 = z192;
                                                                                    final boolean z21 = z3;
                                                                                    final in0 in0Var4 = in0Var2;
                                                                                    final us1 us1Var7 = us1Var3;
                                                                                    final e70 e70Var4 = e70Var3;
                                                                                    kwVar.e(xe1.i0(-44346382, new mn0() { // from class: k10
                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                        @Override // defpackage.mn0
                                                                                        public final Object g(Object obj4, Object obj5) {
                                                                                            uh1 ma3Var;
                                                                                            final k03 k03Var7 = k03Var6;
                                                                                            long j9 = k03Var7.b;
                                                                                            px pxVar3 = (px) obj4;
                                                                                            int iIntValue2 = ((Integer) obj5).intValue();
                                                                                            go0 go0Var7 = (go0) pxVar3;
                                                                                            if (go0Var7.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                final t91 t91Var10 = t91Var9;
                                                                                                uh1 uh1VarP = te.P(rh1.a, ((za0) t91Var10.g.getValue()).h, 0.0f, 2);
                                                                                                int i29 = i27;
                                                                                                final int i30 = i28;
                                                                                                op0.C(i29, i30);
                                                                                                m13 m13Var5 = m13Var4;
                                                                                                if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                                                                    uh1VarP = uh1VarP.c(new os0(m13Var5, i29, i30));
                                                                                                }
                                                                                                uh1 uh1Var9 = uh1VarP;
                                                                                                boolean zH7 = go0Var7.h(t91Var10);
                                                                                                Object objL19 = go0Var7.L();
                                                                                                if (zH7 || objL19 == nx.a) {
                                                                                                    objL19 = new ta(5, t91Var10);
                                                                                                    go0Var7.f0(objL19);
                                                                                                }
                                                                                                xm0 xm0Var22 = (xm0) objL19;
                                                                                                tz2 tz2Var5 = tz2Var4;
                                                                                                qv1 qv1Var3 = (qv1) tz2Var5.f.getValue();
                                                                                                int i31 = f13.c;
                                                                                                int iF = (int) (j9 >> 32);
                                                                                                long j10 = tz2Var5.e;
                                                                                                if (iF == ((int) (j10 >> 32)) && (iF = (int) (j9 & 4294967295L)) == ((int) (4294967295L & j10))) {
                                                                                                    iF = f13.f(j9);
                                                                                                }
                                                                                                tz2Var5.e = j9;
                                                                                                q33 q33VarA2 = l93.a(wb3Var2, k03Var7.a);
                                                                                                int iOrdinal = qv1Var3.ordinal();
                                                                                                if (iOrdinal == 0) {
                                                                                                    ma3Var = new ma3(tz2Var5, iF, q33VarA2, xm0Var22);
                                                                                                } else {
                                                                                                    if (iOrdinal != 1) {
                                                                                                        c80.s();
                                                                                                        return null;
                                                                                                    }
                                                                                                    ma3Var = new hu0(tz2Var5, iF, q33VarA2, xm0Var22);
                                                                                                }
                                                                                                uh1 uh1VarN = fg1.n(te.N(uh1Var9, 0.0f, 0.0f, 0.0f, null, 520191).c(ma3Var).c(uh1Var5).c(uh1Var6).c(new i03(m13Var5)).c(uh1Var7).c(uh1Var8), omVar4);
                                                                                                final b03 b03Var7 = b03Var6;
                                                                                                final boolean z22 = z20;
                                                                                                final boolean z23 = z21;
                                                                                                final in0 in0Var5 = in0Var4;
                                                                                                final us1 us1Var8 = us1Var7;
                                                                                                final e70 e70Var5 = e70Var4;
                                                                                                rg3.h(uh1VarN, xe1.i0(1412697320, new mn0() { // from class: l10
                                                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                                                                                                    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
                                                                                                    @Override // defpackage.mn0
                                                                                                    /*
                                                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                                                    */
                                                                                                    public final Object g(Object obj6, Object obj7) {
                                                                                                        px pxVar4 = (px) obj6;
                                                                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                                                                        boolean z24 = true;
                                                                                                        go0 go0Var8 = (go0) pxVar4;
                                                                                                        if (go0Var8.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                                                            t91 t91Var11 = t91Var10;
                                                                                                            o10 o10Var = new o10(t91Var11, in0Var5, k03Var7, us1Var8, e70Var5, i30);
                                                                                                            int iHashCode = Long.hashCode(go0Var8.T);
                                                                                                            yy1 yy1VarL = go0Var8.l();
                                                                                                            uh1 uh1VarM = tl.M(go0Var8, rh1.a);
                                                                                                            hx.c.getClass();
                                                                                                            jy jyVar = gx.b;
                                                                                                            go0Var8.Z();
                                                                                                            if (go0Var8.S) {
                                                                                                                go0Var8.k(jyVar);
                                                                                                            } else {
                                                                                                                go0Var8.i0();
                                                                                                            }
                                                                                                            yf3.c(go0Var8, gx.e, o10Var);
                                                                                                            yf3.c(go0Var8, gx.d, yy1VarL);
                                                                                                            yf3.c(go0Var8, gx.f, Integer.valueOf(iHashCode));
                                                                                                            yf3.b(go0Var8, gx.g);
                                                                                                            yf3.c(go0Var8, gx.c, uh1VarM);
                                                                                                            go0Var8.p(true);
                                                                                                            tr0 tr0VarA = t91Var11.a();
                                                                                                            tr0 tr0Var = tr0.h;
                                                                                                            boolean z25 = z22;
                                                                                                            if (tr0VarA == tr0Var || t91Var11.c() == null) {
                                                                                                                z24 = false;
                                                                                                                b03 b03Var82 = b03Var7;
                                                                                                                gf1.c(b03Var82, z24, go0Var8, 0);
                                                                                                                if (t91Var11.a() == tr0.j || z23 || !z25) {
                                                                                                                    go0Var8.W(-714589318);
                                                                                                                    go0Var8.p(false);
                                                                                                                } else {
                                                                                                                    go0Var8.W(-714666198);
                                                                                                                    gf1.d(b03Var82, go0Var8, 0);
                                                                                                                    go0Var8.p(false);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c61 c61VarC = t91Var11.c();
                                                                                                                c61VarC.getClass();
                                                                                                                if (!c61VarC.w() || !z25) {
                                                                                                                }
                                                                                                                b03 b03Var822 = b03Var7;
                                                                                                                gf1.c(b03Var822, z24, go0Var8, 0);
                                                                                                                if (t91Var11.a() == tr0.j) {
                                                                                                                    go0Var8.W(-714589318);
                                                                                                                    go0Var8.p(false);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            go0Var8.R();
                                                                                                        }
                                                                                                        return a83.a;
                                                                                                    }
                                                                                                }, go0Var7), go0Var7, 48);
                                                                                            } else {
                                                                                                go0Var7.R();
                                                                                            }
                                                                                            return a83.a;
                                                                                        }
                                                                                    }, go0Var6), go0Var6, 6);
                                                                                } else {
                                                                                    go0Var6.R();
                                                                                }
                                                                                return a83.a;
                                                                            }
                                                                        };
                                                                        go0Var = go0Var52;
                                                                        b(uh1VarC52, b03Var3, xe1.i0(-814563849, mn0Var2, go0Var), go0Var, 384);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                i15 = (go0Var3.h(t91Var5) ? 1 : 0) | (go0Var3.h(o03Var4) ? 1 : 0) | (i12 != 4 ? 1 : i14) | (((i10 > 32 || !go0Var3.f(xx0Var)) && (i13 & 48) != 32) ? i14 : 1);
                                                objL7 = go0Var3.L();
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
                        z9 = zH6;
                        o03Var2 = o03Var6;
                        boolean z20 = (i21 & 48) != 32;
                        zH = z9 | z20 | go0Var2.h(us1Var6) | go0Var2.h(j20Var2) | go0Var2.h(omVar2) | go0Var2.h(b03Var4);
                        Object objL172 = go0Var2.L();
                        if (zH) {
                            final xx0 xx0Var52 = xx0Var2;
                            go0Var3 = go0Var2;
                            t91Var2 = t91Var6;
                            gl0Var2 = gl0Var4;
                            i11 = i22;
                            ebVar3 = ebVar2;
                            i12 = i23;
                            w73Var3 = w73Var2;
                            final o03 o03Var72 = o03Var2;
                            i13 = i21;
                            obj = new in0() { // from class: h10
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // defpackage.in0
                                public final Object j(Object obj2) {
                                    z03 z03VarD;
                                    kl0 kl0Var = (kl0) obj2;
                                    t91 t91Var73 = t91Var2;
                                    boolean zB = t91Var73.b();
                                    boolean zA = kl0Var.a();
                                    a83 a83Var = a83.a;
                                    if (zB != zA) {
                                        t91Var73.f.setValue(Boolean.valueOf(kl0Var.a()));
                                        boolean zB2 = t91Var73.b();
                                        k03 k03Var53 = k03Var;
                                        us1 us1Var7 = us1Var6;
                                        if (zB2 && z2 && !z3) {
                                            gf1.T(o03Var72, t91Var73, k03Var53, xx0Var52, us1Var7);
                                        } else {
                                            gf1.s(t91Var73);
                                        }
                                        if (kl0Var.a() && (z03VarD = t91Var73.d()) != null) {
                                            p7.A(j20Var2, null, new v0(omVar2, k03Var53, t91Var73, z03VarD, us1Var7, (t00) null), 3);
                                        }
                                        if (!kl0Var.a()) {
                                            b03Var4.g(null);
                                        }
                                    }
                                    return a83Var;
                                }
                            };
                            omVar = omVar2;
                            j20Var = j20Var2;
                            us1Var2 = us1Var6;
                            k03Var3 = k03Var;
                            b03Var = b03Var4;
                            z10 = z2;
                            o03Var3 = o03Var72;
                            xx0Var3 = xx0Var52;
                            go0Var3.f0(obj);
                            uh1 uh1VarS32 = xe1.s(F(fg1.w(gl0Var2), (in0) obj), z10);
                            if (z10) {
                                xk1 xk1VarX2 = op0.x(Boolean.valueOf((z10 || z3) ? false : true), go0Var3);
                                boolean zF32 = go0Var3.f(xk1VarX2) | go0Var3.h(t91Var2) | go0Var3.h(o03Var3) | go0Var3.h(b03Var);
                                if (i10 > 32) {
                                    t91Var3 = t91Var2;
                                    if ((i13 & 48) != 32) {
                                        z11 = true;
                                    }
                                    z12 = z11 | zF32;
                                    Object objL1822 = go0Var3.L();
                                    if (z12) {
                                    }
                                }
                            }
                        }
                    } else {
                        Long l = w73Var.d;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        }
                        objL2 = go0Var2.L();
                        if (objL2 == ebVar2) {
                        }
                        final j20 j20Var22 = (j20) objL2;
                        objL3 = go0Var2.L();
                        if (objL3 == ebVar2) {
                        }
                        final om omVar22 = (om) objL3;
                        objL4 = go0Var2.L();
                        if (objL4 == ebVar2) {
                        }
                        final b03 b03Var42 = (b03) objL4;
                        final us1 us1Var62 = us1Var;
                        b03Var42.b = us1Var62;
                        b03Var42.f = wb3Var;
                        b03Var42.c = t91Var6.v;
                        b03Var42.d = t91Var6;
                        b03Var42.e.setValue(k03Var2);
                        b03Var42.w = new f13(j3);
                        b03Var42.h = (rt) go0Var2.j(ly.f);
                        b03Var42.i = j20Var22;
                        b03Var42.k = (bs0) go0Var2.j(ly.l);
                        gl0 gl0Var42 = gl0Var;
                        b03Var42.l = gl0Var42;
                        final boolean z162 = !z3;
                        b03Var42.m.setValue(Boolean.valueOf(z162));
                        b03Var42.n.setValue(Boolean.valueOf(z2));
                        go0Var2.W(1966756105);
                        kc1 kc1Var2 = m13Var3.a.k;
                        tu2 tu2Var2 = r02.a;
                        go0Var2.W(430530635);
                        if (Build.VERSION.SDK_INT >= 28) {
                        }
                        b03Var42.j = p02Var;
                        go0Var2.p(z8);
                        t91Var6.b();
                        int i212 = i8;
                        int i222 = i212 & 7168;
                        boolean zH52 = go0Var2.h(t91Var6) | (i222 != 2048 ? true : z8) | ((i212 & 57344) != 16384);
                        o03 o03Var62 = o03Var;
                        int i232 = i9;
                        boolean zH62 = zH52 | go0Var2.h(o03Var62) | (i232 != 4);
                        i10 = (i212 & 112) ^ 48;
                        if (i10 <= 32) {
                        }
                        z9 = zH62;
                        o03Var2 = o03Var62;
                        if ((i212 & 48) != 32) {
                        }
                        zH = z9 | z20 | go0Var2.h(us1Var62) | go0Var2.h(j20Var22) | go0Var2.h(omVar22) | go0Var2.h(b03Var42);
                        Object objL1722 = go0Var2.L();
                        if (zH) {
                        }
                    }
                }
                yk0Var2 = yk0Var;
                if (z7) {
                    sd0 sd0Var22 = (sd0) sz0Var.j;
                    sd0Var22.d = -1;
                    sd0Var22.e = -1;
                    k03Var2 = k03Var;
                    k03VarA = k03.a(k03Var2, null, 0L, 3);
                    k03 k03Var42 = (k03) sz0Var.i;
                    sz0Var.i = k03VarA;
                    if (t03Var != null) {
                    }
                    objL = go0Var2.L();
                    ebVar2 = ebVar;
                    if (objL == ebVar2) {
                    }
                    w73Var = (w73) objL;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (w73Var.e) {
                    }
                }
            } else {
                z5 = true;
            }
            iz2Var = new iz2(sdVar4, m13Var2, z4, e70Var, xl0Var, 0);
            m13 m13Var32 = m13Var2;
            final e70 e70Var32 = e70Var;
            if (t91Var6.a != iz2Var) {
            }
            t91Var6.a = iz2Var;
            sz0Var = t91Var6.d;
            t03 t03Var2 = t91Var6.e;
            f13Var2 = f13Var;
            boolean zL2 = t11.l(f13Var2, ((sd0) sz0Var.j).h());
            if (t11.l(((k03) sz0Var.i).a.i, sdVar2.i)) {
            }
            if (f13Var2 != null) {
            }
            yk0Var2 = yk0Var;
            if (z7) {
            }
        } else {
            go0Var = go0Var4;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: g10
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = pp0.N(i3 | 1);
                    int iN2 = pp0.N(i4);
                    gf1.a(k03Var, in0Var, uh1Var, m13Var, wb3Var, in0Var2, ft2Var, z, i, i2, xx0Var, k51Var, z2, z3, kwVar, (px) obj2, iN, iN2);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a0(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(uh1 uh1Var, b03 b03Var, kw kwVar, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(2036174316);
        int i2 = (go0Var.f(uh1Var) ? 4 : 2) | i | (go0Var.h(b03Var) ? 32 : 16);
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            nf1 nf1VarD = dm.d(sn.j, true);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1Var);
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
            s11.f(b03Var, kwVar, go0Var, (i2 >> 3) & 126);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new tt0(uh1Var, b03Var, kwVar, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uh1 b0(uh1 uh1Var, nl2 nl2Var) {
        return uh1Var.c(ci0.z(rh1.a, iu0.c)).c(new ol2(null, null, nl2Var.d, qv1.h, nl2Var, true, true)).c(new cm2(nl2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(b03 b03Var, boolean z, px pxVar, int i) {
        z03 z03VarD;
        go0 go0Var = (go0) pxVar;
        go0Var.X(626339208);
        int i2 = (go0Var.h(b03Var) ? 4 : 2) | i | (go0Var.g(z) ? 32 : 16);
        if (!go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            go0Var.R();
        } else if (z) {
            go0Var.W(1530097388);
            t91 t91Var = b03Var.d;
            y03 y03Var = null;
            if (t91Var != null && (z03VarD = t91Var.d()) != null) {
                y03 y03Var2 = z03VarD.a;
                t91 t91Var2 = b03Var.d;
                if (!(t91Var2 != null ? t91Var2.p : true)) {
                    y03Var = y03Var2;
                }
            }
            if (y03Var == null) {
                go0Var.W(1530097387);
                go0Var.p(false);
            } else {
                go0Var.W(1530097388);
                if (f13.c(b03Var.n().b)) {
                    go0Var.W(2110860558);
                    go0Var.p(false);
                } else {
                    go0Var.W(2109807302);
                    int iP = b03Var.b.p((int) (b03Var.n().b >> 32));
                    int iP2 = b03Var.b.p((int) (b03Var.n().b & 4294967295L));
                    c92 c92VarA = y03Var.a(iP);
                    c92 c92VarA2 = y03Var.a(Math.max(iP2 - 1, 0));
                    t91 t91Var3 = b03Var.d;
                    if (t91Var3 == null || !((Boolean) t91Var3.m.getValue()).booleanValue()) {
                        go0Var.W(2110490542);
                        go0Var.p(false);
                    } else {
                        go0Var.W(2110225306);
                        up0.c(true, c92VarA, b03Var, go0Var, ((i2 << 6) & 896) | 6);
                        go0Var.p(false);
                    }
                    t91 t91Var4 = b03Var.d;
                    if (t91Var4 == null || !((Boolean) t91Var4.n.getValue()).booleanValue()) {
                        go0Var.W(2110838734);
                        go0Var.p(false);
                    } else {
                        go0Var.W(2110574459);
                        up0.c(false, c92VarA2, b03Var, go0Var, ((i2 << 6) & 896) | 6);
                        go0Var.p(false);
                    }
                    go0Var.p(false);
                }
                t91 t91Var5 = b03Var.d;
                if (t91Var5 != null) {
                    nx1 nx1Var = t91Var5.l;
                    if (!t11.l(b03Var.u.a.i, b03Var.n().a.i)) {
                        nx1Var.setValue(Boolean.FALSE);
                    }
                    if (t91Var5.b()) {
                        if (((Boolean) nx1Var.getValue()).booleanValue()) {
                            b03Var.r();
                        } else {
                            b03Var.o();
                        }
                    }
                }
                go0Var.p(false);
            }
            go0Var.p(false);
        } else {
            go0Var.W(1989076778);
            go0Var.p(false);
            b03Var.o();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new m10(b03Var, z, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a20 a20Var, Object obj, Object obj2, mn0 mn0Var, t00 t00Var) throws Throwable {
        iq iqVar;
        Object objV;
        Object objG;
        if (t00Var instanceof iq) {
            iqVar = (iq) t00Var;
            int i = iqVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqVar.o = i - Integer.MIN_VALUE;
            } else {
                iqVar = new iq(t00Var);
            }
        }
        Object obj3 = iqVar.n;
        int i2 = iqVar.o;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = iqVar.m;
            a20 a20Var2 = iqVar.l;
            try {
                fg1.T(obj3);
                objV = obj4;
                a20Var = a20Var2;
                fg1.M(a20Var, objV);
                return obj3;
            } catch (Throwable th) {
                objV = obj4;
                a20Var = a20Var2;
                th = th;
                fg1.M(a20Var, objV);
                throw th;
            }
        }
        fg1.T(obj3);
        objV = fg1.V(a20Var, obj2);
        try {
            iqVar.k = obj;
            iqVar.l = a20Var;
            iqVar.m = objV;
            iqVar.o = 1;
            xt2 xt2Var = new xt2(iqVar, a20Var);
            if (mn0Var == null) {
                objG = d0(mn0Var, obj, xt2Var);
            } else {
                xe1.f(2, mn0Var);
                objG = mn0Var.g(obj, xt2Var);
            }
            obj3 = objG;
            Object obj5 = k20.h;
            if (obj3 == obj5) {
                return obj5;
            }
            fg1.M(a20Var, objV);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            fg1.M(a20Var, objV);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(b03 b03Var, px pxVar, int i) {
        sd sdVarM;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1436003720);
        int i2 = 2;
        int i3 = (go0Var.h(b03Var) ? 4 : 2) | i;
        if (go0Var.O(i3 & 1, (i3 & 3) != 2)) {
            t91 t91Var = b03Var.d;
            if (t91Var == null || !((Boolean) t91Var.o.getValue()).booleanValue() || (sdVarM = b03Var.m()) == null || sdVarM.i.length() <= 0) {
                go0Var.W(-2111042550);
                go0Var.p(false);
            } else {
                go0Var.W(-2112351432);
                boolean zF = go0Var.f(b03Var);
                Object objL = go0Var.L();
                eb ebVar = nx.a;
                if (zF || objL == ebVar) {
                    objL = new xz2(b03Var);
                    go0Var.f0(objL);
                }
                kz2 kz2Var = (kz2) objL;
                e70 e70Var = (e70) go0Var.j(ly.h);
                us1 us1Var = b03Var.b;
                long j = b03Var.n().b;
                int i4 = f13.c;
                int iP = us1Var.p((int) (j >> 32));
                t91 t91Var2 = b03Var.d;
                z03 z03VarD = t91Var2 != null ? t91Var2.d() : null;
                z03VarD.getClass();
                y03 y03Var = z03VarD.a;
                o62 o62VarC = y03Var.c(ci0.D(iP, 0, y03Var.a.a.i.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((e70Var.A(2.0f) / 2.0f) + o62VarC.a)) << 32) | (((long) Float.floatToRawIntBits(o62VarC.d)) & 4294967295L);
                boolean zE = go0Var.e(jFloatToRawIntBits);
                Object objL2 = go0Var.L();
                if (zE || objL2 == ebVar) {
                    objL2 = new p10(jFloatToRawIntBits);
                    go0Var.f0(objL2);
                }
                ws1 ws1Var = (ws1) objL2;
                boolean zH = go0Var.h(kz2Var) | go0Var.h(b03Var);
                Object objL3 = go0Var.L();
                if (zH || objL3 == ebVar) {
                    objL3 = new s10(kz2Var, b03Var);
                    go0Var.f0(objL3);
                }
                uh1 uh1VarA = vw2.a(rh1.a, kz2Var, (PointerInputEventHandler) objL3);
                boolean zE2 = go0Var.e(jFloatToRawIntBits);
                Object objL4 = go0Var.L();
                if (zE2 || objL4 == ebVar) {
                    objL4 = new c8(jFloatToRawIntBits, i2);
                    go0Var.f0(objL4);
                }
                e8.a(ws1Var, nn2.a(uh1VarA, false, (in0) objL4), 0L, go0Var, 0);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new s9(i, 5, b03Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object d0(mn0 mn0Var, Object obj, t00 t00Var) {
        mn0Var.getClass();
        a20 a20VarF = t00Var.f();
        Object w11Var = a20VarF == zd0.h ? new w11(t00Var) : new x11(t00Var, a20VarF);
        xe1.f(2, mn0Var);
        return mn0Var.g(obj, w11Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(final boolean z, final String str, final String str2, final String str3, final List list, final boolean z2, final in0 in0Var, final xm0 xm0Var, final xm0 xm0Var2, px pxVar, final int i) {
        go0 go0Var;
        Object u0Var;
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
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(799923100);
        int i3 = i | (go0Var2.g(z) ? 4 : 2) | (go0Var2.f(str) ? 32 : 16) | (go0Var2.f(str2) ? 256 : 128) | (go0Var2.f(str3) ? 2048 : 1024) | (go0Var2.f(list) ? 16384 : 8192) | (go0Var2.g(z2) ? 131072 : 65536) | (go0Var2.h(in0Var) ? 1048576 : 524288) | (go0Var2.h(xm0Var) ? 8388608 : 4194304) | (go0Var2.h(xm0Var2) ? 67108864 : 33554432);
        if (go0Var2.O(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objL = go0Var2.L();
            eb ebVar = nx.a;
            Object obj = objL;
            if (z3 || objL == ebVar) {
                List listM = p7.M(str2);
                ArrayList arrayList = new ArrayList();
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    ju juVarN = p7.N((String) it.next());
                    if (juVarN != null) {
                        arrayList.add(juVarN);
                    }
                }
                go0Var2.f0(arrayList);
                obj = arrayList;
            }
            final List list2 = (List) obj;
            boolean z4 = ((57344 & i3) == 16384) | (i4 == 256);
            Object objL2 = go0Var2.L();
            Object obj2 = objL2;
            if (z4 || objL2 == ebVar) {
                List listI = p7.I(str2, list);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listI.iterator();
                while (it2.hasNext()) {
                    ju juVarN2 = p7.N((String) it2.next());
                    if (juVarN2 != null) {
                        arrayList2.add(juVarN2);
                    }
                }
                go0Var2.f0(arrayList2);
                obj2 = arrayList2;
            }
            final List list3 = (List) obj2;
            Object objL3 = go0Var2.L();
            if (objL3 == ebVar) {
                x13 x13VarV = V(str3 == null ? str2 : str3);
                if (x13VarV == null) {
                    x13VarV = new x13(330.0f, 0.7f, 0.93f);
                }
                objL3 = op0.u(x13VarV);
                go0Var2.f0(objL3);
            }
            xk1 xk1Var2 = (xk1) objL3;
            boolean z5 = ((i3 & 7168) == 2048) | (i4 == 256);
            Object objL4 = go0Var2.L();
            if (z5 || objL4 == ebVar) {
                str4 = str3;
                xk1Var = xk1Var2;
                str5 = str2;
                i2 = 1;
                u0Var = new u0(str4, str5, xk1Var, null, 5);
                go0Var2.f0(u0Var);
            } else {
                u0Var = objL4;
                xk1Var = xk1Var2;
                str5 = str2;
                i2 = 1;
                str4 = str3;
            }
            eu.g(str4, str5, (mn0) u0Var, go0Var2);
            String strP = rg3.P(R.string.home_settings_theme_color_dialog_title, go0Var2);
            kw kwVarI0 = xe1.i0(1615906809, new ge(i2, xm0Var, xm0Var2, z2), go0Var2);
            final String str6 = str5;
            final String str7 = str4;
            final xk1 xk1Var3 = xk1Var;
            go0 go0Var3 = go0Var2;
            qp0.d(z, xm0Var, null, strP, null, kwVarI0, xe1.i0(1510281200, new nn0() { // from class: s13
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.nn0
                public final Object e(Object obj3, Object obj4, Object obj5) {
                    String strP2;
                    long jB;
                    px pxVar2 = (px) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((bv) obj3).getClass();
                    go0 go0Var4 = (go0) pxVar2;
                    if (go0Var4.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                        uh1 uh1VarB0 = gf1.b0(te.P(te.e, 0.0f, 420.0f, 1), gf1.P(go0Var4));
                        av avVarA = yu.a(tp0.c, sn.u, go0Var4, 0);
                        int iHashCode = Long.hashCode(go0Var4.T);
                        yy1 yy1VarL = go0Var4.l();
                        uh1 uh1VarM = tl.M(go0Var4, uh1VarB0);
                        hx.c.getClass();
                        jy jyVar = gx.b;
                        go0Var4.Z();
                        if (go0Var4.S) {
                            go0Var4.k(jyVar);
                        } else {
                            go0Var4.i0();
                        }
                        yf3.c(go0Var4, gx.e, avVarA);
                        yf3.c(go0Var4, gx.d, yy1VarL);
                        yf3.c(go0Var4, gx.f, Integer.valueOf(iHashCode));
                        yf3.b(go0Var4, gx.g);
                        yf3.c(go0Var4, gx.c, uh1VarM);
                        gf1.g(rg3.P(R.string.home_settings_theme_color_presets, go0Var4), go0Var4, 0);
                        List list4 = list2;
                        String str8 = str7;
                        in0 in0Var2 = in0Var;
                        gf1.i(list4, str8, in0Var2, go0Var4, 0);
                        List list5 = list3;
                        boolean zIsEmpty = list5.isEmpty();
                        rh1 rh1Var = rh1.a;
                        if (zIsEmpty) {
                            go0Var4.W(-1016555704);
                            go0Var4.p(false);
                        } else {
                            go0Var4.W(-1016926650);
                            rp0.O(go0Var4, te.O(rh1Var, 16.0f));
                            gf1.g(rg3.P(R.string.home_settings_theme_color_recent, go0Var4), go0Var4, 0);
                            gf1.i(list5, str8, in0Var2, go0Var4, 0);
                            go0Var4.p(false);
                        }
                        gf1.g(vi0.f(rh1Var, 16.0f, go0Var4, R.string.home_settings_theme_color_custom, go0Var4), go0Var4, 0);
                        tp0.b(str, in0Var2, null, str6, null, xe1.i0(-6519394, new n0(str8, 11), go0Var4), false, 0, 0, false, false, null, new m51(2, 122), null, go0Var4, 196608, 384, 12244);
                        uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        if (str8 == null) {
                            go0Var4.W(1629804526);
                            strP2 = rg3.P(R.string.home_settings_invalid_color, go0Var4);
                            go0Var4.p(false);
                        } else {
                            go0Var4.W(1629803844);
                            go0Var4.p(false);
                            strP2 = str8;
                        }
                        if (str8 == null) {
                            go0Var4.W(-1015518010);
                            jB = ju.b(0.72f, ((lp1) go0Var4.j(ur1.a)).f);
                            go0Var4.p(false);
                        } else {
                            go0Var4.W(-1015415462);
                            jB = ((lp1) go0Var4.j(ur1.a)).f;
                            go0Var4.p(false);
                        }
                        eu.a(strP2, uh1VarG, new m13(jB, rg3.D(12), im0.k, 0L, 0, rg3.D(16), null, null, 16646136), 0, false, 0, 0, go0Var4, 48, 1016);
                        gf1.g(vi0.f(rh1Var, 16.0f, go0Var4, R.string.home_settings_theme_color_palette, go0Var4), go0Var4, 0);
                        xk1 xk1Var4 = xk1Var3;
                        x13 x13Var = (x13) xk1Var4.getValue();
                        boolean zF = go0Var4.f(in0Var2);
                        Object objL5 = go0Var4.L();
                        if (zF || objL5 == nx.a) {
                            objL5 = new d62(3, in0Var2, xk1Var4);
                            go0Var4.f0(objL5);
                        }
                        gf1.f(x13Var, (in0) objL5, go0Var4, 0);
                        go0Var4.p(true);
                    } else {
                        go0Var4.R();
                    }
                    return a83.a;
                }
            }, go0Var2), go0Var3, 1769472 | (i3 & 14) | ((i3 >> 18) & 112), 20);
            go0Var = go0Var3;
        } else {
            go0 go0Var4 = go0Var2;
            go0Var4.R();
            go0Var = go0Var4;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(z, str, str2, str3, list, z2, in0Var, xm0Var, xm0Var2, i) { // from class: t13
                public final /* synthetic */ boolean h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ String k;
                public final /* synthetic */ List l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ in0 n;
                public final /* synthetic */ xm0 o;
                public final /* synthetic */ xm0 p;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = pp0.N(1);
                    gf1.e(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (px) obj3, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(x13 x13Var, in0 in0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(1059164154);
        int i2 = 2;
        int i3 = (go0Var.f(x13Var) ? 4 : 2) | i | (go0Var.h(in0Var) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            av avVarA = yu.a(new xf(10.0f, new s(i2)), sn.u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, rh1.a);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            int i4 = i3 & 126;
            k(x13Var, in0Var, go0Var, i4);
            j(x13Var, in0Var, go0Var, i4);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r13(x13Var, in0Var, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(String str, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(33252188);
        int i2 = (go0Var.f(str) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            eu.a(str, null, new m13(((lp1) go0Var.j(ur1.a)).e, rg3.D(13), im0.l, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, i2 & 14, 1018);
            rp0.O(go0Var, te.O(rh1.a, 8.0f));
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n0(str, i, 12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(final ju juVar, uh1 uh1Var, boolean z, final float f, xm0 xm0Var, px pxVar, final int i, final int i2) {
        boolean z2;
        int i3;
        xm0 xm0Var2;
        int i4;
        final uh1 uh1Var2;
        final xm0 xm0Var3;
        long j;
        long jB;
        rh1 rh1Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(168475778);
        int i5 = i | (go0Var.f(juVar) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (go0Var.g(z2) ? 256 : 128);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
            xm0Var2 = xm0Var;
        } else {
            xm0Var2 = xm0Var;
            i4 = i3 | (go0Var.h(xm0Var2) ? 16384 : 8192);
        }
        if (go0Var.O(i4 & 1, (i4 & 9363) != 9362)) {
            if (i7 != 0) {
                z2 = false;
            }
            xm0 xm0Var4 = i8 != 0 ? null : xm0Var2;
            fb2 fb2VarA = gb2.a(10.0f);
            rh1 rh1Var2 = rh1.a;
            uh1 uh1VarO = xm0Var4 != null ? tl.O(rh1Var2, xm0Var4) : rh1Var2;
            uh1 uh1VarZ = ci0.z(te.g0(rh1Var2, f), fb2VarA);
            if (juVar == null) {
                go0Var.W(-1303519415);
                j = ((lp1) go0Var.j(ur1.a)).c;
                go0Var.p(false);
            } else {
                go0Var.W(-1303520221);
                go0Var.p(false);
                j = juVar.a;
            }
            uh1 uh1VarN = n(uh1VarZ, j, sp0.h);
            float f2 = z2 ? 2.0f : 1.0f;
            if (z2) {
                go0Var.W(-1754273284);
                jB = ((lp1) go0Var.j(ur1.a)).e;
                go0Var.p(false);
            } else if (juVar == null) {
                go0Var.W(-1754181183);
                jB = ((lp1) go0Var.j(ur1.a)).d;
                go0Var.p(false);
            } else {
                go0Var.W(-1754111898);
                jB = ju.b(0.18f, ((lp1) go0Var.j(ur1.a)).f);
                go0Var.p(false);
            }
            uh1 uh1VarC = uh1VarN.c(new rl(f2, new ft2(jB), fb2VarA)).c(uh1VarO);
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
            if (z2 && juVar != null) {
                go0Var.W(1261979587);
                sx0 sx0VarB = se.f;
                if (sx0VarB == null) {
                    rx0 rx0Var = new rx0("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i9 = s93.a;
                    ft2 ft2Var = new ft2(ju.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new cy1(9.0f, 16.17f));
                    arrayList.add(new by1(4.83f, 12.0f));
                    arrayList.add(new jy1(-1.42f, 1.41f));
                    arrayList.add(new by1(9.0f, 19.0f));
                    arrayList.add(new by1(21.0f, 7.0f));
                    arrayList.add(new jy1(-1.41f, -1.41f));
                    arrayList.add(yx1.c);
                    rx0.a(rx0Var, arrayList, ft2Var);
                    sx0VarB = rx0Var.b();
                    se.f = sx0VarB;
                }
                sx0 sx0Var = sx0VarB;
                uh1 uh1VarG0 = te.g0(rh1Var2, 0.52f * f);
                su suVarF = ju.f(juVar.a);
                if (!tp0.s(suVarF.b, 12884901888L)) {
                    jz0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) tp0.Q(suVarF.b)));
                }
                ga2 ga2Var = ((ka2) suVarF).p;
                float fE = (float) ((ga2Var.e(ju.e(r13)) * 0.0722d) + (ga2Var.e(ju.g(r13)) * 0.7152d) + (ga2Var.e(ju.h(r13)) * 0.2126d));
                if (fE < 0.0f) {
                    fE = 0.0f;
                }
                fx0.a(sx0Var, uh1VarG0, ((fE > 1.0f ? 1 : (fE == 1.0f ? 0 : -1)) > 0 ? 1.0f : fE) > 0.58f ? ju.b(0.72f, ju.b) : ju.c, go0Var, 48);
                go0Var.p(false);
                rh1Var = rh1Var2;
            } else if (juVar == null) {
                go0Var.W(1262422670);
                rh1Var = rh1Var2;
                eu.a("!", null, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(16), im0.m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 6, 1018);
                go0Var = go0Var;
                go0Var.p(false);
            } else {
                rh1Var = rh1Var2;
                go0Var.W(1262732422);
                go0Var.p(false);
            }
            go0Var.p(true);
            xm0Var3 = xm0Var4;
            uh1Var2 = rh1Var;
        } else {
            go0Var.R();
            uh1Var2 = uh1Var;
            xm0Var3 = xm0Var2;
        }
        final boolean z3 = z2;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(uh1Var2, z3, f, xm0Var3, i, i2) { // from class: u13
                public final /* synthetic */ uh1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ float k;
                public final /* synthetic */ xm0 l;
                public final /* synthetic */ int m;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.m = i2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(3073);
                    gf1.h(this.h, this.i, this.j, this.k, this.l, (px) obj, iN, this.m);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(List list, String str, in0 in0Var, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1949900876);
        int i3 = 2;
        int i4 = (go0Var.f(list) ? 4 : 2) | i | (go0Var.f(str) ? 32 : 16) | (go0Var.h(in0Var) ? 256 : 128);
        if (go0Var.O(i4 & 1, (i4 & 147) != 146)) {
            float f = 8.0f;
            av avVarA = yu.a(new xf(8.0f, new s(i3)), sn.u, go0Var, 6);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            rh1 rh1Var = rh1.a;
            uh1 uh1VarM = tl.M(go0Var, rh1Var);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            go0Var.W(-932834156);
            for (List list2 : du.l0(6, list)) {
                ob2 ob2VarA = nb2.a(new xf(f, new s(i3)), sn.t, go0Var, 54);
                int iHashCode2 = Long.hashCode(go0Var.T);
                yy1 yy1VarL2 = go0Var.l();
                uh1 uh1VarM2 = tl.M(go0Var, rh1Var);
                hx.c.getClass();
                jy jyVar2 = gx.b;
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar2);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, gx.e, ob2VarA);
                yf3.c(go0Var, gx.d, yy1VarL2);
                yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode2));
                yf3.b(go0Var, gx.g);
                yf3.c(go0Var, gx.c, uh1VarM2);
                go0Var.W(-19073330);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    long j = ((ju) it.next()).a;
                    boolean zE = go0Var.e(j);
                    Object objL = go0Var.L();
                    eb ebVar = nx.a;
                    if (zE || objL == ebVar) {
                        objL = p7.O(j);
                        go0Var.f0(objL);
                    }
                    String str2 = (String) objL;
                    ju juVar = new ju(j);
                    boolean zL = t11.l(str2, str);
                    boolean zF = ((i4 & 896) == 256) | go0Var.f(str2);
                    Object objL2 = go0Var.L();
                    if (zF || objL2 == ebVar) {
                        i2 = 1;
                        objL2 = new bu1(in0Var, str2, i2);
                        go0Var.f0(objL2);
                    } else {
                        i2 = 1;
                    }
                    h(juVar, null, zL, 34.0f, (xm0) objL2, go0Var, 3072, 2);
                    rh1Var = rh1Var;
                }
                go0Var.p(false);
                go0Var.p(true);
                f = 8.0f;
                i3 = 2;
            }
            go0Var.p(false);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new tt0(list, str, in0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(x13 x13Var, in0 in0Var, px pxVar, int i) {
        int i2;
        xk1 xk1Var;
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2132943518);
        int i4 = (go0Var.f(x13Var) ? 4 : 2) | i | (go0Var.h(in0Var) ? 32 : 16);
        char c2 = 1;
        if (go0Var.O(i4 & 1, (i4 & 19) != 18)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(new h11(0L));
                go0Var.f0(objL);
            }
            xk1 xk1Var2 = (xk1) objL;
            int i5 = i4 & 14;
            xk1 xk1VarX = op0.x(x13Var, go0Var);
            xk1 xk1VarX2 = op0.x(in0Var, go0Var);
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                float f = 359.999f;
                List listP = eu.P(Float.valueOf(0.0f), Float.valueOf(60.0f), Float.valueOf(120.0f), Float.valueOf(180.0f), Float.valueOf(240.0f), Float.valueOf(300.0f), Float.valueOf(359.999f));
                i3 = 0;
                ArrayList arrayList = new ArrayList(eu.B(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    float fC = ci0.C(((Number) it.next()).floatValue(), 0.0f, f);
                    float fC2 = ci0.C(1.0f, 0.0f, 1.0f);
                    float fC3 = ci0.C(1.0f, 0.0f, 1.0f);
                    float[] fArr = new float[3];
                    fArr[0] = fC;
                    fArr[c2] = fC2;
                    fArr[2] = fC3;
                    arrayList.add(new ju(sp0.b(Color.HSVToColor(fArr))));
                    xk1VarX = xk1VarX;
                    c2 = 1;
                    f = 359.999f;
                }
                xk1Var = xk1VarX;
                go0Var.f0(arrayList);
                objL2 = arrayList;
            } else {
                xk1Var = xk1VarX;
                i3 = 0;
            }
            List list = (List) objL2;
            boolean zC = go0Var.c(x13Var.a);
            Object objL3 = go0Var.L();
            if (zC || objL3 == ebVar) {
                objL3 = new ju(U(x13.a(x13Var, 0.0f, 1.0f, 1.0f, 1)));
                go0Var.f0(objL3);
            }
            long j = ((ju) objL3).a;
            fb2 fb2VarA = gb2.a(999.0f);
            uh1 uh1VarC = ci0.z(te.O(te.e, 28.0f), fb2VarA).c(new rl(1.0f, new ft2(((lp1) go0Var.j(ur1.a)).d), fb2VarA));
            Object objL4 = go0Var.L();
            if (objL4 == ebVar) {
                objL4 = new pr(xk1Var2, 25);
                go0Var.f0(objL4);
            }
            uh1 uh1VarG = G(uh1VarC, (in0) objL4);
            h11 h11Var = new h11(((h11) xk1Var2.getValue()).a);
            xk1 xk1Var3 = xk1Var;
            boolean zF = go0Var.f(xk1VarX2) | go0Var.f(xk1Var3);
            Object objL5 = go0Var.L();
            if (zF || objL5 == ebVar) {
                objL5 = new w13(xk1Var2, xk1VarX2, xk1Var3, i3);
                go0Var.f0(objL5);
            }
            uh1 uh1VarA = vw2.a(uh1VarG, h11Var, (PointerInputEventHandler) objL5);
            boolean zH = go0Var.h(list) | (i5 == 4) | go0Var.e(j);
            Object objL6 = go0Var.L();
            if (zH || objL6 == ebVar) {
                objL6 = new wo1(list, x13Var, j);
                go0Var.f0(objL6);
            }
            i2 = 0;
            eu.b(uh1VarA, (in0) objL6, go0Var, 0);
        } else {
            i2 = 0;
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r13(x13Var, in0Var, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(x13 x13Var, in0 in0Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-473367067);
        int i2 = (go0Var.f(x13Var) ? 4 : 2) | i | (go0Var.h(in0Var) ? 32 : 16);
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(new h11(0L));
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            int i3 = i2 & 14;
            xk1 xk1VarX = op0.x(x13Var, go0Var);
            xk1 xk1VarX2 = op0.x(in0Var, go0Var);
            boolean zC = go0Var.c(x13Var.a);
            Object objL2 = go0Var.L();
            if (zC || objL2 == ebVar) {
                ju juVar = new ju(U(x13.a(x13Var, 0.0f, 1.0f, 1.0f, 1)));
                go0Var.f0(juVar);
                objL2 = juVar;
            }
            long j = ((ju) objL2).a;
            fb2 fb2VarA = gb2.a(12.0f);
            uh1 uh1VarC = ci0.z(up0.f(te.e), fb2VarA).c(new rl(1.0f, new ft2(((lp1) go0Var.j(ur1.a)).d), fb2VarA));
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = new pr(xk1Var, 26);
                go0Var.f0(objL3);
            }
            uh1 uh1VarG = G(uh1VarC, (in0) objL3);
            h11 h11Var = new h11(((h11) xk1Var.getValue()).a);
            boolean zF = go0Var.f(xk1VarX2) | go0Var.f(xk1VarX);
            Object objL4 = go0Var.L();
            if (zF || objL4 == ebVar) {
                objL4 = new w13(xk1Var, xk1VarX2, xk1VarX, 1);
                go0Var.f0(objL4);
            }
            uh1 uh1VarA = vw2.a(uh1VarG, h11Var, (PointerInputEventHandler) objL4);
            boolean zE = go0Var.e(j) | (i3 == 4);
            Object objL5 = go0Var.L();
            if (zE || objL5 == ebVar) {
                objL5 = new bp1(j, x13Var);
                go0Var.f0(objL5);
            }
            eu.b(uh1VarA, (in0) objL5, go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new r13(x13Var, in0Var, i, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void l(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, long j) {
        if (((int) (((h11) xk1Var.getValue()).a >> 32)) <= 0) {
            return;
        }
        ((in0) xk1Var2.getValue()).j(x13.a((x13) xk1Var3.getValue(), ci0.C(ci0.C(Float.intBitsToFloat((int) (j >> 32)) / ((int) (((h11) xk1Var.getValue()).a >> 32)), 0.0f, 1.0f) * 359.999f, 0.0f, 359.999f), 0.0f, 0.0f, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, long j) {
        if (((int) (((h11) xk1Var.getValue()).a >> 32)) <= 0 || ((int) (((h11) xk1Var.getValue()).a & 4294967295L)) <= 0) {
            return;
        }
        ((in0) xk1Var2.getValue()).j(x13.a((x13) xk1Var3.getValue(), 0.0f, ci0.C(Float.intBitsToFloat((int) (j >> 32)) / ((int) (((h11) xk1Var.getValue()).a >> 32)), 0.0f, 1.0f), ci0.C(1.0f - (Float.intBitsToFloat((int) (j & 4294967295L)) / ((int) (4294967295L & ((h11) xk1Var.getValue()).a))), 0.0f, 1.0f), 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final uh1 n(uh1 uh1Var, long j, eq2 eq2Var) {
        return uh1Var.c(new mj(j, eq2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: mn0 */
    /* JADX WARN: Multi-variable type inference failed */
    public static t00 p(t00 t00Var, t00 t00Var2, mn0 mn0Var) {
        mn0Var.getClass();
        if (mn0Var instanceof rj) {
            return ((rj) mn0Var).p(t00Var2, t00Var);
        }
        a20 a20VarF = t00Var2.f();
        return a20VarF == zd0.h ? new u11(t00Var2, t00Var, mn0Var) : new v11(t00Var2, a20VarF, mn0Var, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String q(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c2 = (char) (byteBuffer.get() & 255);
            if (c2 == 0) {
                return sb.toString();
            }
            if (c2 < 128) {
                sb.append(c2);
            } else if ((c2 & 224) == 192) {
                byte b2 = byteBuffer.get();
                if ((b2 & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c2 & 31) << 6) | (b2 & 63)));
            } else {
                if ((c2 & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                if ((b3 & 192) != 128 || (b4 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap r(InputStream inputStream, BitmapFactory.Options options, b5 b5Var) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !se.v(options) || !B(b5Var)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        Bitmap.Config config = options.inPreferredConfig;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        fg1.o("", config == config2);
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
                Bitmap bitmapS = S(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = config2;
                return bitmapS;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(t91 t91Var) {
        t03 t03Var = t91Var.e;
        if (t03Var != null) {
            t91Var.v.j(k03.a((k03) t91Var.d.i, null, 0L, 3));
            o03 o03Var = t03Var.a;
            AtomicReference atomicReference = o03Var.b;
            while (true) {
                if (atomicReference.compareAndSet(t03Var, null)) {
                    o03Var.a.g();
                    break;
                } else if (atomicReference.get() != t03Var) {
                    break;
                }
            }
        }
        t91Var.e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ud t(DexKitBridge dexKitBridge, c cVar) {
        Object objValueOf;
        dexKitBridge.getClass();
        int iB = cVar.b(4);
        if (iB != 0) {
            cVar.b.getInt(iB + cVar.a);
        }
        int i = 6;
        int iB2 = cVar.b(6);
        if (iB2 != 0) {
            cVar.b.getInt(iB2 + cVar.a);
        }
        int iB3 = cVar.b(8);
        String strD = iB3 != 0 ? cVar.d(iB3 + cVar.a) : null;
        strD.getClass();
        int iB4 = cVar.b(10);
        byte b2 = iB4 != 0 ? cVar.b.get(iB4 + cVar.a) : (byte) 0;
        if (b2 != 0 && b2 != 1 && b2 != 2 && b2 != 3) {
            s.j(vi0.g("Unknown AnnotationVisibilityType: ", b2));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iB5 = cVar.b(12);
        int iF = iB5 != 0 ? cVar.f(iB5) : 0;
        int i2 = 0;
        while (i2 < iF) {
            a aVar = new a();
            int iB6 = cVar.b(12);
            if (iB6 != 0) {
                int iA = cVar.a((i2 * 4) + cVar.e(iB6));
                ByteBuffer byteBuffer = cVar.b;
                byteBuffer.getClass();
                aVar.c(iA, byteBuffer);
            } else {
                aVar = null;
            }
            aVar.getClass();
            a aVar2 = new a();
            int iB7 = aVar.b(i);
            if (iB7 != 0) {
                int iA2 = aVar.a(iB7 + aVar.a);
                ByteBuffer byteBuffer2 = aVar.b;
                byteBuffer2.getClass();
                aVar2.c(iA2, byteBuffer2);
            } else {
                aVar2 = null;
            }
            aVar2.getClass();
            int iB8 = aVar.b(4);
            String strD2 = iB8 != 0 ? aVar.d(iB8 + aVar.a) : null;
            strD2.getClass();
            int iB9 = aVar2.b(i);
            int iT = xe1.t(iB9 != 0 ? aVar2.b.get(iB9 + aVar2.a) : (byte) 0);
            switch (vi0.u(iT)) {
                case 0:
                    ox2 ox2VarK = aVar2.k(new h());
                    ox2VarK.getClass();
                    h hVar = (h) ox2VarK;
                    int iB10 = hVar.b(4);
                    objValueOf = Byte.valueOf(iB10 != 0 ? hVar.b.get(iB10 + hVar.a) : (byte) 0);
                    break;
                case 1:
                    ox2 ox2VarK2 = aVar2.k(new o());
                    ox2VarK2.getClass();
                    o oVar = (o) ox2VarK2;
                    int iB11 = oVar.b(4);
                    objValueOf = Short.valueOf(iB11 != 0 ? oVar.b.getShort(iB11 + oVar.a) : (short) 0);
                    break;
                case 2:
                    ox2 ox2VarK3 = aVar2.k(new i());
                    ox2VarK3.getClass();
                    i iVar = (i) ox2VarK3;
                    int iB12 = iVar.b(4);
                    objValueOf = Short.valueOf(iB12 != 0 ? iVar.b.getShort(iB12 + iVar.a) : (short) 0);
                    break;
                case 3:
                    ox2 ox2VarK4 = aVar2.k(new l());
                    ox2VarK4.getClass();
                    l lVar = (l) ox2VarK4;
                    int iB13 = lVar.b(4);
                    objValueOf = Integer.valueOf(iB13 != 0 ? lVar.b.getInt(iB13 + lVar.a) : 0);
                    break;
                case 4:
                    ox2 ox2VarK5 = aVar2.k(new m());
                    ox2VarK5.getClass();
                    m mVar = (m) ox2VarK5;
                    int iB14 = mVar.b(4);
                    objValueOf = Long.valueOf(iB14 != 0 ? mVar.b.getLong(iB14 + mVar.a) : 0L);
                    break;
                case 5:
                    ox2 ox2VarK6 = aVar2.k(new k());
                    ox2VarK6.getClass();
                    k kVar = (k) ox2VarK6;
                    int iB15 = kVar.b(4);
                    objValueOf = Float.valueOf(iB15 != 0 ? kVar.b.getFloat(iB15 + kVar.a) : 0.0f);
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    ox2 ox2VarK7 = aVar2.k(new j());
                    ox2VarK7.getClass();
                    j jVar = (j) ox2VarK7;
                    int iB16 = jVar.b(4);
                    objValueOf = Double.valueOf(iB16 != 0 ? jVar.b.getDouble(iB16 + jVar.a) : 0.0d);
                    break;
                case 7:
                    ox2 ox2VarK8 = aVar2.k(new p());
                    ox2VarK8.getClass();
                    p pVar = (p) ox2VarK8;
                    int iB17 = pVar.b(4);
                    objValueOf = iB17 != 0 ? pVar.d(iB17 + pVar.a) : null;
                    objValueOf.getClass();
                    break;
                case 8:
                    ox2 ox2VarK9 = aVar2.k(new f());
                    ox2VarK9.getClass();
                    objValueOf = tl.z(dexKitBridge, (f) ox2VarK9);
                    break;
                case 9:
                    ox2 ox2VarK10 = aVar2.k(new r());
                    ox2VarK10.getClass();
                    objValueOf = p40.t(dexKitBridge, (r) ox2VarK10);
                    break;
                case 10:
                    ox2 ox2VarK11 = aVar2.k(new q());
                    ox2VarK11.getClass();
                    objValueOf = se.B(dexKitBridge, (q) ox2VarK11);
                    break;
                case 11:
                    ox2 ox2VarK12 = aVar2.k(new b());
                    ox2VarK12.getClass();
                    objValueOf = fg1.x(dexKitBridge, (b) ox2VarK12);
                    break;
                case 12:
                    ox2 ox2VarK13 = aVar2.k(new c());
                    ox2VarK13.getClass();
                    objValueOf = t(dexKitBridge, (c) ox2VarK13);
                    break;
                case 13:
                    ox2 ox2VarK14 = aVar2.k(new n());
                    ox2VarK14.getClass();
                    objValueOf = (n) ox2VarK14;
                    break;
                case 14:
                    ox2 ox2VarK15 = aVar2.k(new g());
                    ox2VarK15.getClass();
                    g gVar = (g) ox2VarK15;
                    int iB18 = gVar.b(4);
                    objValueOf = Boolean.valueOf((iB18 == 0 || gVar.b.get(iB18 + gVar.a) == 0) ? false : true);
                    break;
                default:
                    c80.s();
                    return null;
            }
            arrayList.add(new vd(dexKitBridge, strD2, new xd(iT, objValueOf)));
            i2++;
            i = 6;
        }
        return new ud(dexKitBridge, strD, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String u(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float v(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean w() {
        try {
            if (b7.U0 == null) {
                b7.U0 = Class.forName("android.os.SystemProperties");
            }
            if (b7.V0 == null) {
                Class cls = b7.U0;
                b7.V0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = b7.V0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return t11.l(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static eb2 x(Display display, int i) {
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
                        s.j(vi0.g("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new eb2(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int y(w03 w03Var, Layout layout, cj cjVar, int i, RectF rectF, om2 om2Var, s9 s9Var, boolean z) {
        f61[] f61VarArr;
        f61[] f61VarArr2;
        int i2;
        int iC;
        int i3;
        int i4;
        int iB;
        Bidi bidiCreateLineBidi;
        boolean z2;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = w03Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = w03Var.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            lz0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        eu0 eu0Var = new eu0(w03Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !zIsRtlCharAt) {
                fA = eu0Var.a(lineStart2, z3, z3, true);
                fA3 = eu0Var.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && zIsRtlCharAt) {
                z2 = z4;
                fA3 = eu0Var.a(lineStart2, false, false, false);
                fA = eu0Var.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (zIsRtlCharAt) {
                    fA2 = eu0Var.a(lineStart2, false, false, true);
                    fA = eu0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = eu0Var.a(lineStart2, false, false, false);
                    fA2 = eu0Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) cjVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iJ = cjVar.j(lineStart3, false);
        int iK = cjVar.k(iJ);
        int i7 = lineStart3 - iK;
        int i8 = lineEnd2 - iK;
        Bidi bidiE = cjVar.e(iJ);
        if (bidiE == null || (bidiCreateLineBidi = bidiE.createLineBidi(i7, i8)) == null) {
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
        int i11 = c11Var.h;
        int i12 = c11Var.i;
        int i13 = c11Var.j;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            f61 f61Var = f61VarArr[i11];
            boolean z5 = f61Var.c;
            int iK2 = f61Var.a;
            int iL = f61Var.b;
            float f = z5 ? fArr[((iL - 1) - lineStart) * 2] : fArr[(iK2 - lineStart) * 2];
            float fV = z5 ? v(iK2, lineStart, fArr) : v(iL - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                f61VarArr2 = f61VarArr;
                if (fV >= f2) {
                    float f3 = rectF.right;
                    if (f > f3) {
                        iL = -1;
                        iK2 = iL;
                    } else {
                        if ((z5 || f3 < fV) && (!z5 || f2 > f)) {
                            int i15 = iL;
                            int i16 = iK2;
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
                            i2 = iL - 1;
                        }
                        int iB2 = om2Var.b(i2 + 1);
                        if (iB2 != -1 && (iC = om2Var.c(iB2)) > iK2) {
                            if (iB2 < iK2) {
                                iB2 = iK2;
                            }
                            if (iC <= iL) {
                                iL = iC;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iB3 = iB2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((iL - 1) - lineStart) * 2] : fArr[(iB3 - lineStart) * 2];
                                rectF2.right = z5 ? v(iB3, lineStart, fArr) : v(iL - 1, lineStart, fArr);
                                if (((Boolean) s9Var.g(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iL = om2Var.l(iL);
                                if (iL == -1 || iL <= iK2) {
                                    break;
                                }
                                iB3 = om2Var.b(iL);
                                if (iB3 < iK2) {
                                    iB3 = iK2;
                                }
                            }
                            iL = -1;
                            iK2 = iL;
                        }
                    }
                }
            } else if (fV >= f2) {
                float f5 = rectF.right;
                if (f > f5) {
                    f61VarArr2 = f61VarArr;
                    iK2 = -1;
                } else {
                    if ((z5 || f2 > f) && (!z5 || f5 < fV)) {
                        int i19 = iL;
                        int i20 = iK2;
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
                        i4 = iK2;
                    }
                    int iC2 = om2Var.c(i4);
                    if (iC2 != -1 && (iB = om2Var.b(iC2)) < iL) {
                        if (iB >= iK2) {
                            iK2 = iB;
                        }
                        if (iC2 > iL) {
                            iC2 = iL;
                        }
                        f61VarArr2 = f61VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iC3 = iC2;
                        while (true) {
                            rectF3.left = z5 ? fArr[((iC3 - 1) - lineStart) * 2] : fArr[(iK2 - lineStart) * 2];
                            rectF3.right = z5 ? v(iK2, lineStart, fArr) : v(iC3 - 1, lineStart, fArr);
                            if (((Boolean) s9Var.g(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iK2 = om2Var.k(iK2);
                            if (iK2 == -1 || iK2 >= iL) {
                                break;
                            }
                            iC3 = om2Var.c(iK2);
                            if (iC3 > iL) {
                                iC3 = iL;
                            }
                        }
                    }
                    iK2 = -1;
                }
            }
            if (iK2 >= 0) {
                return iK2;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            f61VarArr = f61VarArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t00 z(t00 t00Var) {
        t00Var.getClass();
        u00 u00Var = t00Var instanceof u00 ? (u00) t00Var : null;
        if (u00Var == null || (t00Var = u00Var.j) != null) {
            return t00Var;
        }
        c20 c20Var = (c20) u00Var.f().o(gd3.p);
        t00 k90Var = c20Var != null ? new k90(c20Var, u00Var) : u00Var;
        u00Var.j = k90Var;
        return k90Var;
    }
}
