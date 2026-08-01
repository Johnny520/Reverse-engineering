package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: hk */
/* JADX INFO: loaded from: classes.dex */
public final class C0301hk implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f2232a;

    /* JADX INFO: renamed from: b */
    public File f2233b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f2234c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0297hg f2235d;

    public C0301hk(C0297hg c0297hg) {
        this.f2235d = c0297hg;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2234c = arrayDeque;
        File file = (File) c0297hg.f2222b;
        if (file.isDirectory()) {
            arrayDeque.push(m1404a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C0227fk(file));
        } else {
            this.f2232a = 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0154dk m1404a(File file) {
        int iOrdinal = ((EnumC0377jk) this.f2235d.f2223c).ordinal();
        if (iOrdinal == 0) {
            return new C0264gk(file);
        }
        if (iOrdinal == 1) {
            return new C0190ek(file);
        }
        throw new C0924yb();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1405b() {
        File file;
        File fileMo999a;
        this.f2232a = 3;
        while (true) {
            ArrayDeque arrayDeque = this.f2234c;
            AbstractC0337ik abstractC0337ik = (AbstractC0337ik) arrayDeque.peek();
            if (abstractC0337ik == null) {
                file = null;
                break;
            }
            fileMo999a = abstractC0337ik.mo999a();
            if (fileMo999a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo999a.equals(abstractC0337ik.f2547a) || !fileMo999a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(m1404a(fileMo999a));
            }
        }
        file = fileMo999a;
        if (file != null) {
            this.f2233b = file;
            this.f2232a = 1;
        } else {
            this.f2232a = 2;
        }
        return this.f2232a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2232a;
        if (i == 0) {
            return m1405b();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2232a;
        if (i == 1) {
            this.f2232a = 0;
            return this.f2233b;
        }
        if (i == 2 || !m1405b()) {
            throw new NoSuchElementException();
        }
        this.f2232a = 0;
        return this.f2233b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
