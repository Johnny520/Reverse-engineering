package p026N0;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p009E0.C0180k;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: N0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0271l implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public String f566a;

    /* JADX INFO: renamed from: b */
    public boolean f567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0180k f568c;

    public C0271l(C0180k c0180k) {
        this.f568c = c0180k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f566a == null && !this.f567b) {
            String line = ((BufferedReader) this.f568c.f398b).readLine();
            this.f566a = line;
            if (line == null) {
                this.f567b = true;
            }
        }
        return this.f566a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f566a;
        this.f566a = null;
        AbstractC0307g.m700b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
