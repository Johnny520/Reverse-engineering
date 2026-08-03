package p000;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oo */
/* JADX INFO: loaded from: classes.dex */
public final class C2330oo implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public String f8175a;

    /* JADX INFO: renamed from: b */
    public boolean f8176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2381po f8177c;

    public C2330oo(C2381po r1) {
        this.f8177c = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8175a != null) goto L10;
        if (this.f8176b == true) goto L10;
        String r0 = ((BufferedReader) this.f8177c.f8380b).readLine();
        this.f8175a = r0;
        if (r0 != null) goto L10;
        this.f8176b = true;
    L10:
        if (this.f8175a == null) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        String r0 = this.f8175a;
        this.f8175a = null;
        return r0;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
