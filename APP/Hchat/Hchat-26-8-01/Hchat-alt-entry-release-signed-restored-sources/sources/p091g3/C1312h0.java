package p091g3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p018b3.C0171a;
import p030c3.AbstractC0390a;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;

/* JADX INFO: renamed from: g3.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1312h0 extends C1324n0 {

    /* JADX INFO: renamed from: i */
    public static boolean f4371i = false;

    /* JADX INFO: renamed from: j */
    public static Method f4372j;

    /* JADX INFO: renamed from: k */
    public static Class f4373k;

    /* JADX INFO: renamed from: l */
    public static Field f4374l;

    /* JADX INFO: renamed from: m */
    public static Field f4375m;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f4376c;

    /* JADX INFO: renamed from: d */
    public C0171a[] f4377d;

    /* JADX INFO: renamed from: e */
    public C0171a f4378e;

    /* JADX INFO: renamed from: f */
    public C1332r0 f4379f;

    /* JADX INFO: renamed from: g */
    public C0171a f4380g;

    /* JADX INFO: renamed from: h */
    public int f4381h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1312h0(C1332r0 c1332r0, C1312h0 c1312h0) {
        this(c1332r0, new WindowInsets(c1312h0.f4376c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private static void m3493B() {
        try {
            f4372j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4373k = cls;
            f4374l = cls.getDeclaredField("mVisibleInsets");
            f4375m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4374l.setAccessible(true);
            f4375m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f4371i = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m3494C(int i9, int i10) {
        return (i9 & 6) == (i10 & 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    private C0171a m3495w(int i9, boolean z9) {
        C0171a c0171aM765a = C0171a.f444e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                c0171aM765a = C0171a.m765a(c0171aM765a, m3511x(i10, z9));
            }
        }
        return c0171aM765a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    private C0171a m3496y() {
        C1332r0 c1332r0 = this.f4379f;
        return c1332r0 != null ? c1332r0.f4398a.mo3514j() : C0171a.f444e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    private C0171a m3497z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2104o.m5297w("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f4371i) {
            m3493B();
        }
        Method method = f4372j;
        if (method != null && f4373k != null && f4374l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4374l.get(f4375m.get(objInvoke));
                if (rect != null) {
                    return C0171a.m766b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public boolean m3498A(int i9) {
        if (i9 != 1 && i9 != 2) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 8 && i9 != 128) {
                return true;
            }
        }
        return !m3511x(i9, false).equals(C0171a.f444e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: d */
    public void mo3499d(View view) {
        C0171a c0171aM3497z = m3497z(view);
        if (c0171aM3497z == null) {
            c0171aM3497z = C0171a.f444e;
        }
        mo3508s(c0171aM3497z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: e */
    public void mo3500e(C1332r0 c1332r0) {
        c1332r0.f4398a.mo3509t(this.f4379f);
        C0171a c0171a = this.f4380g;
        C1324n0 c1324n0 = c1332r0.f4398a;
        c1324n0.mo3508s(c0171a);
        c1324n0.mo3510v(this.f4381h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C1312h0 c1312h0 = (C1312h0) obj;
        return Objects.equals(this.f4380g, c1312h0.f4380g) && m3494C(this.f4381h, c1312h0.f4381h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: g */
    public C0171a mo3501g(int i9) {
        return m3495w(i9, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: h */
    public C0171a mo3502h(int i9) {
        return m3495w(i9, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: l */
    public final C0171a mo3503l() {
        if (this.f4378e == null) {
            WindowInsets windowInsets = this.f4376c;
            this.f4378e = C0171a.m766b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4378e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: n */
    public C1332r0 mo3504n(int i9, int i10, int i11, int i12) {
        C1332r0 c1332r0M3558c = C1332r0.m3558c(this.f4376c, null);
        int i13 = Build.VERSION.SDK_INT;
        AbstractC1310g0 c1308f0 = i13 >= 34 ? new C1308f0(c1332r0M3558c) : i13 >= 30 ? new C1306e0(c1332r0M3558c) : i13 >= 29 ? new C1304d0(c1332r0M3558c) : new C1302c0(c1332r0M3558c);
        c1308f0.mo3455g(C1332r0.m3557a(mo3503l(), i9, i10, i11, i12));
        c1308f0.mo3454e(C1332r0.m3557a(mo3514j(), i9, i10, i11, i12));
        return c1308f0.mo3453b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: p */
    public boolean mo3505p() {
        return this.f4376c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: q */
    public boolean mo3506q(int i9) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0 && !m3498A(i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: r */
    public void mo3507r(C0171a[] c0171aArr) {
        this.f4377d = c0171aArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: s */
    public void mo3508s(C0171a c0171a) {
        this.f4380g = c0171a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: t */
    public void mo3509t(C1332r0 c1332r0) {
        this.f4379f = c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.C1324n0
    /* JADX INFO: renamed from: v */
    public void mo3510v(int i9) {
        this.f4381h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public C0171a m3511x(int i9, boolean z9) {
        C0171a c0171aMo3514j;
        int i10;
        C0171a c0171a = C0171a.f444e;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 8) {
                    C0171a[] c0171aArr = this.f4377d;
                    c0171aMo3514j = c0171aArr != null ? c0171aArr[AbstractC1184v0.m3213w(8)] : null;
                    if (c0171aMo3514j != null) {
                        return c0171aMo3514j;
                    }
                    C0171a c0171aMo3503l = mo3503l();
                    C0171a c0171aM3496y = m3496y();
                    int i11 = c0171aMo3503l.f448d;
                    if (i11 > c0171aM3496y.f448d) {
                        return C0171a.m766b(0, 0, 0, i11);
                    }
                    C0171a c0171a2 = this.f4380g;
                    if (c0171a2 != null && !c0171a2.equals(c0171a) && (i10 = this.f4380g.f448d) > c0171aM3496y.f448d) {
                        return C0171a.m766b(0, 0, 0, i10);
                    }
                } else {
                    if (i9 == 16) {
                        return mo3521k();
                    }
                    if (i9 == 32) {
                        return mo3520i();
                    }
                    if (i9 == 64) {
                        return mo3522m();
                    }
                    if (i9 == 128) {
                        C1332r0 c1332r0 = this.f4379f;
                        C1303d c1303dMo3518f = c1332r0 != null ? c1332r0.f4398a.mo3518f() : mo3518f();
                        if (c1303dMo3518f != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return C0171a.m766b(i12 >= 28 ? AbstractC0390a.m1358e(c1303dMo3518f.f4362a) : 0, i12 >= 28 ? AbstractC0390a.m1360g(c1303dMo3518f.f4362a) : 0, i12 >= 28 ? AbstractC0390a.m1359f(c1303dMo3518f.f4362a) : 0, i12 >= 28 ? AbstractC0390a.m1357d(c1303dMo3518f.f4362a) : 0);
                        }
                    }
                }
            } else {
                if (z9) {
                    C0171a c0171aM3496y2 = m3496y();
                    C0171a c0171aMo3514j2 = mo3514j();
                    return C0171a.m766b(Math.max(c0171aM3496y2.f445a, c0171aMo3514j2.f445a), 0, Math.max(c0171aM3496y2.f447c, c0171aMo3514j2.f447c), Math.max(c0171aM3496y2.f448d, c0171aMo3514j2.f448d));
                }
                if ((this.f4381h & 2) == 0) {
                    C0171a c0171aMo3503l2 = mo3503l();
                    C1332r0 c1332r02 = this.f4379f;
                    c0171aMo3514j = c1332r02 != null ? c1332r02.f4398a.mo3514j() : null;
                    int iMin = c0171aMo3503l2.f448d;
                    if (c0171aMo3514j != null) {
                        iMin = Math.min(iMin, c0171aMo3514j.f448d);
                    }
                    return C0171a.m766b(c0171aMo3503l2.f445a, 0, c0171aMo3503l2.f447c, iMin);
                }
            }
        } else {
            if (z9) {
                return C0171a.m766b(0, Math.max(m3496y().f446b, mo3503l().f446b), 0, 0);
            }
            if ((this.f4381h & 4) == 0) {
                return C0171a.m766b(0, mo3503l().f446b, 0, 0);
            }
        }
        return c0171a;
    }

    public C1312h0(C1332r0 c1332r0, WindowInsets windowInsets) {
        super(c1332r0);
        this.f4378e = null;
        this.f4376c = windowInsets;
    }
}
