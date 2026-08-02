package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dg implements Iterator, q41 {
    public int h;
    public int i;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dg(hg hgVar, int i) {
        this(hgVar.j);
        this.k = i;
        switch (i) {
            case 1:
                this.l = hgVar;
                this(hgVar.j);
                break;
            default:
                this.l = hgVar;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            um2.b();
            return null;
        }
        int i = this.i;
        int i2 = this.k;
        Object obj = this.l;
        switch (i2) {
            case 0:
                objF = ((hg) obj).f(i);
                break;
            case 1:
                objF = ((hg) obj).j(i);
                break;
            default:
                objF = ((jg) obj).i[i];
                break;
        }
        this.i++;
        this.j = true;
        return objF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            s.l("Call next() before removing an element.");
            return;
        }
        int i = this.i - 1;
        this.i = i;
        int i2 = this.k;
        Object obj = this.l;
        switch (i2) {
            case 0:
                ((hg) obj).h(i);
                break;
            case 1:
                ((hg) obj).h(i);
                break;
            default:
                ((jg) obj).a(i);
                break;
        }
        this.h--;
        this.j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dg(jg jgVar) {
        this(jgVar.j);
        this.k = 2;
        this.l = jgVar;
    }

    public dg(int i) {
        this.h = i;
    }
}
