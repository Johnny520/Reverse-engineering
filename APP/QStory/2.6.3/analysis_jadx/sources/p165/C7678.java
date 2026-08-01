package p165;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.profileinstaller.ChoreographerFrameCallbackC2446;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p251.AbstractC8175;
import p305.InterfaceC8619;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7678 extends AbstractC7671 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f20849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7677 f20850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f20851;

    public C7678(InterfaceC8619 interfaceC8619, AbstractC8175 abstractC8175) {
        super(interfaceC8619, abstractC8175);
        this.f20850 = null;
        this.f20851 = Float.MAX_VALUE;
        this.f20849 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12984() {
        if (this.f20850.f20843 <= 0.0d) {
            C5925.m11308("Spring animations can only come to an end when there is damping");
            return;
        }
        C4871 c4871 = AbstractC7671.m12981().f20831;
        c4871.getClass();
        if (Thread.currentThread() != ((Looper) c4871.f14165).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f20819) {
            this.f20849 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12985(float f) {
        if (this.f20819) {
            this.f20851 = f;
            return;
        }
        if (this.f20850 == null) {
            this.f20850 = new C7677(f);
        }
        C7677 c7677 = this.f20850;
        double d = f;
        c7677.f20847 = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            C5925.m11308("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.f20818;
        if (d2 < f2) {
            C5925.m11308("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f20824 * 0.75f);
        c7677.f20841 = dAbs;
        c7677.f20840 = dAbs * 62.5d;
        C4871 c4871 = AbstractC7671.m12981().f20831;
        c4871.getClass();
        if (Thread.currentThread() != ((Looper) c4871.f14165).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f20819;
        if (z || z) {
            return;
        }
        this.f20819 = true;
        float fMo7061 = this.f20820.mo7061(this.f20821);
        this.f20822 = fMo7061;
        if (fMo7061 > Float.MAX_VALUE || fMo7061 < f2) {
            C5925.m11310("Starting value need to be in between min value and max value");
            return;
        }
        C7675 c7675M12981 = AbstractC7671.m12981();
        ArrayList arrayList = c7675M12981.f20834;
        if (arrayList.size() == 0) {
            ((Choreographer) c7675M12981.f20831.f14164).postFrameCallback(new ChoreographerFrameCallbackC2446(c7675M12981.f20832));
            if (Build.VERSION.SDK_INT >= 33) {
                c7675M12981.f20837 = ValueAnimator.getDurationScale();
                if (c7675M12981.f20836 == null) {
                    c7675M12981.f20836 = new C4871(c7675M12981, 18);
                }
                final C4871 c48712 = c7675M12981.f20836;
                if (((C7676) c48712.f14164) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((C7675) c48712.f14165).f20837 = f3;
                        }
                    };
                    c48712.f14164 = r1;
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
