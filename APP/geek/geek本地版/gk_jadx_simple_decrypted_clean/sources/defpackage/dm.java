package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ dm(View r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ip.o("v", r3);
        return;
    L6:
        View r32 = this.b;
        r32.removeOnAttachStateChangeListener(this);
        WeakHashMap r0 = ja0.a;
        w90.c(r32);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r4) {
        switch(this.a) {
            case 0: goto L30;
            default: goto L4;
        };
    L4:
        ip.o("v", r4);
        Object r0 = r4.getTag(2115043329);
        h40 r2 = null;
        if ((r0 instanceof h40) == false) goto L7;
        h40 r02 = (h40) r0;
    L8:
        if (r02 == null) goto L10;
        r02.c();
    L10:
        Object r42 = r4.getTag(2115043330);
        if ((r42 instanceof h40) == false) goto L13;
        h40 r43 = (h40) r42;
    L14:
        if (r43 == null) goto L16;
        r43.c();
    L16:
        View r44 = this.b;
        if (r44 == null) goto L31;
        Object r03 = r44.getTag(2115043331);
        if ((r03 instanceof h40) == false) goto L21;
        h40 r04 = (h40) r03;
    L22:
        if (r04 == null) goto L24;
        r04.c();
    L24:
        Object r45 = r44.getTag(2115043332);
        if ((r45 instanceof h40) == false) goto L27;
        r2 = (h40) r45;
    L27:
        if (r2 == null) goto L32;
        r2.c();
        return;
    L32:
        return;
    L21:
        r04 = null;
        goto L22
    L31:
        return;
    L13:
        r43 = null;
        goto L14
    L7:
        r02 = null;
        goto L8
    }

    private final void a(View r1) {
    }
}
