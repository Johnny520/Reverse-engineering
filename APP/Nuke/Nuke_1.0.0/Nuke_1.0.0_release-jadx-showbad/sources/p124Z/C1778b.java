package p124Z;

import java.util.Iterator;
import p061L2.AbstractC0969i;
import p109W.InterfaceC1575b;
import p119Y.C1719c;
import p129a0.C1787b;

/* JADX INFO: renamed from: Z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1778b extends AbstractC0969i implements InterfaceC1575b {

    /* JADX INFO: renamed from: g */
    public static final C1778b f6080g;

    /* JADX INFO: renamed from: d */
    public final Object f6081d;

    /* JADX INFO: renamed from: e */
    public final Object f6082e;

    /* JADX INFO: renamed from: f */
    public final C1719c f6083f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1787b c1787b = C1787b.f6103a;
        f6080g = new C1778b(c1787b, c1787b, C1719c.f5958f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1778b(Object obj, Object obj2, C1719c c1719c) {
        this.f6081d = obj;
        this.f6082e = obj2;
        this.f6083f = c1719c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        C1719c c1719c = this.f6083f;
        c1719c.getClass();
        return c1719c.f5960e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6083f.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1779c(this.f6081d, this.f6083f);
    }
}
