package androidx.activity;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0891 f440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f442 = Color.argb(230, Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_TYPE, Opcodes.CONST_METHOD_TYPE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f441 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m693(ComponentActivity componentActivity, C0860 c0860, C0860 c08602) {
        View decorView = componentActivity.getWindow().getDecorView();
        decorView.getClass();
        C0891 c0872 = f440;
        if (c0872 == null) {
            int i = Build.VERSION.SDK_INT;
            c0872 = i >= 35 ? new C0872() : i >= 30 ? new C0873() : i >= 29 ? new C0874() : i >= 28 ? new C0876() : new C0891();
            f440 = c0872;
        }
        C0891 c0891 = c0872;
        RunnableC0889 runnableC0889 = new RunnableC0889(c0891, c0860, c08602, componentActivity, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                C0893 c0893 = new C0893(runnableC0889, viewGroup.getContext());
                c0893.setTag(c0891);
                c0893.setVisibility(8);
                c0893.setWillNotDraw(true);
                viewGroup.addView(c0893);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof C0891) {
                break;
            } else {
                i2 = i3;
            }
        }
        runnableC0889.run();
        Window window = componentActivity.getWindow();
        window.getClass();
        c0891.mo592(window);
    }
}
