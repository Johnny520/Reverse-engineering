package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class k91 extends AbstractC0982z {

    /* JADX INFO: renamed from: f */
    public int f3051f;

    /* JADX INFO: renamed from: g */
    public Object[] f3052g;

    /* JADX INFO: renamed from: h */
    public boolean f3053h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k91(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f3051f = i3;
        Object[] objArr2 = new Object[i3];
        this.f3052g = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f3053h = r5;
        objArr2[0] = objArr;
        m1780b(i - r5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m1779a() {
        int i = this.f7744d & 31;
        Object obj = this.f3052g[this.f3051f - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1780b(int i, int i2) {
        int i3 = (this.f3051f - i2) * 5;
        while (i2 < this.f3051f) {
            Object[] objArr = this.f3052g;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[j50.m1668r(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1781c(int i) {
        int i2 = 0;
        while (j50.m1668r(this.f7744d, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m1780b(this.f7744d, ((this.f3051f - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        Object objM1779a = m1779a();
        int i = this.f7744d + 1;
        this.f7744d = i;
        if (i == this.f7745e) {
            this.f3053h = true;
            return objM1779a;
        }
        m1781c(0);
        return objM1779a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0921xc.m5132m();
            return null;
        }
        this.f7744d--;
        if (this.f3053h) {
            this.f3053h = false;
            return m1779a();
        }
        m1781c(31);
        return m1779a();
    }
}
