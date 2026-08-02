package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: dg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0129dg implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public int f2036h;

    /* JADX INFO: renamed from: i */
    public int f2037i;

    /* JADX INFO: renamed from: j */
    public boolean f2038j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f2039k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2040l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0129dg(C0276hg c0276hg, int i) {
        this(c0276hg.f11446j);
        this.f2039k = i;
        switch (i) {
            case 1:
                this.f2040l = c0276hg;
                this(c0276hg.f11446j);
                break;
            default:
                this.f2040l = c0276hg;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2037i < this.f2036h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM5569f;
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        int i = this.f2037i;
        int i2 = this.f2039k;
        Object obj = this.f2040l;
        switch (i2) {
            case 0:
                objM5569f = ((C0276hg) obj).m5569f(i);
                break;
            case 1:
                objM5569f = ((C0276hg) obj).m5570j(i);
                break;
            default:
                objM5569f = ((C0349jg) obj).f5021i[i];
                break;
        }
        this.f2037i++;
        this.f2038j = true;
        return objM5569f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2038j) {
            C0676s.m4653l("Call next() before removing an element.");
            return;
        }
        int i = this.f2037i - 1;
        this.f2037i = i;
        int i2 = this.f2039k;
        Object obj = this.f2040l;
        switch (i2) {
            case 0:
                ((C0276hg) obj).mo4514h(i);
                break;
            case 1:
                ((C0276hg) obj).mo4514h(i);
                break;
            default:
                ((C0349jg) obj).m2495a(i);
                break;
        }
        this.f2036h--;
        this.f2038j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0129dg(C0349jg c0349jg) {
        this(c0349jg.f5022j);
        this.f2039k = 2;
        this.f2040l = c0349jg;
    }

    public C0129dg(int i) {
        this.f2036h = i;
    }
}
