package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g43 extends AbstractC0869x2 {

    /* JADX INFO: renamed from: j */
    public int f3308j;

    /* JADX INFO: renamed from: k */
    public Object[] f3309k;

    /* JADX INFO: renamed from: l */
    public boolean f3310l;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public g43(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f3308j = i3;
        Object[] objArr2 = new Object[i3];
        this.f3309k = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f3310l = r5;
        objArr2[0] = objArr;
        m1804b(i - r5, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m1803a() {
        int i = this.f12770h & 31;
        Object obj = this.f3309k[this.f3308j - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    /* JADX INFO: renamed from: b */
    public final void m1804b(int i, int i2) {
        int i3 = (this.f3308j - i2) * 5;
        while (i2 < this.f3308j) {
            Object[] objArr = this.f3309k;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[ig3.m2346a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1805c(int i) {
        int i2 = 0;
        while (ig3.m2346a(this.f12770h, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m1804b(this.f12770h, ((this.f3308j - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        Object objM1803a = m1803a();
        int i = this.f12770h + 1;
        this.f12770h = i;
        if (i == this.f12771i) {
            this.f3310l = true;
            return objM1803a;
        }
        m1805c(0);
        return objM1803a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            um2.m5513b();
            return null;
        }
        this.f12770h--;
        if (this.f3310l) {
            this.f3310l = false;
            return m1803a();
        }
        m1805c(31);
        return m1803a();
    }
}
