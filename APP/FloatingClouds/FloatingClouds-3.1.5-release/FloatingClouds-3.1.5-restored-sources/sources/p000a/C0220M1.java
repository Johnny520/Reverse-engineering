package p000a;

import java.util.Iterator;

/* JADX INFO: renamed from: a.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0220M1 implements InterfaceC0286Pd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f740a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f741b;

    public /* synthetic */ C0220M1(int i, Object obj) {
        this.f740a = i;
        this.f741b = obj;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator iterator() {
        switch (this.f740a) {
            case 0:
                return C0889w1.m2122I((Object[]) this.f741b);
            case 1:
                return ((Iterable) this.f741b).iterator();
            default:
                return (Iterator) this.f741b;
        }
    }
}
