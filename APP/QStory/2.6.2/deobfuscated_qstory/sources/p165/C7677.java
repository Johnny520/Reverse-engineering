package p165;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.profileinstaller.ChoreographerFrameCallbackC2446;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p033.AbstractC6325;
import p305.InterfaceC8627;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7677 extends AbstractC7670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f20854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7676 f20855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f20856;

    public C7677(InterfaceC8627 interfaceC8627, AbstractC6325 abstractC6325) {
        super(interfaceC8627, abstractC6325);
        this.f20855 = null;
        this.f20856 = Float.MAX_VALUE;
        this.f20854 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12955() {
        if (this.f20855.f20848 <= 0.0d) {
            C5919.m11247("Spring animations can only come to an end when there is damping");
            return;
        }
        C4870 c4870 = AbstractC7670.m12952().f20836;
        c4870.getClass();
        if (Thread.currentThread() != ((Looper) c4870.f14161).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f20824) {
            this.f20854 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12956(float f) {
        if (this.f20824) {
            this.f20856 = f;
            return;
        }
        if (this.f20855 == null) {
            this.f20855 = new C7676(f);
        }
        C7676 c7676 = this.f20855;
        double d = f;
        c7676.f20852 = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            C5919.m11247("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.f20823;
        if (d2 < f2) {
            C5919.m11247("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f20829 * 0.75f);
        c7676.f20846 = dAbs;
        c7676.f20845 = dAbs * 62.5d;
        C4870 c4870 = AbstractC7670.m12952().f20836;
        c4870.getClass();
        if (Thread.currentThread() != ((Looper) c4870.f14161).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f20824;
        if (z || z) {
            return;
        }
        this.f20824 = true;
        float fMo7074 = this.f20825.mo7074(this.f20826);
        this.f20827 = fMo7074;
        if (fMo7074 > Float.MAX_VALUE || fMo7074 < f2) {
            C5919.m11249("Starting value need to be in between min value and max value");
            return;
        }
        C7674 c7674M12952 = AbstractC7670.m12952();
        ArrayList arrayList = c7674M12952.f20839;
        if (arrayList.size() == 0) {
            ((Choreographer) c7674M12952.f20836.f14160).postFrameCallback(new ChoreographerFrameCallbackC2446(c7674M12952.f20837));
            if (Build.VERSION.SDK_INT >= 33) {
                c7674M12952.f20842 = ValueAnimator.getDurationScale();
                if (c7674M12952.f20841 == null) {
                    c7674M12952.f20841 = new C4870(c7674M12952, 18);
                }
                final C4870 c48702 = c7674M12952.f20841;
                if (((C7675) c48702.f14160) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((C7674) c48702.f14161).f20842 = f3;
                        }
                    };
                    c48702.f14160 = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
