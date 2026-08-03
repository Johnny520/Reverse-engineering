package p026N0;

import java.io.BufferedReader;
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

    public C0271l(C0180k r1) {
        this.f568c = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f566a != null) goto L10;
        if (this.f567b == true) goto L10;
        String r02 = ((BufferedReader) this.f568c.f398b).readLine();
        this.f566a = r02;
        if (r02 != null) goto L10;
        this.f567b = true;
    L10:
        if (this.f566a != null) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        String r02 = this.f566a;
        this.f566a = null;
        AbstractC0307g.m700b(r02);
        return r02;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
