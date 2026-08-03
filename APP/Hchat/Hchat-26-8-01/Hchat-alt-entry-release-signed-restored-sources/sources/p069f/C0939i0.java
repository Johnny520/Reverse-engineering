package p069f;

import bsh.C0353j;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import ng.C3005c;
import ng.C3013k;
import ng.C3020r;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p114hg.InterfaceC1711a;
import p235q0.C3419a;

/* JADX INFO: renamed from: f.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0939i0 implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2956g;

    /* JADX INFO: renamed from: h */
    public int f2957h;

    /* JADX INFO: renamed from: i */
    public Object f2958i;

    /* JADX INFO: renamed from: j */
    public final Object f2959j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0939i0(C0949n0 c0949n0) {
        this.f2956g = 1;
        this.f2959j = c0949n0;
        this.f2957h = -1;
        this.f2958i = AbstractC1184v0.m3175B(new C0947m0(c0949n0, this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2311a() {
        Object objInvoke;
        int i9 = this.f2957h;
        C3005c c3005c = (C3005c) this.f2959j;
        if (i9 == -2) {
            objInvoke = ((InterfaceC1220a) c3005c.f9792c).invoke();
        } else {
            InterfaceC1231l interfaceC1231l = c3005c.f9791b;
            Object obj = this.f2958i;
            obj.getClass();
            objInvoke = interfaceC1231l.invoke(obj);
        }
        this.f2958i = objInvoke;
        this.f2957h = objInvoke == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2956g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                if (this.f2957h < 0) {
                    m2311a();
                }
                if (this.f2957h == 1) {
                }
                break;
            case 3:
                C3020r c3020r = (C3020r) this.f2959j;
                Iterator it = (Iterator) this.f2958i;
                while (this.f2957h < c3020r.f9818b && it.hasNext()) {
                    it.next();
                    this.f2957h++;
                }
                if (this.f2957h >= c3020r.f9819c || !it.hasNext()) {
                }
                break;
            default:
                if (this.f2957h < ((Map) this.f2959j).size()) {
                }
                break;
        }
        return ((C3013k) this.f2958i).hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2956g) {
            case 0:
                return ((C3013k) this.f2958i).next();
            case 1:
                return ((C3013k) this.f2958i).next();
            case 2:
                if (this.f2957h < 0) {
                    m2311a();
                }
                if (this.f2957h == 0) {
                    C0353j.m1307e();
                    return null;
                }
                Object obj = this.f2958i;
                obj.getClass();
                this.f2957h = -1;
                return obj;
            case 3:
                C3020r c3020r = (C3020r) this.f2959j;
                Iterator it = (Iterator) this.f2958i;
                while (this.f2957h < c3020r.f9818b && it.hasNext()) {
                    it.next();
                    this.f2957h++;
                }
                int i9 = this.f2957h;
                if (i9 < c3020r.f9819c) {
                    this.f2957h = i9 + 1;
                    return it.next();
                }
                C0353j.m1307e();
                return null;
            default:
                if (!hasNext()) {
                    C0353j.m1307e();
                    return null;
                }
                Object obj2 = this.f2958i;
                this.f2957h++;
                Object obj3 = ((Map) this.f2959j).get(obj2);
                if (obj3 != null) {
                    this.f2958i = ((C3419a) obj3).f11045b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2956g) {
            case 0:
                int i9 = this.f2957h;
                if (i9 != -1) {
                    ((C0941j0) this.f2959j).f2962h.m2309h(i9);
                    this.f2957h = -1;
                    return;
                }
                return;
            case 1:
                int i10 = this.f2957h;
                if (i10 != -1) {
                    ((C0949n0) this.f2959j).f2995h.m2340m(i10);
                    this.f2957h = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0939i0(C3020r c3020r) {
        this.f2956g = 3;
        this.f2959j = c3020r;
        this.f2958i = c3020r.f9817a.iterator();
    }

    public C0939i0(C3005c c3005c) {
        this.f2956g = 2;
        this.f2959j = c3005c;
        this.f2957h = -2;
    }

    public C0939i0(Object obj, Map map) {
        this.f2956g = 4;
        this.f2958i = obj;
        this.f2959j = map;
    }

    public C0939i0(C0941j0 c0941j0) {
        this.f2956g = 0;
        this.f2959j = c0941j0;
        this.f2957h = -1;
        this.f2958i = AbstractC1184v0.m3175B(new C0937h0(c0941j0, this, null));
    }
}
