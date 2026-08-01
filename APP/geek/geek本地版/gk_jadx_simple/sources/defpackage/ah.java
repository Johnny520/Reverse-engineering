package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah implements ow, sm {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ah(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a(Throwable r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((sm) this.b).f(r2);
        return;
    L6:
        ((gj) this.b).b();
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ Object f(Object r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        a((Throwable) r2);
        return vh.n;
    L6:
        a((Throwable) r2);
        return vh.n;
    }

    public final String toString() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return "InvokeOnCancel[" + ((sm) this.b).getClass().getSimpleName() + '@' + ff.s(this) + ']';
    L7:
        return "DisposeOnCancel[" + ((gj) this.b) + ']';
    }
}
