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

    public /* synthetic */ C0180k(int i2, Object obj) {
        this.f397a = i2;
        this.f398b = obj;
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        switch (this.f397a) {
            case 0:
                return AbstractC0317q.m714c((Object[]) this.f398b);
            case 1:
                long[] jArr = (long[]) this.f398b;
                AbstractC0307g.m703e(jArr, "array");
                return new C0172c(jArr);
            case 2:
                return ((Iterable) this.f398b).iterator();
            case 3:
                return new C0271l(this);
            case 4:
                return AbstractC0358S.m861K((InterfaceC0290p) this.f398b);
            default:
                return (Iterator) this.f398b;
        }
    }
}
