package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2231 extends AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean f6523 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Field f6524 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Constructor f6525 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean f6526 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7665 f6527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowInsets f6528;

    public C2231() {
        this.f6528 = m4133();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    private static WindowInsets m4133() {
        if (!f6523) {
            try {
                f6524 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f6523 = true;
        }
        Field field = f6524;
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
        if (!f6526) {
            try {
                f6525 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f6526 = true;
        }
        Constructor constructor = f6525;
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
    public void mo4054(C7665 c7665) {
        this.f6527 = c7665;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4056() {
        m4057();
        C2225 c2225M4063 = C2225.m4063(null, this.f6528);
        C7665[] c7665Arr = this.f6518;
        C2238 c2238 = c2225M4063.f6521;
        c2238.mo4043(c7665Arr);
        c2238.mo4016(this.f6527);
        c2238.mo4046(null);
        c2238.mo4035(this.f6517);
        c2238.mo4034(this.f6516);
        return c2225M4063;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4058(C7665 c7665) {
        WindowInsets windowInsets = this.f6528;
        if (windowInsets != null) {
            this.f6528 = windowInsets.replaceSystemWindowInsets(c7665.f20810, c7665.f20809, c7665.f20808, c7665.f20807);
        }
    }

    public C2231(C2225 c2225) {
        super(c2225);
        this.f6528 = c2225.m4069();
    }
}
