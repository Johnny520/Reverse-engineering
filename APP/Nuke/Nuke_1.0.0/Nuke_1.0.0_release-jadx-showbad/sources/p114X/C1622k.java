package p114X;

import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: X.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1622k extends AbstractC1612a {

    /* JADX INFO: renamed from: f */
    public int f5580f;

    /* JADX INFO: renamed from: g */
    public Object[] f5581g;

    /* JADX INFO: renamed from: h */
    public boolean f5582h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C1622k(Object[] objArr, int i5, int i6, int i7) {
        super(i5, i6);
        this.f5580f = i7;
        Object[] objArr2 = new Object[i7];
        this.f5581g = objArr2;
        ?? r5 = i5 == i6 ? 1 : 0;
        this.f5582h = r5;
        objArr2[0] = objArr;
        m2925b(i5 - r5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m2924a() {
        int i5 = this.f5553d & 31;
        Object obj = this.f5581g[this.f5580f - 1];
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2925b(int i5, int i6) {
        int i7 = (this.f5580f - i6) * 5;
        while (i6 < this.f5580f) {
            Object[] objArr = this.f5581g;
            Object obj = objArr[i6 - 1];
            AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i6] = ((Object[]) obj)[AbstractC2352g.m4209v(i5, i7)];
            i7 -= 5;
            i6++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2926c(int i5) {
        int i6 = 0;
        while (AbstractC2352g.m4209v(this.f5553d, i6) == i5) {
            i6 += 5;
        }
        if (i6 > 0) {
            m2925b(this.f5553d, ((this.f5580f - 1) - (i6 / 5)) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM2924a = m2924a();
        int i5 = this.f5553d + 1;
        this.f5553d = i5;
        if (i5 == this.f5554e) {
            this.f5582h = true;
            return objM2924a;
        }
        m2926c(0);
        return objM2924a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f5553d--;
        if (this.f5582h) {
            this.f5582h = false;
            return m2924a();
        }
        m2926c(31);
        return m2924a();
    }
}
