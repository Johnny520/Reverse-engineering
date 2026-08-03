package a;

/* JADX INFO: renamed from: a.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0145ff implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.GestureDetector f474a;

    public ViewOnTouchListenerC0145ff(android.view.GestureDetector r1) {
            r0 = this;
            r0.<init>()
            r0.f474a = r1
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto Lf
            android.view.GestureDetector r1 = r0.f474a
            boolean r1 = r1.onTouchEvent(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }
}
