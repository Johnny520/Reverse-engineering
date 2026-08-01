package p334;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.fastjson2.C3775;
import com.google.protobuf.DescriptorProtos$Edition;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9503 extends AbstractC9502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public VelocityTracker f24815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f24818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f24819;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo7566(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f24816 < 0) {
            this.f24816 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f24819) {
            int i = this.f24818;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y - this.f24817) > this.f24816) {
                    this.f24817 = y;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f24818 = -1;
                motionEvent.getX();
                motionEvent.getY();
                C3775.m6954();
                return false;
            }
            VelocityTracker velocityTracker = this.f24815;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo7567(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24818);
                if (iFindPointerIndex != -1) {
                    this.f24817 = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    C3775.m6954();
                    return false;
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f24818 = motionEvent.getPointerId(i);
                    this.f24817 = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.f24815;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f24819;
        }
        VelocityTracker velocityTracker2 = this.f24815;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f24815.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE);
            this.f24815.getYVelocity(this.f24818);
            view.getClass();
            C3775.m6954();
            return false;
        }
        this.f24819 = false;
        this.f24818 = -1;
        VelocityTracker velocityTracker3 = this.f24815;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f24815 = null;
        }
        velocityTracker = this.f24815;
        if (velocityTracker != null) {
        }
        if (!this.f24819) {
        }
    }
}
