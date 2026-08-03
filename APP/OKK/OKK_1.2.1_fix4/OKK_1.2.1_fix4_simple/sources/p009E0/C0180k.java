package p009E0;

import java.util.Iterator;
import p026N0.C0271l;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: E0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0180k implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f397a;

    /* JADX INFO: renamed from: b */
    public final Object f398b;

    public /* synthetic */ C0180k(int r1, Object r2) {
        this.f397a = r1;
        this.f398b = r2;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch(this.f397a) {
            case 0: goto L15;
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L12:
        long[] r1 = (long[]) this.f398b;
        AbstractC0307g.m703e(r1, "array");
        return new C0172c(r1);
    L5:
        return (Iterator) this.f398b;
    L7:
        return AbstractC0358S.m861K((InterfaceC0290p) this.f398b);
    L9:
        return new C0271l(this);
    L11:
        return ((Iterable) this.f398b).iterator();
    L15:
        return AbstractC0317q.m714c((Object[]) this.f398b);
    }
}
