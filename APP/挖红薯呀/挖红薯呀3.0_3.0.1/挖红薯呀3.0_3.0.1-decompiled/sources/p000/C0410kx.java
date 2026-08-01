package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: kx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0410kx implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3280d;

    /* JADX INFO: renamed from: e */
    public int f3281e;

    /* JADX INFO: renamed from: f */
    public Object f3282f;

    /* JADX INFO: renamed from: g */
    public final Object f3283g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0410kx(mh0 mh0Var) {
        this.f3280d = 2;
        this.f3283g = mh0Var;
        this.f3281e = -1;
        this.f3282f = v50.m4408n(new lh0(mh0Var, this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m1959a() {
        Object objInvoke;
        int i = this.f3281e;
        C0447lx c0447lx = (C0447lx) this.f3283g;
        if (i == -2) {
            objInvoke = c0447lx.f3612a.invoke();
        } else {
            InterfaceC0742sw interfaceC0742sw = c0447lx.f3613b;
            Object obj = this.f3282f;
            obj.getClass();
            objInvoke = interfaceC0742sw.invoke(obj);
        }
        this.f3282f = objInvoke;
        this.f3281e = objInvoke == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3280d) {
            case 0:
                if (this.f3281e < 0) {
                    m1959a();
                }
                return this.f3281e == 1;
            case 1:
                return ((q01) this.f3282f).hasNext();
            case 2:
                return ((q01) this.f3282f).hasNext();
            default:
                return this.f3281e < ((Map) this.f3283g).size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.f3280d) {
            case 0:
                if (this.f3281e < 0) {
                    m1959a();
                }
                if (this.f3281e == 0) {
                    C0921xc.m5132m();
                    return null;
                }
                Object obj2 = this.f3282f;
                obj2.getClass();
                this.f3281e = -1;
                return obj2;
            case 1:
                return ((q01) this.f3282f).next();
            case 2:
                return ((q01) this.f3282f).next();
            default:
                if (hasNext()) {
                    obj = this.f3282f;
                    this.f3281e++;
                    Object obj3 = ((Map) this.f3283g).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f3282f = ((ua0) obj3).f6175b;
                } else {
                    C0921xc.m5132m();
                }
                return obj;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f3280d;
        Object obj = this.f3283g;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f3281e;
                if (i2 != -1) {
                    ((gh0) obj).f1995e.m936h(i2);
                    this.f3281e = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f3281e;
                if (i3 != -1) {
                    ((mh0) obj).f3982e.m1902m(i3);
                    this.f3281e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0410kx(C0447lx c0447lx) {
        this.f3280d = 0;
        this.f3283g = c0447lx;
        this.f3281e = -2;
    }

    public C0410kx(Object obj, Map map) {
        this.f3280d = 3;
        this.f3282f = obj;
        this.f3283g = map;
    }

    public C0410kx(gh0 gh0Var) {
        this.f3280d = 1;
        this.f3283g = gh0Var;
        this.f3281e = -1;
        this.f3282f = v50.m4408n(new fh0(gh0Var, this, null));
    }
}
