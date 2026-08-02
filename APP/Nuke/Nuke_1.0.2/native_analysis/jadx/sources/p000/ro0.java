package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9653h;

    /* JADX INFO: renamed from: i */
    public int f9654i;

    /* JADX INFO: renamed from: j */
    public Object f9655j;

    /* JADX INFO: renamed from: k */
    public final Object f9656k;

    public ro0(uk1 uk1Var) {
        this.f9653h = 2;
        this.f9656k = uk1Var;
        this.f9654i = -1;
        this.f9655j = tp0.m5340B(new tk1(uk1Var, this, null));
    }

    /* JADX INFO: renamed from: a */
    public void m4516a() {
        Object objMo5j;
        int i = this.f9654i;
        c70 c70Var = (c70) this.f9656k;
        if (i == -2) {
            objMo5j = ((xm0) c70Var.f1218b).mo6a();
        } else {
            in0 in0Var = (in0) c70Var.f1219c;
            Object obj = this.f9655j;
            obj.getClass();
            objMo5j = in0Var.mo5j(obj);
        }
        this.f9655j = objMo5j;
        this.f9654i = objMo5j == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9653h) {
            case 0:
                if (this.f9654i < 0) {
                    m4516a();
                }
                return this.f9654i == 1;
            case 1:
                return ((vo2) this.f9655j).hasNext();
            case 2:
                return ((vo2) this.f9655j).hasNext();
            default:
                return this.f9654i < ((Map) this.f9656k).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.f9653h) {
            case 0:
                if (this.f9654i < 0) {
                    m4516a();
                }
                if (this.f9654i == 0) {
                    um2.m5513b();
                    return null;
                }
                Object obj2 = this.f9655j;
                obj2.getClass();
                this.f9654i = -1;
                return obj2;
            case 1:
                return ((vo2) this.f9655j).next();
            case 2:
                return ((vo2) this.f9655j).next();
            default:
                if (hasNext()) {
                    obj = this.f9655j;
                    this.f9654i++;
                    Object obj3 = ((Map) this.f9656k).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f9655j = ((nb1) obj3).f7104b;
                } else {
                    um2.m5513b();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f9653h;
        Object obj = this.f9656k;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f9654i;
                if (i2 != -1) {
                    ((ok1) obj).f7703i.m3131h(i2);
                    this.f9654i = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f9654i;
                if (i3 != -1) {
                    ((uk1) obj).f11341i.m4894m(i3);
                    this.f9654i = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ro0(c70 c70Var) {
        this.f9653h = 0;
        this.f9656k = c70Var;
        this.f9654i = -2;
    }

    public ro0(Object obj, Map map) {
        this.f9653h = 3;
        this.f9655j = obj;
        this.f9656k = map;
    }

    public ro0(ok1 ok1Var) {
        this.f9653h = 1;
        this.f9656k = ok1Var;
        this.f9654i = -1;
        this.f9655j = tp0.m5340B(new nk1(ok1Var, this, null));
    }
}
