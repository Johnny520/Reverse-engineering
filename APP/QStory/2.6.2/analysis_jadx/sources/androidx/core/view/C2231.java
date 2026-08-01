package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2231 extends AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean f6522 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Field f6523 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Constructor f6524 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean f6525 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7664 f6526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowInsets f6527;

    public C2231() {
        this.f6527 = m4123();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private static WindowInsets m4123() {
        if (!f6522) {
            try {
                f6523 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f6522 = true;
        }
        Field field = f6523;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!f6525) {
            try {
                f6524 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f6525 = true;
        }
        Constructor constructor = f6524;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo4044(C7664 c7664) {
        this.f6526 = c7664;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4046() {
        m4047();
        C2225 c2225M4053 = C2225.m4053(null, this.f6527);
        C7664[] c7664Arr = this.f6517;
        C2238 c2238 = c2225M4053.f6520;
        c2238.mo4033(c7664Arr);
        c2238.mo4006(this.f6526);
        c2238.mo4036(null);
        c2238.mo4025(this.f6516);
        c2238.mo4024(this.f6515);
        return c2225M4053;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4048(C7664 c7664) {
        WindowInsets windowInsets = this.f6527;
        if (windowInsets != null) {
            this.f6527 = windowInsets.replaceSystemWindowInsets(c7664.f20815, c7664.f20814, c7664.f20813, c7664.f20812);
        }
    }

    public C2231(C2225 c2225) {
        super(c2225);
        this.f6527 = c2225.m4059();
    }
}
