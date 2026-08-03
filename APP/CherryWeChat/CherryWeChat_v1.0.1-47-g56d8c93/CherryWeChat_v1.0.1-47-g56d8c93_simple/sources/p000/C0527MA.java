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

    public C0527MA(C0613OA r1) {
        this.f1720a = r1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent r5) {
        AbstractC0295Gu.m625r(-490747258206261L);
        C0613OA r0 = this.f1720a;
        float r1 = r0.f1964e;
        float r2 = r0.f1965f;
        if (r1 <= (0.1f + r2)) goto L5;
        r0.m1189a(r2, r0.f1970k / 2.0f, r0.f1971l / 2.0f);
        return true;
    L5:
        r0.m1189a(2.5f, r5.getX(), r5.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent r3) {
        AbstractC0295Gu.m625r(-490755848140853L);
        Context r32 = this.f1720a.getContext();
        if ((r32 instanceof Activity) == false) goto L5;
        Activity r33 = (Activity) r32;
    L6:
        if (r33 == null) goto L12;
        View r34 = r33.getWindow().getDecorView().findViewWithTag(AbstractC0295Gu.m625r(-490764438075445L));
        if (r34 == null) goto L13;
        r34.performClick();
        return true;
    L13:
        return true;
    L12:
        return true;
    L5:
        r33 = null;
        goto L6
    }
}
