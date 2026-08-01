package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hr implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.kr b;

    public /* synthetic */ hr(defpackage.kr r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.a
            kr r1 = r3.b
            switch(r0) {
                case 0: goto L35;
                default: goto L7;
            }
        L7:
            kh r0 = r1.c
            if (r0 == 0) goto L34
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r0 = defpackage.v90.b(r0)
            if (r0 == 0) goto L34
            kh r0 = r1.c
            int r0 = r0.getCount()
            kh r2 = r1.c
            int r2 = r2.getChildCount()
            if (r0 <= r2) goto L34
            kh r0 = r1.c
            int r0 = r0.getChildCount()
            int r2 = r1.m
            if (r0 > r2) goto L34
            c4 r0 = r1.z
            r2 = 2
            r0.setInputMethodMode(r2)
            r1.f()
        L34:
            return
        L35:
            kh r0 = r1.c
            if (r0 == 0) goto L40
            r1 = 1
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        L40:
            return
    }
}
