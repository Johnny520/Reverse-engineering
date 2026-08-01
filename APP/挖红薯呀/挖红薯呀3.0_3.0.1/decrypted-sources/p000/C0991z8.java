package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0991z8 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public int f7830d;

    /* JADX INFO: renamed from: e */
    public int f7831e;

    /* JADX INFO: renamed from: f */
    public boolean f7832f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7833g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7834h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0991z8(C0121d9 c0121d9, int i) {
        this(c0121d9.f4120f);
        this.f7833g = i;
        switch (i) {
            case 1:
                this.f7834h = c0121d9;
                this(c0121d9.f4120f);
                break;
            default:
                this.f7834h = c0121d9;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7831e < this.f7830d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM2622e;
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        int i = this.f7831e;
        int i2 = this.f7833g;
        Object obj = this.f7834h;
        switch (i2) {
            case 0:
                objM2622e = ((C0121d9) obj).m2622e(i);
                break;
            case 1:
                objM2622e = ((C0121d9) obj).m2625h(i);
                break;
            default:
                objM2622e = ((C0164e9) obj).f1351e[i];
                break;
        }
        this.f7831e++;
        this.f7832f = true;
        return objM2622e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7832f) {
            C0921xc.m5134o("Call next() before removing an element.");
            return;
        }
        int i = this.f7831e - 1;
        this.f7831e = i;
        int i2 = this.f7833g;
        Object obj = this.f7834h;
        switch (i2) {
            case 0:
                ((C0121d9) obj).m2623f(i);
                break;
            case 1:
                ((C0121d9) obj).m2623f(i);
                break;
            default:
                ((C0164e9) obj).m802a(i);
                break;
        }
        this.f7830d--;
        this.f7832f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0991z8(C0164e9 c0164e9) {
        this(c0164e9.f1352f);
        this.f7833g = 2;
        this.f7834h = c0164e9;
    }

    public C0991z8(int i) {
        this.f7830d = i;
    }
}
