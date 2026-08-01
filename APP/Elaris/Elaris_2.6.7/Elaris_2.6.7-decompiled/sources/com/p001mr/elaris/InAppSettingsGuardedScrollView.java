package com.p001mr.elaris;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
class InAppSettingsGuardedScrollView extends ScrollView {
    private boolean blockingRightSwipe;
    private float downX;
    private float downY;
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsGuardedScrollView(InAppSettings inAppSettings, Context context) {
        super(context);
        this.settings = inAppSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isBlockedRightSwipe(float f, float f2) {
        return f > ((float) this.settings.m139dp(6.0f)) && f > Math.abs(f2) * 1.5f && f > ((float) this.settings.m139dp(64.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    private void requestAncestorsDisallowIntercept(boolean z) {
        ?? r1 = this;
        while (true) {
            try {
                ?? parent = r1.getParent();
                if (parent == 0) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                if (!(parent instanceof View)) {
                    return;
                } else {
                    r1 = (View) parent;
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(null);
        }
        try {
            requestAncestorsDisallowIntercept(true);
        } catch (Throwable unused) {
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
            this.blockingRightSwipe = false;
        } else if (actionMasked == 2) {
            float x = motionEvent.getX() - this.downX;
            float y = motionEvent.getY() - this.downY;
            if (!this.blockingRightSwipe && isBlockedRightSwipe(x, y)) {
                this.blockingRightSwipe = true;
                try {
                    requestAncestorsDisallowIntercept(true);
                } catch (Throwable unused2) {
                }
                return true;
            }
            if (this.blockingRightSwipe) {
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.blockingRightSwipe) {
                this.blockingRightSwipe = false;
                return true;
            }
        } else if (actionMasked == 3 && this.blockingRightSwipe) {
            this.blockingRightSwipe = false;
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
