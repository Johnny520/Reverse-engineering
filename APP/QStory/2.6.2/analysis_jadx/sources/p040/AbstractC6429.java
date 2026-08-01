package p040;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.ImageView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import p028.C6301;
import p035.ViewOnClickListenerC6337;
import p038.C6397;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6429 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ImageView f17612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static WindowManager f17613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static WindowManager.LayoutParams f17614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Activity f17615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AtomicBoolean f17616;

    static {
        AbstractC3056.m6668(-3937621503047370151L);
        f17616 = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11931(Activity activity) {
        ImageView imageView = new ImageView(activity);
        f17612 = imageView;
        imageView.setImageDrawable(C6397.m11922());
        f17612.setAdjustViewBounds(true);
        f17612.setOnTouchListener(new ViewOnTouchListenerC6430());
        f17612.setOnClickListener(new ViewOnClickListenerC6337(activity, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static WindowManager.LayoutParams m11932(Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        f17614 = layoutParams;
        layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = AbstractC2904.m6267(activity, 30.0f);
        f17614.height = AbstractC2904.m6267(activity, 30.0f);
        C6301 c6301 = new C6301(AbstractC3056.m6668(-3937621503047370151L));
        int iIntValue = ((Integer) c6301.m11812(0, AbstractC3056.m6668(-3937621434327893415L))).intValue();
        int iIntValue2 = ((Integer) c6301.m11812(0, AbstractC3056.m6668(-3937621464392664487L))).intValue();
        WindowManager.LayoutParams layoutParams2 = f17614;
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
    public static void m11933(boolean z) {
        Activity activityM13031 = AbstractC7738.m13031();
        if (activityM13031 == null) {
            return;
        }
        try {
            AbstractC3065.m6858(activityM13031);
            AtomicBoolean atomicBoolean = f17616;
            if (!z || activityM13031.isFinishing()) {
                if (f17613 == null || !atomicBoolean.getAndSet(false)) {
                    return;
                }
                f17613.removeViewImmediate(f17612);
                C6301 c6301 = new C6301(AbstractC3056.m6668(-3937621503047370151L));
                c6301.m11808(Integer.valueOf(f17614.x), AbstractC3056.m6668(-3937621434327893415L));
                c6301.m11808(Integer.valueOf(f17614.y), AbstractC3056.m6668(-3937621464392664487L));
                c6301.mo11807();
                return;
            }
            if (activityM13031 == f17615) {
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                f17613.addView(f17612, m11932(activityM13031));
                return;
            }
            if (atomicBoolean.getAndSet(false)) {
                f17613.removeViewImmediate(f17612);
            }
            f17613 = activityM13031.getWindowManager();
            m11931(activityM13031);
            f17613.addView(f17612, m11932(activityM13031));
            atomicBoolean.set(true);
            f17615 = activityM13031;
        } catch (Exception unused) {
        }
    }
}
