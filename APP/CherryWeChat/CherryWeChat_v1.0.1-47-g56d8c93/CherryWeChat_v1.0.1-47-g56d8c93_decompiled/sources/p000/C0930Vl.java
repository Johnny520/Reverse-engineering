package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Vl */
/* JADX INFO: loaded from: classes.dex */
public final class C0930Vl extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public boolean f2895a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0973Wl f2896b;

    public C0930Vl(C0973Wl c0973Wl) {
        this.f2896b = c0973Wl;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM1855i;
        AbstractC1166o childViewHolder;
        C0973Wl c0973Wl = this.f2896b;
        AbstractC0887Ul abstractC0887Ul = c0973Wl.f3041m;
        if (!this.f2895a || (viewM1855i = c0973Wl.m1855i(motionEvent)) == null || (childViewHolder = c0973Wl.f3045q.getChildViewHolder(viewM1855i)) == null) {
            return;
        }
        RecyclerView recyclerView = c0973Wl.f3045q;
        int iMo1532d = abstractC0887Ul.mo1532d();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if ((AbstractC0887Ul.m1733b(iMo1532d, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c0973Wl.f3040l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c0973Wl.f3032d = x;
                c0973Wl.f3033e = y;
                c0973Wl.f3037i = 0.0f;
                c0973Wl.f3036h = 0.0f;
                abstractC0887Ul.getClass();
                c0973Wl.m1859n(childViewHolder, 2);
            }
        }
    }
}
