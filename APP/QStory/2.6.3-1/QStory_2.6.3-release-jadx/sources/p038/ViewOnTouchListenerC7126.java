package p038;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC7126 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f17736;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17736 = (int) motionEvent.getRawX();
            this.f17735 = (int) motionEvent.getRawY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i = rawX - this.f17736;
        int i2 = rawY - this.f17735;
        this.f17736 = rawX;
        this.f17735 = rawY;
        WindowManager.LayoutParams layoutParams = AbstractC7125.f17732;
        layoutParams.x += i;
        layoutParams.y += i2;
        AbstractC7125.f17731.updateViewLayout(view, AbstractC7125.f17732);
        return false;
    }
}
