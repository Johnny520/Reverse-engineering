package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 extends AbstractC0982z {

    /* JADX INFO: renamed from: f */
    public final qq0 f5819f;

    /* JADX INFO: renamed from: g */
    public int f5820g;

    /* JADX INFO: renamed from: h */
    public k91 f5821h;

    /* JADX INFO: renamed from: i */
    public int f5822i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sq0(qq0 qq0Var, int i) {
        super(i, qq0Var.f5216k);
        this.f5819f = qq0Var;
        this.f5820g = qq0Var.m3302e();
        this.f5822i = -1;
        m4100b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4099a() {
        if (this.f5820g != this.f5819f.m3302e()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0982z, java.util.ListIterator
    public final void add(Object obj) {
        m4099a();
        int i = this.f7744d;
        qq0 qq0Var = this.f5819f;
        qq0Var.add(i, obj);
        this.f7744d++;
        this.f7745e = qq0Var.mo0a();
        this.f5820g = qq0Var.m3302e();
        this.f5822i = -1;
        m4100b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: b */
    public final void m4100b() {
        qq0 qq0Var = this.f5819f;
        Object[] objArr = qq0Var.f5214i;
        if (objArr == null) {
            this.f5821h = null;
            return;
        }
        int i = (qq0Var.f5216k - 1) & (-32);
        int i2 = this.f7744d;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (qq0Var.f5212g / 5) + 1;
        k91 k91Var = this.f5821h;
        if (k91Var == null) {
            this.f5821h = new k91(objArr, i2, i, i3);
            return;
        }
        k91Var.f7744d = i2;
        k91Var.f7745e = i;
        k91Var.f3051f = i3;
        if (k91Var.f3052g.length < i3) {
            k91Var.f3052g = new Object[i3];
        }
        k91Var.f3052g[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        k91Var.f3053h = r0;
        k91Var.m1780b(i2 - r0, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m4099a();
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        int i = this.f7744d;
        this.f5822i = i;
        k91 k91Var = this.f5821h;
        qq0 qq0Var = this.f5819f;
        if (k91Var == null) {
            Object[] objArr = qq0Var.f5215j;
            this.f7744d = i + 1;
            return objArr[i];
        }
        if (k91Var.hasNext()) {
            this.f7744d++;
            return k91Var.next();
        }
        Object[] objArr2 = qq0Var.f5215j;
        int i2 = this.f7744d;
        this.f7744d = i2 + 1;
        return objArr2[i2 - k91Var.f7745e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        m4099a();
        if (!hasPrevious()) {
            C0921xc.m5132m();
            return null;
        }
        int i = this.f7744d;
        this.f5822i = i - 1;
        k91 k91Var = this.f5821h;
        qq0 qq0Var = this.f5819f;
        if (k91Var == null) {
            Object[] objArr = qq0Var.f5215j;
            int i2 = i - 1;
            this.f7744d = i2;
            return objArr[i2];
        }
        int i3 = k91Var.f7745e;
        if (i <= i3) {
            this.f7744d = i - 1;
            return k91Var.previous();
        }
        Object[] objArr2 = qq0Var.f5215j;
        int i4 = i - 1;
        this.f7744d = i4;
        return objArr2[i4 - i3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0982z, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m4099a();
        int i = this.f5822i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        qq0 qq0Var = this.f5819f;
        qq0Var.mo1b(i);
        int i2 = this.f5822i;
        if (i2 < this.f7744d) {
            this.f7744d = i2;
        }
        this.f7745e = qq0Var.mo0a();
        this.f5820g = qq0Var.m3302e();
        this.f5822i = -1;
        m4100b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0982z, java.util.ListIterator
    public final void set(Object obj) {
        m4099a();
        int i = this.f5822i;
        if (i == -1) {
            throw new IllegalStateException();
        }
        qq0 qq0Var = this.f5819f;
        qq0Var.set(i, obj);
        this.f5820g = qq0Var.m3302e();
        m4100b();
    }
}
