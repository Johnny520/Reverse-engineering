package p040V0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: V0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0401d implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f891a;

    /* JADX INFO: renamed from: b */
    public final Iterator f892b;

    /* JADX INFO: renamed from: c */
    public int f893c;

    /* JADX INFO: renamed from: d */
    public Object f894d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0405h f895e;

    public C0401d(C0402e c0402e) {
        this.f891a = 0;
        this.f895e = c0402e;
        this.f892b = c0402e.f896a.iterator();
        this.f893c = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m987a() {
        Object next;
        C0402e c0402e;
        do {
            Iterator it = this.f892b;
            if (!it.hasNext()) {
                this.f893c = 0;
                return;
            } else {
                next = it.next();
                c0402e = (C0402e) this.f895e;
            }
        } while (((Boolean) c0402e.f898c.invoke(next)).booleanValue() != c0402e.f897b);
        this.f894d = next;
        this.f893c = 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m988b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f894d;
        if (it2 != null && it2.hasNext()) {
            this.f893c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f892b;
            if (!it3.hasNext()) {
                this.f893c = 2;
                this.f894d = null;
                return false;
            }
            Object next = it3.next();
            C0403f c0403f = (C0403f) this.f895e;
            c0403f.getClass();
            it = (Iterator) C0411n.f911i.invoke(c0403f.f901c.invoke(next));
        } while (!it.hasNext());
        this.f894d = it;
        this.f893c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f891a) {
            case 0:
                if (this.f893c == -1) {
                    m987a();
                }
                return this.f893c == 1;
            default:
                int i2 = this.f893c;
                if (i2 == 1) {
                    return true;
                }
                if (i2 == 2) {
                    return false;
                }
                return m988b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f891a) {
            case 0:
                if (this.f893c == -1) {
                    m987a();
                }
                if (this.f893c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f894d;
                this.f894d = null;
                this.f893c = -1;
                return obj;
            default:
                int i2 = this.f893c;
                if (i2 == 2) {
                    throw new NoSuchElementException();
                }
                if (i2 == 0 && !m988b()) {
                    throw new NoSuchElementException();
                }
                this.f893c = 0;
                Iterator it = (Iterator) this.f894d;
                AbstractC0307g.m700b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f891a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0401d(C0403f c0403f) {
        this.f891a = 1;
        this.f895e = c0403f;
        this.f892b = c0403f.f900b.iterator();
    }
}
