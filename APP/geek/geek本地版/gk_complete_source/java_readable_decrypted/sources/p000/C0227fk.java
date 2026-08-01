package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: fk */
/* JADX INFO: loaded from: classes.dex */
public final class C0227fk implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f1973a;

    /* JADX INFO: renamed from: b */
    public File f1974b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f1975c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0260gg f1976d;

    public C0227fk(C0260gg c0260gg) {
        this.f1976d = c0260gg;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1975c = arrayDeque;
        File file = (File) c0260gg.f2125b;
        if (file.isDirectory()) {
            arrayDeque.push(m1231a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C0154dk(file));
        } else {
            this.f1973a = 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0071bk m1231a(File file) {
        int iOrdinal = ((EnumC0301hk) this.f1976d.f2126c).ordinal();
        if (iOrdinal == 0) {
            return new C0190ek(file);
        }
        if (iOrdinal == 1) {
            return new C0107ck(file);
        }
        throw new C0591pb();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1232b() {
        File file;
        File fileMo692a;
        this.f1973a = 3;
        while (true) {
            ArrayDeque arrayDeque = this.f1975c;
            AbstractC0264gk abstractC0264gk = (AbstractC0264gk) arrayDeque.peek();
            if (abstractC0264gk == null) {
                file = null;
                break;
            }
            fileMo692a = abstractC0264gk.mo692a();
            if (fileMo692a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo692a.equals(abstractC0264gk.f2135a) || !fileMo692a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(m1231a(fileMo692a));
            }
        }
        file = fileMo692a;
        if (file != null) {
            this.f1974b = file;
            this.f1973a = 1;
        } else {
            this.f1973a = 2;
        }
        return this.f1973a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f1973a;
        if (i == 0) {
            return m1232b();
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
        int i = this.f1973a;
        if (i == 1) {
            this.f1973a = 0;
            return this.f1974b;
        }
        if (i == 2 || !m1232b()) {
            throw new NoSuchElementException();
        }
        this.f1973a = 0;
        return this.f1974b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
