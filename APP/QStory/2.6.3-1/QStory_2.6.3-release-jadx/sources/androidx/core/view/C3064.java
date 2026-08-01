package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3064 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean f6868 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Field f6869 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Constructor f6870 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean f6871 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8494 f6872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowInsets f6873;

    public C3064() {
        this.f6873 = m4693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private static WindowInsets m4693() {
        if (!f6868) {
            try {
                f6869 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f6868 = true;
        }
        Field field = f6869;
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
        if (!f6871) {
            try {
                f6870 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f6871 = true;
        }
        Constructor constructor = f6870;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo4614(C8494 c8494) {
        this.f6872 = c8494;
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3058 mo4616() {
        m4617();
        C3058 c3058M4623 = C3058.m4623(null, this.f6873);
        C8494[] c8494Arr = this.f6863;
        C3071 c3071 = c3058M4623.f6866;
        c3071.mo4603(c8494Arr);
        c3071.mo4576(this.f6872);
        c3071.mo4606(null);
        c3071.mo4595(this.f6862);
        c3071.mo4594(this.f6861);
        return c3058M4623;
    }

    @Override // androidx.core.view.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4618(C8494 c8494) {
        WindowInsets windowInsets = this.f6873;
        if (windowInsets != null) {
            this.f6873 = windowInsets.replaceSystemWindowInsets(c8494.f21155, c8494.f21154, c8494.f21153, c8494.f21152);
        }
    }

    public C3064(C3058 c3058) {
        super(c3058);
        this.f6873 = c3058.m4629();
    }
}
