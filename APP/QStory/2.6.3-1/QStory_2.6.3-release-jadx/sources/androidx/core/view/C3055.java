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
import p180.C8494;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3055 extends C3071 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean f6845 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Field f6846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Field f6847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method f6848;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Class f6849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3058 f6850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8494 f6851;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8494[] f6852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final WindowInsets f6853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Rect[][] f6854;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6855;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8494 f6856;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f6857;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Rect[][] f6858;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C3092 f6859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f6860;

    public C3055(C3058 c3058, WindowInsets windowInsets) {
        super(c3058);
        this.f6851 = null;
        this.f6858 = new Rect[10][];
        this.f6854 = new Rect[10][];
        this.f6853 = windowInsets;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    private static void m4585() {
        try {
            f6848 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6849 = cls;
            f6846 = cls.getDeclaredField("mVisibleInsets");
            f6847 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6846.setAccessible(true);
            f6847.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6845 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m4586(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    private C3092 m4587(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f6877.f6866.mo4602()) {
            return C3092.m4774(point.x, point.y, true, 0, 0, 0, 0);
        }
        C3035 c3035M4788 = AbstractC3100.m4788(display, 0);
        C3035 c3035M47882 = AbstractC3100.m4788(display, 1);
        C3035 c3035M47883 = AbstractC3100.m4788(display, 2);
        C3035 c3035M47884 = AbstractC3100.m4788(display, 3);
        return C3092.m4774(point.x, point.y, false, c3035M4788 != null ? c3035M4788.f6826 : 0, c3035M47882 != null ? c3035M47882.f6826 : 0, c3035M47883 != null ? c3035M47883.f6826 : 0, c3035M47884 != null ? c3035M47884.f6826 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    private C8494 m4588(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C6755.m11867("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f6845) {
            m4585();
        }
        Method method = f6848;
        if (method != null && f6849 != null && f6846 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6846.get(f6847.get(objInvoke));
                if (rect != null) {
                    return C8494.m13498(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    private C8494 m4589() {
        C3058 c3058 = this.f6850;
        return c3058 != null ? c3058.f6866.mo4580() : C8494.f21151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    private C8494 m4590(int i, boolean z) {
        C8494 c8494M13500 = C8494.f21151;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c8494M13500 = C8494.m13500(c8494M13500, m4598(i2, z));
            }
        }
        return c8494M13500;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    private Rect[] m4591(C8494 c8494) {
        ArrayList arrayList = new ArrayList();
        int i = c8494.f21155;
        int i2 = c8494.f21152;
        int i3 = c8494.f21153;
        int i4 = c8494.f21154;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, c8494.f21155, this.f6860));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f6857, i4));
        }
        if (i3 != 0) {
            int i5 = this.f6857;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f6860));
        }
        if (i2 != 0) {
            int i6 = this.f6860;
            arrayList.add(new Rect(0, i6 - i2, this.f6857, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    private static List<Rect> m4592(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[AbstractC3100.m4791(i2)]) != null) {
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

    @Override // androidx.core.view.C3071
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3055 c3055 = (C3055) obj;
        return Objects.equals(this.f6856, c3055.f6856) && m4586(this.f6855, c3055.f6855);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean m4593(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m4598(i, false).equals(C8494.f21151);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public void mo4594(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6854 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo4595(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f6858 = (Rect[][]) rectArr.clone();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void mo4596(int i) {
        this.f6855 = i;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void mo4597(C3058 c3058) {
        this.f6850 = c3058;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C8494 m4598(int i, boolean z) {
        C8494 c8494Mo4580;
        int i2;
        C8494 c8494 = C8494.f21151;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C8494[] c8494Arr = this.f6852;
                    c8494Mo4580 = c8494Arr != null ? c8494Arr[AbstractC3100.m4791(8)] : null;
                    if (c8494Mo4580 != null) {
                        return c8494Mo4580;
                    }
                    C8494 c8494Mo4607 = mo4607();
                    C8494 c8494M4589 = m4589();
                    int i3 = c8494Mo4607.f21152;
                    if (i3 > c8494M4589.f21152) {
                        return C8494.m13498(0, 0, 0, i3);
                    }
                    C8494 c84942 = this.f6856;
                    if (c84942 != null && !c84942.equals(c8494) && (i2 = this.f6856.f21152) > c8494M4589.f21152) {
                        return C8494.m13498(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo4694();
                    }
                    if (i == 32) {
                        return mo4696();
                    }
                    if (i == 64) {
                        return mo4695();
                    }
                    if (i == 128) {
                        C3058 c3058 = this.f6850;
                        C3087 c3087Mo4582 = c3058 != null ? c3058.f6866.mo4582() : mo4582();
                        if (c3087Mo4582 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return C8494.m13498(i4 >= 28 ? AbstractC3095.m4778(c3087Mo4582.f6906) : 0, i4 >= 28 ? AbstractC3095.m4776(c3087Mo4582.f6906) : 0, i4 >= 28 ? AbstractC3095.m4777(c3087Mo4582.f6906) : 0, i4 >= 28 ? AbstractC3095.m4779(c3087Mo4582.f6906) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C8494 c8494M45892 = m4589();
                    C8494 c8494Mo45802 = mo4580();
                    return C8494.m13498(Math.max(c8494M45892.f21155, c8494Mo45802.f21155), 0, Math.max(c8494M45892.f21153, c8494Mo45802.f21153), Math.max(c8494M45892.f21152, c8494Mo45802.f21152));
                }
                if ((this.f6855 & 2) == 0) {
                    C8494 c8494Mo46072 = mo4607();
                    C3058 c30582 = this.f6850;
                    c8494Mo4580 = c30582 != null ? c30582.f6866.mo4580() : null;
                    int iMin = c8494Mo46072.f21152;
                    if (c8494Mo4580 != null) {
                        iMin = Math.min(iMin, c8494Mo4580.f21152);
                    }
                    return C8494.m13498(c8494Mo46072.f21155, 0, c8494Mo46072.f21153, iMin);
                }
            }
        } else {
            if (z) {
                return C8494.m13498(0, Math.max(m4589().f21154, mo4607().f21154), 0, 0);
            }
            if ((this.f6855 & 4) == 0) {
                return C8494.m13498(0, mo4607().f21154, 0, 0);
            }
        }
        return c8494;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List<Rect> mo4599(int i) {
        return m4592(this.f6858, i);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4600(C3058 c3058) {
        c3058.f6866.mo4597(this.f6850);
        C8494 c8494 = this.f6856;
        C3071 c3071 = c3058.f6866;
        c3071.mo4604(c8494);
        c3071.mo4596(this.f6855);
        c3071.mo4606(this.f6859);
        c3071.mo4595(this.f6858);
        c3071.mo4594(this.f6854);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4601(View view) {
        this.f6857 = view.getWidth();
        this.f6860 = view.getHeight();
        C8494 c8494M4588 = m4588(view);
        if (c8494M4588 == null) {
            c8494M4588 = C8494.f21151;
        }
        mo4604(c8494M4588);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean mo4602() {
        return this.f6853.isRound();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void mo4603(C8494[] c8494Arr) {
        this.f6852 = c8494Arr;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo4604(C8494 c8494) {
        this.f6856 = c8494;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean mo4605(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m4593(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void mo4606(C3092 c3092) {
        this.f6859 = c3092;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C8494 mo4607() {
        if (this.f6851 == null) {
            WindowInsets windowInsets = this.f6853;
            this.f6851 = C8494.m13498(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6851;
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void mo4608() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM4791 = AbstractC3100.m4791(i);
            this.f6858[iM4791] = m4591(mo4612(i));
            if (i != 8) {
                this.f6854[iM4791] = m4591(mo4613(i));
            }
        }
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3058 mo4609(int i, int i2, int i3, int i4) {
        C3058 c3058M4623 = C3058.m4623(null, this.f6853);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC3056 c3053 = i5 >= 36 ? new C3053(c3058M4623) : i5 >= 35 ? new C3054(c3058M4623) : i5 >= 34 ? new C3066(c3058M4623) : i5 >= 31 ? new C3065(c3058M4623) : i5 >= 30 ? new C3068(c3058M4623) : i5 >= 29 ? new C3067(c3058M4623) : new C3064(c3058M4623);
        c3053.mo4618(C3058.m4622(mo4607(), i, i2, i3, i4));
        c3053.mo4614(C3058.m4622(mo4580(), i, i2, i3, i4));
        return c3053.mo4616();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo4610(View view) {
        this.f6859 = m4587(view);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List<Rect> mo4611(int i) {
        return m4592(this.f6854, i);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8494 mo4612(int i) {
        return m4590(i, false);
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C8494 mo4613(int i) {
        return m4590(i, true);
    }

    public C3055(C3058 c3058, C3055 c3055) {
        this(c3058, new WindowInsets(c3055.f6853));
    }
}
