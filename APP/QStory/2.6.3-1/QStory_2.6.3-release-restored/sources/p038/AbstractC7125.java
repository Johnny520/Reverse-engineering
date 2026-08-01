package p038;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import p034.AbstractC7082;
import p045.C7149;
import p055.C7243;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ImageView f17730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static WindowManager f17731;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static WindowManager.LayoutParams f17732;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Activity f17733;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f17734;

    static {
        "FloatingWindows";
        f17734 = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12382(Activity activity) {
        ImageView imageView = new ImageView(activity);
        f17730 = imageView;
        imageView.setImageDrawable(C7243.m12529());
        f17730.setAdjustViewBounds(true);
        f17730.setOnTouchListener(new ViewOnTouchListenerC7126());
        f17730.setOnClickListener(new ViewOnClickListenerC7127(activity, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static WindowManager.LayoutParams m12383(Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        f17732 = layoutParams;
        layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = AbstractC7082.m12313(activity, 30.0f);
        f17732.height = AbstractC7082.m12313(activity, 30.0f);
        C7149 c7149 = new C7149("FloatingWindows");
        int iIntValue = ((Integer) c7149.m12399(0, "show x")).intValue();
        int iIntValue2 = ((Integer) c7149.m12399(0, "show y")).intValue();
        WindowManager.LayoutParams layoutParams2 = f17732;
        if (iIntValue == 0) {
            iIntValue = 50;
        }
        layoutParams2.x = iIntValue;
        if (iIntValue2 == 0) {
            iIntValue2 = 50;
        }
        layoutParams2.y = iIntValue2;
        return layoutParams2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12384(boolean z) {
        Activity activityM7213 = AbstractC3887.m7213();
        if (activityM7213 == null) {
            return;
        }
        try {
            AbstractC3888.m7247(activityM7213);
            AtomicBoolean atomicBoolean = f17734;
            if (!z || activityM7213.isFinishing()) {
                if (f17731 == null || !atomicBoolean.getAndSet(false)) {
                    return;
                }
                f17731.removeViewImmediate(f17730);
                C7149 c7149 = new C7149("FloatingWindows");
                c7149.m12395(Integer.valueOf(f17732.x), "show x");
                c7149.m12395(Integer.valueOf(f17732.y), "show y");
                c7149.mo12394();
                return;
            }
            if (activityM7213 == f17733) {
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                f17731.addView(f17730, m12383(activityM7213));
                return;
            }
            if (atomicBoolean.getAndSet(false)) {
                f17731.removeViewImmediate(f17730);
            }
            f17731 = activityM7213.getWindowManager();
            m12382(activityM7213);
            f17731.addView(f17730, m12383(activityM7213));
            atomicBoolean.set(true);
            f17733 = activityM7213;
        } catch (Exception unused) {
        }
    }
}
