package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛵᛶᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1119 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f5141;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1240 f5142;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5143;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f5144;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Iterator f5145;

    public C1119(C2722 c2722) {
        this.f5143 = 2;
        this.f5142 = c2722;
        this.f5145 = ((InterfaceC1240) c2722.f13374).iterator();
        this.f5141 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5143) {
            case 0:
                if (this.f5141 == -1) {
                    m2312();
                }
                return this.f5141 == 1;
            case 1:
                int i = this.f5141;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return m2314();
            default:
                if (this.f5141 == -1) {
                    m2313();
                }
                return this.f5141 == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5143) {
            case 0:
                if (this.f5141 == -1) {
                    m2312();
                }
                if (this.f5141 == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f5144;
                this.f5144 = null;
                this.f5141 = -1;
                return obj;
            case 1:
                int i = this.f5141;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !m2314()) {
                    throw new NoSuchElementException();
                }
                this.f5141 = 0;
                return ((Iterator) this.f5144).next();
            default:
                if (this.f5141 == -1) {
                    m2313();
                }
                if (this.f5141 == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f5144;
                this.f5144 = null;
                this.f5141 = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5143) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m2312() {
        Object next;
        C0497 c0497 = (C0497) this.f5142;
        do {
            Iterator it = this.f5145;
            if (!it.hasNext()) {
                this.f5141 = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c0497.f2436.mo371(next)).booleanValue() != c0497.f2435);
        this.f5144 = next;
        this.f5141 = 1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m2313() {
        Iterator it = this.f5145;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((C2722) this.f5142).f13373.mo371(next)).booleanValue()) {
                this.f5141 = 1;
                this.f5144 = next;
                return;
            }
        }
        this.f5141 = 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean m2314() {
        Iterator it;
        Iterator it2 = (Iterator) this.f5144;
        if (it2 != null && it2.hasNext()) {
            this.f5141 = 1;
            return true;
        }
        do {
            Iterator it3 = this.f5145;
            if (!it3.hasNext()) {
                this.f5141 = 2;
                this.f5144 = null;
                return false;
            }
            Object next = it3.next();
            C0378 c0378 = (C0378) this.f5142;
            it = (Iterator) c0378.f1952.mo371(c0378.f1951.mo371(next));
        } while (!it.hasNext());
        this.f5144 = it;
        this.f5141 = 1;
        return true;
    }

    public C1119(C0378 c0378) {
        this.f5143 = 1;
        this.f5142 = c0378;
        this.f5145 = c0378.f1950.iterator();
    }

    public C1119(C0497 c0497) {
        this.f5143 = 0;
        this.f5142 = c0497;
        this.f5145 = c0497.f2434.iterator();
        this.f5141 = -1;
    }
}
