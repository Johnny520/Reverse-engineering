package p000;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: MA */
/* JADX INFO: loaded from: classes.dex */
public final class C0527MA extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0613OA f1720a;

    public C0527MA(C0613OA c0613oa) {
        this.f1720a = c0613oa;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        AbstractC0295Gu.m625r(-490747258206261L);
        C0613OA c0613oa = this.f1720a;
        float f = c0613oa.f1964e;
        float f2 = c0613oa.f1965f;
        if (f > 0.1f + f2) {
            c0613oa.m1189a(f2, c0613oa.f1970k / 2.0f, c0613oa.f1971l / 2.0f);
            return true;
        }
        c0613oa.m1189a(2.5f, motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View viewFindViewWithTag;
        AbstractC0295Gu.m625r(-490755848140853L);
        Context context = this.f1720a.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (viewFindViewWithTag = activity.getWindow().getDecorView().findViewWithTag(AbstractC0295Gu.m625r(-490764438075445L))) == null) {
            return true;
        }
        viewFindViewWithTag.performClick();
        return true;
    }
}
