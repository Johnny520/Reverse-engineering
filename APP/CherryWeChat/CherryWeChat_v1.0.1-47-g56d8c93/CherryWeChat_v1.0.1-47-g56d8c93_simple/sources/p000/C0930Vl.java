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
    public boolean f2895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0973Wl f2896b;

    public C0930Vl(C0973Wl r1) {
        this.f2896b = r1;
        this.f2895a = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent r1) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent r7) {
        C0973Wl r0 = this.f2896b;
        AbstractC0887Ul r1 = r0.f3041m;
        if (this.f2895a == false) goto L19;
        View r2 = r0.m1855i(r7);
        if (r2 == null) goto L15;
        AbstractC1166o r22 = r0.f3045q.getChildViewHolder(r2);
        if (r22 == null) goto L16;
        RecyclerView r3 = r0.f3045q;
        int r4 = r1.mo1532d();
        WeakHashMap r5 = AbstractC2185lE.f7617a;
        if ((AbstractC0887Ul.m1733b(r4, r3.getLayoutDirection()) & 16711680) == 0) goto L17;
        int r32 = r7.getPointerId(0);
        int r42 = r0.f3040l;
        if (r32 != r42) goto L18;
        int r33 = r7.findPointerIndex(r42);
        float r43 = r7.getX(r33);
        float r72 = r7.getY(r33);
        r0.f3032d = r43;
        r0.f3033e = r72;
        r0.f3037i = 0.0f;
        r0.f3036h = 0.0f;
        r1.getClass();
        r0.m1859n(r22, 2);
        return;
    L18:
        return;
    L17:
        return;
    L16:
        return;
    L15:
        return;
    }
}
