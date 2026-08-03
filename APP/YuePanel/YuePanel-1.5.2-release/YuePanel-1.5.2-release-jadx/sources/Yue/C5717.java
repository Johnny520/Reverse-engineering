package Yue;

import Yue.C3605;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5717 extends LinkMovementMethod {

    /* JADX INFO: renamed from: ۥ */
    public static C5717 f1634;

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C5717 m2398() {
        if (f1634 == null) {
            f1634 = new C5717();
        }
        return f1634;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 <= r2.getLineRight(r1)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    @InterfaceC6578(markerClass = {C3605.InterfaceC0195.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@InterfaceC6490 TextView textView, @InterfaceC6490 Spannable spannable, @InterfaceC6490 MotionEvent motionEvent) {
        int action;
        if (!C3605.m9724() && ((action = motionEvent.getAction()) == 1 || action == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                int lineForVertical = layout.getLineForVertical(scrollY);
                float f = scrollX;
                if (f >= layout.getLineLeft(lineForVertical)) {
                }
            }
            Selection.removeSelection(spannable);
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
