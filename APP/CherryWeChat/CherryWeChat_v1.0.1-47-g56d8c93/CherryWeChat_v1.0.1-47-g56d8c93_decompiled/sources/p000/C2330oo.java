package p000;

import java.io.BufferedReader;
import java.io.IOException;
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

    public C2330oo(C2381po c2381po) {
        this.f8177c = c2381po;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f8175a == null && !this.f8176b) {
            String line = ((BufferedReader) this.f8177c.f8380b).readLine();
            this.f8175a = line;
            if (line == null) {
                this.f8176b = true;
            }
        }
        return this.f8175a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f8175a;
        this.f8175a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
