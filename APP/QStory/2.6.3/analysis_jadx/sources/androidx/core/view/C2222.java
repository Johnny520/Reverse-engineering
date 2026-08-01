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
import p164.C7665;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2222 extends C2238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean f6500 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Field f6501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Field f6502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method f6503;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Class f6504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2225 f6505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C7665 f6506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7665[] f6507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final WindowInsets f6508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Rect[][] f6509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6510;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7665 f6511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f6512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect[][] f6513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2259 f6514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f6515;

    public C2222(C2225 c2225, WindowInsets windowInsets) {
        super(c2225);
        this.f6506 = null;
        this.f6513 = new Rect[10][];
        this.f6509 = new Rect[10][];
        this.f6508 = windowInsets;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    private static void m4025() {
        try {
            f6503 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6504 = cls;
            f6501 = cls.getDeclaredField("mVisibleInsets");
            f6502 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6501.setAccessible(true);
            f6502.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6500 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m4026(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    private C2259 m4027(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f6532.f6521.mo4042()) {
            return C2259.m4214(point.x, point.y, true, 0, 0, 0, 0);
        }
        C2202 c2202M4228 = AbstractC2267.m4228(display, 0);
        C2202 c2202M42282 = AbstractC2267.m4228(display, 1);
        C2202 c2202M42283 = AbstractC2267.m4228(display, 2);
        C2202 c2202M42284 = AbstractC2267.m4228(display, 3);
        return C2259.m4214(point.x, point.y, false, c2202M4228 != null ? c2202M4228.f6481 : 0, c2202M42282 != null ? c2202M42282.f6481 : 0, c2202M42283 != null ? c2202M42283.f6481 : 0, c2202M42284 != null ? c2202M42284.f6481 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    private C7665 m4028(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C5925.m11308("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f6500) {
            m4025();
        }
        Method method = f6503;
        if (method != null && f6504 != null && f6501 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6501.get(f6502.get(objInvoke));
                if (rect != null) {
                    return C7665.m12939(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    private C7665 m4029() {
        C2225 c2225 = this.f6505;
        return c2225 != null ? c2225.f6521.mo4020() : C7665.f20806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    private C7665 m4030(int i, boolean z) {
        C7665 c7665M12941 = C7665.f20806;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c7665M12941 = C7665.m12941(c7665M12941, m4038(i2, z));
            }
        }
        return c7665M12941;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    private Rect[] m4031(C7665 c7665) {
        ArrayList arrayList = new ArrayList();
        int i = c7665.f20810;
        int i2 = c7665.f20807;
        int i3 = c7665.f20808;
        int i4 = c7665.f20809;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c7665.f20810, this.f6515));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f6512, i4));
        }
        if (i3 != 0) {
            int i5 = this.f6512;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f6515));
        }
        if (i2 != 0) {
            int i6 = this.f6515;
            arrayList.add(new Rect(0, i6 - i2, this.f6512, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    private static List<Rect> m4032(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC2267.m4231(i2)]) != null) {
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
        return Objects.equals(this.f6511, c2222.f6511) && m4026(this.f6510, c2222.f6510);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean m4033(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m4038(i, false).equals(C7665.f20806);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo4034(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6509 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo4035(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6513 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void mo4036(int i) {
        this.f6510 = i;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4037(C2225 c2225) {
        this.f6505 = c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C7665 m4038(int i, boolean z) {
        C7665 c7665Mo4020;
        int i2;
        C7665 c7665 = C7665.f20806;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C7665[] c7665Arr = this.f6507;
                    c7665Mo4020 = c7665Arr != null ? c7665Arr[AbstractC2267.m4231(8)] : null;
                    if (c7665Mo4020 != null) {
                        return c7665Mo4020;
                    }
                    C7665 c7665Mo4047 = mo4047();
                    C7665 c7665M4029 = m4029();
                    int i3 = c7665Mo4047.f20807;
                    if (i3 > c7665M4029.f20807) {
                        return C7665.m12939(0, 0, 0, i3);
                    }
                    C7665 c76652 = this.f6511;
                    if (c76652 != null && !c76652.equals(c7665) && (i2 = this.f6511.f20807) > c7665M4029.f20807) {
                        return C7665.m12939(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo4134();
                    }
                    if (i == 32) {
                        return mo4136();
                    }
                    if (i == 64) {
                        return mo4135();
                    }
                    if (i == 128) {
                        C2225 c2225 = this.f6505;
                        C2254 c2254Mo4022 = c2225 != null ? c2225.f6521.mo4022() : mo4022();
                        if (c2254Mo4022 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C7665.m12939(i4 >= 28 ? AbstractC2262.m4218(c2254Mo4022.f6561) : 0, i4 >= 28 ? AbstractC2262.m4216(c2254Mo4022.f6561) : 0, i4 >= 28 ? AbstractC2262.m4217(c2254Mo4022.f6561) : 0, i4 >= 28 ? AbstractC2262.m4219(c2254Mo4022.f6561) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C7665 c7665M40292 = m4029();
                    C7665 c7665Mo40202 = mo4020();
                    return C7665.m12939(Math.max(c7665M40292.f20810, c7665Mo40202.f20810), 0, Math.max(c7665M40292.f20808, c7665Mo40202.f20808), Math.max(c7665M40292.f20807, c7665Mo40202.f20807));
                }
                if ((this.f6510 & 2) == 0) {
                    C7665 c7665Mo40472 = mo4047();
                    C2225 c22252 = this.f6505;
                    c7665Mo4020 = c22252 != null ? c22252.f6521.mo4020() : null;
                    int iMin = c7665Mo40472.f20807;
                    if (c7665Mo4020 != null) {
                        iMin = Math.min(iMin, c7665Mo4020.f20807);
                    }
                    return C7665.m12939(c7665Mo40472.f20810, 0, c7665Mo40472.f20808, iMin);
                }
            }
        } else {
            if (z) {
                return C7665.m12939(0, Math.max(m4029().f20809, mo4047().f20809), 0, 0);
            }
            if ((this.f6510 & 4) == 0) {
                return C7665.m12939(0, mo4047().f20809, 0, 0);
            }
        }
        return c7665;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List<Rect> mo4039(int i) {
        return m4032(this.f6513, i);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4040(C2225 c2225) {
        c2225.f6521.mo4037(this.f6505);
        C7665 c7665 = this.f6511;
        C2238 c2238 = c2225.f6521;
        c2238.mo4044(c7665);
        c2238.mo4036(this.f6510);
        c2238.mo4046(this.f6514);
        c2238.mo4035(this.f6513);
        c2238.mo4034(this.f6509);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4041(View view) {
        this.f6512 = view.getWidth();
        this.f6515 = view.getHeight();
        C7665 c7665M4028 = m4028(view);
        if (c7665M4028 == null) {
            c7665M4028 = C7665.f20806;
        }
        mo4044(c7665M4028);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean mo4042() {
        return this.f6508.isRound();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo4043(C7665[] c7665Arr) {
        this.f6507 = c7665Arr;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo4044(C7665 c7665) {
        this.f6511 = c7665;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean mo4045(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m4033(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo4046(C2259 c2259) {
        this.f6514 = c2259;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7665 mo4047() {
        if (this.f6506 == null) {
            WindowInsets windowInsets = this.f6508;
            this.f6506 = C7665.m12939(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6506;
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4048() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4231 = AbstractC2267.m4231(i);
            this.f6513[iM4231] = m4031(mo4052(i));
            if (i != 8) {
                this.f6509[iM4231] = m4031(mo4053(i));
            }
        }
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2225 mo4049(int i, int i2, int i3, int i4) {
        C2225 c2225M4063 = C2225.m4063(null, this.f6508);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC2223 c2220 = i5 >= 36 ? new C2220(c2225M4063) : i5 >= 35 ? new C2221(c2225M4063) : i5 >= 34 ? new C2233(c2225M4063) : i5 >= 31 ? new C2232(c2225M4063) : i5 >= 30 ? new C2235(c2225M4063) : i5 >= 29 ? new C2234(c2225M4063) : new C2231(c2225M4063);
        c2220.mo4058(C2225.m4062(mo4047(), i, i2, i3, i4));
        c2220.mo4054(C2225.m4062(mo4020(), i, i2, i3, i4));
        return c2220.mo4056();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4050(View view) {
        this.f6514 = m4027(view);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List<Rect> mo4051(int i) {
        return m4032(this.f6509, i);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7665 mo4052(int i) {
        return m4030(i, false);
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C7665 mo4053(int i) {
        return m4030(i, true);
    }

    public C2222(C2225 c2225, C2222 c2222) {
        this(c2225, new WindowInsets(c2222.f6508));
    }
}
