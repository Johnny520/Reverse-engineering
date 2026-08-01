package p011F0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0114b implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public EnumC0136x f410a = EnumC0136x.f430b;

    /* JADX INFO: renamed from: b */
    public Object f411b;

    /* JADX INFO: renamed from: a */
    public abstract void mo249a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC0136x enumC0136x = this.f410a;
        EnumC0136x enumC0136x2 = EnumC0136x.f432d;
        if (enumC0136x == enumC0136x2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iOrdinal = enumC0136x.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f410a = enumC0136x2;
        mo249a();
        return this.f410a == EnumC0136x.f429a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f410a = EnumC0136x.f430b;
        return this.f411b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
