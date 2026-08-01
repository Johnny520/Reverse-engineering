package androidx.activity;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0047 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0044 f95;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f97 = Color.argb(230, Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_TYPE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f96 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m133(ComponentActivity componentActivity, C0013 c0013, C0013 c00132) {
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        C0044 c0025 = f95;
        if (c0025 == null) {
            int i = Build.VERSION.SDK_INT;
            c0025 = i >= 35 ? new C0025() : i >= 30 ? new C0026() : i >= 29 ? new C0027() : i >= 28 ? new C0029() : new C0044();
            f95 = c0025;
        }
        C0044 c0044 = c0025;
        RunnableC0042 runnableC0042 = new RunnableC0042(c0044, c0013, c00132, componentActivity, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                C0046 c0046 = new C0046(runnableC0042, viewGroup.getContext());
                c0046.setTag(c0044);
                c0046.setVisibility(8);
                c0046.setWillNotDraw(true);
                viewGroup.addView(c0046);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof C0044) {
                break;
            } else {
                i2 = i3;
            }
        }
        runnableC0042.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        c0044.mo32(window);
    }
}
