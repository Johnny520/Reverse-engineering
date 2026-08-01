package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import nuke.data.cipher.NativeCrypto;
import p000A.C0020K;
import p000A.C0032Q;
import p000A.C0036S0;
import p000A.C0072l0;
import p000A.C0078o0;
import p000A.InterfaceC0092v0;
import p002A1.C0115D;
import p007B0.AbstractC0181N;
import p011B4.AbstractC0231b;
import p016C3.C0244a;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0691Q;
import p047I0.AbstractC0757q0;
import p047I0.C0710a;
import p049I2.SharedPreferencesC0796n;
import p050I3.C0801a;
import p053J3.C0845f;
import p053J3.C0850k;
import p053J3.C0856q;
import p058L.C0916S;
import p058L.C0920W;
import p058L.C0921X;
import p058L.C0934f;
import p058L.InterfaceC0940l;
import p059L0.AbstractC0956b;
import p078P1.InterfaceC1143e;
import p092S0.AbstractC1251D;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1263a;
import p092S0.C1269g;
import p092S0.C1277o;
import p092S0.C1279q;
import p093S1.C1294f;
import p095T.AbstractC1335R0;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p095T.C1357e;
import p095T.C1360f0;
import p095T.C1371l;
import p095T.C1379p;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p096T0.C1410j;
import p101U0.InterfaceC1469d;
import p110W0.C1576a;
import p110W0.C1581f;
import p110W0.C1588m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1687I;
import p118X3.C1683E;
import p118X3.C1684F;
import p121Y1.C1733A;
import p123Y3.C1772c;
import p136b0.C1843e;
import p147d1.EnumC1960j;
import p152e0.AbstractC2004k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p160f3.InterfaceC2160t;
import p169h0.AbstractC2192a;
import p169h0.C2197f;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p170h1.C2221l;
import p176i1.C2285a;
import p176i1.C2286b;
import p176i1.C2288d;
import p176i1.C2289e;
import p176i1.C2290f;
import p176i1.C2306v;
import p176i1.C2307w;
import p176i1.DialogC2308x;
import p190k3.C2461i;
import p195l2.AbstractC2498b;
import p204n0.C2684c;
import p211o0.C2740O;
import p211o0.C2762u;
import p211o0.InterfaceC2765x;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p214o3.InterfaceC2798a;
import p216p.AbstractC2856m;
import p216p.C2847h;
import p224q2.AbstractC2917h;
import p227r.C2996k;
import p227r.EnumC2983d0;
import p229r1.C3083m;
import p236s3.C3193i;
import p240t1.AbstractC3208a;
import p244u.C3251U;
import p244u.InterfaceC3271h;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p245u0.C3313j;
import p245u0.C3316m;
import p245u0.C3317n;
import p245u0.C3324u;
import p252v2.C3352a;
import p255w.C3371b;
import p255w.C3372c;
import p255w.C3373d;
import p255w.C3374e;
import p255w.C3379j;
import p255w.C3385p;
import p258w2.C3390a;
import p258w2.C3392c;
import p260x.AbstractC3429l;
import p260x.C3415V;
import p260x.C3425h;

