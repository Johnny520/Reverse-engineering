package yyds;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛷᛵᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1550 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7858;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f7859;

    public /* synthetic */ ViewOnTouchListenerC1550(int i, Object obj) {
        this.f7858 = i;
        this.f7859 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f7858;
        Object obj = this.f7859;
        switch (i) {
            case 0:
                C1022 c1022 = (C1022) obj;
                if (motionEvent.getAction() != 1 || c1022.f4654.getCompoundDrawables()[2] == null) {
                    return false;
                }
                if (motionEvent.getX() < (c1022.f4654.getWidth() - c1022.f4654.getPaddingRight()) - c1022.m275(40.0f)) {
                    return false;
                }
                c1022.f4654.setText("");
                return true;
            default:
                AbstractC2352 abstractC2352 = (AbstractC2352) obj;
                RunnableC1073 runnableC1073 = abstractC2352.f11557;
                Handler handler = abstractC2352.f11549;
                C1000 c1000 = abstractC2352.f11541;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c1000 != null && c1000.isShowing() && x >= 0 && x < c1000.getWidth() && y >= 0 && y < c1000.getHeight()) {
                    handler.postDelayed(runnableC1073, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(runnableC1073);
                }
                return false;
        }
    }
}
