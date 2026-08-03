package p001;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ۟.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0138a3 extends C0287kc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138a3(Context context) {
        super(context);
        C0237h4.m1090("cxt", context);
    }

    @Override // p001.C0287kc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }
}
