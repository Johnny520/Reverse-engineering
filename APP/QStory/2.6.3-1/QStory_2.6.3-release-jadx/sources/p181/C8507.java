package p181;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.profileinstaller.ChoreographerFrameCallbackC3279;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p267.AbstractC9004;
import p321.InterfaceC9448;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8507 extends AbstractC8500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8506 f21195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f21196;

    public C8507(InterfaceC9448 interfaceC9448, AbstractC9004 abstractC9004) {
        super(interfaceC9448, abstractC9004);
        this.f21195 = null;
        this.f21196 = Float.MAX_VALUE;
        this.f21194 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13543() {
        if (this.f21195.f21188 <= 0.0d) {
            C6755.m11867("Spring animations can only come to an end when there is damping");
            return;
        }
        C5703 c5703 = AbstractC8500.m13540().f21176;
        c5703.getClass();
        if (Thread.currentThread() != ((Looper) c5703.f14510).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f21164) {
            this.f21194 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13544(float f) {
        if (this.f21164) {
            this.f21196 = f;
            return;
        }
        if (this.f21195 == null) {
            this.f21195 = new C8506(f);
        }
        C8506 c8506 = this.f21195;
        double d = f;
        c8506.f21192 = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            C6755.m11867("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f2 = this.f21163;
        if (d2 < f2) {
            C6755.m11867("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f21169 * 0.75f);
        c8506.f21186 = dAbs;
        c8506.f21185 = dAbs * 62.5d;
        C5703 c5703 = AbstractC8500.m13540().f21176;
        c5703.getClass();
        if (Thread.currentThread() != ((Looper) c5703.f14510).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f21164;
        if (z || z) {
            return;
        }
        this.f21164 = true;
        float fMo7620 = this.f21165.mo7620(this.f21166);
        this.f21167 = fMo7620;
        if (fMo7620 > Float.MAX_VALUE || fMo7620 < f2) {
            C6755.m11869("Starting value need to be in between min value and max value");
            return;
        }
        C8504 c8504M13540 = AbstractC8500.m13540();
        ArrayList arrayList = c8504M13540.f21179;
        if (arrayList.size() == 0) {
            ((Choreographer) c8504M13540.f21176.f14509).postFrameCallback(new ChoreographerFrameCallbackC3279(c8504M13540.f21177));
            if (Build.VERSION.SDK_INT >= 33) {
                c8504M13540.f21182 = ValueAnimator.getDurationScale();
                if (c8504M13540.f21181 == null) {
                    c8504M13540.f21181 = new C5703(c8504M13540, 18);
                }
                final C5703 c57032 = c8504M13540.f21181;
                if (((C8505) c57032.f14509) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世苏哲兰
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((C8504) c57032.f14510).f21182 = f3;
                        }
                    };
                    c57032.f14509 = r1;
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
