package p022;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import p018.AbstractC6253;
import p029.C6320;
import p039.C6414;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6296 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ImageView f17385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static WindowManager f17386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static WindowManager.LayoutParams f17387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Activity f17388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f17389;

    static {
        AbstractC8405.m13972(557);
        f17389 = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11823(Activity activity) {
        ImageView imageView = new ImageView(activity);
        f17385 = imageView;
        imageView.setImageDrawable(C6414.m11970());
        f17385.setAdjustViewBounds(true);
        f17385.setOnTouchListener(new ViewOnTouchListenerC6297());
        f17385.setOnClickListener(new ViewOnClickListenerC6298(activity, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static WindowManager.LayoutParams m11824(Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        f17387 = layoutParams;
        layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = AbstractC6253.m11754(activity, 30.0f);
        f17387.height = AbstractC6253.m11754(activity, 30.0f);
        C6320 c6320 = new C6320(AbstractC8405.m13972(557));
        int iIntValue = ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"))).intValue();
        int iIntValue2 = ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"))).intValue();
        WindowManager.LayoutParams layoutParams2 = f17387;
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
    public static void m11825(boolean z) {
        Activity activityM6653 = AbstractC3055.m6653();
        if (activityM6653 == null) {
            return;
        }
        try {
            AbstractC3056.m6687(activityM6653);
            AtomicBoolean atomicBoolean = f17389;
            if (!z || activityM6653.isFinishing()) {
                if (f17386 == null || !atomicBoolean.getAndSet(false)) {
                    return;
                }
                f17386.removeViewImmediate(f17385);
                C6320 c6320 = new C6320(AbstractC8405.m13972(557));
                c6320.m11836(Integer.valueOf(f17387.x), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"));
                c6320.m11836(Integer.valueOf(f17387.y), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"));
                c6320.mo11835();
                return;
            }
            if (activityM6653 == f17388) {
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                f17386.addView(f17385, m11824(activityM6653));
                return;
            }
            if (atomicBoolean.getAndSet(false)) {
                f17386.removeViewImmediate(f17385);
            }
            f17386 = activityM6653.getWindowManager();
            m11823(activityM6653);
            f17386.addView(f17385, m11824(activityM6653));
            atomicBoolean.set(true);
            f17388 = activityM6653;
        } catch (Exception unused) {
        }
    }
}
