package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kb implements ge, Serializable {
    public final ge a;
    public final ee b;

    public kb(ee r2, ge r3) {
        ip.o("left", r3);
        this.a = r3;
        this.b = r2;
    }

    @Override // defpackage.ge
    public final ee b(fe r3) {
        ip.o("key", r3);
        kb r0 = this;
    L3:
        ee r1 = r0.b.b(r3);
        if (r1 != null) goto L5;
        ge r02 = r0.a;
        if ((r02 instanceof kb) == false) goto L10;
        r0 = (kb) r02;
        goto L3
    L10:
        return r02.b(r3);
    L5:
        return r1;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L4;
        return true;
    L4:
        if ((r7 instanceof kb) == false) goto L30;
        kb r72 = (kb) r7;
        int r0 = 2;
        kb r2 = r72;
        int r3 = 2;
    L6:
        ge r22 = r2.a;
        if ((r22 instanceof kb) == false) goto L9;
        r2 = (kb) r22;
    L10:
        if (r2 == null) goto L11;
        r3 = r3 + 1;
        goto L6
    L11:
        kb r23 = this;
    L12:
        ge r24 = r23.a;
        if ((r24 instanceof kb) == false) goto L15;
        r23 = (kb) r24;
    L16:
        if (r23 == null) goto L17;
        r0 = r0 + 1;
        goto L12
    L17:
        if (r3 != r0) goto L30;
        kb r02 = this;
    L19:
        ee r25 = r02.b;
        if (ip.i(r72.b(r25.getKey()), r25) == false) goto L21;
        ge r03 = r02.a;
        if ((r03 instanceof kb) == false) goto L25;
        r02 = (kb) r03;
        goto L19
    L25:
        ip.m("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", r03);
        ee r04 = (ee) r03;
        boolean r73 = ip.i(r72.b(r04.getKey()), r04);
    L26:
        if (r73 == false) goto L30;
        return true;
    L21:
        r73 = false;
        goto L26
    L15:
        r23 = null;
        goto L16
    L9:
        r2 = null;
    L30:
        return false;
    }

    @Override // defpackage.ge
    public final ge g(fe r4) {
        ip.o("key", r4);
        ee r0 = this.b;
        ee r1 = r0.b(r4);
        ge r2 = this.a;
        if (r1 == null) goto L5;
        return r2;
    L5:
        ge r42 = r2.g(r4);
        if (r42 != r2) goto L9;
        return this;
    L9:
        if (r42 != wi.a) goto L12;
        return r0;
    L12:
        return new kb(r0, r42);
    }

    @Override // defpackage.ge
    public final Object h(Object r2, wm r3) {
        return r3.e(this.a.h(r2, r3), this.b);
    }

    public final int hashCode() {
        int r0 = this.a.hashCode();
        return this.b.hashCode() + r0;
    }

    @Override // defpackage.ge
    public final ge i(ge r1) {
        return a80.y(this, r1);
    }

    public final String toString() {
        return "[" + ((String) h("", new jb(0))) + ']';
    }
}