/* JADX INFO: renamed from: com.bumptech.glide.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1922d implements InterfaceC1469d {

    /* JADX INFO: renamed from: d */
    public static C3309f f6521d;

    /* JADX INFO: renamed from: e */
    public static C3309f f6522e;

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IPUT] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final Object m3416B(C0845f c0845f) {
        Object objMo4964b;
        AbstractC1665j.m2985e(c0845f, "<this>");
        if (!c0845f.m1598l()) {
            throw new IllegalStateException(("Server returned error: " + c0845f.m1594h() + " " + c0845f.m1597k()).toString());
        }
        Object objM1595i = c0845f.m1595i();
        if (objM1595i == null) {
            throw new IllegalStateException("Missing encrypted response data");
        }
        C0856q c0856q = (C0856q) objM1595i;
        C2785n c2785n = C0801a.f2578a;
        String strM1806i = c0856q.m1806i();
        if (strM1806i == null) {
            throw new IllegalArgumentException("Missing encrypted payload kid");
        }
        if (c0856q.m1809l() != 3) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Unsupported encrypted payload version: ", c0856q.m1809l()).toString());
        }
        byte[] bArrDecryptJsonBytes = NativeCrypto.INSTANCE.decryptJsonBytes(c0856q.m1805h(), c0856q.m1807j(), c0856q.m1808k(), strM1806i, "nuke-client-stream-v3");
        Charset charset = StandardCharsets.UTF_8;
        AbstractC1665j.m2984d(charset, "UTF_8");
        String str = new String(bArrDecryptJsonBytes, charset);
        c2785n.getClass();
        C3352a c3352a = new C3352a(C0850k.class);
        C3390a c3390a = new C3390a(new StringReader(str));
        c3390a.f10598r = 2;
        boolean z5 = true;
        c3390a.f10598r = 1;
        try {
            try {
                try {
                    c3390a.m5630J();
                    z5 = false;
                    AbstractC2770B abstractC2770BM4973b = c2785n.m4973b(c3352a);
                    Class cls = c3352a.f10417a;
                    objMo4964b = abstractC2770BM4973b.mo4964b(c3390a);
                    Class clsM5120l = AbstractC2917h.m5120l(cls);
                    if (objMo4964b != null && !clsM5120l.isInstance(objMo4964b)) {
                        throw new ClassCastException("Type adapter '" + abstractC2770BM4973b + "' returned wrong type; requested " + cls + " but got instance of " + objMo4964b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                } catch (EOFException e5) {
                    if (!z5) {
                        throw new C2789r(e5);
                    }
                    c3390a.f10598r = 2;
                    objMo4964b = null;
                } catch (IllegalStateException e6) {
                    throw new C2789r(e6);
                }
                if (objMo4964b != null) {
                    try {
                        if (c3390a.m5630J() != 10) {
                            throw new C2789r("JSON document was not fully consumed.");
                        }
                    } catch (C3392c e7) {
                        throw new C2789r(e7);
                    } catch (IOException e8) {
                        throw new C2789r(e8);
                    }
                }
                return objMo4964b;
            } catch (IOException e9) {
                throw new C2789r(e9);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } finally {
            c3390a.f10598r = 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m3417C(EditorInfo editorInfo, CharSequence charSequence) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            AbstractC0956b.m1969g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i5 >= 30) {
            AbstractC0956b.m1969g(editorInfo, charSequence);
            return;
        }
        int i6 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i6 > i7 ? i7 : i6;
        if (i6 <= i7) {
            i6 = i7;
        }
        int length = charSequence.length();
        if (i8 < 0 || i6 > length) {
            m3419E(editorInfo, null, 0, 0);
            return;
        }
        int i9 = editorInfo.inputType & 4095;
        if (i9 == 129 || i9 == 225 || i9 == 18) {
            m3419E(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m3419E(editorInfo, charSequence, i8, i6);
            return;
        }
        int i10 = i6 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int iMin = Math.min(charSequence.length() - i6, i12 - Math.min(i8, (int) (((double) i12) * 0.8d)));
        int iMin2 = Math.min(i8, i12 - iMin);
        int i13 = i8 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i13))) {
            i13++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i6 + iMin) - 1))) {
            iMin--;
        }
        int i14 = iMin2 + i11;
        m3419E(editorInfo, i11 != i10 ? TextUtils.concat(charSequence.subSequence(i13, i13 + iMin2), charSequence.subSequence(i6, iMin + i6)) : charSequence.subSequence(i13, i14 + iMin + i13), iMin2, i14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m3418D(EditorInfo editorInfo, boolean z5) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC3208a.m5486a(editorInfo, z5);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m3419E(EditorInfo editorInfo, CharSequence charSequence, int i5, int i6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i5);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final C1684F m3420F(C1684F c1684f) {
        AbstractC1665j.m2985e(c1684f, "<this>");
        C1683E c1683eM3005b = c1684f.m3005b();
        AbstractC1687I abstractC1687I = c1684f.f5744j;
        c1683eM3005b.f5729g = new C1772c(abstractC1687I.mo506d(), abstractC1687I.mo505c());
        return c1683eM3005b.m3004a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m3421G(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3422a(InterfaceC1599a interfaceC1599a, C2307w c2307w, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(826668973);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(interfaceC1599a) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2582f(c2307w) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 256 : 128;
        }
        int i7 = i6;
        if (c1383r.m2560O(i7 & 1, (i7 & 147) != 146)) {
            View view = (View) c1383r.m2590j(AbstractC0691Q.f2215f);
            InterfaceC2007c interfaceC2007c = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
            EnumC2017m enumC2017m = (EnumC2017m) c1383r.m2590j(AbstractC0757q0.f2364n);
            C1379p c1379pM2632v = AbstractC1385s.m2632v(c1383r);
            InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(c1843e, c1383r);
            Object[] objArr = new Object[0];
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (objM2558L == c1357e) {
                objM2558L = C2288d.f7456f;
                c1383r.m2585g0(objM2558L);
            }
            UUID uuid = (UUID) AbstractC2004k.m3670b(objArr, (InterfaceC1599a) objM2558L, c1383r, 48);
            boolean zM2582f = c1383r.m2582f(view) | c1383r.m2582f(interfaceC2007c);
            Object objM2558L2 = c1383r.m2558L();
            if (zM2582f || objM2558L2 == c1357e) {
                DialogC2308x dialogC2308x = new DialogC2308x(interfaceC1599a, c2307w, view, enumC2017m, interfaceC2007c, uuid);
                C1843e c1843e2 = new C1843e(346960332, true, new C0710a(3, interfaceC1347YM2633w));
                C2306v c2306v = dialogC2308x.f7519k;
                c2306v.setParentCompositionContext(c1379pM2632v);
                c2306v.f7501m.setValue(c1843e2);
                c2306v.f7505q = true;
                if (c2306v.f2258g == null && !c2306v.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                c2306v.m1213e();
                c1383r.m2585g0(dialogC2308x);
                objM2558L2 = dialogC2308x;
            }
            DialogC2308x dialogC2308x2 = (DialogC2308x) objM2558L2;
            boolean zM2586h = c1383r.m2586h(dialogC2308x2);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2586h || objM2558L3 == c1357e) {
                objM2558L3 = new C2285a(dialogC2308x2, 0);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2613c(dialogC2308x2, (InterfaceC1601c) objM2558L3, c1383r);
            boolean zM2586h2 = c1383r.m2586h(dialogC2308x2) | ((i7 & 14) == 4) | ((i7 & 112) == 32) | c1383r.m2578d(enumC2017m.ordinal());
            Object objM2558L4 = c1383r.m2558L();
            if (zM2586h2 || objM2558L4 == c1357e) {
                objM2558L4 = new C2286b(dialogC2308x2, interfaceC1599a, c2307w, enumC2017m);
                c1383r.m2585g0(objM2558L4);
            }
            AbstractC1385s.m2617g((InterfaceC1599a) objM2558L4, c1383r);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2221l(interfaceC1599a, c2307w, c1843e, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m3423b(float f2, float f5) {
        return (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0351  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r14v1, types: [T.m, T.r] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T.m] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3424c(int i5, int i6, InterfaceC1373m interfaceC1373m, InterfaceC1601c interfaceC1601c, C2197f c2197f, InterfaceC2207p interfaceC2207p, C2847h c2847h, C2996k c2996k, InterfaceC3271h interfaceC3271h, C3251U c3251u, C3385p c3385p, boolean z5) {
        int i7;
        int i8;
        C3385p c3385p2;
        ?? r4;
        int i9;
        int i10;
        Object c3379j;
        C3385p c3385p3;
        C3373d c3373d;
        ?? r10;
        boolean z6;
        C2461i c2461i;
        InterfaceC2207p interfaceC2207pM5694g;
        ?? r14 = (C1383r) interfaceC1373m;
        r14.m2569X(924924659);
        if ((i5 & 6) == 0) {
            i7 = (r14.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r14.m2582f(c3385p) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= r14.m2582f(c3251u) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= r14.m2584g(false) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= r14.m2584g(true) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= r14.m2582f(c2996k) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= r14.m2584g(z5) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= r14.m2582f(c2847h) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= r14.m2582f(c2197f) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (r14.m2582f(interfaceC3271h) ? 4 : 2);
        } else {
            i8 = i6;
        }
        int i11 = i8 | 432;
        if ((i6 & 3072) == 0) {
            i11 |= r14.m2586h(interfaceC1601c) ? 2048 : 1024;
        }
        if (r14.m2560O(i7 & 1, ((306783379 & i7) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            r14.m2565T();
            if ((i5 & 1) != 0 && !r14.m2606y()) {
                r14.m2563R();
            }
            int i12 = i7 & (-234881025);
            r14.m2598q();
            int i13 = i12 >> 3;
            int i14 = i13 & 14;
            int i15 = i14 | ((i11 >> 6) & 112);
            InterfaceC1347Y interfaceC1347YM2633w = AbstractC1385s.m2633w(interfaceC1601c, r14);
            boolean z7 = (((i15 & 14) ^ 6) > 4 && r14.m2582f(c3385p)) || (i15 & 6) == 4;
            Object objM2558L = r14.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (z7 || objM2558L == c1357e) {
                C3372c c3372c = new C3372c();
                i9 = i14;
                c3372c.f10485a = new C1360f0(Integer.MAX_VALUE);
                c3372c.f10486b = new C1360f0(Integer.MAX_VALUE);
                C0020K c0020k = new C0020K(interfaceC1347YM2633w, 14);
                C1357e c1357e2 = C1357e.f4796h;
                C0072l0 c0072l0 = AbstractC1335R0.f4766a;
                i10 = i11;
                objM2558L = new C2461i(0, 1, InterfaceC1339T0.class, new C1311F(new C0244a(new C1311F(c0020k, c1357e2), c3385p, c3372c, 9), c1357e2), "value", "getValue()Ljava/lang/Object;");
                r14.m2585g0(objM2558L);
            } else {
                i9 = i14;
                i10 = i11;
            }
            C2461i c2461i2 = (C2461i) objM2558L;
            int i16 = i12 >> 9;
            int i17 = i9 | (i16 & 112);
            boolean z8 = ((((i17 & 112) ^ 48) > 32 && r14.m2584g(true)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) > 4 && r14.m2582f(c3385p)) || (i17 & 6) == 4);
            Object objM2558L2 = r14.m2558L();
            if (z8 || objM2558L2 == c1357e) {
                objM2558L2 = new C3373d(c3385p);
                r14.m2585g0(objM2558L2);
            }
            C3373d c3373d2 = (C3373d) objM2558L2;
            Object objM2558L3 = r14.m2558L();
            if (objM2558L3 == c1357e) {
                objM2558L3 = AbstractC1385s.m2622l(r14);
                r14.m2585g0(objM2558L3);
            }
            InterfaceC2160t interfaceC2160t = (InterfaceC2160t) objM2558L3;
            InterfaceC2765x interfaceC2765x = (InterfaceC2765x) r14.m2590j(AbstractC0757q0.f2357g);
            C3425h c3425h = !((Boolean) r14.m2590j(AbstractC0757q0.f2372v)).booleanValue() ? C3415V.f10683a : null;
            int i18 = i10 << 18;
            int i19 = (i12 & 65520) | (i16 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | ((i10 << 27) & 1879048192);
            boolean z9 = ((((i19 & 112) ^ 48) > 32 && r14.m2582f(c3385p)) || (i19 & 48) == 32) | ((((i19 & 896) ^ 384) > 256 && r14.m2582f(c3251u)) || (i19 & 384) == 256) | ((((i19 & 7168) ^ 3072) > 2048 && r14.m2584g(false)) || (i19 & 3072) == 2048);
            if (((57344 & i19) ^ 24576) <= 16384 || !r14.m2584g(true)) {
                boolean z10 = (i19 & 24576) == 16384;
                boolean zM2578d = (((i19 & 234881024) ^ 100663296) > 67108864 && r14.m2582f(null)) | z9 | z10 | r14.m2578d(0) | ((((i19 & 3670016) ^ 1572864) > 1048576 && r14.m2582f(c2197f)) || (i19 & 1572864) == 1048576) | (((i19 & 29360128) ^ 12582912) > 8388608 && r14.m2582f(null)) | ((((i19 & 1879048192) ^ 805306368) > 536870912 && r14.m2582f(interfaceC3271h)) || (i19 & 805306368) == 536870912) | r14.m2582f(interfaceC2765x) | r14.m2582f(c3425h);
                Object objM2558L4 = r14.m2558L();
                if (zM2578d || objM2558L4 == c1357e) {
                    c3385p3 = c3385p;
                    c3373d = c3373d2;
                    r10 = 0;
                    z6 = true;
                    c3379j = new C3379j(c3385p3, c3251u, c2461i2, interfaceC3271h, interfaceC2160t, interfaceC2765x, c3425h, c2197f);
                    c2461i = c2461i2;
                    r14.m2585g0(c3379j);
                } else {
                    c3379j = objM2558L4;
                    c2461i = c2461i2;
                    c3373d = c3373d2;
                    r10 = 0;
                    z6 = true;
                    c3385p3 = c3385p;
                }
                C3379j c3379j2 = (C3379j) c3379j;
                EnumC2983d0 enumC2983d0 = EnumC2983d0.f9447d;
                if (z5) {
                    r14.m2568W(-2077147368);
                    if (((i13 & 14) ^ 6) > 4) {
                        ?? r26 = z6;
                        if (!r14.m2582f(c3385p3)) {
                            r26 = z6;
                            if ((i13 & 6) != 4) {
                                r26 = r10;
                            }
                        }
                        int i20 = r26 | (r14.m2578d(r10) ? 1 : 0);
                        Object objM2558L5 = r14.m2558L();
                        if (i20 != 0 || objM2558L5 == c1357e) {
                            objM2558L5 = new C3374e(c3385p3);
                            r14.m2585g0(objM2558L5);
                        }
                        interfaceC2207pM5694g = AbstractC3429l.m5694g((C3374e) objM2558L5, c3385p3.f10573o, enumC2983d0);
                        r14.m2597p(r10);
                    }
                } else {
                    r14.m2568W(-2076718545);
                    r14.m2597p(r10);
                    interfaceC2207pM5694g = C2204m.f7185a;
                }
                c3385p2 = c3385p3;
                ?? r42 = r14;
                AbstractC3429l.m5688a(c2461i, AbstractC2856m.m5058l(AbstractC3429l.m5695h(interfaceC2207p.mo4021c(c3385p3.f10570l).mo4021c(c3385p3.f10571m), c2461i, c3373d, enumC2983d0, z5).mo4021c(interfaceC2207pM5694g).mo4021c(c3385p3.f10572n.f10734i), c3385p3, enumC2983d0, c2847h, z5, c2996k, c3385p3.f10565g), c3385p2.f10574p, c3379j2, r42, 0);
                r4 = r42;
            }
        } else {
            c3385p2 = c3385p;
            ?? r43 = r14;
            r43.m2563R();
            r4 = r43;
        }
        C1388t0 c1388t0M2599r = r4.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C3371b(interfaceC2207p, c3385p2, c3251u, c2996k, z5, c2847h, c2197f, interfaceC3271h, interfaceC1601c, i5, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C2684c m3425d(long j5, long j6) {
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        return new C2684c(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m3426e(boolean z5, EnumC1960j enumC1960j, C0920W c0920w, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C0036S0 c0036s0M123d;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1344558920);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2584g(z5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2578d(enumC1960j.ordinal()) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(c0920w) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            int i7 = i6 & 14;
            boolean zM2582f = (i7 == 4) | c1383r.m2582f(c0920w);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (zM2582f || objM2558L == c1357e) {
                objM2558L = new C0916S(c0920w, z5);
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC0092v0 interfaceC0092v0 = (InterfaceC0092v0) objM2558L;
            boolean zM2586h = (i7 == 4) | c1383r.m2586h(c0920w);
            Object objM2558L2 = c1383r.m2558L();
            if (zM2586h || objM2558L2 == c1357e) {
                objM2558L2 = new C0921X(c0920w, z5);
                c1383r.m2585g0(objM2558L2);
            }
            InterfaceC0940l interfaceC0940l = (InterfaceC0940l) objM2558L2;
            boolean zM2339g = C1259L.m2339g(c0920w.m1939n().f5651b);
            int i8 = (int) (z5 ? c0920w.m1939n().f5651b >> 32 : c0920w.m1939n().f5651b & 4294967295L);
            C0078o0 c0078o0 = c0920w.f2868d;
            float fM2709e = 0.0f;
            if (c0078o0 != null && (c0036s0M123d = c0078o0.m123d()) != null) {
                C1257J c1257j = c0036s0M123d.f161a;
                if (i8 >= 0) {
                    C1256I c1256i = c1257j.f4526a;
                    C1277o c1277o = c1257j.f4527b;
                    if (c1256i.f4516a.f4563e.length() != 0) {
                        int iMin = Math.min(c1277o.m2363d(i8), Math.min(c1277o.f4586b - 1, c1277o.f4590f - 1));
                        if (i8 <= c1277o.m2362c(iMin, false)) {
                            c1277o.m2370l(iMin);
                            ArrayList arrayList = c1277o.f4592h;
                            C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(iMin, arrayList));
                            C1263a c1263a = c1279q.f4595a;
                            int i9 = iMin - c1279q.f4598d;
                            C1410j c1410j = c1263a.f4548d;
                            fM2709e = c1410j.m2709e(i9) - c1410j.m2711g(i9);
                        }
                    }
                }
            }
            float f2 = fM2709e;
            boolean zM2586h2 = c1383r.m2586h(interfaceC0092v0);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2586h2 || objM2558L3 == c1357e) {
                objM2558L3 = new C0032Q(5, interfaceC0092v0);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1923e.m3466d(interfaceC0940l, z5, enumC1960j, zM2339g, 0L, f2, AbstractC0181N.m265a(C2204m.f7185a, interfaceC0092v0, (PointerInputEventHandler) objM2558L3), c1383r, (i6 << 3) & 1008);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0934f(z5, enumC1960j, c0920w, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m3427f(InterfaceC2207p interfaceC2207p, InterfaceC1603e interfaceC1603e, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1090521195);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(interfaceC1603e) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            Object objM2558L = c1383r.m2558L();
            if (objM2558L == C1371l.f4833a) {
                objM2558L = C2289e.f7461b;
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC0377O interfaceC0377O = (InterfaceC0377O) objM2558L;
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207p);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            int i7 = (((((i6 << 3) & 112) | (((i6 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, C0591f.f1905e, interfaceC0377O);
            AbstractC1385s.m2635y(c1383r, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2631u(c1383r, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r, C0591f.f1903c, interfaceC2207pM4016c);
            interfaceC1603e.mo0g(c1383r, Integer.valueOf((i7 >> 6) & 14));
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C2290f(interfaceC2207p, interfaceC1603e, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C1581f m3428g(Context context) {
        C0115D c0115d = new C0115D(29);
        context.getApplicationContext();
        return new C1581f(c0115d, new C1576a(Build.VERSION.SDK_INT >= 31 ? C1588m.f5508a.m2855a(context) : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m3429h(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            int i5 = 0;
            while (i5 < str.length()) {
                int iCodePointAt = Character.codePointAt(str, i5);
                StringBuilder sb2 = new StringBuilder("\\u");
                String hexString = Integer.toHexString(iCodePointAt);
                if (hexString.startsWith("0")) {
                    hexString = hexString.substring(1);
                }
                if (hexString.length() <= 4) {
                    int length = hexString.length();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i6 = 0; i6 < 4 - length; i6++) {
                        sb3.append("0");
                    }
                    sb2.append(sb3.toString());
                }
                sb2.append(hexString);
                sb.append(sb2.toString());
                if (Character.isHighSurrogate(str.charAt(i5))) {
                    i5++;
                }
                i5++;
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m3430k(SharedPreferencesC0796n sharedPreferencesC0796n, String str) {
        Log.e("FastKV", sharedPreferencesC0796n.f2549b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC2798a m3431l(InterfaceC2798a interfaceC2798a) {
        AbstractC1665j.m2985e(interfaceC2798a, "<this>");
        return interfaceC2798a.mo1486e().mo5136h() ? interfaceC2798a : new C3193i(interfaceC2798a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m3432m(List list, InputStream inputStream, C1294f c1294f) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1733A(inputStream, c1294f);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                int iMo2194b = ((InterfaceC1143e) list.get(i5)).mo2194b(inputStream, c1294f);
                if (iMo2194b != -1) {
                    return iMo2194b;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX DEBUG: Class process forced to load method for inline: I0.k.g(android.view.Display, int):android.view.RoundedCorner */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C3083m m3433n(Display display, int i5) {
        RoundedCorner roundedCorner;
        int i6;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i5)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i6 = 1;
            if (position != 1) {
                i6 = 2;
                if (position != 2) {
                    i6 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(AbstractC0231b.m398i("Invalid position: ", position));
                    }
                }
            }
        } else {
            i6 = 0;
        }
        return new C3083m(i6, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final C1269g m3434p(C1646u c1646u) {
        C1269g c1269g = c1646u.f5650a;
        long j5 = c1646u.f5651b;
        c1269g.getClass();
        return c1269g.subSequence(C1259L.m2338f(j5), C1259L.m2337e(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final C3309f m3435q() {
        C3309f c3309f = f6521d;
        if (c3309f != null) {
            return c3309f;
        }
        C3308e c3308e = new C3308e("AutoMirrored.Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i5 = AbstractC3300G.f10208a;
        C2740O c2740o = new C2740O(C2762u.f8757b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C3317n(2.01f, 21.0f));
        arrayList.add(new C3316m(23.0f, 12.0f));
        arrayList.add(new C3316m(2.01f, 3.0f));
        arrayList.add(new C3316m(2.0f, 10.0f));
        arrayList.add(new C3324u(15.0f, 2.0f));
        arrayList.add(new C3324u(-15.0f, 2.0f));
        arrayList.add(C3313j.f10317c);
        C3308e.m5578a(c3308e, arrayList, c2740o);
        C3309f c3309fM5579b = c3308e.m5579b();
        f6521d = c3309fM5579b;
        return c3309fM5579b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final C1269g m3436s(C1646u c1646u, int i5) {
        C1269g c1269g = c1646u.f5650a;
        C1269g c1269g2 = c1646u.f5650a;
        long j5 = c1646u.f5651b;
        int iM2337e = C1259L.m2337e(j5);
        int iM2337e2 = C1259L.m2337e(j5);
        int length = iM2337e2 + i5;
        if (((i5 ^ length) & (iM2337e2 ^ length)) < 0) {
            length = c1269g2.f4563e.length();
        }
        return c1269g.subSequence(iM2337e, Math.min(length, c1269g2.f4563e.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final C1269g m3437t(C1646u c1646u, int i5) {
        C1269g c1269g = c1646u.f5650a;
        long j5 = c1646u.f5651b;
        int iM2338f = C1259L.m2338f(j5);
        int i6 = iM2338f - i5;
        if (((iM2338f ^ i6) & (i5 ^ iM2338f)) < 0) {
            i6 = 0;
        }
        return c1269g.subSequence(Math.max(0, i6), C1259L.m2338f(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static ImageHeaderParser$ImageType m3438u(List list, InputStream inputStream, C1294f c1294f) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C1733A(inputStream, c1294f);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2197e = ((InterfaceC1143e) list.get(i5)).mo2197e(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2197e != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2197e;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static ImageHeaderParser$ImageType m3439v(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2193a = ((InterfaceC1143e) list.get(i5)).mo2193a(byteBuffer);
                AtomicReference atomicReference = AbstractC2498b.f8007a;
                if (imageHeaderParser$ImageTypeMo2193a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2193a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC2498b.f8007a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m3440w(SharedPreferencesC0796n sharedPreferencesC0796n, String str) {
        Log.i("FastKV", sharedPreferencesC0796n.f2549b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m3441y(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e5) {
                m3421G(cls, e5);
                throw null;
            } catch (InstantiationException e6) {
                m3421G(cls, e6);
                throw null;
            } catch (NoSuchMethodException e7) {
                m3421G(cls, e7);
                throw null;
            } catch (InvocationTargetException e8) {
                m3421G(cls, e8);
                throw null;
            }
        } catch (ClassNotFoundException e9) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final boolean m3442z(String str) {
        AbstractC1665j.m2985e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2735A(int i5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: i */
    public int mo40i(int i5) {
        return mo2735A(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: j */
    public int mo41j(int i5) {
        return mo2736x(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: o */
    public int mo46o(int i5) {
        int iMo2736x = mo2736x(i5);
        if (iMo2736x == -1 || mo2736x(iMo2736x) == -1) {
            return -1;
        }
        return iMo2736x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101U0.InterfaceC1469d
    /* JADX INFO: renamed from: r */
    public int mo49r(int i5) {
        int iMo2735A = mo2735A(i5);
        if (iMo2735A == -1 || mo2735A(iMo2735A) == -1) {
            return -1;
        }
        return iMo2735A;
    }

    /* JADX INFO: renamed from: x */
    public abstract int mo2736x(int i5);
}
