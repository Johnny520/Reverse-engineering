package androidx.appcompat.widget;

import android.app.Activity;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;
import p273.C9041;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1026 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1050;

    public /* synthetic */ ViewOnTouchListenerC1026(Object obj, int i) {
        this.f1050 = i;
        this.f1049 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f1050;
        Object obj = this.f1049;
        switch (i) {
            case 0:
                C1029 c1029 = (C1029) obj;
                RunnableC1030 runnableC1030 = c1029.f1068;
                Handler handler = c1029.f1056;
                C0981 c0981 = c1029.f1054;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0981 != null && c0981.isShowing() && x >= 0 && x < c0981.getWidth() && y >= 0 && y < c0981.getHeight()) {
                    handler.postDelayed(runnableC1030, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(runnableC1030);
                }
                return false;
            case 1:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
            case 2:
                DialogXFloatingWindowActivity dialogXFloatingWindowActivity = (DialogXFloatingWindowActivity) obj;
                if (motionEvent.getAction() == 3 || dialogXFloatingWindowActivity.getFromActivity() == null || dialogXFloatingWindowActivity.getFromActivity() == null || (dialogXFloatingWindowActivity.getFromActivity() instanceof DialogXFloatingWindowActivity)) {
                    return false;
                }
                return dialogXFloatingWindowActivity.getFromActivity().dispatchTouchEvent(motionEvent);
            default:
                Activity activity = (Activity) obj;
                for (int size = AbstractC4570.m8592().size() - 1; size >= 0; size--) {
                    AbstractC4570 abstractC4570 = (AbstractC4570) AbstractC4570.m8592().get(size);
                    if (!(abstractC4570 instanceof C9041) && abstractC4570.m8617() == activity) {
                        if (abstractC4570.m8614() == null) {
                            return false;
                        }
                        if (abstractC4570.m8614() != null) {
                            return abstractC4570.m8614().dispatchTouchEvent(motionEvent);
                        }
                        WeakReference weakReference = abstractC4570.f11945;
                        if (weakReference == null || weakReference.get() == null) {
                            return false;
                        }
                        return ((Activity) abstractC4570.f11945.get()).dispatchTouchEvent(motionEvent);
                    }
                }
                return activity.dispatchTouchEvent(motionEvent);
        }
    }
}
