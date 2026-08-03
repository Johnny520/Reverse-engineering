package ng;

import bsh.C0353j;
import java.util.Iterator;
import p054dg.C0791j;
import p085fg.InterfaceC1231l;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: ng.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3010h implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9800g;

    /* JADX INFO: renamed from: h */
    public final Iterator f9801h;

    /* JADX INFO: renamed from: i */
    public int f9802i;

    /* JADX INFO: renamed from: j */
    public Object f9803j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3012j f9804k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3010h(C3011i c3011i) {
        this.f9800g = 0;
        this.f9804k = c3011i;
        this.f9801h = c3011i.f9805a.iterator();
        this.f9802i = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m6404a() {
        Object next;
        C3011i c3011i = (C3011i) this.f9804k;
        do {
            Iterator it = this.f9801h;
            if (!it.hasNext()) {
                this.f9802i = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c3011i.f9807c.invoke(next)).booleanValue() != c3011i.f9806b);
        this.f9803j = next;
        this.f9802i = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m6405c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f9803j;
        if (it2 != null && it2.hasNext()) {
            this.f9802i = 1;
            return true;
        }
        do {
            Iterator it3 = this.f9801h;
            if (!it3.hasNext()) {
                this.f9802i = 2;
                this.f9803j = null;
                return false;
            }
            Object next = it3.next();
            C0791j c0791j = (C0791j) this.f9804k;
            it = (Iterator) ((InterfaceC1231l) c0791j.f2374d).invoke(c0791j.f2372b.invoke(next));
        } while (!it.hasNext());
        this.f9803j = it;
        this.f9802i = 1;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9800g) {
            case 0:
                if (this.f9802i == -1) {
                    m6404a();
                }
                return this.f9802i == 1;
            default:
                int i9 = this.f9802i;
                if (i9 == 1) {
                    return true;
                }
                if (i9 == 2) {
                    return false;
                }
                return m6405c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9800g) {
            case 0:
                if (this.f9802i == -1) {
                    m6404a();
                }
                if (this.f9802i == 0) {
                    C0353j.m1307e();
                    return null;
                }
                Object obj = this.f9803j;
                this.f9803j = null;
                this.f9802i = -1;
                return obj;
            default:
                int i9 = this.f9802i;
                if (i9 == 2) {
                    C0353j.m1307e();
                } else {
                    if (i9 != 0 || m6405c()) {
                        this.f9802i = 0;
                        Iterator it = (Iterator) this.f9803j;
                        it.getClass();
                        return it.next();
                    }
                    C0353j.m1307e();
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9800g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3010h(C0791j c0791j) {
        this.f9800g = 1;
        this.f9804k = c0791j;
        this.f9801h = ((InterfaceC3012j) c0791j.f2373c).iterator();
    }
}
