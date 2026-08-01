package androidx.appcompat.widget;

import android.app.Activity;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;
import p257.C8211;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0179 implements View.OnTouchListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f705;

    public /* synthetic */ ViewOnTouchListenerC0179(Object obj, int i) {
        this.f705 = i;
        this.f704 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f705;
        Object obj = this.f704;
        switch (i) {
            case 0:
                C0182 c0182 = (C0182) obj;
                RunnableC0183 runnableC0183 = c0182.f723;
                Handler handler = c0182.f711;
                C0134 c0134 = c0182.f709;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0134 != null && c0134.isShowing() && x >= 0 && x < c0134.getWidth() && y >= 0 && y < c0134.getHeight()) {
                    handler.postDelayed(runnableC0183, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(runnableC0183);
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
                for (int size = AbstractC3737.m8046().size() - 1; size >= 0; size--) {
                    AbstractC3737 abstractC3737 = (AbstractC3737) AbstractC3737.m8046().get(size);
                    if (!(abstractC3737 instanceof C8211) && abstractC3737.m8071() == activity) {
                        if (abstractC3737.m8068() == null) {
                            return false;
                        }
                        if (abstractC3737.m8068() != null) {
                            return abstractC3737.m8068().dispatchTouchEvent(motionEvent);
                        }
                        WeakReference weakReference = abstractC3737.f11595;
                        if (weakReference == null || weakReference.get() == null) {
                            return false;
                        }
                        return ((Activity) abstractC3737.f11595.get()).dispatchTouchEvent(motionEvent);
                    }
                }
                return activity.dispatchTouchEvent(motionEvent);
        }
    }
}
