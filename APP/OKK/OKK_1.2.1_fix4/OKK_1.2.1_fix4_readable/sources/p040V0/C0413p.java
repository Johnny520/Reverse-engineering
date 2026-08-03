package p040V0;

import java.util.Iterator;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: V0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0413p implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final Iterator f914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0403f f915b;

    public C0413p(C0403f c0403f) {
        this.f915b = c0403f;
        this.f914a = c0403f.f900b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f914a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f915b.f901c.invoke(this.f914a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
