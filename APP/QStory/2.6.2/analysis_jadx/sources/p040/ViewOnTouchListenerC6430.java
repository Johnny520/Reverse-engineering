package p040;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC6430 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f17618;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17618 = (int) motionEvent.getRawX();
            this.f17617 = (int) motionEvent.getRawY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i = rawX - this.f17618;
        int i2 = rawY - this.f17617;
        this.f17618 = rawX;
        this.f17617 = rawY;
        WindowManager.LayoutParams layoutParams = AbstractC6429.f17614;
        layoutParams.x += i;
        layoutParams.y += i2;
        AbstractC6429.f17613.updateViewLayout(view, AbstractC6429.f17614);
        return false;
    }
}
