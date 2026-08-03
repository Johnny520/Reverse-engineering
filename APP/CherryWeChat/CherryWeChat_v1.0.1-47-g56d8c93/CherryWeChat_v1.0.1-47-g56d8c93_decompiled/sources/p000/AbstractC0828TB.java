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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: TB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0828TB {

    /* JADX INFO: renamed from: a */
    public static final C0178E5 f2609a = new C0178E5();

    /* JADX INFO: renamed from: b */
    public static final C2220m6 f2610b = new C2220m6(11);

    /* JADX INFO: renamed from: c */
    public static final C0668Pg f2611c = new C0668Pg(25);

    /* JADX INFO: renamed from: d */
    public static final C0963Wb f2612d = new C0963Wb(7);

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

    /* JADX INFO: renamed from: A */
    public static final void m1625A(C0523M6 c0523m6, InterfaceC0190Eb interfaceC0190Eb, boolean z) {
        Object obj = C0523M6.f1708g.get(c0523m6);
        Throwable thMo1013d = c0523m6.mo1013d(obj);
        Object c0297Gw = thMo1013d != null ? new C0297Gw(thMo1013d) : c0523m6.mo1014g(obj);
        if (!z) {
            interfaceC0190Eb.mo264f(c0297Gw);
            return;
        }
        C1367ee c1367ee = (C1367ee) interfaceC0190Eb;
        AbstractC0233Fb abstractC0233Fb = c1367ee.f4895e;
        Object obj2 = c1367ee.f4897g;
        InterfaceC1137ac interfaceC1137ac = abstractC0233Fb.f731b;
        Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, obj2);
        C2664wC c2664wCM289w = objM604E != AbstractC0295Gu.f1005j ? AbstractC0148Dc.m289w(abstractC0233Fb, interfaceC1137ac, objM604E) : null;
        try {
            c1367ee.f4895e.mo264f(c0297Gw);
            if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
            }
        } catch (Throwable th) {
            if (c2664wCM289w == null || c2664wCM289w.m5231P()) {
                AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m1626D(int i, C1496hb c1496hb, C2454rb c2454rb, boolean z) {
        float f = c2454rb.f8613d0;
        C1259cb c1259cb = c2454rb.f8588I;
        int iM2383d = c1259cb.f4270f.m2383d();
        C1259cb c1259cb2 = c2454rb.f8590K;
        int iM2383d2 = c1259cb2.f4270f.m2383d();
        int iM2384e = c1259cb.m2384e() + iM2383d;
        int iM2384e2 = iM2383d2 - c1259cb2.m2384e();
        if (iM2383d == iM2383d2) {
            f = 0.5f;
        } else {
            iM2383d = iM2384e;
            iM2383d2 = iM2384e2;
        }
        int iM4937q = c2454rb.m4937q();
        int i2 = (iM2383d2 - iM2383d) - iM4937q;
        if (iM2383d > iM2383d2) {
            i2 = (iM2383d - iM2383d2) - iM4937q;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM2383d;
        int i4 = i3 + iM4937q;
        if (iM2383d > iM2383d2) {
            i4 = i3 - iM4937q;
        }
        c2454rb.m4919J(i3, i4);
        m1648q(i + 1, c1496hb, c2454rb, z);
    }

    /* JADX INFO: renamed from: E */
    public static void m1627E(int i, C2454rb c2454rb, C1496hb c1496hb, C2454rb c2454rb2, boolean z) {
        float f = c2454rb2.f8613d0;
        C1259cb c1259cb = c2454rb2.f8588I;
        int iM2384e = c1259cb.m2384e() + c1259cb.f4270f.m2383d();
        C1259cb c1259cb2 = c2454rb2.f8590K;
        int iM2383d = c1259cb2.f4270f.m2383d() - c1259cb2.m2384e();
        if (iM2383d >= iM2384e) {
            int iM4937q = c2454rb2.m4937q();
            if (c2454rb2.f8619g0 != 8) {
                int i2 = c2454rb2.f8639r;
                if (i2 == 2) {
                    iM4937q = (int) (c2454rb2.f8613d0 * 0.5f * (c2454rb instanceof C2497sb ? c2454rb.m4937q() : c2454rb.f8599T.m4937q()));
                } else if (i2 == 0) {
                    iM4937q = iM2383d - iM2384e;
                }
                iM4937q = Math.max(c2454rb2.f8642u, iM4937q);
                int i3 = c2454rb2.f8643v;
                if (i3 > 0) {
                    iM4937q = Math.min(i3, iM4937q);
                }
            }
            int i4 = iM2384e + ((int) ((f * ((iM2383d - iM2384e) - iM4937q)) + 0.5f));
            c2454rb2.m4919J(i4, iM4937q + i4);
            m1648q(i + 1, c1496hb, c2454rb2, z);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m1628F(int i, C1496hb c1496hb, C2454rb c2454rb) {
        float f = c2454rb.f8615e0;
        C1259cb c1259cb = c2454rb.f8589J;
        int iM2383d = c1259cb.f4270f.m2383d();
        C1259cb c1259cb2 = c2454rb.f8591L;
        int iM2383d2 = c1259cb2.f4270f.m2383d();
        int iM2384e = c1259cb.m2384e() + iM2383d;
        int iM2384e2 = iM2383d2 - c1259cb2.m2384e();
        if (iM2383d == iM2383d2) {
            f = 0.5f;
        } else {
            iM2383d = iM2384e;
            iM2383d2 = iM2384e2;
        }
        int iM4933k = c2454rb.m4933k();
        int i2 = (iM2383d2 - iM2383d) - iM4933k;
        if (iM2383d > iM2383d2) {
            i2 = (iM2383d - iM2383d2) - iM4933k;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM2383d + i3;
        int i5 = i4 + iM4933k;
        if (iM2383d > iM2383d2) {
            i4 = iM2383d - i3;
            i5 = i4 - iM4933k;
        }
        c2454rb.m4920K(i4, i5);
        m1633K(i + 1, c1496hb, c2454rb);
    }

    /* JADX INFO: renamed from: G */
    public static void m1629G(int i, C2454rb c2454rb, C1496hb c1496hb, C2454rb c2454rb2) {
        float f = c2454rb2.f8615e0;
        C1259cb c1259cb = c2454rb2.f8589J;
        int iM2384e = c1259cb.m2384e() + c1259cb.f4270f.m2383d();
        C1259cb c1259cb2 = c2454rb2.f8591L;
        int iM2383d = c1259cb2.f4270f.m2383d() - c1259cb2.m2384e();
        if (iM2383d >= iM2384e) {
            int iM4933k = c2454rb2.m4933k();
            if (c2454rb2.f8619g0 != 8) {
                int i2 = c2454rb2.f8640s;
                if (i2 == 2) {
                    iM4933k = (int) (f * 0.5f * (c2454rb instanceof C2497sb ? c2454rb.m4933k() : c2454rb.f8599T.m4933k()));
                } else if (i2 == 0) {
                    iM4933k = iM2383d - iM2384e;
                }
                iM4933k = Math.max(c2454rb2.f8645x, iM4933k);
                int i3 = c2454rb2.f8646y;
                if (i3 > 0) {
                    iM4933k = Math.min(i3, iM4933k);
                }
            }
            int i4 = iM2384e + ((int) ((f * ((iM2383d - iM2384e) - iM4933k)) + 0.5f));
            c2454rb2.m4920K(i4, iM4933k + i4);
            m1633K(i + 1, c1496hb, c2454rb2);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m1630H(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2314oE.m4725b(viewGroup, z);
        } else if (f2619k) {
            try {
                AbstractC2314oE.m4725b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f2619k = false;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m1631I(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        String name = AbstractC0828TB.class.getName();
        StackTraceElement[] stackTrace = classCastException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        classCastException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        throw classCastException;
    }

    /* JADX INFO: renamed from: J */
    public static C0286Gl m1632J(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C0286Gl(i, i2 - 1, 1);
        }
        C0286Gl c0286Gl = C0286Gl.f930d;
        return C0286Gl.f930d;
    }

    /* JADX INFO: renamed from: K */
    public static void m1633K(int i, C1496hb c1496hb, C2454rb c2454rb) {
        boolean z;
        C1259cb c1259cb;
        C1259cb c1259cb2;
        C1259cb c1259cb3;
        C1259cb c1259cb4;
        if (c2454rb.f8632n) {
            return;
        }
        if (!(c2454rb instanceof C2497sb) && c2454rb.m4946z() && m1638e(c2454rb)) {
            C2497sb.m4979V(c2454rb, c1496hb, new C0178E5());
        }
        C1259cb c1259cbMo4340i = c2454rb.mo4340i(3);
        C1259cb c1259cbMo4340i2 = c2454rb.mo4340i(5);
        int iM2383d = c1259cbMo4340i.m2383d();
        int iM2383d2 = c1259cbMo4340i2.m2383d();
        HashSet<C1259cb> hashSet = c1259cbMo4340i.f4265a;
        if (hashSet != null && c1259cbMo4340i.f4267c) {
            for (C1259cb c1259cb5 : hashSet) {
                C2454rb c2454rb2 = c1259cb5.f4268d;
                int i2 = i + 1;
                boolean zM1638e = m1638e(c2454rb2);
                C1259cb c1259cb6 = c2454rb2.f8589J;
                C1259cb c1259cb7 = c2454rb2.f8591L;
                if (c2454rb2.m4946z() && zM1638e) {
                    C2497sb.m4979V(c2454rb2, c1496hb, new C0178E5());
                }
                boolean z2 = (c1259cb5 == c1259cb6 && (c1259cb4 = c1259cb7.f4270f) != null && c1259cb4.f4267c) || (c1259cb5 == c1259cb7 && (c1259cb3 = c1259cb6.f4270f) != null && c1259cb3.f4267c);
                int i3 = c2454rb2.f8637p0[1];
                if (i3 != 3 || zM1638e) {
                    if (!c2454rb2.m4946z()) {
                        if (c1259cb5 == c1259cb6 && c1259cb7.f4270f == null) {
                            int iM2384e = c1259cb6.m2384e() + iM2383d;
                            c2454rb2.m4920K(iM2384e, c2454rb2.m4933k() + iM2384e);
                            m1633K(i2, c1496hb, c2454rb2);
                        } else if (c1259cb5 == c1259cb7 && c1259cb6.f4270f == null) {
                            int iM2384e2 = iM2383d - c1259cb7.m2384e();
                            c2454rb2.m4920K(iM2384e2 - c2454rb2.m4933k(), iM2384e2);
                            m1633K(i2, c1496hb, c2454rb2);
                        } else if (z2 && !c2454rb2.m4945y()) {
                            m1628F(i2, c1496hb, c2454rb2);
                        }
                    }
                } else if (i3 == 3 && c2454rb2.f8646y >= 0 && c2454rb2.f8645x >= 0 && (c2454rb2.f8619g0 == 8 || (c2454rb2.f8640s == 0 && c2454rb2.f8602W == 0.0f))) {
                    if (!c2454rb2.m4945y() && !c2454rb2.f8585F && z2 && !c2454rb2.m4945y()) {
                        m1629G(i2, c2454rb, c1496hb, c2454rb2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (c2454rb instanceof C2150kk) {
            return;
        }
        HashSet<C1259cb> hashSet2 = c1259cbMo4340i2.f4265a;
        if (hashSet2 != null && c1259cbMo4340i2.f4267c) {
            for (C1259cb c1259cb8 : hashSet2) {
                C2454rb c2454rb3 = c1259cb8.f4268d;
                int i4 = i + 1;
                boolean zM1638e2 = m1638e(c2454rb3);
                C1259cb c1259cb9 = c2454rb3.f8589J;
                C1259cb c1259cb10 = c2454rb3.f8591L;
                if (c2454rb3.m4946z() && zM1638e2) {
                    C2497sb.m4979V(c2454rb3, c1496hb, new C0178E5());
                }
                boolean z4 = (c1259cb8 == c1259cb9 && (c1259cb2 = c1259cb10.f4270f) != null && c1259cb2.f4267c) || (c1259cb8 == c1259cb10 && (c1259cb = c1259cb9.f4270f) != null && c1259cb.f4267c);
                int i5 = c2454rb3.f8637p0[1];
                if (i5 != 3 || zM1638e2) {
                    if (!c2454rb3.m4946z()) {
                        if (c1259cb8 == c1259cb9 && c1259cb10.f4270f == null) {
                            int iM2384e3 = c1259cb9.m2384e() + iM2383d2;
                            c2454rb3.m4920K(iM2384e3, c2454rb3.m4933k() + iM2384e3);
                            m1633K(i4, c1496hb, c2454rb3);
                        } else if (c1259cb8 == c1259cb10 && c1259cb9.f4270f == null) {
                            int iM2384e4 = iM2383d2 - c1259cb10.m2384e();
                            c2454rb3.m4920K(iM2384e4 - c2454rb3.m4933k(), iM2384e4);
                            m1633K(i4, c1496hb, c2454rb3);
                        } else if (z4 && !c2454rb3.m4945y()) {
                            m1628F(i4, c1496hb, c2454rb3);
                        }
                    }
                } else if (i5 == 3 && c2454rb3.f8646y >= 0 && c2454rb3.f8645x >= 0 && (c2454rb3.f8619g0 == 8 || (c2454rb3.f8640s == 0 && c2454rb3.f8602W == 0.0f))) {
                    if (!c2454rb3.m4945y() && !c2454rb3.f8585F && z4 && !c2454rb3.m4945y()) {
                        m1629G(i4, c2454rb, c1496hb, c2454rb3);
                    }
                }
            }
        }
        C1259cb c1259cbMo4340i3 = c2454rb.mo4340i(6);
        if (c1259cbMo4340i3.f4265a != null && c1259cbMo4340i3.f4267c) {
            int iM2383d3 = c1259cbMo4340i3.m2383d();
            for (C1259cb c1259cb11 : c1259cbMo4340i3.f4265a) {
                C2454rb c2454rb4 = c1259cb11.f4268d;
                int i6 = i + 1;
                boolean zM1638e3 = m1638e(c2454rb4);
                C1259cb c1259cb12 = c2454rb4.f8592M;
                if (c2454rb4.m4946z() && zM1638e3) {
                    C2497sb.m4979V(c2454rb4, c1496hb, new C0178E5());
                }
                if (c2454rb4.f8637p0[z3 ? 1 : 0] != 3 || zM1638e3) {
                    if (!c2454rb4.m4946z()) {
                        if (c1259cb11 == c1259cb12) {
                            int iM2384e5 = c1259cb11.m2384e() + iM2383d3;
                            if (c2454rb4.f8584E) {
                                int i7 = iM2384e5 - c2454rb4.f8607a0;
                                int i8 = c2454rb4.f8601V + i7;
                                c2454rb4.f8605Z = i7;
                                c2454rb4.f8589J.m2391l(i7);
                                c2454rb4.f8591L.m2391l(i8);
                                c1259cb12.m2391l(iM2384e5);
                                z = z3 ? 1 : 0;
                                c2454rb4.f8628l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            m1633K(i6, c1496hb, c2454rb4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        c2454rb.f8632n = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1634M(Context context, Executor executor, InterfaceC0080Bu interfaceC0080Bu, boolean z) {
        boolean z2;
        ?? M98a;
        C0192Ed[] c0192EdArrM2707g0;
        C0192Ed[] c0192EdArr;
        C0192Ed[] c0192EdArr2;
        byte[] bArr;
        ?? r7;
        boolean z3;
        Throwable th;
        Throwable th2;
        ?? r72;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r73;
        C0063Bd c0063Bd;
        ?? r74;
        String str;
        FileInputStream fileInputStreamM98a;
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
                                interfaceC0080Bu.mo131b(2, null);
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
                        context.getPackageName();
                        AbstractC0166Du.m315c(context, false);
                        return;
                    }
                }
            }
            context.getPackageName();
            byte[] bArr2 = AbstractC1406fG.f4986e;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0063Bd c0063Bd2 = new C0063Bd(assets, executor, interfaceC0080Bu, name, file2);
            byte[] bArr3 = c0063Bd2.f148c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c0063Bd2.m99b(4, null);
                    }
                    c0063Bd2.f151f = true;
                    try {
                        M98a = c0063Bd2.m98a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC0080Bu.mo131b(6, e);
                        M98a = 0;
                    } catch (IOException e2) {
                        interfaceC0080Bu.mo131b(7, e2);
                        M98a = 0;
                    }
                    try {
                        if (M98a != 0) {
                            try {
                            } catch (IOException e3) {
                                interfaceC0080Bu.mo131b(7, e3);
                                try {
                                    M98a.close();
                                } catch (IOException e4) {
                                    interfaceC0080Bu.mo131b(7, e4);
                                }
                                c0192EdArrM2707g0 = null;
                            } catch (IllegalStateException e5) {
                                interfaceC0080Bu.mo131b(8, e5);
                                M98a.close();
                                c0192EdArrM2707g0 = null;
                            }
                            if (!Arrays.equals(bArr2, AbstractC1406fG.m2701a0(M98a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0192EdArrM2707g0 = AbstractC1406fG.m2707g0(M98a, AbstractC1406fG.m2701a0(M98a, 4), c0063Bd2.f150e);
                            try {
                                M98a.close();
                            } catch (IOException e6) {
                                interfaceC0080Bu.mo131b(7, e6);
                            }
                            c0063Bd2.f152g = c0192EdArrM2707g0;
                        }
                        c0192EdArr = c0063Bd2.f152g;
                        if (c0192EdArr != null && (M98a = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM98a = c0063Bd2.m98a(assets, "dexopt/baseline.profm");
                                r74 = str;
                            } catch (FileNotFoundException e7) {
                                interfaceC0080Bu.mo131b(9, e7);
                                r74 = M98a;
                            } catch (IOException e8) {
                                interfaceC0080Bu.mo131b(7, e8);
                                r74 = M98a;
                            } catch (IllegalStateException e9) {
                                c0063Bd2.f152g = null;
                                interfaceC0080Bu.mo131b(8, e9);
                                r74 = M98a;
                            }
                            if (fileInputStreamM98a == null) {
                                try {
                                    if (!Arrays.equals(AbstractC1406fG.f4987f, AbstractC1406fG.m2701a0(fileInputStreamM98a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM2701a0 = AbstractC1406fG.m2701a0(fileInputStreamM98a, 4);
                                    c0063Bd2.f152g = AbstractC1406fG.m2704d0(fileInputStreamM98a, bArrM2701a0, bArr3, c0192EdArr);
                                    fileInputStreamM98a.close();
                                    c0063Bd = c0063Bd2;
                                    M98a = bArrM2701a0;
                                    if (c0063Bd != null) {
                                        c0063Bd2 = c0063Bd;
                                    }
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM98a != null) {
                                    fileInputStreamM98a.close();
                                    r74 = str;
                                }
                                c0063Bd = null;
                                M98a = r74;
                                if (c0063Bd != null) {
                                }
                            }
                        }
                        InterfaceC0080Bu interfaceC0080Bu2 = c0063Bd2.f147b;
                        c0192EdArr2 = c0063Bd2.f152g;
                        byte[] bArr4 = c0063Bd2.f148c;
                        ?? r76 = M98a;
                        r76 = M98a;
                        if (c0192EdArr2 != null && bArr4 != null) {
                            byteArrayOutputStream = c0063Bd2.f151f;
                            if (byteArrayOutputStream != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e10) {
                                interfaceC0080Bu2.mo131b(7, e10);
                                r73 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                interfaceC0080Bu2.mo131b(8, e11);
                                r73 = byteArrayOutputStream;
                            }
                            if (AbstractC1406fG.m2720t0(byteArrayOutputStream, bArr4, c0192EdArr2)) {
                                c0063Bd2.f153h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r73 = byteArrayOutputStream;
                                c0063Bd2.f152g = null;
                                r76 = r73;
                            } else {
                                interfaceC0080Bu2.mo131b(5, null);
                                c0063Bd2.f152g = null;
                                byteArrayOutputStream.close();
                                r76 = byteArrayOutputStream;
                            }
                        }
                        bArr = c0063Bd2.f153h;
                        if (bArr != null) {
                            z3 = false;
                            r72 = 1;
                        } else {
                            try {
                                if (!c0063Bd2.f151f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c0063Bd2.f149d);
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
                                                                                c0063Bd2.m99b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0063Bd2.f153h = null;
                                                                                c0063Bd2.f152g = null;
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
                                        c0063Bd2.m99b(6, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
                                    } catch (IOException e13) {
                                        e = e13;
                                        c0063Bd2.m99b(7, e);
                                        r7 = r76;
                                        z3 = false;
                                        r72 = r7;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        r75 = r72;
                                        AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r76 = 1;
                                    c0063Bd2.m99b(6, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
                                } catch (IOException e15) {
                                    e = e15;
                                    r76 = 1;
                                    c0063Bd2.m99b(7, e);
                                    r7 = r76;
                                    z3 = false;
                                    r72 = r7;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    r75 = r72;
                                    AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
                                }
                            } finally {
                                c0063Bd2.f153h = null;
                                c0063Bd2.f152g = null;
                            }
                        }
                        if (z3) {
                            m1653w(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r75 = r72;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c0063Bd2.m99b(4, null);
                        }
                        c0063Bd2.f151f = true;
                        M98a = c0063Bd2.m98a(assets, "dexopt/baseline.prof");
                        if (M98a != 0) {
                        }
                        c0192EdArr = c0063Bd2.f152g;
                        if (c0192EdArr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamM98a = c0063Bd2.m98a(assets, "dexopt/baseline.profm");
                            r74 = str;
                            if (fileInputStreamM98a == null) {
                            }
                        }
                        InterfaceC0080Bu interfaceC0080Bu22 = c0063Bd2.f147b;
                        c0192EdArr2 = c0063Bd2.f152g;
                        byte[] bArr42 = c0063Bd2.f148c;
                        ?? r762 = M98a;
                        r762 = M98a;
                        if (c0192EdArr2 != null) {
                            byteArrayOutputStream = c0063Bd2.f151f;
                            if (byteArrayOutputStream != 0) {
                            }
                        }
                        bArr = c0063Bd2.f153h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                        r75 = r72;
                    } catch (IOException unused2) {
                        z2 = true;
                        c0063Bd2.m99b(4, null);
                    }
                }
                AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
            }
            c0063Bd2.m99b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r75 = z2;
            AbstractC0166Du.m315c(context, (z4 || !z) ? 0 : r75);
        } catch (PackageManager.NameNotFoundException e16) {
            interfaceC0080Bu.mo131b(7, e16);
            AbstractC0166Du.m315c(context, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C2473ru m1635b(String str, AbstractC2293nu abstractC2293nu) {
        if (AbstractC2564tz.m5059T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C2426qq) AbstractC2645vu.f9157a.values()).iterator();
        while (((AbstractC2289nq) it).hasNext()) {
            InterfaceC0717Qm interfaceC0717Qm = (InterfaceC0717Qm) ((C2203lq) it).next();
            if (str.equals(interfaceC0717Qm.getDescriptor().mo203b())) {
                throw new IllegalArgumentException(AbstractC2607uz.m5118D("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + AbstractC0425Jv.m881a(interfaceC0717Qm.getClass()).m445b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        return new C2473ru(str, abstractC2293nu);
    }

    /* JADX INFO: renamed from: c */
    public static void m1636c(int i, Object obj) {
        if (obj != null) {
            if (obj instanceof Function) {
                if ((obj instanceof InterfaceC2325oj ? ((InterfaceC2325oj) obj).mo122b() : obj instanceof InterfaceC0884Ui ? 0 : obj instanceof InterfaceC1416fj ? 1 : obj instanceof Function2 ? 2 : obj instanceof C0373Im ? 3 : obj instanceof C1354e8 ? 4 : -1) == i) {
                    return;
                }
            }
            m1631I("kotlin.jvm.functions.Function" + i, obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C0212Ex m1637d(String str, AbstractC1406fG abstractC1406fG, InterfaceC0126Cx[] interfaceC0126CxArr, InterfaceC1416fj interfaceC1416fj) {
        if (AbstractC2564tz.m5059T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC1406fG.equals(C0128Cz.f298g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0268G9 c0268g9 = new C0268G9(str);
        interfaceC1416fj.mo90g(c0268g9);
        return new C0212Ex(str, abstractC1406fG, c0268g9.f860b.size(), AbstractC0650P4.m1316K(interfaceC0126CxArr), c0268g9);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1638e(C2454rb c2454rb) {
        int[] iArr = c2454rb.f8637p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C2454rb c2454rb2 = c2454rb.f8599T;
        C2497sb c2497sb = c2454rb2 != null ? (C2497sb) c2454rb2 : null;
        if (c2497sb != null) {
            int i3 = c2497sb.f8637p0[0];
        }
        if (c2497sb != null) {
            int i4 = c2497sb.f8637p0[1];
        }
        boolean z = i == 1 || c2454rb.mo4334A() || i == 2 || (i == 3 && c2454rb.f8639r == 0 && c2454rb.f8602W == 0.0f && c2454rb.m4940t(0)) || (i == 3 && c2454rb.f8639r == 1 && c2454rb.m4941u(0, c2454rb.m4937q()));
        boolean z2 = i2 == 1 || c2454rb.mo4335B() || i2 == 2 || (i2 == 3 && c2454rb.f8640s == 0 && c2454rb.f8602W == 0.0f && c2454rb.m4940t(1)) || (i2 == 3 && c2454rb.f8640s == 1 && c2454rb.m4941u(1, c2454rb.m4933k()));
        return (c2454rb.f8602W > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: f */
    public static int m1639f(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i2, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: g */
    public static long m1640g(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static String m1641h(AbstractC2744y6 abstractC2744y6) {
        StringBuilder sb = new StringBuilder(abstractC2744y6.size());
        for (int i = 0; i < abstractC2744y6.size(); i++) {
            byte bMo5220a = abstractC2744y6.mo5220a(i);
            if (bMo5220a == 34) {
                sb.append("\\\"");
            } else if (bMo5220a == 39) {
                sb.append("\\'");
            } else if (bMo5220a != 92) {
                switch (bMo5220a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case LuaJitConsts.LUA_TTHREAD /* 8 */:
                        sb.append("\\b");
                        break;
                    case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo5220a < 32 || bMo5220a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo5220a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo5220a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo5220a & 7) + 48));
                        } else {
                            sb.append((char) bMo5220a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static ColorStateList m1642i(Context context, C2656w4 c2656w4, int i) {
        int resourceId;
        ColorStateList colorStateListM622o;
        TypedArray typedArray = (TypedArray) c2656w4.f9196b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM622o = AbstractC0295Gu.m622o(context, resourceId)) == null) ? c2656w4.m5209p(i) : colorStateListM622o;
    }

    /* JADX INFO: renamed from: j */
    public static ColorStateList m1643j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM622o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM622o = AbstractC0295Gu.m622o(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM622o;
    }

    /* JADX INFO: renamed from: l */
    public static Drawable m1644l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM2695U;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM2695U = AbstractC1406fG.m2695U(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM2695U;
    }

    /* JADX INFO: renamed from: n */
    public static final int m1645n(InterfaceC0126Cx interfaceC0126Cx, AbstractC2242mm abstractC2242mm, String str) {
        C2379pm c2379pm = abstractC2242mm.f7922a;
        m1652v(interfaceC0126Cx, abstractC2242mm);
        int iMo202a = interfaceC0126Cx.mo202a(str);
        if (iMo202a != -3 || !abstractC2242mm.f7922a.f8377g) {
            return iMo202a;
        }
        C0132D2 c0132d2 = abstractC2242mm.f7924c;
        C1389f c1389f = new C1389f(5, interfaceC0126Cx, abstractC2242mm);
        Map map = (Map) ((ConcurrentHashMap) c0132d2.f328b).get(interfaceC0126Cx);
        C2220m6 c2220m6 = f2610b;
        Object obj = map != null ? map.get(c2220m6) : null;
        Object objMo6a = obj != null ? obj : null;
        if (objMo6a == null) {
            objMo6a = c1389f.mo6a();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0132d2.f328b;
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC0126Cx);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC0126Cx, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c2220m6, objMo6a);
        }
        Integer num = (Integer) ((Map) objMo6a).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m1646o(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static void m1647p(String str, InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int i = AbstractC1450gG.f5067a;
        new C2428qs(11, AbstractC1406fG.m2718r0(str)).m4870f(interfaceC1416fj);
    }

    /* JADX INFO: renamed from: q */
    public static void m1648q(int i, C1496hb c1496hb, C2454rb c2454rb, boolean z) {
        C1259cb c1259cb;
        C1259cb c1259cb2;
        boolean z2;
        C1259cb c1259cb3;
        C1259cb c1259cb4;
        if (c2454rb.f8630m) {
            return;
        }
        if (!(c2454rb instanceof C2497sb) && c2454rb.m4946z() && m1638e(c2454rb)) {
            C2497sb.m4979V(c2454rb, c1496hb, new C0178E5());
        }
        C1259cb c1259cbMo4340i = c2454rb.mo4340i(2);
        C1259cb c1259cbMo4340i2 = c2454rb.mo4340i(4);
        int iM2383d = c1259cbMo4340i.m2383d();
        int iM2383d2 = c1259cbMo4340i2.m2383d();
        HashSet<C1259cb> hashSet = c1259cbMo4340i.f4265a;
        if (hashSet != null && c1259cbMo4340i.f4267c) {
            for (C1259cb c1259cb5 : hashSet) {
                C2454rb c2454rb2 = c1259cb5.f4268d;
                int i2 = i + 1;
                boolean zM1638e = m1638e(c2454rb2);
                C1259cb c1259cb6 = c2454rb2.f8588I;
                C1259cb c1259cb7 = c2454rb2.f8590K;
                if (c2454rb2.m4946z() && zM1638e) {
                    z2 = true;
                    C2497sb.m4979V(c2454rb2, c1496hb, new C0178E5());
                } else {
                    z2 = true;
                }
                boolean z3 = ((c1259cb5 == c1259cb6 && (c1259cb4 = c1259cb7.f4270f) != null && c1259cb4.f4267c) || (c1259cb5 == c1259cb7 && (c1259cb3 = c1259cb6.f4270f) != null && c1259cb3.f4267c)) ? z2 : false;
                int i3 = c2454rb2.f8637p0[0];
                if (i3 != 3 || zM1638e) {
                    if (!c2454rb2.m4946z()) {
                        if (c1259cb5 == c1259cb6 && c1259cb7.f4270f == null) {
                            int iM2384e = c1259cb6.m2384e() + iM2383d;
                            c2454rb2.m4919J(iM2384e, c2454rb2.m4937q() + iM2384e);
                            m1648q(i2, c1496hb, c2454rb2, z);
                        } else if (c1259cb5 == c1259cb7 && c1259cb6.f4270f == null) {
                            int iM2384e2 = iM2383d - c1259cb7.m2384e();
                            c2454rb2.m4919J(iM2384e2 - c2454rb2.m4937q(), iM2384e2);
                            m1648q(i2, c1496hb, c2454rb2, z);
                        } else if (z3 && !c2454rb2.m4944x()) {
                            m1626D(i2, c1496hb, c2454rb2, z);
                        }
                    }
                } else if (i3 == 3 && c2454rb2.f8643v >= 0 && c2454rb2.f8642u >= 0 && (c2454rb2.f8619g0 == 8 || (c2454rb2.f8639r == 0 && c2454rb2.f8602W == 0.0f))) {
                    if (!c2454rb2.m4944x() && !c2454rb2.f8585F && z3 && !c2454rb2.m4944x()) {
                        m1627E(i2, c2454rb, c1496hb, c2454rb2, z);
                    }
                }
            }
        }
        if (c2454rb instanceof C2150kk) {
            return;
        }
        HashSet<C1259cb> hashSet2 = c1259cbMo4340i2.f4265a;
        if (hashSet2 != null && c1259cbMo4340i2.f4267c) {
            for (C1259cb c1259cb8 : hashSet2) {
                C2454rb c2454rb3 = c1259cb8.f4268d;
                int i4 = i + 1;
                boolean zM1638e2 = m1638e(c2454rb3);
                C1259cb c1259cb9 = c2454rb3.f8588I;
                C1259cb c1259cb10 = c2454rb3.f8590K;
                if (c2454rb3.m4946z() && zM1638e2) {
                    C2497sb.m4979V(c2454rb3, c1496hb, new C0178E5());
                }
                boolean z4 = (c1259cb8 == c1259cb9 && (c1259cb2 = c1259cb10.f4270f) != null && c1259cb2.f4267c) || (c1259cb8 == c1259cb10 && (c1259cb = c1259cb9.f4270f) != null && c1259cb.f4267c);
                int i5 = c2454rb3.f8637p0[0];
                if (i5 != 3 || zM1638e2) {
                    if (!c2454rb3.m4946z()) {
                        if (c1259cb8 == c1259cb9 && c1259cb10.f4270f == null) {
                            int iM2384e3 = c1259cb9.m2384e() + iM2383d2;
                            c2454rb3.m4919J(iM2384e3, c2454rb3.m4937q() + iM2384e3);
                            m1648q(i4, c1496hb, c2454rb3, z);
                        } else if (c1259cb8 == c1259cb10 && c1259cb9.f4270f == null) {
                            int iM2384e4 = iM2383d2 - c1259cb10.m2384e();
                            c2454rb3.m4919J(iM2384e4 - c2454rb3.m4937q(), iM2384e4);
                            m1648q(i4, c1496hb, c2454rb3, z);
                        } else if (z4 && !c2454rb3.m4944x()) {
                            m1626D(i4, c1496hb, c2454rb3, z);
                        }
                    }
                } else if (i5 == 3 && c2454rb3.f8643v >= 0 && c2454rb3.f8642u >= 0) {
                    if (c2454rb3.f8619g0 == 8 || (c2454rb3.f8639r == 0 && c2454rb3.f8602W == 0.0f)) {
                        if (!c2454rb3.m4944x() && !c2454rb3.f8585F && z4 && !c2454rb3.m4944x()) {
                            m1627E(i4, c2454rb, c1496hb, c2454rb3, z);
                        }
                    }
                }
            }
        }
        c2454rb.f8630m = true;
    }

    /* JADX INFO: renamed from: r */
    public static final void m1649r(C0523M6 c0523m6, C0394J6 c0394j6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0523M6.f1708g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0523m6);
            if (obj instanceof C0388J0) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0523m6, obj, c0394j6)) {
                    if (atomicReferenceFieldUpdater.get(c0523m6) != obj) {
                        break;
                    }
                }
                return;
            }
            Throwable th = null;
            if (obj instanceof C0394J6) {
                C0523M6.m1008o(c0394j6, obj);
                throw null;
            }
            if (obj instanceof C0189Ea) {
                C0189Ea c0189Ea = (C0189Ea) obj;
                if (!C0189Ea.f574b.compareAndSet(c0189Ea, 0, 1)) {
                    C0523M6.m1008o(c0394j6, obj);
                    throw null;
                }
                if (obj instanceof C0652P6) {
                    c0523m6.m1016j(c0394j6, c0189Ea.f575a);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0103Ca)) {
                C0103Ca c0103Ca = new C0103Ca(obj, c0394j6, th, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(c0523m6, obj, c0103Ca)) {
                    if (atomicReferenceFieldUpdater.get(c0523m6) != obj) {
                        break;
                    }
                }
                return;
            }
            C0103Ca c0103Ca2 = (C0103Ca) obj;
            if (c0103Ca2.f244b != null) {
                C0523M6.m1008o(c0394j6, obj);
                throw null;
            }
            Throwable th2 = c0103Ca2.f247e;
            if (th2 != null) {
                c0523m6.m1016j(c0394j6, th2);
                return;
            }
            C0103Ca c0103CaM151a = C0103Ca.m151a(c0103Ca2, c0394j6, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0523m6, obj, c0103CaM151a)) {
                if (atomicReferenceFieldUpdater.get(c0523m6) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1650t(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: u */
    public static Typeface m1651u(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0585Nj.m1137e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: v */
    public static final void m1652v(InterfaceC0126Cx interfaceC0126Cx, AbstractC2242mm abstractC2242mm) {
        if (AbstractC0585Nj.m1134a(interfaceC0126Cx.mo204c(), C0128Cz.f298g)) {
            C2379pm c2379pm = abstractC2242mm.f7922a;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1653w(PackageInfo packageInfo, File file) {
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

    /* JADX INFO: renamed from: x */
    public static void m1654x(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo101B(boolean z);

    /* JADX INFO: renamed from: C */
    public abstract void mo102C(boolean z);

    /* JADX INFO: renamed from: L */
    public abstract TransformationMethod mo103L(TransformationMethod transformationMethod);

    /* JADX INFO: renamed from: k */
    public abstract void mo1382k(C1195ay c1195ay, float f, float f2);

    /* JADX INFO: renamed from: m */
    public abstract InputFilter[] mo104m(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: s */
    public abstract boolean mo105s();

    /* JADX INFO: renamed from: y */
    public abstract View mo852y(int i);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo853z();
}
