package p143c3;

import java.util.Iterator;
import p061L2.C0958A;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: c3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1909k implements Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1904f f6479d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1909k(C1904f c1904f) {
        this.f6479d = c1904f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0958A(this.f6479d);
    }
}
