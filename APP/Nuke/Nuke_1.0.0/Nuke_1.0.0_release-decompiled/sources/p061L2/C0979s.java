package p061L2;

import java.util.Iterator;
import p143c3.InterfaceC1905g;

/* JADX INFO: renamed from: L2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0979s implements InterfaceC1905g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3045b;

    public /* synthetic */ C0979s(int i5, Object obj) {
        this.f3044a = i5;
        this.f3045b = obj;
    }

    @Override // p143c3.InterfaceC1905g
    public final Iterator iterator() {
        switch (this.f3044a) {
            case 0:
                return ((Iterable) this.f3045b).iterator();
            default:
                return (Iterator) this.f3045b;
        }
    }
}
