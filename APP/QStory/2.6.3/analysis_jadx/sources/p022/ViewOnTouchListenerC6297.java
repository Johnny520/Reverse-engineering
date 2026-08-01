package p022;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC6297 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f17391;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17391 = (int) motionEvent.getRawX();
            this.f17390 = (int) motionEvent.getRawY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i = rawX - this.f17391;
        int i2 = rawY - this.f17390;
        this.f17391 = rawX;
        this.f17390 = rawY;
        WindowManager.LayoutParams layoutParams = AbstractC6296.f17387;
        layoutParams.x += i;
        layoutParams.y += i2;
        AbstractC6296.f17386.updateViewLayout(view, AbstractC6296.f17387);
        return false;
    }
}
