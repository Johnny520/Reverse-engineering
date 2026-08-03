package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: uh */
/* JADX INFO: loaded from: classes.dex */
public final class C2589uh implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f8960a;

    /* JADX INFO: renamed from: b */
    public File f8961b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f8962c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2499sd f8963d;

    public C2589uh(C2499sd c2499sd) {
        this.f8963d = c2499sd;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f8962c = arrayDeque;
        File file = (File) c2499sd.f8787d;
        if (file.isDirectory()) {
            arrayDeque.push(m5098a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C2503sh(file));
        } else {
            this.f8960a = 2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2417qh m5098a(File file) {
        int iM424v = AbstractC0213Ey.m424v(this.f8963d.f8785b);
        if (iM424v == 0) {
            return new C2546th(this, file);
        }
        if (iM424v == 1) {
            return new C2460rh(this, file);
        }
        throw new C0232Fa();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5099b() {
        File file;
        File fileMo4952a;
        this.f8960a = 3;
        while (true) {
            ArrayDeque arrayDeque = this.f8962c;
            AbstractC2632vh abstractC2632vh = (AbstractC2632vh) arrayDeque.peek();
            if (abstractC2632vh == null) {
                file = null;
                break;
            }
            fileMo4952a = abstractC2632vh.mo4952a();
            if (fileMo4952a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo4952a.equals(abstractC2632vh.f9142a) || !fileMo4952a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(m5098a(fileMo4952a));
            }
        }
        file = fileMo4952a;
        if (file != null) {
            this.f8961b = file;
            this.f8960a = 1;
        } else {
            this.f8960a = 2;
        }
        return this.f8960a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f8960a;
        if (i == 0) {
            return m5099b();
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
        int i = this.f8960a;
        if (i == 1) {
            this.f8960a = 0;
            return this.f8961b;
        }
        if (i == 2 || !m5099b()) {
            throw new NoSuchElementException();
        }
        this.f8960a = 0;
        return this.f8961b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
