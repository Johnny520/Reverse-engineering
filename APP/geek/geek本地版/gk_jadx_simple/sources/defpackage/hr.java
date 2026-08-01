package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ hr(kr r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.a;
        kr r1 = this.b;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        kh r02 = r1.c;
        if (r02 == null) goto L18;
        WeakHashMap r2 = ja0.a;
        if (v90.b(r02) == true) goto L9;
        return;
    L9:
        if (r1.c.getCount() > r1.c.getChildCount()) goto L11;
        return;
    L11:
        if (r1.c.getChildCount() > r1.m) goto L21;
        r1.z.setInputMethodMode(2);
        r1.f();
        return;
    L21:
        return;
    L18:
        return;
    L14:
        kh r03 = r1.c;
        if (r03 == null) goto L22;
        r03.setListSelectionHidden(true);
        r03.requestLayout();
        return;
    }
}
