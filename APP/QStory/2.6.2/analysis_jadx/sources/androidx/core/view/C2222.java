package androidx.core.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p164.C7664;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2222 extends C2238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean f6499 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Field f6500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Field f6501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method f6502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Class f6503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2225 f6504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C7664 f6505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7664[] f6506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final WindowInsets f6507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Rect[][] f6508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7664 f6510;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f6511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect[][] f6512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2259 f6513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f6514;

    public C2222(C2225 c2225, WindowInsets windowInsets) {
        super(c2225);
        this.f6505 = null;
        this.f6512 = new Rect[10][];
        this.f6508 = new Rect[10][];
        this.f6507 = windowInsets;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    private static void m4015() {
        try {
            f6502 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6503 = cls;
            f6500 = cls.getDeclaredField("mVisibleInsets");
            f6501 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6500.setAccessible(true);
            f6501.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6499 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m4016(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    private C2259 m4017(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f6531.f6520.mo4032()) {
            return C2259.m4204(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2202 c2202M4218 = AbstractC2267.m4218(display, 0);
        C2202 c2202M42182 = AbstractC2267.m4218(display, 1);
        C2202 c2202M42183 = AbstractC2267.m4218(display, 2);
        C2202 c2202M42184 = AbstractC2267.m4218(display, 3);
        return C2259.m4204(point.x, point.y, false, c2202M4218 != null ? c2202M4218.f6480 : 0, c2202M42182 != null ? c2202M42182.f6480 : 0, c2202M42183 != null ? c2202M42183.f6480 : 0, c2202M42184 != null ? c2202M42184.f6480 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    private C7664 m4018(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C5919.m11247("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f6499) {
            m4015();
        }
        Method method = f6502;
        if (method != null && f6503 != null && f6500 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6500.get(f6501.get(objInvoke));
                if (rect != null) {
                    return C7664.m12910(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    private C7664 m4019() {
        C2225 c2225 = this.f6504;
        return c2225 != null ? c2225.f6520.mo4010() : C7664.f20811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    private C7664 m4020(int i, boolean z) {
        C7664 c7664M12912 = C7664.f20811;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c7664M12912 = C7664.m12912(c7664M12912, m4028(i2, z));
            }
        }
        return c7664M12912;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    private Rect[] m4021(C7664 c7664) {
        ArrayList arrayList = new ArrayList();
        int i = c7664.f20815;
        int i2 = c7664.f20812;
        int i3 = c7664.f20813;
        int i4 = c7664.f20814;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c7664.f20815, this.f6514));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f6511, i4));
        }
        if (i3 != 0) {
            int i5 = this.f6511;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f6514));
        }
        if (i2 != 0) {
            int i6 = this.f6514;
            arrayList.add(new Rect(0, i6 - i2, this.f6511, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    private static List<Rect> m4022(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2267.m4221(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    @Override // androidx.core.view.C2238
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C2222 c2222 = (C2222) obj;
        return Objects.equals(this.f6510, c2222.f6510) && m4016(this.f6509, c2222.f6509);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean m4023(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m4028(i, false).equals(C7664.f20811);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo4024(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6508 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo4025(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6512 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void mo4026(int i) {
        this.f6509 = i;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4027(C2225 c2225) {
        this.f6504 = c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C7664 m4028(int i, boolean z) {
        C7664 c7664Mo4010;
        int i2;
        C7664 c7664 = C7664.f20811;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C7664[] c7664Arr = this.f6506;
                    c7664Mo4010 = c7664Arr != null ? c7664Arr[AbstractC2267.m4221(8)] : null;
                    if (c7664Mo4010 != null) {
                        return c7664Mo4010;
                    }
                    C7664 c7664Mo4037 = mo4037();
                    C7664 c7664M4019 = m4019();
                    int i3 = c7664Mo4037.f20812;
                    if (i3 > c7664M4019.f20812) {
                        return C7664.m12910(0, 0, 0, i3);
                    }
                    C7664 c76642 = this.f6510;
                    if (c76642 != null && !c76642.equals(c7664) && (i2 = this.f6510.f20812) > c7664M4019.f20812) {
                        return C7664.m12910(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo4124();
                    }
                    if (i == 32) {
                        return mo4126();
                    }
                    if (i == 64) {
                        return mo4125();
                    }
                    if (i == 128) {
                        C2225 c2225 = this.f6504;
                        C2254 c2254Mo4012 = c2225 != null ? c2225.f6520.mo4012() : mo4012();
                        if (c2254Mo4012 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C7664.m12910(i4 >= 28 ? AbstractC2262.m4208(c2254Mo4012.f6560) : 0, i4 >= 28 ? AbstractC2262.m4206(c2254Mo4012.f6560) : 0, i4 >= 28 ? AbstractC2262.m4207(c2254Mo4012.f6560) : 0, i4 >= 28 ? AbstractC2262.m4209(c2254Mo4012.f6560) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C7664 c7664M40192 = m4019();
                    C7664 c7664Mo40102 = mo4010();
                    return C7664.m12910(Math.max(c7664M40192.f20815, c7664Mo40102.f20815), 0, Math.max(c7664M40192.f20813, c7664Mo40102.f20813), Math.max(c7664M40192.f20812, c7664Mo40102.f20812));
                }
                if ((this.f6509 & 2) == 0) {
                    C7664 c7664Mo40372 = mo4037();
                    C2225 c22252 = this.f6504;
                    c7664Mo4010 = c22252 != null ? c22252.f6520.mo4010() : null;
                    int iMin = c7664Mo40372.f20812;
                    if (c7664Mo4010 != null) {
                        iMin = Math.min(iMin, c7664Mo4010.f20812);
                    }
                    return C7664.m12910(c7664Mo40372.f20815, 0, c7664Mo40372.f20813, iMin);
                }
            }
        } else {
            if (z) {
                return C7664.m12910(0, Math.max(m4019().f20814, mo4037().f20814), 0, 0);
            }
            if ((this.f6509 & 4) == 0) {
                return C7664.m12910(0, mo4037().f20814, 0, 0);
            }
        }
        return c7664;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List<Rect> mo4029(int i) {
        return m4022(this.f6512, i);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4030(C2225 c2225) {
        c2225.f6520.mo4027(this.f6504);
        C7664 c7664 = this.f6510;
        C2238 c2238 = c2225.f6520;
        c2238.mo4034(c7664);
        c2238.mo4026(this.f6509);
        c2238.mo4036(this.f6513);
        c2238.mo4025(this.f6512);
        c2238.mo4024(this.f6508);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4031(View view) {
        this.f6511 = view.getWidth();
        this.f6514 = view.getHeight();
        C7664 c7664M4018 = m4018(view);
        if (c7664M4018 == null) {
            c7664M4018 = C7664.f20811;
        }
        mo4034(c7664M4018);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean mo4032() {
        return this.f6507.isRound();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo4033(C7664[] c7664Arr) {
        this.f6506 = c7664Arr;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo4034(C7664 c7664) {
        this.f6510 = c7664;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean mo4035(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m4023(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo4036(C2259 c2259) {
        this.f6513 = c2259;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7664 mo4037() {
        if (this.f6505 == null) {
            WindowInsets windowInsets = this.f6507;
            this.f6505 = C7664.m12910(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6505;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4038() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4221 = AbstractC2267.m4221(i);
            this.f6512[iM4221] = m4021(mo4042(i));
            if (i != 8) {
                this.f6508[iM4221] = m4021(mo4043(i));
            }
        }
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2225 mo4039(int i, int i2, int i3, int i4) {
        C2225 c2225M4053 = C2225.m4053(null, this.f6507);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC2223 c2220 = i5 >= 36 ? new C2220(c2225M4053) : i5 >= 35 ? new C2221(c2225M4053) : i5 >= 34 ? new C2233(c2225M4053) : i5 >= 31 ? new C2232(c2225M4053) : i5 >= 30 ? new C2235(c2225M4053) : i5 >= 29 ? new C2234(c2225M4053) : new C2231(c2225M4053);
        c2220.mo4048(C2225.m4052(mo4037(), i, i2, i3, i4));
        c2220.mo4044(C2225.m4052(mo4010(), i, i2, i3, i4));
        return c2220.mo4046();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4040(View view) {
        this.f6513 = m4017(view);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List<Rect> mo4041(int i) {
        return m4022(this.f6508, i);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7664 mo4042(int i) {
        return m4020(i, false);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C7664 mo4043(int i) {
        return m4020(i, true);
    }

    public C2222(C2225 c2225, C2222 c2222) {
        this(c2225, new WindowInsets(c2222.f6507));
    }
}
