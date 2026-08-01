package sb;

import bsh.C1189h4;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p036c9.InterfaceC1400a;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: sb.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7283i extends AbstractC7284j implements Iterator, InterfaceC5976f, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public int f24197q;

    /* JADX INFO: renamed from: r */
    public Object f24198r;

    /* JADX INFO: renamed from: s */
    public Iterator f24199s;

    /* JADX INFO: renamed from: t */
    public InterfaceC5976f f24200t;

    /* JADX INFO: renamed from: A */
    public final Object m28869A() {
        if (hasNext()) {
            return next();
        }
        C1189h4.m4429a();
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final void m28870C(InterfaceC5976f interfaceC5976f) {
        this.f24200t = interfaceC5976f;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return C5981k.f18917q;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f24197q;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m28872y();
                }
                Iterator it = this.f24199s;
                it.getClass();
                if (it.hasNext()) {
                    this.f24197q = 2;
                    return true;
                }
                this.f24199s = null;
            }
            this.f24197q = 5;
            InterfaceC5976f interfaceC5976f = this.f24200t;
            interfaceC5976f.getClass();
            this.f24200t = null;
            interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f24197q;
        if (i10 == 0 || i10 == 1) {
            return m28869A();
        }
        if (i10 == 2) {
            this.f24197q = 1;
            Iterator it = this.f24199s;
            it.getClass();
            return it.next();
        }
        if (i10 != 3) {
            throw m28872y();
        }
        this.f24197q = 0;
        Object obj = this.f24198r;
        this.f24198r = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) throws Throwable {
        AbstractC4713t.m18808b(obj);
        this.f24197q = 4;
    }

    @Override // sb.AbstractC7284j
    /* JADX INFO: renamed from: x */
    public Object mo28871x(Object obj, InterfaceC5976f interfaceC5976f) {
        this.f24198r = obj;
        this.f24197q = 3;
        this.f24200t = interfaceC5976f;
        Object objM24992g = AbstractC6325c.m24992g();
        if (objM24992g == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM24992g == AbstractC6325c.m24992g() ? objM24992g : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: y */
    public final Throwable m28872y() {
        int i10 = this.f24197q;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24197q);
    }
}
