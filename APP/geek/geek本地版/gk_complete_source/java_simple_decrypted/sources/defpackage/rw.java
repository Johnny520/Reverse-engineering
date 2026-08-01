package defpackage;

import androidx.activity.a;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class rw extends cq implements sm {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    public /* synthetic */ rw(a r1, int r2) {
        this.b = r2;
        this.c = r1;
        super(1);
    }

    @Override // defpackage.sm
    public final Object f(Object r4) {
        switch(this.b) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        ip.o("backEvent", (a7) r4);
        k6 r42 = this.c.b;
        ListIterator r43 = r42.listIterator(r42.size());
    L6:
        if (r43.hasPrevious() == false) goto L10;
        Object r0 = r43.previous();
        if (((sl) r0).a == false) goto L6;
    L11:
        sl r02 = (sl) r0;
        return vh.n;
    L10:
        r0 = null;
        goto L11
    L13:
        ip.o("backEvent", (a7) r4);
        a r44 = this.c;
        k6 r03 = r44.b;
        ListIterator r04 = r03.listIterator(r03.size());
    L15:
        if (r04.hasPrevious() == false) goto L19;
        Object r1 = r04.previous();
        if (((sl) r1).a == false) goto L15;
    L20:
        r44.c = (sl) r1;
        return vh.n;
    L19:
        r1 = null;
        goto L20
    }
}
