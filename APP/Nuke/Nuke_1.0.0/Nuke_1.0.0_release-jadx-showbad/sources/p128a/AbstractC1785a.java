package p128a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.ExtractedText;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p000A.C0038T0;
import p000A.C0066i0;
import p007B0.AbstractC0208v;
import p007B0.C0189c;
import p007B0.C0209w;
import p011B4.AbstractC0231b;
import p013C0.C0234a;
import p013C0.C0235b;
import p013C0.C0238e;
import p023E0.AbstractC0277a;
import p028F.C0352m;
import p029F0.InterfaceC0377O;
import p041H0.C0551B;
import p041H0.C0564I;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0681L;
import p047I0.AbstractC0757q0;
import p049I2.AbstractC0784b;
import p049I2.AbstractC0792j;
import p049I2.C0799q;
import p049I2.SharedPreferencesC0796n;
import p058L.C0909K;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p074O2.C1044b;
import p074O2.C1052j;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p076P.C1073T;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.C1121h;
import p077P0.C1125l;
import p077P0.C1135v;
import p082Q0.C1168b;
import p087R0.EnumC1190a;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p105V.C1480b;
import p105V.C1483e;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p117X2.C1660e;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p136b0.C1843e;
import p143c3.C1906h;
import p149d3.AbstractC1976d;
import p152e0.AbstractC2004k;
import p153e1.C2008d;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2197f;
import p169h0.InterfaceC2207p;
import p175i0.C2269d;
import p175i0.C2271f;
import p175i0.C2277l;
import p175i0.C2279n;
import p175i0.InterfaceC2278m;
import p186k.C2404A;
import p186k.C2408E;
import p197m.AbstractC2539Y;
import p203n.C2674s;
import p204n0.C2683b;
import p212o1.AbstractC2768a;
import p216p.AbstractC2831Y;
import p216p.C2847h;
import p216p.C2849i;
import p227r.C2996k;
import p244u.AbstractC3273i;
import p244u.C3251U;
import p244u.InterfaceC3271h;
import p245u0.C3309f;
import p255w.AbstractC3387r;
import p255w.C3371b;
import p255w.C3380k;
import p255w.C3385p;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1785a {

    /* JADX INFO: renamed from: a */
    public static Context f6095a;

    /* JADX INFO: renamed from: b */
    public static ClassLoader f6096b;

    /* JADX INFO: renamed from: c */
    public static Activity f6097c;

    /* JADX INFO: renamed from: d */
    public static String f6098d;

    /* JADX INFO: renamed from: e */
    public static String f6099e;

    /* JADX INFO: renamed from: f */
    public static C3309f f6100f;

    /* JADX INFO: renamed from: g */
    public static C3309f f6101g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2008d m3241a() {
        return new C2008d(1.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3242b(int i5, int i6, InterfaceC1373m interfaceC1373m, InterfaceC1601c interfaceC1601c, C2197f c2197f, InterfaceC2207p interfaceC2207p, C2847h c2847h, C2996k c2996k, InterfaceC3271h interfaceC3271h, C3251U c3251u, C3385p c3385p, boolean z5) {
        int i7;
        C3251U c3251u2;
        InterfaceC3271h interfaceC3271h2;
        int i8;
        C2197f c2197f2;
        C2847h c2847h2;
        C2996k c2996k2;
        C3385p c3385p2;
        boolean z6;
        C3251U c3251u3;
        C1388t0 c1388t0M2599r;
        C2847h c2847h3;
        C2197f c2197f3;
        C2996k c2996k3;
        C3385p c3385p3;
        C2847h c2847h4;
        int i9;
        boolean z7;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(53695811);
        if ((i5 & 6) == 0) {
            i7 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i10 = i7 | 16;
        int i11 = i6 & 4;
        if (i11 == 0) {
            if ((i5 & 384) == 0) {
                c3251u2 = c3251u;
                i10 |= c1383r.m2582f(c3251u2) ? 256 : 128;
            }
            int i12 = i10 | 3072;
            if ((i5 & 24576) != 0) {
                if ((i6 & 16) == 0) {
                    interfaceC3271h2 = interfaceC3271h;
                    int i13 = c1383r.m2582f(interfaceC3271h2) ? 16384 : 8192;
                    i12 |= i13;
                } else {
                    interfaceC3271h2 = interfaceC3271h;
                }
                i12 |= i13;
            } else {
                interfaceC3271h2 = interfaceC3271h;
            }
            i8 = i12 | 46858240 | (!c1383r.m2586h(interfaceC1601c) ? 536870912 : 268435456);
            if (c1383r.m2560O(i8 & 1, (306783379 & i8) == 306783378)) {
                c1383r.m2563R();
                c2197f2 = c2197f;
                c2847h2 = c2847h;
                c2996k2 = c2996k;
                c3385p2 = c3385p;
                z6 = z5;
                c3251u3 = c3251u2;
            } else {
                c1383r.m2565T();
                if ((i5 & 1) == 0 || c1383r.m2606y()) {
                    C3380k c3380k = AbstractC3387r.f10582a;
                    Object[] objArr = new Object[0];
                    C0038T0 c0038t0 = C3385p.f10558x;
                    boolean zM2578d = c1383r.m2578d(0) | c1383r.m2578d(0);
                    Object objM2558L = c1383r.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (zM2578d || objM2558L == c1357e) {
                        objM2558L = new C1073T(25);
                        c1383r.m2585g0(objM2558L);
                    }
                    C3385p c3385p4 = (C3385p) AbstractC2004k.m3672d(objArr, c0038t0, (InterfaceC1599a) objM2558L, c1383r, 0);
                    int i14 = i8 & (-113);
                    if (i11 != 0) {
                        float f2 = 0;
                        c3251u2 = new C3251U(f2, f2, f2, f2);
                    }
                    if ((i6 & 16) != 0) {
                        i14 = i8 & (-57457);
                        interfaceC3271h2 = AbstractC3273i.f10112c;
                    }
                    C2197f c2197f4 = C2194c.f7171o;
                    float f5 = AbstractC2539Y.f8106a;
                    InterfaceC2007c interfaceC2007c = (InterfaceC2007c) c1383r.m2590j(AbstractC0757q0.f2358h);
                    boolean zM2576c = c1383r.m2576c(interfaceC2007c.mo272b());
                    Object objM2558L2 = c1383r.m2558L();
                    if (zM2576c || objM2558L2 == c1357e) {
                        objM2558L2 = new C2674s(new C1753n(interfaceC2007c));
                        c1383r.m2585g0(objM2558L2);
                    }
                    C2674s c2674s = (C2674s) objM2558L2;
                    boolean zM2582f = c1383r.m2582f(c2674s);
                    Object objM2558L3 = c1383r.m2558L();
                    if (zM2582f || objM2558L3 == c1357e) {
                        objM2558L3 = new C2996k(c2674s);
                        c1383r.m2585g0(objM2558L3);
                    }
                    C2996k c2996k4 = (C2996k) objM2558L3;
                    C1305C c1305c = AbstractC2831Y.f8910a;
                    c1383r.m2568W(282942128);
                    C2849i c2849i = (C2849i) c1383r.m2590j(AbstractC2831Y.f8910a);
                    if (c2849i == null) {
                        c1383r.m2597p(false);
                        c2847h3 = null;
                    } else {
                        boolean zM2582f2 = c1383r.m2582f(c2849i);
                        Object objM2558L4 = c1383r.m2558L();
                        if (zM2582f2 || objM2558L4 == c1357e) {
                            objM2558L4 = new C2847h(c2849i.f8961a, c2849i.f8962b, c2849i.f8963c, c2849i.f8964d);
                            c1383r.m2585g0(objM2558L4);
                        }
                        c1383r.m2597p(false);
                        c2847h3 = (C2847h) objM2558L4;
                    }
                    c2197f3 = c2197f4;
                    c2996k3 = c2996k4;
                    c3385p3 = c3385p4;
                    c2847h4 = c2847h3;
                    i9 = i14 & (-238551041);
                    z7 = true;
                } else {
                    c1383r.m2563R();
                    int i15 = i8 & (-113);
                    if ((i6 & 16) != 0) {
                        i15 = i8 & (-57457);
                    }
                    i9 = i15 & (-238551041);
                    c2197f3 = c2197f;
                    c2847h4 = c2847h;
                    c2996k3 = c2996k;
                    c3385p3 = c3385p;
                    z7 = z5;
                }
                C3251U c3251u4 = c3251u2;
                InterfaceC3271h interfaceC3271h3 = interfaceC3271h2;
                c1383r.m2598q();
                AbstractC1922d.m3424c((i9 & 14) | 24576 | (i9 & 896) | 806882304, ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), c1383r, interfaceC1601c, c2197f3, interfaceC2207p, c2847h4, c2996k3, interfaceC3271h3, c3251u4, c3385p3, z7);
                c2197f2 = c2197f3;
                c2847h2 = c2847h4;
                c2996k2 = c2996k3;
                interfaceC3271h2 = interfaceC3271h3;
                c3251u3 = c3251u4;
                c3385p2 = c3385p3;
                z6 = z7;
            }
            c1388t0M2599r = c1383r.m2599r();
            if (c1388t0M2599r == null) {
                c1388t0M2599r.f4928d = new C3371b(interfaceC2207p, c3385p2, c3251u3, interfaceC3271h2, c2197f2, c2996k2, z6, c2847h2, interfaceC1601c, i5, i6);
                return;
            }
            return;
        }
        i10 = i7 | 400;
        c3251u2 = c3251u;
        int i122 = i10 | 3072;
        if ((i5 & 24576) != 0) {
        }
        i8 = i122 | 46858240 | (!c1383r.m2586h(interfaceC1601c) ? 536870912 : 268435456);
        if (c1383r.m2560O(i8 & 1, (306783379 & i8) == 306783378)) {
        }
        c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3243c(InterfaceC2207p interfaceC2207p, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1854833411);
        int i6 = (c1383r.m2582f(interfaceC2207p) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            Object objM2558L = c1383r.m2558L();
            if (objM2558L == C1371l.f4833a) {
                objM2558L = C0909K.f2825a;
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC0377O interfaceC0377O = (InterfaceC0377O) objM2558L;
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207p);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
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
            c1843e.mo0g(c1383r, 6);
            c1383r.m2597p(true);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 4, interfaceC2207p, c1843e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: L2.l.X(java.lang.Object[]):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m3244d(C0066i0 c0066i0, C0209w c0209w, long j5) {
        C0235b c0235b = (C0235b) c0066i0.f297e;
        c0235b.getClass();
        C0238e c0238e = c0235b.f790b;
        C0238e c0238e2 = c0235b.f789a;
        boolean zM312b = AbstractC0208v.m312b(c0209w);
        long j6 = c0209w.f712b;
        if (zM312b) {
            C0234a[] c0234aArr = c0238e2.f801d;
            AbstractC0972l.m1998V(c0234aArr, 0, c0234aArr.length);
            c0238e2.f802e = 0;
            C0234a[] c0234aArr2 = c0238e.f801d;
            AbstractC0972l.m1998V(c0234aArr2, 0, c0234aArr2.length);
            c0238e.f802e = 0;
            c0235b.f791c = 0L;
        }
        if (!AbstractC0208v.m314d(c0209w)) {
            List list = c0209w.f721k;
            if (list == null) {
                list = C0981u.f3047d;
            }
            int i5 = 0;
            for (int size = list.size(); i5 < size; size = size) {
                C0189c c0189c = (C0189c) list.get(i5);
                c0235b.m412a(c0189c.f659a, C2683b.m4647e(c0189c.f661c, j5));
                i5++;
            }
            c0235b.m412a(j6, C2683b.m4647e(c0209w.f722l, j5));
        }
        if (AbstractC0208v.m314d(c0209w) && j6 - c0235b.f791c > 40) {
            C0234a[] c0234aArr3 = c0238e2.f801d;
            AbstractC0972l.m1998V(c0234aArr3, 0, c0234aArr3.length);
            c0238e2.f802e = 0;
            C0234a[] c0234aArr4 = c0238e.f801d;
            AbstractC0972l.m1998V(c0234aArr4, 0, c0234aArr4.length);
            c0238e.f802e = 0;
            c0235b.f791c = 0L;
        }
        c0235b.f791c = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Handler m3245e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2768a.m4956a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m3246f(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c5 = (char) (byteBuffer.get() & 255);
            if (c5 == 0) {
                return sb.toString();
            }
            if (c5 < 128) {
                sb.append(c5);
            } else if ((c5 & 224) == 192) {
                byte b2 = byteBuffer.get();
                if ((b2 & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c5 & 31) << 6) | (b2 & 63)));
            } else {
                if ((c5 & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                if ((b5 & 192) != 128 || (b6 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c5 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float m3247g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            f2 += fArr[i5] * fArr2[i5];
        }
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m3248h(byte b2) {
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        if (b2 == 3) {
            return 3;
        }
        if (b2 == 4) {
            return 4;
        }
        if (b2 == 5) {
            return 5;
        }
        if (b2 == 6) {
            return 6;
        }
        if (b2 == 7) {
            return 7;
        }
        if (b2 == 8) {
            return 8;
        }
        if (b2 == 9) {
            return 9;
        }
        if (b2 == 10) {
            return 10;
        }
        if (b2 == 11) {
            return 11;
        }
        if (b2 == 12) {
            return 12;
        }
        if (b2 == 13) {
            return 13;
        }
        if (b2 == 14) {
            return 14;
        }
        if (b2 == 15) {
            return 15;
        }
        throw new IllegalArgumentException("Unknown AnnotationEncodeValueType: " + String.valueOf(b2 & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3249i(SharedPreferencesC0796n sharedPreferencesC0796n, int i5) {
        int i6;
        MappedByteBuffer mappedByteBufferM3197K;
        ArrayList arrayList = sharedPreferencesC0796n.f2561n;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            C0799q c0799q = (C0799q) arrayList.get(0);
            int size = arrayList.size();
            int i7 = 0;
            for (int i8 = 1; i8 < size; i8++) {
                C0799q c0799q2 = (C0799q) arrayList.get(i8);
                if (c0799q2.f2575d == c0799q.f2576e) {
                    c0799q.f2576e = c0799q2.f2576e;
                } else {
                    i7++;
                    if (i7 != i8) {
                        arrayList.set(i7, c0799q2);
                    }
                    c0799q = c0799q2;
                }
            }
            int i9 = i7 + 1;
            if (size > i9) {
                arrayList.subList(i9, size).clear();
            }
        }
        C0799q c0799q3 = (C0799q) arrayList.get(0);
        int i10 = c0799q3.f2575d;
        int i11 = sharedPreferencesC0796n.f2551d;
        int i12 = i11 - sharedPreferencesC0796n.f2560m;
        int i13 = i12 - 12;
        int i14 = i12 - i10;
        int i15 = i11 - i10;
        boolean z5 = i13 < i15 + i14;
        if (!z5) {
            sharedPreferencesC0796n.f2552e ^= sharedPreferencesC0796n.f2555h.m1342f(i10, i15);
        }
        int size2 = arrayList.size();
        int i16 = size2 - 1;
        int i17 = sharedPreferencesC0796n.f2551d - ((C0799q) arrayList.get(i16)).f2576e;
        int i18 = i17 > 0 ? size2 : i16;
        int[] iArr = new int[i18];
        int[] iArr2 = new int[i18];
        int i19 = c0799q3.f2575d;
        int i20 = c0799q3.f2576e;
        int i21 = 1;
        while (i21 < size2) {
            ArrayList arrayList2 = arrayList;
            C0799q c0799q4 = (C0799q) arrayList.get(i21);
            int i22 = i21;
            int i23 = c0799q4.f2575d - i20;
            int i24 = size2;
            byte[] bArr = (byte[]) sharedPreferencesC0796n.f2555h.f2539g;
            System.arraycopy(bArr, i20, bArr, i19, i23);
            int i25 = i22 - 1;
            iArr[i25] = i20;
            iArr2[i25] = i20 - i19;
            i19 += i23;
            i20 = c0799q4.f2576e;
            i21 = i22 + 1;
            arrayList = arrayList2;
            size2 = i24;
        }
        ArrayList arrayList3 = arrayList;
        if (i17 > 0) {
            byte[] bArr2 = (byte[]) sharedPreferencesC0796n.f2555h.f2539g;
            System.arraycopy(bArr2, i20, bArr2, i19, i17);
            iArr[i16] = i20;
            iArr2[i16] = i20 - i19;
        }
        sharedPreferencesC0796n.f2560m = 0;
        arrayList3.clear();
        if (z5) {
            sharedPreferencesC0796n.f2552e = sharedPreferencesC0796n.f2555h.m1342f(12, i13);
        } else {
            sharedPreferencesC0796n.f2552e ^= sharedPreferencesC0796n.f2555h.m1342f(i10, i14);
        }
        sharedPreferencesC0796n.f2551d = i12;
        if (sharedPreferencesC0796n.f2569v == 0) {
            sharedPreferencesC0796n.f2566s.putInt(0, -1);
            sharedPreferencesC0796n.f2566s.putLong(4, sharedPreferencesC0796n.f2552e);
            sharedPreferencesC0796n.f2566s.position(i10);
            sharedPreferencesC0796n.f2566s.put((byte[]) sharedPreferencesC0796n.f2555h.f2539g, i10, i14);
            sharedPreferencesC0796n.f2566s.putInt(0, i13);
            sharedPreferencesC0796n.f2567t.putInt(0, i13);
            sharedPreferencesC0796n.f2567t.putLong(4, sharedPreferencesC0796n.f2552e);
            sharedPreferencesC0796n.f2567t.position(i10);
            sharedPreferencesC0796n.f2567t.put((byte[]) sharedPreferencesC0796n.f2555h.f2539g, i10, i14);
        } else {
            sharedPreferencesC0796n.f2555h.m1351q(0, i13);
            sharedPreferencesC0796n.f2555h.m1352r(sharedPreferencesC0796n.f2552e, 4);
        }
        int i26 = sharedPreferencesC0796n.f2551d + i5;
        if (((byte[]) sharedPreferencesC0796n.f2555h.f2539g).length - i26 > 32768) {
            int i27 = SharedPreferencesC0796n.f2547z;
            int iM3187A = AbstractC1784a.m3187A(i27, i26 + i27);
            byte[] bArr3 = (byte[]) sharedPreferencesC0796n.f2555h.f2539g;
            if (iM3187A >= bArr3.length) {
                i6 = 0;
            } else {
                byte[] bArr4 = new byte[iM3187A];
                i6 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, sharedPreferencesC0796n.f2551d);
                sharedPreferencesC0796n.f2555h.f2539g = bArr4;
                if (sharedPreferencesC0796n.f2569v == 0) {
                    FileChannel fileChannel = sharedPreferencesC0796n.f2564q;
                    long j5 = iM3187A;
                    MappedByteBuffer mappedByteBufferM3197K2 = null;
                    try {
                        fileChannel.truncate(j5);
                        mappedByteBufferM3197K = AbstractC1784a.m3197K(fileChannel, iM3187A);
                    } catch (IOException unused) {
                        mappedByteBufferM3197K = null;
                    }
                    FileChannel fileChannel2 = sharedPreferencesC0796n.f2565r;
                    try {
                        fileChannel2.truncate(j5);
                        mappedByteBufferM3197K2 = AbstractC1784a.m3197K(fileChannel2, iM3187A);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM3197K == null || mappedByteBufferM3197K2 == null) {
                        Log.e("FastKV", sharedPreferencesC0796n.f2549b, new Exception("map failed"));
                        AbstractC1784a.m3206T(sharedPreferencesC0796n);
                    } else {
                        sharedPreferencesC0796n.f2566s = mappedByteBufferM3197K;
                        sharedPreferencesC0796n.f2567t = mappedByteBufferM3197K2;
                    }
                }
                AbstractC1922d.m3440w(sharedPreferencesC0796n, "truncate finish");
            }
        }
        for (AbstractC0784b abstractC0784b : sharedPreferencesC0796n.f2553f.values()) {
            int i28 = abstractC0784b.f2526a;
            if (i28 > i10) {
                int i29 = i18 - 1;
                int i30 = i6;
                while (true) {
                    if (i30 > i29) {
                        break;
                    }
                    int i31 = (i30 + i29) >>> 1;
                    int i32 = iArr[i31];
                    if (i32 >= i28) {
                        if (i32 <= i28) {
                            i29 = i31;
                            break;
                        }
                        i29 = i31 - 1;
                    } else {
                        i30 = i31 + 1;
                    }
                }
                int i33 = iArr2[i29];
                abstractC0784b.f2526a -= i33;
                if (abstractC0784b.mo1331a() >= 6) {
                    ((AbstractC0792j) abstractC0784b).f2533c -= i33;
                }
            }
        }
        AbstractC1922d.m3440w(sharedPreferencesC0796n, "gc finish");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static InterfaceC1049g m3250j(InterfaceC1049g interfaceC1049g, InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        if (AbstractC1665j.m2981a(interfaceC1049g.getKey(), interfaceC1050h)) {
            return interfaceC1049g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final int m3251l(C1587l c1587l, int i5) {
        boolean z5 = AbstractC1665j.m2987g(c1587l.f5507d, C1587l.f5501e.f5507d) >= 0;
        boolean z6 = i5 == 1;
        if (z6 && z5) {
            return 3;
        }
        if (z5) {
            return 1;
        }
        return z6 ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C1906h m3252m(InterfaceC1603e interfaceC1603e) {
        C1906h c1906h = new C1906h();
        c1906h.f6478f = AbstractC1923e.m3479q(c1906h, c1906h, interfaceC1603e);
        return c1906h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static InterfaceC1051i m3253n(InterfaceC1049g interfaceC1049g, InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        return AbstractC1665j.m2981a(interfaceC1049g.getKey(), interfaceC1050h) ? C1052j.f3286d : interfaceC1049g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static InterfaceC1051i m3254o(InterfaceC1049g interfaceC1049g, InterfaceC1051i interfaceC1051i) {
        AbstractC1665j.m2985e(interfaceC1051i, "context");
        return interfaceC1051i == C1052j.f3286d ? interfaceC1049g : (InterfaceC1051i) interfaceC1051i.mo1165A(new C1044b(1), interfaceC1049g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m3255q(float[] fArr, float[] fArr2, int i5, float[] fArr3) {
        if (i5 == 0) {
            AbstractC0277a.m482a("At least one point must be provided");
        }
        int i6 = 2 >= i5 ? i5 - 1 : 2;
        int i7 = i6 + 1;
        float[][] fArr4 = new float[i7][];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr4[i8] = new float[i5];
        }
        for (int i9 = 0; i9 < i5; i9++) {
            fArr4[0][i9] = 1.0f;
            for (int i10 = 1; i10 < i7; i10++) {
                fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr[i9];
            }
        }
        float[][] fArr5 = new float[i7][];
        for (int i11 = 0; i11 < i7; i11++) {
            fArr5[i11] = new float[i5];
        }
        float[][] fArr6 = new float[i7][];
        for (int i12 = 0; i12 < i7; i12++) {
            fArr6[i12] = new float[i7];
        }
        int i13 = 0;
        while (i13 < i7) {
            float[] fArr7 = fArr5[i13];
            float[] fArr8 = fArr4[i13];
            AbstractC1665j.m2985e(fArr8, "<this>");
            AbstractC1665j.m2985e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i5);
            for (int i14 = 0; i14 < i13; i14++) {
                float[] fArr9 = fArr5[i14];
                float fM3247g = m3247g(fArr7, fArr9);
                for (int i15 = 0; i15 < i5; i15++) {
                    fArr7[i15] = fArr7[i15] - (fArr9[i15] * fM3247g);
                }
            }
            float fSqrt = (float) Math.sqrt(m3247g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i16 = 0; i16 < i5; i16++) {
                fArr7[i16] = fArr7[i16] * f2;
            }
            float[] fArr10 = fArr6[i13];
            int i17 = 0;
            while (i17 < i7) {
                fArr10[i17] = i17 < i13 ? 0.0f : m3247g(fArr7, fArr4[i17]);
                i17++;
            }
            i13++;
        }
        for (int i18 = i6; -1 < i18; i18--) {
            float fM3247g2 = m3247g(fArr5[i18], fArr2);
            float[] fArr11 = fArr6[i18];
            int i19 = i18 + 1;
            if (i19 <= i6) {
                int i20 = i6;
                while (true) {
                    fM3247g2 -= fArr11[i20] * fArr3[i20];
                    if (i20 != i19) {
                        i20--;
                    }
                }
            }
            fArr3[i18] = fM3247g2 / fArr11[i18];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x018f: PHI (r6v12 i0.d) = (r6v11 i0.d), (r6v13 i0.d) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r21v5 R0.a) = (r21v4 R0.a), (r21v6 R0.a) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r22v5 S0.g) = (r22v4 S0.g), (r22v6 S0.g) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r23v13 i0.f) = (r23v12 i0.f), (r23v14 i0.f) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r24v6 i0.m) = (r24v5 i0.m), (r24v7 i0.m) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r26v13 P0.h) = (r26v12 P0.h), (r26v14 P0.h) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r28v7 boolean) = (r28v6 boolean), (r28v8 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3256r(ViewStructure viewStructure, C0564I c0564i, AutofillId autofillId, String str, C1168b c1168b) {
        int i5;
        long j5;
        long j6;
        char c5;
        long j7;
        EnumC1190a enumC1190a;
        C1269g c1269g;
        C2271f c2271f;
        C1121h c1121h;
        C2269d c2269d;
        boolean z5;
        boolean z6;
        InterfaceC2278m interfaceC2278m;
        Boolean bool;
        boolean z7;
        Integer num;
        boolean z8;
        List list;
        boolean z9;
        String[] strArrM3236v;
        String strM1196r;
        String[] strArrM3236v2;
        String[] strArrM3236v3;
        C2408E c2408e;
        Object[] objArr;
        int i6;
        Object[] objArr2;
        boolean z10;
        C2408E c2408e2;
        EnumC1190a enumC1190a2;
        C1269g c1269g2;
        C2271f c2271f2;
        C1121h c1121h2;
        boolean zBooleanValue;
        int i7;
        C1135v c1135v = AbstractC1132s.f3738a;
        C1135v c1135v2 = AbstractC1124k.f3676a;
        C1125l c1125lM841w = c0564i.m841w();
        int i8 = 8;
        if (c1125lM841w == null || (c2408e2 = c1125lM841w.f3702d) == null) {
            i5 = 2;
            j5 = 128;
            j6 = 255;
            c5 = 7;
            j7 = -9187201950435737472L;
            enumC1190a = null;
            c1269g = null;
            c2271f = null;
            c1121h = null;
            c2269d = null;
            z5 = true;
            z6 = false;
            interfaceC2278m = null;
            bool = null;
            z7 = false;
            num = null;
        } else {
            Object[] objArr3 = c2408e2.f7788b;
            j5 = 128;
            Object[] objArr4 = c2408e2.f7789c;
            long[] jArr = c2408e2.f7787a;
            int length = jArr.length - 2;
            i5 = 2;
            if (length >= 0) {
                int i9 = 0;
                c2269d = null;
                j6 = 255;
                z6 = false;
                enumC1190a2 = null;
                c1269g2 = null;
                c2271f2 = null;
                interfaceC2278m = null;
                bool = null;
                c1121h2 = null;
                z7 = false;
                zBooleanValue = true;
                num = null;
                c5 = 7;
                while (true) {
                    long j8 = jArr[i9];
                    j7 = -9187201950435737472L;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j8 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr3[i12];
                                Object obj2 = objArr4[i12];
                                C1135v c1135v3 = (C1135v) obj;
                                i7 = i8;
                                if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3755r)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    c2269d = (C2269d) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3738a)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) AbstractC0973m.m2013T((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3754q)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    interfaceC2278m = (InterfaceC2278m) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3756s)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    c2271f2 = (C2271f) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3727F)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c1269g2 = (C1269g) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3748k)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3736O)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3732K)) {
                                    z7 = true;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3751n)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3762y)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    c1121h2 = (C1121h) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3730I)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1132s.f3731J)) {
                                    AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    enumC1190a2 = (EnumC1190a) obj2;
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1124k.f3677b)) {
                                    viewStructure.setClickable(true);
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1124k.f3678c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1124k.f3698w)) {
                                    viewStructure.setFocusable(true);
                                } else if (AbstractC1665j.m2981a(c1135v3, AbstractC1124k.f3686k)) {
                                    z6 = true;
                                }
                            } else {
                                i7 = i8;
                            }
                            j8 >>= i7;
                            i11++;
                            i8 = i7;
                        }
                        if (i10 != i8) {
                            break;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        i8 = 8;
                    }
                }
            } else {
                j6 = 255;
                c5 = 7;
                j7 = -9187201950435737472L;
                c2269d = null;
                z6 = false;
                enumC1190a2 = null;
                c1269g2 = null;
                c2271f2 = null;
                interfaceC2278m = null;
                bool = null;
                c1121h2 = null;
                z7 = false;
                zBooleanValue = true;
                num = null;
            }
            enumC1190a = enumC1190a2;
            c1269g = c1269g2;
            c2271f = c2271f2;
            c1121h = c1121h2;
            z5 = zBooleanValue;
        }
        C1125l c1125lM841w2 = c0564i.m841w();
        if (c1125lM841w2 != null && c1125lM841w2.f3704f && !c1125lM841w2.f3705g) {
            c1125lM841w2 = c1125lM841w2.m2159b();
            C2404A c2404a = new C2404A(((C1483e) ((C1480b) c0564i.m832n()).f5173e).f5183f);
            c2404a.m4244b(c0564i.m832n());
            while (c2404a.m4251i()) {
                C0564I c0564i2 = (C0564I) c2404a.m4253k(c2404a.f7767b - 1);
                C1125l c1125lM841w3 = c0564i2.m841w();
                if (c1125lM841w3 != null && !c1125lM841w3.f3704f) {
                    c1125lM841w2.m2161d(c1125lM841w3);
                    if (!c1125lM841w3.f3705g) {
                        c2404a.m4244b(c0564i2.m832n());
                    }
                }
            }
        }
        if (c1125lM841w2 == null || (c2408e = c1125lM841w2.f3702d) == null) {
            z8 = z5;
            list = null;
        } else {
            Object[] objArr5 = c2408e.f7788b;
            Object[] objArr6 = c2408e.f7789c;
            long[] jArr2 = c2408e.f7787a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 0;
                list = null;
                while (true) {
                    long j9 = jArr2[i13];
                    long[] jArr3 = jArr2;
                    Object[] objArr7 = objArr5;
                    if ((((~j9) << c5) & j9 & j7) != j7) {
                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j9 & j6) < j5) {
                                int i16 = (i13 << 3) + i15;
                                Object obj3 = objArr7[i16];
                                i6 = i15;
                                Object obj4 = objArr6[i16];
                                objArr2 = objArr6;
                                C1135v c1135v4 = (C1135v) obj3;
                                z10 = z5;
                                if (AbstractC1665j.m2981a(c1135v4, AbstractC1132s.f3746i)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC1665j.m2981a(c1135v4, AbstractC1132s.f3723B)) {
                                    AbstractC1665j.m2983c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                i6 = i15;
                                objArr2 = objArr6;
                                z10 = z5;
                            }
                            j9 >>= 8;
                            i15 = i6 + 1;
                            objArr6 = objArr2;
                            z5 = z10;
                        }
                        objArr = objArr6;
                        z8 = z5;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        objArr = objArr6;
                        z8 = z5;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    objArr5 = objArr7;
                    jArr2 = jArr3;
                    objArr6 = objArr;
                    z5 = z8;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(c0564i.f1712e);
        if (c0564i.m839u() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = c2269d != null ? Integer.valueOf(c2269d.f7422a) : z6 ? 1 : enumC1190a != null ? Integer.valueOf(i5) : null;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (c1269g != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(c1269g.f4563e));
        }
        if (c2271f != null) {
            viewStructure.setAutofillValue(c2271f.f7424a);
        }
        if (interfaceC2278m != null && (strArrM3236v3 = AbstractC1784a.m3236v(interfaceC2278m)) != null) {
            viewStructure.setAutofillHints(strArrM3236v3);
        }
        c1168b.f3820a.m1356v(c0564i.f1712e, new C2279n(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (enumC1190a == null) {
            if (bool != null && (c1121h == null || c1121h.f3648a != 4)) {
                z9 = true;
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            InterfaceC2278m.f7433a.getClass();
            strArrM3236v = AbstractC1784a.m3236v(C2277l.f7430b);
            AbstractC1665j.m2985e(strArrM3236v, "<this>");
            if (strArrM3236v.length != 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            boolean z11 = (z7 || ((interfaceC2278m == null || (strArrM3236v2 = AbstractC1784a.m3236v(interfaceC2278m)) == null || AbstractC0972l.m2004b0(strArrM3236v2, strArrM3236v[0]) < 0) ? false : z9)) ? z9 : false;
            viewStructure.setDataIsSensitive((z11 || z8) ? z9 : false);
            viewStructure.setVisibility(c0564i.f1699J.f1894d.m989Z0() ? 4 : 0);
            if (list != null) {
                int size = list.size();
                String strM402m = "";
                for (int i17 = 0; i17 < size; i17++) {
                    C1269g c1269g3 = (C1269g) list.get(i17);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM402m);
                    strM402m = AbstractC0231b.m402m(sb, c1269g3.f4563e, '\n');
                }
                viewStructure.setText(strM402m);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (((C1480b) c0564i.m832n()).isEmpty() && c1121h != null && (strM1196r = AbstractC0681L.m1196r(c1121h.f3648a)) != null) {
                viewStructure.setClassName(strM1196r);
            }
            if (z6) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z11) {
                    viewStructure.setInputType(129);
                    return;
                }
                return;
            }
            return;
        }
        viewStructure.setCheckable(true);
        viewStructure.setChecked(enumC1190a == EnumC1190a.f3906d);
        z9 = true;
        InterfaceC2278m.f7433a.getClass();
        strArrM3236v = AbstractC1784a.m3236v(C2277l.f7430b);
        AbstractC1665j.m2985e(strArrM3236v, "<this>");
        if (strArrM3236v.length != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final ExtractedText m3257s(C1646u c1646u) {
        ExtractedText extractedText = new ExtractedText();
        String str = c1646u.f5650a.f4563e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = c1646u.f5651b;
        extractedText.selectionStart = C1259L.m2338f(j5);
        extractedText.selectionEnd = C1259L.m2337e(j5);
        extractedText.flags = !AbstractC1976d.m3628V(c1646u.f5650a.f4563e, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final String m3258t(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f5 = f2 * fPow;
        int i5 = (int) f5;
        if (f5 - i5 >= 0.5f) {
            i5++;
        }
        float f6 = i5 / fPow;
        return iMax > 0 ? String.valueOf(f6) : String.valueOf((int) f6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final double m3259u(long j5) {
        return ((j5 >>> 11) * ((double) 2048)) + (j5 & 2047);
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo3155k(C1660e c1660e);

    /* JADX INFO: renamed from: p */
    public abstract AbstractC1785a mo3156p(C1660e c1660e, Object obj);
}
