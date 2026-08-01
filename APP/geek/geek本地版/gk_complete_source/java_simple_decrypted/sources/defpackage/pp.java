package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class pp extends wp {
    public final boolean c;

    public pp() {
        boolean r0 = true;
        super(true);
        A(null);
        AtomicReferenceFieldUpdater r2 = wp.b;
        da r3 = (da) r2.get(this);
        if ((r3 instanceof ea) == false) goto L5;
        ea r32 = (ea) r3;
    L7:
        if (r32 == null) goto L18;
        wp r33 = r32.k();
    L10:
        if (r33.u() == true) goto L19;
        da r34 = (da) r2.get(r33);
        if ((r34 instanceof ea) == false) goto L15;
        ea r35 = (ea) r34;
    L16:
        if (r35 == null) goto L18;
        r33 = r35.k();
        goto L10
    L15:
        r35 = null;
    L19:
        this.c = r0;
        return;
    L18:
        r0 = false;
        goto L19
    L5:
        r32 = null;
        goto L7
    }

    @Override // defpackage.wp
    public final boolean u() {
        return this.c;
    }

    @Override // defpackage.wp
    public final boolean v() {
        return true;
    }
}
