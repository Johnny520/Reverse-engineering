package tf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: tf.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4154c0 extends AbstractC4159f implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public final Object[] f13686g;

    /* JADX INFO: renamed from: h */
    public final int f13687h;

    /* JADX INFO: renamed from: i */
    public int f13688i;

    /* JADX INFO: renamed from: j */
    public int f13689j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4154c0(int i9, Object[] objArr) {
        this.f13686g = objArr;
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i9 <= objArr.length) {
            this.f13687h = objArr.length;
            this.f13689j = i9;
        } else {
            C3193a.m6816e(objArr.length, AbstractC0921a.m2257t(i9, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8349a(int i9) {
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "n shouldn't be negative but it is "));
            return;
        }
        if (i9 > size()) {
            C3193a.m6816e(size(), AbstractC0921a.m2257t(i9, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i9 > 0) {
            int i10 = this.f13688i;
            int i11 = this.f13687h;
            int i12 = (i10 + i9) % i11;
            Object[] objArr = this.f13686g;
            if (i10 > i12) {
                Arrays.fill(objArr, i10, i11, (Object) null);
                Arrays.fill(objArr, 0, i12, (Object) null);
            } else {
                Arrays.fill(objArr, i10, i12, (Object) null);
            }
            this.f13688i = i12;
            this.f13689j = size() - i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        int size = size();
        c4153c.getClass();
        C4153c.m8345a(i9, size);
        return this.f13686g[(this.f13688i + i9) % this.f13687h];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f13689j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4152b0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i9 = this.f13688i;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr2 = this.f13686g;
            if (i11 >= size || i9 >= this.f13687h) {
                break;
            }
            objArr[i11] = objArr2[i9];
            i11++;
            i9++;
        }
        while (i11 < size) {
            objArr[i11] = objArr2[i10];
            i11++;
            i10++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // tf.AbstractC4149a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
