package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends p000.kc {
    public a3(android.content.Context r3) {
            r2 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [-108, -99, -39} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [-9, -27, -83, 96, 68, -90} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            r2.<init>(r3)
            return
    }

    @Override // p000.kc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onInterceptTouchEvent(r1)     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r1 = 0
            return r1
    }
}
